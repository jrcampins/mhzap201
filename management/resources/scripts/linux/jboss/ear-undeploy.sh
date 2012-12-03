#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        ear="${lower_case_project}.ear"
        cd $JBOSS_HOME
        echo bin/jboss-cli.sh $ascst2 --command="undeploy $ear"
        bash bin/jboss-cli.sh $ascst2 --command="undeploy $ear"
    fi
fi
