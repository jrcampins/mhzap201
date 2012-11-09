@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%SSDATABASE%_SS_999.sql
set  TARGET

call:deleteFile "%TARGET%"

type %SOURCE%\%SSDATABASE%_SS_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%

REM type %SOURCE%\%SSDATABASE%_SS_SEQUENCES_DROP.sql>>%TARGET%

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
