function getReturnValueCookieName() {
    return 'js-close-window-return-value';
}

function setSessionCookie(cookieName, cookieValue) {
    document.cookie = escape(cookieName) + "=" + escape(cookieValue);
    return (getSessionCookie(cookieName) == cookieValue);
}

function getSessionCookie(cookieName) {
    var cookieValue = "";
    if (document.cookie.length > 0) {
        var search = escape(cookieName) + "=";
        var offset = document.cookie.indexOf(search)
        if (offset != -1) { // if cookie exists
            offset += search.length // set index of beginning of cookie value
            var end = document.cookie.indexOf(";", offset); // set index of end of cookie value
            if (end == -1) end = document.cookie.length;
            cookieValue = unescape(document.cookie.substring(offset, end));
        }
    }
    return cookieValue;
}

function checkEvento(inputEvent) {
    var bug = false; // true for debugging, otherwise false
    var IE  = (navigator.appName.indexOf('Microsoft') == 0); // Microsoft Internet Explorer
    var NS  = (navigator.appName.indexOf('Netscape' ) == 0); // Netscape
    if (IE) {
        return true;
    }
    var et1 = IE ? inputEvent.srcElement.type : inputEvent.target.type;
    var et2 = inputEvent.type;
    var url = inputEvent.target.href;
    var btn = -1;
    var rbc = false;
    var key = -1;
    var mod = '';
    var txt = (et1 == 'text' || et1 == 'textarea'); // is target a text box or a text area?
    var lnk = (url != undefined);                   // is target a hyperlink?
    if (IE) {
        if (inputEvent.button) {
            btn = inputEvent.button; // 1 = left, 2 = right, 4 = middle. If multiple buttons are pressed, the value is the sum of both buttons
            rbc = (btn == 2 || btn == 3 || btn == 6 || btn == 7);
        }
    }
    if(!IE) {
        if (inputEvent.type.indexOf('click') >= 0 || inputEvent.type.indexOf('mouse') >= 0) {
            btn = inputEvent.button; // 0 = left, 1 = middle, 2 = right
            rbc = (btn == 2);
        }
    }
    if (btn < 0) {
        if (inputEvent.which)    key = inputEvent.which;
        if (inputEvent.charCode) key = inputEvent.charCode;
        if (inputEvent.keyCode)  key = inputEvent.keyCode;
    }
    //  alert when debugging
    if (bug) {
        if (btn >= 0) alert(et1 + '.' + et2 + '=' + btn + '/' + rbc);
        if (key >= 0 && key != 192) {
            if (inputEvent.altKey)   mod += 'A+';
            if (inputEvent.ctrlKey)  mod += 'C+';
            if (inputEvent.metaKey)  mod += 'M+';
            if (inputEvent.shiftKey) mod += 'S+';
            alert(et1 + '.' + et2 + '=' + mod + key);
        }
    }
    //  disable right-button clicks on anything but text areas and text boxes
    if (rbc && !txt) return false;
    //  check for keystrokes
    if (key >= 0) {
        //  disable backspace keystrokes on anything but text areas and text boxes
        if (key == 8 && !txt) return false;
        //  disable ALT + keystrokes
        if (inputEvent.altKey && key >= 36 && key <= 40) return false;
        //  disable CONTROL + keystrokes
        if (inputEvent.ctrlKey) {
            var c = String.fromCharCode(key);
            var s = IE ? ' a b d g h i l n o s t u ' : ' b d h l n o s t u ';
            if (s.indexOf(c) > 0) return false;
        }
    }
    return true;
}

function checkVentana() {
    var ur0 = location.protocol + '//' + location.host;
    var dwn = getDefaultWindowName();
    if (window.name == '' || dwn == '' || window.name.indexOf(dwn) != 0) {
        document.body.style.visibility = 'hidden';
        location.replace(ur0); // después de este replace las funciones de este documento ya no estan disponibles
        return false;
    }
    return true;
}

function getCurrentTimeMillis() {
//  var currentDate = new Date();
//  return currentDate.getTime();
    return 0;
}

function getDefaultWindowName() {
    var ctx = getParametro(location.pathname, '', '/', '/');
    var wcx = ctx.replace(/\-/gi, '_');
    var pos = wcx.indexOf('_');
    var dwn = pos > 0 ? wcx.substring(0, pos) : wcx;
//  alert('current window name = ' + window.name + ', context = ' + ctx + ', default window name = ' + dwn);
    return dwn;
}

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

function closeVentana(url, windowName) {
    var IE  = (navigator.appName.indexOf('Microsoft') == 0); // Microsoft Internet Explorer
    if (IE) {
        return null;
    }
    var windowCodeName = windowName.replace(/\-/gi, '_');
    var windowFeatures = 'resizable,scrollbars,status';
    var windowReference = window.open(url, windowCodeName, windowFeatures);
    windowReference.close();
    return windowReference;
}

