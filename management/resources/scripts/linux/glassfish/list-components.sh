#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me produce una lista de los componentes implementados en el servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        echo ""
        echo $ASADMIN $ascst2 list-components
        bash $ASADMIN $ascst2 list-components
    fi
fi
