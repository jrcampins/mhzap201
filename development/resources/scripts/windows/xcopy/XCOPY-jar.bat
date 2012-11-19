@echo off
echo.
set   TARGET=%MHZAP201_SOURCE%\mhzap201\src\resources\lib
set   TARGET
del   %TARGET%\*.jar
echo.

goto  V2

:V1

echo.
set   SOURCE=C:\tomcat\common\lib
set   SOURCE
echo.
copy  %SOURCE%\commons-collections-3.2.jar	%TARGET%
copy  %SOURCE%\commons-lang-2.0.jar		%TARGET%
copy  %SOURCE%\jasperreports-2.0.1.jar		%TARGET%
copy  %SOURCE%\joda-time-1.2.1.jar		%TARGET%
copy  %SOURCE%\log4j-1.2.9.jar			%TARGET%
copy  %SOURCE%\velocity-1.5.jar			%TARGET%

goto  EOB

:V2

echo.
set   SOURCE=C:\NB60\ide8\modules\ext
set   SOURCE
echo.
REM * %SOURCE%\postgresql-8.2-506.jdbc3.jar	%TARGET%

echo.
set   SOURCE=C:\NB60\visualweb1\modules\ext
set   SOURCE
echo.
REM * %SOURCE%\sqlx.jar				%TARGET%

echo.
set   SOURCE=C:\tomcat\common\lib
set   SOURCE
echo.
copy  %SOURCE%\commons-collections-3.2.jar	%TARGET%
copy  %SOURCE%\commons-lang-2.0.jar		%TARGET%
copy  %SOURCE%\commons-logging-1.0.4.jar	%TARGET%
copy  %SOURCE%\jasper-compiler-jdt.jar		%TARGET%
copy  %SOURCE%\joda-time-1.2.1.jar		%TARGET%
copy  %SOURCE%\log4j-1.2.9.jar			%TARGET%
REM * %SOURCE%\postgresql-8.1-404.jdbc3.jar		******** NB60 PostgeSQL JDBC Driver: postgresql-8.2-506.jdbc3.jar
REM * %SOURCE%\sqlx.jar					******** NB60 JSF 1.1/1.2 Support: sqlx.jar
copy  %SOURCE%\velocity-1.5.jar			%TARGET%

echo.
set   SOURCE=C:\iReport-2.0.1\lib
set   SOURCE
echo.
copy  %SOURCE%\jasperreports-2.0.1.jar		%TARGET%
copy  %SOURCE%\commons-beanutils-1.7.jar	%TARGET%
REM * %SOURCE%\commons-collections-2.1.jar		******** commons-collections-3.2.jar
REM * %SOURCE%\commons-logging-1.0.2.jar		******** commons-logging-1.0.4.jar
copy  %SOURCE%\commons-javaflow-20060411.jar	%TARGET%
copy  %SOURCE%\commons-digester-1.7.jar		%TARGET%
copy  %SOURCE%\itext-1.3.1.jar			%TARGET%
copy  %SOURCE%\poi-2.0-final-20040126.jar	%TARGET%
copy  %SOURCE%\jxl-2.6.jar			%TARGET%
copy  %SOURCE%\jfreechart-1.0.0.jar		%TARGET%
copy  %SOURCE%\jcommon-1.0.0.jar		%TARGET%
REM * %SOURCE%\jdt-compiler-3.1.1.jar			******** jasper-compiler-jdt.jar

goto  EOB

:EOB
echo.
dir  %TARGET%
echo.
pause
exit
