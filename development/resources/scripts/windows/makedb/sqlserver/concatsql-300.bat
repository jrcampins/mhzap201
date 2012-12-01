@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLXDIR%\base
set  TARGET=%SQLJOINDIR%\%dbname%_300.sql
set  TARGET
set  SOURCE
if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%dbname%_PRIMARY_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%dbname%_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%dbname%_NON_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%dbname%_CHECKS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%dbname%_FOREIGN_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
rem type %SOURCE%\%dbname%_SEQUENCES_SET.sql>>%TARGET%
echo.>>%TARGET%

if /i "%vistas%" == "n" goto SYS

set  SOURCE=%SQLDDLXDIR%\functions-for-views
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

set  SOURCE=%SQLDDLXDIR%\base
set  SOURCE
rem  TARGET
type %SOURCE%\%dbname%_VIEWS.sql>>%TARGET%

set  SOURCE=%SQLDDLXDIR%\views
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

:JASPER
if /i "%jasper%" == "n" goto WEB

set  SOURCE=%SQLDDLXDIR%\views\jasper
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

set  SOURCE=%SQLDDLXDIR%\views\jasper\override
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

:WEB
if /i "%web%" == "n" goto SYS

set  SOURCE=%SQLDDLXDIR%\views\web
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

set  SOURCE=%SQLDDLXDIR%\views\web\override
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

:SYS
set  SOURCE=%SQLDDLXDIR%\views\system
set  SOURCE
rem  TARGET
for  %%f in (%SOURCE%\*.sql) do call "%~dp0..\concatsql-file" %%f

call "%~dp0..\eoj" "%~f0"
