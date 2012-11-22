#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    if [ -z "$ask_before_starting" ]; then
        siono="s"
    else
        echo $me inicia la ejecucion del servidor de aplicaciones en modo standalone
        read -p "ejecutar $me ? (s/n): " siono
    fi
    if [ "$siono" = "s" ]; then
        cd $JBOSS_HOME
    #   rm -rf standalone/log/*.log
    #   rm -rf standalone/tmp
        export NOPAUSE=true
        bash bin/standalone.sh -c standalone-full.xml
    fi
fi
