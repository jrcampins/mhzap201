@echo off
cd /d "%~dp0"
if not defined MHZAP201_VSWS goto ERR0

@echo.
set   SOURCE=%CD%\config
set   SOURCE
@echo.
set   TARGET=N:\userdir\config
set   TARGET
@echo.

if not exist "%SOURCE%\." goto ERR1
if not exist "%TARGET%\." goto ERR2
call xcopy "%SOURCE%\*.java" "%TARGET%" /S
call xcopy "%SOURCE%\*.jsp*" "%TARGET%" /S
echo xcopy "%SOURCE%\*.properties" "%TARGET%" /S
call xcopy "%SOURCE%\*.txt" "%TARGET%" /S
echo xcopy "%SOURCE%\*.xml" "%TARGET%" /S
goto DONE
:ERR0
set ERRMSG=variable de entorno MHZAP201_VSWS no definida (MHZAP201_VSWS corresponde a la ruta de su directorio de trabajo de CVS)
goto TELL
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
pause
exit
