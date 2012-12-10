@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

if /i "%funciones%" == "n" (
    call "%~dp0..\concatsql-key" 500 triggers
) else (
    call "%~dp0..\concatsql-for" 500 triggers
)

set subdir="%SQLHOMEDIR%\triggers"
if exist %subdir% rd %subdir% /s /q

call "%~dp0..\eoj" "%~f0"
