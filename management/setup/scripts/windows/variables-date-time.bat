REM el formato de la fecha debe ser dia, mes y año de 4 digitos
REM el separador de la fecha debe ser barra, guión o punto
REM el formato de la hora debe ser hora, minutos y, opcionalmente, periodo
REM el separador de la hora debe ser dos puntos, guión o punto
REM el periodo de la hora debe ser A, AM, A.M., M, P, PM o P.M.
call:set-variables-date
call:set-variables-time
call:bye
goto:eof

:set-variables-date
set xx=/-.
for /f "tokens=1* delims=%xx%" %%t in ('date/t') do set d1=%%t
for /f "tokens=2* delims=%xx%" %%t in ('date/t') do set d2=%%t
for /f "tokens=3* delims=%xx%" %%t in ('date/t') do set d3=%%t
set dd=%d1%
set mm=%d2%
set aa=%d3:~2%
set aaaa=%d3%
call:set-xx %dd%
set dd=%xx%
call:set-xx %mm%
set mm=%xx%
call:set-xx %aa%
set aa=%xx%
set ddmmaa=%dd%%mm%%aa%
set mmddaa=%mm%%dd%%aa%
set aammdd=%aa%%mm%%dd%
set ddmmaaaa=%dd%%mm%%aaaa%
set mmddaaaa=%mm%%dd%%aaaa%
set aaaammdd=%aaaa%%mm%%dd%
goto:eof

:set-variables-time
set xx=:-.,
for /f "tokens=1* delims=%xx% " %%t in ('time/t') do set t1=%%t
for /f "tokens=2* delims=%xx% " %%t in ('time/t') do set t2=%%t
for /f "tokens=3* delims=%xx% " %%t in ('time/t') do set t3=%%t
for /f "tokens=4* delims=%xx% " %%t in ('time/t') do set t4=%%t
set hh=%t1%
set nn=%t2%
call:set-xx %hh%
set hh=%xx%
call:set-xx %nn%
set nn=%xx%
call:set-tt
if defined tt (call:set-hh24-con-tt) else (set hh24=%hh%)
set hhmm=%hh%%nn%
set hh24mm=%hh24%%nn%
set hhmmtt=%hh%%nn%%tt%
set tthhmm=%tt%%hh%%nn%
goto:eof

:bye
set d1=
set d2=
set d3=
set t1=
set t2=
set t3=
set xx=
rem date/t
rem set dd
rem set mm
rem set aa
rem time/t
rem set hh
rem set nn
rem set tt
rem pause
goto:eof

:set-tt
set tt=
if defined t4 call:set-tt-tt %t4%
if defined t3 if not defined tt call:set-tt-tt %t3%
goto:eof

:set-tt-tt
if /i "%1" == "A"     set tt=AM
if /i "%1" == "AM"    set tt=AM
if /i "%1" == "A.M."  set tt=AM
if /i "%1" == "M"     set tt=PM
if /i "%1" == "P"     set tt=PM
if /i "%1" == "PM"    set tt=PM
if /i "%1" == "P.M."  set tt=PM
goto:eof

:set-hh24-con-tt
if "%t1%" == "12" (set /a hh24=0) else (set /a hh24=%t1%)
if %hh24% LSS 12 (if /i "%tt%" == "PM" (set /a hh24=hh24+12))
call:set-xx %hh24%
set hh24=%xx%
goto:eof

:set-xx
set /a xx=0
if not "%1" == "" set /a xx=%1
if %xx% LSS 10 set xx=0%xx%
goto:eof
