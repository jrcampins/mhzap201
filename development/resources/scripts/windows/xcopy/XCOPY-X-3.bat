@echo.
@echo.
@echo %1
@echo.
@echo "%~f2"
@echo.
@echo.
dir %1
@echo.
dir "%~f2\%~nx1"
@echo.
copy %1 "%~f2"
@echo.
dir "%~f2\%~nx1"
@echo.
