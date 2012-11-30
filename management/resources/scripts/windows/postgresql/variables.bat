@echo off
rem on_properly_defined_variables=echo
set DBMS=postgresql
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof
set PGHOST=%dbhost%
set PGPORT=%dbport%
set PGUSER=%dbuser%
set PGPASSWORD=%dbpass%
set PGDATABASE=%dbname%
call "%~dp0..\variables-date-time"
if defined on_properly_defined_variables pause
