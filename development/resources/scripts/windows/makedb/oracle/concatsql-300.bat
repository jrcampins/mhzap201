@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%O9DATABASE%_O9_300.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%O9DATABASE%_O9_PRIMARY_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_NON_UNIQUE_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_CHECKS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_FOREIGN_KEYS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_SEQUENCES_SET.sql>>%TARGET%
echo.>>%TARGET%

if /i "%vistas%" == "n" goto SYS

set  SOURCE=%SQLDDLDIR%\%dbms%\functions-for-views
set  SOURCE
set  TARGET
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

set  SOURCE=%SQLDDLDIR%\%dbms%\packages-for-views
set  SOURCE
set  TARGET
echo.
for  /D %%d in (%SOURCE%\*.*) do call concatsql-pack %%d
echo.
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET
type %SOURCE%\%O9DATABASE%_O9_VIEWS.sql>>%TARGET%

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

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
goto:eof
