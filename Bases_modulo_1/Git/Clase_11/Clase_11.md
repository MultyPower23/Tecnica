# Git y GitHub — Clase 11

> ⚠️ En esta clase no se tomaron notas propias durante la sesión; lo poco que se escribió quedó en un repositorio de prueba que ya no existe. Este resumen se reconstruyó a partir de un archivo de comandos guardado aparte (`Comandos_git.txt`), así que puede faltar contexto o ejercicios que se hicieron en vivo y no quedaron registrados.

## Tema central
Introducción a Git como sistema de control de versiones y a GitHub como plataforma para alojar repositorios.

## Qué se vio
- **Concepto de commit**: cada vez que se guarda un cambio con Git, se crea una "captura" (snapshot) de cómo estaban los archivos en ese momento, con fecha, autor y mensaje asociados.
- **Ramas (`branch`)**: líneas de desarrollo paralelas dentro de un mismo repositorio, que luego se pueden combinar con un `merge`.
- **Configuración inicial** (una sola vez por máquina): identificarse ante Git con nombre y correo, para que quede registrado quién hizo cada commit.
- **Flujo básico del día a día**: ver qué cambió (`status`), elegir qué guardar (`add`), guardar con un mensaje (`commit`), y sincronizar con GitHub (`push`/`pull`).
- **Deshacer cambios**: distintas formas de revertir según qué tan "adentro" esté el cambio (antes de `add`, después de un `commit`, etc.), siendo `revert` la opción más segura en equipo porque no reescribe el historial, solo agrega un commit que deshace el anterior.
- **Cierre de sesión de Git en un equipo compartido** (ej. salas de la universidad): cómo borrar las credenciales guardadas para no dejar la sesión abierta en un PC que no es propio.

## Comandos vistos

### Configuración inicial (una sola vez)
```bash
git config --global user.name "Tu nombre"
git config --global user.email "tu@email.com"
git init
git clone URL
```

### Día a día
```bash
git status
git add archivo.js
git add .
git commit -m "mensaje"
git push origin main
git pull
```

### Ramas
```bash
git branch
git checkout -b nombre-rama
git checkout main
git merge nombre-rama
```

### Ver el historial
```bash
git log
git log --oneline
git diff
```

### Deshacer cosas
```bash
git restore archivo.js
git reset HEAD~1
git revert ID-commit
```

### Cerrar sesión en un PC compartido (Bash, git 2.51.windows.1)
```bash
printf "protocol=https\nhost=github.com\n" | git credential-manager erase
git credential-manager github login
```

## Ideas clave
- 📸 Un commit es como una foto del proyecto en un momento dado — puedes volver a cualquier foto anterior si algo sale mal.
- 🌿 Las ramas permiten probar cosas nuevas sin tocar el código principal, y luego fusionarlas (`merge`) cuando funcionan.
- 🔙 `restore`, `reset` y `revert` deshacen cosas en distintos niveles: antes de guardar, el último commit, o un commit específico ya compartido con otros.
- 🔐 En equipos compartidos (como las salas de la U), cerrar sesión de Git evita que alguien más suba cambios usando tu cuenta por accidente.
