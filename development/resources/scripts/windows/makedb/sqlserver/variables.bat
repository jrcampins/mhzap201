set dbms=sqlserver
pushd "%MHZAP201_SOURCE%\management\resources\scripts\windows\%dbms%"
call variables
popd
if not defined variables goto:eof
call ..\variables "%~f1"
goto:eof
