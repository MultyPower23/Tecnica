# Técnica en Programación y Desarrollo de Software

Apuntes, ejercicios y proyectos de la técnica en Programación y Desarrollo de Software (convenio UPB Medellín con colegios de grado 10 y 11).

## 📂 Estructura

El repositorio está organizado por **módulo → materia → clase**, con numeración de clase continua y cronológica en todo el repo (no reinicia por módulo ni por materia):

```txt
Tecnica/
├── Mod_01_Bases/
│   ├── PSeInt/
│   │   ├── Clase_1/
│   │   └── Clase_2/
│   ├── Python/
│   │   └── Clase_3/ ... Clase_10/
│   ├── Git/
│   │   └── Clase_11/
│   ├── SQL/
│   │   └── Clase_12/ ... Clase_14/
│   └── HTML/            # sin división por clase, material de referencia
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

### Mod_01_Bases

| Materia | Contenido |
| --- | --- |
| [`PSeInt`](./Mod_01_Bases/PSeInt) | Lógica de programación con pseudocódigo: bucles, condicionales, arreglos y funciones |
| [`Python`](./Mod_01_Bases/Python) | Sintaxis y tipos de datos, funciones, ficheros, generadores/excepciones, POO básica |
| [`Git`](./Mod_01_Bases/Git) | Control de versiones: commits, ramas, `push`/`pull` |
| [`SQL`](./Mod_01_Bases/SQL) | Modelado de tablas, `JOIN`, y conexión a bases de datos desde Python (`sqlite3`) |
| [`HTML`](./Mod_01_Bases/HTML) | Material de referencia externo, sin división por clase |

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

## 🛠️ Configuración de entorno

Ver [`.vscode/settings.json`](./.vscode/settings.json) y [`.vscode/extensions.json`](./.vscode/extensions.json) para la configuración de VS Code usada en este repo (formateo automático, linters, extensiones recomendadas). El formateador de Java usa el perfil estándar `GoogleStyle` (ver [`.vscode/GoogleStyle.xml`](./.vscode/GoogleStyle.xml)). Para casos puntuales donde una matriz/array necesita verse multilínea, se usan los tags `// @formatter:off` y `// @formatter:on` alrededor del bloque en cuestión, en vez de un perfil de formatter separado.
