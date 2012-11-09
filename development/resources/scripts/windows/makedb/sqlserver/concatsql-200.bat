@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo -->%SQLDDLDIR%\%SSDATABASE%_SS_200.sql
echo -->%SQLDDLDIR%\%SSDATABASE%_SS_200_METADATA.sql
echo -->%SQLDDLDIR%\%SSDATABASE%_SS_200_USERDATA.sql
if /i "%datos%" == "n"  goto EOJ
call %DIRBAT1%\concatsql-for 200 data

set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_METADATA.sql"
set BAT="%~dpn0-run-cmd"
if not exist "%~dp0logs" md "%~dp0logs"
set LOG="%~dp0logs\%~n0.log"

echo %BAT%>%LOG%
echo.>>%LOG%
echo %BAK%>>%LOG%
echo.>>%LOG%
echo.
type %DIRBAT2%\delete-metadata.sql>%SQLDDLDIR%\%SSDATABASE%_SS_200_METADATA.sql
call %DIRBAT2%\dump-metadata-run
echo.
set BAK="%SQLDDLDIR%\%SSDATABASE%_SS_200_USERDATA.sql"
echo.>>%LOG%
echo %BAK%>>%LOG%
echo.>>%LOG%
echo.
call %DIRBAT2%\dump-userdata-run
echo.

:EOJ
echo.
call %DIRBAT2%\eoj "%~f0"
if defined keep_200_log goto:eof
if not defined LOG goto:eof
if exist %LOG% del %LOG%
goto:eof
