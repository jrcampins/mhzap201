@echo off
cd /d "%~dp0"

set variables=
call variables "%~f0"
if not defined variables goto:eof

set log="%~dp0logs\%~n0.log"
if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%log%
    if exist %log% (del %log%) else (if not exist "%~dp0logs" md "%~dp0logs")
)
echo "%~f0" >> %SQLPLUS_SPOOL%

set /a xerrorlevel=0
call concatsql
if not %xerrorlevel% == 0 (pause & goto:eof)

pushd "%project_source_dir%\management\resources\scripts\windows\%dbms%"
call makedb
echo rebuild
popd

if /i %SQLPLUS_SPOOL% == "%~dp0logs\%~n0.log" (echo.) else (goto:eof)

call "%~dp0..\setsiono" desea ver el log de la ejecucion (%SQLPLUS_SPOOL%)
if /i "%siono%" NEQ "S" goto:eof

start /d %SystemRoot% notepad %SQLPLUS_SPOOL%
rem call "%~dp0..\eoj.bat" "%~f0"
