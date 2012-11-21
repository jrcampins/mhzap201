rem ----------------------------------------------------------------------------
rem Si no se establece el valor de la variable MHZAP201_EEAS se usara GlassFish
rem ----------------------------------------------------------------------------
rem set MHZAP201_EEAS=GlassFish
rem set MHZAP201_EEAS=JBoss

rem ----------------------------------------------------------------------------
rem Si no se establece el valor de la variable MHZAP201_DBMS se usara PostgreSQL
rem ----------------------------------------------------------------------------
rem set MHZAP201_DBMS=Oracle
rem set MHZAP201_DBMS=PostgreSQL
rem set MHZAP201_DBMS=SQLServer

rem ----------------------------------------------------------------------------
rem Entorno de desarrollo
rem ----------------------------------------------------------------------------
call:set-source-dir
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
