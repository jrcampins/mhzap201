@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set SQLPATH=
set packages=%SQLDDLXDIR%\custom\packages
if not exist "%packages%" (
    echo El directorio %packages% no existe
    goto:eof
)

echo "%~n0" ejecuta crea paquetes de utilidad en la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call:init-log
for /D %%d in (%packages%\*.*) do call xsqlpack %log% %%d
call:open-log
goto:eof

:init-log
set log="%SQLLOGSDIR%\%~nx0.log"
echo %~f0 > %log%
goto:eof

:open-log
echo.
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof
