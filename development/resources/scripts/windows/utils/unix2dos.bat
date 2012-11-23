@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

set U2D="%ProgramFiles%\GnuWin32\bin\unix2dos.exe"
if not exist %U2D% goto:eof

cd  /d "%MHZAP201_SOURCE%\management\resources"
for /R "%CD%" %%f in (*.jrxml)      do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.password)   do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.properties) do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.psql)       do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.bat)        do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.sql)        do %U2D% -D "%%f"
for /R "%CD%" %%f in (*.vm)         do %U2D% -D "%%f"
pause
exit
