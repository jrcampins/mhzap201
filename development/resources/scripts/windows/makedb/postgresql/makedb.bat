@echo off
cd /d "%~dp0"

if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

:ask
set nn=10
set CRVL=%nn%%aammdd%
set /p CRVL="version del esquema de la base de datos (aaaammddhh) [%CRVL%] "
if not defined CRVL goto ask
set CRVL="%CRVL%"

set /a xerrorlevel=0
call concatsql
if not %xerrorlevel% == 0 (pause & goto:eof)

call:init-psql-spool

cd /d "%~dp0"
pushd "%project_source_dir%\management\resources\scripts\windows\%dbms%"

call dropdb
if not %xerrorlevel% == 0 (pause & goto:eof)

call createdb
if not %xerrorlevel% == 0 (pause & goto:eof)

call makedb
if not %xerrorlevel% == 0 (pause & goto:eof)

call rebuild
if not %xerrorlevel% == 0 (pause & goto:eof)

call vacuumdb
if not %xerrorlevel% == 0 (pause & goto:eof)

call dump
if not %xerrorlevel% == 0 (pause & goto:eof)

popd

call rebuild-menu
if not %xerrorlevel% == 0 (pause & goto:eof)

call:open-psql-spool
goto:eof

:init-psql-spool
set dir="%~dp0logs"
set log="%~dp0logs\%~nx0.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% (del %log%) else (if not exist %dir% md %dir%)
)
echo %~f0 >> %PLOG%
goto:eof

:open-psql-spool
set log="%~dp0logs\%~nx0.log"
if /i %PLOG% == %log% (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof
