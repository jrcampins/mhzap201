#!/bin/sh
cd $(dirname "$BASH_SOURCE")
directorio=$(pwd)
unset subdirectorio
while [ -z "$subdirectorio" ]; do
    clear
    pwd
    echo ""
    echo Escriba el numero correspondiente al tipo de script que desea ejecutar, 0 para terminar
    echo ""
    cd "$directorio"
    select subdirectorio in $(find -L "." -mindepth 1 -maxdepth 1 -type d -name "[!s]*" | sort -f); do echo "$subdirectorio"; break; done
    if [ -d "$subdirectorio" ]; then
        cd "$subdirectorio"
        subdirectorio=$(pwd)
        unset archivo
        while [ -z "$archivo" ]; do
            clear
            pwd
            echo ""
            echo Escriba el numero correspondiente al script que desea ejecutar, 0 para terminar
            echo ""
            cd "$subdirectorio"
            select archivo in $(find -L "." -type f -name "[!v]*.sh" | sort -f); do echo "$archivo"; break; done
            if [ -x "$archivo" ]; then
                bash "$archivo"
                unset archivo
                echo ""
                read -p "presione ENTER para continuar " archivo
            else
                archivo='.'
            fi
        done
        unset subdirectorio
    else
        subdirectorio='.'
    fi
done
unset subdirectorio archivo
