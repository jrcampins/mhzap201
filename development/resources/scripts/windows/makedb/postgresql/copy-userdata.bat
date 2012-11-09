@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set NOMBRE="%~n1"
set SOURCE="%~f1"
set XPG200=%PGDATABASE%_PG_200_USERDATA
if %NOMBRE% == "" set NOMBRE="%XPG200%"
if %SOURCE% == "" set SOURCE="%BACKUPDIR%\%XPG200%.sql"
if not exist %SOURCE% goto EOJ
set TARGET="%SQLDDLDIR%\%XPG200%.sql"
echo.
dir %SOURCE%
echo.
dir %TARGET%
echo.
echo copy %SOURCE% to "%SQLDDLDIR%"
echo.
copy /-y %SOURCE% %TARGET%

:EOJ
dir %SQLDDLDIR%
call %DIRBAT2%\eoj "%~f0"
