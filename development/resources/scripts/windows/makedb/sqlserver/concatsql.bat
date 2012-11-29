@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

if defined concat_without_asking  (
    set siono=S
) else (
    call "%~dp0..\setsiono" concatenar datos, funciones, triggers, vistas, etc.
)
set todos=%siono%
if /i "%todos%" == "n" call "%~dp0..\setsiono" concatenar datos
set datos=%siono%
if /i "%todos%" == "n" call "%~dp0..\setsiono" concatenar funciones, triggers, etc.
set funciones=%siono%
if /i "%todos%" == "n" call "%~dp0..\setsiono" concatenar vistas
set vistas=%siono%
if /i "%todos%" == "n" if /i "%vistas%" == "s" call "%~dp0..\setsiono" concatenar vistas-jasper
set jasper=%siono%
if /i "%todos%" == "n" if /i "%vistas%" == "s" call "%~dp0..\setsiono" concatenar vistas-web
set web=%siono%
echo.
set datos
set funciones
set vistas
set jasper
set web
echo.
if /i "%todos%" == "n" (
   pause
   echo.
)
call "%~dp0concatsql-100"
call "%~dp0concatsql-200"
call "%~dp0concatsql-300"
call "%~dp0concatsql-400"
call "%~dp0concatsql-500"
call "%~dp0concatsql-600"
dir %SQLDDLDIR%\%SSDATABASE%_SS*.sql
call "%~dp0..\eoj" "%~f0"
