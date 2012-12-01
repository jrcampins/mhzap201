@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call:concatsql-411
if /i "%funciones%" == "n" (
    call "%~dp0..\concatsql-key" 410 packages
) else (
    call "%~dp0..\concatsql-for" 410 packages
)
echo.

call:concatsql-421
if /i "%funciones%" == "n" (
    call "%~dp0..\concatsql-key" 420 functions
) else (
    call "%~dp0..\concatsql-for" 420 functions
)

call "%~dp0..\eoj" "%~f0"
goto:eof

:concatsql-411
set SOURCE=%SQLDDLXDIR%\packages
for /D %%d in (%SOURCE%\*.*) do call concatsql-pack %%d
echo.
goto:eof

:concatsql-421
set SOURCE=%SQLDDLXDIR%\functions
for /D %%f in (%SOURCE%\*.*) do call:concatsql-422 %%f
echo.
set target=
goto:eof

:concatsql-422
if "%~n1" == "CVS" goto:eof
set folder=%~f1\*.sql
set target=%~dpn1.sql
set target
if exist "%target%" del "%target%"
set SQLFILE=
for %%f in (%folder%) do set SQLFILE=%%f
if not defined SQLFILE goto:eof
call:concatsql-file-heading %1
for %%f in (%folder%) do call:concatsql-423 %%f
goto:eof

:concatsql-423
call:concatsql-file-heading %1
type "%~f1">>%target%
echo.>>%target%
goto:eof

:concatsql-file-heading
echo -->>%target%
echo -- %~nx1>>%target%
echo -->>%target%
goto:eof
