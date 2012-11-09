@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo -->%SQLDDLDIR%\%O9DATABASE%_O9_600.sql
REM if /i "%funciones%" == "n"  goto EOJ
call %DIRBAT1%\concatsql-for 600 sequences

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof
