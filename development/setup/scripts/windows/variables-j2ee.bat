set MHZAP201_JDBC_DRIVER=
set MHZAP201_JDBC_URL=
set MHZAP201_JDBC_USER=
set MHZAP201_JDBC_PASSWORD=
set MHZAP201_RESOURCES_DIR=
if not defined variables goto:eof

if defined driver set MHZAP201_JDBC_DRIVER=%driver%
if defined dbcurl set MHZAP201_JDBC_URL=%dbcurl%
if defined dbuser set MHZAP201_JDBC_USER=%dbuser%
if defined dbpass set MHZAP201_JDBC_PASSWORD=%dbpass%
if not defined driver call:notDefined MHZAP201_JDBC_DRIVER
if not defined dbcurl call:notDefined MHZAP201_JDBC_URL
if not defined dbuser call:notDefined MHZAP201_JDBC_USER
if not defined dbpass call:notDefined MHZAP201_JDBC_PASSWORD
set resdir=%CRVLDIR%\resources
set MHZAP201_RESOURCES_DIR=%resdir%
call:checkDir %MHZAP201_RESOURCES_DIR%
goto:eof

:notDefined
set %1
set variables=
goto:eof

:checkDir
rem echo check "%~f1"
if exist "%~f1" goto:eof
echo el directorio "%~f1" no existe
set variables=
goto:eof
