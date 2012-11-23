@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

set delete_ignored=N
set /p delete_ignored="eliminar todos los archivos ignorados ? (S/N) [%delete_ignored%] "
if not defined delete_ignored goto:eof
if /i "%delete_ignored%" NEQ "S" goto:eof

call:del1 %sourcedir% *.lnk
call:del1 %sourcedir% *.log

call:del2 %sourcedir%\management\backup\*.backup
call:del2 %sourcedir%\management\resources\database\ddl\*.sql

call:del2 %sourcedir%\management\resources\database\ddl\oracle\custom\packages\*.sql
call:del2 %sourcedir%\management\resources\database\ddl\oracle\functions\*.sql
call:del2 %sourcedir%\management\resources\database\ddl\oracle\packages\*.sql
call:del2 %sourcedir%\management\resources\database\ddl\oracle\packages-for-views\*.sql
call:del2 %sourcedir%\management\resources\database\ddl\oracle\triggers\*.sql

call:del2 %sourcedir%\management\resources\database\ddl\postgresql\functions\*.sql

call:del2 %sourcedir%\management\resources\jasper\reports\resources\*.*
call:del2 %sourcedir%\management\resources\jasper\reports\subreports\resources\*.*
call:del2 %sourcedir%\management\resources\jasper\reports\web\resources\*.*

pause
goto:eof

call %~dp0build-clean
call %~dp0erase-build-impl

pause
goto:eof

:del1
echo delete %1\%2
pause
for /R "%~f1" %%f in (%2) do (
    call:del2 %%f
)
echo.
goto:eof

:del2
echo delete %1
del %1
echo.
goto:eof
