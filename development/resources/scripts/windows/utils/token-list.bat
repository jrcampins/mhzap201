@echo off
cd /d "%~dp0"
set tokens1=token-list-1
set tokens2=token-list-2
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q
:loop
if "%1"=="" goto done
echo %1>>%tokens1%
shift
goto loop
:done
if exist %tokens1% sort %tokens1% /o %tokens2%
echo.
if exist %tokens1% for /f "tokens=1*" %%t in (%tokens1%) do echo "%%~nt"
echo.
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do echo "%%~nt"
echo.
pause
