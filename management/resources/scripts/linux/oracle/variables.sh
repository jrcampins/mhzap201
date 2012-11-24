#!/bin/sh
DBMS=oracle
xs=$(dirname "$BASH_SOURCE")/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    O9HOST=$dbhost
    O9PORT=$dbport
    O9USER=$dbuser
    O9PASSWORD=$dbpass
    O9DATABASE=$dbname
    O9BINDIR=$ORACLE_HOME/bin
    BACKUPDIR=$HOMEDIR/backup
    SQLDDLDIR=$HOMEDIR/resources/database/ddl
    [ -d "$BACKUPDIR"  ] || mkdir -p "$BACKUPDIR"
    [ -d "$O9BINDIR"   ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$O9BINDIR"  no existe
    [ -d "$BACKUPDIR"  ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$BACKUPDIR" no existe
    [ -d "$SQLDDLDIR"  ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$SQLDDLDIR" no existe
fi
