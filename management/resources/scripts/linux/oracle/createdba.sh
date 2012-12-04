#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea el propietario de la aplicacion en la base de datos
read -p "ejecutar $me? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
read -s -p "password de SYS: "; echo ""
[ -z "$REPLY" ] && exit 101 # cancelled by user
ORAUSER="SYS"
ORAROLE="SYSDBA"
ORAPASSWORD="$REPLY"
sql="$scriptpath/${scriptname%%.*}.sql"
[ -f "$sql" ] && rm "$sql"
echo "create user $dbuser identified by $dbpass;" >> $sql
echo "grant connect, DBA to $dbuser;" >> $sql
unset SQLPATH
xs1="$scriptpath/sqlplus.sh"
xs2="$sql"
[ -x "$xs1" ] && source "$xs1" "$xs2"
[ -f "$sql" ] && rm "$sql"
