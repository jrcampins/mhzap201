@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo -->%SQLDDLDIR%\%PGDATABASE%_PG_600.sql
call "%~dp0concatsql-for" 600 sequences

call "%~dp0..\eoj" "%~f0"
