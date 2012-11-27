@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" ejecuta los scripts que se encuentran en oracle\custom\functions
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call:init-sqlplus-spool
set packages=%SQLDDLDIR%\oracle\custom\packages
if exist "%packages%" (
    for /D %%d in (%packages%\*.*) do call xsqlpack %%d
) else (
    echo El directorio %packages% no existe
)
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
