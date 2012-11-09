@echo off
call "%~dp0variables"

set   FOLDER=com\egt\base
set   SOURCE=java\%FOLDER%\*.java
set   TARGET=%CVS%\%CAP%-lib-base\src\%FOLDER%

@echo xcopy "%SOURCE%" "%TARGET%" /S
      xcopy "%SOURCE%" "%TARGET%" /S
@echo.

set   FOLDER=com\egt\base
set   SOURCE=java\%FOLDER%\*.properties
set   TARGET=%CVS%\%CAP%-lib-base\src\%FOLDER%

@echo xcopy "%SOURCE%" "%TARGET%" /S
      xcopy "%SOURCE%" "%TARGET%" /S
@echo.

set   FOLDER=com\egt\data
set   SOURCE=java\%FOLDER%\*.java
set   TARGET=%CVS%\%CAP%-lib-data\src\%FOLDER%

@echo xcopy "%SOURCE%" "%TARGET%" /S
      xcopy "%SOURCE%" "%TARGET%" /S
@echo.

pause
exit
