#!/bin/bash
export EEAS=GlassFish
export DBMS=PostgreSQL
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
resources=$HOMEDIR/resources
linux=$resources/scripts/linux
setup=$linux/setup
glassfish=$linux/glassfish
postgresql=$linux/postgresql
chmod -R 0777 $resources
echo ""
bash $setup/dos2unix.sh
echo ""
if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
    bash $glassfish/domain-start.sh
    echo ""
    bash $glassfish/undeploy.sh
    echo ""
    bash $glassfish/delete-jms.sh
    echo ""
    bash $glassfish/delete-jdbc.sh
    echo ""
    bash $glassfish/domain-stop.sh
    echo ""
    bash $postgresql/dump.sh
    echo ""
fi
if [ "$1" = "install" ]; then
    bash $postgresql/createdb.sh
    echo ""
    bash $postgresql/restore.sh; status=$?
    echo ""
    if [ "$status" = "101" ]; then
        bash $postgresql/makedb.sh
        echo ""
    fi
elif [ "$1" = "uninstall" ]; then
    bash $postgresql/dropdb.sh
    echo ""
elif [ "$1" = "upgrade" ]; then
    bash $postgresql/upgradedb.sh
    echo ""
fi
if [ "$1" = "upgrade" -o "$1" = "install" ]; then
    bash $postgresql/rebuild.sh
    echo ""
    bash $postgresql/vacuumdb.sh
    echo ""
    bash $glassfish/domain-start.sh
    echo ""
    bash $glassfish/server-config.sh
    echo ""
    bash $glassfish/create-jdbc.sh
    echo ""
    bash $glassfish/create-jms.sh
    echo ""
    bash $glassfish/deploy.sh
    echo ""
    bash $glassfish/domain-stop.sh
    echo ""
fi
echo ""
echo fin del procedimiento $scriptname
echo ""
