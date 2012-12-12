#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea un archivo respaldo de la base de datos
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
DUMPFILE="${ORADATABASE}_$(date +%Y%m%d%H%M).DMP"
dmp="${SQLBACKDIR}/${DUMPFILE}"
[ -f "$dmp" ] && rm "$dmp"
LOGFILE=${DUMPFILE}.export.log
log="${SQLBACKDIR}/${LOGFILE}"
[ -f "$log" ] && rm "$log"
case "`uname`" in
    CYGWIN*) ORACLE_HOME=`cygpath --windows $ORACLE_HOME`
esac
export ORACLE_HOME
logon=${dbuser}/${dbpass}@${dbhost}:${dbport}/${dbserv}
pushd $ORACLE_HOME/bin > /dev/null
$ORACLE_HOME/bin/expdp $logon SCHEMAS=$dbuser DIRECTORY=${dbuser}DIR DUMPFILE=$DUMPFILE LOGFILE=$LOGFILE
popd > /dev/null
echo ""
read -p "cat $log? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] || cat $log | more
