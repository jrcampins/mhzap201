@echo off
@echo %CD%
@echo.
cd /d c:\
@echo %CD%
@echo.
if not exist syswk1 md syswk1
cd /d c:\syswk1
@echo %CD%
@echo.
if not exist ireport md ireport
cd /d c:\syswk1\ireport
@echo %CD%
@echo.
if not exist backup md backup
if not exist compilation md compilation
if not exist virtualizer md virtualizer
dir
pause
exit
