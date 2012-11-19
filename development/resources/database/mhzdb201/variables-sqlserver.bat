@echo ***** "%~f0"
rem
rem development\scripts\windows\makedb\sqlserver\variables.bat
rem
pushd "%MHZAP201_SOURCE%\management\resources\scripts\windows\sqlserver"
call variables
popd
if not defined variables goto:eof
rem call ..\variables "%~f1"
