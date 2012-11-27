@echo off
cd /d "%~dp0"

if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

set /a xerrorlevel=0
call concatsql
if not %xerrorlevel% == 0 (pause & goto:eof)

call:init-sqlplus-spool
cd /d "%~dp0"
pushd "%project_source_dir%\management\resources\scripts\windows\%dbms%"
call makedb
echo rebuild
popd
call:open-sqlplus-spool
goto:eof

:init-sqlplus-spool
set dir="%~dp0logs"
set log="%~dp0logs\%~nx0.log"
if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%log%
    if exist %log% (del %log%) else (if not exist %dir% md %dir%)
)
echo %~f0 >> %SQLPLUS_SPOOL%
goto:eof

:open-sqlplus-spool
set log="%~dp0logs\%~nx0.log"
if /i %SQLPLUS_SPOOL% == %log% (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof
