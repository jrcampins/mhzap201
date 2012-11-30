@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

if /i "%datos%" == "n"  goto:eof
call "%~dp0concatsql-for" 200 data
call "%~dp0..\eoj" "%~f0"
