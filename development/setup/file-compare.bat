@echo off
cd /d "%~dp0"
call variables
set log="%~dpn0.log"
if exist %log% del %log% /q
set target=%project_source_dir%\management
call:compare
set siono=S
set /p siono="desea ver el log de la ejecucion (%log%) ? (Si/No) [%siono%] "
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof

:compare
set source=%project_source_dir%\management\setup\scripts
set source
set target
echo.
call:compare-loop password
echo.
set source=%project_source_dir%\management\setup\scripts\linux
set source
set target
echo.
call:compare-loop sh
echo.
set source=%project_source_dir%\management\setup\scripts\windows
set source
set target
echo.
call:compare-loop bat
echo.
goto:eof

:compare-tree
for /R "%source%" %%f in (*.*) do call:compare-file %%f
goto:eof

:compare-loop
for %%f in ("%source%\*.%1") do call:compare-file %%f
goto:eof

:compare-file
set dp1=%~f1
call set dp2=%%dp1:%source%=%target%%%
if exist "%dp2%" (
    echo FC "%dp1%" "%dp2%" /LB1 1>>%log% 2>&1
    call FC "%dp1%" "%dp2%" 1>>%log% 2>&1
)
goto:eof
