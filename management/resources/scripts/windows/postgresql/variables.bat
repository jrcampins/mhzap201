@echo off
rem on_properly_defined_variables=echo
set DBMS=postgresql
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof

call "%~dp0..\variables-date-time"

set PGHOST=%dbhost%
set PGPORT=%dbport%
set PGUSER=%dbuser%
set PGPASSWORD=%dbpass%
set PGDATABASE=%dbname%
set PGBINDIR=%POSTGRESQL_HOME%\bin
set BACKUPDIR=%HOMEDIR%\backup
set SQLDDLDIR=%HOMEDIR%\resources\database\ddl

if not exist %BACKUPDIR% md %BACKUPDIR%

call:check-dir PGBINDIR
call:check-dir BACKUPDIR
call:check-dir SQLDDLDIR

if not defined variables pause
if defined variables if defined on_properly_defined_variables pause
goto:eof

:check-dir
call:check-exist %1
if not defined dirname (
    set variables=
    echo *** %1 "%winname%" no es un directorio
    echo.
)
goto:eof

:check-file
call:check-exist %1
if defined dirname (
    set variables=
    echo *** %1 "%winname%" no es un archivo, es un directorio
    echo.
)
goto:eof

:check-exist
set varname=%1
call set winname=%%%varname%%%
if defined winname set winname=%winname:"=%
set dirname=
set dosname=
if defined %1 (
    if exist "%winname%" (
        call:set-dirname "%winname%"
        call:set-dosname "%winname%"
        if defined on_properly_defined_variables echo %1="%winname%"
    ) else (
        set variables=
        echo.
        echo *** %1 "%winname%" no existe
        echo.
    )
) else (
    set variables=
    echo.
    echo *** la variable de entorno %1 no esta definida
    echo.
)
goto:eof
set varname
set winname
set dirname
set dosname
echo.
goto:eof

:set-dirname
for /D %%d in ("%~f1\..\*") do if /i "%%~nxd" == "%~nx1" set dirname=%~f1
goto:eof

:set-dosname
for /F "delims=*" %%s in ("%~f1") do set dosname=%%~ss
goto:eof
