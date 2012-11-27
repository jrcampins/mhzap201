@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call:deleteFile %SQLDDLDIR%\%SSDATABASE%_SS_600.sql
if /i "%funciones%" == "n"  goto:eof
REM call "%~dp0concatsql-for" 600 sequences

call "%~dp0..\eoj" "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
