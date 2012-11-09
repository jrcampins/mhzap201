#!/bin/sh
me=deploy
echo $me implementa la aplicacion de empresa en el servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$0" ]; then
        . $(dirname "$0")/variables.sh
        if [ -n "$variables" ]; then
            ear="$CRVLDIR/${PROJKEY}.ear"
            if [ -f $ear ]; then
                case "`uname`" in
                    CYGWIN*) ear=`cygpath --windows $ear`
                esac
                echo ""
                echo $ASADMIN $GFDOMAINCST2 deploy --property compatibility=v2 $ear
                bash $ASADMIN $GFDOMAINCST2 deploy --property compatibility=v2 $ear
                echo ""
                echo $ASADMIN $GFDOMAINCST2 list-components
                bash $ASADMIN $GFDOMAINCST2 list-components
            fi
            unset ear
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
