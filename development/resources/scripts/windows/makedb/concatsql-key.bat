:concatsql-key
if not defined variables goto:eof
setlocal
set  SOURCE=%SQLDDLXDIR%\%2
set  TARGET=%SQLJOINDIR%\%dbname%_%1.sql
set  TARGET
set  SOURCE
if exist "%TARGET%" del "%TARGET%"
call:add-group-heading key %2
for /f "tokens=1*" %%t in ("%~dp0..\key-%2") do call "%~dp0concatsql-sql" %%t
goto:eof

:add-group-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
