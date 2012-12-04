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
select archivo in $(find -L "$HOMEDIR" -type f -name "*.backup" | sort -f); do
    break
done
[ -z "$archivo" ] && exit 101 # cancelled by user
echo ""
if [ ! -f $archivo ]; then
    echo el archivo "$archivo" no existe
    exit 113 # unexpected condition encountered
fi
case "`uname`" in
    CYGWIN*) archivo=`cygpath --windows $archivo`
esac
EXE="$PGBINDIR/pg_restore"
CMD="$EXE -i -d $PGDATABASE -v $archivo"
log="$SQLLOGSDIR/${scriptname%%.*}.${PGDATABASE}.log"
[ -f "$log" ] && rm "$log"
echo $CMD
$CMD 1>>$log 2>&1
echo pg_restore: $?
echo ""
read -p "cat $log? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] || cat $log | more
