#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
echo $me elimina los componentes de la aplicacion instalados en JBoss y Oracle
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
if [ "$REPLY" = "s" ]; then
    xs=$scriptpath/resources/scripts/linux/setup/setup-jb-ora.sh
    [ -x "$xs" ] && bash "$xs" uninstall
fi
