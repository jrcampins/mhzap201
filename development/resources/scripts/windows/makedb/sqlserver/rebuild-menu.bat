@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

if not defined PLOG call:setPlog
if not defined PSQL set PSQL="%~dpn0.psql"
if not exist %PSQL% call %DIRBAT2%\variables-reset el archivo %PSQL% no existe
if not defined variables goto EOJ

cd /d "%MHZAP201_VSWS%\management\resources\scripts\windows\%dbms%"
set PSQL="%~dpn0.psql"
call psql %PSQL%
cd /d "%~dp0"

:EOJ
call %DIRBAT2%\eoj "%~f0"
goto:eof

:setPlog
if not exist "%~dp0logs" md "%~dp0logs"
set PLOG="%~dp0logs\%~n0.log"
if exist %PLOG% del %PLOG%
goto:eof
