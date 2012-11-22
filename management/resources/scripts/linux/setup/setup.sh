#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me desinstala y reinstala los componentes de la aplicacion de empresa en el servidor de aplicaciones y en el servidor de base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        resources=$MHZAP201_HOME/resources
        linux=$resources/scripts/linux
        setup=$linux/setup
        glassfish=$linux/glassfish
        postgresql=$linux/postgresql
    #   echo chmod otorga los permisos necesarios (TODO: otorgar solo los permisos necesarios)
        chmod -R 0777 $resources
        echo ""
    #   echo dos2unix convierte los archivos de texto de formato DOS a formato UNIX
        source $setup/dos2unix.sh $MHZAP201_HOME
        echo ""
        if [ "$1" = "upgrade" -o "$1" = "uninstall" ]; then
        #   echo domain-start inicia la ejecucion del servidor de aplicaciones
            source $glassfish/domain-start.sh
            echo ""
        #   echo undeploy anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
            source $glassfish/undeploy.sh
            echo ""
        #   echo delete-jms elimina las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
            source $glassfish/delete-jms.sh
            echo ""
        #   echo delete-jdbc elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
            source $glassfish/delete-jdbc.sh
            echo ""
        #   echo domain-stop detiene la ejecucion del servidor de aplicaciones
            source $glassfish/domain-stop.sh
            echo ""
        #   echo dump crea un archivo respaldo de la base de datos
            source $postgresql/dump.sh
            echo ""
        fi
        if [ "$1" = "install" ]; then
        #   echo createdb crea la base de datos
            source $postgresql/createdb.sh
            echo ""
            read -p "restaurar de la base de datos a partir de un archivo respaldo? (s/n): " siono
            if [ "$siono" = "s" ]; then
            #   echo restore restaura de la base de datos a partir de un archivo respaldo
                source $postgresql/restore.sh
                echo ""
            else
            #   echo makedb crea los objetos de la base de datos
                source $postgresql/makedb.sh
                echo ""
            fi
        elif [ "$1" = "uninstall" ]; then
        #   echo dropdb elimina la base de datos
            source $postgresql/dropdb.sh
            echo ""
        elif [ "$1" = "upgrade" ]; then
        #   echo upgradedb actualiza la base de datos
            source $postgresql/upgradedb.sh
            echo ""
        fi
        if [ "$1" = "upgrade" -o "$1" = "install" ]; then
        #   echo rebuild reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
            source $postgresql/rebuild.sh
            echo ""
        #   echo vacuumdb comprime la base de datos
            source $postgresql/vacuumdb.sh
            echo ""
        #   echo domain-start inicia la ejecucion del servidor de aplicaciones
            source $glassfish/domain-start.sh
            echo ""
        #   echo server-config establece parametros de configuracion del servidor de aplicaciones
            source $glassfish/server-config.sh
            echo ""
        #   echo create-jdbc crea el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
            source $glassfish/create-jdbc.sh
            echo ""
        #   echo create-jms crea las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
            source $glassfish/create-jms.sh
            echo ""
        #   echo deploy implementa la aplicacion de empresa en el servidor de aplicaciones
            source $glassfish/deploy.sh
            echo ""
        fi
    fi
fi
