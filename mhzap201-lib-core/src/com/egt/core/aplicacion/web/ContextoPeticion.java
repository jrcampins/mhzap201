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
import com.egt.core.util.Bundle;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.jsf.JSF;
import com.egt.core.util.Utils;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import java.io.Serializable;
import org.apache.commons.lang.StringUtils;

public class ContextoPeticion implements ContextoPeticionEstandar, Serializable {

    /** Creates a new instance of ContextoPeticion */
    public ContextoPeticion() {
        this.designing = true;
        this.contextoBasico = null;
    }

    /** Creates a new instance of ContextoPeticion */
    public ContextoPeticion(ContextoPeticionBasico contextoBasico) {
        this.designing = false;
        this.contextoBasico = contextoBasico;
        this.iniciar();
    }

    private boolean designing;

    /**
     * Conserva el valor de la propiedad contextoBasico.
     */
    private ContextoPeticionBasico contextoBasico;

    /**
     * Getter para propiedad contextoAbstracto.
     * @return Valor de la propiedad contextoAbstracto.
     */
    public ContextoPeticionBasico getContextoBasico() {
        return this.contextoBasico;
    }

    /**
     * Conserva el valor de la propiedad paginaActual.
     */
    private AbstractPageBean paginaActual;

    /**
     * Getter para propiedad paginaActual.
     * @return Valor de la propiedad paginaActual.
     */
    @Override
    public AbstractPageBean getPaginaActual() {
        return this.paginaActual;
    }

    /**
     * Setter para propiedad paginaActual.
     * @param paginaActual Nuevo valor de la propiedad paginaActual.
     */
    @Override
    public void setPaginaActual(AbstractPageBean paginaActual) {
        this.paginaActual = paginaActual;
    }

    /**
     * Conserva el valor de la propiedad paginaActual.
     */
    private FragmentoFiltroEstandar fragmentoFiltroActual;

    /**
     * Getter para propiedad paginaActual.
     * @return Valor de la propiedad paginaActual.
     */
    @Override
    public FragmentoFiltroEstandar getFragmentoFiltroActual() {
        return this.fragmentoFiltroActual;
    }

    /**
     * Setter para propiedad paginaActual.
     * @param paginaActual Nuevo valor de la propiedad paginaActual.
     */
    @Override
    public void setFragmentoFiltroActual(FragmentoFiltroEstandar fragmentoFiltroActual) {
        this.fragmentoFiltroActual = fragmentoFiltroActual;
    }

    /**
     * Conserva el valor de la propiedad gestorActual.
     */
    private GestorPaginaBasica gestorActual;

    /**
     * Getter para propiedad gestorActual.
     * @return Valor de la propiedad gestorActual.
     */
    @Override
    public GestorPaginaBasica getGestorActual() {
        return this.gestorActual;
    }

    /**
     * Setter para propiedad gestorActual.
     * @param gestorActual Nuevo valor de la propiedad gestorActual.
     */
    @Override
    public void setGestorActual(GestorPaginaBasica gestorActual) {
        this.gestorActual = gestorActual;
    }

    /**
     * Conserva el valor de la propiedad condicionSesion.
     */
    private Integer condicionSesion;

    /**
     * Getter para propiedad condicionSesion.
     * @return Valor de la propiedad condicionSesion.
     */
    @Override
    public Integer getCondicionSesion() {
        String clave = Global.PARAMETRO_CONDICION_SESION;
        if (this.condicionSesion == null) {
            String valor = JSF.getRequestParameter(clave);
            if (StringUtils.isNotBlank(valor)) {
                this.condicionSesion = Integer.valueOf(valor);
            }
        }
        return this.condicionSesion;
    }

    /**
     * Setter para propiedad condicionSesion.
     * @param condicionSesion Nuevo valor de la propiedad condicionSesion.
     */
    @Override
    public void setCondicionSesion(Integer condicionSesion) {
        this.condicionSesion = condicionSesion;
    }

    /**
     * Conserva el valor de la propiedad codigoFuncionSelect.
     */
    private String codigoFuncionSelect;

    /**
     * Getter para propiedad codigoFuncionSelect.
     * @return Valor de la propiedad codigoFuncionSelect.
     */
    @Override
    public String getCodigoFuncionSelect() {
        return this.codigoFuncionSelect;
    }

    /**
     * Setter para propiedad codigoFuncionSelect.
     * @param codigoFuncionSelect Nuevo valor de la propiedad codigoFuncionSelect.
     */
    @Override
    public void setCodigoFuncionSelect(String codigoFuncionSelect) {
        this.codigoFuncionSelect = codigoFuncionSelect;
    }

    /**
     * Conserva el valor de la propiedad nombreFuncionSelect.
     */
    private String nombreFuncionSelect;

    /**
     * Getter para propiedad nombreFuncionSelect.
     * @return Valor de la propiedad nombreFuncionSelect.
     */
    @Override
    public String getNombreFuncionSelect() {
        return this.nombreFuncionSelect;
    }

    /**
     * Setter para propiedad nombreFuncionSelect.
     * @param nombreFuncionSelect Nuevo valor de la propiedad nombreFuncionSelect.
     */
    @Override
    public void setNombreFuncionSelect(String nombreFuncionSelect) {
        this.nombreFuncionSelect = nombreFuncionSelect;
    }

    /**
     * Conserva el valor de la propiedad filtroFuncionSelect.
     */
    private Long filtroFuncionSelect;

    /**
     * Getter para propiedad filtroFuncionSelect.
     * @return Valor de la propiedad filtroFuncionSelect.
     */
    @Override
    public Long getFiltroFuncionSelect() {
        return this.filtroFuncionSelect;
    }

