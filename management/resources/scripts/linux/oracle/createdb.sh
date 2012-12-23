#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea el propietario de la aplicacion en la base de datos
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
read -s -p "password de SYS: "; echo ""
[ -z "$REPLY" ] && REPLY=$DBMS
ORAUSER="SYS"
ORAROLE="SYSDBA"
ORAPASSWORD="$REPLY"
archives=$SQLBACKDIR
attachments=$WEBATTCHDIR
datos=$WEBATTCHDIR/archivo_datos_ext
spool=$WEBSPOOLDIR
case "`uname`" in
    CYGWIN*)
        archives=`cygpath --windows $archives`
        attachments=`cygpath --windows $attachments`
        datos=`cygpath --windows $datos`
        spool=`cygpath --windows $spool`
        ;;
esac
sql="${scriptpath}/${scriptname}.sql"
[ -f "$sql" ] && rm "$sql"
echo "create user $dbuser identified by $dbpass;" >> $sql
echo "create or replace directory ${UPPER_CASE_PROJECT}_ARCHIVES as '$archives';" >> $sql
echo "create or replace directory ${UPPER_CASE_PROJECT}_ATTACHMENTS as '$attachments';" >> $sql
echo "create or replace directory ${UPPER_CASE_PROJECT}_DATOS as '$datos';" >> $sql
echo "create or replace directory ${UPPER_CASE_PROJECT}_SPOOL as '$spool';" >> $sql
echo "grant connect, DBA to $dbuser;" >> $sql
echo "grant create any table to $dbuser;" >> $sql
echo "grant execute on SYS.UTL_FILE to $dbuser;" >> $sql
echo "grant read, write on directory ${UPPER_CASE_PROJECT}_ARCHIVES to $dbuser;" >> $sql
echo "grant read, write on directory ${UPPER_CASE_PROJECT}_ATTACHMENTS to $dbuser;" >> $sql
echo "grant read, write on directory ${UPPER_CASE_PROJECT}_DATOS to $dbuser;" >> $sql
echo "grant read, write on directory ${UPPER_CASE_PROJECT}_SPOOL to $dbuser;" >> $sql
unset SQLPATH
xs1="$scriptpath/sqlplus.sh"
xs2="$sql"
[ -x "$xs1" ] && source "$xs1" "$xs2"
[ -f "$sql" ] && rm "$sql"
