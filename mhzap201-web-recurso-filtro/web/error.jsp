<?xml version="1.0" encoding="UTF-8"?>
<html>
    <head>
        <title>Inicio de Sesi&#243;n</title>
    </head>
    <body bgcolor="#fafafa" style="font-family: Arial,Helvetica,sans-serif" onload="initialize()" onunload="terminate()">
        <script type="text/javascript">
            function initialize() {
                boton.focus();
            }
            function terminate() {
                var winname = window.name.replace(/\_/gi, '/');
                window.name = winname;
            }
        </script>
        <!--<form>-->
            <div>
                <img alt="" src="resources/masthead_left.jpg" style="float: left"/>
                <img alt="" src="resources/masthead_right.jpg" style="float: right"/>
            </div>
            <div style="clear: both"/>
            <div style="background-color: #e5e9ed; border: 1px solid gray">
                <div style="display: table; height: 36px">
                    <div style="display: table-cell; vertical-align: middle">
                        <b style="margin-left: 4px">
                            Gestion del Programa de Pension Alimentaria
                        </b>
                    </div>
                </div>
            </div>
            <div style="float: left">
                <img onclick="gohome()" alt="" src="resources/mastbody.jpg"/>
            </div>
            <div style="float: left; margin-left: 12px; margin-top: 8px">
                <table border="0" cellspacing="5" style="margin-left: 4px; margin-top: 12px; font-size: 1em">
                    <tr>
                        <th align="right"><img alt="" src="resources/failed_medium.gif"/></th>
                        <td align="left">
                            <b>
                                Usuario y/o Contrase&#241;a inv&#225;lida
                            </b>
                        </td>
                    </tr>
                    <tr>
                        <th align="right"></th>
                        <td align="left">
                            <input id="boton" type="submit" style="margin-top: 12px" value="Reintentar" onclick="history.back()"/>
                        </td>
                    </tr>
                </table>
            </div>
            <div style="clear: both"/>
            <div style="background-color: #e5e9ed; border: 1px solid gray">
                <div style="display: table; height: 24px">
                    <div style="display: table-cell; vertical-align: middle">
                        <a style="margin-left: 4px; color: #e5e9ed"></a>
                    </div>
                </div>
            </div>
        <!--</form>-->
    </body>
</html>
