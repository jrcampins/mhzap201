set dd=/
for /f "tokens=1* delims=%dd% " %%t in ('date/t') do set d1=%%t
for /f "tokens=2* delims=%dd% " %%t in ('date/t') do set d2=%%t
for /f "tokens=3* delims=%dd% " %%t in ('date/t') do set d3=%%t

set td=:
for /f "tokens=1* delims=%td% " %%t in ('time/t') do set t1=%%t
for /f "tokens=2* delims=%td% " %%t in ('time/t') do set t2=%%t
for /f "tokens=3* delims=%td% " %%t in ('time/t') do set t3=%%t

:DD/MM/AAAA
set dd=%d1%
set mm=%d2%
set aa=%d3:~2%
set aaaa=%d3%

set aammdd=%aa%%mm%%dd%
set mmddaa=%mm%%dd%%aa%
set aaaammdd=%aaaa%%mm%%dd%
set mmddaaaa=%mm%%dd%%aaaa%

:HH:MM+AM/PM
set hh=%t1%
set nn=%t2%
set xx=%t3%

if "%t1%" == "01" set /a hh24=1
if "%t1%" == "02" set /a hh24=2
if "%t1%" == "03" set /a hh24=3
if "%t1%" == "04" set /a hh24=4
if "%t1%" == "05" set /a hh24=5
if "%t1%" == "06" set /a hh24=6
if "%t1%" == "07" set /a hh24=7
if "%t1%" == "08" set /a hh24=8
if "%t1%" == "09" set /a hh24=9
if "%t1%" == "10" set /a hh24=10
if "%t1%" == "11" set /a hh24=11
if "%xx%" == "PM" set /a hh24=hh24+12

if "%t1%%xx%" == "12AM" set /a hh24=0
if "%t1%%xx%" == "12PM" set /a hh24=12

set hhmm=%hh%%nn%
set hh24mm=%hh24%%nn%
set hhmmxx=%hh%%nn%%xx%
set xxhhmm=%xx%%hh%%nn%

:FINALLY
rem dd=
set d1=
set d2=
set d3=
set td=
set t1=
set t2=
set t3=
