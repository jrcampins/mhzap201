#!/bin/sh
me=create-ldap
echo $me crea el dominio de seguridad LDAP
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
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
            unset REALMID CLASS P1 P2 P3 P4 P5 P6 P7 P8 PX
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
