if not defined variables goto:eof
echo type file %1
echo type file %1>>%LOG%
echo.>>%LOG%
echo.>>%BAK%
type "%SQLDDLDIR%\%dbms%\data\%1.sql" 1>>%BAK% 2>>%LOG%
echo.>>%BAK%
