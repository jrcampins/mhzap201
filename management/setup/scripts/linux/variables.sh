#!/bin/bash
xinfo() {
    messages=true
    echo [Informacion] $*
}

xwarn() {
    messages=true
    echo [ADVERTENCIA] $*
}

xerror() {
    messages=true
    unset variables
    echo [***ERROR***] $*
}

xsource () {
    if [ -x "$1" ]; then
        source $1
    elif [ "%2" = "/q" ]; then 
        if [ -n "$on_warning_messages" ]; then
            xwarn "$1" no existe o no es un archivo ejecutable
        fi
    else
        xerror $1 no existe o no es un archivo ejecutable
    fi
}

unset messages
variables=$BASH_SOURCE
lower_case_project=mhzap201
UPPER_CASE_PROJECT=MHZAP201
HOMEDIR=`cd $(dirname "$BASH_SOURCE"); pwd`
LOGSDIR=$HOMEDIR/logs

[ -d "$LOGSDIR" ] || mkdir -p "$LOGSDIR"

xsource "$HOMEDIR/variables-home.sh"

if [ ! -d "$JAVA_HOME" ]; then
    xerror JAVA_HOME "$JAVA_HOME" no existe o no es un directorio
    xinfo "JAVA_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
elif [ -n "$on_info_messages" ]; then
    xinfo "JAVA_HOME=$JAVA_HOME"
fi

xsource "$HOMEDIR/variables-conf.sh"

# shopt -s nocasematch
eeas=`echo $EEAS|tr '[:upper:]' '[:lower:]'`
unset EEASKEY
[ "$eeas" = "glassfish" ] && EEASKEY="GlassFish"
[ "$eeas" = "jboss"     ] && EEASKEY="JBoss"
# shopt -u nocasematch

if [ -z "$EEASKEY" ]; then
    EEASKEY="GlassFish"
    if [ -n "$on_warning_messages" ]; then
        xwarn EEAS "$EEAS" no tiene un valor valido. Si se necesita, se usara $EEASKEY
        xinfo EEAS se debe definir en "$HOMEDIR/variables-conf.sh"
    fi
elif [ -n "$on_info_messages" ]; then
    xinfo EEAS=$EEAS
fi

# shopt -s nocasematch
dbms=`echo $DBMS|tr '[:upper:]' '[:lower:]'`
unset DBMSKEY
[ "$dbms" = "oracle"     ] && DBMSKEY="Oracle"
[ "$dbms" = "postgresql" ] && DBMSKEY="PostgreSQL"
# shopt -u nocasematch

if [ -z "$DBMSKEY" ]; then
    DBMSKEY="PostgreSQL"
    if [ -n "$on_warning_messages" ]; then
        xwarn DBMS "$DBMS" no tiene un valor valido. Si se necesita, se usara $DBMSKEY
        xinfo DBMS se debe definir en "$HOMEDIR/variables-conf.sh"
    fi
elif [ -n "$on_info_messages" ]; then
    xinfo DBMS=$DBMS
fi

if [ "$EEASKEY" = "GlassFish" ]; then
    EEASDIR=glassfish
    xsource "$HOMEDIR/variables-glassfish.sh"
    if [ ! -d "$GLASSFISH_HOME" ]; then
        xerror GLASSFISH_HOME "$GLASSFISH_HOME" no existe o no es un directorio
        xinfo "GLASSFISH_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    elif [ -n "$on_info_messages" ]; then
        xinfo "GLASSFISH_HOME=$GLASSFISH_HOME"
    fi
    ASADMIN=$GLASSFISH_HOME/bin/asadmin
    if [ ! -x "$ASADMIN" ]; then
        xerror GLASSFISH_HOME/bin/asadmin no existe o no es un archivo ejecutable
        xinfo "GLASSFISH_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    fi
    if [ -n "$on_info_messages" ]; then
        xinfo ashost=$ashost
        xinfo asport=$asport
        xinfo asuser=$asuser
        xinfo aspass=********
    fi
    if [ ! -f "$aspassfile" ]; then
        xerror aspassfile "$aspassfile" no existe o no es un archivo
        xinfo "aspassfile" se debe definir en "$HOMEDIR/variables-glassfish.sh"
    else
        [ -n "$on_info_messages" ] && xinfo aspassfile=$aspassfile
        case "`uname`" in
            CYGWIN*) aspassfile=`cygpath --windows $aspassfile`
        esac        
    fi
    unset ascst1
#   ascst1="--user ${asuser} --passwordfile ${aspassfile}"
    ascst2="--host ${ashost} --port ${asport} ${ascst1}"
    if [ -n "$on_info_messages" ]; then
        xinfo domain=$domain
    fi
