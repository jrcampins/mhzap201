#!/bin/sh
if [ -d "$1" ]; then
    pushd "$1" > /dev/null
    me=dos2unix
    echo $me convierte los archivos de texto de formato DOS a formato UNIX
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        wd=$(pwd)
        echo $me $wd>$me.log
    #   for directorio in $(find "$wd" -type d | sort -f); do
    #       echo "$me $directorio"
    #   done
        case "`uname`" in
            CYGWIN*)    comando="$me";;
            *)          comando="$me -o";;
        esac
        for name in "*.jrxml" "*.password" "*.properties" "*.psql" "*.sh" "*.sql" "*.vm" ; do
            echo "$comando $name"
            for archivo in $(find "$wd" -type f -name "$name" | sort -f); do
                $comando "$archivo">>$me.log 2>&1
            done
        done
        echo ""
        read -p "cat $me.log ? (s/n): " siono
        [ "$siono" = "s" ] && cat $me.log | more
    fi
    popd > /dev/null
fi
