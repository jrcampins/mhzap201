set EEAS=glassfish
set xs="%~dp0..\variables.bat"
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

if not defined variables pause
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
        call "%~dp0..\unset-variables.bat" %1 "%pdq%" no existe
    )
) else (
    call "%~dp0..\unset-variables.bat" la variable de entorno %1 no esta definida
)
goto:eof
