#!/bin/bash
# Ejecutar desde la raíz del repo (Tecnica/)
set -e

echo "1) Renombrando módulos con prefijo Mod_ (para que sean válidos como package)..."
git mv 01_Bases Mod_01_Bases
git mv 02_Desarrollo_Humano Mod_02_Desarrollo_Humano
git mv 03_POO Mod_03_POO

echo ""
echo "2) Corrigiendo cada declaración 'package' para que coincida con la ruta real..."

fix_package() {
  local file="$1"
  local clase="$2"
  local nuevo="package Tecnica.Mod_03_POO.Java.${clase};"
  # Reemplaza la línea que empiece con "package" (sea cual sea su número de línea) sin tocar el resto del archivo
  sed -i "s#^package .*;#${nuevo}#" "$file"
}

for f in Mod_03_POO/Java/Clase_17/*.java; do fix_package "$f" "Clase_17"; done
for f in Mod_03_POO/Java/Clase_18/*.java; do fix_package "$f" "Clase_18"; done
for f in Mod_03_POO/Java/Clase_19/*.java; do fix_package "$f" "Clase_19"; done
for f in Mod_03_POO/Java/Clase_20/*.java; do fix_package "$f" "Clase_20"; done
for f in Mod_03_POO/Java/Clase_21/*.java; do fix_package "$f" "Clase_21"; done
for f in Mod_03_POO/Java/Ejercicios/*.java; do fix_package "$f" "Ejercicios"; done

echo ""
echo "3) Actualizando rutas en INDICE_GENERAL.md y README.md..."
sed -i -E \
  -e 's#\b01_Bases\b#Mod_01_Bases#g' \
  -e 's#\b02_Desarrollo_Humano\b#Mod_02_Desarrollo_Humano#g' \
  -e 's#\b03_POO\b#Mod_03_POO#g' \
  INDICE_GENERAL.md README.md

echo ""
echo "Listo. Revisa 'git status' y 'git diff' antes de comitear."
echo ""
echo "Luego:"
echo "  git add -A"
echo '  git commit -m "Renombrar modulos con prefijo Mod_ y sincronizar packages de Java"'
echo "  git push"
