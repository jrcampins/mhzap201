#!/bin/sh
[ -d "$HOMEDIR" ] && MHZAP201_HOME_DIR="$HOMEDIR"
[ -n "$driver"  ] && MHZAP201_JDBC_DRIVER="$driver"
[ -n "$dbcurl"  ] && MHZAP201_JDBC_URL="$dbcurl"
[ -n "$dbuser"  ] && MHZAP201_JDBC_USER="$dbuser"
[ -n "$dbpass"  ] && MHZAP201_JDBC_PASSWORD="$dbpass"
[ -d "$HOMEDIR" ] || echo La variable de entorno MHZAP201_HOME_DIR no esta correctamente definida
[ -n "$driver"  ] || echo La variable de entorno MHZAP201_JDBC_DRIVER no esta correctamente definida
[ -n "$dbcurl"  ] || echo La variable de entorno MHZAP201_JDBC_URL no esta correctamente definida
[ -n "$dbuser"  ] || echo La variable de entorno MHZAP201_JDBC_USER no esta correctamente definida
[ -n "$dbpass"  ] || echo La variable de entorno MHZAP201_JDBC_PASSWORD no esta correctamente definida
