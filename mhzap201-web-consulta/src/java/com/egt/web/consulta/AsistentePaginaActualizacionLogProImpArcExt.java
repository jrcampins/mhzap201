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

import com.egt.base.enums.EnumTipoArcDatExt;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.specific.xdp2.LogProImpArcExtCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ArchivoDatosExtCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionLogProImpArcExt {

    private PaginaActualizacionLogProImpArcExt bean;

    public AsistentePaginaActualizacionLogProImpArcExt() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionLogProImpArcExt(PaginaActualizacionLogProImpArcExt bean) {
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idArchivoDatosExt">
    private GestorBusquedaReferencia gestorBusquedaIdArchivoDatosExt = null;

    private boolean funcionSelectEjecutableIdArchivoDatosExt = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdArchivoDatosExt() {
        if (this.gestorBusquedaIdArchivoDatosExt == null) {
            this.gestorBusquedaIdArchivoDatosExt = new GestorBusquedaReferencia(
                    bean.getLogProImpArcExtDataProvider(),
                    bean.getArchivoDatosExtReferenceDataProvider(),
                    LogProImpArcExtCachedRowSetDataProvider2.COLUMNA_ID_ARCHIVO_DATOS_EXT,
                    this.funcionSelectEjecutableIdArchivoDatosExt);
        }
        return this.gestorBusquedaIdArchivoDatosExt;
    }

    protected FiltroBusqueda getFiltroBusquedaIdArchivoDatosExt() {
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

    public void campoIdArchivoDatosExt1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdArchivoDatosExt().setFiltroBusqueda(this.getFiltroBusquedaIdArchivoDatosExt());
        this.getGestorBusquedaIdArchivoDatosExt().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdArchivoDatosExt1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProImpArcExtDataProvider().getIdArchivoDatosExt(rowKey));
        }
        this.getGestorBusquedaIdArchivoDatosExt().setFiltroBusqueda(this.getFiltroBusquedaIdArchivoDatosExt());
        return this.getGestorBusquedaIdArchivoDatosExt().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdArchivoDatosExt1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdArchivoDatosExt().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdArchivoDatosExt1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getLogProImpArcExtDataProvider().getIdArchivoDatosExt(rowKey));
        }
        this.getGestorBusquedaIdArchivoDatosExt().setFiltroBusqueda(this.getFiltroBusquedaIdArchivoDatosExt());
        return this.getGestorBusquedaIdArchivoDatosExt().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdArchivoDatosExt1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT;
        String campo = bean.getCampoIdArchivoDatosExt1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_ARCHIVO_DATOS_EXT;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdArchivoDatosExt());
    }

    public String getScriptCampoIdArchivoDatosExt1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_ARCHIVO_DATOS_EXT;
        Long id = bean.getLogProImpArcExtDataProvider().getIdArchivoDatosExt(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdArchivoDatosExt1Boton2Rendered() {
        return bean == null ? true : bean.getArchivoDatosExtReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdArchivoDatosExt1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdArchivoDatosExt1Boton2Rendered();
    }

    public boolean isCampoIdArchivoDatosExt1Panel2Rendered() {
        return isCampoIdArchivoDatosExt1Boton2Rendered();
    }

    public boolean isTableColumnIdArchivoDatosExt3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdArchivoDatosExt1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoArcDatExt1() {
        return JSF.getListaOpciones(EnumTipoArcDatExt.values(), true, false);
    }

    public Object getOpcionesListaEsImportado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoArcDatExt() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoArcDatExt() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoArcDatExtIdentificaciones() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.IDENTIFICACIONES.intValue());
    }

    public boolean isNumeroTipoArcDatExtPotencialesBeneficiarios() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.POTENCIALES_BENEFICIARIOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtEmpleados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.EMPLEADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtJubilados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.JUBILADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtDeudores() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.DEUDORES.intValue());
    }

    public boolean isNumeroTipoArcDatExtPenasJudicialesPendientes() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.PENAS_JUDICIALES_PENDIENTES.intValue());
    }

    public boolean isNumeroTipoArcDatExtPensionados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.PENSIONADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtFallecidos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.FALLECIDOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtPresuntosFallecidos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.PRESUNTOS_FALLECIDOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtFichaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.FICHA_HOGAR.intValue());
    }

    public boolean isNumeroTipoArcDatExtFichaPersona() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.FICHA_PERSONA.intValue());
    }

    public boolean isNumeroTipoArcDatExtCensosValidados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.CENSOS_VALIDADOS.intValue());
    }

   public boolean isEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getEsImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getLogProImpArcExtDataProvider().getEsImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdLogProImpArcExtRendered() {
        return true;
    }

    public boolean isGridIdArchivoDatosExtRendered() {
        return true;
    }

    public boolean isGridCodigoTipoArcDatExtRendered() {
        return true;
    }

    public boolean isGridNumeroTipoArcDatExtRendered() {
        return true;
    }

    public boolean isGridNombreProveedorDatExtRendered() {
        return true;
    }

    public boolean isGridCodigoProveedorDatExtRendered() {
        return true;
    }

    public boolean isGridCodigoArchivoDatosExtRendered() {
        return true;
    }

    public boolean isGridRutaArchivoDatosExtRendered() {
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

    // </editor-fold>

/**/
}
