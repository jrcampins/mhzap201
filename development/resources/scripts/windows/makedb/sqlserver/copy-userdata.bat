@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set NOMBRE="%~n1"
set SOURCE="%~f1"
set XSS200=%SSDATABASE%_SS_200_USERDATA

if %NOMBRE% == "" set NOMBRE="%XSS200%"
if %SOURCE% == "" set SOURCE="%BACKUPDIR%\%XSS200%.sql"
if not exist %SOURCE% goto EOJ

set TARGET="%SQLDDLDIR%\%XSS200%.sql"
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
