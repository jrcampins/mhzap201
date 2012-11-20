if not defined variables goto:eof
if defined MAINBAT goto:eof
set MAINBAT=%~f1
set DIRBAT1=%CD%
pushd ..
set DIRBAT2=%CD%
popd
