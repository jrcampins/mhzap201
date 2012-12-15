@echo off
echo copy-ws-ea...
call copy-ws-ea
echo.
echo copy-ws-ejb-business...
call copy-ws-ejb-business
echo.
echo copy-ws-ejb-persistence...
call copy-ws-ejb-persistence
echo.
echo copy-ws-lib-base...
call copy-ws-lib-base
echo.
echo copy-ws-management...
call copy-ws-management
echo.
pause
exit
