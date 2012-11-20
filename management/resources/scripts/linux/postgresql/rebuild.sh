#!/bin/sh
me=rebuild
echo $me reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$0" ]; then
        . $(dirname "$0")/variables.sh
        if [ -n "$variables" ]; then
            export PSQL="$scriptpath/$scriptname.psql"
            export PLOG="$scriptpath/$scriptname.plog"
            if [ -f "$PSQL" ]; then
                echo $scriptpath/psql.sh
                bash $scriptpath/psql.sh
            else
                . $scriptpath/unset-variables.sh el archivo "$PSQL" no existe
            fi
            unset PLOG PSQL
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
