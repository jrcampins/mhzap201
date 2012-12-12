#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me restaura la base de datos a partir de un archivo respaldo
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
echo ""
echo Escriba el numero correspondiente al archivo de respaldo que desea utilizar para restaurar la base de datos
echo ""
select archivo in $(find -L "$SQLBACKDIR" -type f -name "*.DMP" | sort -f); do
    break
done
[ -z "$archivo" ] && exit 101 # cancelled by user
echo ""
if [ ! -f $archivo ]; then
    echo el archivo "$archivo" no existe
    exit 113 # unexpected condition encountered
fi
DUMPFILE=$(basename "$archivo")
LOGFILE=${DUMPFILE}.import.log
log="${SQLBACKDIR}/${LOGFILE}"
[ -f "$log" ] && rm "$log"
case "`uname`" in
    CYGWIN*) ORACLE_HOME=`cygpath --windows $ORACLE_HOME`
esac
export ORACLE_HOME
logon=${dbuser}/${dbpass}@${dbhost}:${dbport}/${dbserv}
pushd $ORACLE_HOME/bin > /dev/null
echo impdp $logon SCHEMAS=$dbuser DIRECTORY=${dbuser}DIR DUMPFILE=$DUMPFILE EXCLUDE=USER TABLE_EXISTS_ACTION=REPLACE LOGFILE=$LOGFILE
$ORACLE_HOME/bin/impdp $logon SCHEMAS=$dbuser DIRECTORY=${dbuser}DIR DUMPFILE=$DUMPFILE EXCLUDE=USER TABLE_EXISTS_ACTION=REPLACE LOGFILE=$LOGFILE
popd > /dev/null
echo ""
read -p "cat $log? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] || cat $log | more
