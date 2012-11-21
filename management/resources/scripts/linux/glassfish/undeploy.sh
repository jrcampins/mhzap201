#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        if [ -n "${PROJKEY}" ]; then
            echo ""
            echo $ASADMIN $GFDOMAINCST2 undeploy ${PROJKEY}
            bash $ASADMIN $GFDOMAINCST2 undeploy ${PROJKEY}
            echo ""
            echo $ASADMIN $GFDOMAINCST2 list-components
            bash $ASADMIN $GFDOMAINCST2 list-components
        fi
    fi
fi
