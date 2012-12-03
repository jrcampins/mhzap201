#!/bin/bash
#
#   parametros para la conexion al servidor de base de datos Oracle
#
dbhost="localhost"
dbport="1521"
dbserv="XE"
dbuser="MHZ"
dbpass="sesamo"
dbname="MHZDB201"
dbcurl="jdbc:oracle:thin:@$dbhost:$dbport:$dbserv"
driver="oracle.jdbc.OracleDriver"
