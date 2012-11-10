@echo off
cd /d "%~dp0"
call variables-date-time
if exist "%~f1" (set folder=%~f1) else (set folder=V10R%aa%%mm%%dd%)
if not exist "%folder%" goto:eof
call:echo1 %~n0 %folder%

set abf="C:\Setup\abfTools\FileDate\FileDate"
set gnu="C:\Archivos de programa\GnuWin32\bin\dos2unix.exe"

call:echo2 sweep-remove .
for /R "%folder%" %%f in (.)	do call:sweep-remove %%f

call:echo2 sweep-delete *.*
for /R "%folder%" %%f in (*.*)	do call:sweep-delete %%f

call:echo2 sweep-delete-file *.#*
for /R "%folder%" %%f in (*.#*)	do call:sweep-delete-file "%%f"

call:dos2unix *.jrxml
call:dos2unix *.password
call:dos2unix *.properties
call:dos2unix *.psql
call:dos2unix *.sh
call:dos2unix *.sql
call:dos2unix *.txt
call:dos2unix *.vm

call:echo2 %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-00-00 /r
call %abf% %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-00-00 /r

pause
goto:eof

:echo1
echo.
echo %*
echo.
pause
goto:eof

:echo2
echo.
echo %*
echo.
goto:eof

:sweep-remove
rem echo %~n0 %1
if "%~n1" == "build"		call:sweep-remove-folder "%~dpn1"
if "%~n1" == "dist"		call:sweep-remove-folder "%~dpn1"
if "%~n1" == "CVS"		call:sweep-remove-folder "%~dpn1"
if "%~n1" == "RevisionCache"	call:sweep-remove-folder "%~dpn1"
goto:eof

:sweep-remove-folder
rem echo %~n0 %1
if not exist %1 goto:eof
echo rmdir %1
rmdir %1 /s /q
goto:eof

:sweep-delete
rem echo %~n0 %1
if /i "%~x1" == ".cvsignore"	call:sweep-delete-file "%1"
if /i "%~x1" == ".lnk"		call:sweep-delete-file "%1"
if /i "%~x1" == ".log"		call:sweep-delete-file "%1"
goto:eof

:sweep-delete-file
rem echo %~n0 %1
if not exist %1 goto:eof
echo del %1
del %1
goto:eof

:dos2unix
echo.
echo dos2unix %1
echo.
rem pause
for /R "%folder%" %%f in (%1) do %gnu% -U "%%f"
goto:eof