#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        REALMID="${PROJKEY}-jdbc-realm"
        echo ""
    #   echo $REALMID
        echo $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
        bash $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
        RESOURCEID="jdbc/${PROJKEY}"
        echo ""
    #   echo $RESOURCEID
        echo $ASADMIN $GFDOMAINCST2 delete-jdbc-resource $RESOURCEID
        bash $ASADMIN $GFDOMAINCST2 delete-jdbc-resource $RESOURCEID
        POOLID="${PROJKEY}-pool"
        echo ""
    #   echo $POOLID
        echo $ASADMIN $GFDOMAINCST2 delete-jdbc-connection-pool $POOLID
        bash $ASADMIN $GFDOMAINCST2 delete-jdbc-connection-pool $POOLID
    fi
fi
