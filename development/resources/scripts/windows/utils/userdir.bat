@echo off
set target=N:\userdir\config\Databases\CachedMetadata
if exist "%target%" rmdir %target% /s
set target=N:\userdir\var
if exist "%target%" rmdir %target% /s
pause
exit
