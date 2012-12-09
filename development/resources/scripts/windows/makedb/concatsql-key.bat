:concatsql-key
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
call:add-group-heading key %2
for /f "tokens=1*" %%t in ("%~dp0..\key-%2") do call "%~dp0concatsql-sql" %%t
goto:eof

:add-group-heading
echo -->>%TARGET%
echo -- %*>>%TARGET%
echo -->>%TARGET%
goto:eof
