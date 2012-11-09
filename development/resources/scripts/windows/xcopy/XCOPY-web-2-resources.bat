set SOURCE="%~f1\%2\%3"
set TARGET="%MHZAP201_VSWS%\%~n1\%2"
if not exist %TARGET% goto done
set EXECMD=xcopy %SOURCE% %TARGET% /S /Y
echo %EXECMD%
%EXECMD%
:done
@echo.
