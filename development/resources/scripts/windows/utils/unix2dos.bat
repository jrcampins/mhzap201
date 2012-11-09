@echo off
set U2D="C:\Archivos de programa\GnuWin32\bin\unix2dos.exe"
if not exist %U2D% exit
if not defined MHZAP201_VSWS exit
cd  /d "%MHZAP201_VSWS%\management\resources"
for /R "%CD%" %%f in (*.jrxml)      do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.password)   do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.properties) do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.psql)       do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.bat)        do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.sql)        do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.vm)         do %U2D% -D "%%f"
pause
exit
