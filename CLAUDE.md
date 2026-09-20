# Contexto del repo `Tecnica`

Contexto de trabajo para este repo. Léelo completo antes de tocar cualquier archivo.

## Quién soy y el programa

Estudio Técnico en Programación y Desarrollo de Software (convenio UPB Medellín + colegios de Antioquia). El programa avanza por módulos y cada uno trae su propio lenguaje o tema. Este archivo aplica igual para cualquier módulo, presente o futuro: las reglas son generales, no específicas de un lenguaje.

## Repos

- **`MultyPower23/Tecnica`** (este repo) — registro organizado de apuntes, código de clase y resúmenes. Es el repo "limpio", el que se muestra.
- **`MultyPower23/Ciro`** — repo personal para borradores, pruebas y código suelto sin organizar. Lo que no está terminado o no pertenece al orden de clases va allá, no aquí.
- Los trabajos grandes de un módulo pueden vivir en su propio repo y entrar aquí como git submodule.

Después de clonar o hacer `pull`, correr `git submodule update --init --recursive` — si no, las carpetas de submódulos se ven vacías.

## Estructura (módulo → materia → clase)

```
Tecnica/
├── Mod_01_Fundamentos/
│   ├── README.md
│   ├── PSeInt/       Clase_1, Clase_2  (+ README.md propio)
│   ├── Python/       Clase_3 a Clase_10, más Ejemplos_Interfaz/ (sueltos, sin clase)
│   ├── Git/          Clase_11
│   └── SQL/          Clase_12, Clase_13, Clase_14
├── Mod_02_Desarrollo_Humano/   README.md, Clase_15, Clase_16
├── Mod_03_POO/
│   ├── README.md
│   ├── Java/          clases del módulo, una carpeta por clase
│   └── Ejercicios/     PARALELA a Java/, no dentro de ella
│       ├── Taller/          entrega calificada, con su guía en PDF
│       └── Trabajo_Final/   git submodule
├── INDICE_GENERAL.md     índice de todas las clases con fecha y tema — revisar ahí primero
├── COMMIT_CONVENTION.md  prefijos y reglas de mensajes de commit
├── README.md
├── .markdownlint.json    MD040 desactivado (diagramas de carpetas sin lenguaje)
├── .prettierignore
├── .gitignore
└── .vscode/              settings.json, extensions.json, GoogleStyle.xml
```

La numeración de clase es **continua en todo el repo** (no reinicia por módulo ni por materia) — refleja el orden cronológico real. Los módulos llevan prefijo `Mod_0X_` para evitar que un nombre de carpeta empiece por número, cosa que rompe los nombres de package en lenguajes que los usan.

Cada módulo tiene su `README.md` propio además del README raíz.

## ⚠️ Regla crítica: verificar rutas y conexiones después de cualquier cambio

Siempre que se mueva, renombre o reorganice algo, **hay que verificar que todo lo que dependía de esa ubicación siga funcionando, y repararlo en el mismo cambio**. Esto cubre:

- Rutas y links internos en `.md` (índice, READMEs, referencias entre resúmenes).
- Declaraciones de package o imports que dependan de la ruta física del archivo.
- Referencias a archivos desde código (lectura de ficheros, rutas relativas, `.db`, recursos).
- Rutas dentro de `.vscode/` (asociaciones, iconos, filtros de recursos).
- Punteros de submódulos.

No se entrega un cambio de estructura sin haber revisado esto. Si algo quedó roto, se arregla antes de cerrar la tarea, no después.

## Convenciones del repo

- Cada `Clase_N/` vive en la carpeta de su materia dentro de su módulo y contiene su resumen `Clase_N.md`, más el código de esa clase si lo hubo.
- **El resumen de una clase siempre va en su propia carpeta de clase**, aunque esa clase no haya dejado código propio (taller, repaso, clase teórica). El resumen puede enlazar a la carpeta de la actividad o taller correspondiente, pero no se muda allá.
- El código de talleres y entregas calificadas va en `Ejercicios/` dentro del módulo, no en la carpeta de la clase.
- Archivos conectados entre sí dentro de una clase van en subcarpeta propia (`ficheros_actividad/`, `evaluacion/`, `pruebas/`, etc.) para no mezclar contextos.
- Los `.db` **sí** se versionan a propósito (datos de ejemplo/semilla, no basura generada) — no tocar `.gitignore` para excluirlos.
- Los resúmenes `.md` son apoyo rápido, no reemplazo de apuntes propios — si falta material real de una clase, decirlo explícito con ⚠️ en vez de inventar contenido.
- No existe `Recursos/` ni `INDICE_TEMAS.md` — evaluados y descartados a propósito.
- Formateo automático al guardar está activo por lenguaje. Para bloques que quiero ver en un formato concreto (matrices, tablas), envolver a mano con `// @formatter:off` / `// @formatter:on`.
- `markdownlint` para los `.md`: solo `MD040` desactivado, el resto por defecto.

## Git — flujo de trabajo obligatorio

