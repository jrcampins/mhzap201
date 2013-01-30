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
import com.egt.data.specific.xdp2.LogImpHogEecCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogImpHogEec {

    private PaginaActualizacionLogImpHogEec bean;

    public AsistentePaginaActualizacionLogImpHogEec() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogImpHogEec(PaginaActualizacionLogImpHogEec bean) {
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
        String nombre = bean.getLogImpHogEecDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpHogEecDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpHogEecDataProvider().getNombreArchivo(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivo1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivo1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivo3Rendered() {
        return true;
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
        Integer value = bean.getLogImpHogEecDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpHogEecDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogImpHogEecRendered() {
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

    public boolean isGridDireccionRendered() {
        return true;
    }

    public boolean isGridNroDeRendered() {
        return true;
    }

    public boolean isGridTelefonoRendered() {
        return true;
    }

    public boolean isGridFechaRendered() {
        return true;
    }

    public boolean isGridDiaRendered() {
        return true;
    }

    public boolean isGridMesRendered() {
        return true;
    }

    public boolean isGridAnoRendered() {
        return true;
    }

    public boolean isGridV10tRendered() {
        return true;
    }

    public boolean isGridV11Rendered() {
        return true;
    }

    public boolean isGridV12Rendered() {
        return true;
    }

    public boolean isGridV13Rendered() {
        return true;
    }

    public boolean isGridV14Rendered() {
        return true;
    }

    public boolean isGridV15Rendered() {
        return true;
    }

    public boolean isGridV16Rendered() {
        return true;
    }

    public boolean isGridV16OtrRendered() {
        return true;
    }

    public boolean isGridV17aRendered() {
        return true;
    }

    public boolean isGridV17bRendered() {
        return true;
    }

    public boolean isGridV18Rendered() {
        return true;
    }

    public boolean isGridV19Rendered() {
        return true;
    }

    public boolean isGridV20Rendered() {
        return true;
    }

    public boolean isGridV21Rendered() {
        return true;
    }

    public boolean isGridV22Rendered() {
        return true;
    }

    public boolean isGridV23Rendered() {
        return true;
    }

    public boolean isGridV24Rendered() {
        return true;
    }

    public boolean isGridV25Rendered() {
        return true;
    }

    public boolean isGridV26Rendered() {
        return true;
    }

    public boolean isGridV26espCelularRendered() {
        return true;
    }

    public boolean isGridV27Rendered() {
        return true;
    }

    public boolean isGridV27espLineaRendered() {
        return true;
    }

    public boolean isGridV281Rendered() {
        return true;
    }

    public boolean isGridV282Rendered() {
        return true;
    }

    public boolean isGridV283Rendered() {
        return true;
    }

    public boolean isGridV284Rendered() {
        return true;
    }

    public boolean isGridV285Rendered() {
        return true;
    }

    public boolean isGridV286Rendered() {
        return true;
    }

    public boolean isGridV287Rendered() {
        return true;
    }

    public boolean isGridV288Rendered() {
        return true;
    }

    public boolean isGridV29nombreJefeRendered() {
        return true;
    }

    public boolean isGridCedulajefeRendered() {
        return true;
    }

    public boolean isGridVar00001Rendered() {
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

    // </editor-fold>

/**/
}
