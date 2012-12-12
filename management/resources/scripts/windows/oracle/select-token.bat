if not defined tokenum set token=
if not defined tokenum set /a tokenum=0
set /a tokenum+=1
if "%tokenum%"=="%2" set token=%1
