#!/bin/sh
export MHZAP201_HOME=${MHZAP201_HOME:-"$HOME/mhzap201"}
if [ -f "$BASH_SOURCE" ]; then
    cd $(dirname "$BASH_SOURCE")
    export scriptpath=$(pwd)
    export scriptname=$(basename "$BASH_SOURCE")
    unset variables
    xs="$MHZAP201_HOME/variables.sh"
    [ -d "$MHZAP201_HOME" -a -x "$xs" ] || echo No es posible ejecutar el script "$xs"
    [ -d "$MHZAP201_HOME" -a -x "$xs" ] && . "$xs"
    unset xs
    if [ -n "$variables" ]; then
        gfhome=${GLASSFISH_HOME:-"/opt/glassfish"}
        userid=${asuser:-"admin"}
        pwbase="asadmin.password"
        pwfile="${aspassfile}"
        export JDBC_HOST=${dbhost:-"localhost"}
        export JDBC_PORT=${dbport:-"5432"}
        export JDBC_USER=${dbuser:-"postgres"}
        export JDBC_PASSWORD=${dbpass:-"postgres"}
        export JDBC_DATABASE=${dbname:-"MHZDB201"}
        export JDBC_URL=${dbcurl:-"jdbc:postgresql://${JDBC_HOST}:${JDBC_PORT}/${JDBC_DATABASE}"}
        export JDBC_DRIVER=${driver:-"org.postgresql.Driver"}
        export ASADMIN="$gfhome/bin/asadmin"
        export GFDOMAINNAME=${domain:-"domain1"}
        export GFDOMAINCDIR="$gfhome/domains/$GFDOMAINNAME/config"
#       [ -f "$pwfile" ] || pwfile="$GFDOMAINCDIR/$pwbase"
#       [ -f "$pwfile" ] || pwfile="$HOMEDIR/$pwbase"
#       [ -f "$pwfile" ] || pwfile="$scriptpath/$pwbase"
        export GFDOMAINCST1=${ascst1:-"--user ${userid} --passwordfile ${pwfile}"}
        export GFDOMAINCST2=${ascst2:-"--host localhost --port 4848 ${GFDOMAINCST1}"}
        [ -x "$ASADMIN"      ] || . $scriptpath/unset-variables.sh el archivo "$ASADMIN" no existe
#       [ -x "$pwfile"       ] || . $scriptpath/unset-variables.sh el archivo "$pwfile" no existe
        [ -d "$GFDOMAINCDIR" ] || . $scriptpath/unset-variables.sh el directorio "$GFDOMAINCDIR" no existe
        unset gfhome pwbase pwfile
    fi
fi
