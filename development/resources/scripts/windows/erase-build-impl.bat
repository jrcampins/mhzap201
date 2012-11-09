@echo off
cd /d "%~dp0"

set log="%~dpn0.log"
set>%log%
del %log% /q

call:deleteSomeFiles %MHZAP201_VSWS%
pause
goto:eof


:sweepDirs
for /R "%~f1" %%f in (.)   do echo %%f>>%log%
goto:eof

:sweepFiles
for /R "%~f1" %%f in (*.*) do echo %%f>>%log%
goto:eof

:deleteSomeFiles
call:deleteFiles "%~f1" ant-deploy.xml?
call:deleteFiles "%~f1" build-impl.xml?
call:deleteFiles "%~f1" genfiles.properties?
goto:eof

:deleteFiles
echo delete "%2" @ "%~f1"
pause
for /R "%~f1" %%f in (%2) do (
call:deleteFile %%f
)
echo.
goto:eof

:deleteFile
echo "%~f1"
del "%~f1"
goto:eof
