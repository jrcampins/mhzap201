#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me actualiza la base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        PSQL="$scriptpath/$scriptname.psql"
        PLOG="$scriptpath/$scriptname.plog"
        if [ -f "$PSQL" ]; then
            echo $scriptpath/psql.sh
            source $scriptpath/psql.sh
        else
            echo el archivo "$PSQL" no existe
        fi
    fi
fi
