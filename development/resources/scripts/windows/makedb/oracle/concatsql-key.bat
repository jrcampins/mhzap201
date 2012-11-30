:concatsql-key
if not defined variables goto:eof
setlocal
set  SOURCE=%SQLDDLDIR%\%dbms%\%2
set  TARGET=%SQLJOINDIR%\%dbname%_%1.sql
set  TARGET
set  SOURCE
if exist "%TARGET%" del "%TARGET%"
call:concatsql-file-heading key %2
for /f "tokens=1*" %%t in ("%~dp0..\key-%2") do call concatsql-pdq %SOURCE%\%%t.sql
goto:eof

:concatsql-file-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
