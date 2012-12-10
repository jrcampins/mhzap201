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
    if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLSCRXDIR%\dropdb.sql"
    if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLSCRXDIR%\createdb.sql"
    pause
) else (
    set /a xerrorlevel=1
)

set SSDB=%dbname%
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLHOMEDIR%\%dbname%_100.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLHOMEDIR%\%dbname%_200.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLHOMEDIR%\%dbname%_300.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLHOMEDIR%\%dbname%_400.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLHOMEDIR%\%dbname%_500.sql"
if %xerrorlevel% == 0 call "%thatdir%\osql" "%SQLHOMEDIR%\%dbname%_600.sql"
call "%~dp0..\eoj" "%~f0"
