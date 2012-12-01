:concatsql-file
if not defined variables goto:eof
setlocal
set f1="%~f1"
if exist %f1% (
    rem call:add-file-heading %~n1
    type "%~f1">>%TARGET%
    echo.>>%TARGET%
) else (
    echo %f1% no existe
    goto:eof
)
goto:eof

:add-file-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
