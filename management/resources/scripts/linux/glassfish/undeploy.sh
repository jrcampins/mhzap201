#!/bin/sh
me=undeploy
echo $me anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$0" ]; then
        . $(dirname "$0")/variables.sh
        if [ -n "$variables" ]; then
            if [ -n "${PROJKEY}" ]; then
                echo ""
                echo $ASADMIN $GFDOMAINCST2 undeploy ${PROJKEY}
                bash $ASADMIN $GFDOMAINCST2 undeploy ${PROJKEY}
                echo ""
                echo $ASADMIN $GFDOMAINCST2 list-components
                bash $ASADMIN $GFDOMAINCST2 list-components
            fi
        #   unset ear
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
