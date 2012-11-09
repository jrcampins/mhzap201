@echo off
exit

set ORIGEN=w:\workspace
set SUBDIR=web
set PATRON=ayuda.html
set PATRON=*.jpg

echo.
echo %ORIGEN% %SUBDIR% %PATRON%
echo.
pause

for /D %%d in (%ORIGEN%\mhzap201-web*) do call xcopy-web-2-resources %%d %SUBDIR% %PATRON%
pause
exit

call xcopy-web-2-resources W:\workspace\mhzap201-web-conjunto-segmento web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-rol web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-usuario web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-configuracion-basica web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-configuracion-fija web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-configuracion-manual web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-consulta web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-proceso web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-recurso-academico web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-recurso-compartido web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-recurso-financiero web\WEB-INF web.xml
call xcopy-web-2-resources W:\workspace\mhzap201-web-recurso-humano web\WEB-INF web.xml
exit

for /D %%f in (W:\workspace\mhzap201-web*) do call xcopy-web-2-resources %%f src FragmentoFiltro*.java
for /D %%f in (W:\workspace\mhzap201-web*) do call xcopy-web-2-resources %%f web FragmentoFiltro*.jspf
pause
exit

for /D %%f in (W:\workspace\mhzap201-web*) do call xcopy-web-2-resources %%f web\WEB-INF sun-web.xml
for /D %%f in (W:\workspace\mhzap201-web*) do call xcopy-web-2-resources %%f web\WEB-INF web.xml
pause
exit
