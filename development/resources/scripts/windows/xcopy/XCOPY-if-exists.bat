@echo off
if exist "%TARGET%\%SUBDIR%\%~nx1" xcopy "%~f1" "%TARGET%\%SUBDIR%" /Y
