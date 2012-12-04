@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" despliega la aplicacion de empresa
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set ear=%DISTDIR%\%lower_case_project%.ear
echo.
echo %ASADMIN% %ascst2% deploy %ear%
call %ASADMIN% %ascst2% deploy %ear%
echo.
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
echo.
call "%~dp0..\eoj" "%~f0"
