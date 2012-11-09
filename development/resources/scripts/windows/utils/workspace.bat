@echo off
cd /d "%~dp0"

set WS1=%1
set WS2=workspace

if exist "%WS1%" dir "%WS1%"
echo.

if exist "%WS2%" dir "%WS2%"
echo.

if exist "%WS1%" goto CASE1
if exist "%WS2%" goto CASE2

goto CASE3

:CASE1
rmdir "%WS2%" /s /q
md "%WS2%"
move "%WS1%\mhzap201" "%WS2%"
dir "%WS2%"
goto DONE

:CASE2
for /D %%d in (%WS2%\*.*) do set directorio=%%d
if not defined directorio goto DONE

echo rmdir "%WS2%" /s
echo.

for /D %%d in (%WS2%\*.*) do echo eliminar directorio %%d
echo.

set siono=S
set /p siono="delete "%WS2%"? (S/N) [S] "
if /i "%siono%" == "S" goto ERASE
goto DONE

:ERASE
for /D %%d in (%WS2%\*.*) do rmdir %%d /s /q
goto DONE

:CASE3
md "%WS2%"

:DONE
echo.
pause
exit
