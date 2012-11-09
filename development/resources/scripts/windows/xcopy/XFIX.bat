@echo off
rem   MHZAP201_VSWS
rem   SOURCE=*.jsp
rem   TARGET=%MHZAP201_VSWS%
rem   "%SOURCE%" "%TARGET%" /S
set   SOURCE=*.java
set   TARGET=%MHZAP201_VSWS%
xcopy "%SOURCE%" "%TARGET%" /S
pause presione intro para continuar... 
exit
