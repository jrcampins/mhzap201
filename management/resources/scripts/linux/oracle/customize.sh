#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me crea paquetes de utilidad en la base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        unset SQLPATH
        xs1="$scriptpath/sqlplus.sh"
        xs2="$SQLDDLDIR/oracle/custom/packages/xsp.sql"
        [ -x "$xs1" ] && . "$xs1" "$xs2"
    fi
fi