fi

if [ "$EEASKEY" = "JBoss" ]; then
    EEASDIR=jboss
    xsource "$HOMEDIR/variables-jboss.sh"
    if [ ! -d "$JBOSS_HOME" ]; then
        xerror JBOSS_HOME "$JBOSS_HOME" no existe o no es un directorio
        xinfo "JBOSS_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    elif [ -n "$on_info_messages" ]; then
        xinfo "JBOSS_HOME=$JBOSS_HOME"
    fi
    asport="${asport##*=}"
    offset="${offset##*=}"
    [ "$asport" -eq "$asport" ] 2>/dev/null || asport="9999"
    [ "$offset" -eq "$offset" ] 2>/dev/null || offset="0"
    asport=$(($asport + $offset))
    offset="-Djboss.socket.binding.port-offset=$offset"
    unset ascst1
#   ascst1="--user ${asuser} --password ${aspass}"
    ascst2="--connect controller=${ashost}:${asport} ${ascst1}"
    if [ -n "$on_info_messages" ]; then
        xinfo ashost=$ashost
        xinfo asport=$asport
        xinfo offset=$offset
    fi
fi

DISTDIR=$HOMEDIR/dist/$EEASDIR
if [ ! -d "$DISTDIR" ]; then
    xerror $DISTDIR no existe o no es un directorio
fi

if [ "$DBMSKEY" = "Oracle" ]; then
    DBMSDIR=oracle
    xsource "$HOMEDIR/variables-oracle.sh"
    if [ ! -d "$ORACLE_HOME" ]; then
        xerror ORACLE_HOME "$ORACLE_HOME" no existe o no es un directorio
        xinfo "ORACLE_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    elif [ -n "$on_info_messages" ]; then
        xinfo "ORACLE_HOME=$ORACLE_HOME"
    fi
    ORABINDIR=$ORACLE_HOME/bin
    if [ ! -d "$ORABINDIR" ]; then
        xerror ORACLE_HOME/bin no existe o no es un directorio
        xinfo "ORACLE_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    fi
fi

if [ "$DBMSKEY" = "PostgreSQL" ]; then
    DBMSDIR=postgresql
    xsource "$HOMEDIR/variables-postgresql.sh"
    if [ ! -d "$POSTGRESQL_HOME" ]; then
        xerror POSTGRESQL_HOME "$POSTGRESQL_HOME" no existe o no es un directorio
        xinfo "POSTGRESQL_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    elif [ -n "$on_info_messages" ]; then
        xinfo "POSTGRESQL_HOME=$POSTGRESQL_HOME"
    fi
    PGBINDIR=$POSTGRESQL_HOME/bin
    if [ ! -d "$PGBINDIR" ]; then
        xerror POSTGRESQL_HOME/bin no existe o no es un directorio
        xinfo "POSTGRESQL_HOME" se debe definir en "$HOMEDIR/variables-home.sh"
    fi
    unset dbserv
fi

if [ -n "$on_info_messages" ]; then
    xinfo dbhost=$dbhost
    xinfo dbport=$dbport
    [ -n "$dbserv" ] && xinfo dbserv=$dbserv
    xinfo dbuser=$dbuser
    xinfo dbpass=********
    xinfo dbname=$dbname
    xinfo dbcurl=$dbcurl
    xinfo driver=$driver
fi

SQLBACKDIR=$HOMEDIR/backup/$DBMSDIR
SQLHOMEDIR=$HOMEDIR/sql/$DBMSDIR
SQLLOGSDIR=$HOMEDIR/logs/$DBMSDIR
SQLDDLXDIR=$HOMEDIR/resources/database/ddl/$DBMSDIR
SQLSCRXDIR=$HOMEDIR/resources/database/scripts/$DBMSDIR

[ -d "$SQLBACKDIR" ] || mkdir -p "$SQLBACKDIR"
[ -d "$SQLHOMEDIR" ] || mkdir -p "$SQLHOMEDIR"
[ -d "$SQLLOGSDIR" ] || mkdir -p "$SQLLOGSDIR"

if [ ! -d "$SQLDDLXDIR" ]; then
    xerror $SQLDDLXDIR no existe o no es un directorio
fi

if [ ! -d "$SQLSCRXDIR" ]; then
    xerror $SQLSCRXDIR no existe o no es un directorio
fi

xs="$HOMEDIR/variables-server.sh"
[ -x "$xs" ] && source "$xs"

[ -n "$messages" ] && echo ""
unset xinfo xwarn xerror xsource
