#!/bin/sh
#
#   parametros para la conexion al servidor de base de datos Oracle
#
dbcoid="XE"
dbhost="localhost"
dbport="1521"
dbuser="MHZ"
dbpass="sesamo"
dbname="MHZDB201"
dbcurl="jdbc:oracle:thin:@$dbhost:$dbport:$dbcoid"
driver="oracle.jdbc.OracleDriver"
