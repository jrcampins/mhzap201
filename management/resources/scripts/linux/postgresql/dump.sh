#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea un archivo respaldo de la base de datos
read -p "ejecutar $me? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
while [ true ]; do
    echo ""
    for backupfile in $(find -L "$HOMEDIR" -type f -name *.backup | sort -f); do echo $backupfile; done
    echo ""
    backupfile="${PGDATABASE}_$(date +%Y%m%d%H%M).backup"
    echo ""
    echo Escriba un nuevo nombre del archivo de respaldo en el formato: "directorio/archivo"
    echo ""
    echo Si no escribe directorio o si escribe . el directorio seria $SQLBACKDIR
    echo Si no escribe archivo o si escribe . el archivo seria $backupfile
    echo Si no escribe nada no se creara el respaldo
    echo ""
    read -p "nombre del archivo de respaldo: " archivo
    echo ""
    [ -z "$archivo" ] && exit 101 # cancelled by user
    archivo="${archivo/.\//}"
    archivo="${archivo/.backup/}"
    [ "$(basename ""$archivo"")" = ''  ] && archivo=$backupfile
    [ "$(basename ""$archivo"")" = '.' ] && archivo=$backupfile
    [ "$(dirname  ""$archivo"")" = '.' ] && archivo="$SQLBACKDIR/${archivo}"
    archivo="${archivo/.backup/}.backup"
    if [ -e $archivo ]; then
        echo el archivo "$archivo" ya existe
        continue
    fi
    case "`uname`" in
        CYGWIN*) archivo=`cygpath --windows $archivo`
    esac
    EXE="$PGBINDIR/pg_dump"
    CMD="$EXE -b -f $archivo -F c -i -v"
    log="$SQLLOGSDIR/${scriptname%%.*}.${PGDATABASE}.log"
    [ -f "$log" ] && rm "$log"
    echo $CMD
    $CMD 1>>$log 2>&1
    echo pg_dump: $?
    echo ""
    read -p "cat $log ? (s/n): " -n 1; echo ""
    [ "$REPLY" != "s" ] || cat $log | more
    break
done
