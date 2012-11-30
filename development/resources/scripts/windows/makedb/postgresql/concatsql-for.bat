:concatsql-for
if not defined variables goto:eof
setlocal
set  SOURCE=%SQLDDLDIR%\%dbms%\%2
set  TARGET=%SQLJOINDIR%\%dbname%_%1.sql
set  TARGET
set  SOURCE
if exist "%TARGET%" del "%TARGET%"
call:concatsql-file-heading all %2
for  %%f in (%SOURCE%\*.sql) do call concatsql-pdq %%f
goto:eof

:concatsql-file-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
