#!/bin/sh
jbstart () {
    me="standalone-start"
    echo $me inicia la ejecucion del servidor de aplicaciones en modo standalone
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        pushd $LOGSDIR
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
#   echo chmod otorga los permisos necesarios (TODO: otorgar solo los permisos necesarios)
    chmod -R 0777 $resources
    echo ""
#   echo dos2unix convierte los archivos de texto de formato DOS a formato UNIX
    source $setup/dos2unix.sh $HOMEDIR
    echo ""
    if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
    #   echo standalone-start inicia la ejecucion del servidor de aplicaciones
    #   source $jboss/standalone-start.sh
        jbstart
        echo ""
    #   echo ear-undeploy anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
        source $jboss/ear-undeploy.sh
        echo ""
    #   echo standalone-stop detiene la ejecucion del servidor de aplicaciones
        source $jboss/standalone-stop.sh
        echo ""
#   #   echo dump crea un archivo respaldo de la base de datos
#       source $oracle/dump.sh
#       echo ""
    fi
    if [ "$1" = "install" ]; then
#       read -p "restaurar de la base de datos a partir de un archivo respaldo? (s/n): " siono
#       echo ""
#       if [ "$siono" = "s" ]; then
#       #   echo restore restaura de la base de datos a partir de un archivo respaldo
#           source $oracle/restore.sh
#           echo ""
#       else
        #   echo customize crea paquetes de utilidad en la base de datos
            source $oracle/customize.sh
            echo ""
        #   echo makedb crea los objetos de la aplicacion en la base de datos
            source $oracle/makedb.sh
            echo ""
#       fi
    elif [ "$1" = "uninstall" ]; then
    #   echo dropdb elimina la base de datos
        source $oracle/dropdb.sh
        echo ""
#   elif [ "$1" = "upgrade" ]; then
#   #   echo upgradedb actualiza la base de datos
#       source $oracle/upgradedb.sh
#       echo ""
    fi
    if [ "$1" = "upgrade" -o "$1" = "install" ]; then
    #   echo rebuild reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
        source $oracle/rebuild.sh
        echo ""
    #   echo standalone-start inicia la ejecucion del servidor de aplicaciones
    #   source $jboss/standalone-start.sh
        jbstart
        echo ""
    #   echo ear-deploy implementa la aplicacion de empresa en el servidor de aplicaciones
        source $jboss/ear-deploy.sh
        echo ""
    fi
fi
