#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        unset SQLPATH
        xs1="$scriptpath/psql.sh"
        xs2="$scriptpath/$scriptname.psql"
        [ -x "$xs1" ] && . "$xs1" "$xs2"
        fi
    fi
