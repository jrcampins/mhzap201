#!/bin/sh
me=dump
echo $me crea un archivo respaldo de la base de datos
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            unset archivo
            while [ -z "$archivo" ]; do
                echo ""
                for backupfile in $(find "$CRVLDIR" -type f -name *.backup | sort -f); do echo $backupfile; done
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
                fi
            done
            unset backupfile archivo
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
