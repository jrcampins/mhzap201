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
import com.egt.data.specific.xdp2.LogImpIdsCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogImpIds {

    private PaginaActualizacionLogImpIds bean;

    public AsistentePaginaActualizacionLogImpIds() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogImpIds(PaginaActualizacionLogImpIds bean) {
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
    public String getTextCampoNombreArchivo1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getLogImpIdsDataProvider().getNombreArchivo(rowKey);
        return JSF.getExtensionNombreArchivo(nombre);
    }

    public String getToolTipCampoNombreArchivo1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getLogImpIdsDataProvider().getNombreArchivo(rowKey);
        return JSF.getUrlNombreArchivo(nombre);
    }

    public String getScriptCampoNombreArchivo1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getLogImpIdsDataProvider().getNombreArchivo(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivo1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivo1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivo3Rendered() {
        return true;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPersona">
    private GestorBusquedaReferencia gestorBusquedaIdPersona = null;

    private boolean funcionSelectEjecutableIdPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPersona() {
        if (this.gestorBusquedaIdPersona == null) {
            this.gestorBusquedaIdPersona = new GestorBusquedaReferencia(
                    bean.getLogImpIdsDataProvider(),
                    bean.getPersonaReferenceDataProvider(),
                    LogImpIdsCachedRowSetDataProvider2.COLUMNA_ID_PERSONA,
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
            return STP.getString(bean.getLogImpIdsDataProvider().getIdPersona(rowKey));
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
            return STP.getString(bean.getLogImpIdsDataProvider().getIdPersona(rowKey));
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
        Long id = bean.getLogImpIdsDataProvider().getIdPersona(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsImportado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpIdsDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpIdsDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogImpIdsRendered() {
        return true;
    }

    public boolean isGridCedulaRendered() {
        return true;
    }

    public boolean isGridLetraCedulaRendered() {
        return true;
    }

    public boolean isGridApellidosRendered() {
        return true;
    }

    public boolean isGridNombresRendered() {
        return true;
    }

    public boolean isGridNacimientoRendered() {
        return true;
    }

    public boolean isGridSexoRendered() {
        return true;
    }

    public boolean isGridNacionalidadRendered() {
        return true;
    }

    public boolean isGridEstadoCivilRendered() {
        return true;
    }

    public boolean isGridLugarNacimientoRendered() {
        return true;
    }

    public boolean isGridIndigenaRendered() {
        return true;
    }

    public boolean isGridEsImportadoRendered() {
        return true;
    }

    public boolean isGridObservacionRendered() {
        return true;
    }

    public boolean isGridFechaHoraTransaccionRendered() {
        return true;
    }

    public boolean isGridNombreArchivoRendered() {
        return true;
    }

    public boolean isGridCodigoArchivoRendered() {
        return true;
    }

    public boolean isGridIdPersonaRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
