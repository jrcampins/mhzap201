@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%SSDATABASE%_SS_300.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%SSDATABASE%_SS_PRIMARY_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_NON_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_CHECKS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_FOREIGN_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
REM type %SOURCE%\%SSDATABASE%_SS_SEQUENCES_SET.sql>>%TARGET%
echo.>>%TARGET%

if /i "%vistas%" == "n" goto SYS

set  SOURCE=%SQLDDLDIR%\%dbms%\functions-for-views
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET
type %SOURCE%\%SSDATABASE%_SS_VIEWS.sql>>%TARGET%

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
