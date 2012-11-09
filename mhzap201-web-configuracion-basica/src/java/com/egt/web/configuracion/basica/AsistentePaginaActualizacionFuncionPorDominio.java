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

import com.egt.base.enums.EnumTipoFuncion;
import com.egt.base.enums.EnumTipoRastroFun;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoProcesoCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionFuncionPorDominio {

    private PaginaActualizacionFuncionPorDominio bean;

    public AsistentePaginaActualizacionFuncionPorDominio() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionFuncionPorDominio(PaginaActualizacionFuncionPorDominio bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(FuncionCachedRowSetDataProvider2.FUNCION_MODIFICAR_FUNCION, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idGrupoProceso">
    private GestorBusquedaReferencia gestorBusquedaIdGrupoProceso = null;

    private boolean funcionSelectEjecutableIdGrupoProceso = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdGrupoProceso() {
        if (this.gestorBusquedaIdGrupoProceso == null) {
            this.gestorBusquedaIdGrupoProceso = new GestorBusquedaReferencia(
                    bean.getFuncionDataProvider(),
                    bean.getGrupoProcesoReferenceDataProvider(),
                    FuncionCachedRowSetDataProvider2.COLUMNA_ID_GRUPO_PROCESO,
                    this.funcionSelectEjecutableIdGrupoProceso);
        }
        return this.gestorBusquedaIdGrupoProceso;
    }

    protected FiltroBusqueda getFiltroBusquedaIdGrupoProceso() {
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

    public void campoIdGrupoProceso1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdGrupoProceso().setFiltroBusqueda(this.getFiltroBusquedaIdGrupoProceso());
        this.getGestorBusquedaIdGrupoProceso().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdGrupoProceso1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFuncionDataProvider().getIdGrupoProceso(rowKey));
        }
        this.getGestorBusquedaIdGrupoProceso().setFiltroBusqueda(this.getFiltroBusquedaIdGrupoProceso());
        return this.getGestorBusquedaIdGrupoProceso().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdGrupoProceso1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdGrupoProceso().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdGrupoProceso1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFuncionDataProvider().getIdGrupoProceso(rowKey));
        }
        this.getGestorBusquedaIdGrupoProceso().setFiltroBusqueda(this.getFiltroBusquedaIdGrupoProceso());
        return this.getGestorBusquedaIdGrupoProceso().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdGrupoProceso1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = GrupoProcesoCachedRowSetDataProvider2.FUNCION_CONSULTAR_GRUPO_PROCESO;
        String campo = bean.getCampoIdGrupoProceso1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdGrupoProceso());
    }

    public String getScriptCampoIdGrupoProceso1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_GRUPO_PROCESO;
//      Long id = bean.getFuncionDataProvider().getIdGrupoProceso(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdGrupoProceso1Boton2Rendered() {
        return bean == null ? true : bean.getGrupoProcesoReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdGrupoProceso1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdGrupoProceso1Boton2Rendered();
    }

    public boolean isCampoIdGrupoProceso1Panel2Rendered() {
        return isCampoIdGrupoProceso1Boton2Rendered();
    }

    public boolean isTableColumnIdGrupoProceso3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdGrupoProceso1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoFuncion1() {
        return JSF.getListaOpciones(EnumTipoFuncion.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoRastroFun1() {
        return JSF.getListaOpciones(EnumTipoRastroFun.values(), true, false);
    }

    public Object getOpcionesListaEsPublica1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsProgramatica1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsPersonalizada1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsSegmentada1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoFuncion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoFuncion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoFuncionProcedimientoFila() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.PROCEDIMIENTO_FILA.intValue());
    }

    public boolean isNumeroTipoFuncionProcedimientoFilaParametros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.PROCEDIMIENTO_FILA_PARAMETROS.intValue());
    }

    public boolean isNumeroTipoFuncionProcedimientoParametros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.PROCEDIMIENTO_PARAMETROS.intValue());
    }

    public boolean isNumeroTipoFuncionConsulta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.CONSULTA.intValue());
    }

    public boolean isNumeroTipoFuncionInforme() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.INFORME.intValue());
    }

    public boolean isNumeroTipoFuncionArchivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.ARCHIVO.intValue());
    }

    public boolean isNumeroTipoFuncionCreacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.CREACION.intValue());
    }

    public boolean isNumeroTipoFuncionModificacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.MODIFICACION.intValue());
    }

    public boolean isNumeroTipoFuncionEliminacion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoFuncion(rowKey);
        return value != null && value.equals(EnumTipoFuncion.ELIMINACION.intValue());
    }

    public boolean isNullNumeroTipoRastroFun() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoRastroFun(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoRastroFun() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoRastroFun(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoRastroFunNinguno() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoRastroFun(rowKey);
        return value != null && value.equals(EnumTipoRastroFun.NINGUNO.intValue());
    }

    public boolean isNumeroTipoRastroFunExito() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoRastroFun(rowKey);
        return value != null && value.equals(EnumTipoRastroFun.EXITO.intValue());
    }

    public boolean isNumeroTipoRastroFunError() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoRastroFun(rowKey);
        return value != null && value.equals(EnumTipoRastroFun.ERROR.intValue());
    }

    public boolean isNumeroTipoRastroFunAmbos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getNumeroTipoRastroFun(rowKey);
        return value != null && value.equals(EnumTipoRastroFun.AMBOS.intValue());
    }

   public boolean isEsPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsPublica(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsPublica(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsProgramatica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsProgramatica(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsProgramatica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsProgramatica(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsPersonalizada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsPersonalizada(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsPersonalizada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsPersonalizada(rowKey);
        return !BitUtils.valueOf(value);
    }

   public boolean isEsSegmentada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsSegmentada(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsSegmentada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFuncionDataProvider().getEsSegmentada(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdFuncionRendered() {
        return true;
    }

    public boolean isGridCodigoFuncionRendered() {
        return true;
    }

    public boolean isGridNombreFuncionRendered() {
        return true;
    }

    public boolean isGridDescripcionFuncionRendered() {
        return true;
    }

    public boolean isGridNumeroTipoFuncionRendered() {
        return true;
    }

    public boolean isGridNumeroTipoRastroFunRendered() {
        return true;
    }

    public boolean isGridClausulaWhereRendered() {
        return true;
    }

    public boolean isGridClausulaOrderRendered() {
        return true;
    }

    public boolean isGridEsPublicaRendered() {
        return true;
    }

    public boolean isGridEsProgramaticaRendered() {
        return true;
    }

    public boolean isGridEsPersonalizadaRendered() {
        return true;
    }

    public boolean isGridEsSegmentadaRendered() {
        return true;
    }

    public boolean isGridIdGrupoProcesoRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
