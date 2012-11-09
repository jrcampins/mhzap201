/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.aplicacion.web;

import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.util.JS;
import com.egt.core.jsf.JSF;
import java.io.IOException;
import java.io.Serializable;

public class ContextoAplicacion implements ContextoAplicacionEstandar, Serializable {

    /** Creates a new instance of ContextoAplicacion */
    public ContextoAplicacion() {
        this.designing = true;
        this.contextoBasico = null;
    }

    /** Creates a new instance of ContextoAplicacion */
    public ContextoAplicacion(ContextoAplicacionBasico contextoBasico) {
        this.designing = false;
        this.contextoBasico = contextoBasico;
        this.iniciar();
    }

    private boolean designing;

    /**
     * Conserva el valor de la propiedad contextoBasico.
     */
    private ContextoAplicacionBasico contextoBasico;

    /**
     * Getter para propiedad contextoBasico.
     * @return Valor de la propiedad contextoBasico.
     */
    public ContextoAplicacionBasico getContextoBasico() {
        return this.contextoBasico;
    }

    /**
     * Conserva el valor de la propiedad onClickJavaScript.
     */
    private String onClickJavaScript;

    /**
     * Getter para propiedad onClickJavaScript.
     * @return Valor de la propiedad onClickJavaScript.
     */
    public String getOnClickJavaScript() {
        return this.onClickJavaScript;
    }

    /**
     * Conserva el valor de la propiedad onDblClickJavaScript.
     */
    private String onDblClickJavaScript;

    /**
     * Getter para propiedad onDblClickJavaScript.
     * @return Valor de la propiedad onDblClickJavaScript.
     */
    public String getOnDblClickJavaScript() {
        return this.onDblClickJavaScript;
    }

    /**
     * Conserva el valor de la propiedad onKeyPressJavaScript.
     */
    private String onKeyPressJavaScript;

    /**
     * Getter para propiedad onKeyPressJavaScript.
     * @return Valor de la propiedad onKeyPressJavaScript.
     */
    public String getOnKeyPressJavaScript() {
        return this.onKeyPressJavaScript;
    }

    /**
     * Conserva el valor de la propiedad onLoadJavaScript.
     */
    private String onLoadJavaScript;

    /**
     * Getter para propiedad onLoadJavaScript.
     * @return Valor de la propiedad onLoadJavaScript.
     */
    public String getOnLoadJavaScript() {
        return this.onLoadJavaScript;
    }

    /**
     * Conserva el valor de la propiedad onUnloadJavaScript.
     */
    private String onUnloadJavaScript;

    /**
     * Getter para propiedad onUnloadJavaScript.
     * @return Valor de la propiedad onUnloadJavaScript.
     */
    public String getOnUnloadJavaScript() {
        return this.onUnloadJavaScript;
    }

    private String contexto;

    private void iniciar() {
        String metodo = "iniciar";
        try {
            this.contexto = this.getContextoBasico().getFacesContext().getExternalContext().getRequestContextPath();
            JSF.stamp(this, metodo, this.contexto, true);
            this.onClickJavaScript = JS.getOnClickJavaScript();
            this.onDblClickJavaScript = JS.getOnDblClickJavaScript();
            this.onKeyPressJavaScript = JS.getOnKeyPressJavaScript();
            this.onLoadJavaScript = JS.getOnLoadJavaScript();
            this.onUnloadJavaScript = JS.getOnUnloadJavaScript();
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName() + "." + metodo);
        }
    }

    public void destruir() {
        String metodo = "destruir";
        try {
            JSF.stamp(this, metodo, this.contexto, false);
            this.contextoBasico = null;
            System.out.println(this.getClass().getSimpleName() + "." + metodo + "()");
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName() + "." + metodo);
        }
    }

    public void restaurar() {
        String url = this.getContextoBasico().getFacesContext().getExternalContext().getRequestContextPath();
        String rpl = "?" + Global.PARAMETRO_CONDICION_SESION + "=" + Global.SESION_RESTAURADA;
        try {
            JSF.redirect(url + "/" + rpl);
        } catch (IOException ex) {
            TLC.getBitacora().error(ex);
        }
    }
}
