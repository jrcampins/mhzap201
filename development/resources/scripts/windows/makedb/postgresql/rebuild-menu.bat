@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

pushd "%project_source_dir%\management\resources\scripts\windows\%dbms%"
call psql "%~dpn0.psql"
popd

call "%~dp0..\eoj" "%~f0"
