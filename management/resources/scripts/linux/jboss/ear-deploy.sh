#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me implementa la aplicacion de empresa en el servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        ear="$DISTDIR/${lower_case_project}.ear"
        if [ -f $ear ]; then
            case "`uname`" in
                CYGWIN*) ear=`cygpath --windows $ear`
            esac
            cd $JBOSS_HOME
            echo bin/jboss-cli.sh $ascst2 --command="deploy $ear"
            bash bin/jboss-cli.sh $ascst2 --command="deploy $ear"
        else
            echo el archivo $ear no existe
        fi
    fi
fi
