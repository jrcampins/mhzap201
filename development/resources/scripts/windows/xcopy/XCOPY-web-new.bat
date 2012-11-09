@echo off
for /D %%f in (W:\workspace\mhzap201-web-*) do call XCOPY-web-2-new %%f
pause
exit
