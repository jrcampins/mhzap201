#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me crea un archivo respaldo de la base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        unset archivo
        while [ -z "$archivo" ]; do
            echo ""
            for backupfile in $(find -L "$HOMEDIR" -type f -name *.backup | sort -f); do echo $backupfile; done
            echo ""
            backupfile="${PGDATABASE:-$me}_$(date +%Y%m%d%H%M).backup"
            echo ""
            echo Escriba un nuevo nombre del archivo de respaldo en el formato: "directorio/archivo"
            echo ""
            echo Si no escribe directorio o si escribe '.' el directorio seria $BACKUPDIR
            echo Si no escribe archivo o si escribe '.' el archivo seria $backupfile
            echo Si no escribe nada no se creara el respaldo
            echo ""
            read -p "nombre del archivo de respaldo: " archivo
            echo ""
            if [ -z "$archivo" ]; then
                archivo='.'
            else
                archivo="${archivo/.\//}"
                archivo="${archivo/.backup/}"
                [ "$(basename ""$archivo"")" = ''  ] && archivo=$backupfile
                [ "$(basename ""$archivo"")" = '.' ] && archivo=$backupfile
                [ "$(dirname  ""$archivo"")" = '.' ] && archivo="$BACKUPDIR/${archivo}"
                archivo="${archivo/.backup/}.backup"
                if [ -e $archivo ]; then
                    echo el archivo "$archivo" ya existe
                    unset archivo
                else
                    case "`uname`" in
                        CYGWIN*) archivo=`cygpath --windows $archivo`
                    esac
                    EXE="$PGBINDIR/pg_dump"
                    CMD="$EXE -b -f $archivo -F c -i -v"
                    log="$LOGSDIR/${scriptname}.${PGDATABASE}.log"
                    [ -f "$log" ] && rm "$log"
                    echo $CMD
                    $CMD 1>>$log 2>&1
                    echo pg_dump: $?
                    echo ""
                    read -p "cat $log ? (s/n): " siono
                    echo ""
                    [ "$siono" = "s" ] && cat $log | more
                fi
            fi
        done
    fi
fi
