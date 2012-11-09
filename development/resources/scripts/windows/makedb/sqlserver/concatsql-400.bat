@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo -->%SQLDDLDIR%\%SSDATABASE%_SS_400.sql
REM if /i "%funciones%" == "n"  goto EOJ
call:concatsql-401
if /i "%funciones%" == "n" (
    call %DIRBAT1%\concatsql-key 400 functions
) else (
    call %DIRBAT1%\concatsql-for 400 functions
)

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof

:concatsql-401
set SOURCE=%SQLDDLDIR%\%dbms%\functions
for /D %%f in (%SOURCE%\*.*) do call:concatsql-402 %%f
echo.
goto:eof

:concatsql-402
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
for %%f in (%SOURCE%) do call:concatsql-403 %%f
goto:eof

:concatsql-403
call:concatsql-file-heading %1
type "%~f1">>%TARGET%
echo.>>%TARGET%
goto:eof

:concatsql-file-heading
echo -->>%TARGET%
echo -- %~nx1>>%TARGET%
echo -->>%TARGET%
goto:eof
