@echo off
cd /d "%~dp0"

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
for /R "%HOMEDIR%" %%f in (*.backup) do echo "%%f">>%tokens1%
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

set EXE="%PGBINDIR%\pg_restore.exe"
rem CMD=%EXE% -c -i -d "%PGDATABASE%" -v %token%
set CMD=%EXE%    -i -d "%PGDATABASE%" -v %token%

echo.
echo %CMD%
echo.

call:init-psql-spool
echo %CMD%>>%PLOG%
echo %DATE% %TIME%>>%PLOG%
%CMD% 1>>%PLOG% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
echo %DATE% %TIME%>>%PLOG%
echo.
echo restore: %xerrorlevel%
echo.
call:open-psql-spool
goto:eof

:init-psql-spool
set dir="%~dp0logs"
set log="%~dp0logs\%~nx0.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% (del %log%) else (if not exist %dir% md %dir%)
)
echo %~f0 >> %PLOG%
goto:eof

:open-psql-spool
set log="%~dp0logs\%~nx0.log"
if /i %PLOG% == %log% (echo.) else (goto:eof)
set PLOG=
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof
