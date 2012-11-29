#!/bin/sh
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
    glassfish=$linux/glassfish
    postgresql=$linux/postgresql
    chmod -R 0777 $resources
    echo ""
    source $setup/dos2unix.sh $HOMEDIR
    echo ""
    if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
        source $glassfish/domain-start.sh
        echo ""
        source $glassfish/undeploy.sh
        echo ""
        source $glassfish/delete-jms.sh
        echo ""
        source $glassfish/delete-jdbc.sh
        echo ""
        source $glassfish/domain-stop.sh
        echo ""
        source $postgresql/dump.sh
        echo ""
    fi
    if [ "$1" = "install" ]; then
        source $postgresql/createdb.sh
        echo ""
        read -p "restaurar de la base de datos a partir de un archivo respaldo? (s/n): " siono
        echo ""
        if [ "$siono" = "s" ]; then
            source $postgresql/restore.sh
            echo ""
        else
            source $postgresql/makedb.sh
            echo ""
        fi
    elif [ "$1" = "uninstall" ]; then
        source $postgresql/dropdb.sh
        echo ""
    elif [ "$1" = "upgrade" ]; then
        source $postgresql/upgradedb.sh
        echo ""
    fi
    if [ "$1" = "upgrade" -o "$1" = "install" ]; then
        source $postgresql/rebuild.sh
        echo ""
        source $postgresql/vacuumdb.sh
        echo ""
        source $glassfish/domain-start.sh
        echo ""
        source $glassfish/server-config.sh
        echo ""
        source $glassfish/create-jdbc.sh
        echo ""
        source $glassfish/create-jms.sh
        echo ""
        source $glassfish/deploy.sh
        echo ""
    fi
fi
echo ""
echo fin del procedimiento de instalacion
echo ""
