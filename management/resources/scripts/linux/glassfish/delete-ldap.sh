#!/bin/sh
me=delete-ldap
echo $me elimina el dominio de seguridad LDAP
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$0" ]; then
        . $(dirname "$0")/variables.sh
        if [ -n "$variables" ]; then
            REALMID="${PROJKEY}-ldap-realm"
            echo ""
        #   echo $REALMID
            echo $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
            bash $ASADMIN $GFDOMAINCST2 delete-auth-realm $REALMID
            unset REALMID
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
