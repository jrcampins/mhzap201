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

EEAS=JBoss
DBMS=Oracle
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
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
    bash $setup/dos2unix.sh $HOMEDIR
    echo ""
    if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
        jbstart
        echo ""
        bash $jboss/ear-undeploy.sh
        echo ""
        bash $jboss/standalone-stop.sh
        echo ""
#       bash $oracle/dump.sh
#       echo ""
    fi
    if [ "$1" = "install" ]; then
        dir="$JBOSS_HOME/welcome-content/$lower_case_project/attachments"
        [ -d "$dir" ] || mkdir -p "$dir"
        dir="$JBOSS_HOME/welcome-content/$lower_case_project/spool"
        [ -d "$dir" ] || mkdir -p "$dir"
        bash $oracle/createdba.sh
        echo ""
        siono=n
#       read -p "restaurar de la base de datos a partir de un archivo respaldo? (s/n): " siono
#       echo ""
        if [ "$siono" = "s" ]; then
            bash $oracle/restore.sh
            echo ""
        else
            bash $oracle/customize.sh
            echo ""
            bash $oracle/makedb.sh
            echo ""
        fi
    elif [ "$1" = "uninstall" ]; then
        bash $oracle/dropdb.sh
        echo ""
    elif [ "$1" = "upgrade" ]; then
        bash $oracle/upgradedb.sh
        echo ""
    fi
    if [ "$1" = "upgrade" -o "$1" = "install" ]; then
        bash $oracle/rebuild.sh
        echo ""
        jbstart
        echo ""
        bash $jboss/ear-deploy.sh
        echo ""
    fi
fi
echo ""
echo fin del procedimiento de instalacion
echo ""
