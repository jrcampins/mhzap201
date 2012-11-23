@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" implementa la aplicacion de empresa en el servidor de aplicaciones
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set ear=%DISTDIR%\%PROJKEY%.ear
echo.
echo %ASADMIN% %GFDOMAINCST2% deploy %ear%
call %ASADMIN% %GFDOMAINCST2% deploy %ear%
echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.
call "%~dp0..\eoj.bat" "%~f0"
