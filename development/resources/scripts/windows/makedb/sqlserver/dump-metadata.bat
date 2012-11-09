@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set EXE="%SSBINDIR%\pg_dump.exe"
set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_METADATA.sql"
set BAT="%~dp0dump-data-run-cmd"
set CMD=%EXE% -a -D -E LATIN1 -F p -i -v -t
if not exist "%~dp0logs" md "%~dp0logs"
set LOG="%~dp0logs\%~n0.log"

echo.
echo %CMD% %BAK%
echo.
pause
if exist "%BAK%" del "%BAK%"
echo.
echo %CMD%>%LOG%
echo %DATE% %TIME% %CD% %SSDATABASE%>>%LOG%
call "%~dpn0-run"
echo %DATE% %TIME% %CD% %SSDATABASE%>>%LOG%
echo.
echo dump: %xerrorlevel%

:EOJ
call %DIRBAT2%\eoj "%~f0"
