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

call:init-log "%~f1" "%~dp0logs\%~nx0.log"
if /i "%~x1" == ".log" shift /1
for /D %%d in (%packages%\*.*) do call xsqlpack %log% %%d
call:open-log
goto:eof

:init-log
if /i "%~x1" == ".log" (
    set log="%~f1"
    if not exist "%~dp1" md "%~dp1"
) else (
    set log="%~f2"
    if exist "%~f2" (del "%~f2") else (if not exist "%~dp2" md "%~dp2")
)
echo %~f0 >> %log%
goto:eof

:open-log
if /i %log% == "%~dp0logs\%~nx0.log" (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof
