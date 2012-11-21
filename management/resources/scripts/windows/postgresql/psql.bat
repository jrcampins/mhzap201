if not defined variables call variables "%~f0"
if not defined variables goto:eof

if "%~x1" == ".sql" set PSQL="%~f1"
if "%~x1" ==".psql" set PSQL="%~f1"

if not exist "%~dp0logs" md "%~dp0logs"
if not defined PLOG set PLOG="%~dp0logs\%~n0.log"
if not defined PSQL set PSQL="%~dpn0.psql"
if not defined TXT1 set TXT1="%~dpn0-log.txt"
if not defined TXT2 set TXT2="%~dpn0-out.txt"
if not defined PGDB set PGDB=%PGDATABASE%
if not defined CRVL set CRVL=10%aammdd%

call:checkFile %PSQL%
if not defined variables goto EOJ
set EXE="%PGBINDIR%\psql.exe"
set CMD=%EXE% -e -f %PSQL% -q -v ddldir=%SQLDDLDIR% -v pgdb=%PGDB% -v crvl=%CRVL%

echo.
echo %EXE%
rem echo %PLOG%
echo %PSQL%
echo.
pause

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
set PSQL=

if defined XLOG goto:eof
call ..\setsiono desea ver el log de la ejecucion (%PLOG%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %PLOG%
goto:eof

:EOJ
call ..\eoj "%~f0"
goto:eof

:checkFile
set carpeta="%~f1"
set archivo="%~f1"
if "%2" == "" set carpeta="%~dp1"
if not "%2" == "" set archivo="%~f1\%~nx2"
rem echo check %archivo%
if exist %archivo% goto:eof
echo el archivo %archivo% no existe
set variables=
goto:eof
