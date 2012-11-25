#!/bin/sh
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
            echo ""
            echo $ASADMIN $GFDOMAINCST2 deploy $ear
            bash $ASADMIN $GFDOMAINCST2 deploy $ear
            echo ""
            echo $ASADMIN $GFDOMAINCST2 list-components
            bash $ASADMIN $GFDOMAINCST2 list-components
        else
            echo el archivo $ear no existe
        fi
    fi
fi
