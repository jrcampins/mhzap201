set dbms=oracle
pushd "%MHZAP201_VSWS%\management\resources\scripts\windows\%dbms%"
call variables
popd
if not defined variables goto:eof
call ..\variables "%~f1"
goto:eof
