#!/bin/sh
dbms=postgresql
DBMS_OVERRIDE=PostgreSQL
xs=$scriptpath/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    PGHOST=$dbhost
    PGPORT=$dbport
    PGUSER=$dbuser
    PGPASSWORD=$dbpass
    PGDATABASE=$dbname
    PGBINDIR=$POSTGRESQL_HOME/bin
    BACKUPDIR=$HOMEDIR/backup
    SQLDDLDIR=$HOMEDIR/resources/database/ddl
    [ -d "$BACKUPDIR"  ] || mkdir -p "$BACKUPDIR"
    [ -d "$PGBINDIR"   ] || . $scriptpath/unset-variables.sh el directorio "$PGBINDIR"  no existe
    [ -d "$BACKUPDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$BACKUPDIR" no existe
    [ -d "$SQLDDLDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$SQLDDLDIR" no existe
fi
if [ -n "$variables" ]; then
    export PGHOST
    export PGPORT
    export PGUSER
    export PGPASSWORD
    export PGDATABASE
fi
