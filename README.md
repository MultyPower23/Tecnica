# 💻 Técnica en Programación y Desarrollo de Software

Apuntes, ejercicios y proyectos de la técnica en Programación y Desarrollo de Software (convenio UPB Medellín con colegios de grado 10 y 11).

🎓 Módulo 3 en curso · 📚 25 clases registradas · 🟢 Activo

## 📈 Progreso

| Módulo | Estado | Clases |
| --- | --- | ---: |
| Fundamentos | ✅ | 14 |
| Desarrollo Humano | ✅ | 2 |
| POO (Java) | 🟡 En curso | 10 |
| Dispositivos Móviles (Kotlin) | ⏳ Confirmado | — |
| Lengua Extranjera (Inglés) | ⏳ Pendiente | — |
| Desarrollo Web (JS/PHP) | ⏳ Pendiente | — |
| Proyecto de base tecnológica | ⏳ Pendiente | — |

## 🧭 Recorrido

PSeInt → Python → Git + SQL → Desarrollo Humano → POO (Java) → Kotlin → ...

## 🚀 Trabajos grandes

Entregas donde se integran varios temas de una vez, más allá de una clase suelta:

- **MegaIP** (Mod_01) — sistema CRUD con Flask + SQLite, 4 tablas relacionadas por `usuario_id` (usuarios, servicios, pagos, equipos). Temática libre; luego evolucionó a proyecto personal. Repo: [`Proyecto_MegaIP`](https://github.com/MultyPower23/Proyecto_MegaIP)
- **Sistema de Gestión Aeroportuaria** (Mod_03) — herencia, clases abstractas, polimorfismo. Repo del proyecto: [`Hernandez_Ciro_ProyectoFinalJava`](https://github.com/MultyPower23/Hernandez_Ciro_ProyectoFinalJava)

## 📂 Estructura

El repositorio está organizado por **módulo → materia → clase**, con numeración de clase continua y cronológica en todo el repo (no reinicia por módulo ni por materia):

```txt
Tecnica/
├── Mod_01_Fundamentos/
│   ├── PSeInt/
│   │   ├── Clase_1/
│   │   └── Clase_2/
│   ├── Python/
│   │   └── Clase_3/ ... Clase_10/
│   ├── Git/
│   │   └── Clase_11/
│   ├── SQL/
│   │   └── Clase_12/ ... Clase_14/
│
├── Mod_02_Desarrollo_Humano/   # mini módulo intermedio (entrevista, trabajo en equipo, hoja de vida)
│   ├── Clase_15/
│   └── Clase_16/
│
├── Mod_03_POO/
│   ├── Java/
│   │   └── Clase_17/ ... Clase_26/
│   └── Ejercicios/
│
├── INDICE_GENERAL.md
├── README.md
└── .vscode/
```

Cada módulo corresponde a un profesor y una dinámica de clase distinta, así que la subestructura interna puede variar levemente entre uno y otro.

## 📖 Contenido por materia

Un vistazo rápido de qué cubre cada materia, sin entrar en el detalle clase por clase (para eso está el [`INDICE_GENERAL.md`](./INDICE_GENERAL.md), más abajo).

### Mod_01_Fundamentos

| Materia | Contenido |
| --- | --- |
| [`PSeInt`](./Mod_01_Fundamentos/PSeInt) | Lógica de programación con pseudocódigo: bucles, condicionales, arreglos y funciones |
| [`Python`](./Mod_01_Fundamentos/Python) | Sintaxis y tipos de datos, funciones, ficheros, generadores/excepciones, POO básica |
| [`Git`](./Mod_01_Fundamentos/Git) | Control de versiones: commits, ramas, `push`/`pull` |
| [`SQL`](./Mod_01_Fundamentos/SQL) | Modelado de tablas, `JOIN`, y conexión a bases de datos desde Python (`sqlite3`) |

### Mod_02_Desarrollo_Humano

Mini módulo de habilidades blandas (entrevistas, trabajo en equipo, hoja de vida) — notas limitadas.

### Mod_03_POO

| Materia | Contenido |
| --- | --- |
| [`Java`](./Mod_03_POO/Java) | POO en Java (herencia, polimorfismo, `abstract`/`interface`), estructuras de datos, ordenamientos — explicado con contraste a Python |

## 📌 Convenciones

- **`Clase_N/`**: contiene el código trabajado en esa clase específica, más un resumen `Clase_N.md`. Cuando varios archivos están conectados entre sí (se importan/usan unos a otros), se agrupan en una subcarpeta propia dentro de la clase (ej. `ficheros_actividad/`, `ficheros_ejemplos/`, `evaluacion/`, `pruebas/`) para mantener el orden y no mezclar contextos distintos.
- **`Ejercicios/`**: entregas puntuales del módulo, con su guía en PDF y las soluciones.
- **Resúmenes (`.md`)**: cada carpeta de clase incluye un resumen de lo visto, pensado como material de apoyo rápido para redactar apuntes propios, no como reemplazo de ellos. Cuando faltan notas reales de una clase (perdidas, incompletas, o a mano sin digitalizar), el resumen lo indica explícitamente con un aviso ⚠️ en vez de inventar contenido.

## 🗂️ Índice general

Ver [`INDICE_GENERAL.md`](./INDICE_GENERAL.md) para una lista de todas las clases con fecha, tema principal y enlace directo a cada resumen, sin tener que navegar carpeta por carpeta.

## 📥 Cómo clonar

`Mod_03_POO/Ejercicios/Trabajo_Final` es un submódulo git que apunta al repo del [proyecto final](https://github.com/MultyPower23/Hernandez_Ciro_ProyectoFinalJava). Clonar este repo sin más deja esa carpeta vacía. Para traer todo:

```bash
git clone --recurse-submodules https://github.com/MultyPower23/Tecnica.git
```

Si ya clonaste sin ese flag:

```bash
git submodule update --init --recursive
```

## 🧑‍💻 Cómo usar este repositorio

1. Arrancá por [`INDICE_GENERAL.md`](./INDICE_GENERAL.md) — lista todas las clases con fecha y tema.
2. Cada `Mod_0X_.../README.md` resume esa etapa completa.
3. Cada `Clase_N/` trae su código y su propio `Clase_N.md`.
4. Si falta el resumen de alguna clase, el `.md` lo dice con ⚠️ en vez de inventar contenido.

## 🛠️ Configuración de entorno

Ver [`.vscode/settings.json`](./.vscode/settings.json) y [`.vscode/extensions.json`](./.vscode/extensions.json) para la configuración de VS Code usada en este repo (formateo automático, linters, extensiones recomendadas). El formateador de Java usa el perfil estándar `GoogleStyle` (ver [`.vscode/GoogleStyle.xml`](./.vscode/GoogleStyle.xml)). Para casos puntuales donde una matriz/array necesita verse multilínea, se usan los tags `// @formatter:off` y `// @formatter:on` alrededor del bloque en cuestión, en vez de un perfil de formatter separado.
