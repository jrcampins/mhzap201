@echo off
rem on_properly_defined_variables=echo
set DBMS=sqlserver
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
set SSHOST=%dbhost%
set SSPORT=%dbport%
set SSUSER=%dbuser%
set SSPASS=%dbpass%
set SSDATABASE=%dbname%
call "%~dp0..\variables-date-time"
if defined on_properly_defined_variables pause
