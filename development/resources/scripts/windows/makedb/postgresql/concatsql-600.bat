@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo -->%SQLDDLDIR%\%PGDATABASE%_PG_600.sql
REM if /i "%funciones%" == "n"  goto EOJ
call %DIRBAT1%\concatsql-for 600 sequences

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
