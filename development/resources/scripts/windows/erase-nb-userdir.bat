@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

if not defined f0 set f0="%~f0"

set siono=S
set /p siono="Eliminar cache de Netbeans ? (S/N) [%siono%] "
if /i "%siono%" NEQ "S" goto:eof
echo.

set siono=N
call:erase "N:\userdir\var"

set siono=N
rem call:erase "N:\userdir\config\Databases\CachedMetadata"

if %f0% == "%~f0" pause
goto:eof

:erase
set target="%~f1"
if exist %target% (call:present) else (call:missing)
echo.
goto:eof

:present
set /p siono="ELIMINAR EL DIRECTORIO %target% ? (S/N) [%siono%] "
if /i "%siono%" NEQ "S" goto:eof

rmdir %target% /s /q
goto:eof

:missing
echo %target% no existe
goto:eof
