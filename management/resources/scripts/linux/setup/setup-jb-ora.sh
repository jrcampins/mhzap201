#!/bin/sh
jbstart () {
    me="standalone-start"
    echo $me inicia la ejecucion del servidor de aplicaciones en modo standalone
    read -p "ejecutar $me ? (s/n): " siono
    echo ""
    if [ "$siono" = "s" ]; then
        [ -d "$LOGSDIR/nohup" ] || mkdir -p "$LOGSDIR/nohup"
        pushd $LOGSDIR/nohup
        rm -f nohup.out
        unset ask_before_starting
        nohup $jboss/standalone-start.sh &
        popd
    fi
}

scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    resources=$HOMEDIR/resources
    linux=$resources/scripts/linux
    setup=$linux/setup
    jboss=$linux/jboss
    oracle=$linux/oracle
    chmod -R 0777 $resources
    echo ""
    source $setup/dos2unix.sh $HOMEDIR
    echo ""
    if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
        jbstart
        echo ""
        source $jboss/ear-undeploy.sh
        echo ""
        source $jboss/standalone-stop.sh
        echo ""
#       source $oracle/dump.sh
#       echo ""
    fi
    if [ "$1" = "install" ]; then
        dir="$JBOSS_HOME/welcome-content/$lower_case_project/attachments"
        [ -d "$dir" ] || mkdir -p "$dir"
        dir="$JBOSS_HOME/welcome-content/$lower_case_project/spool"
        [ -d "$dir" ] || mkdir -p "$dir"
        siono=n
#       read -p "restaurar de la base de datos a partir de un archivo respaldo? (s/n): " siono
#       echo ""
        if [ "$siono" = "s" ]; then
            source $oracle/restore.sh
            echo ""
        else
            source $oracle/customize.sh
            echo ""
            source $oracle/makedb.sh
            echo ""
        fi
    elif [ "$1" = "uninstall" ]; then
        source $oracle/dropdb.sh
        echo ""
    elif [ "$1" = "upgrade" ]; then
        source $oracle/upgradedb.sh
        echo ""
    fi
    if [ "$1" = "upgrade" -o "$1" = "install" ]; then
        source $oracle/rebuild.sh
        echo ""
        jbstart
        echo ""
        source $jboss/ear-deploy.sh
        echo ""
    fi
fi
echo ""
echo fin del procedimiento de instalacion
echo ""
