@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea un archivo respaldo de la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

:ask1
set SUFIJO=%aaaammdd%
set /p SUFIJO="sufijo del archivo de respaldo [%SUFIJO%] "
if not defined SUFIJO goto ask1
set SUFIJO

:ask2
set formato=p
set /p formato="formato (p=sql, c=backup, t=tar) [%formato%] "
set extension=
if /i "%formato%" == "p" set extension=sql
if /i "%formato%" == "c" set extension=backup
if /i "%formato%" == "t" set extension=tar
if not defined extension goto ask2
set formato

:ask3
set tokenum=
echo.
set tokens2=%~n0-tokens.txt
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call show-token %%t
echo.
echo Escriba el numero correspondiente a la tabla que desea respaldar, 0 para salir sin respaldar
echo.
set tokenum=
set archivo=
set /p archivo="numero del archivo ? "
if /i "%archivo%" == "0" goto:eof
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call select-token %%t %archivo%
if not defined token goto ask3

set EXE="%PGBINDIR%\pg_dump.exe"
set BAK="%BACKUPDIR%\%PGDATABASE%_%token%_%SUFIJO%.%extension%"
set CMD=%EXE% -a -E UTF8 -f %BAK% -F %formato% -i -t public.%token% -v

echo.
echo %CMD%
echo.
if exist "%BAK%" del "%BAK%"

call:init-psql-spool
echo %CMD%>>%PLOG%
echo %DATE% %TIME% %CD% %PGDATABASE%>>%PLOG%
%CMD% 1>>%PLOG% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
echo %DATE% %TIME% %CD% %PGDATABASE%>>%PLOG%
echo.
echo dump: %xerrorlevel%
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
