@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call "%~dp0..\concatsql-for" 700 miscellaneous
call "%~dp0..\eoj" "%~f0"
