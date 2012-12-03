#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me establece parametros de configuracion del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
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
    fi
fi
