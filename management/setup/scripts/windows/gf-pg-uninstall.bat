@echo off
cd /d "%~dp0"
echo "%~nx0" elimina los componentes de la aplicacion en el servidor de aplicaciones y en el servidor de base de datos
set siono=S
set pregunta="ejecutar %~n0 ? (S/N) [%siono%] "
set /p siono=%pregunta%
if /i not "%siono%" == "S" goto:eof
set xs="%~dp0resources\scripts\windows\setup\setup-gf-pg.bat"
if exist %xs% call %xs% uninstall
