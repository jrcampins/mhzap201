setlocal
echo.
echo %~n0 %*
echo.

if not defined variables goto:eof

call:init-log "%~f1"
if /i "%~x1" == ".log" shift /1

if not exist "%~f1" (
    set /p x="ERROR: el script "%~f1" no existe "
    goto:eof
)

set OSQLFILE="%~dpn0.osql"
set OSQLUSER=%SSUSER%
set OSQLPASSWORD=%SSPASS%
set OSQLSERVER=%SSHOST%

if not defined TXT1 set TXT1="%~dpn0-log.txt"
if not defined TXT2 set TXT2="%~dpn0-out.txt"
if not defined SSDB set SSDB=%SSDATABASE%
if not defined CRVL set CRVL=%aaaammdd%

call:build-osql-file "%~f1"

set EXE="%SSBINDIR%\osql.exe"
set CMD=%EXE% -e -i %OSQLFILE% -d %SSDB% -n
pushd "%SQLDDLDIR%"
%CMD% 1>>%log% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
popd
echo %~n0: %xerrorlevel%
call:open-log "%~f1"
goto:eof

:init-log
set log="%homedir%\logs\%~nx0.%~nx1.log"
if /i "%~x1" == ".log" (
    set log="%~f1"
    call:make-dir "%~f1"
) else (
    if exist %log% (del %log%) else (call:make-dir %log%)
)
echo %~f0 >> %log%
goto:eof

:make-dir
if not exist "%~dp1" md "%~dp1"
goto:eof

:open-log
echo.
if /i not %log% == "%homedir%\logs\%~nx0.%~nx1.log" goto:eof
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof

:build-osql-file
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
type "%~f1"                         >>%OSQLFILE%
goto:eof
