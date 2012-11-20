#!/bin/sh
me=domain-stop
echo $me detiene la ejecucion del servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            echo ""
            echo $ASADMIN $GFDOMAINCST1 stop-domain $GFDOMAINNAME
            bash $ASADMIN $GFDOMAINCST1 stop-domain $GFDOMAINNAME
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
