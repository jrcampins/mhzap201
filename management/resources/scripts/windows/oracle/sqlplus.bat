setlocal
echo.
echo %~n0 %*
echo.

if not defined variables goto:eof

set sf0="%SQLXSQLDIR%\%~n0.sql"
if not exist %sf0% (
    set /p x="ERROR: el script %sf0% no existe "
    goto:eof
)

set f1="%~f1"
if /i "%~x1" == ".log" shift /1

if not exist "%~f1" (
    set /p x="ERROR: el script "%~f1" no existe "
    goto:eof
)

set pdq=%SQLXSQLDIR%
set dp1=%~dp1
set dp1=%dp1:~0,-1%
if /i not "%pdq%" == "%dp1%" set pdq=%pdq%;%dp1%
if defined SQLPATH set pdq=%pdq%;%SQLPATH%
set SQLPATH=%pdq%

call:init-log %f1%
set SQLPATH >> %log% 2>&1
call:set-parameter-variables %*
pushd %ORACLE_HOME%\bin
set logon=/
if not "%ORAUSER%" == "" if not "%ORAPASSWORD%" == "" set logon=%ORAUSER%/%ORAPASSWORD%@%dbhost%:%dbport%/%dbserv%
if not "%ORAROLE%" == "" set logon=%logon% AS %ORAROLE%
sqlplus -L %logon% @%sf0% %~nx1 %p1% %p2% %p3% %p4% %p5% %p6% %p7% %p8% %p9% >> %log% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
popd
echo sqlplus: %xerrorlevel%
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
if /i %log% == "%SQLLOGSDIR%\%~n0.%~nx1.log" (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof

:set-parameter-variables
if /i "%~x1" == ".log" shift /1
shift /1
if "%1"=="" (set p1=?) else (set p1=%1)
if "%2"=="" (set p2=?) else (set p2=%2)
if "%3"=="" (set p3=?) else (set p3=%3)
if "%4"=="" (set p4=?) else (set p4=%4)
if "%5"=="" (set p5=?) else (set p5=%5)
if "%6"=="" (set p6=?) else (set p6=%6)
if "%7"=="" (set p7=?) else (set p7=%7)
if "%8"=="" (set p8=?) else (set p8=%8)
if "%9"=="" (set p9=?) else (set p9=%9)
goto:eof
