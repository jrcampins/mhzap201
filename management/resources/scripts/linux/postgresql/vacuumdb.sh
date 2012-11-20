#!/bin/sh
me=vacuumdb
echo $me comprime la base de datos
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$0" ]; then
        . $(dirname "$0")/variables.sh
        if [ -n "$variables" ]; then
            EXE="$PGBINDIR/vacuumdb"
            CMD="$EXE -e -f -q -z"
            echo $CMD
            $CMD
            echo $me: $?
            unset EXE CMD
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
