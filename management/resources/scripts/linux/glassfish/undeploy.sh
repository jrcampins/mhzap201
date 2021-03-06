#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me anula el despliegue de la aplicacion de empresa
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
echo ""
echo $ASADMIN $ascst2 undeploy ${lower_case_project}
bash $ASADMIN $ascst2 undeploy ${lower_case_project}
echo ""
echo $ASADMIN $ascst2 list-components
bash $ASADMIN $ascst2 list-components
