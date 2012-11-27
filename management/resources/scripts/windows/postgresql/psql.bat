set PSQL=
if not defined variables goto:eof

if "%~x1" == ".sql" set PSQL="%~f1"
if "%~x1" ==".psql" set PSQL="%~f1"

call:check-psql
if not defined PSQL goto:eof

if not defined TXT1 set TXT1="%~dpn0-log.txt"
if not defined TXT2 set TXT2="%~dpn0-out.txt"
if not defined PGDB set PGDB=%PGDATABASE%
if not defined CRVL set CRVL=10%aammdd%

set EXE="%PGBINDIR%\psql.exe"
set CMD=%EXE% -e -f %PSQL% -q -v ddldir=%SQLDDLDIR% -v pgdb=%PGDB% -v crvl=%CRVL%

echo.
echo %EXE%
echo %PSQL%
echo.
pause

call:init-psql-spool "%~f1"
echo %CMD%>>%PLOG%
echo.
echo.>>%PLOG%
echo %DATE% %TIME% %PSQL%>>%PLOG%
pushd "%SQLDDLDIR%"
%CMD% 1>>%PLOG% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
popd
echo %DATE% %TIME% %PSQL%>>%PLOG%
echo.>>%PLOG%
echo.
echo psql: %xerrorlevel%
echo.
call:open-psql-spool "%~f1"
goto:eof

:init-psql-spool
set dir="%~dp0logs"
set log="%~dp0logs\%~nx1.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% (del %log%) else (if not exist %dir% md %dir%)
)
echo %~f0 >> %PLOG%
goto:eof

:open-psql-spool
set log="%~dp0logs\%~nx1.log"
if /i %PLOG% == %log% (echo.) else (goto:eof)
set PLOG=
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof

:check-psql
if exist %PSQL% goto:eof
echo.
echo El archivo %PSQL% no existe
echo.
pause
echo.
set PSQL=
goto:eof
