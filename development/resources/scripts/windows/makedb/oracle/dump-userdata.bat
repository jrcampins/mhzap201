@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

:ask
set /p CRVL="version actualmente instalada "
rem if not defined CRVL goto ask

call:setexe %O9BINDIR% dump.exe
set BAK="%SQLDDLDIR%\%O9DATABASE%_O9_200_USERDATA.sql"
set BAT="%~dp0dump-data-run-cmd"
set CMD=%EXE% -a -D -E UTF8 -F p -i -v -t
if not exist "%~dp0logs" md "%~dp0logs"
set LOG="%~dp0logs\%~n0.log"

if defined CRVL set O9DATABASE=%O9DATABASE%_%CRVL%
echo.
echo %CMD% %BAK%
echo.
pause
if exist "%BAK%" del "%BAK%"
echo.
echo %CMD%>%LOG%
echo %DATE% %TIME% %CD% %O9DATABASE%>>%LOG%
call "%~dpn0-run"
echo %DATE% %TIME% %CD% %O9DATABASE%>>%LOG%
echo.
echo dump: %xerrorlevel%

:EOJ
call %DIRBAT2%\eoj "%~f0"
goto:eof

:setexe
set EXE="%~f1\%~nx2"
goto:eof
