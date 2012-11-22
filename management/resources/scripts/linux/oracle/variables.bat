#!/bin/sh
xs=$scriptpath/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    dbms=oracle
    DBMS_OVERRIDE=Oracle
    O9HOST=$dbhost
    O9PORT=$dbport
    O9USER=$dbuser
    O9PASSWORD=$dbpass
    O9DATABASE=$dbname
    O9BINDIR=$ORACLE_HOME/bin
    BACKUPDIR=$HOMEDIR/backup
    SQLDDLDIR=$CRVLDIR/resources/database/ddl
    [ -d "$BACKUPDIR"  ] || mkdir -p "$BACKUPDIR"
    [ -d "$O9BINDIR"   ] || . $scriptpath/unset-variables.sh el directorio "$O9BINDIR"  no existe
    [ -d "$BACKUPDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$BACKUPDIR" no existe
    [ -d "$SQLDDLDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$SQLDDLDIR" no existe
fi
