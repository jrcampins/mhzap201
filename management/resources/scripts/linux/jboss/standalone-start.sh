#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me inicia la ejecucion del servidor de aplicaciones en modo standalone
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        cd $JBOSS_HOME
    #   rm -rf standalone/log/*.log
    #   rm -rf standalone/tmp
        export NOPAUSE=true
        bash bin/standalone.sh -c standalone-full.xml
    fi
fi
