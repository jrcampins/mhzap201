<?xml version="1.0" encoding="UTF-8"?>
<%--
  if (request.getParameter("login") == null) {
    response.sendRedirect("index.jsp?login=" + (System.currentTimeMillis() - session.getCreationTime()));
    return;
  }
--%>
<%
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
    <body bgcolor="#fafafa" style="font-family: Arial,Helvetica,sans-serif; font-size: 100%" onload="initialize()">
        <script type="text/javascript">
            //
            var MZFF = 'http://www.mozilla-europe.org/es/firefox/';
            //
            var HOME = 'http://www.hacienda.gov.py/';
            //
            function initialize() {
                var MZ = 'Mozilla';
                var FF = 'Firefox';
                var V1 = 3;
                var V2 = 0;
                var V3 = 7;
                var V4 = 0;
            //  alert(navigator.appCodeName + ', ' + navigator.appName + ', ' + navigator.appVersion + ', ' + navigator.userAgent);
                var nv = getParametro(unescape(location.search), '?', FF + '=', '&');
            //  alert(unescape(location.search) + ', [' + nv + ']');
                if (nv == '') {
                    var w1 = 0;
                    var w2 = 0;
                    var w3 = 0;
                    var w4 = 0;
                    if (navigator.userAgent.indexOf(MZ) == 0 && navigator.userAgent.indexOf(FF) > 0) {
                        w1 = Number(getParametro(navigator.userAgent, FF,  '/', '.'));
                        if (isNaN(w1)) {
                            w1 = Number(getParametro(navigator.userAgent, FF,  '/', ' '));
                        } else {
                            w2 = Number(getParametro(navigator.userAgent, FF + '/' + w1,  '.', '.'));
                            if (isNaN(w2)) {
                                w2 = Number(getParametro(navigator.userAgent, FF + '/' + w1,  '.', ' '));
                            } else {
                                w3 = Number(getParametro(navigator.userAgent, FF + '/' + w1 + '.' + w2,  '.', '.'));
                                if (isNaN(w3)) {
                                    w3 = Number(getParametro(navigator.userAgent, FF + '/' + w1 + '.' + w2,  '.', ' '));
                                } else {
                                    w4 = Number(getParametro(navigator.userAgent, FF + '/' + w1 + '.' + w2 + '.' + w3,  '.', '.'));
                                    if (isNaN(w4)) {
                                        w4 = Number(getParametro(navigator.userAgent, FF + '/' + w1 + '.' + w2 + '.' + w3,  '.', ' '));
                                    }
                                }
                            }
                        }
                    }
                    if (isNaN(w1)) w1 = 0;
                    if (isNaN(w2)) w2 = 0;
                    if (isNaN(w3)) w3 = 0;
                    if (isNaN(w4)) w4 = 0;
                    //  alert(navigator.userAgent + '\n' + w1 + '.' + w2 + '.' + w3 + '.' + w4);
                    if (w1 > V1) {
                        return true;
                    } else if (w1 == V1 && w2 > V2) {
                        return true;
                    } else if (w1 == V1 && w2 == V2 && w3 > V3) {
                        return true;
                    } else if (w1 == V1 && w2 == V2 && w3 == V3 && w4 >= V4) {
                        return true;
                    } else {
                        var url = location.protocol + '//' + location.host + location.pathname + '?' + FF + '=' + w1 + '.' + w2 + '.' + w3 + '.' + w4;
                        location.replace(url);
                    }
                }
                return true;
            }
            function gomzff() {
                location.href = MZFF;
                return false;
            }
            function gohome() {
                location.href = HOME;
                return false;
            }
            function go(jsp) {
                var context   = getParametro(location.pathname, '', '/', '/');
                var url       = location.protocol + '//' + location.host + '/' + context + '/redirect.html?jsp=' + jsp;
                var target    = getDefaultWindowName();
                var features  = getEspecificacionesVentana();
                /*
                alert(url);
                */
                open(url, target, features);
                return false;
            }
            //
            function getDefaultWindowName() {
                var ctx = getParametro(location.pathname, '', '/', '/');
                var wcx = ctx.replace(/\-/gi, '_');
                var pos = wcx.indexOf('_');
                var dwn = pos > 0 ? wcx.substring(0, pos) : wcx;
            //  alert('current window name = ' + window.name + ', context = ' + ctx + ', default window name = ' + dwn);
                return dwn;
            }
            //
            function getEspecificacionesVentana() {
                var features  = 'resizable,scrollbars,status';
                /**/
                var IE  = (navigator.appName.indexOf('Microsoft') == 0); // Microsoft Internet Explorer
                if (IE) {
                    return features;
                }
                /**/
                var avaWidth  = screen.availWidth;       //  amount of horizontal space in pixels available to the window
                var avaHeight = screen.availHeight;      //  height of the screen, in pixels, minus permanent or semipermanent user interface features displayed by the operating system
                var avaLeft   = screen.availLeft;        //  first available pixel available from the left side of the screen
                var avaTop    = screen.availTop;         //  y-coordinate of the first pixel that is not allocated to permanent or semipermanent user interface features
                /**/
                if (isNaN(avaWidth))   avaWidth  = 0;
                if (isNaN(avaHeight))  avaHeight = 0;
                if (isNaN(avaLeft))    avaLeft   = 0;
                if (isNaN(avaTop))     avaTop    = 0;
                /**/
                if (avaWidth > 0 && avaHeight > 0) {
                    var maxWidth  = 1024;
                    var maxHeight = 768;
                    /**/
                    var outWidth  = avaWidth;
                    var outHeight = avaHeight;
                    var scrX      = avaLeft;
                    var scrY      = avaTop;
                    /**/
                    if (outWidth  > maxWidth)  outWidth  = maxWidth;
                    if (outHeight > maxHeight) outHeight = maxHeight;
                    scrX = (avaWidth  - outWidth)  / 2;
                    scrY = (avaHeight - outHeight) / 2;
                    /**/
                    features += ',outerWidth=' + outWidth + ',outerHeight=' + outHeight + ',screenX=' + scrX + ',screenY=' + scrY;
                }
                /*
                alert(features);
                */
                return features;
            }
            //
            function getParametro(str, kw0, kw1, kw2) {
                // Obtiene la posicion donde comenzar a buscar
                var ix0 = kw0 == '' ?  0  : str.indexOf(kw0);
                if (ix0 == -1) return '';
                ix0 += kw0.length;
                // Obtiene la posicion donde comienza el valor
                var ix1 = kw1 == '' ? ix0 : str.indexOf(kw1, ix0);
                if (ix1 == -1) return '';
                ix1 += kw1.length;
                // Obtiene la posicion donde termina el valor
                var ix2 = kw2 == '' ? ix1 : str.indexOf(kw2, ix1);
                if (ix2 == -1) ix2 = str.length;
                // Obtiene el valor
                var valor = str.substring(ix1, ix2);
                // Retorna el valor
                return valor;
            }
            //
        </script>
        <!--<form>-->
            <div>
                <img onclick="gohome()" alt="" src="resources/masthead_left.jpg"  style="float: left"/>
                <img onclick="gohome()" alt="" src="resources/masthead_right.jpg" style="float: right"/>
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
            <div style="float: left; margin-left: 36px">
                <%
                  if (request.getUserPrincipal() != null) {
                %>
                    <%--
                    <br><br>
                    Se ha conectado con el usuario <b><%= request.getUserPrincipal().getName() %></b>
                    --%>
                    <%--
                      if (request.getParameter("login") != null) {
                    --%>
                        <%--
                        <br><br>
                        Su sesi&#243;n de trabajo es la <b><%= session.getId() %></b>
                        <br><br>
                        Su sesi&#243;n de trabajo comenzó a las <b><%= session.getCreationTime() + Long.valueOf(request.getParameter("login")) %></b>
                        <br><br>
                        Ahora son las <b><%= System.currentTimeMillis() %></b>
                        <br><br>
                        Han transcurrido <b><%= System.currentTimeMillis() - session.getCreationTime() - Long.valueOf(request.getParameter("login")) %> milisegundos</b>
                        --%>
                        <%--
                          if ((System.currentTimeMillis() - session.getCreationTime()) - 1000L < Long.valueOf(request.getParameter("login"))) {
                        --%>
                            <%--
                            <br>
                            <b>
                                Ha comenzado una nueva sesi&#243;n de trabajo
                            </b>
                            --%>
                        <%--
                          } else {
                        --%>
                            <br>
                            <a>
                                Ha comenzado una sesi&#243;n de trabajo
                            </a>
                        <%--
                          }
                        --%>
                        <br><br>
                        <a href='#' onclick="return go('Menu')">
                            Haga clic aqu&#237; para ir al men&#250; de Inicio
                        </a>
                        <br><br>
                        <a href='#' onclick="return go('Favoritos')">
                            Haga clic aqu&#237; para ir a su lista de Favoritos
                        </a>
                        <br><br>
                        <a href='#' onclick="return go('Password')">
                            Haga clic aqu&#237; para cambiar su Contrase&#241;a
                        </a>
                        <br><br>
                        <a>
                            Para finalizar la sesi&#243;n, ejecute la acci&#243;n "Salir"
                            <br>
                            del men&#250; "Archivo" del navegador web
                        </a>
                    <%--
                      }
                    --%>
                <%
                  }
                %>
            </div>
            <div style="clear: both"/>
            <div style="background-color: #e5e9ed; border: 1px solid gray">
                <div style="display: table; height: 24px">
                    <div style="display: table-cell; vertical-align: middle">
                        <a style="margin-left: 4px; color: #e5e9ed"></a>
                    </div>
                </div>
            </div>
            <%
              if (request.getParameter("Firefox") != null) {
            %>
                <br>
                <b>
                    El correcto funcionamiento de este producto ha sido comprobado utilizando
                </b>
                <a href='#' onclick="return gomzff()">
                    Mozilla Firefox
                </a>
                <b>
                    version 3.0.7.0 o superior
                </b>
            <%
              }
            %>
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
        <!--</form>-->
    </body>
</html>
