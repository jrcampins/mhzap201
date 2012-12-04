#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea los objetos de la aplicacion en la base de datos
read -p "ejecutar $me? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
SQLPATH=$SQLJOINDIR
xs1="$scriptpath/sqlplus.sh"
xs2="$SQLXSQLDIR/${scriptname%%.*}.sql"
[ -x "$xs1" ] && source "$xs1" "$xs2" "$ORADATABASE" "$(date +%Y%m%d)"
