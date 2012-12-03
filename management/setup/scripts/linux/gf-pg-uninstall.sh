#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
echo "$me" elimina los componentes de la aplicacion en el servidor de aplicaciones y en el servidor de base de datos
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    xs=$scriptpath/resources/scripts/linux/setup/setup-gf-pg.sh
    [ -x "$xs" ] && . $xs uninstall
fi
