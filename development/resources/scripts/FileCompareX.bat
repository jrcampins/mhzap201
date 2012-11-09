echo %~f1

set dp1=%~f1
rem set dp1
call set dp2=%%dp1:%source%=%target%%%
rem set dp2
echo.

set tokensfile=tokens
set tokenspath=%CD%
if exist %tokensfile% del %tokensfile% /q

echo java>>%tokensfile%
echo sql>>%tokensfile%
echo properties>>%tokensfile%

for /f "tokens=* delims=." %%t in (%tokensfile%) do (
rem if exist "%dp2%\*.%%t" echo FC "%dp2%\*.%%t" "%dp1%\*.%%t">>%log%
if exist "%dp2%\*.%%t" FC "%dp2%\*.%%t" "%dp1%\*.%%t" /LB1 1>>%log% 2>&1
)

if exist %tokensfile% del %tokensfile% /q