function openVentana(url, windowName, windowType) {
    var windowCodeName = windowName.replace(/\-/gi, '_');
    //  No se reinicia el breadcrumbs si OpenPostBack=1
    if (windowCodeName == window.name && url.indexOf('id_opcion_campo_retorno') == -1) {
        url = url.replace(/SessionState/gi, 'OpenPostBack=' + 1 + '&SessionState');
    }
    //
    if (url.indexOf('SessionFrame') == -1) {
        url = url.replace(/SessionState/gi, 'SessionFrame=' + windowCodeName + '&SessionState');
    }
    //  Se reinicia cuando la sesion ha caducado
    if (url.indexOf('SessionStamp') == -1) {
        url = url.replace(/SessionState/gi, 'SessionStamp=' + getCurrentTimeMillis() + '&SessionState');
    }
    //  "Ver detalle" en la misma ventana (window.open cambia el valor de window.opener a window.self)
    if (windowCodeName == window.name && url.indexOf('id_opcion_campo_retorno') == -1) {
        window.location = url;
        return window;
    }
    var tipoVentana = windowType == '' ? '' : windowType == 'ayuda' ? 'ayuda' : 'popup';
    var windowFeatures = getEspecificacionesVentana(tipoVentana);
    /*
    var mensaje = window.name + '.open(' + url + ', ' + windowCodeName + ', ' + windowFeatures + ')';
    alert(mensaje);
    */
    var windowReference = window.open(url, windowCodeName, windowFeatures);
    /*
    windowReference.opener = window.self;
    */
    windowReference.focus();
    return windowReference;
}

function openVentanaCentrada(url, windowName, windowType, newWidth, newHeight) {
    var windowCodeName = windowName.replace(/\-/gi, '_');
    //  No se reinicia el breadcrumbs si OpenPostBack=1
    if (windowCodeName == window.name && url.indexOf('id_opcion_campo_retorno') == -1) {
        url = url.replace(/SessionState/gi, 'OpenPostBack=' + 1 + '&SessionState');
    }
    //
    if (url.indexOf('SessionFrame') == -1) {
        url = url.replace(/SessionState/gi, 'SessionFrame=' + windowCodeName + '&SessionState');
    }
    //  Se reinicia cuando la sesion ha caducado
    if (url.indexOf('SessionStamp') == -1) {
        url = url.replace(/SessionState/gi, 'SessionStamp=' + getCurrentTimeMillis() + '&SessionState');
    }
    //  "Ver detalle" en la misma ventana (window.open cambia el valor de window.opener a window.self)
    if (windowCodeName == window.name && url.indexOf('id_opcion_campo_retorno') == -1) {
        window.location = url;
        return window;
    }
    var tipoVentana = windowType == '' ? '' : windowType == 'ayuda' ? 'ayuda' : 'popup';
    var windowFeatures = getEspecificacionesVentanaCentrada(newWidth, newHeight);
    /*
    var mensaje = window.name + '.open(' + url + ', ' + windowCodeName + ', ' + windowFeatures + ')';
    alert(mensaje);
    */
    var windowReference = window.open(url, windowCodeName, windowFeatures);
    /*
    windowReference.opener = window.self;
    */
    windowReference.focus();
    return windowReference;
}

