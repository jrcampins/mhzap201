@echo off
cd /d "%~dp0"

set log="%~dpn0.log"
call variables-date-time
set>%log%

:PDQ1
set SOURCE=%aaaammdd%
set pregunta="SOURCE? [%SOURCE%] "
set /p SOURCE=%pregunta%
if not exist "%SOURCE%" goto PDQ1

:PDQ2
set TARGET=%aaaammdd%
set pregunta="TARGET? [%TARGET%] "
set /p TARGET=%pregunta%
if not exist "%TARGET%" goto PDQ2

set SOURCE=%~dp0%SOURCE%
set TARGET=%~dp0%TARGET%

if not exist "%SOURCE%" goto ERR1
if not exist "%TARGET%" goto ERR2

if "%SOURCE%" == "%TARGET%" echo DONE

del %log%

echo.
set SOURCE
set TARGET
echo.
pause
echo.

:FOR1
for /R "%SOURCE%" %%f in (.) do (
call:FileCompareX %%~dpnf
)
goto DONE

:FOR2
for /D %%d in (%SOURCE%\*) do (
echo %%~d
)
goto DONE

:ERR1
set ERRMSG=directorio %SOURCE% no existe
goto TELL

:ERR2
set ERRMSG=directorio %TARGET% no existe
goto TELL

:TELL
@echo.
@echo %ERRMSG%
@echo.

:DONE
pause
goto:eof


:samples
set key=May
set map=Jan-01;Feb-02;Mar-03;Apr-04;May-05;Jun-06;Jul-07;Aug-08;Sep-09;Oct-10;Nov-11;Dec-12
call set key=%%map:*%key%-=%%
set key=%key:;=&rem.%
echo.%key%
set key=sun
set map=mon-Monday;tue-Tuesday;wed-Wednesday;thu-Thursday;fri-Friday;sat-Saturday;sun-Sunday
call set key=%%map:*%key%-=%%
set key=%key:;=&rem.%
echo.%key%
set key=%SOURCE%
set key
set map=%SOURCE%-%TARGET%
call set key=%%map:*%key%-=%%
set key=%key:;=&rem.%
set key
goto:eof

:FileCompareX
echo %~f1

set dp1=%~f1
rem set dp1
call set dp2=%%dp1:%source%=%target%%%
rem set dp2
echo.

set tokensfile=tokens
set tokenspath=%CD%
if exist %tokensfile% del %tokensfile% /q

echo java>>%tokensfile%
echo sql>>%tokensfile%
echo properties>>%tokensfile%

for /f "tokens=* delims=." %%t in (%tokensfile%) do (
rem if exist "%dp2%\*.%%t" echo FC "%dp2%\*.%%t" "%dp1%\*.%%t">>%log%
if exist "%dp2%\*.%%t" FC "%dp2%\*.%%t" "%dp1%\*.%%t" /LB1 1>>%log% 2>&1
)

if exist %tokensfile% del %tokensfile% /q
goto:eof
