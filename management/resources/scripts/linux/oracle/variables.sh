#!/bin/bash
DBMS=oracle
xs=$(dirname "$BASH_SOURCE")/../variables.sh
[ -x "$xs" ] && source "$xs"
if [ -n "$variables" ]; then
    ORAHOST=$dbhost
    ORAPORT=$dbport
    ORAUSER=$dbuser
    ORAPASSWORD=$dbpass
    ORADATABASE=$dbname
fi
