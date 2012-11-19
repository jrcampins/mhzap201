@echo off
rem   MHZAP201_SOURCE
rem   SOURCE=*.jsp
rem   TARGET=%MHZAP201_SOURCE%
rem   "%SOURCE%" "%TARGET%" /S
set   SOURCE=*.java
set   TARGET=%MHZAP201_SOURCE%
xcopy "%SOURCE%" "%TARGET%" /S
pause presione intro para continuar... 
exit
