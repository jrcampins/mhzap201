@echo off
cd /d "%~dp0"
call variables
set D2U="%ProgramFiles%\GnuWin32\bin\dos2unix.exe"
if not exist %D2U% exit
if not defined MHZAP201_SOURCE exit
cd  /d "%MHZAP201_SOURCE%\management\resources"
rem /R "%CD%" %%f in (*.jrxml)      do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.password)   do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.properties) do %D2U% -U "%%f"
rem /R "%CD%" %%f in (*.psql)       do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.sh)         do %D2U% -U "%%f"
rem /R "%CD%" %%f in (*.sql)        do %D2U% -U "%%f"
rem /R "%CD%" %%f in (*.vm)         do %D2U% -U "%%f"
cd  /d "%MHZAP201_SOURCE%\management\setup"
for /R "%CD%" %%f in (asadmin)      do %D2U% -U "%%f"
for /R "%CD%" %%f in (profile)      do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.sh)         do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.txt)        do %D2U% -U "%%f"
rem %D2U% -U "%CD%\asadmin"
rem %D2U% -U "%CD%\profile"
pause
exit
