#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
echo $me instala los componentes de la aplicacion en GlassFish y PostgreSQL
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
if [ "$REPLY" = "s" ]; then
    xs=$scriptpath/resources/scripts/linux/setup/setup-gf-pg.sh
    [ -x "$xs" ] && bash "$xs" install
fi
