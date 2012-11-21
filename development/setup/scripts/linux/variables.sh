#!/bin/sh
variables=ok
if [ -d "$MHZAP201_HOME" ]; then
    PROJKEY="mhzap201"
    PROJDIR="mhzap201"
    HOMEDIR=$MHZAP201_HOME
    CRVLDIR=$MHZAP201_HOME
    xs="$HOMEDIR/variables-conf.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    xs="$HOMEDIR/variables-home.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    if [ -z "$MHZAP201_EEAS" -o "$MHZAP201_EEAS" = "GlassFish" ]; then
        EEASKEY=$MHZAP201_EEAS
        EEASDIR=glassfish
    fi
    if [ "$MHZAP201_EEAS" = "JBoss" ]; then
        EEASKEY=$MHZAP201_EEAS
        EEASDIR=jboss
    fi
    if [ "$MHZAP201_DBMS" = "Oracle" ]; then
        DBMSKEY=$MHZAP201_DBMS
        DBMSDIR=oracle
    fi
    if [ -z  "$MHZAP201_DBMS" -o "$MHZAP201_DBMS" = "PostgreSQL" ]; then
        DBMSKEY=$MHZAP201_DBMS
        DBMSDIR=postgresql
    fi
    if [ "$MHZAP201_DBMS" = "SQLServer" ]; then
        DBMSKEY=$MHZAP201_DBMS
        DBMSDIR=sqlserver
    fi
    xs="$HOMEDIR/variables-dbdc.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
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
