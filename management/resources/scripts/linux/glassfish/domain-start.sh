#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me inicia la ejecucion del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        echo ""
        echo $ASADMIN $GFDOMAINCST1 start-domain $GFDOMAINNAME
        bash $ASADMIN $GFDOMAINCST1 start-domain $GFDOMAINNAME
        echo ""
        echo $ASADMIN $GFDOMAINCST2 list-components
        bash $ASADMIN $GFDOMAINCST2 list-components
    fi
fi
