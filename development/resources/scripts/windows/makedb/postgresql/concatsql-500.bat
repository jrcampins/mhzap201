@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo -->%SQLDDLDIR%\%PGDATABASE%_PG_500.sql

if /i "%funciones%" == "n" (
    call "%~dp0concatsql-key" 500 triggers
) else (
    call "%~dp0concatsql-for" 500 triggers
)

call "%~dp0..\eoj" "%~f0"
