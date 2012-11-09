@echo off
cd /d "%~dp0"
set xs="%~f1\resources\scripts\windows\variables-home.bat"
set xt="%MHZAP201_HOME%\variables-home.bat"
if exist %xt% set xs=%xt%
if exist %xs% call %xs%
if not exist "%MHZAP201_HOME%"   echo La variable de entorno MHZAP201_HOME no esta correctamente definida
if not exist "%GLASSFISH_HOME%"  echo La variable de entorno GLASSFISH_HOME no esta correctamente definida
if not exist "%POSTGRESQL_HOME%" echo La variable de entorno POSTGRESQL_HOME no esta correctamente definida
if not exist "%MHZAP201_HOME%"   goto DONE
if not exist "%GLASSFISH_HOME%"  goto DONE
if not exist "%POSTGRESQL_HOME%" goto DONE
echo "%~n0" desinstala y reinstala los componentes de la aplicacion de empresa en el servidor de aplicaciones y en el servidor de base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
cd /d "%MHZAP201_HOME%"
rem if not exist "%~f1" goto ERR1
if exist "%~f1" cd /d "%~f1"
set wd=%CD%
rem --------------------------------------------------------------------------------------------------------------------------------------------
if /i "%2" EQU "install" goto INSTALL
rem --------------------------------------------------------------------------------------------------------------------------------------------
:UNINSTALL
rem --------------------------------------------------------------------------------------------------------------------------------------------
set sd=%wd%\resources\scripts\windows\glassfish
rem --------------------------------------------------------------------------------------------------------------------------------------------
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
rem --------------------------------------------------------------------------------------------------------------------------------------------
set sd=%wd%\resources\scripts\windows\postgresql
rem --------------------------------------------------------------------------------------------------------------------------------------------
echo.
call %sd%\dump
rem --------------------------------------------------------------------------------------------------------------------------------------------
if /i "%2" NEQ "uninstall" goto UPGRADE
rem --------------------------------------------------------------------------------------------------------------------------------------------
echo.
call %sd%\dropdb
goto EOJ
rem --------------------------------------------------------------------------------------------------------------------------------------------
:UPGRADE
echo.
call %sd%\upgradedb
goto REBUILD
rem --------------------------------------------------------------------------------------------------------------------------------------------
:INSTALL
rem --------------------------------------------------------------------------------------------------------------------------------------------
set sd=%wd%\resources\scripts\windows\postgresql
rem --------------------------------------------------------------------------------------------------------------------------------------------
echo.
call %sd%\createdb
echo.
call %sd%\restore
rem --------------------------------------------------------------------------------------------------------------------------------------------
:REBUILD
rem --------------------------------------------------------------------------------------------------------------------------------------------
set sd=%wd%\resources\scripts\windows\postgresql
rem --------------------------------------------------------------------------------------------------------------------------------------------
echo.
call %sd%\rebuild
echo.
call %sd%\vacuumdb
rem --------------------------------------------------------------------------------------------------------------------------------------------
set sd=%wd%\resources\scripts\windows\glassfish
rem --------------------------------------------------------------------------------------------------------------------------------------------
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
goto EOJ
:ERR1
set ERRMSG=directorio "%~f1" no existe
goto TELL
:TELL
@echo.
@echo %ERRMSG%
@echo.
:DONE
pause
:EOJ
echo.
