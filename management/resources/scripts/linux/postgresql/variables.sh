#!/bin/sh
export MHZAP201_HOME=${MHZAP201_HOME:-"$HOME/mhzap201"}
if [ -f "$0" ]; then
    cd $(dirname "$0")
    export scriptpath=$(pwd)
    export scriptname=$(basename "$0")
    unset variables
    xs="$MHZAP201_HOME/variables.sh"
    [ -d "$MHZAP201_HOME" -a -x "$xs" ] || echo No es posible ejecutar el script "$xs"
    [ -d "$MHZAP201_HOME" -a -x "$xs" ] && . "$xs"
    unset xs
    if [ -n "$variables" ]; then
        pghome=${POSTGRESQL_HOME:-"/opt/postgresql"}
        export PGHOST=${dbhost:-"localhost"}
        export PGPORT=${dbport:-"5432"}
        export PGUSER=${dbuser:-"postgres"}
        export PGPASSWORD=${dbpass:-"postgres"}
        export PGPASSFILE=${dbpassfile}
        export PGDATABASE=${dbname:-"MHZDB201"}
        export PGBINDIR="$pghome/bin"
        export BACKUPDIR=$HOMEDIR/backup
        export SQLDDLDIR=$CRVLDIR/resources/database/ddl
#       [ -f "$PGPASSFILE" ] && unset PGPASSWORD
        [ -f "$PGPASSFILE" ] || unset PGPASSFILE
        [ -d "$BACKUPDIR"  ] || mkdir -p "$BACKUPDIR"
        [ -d "$SQLDDLDIR"  ] || mkdir -p "$SQLDDLDIR"
        [ -d "$BACKUPDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$BACKUPDIR" no existe
        [ -d "$SQLDDLDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$SQLDDLDIR" no existe
        [ -d "$PGBINDIR"   ] || . $scriptpath/unset-variables.sh el directorio "$PGBINDIR"  no existe
        unset pghome
    fi
fi
