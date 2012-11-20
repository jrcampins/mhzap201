#!/bin/sh
me=restore
echo $me restaura la base de datos a partir de un archivo respaldo
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            echo ""
            echo Escriba el numero correspondiente al archivo de respaldo que desea utilizar para restaurar la base de datos
            echo ""
            select archivo in $(find "$HOMEDIR" -type f -name "*.backup" | sort -f); do
            #   echo ""
            #   echo $me $archivo
                break
            done
            echo ""
            if [ -n "$archivo" ]; then
                if [ ! -f $archivo ]; then
                    . $scriptpath/unset-variables.sh el archivo "$archivo" no existe
                else
                    case "`uname`" in
                        CYGWIN*) archivo=`cygpath --windows $archivo`
                    esac
                    EXE="$PGBINDIR/pg_restore"
                #   CMD="$EXE -c -i -d $PGDATABASE -v $archivo"
                    CMD="$EXE -i -d $PGDATABASE -v $archivo"
                    LOG=./$me.log
                    echo $CMD
                    echo $(date)>$LOG
                    echo $CMD>>$LOG
                    $CMD 1>>$LOG 2>&1
                    echo $me: $?
                    echo ""
                    read -p "cat $LOG ? (s/n): " siono
                    echo ""
                    [ "$siono" = "s" ] && cat $LOG | more
                    unset EXE CMD LOG siono
                fi
                unset archivo
            fi
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
