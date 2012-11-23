@echo off
cd /d "%~dp0"
call variables
set U2D="%ProgramFiles%\GnuWin32\bin\unix2dos.exe"
if not exist %U2D% goto:eof

cd  /d "%sourcedir%\management\resources"
for /R "%CD%" %%f in (*.jrxml)      do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.password)   do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.properties) do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.psql)       do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.bat)        do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.sql)        do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.vm)         do %U2D% -D "%%f"
pause
exit
