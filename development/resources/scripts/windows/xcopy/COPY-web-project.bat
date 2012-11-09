set SOURCE="%~f1"
set ORIGEN="%~f1\*.*"
set TARGET="%MHZAP201_VSWS%\%~n1"
set CVSDIR="%MHZAP201_VSWS%\%~n1\CVS"

if exist %CVSDIR% goto SKIP1
if not exist %SOURCE% goto SKIP2

echo copying %ORIGEN% to %TARGET%
echo.

if exist %TARGET% xcopy %ORIGEN% %TARGET% /S /Y
if not exist %TARGET% echo D|xcopy %ORIGEN% %TARGET% /S

goto DONE

:SKIP1
echo skiping %SOURCE%
goto DONE

:SKIP2
echo %SOURCE% does not exist
goto DONE

:DONE
echo.
