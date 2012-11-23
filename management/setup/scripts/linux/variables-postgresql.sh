#!/bin/sh
#
#   parametros para la conexion al servidor de base de datos PostgreSQL
#
dbmsys="PostgreSQL"
dbhost="localhost"
dbport="5432"
dbconnid="MHZDB201"
dbuser="postgres"
dbpass="postgres"
dbname="MHZDB201"
dbcurl="jdbc:postgresql://${dbhost}:${dbport}/${dbname}"
driver="org.postgresql.Driver"
