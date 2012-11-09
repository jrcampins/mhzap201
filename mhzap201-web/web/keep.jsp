<?xml version="1.0" encoding="UTF-8"?>
<html>
    <head>
        <title>Inicio de Sesi&#243;n</title>
    </head>
    <body bgcolor="#fafafa" style="font-family: Arial,Helvetica,sans-serif; font-size: 70%" onload="resize1()" onunload="resize2()">
        <script type="text/javascript">
            function resize1() {
                window.outerWidth  = 800;
                window.outerHeight = 600;
                window.screenX     = (screen.availLeft + screen.availWidth  - window.outerWidth)  / 2;
                window.screenY     = (screen.availTop  + screen.availHeight - window.outerHeight) / 2;
            //  alert(window.outerWidth + ', ' + window.outerHeight + ', ' + window.screenX + ', ' + window.screenY);
            }
            function resize2() {
                window.outerWidth  = screen.availWidth;
                window.outerHeight = screen.availHeight;
                window.screenX     = screen.availLeft;
                window.screenY     = screen.availTop;
            //  alert(window.outerWidth + ', ' + window.outerHeight + ', ' + window.screenX + ', ' + window.screenY);
            }
        </script>
        <div style="float: left">
            <img alt="" src="resources/logo64.gif"/>
        </div>
        <div style="float: left; margin-left: 12px; margin-top: 12px">
            <a>
                Mantenga esta ventana abierta para conservar activa su sesi&#243;n de trabajo.
                <br>
                Esto le permite abrir y cerrar otras ventanas sin tener que suministrar nuevamente sus credenciales.
                <br>
                <!--
                Para finalizar su sesi&#243;n de trabajo, cierre &#233;sta y todas las dem&#225;s ventanas abiertas.
                -->
                Para finalizar la sesi&#243;n, ejecute la acci&#243;n "Salir" del men&#250; "Archivo" del navegador web.
                <br><br>
                <input type="reset" value="Aceptar" onclick="window.blur()"/>
            </a>
        </div>
        <div style="clear: both"/>
    </body>
</html>
