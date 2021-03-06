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
import com.egt.data.specific.xdp2.LogImpPotCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogImpPot {

    private PaginaActualizacionLogImpPot bean;

    public AsistentePaginaActualizacionLogImpPot() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogImpPot(PaginaActualizacionLogImpPot bean) {
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
        String nombre = bean.getLogImpPotDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpPotDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpPotDataProvider().getNombreArchivo(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivo1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivo1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivo3Rendered() {
        return true;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPotencialBen">
    private GestorBusquedaReferencia gestorBusquedaIdPotencialBen = null;

    private boolean funcionSelectEjecutableIdPotencialBen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPotencialBen() {
        if (this.gestorBusquedaIdPotencialBen == null) {
            this.gestorBusquedaIdPotencialBen = new GestorBusquedaReferencia(
                    bean.getLogImpPotDataProvider(),
                    bean.getPotencialBenReferenceDataProvider(),
                    LogImpPotCachedRowSetDataProvider2.COLUMNA_ID_POTENCIAL_BEN,
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
            return STP.getString(bean.getLogImpPotDataProvider().getIdPotencialBen(rowKey));
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
            return STP.getString(bean.getLogImpPotDataProvider().getIdPotencialBen(rowKey));
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
        Long id = bean.getLogImpPotDataProvider().getIdPotencialBen(rowKey);
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
        Integer value = bean.getLogImpPotDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpPotDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogImpPotRendered() {
        return true;
    }

    public boolean isGridDepartamentoRendered() {
        return true;
    }

    public boolean isGridDistritoRendered() {
        return true;
    }

    public boolean isGridNombresApellidosRendered() {
        return true;
    }

    public boolean isGridApodoRendered() {
        return true;
    }

    public boolean isGridEdadALaFechaRendered() {
        return true;
    }

    public boolean isGridNacimientoRendered() {
        return true;
    }

    public boolean isGridCedulaRendered() {
        return true;
    }

    public boolean isGridTelefonoRendered() {
        return true;
    }

    public boolean isGridDireccionRendered() {
        return true;
    }

    public boolean isGridReferenciaRendered() {
        return true;
    }

    public boolean isGridBarrioRendered() {
        return true;
    }

    public boolean isGridNombreReferenteRendered() {
        return true;
    }

    public boolean isGridTelefonoReferenteRendered() {
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

    public boolean isGridIdPotencialBenRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
