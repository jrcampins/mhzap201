#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me elimina el dominio de seguridad LDAP
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        REALMID="${lower_case_project}-ldap-realm"
        echo ""
    #   echo $REALMID
        echo $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
        bash $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
    fi
fi
