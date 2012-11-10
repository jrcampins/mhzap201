@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%O9DATABASE%_O9_999.sql
set  TARGET

if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%O9DATABASE%_O9_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%O9DATABASE%_O9_VIEWS_DROP.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%O9DATABASE%_O9_SEQUENCES_DROP.sql>>%TARGET%
echo.>>%TARGET%

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof