#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me elimina el propietario de la aplicacion y todos sus objetos en la base de datos
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
read -s -p "password de SYS: "; echo ""
[ -z "$REPLY" ] && REPLY=$DBMS
ORAUSER="SYS"
ORAROLE="SYSDBA"
ORAPASSWORD="$REPLY"
sql="${scriptpath}/${scriptname}.sql"
[ -f "$sql" ] && rm "$sql"
echo "drop user $dbuser cascade;" >> $sql
echo "drop directory ${UPPER_CASE_PROJECT}_ARCHIVES;" >> $sql
echo "drop directory ${UPPER_CASE_PROJECT}_ATTACHMENTS;" >> $sql
echo "drop directory ${UPPER_CASE_PROJECT}_DATOS;" >> $sql
echo "drop directory ${UPPER_CASE_PROJECT}_SPOOL;" >> $sql
echo "begin" >> $sql
echo "    dbms_network_acl_admin.drop_acl(" >> $sql
echo "        acl => 'Resolve_Access.xml'" >> $sql
echo "        );" >> $sql
echo "end;" >> $sql
echo "/" >> $sql
unset SQLPATH
xs1="$scriptpath/sqlplus.sh"
xs2="$sql"
[ -x "$xs1" ] && source "$xs1" "$xs2"
[ -f "$sql" ] && rm "$sql"
