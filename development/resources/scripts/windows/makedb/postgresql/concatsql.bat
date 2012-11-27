@echo off
cd /d "%~dp0"

if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

set  siono=S
call "%~dp0..\setsiono" concatenar datos, funciones, triggers, vistas, etc.
set  todos=%siono%
if /i "%todos%"  == "n" (
   set  siono=%todos%
   call "%~dp0..\setsiono" concatenar datos
)
set  datos=%siono%
if /i "%todos%"  == "n" (
   set  siono=%todos%
   call "%~dp0..\setsiono" concatenar funciones, triggers, etc.
)
set  funciones=%siono%
if /i "%todos%"  == "n" (
   set  siono=%todos%
   call "%~dp0..\setsiono" concatenar vistas
)
set  vistas=%siono%
if /i "%vistas%" == "s" (
   set  siono=%todos%
   call "%~dp0..\setsiono" concatenar vistas-jasper
)
set  jasper=%siono%
if /i "%vistas%" == "s" (
   set  siono=%todos%
   call "%~dp0..\setsiono" concatenar vistas-web
)
set  web=%siono%
echo.
set  datos
set  funciones
set  vistas
set  jasper
set  web
echo.
if /i "%todos%"  == "n" (
   pause
   echo.
)
call "%~dp0concatsql-100"
call "%~dp0concatsql-200"
call "%~dp0concatsql-300"
call "%~dp0concatsql-400"
call "%~dp0concatsql-500"
call "%~dp0concatsql-600"
goto PWD

set  SOURCE=%SQLDDLDIR%
set  TARGET=%SQLDDLDIR%\%PGDATABASE%_PG_000.sql
if exist "%TARGET%" del "%TARGET%"
type %SOURCE%\%PGDATABASE%_PG_100.sql>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_200.sql>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_300.sql>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_400.sql>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_500.sql>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_600.sql>>%TARGET%
goto PWD

:PWD
dir  %SQLDDLDIR%\%PGDATABASE%*.sql

call "%~dp0..\eoj" "%~f0"
