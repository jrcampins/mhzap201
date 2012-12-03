#!/bin/bash
DBMS=postgresql
xs=$(dirname "$BASH_SOURCE")/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    export PGHOST=$dbhost
    export PGPORT=$dbport
    export PGUSER=$dbuser
    export PGPASSWORD=$dbpass
    export PGDATABASE=$dbname
fi
