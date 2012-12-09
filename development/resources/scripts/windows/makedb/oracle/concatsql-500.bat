@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call:concatsql-501
if /i "%funciones%" == "n" (
    call "%~dp0..\concatsql-key" 500 triggers @SQLHOMEDIR
) else (
    call "%~dp0..\concatsql-for" 500 triggers @SQLHOMEDIR
)

call "%~dp0..\eoj" "%~f0"
goto:eof

:concatsql-501
set SOURCE=%SQLDDLXDIR%\triggers
for /D %%f in (%SOURCE%\*.*) do call:concatsql-502 %%f
set target=
goto:eof

:concatsql-502
if "%~n1" == "CVS" goto:eof
set folder=%~f1\*.sql
set target=%~dpn1.sql
call set target=%%target:%SQLDDLXDIR%=%SQLHOMEDIR%%%
set target
if exist %target% (del %target%) else (call:make-dir %target%)
set SQLFILE=
for %%f in (%folder%) do set SQLFILE=%%f
if not defined SQLFILE goto:eof
call:concatsql-file-heading %1
for %%f in (%folder%) do call:concatsql-503 %%f
goto:eof

:concatsql-503
call:concatsql-file-heading %1
type "%~f1">>%target%
echo.>>%target%
goto:eof

:concatsql-file-heading
echo -->>%target%
echo -- %~nx1>>%target%
echo -->>%target%
goto:eof

:make-dir
if not exist "%~dp1" md "%~dp1"
goto:eof
