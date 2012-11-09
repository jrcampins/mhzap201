@echo off
cd /d "%~dp0"
set log="%~d0\%~n0.log"
echo %DATE% %TIME%>%log%
if exist "I:\" subst I: /d
subst I: "C:\Archivos de programa"
if exist "J:\" subst J: /d
subst J: "C:\Archivos de programa\Java"
if exist "N:\" subst N: /d
subst N: "C:\NetBeans\NB67"
if exist "P:\" subst P: /d
subst P: "C:\Proyectos"
if exist "R:\" subst R: /d
subst R: "C:\Respaldos"
if exist "S:\" subst S: /d
subst S: "C:\Setup"
if exist "W:\" subst W: /d
subst W: "C:\CVSNT\desarrollo"
echo.>>%log%
subst>>%log%
echo.>>%log%
set dircmd=/a:d-h-s /d /o:n
dir "I:\">>%log%
dir "J:\">>%log%
dir "N:\">>%log%
dir "P:\">>%log%
dir "R:\">>%log%
dir "S:\">>%log%
dir "W:\">>%log%
start /d %windir% notepad %log%
exit
