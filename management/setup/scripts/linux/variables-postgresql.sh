#!/bin/bash
#
#   parametros para la conexion al servidor de base de datos PostgreSQL
#
dbhost="localhost"
dbport="5432"
dbuser="postgres"
dbpass="postgres"
dbname="MHZDB201"
dbcurl="jdbc:postgresql://${dbhost}:${dbport}/${dbname}"
driver="org.postgresql.Driver"
