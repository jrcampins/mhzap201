@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set packages=%SQLDDLDIR%\oracle\custom\packages
if not exist "%packages%" (
    echo El directorio %packages% no existe
    goto:eof
)

echo "%~n0" ejecuta los scripts que se encuentran en oracle\custom\functions
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call:init-log
for /D %%d in (%packages%\*.*) do call xsqlpack %log% %%d
call:open-log
goto:eof

:init-log
set log="%~dp0logs\%~nx0.log"
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
