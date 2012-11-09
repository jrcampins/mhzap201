<?xml version="1.0" encoding="UTF-8"?>
<%
    if (request.getUserPrincipal() != null) {
        response.sendRedirect("index.html");
        return;
    }
    String entapp = request.getContextPath().substring(1, request.getContextPath().indexOf("-"));
    String prefix = entapp == null ? null : entapp.toUpperCase() + "_";
    String dirvar = prefix == null ? null : prefix + "DIR";
    String dbvar1 = prefix == null ? null : prefix + "JDBC_DRIVER";
    String dbvar2 = prefix == null ? null : prefix + "JDBC_URL";
    String dbvar3 = prefix == null ? null : prefix + "JDBC_USER";
    String dbvar4 = prefix == null ? null : prefix + "JDBC_PASSWORD";
    /*
    String dirstr = dirvar == null ? null : System.getenv(dirvar);
    String dbstr1 = dbvar1 == null ? null : System.getenv(dbvar1);
    String dbstr2 = dbvar2 == null ? null : System.getenv(dbvar2);
    String dbstr3 = dbvar3 == null ? null : System.getenv(dbvar3);
    String dbstr4 = dbvar4 == null ? null : System.getenv(dbvar4);
    boolean dirok = dirstr != null && (new java.io.File(dirstr)).isDirectory();
    boolean dbcok = dbstr1 != null && dbstr2 != null && dbstr3 != null && dbstr4 != null;
    */
    String dirstr = dirvar;
    String dbstr1 = dbvar1;
    String dbstr2 = dbvar2;
    String dbstr3 = dbvar3;
    String dbstr4 = dbvar4;
    boolean dirok = true;
    boolean dbcok = true;
%>
<html>
    <head>
        <title>Inicio de Sesi&#243;n</title>
    </head>
    <body bgcolor="#fafafa" style="font-family: Arial,Helvetica,sans-serif" onload="initialize()" onunload="terminate()">
        <script type="text/javascript">
            function initialize() {
                var winname = location.pathname;
                winname = winname.replace(/\-/gi, '/');
                winname = winname.replace(/\./gi, '/');
                winname = winname.replace(/\_/gi, '/');
                if (window.name == '') {
                    window.name = winname;
                    text1.focus();
                } else if (window.name == winname) {
                    text2.focus();
                //  text2.select();
                } else {
                    window.name = winname;
                    location.reload();
                }
            }
            function culminate() {
                var winname = window.name.replace(/\//gi, '_');
                window.name = winname;
            }
            function terminate() {
            //  OJO: el onunload, aunque no tenga instrucciones, hace que siempre se ejecute el onload al regresar
            }
        </script>
        <form method="POST" action="j_security_check" onsubmit="culminate()">
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
            <%
              if (dbcok && dirok) {
            %>
            <div style="float: left; margin-left: 12px; margin-top: 8px">
                <table border="0" cellspacing="5" style="margin-left: 4px; margin-top: 12px; font-size: 1em">
                    <tr>
                        <th align="right">Usuario:</th>
                        <td align="left">
                            <input id="text1" type="text" name="j_username"/>
                        </td>
                    </tr>
                    <tr>
                        <th align="right">Contrase&#241;a:</th>
                        <td align="left">
                            <input id="text2" type="password" name="j_password"/>
                        </td>
                    </tr>
                    <tr>
                        <th align="right"></th>
                        <td align="left">
                            <input id="boton" type="submit" style="margin-top: 12px" value="Iniciar Sesi&#243;n"/>
                        </td>
                    </tr>
                </table>
            </div>
            <%
              }
            %>
            <div style="clear: both"/>
            <div style="background-color: #e5e9ed; border: 1px solid gray">
                <div style="display: table; height: 24px">
                    <div style="display: table-cell; vertical-align: middle">
                        <a style="margin-left: 4px; color: #e5e9ed"></a>
                    </div>
                </div>
            </div>
            <%
              if (dirok) {
            %>
                <a style="margin-left: 4px; color: #fafafa"><%= dirvar + "=" + dirstr %></a>
                <br>
            <%
              } else {
            %>
                <b>ERROR: La variable de entorno <%= dirvar %> no esta correctamente definida </b>
                <br>
            <%
              }
            %>
            <%
              if (dbstr1 != null) {
            %>
                <a style="margin-left: 4px; color: #fafafa"><%= dbvar1 + "=" + dbstr1 %></a>
                <br>
            <%
              } else {
            %>
                <b>ERROR: La variable de entorno <%= dbvar1 %> no esta correctamente definida </b>
                <br>
            <%
              }
            %>
            <%
              if (dbstr2 != null) {
            %>
                <a style="margin-left: 4px; color: #fafafa"><%= dbvar2 + "=" + dbstr2 %></a>
                <br>
            <%
              } else {
            %>
                <b>ERROR: La variable de entorno <%= dbvar2 %> no esta correctamente definida </b>
                <br>
            <%
              }
            %>
            <%
              if (dbstr3 != null) {
            %>
                <a style="margin-left: 4px; color: #fafafa"><%= dbvar3 + "=" + dbstr3 %></a>
                <br>
            <%
              } else {
            %>
                <b>ERROR: La variable de entorno <%= dbvar3 %> no esta correctamente definida </b>
                <br>
            <%
              }
            %>
            <%
              if (dbstr4 != null) {
            %>
                <a style="margin-left: 4px; color: #fafafa"><%= dbvar4 + "=" + "*********************" %></a>
                <br>
            <%
              } else {
            %>
                <b>ERROR: La variable de entorno <%= dbvar4 %> no esta correctamente definida </b>
                <br>
            <%
              }
            %>
        </form>
    </body>
</html>
