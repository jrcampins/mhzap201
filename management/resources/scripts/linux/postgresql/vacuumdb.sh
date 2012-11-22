#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me comprime la base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        EXE="$PGBINDIR/vacuumdb"
        CMD="$EXE -e -f -q -z"
        echo $CMD
        $CMD
        echo $me: $?
    fi
fi
