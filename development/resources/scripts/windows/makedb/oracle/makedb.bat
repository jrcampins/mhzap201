@echo off
cd /d "%~dp0"

set variables=
call variables "%~f0"
if not defined variables goto:eof

set log="%~dp0logs\%~n0.log"
if defined SQLPLUS_SPOOL (
    set makedb_log=
) else (
    set makedb_log=%log%
    set SQLPLUS_SPOOL=%log%
    if exist %log% (del %log%) else (if not exist "%~dp0logs" md "%~dp0logs")
)
echo "%~f0" >> %SQLPLUS_SPOOL%

set /a xerrorlevel=0
call concatsql
if %xerrorlevel% GEQ 1 goto EOJ

pushd "%sourcedir%\management\resources\scripts\windows\%dbms%"
call makedb
echo rebuild
popd

:EOJ
if not defined makedb_log goto:eof

call "%~dp0..\setsiono" desea ver el log de la ejecucion (%SQLPLUS_SPOOL%)
if /i "%siono%" NEQ "S" goto:eof

start /d %SystemRoot% notepad %SQLPLUS_SPOOL%
rem call "%~dp0..\eoj.bat" "%~f0"
