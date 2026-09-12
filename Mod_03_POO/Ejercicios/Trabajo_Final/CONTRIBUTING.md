# 🤝 Guía de Colaboración

Documento práctico y simplificado para la colaboración de esta semana.

---

## 📌 Propósito del Documento

Este archivo contiene las instrucciones necesarias para coordinar el trabajo en equipo de manera ágil durante esta semana, evitando burocracia innecesaria y asegurando un flujo de trabajo fluido entre ambos colaboradores.

---

## 🛠️ Flujo de Trabajo en Git

### 1. Actualizar la rama principal y crear una nueva rama

Antes de comenzar cualquier tarea, asegúrate de tener la última versión de la rama principal (`main`) y crea una rama específica para los cambios que vas a realizar. Nunca trabajes directamente sobre `main`.

```bash
git checkout main
git pull origin main
git checkout -b nombre-de-la-tarea
```

### 2. Registrar los cambios (Commits)

Realiza commits con mensajes breves y descriptivos que expliquen claramente la modificación o nueva funcionalidad agregada.

```bash
git commit -m "Agrega formulario de inicio de sesión"
```

### 3. Subir la rama y crear Pull Request (PR)

Una vez finalizada la tarea y verificada localmente:

1. Sube tu rama al repositorio remoto:

   ```bash
   git push origin nombre-de-la-tarea
   ```

2. Ve al repositorio en GitHub y abre un **Pull Request (PR)** con dirección a la rama `main`.
3. Notifica directamente a tu compañero para realizar una revisión rápida.
4. Tras recibir el visto bueno, realiza la fusión (**Merge**) y elimina la rama remota para mantener el repositorio limpio.

---

## ⚡ Reglas de Trabajo y Buenas Prácticas

* **Comunicación directa e inmediata:** No es necesario crear *issues* ni documentación compleja de seguimiento. Las tareas se asignan y coordinan directamente por chat para no duplicar esfuerzos.
* **Verificación de código funcional:** Revisa y prueba que el proyecto compile y ejecute correctamente en tu entorno local antes de solicitar la revisión del Pull Request.
* **Revisiones rápidas:** Dado que el proyecto tiene una duración de una sola semana, las revisiones de código deben realizarse lo antes posible para no bloquear el avance del compañero.
