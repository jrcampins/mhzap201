set variables=
set eeas=jboss
set EEAS_OVERRIDE=JBoss
call:set-home-dir
set xs=%MHZAP201_HOME%\variables.bat
if exist %xs% call %xs%
if not defined variables goto:eof

set JDBC_HOST=%dbhost%
set JDBC_PORT=%dbport%
set JDBC_CONNECTION_ID=%dbconnid%
set JDBC_USER=%dbuser%
set JDBC_PASSWORD=%dbpass%
set JDBC_DATABASE=%dbname%
set JDBC_URL=%dbcurl%
set JDBC_DRIVER=%driver%

goto:eof

:set-home-dir
pushd "%~dp0"
call:set-home-dir-loop
popd
goto:eof

:set-home-dir-loop
set currdir=%CD%
if exist HOME (
    if not exist HOME\nul (
        set MHZAP201_HOME=%currdir%
        goto:eof
    )
)
cd ..
if "%currdir%" == "%CD%" (
    set MHZAP201_HOME=%currdir%mhzap201\home
    goto:eof
)
call:set-home-dir-loop
goto:eof
