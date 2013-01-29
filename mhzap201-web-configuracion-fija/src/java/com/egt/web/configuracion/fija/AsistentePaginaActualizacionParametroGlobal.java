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
package com.egt.web.configuracion.fija;

import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.specific.xdp2.ParametroGlobalCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionParametroGlobal {

    private PaginaActualizacionParametroGlobal bean;

    public AsistentePaginaActualizacionParametroGlobal() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionParametroGlobal(PaginaActualizacionParametroGlobal bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(ParametroGlobalCachedRowSetDataProvider2.FUNCION_MODIFICAR_PARAMETRO_GLOBAL, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsControlCerVidaActivo1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsControlCobroPensionActiv1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsControlReprocesoPenActiv1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
   public boolean isEsControlCerVidaActivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroGlobalDataProvider().getEsControlCerVidaActivo(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsControlCerVidaActivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroGlobalDataProvider().getEsControlCerVidaActivo(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsControlCobroPensionActiv() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroGlobalDataProvider().getEsControlCobroPensionActiv(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsControlCobroPensionActiv() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroGlobalDataProvider().getEsControlCobroPensionActiv(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsControlReprocesoPenActiv() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroGlobalDataProvider().getEsControlReprocesoPenActiv(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsControlReprocesoPenActiv() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroGlobalDataProvider().getEsControlReprocesoPenActiv(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridNumeroParametroGlobalRendered() {
        return true;
    }

    public boolean isGridMontoSalarioMinimoRendered() {
        return true;
    }

    public boolean isGridPorcentajePensionAlimentariaRendered() {
        return true;
    }

    public boolean isGridEsControlCerVidaActivoRendered() {
        return true;
    }

    public boolean isGridMesesValidezCertificadoVidaRendered() {
        return true;
    }

    public boolean isGridEsControlCobroPensionActivRendered() {
        return true;
    }

    public boolean isGridMesesUltimoCobroPensionRendered() {
        return true;
    }

    public boolean isGridEsControlReprocesoPenActivRendered() {
        return true;
    }

    public boolean isGridLimiteIndiceCalidadVidaRendered() {
        return true;
    }

    public boolean isGridLimitePensionesRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
