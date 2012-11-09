exit
@echo off
set DDLDIR=%MHZAP201_VSWS%\management\resources\database\ddl\postgresql
set SOURCE=%DDLDIR%\plpgsql\*.sql
set TARGET=%DDLDIR%\functions
for %%f in (%SOURCE%) do call md-402 %%f
pause
