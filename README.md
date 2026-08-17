# Técnica en Programación y Desarrollo de Software

Apuntes, ejercicios y proyectos de la técnica en Programación y Desarrollo de Software (convenio UPB Medellín con colegios de grado 10 y 11).

## 📂 Estructura

El repositorio está organizado por **módulo → materia → clase**:

```
Tecnica/
├── Bases_modulo_1/
│   ├── Python/
│   │   └── Clase_N/        # una carpeta por clase
│   ├── SQL/
│   │   └── Clase_N/
│   ├── PSeInt/              # sin división por clase
│   ├── HTML/                # sin división por clase
│   └── Proyecto/            # proyecto propio del módulo
└── POO_modulo_2/
    └── Java/
        ├── Clase_N/          # una carpeta por clase
        └── Ejercicios/       # entregable acumulado del módulo (ver abajo)
```

Cada módulo corresponde a un profesor y una dinámica de clase distinta, así que la subestructura interna puede variar levemente entre uno y otro.

## 📌 Convenciones

- **`Clase_N/`**: contiene el código trabajado en esa clase específica. Cuando varios archivos están conectados entre sí (se importan/usan unos a otros), se agrupan en una subcarpeta propia dentro de la clase (ej. `ficheros_actividad/`, `ficheros_ejemplos/`, `evaluacion/`, `pruebas/`) para mantener el orden y no mezclar contextos distintos.
- **`Ejercicios/`** (dentro de un módulo): algunos profesores piden un entregable acumulado de ~50 ejercicios al final del módulo, resueltos poco a poco en cada clase según el tema visto. Estos se guardan aparte para no perderlos entre el resto del contenido de cada clase.
- **Resúmenes (`.md`)**: cada carpeta de clase incluye un resumen de lo visto, pensado como material de apoyo rápido, no como reemplazo de los apuntes propios.

## 🗂️ Índice general

Ver [`INDICE_GENERAL.md`](./INDICE_GENERAL.md) para una lista rápida de todas las clases con enlace directo a cada resumen, sin tener que navegar carpeta por carpeta.

## 🛠️ Configuración de entorno

Ver [`.vscode/settings.json`](./.vscode/settings.json) y [`.vscode/extensions.json`](./.vscode/extensions.json) para la configuración de VS Code usada en este repo (formateo automático, linters, extensiones recomendadas).
