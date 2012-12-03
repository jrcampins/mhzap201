#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        if [ -n "${lower_case_project}" ]; then
            echo ""
            echo $ASADMIN $ascst2 undeploy ${lower_case_project}
            bash $ASADMIN $ascst2 undeploy ${lower_case_project}
            echo ""
            echo $ASADMIN $ascst2 list-components
            bash $ASADMIN $ascst2 list-components
        fi
    fi
fi
