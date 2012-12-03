#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
echo "$me" instala los componentes de la aplicacion en el servidor de aplicaciones y en el servidor de base de datos
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    xs=$scriptpath/resources/scripts/linux/setup/setup-jb-ora.sh
    [ -x "$xs" ] && . $xs install
fi
