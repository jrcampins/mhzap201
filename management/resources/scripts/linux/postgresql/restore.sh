#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me restaura la base de datos a partir de un archivo respaldo
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        echo ""
        echo Escriba el numero correspondiente al archivo de respaldo que desea utilizar para restaurar la base de datos
        echo ""
        select archivo in $(find -L "$HOMEDIR" -type f -name "*.backup" | sort -f); do
            break
        done
        echo ""
        if [ -n "$archivo" ]; then
            if [ ! -f $archivo ]; then
                echo el archivo "$archivo" no existe
            else
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
                read -p "cat $log ? (s/n): " siono
                echo ""
                [ "$siono" = "s" ] && cat $log | more
            fi
            unset archivo
        fi
    fi
fi
