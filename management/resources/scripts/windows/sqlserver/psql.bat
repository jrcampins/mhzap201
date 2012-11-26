if not defined variables goto:eof

set OSQLFILE="%~dpn0.osql"
set OSQLUSER=%SSUSER%
set OSQLPASSWORD=%SSPASS%
set OSQLSERVER=%SSHOST%

if "%~x1" == ".sql" set PSQL="%~f1"
if "%~x1" ==".psql" set PSQL="%~f1"

if not exist "%~dp0logs" md "%~dp0logs"
if not defined PLOG set PLOG="%~dp0logs\%~n0.log"
if not defined PSQL set PSQL="%~dpn0.psql"
if not defined TXT1 set TXT1="%~dpn0-log.txt"
if not defined TXT2 set TXT2="%~dpn0-out.txt"
if not defined SSDB set SSDB=%SSDATABASE%
if not defined CRVL set CRVL=10%aammdd%

call:checkFile %PSQL%
if not defined variables goto:eof
call:buildOSQLFile
set EXE="%SSBINDIR%\osql.exe"
set CMD=%EXE% -e -i %OSQLFILE% -d %SSDB% -n

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
call "%~dp0..\setsiono.bat" desea ver el log de la ejecucion (%PLOG%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %PLOG%
goto:eof

:buildOSQLFile
if exist %OSQLFILE% del %OSQLFILE%
echo declare @crvl   integer        >>%OSQLFILE%
echo declare @ssdb   varchar(100)   >>%OSQLFILE%
echo declare @datdir varchar(2000)  >>%OSQLFILE%
echo declare @ddldir varchar(2000)  >>%OSQLFILE%
echo select  @crvl   =  %CRVL%      >>%OSQLFILE%
echo select  @ssdb   = '%SSDB%'     >>%OSQLFILE%
echo select  @datdir = '%SQLDATDIR%'>>%OSQLFILE%
echo select  @ddldir = '%SQLDDLDIR%'>>%OSQLFILE%
echo print   @crvl                  >>%OSQLFILE%
echo print   @ssdb                  >>%OSQLFILE%
echo print   @datdir                >>%OSQLFILE%
echo print   @ddldir                >>%OSQLFILE%
if exist %PSQL% type %PSQL%         >>%OSQLFILE%
goto:eof

:checkFile
if exist "%~f1" goto:eof
set variables=
echo.
echo el archivo "%~f1" no existe
echo.
pause
echo.
goto:eof