    /**
     * Setter para propiedad filtroSelect.
     * @param filtroSelect Nuevo valor de la propiedad filtroSelect.
     */
    @Override
    public void setFiltroFuncionSelect(Long filtroSelect) {
        this.filtroFuncionSelect = filtroSelect;
    }

    /**
     * Conserva el valor de la propiedad identificacionRecurso.
     */
    private Long identificacionRecurso;

    /**
     * Getter para propiedad identificacionRecurso.
     * @return Valor de la propiedad identificacionRecurso.
     */
    @Override
    public Long getIdentificacionRecurso() {
        String clave = CPP.ID_RECURSO;
        if (this.identificacionRecurso == null) {
            String valor = JSF.getRequestParameter(clave);
            if (StringUtils.isNotBlank(valor)) {
                this.identificacionRecurso = Long.valueOf(valor);
            }
        }
        return this.identificacionRecurso;
    }

    /**
     * Setter para propiedad identificacionRecurso.
     * @param identificacionRecurso Nuevo valor de la propiedad identificacionRecurso.
     */
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.identificacionRecurso = identificacionRecurso;
    }

    /**
     * Conserva el valor de la propiedad identificacionRecursoMaestro.
     */
    private Long identificacionRecursoMaestro;

    /**
     * Getter para propiedad identificacionRecursoMaestro.
     * @return Valor de la propiedad identificacionRecursoMaestro.
     */
    @Override
    public Long getIdentificacionRecursoMaestro() {
        String clave = CPP.ID_RECURSO_MAESTRO;
        if (this.identificacionRecursoMaestro == null) {
            String valor = JSF.getRequestParameter(clave);
            if (StringUtils.isNotBlank(valor)) {
                this.identificacionRecursoMaestro = Long.valueOf(valor);
            }
        }
        return this.identificacionRecursoMaestro;
    }

    /**
     * Setter para propiedad identificacionRecursoMaestro.
     * @param identificacionRecursoMaestro Nuevo valor de la propiedad identificacionRecursoMaestro.
     */
    @Override
    public void setIdentificacionRecursoMaestro(Long identificacionRecursoMaestro) {
        this.identificacionRecursoMaestro = identificacionRecursoMaestro;
    }

    /**
     * Conserva el valor de la propiedad identificacionRecurso.
     */
    private Long identificacionFuncionReferencia;

    /**
     * Getter para propiedad identificacionRecurso.
     * @return Valor de la propiedad identificacionRecurso.
     */
    @Override
    public Long getIdentificacionFuncionReferencia() {
        String clave = CPP.ID_FUNCION_REFERENCIA;
        if (this.identificacionFuncionReferencia == null) {
            String valor = JSF.getRequestParameter(clave);
            if (StringUtils.isNotBlank(valor)) {
                this.identificacionFuncionReferencia = Long.valueOf(valor);
            }
        }
        return this.identificacionFuncionReferencia;
    }

    /**
     * Setter para propiedad identificacionRecurso.
     * @param identificacionRecurso Nuevo valor de la propiedad identificacionRecurso.
     */
    @Override
    public void setIdentificacionFuncionReferencia(Long identificacionFuncionReferencia) {
        this.identificacionFuncionReferencia = identificacionFuncionReferencia;
    }

    /**
     * Conserva el valor de la propiedad criteriosBusqueda.
     */
    private String criteriosBusqueda;

    /**
     * Getter para propiedad criteriosBusqueda.
     * @return Valor de la propiedad criteriosBusqueda.
     */
    @Override
    public String getCriteriosBusqueda() {
        if (this.criteriosBusqueda == null) {
            this.criteriosBusqueda = JSF.getRequestParameter(FiltroBusqueda.class.getSimpleName());
            if (this.criteriosBusqueda != null) {
                this.criteriosBusqueda = this.criteriosBusqueda.replace("*", "%");
            }
        }
        return this.criteriosBusqueda;
    }

    /**
     * Setter para propiedad criteriosBusqueda.
     * @param criteriosBusqueda Nuevo valor de la propiedad criteriosBusqueda.
     */
    @Override
    public void setCriteriosBusqueda(String criteriosBusqueda) {
        this.criteriosBusqueda = criteriosBusqueda;
    }

    private String contexto;

    private void iniciar() {
        String metodo = "iniciar";
        try {
            this.contexto = this.getContextoBasico().getFacesContext().getExternalContext().
                    getRequestContextPath();
            JSF.stamp(this, metodo, this.contexto, true);
            Utils.traceContext();
            TLC.iniciar();
            this.getContextoBasico().getContextoSesion();
            this.getContextoBasico().getContextoSesion().getBotonAccionRetorno();
            this.getContextoBasico().getContextoSesion().getCampoAccionRetorno();
            this.getContextoBasico().getContextoSesion().getOpcionCampoRetorno();
            if (Global.SESION_RESTAURADA.equals(this.getCondicionSesion())) {
                TLC.getBitacora().info(Bundle.getString("bean.session.reset"));
            }
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName()
                    + "." + metodo);
        }
    }

    public void destruir() {
        String metodo = "destruir";
        try {
            JSF.stamp(this, metodo, this.contexto, false);
            this.contextoBasico = null;
            this.paginaActual = null;
            this.fragmentoFiltroActual = null;
            this.gestorActual = null;
            TLC.destruir();
        } catch (Exception exception) {
            this.getContextoBasico().log(exception.getClass().getName() + "@" + this.getClass().getName()
                    + "." + metodo);
        }
    }

}
