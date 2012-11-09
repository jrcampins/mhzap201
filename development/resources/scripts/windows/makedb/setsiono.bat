@echo off
:preguntar
set pregunta="%~1? (S/N) "
if defined siono set pregunta="%~1? (S/N) [%siono%] "
set /p siono=%pregunta%
if /i "%siono%" == "S" goto si
if /i "%siono%" == "N" goto no
goto preguntar
:si
set siono=S
goto salir
:no
set siono=N
:salir
