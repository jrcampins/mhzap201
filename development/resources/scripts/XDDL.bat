@echo off
call "%~dp0variables"

@echo xcopy ddl\%FO9%\*.sql "%DDL%\%FO9%\base"
      xcopy ddl\%FO9%\*.sql "%DDL%\%FO9%\base"
@echo.

@echo xcopy ddl\%FPG%\*.sql "%DDL%\%FPG%\base"
      xcopy ddl\%FPG%\*.sql "%DDL%\%FPG%\base"
@echo.

@echo xcopy ddl\%FSS%\*.sql "%DDL%\%FSS%\base"
      xcopy ddl\%FSS%\*.sql "%DDL%\%FSS%\base"
@echo.

pause
exit
