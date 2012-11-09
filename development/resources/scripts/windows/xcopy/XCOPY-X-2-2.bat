if "%~f4" == "%~f1"  goto SKIP
if "%~x2" == ".java" goto JAVA

if "%~n2" EQU "web"  set TARGET="%~f4"
if "%~n2" NEQ "web"  set TARGET="%~f4\%~n2"

echo xcopy "%1\%2\%3" %TARGET% /s /y
xcopy "%1\%2\%3" %TARGET% /s /y
goto DONE

:JAVA
echo xcopy java disabled!

:DONE
echo.

:SKIP