- **Nunca trabajar directo sobre `main`.** Toda tarea (clase nueva, reorganización, fix) va en una rama nueva; `main` solo recibe merges que yo ya revisé.
- Nombrar ramas de forma descriptiva según la tarea (ej. `clase-27`, `reorganiza-ejercicios`, `fix-indice`).
- Mensajes de commit según `COMMIT_CONVENTION.md`: prefijos `clase:`, `resumen:`, `fix:`, `ejercicio:`, `config:`, `docs:`, `chore:`; minúscula después de los dos puntos, verbo en presente, sin punto final, un commit por propósito.
- Renombres que solo cambian mayúsculas/minúsculas requieren dos pasos en Windows/NTFS: `git mv X X_tmp` → `git mv X_tmp Y` (un solo paso falla con "Invalid argument").
- Antes de correr un script que modifique el repo: probarlo en una copia y mostrar que corrió limpio (links no rotos, sin duplicados, rutas y conexiones intactas) antes de ejecutarlo de verdad.

## Pull Requests

- Al terminar el trabajo de una rama, abrir un Pull Request hacia `main` en vez de mergear directo por consola.
- Título del PR con el mismo prefijo que usarían los commits de esa rama (`clase:`, `fix:`, `chore:`, etc.).
- Descripción del PR: qué cambia y por qué, en un par de líneas — no listar archivo por archivo, eso ya lo muestra el diff.
- El merge lo hago yo desde GitHub una vez lo reviso; no cerrar ni mergear el PR sin mi confirmación.

## Comentarios y explicaciones dentro del código

Referencia de estilo: commit `b159068` (`chore: organizar comentarios de java`). Ese es el estándar para cualquier lenguaje.

- Cortos: una a tres líneas por comentario. Si necesita más, la explicación va en el chat, no en el archivo.
- Tono neutro y descriptivo. Nada de apelaciones al lector ("ojo con esto", "te vas a volver loco", "mira este truco"), ni analogías o metáforas largas.
- Explicar qué hace y por qué en una frase directa. Sin rodeos ni énfasis en mayúsculas.
- Comentario arriba de la línea que describe. Comentarios inline solo si caben en pocas palabras.
- Sin emojis dentro del código.
- Sin notas meta: nada de quién escribió el archivo, de dónde salió, ni advertencias sobre su origen.
- Sin referencias cruzadas a otros archivos del repo.
- Tildes y ortografía correctas.
- Código de ejemplo que se deja comentado se deja limpio y compacto, en una línea si se puede.

Cuando expliques código en el chat (no dentro del archivo), cierra con un resumen corto en bullets con emoji: una línea por método o función con su idea clave.

## Nada de registros históricos en explicaciones

Los comentarios, resúmenes y documentos describen **solo la situación actual**. Nunca "antes era así y ahora es así", ni referencias a cómo estaba algo antes, ni rastros de la conversación en la que se construyó el archivo. El historial ya lo guarda git; el contenido refleja el estado presente y nada más.

## Resúmenes de clase (`Clase_N.md`)

- Formato fijo, cinco secciones con emoji-header: `📚 Tema central`, `🧠 Qué se vio`, `💻 Ejercicios trabajados`, `⚠️ Errores comunes / cosas a las que prestar atención` (solo si aplica), `✅ Ideas clave`.
- Tono casual, como compañero de clase explicando — nunca manual técnico.
- El tono varía según el tipo de clase: una de puro repaso no debe sonar tan "novedosa" como una con concepto nuevo.
- Si falta material fuente o está incompleto, declararlo con ⚠️ al inicio — nunca inventar contenido.
- Escribir o editar el archivo directamente en su carpeta dentro del repo.
- Actualizar `INDICE_GENERAL.md` en el mismo cambio, con fecha en ISO 8601 y la ruta correcta.
- Evitar muletillas de relleno ("es importante destacar", "en resumen", "cabe recalcar") y cierres genéricos al final de cada sección.
- Sin HTML ni formato visual más allá de los emoji-headers — sin negritas ni colores decorativos que no aporten jerarquía real.
- Dejar los resúmenes tal cual se generan; no reescribirlos a mano después.

## Estilo de trabajo

- Colaborativo y fase por fase; pausar para confirmación en cada paso antes de seguir.
- Explicar y analizar el problema antes de dar la solución directa, salvo que pida explícitamente lo contrario.
- Prefiero entender antes que copiar y pegar.
- Las decisiones se difieren hasta que exista un caso real que las justifique; no resolver "por si acaso".

## Entorno

- VS Code como editor principal, Windows como sistema.
- Configuración del repo en `.vscode/`: `settings.json` (formateo al guardar por lenguaje, tabSize 2, iconos, asociaciones de archivos, filtros de recursos), `extensions.json` y `GoogleStyle.xml`.
- Si algo de `.vscode/settings.json` "no se aplica": revisar primero que VS Code esté en la pestaña **Workspace** y no **User**, y que la barra de título muestre el nombre de la carpeta y no "Área de Trabajo" (si dice eso, cerrar todas las ventanas y reabrir con `File → Open Folder...`).
