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
import com.egt.data.specific.xdp2.LogImpHogCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogImpHog {

    private PaginaActualizacionLogImpHog bean;

    public AsistentePaginaActualizacionLogImpHog() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogImpHog(PaginaActualizacionLogImpHog bean) {
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
        String nombre = bean.getLogImpHogDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpHogDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpHogDataProvider().getNombreArchivo(rowKey);
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
        Integer value = bean.getLogImpHogDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpHogDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogImpHogRendered() {
        return true;
    }

    public boolean isGridP20dRendered() {
        return true;
    }

    public boolean isGridP20mRendered() {
        return true;
    }

    public boolean isGridP20aRendered() {
        return true;
    }

    public boolean isGridP17Rendered() {
        return true;
    }

    public boolean isGridP18Rendered() {
        return true;
    }

    public boolean isGridVar00001Rendered() {
        return true;
    }

    public boolean isGridP19Rendered() {
        return true;
    }

    public boolean isGridObservacionesRendered() {
        return true;
    }

    public boolean isGridUtmRendered() {
        return true;
    }

    public boolean isGridGpsRendered() {
        return true;
    }

    public boolean isGridOrdenRendered() {
        return true;
    }

    public boolean isGridCoordxRendered() {
        return true;
    }

    public boolean isGridP01aRendered() {
        return true;
    }

    public boolean isGridP01bRendered() {
        return true;
    }

    public boolean isGridP01cRendered() {
        return true;
    }

    public boolean isGridP01dRendered() {
        return true;
    }

    public boolean isGridP02Rendered() {
        return true;
    }

    public boolean isGridP03Rendered() {
        return true;
    }

    public boolean isGridP04Rendered() {
        return true;
    }

    public boolean isGridP05Rendered() {
        return true;
    }

    public boolean isGridP06Rendered() {
        return true;
    }

    public boolean isGridP08Rendered() {
        return true;
    }

    public boolean isGridP07Rendered() {
        return true;
    }

    public boolean isGridP09Rendered() {
        return true;
    }

    public boolean isGridP14Rendered() {
        return true;
    }

    public boolean isGridP15Rendered() {
        return true;
    }

    public boolean isGridP16Rendered() {
        return true;
    }

    public boolean isGridP24Rendered() {
        return true;
    }

    public boolean isGridP25Rendered() {
        return true;
    }

    public boolean isGridP26Rendered() {
        return true;
    }

    public boolean isGridP27Rendered() {
        return true;
    }

    public boolean isGridP27eRendered() {
        return true;
    }

    public boolean isGridP28aRendered() {
        return true;
    }

    public boolean isGridP28bRendered() {
        return true;
    }

    public boolean isGridP29Rendered() {
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

    public boolean isGridP36Rendered() {
        return true;
    }

    public boolean isGridP37Rendered() {
        return true;
    }

    public boolean isGridNroCelularRendered() {
        return true;
    }

    public boolean isGridP38Rendered() {
        return true;
    }

    public boolean isGridNroLineaBajaRendered() {
        return true;
    }

    public boolean isGridP391Rendered() {
        return true;
    }

    public boolean isGridP392Rendered() {
        return true;
    }

    public boolean isGridP393Rendered() {
        return true;
    }

    public boolean isGridP394Rendered() {
        return true;
    }

    public boolean isGridP395Rendered() {
        return true;
    }

    public boolean isGridP396Rendered() {
        return true;
    }

    public boolean isGridP397Rendered() {
        return true;
    }

    public boolean isGridP42nRendered() {
        return true;
    }

    public boolean isGridP42ciRendered() {
        return true;
    }

    public boolean isGridLetraCiRendered() {
        return true;
    }

    public boolean isGridP43Rendered() {
        return true;
    }

    public boolean isGridVar00002Rendered() {
        return true;
    }

    public boolean isGridVar00003Rendered() {
        return true;
    }

    public boolean isGridVar00004Rendered() {
        return true;
    }

    public boolean isGridP104Rendered() {
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
