@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%SSDATABASE%_SS_999.sql
set  TARGET

call:deleteFile "%TARGET%"

type %SOURCE%\%SSDATABASE%_SS_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%

REM type %SOURCE%\%SSDATABASE%_SS_SEQUENCES_DROP.sql>>%TARGET%

call "%~dp0..\eoj" "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
