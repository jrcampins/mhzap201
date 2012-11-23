#!/bin/sh
variables=$BASH_SOURCE
PROJKEY="mhzap201"
HOMEDIR=`cd $(dirname "$BASH_SOURCE"); pwd`

xs="$HOMEDIR/variables-home.sh"
if [ -x "$xs" ]; then
    . "$xs"
else
    echo No es posible ejecutar el script "$xs"
    unset variables
fi

if [ ! -d "$JAVA_HOME" ]; then
    echo La variable de entorno JAVA_HOME no esta correctamente definida
    unset variables
fi

xs="$HOMEDIR/variables-conf.sh"
if [ -x "$xs" ]; then
    . "$xs"
else
    echo No es posible ejecutar el script "$xs"
    unset variables
fi

shopt -s nocasematch
unset EEASKEY
[ "$MHZAP201_EEAS" = "GlassFish" ] && EEASKEY="GlassFish"
[ "$MHZAP201_EEAS" = "JBoss"     ] && EEASKEY="JBoss"
[ "$EEAS_OVERRIDE" = "GlassFish" ] && EEASKEY="GlassFish"
[ "$EEAS_OVERRIDE" = "JBoss"     ] && EEASKEY="JBoss"
[ -z "$EEASKEY"                  ] && EEASKEY="GlassFish"
shopt -u nocasematch

if [ "$EEASKEY" = "GlassFish" ]; then
    EEASDIR=glassfish
    xs="$HOMEDIR/variables-glassfish.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    if [ ! -d "$GLASSFISH_HOME" ]; then
        echo La variable de entorno GLASSFISH_HOME no esta correctamente definida
        unset variables
    fi
fi

if [ "$EEASKEY" = "JBoss" ]; then
    EEASDIR=jboss
    xs="$HOMEDIR/variables-jboss.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    if [ ! -d "$JBOSS_HOME" ]; then
        echo La variable de entorno JBOSS_HOME no esta correctamente definida
        unset variables
    fi
fi

shopt -s nocasematch
unset DBMSKEY
[ "$MHZAP201_DBMS" = "Oracle"     ] && DBMSKEY="Oracle"
[ "$MHZAP201_DBMS" = "PostgreSQL" ] && DBMSKEY="PostgreSQL"
[ "$DBMS_OVERRIDE" = "Oracle"     ] && DBMSKEY="Oracle"
[ "$DBMS_OVERRIDE" = "PostgreSQL" ] && DBMSKEY="PostgreSQL"
[ -z "$DBMSKEY"                   ] && DBMSKEY="PostgreSQL"
shopt -u nocasematch

if [ "$DBMSKEY" = "Oracle" ]; then
    DBMSDIR=oracle
    xs="$HOMEDIR/variables-oracle.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    if [ ! -d "$ORACLE_HOME" ]; then
        echo La variable de entorno ORACLE_HOME no esta correctamente definida
        unset variables
    fi
fi

if [ "$DBMSKEY" = "PostgreSQL" ]; then
    DBMSDIR=postgresql
    xs="$HOMEDIR/variables-postgresql.sh"
    if [ -x "$xs" ]; then
        . "$xs"
    else
        echo No es posible ejecutar el script "$xs"
        unset variables
    fi
    if [ ! -d "$POSTGRESQL_HOME" ]; then
        echo La variable de entorno POSTGRESQL_HOME no esta correctamente definida
        unset variables
    fi
fi

xs="$HOMEDIR/variables-server.sh"
if [ -x "$xs" ]; then
    . "$xs"
fi
