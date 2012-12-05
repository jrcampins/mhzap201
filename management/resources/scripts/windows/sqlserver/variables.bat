@echo off
rem set on_info_messages=echo
rem set on_warning_messages=echo
set DBMS=sqlserver
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
set SSHOST=%dbhost%
set SSPORT=%dbport%
set SSUSER=%dbuser%
set SSPASS=%dbpass%
set SSDATABASE=%dbname%
call "%~dp0..\variables-date-time"
if not defined variables (pause & echo. & goto:eof)
if defined on_info_messages (pause & echo.)
