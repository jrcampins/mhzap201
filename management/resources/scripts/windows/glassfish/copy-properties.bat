@echo off
cd /d "%~dp0"
echo "%~n0" copia los archivos de propiedades a la carpeta de configuracion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto EOJ

@echo.
set   SOURCE=%CRVLDIR%\resources\bootstrapping\%EEASDIR%\%DBMSDIR%\windows
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

goto DONE

:copyToTarget
if not exist %SOURCE% goto ERR1
if not exist %TARGET% md %TARGET%
copy %SOURCE%\*.* %TARGET%
@echo.
goto:eof

:ERR1
set ERRMSG=directorio %SOURCE% no existe
goto TELL

:ERR2
set ERRMSG=directorio %TARGET% no existe
goto TELL

:TELL
@echo.
@echo %ERRMSG%
@echo.

:DONE
:EOJ
call ..\eoj "%~f0"
goto:eof
