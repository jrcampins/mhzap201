#!/bin/sh
clear
export EEAS=GlassFish
export DBMS=PostgreSQL
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    resources=$HOMEDIR/resources
    linux=$resources/scripts/linux
    setup=$linux/setup
    glassfish=$linux/glassfish
    postgresql=$linux/postgresql
#   chmod -R 0777 $resources
#   echo ""
    source $setup/dos2unix.sh $HOMEDIR
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
        read -p "restaurar de la base de datos a partir de un archivo respaldo? (s/n): " siono
        echo ""
        if [ "$siono" = "s" ]; then
            bash $postgresql/restore.sh
            echo ""
        else
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
    fi
fi
echo ""
echo fin del procedimiento de instalacion
echo ""
