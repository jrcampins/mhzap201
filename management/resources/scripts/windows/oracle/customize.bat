@echo off
cd /d "%~dp0"
echo "%~n0" ejecuta todos los scripts que se encuentran en oracle\custom\functions
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

if not exist "%~dp0logs" md "%~dp0logs"
set log="%~dp0logs\%~n0.log"
if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%log%
    if exist %log% del %log%
)
echo "%~f0" >> %SQLPLUS_SPOOL%

call:concat %SQLDDLDIR% oracle\custom\packages
if not exist %string% (
    echo %string% is not a valid script folder
    goto EOJ
)

for /D %%d in (%string%\*.*) do call xsqlpack %%d

:EOJ
call ..\eoj "%~f0"
goto:eof

:concat
set string="%~f1\%2"
goto:eof

----------------------------------------------------------------------------------------------------
for /R "%string%" %%f in (*.sql) do (
    set SQLPATH=%%~dpf
    call sqlplus "%%f"
)
----------------------------------------------------------------------------------------------------
for %%f in (%string%\*.sql) do (
    set SQLPATH=%%~dpf
    call sqlplus "%%f"
)
----------------------------------------------------------------------------------------------------
for /D %%d in (%string%\*.*) do call xsqlpack %%d
----------------------------------------------------------------------------------------------------
