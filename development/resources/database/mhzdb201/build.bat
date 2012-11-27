@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set PDQ1="%~dpn0.1"
set PDQ2="%~dpn0.2"
set PLOG="%~dpn0.log"
set XLOG=%PLOG%
if exist %PLOG% del %PLOG%

set EXE="%SSBINDIR%\osql.exe"

set CMD=%EXE% -d MHZMD201 -h-1 -w 250 -n -m-1
set OSQLUSER=%SSUSER%
set OSQLPASSWORD=%SSPASS%
set OSQLSERVER=%SSHOST%

set INDIR=%project_source_dir%\development\resources\scripts\sql\build
set OUTDIR1=%project_source_dir%\development\resources\scripts\windows\makedb
set OUTDIR2=%project_source_dir%\management\resources\scripts\windows\postgresql

call:runSQLFile %INDIR%\build-delete-metadata.sql	%OUTDIR1%\delete-metadata.sql
call:runSQLFile %INDIR%\build-dump-metadata-run.sql	%OUTDIR1%\dump-metadata-run.bat
call:runSQLFile %INDIR%\build-dump-userdata-run.sql	%OUTDIR1%\dump-userdata-run.bat
call:runSQLFile %INDIR%\build-dump-userdata-tokens.sql	%OUTDIR2%\dump-table-tokens.txt

pause
goto:eof

:runSQLFile
set /a xerrorlevel=0
echo -i "%~f1"
echo -o "%~f2"
set INFILE="%~f1"
set OUTFILE=%PDQ1%
if exist %OUTFILE% del %OUTFILE%
call %CMD% -i %INFILE% -o %OUTFILE% 1>>%PLOG% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
popd
echo.
echo psql: %xerrorlevel%
echo.
call:fixFile4 %OUTFILE% %2
if exist %OUTFILE% del %OUTFILE%
goto:eof

:fixFile1
set INFILE="%~f1"
set FLTRD="%~dpn1.1"
set SORTD="%~dpn1.2"
set KEYWD=%2
find /i %KEYWD% %INFILE%>%FLTRD%
sort < %FLTRD% > %SORTD%
goto:eof

:fixFile2
set INFILE="%~f1"
set FLTRD="%~dpn1.1"
set SORTD="%~dpn1.2"
set KEYWD="afectada"
find /v %KEYWD% %INFILE%>%FLTRD%
sort < %FLTRD% > %SORTD%
goto:eof

:fixFile3
set FLTRD="%~dpn1.1"
set SORTD="%~dpn1.2"
set KEYWD=%2
if exist %FLTRD% del %FLTRD%
if exist %SORTD% del %SORTD%
pushd "%~dp1"
set GROUP=%~nx1
set GROUP
set KEYWD
for /f "tokens=1* delims= " %%a in (%GROUP%) do (
if "%%a" == %KEYWD% echo %%a %%b>>%FLTRD%
)
sort < %FLTRD% > %SORTD%
popd
goto:eof

:fixFile4
set FLTRD=%PDQ2%
if exist %FLTRD% del %FLTRD%
if not exist "%~f1" echo f1 not exists "%~f1"
if not exist "%~f2" echo f2 not exists "%~f2"
if not exist "%~f1" goto:eof
if not exist "%~f2" goto:eof
set GROUP=%~nx1
set GROUP
set SORTD="%~f2"
set SORTD
echo.
pushd "%~dp1"
for /f "tokens=1,2* delims= " %%a in (%GROUP%) do (
set KEYWD=
if "%%c" == "afectada)"  set KEYWD=%%b
if "%%c" == "afectadas)" set KEYWD=%%b
if not defined KEYWD echo %%a %%b %%c>>%FLTRD%
)
popd
sort < %FLTRD% > %SORTD%
dir  %SORTD%>>%PLOG%
echo.>>%PLOG%
type %SORTD%>>%PLOG%
echo.>>%PLOG%
if exist %FLTRD% del %FLTRD%
goto:eof
