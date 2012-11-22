@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" copia las imagenes usadas por los informes a la carpeta de configuracion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

@echo.
set   SOURCE=%CRVLDIR%\resources\jasper\templates\resources
set   SOURCE
@echo.
set   TARGET="%GLASSFISH_HOME%\domains\%GFDOMAINNAME%\resources"
set   TARGET
@echo.
call:copyToTarget
set   TARGET="%GLASSFISH_HOME%\domains\%GFDOMAINNAME%\config\resources"
set   TARGET
@echo.
call:copyToTarget

call ..\eoj "%~f0"
goto:eof

:copyToTarget
if not exist %SOURCE% goto ERR1
if not exist %TARGET% md %TARGET%
copy %SOURCE%\*.* %TARGET%
@echo.
goto:eof

:ERR1
set ERRMSG=directorio %SOURCE% no existe
@echo.
@echo %ERRMSG%
@echo.
goto:eof
