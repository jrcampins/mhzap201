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
import com.egt.data.specific.xdp2.LogImpPerEecCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogImpPerEec {

    private PaginaActualizacionLogImpPerEec bean;

    public AsistentePaginaActualizacionLogImpPerEec() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogImpPerEec(PaginaActualizacionLogImpPerEec bean) {
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
        String nombre = bean.getLogImpPerEecDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpPerEecDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpPerEecDataProvider().getNombreArchivo(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivo1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivo1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivo3Rendered() {
        return true;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaPersona">
    private GestorBusquedaReferencia gestorBusquedaIdFichaPersona = null;

    private boolean funcionSelectEjecutableIdFichaPersona = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFichaPersona() {
        if (this.gestorBusquedaIdFichaPersona == null) {
            this.gestorBusquedaIdFichaPersona = new GestorBusquedaReferencia(
                    bean.getLogImpPerEecDataProvider(),
                    bean.getFichaPersonaReferenceDataProvider(),
                    LogImpPerEecCachedRowSetDataProvider2.COLUMNA_ID_FICHA_PERSONA,
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
            return STP.getString(bean.getLogImpPerEecDataProvider().getIdFichaPersona(rowKey));
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
            return STP.getString(bean.getLogImpPerEecDataProvider().getIdFichaPersona(rowKey));
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
        Long id = bean.getLogImpPerEecDataProvider().getIdFichaPersona(rowKey);
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
        Integer value = bean.getLogImpPerEecDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpPerEecDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogImpPerEecRendered() {
        return true;
    }

    public boolean isGridDptodRendered() {
        return true;
    }

    public boolean isGridDistritodRendered() {
        return true;
    }

    public boolean isGridDistripgRendered() {
        return true;
    }

    public boolean isGridAreaRendered() {
        return true;
    }

    public boolean isGridBarrioRendered() {
        return true;
    }

    public boolean isGridManzanaRendered() {
        return true;
    }

    public boolean isGridFormularioRendered() {
        return true;
    }

    public boolean isGridViviRendered() {
        return true;
    }

    public boolean isGridHogarRendered() {
        return true;
    }

    public boolean isGridOrdenRendered() {
        return true;
    }

    public boolean isGridP30Rendered() {
        return true;
    }

    public boolean isGridP31Rendered() {
        return true;
    }

    public boolean isGridP32Rendered() {
        return true;
    }

    public boolean isGridP33Rendered() {
        return true;
    }

    public boolean isGridP34Rendered() {
        return true;
    }

    public boolean isGridP35Rendered() {
        return true;
    }

    public boolean isGridP36OrdenConyugueRendered() {
        return true;
    }

    public boolean isGridP36OrdenPadreRendered() {
        return true;
    }

    public boolean isGridP36OrdenMadreRendered() {
        return true;
    }

    public boolean isGridP37Rendered() {
        return true;
    }

    public boolean isGridP37CedulaRendered() {
        return true;
    }

    public boolean isGridP38DiaRendered() {
        return true;
    }

    public boolean isGridP38MesRendered() {
        return true;
    }

    public boolean isGridP38AnoRendered() {
        return true;
    }

    public boolean isGridP39paisRendered() {
        return true;
    }

    public boolean isGridP39dptoRendered() {
        return true;
    }

    public boolean isGridP39distRendered() {
        return true;
    }

    public boolean isGridP39areaRendered() {
        return true;
    }

    public boolean isGridP40IdiomaRendered() {
        return true;
    }

    public boolean isGridP40otrRendered() {
        return true;
    }

    public boolean isGridP41Rendered() {
        return true;
    }

    public boolean isGridP42Rendered() {
        return true;
    }

    public boolean isGridP43Rendered() {
        return true;
    }

    public boolean isGridP4445tRendered() {
        return true;
    }

    public boolean isGridP44Rendered() {
        return true;
    }

    public boolean isGridP45Rendered() {
        return true;
    }

    public boolean isGridP46Rendered() {
        return true;
    }

    public boolean isGridP47Rendered() {
        return true;
    }

    public boolean isGridP48Rendered() {
        return true;
    }

    public boolean isGridP49Rendered() {
        return true;
    }

    public boolean isGridP49OtrRendered() {
        return true;
    }

    public boolean isGridP50Rendered() {
        return true;
    }

    public boolean isGridP50OtrRendered() {
        return true;
    }

    public boolean isGridP51Rendered() {
        return true;
    }

    public boolean isGridP52Rendered() {
        return true;
    }

    public boolean isGridP52OtrRendered() {
        return true;
    }

    public boolean isGridP53Rendered() {
        return true;
    }

    public boolean isGridP54Rendered() {
        return true;
    }

    public boolean isGridP54aRendered() {
        return true;
    }

    public boolean isGridP54OtrRendered() {
        return true;
    }

    public boolean isGridP55Rendered() {
        return true;
    }

    public boolean isGridP55OtrRendered() {
        return true;
    }

    public boolean isGridP56Rendered() {
        return true;
    }

    public boolean isGridP57Rendered() {
        return true;
    }

    public boolean isGridP58Rendered() {
        return true;
    }

    public boolean isGridP59Rendered() {
        return true;
    }

    public boolean isGridP60Rendered() {
        return true;
    }

    public boolean isGridP61Rendered() {
        return true;
    }

    public boolean isGridP62Rendered() {
        return true;
    }

    public boolean isGridP63Rendered() {
        return true;
    }

    public boolean isGridP63EspecificarRendered() {
        return true;
    }

    public boolean isGridP64desRendered() {
        return true;
    }

    public boolean isGridP64cRendered() {
        return true;
    }

    public boolean isGridP65desRendered() {
        return true;
    }

    public boolean isGridP65cRendered() {
        return true;
    }

    public boolean isGridP66Rendered() {
        return true;
    }

    public boolean isGridP67aRendered() {
        return true;
    }

    public boolean isGridP67bRendered() {
        return true;
    }

    public boolean isGridP67cRendered() {
        return true;
    }

    public boolean isGridP67dRendered() {
        return true;
    }

    public boolean isGridP67eRendered() {
        return true;
    }

    public boolean isGridP67fRendered() {
        return true;
    }

    public boolean isGridP67gRendered() {
        return true;
    }

    public boolean isGridP67hRendered() {
        return true;
    }

    public boolean isGridP67iRendered() {
        return true;
    }

    public boolean isGridP67jRendered() {
        return true;
    }

    public boolean isGridP67kRendered() {
        return true;
    }

    public boolean isGridP67lRendered() {
        return true;
    }

    public boolean isGridP67totRendered() {
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

    public boolean isGridIdFichaPersonaRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
