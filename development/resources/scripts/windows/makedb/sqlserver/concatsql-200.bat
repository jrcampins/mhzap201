@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200.sql"
if exist %BAK% del %BAK%
set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_METADATA.sql"
if exist %BAK% del %BAK%
set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_USERDATA.sql"
if exist %BAK% del %BAK%

if /i "%datos%" == "n"  goto:eof
call "%~dp0concatsql-for" 200 data
call "%~dp0..\eoj" "%~f0"
goto:eof

:never-called
call:init-log
set BAT="%~dpn0-run-cmd"
set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_METADATA.sql"
type "%~dp0..\delete-metadata.sql">%BAK%
call "%~dp0..\dump-metadata-run"
set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_USERDATA.sql"
call "%~dp0..\dump-userdata-run"
call:open-log
goto:eof

:init-log
set log="%homedir%\logs\%~nx0.log"
if exist %log% (del %log%) else (call:make-dir %log%)
echo %~f0 >> %log%
goto:eof

:make-dir
if not exist "%~dp1" md "%~dp1"
goto:eof

:open-log
echo.
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof
