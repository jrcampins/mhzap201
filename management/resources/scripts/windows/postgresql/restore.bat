@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" restaura la base de datos a partir de un archivo respaldo
call ..\setsiono ejecutar "%~n0"
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
if not exist "%~dp0logs" md "%~dp0logs"
set LOG="%~dp0logs\%~n0.log"

echo.
echo %CMD%
echo.
rem pause
echo %CMD%>%LOG%
echo %DATE% %TIME%>>%LOG%
%CMD% 1>>%LOG% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
echo %DATE% %TIME%>>%LOG%
echo.
echo restore: %xerrorlevel%
echo.

if defined XLOG goto:eof
call ..\setsiono desea ver el log de la ejecucion (%LOG%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %LOG%
goto:eof

:unreachable-statements
call ..\eoj "%~f0"
goto:eof
