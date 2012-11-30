@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call %ASADMIN% %ascst2% stop-domain %domain%
