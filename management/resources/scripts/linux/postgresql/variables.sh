#!/bin/sh
DBMS=postgresql
xs=$(dirname "$BASH_SOURCE")/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    export PGHOST=$dbhost
    export PGPORT=$dbport
    export PGUSER=$dbuser
    export PGPASSWORD=$dbpass
    export PGDATABASE=$dbname
    PGBINDIR=$POSTGRESQL_HOME/bin
    SQLDDLDIR=$HOMEDIR/resources/database/ddl
    [ -d "$PGBINDIR"   ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$PGBINDIR"  no existe
    [ -d "$SQLDDLDIR"  ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$SQLDDLDIR" no existe
fi
