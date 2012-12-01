set project=mhzap201
set project_source_dir=%~d0\%project%\source
rem project
set thisdir=%~dp0
set thisdir=%thisdir:"=%
set thatdir=%project_source_dir%\management\resources\scripts\windows\sqlserver
call "%thatdir%\variables.bat"
