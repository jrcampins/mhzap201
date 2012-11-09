@echo off
pause
exit

:WEB
@echo.
set   SOURCE=%MHZAP201_VSWS%\mhzap201-web-template
set   SOURCE
@echo.
if exist "%SOURCE%\." xcopy "%SOURCE%\.cvsignore" "%MHZAP201_VSWS%\mhzap201-web-toolkit" /S
pause
exit

:LIB
@echo.
set   SOURCE=%MHZAP201_VSWS%\commons-lib
set   SOURCE
@echo.
if exist "%SOURCE%\." xcopy "%SOURCE%\.cvsignore" "%MHZAP201_VSWS%\management" /S
pause
exit

:EAX
@echo.
set   SOURCE=%MHZAP201_VSWS%\mhzap201-000
set   SOURCE
@echo.
if exist "%SOURCE%\." xcopy "%SOURCE%\.cvsignore" "%MHZAP201_VSWS%\mhzap201-202" /S
pause
exit

:EJB
@echo.
set   SOURCE=%MHZAP201_VSWS%\mhzap201-ejb-persistence
set   SOURCE
@echo.
set   TARGET=%MHZAP201_VSWS%\mhzap201-ejb-core
set   TARGET
@echo.
if exist "%SOURCE%\." xcopy "%SOURCE%\.cvsignore" "%TARGET%" /S
pause
exit
