#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea el dominio de seguridad LDAP
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
REALMID="${lower_case_project}-ldap-realm"
CLASS=com.sun.enterprise.security.auth.realm.ldap.LDAPRealm
P1=jaas-context="ldapRealm"
P2=directory="ldap\://localhost\:3268"
P3=base-dn="DC\=egt,DC\=com,DC\=ve"
P4=assign-groups="$lower_case_project"
P5=search-filter="(\&(objectClass\=user)(sAMAccountName\=%s))"
P6=search-bind-password="password"
P7=group-search-filter="(\&(objectClass\=group)(member\=%d))"
P8=search-bind-dn="EGT\\\\$lower_case_project"
PX="${P1}:${P2}:${P3}:${P4}:${P5}:${P6}:${P7}:${P8}"
echo ""
echo $ASADMIN $ascst2 create-auth-realm --classname $CLASS --property $PX $REALMID
bash $ASADMIN $ascst2 create-auth-realm --classname $CLASS --property $PX $REALMID
