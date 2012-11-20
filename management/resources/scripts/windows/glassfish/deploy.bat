@echo off
cd /d "%~dp0"
echo "%~n0" implementa la aplicacion de empresa en el servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto EOJ
if not defined MHZAP201_DIST set MHZAP201_DIST=%CRVLDIR%
set ear=%MHZAP201_DIST%\%PROJKEY%.ear
echo.
echo %ASADMIN% %GFDOMAINCST2% deploy %ear%
call %ASADMIN% %GFDOMAINCST2% deploy %ear%
echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.

:EOJ
call ..\eoj "%~f0"
goto:eof
