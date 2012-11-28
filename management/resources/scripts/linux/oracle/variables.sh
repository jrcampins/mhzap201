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
    SQLDDLDIR=$HOMEDIR/resources/database/ddl
    [ -d "$O9BINDIR"   ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$O9BINDIR"  no existe
    [ -d "$SQLDDLDIR"  ] || . $(dirname "$BASH_SOURCE")/../unset-variables.sh el directorio "$SQLDDLDIR" no existe
fi
