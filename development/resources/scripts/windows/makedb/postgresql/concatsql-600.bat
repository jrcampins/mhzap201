@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call "%~dp0concatsql-for" 600 sequences
call "%~dp0..\eoj" "%~f0"
