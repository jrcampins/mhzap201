@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

:undeploy
call ear-undeploy

:stop
echo.
call standalone-stop

:delete-log
echo.
call ..\setsiono eliminar los logs?
if /i "%siono%" NEQ "S" goto start
del %JBOSS_HOME%\standalone\log\*.log /q
echo.

:delete-tmp
echo.
call ..\setsiono eliminar los archivos temporales?
if /i "%siono%" NEQ "S" goto start
rd %JBOSS_HOME%\standalone\tmp /s /q
echo.

:start
echo.
call standalone-start
