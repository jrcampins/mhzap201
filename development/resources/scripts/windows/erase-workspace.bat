@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

if not defined f0 set f0="%~f0"

set MHZAP201_WORKSPACE=W:\workspace
call:erase "%MHZAP201_WORKSPACE%"
if %f0% == "%~f0" pause
goto:eof

:erase
set target="%~f1"
if exist %target% (call:present) else (call:missing)
echo.
goto:eof

:present
set siono=N
for /D %%d in (%target%\*.*) do (
    echo %%d
    set siono=S
)
if /i "%siono%" == "S" (call:ready) else (call:empty)
goto:eof

:ready
echo.
set /p siono="ELIMINAR LOS SUBDIRECTORIOS DE %target%? (S/N) [%siono%] "
if /i "%siono%" NEQ "S" goto:eof
echo.
for /D %%d in (%target%\*.*) do (
    echo rmdir "%%d"
    rmdir "%%d" /s /q
)
goto:eof

:empty
echo %target% no tiene subdirectorios
goto:eof

:missing
echo %target% no existe
goto:eof
