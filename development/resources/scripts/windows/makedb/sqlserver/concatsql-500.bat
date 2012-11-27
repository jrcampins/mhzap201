@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

call:deleteFile %SQLDDLDIR%\%SSDATABASE%_SS_500.sql
if /i "%funciones%" == "n"  goto:eof
call "%~dp0concatsql-for" 500 triggers

call "%~dp0..\eoj" "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
