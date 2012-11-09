@echo off
if not defined MHZAP201_VSWS goto ERR0

@echo.
set   SOURCE=%MHZAP201_VSWS%\management\setup\ireport\3.0.0\config
set   SOURCE
@echo.
set   TARGET=%USERPROFILE%\.ireport
set   TARGET
@echo.

if not exist "%SOURCE%\." goto ERR1
if not exist "%TARGET%\." goto ERR2
xcopy "%SOURCE%\*.xml" "%TARGET%" /S
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
