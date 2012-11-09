if "%~f4" == "%~f1"  goto SKIP
if "%~x2" == ".java" goto JAVA

echo xcopy "%1\%2\%3" "%4\%2" /s /y
xcopy "%1\%2\%3" "%4\%2" /s /y
goto DONE

:JAVA
echo xcopy java disabled!

:DONE
echo.

:SKIP
