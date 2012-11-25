@echo off
cd /d "%~dp0"

if not defined VRNAME goto:eof
if not defined VRPATH goto:eof

call:echo1 %~n0 %VRNAME% "%VRPATH%"

set replacer="%ProgramFiles%\ABF\Tools\Replacer\Replacer.exe"
set dos2unix="%ProgramFiles%\GnuWin32\bin\dos2unix.exe"
set filedate="%ProgramFiles%\ABF\Tools\FileDate\FileDate.exe"

call:echo2 sweep-remove .
for /R "%VRPATH%" %%f in (.)	do call:sweep-remove %%f

call:echo2 sweep-delete *.*
for /R "%VRPATH%" %%f in (*.*)	do call:sweep-delete %%f

call:echo2 sweep-delete-file *.#*
for /R "%VRPATH%" %%f in (*.#*)	do call:sweep-delete-file "%%f"

call:replace-VnnRaammdd
call:convert-text-files
call:modify-files-date

pause
goto:eof

:echo1
echo.
echo %*
echo.
rem pause
rem echo.
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
if /i "%~x1" == ".plog"		call:sweep-delete-file "%1"
goto:eof

:sweep-delete-file
rem echo %~n0 %1
if not exist %1 goto:eof
echo del %1
del %1
goto:eof

:replace-VnnRaammdd
set findstring="VnnRaammdd"
set replacestring="%VRNAME%"
call:replacer bat
call:replacer properties
call:replacer sh
call:replacer sql
call:replacer txt
goto:eof

:replacer
set wildcard="%VRPATH%\*.%1"
%replacer% %wildcard% %findstring% %replacestring% /r
echo.
goto:eof

:convert-text-files
call:dos2unix *.jrtx
call:dos2unix *.jrxml
call:dos2unix *.osql
call:dos2unix *.password
call:dos2unix *.properties
call:dos2unix *.psql
call:dos2unix *.sh
call:dos2unix *.sql
call:dos2unix *.txt
call:dos2unix *.vm
call:dos2unix *.xml
goto:eof

:dos2unix
echo.
echo dos2unix %1
echo.
rem pause
rem echo.
for /R "%VRPATH%" %%f in (%1) do %dos2unix% -U "%%f"
echo.
goto:eof

:modify-files-date
%filedate% "%VRPATH%\*.*" %mm%/%dd%/%aaaa% %hh24%-00-00 /r
echo.
goto:eof
