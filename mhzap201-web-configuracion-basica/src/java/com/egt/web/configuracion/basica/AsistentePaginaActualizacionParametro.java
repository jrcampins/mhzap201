/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.basica;

import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionParametro {

    private PaginaActualizacionParametro bean;

    public AsistentePaginaActualizacionParametro() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionParametro(PaginaActualizacionParametro bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(ParametroCachedRowSetDataProvider2.FUNCION_MODIFICAR_PARAMETRO, BundleWebui.getString("editar"))
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
    public Object getOpcionesListaNumeroTipoDatoPar1() {
        return JSF.getListaOpciones(EnumTipoDatoPar.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoDatoPar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoDatoPar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoDatoParAlfanumerico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value != null && value.equals(EnumTipoDatoPar.ALFANUMERICO.intValue());
    }

    public boolean isNumeroTipoDatoParNumerico() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value != null && value.equals(EnumTipoDatoPar.NUMERICO.intValue());
    }

    public boolean isNumeroTipoDatoParFechaHora() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value != null && value.equals(EnumTipoDatoPar.FECHA_HORA.intValue());
    }

    public boolean isNumeroTipoDatoParEntero() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value != null && value.equals(EnumTipoDatoPar.ENTERO.intValue());
    }

    public boolean isNumeroTipoDatoParEnteroGrande() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getParametroDataProvider().getNumeroTipoDatoPar(rowKey);
        return value != null && value.equals(EnumTipoDatoPar.ENTERO_GRANDE.intValue());
    }

    public boolean isGridIdParametroRendered() {
        return true;
    }

    public boolean isGridCodigoParametroRendered() {
        return true;
    }

    public boolean isGridNombreParametroRendered() {
        return true;
    }

    public boolean isGridDetalleParametroRendered() {
        return true;
    }

    public boolean isGridDescripcionParametroRendered() {
        return true;
    }

    public boolean isGridNumeroTipoDatoParRendered() {
        return true;
    }

    public boolean isGridAliasParametroRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
