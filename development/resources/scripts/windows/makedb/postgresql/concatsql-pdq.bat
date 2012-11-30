:concatsql-pdq
if not defined variables goto:eof
setlocal
if not exist "%~f1" (
    echo %1 no existe
    goto:eof
)
type "%~f1">>%TARGET%
echo.>>%TARGET%
goto:eof
