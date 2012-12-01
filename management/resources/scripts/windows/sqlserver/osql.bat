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

set OSQLFILE="%homedir%\osql\%~n0.%~nx1"
set OSQLUSER=%SSUSER%
set OSQLPASSWORD=%SSPASS%
set OSQLSERVER=%SSHOST%

if not defined TXT1 set TXT1="%~dpn0-log.txt"
if not defined TXT2 set TXT2="%~dpn0-out.txt"
if not defined SSDB set SSDB=%SSDATABASE%
if not defined CRVL set CRVL=%aaaammdd%

call:build-osql-file "%~f1"
call:init-log %f1%
set EXE="%SSBINDIR%\osql.exe"
set CMD=%EXE% -e -i %OSQLFILE% -d %SSDB% -n
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

:build-osql-file
echo %~n0(%OSQLFILE%)
echo.
if exist %OSQLFILE% (del %OSQLFILE%) else (call:make-dir %OSQLFILE%)
if /i "%SSDB%" == "master" (
    call:echo1 "declare @crvl   integer"
    call:echo1 "declare @ssdb   varchar(100)"
    call:echo1 "declare @datdir varchar(2000)"
    call:echo1 "select  @crvl   =  %CRVL%"
    call:echo1 "select  @ssdb   = '%SSDB%'"
    call:echo1 "select  @datdir = '%SQLDATDIR%'"
    call:echo1 "print   getdate()"
    call:echo1 "print   ''"
) else (
    call:echo1 "print getdate()"
    call:echo1 "print ''"
    call:echo1 "go"
)
type "%~f1">>%OSQLFILE%
goto:eof

:make-dir
if not exist "%~dp1" md "%~dp1"
goto:eof

:echo1
echo %~1>>%OSQLFILE%
goto:eof
