#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me detiene la ejecucion del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        echo ""
        echo $ASADMIN $GFDOMAINCST1 stop-domain $GFDOMAINNAME
        bash $ASADMIN $GFDOMAINCST1 stop-domain $GFDOMAINNAME
    fi
fi
