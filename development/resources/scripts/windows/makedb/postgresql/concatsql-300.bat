@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%PGDATABASE%_PG_300.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%PGDATABASE%_PG_PRIMARY_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_NON_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_CHECKS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_FOREIGN_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_SEQUENCES_SET.sql>>%TARGET%
echo.>>%TARGET%

if /i "%vistas%" == "n" goto SYS

set  SOURCE=%SQLDDLDIR%\%dbms%\functions-for-views
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET
type %SOURCE%\%PGDATABASE%_PG_VIEWS.sql>>%TARGET%

set  SOURCE=%SQLDDLDIR%\%dbms%\views
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

:JASPER
if /i "%jasper%" == "n" goto WEB

set  SOURCE=%SQLDDLDIR%\%dbms%\views\jasper
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

set  SOURCE=%SQLDDLDIR%\%dbms%\views\jasper\override
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

:WEB
if /i "%web%" == "n" goto SYS

set  SOURCE=%SQLDDLDIR%\%dbms%\views\web
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

set  SOURCE=%SQLDDLDIR%\%dbms%\views\web\override
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

:SYS
set  SOURCE=%SQLDDLDIR%\%dbms%\views\system
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

call "%~dp0..\eoj" "%~f0"
