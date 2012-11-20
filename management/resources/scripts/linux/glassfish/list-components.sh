#!/bin/sh
me=list-components
echo $me produce una lista de los componentes implementados en el servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            echo ""
            echo $ASADMIN $GFDOMAINCST2 list-components
            bash $ASADMIN $GFDOMAINCST2 list-components
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me
