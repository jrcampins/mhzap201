#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me establece parametros de configuracion del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
    #   echo ""
    #   echo $ASADMIN $GFDOMAINCST2 set server-config.security-service.default-principal=principal
    #   bash $ASADMIN $GFDOMAINCST2 set server-config.security-service.default-principal=principal

    #   echo ""
    #   echo $ASADMIN $GFDOMAINCST2 set server-config.security-service.default-principal-password=password
    #   bash $ASADMIN $GFDOMAINCST2 set server-config.security-service.default-principal-password=password

        echo ""
        echo $ASADMIN $GFDOMAINCST2 set server-config.security-service.activate-default-principal-to-role-mapping=false
        bash $ASADMIN $GFDOMAINCST2 set server-config.security-service.activate-default-principal-to-role-mapping=false

    #   echo ""
    #   echo $ASADMIN $GFDOMAINCST2 set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
    #   bash $ASADMIN $GFDOMAINCST2 set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
    fi
fi
