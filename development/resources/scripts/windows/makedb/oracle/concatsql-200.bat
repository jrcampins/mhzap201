@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set BAK="%SQLDDLDIR%\%O9DATABASE%_O9_200.sql"
if exist %BAK% del %BAK%
set BAK="%SQLDDLDIR%\%O9DATABASE%_O9_200_METADATA.sql"
if exist %BAK% del %BAK%
set BAK="%SQLDDLDIR%\%O9DATABASE%_O9_200_USERDATA.sql"
if exist %BAK% del %BAK%

if /i "%datos%" == "n"  goto:eof
call "%~dp0concatsql-for" 200 data
call "%~dp0..\eoj" "%~f0"
goto:eof

:never-called
if not exist "%~dp0logs" md "%~dp0logs"
set log="%~dp0logs\%~nx0.log"
set BAT="%~dpn0-run-cmd"
set BAK="%SQLDDLDIR%\%O9DATABASE%_O9_200_METADATA.sql"
type "%~dp0..\delete-metadata.sql">%BAK%
call "%~dp0..\dump-metadata-run"
set BAK="%SQLDDLDIR%\%O9DATABASE%_O9_200_USERDATA.sql"
call "%~dp0..\dump-userdata-run"
if defined keep_200_log goto:eof
if not defined log goto:eof
if exist %log% del %log%
goto:eof
