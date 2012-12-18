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
import com.egt.data.specific.xdp2.LogImpPerCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogImpPer {

    private PaginaActualizacionLogImpPer bean;

    public AsistentePaginaActualizacionLogImpPer() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogImpPer(PaginaActualizacionLogImpPer bean) {
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
        String nombre = bean.getLogImpPerDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpPerDataProvider().getNombreArchivo(rowKey);
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
        String nombre = bean.getLogImpPerDataProvider().getNombreArchivo(rowKey);
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
        Integer value = bean.getLogImpPerDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogImpPerDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogImpPerRendered() {
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

    public boolean isGridP104Rendered() {
        return true;
    }

    public boolean isGridP43Rendered() {
        return true;
    }

    public boolean isGridP45aRendered() {
        return true;
    }

    public boolean isGridP45bRendered() {
        return true;
    }

    public boolean isGridP44aRendered() {
        return true;
    }

    public boolean isGridP44bRendered() {
        return true;
    }

    public boolean isGridVar00001Rendered() {
        return true;
    }

    public boolean isGridVar00002Rendered() {
        return true;
    }

    public boolean isGridP46Rendered() {
        return true;
    }

    public boolean isGridP47Rendered() {
        return true;
    }

    public boolean isGridVar00030Rendered() {
        return true;
    }

    public boolean isGridP48Rendered() {
        return true;
    }

    public boolean isGridP49Rendered() {
        return true;
    }

    public boolean isGridP50aRendered() {
        return true;
    }

    public boolean isGridP50bRendered() {
        return true;
    }

    public boolean isGridP50cRendered() {
        return true;
    }

    public boolean isGridP51Rendered() {
        return true;
    }

    public boolean isGridVar00003Rendered() {
        return true;
    }

    public boolean isGridVar00004Rendered() {
        return true;
    }

    public boolean isGridP52dRendered() {
        return true;
    }

    public boolean isGridP52mRendered() {
        return true;
    }

    public boolean isGridP52aRendered() {
        return true;
    }

    public boolean isGridP53aRendered() {
        return true;
    }

    public boolean isGridP53bRendered() {
        return true;
    }

    public boolean isGridP53cRendered() {
        return true;
    }

    public boolean isGridP53zRendered() {
        return true;
    }

    public boolean isGridP54Rendered() {
        return true;
    }

    public boolean isGridP54eRendered() {
        return true;
    }

    public boolean isGridP56Rendered() {
        return true;
    }

    public boolean isGridP58Rendered() {
        return true;
    }

    public boolean isGridP58eRendered() {
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

    public boolean isGridP64Rendered() {
        return true;
    }

    public boolean isGridP65Rendered() {
        return true;
    }

    public boolean isGridP65eRendered() {
        return true;
    }

    public boolean isGridP66Rendered() {
        return true;
    }

    public boolean isGridP66eRendered() {
        return true;
    }

    public boolean isGridP67Rendered() {
        return true;
    }

    public boolean isGridP68Rendered() {
        return true;
    }

    public boolean isGridP68eRendered() {
        return true;
    }

    public boolean isGridP73Rendered() {
        return true;
    }

    public boolean isGridP74Rendered() {
        return true;
    }

    public boolean isGridVar00006Rendered() {
        return true;
    }

    public boolean isGridVar00007Rendered() {
        return true;
    }

    public boolean isGridVar00008Rendered() {
        return true;
    }

    public boolean isGridVar00009Rendered() {
        return true;
    }

    public boolean isGridVar00010Rendered() {
        return true;
    }

    public boolean isGridVar00011Rendered() {
        return true;
    }

    public boolean isGridVar00031Rendered() {
        return true;
    }

    public boolean isGridVar00012Rendered() {
        return true;
    }

    public boolean isGridVar00013Rendered() {
        return true;
    }

    public boolean isGridP86Rendered() {
        return true;
    }

    public boolean isGridP87Rendered() {
        return true;
    }

    public boolean isGridP87eRendered() {
        return true;
    }

    public boolean isGridP88Rendered() {
        return true;
    }

    public boolean isGridP88eRendered() {
        return true;
    }

    public boolean isGridP91Rendered() {
        return true;
    }

    public boolean isGridVar00017Rendered() {
        return true;
    }

    public boolean isGridVar00018Rendered() {
        return true;
    }

    public boolean isGridVar00019Rendered() {
        return true;
    }

    public boolean isGridVar00020Rendered() {
        return true;
    }

    public boolean isGridVar00021Rendered() {
        return true;
    }

    public boolean isGridVar00022Rendered() {
        return true;
    }

    public boolean isGridVar00023Rendered() {
        return true;
    }

    public boolean isGridVar00024Rendered() {
        return true;
    }

    public boolean isGridVar00025Rendered() {
        return true;
    }

    public boolean isGridVar00026Rendered() {
        return true;
    }

    public boolean isGridVar00027Rendered() {
        return true;
    }

    public boolean isGridVar00028Rendered() {
        return true;
    }

    public boolean isGridP92Rendered() {
        return true;
    }

    public boolean isGridIcvRendered() {
        return true;
    }

    public boolean isGridFichaActivaRendered() {
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
