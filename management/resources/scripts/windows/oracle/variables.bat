@echo off
rem on_properly_defined_variables=echo
set DBMS=oracle
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
set ORAHOST=%dbhost%
set ORAPORT=%dbport%
set ORAUSER=%dbuser%
set ORAPASSWORD=%dbpass%
set ORADATABASE=%dbname%
call "%~dp0..\variables-date-time"
if not defined variables (pause & echo. & goto:eof)
if defined on_properly_defined_variables (pause & echo.)
