@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo -->%SQLDDLDIR%\%PGDATABASE%_PG_500.sql
REM if /i "%funciones%" == "n"  goto EOJ

if /i "%funciones%" == "n" (
    call %DIRBAT1%\concatsql-key 500 triggers
) else (
    call %DIRBAT1%\concatsql-for 500 triggers
)

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
