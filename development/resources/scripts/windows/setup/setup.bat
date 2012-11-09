@echo off
cd /d "%~dp0"

rem
rem development\scripts\windows\setup\setup.bat
rem

set sd=%MHZAP201_VSWS%\management\resources\scripts\windows\glassfish
cd %sd%
call ..\variables
if not defined variables goto:eof
echo "%~n0" desinstala y reinstala los componentes de la aplicacion de empresa en el servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
cd /d "%MHZAP201_HOME%"

:UNINSTALL
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

:INSTALL
echo.
call %sd%\domain-start
echo.
call %sd%\server-config
echo.
call %sd%\create-jdbc
echo.
call %sd%\create-jms
echo.
call %sd%\copy-imagenes
echo.
call %sd%\copy-fonts
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
