@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo -->%SQLDDLDIR%\%O9DATABASE%_O9_500.sql
REM if /i "%funciones%" == "n"  goto EOJ
call:concatsql-501
if /i "%funciones%" == "n" (
    call %DIRBAT1%\concatsql-key 500 triggers
) else (
    call %DIRBAT1%\concatsql-for 500 triggers
)

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof

:concatsql-501
set SOURCE=%SQLDDLDIR%\%dbms%\triggers
for /D %%f in (%SOURCE%\*.*) do call:concatsql-502 %%f
echo.
goto:eof

:concatsql-502
if "%~n1" == "CVS" goto:eof
set SOURCE="%~f1\*.sql"
rem SOURCE
set TARGET="%~dpn1.sql"
set TARGET
if exist "%TARGET%" del "%TARGET%"
set SQLFILE=
for %%f in (%SOURCE%) do set SQLFILE=%%f
if not defined SQLFILE goto:eof
call:concatsql-file-heading %1
for %%f in (%SOURCE%) do call:concatsql-503 %%f
goto:eof

:concatsql-503
call:concatsql-file-heading %1
type "%~f1">>%TARGET%
echo.>>%TARGET%
goto:eof

:concatsql-file-heading
echo -->>%TARGET%
echo -- %~nx1>>%TARGET%
echo -->>%TARGET%
goto:eof
