#!/bin/sh
me=delete-jdbc
echo $me elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            REALMID="${PROJKEY}-jdbc-realm"
            echo ""
        #   echo $REALMID
            echo $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
            bash $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
            unset REALMID
            RESOURCEID="jdbc/${PROJKEY}"
            echo ""
        #   echo $RESOURCEID
            echo $ASADMIN $GFDOMAINCST2 delete-jdbc-resource $RESOURCEID
            bash $ASADMIN $GFDOMAINCST2 delete-jdbc-resource $RESOURCEID
            unset RESOURCEID
            POOLID="${PROJKEY}-pool"
            echo ""
        #   echo $POOLID
            echo $ASADMIN $GFDOMAINCST2 delete-jdbc-connection-pool $POOLID
            bash $ASADMIN $GFDOMAINCST2 delete-jdbc-connection-pool $POOLID
            unset POOLID
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
