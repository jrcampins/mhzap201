if not defined variables goto:eof

set BACKUPDIR=%MHZAP201_SOURCE%\management\backup
set SQLDDLDIR=%MHZAP201_SOURCE%\management\resources\database\ddl

if defined MAINBAT goto:eof

set MAINBAT="%~f1"
set DIRBAT1=%CD%
pushd ..
set DIRBAT2=%CD%
popd

if not exist "%BACKUPDIR%" md "%BACKUPDIR%"
if not exist "%BACKUPDIR%" call %DIRBAT2%\variables-reset el directorio "%BACKUPDIR%" no existe
if not exist "%SQLDDLDIR%" call %DIRBAT2%\variables-reset el directorio "%SQLDDLDIR%" no existe
