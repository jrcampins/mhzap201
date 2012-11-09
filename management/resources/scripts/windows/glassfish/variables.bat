set JDBC_HOST=
set JDBC_PORT=
set JDBC_CONNECTION_ID=
set JDBC_USER=
set JDBC_PASSWORD=
set JDBC_DATABASE=
set JDBC_URL=
set JDBC_DRIVER=
set ASADMIN=
set GFDOMAINNAME=
set GFDOMAINCDIR=
set GFDOMAINCST1=
set GFDOMAINCST2=

set eeas=glassfish
set EEAS_OVERRIDE=GlassFish

call ..\variables
if not defined variables goto:eof

set JDBC_HOST=%dbhost%
set JDBC_PORT=%dbport%
set JDBC_CONNECTION_ID=%dbconnid%
set JDBC_USER=%dbuser%
set JDBC_PASSWORD=%dbpass%
set JDBC_DATABASE=%dbname%
set JDBC_URL=%dbcurl%
set JDBC_DRIVER=%driver%
set ASADMIN="%GLASSFISH_HOME%\bin\asadmin.bat"
set GFDOMAINNAME=%domain%
set GFDOMAINCDIR="%GLASSFISH_HOME%\domains\%GFDOMAINNAME%\config"
set GFDOMAINCST1=%ascst1%
set GFDOMAINCST2=%ascst2%

call:check-exist ASADMIN
call:check-exist aspassfile
call:check-exist GFDOMAINCDIR

goto:eof

:check-exist
set pdq=%1
rem set pdq
if not defined pdq goto:eof
call set pdq=%%%pdq%%%
if defined pdq (
    rem set pdq
    rem remove double quotes
    for /f "useback tokens=*" %%a in ('%pdq%') do set pdq=%%~a
)
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
