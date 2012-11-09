@echo off
cd /d "%~dp0"
set log="%~d0\%~n0.log"
echo %DATE% %TIME%>%log%
if exist "I:\" subst I: /d
if exist "J:\" subst J: /d
if exist "N:\" subst N: /d
if exist "P:\" subst P: /d
if exist "R:\" subst R: /d
if exist "S:\" subst S: /d
if exist "W:\" subst W: /d
echo.>>%log%
subst>>%log%
echo.>>%log%
start /d %windir% notepad %log%
exit
