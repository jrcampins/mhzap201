#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me establece parametros de configuracion del servidor de aplicaciones
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
#   echo ""
#   echo $ASADMIN $ascst2 set server-config.security-service.default-principal=principal
#   bash $ASADMIN $ascst2 set server-config.security-service.default-principal=principal
#   echo ""
#   echo $ASADMIN $ascst2 set server-config.security-service.default-principal-password=password
#   bash $ASADMIN $ascst2 set server-config.security-service.default-principal-password=password
    echo ""
    echo $ASADMIN $ascst2 set server-config.security-service.activate-default-principal-to-role-mapping=false
    bash $ASADMIN $ascst2 set server-config.security-service.activate-default-principal-to-role-mapping=false
#   echo ""
#   echo $ASADMIN $ascst2 set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
#   bash $ASADMIN $ascst2 set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
