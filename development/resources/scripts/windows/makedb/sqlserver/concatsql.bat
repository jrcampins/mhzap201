@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

set  siono=S
call "%~dp0..\setsiono" concatenar datos, funciones, triggers, vistas, etc.
set  todos=%siono%
if /i "%todos%" == "n" call "%~dp0..\setsiono" concatenar datos
set  datos=%siono%
if /i "%todos%" == "n" call "%~dp0..\setsiono" concatenar funciones, triggers, etc.
set  funciones=%siono%
if /i "%todos%" == "n" call "%~dp0..\setsiono" concatenar vistas
set  vistas=%siono%
if /i "%siono%" == "s" call "%~dp0..\setsiono" concatenar vistas-jasper
set  jasper=%siono%
if /i "%siono%" == "s" call "%~dp0..\setsiono" concatenar vistas-web
set  web=%siono%
echo.

set  datos
set  funciones
set  vistas
set  jasper
set  web
echo.

call "%~dp0concatsql-100"
call "%~dp0concatsql-200"
call "%~dp0concatsql-300"
call "%~dp0concatsql-400"
call "%~dp0concatsql-500"
call "%~dp0concatsql-600"
goto PWD

set  SOURCE=%SQLDDLDIR%
set  TARGET=%SQLDDLDIR%\%SSDATABASE%_SS_000.sql

call:deleteFile "%TARGET%"

type %SOURCE%\%SSDATABASE%_SS_100.sql>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_200.sql>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_300.sql>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_400.sql>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_500.sql>>%TARGET%
type %SOURCE%\%SSDATABASE%_SS_600.sql>>%TARGET%
goto PWD

:PWD
dir  %SQLDDLDIR%\%SSDATABASE%*.sql

call "%~dp0..\eoj" "%~f0"
goto:eof

:deleteFile
if exist "%~f1" del "%~f1"
goto:eof
