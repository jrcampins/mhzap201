#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me crea el usuario propietario de la aplicacion en la base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        ORAUSER="SYS"
        ORAROLE="SYSDBA"
        read -p "password de $ORAUSER: " ORAPASSWORD
        if [ -n "$ORAPASSWORD" ]; then
            sql="$scriptpath/${scriptname%%.*}.sql"
            [ -f "$sql" ] && rm "$sql"
            echo "create user $dbuser identified by $dbpass;" >> $sql
            echo "grant connect, DBA to $dbuser;" >> $sql
            unset SQLPATH
            xs1="$scriptpath/sqlplus.sh"
            xs2="$sql"
            [ -x "$xs1" ] && . "$xs1" "$xs2"
            [ -f "$sql" ] && rm "$sql"
        fi
    fi
fi
