@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%PGDATABASE%_PG_999.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"
type %SOURCE%\%PGDATABASE%_PG_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_SEQUENCES_DROP.sql>>%TARGET%

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
