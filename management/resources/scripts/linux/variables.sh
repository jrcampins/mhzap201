#!/bin/sh
export MHZAP201_HOME=${MHZAP201_HOME:-"$HOME/mhzap201"}
variables=ok
if [ -d "$MHZAP201_HOME" ]; then
    export PROJKEY="mhzap201"
    export PROJDIR="mhzap201"
    export HOMEDIR=$MHZAP201_HOME
#   directorio=$HOMEDIR
#   for directorio in $(find "$HOMEDIR" -mindepth 1 -maxdepth 1 -type d -name "V??R??????*" | sort -f); do continue; done
#   export CRVLDIR="$directorio"
#   unset directorio
#   if [ -d "$HOMEDIR/VnnRaammdd" ]; then
#       export CRVLDIR="$HOMEDIR/VnnRaammdd"
#   else
#       export CRVLDIR="$HOMEDIR"
#   fi
    export CRVLDIR=$MHZAP201_HOME
    xs="$HOMEDIR/variables-home.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    if [ "$MHZAP201_EEAS" = "GlassFish" ]; then
        export EEASKEY=$MHZAP201_EEAS
        export EEASDIR=glassfish
    fi
    if [ "$MHZAP201_EEAS" = "JBoss" ]; then
        export EEASKEY=$MHZAP201_EEAS
        export EEASDIR=jboss
    fi
    if [ "$MHZAP201_DBMS" = "Oracle" ]; then
        export DBMSKEY=$MHZAP201_DBMS
        export DBMSDIR=oracle
    fi
    if [ "$MHZAP201_DBMS" = "PostgreSQL" ]; then
        export DBMSKEY=$MHZAP201_DBMS
        export DBMSDIR=postgresql
    fi
    if [ "$MHZAP201_DBMS" = "SQLServer" ]; then
        export DBMSKEY=$MHZAP201_DBMS
        export DBMSDIR=sqlserver
    fi
    xs="$HOMEDIR/variables-dbdc.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
#   xs="$HOMEDIR/variables-j2ee.sh"
#   if [ -x "$xs" ]; then
#       . "$xs"
#   else
#       echo No es posible ejecutar el script "$xs"
#       unset variables
#   fi
    unset xs
else
    echo La variable de entorno MHZAP201_HOME no esta correctamente definida
    unset variables
fi

if [ ! -d "$JAVA_HOME" ]; then
    echo La variable de entorno JAVA_HOME no esta correctamente definida
    unset variables
fi

if [ "$EEASKEY" = "GlassFish" -a ! -d "$GLASSFISH_HOME" ]; then
    echo La variable de entorno GLASSFISH_HOME no esta correctamente definida
    unset variables
fi

if [ "$EEASKEY" = "JBoss" -a ! -d "$JBOSS_HOME" ]; then
    echo La variable de entorno JBOSS_HOME no esta correctamente definida
    unset variables
fi

if [ "$DBMSKEY" = "Oracle" -a ! -d "$ORACLE_HOME" ]; then
    echo La variable de entorno ORACLE_HOME no esta correctamente definida
    unset variables
fi

if [ "$DBMSKEY" = "PostgreSQL" -a ! -d "$POSTGRESQL_HOME" ]; then
    echo La variable de entorno POSTGRESQL_HOME no esta correctamente definida
    unset variables
fi
