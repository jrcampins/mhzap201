@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

echo "%~n0" desinstala y reinstala los componentes de la aplicacion de empresa en el servidor de aplicaciones y en el servidor de base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

cd /d "%MHZAP201_HOME%"
rem ----------------------------------------------------------------------------
if /i "%2" EQU "install" goto INSTALL
rem ----------------------------------------------------------------------------
:UNINSTALL
rem ----------------------------------------------------------------------------
set sd=%MHZAP201_HOME%\resources\scripts\windows\glassfish
rem ----------------------------------------------------------------------------
echo.
call %sd%\domain-start
echo.
call %sd%\undeploy
echo.
call %sd%\delete-jms
echo.
call %sd%\delete-jdbc
echo.
call %sd%\domain-stop
rem ----------------------------------------------------------------------------
set sd=%MHZAP201_HOME%\resources\scripts\windows\postgresql
rem ----------------------------------------------------------------------------
echo.
call %sd%\dump
rem ----------------------------------------------------------------------------
if /i "%2" NEQ "uninstall" goto UPGRADE
rem ----------------------------------------------------------------------------
echo.
call %sd%\dropdb
goto:eof
rem ----------------------------------------------------------------------------
:UPGRADE
echo.
call %sd%\upgradedb
goto REBUILD
rem ----------------------------------------------------------------------------
:INSTALL
rem ----------------------------------------------------------------------------
set sd=%MHZAP201_HOME%\resources\scripts\windows\postgresql
rem ----------------------------------------------------------------------------
echo.
call %sd%\createdb
echo.
call %sd%\restore
rem ----------------------------------------------------------------------------
:REBUILD
rem ----------------------------------------------------------------------------
set sd=%MHZAP201_HOME%\resources\scripts\windows\postgresql
rem ----------------------------------------------------------------------------
echo.
call %sd%\rebuild
echo.
call %sd%\vacuumdb
rem ----------------------------------------------------------------------------
set sd=%MHZAP201_HOME%\resources\scripts\windows\glassfish
rem ----------------------------------------------------------------------------
echo.
call %sd%\domain-start
echo.
call %sd%\server-config
echo.
call %sd%\create-jdbc
echo.
call %sd%\create-jms
echo.
call %sd%\deploy
echo.
call %sd%\copy-fonts
echo.
call %sd%\copy-images
echo.
call %sd%\copy-properties
goto:eof
