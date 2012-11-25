@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" ejecuta los scripts que se encuentran en oracle\custom\functions
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set log="%~dp0logs\%~n0.log"
if defined SQLPLUS_SPOOL (
    set customize_log=
) else (
    set customize_log=%log%
    set SQLPLUS_SPOOL=%log%
    if exist %log% (del %log%) else (if not exist "%~dp0logs" md "%~dp0logs")
)
echo "%~f0" >> %SQLPLUS_SPOOL%

set packages=%SQLDDLDIR%\oracle\custom\packages
if exist "%packages%" (
    for /D %%d in (%packages%\*.*) do call xsqlpack %%d
) else (
    echo %packages% is not a valid script folder
)

if not defined customize_log goto:eof

call "%~dp0..\setsiono" desea ver el log de la ejecucion (%SQLPLUS_SPOOL%)
if /i "%siono%" NEQ "S" goto:eof

start /d %SystemRoot% notepad %SQLPLUS_SPOOL%
rem call "%~dp0..\eoj.bat" "%~f0"
