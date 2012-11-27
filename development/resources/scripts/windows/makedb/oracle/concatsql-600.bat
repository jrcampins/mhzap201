@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo -->%SQLDDLDIR%\%O9DATABASE%_O9_600.sql
call "%~dp0concatsql-for" 600 sequences

call "%~dp0..\eoj" "%~f0"
