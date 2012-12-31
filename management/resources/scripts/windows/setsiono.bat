:preguntar
set siono=S
if defined siono_por_omision set siono=%siono_por_omision%
set siono_por_omision=
set pregunta="%* ? (S/N) "
set pregunta="%* ? (S/N) [%siono%] "
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
