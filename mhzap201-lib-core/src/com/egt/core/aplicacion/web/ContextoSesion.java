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

import com.egt.base.constants.CPP;
import com.egt.core.constants.Global;
import com.egt.core.control.UsuarioAutenticado;
import com.egt.core.control.UsuarioAutenticadoCachingServiceLocator;
import com.egt.core.jsf.JSF;
import com.sun.webui.jsf.component.Breadcrumbs;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContextoSesion implements ContextoSesionEstandar, Serializable {

    /** Creates a new instance of ContextoSesion */
    public ContextoSesion() {
        this.designing = true;
        this.contextoBasico = null;
        this.usuarioAutenticado = new UsuarioAutenticado();
    }

    /** Creates a new instance of ContextoSesion */
    public ContextoSesion(ContextoSesionBasico contextoBasico) {
        this.designing = false;
        this.contextoBasico = contextoBasico;
        this.usuarioAutenticado = UsuarioAutenticadoCachingServiceLocator.getInstance();
        this.iniciar();
    }

    private boolean designing;

    public boolean isFilterFragmentRendered() {
        return usuarioAutenticado == null ? true : usuarioAutenticado.isFilterFragmentRendered();
    }

    public void setFilterFragmentRendered(boolean filterFragmentRendered) {
        if (usuarioAutenticado != null) {
            usuarioAutenticado.setFilterFragmentRendered(filterFragmentRendered);
        }
    }

    public boolean isHelpInlineRendered() {
        return usuarioAutenticado == null ? false : usuarioAutenticado.isHelpInlineRendered();
    }

    public void setHelpInlineRendered(boolean helpInlineRendered) {
        if (usuarioAutenticado != null) {
            usuarioAutenticado.setHelpInlineRendered(helpInlineRendered);
        }
    }

    /**
     * Conserva el valor de la propiedad contextoBasico.
     */
    private ContextoSesionBasico contextoBasico;

    /**
     * Getter para propiedad contextoAbstracto.
     * @return Valor de la propiedad contextoAbstracto.
     */
    public ContextoSesionBasico getContextoBasico() {
        return this.contextoBasico;
    }

    private UsuarioAutenticado usuarioAutenticado;

    /**
     * Getter para propiedad usuarioAutenticado.
     * @return Valor de la propiedad usuarioAutenticado.
     */
    @Override
    public UsuarioAutenticado getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    /**
     * Conserva el valor de la propiedad botonAccionRetorno.
     */
    private String botonAccionRetorno = null;

    /**
     * Getter para propiedad botonAccionRetorno.
     * @return Valor de la propiedad botonAccionRetorno.
     */
    @Override
    public String getBotonAccionRetorno() {
        String valor = JSF.getRequestParameter(CPP.ID_BOTON_ACCION_RETORNO);
        String reset = JSF.getRequestParameter(Global.PARAMETRO_CONDICION_SESION);
        if (valor == null && reset != null) {
            this.botonAccionRetorno = null;
        } else if (valor != null) {
            this.botonAccionRetorno = valor;
        }
        return this.botonAccionRetorno;
    }

    /**
     * Conserva el valor de la propiedad campoAccionRetorno.
     */
    private String campoAccionRetorno = null;

    /**
     * Getter para propiedad campoAccionRetorno.
     * @return Valor de la propiedad campoAccionRetorno.
     */
    @Override
    public String getCampoAccionRetorno() {
        String valor = JSF.getRequestParameter(CPP.ID_CAMPO_ACCION_RETORNO);
        String reset = JSF.getRequestParameter(Global.PARAMETRO_CONDICION_SESION);
        if (valor == null && reset != null) {
            this.campoAccionRetorno = null;
        } else if (valor != null) {
            this.campoAccionRetorno = valor;
        }
        return this.campoAccionRetorno;
    }

    /**
     * Conserva el valor de la propiedad opcionCampoRetorno.
     */
    private String opcionCampoRetorno = null;

    /**
     * Getter para propiedad opcionCampoRetorno.
     * @return Valor de la propiedad opcionCampoRetorno.
     */
    @Override
    public String getOpcionCampoRetorno() {
        String valor = JSF.getRequestParameter(CPP.ID_OPCION_CAMPO_RETORNO);
        String reset = JSF.getRequestParameter(Global.PARAMETRO_CONDICION_SESION);
        if (valor == null && reset != null) {
            this.opcionCampoRetorno = null;
        } else if (valor != null) {
            this.opcionCampoRetorno = valor;
        }
        return this.opcionCampoRetorno;
    }

    /**
     * Conserva el valor de la propiedad versionComandoSelectPagina.
     */
    private Map versionComandoSelectPagina = new LinkedHashMap();

    /**
     * Getter para propiedad versionComandoSelectPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad versionComandoSelectPagina.
     */
    @Override
    public long getVersionComandoSelectPagina(String pagina) {
        Long valor = null;
        if (this.versionComandoSelectPagina.containsKey(pagina)) {
            valor = (Long) this.versionComandoSelectPagina.get(pagina);
        }
        return valor == null ? -1L : valor;
    }

    /**
     * Setter para propiedad versionComandoSelectPagina.
     * @param pagina Nombre del bean de la pagina
     * @param version Nuevo valor de la propiedad versionComandoSelectPagina.
     */
    @Override
    public void setVersionComandoSelectPagina(String pagina, long version) {
        this.versionComandoSelectPagina.put(pagina, version);
    }

    /**
     * Conserva el valor de la propiedad identificacionFuncionAccionPagina.
     */
    private Map identificacionFuncionAccionPagina = new LinkedHashMap();

    /**
     * Getter para propiedad identificacionFuncionAccionPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad identificacionFuncionAccionPagina.
     */
    @Override
    public Long getIdentificacionFuncionAccionPagina(String pagina) {
        Long valor = null;
        if (this.identificacionFuncionAccionPagina.containsKey(pagina)) {
            valor = (Long) this.identificacionFuncionAccionPagina.get(pagina);
        }
        return valor;
    }

    /**
     * Setter para propiedad identificacionFuncionAccionPagina.
     * @param pagina Nombre del bean de la pagina
     * @param funcion Nuevo valor de la propiedad identificacionFuncionAccionPagina.
     */
    @Override
    public void setIdentificacionFuncionAccionPagina(String pagina, Long funcion) {
        this.identificacionFuncionAccionPagina.put(pagina, funcion);
    }

    /**
     * Conserva el valor de la propiedad identificacionRecursoMaestro.
     */
    private Map columnaIdentificacionRecursoMaestroPagina = new LinkedHashMap();

    /**
     * Getter para propiedad columnaIdentificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad columnaIdentificacionRecursoMaestroPagina.
     */
    @Override
    public String getColumnaIdentificacionRecursoMaestroPagina(String pagina) {
        String valor = null;
        if (this.columnaIdentificacionRecursoMaestroPagina.containsKey(pagina)) {
            valor = (String) this.columnaIdentificacionRecursoMaestroPagina.get(pagina);
        }
        return valor;
    }

    /**
     * Setter para propiedad columnaIdentificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @param identificacion Nuevo valor de la propiedad columnaIdentificacionRecursoMaestroPagina.
     */
    @Override
    public void setColumnaIdentificacionRecursoMaestroPagina(String pagina, String identificacion) {
        this.columnaIdentificacionRecursoMaestroPagina.put(pagina, identificacion);
    }

    /**
     * Conserva el valor de la propiedad identificacionRecursoMaestro.
     */
    private Map identificacionRecursoMaestroPagina = new LinkedHashMap();

    /**
     * Getter para propiedad identificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @return Valor de la propiedad identificacionRecursoMaestroPagina.
     */
    @Override
    public Long getIdentificacionRecursoMaestroPagina(String pagina) {
        Long valor = null;
        if (this.identificacionRecursoMaestroPagina.containsKey(pagina)) {
            valor = (Long) this.identificacionRecursoMaestroPagina.get(pagina);
        }
        return valor;
    }

    /**
     * Setter para propiedad identificacionRecursoMaestroPagina.
     * @param pagina Nombre del bean de la pagina
     * @param identificacion Nuevo valor de la propiedad identificacionRecursoMaestroPagina.
     */
    @Override
    public void setIdentificacionRecursoMaestroPagina(String pagina, Long identificacion) {
        this.identificacionRecursoMaestroPagina.put(pagina, identificacion);
    }

    /**
     * Conserva el valor de la propiedad migasPan.
     */
    private Breadcrumbs migas;

    /**
     * Getter para propiedad migasPan.
     * @return Valor de la propiedad migasPan.
     */
    @Override
    public Breadcrumbs getMigas() {
        return this.migas;
    }

    private String contexto;

    private void iniciar() {
        String metodo = "iniciar";
        try {
            this.contexto = this.getContextoBasico().getFacesContext().getExternalContext().getRequestContextPath();
            JSF.stamp(this, metodo, this.contexto, true);
            this.getContextoBasico().getContextoAplicacion();
            this.migas = new SessionBreadcrumbs();
            if (JSF.getRequestParameter(Global.PARAMETRO_CONDICION_SESION) == null) {
                this.getContextoBasico().getContextoAplicacion().restaurar();
            }
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName() + "." + metodo);
        }
    }

    public void desactivar() {
        String metodo = "desactivar";
        try {
            JSF.stamp(this, metodo, this.contexto, false);
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName() + "." + metodo);
        }
    }

    public void activar() {
        String metodo = "activar";
        try {
            JSF.stamp(this, metodo, this.contexto, false);
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName() + "." + metodo);
        }
    }

    public void destruir() {
        String metodo = "destruir";
        try {
            JSF.stamp(this, metodo, this.contexto, false);
            this.contextoBasico = null;
            this.usuarioAutenticado = null;
            this.botonAccionRetorno = null;
            this.campoAccionRetorno = null;
            this.opcionCampoRetorno = null;
            this.versionComandoSelectPagina = null;
            this.identificacionFuncionAccionPagina = null;
            this.columnaIdentificacionRecursoMaestroPagina = null;
            this.identificacionRecursoMaestroPagina = null;
            this.migas = null;
            System.out.println(this.getClass().getSimpleName() + "." + metodo + "()");
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName() + "." + metodo);
        }
    }

    class SessionBreadcrumbs extends Breadcrumbs implements Serializable {

        public SessionBreadcrumbs() {
            super();
            setId(this.getClass().getSimpleName() + System.currentTimeMillis());
            JSF.addHipervinculoInicio(this);
        }
    }
}
