if not defined variables goto:eof
set  SOURCE=%SQLDDLDIR%\%dbms%\%2
set  SOURCE
set  TARGET=%SQLDDLDIR%\%O9DATABASE%_O9_%1.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"
call:concatsql-file-heading all %2
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f
goto:eof

:concatsql-file-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof