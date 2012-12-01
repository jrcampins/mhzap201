:concatsql-for
if not defined variables goto:eof
setlocal
set  SOURCE=%SQLDDLXDIR%\%2
set  TARGET=%SQLJOINDIR%\%dbname%_%1.sql
set  TARGET
set  SOURCE
if exist "%TARGET%" del "%TARGET%"
call:add-group-heading all %2
for  %%f in (%SOURCE%\*.sql) do call "%~dp0concatsql-file" %%f
goto:eof

:add-group-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
