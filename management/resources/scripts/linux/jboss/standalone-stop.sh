#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me detiene la ejecucion del servidor de aplicaciones en modo standalone
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        cd $JBOSS_HOME
        echo bin/jboss-cli.sh $jbcst2 command=:shutdown
        bash bin/jboss-cli.sh $jbcst2 command=:shutdown
    fi
fi