# Convención de commits — Tecnica

Referencia rápida para mensajes de commit en este repo. No es Conventional Commits estricto (eso está pensado para proyectos con releases automáticos); es una versión reducida, adaptada a un repo de apuntes de un solo autor.

## Prefijos

| Prefijo | Cuándo usarlo | Ejemplo |
| --- | --- | --- |
| `clase:` | Clase nueva completa (código + resumen) | `clase: agrega Clase_20, herencia y polimorfismo` |
| `resumen:` | Solo el `.md` de resumen (redacción final, corrección) | `resumen: reescribe Clase_18 con apuntes completos` |
| `fix:` | Corrección de error real (link roto, typo que cambia significado, código que no compilaba) | `fix: corrige ruta rota en INDICE_GENERAL.md` |
| `ejercicio:` | Actividad suelta o entrega de `Ejercicios/` | `ejercicio: agrega ejercicio 15 de POO` |
| `config:` | Cambios en `.vscode/`, formatter, extensiones | `config: agrega icono changelog para Clase_XX.md` |
| `docs:` | README, índice, metadata del repo | `docs: actualiza README con rango de clases` |
| `chore:` | Limpieza sin efecto en contenido (reorganizar carpetas, borrar archivos huérfanos) | `chore: elimina XML de formatter sin uso` |

## Reglas generales

- Minúscula después de los dos puntos, sin punto final.
- Verbo en presente ("agrega", no "agregado" ni "agregué").
- Si el commit toca una clase o archivo puntual, nombralo explícito (`Clase_20`, no "cambios varios") — facilita buscar en `git log` a futuro.
- Un commit, un propósito. Si tocás dos cosas no relacionadas (ej: agregar una clase y arreglar un link roto de otra), son dos commits separados.
