set JDBC_HOST=
set JDBC_PORT=
set JDBC_CONNECTION_ID=
set JDBC_USER=
set JDBC_PASSWORD=
set JDBC_DATABASE=
set JDBC_URL=
set JDBC_DRIVER=
set JBADMIN=
set JBDOMAINNAME=
set JBDOMAINCDIR=
set JBDOMAINCST1=
set JBDOMAINCST2=

set eeas=jboss
set EEAS_OVERRIDE=JBoss

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
set JBADMIN="%JBOSS_HOME%\bin\jboss-cli.bat"
set JBDOMAINNAME=%domain%
set JBDOMAINCDIR="%JBOSS_HOME%\domain\configuration"
set JBDOMAINCST1=%jbcst1%
set JBDOMAINCST2=%jbcst2%

if not exist %JBADMIN%      call ..\unset-variables el archivo %JBADMIN% no existe
if not exist %jbpassfile%   call ..\unset-variables el archivo %jbpassfile% no existe
if not exist %JBDOMAINCDIR% call ..\unset-variables el directorio %JBDOMAINCDIR% no existe
