:concatsql-for
if not defined variables goto:eof
setlocal
if /i "%3" == "@SQLHOMEDIR" (
    set SOURCE=%SQLHOMEDIR%\%2
) else (
    set SOURCE=%SQLDDLXDIR%\%2
)
set TARGET=%SQLHOMEDIR%\%dbname%_%1.sql
set TARGET
set SOURCE
if exist "%TARGET%" del "%TARGET%"
call:add-group-heading all %2
for  %%f in (%SOURCE%\*.sql) do call "%~dp0concatsql-file" %%f
goto:eof

:add-group-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
