@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" restaura la base de datos a partir de un archivo respaldo
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

:ask
set tokenum=
echo.
set tokens1=token-list-1
set tokens2=token-list-2
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q
for /R "%SQLBACKDIR%" %%f in (*.DMP) do echo "%%f">>%tokens1%
if exist %tokens1% sort %tokens1% /o %tokens2%
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call show-token %%t
echo.
echo Escriba el numero correspondiente al archivo de respaldo que desea utilizar para restaurar la base de datos, 0 para salir sin restaurar
echo.
set tokenum=
set archivo=
set /p archivo="numero del archivo ? "
if /i "%archivo%" == "0" goto:eof
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call select-token %%t %archivo%
if not defined token goto ask
if not exist %token% goto ask
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q

call:set-nx1 %token%
set DUMPFILE=%nx1%
set LOGFILE=%nx1%.import.log
set log="%SQLBACKDIR%\%LOGFILE%"
if exist %log% del %log%

set logon=%dbuser%/%dbpass%@%dbhost%:%dbport%/%dbserv%

pushd "%ORACLE_HOME%\bin"
impdp %logon% SCHEMAS=%dbuser% DIRECTORY=%UPPER_CASE_PROJECT%_ARCHIVES DUMPFILE=%DUMPFILE% EXCLUDE=USER TABLE_EXISTS_ACTION=REPLACE LOGFILE=%LOGFILE%
popd
call "%~dp0..\eoj" "%~f0"
goto:eof

echo.
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof

:set-nx1
set nx1=%~nx1
goto:eof
