@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

if not exist "%~dp0logs" md "%~dp0logs"
set PLOG="%~dp0logs\%~n0.log"
set PSQL="%~dpn0.psql"
if not exist "%PSQL%" call %DIRBAT2%\variables-reset el archivo "%PSQL%" no existe
if not defined variables goto EOJ

call psql
if %xerrorlevel% GEQ 1 goto EOJ

call vacuumdb
if %xerrorlevel% GEQ 1 goto EOJ

:EOJ
call %DIRBAT2%\eoj "%~f0"