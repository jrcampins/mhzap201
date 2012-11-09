<?xml version="1.0" encoding="UTF-8"?>
<html>
    <head>
        <title>Control de Acceso</title>
    </head>
    <body bgcolor="#fafafa" style="font-family: Arial,Helvetica,sans-serif; font-size: 100%">
        <script type="text/javascript">
            function goback() {
            //  alert(window.opener ? '[' + window.opener.name + '>' + window.name + ']' : '[' + window.name + ']');
                if (history.length>1) {
                    history.back();
                    return false;
                } else if (window.opener) {
                    window.close();
                    return false;
                }
            }
        </script>
        <img alt="" src="resources/failed_medium.gif"/>
        <b>
            Se ha denegado el acceso a la p&#225;gina solicitada
        </b>
        <br><br>
        <a href='<%=response.encodeURL("Menu.jsp")%>' onclick="goback()">
            Haga clic aqu&#237; para regresar
        </a>
    </body>
</html>
