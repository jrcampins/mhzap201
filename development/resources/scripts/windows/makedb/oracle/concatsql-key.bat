if not defined variables goto:eof
setlocal
set  SOURCE=%SQLDDLDIR%\%dbms%\%2
set  SOURCE
set  TARGET=%SQLDDLDIR%\%O9DATABASE%_O9_%1.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"
call:concatsql-file-heading key %2
for /f "tokens=1*" %%t in ("%~dp0..\key-%2") do call concatsql-pdq %SOURCE%\%%t.sql
goto:eof

:concatsql-file-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
