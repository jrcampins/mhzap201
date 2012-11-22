@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

call %ASADMIN% %GFDOMAINCST2% start-domain %GFDOMAINNAME%
