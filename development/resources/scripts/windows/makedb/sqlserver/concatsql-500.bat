@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

call:deleteFile %SQLDDLDIR%\%SSDATABASE%_SS_500.sql
if /i "%funciones%" == "n"  goto EOJ
call %DIRBAT1%\concatsql-for 500 triggers

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
