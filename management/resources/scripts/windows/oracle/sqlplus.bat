@echo off
cd /d "%~dp0"

if not defined variables goto:eof

set xerror=
set script="%~f1"
if not exist %script% (
    set xerror=y
    echo First parameter is not a valid script file
)

set SQLPLUS_START="%~dpn0.sql"
if not exist %SQLPLUS_START% (
    set xerror=y
    echo SQLPLUS_START %SQLPLUS_START% is not a valid script file
)

set log="%~dpn0.log"
if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%log%
    if exist %log% del %log%
)

if defined xerror (
    echo.
    pause
    goto:eof
)

pushd "%~dp1"
set cd1=%cd%
set cd2=%cd%
popd
set htaplqs=
if defined SQLPATH (
    set htaplqs=%SQLPATH%
    set cd2=%SQLPATH%
)

if "%cd1%" == "%cd2%" (
    set SQLPATH=%cd1%
) else (
    rem sqlpath="%SQLPATH%"
    set SQLPATH=%cd1%;%cd2%
)

echo sqlpath="%SQLPATH%"
echo sqlplus %*
echo.
pushd %O9BINDIR%
call:setParameterVariables %*
sqlplus "%O9USER%"/"%O9PASSWORD%" @%SQLPLUS_START% %SQLPLUS_SNAME% %p1% %p2% %p3% %p4% %p5% %p6% %p7% %p8% %p9% >> %SQLPLUS_SPOOL% 2>$1
set /a xerrorlevel=%ERRORLEVEL%
popd
echo sqlplus: %xerrorlevel%
echo.
if defined htaplqs (
    set SQLPATH=%htaplqs%
) else (
    set SQLPATH=
)

if defined SQLPATH (
    rem sqlpath="%SQLPATH%"
    echo.
)

if defined OPEN_SQLPLUS_SPOOL start /d %SystemRoot% notepad %SQLPLUS_SPOOL%
goto:eof

:setParameterVariables
set SQLPLUS_SNAME=%~nx1
shift
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
