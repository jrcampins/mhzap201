@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

if /i "%datos%" == "n"  goto:eof
call:concat-all-data
call:concat-metadata
call "%~dp0..\eoj" "%~f0"
goto:eof

:concat-all-data
call "%~dp0..\concatsql-for" 200 data
echo.
goto:eof

:concat-metadata
set  SOURCE=%SQLDDLDIR%\%dbms%\data
set  TARGET=%SQLJOINDIR%\%dbname%_200_METADATA.sql
set  TARGET
set  SOURCE
if exist "%TARGET%" del "%TARGET%"
call "%~dp0..\concatsql-file" "%~dp0..\delete-metadata.sql"
call "%~dp0..\dump-metadata-run" "%~dp0..\concatsql-sql"
goto:eof
