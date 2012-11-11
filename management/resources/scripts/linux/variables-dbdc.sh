#!/bin/sh
#
#   parametros para la conexion al servidor de base de datos
#
dbhost="localhost"
dbport="5432"
dbuser="postgres"
dbpass="postgres"
dbpassfile="$HOMEDIR/pgadmin.password"
case "`uname`" in
    CYGWIN*) dbpassfile=`cygpath --windows $dbpassfile`
esac
dbname="MHZDB201"
dbcurl="jdbc:postgresql://${dbhost}:${dbport}/${dbname}"
driver="org.postgresql.Driver"
set LOWER_DBMSKEY=postgresql
set UPPER_DBMSKEY=POSTGRESQL
#
#   parametros para la conexion al servidor de aplicaciones
#
ashost="localhost"
asport="4848"
asuser="admin"
aspass="admin"
aspassfile="$HOMEDIR/asadmin.password"
case "`uname`" in
    CYGWIN*) aspassfile=`cygpath --windows $aspassfile`
esac
ascst1="--user ${asuser} --passwordfile ${aspassfile}"
ascst2="--host ${ashost} --port ${asport} ${ascst1}"
domain="domain1"
set LOWER_EEASKEY=glassfish
set UPPER_EEASKEY=GLASSFISH
