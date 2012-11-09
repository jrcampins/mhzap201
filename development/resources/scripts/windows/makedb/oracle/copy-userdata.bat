@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set NOMBRE="%~n1"
set SOURCE="%~f1"
set XO9200=%O9DATABASE%_O9_200_USERDATA
if %NOMBRE% == "" set NOMBRE="%XO9200%"
if %SOURCE% == "" set SOURCE="%BACKUPDIR%\%XO9200%.sql"
if not exist %SOURCE% goto EOJ
set TARGET="%SQLDDLDIR%\%XO9200%.sql"
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
