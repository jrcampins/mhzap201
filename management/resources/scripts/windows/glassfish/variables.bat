set variables=
set eeas=glassfish
set EEAS_OVERRIDE=GlassFish
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
set ASADMIN=%GLASSFISH_HOME%\bin\asadmin.bat
set GFDOMAINNAME=%domain%
set GFDOMAINCDIR=%GLASSFISH_HOME%\domains\%GFDOMAINNAME%\config
set GFDOMAINCST1=%ascst1%
set GFDOMAINCST2=%ascst2%

call:check-exist ASADMIN
call:check-exist aspassfile
call:check-exist GFDOMAINCDIR

goto:eof

:check-exist
set pdq=%1
call set pdq=%%%pdq%%%
rem remove double quotes
if defined pdq set pdq=%pdq:"=%
if defined %1 (
    if exist "%pdq%" (
        rem set %1
    ) else (
        call ..\unset-variables %1 "%pdq%" no existe
    )
) else (
    call ..\unset-variables la variable de entorno %1 no esta definida
)
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
