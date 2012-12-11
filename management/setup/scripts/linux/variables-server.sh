#!/bin/bash
[ -d "$HOMEDIR" ] && ${UPPER_CASE_PROJECT}_HOME_DIR="$HOMEDIR"
[ -n "$driver"  ] && ${UPPER_CASE_PROJECT}_JDBC_DRIVER="$driver"
[ -n "$dbcurl"  ] && ${UPPER_CASE_PROJECT}_JDBC_URL="$dbcurl"
[ -n "$dbuser"  ] && ${UPPER_CASE_PROJECT}_JDBC_USER="$dbuser"
[ -n "$dbpass"  ] && ${UPPER_CASE_PROJECT}_JDBC_PASSWORD="$dbpass"
