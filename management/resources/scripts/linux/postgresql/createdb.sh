#!/bin/sh
me=createdb
echo $me crea la base de datos
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            EXE="$PGBINDIR/createdb"
            CMD="$EXE -e -E UTF8"
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
