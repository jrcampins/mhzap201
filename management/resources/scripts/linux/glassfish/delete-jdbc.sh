#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        REALMID="${lower_case_project}-jdbc-realm"
        echo ""
    #   echo $REALMID
        echo $ASADMIN $ascst2 delete-auth-realm $REALMID
        bash $ASADMIN $ascst2 delete-auth-realm $REALMID
        RESOURCEID="jdbc/${lower_case_project}"
        echo ""
    #   echo $RESOURCEID
        echo $ASADMIN $ascst2 delete-jdbc-resource $RESOURCEID
        bash $ASADMIN $ascst2 delete-jdbc-resource $RESOURCEID
        POOLID="${lower_case_project}-pool"
        echo ""
    #   echo $POOLID
        echo $ASADMIN $ascst2 delete-jdbc-connection-pool $POOLID
        bash $ASADMIN $ascst2 delete-jdbc-connection-pool $POOLID
    fi
fi
