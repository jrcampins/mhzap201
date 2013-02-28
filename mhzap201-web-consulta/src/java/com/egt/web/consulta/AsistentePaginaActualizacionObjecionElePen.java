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

import com.egt.base.enums.EnumTipoObjElePen;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.specific.xdp2.ObjecionElePenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionObjecionElePen {

    private PaginaActualizacionObjecionElePen bean;

    public AsistentePaginaActualizacionObjecionElePen() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionObjecionElePen(PaginaActualizacionObjecionElePen bean) {
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
    public String getTextCampoNombreArchivoUltimaAct1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getObjecionElePenDataProvider().getNombreArchivoUltimaAct(rowKey);
        return JSF.getExtensionNombreArchivo(nombre);
    }

    public String getToolTipCampoNombreArchivoUltimaAct1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getObjecionElePenDataProvider().getNombreArchivoUltimaAct(rowKey);
        return JSF.getUrlNombreArchivo(nombre);
    }

    public String getScriptCampoNombreArchivoUltimaAct1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getObjecionElePenDataProvider().getNombreArchivoUltimaAct(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivoUltimaAct1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivoUltimaAct1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivoUltimaAct3Rendered() {
        return true;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPersona">
    private GestorBusquedaReferencia gestorBusquedaIdPersona = null;

    private boolean funcionSelectEjecutableIdPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPersona() {
        if (this.gestorBusquedaIdPersona == null) {
            this.gestorBusquedaIdPersona = new GestorBusquedaReferencia(
                    bean.getObjecionElePenDataProvider(),
                    bean.getPersonaReferenceDataProvider(),
                    ObjecionElePenCachedRowSetDataProvider2.COLUMNA_ID_PERSONA,
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
            return STP.getString(bean.getObjecionElePenDataProvider().getIdPersona(rowKey));
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
            return STP.getString(bean.getObjecionElePenDataProvider().getIdPersona(rowKey));
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
        Long id = bean.getObjecionElePenDataProvider().getIdPersona(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idProveedorDatExt">
    private GestorBusquedaReferencia gestorBusquedaIdProveedorDatExt = null;

    private boolean funcionSelectEjecutableIdProveedorDatExt = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdProveedorDatExt() {
        if (this.gestorBusquedaIdProveedorDatExt == null) {
            this.gestorBusquedaIdProveedorDatExt = new GestorBusquedaReferencia(
                    bean.getObjecionElePenDataProvider(),
                    bean.getProveedorDatExtReferenceDataProvider(),
                    ObjecionElePenCachedRowSetDataProvider2.COLUMNA_ID_PROVEEDOR_DAT_EXT,
                    this.funcionSelectEjecutableIdProveedorDatExt);
        }
        return this.gestorBusquedaIdProveedorDatExt;
    }

    protected FiltroBusqueda getFiltroBusquedaIdProveedorDatExt() {
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

    public void campoIdProveedorDatExt1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdProveedorDatExt().setFiltroBusqueda(this.getFiltroBusquedaIdProveedorDatExt());
        this.getGestorBusquedaIdProveedorDatExt().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdProveedorDatExt1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getObjecionElePenDataProvider().getIdProveedorDatExt(rowKey));
        }
        this.getGestorBusquedaIdProveedorDatExt().setFiltroBusqueda(this.getFiltroBusquedaIdProveedorDatExt());
        return this.getGestorBusquedaIdProveedorDatExt().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdProveedorDatExt1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdProveedorDatExt().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdProveedorDatExt1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getObjecionElePenDataProvider().getIdProveedorDatExt(rowKey));
        }
        this.getGestorBusquedaIdProveedorDatExt().setFiltroBusqueda(this.getFiltroBusquedaIdProveedorDatExt());
        return this.getGestorBusquedaIdProveedorDatExt().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdProveedorDatExt1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ProveedorDatExtCachedRowSetDataProvider2.FUNCION_CONSULTAR_PROVEEDOR_DAT_EXT;
        String campo = bean.getCampoIdProveedorDatExt1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_PROVEEDOR_DAT_EXT;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdProveedorDatExt());
    }

    public String getScriptCampoIdProveedorDatExt1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_PROVEEDOR_DAT_EXT;
        Long id = bean.getObjecionElePenDataProvider().getIdProveedorDatExt(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdProveedorDatExt1Boton2Rendered() {
        return bean == null ? true : bean.getProveedorDatExtReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdProveedorDatExt1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdProveedorDatExt1Boton2Rendered();
    }

    public boolean isCampoIdProveedorDatExt1Panel2Rendered() {
        return isCampoIdProveedorDatExt1Boton2Rendered();
    }

    public boolean isTableColumnIdProveedorDatExt3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdProveedorDatExt1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoObjElePen1() {
        return JSF.getListaOpciones(EnumTipoObjElePen.values(), true, false);
    }

    public Object getOpcionesListaEsObjecionElePenInactiva1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoObjElePen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoObjElePen() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoObjElePenPersonaFallecida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_FALLECIDA.intValue());
    }

    public boolean isNumeroTipoObjElePenPersonaConEmpleo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_CON_EMPLEO.intValue());
    }

    public boolean isNumeroTipoObjElePenPersonaConJubilacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_CON_JUBILACION.intValue());
    }

    public boolean isNumeroTipoObjElePenPersonaConDeuda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_CON_DEUDA.intValue());
    }

    public boolean isNumeroTipoObjElePenPersonaConPenaJudicial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_CON_PENA_JUDICIAL.intValue());
    }

    public boolean isNumeroTipoObjElePenPersonaConOtraPension() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_CON_OTRA_PENSION.intValue());
    }

    public boolean isNumeroTipoObjElePenPersonaConSubsidio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.PERSONA_CON_SUBSIDIO.intValue());
    }

    public boolean isNumeroTipoObjElePenOtraCausa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getNumeroTipoObjElePen(rowKey);
        return value != null && value.equals(EnumTipoObjElePen.OTRA_CAUSA.intValue());
    }

   public boolean isEsObjecionElePenInactiva() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getEsObjecionElePenInactiva(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsObjecionElePenInactiva() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getObjecionElePenDataProvider().getEsObjecionElePenInactiva(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdObjecionElePenRendered() {
        return true;
    }

    public boolean isGridIdPersonaRendered() {
        return true;
    }

    public boolean isGridIdProveedorDatExtRendered() {
        return true;
    }

    public boolean isGridNumeroTipoObjElePenRendered() {
        return true;
    }

    public boolean isGridEsObjecionElePenInactivaRendered() {
        return true;
    }

    public boolean isGridFechaUltimaActualizacionRendered() {
        return true;
    }

    public boolean isGridNombreArchivoUltimaActRendered() {
        return true;
    }

    public boolean isGridObservacionesRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
