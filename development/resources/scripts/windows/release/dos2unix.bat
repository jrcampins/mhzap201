@echo off
cd /d "%~dp0"
call variables
call variables-date-time
set folder=V20R%aa%%mm%%dd%
if not exist "%folder%" goto:eof
set d2u="%ProgramFiles%\GnuWin32\bin\dos2unix.exe"
for /R "%folder%" %%f in (*.jrxml) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.password) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.properties) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.psql) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.sh) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.sql) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.txt) do %d2u% -U "%%f"
for /R "%folder%" %%f in (*.vm) do %d2u% -U "%%f"
pause
