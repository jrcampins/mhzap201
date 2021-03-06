setlocal
echo.
echo %~n0 %*
echo.

if not defined variables goto:eof

set f1="%~f1"
if /i "%~x1" == ".log" shift /1

if not exist "%~f1" (
    set /p x="ERROR: el script "%~f1" no existe "
    goto:eof
)

if not defined TXT1 set TXT1="%~dpn0-log.txt"
if not defined TXT2 set TXT2="%~dpn0-out.txt"
if not defined PGDB set PGDB=%PGDATABASE%
if not defined CRVL set CRVL=%aaaammdd%

call:init-log %f1%
set EXE="%PGBINDIR%\psql.exe"
set CMD=%EXE% -e -f "%~f1" -q -v crvl=%CRVL% -v pgdb=%PGDB% -v ddlxdir=%SQLDDLXDIR% -v joindir=%SQLHOMEDIR%
%CMD% 1>>%log% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
echo %~n0: %xerrorlevel%
call:open-log "%~f1"
goto:eof

:init-log
set log="%SQLLOGSDIR%\%~n0.%~nx1.log"
if exist %log% del %log%
if /i "%~x1" == ".log" (
    set log="%~f1"
    if not exist "%~dp1" md "%~dp1"
)
echo %~f0 >> %log%
goto:eof

:open-log
echo.
if /i not %log% == "%SQLLOGSDIR%\%~n0.%~nx1.log" goto:eof
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof
