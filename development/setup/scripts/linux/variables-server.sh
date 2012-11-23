#!/bin/sh
[ -d "$HOMEDIR" ] && MHZAP201_HOME_DIR="$HOMEDIR"
[ -n "$driver"  ] && MHZAP201_JDBC_DRIVER="$driver"
[ -n "$dbcurl"  ] && MHZAP201_JDBC_URL="$dbcurl"
[ -n "$dbuser"  ] && MHZAP201_JDBC_USER="$dbuser"
[ -n "$dbpass"  ] && MHZAP201_JDBC_PASSWORD="$dbpass"
