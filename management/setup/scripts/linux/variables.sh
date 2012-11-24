#!/bin/sh
variables=$BASH_SOURCE
PROJKEY="mhzap201"
HOMEDIR=`cd $(dirname "$BASH_SOURCE"); pwd`
DISTDIR=$HOMEDIR

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
elif [ -n "on_properly_defined_variables" ]; then
    echo JAVA_HOME=$JAVA_HOME
fi

xs="$HOMEDIR/variables-conf.sh"
if [ -x "$xs" ]; then
    . "$xs"
else
    echo No es posible ejecutar el script "$xs"
    unset variables
fi

# shopt -s nocasematch
eeas=`echo $EEAS|tr '[:upper:]' '[:lower:]'`
unset EEASKEY
[ "$EEAS" = "glassfish" ] && EEASKEY="GlassFish"
[ "$EEAS" = "jboss"     ] && EEASKEY="JBoss"
[ -z "$EEASKEY"         ] && EEASKEY="GlassFish"
# shopt -u nocasematch

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
    elif [ -n "on_properly_defined_variables" ]; then
        echo GLASSFISH_HOME=$GLASSFISH_HOME
    fi
    if [ ! -f "$aspassfile" ]; then
        echo La variable de entorno aspassfile no esta correctamente definida
        unset variables
    elif [ -n "on_properly_defined_variables" ]; then
        echo aspassfile=$aspassfile
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
    elif [ -n "on_properly_defined_variables" ]; then
        echo JBOSS_HOME=$JBOSS_HOME
    fi
fi

# shopt -s nocasematch
dbms=`echo $DBMS|tr '[:upper:]' '[:lower:]'`
unset DBMSKEY
[ "$DBMS" = "oracle"     ] && DBMSKEY="Oracle"
[ "$DBMS" = "postgresql" ] && DBMSKEY="PostgreSQL"
[ -z "$DBMSKEY"          ] && DBMSKEY="PostgreSQL"
# shopt -u nocasematch

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
    elif [ -n "on_properly_defined_variables" ]; then
        echo ORACLE_HOME=$ORACLE_HOME
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
    elif [ -n "on_properly_defined_variables" ]; then
        echo POSTGRESQL_HOME=$POSTGRESQL_HOME
    fi
fi

xs="$HOMEDIR/variables-server.sh"
if [ -x "$xs" ]; then
    . "$xs"
fi
