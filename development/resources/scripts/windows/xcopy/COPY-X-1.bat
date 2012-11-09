@echo off

set J2APPS=N:\glassfish\glassfish\domains\domain1\applications
set WEBWAR=%J2APPS%\mhzap201\mhzap201-web_war

if not defined MHZAP201_VSWS goto ERR1
if not exist %MHZAP201_VSWS% goto ERR2

set P1=%MHZAP201_VSWS%\mhzap201-web-template
set X1=%P1%

if not defined P1 goto ERR3
if not exist %P1% goto ERR4

set P2=web
set X2=%P1%\%P2%

if not defined P2 goto ERR5
if not exist %X2% goto ERR6

goto RESOURCES

:WEB1

xcopy W:\mhzap201\mhzap201-web\web\redirect.html    %WEBWAR% /y
xcopy W:\mhzap201\mhzap201-web\web\index.jsp        %WEBWAR% /y
xcopy W:\mhzap201\mhzap201-web\web\keep.jsp         %WEBWAR% /y
xcopy W:\mhzap201\mhzap201-web\web\reject.jsp       %WEBWAR% /y

pause
exit

:WEB2

for /D %%f in (%MHZAP201_VSWS%\mhzap201-web*)            do call XCOPY-X-2   %P1% %P2% index.html     %%f
for /D %%f in (%MHZAP201_VSWS%\mhzap201-web*)            do call XCOPY-X-2   %P1% %P2% error.jsp      %%f
for /D %%f in (%MHZAP201_VSWS%\mhzap201-web*)            do call XCOPY-X-2   %P1% %P2% login.jsp      %%f

pause
exit

:WEB3

for /D %%f in (%J2APPS%\mhzap201\mhzap201-web*)     do call XCOPY-X-2-2 %P1% %P2% index.html     %%f
for /D %%f in (%J2APPS%\mhzap201\mhzap201-web*)     do call XCOPY-X-2-2 %P1% %P2% error.jsp      %%f
for /D %%f in (%J2APPS%\mhzap201\mhzap201-web*)     do call XCOPY-X-2-2 %P1% %P2% login.jsp      %%f

for /D %%f in (%J2APPS%\mhzap201-sdk\mhzap201-web*) do call XCOPY-X-2-2 %P1% %P2% index.html     %%f
for /D %%f in (%J2APPS%\mhzap201-sdk\mhzap201-web*) do call XCOPY-X-2-2 %P1% %P2% error.jsp      %%f
for /D %%f in (%J2APPS%\mhzap201-sdk\mhzap201-web*) do call XCOPY-X-2-2 %P1% %P2% login.jsp      %%f

pause
exit

:JS

set P2=web\resources
set X2=%P1%\%P2%

if not defined P2 goto ERR5
if not exist %X2% goto ERR6

for /D %%f in (%MHZAP201_VSWS%\mhzap201-web*)            do call XCOPY-X-2   %P1% %P2% javascript1.js %%f
for /D %%f in (%J2APPS%\mhzap201\mhzap201-web*)     do call XCOPY-X-2-2 %P1% %P2% javascript1.js %%f
for /D %%f in (%J2APPS%\mhzap201-sdk\mhzap201-web*) do call XCOPY-X-2-2 %P1% %P2% javascript1.js %%f

pause
exit

xcopy W:\mhzap201\mhzap201-web\web\Favoritos.jsp    %WEBWAR% /y
xcopy W:\mhzap201\mhzap201-web\web\Password.jsp     %WEBWAR% /y
exit

:RESOURCES

set P2=web
set P2=web\resources

set P2=web
set X2=%P1%\%P2%

if not defined P2 goto ERR5
if not exist %X2% goto ERR6

set P3=index.html
set P3=error.jsp
set P3=login.jsp
set P3=javascript1.js
set P3=stylesheet.css
set P3=*.gif
set P3=*.jpg

set P3=login.jsp
set X3=%P1%\%P2%\%P3%

if not defined P3 goto ERR7
if not exist %X3% goto ERR8

echo.
echo copiar archivo %X3%
echo.
pause

for /D %%f in (%MHZAP201_VSWS%\mhzap201-web*)              do call XCOPY-X-2   %P1% %P2% %P3% %%f
for /D %%f in (%J2APPS%\mhzap201\mhzap201-web*)     do call XCOPY-X-2-2 %P1% %P2% %P3% %%f
for /D %%f in (%J2APPS%\mhzap201-sdk\mhzap201-web*) do call XCOPY-X-2-2 %P1% %P2% %P3% %%f

goto DONE

:ERR1
set ERRMSG=variable de entorno MHZAP201_VSWS no definida (MHZAP201_VSWS corresponde a la ruta de su directorio de trabajo de CVS)
goto TELL

:ERR2
set ERRMSG=directorio %MHZAP201_VSWS% no existe
goto TELL

:ERR3
set ERRMSG=variable de entorno P1 no definida (P1 corresponde a la ruta del directorio origen)
goto TELL

:ERR4
set ERRMSG=directorio %P1% no existe
goto TELL

:ERR5
set ERRMSG=variable de entorno P2 no definida (P2 corresponde a la ruta del directorio origen)
goto TELL

:ERR6
set ERRMSG=directorio %X2% no existe
goto TELL

:ERR7
set ERRMSG=variable de entorno P3 no definida (P3 corresponde a la ruta del archivo origen)
goto TELL

:ERR8
set ERRMSG=archivo %X3% no existe
goto TELL

:TELL
@echo.
@echo %ERRMSG%
@echo.
pause

:DONE
pause
exit
