#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
unset SQLPATH
xs1="$scriptpath/sqlplus.sh"
xs2="$SQLSCRXDIR/${scriptname%%.*}.sql"
[ -x "$xs1" ] && source "$xs1" "$xs2"
