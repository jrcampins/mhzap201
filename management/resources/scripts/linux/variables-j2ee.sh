#!/bin/sh
[ -d "$HOMEDIR" ] || echo La variable de entorno HOMEDIR no esta correctamente definida
[ -d "$CRVLDIR" ] || echo La variable de entorno CRVLDIR no esta correctamente definida
if [ -d "$HOMEDIR" -a  -d "$CRVLDIR" ]; then
    [ -n "$driver" ] && MHZAP201_JDBC_DRIVER="$driver"
    [ -n "$dbcurl" ] && MHZAP201_JDBC_URL="$dbcurl"
    [ -n "$dbuser" ] && MHZAP201_JDBC_USER="$dbuser"
    [ -n "$dbpass" ] && MHZAP201_JDBC_PASSWORD="$dbpass"
    [ -n "$driver" ] || echo La variable de entorno MHZAP201_JDBC_DRIVER no esta correctamente definida
    [ -n "$dbcurl" ] || echo La variable de entorno MHZAP201_JDBC_URL no esta correctamente definida
    [ -n "$dbuser" ] || echo La variable de entorno MHZAP201_JDBC_USER no esta correctamente definida
    [ -n "$dbpass" ] || echo La variable de entorno MHZAP201_JDBC_PASSWORD no esta correctamente definida
    resdir="$CRVLDIR/resources"
    [ -d "$resdir" ] && MHZAP201_RESOURCES_DIR="$resdir"
    [ -d "$resdir" ] || echo La variable de entorno MHZAP201_RESOURCES_DIR no esta correctamente definida
fi
