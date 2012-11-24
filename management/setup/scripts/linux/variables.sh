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
elif [ -n "$on_properly_defined_variables" ]; then
    echo JAVA_HOME=$JAVA_HOME
fi

xs="$HOMEDIR/variables-conf.sh"
if [ -x "$xs" ]; then
    . "$xs"
else
    echo No es posible ejecutar el script "$xs"
    unset variables
fi

if [ -n "$on_properly_defined_variables" ]; then
    [ -n "$EEAS" ] && echo EEAS=$EEAS
    [ -z "$EEAS" ] && echo Advertencia: el valor de la variable de entorno EEAS no esta definido. Si se necesita, se usara GlassFish.
    [ -n "$DBMS" ] && echo DBMS=$DBMS
    [ -z "$DBMS" ] && echo Advertencia: el valor de la variable de entorno DBMS no esta definido. Si se necesita, se usara PostgreSQL.
fi

# shopt -s nocasematch
eeas=`echo $EEAS|tr '[:upper:]' '[:lower:]'`
unset EEASKEY
[ "$eeas" = "glassfish" ] && EEASKEY="GlassFish"
[ "$eeas" = "jboss"     ] && EEASKEY="JBoss"
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
    elif [ -n "$on_properly_defined_variables" ]; then
        echo GLASSFISH_HOME=$GLASSFISH_HOME
    fi
    if [ -n "$on_properly_defined_variables" ]; then
        echo ashost=$ashost
        echo asport=$asport
        echo asuser=$asuser
        echo aspass=********
    fi
    if [ ! -f "$aspassfile" ]; then
        echo La variable de entorno aspassfile no esta correctamente definida
        unset variables
    elif [ -n "$on_properly_defined_variables" ]; then
        echo aspassfile=$aspassfile
    fi
    ascst1="--user ${asuser} --passwordfile ${aspassfile}"
    ascst2="--host ${ashost} --port ${asport} ${ascst1}"
    ascst2="--host ${ashost} --port ${asport}"
    if [ -n "$on_properly_defined_variables" ]; then
        echo domain=$domain
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
    elif [ -n "$on_properly_defined_variables" ]; then
        echo JBOSS_HOME=$JBOSS_HOME
    fi
    if [ -n "$on_properly_defined_variables" ]; then
        echo ashost=$ashost
        echo asport=$asport
    fi
    ascst1="--user ${asuser} --password ${aspass}"
    ascst2="--connect controller=${ashost}:${asport} ${ascst1}"
    ascst2="--connect controller=${ashost}:${asport}"
    if [ -n "$on_properly_defined_variables" ]; then
        echo offset=$offset
    fi
fi

# shopt -s nocasematch
dbms=`echo $DBMS|tr '[:upper:]' '[:lower:]'`
unset DBMSKEY
[ "$dbms" = "oracle"     ] && DBMSKEY="Oracle"
[ "$dbms" = "postgresql" ] && DBMSKEY="PostgreSQL"
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
    elif [ -n "$on_properly_defined_variables" ]; then
        echo ORACLE_HOME=$ORACLE_HOME
    fi
    if [ -n "$on_properly_defined_variables" ]; then
        echo dbcoid=$dbcoid
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
    elif [ -n "$on_properly_defined_variables" ]; then
        echo POSTGRESQL_HOME=$POSTGRESQL_HOME
    fi
fi

if [ -n "$on_properly_defined_variables" ]; then
    echo dbhost=$dbhost
    echo dbport=$dbport
    echo dbuser=$dbuser
    echo dbpass=********
    echo dbname=$dbname
    echo dbcurl=$dbcurl
    echo driver=$driver
fi

xs="$HOMEDIR/variables-server.sh"
if [ -x "$xs" ]; then
    . "$xs"
fi
