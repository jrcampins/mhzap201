#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
echo $me instala los componentes de la aplicacion en JBoss y Oracle
read -p "ejecutar $me? (s/n): " -n 1; echo ""
if [ "$REPLY" = "s" ]; then
    xs=$scriptpath/resources/scripts/linux/setup/setup-jb-ora.sh
    [ -x "$xs" ] && bash "$xs" install
fi
