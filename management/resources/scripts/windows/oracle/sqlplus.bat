if not defined variables goto:eof
setlocal
echo %~n0 %*

if not exist "%~dpn0.sql" (
    set /p x="ERROR: el script "%~dpn0.sql" no existe "
    goto:eof
)

call:init-log "%~f1" "%~dp0logs\%~nx0.%~nx1.log"
if /i "%~x1" == ".log" shift /1

if not exist "%~f1" (
    set /p x="ERROR: el script "%~f1" no existe "
    goto:eof
)

pushd "%~dp1"
set cd1=%cd%
set cd2=%cd%
popd
if defined SQLPATH (
    set cd2=%SQLPATH%
)
if "%cd1%" == "%cd2%" (
    set SQLPATH=%cd1%
) else (
    set SQLPATH=%cd1%;%cd2%
)

call:set-parameter-variables %*
pushd %O9BINDIR%
sqlplus "%O9USER%"/"%O9PASSWORD%" @"%~dpn0.sql" %~nx1 %p1% %p2% %p3% %p4% %p5% %p6% %p7% %p8% %p9% >> %log% 2>$1
set /a xerrorlevel=%ERRORLEVEL%
popd
echo sqlplus: %xerrorlevel%
echo.
call:open-log "%~f1"
goto:eof

:init-log
if /i "%~x1" == ".log" (
    set log="%~f1"
    if not exist "%~dp1" md "%~dp1"
) else (
    set log="%~f2"
    if exist "%~f2" (del "%~f2") else (if not exist "%~dp2" md "%~dp2")
)
echo %~f0 >> %log%
goto:eof

:open-log
if /i %log% == "%~dp0logs\%~nx0.%~nx1.log" (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
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
