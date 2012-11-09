@echo off
cd /d "%~dp0"

call:writeJarNamesFile N:\glassfish\glassfish\modules
pause
echo.

call:writeJarNamesFile W:\zip\eclipselink-plugins-2.4.0.v20120608-r11652
pause
echo.

call:writeJarNamesFile W:\third-party\lib\eclipselink\2.3.2
pause
echo.

call:writeJarNamesFile W:\third-party\lib\eclipselink\2.4.0
pause
echo.

goto:eof

:checkFiles
set SOURCE=%1
for /f "tokens=1*" %%t in (%~n0) do (
    if exist %SOURCE%\%%t.jar (
        echo %SOURCE%\%%t.jar
    ) else (
        echo %SOURCE%\%%t.jar DOES NOT EXIST
    )
)
goto:eof

:writeBatFile
set SOURCE=%1
set TARGET=-%~n1.bat
if exist %TARGET% del %TARGET%
for /f "tokens=1*" %%t in (%~n0) do (
    if exist %SOURCE%\%%t.jar (
        echo %SOURCE%\%%t.jar
        echo %SOURCE%\%%t.jar >> %TARGET%
    ) else (
        echo %SOURCE%\%%t_*.jar
        dir  %SOURCE%\%%t_*.jar /B >> %TARGET%
    )
)
goto:eof

:writeJarNamesFile
set SOURCE=%1
set TARGET=-%~n1.txt
if exist %TARGET% del %TARGET%
for  %%f in (%SOURCE%\*.jar) do echo %%f>>%TARGET%
goto:eof
