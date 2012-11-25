#!/bin/sh
#
# cxms checks and executes a mandatory script
#
cxms () {
    if [ -x "$1" ]; then
        . "$1"
    else
        echo No es posible ejecutar el script "$1"
        unset variables
    fi
}

variables=$BASH_SOURCE
lower_case_project=mhzap201
UPPER_CASE_PROJECT=MHZAP201
HOMEDIR=`cd $(dirname "$BASH_SOURCE"); pwd`
DISTDIR=$HOMEDIR

cxms "$HOMEDIR/variables-home.sh"

if [ ! -d "$JAVA_HOME" ]; then
    echo La variable de entorno JAVA_HOME no esta correctamente definida
    unset variables
elif [ -n "$on_properly_defined_variables" ]; then
    echo JAVA_HOME=$JAVA_HOME
fi

cxms "$HOMEDIR/variables-conf.sh"

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
    cxms "$HOMEDIR/variables-glassfish.sh"
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
    else
        [ -n "$on_properly_defined_variables" ] && echo aspassfile=$aspassfile
        case "`uname`" in
            CYGWIN*) aspassfile=`cygpath --windows $aspassfile`
        esac        
    fi
    unset ascst1
#   ascst1="--user ${asuser} --passwordfile ${aspassfile}"
    ascst2="--host ${ashost} --port ${asport} ${ascst1}"
    if [ -n "$on_properly_defined_variables" ]; then
        echo domain=$domain
    fi
fi

if [ "$EEASKEY" = "JBoss" ]; then
    EEASDIR=jboss
    cxms "$HOMEDIR/variables-jboss.sh"
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
    unset ascst1
#   ascst1="--user ${asuser} --password ${aspass}"
    ascst2="--connect controller=${ashost}:${asport} ${ascst1}"
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
    cxms "$HOMEDIR/variables-oracle.sh"
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
    cxms "$HOMEDIR/variables-postgresql.sh"
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

unset cxms
xs="$HOMEDIR/variables-server.sh"
[ -x "$xs" ] && . "$xs"
