#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me elimina el dominio de seguridad LDAP
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
REALMID="${lower_case_project}-ldap-realm"
echo ""
echo $ASADMIN $ascst2 delete-auth-realm $REALMID
bash $ASADMIN $ascst2 delete-auth-realm $REALMID
