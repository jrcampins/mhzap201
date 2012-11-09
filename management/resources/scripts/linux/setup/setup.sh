#!/bin/sh
me=setup
export MHZAP201_HOME=${MHZAP201_HOME:-"$HOME/mhzap201"}
xs="$MHZAP201_HOME/variables-home.sh"
[ -d "$MHZAP201_HOME" -a -x "$xs" ] && . "$xs"
unset xs

[ -d "$MHZAP201_HOME"   ] || echo La variable de entorno MHZAP201_HOME no esta correctamente definida
[ -d "$GLASSFISH_HOME"  ] || echo La variable de entorno GLASSFISH_HOME no esta correctamente definida
[ -d "$POSTGRESQL_HOME" ] || echo La variable de entorno POSTGRESQL_HOME no esta correctamente definida

if [ -d "$MHZAP201_HOME" -a -d "$GLASSFISH_HOME" -a -d "$POSTGRESQL_HOME" ]; then
    echo $me desinstala y reinstala los componentes de la aplicacion de empresa en el servidor de aplicaciones y en el servidor de base de datos
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        if [ -d "$1" ]; then
            cd "$1"
            wd=$(pwd)
        #   xs=$wd/ask2run.sh
        #   xs=$wd/resources/scripts/linux/setup/ask2run.sh

            #echo ""
            #echo chmod otorga los permisos necesarios
            chmod -R 0777 resources # TODO: otorgar solo los permisos necesarios

        #   sd=$wd
            sd=$wd/resources/scripts/linux/setup

            echo ""
        #   echo dos2unix convierte los archivos de texto de formato DOS a formato UNIX
            bash $sd/dos2unix.sh $wd

            if [ "$2" != "install" ]; then

                sd=$wd/resources/scripts/linux/glassfish

                echo ""
            #   echo domain-start inicia la ejecucion del servidor de aplicaciones
                bash $sd/domain-start.sh
                echo ""
            #   echo undeploy anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
                bash $sd/undeploy.sh
                echo ""
            #   echo delete-jms elimina las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
                bash $sd/delete-jms.sh
                echo ""
            #   echo delete-jdbc elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
                bash $sd/delete-jdbc.sh
                echo ""
            #   echo domain-stop detiene la ejecucion del servidor de aplicaciones
                bash $sd/domain-stop.sh

                sd=$wd/resources/scripts/linux/postgresql

                echo ""
            #   echo dump crea un archivo respaldo de la base de datos
                bash $sd/dump.sh

                if [ "$2" = "uninstall" ]; then
                    echo ""
                #   echo dropdb elimina la base de datos
                    bash $sd/dropdb.sh
                else
                    echo ""
                #   echo upgradedb actualiza la base de datos
                    bash $sd/upgradedb.sh
                fi

            fi

            if [ "$2" != "uninstall" ]; then

                sd=$wd/resources/scripts/linux/postgresql

                if [ "$2" = "install" ]; then
                    echo ""
                #   echo createdb crea la base de datos
                    bash $sd/createdb.sh
                    echo ""
                #   echo restore restaura de la base de datos a partir de un archivo respaldo
                    bash $sd/restore.sh
                fi

                echo ""
            #   echo rebuild reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
                bash $sd/rebuild.sh
                echo ""
            #   echo rebuild reconstruye las tablas '"'plus'"' correspondientes a cada tabla '"'arbol'"'
                bash $sd/vacuumdb.sh

                sd=$wd/resources/scripts/linux/glassfish

                echo ""
            #   echo domain-start inicia la ejecucion del servidor de aplicaciones
                bash $sd/domain-start.sh
                echo ""
            #   echo server-config establece parametros de configuracion del servidor de aplicaciones
                bash $sd/server-config.sh
                echo ""
            #   echo create-jdbc crea el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
                bash $sd/create-jdbc.sh
                echo ""
            #   echo create-jms crea las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
                bash $sd/create-jms.sh
                echo ""
            #   echo deploy implementa la aplicacion de empresa en el servidor de aplicaciones
                bash $sd/deploy.sh
                echo ""
            #   echo copy-fonts copia las fuentes usadas por los informes a la carpeta de configuracion del servidor de aplicaciones
                bash $sd/copy-fonts.sh
            #   echo copy-images copia las imagenes usadas por los informes a la carpeta de configuracion del servidor de aplicaciones
                bash $sd/copy-images.sh
            #   echo copy-properties copia los archivos de propiedades a la carpeta de configuracion del servidor de aplicaciones
                bash $sd/copy-properties.sh

            fi

        else
            echo "Modo de empleo: bash $me.sh"
        fi
    fi
fi
echo ""
unset me wd sd xs siono
