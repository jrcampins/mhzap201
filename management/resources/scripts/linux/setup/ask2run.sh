#!/bin/sh
xs="$$1/$2.sh"
if [ -x "$xs" ]; then
    shift
    read -p "ejecutar $* ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        shift
        bash "$xs" $*
    fi
else
    echo "$$1/$2.sh" no es un archivo ejecutable
fi
unset xs siono
