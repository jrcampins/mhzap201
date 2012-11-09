@echo off
call "%~dp0variables"

@echo xcopy ddl\%FO9%\*.sql "%DDL%\%FO9%"
      xcopy ddl\%FO9%\*.sql "%DDL%\%FO9%"
@echo.

@echo xcopy ddl\%FPG%\*.sql "%DDL%\%FPG%"
      xcopy ddl\%FPG%\*.sql "%DDL%\%FPG%"
@echo.

@echo xcopy ddl\%FSS%\*.sql "%DDL%\%FSS%"
      xcopy ddl\%FSS%\*.sql "%DDL%\%FSS%"
@echo.

pause
exit
