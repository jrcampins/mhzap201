@echo off
set D2U="C:\Archivos de programa\GnuWin32\bin\dos2unix.exe"
if not exist %D2U% exit
if not defined MHZAP201_VSWS exit
cd  /d "%MHZAP201_VSWS%\management\resources"
rem /R "%CD%" %%f in (*.jrxml)      do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.password)   do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.properties) do %D2U% -U "%%f"
rem /R "%CD%" %%f in (*.psql)       do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.sh)         do %D2U% -U "%%f"
rem /R "%CD%" %%f in (*.sql)        do %D2U% -U "%%f"
rem /R "%CD%" %%f in (*.vm)         do %D2U% -U "%%f"
cd  /d "%MHZAP201_VSWS%\management\setup\scripts\linux"
for /R "%CD%" %%f in (asadmin)      do %D2U% -U "%%f"
for /R "%CD%" %%f in (profile)      do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.sh)         do %D2U% -U "%%f"
for /R "%CD%" %%f in (*.txt)        do %D2U% -U "%%f"
rem %D2U% -U "%CD%\asadmin"
rem %D2U% -U "%CD%\profile"
pause
exit
