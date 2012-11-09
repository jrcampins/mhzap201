@echo off
set APPLID=%~n1
set SOURCE=W:\workspace\%APPLID%
set TARGET=%MHZAP201_VSWS%\%APPLID%
set CVSDIR=%TARGET%\CVS
if exist "%SOURCE%\." set SOURCE
if exist "%TARGET%\." set TARGET
if exist "%CVSDIR%\." set CVSDIR
echo.
if not exist "%SOURCE%\." goto SKIP
if exist "%CVSDIR%\." goto SKIP
set ORIGEN=%SOURCE%\web\WEB-INF\sun-web.xml
set SUBDIR=%TARGET%\web\WEB-INF
set ORIGEN=%SOURCE%\*.*
set SUBDIR=%TARGET%
if exist "%TARGET%\." xcopy %ORIGEN% %SUBDIR% /S /Y
if not exist "%TARGET%\." echo D|xcopy %ORIGEN% %SUBDIR% /S
:SKIP
:DONE
echo.
