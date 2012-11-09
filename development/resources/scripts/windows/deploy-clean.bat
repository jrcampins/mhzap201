@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof
call:sub1
pause
goto:eof

:sub1
set ASADMIN="%GLASSFISH_HOME%\bin\asadmin.bat"
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
for /D %%d in (%MHZAP201_VSWS%\*) do call:sub2 %%d
echo.
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
goto:eof

:sub2
set CMD=undeploy
set STD="%~f1\src\conf\application.xml"
set SUN="%~f1\src\conf\sun-application.xml"
set EAP=%~n1
set EAQ="%GLASSFISH_HOME%\domains\domain1\applications\%~n1"
set EAR="%~f1\dist\%~n1.ear"
if  not exist %STD% goto DONE
if  not exist %SUN% goto DONE
if  not exist %EAQ% goto DONE

:LOOP
shift
set str=%1
for /f "useback tokens=*" %%a in ('%str%') do set str=%%~a
if "%str%"=="" goto DOIT
set CMD=%CMD% %str%
goto LOOP

:DOIT
set CMD=%CMD% %EAP%
echo.
if defined siono goto TEST
set siono=S
set /p siono="%CMD% (S/N) [%siono%] "

:TEST
if /i "%siono%" NEQ "S" goto DONE

echo.
echo %ASADMIN% %ascst2% %CMD%
call %ASADMIN% %ascst2% %CMD% 2>&1

:DONE
set siono=
goto:eof
