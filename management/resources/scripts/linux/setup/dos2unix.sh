#!/bin/sh
if [ -d "$HOMEDIR" ]; then
    me=$(basename "$BASH_SOURCE")
    echo $me convierte los archivos de texto de formato DOS a formato UNIX
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        log=$LOGSDIR/$me.log
        echo $me $HOMEDIR > $log
        case "`uname`" in
            CYGWIN*)    comando="dos2unix";;
            *)          comando="dos2unix -o";;
        esac
        for name in "*.jrxml" "*.password" "*.properties" "*.psql" "*.sh" "*.sql" "*.vm" ; do
            echo "$comando $HOMEDIR/$name"
            for archivo in $(find -L "$HOMEDIR" -type f -name "$name" | sort -f); do
                $comando "$archivo" >> $log 2>&1
            done
        done
        echo ""
        read -p "cat $log ? (s/n): " siono
        [ "$siono" = "s" ] && cat $log | more
    fi
fi
