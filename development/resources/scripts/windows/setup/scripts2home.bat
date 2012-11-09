@echo off
cd /d "%~dp0"
set wd=%MHZAP201_HOME%
set xs="%wd%\resources\scripts\windows\setup\%~n0.bat"
if exist %xs% call %xs% %wd% scripts2home
if exist %xs% goto:eof
echo %xs% no existe
pause
