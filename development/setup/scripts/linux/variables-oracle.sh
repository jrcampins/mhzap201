#!/bin/sh
#
#   parametros para la conexion al servidor de base de datos Oracle
#
dbmsys="Oracle"
dbhost="localhost"
dbport="1521"
dbconnid="XE"
dbuser="MHZ"
dbpass="sesamo"
dbname="MHZDB201"
dbcurl="jdbc:oracle:thin:@%dbhost%:%dbport%:%dbconnid%"
driver="oracle.jdbc.OracleDriver"
