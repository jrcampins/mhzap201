#!/bin/sh
unset variables
pushd $(dirname "$BASH_SOURCE") > /dev/null
while true
do
    currdir=$(pwd)
    if [ -f "HOME" ]; then
        MHZAP201_HOME=$currdir
        break
    fi
    cd ..
    if [ "$currdir" = "$(pwd)" ]; then
        MHZAP201_HOME=${currdir}mhzap201/home
        break
    fi
done
popd > /dev/null
xs=$MHZAP201_HOME/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    export PGHOST=$dbhost
    export PGPORT=$dbport
    export PGUSER=$dbuser
    export PGPASSWORD=$dbpass
    export PGDATABASE=$dbname
    PGBINDIR=$POSTGRESQL_HOME/bin
    BACKUPDIR=$HOMEDIR/backup
    SQLDDLDIR=$CRVLDIR/resources/database/ddl
    [ -d "$BACKUPDIR"  ] || mkdir -p "$BACKUPDIR"
    [ -d "$PGBINDIR"   ] || . $scriptpath/unset-variables.sh el directorio "$PGBINDIR"  no existe
    [ -d "$BACKUPDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$BACKUPDIR" no existe
    [ -d "$SQLDDLDIR"  ] || . $scriptpath/unset-variables.sh el directorio "$SQLDDLDIR" no existe
fi
