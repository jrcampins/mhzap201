/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.consulta;

import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.specific.xdp2.LogProAcrPotBenCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AsistentePaginaActualizacionLogProAcrPotBen {

    private PaginaActualizacionLogProAcrPotBen bean;

    public AsistentePaginaActualizacionLogProAcrPotBen() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogProAcrPotBen(PaginaActualizacionLogProAcrPotBen bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
        };
        return bean.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    void procesar() {
        if (bean.getRecursoDataProvider().isFuncionBusinessProcessAutorizada()) {
            bean.getGestor().procesar(new RowProcessor() {

                @Override
                public void processRow(RowKey rowKey) throws Exception {
                    procesar(rowKey);
                }
            });
        }
    }

    void procesar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "procesar", rowKey);
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPotencialBen">
    private GestorBusquedaReferencia gestorBusquedaIdPotencialBen = null;

    private boolean funcionSelectEjecutableIdPotencialBen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPotencialBen() {
        if (this.gestorBusquedaIdPotencialBen == null) {
            this.gestorBusquedaIdPotencialBen = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getPotencialBenReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_POTENCIAL_BEN,
                    this.funcionSelectEjecutableIdPotencialBen);
        }
        return this.gestorBusquedaIdPotencialBen;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPotencialBen() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPotencialBen().setFiltroBusqueda(this.getFiltroBusquedaIdPotencialBen());
        this.getGestorBusquedaIdPotencialBen().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPotencialBen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdPotencialBen(rowKey));
        }
        this.getGestorBusquedaIdPotencialBen().setFiltroBusqueda(this.getFiltroBusquedaIdPotencialBen());
        return this.getGestorBusquedaIdPotencialBen().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPotencialBen1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPotencialBen().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPotencialBen1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdPotencialBen(rowKey));
        }
        this.getGestorBusquedaIdPotencialBen().setFiltroBusqueda(this.getFiltroBusquedaIdPotencialBen());
        return this.getGestorBusquedaIdPotencialBen().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPotencialBen1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PotencialBenCachedRowSetDataProvider2.FUNCION_CONSULTAR_POTENCIAL_BEN;
        String campo = bean.getCampoIdPotencialBen1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_POTENCIAL_BEN;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdPotencialBen());
    }

    public String getScriptCampoIdPotencialBen1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_POTENCIAL_BEN;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdPotencialBen(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdPotencialBen1Boton2Rendered() {
        return bean == null ? true : bean.getPotencialBenReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPotencialBen1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPotencialBen1Boton2Rendered();
    }

    public boolean isCampoIdPotencialBen1Panel2Rendered() {
        return isCampoIdPotencialBen1Boton2Rendered();
    }

    public boolean isTableColumnIdPotencialBen3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPotencialBen1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPersona">
    private GestorBusquedaReferencia gestorBusquedaIdPersona = null;

    private boolean funcionSelectEjecutableIdPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPersona() {
        if (this.gestorBusquedaIdPersona == null) {
            this.gestorBusquedaIdPersona = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getPersonaReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_PERSONA,
                    this.funcionSelectEjecutableIdPersona);
        }
        return this.gestorBusquedaIdPersona;
    }

    protected FiltroBusqueda getFiltroBusquedaIdPersona() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPersona().setFiltroBusqueda(this.getFiltroBusquedaIdPersona());
        this.getGestorBusquedaIdPersona().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdPersona(rowKey));
        }
        this.getGestorBusquedaIdPersona().setFiltroBusqueda(this.getFiltroBusquedaIdPersona());
        return this.getGestorBusquedaIdPersona().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdPersona1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdPersona().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdPersona(rowKey));
        }
        this.getGestorBusquedaIdPersona().setFiltroBusqueda(this.getFiltroBusquedaIdPersona());
        return this.getGestorBusquedaIdPersona().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdPersona1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = PersonaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PERSONA;
        String campo = bean.getCampoIdPersona1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_PERSONA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdPersona());
    }

    public String getScriptCampoIdPersona1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_PERSONA;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdPersona(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdPersona1Boton2Rendered() {
        return bean == null ? true : bean.getPersonaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdPersona1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdPersona1Boton2Rendered();
    }

    public boolean isCampoIdPersona1Panel2Rendered() {
        return isCampoIdPersona1Boton2Rendered();
    }

    public boolean isTableColumnIdPersona3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdPersona1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDepartamento">
    private GestorBusquedaReferencia gestorBusquedaIdDepartamento = null;

    private boolean funcionSelectEjecutableIdDepartamento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDepartamento() {
        if (this.gestorBusquedaIdDepartamento == null) {
            this.gestorBusquedaIdDepartamento = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_DEPARTAMENTO,
                    this.funcionSelectEjecutableIdDepartamento);
        }
        return this.gestorBusquedaIdDepartamento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDepartamento() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdDepartamento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        this.getGestorBusquedaIdDepartamento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDepartamento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdDepartamento(rowKey));
        }
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        return this.getGestorBusquedaIdDepartamento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDepartamento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDepartamento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdDepartamento(rowKey));
        }
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        return this.getGestorBusquedaIdDepartamento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDepartamento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDepartamento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDepartamento());
    }

    public String getScriptCampoIdDepartamento1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdDepartamento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDepartamento1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDepartamento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDepartamento1Boton2Rendered();
    }

    public boolean isCampoIdDepartamento1Panel2Rendered() {
        return isCampoIdDepartamento1Boton2Rendered();
    }

    public boolean isTableColumnIdDepartamento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDepartamento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDistrito">
    private GestorBusquedaReferencia gestorBusquedaIdDistrito = null;

    private boolean funcionSelectEjecutableIdDistrito = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDistrito() {
        if (this.gestorBusquedaIdDistrito == null) {
            this.gestorBusquedaIdDistrito = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_DISTRITO,
                    this.funcionSelectEjecutableIdDistrito);
        }
        return this.gestorBusquedaIdDistrito;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDistrito() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdDistrito1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        this.getGestorBusquedaIdDistrito().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDistrito1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdDistrito(rowKey));
        }
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        return this.getGestorBusquedaIdDistrito().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDistrito1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistrito().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDistrito1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdDistrito(rowKey));
        }
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        return this.getGestorBusquedaIdDistrito().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDistrito1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDistrito1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDistrito());
    }

    public String getScriptCampoIdDistrito1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdDistrito(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDistrito1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDistrito1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDistrito1Boton2Rendered();
    }

    public boolean isCampoIdDistrito1Panel2Rendered() {
        return isCampoIdDistrito1Boton2Rendered();
    }

    public boolean isTableColumnIdDistrito3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDistrito1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idBarrio">
    private GestorBusquedaReferencia gestorBusquedaIdBarrio = null;

    private boolean funcionSelectEjecutableIdBarrio = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdBarrio() {
        if (this.gestorBusquedaIdBarrio == null) {
            this.gestorBusquedaIdBarrio = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_BARRIO,
                    this.funcionSelectEjecutableIdBarrio);
        }
        return this.gestorBusquedaIdBarrio;
    }

    protected FiltroBusqueda getFiltroBusquedaIdBarrio() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdBarrio1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        this.getGestorBusquedaIdBarrio().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdBarrio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdBarrio(rowKey));
        }
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        return this.getGestorBusquedaIdBarrio().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdBarrio1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdBarrio().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdBarrio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdBarrio(rowKey));
        }
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        return this.getGestorBusquedaIdBarrio().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdBarrio1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdBarrio1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdBarrio());
    }

    public String getScriptCampoIdBarrio1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdBarrio(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdBarrio1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdBarrio1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdBarrio1Boton2Rendered();
    }

    public boolean isCampoIdBarrio1Panel2Rendered() {
        return isCampoIdBarrio1Boton2Rendered();
    }

    public boolean isTableColumnIdBarrio3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdBarrio1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaPersona">
    private GestorBusquedaReferencia gestorBusquedaIdFichaPersona = null;

    private boolean funcionSelectEjecutableIdFichaPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFichaPersona() {
        if (this.gestorBusquedaIdFichaPersona == null) {
            this.gestorBusquedaIdFichaPersona = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getFichaPersonaReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_FICHA_PERSONA,
                    this.funcionSelectEjecutableIdFichaPersona);
        }
        return this.gestorBusquedaIdFichaPersona;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFichaPersona() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdFichaPersona1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFichaPersona().setFiltroBusqueda(this.getFiltroBusquedaIdFichaPersona());
        this.getGestorBusquedaIdFichaPersona().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFichaPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdFichaPersona(rowKey));
        }
        this.getGestorBusquedaIdFichaPersona().setFiltroBusqueda(this.getFiltroBusquedaIdFichaPersona());
        return this.getGestorBusquedaIdFichaPersona().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFichaPersona1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFichaPersona().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFichaPersona1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdFichaPersona(rowKey));
        }
        this.getGestorBusquedaIdFichaPersona().setFiltroBusqueda(this.getFiltroBusquedaIdFichaPersona());
        return this.getGestorBusquedaIdFichaPersona().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFichaPersona1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FichaPersonaCachedRowSetDataProvider2.FUNCION_CONSULTAR_FICHA_PERSONA;
        String campo = bean.getCampoIdFichaPersona1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FICHA_PERSONA;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFichaPersona());
    }

    public String getScriptCampoIdFichaPersona1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FICHA_PERSONA;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdFichaPersona(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFichaPersona1Boton2Rendered() {
        return bean == null ? true : bean.getFichaPersonaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFichaPersona1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFichaPersona1Boton2Rendered();
    }

    public boolean isCampoIdFichaPersona1Panel2Rendered() {
        return isCampoIdFichaPersona1Boton2Rendered();
    }

    public boolean isTableColumnIdFichaPersona3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFichaPersona1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaHogar">
    private GestorBusquedaReferencia gestorBusquedaIdFichaHogar = null;

    private boolean funcionSelectEjecutableIdFichaHogar = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFichaHogar() {
        if (this.gestorBusquedaIdFichaHogar == null) {
            this.gestorBusquedaIdFichaHogar = new GestorBusquedaReferencia(
                    bean.getLogProAcrPotBenDataProvider(),
                    bean.getFichaHogarReferenceDataProvider(),
                    LogProAcrPotBenCachedRowSetDataProvider2.COLUMNA_ID_FICHA_HOGAR,
                    this.funcionSelectEjecutableIdFichaHogar);
        }
        return this.gestorBusquedaIdFichaHogar;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFichaHogar() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public void campoIdFichaHogar1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFichaHogar().setFiltroBusqueda(this.getFiltroBusquedaIdFichaHogar());
        this.getGestorBusquedaIdFichaHogar().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFichaHogar1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdFichaHogar(rowKey));
        }
        this.getGestorBusquedaIdFichaHogar().setFiltroBusqueda(this.getFiltroBusquedaIdFichaHogar());
        return this.getGestorBusquedaIdFichaHogar().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFichaHogar1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFichaHogar().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFichaHogar1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProAcrPotBenDataProvider().getIdFichaHogar(rowKey));
        }
        this.getGestorBusquedaIdFichaHogar().setFiltroBusqueda(this.getFiltroBusquedaIdFichaHogar());
        return this.getGestorBusquedaIdFichaHogar().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFichaHogar1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FichaHogarCachedRowSetDataProvider2.FUNCION_CONSULTAR_FICHA_HOGAR;
        String campo = bean.getCampoIdFichaHogar1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FICHA_HOGAR;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFichaHogar());
    }

    public String getScriptCampoIdFichaHogar1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FICHA_HOGAR;
        Long id = bean.getLogProAcrPotBenDataProvider().getIdFichaHogar(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFichaHogar1Boton2Rendered() {
        return bean == null ? true : bean.getFichaHogarReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFichaHogar1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFichaHogar1Boton2Rendered();
    }

    public boolean isCampoIdFichaHogar1Panel2Rendered() {
        return isCampoIdFichaHogar1Boton2Rendered();
    }

    public boolean isTableColumnIdFichaHogar3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFichaHogar1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsProcesado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsProcesado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProAcrPotBenDataProvider().getEsProcesado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsProcesado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProAcrPotBenDataProvider().getEsProcesado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogProAcrPotBenRendered() {
        return true;
    }

    public boolean isGridIdPotencialBenRendered() {
        return true;
    }

    public boolean isGridNombrePotencialBenRendered() {
        return true;
    }

    public boolean isGridCodigoPotencialBenRendered() {
        return true;
    }

    public boolean isGridFechaRegistroPotBenRendered() {
        return true;
    }

    public boolean isGridIdPersonaRendered() {
        return true;
    }

    public boolean isGridNombrePersonaRendered() {
        return true;
    }

    public boolean isGridCodigoPersonaRendered() {
        return true;
    }

    public boolean isGridIdDepartamentoRendered() {
        return true;
    }

    public boolean isGridIdDistritoRendered() {
        return true;
    }

    public boolean isGridIdBarrioRendered() {
        return true;
    }

    public boolean isGridIdFichaPersonaRendered() {
        return true;
    }

    public boolean isGridCodigoFichaPersonaRendered() {
        return true;
    }

    public boolean isGridNombreFichaPersonaRendered() {
        return true;
    }

    public boolean isGridIdFichaHogarRendered() {
        return true;
    }

    public boolean isGridCodigoFichaHogarRendered() {
        return true;
    }

    public boolean isGridIndiceCalidadVidaRendered() {
        return true;
    }

    public boolean isGridEsProcesadoRendered() {
        return true;
    }

    public boolean isGridObservacionRendered() {
        return true;
    }

    public boolean isGridFechaHoraTransaccionRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
