#!/bin/bash
jbstart() {
    unset started stopped errores
    me="standalone-start"
    echo $me inicia la ejecucion del servidor de aplicaciones en modo standalone
    read -p "ejecutar $me? (s/n): " -n 1; echo ""
    [ "$REPLY" != "s" ] && return 1
    echo ""
    nohupdir="$LOGSDIR/jboss"
    [ -d "$nohupdir" ] || mkdir -p "$nohupdir"
    nohupout=`echo "${ashost}-${offset##*-}"|tr '[:punct:]' '-'|tr -s '-'`
    nohupout="$nohupdir/${nohupout}.log"
    [ -e "$nohupout" ] && rm -f "$nohupout"
    if [ -e "$nohupout" ]; then
        echo "no se pudo eliminar $nohupout"
        echo "probablemente JBoss ya se encuentra en ejecucion"
        started="?"
        return 2
    fi
    unset ask_before_starting
    nohup $jboss/standalone-start.sh >> $nohupout 2>&1 &
    seconds="$1"
    echo esperando $seconds segundos para continuar
    while [ -n "$seconds" ]; do
        sleep $seconds
        started=$(cat "$nohupout" | grep "JBAS015874")
        [ -n "$started" ] && break
        started=$(cat "$nohupout" | grep "JBAS015875") # with errors
        [ -n "$started" ] && break
        stopped=$(cat "$nohupout" | grep "JBAS015950")
        [ -n "$stopped" ] && break
        errores=$(cat "$nohupout" | grep "ERROR" | wc -l)
        [ -n "$errores" -a "$errores" != "0" ] && break
        read -p "continuar sin esperar mas? (s/n): " -n 1; echo ""
        [ "$REPLY" != "s" ] || unset seconds
    done
    if [ -n "$errores" -a "$errores" != "0" ]; then
        echo "$errores errores"
        cat "$nohupout" | grep "ERROR"
#       kill -- -$$
        kill -9 -$$
    fi
    [ -n "$started" ] && echo $started
    [ -n "$stopped" ] && echo $stopped
}

export EEAS=JBoss
export DBMS=Oracle
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
resources=$HOMEDIR/resources
linux=$resources/scripts/linux
setup=$linux/setup
jboss=$linux/jboss
oracle=$linux/oracle
chmod -R 0777 $resources
echo ""
bash $setup/dos2unix.sh
echo ""
if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
    jbstart 15
    echo ""
    if [ -n "$started" ]; then
        bash $jboss/ear-undeploy.sh
        echo ""
        bash $jboss/standalone-stop.sh
        echo ""
    fi
#   bash $oracle/dump.sh
#   echo ""
fi
if [ "$1" = "install" ]; then
    dir="$JBOSS_HOME/welcome-content/$lower_case_project/attachments"
    [ -d "$dir" ] || mkdir -p "$dir"
    dir="$JBOSS_HOME/welcome-content/$lower_case_project/spool"
    [ -d "$dir" ] || mkdir -p "$dir"
    bash $oracle/createdba.sh
    echo ""
#   bash $oracle/restore.sh; status=$?
#   echo ""
#   if [ "$status" = "101" ]; then
        bash $oracle/customize.sh
        echo ""
        bash $oracle/makedb.sh
        echo ""
#   fi
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
    jbstart 5
    echo ""
    if [ -n "$started" ]; then
        bash $jboss/ear-deploy.sh
        echo ""
        bash $jboss/standalone-stop.sh
        echo ""
    fi
fi
echo ""
echo fin del procedimiento de instalacion
echo ""
unset jbstart
