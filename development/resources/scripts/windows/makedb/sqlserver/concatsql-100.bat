@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%SSDATABASE%_SS_100.sql
set  TARGET

call:deleteFile "%TARGET%"

REM type %SOURCE%\%SSDATABASE%_SS_SEQUENCES.sql>>%TARGET%
REM echo.>>%TARGET%

type %SOURCE%\%SSDATABASE%_SS_TABLES.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%SSDATABASE%_SS_DEFAULTS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%

call "%~dp0..\eoj" "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
