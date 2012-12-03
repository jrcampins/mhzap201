#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me crea los objetos de la aplicacion en la base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        SQLPATH=$SQLJOINDIR
        xs1="$scriptpath/sqlplus.sh"
        xs2="$SQLXSQLDIR/${scriptname%%.*}.sql"
        [ -x "$xs1" ] && . "$xs1" "$xs2" "$ORADATABASE" "$(date +%Y%m%d)"
    fi
fi
