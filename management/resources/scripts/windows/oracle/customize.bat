@echo off
cd /d "%~dp0"
echo "%~n0" ejecuta todos los scripts que se encuentran en oracle\custom\functions
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
set variables=
call variables
if not defined variables goto:eof

if not exist "%~dp0logs" md "%~dp0logs"
set log="%~dp0logs\%~n0.log"
if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%log%
    if exist %log% del %log%
)
echo "%~f0" >> %SQLPLUS_SPOOL%

set packages=%SQLDDLDIR%\oracle\custom\packages
if exist "%packages%" (
    for /D %%d in (%packages%\*.*) do call xsqlpack %%d
} else (
    echo %packages% is not a valid script folder
)

call ..\eoj "%~f0"
goto:eof

--------------------------------------------------------------------------------
for /R "%packages%" %%f in (*.sql) do (
    set SQLPATH=%%~dpf
    call sqlplus "%%f"
)
--------------------------------------------------------------------------------
for %%f in (%packages%\*.sql) do (
    set SQLPATH=%%~dpf
    call sqlplus "%%f"
)
--------------------------------------------------------------------------------
for /D %%d in (%packages%\*.*) do call xsqlpack %%d
--------------------------------------------------------------------------------
