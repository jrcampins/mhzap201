set JAVA_HOME=%ProgramFiles%\Java\jdk1.7.0_05

set GLASSFISH_HOME=C:\glassfish\glassfish

set JBOSS_HOME=C:\jboss

set ORACLE_HOME=C:\oraclexe\app\oracle\product\11.2.0\server

set POSTGRESQL_HOME=%ProgramFiles%\PostgreSQL\9.0

set SQLSERVER_HOME=%ProgramFiles%\Microsoft SQL Server
set SQLSERVER_MSSQL=%SQLSERVER_HOME%\MSSQL
set SQLSERVER_TOOLS=%SQLSERVER_HOME%\80\Tools

set MHZAP201_EEAS=JBoss
set MHZAP201_EEAS=GlassFish

set MHZAP201_DBMS=Oracle
set MHZAP201_DBMS=SQLServer
set MHZAP201_DBMS=PostgreSQL

set MHZAP201_DIST=%MHZAP201_HOME%

rem ----------------------------------------------------------------------------
rem Entorno de desarrollo
rem ----------------------------------------------------------------------------
call:set-source-dir
set GLASSFISH_HOME=N:\glassfish\glassfish
set MHZAP201_DIST=%sourcedir%\mhzap201\dist
set sourcedir=
goto:eof

:set-source-dir
set sourcedir=
pushd "%~dp0"
call:set-source-dir-loop
popd
goto:eof

:set-source-dir-loop
set currdir=%CD%
if exist .svn\nul (
    set sourcedir=%currdir%
    goto:eof
)
cd ..
if "%currdir%" == "%CD%" (
    set sourcedir=%currdir%mhzap201\source
    goto:eof
)
call:set-source-dir-loop
goto:eof