function getEspecificacionesVentana(tipoVentana) {
    var features  = 'resizable,scrollbars,status';
    /**/
    var IE  = (navigator.appName.indexOf('Microsoft') == 0); // Microsoft Internet Explorer
    if (IE) {
        return features;
    }
    /**/
    var bigEnough = true;
    var barHeight = 30;                      //  window title bar height
    var minWidth  = 640;                     //  minimum width
    var minHeight = 320;                     //  minimum height
    /**/
    var avaWidth  = screen.availWidth;       //  amount of horizontal space in pixels available to the window
    var avaHeight = screen.availHeight;      //  height of the screen, in pixels, minus permanent or semipermanent user interface features displayed by the operating system
    var avaLeft   = screen.availLeft;        //  first available pixel available from the left side of the screen
    var avaTop    = screen.availTop;         //  y-coordinate of the first pixel that is not allocated to permanent or semipermanent user interface features
    /**/
    var outWidth  = window.outerWidth;       //  width of the outside of the browser window
    var outHeight = window.outerHeight;      //  height of the outside of the browser window
    var scrLeft   = window.screenX;          //  horizontal distance of the left border of the user's browser from the left side of the screen
    var scrTop    = window.screenY;          //  vertical distance of the top border of the user's browser from the top side of the screen
    /**/
    if (isNaN(avaWidth))   avaWidth  = 0;
    if (isNaN(avaHeight))  avaHeight = 0;
    if (isNaN(avaLeft))    avaLeft   = 0;
    if (isNaN(avaTop))     avaTop    = 0;
    /**/
    if (isNaN(outWidth))   outWidth  = avaWidth;
    if (isNaN(outHeight))  outHeight = avaHeight;
    if (isNaN(scrLeft))    scrLeft   = avaLeft;
    if (isNaN(scrTop))     scrTop    = avaTop;
    /**/
    if (outWidth  > avaWidth)  outWidth  = avaWidth;
    if (outHeight > avaHeight) outHeight = avaHeight;
    if (scrLeft   < avaLeft)   scrLeft   = avaLeft;
    if (scrTop    < avaTop)    scrTop    = avaTop;
    /**/
    if (avaWidth  < minWidth)  bigEnough = false;
    if (avaHeight < minHeight) bigEnough = false;
    /**/
    if (outWidth  < minWidth)  outWidth  = minWidth;
    if (outHeight < minHeight) outHeight = minHeight;
    /**/
    var newWidth  = avaWidth;
    var newHeight = avaHeight;
    var newLeft   = avaLeft;
    var newTop    = avaTop;
    /**/
    if (tipoVentana == 'ayuda') {
        /**/
        features += ',menubar,toolbar';
        /**/
        minWidth  = Math.round(avaWidth * 2 / 5);
        newWidth  = minWidth;
        newHeight = avaHeight;
        newLeft   = scrLeft < avaLeft + avaWidth / 2 ? avaLeft + avaWidth - newWidth : avaLeft;
        newTop    = avaTop;
    }
    if (tipoVentana == 'popup') {
        /*
        features += ',dependent,dialog';
        */
        newWidth  = outWidth;
        newHeight = outHeight - barHeight;
        newLeft   = scrLeft;
        newTop    = scrTop    + barHeight;
    }
    if (bigEnough) {
        if (newWidth  < minWidth)  newWidth  = minWidth;
        if (newHeight < minHeight) newHeight = minHeight;
        if (avaLeft + avaWidth < newLeft + newWidth) {
            if (avaLeft + avaWidth < newLeft + minWidth) {
                newWidth = minWidth;
                newLeft  = avaLeft + avaWidth - newWidth;
            } else {
                newWidth = avaLeft + avaWidth - newLeft;
            }
        }
        if (avaTop + avaHeight < newTop + newHeight) {
            if (avaTop + avaHeight < newTop + minHeight) {
                newHeight = minHeight;
                newTop    = avaTop + avaHeight - newHeight;
            } else {
                newHeight = avaTop + avaHeight - newTop;
            }
        }
        features += ',outerWidth=' + newWidth + ',outerHeight=' + newHeight + ',screenX=' + newLeft + ',screenY=' + newTop;
    }
    /*
    alert(features);
    */
    return features;
}

function getEspecificacionesVentanaCentrada(newWidth, newHeight) {
    var features  = 'resizable,scrollbars,status';
    /**/
    var IE  = (navigator.appName.indexOf('Microsoft') == 0); // Microsoft Internet Explorer
    if (IE) {
        return features;
    }
    /**/
    var avaWidth  = screen.availWidth;
    var avaHeight = screen.availHeight;
    var avaLeft   = screen.availLeft;
    var avaTop    = screen.availTop;
    /**/
    if (isNaN(avaWidth))   avaWidth  = 0;
    if (isNaN(avaHeight))  avaHeight = 0;
    if (isNaN(avaLeft))    avaLeft   = 0;
    if (isNaN(avaTop))     avaTop    = 0;
    /**/
    if (avaWidth  < newWidth)  newWidth  = avaWidth;
    if (avaHeight < newHeight) newHeight = avaHeight;
    /**/
    if (newWidth > 0 && newHeight > 0) {
        var newLeft = avaLeft + Math.round((avaWidth  - newWidth)  / 2);
        var newTop  = avaTop  + Math.round((avaHeight - newHeight) / 2);
        features += ',outerWidth=' + newWidth + ',outerHeight=' + newHeight + ',screenX=' + newLeft + ',screenY=' + newTop;
    }
    /*
    alert(features);
    */
    return features;
}

function getEspecificacionesVentanaCompleta() {
    var features  = 'resizable,scrollbars,status';
    /**/
    var IE  = (navigator.appName.indexOf('Microsoft') == 0); // Microsoft Internet Explorer
    if (IE) {
        return features;
    }
    /**/
    var avaWidth  = screen.availWidth;
    var avaHeight = screen.availHeight;
    var avaLeft   = screen.availLeft;
    var avaTop    = screen.availTop;
    /**/
    if (isNaN(avaWidth))   avaWidth  = 0;
    if (isNaN(avaHeight))  avaHeight = 0;
    if (isNaN(avaLeft))    avaLeft   = 0;
    if (isNaN(avaTop))     avaTop    = 0;
    /**/
    if (avaWidth > 0 && avaHeight > 0) {
        features += ',outerWidth=' + avaWidth + ',outerHeight=' + avaHeight + ',screenX=' + avaLeft + ',screenY=' + avaTop;
    }
    /*
    alert(features);
    */
    return features;
}
