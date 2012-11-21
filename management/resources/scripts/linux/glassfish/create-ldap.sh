#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me crea el dominio de seguridad LDAP
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        REALMID="${PROJKEY}-ldap-realm"
        CLASS=com.sun.enterprise.security.auth.realm.ldap.LDAPRealm
        P1=jaas-context="ldapRealm"
        P2=directory="ldap\://localhost\:3268"
        P3=base-dn="DC\=egt,DC\=com,DC\=ve"
        P4=assign-groups="$PROJKEY"
        P5=search-filter="(\&(objectClass\=user)(sAMAccountName\=%s))"
        P6=search-bind-password="password"
        P7=group-search-filter="(\&(objectClass\=group)(member\=%d))"
        P8=search-bind-dn="EGT\\\\$PROJKEY"
        PX="${P1}:${P2}:${P3}:${P4}:${P5}:${P6}:${P7}:${P8}"
        echo ""
    #   echo $REALMID
        echo $ASADMIN $GFDOMAINCST2 create-auth-realm --classname $CLASS --property $PX $REALMID
        bash $ASADMIN $GFDOMAINCST2 create-auth-realm --classname $CLASS --property $PX $REALMID
    fi
fi
