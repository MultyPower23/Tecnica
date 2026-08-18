#!/bin/bash
# Ejecutar desde la raíz del repo (Tecnica/)
set -e

echo "1) Corrigiendo el typo Desarollo_humano -> Desarrollo_humano..."
git mv Desarollo_humano Desarrollo_humano

echo "2) Borrando el .zip viejo y redundante de Clase_8..."
git rm "Bases_modulo_1/Python/Clase_8/ficheros_actividad 1.0.zip"

echo ""
echo "Listo. Revisa 'git status' -> deberías ver:"
echo "  - renamed: Desarollo_humano/... -> Desarrollo_humano/..."
echo "  - deleted: .../ficheros_actividad 1.0.zip"
echo ""
echo "PENDIENTE MANUAL: falta copiar Clase_21.md dentro de"
echo "  POO_modulo_2/Java/Clase_21/"
echo "(te lo adjunté en el chat, descárgalo antes de comitear)"
