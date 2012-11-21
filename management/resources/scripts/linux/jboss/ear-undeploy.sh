#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        ear="${PROJKEY}.ear"
        cd $JBOSS_HOME
        echo bin/jboss-cli.sh $jbcst2 --command="undeploy $ear"
        bash bin/jboss-cli.sh $jbcst2 --command="undeploy $ear"
    fi
fi
