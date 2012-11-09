@echo off
for /D %%d in (W:\workspace\mhzap201-web-*) do call COPY-web-project %%d
pause
exit
