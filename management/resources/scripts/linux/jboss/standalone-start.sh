#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
REPLY="s"
if [ -n "$ask_before_starting" ]; then
    echo $me inicia la ejecucion del servidor de aplicaciones en modo standalone
    read -p "ejecutar $me? (s/n): " -n 1; echo ""
fi
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
cd $JBOSS_HOME
# rm -rf standalone/log/*.log
# rm -rf standalone/tmp
export NOPAUSE=true
bash bin/standalone.sh -c standalone-full.xml $offset
