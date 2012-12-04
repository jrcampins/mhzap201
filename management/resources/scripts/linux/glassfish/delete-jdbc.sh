#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
REALMID="${lower_case_project}-jdbc-realm"
echo ""
echo $ASADMIN $ascst2 delete-auth-realm $REALMID
bash $ASADMIN $ascst2 delete-auth-realm $REALMID
RESOURCEID="jdbc/${lower_case_project}"
echo ""
echo $ASADMIN $ascst2 delete-jdbc-resource $RESOURCEID
bash $ASADMIN $ascst2 delete-jdbc-resource $RESOURCEID
POOLID="${lower_case_project}-pool"
echo ""
echo $ASADMIN $ascst2 delete-jdbc-connection-pool $POOLID
bash $ASADMIN $ascst2 delete-jdbc-connection-pool $POOLID
