# Técnica en Programación y Desarrollo de Software

Apuntes, ejercicios y proyectos de la técnica en Programación y Desarrollo de Software (convenio UPB Medellín con colegios de grado 10 y 11).

## 📂 Estructura

El repositorio está organizado por **módulo → materia → clase**, con numeración de clase continua y cronológica en todo el repo (no reinicia por módulo ni por materia):

```
Tecnica/
├── Bases_modulo_1/
│   ├── PSeInt/
│   │   ├── Clase_1/
│   │   └── Clase_2/
│   ├── Python/
│   │   └── Clase_3/ ... Clase_10/
│   ├── Git/
│   │   └── Clase_11/
│   ├── SQL/
│   │   └── Clase_12/ ... Clase_14/
│   ├── HTML/            # sin división por clase, material de referencia
│   └── Proyecto/        # proyecto propio del módulo
│
├── Desarrollo_Humano/   # mini módulo intermedio (entrevista, trabajo en equipo, hoja de vida)
│   ├── Clase_15/
│   └── Clase_16/
│
├── POO_modulo_2/
│   └── Java/
│       ├── Clase_17/ ... Clase_21/
│       └── Ejercicios/  # entregable acumulado del módulo (ver abajo)
│
├── INDICE_GENERAL.md
├── README.md
└── .vscode/
```

Cada módulo corresponde a un profesor y una dinámica de clase distinta, así que la subestructura interna puede variar levemente entre uno y otro.

## 📌 Convenciones

- **`Clase_N/`**: contiene el código trabajado en esa clase específica, más un resumen `Clase_N.md`. Cuando varios archivos están conectados entre sí (se importan/usan unos a otros), se agrupan en una subcarpeta propia dentro de la clase (ej. `ficheros_actividad/`, `ficheros_ejemplos/`, `evaluacion/`, `pruebas/`) para mantener el orden y no mezclar contextos distintos.
- **`Ejercicios/`** (dentro de un módulo): algunos profesores piden un entregable acumulado de ejercicios al final del módulo (ej. 50 ejercicios en Java), resueltos poco a poco en cada clase según el tema visto. Se guardan aparte para no perderlos entre el resto del contenido de cada clase.
- **Resúmenes (`.md`)**: cada carpeta de clase incluye un resumen de lo visto, pensado como material de apoyo rápido para redactar apuntes propios, no como reemplazo de ellos. Cuando faltan notas reales de una clase (perdidas, incompletas, o a mano sin digitalizar), el resumen lo indica explícitamente con un aviso ⚠️ en vez de inventar contenido.

## 🗂️ Índice general

Ver [`INDICE_GENERAL.md`](./INDICE_GENERAL.md) para una lista de todas las clases con fecha, tema principal y enlace directo a cada resumen, sin tener que navegar carpeta por carpeta.

## 🛠️ Configuración de entorno

Ver [`.vscode/settings.json`](./.vscode/settings.json) y [`.vscode/extensions.json`](./.vscode/extensions.json) para la configuración de VS Code usada en este repo (formateo automático, linters, extensiones recomendadas). El formateador de Java usa un perfil propio (`GoogleStyle-Matrix`) que combina el estándar de Google con reglas personalizadas para que los arreglos/matrices se vean multilínea.