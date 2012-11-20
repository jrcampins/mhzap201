#!/bin/sh
#
#   parametros para la conexion al servidor de aplicaciones GlassFish
#
if [ "$EEASKEY" = "GlassFish" ]; then
    ashost="localhost"
    asport="4848"
    asuser="admin"
    aspass="admin"
    aspassfile="$HOMEDIR/asadmin.password"
    ascst1="--user ${asuser} --passwordfile ${aspassfile}"
    ascst2="--host ${ashost} --port ${asport} ${ascst1}"
    ascst2="--host ${ashost} --port ${asport}"
    domain="domain1"
fi
#
#   parametros para la conexion al servidor de aplicaciones JBoss
#
if [ "$EEASKEY" = "JBoss" ]; then
    jbhost="localhost"
    jbport="9999"
    jbcst2="--host ${jbhost} --port ${jbport}"
    offset="-Djboss.socket.binding.port-offset=0"
fi
#
#   parametros para la conexion al servidor de base de datos Oracle
#
if [ "$DBMSKEY" = "Oracle" ]; then
     dbmsys="Oracle"
     dbhost="localhost"
     dbport="1521"
     dbconnid="XE"
     dbuser="MHZ"
     dbpass="sesamo"
     dbcurl="jdbc:oracle:thin:@%dbhost%:%dbport%:%dbconnid%"
     driver="oracle.jdbc.OracleDriver"
fi
#
#   parametros para la conexion al servidor de base de datos PostgreSQL
#
if [ "$DBMSKEY" = "PostgreSQL" ]; then
    dbmsys="PostgreSQL"
    dbhost="localhost"
    dbport="5432"
    dbuser="postgres"
    dbpass="postgres"
    dbname="MHZDB201"
    dbcurl="jdbc:postgresql://${dbhost}:${dbport}/${dbname}"
    driver="org.postgresql.Driver"
fi
