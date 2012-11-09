if not defined variables call variables "%~f0"
if not defined variables goto EOJ

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
if not defined variables goto EOJ
call:buildOSQLFile
call:setexe %SSBINDIR% osql.exe
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

if defined XLOG goto EOJ
call ..\setsiono desea ver el log de la ejecucion (%PLOG%)
if /i "%siono%" NEQ "S" goto EOJ
type %PLOG% | more

echo.
pause

:EOJ
call ..\eoj "%~f0"
goto:eof

:buildOSQLFile
call:setdir %SQLDATDIR%
set datdir=%SQLDIR%
call:setdir %SQLDDLDIR%
set ddldir=%SQLDIR%
if exist %OSQLFILE% del %OSQLFILE%
echo declare @crvl   integer        >>%OSQLFILE%
echo declare @ssdb   varchar(100)   >>%OSQLFILE%
echo declare @datdir varchar(2000)  >>%OSQLFILE%
echo declare @ddldir varchar(2000)  >>%OSQLFILE%
echo select  @crvl   =  %CRVL%      >>%OSQLFILE%
echo select  @ssdb   = '%SSDB%'     >>%OSQLFILE%
echo select  @datdir = '%datdir%'   >>%OSQLFILE%
echo select  @ddldir = '%ddldir%'   >>%OSQLFILE%
echo print   @crvl                  >>%OSQLFILE%
echo print   @ssdb                  >>%OSQLFILE%
echo print   @datdir                >>%OSQLFILE%
echo print   @ddldir                >>%OSQLFILE%
if exist %PSQL% type %PSQL%         >>%OSQLFILE%
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

:setdir
set SQLDIR=%~f1
goto:eof

:setexe
set EXE="%~f1\%~nx2"
goto:eof
