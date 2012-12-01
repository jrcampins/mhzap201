@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

set /a xerrorlevel=0
call "%thisdir%\concatsql"

set siono=N
if %xerrorlevel% == 0 (
    echo.
    call "%~dp0..\setsiono" eliminar y volver a crear la base de datos %dbname%
    echo.
)

set SSDB=master
if /i "%siono%" == "S" (
    if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLXSQLDIR%\dropdb.sql"
    if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLXSQLDIR%\createdb.sql"
) else (
    set /a xerrorlevel=1
)

set SSDB=%dbname%
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLJOINDIR%\%dbname%_100.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLJOINDIR%\%dbname%_200.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLJOINDIR%\%dbname%_300.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLJOINDIR%\%dbname%_400.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLJOINDIR%\%dbname%_500.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLJOINDIR%\%dbname%_600.sql"
call "%~dp0..\eoj" "%~f0"
