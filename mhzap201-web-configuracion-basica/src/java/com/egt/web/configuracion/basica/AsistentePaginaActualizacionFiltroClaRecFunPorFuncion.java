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

import com.egt.base.enums.EnumOperadorCom;
import com.egt.data.general.xdp2.FiltroClaRecFunCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoParCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionFiltroClaRecFunPorFuncion {

    private PaginaActualizacionFiltroClaRecFunPorFuncion bean;

    public AsistentePaginaActualizacionFiltroClaRecFunPorFuncion() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionFiltroClaRecFunPorFuncion(PaginaActualizacionFiltroClaRecFunPorFuncion bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(FiltroClaRecFunCachedRowSetDataProvider2.FUNCION_MODIFICAR_FILTRO_CLA_REC_FUN, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoParColumna">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoParColumna = null;

    private boolean funcionSelectEjecutableIdClaseRecursoParColumna = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoParColumna() {
        if (this.gestorBusquedaIdClaseRecursoParColumna == null) {
            this.gestorBusquedaIdClaseRecursoParColumna = new GestorBusquedaReferencia(
                    bean.getFiltroClaRecFunDataProvider(),
                    bean.getClaseRecursoParReferenceDataProvider(),
                    FiltroClaRecFunCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA,
                    this.funcionSelectEjecutableIdClaseRecursoParColumna);
        }
        return this.gestorBusquedaIdClaseRecursoParColumna;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoParColumna() {
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

    public void campoIdClaseRecursoParColumna1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoParColumna().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoParColumna());
        this.getGestorBusquedaIdClaseRecursoParColumna().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoParColumna1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFiltroClaRecFunDataProvider().getIdClaseRecursoParColumna(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoParColumna().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoParColumna());
        return this.getGestorBusquedaIdClaseRecursoParColumna().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoParColumna1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoParColumna().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoParColumna1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFiltroClaRecFunDataProvider().getIdClaseRecursoParColumna(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoParColumna().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoParColumna());
        return this.getGestorBusquedaIdClaseRecursoParColumna().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoParColumna1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoParCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO_PAR;
        String campo = bean.getCampoIdClaseRecursoParColumna1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoParColumna());
    }

    public String getScriptCampoIdClaseRecursoParColumna1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO_PAR;
//      Long id = bean.getFiltroClaRecFunDataProvider().getIdClaseRecursoParColumna(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoParColumna1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoParReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoParColumna1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoParColumna1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoParColumna1Panel2Rendered() {
        return isCampoIdClaseRecursoParColumna1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoParColumna3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoParColumna1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idClaseRecursoParValor">
    private GestorBusquedaReferencia gestorBusquedaIdClaseRecursoParValor = null;

    private boolean funcionSelectEjecutableIdClaseRecursoParValor = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdClaseRecursoParValor() {
        if (this.gestorBusquedaIdClaseRecursoParValor == null) {
            this.gestorBusquedaIdClaseRecursoParValor = new GestorBusquedaReferencia(
                    bean.getFiltroClaRecFunDataProvider(),
                    bean.getClaseRecursoParReferenceDataProvider(),
                    FiltroClaRecFunCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO_PAR_VALOR,
                    this.funcionSelectEjecutableIdClaseRecursoParValor);
        }
        return this.gestorBusquedaIdClaseRecursoParValor;
    }

    protected FiltroBusqueda getFiltroBusquedaIdClaseRecursoParValor() {
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

    public void campoIdClaseRecursoParValor1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoParValor().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoParValor());
        this.getGestorBusquedaIdClaseRecursoParValor().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdClaseRecursoParValor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFiltroClaRecFunDataProvider().getIdClaseRecursoParValor(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoParValor().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoParValor());
        return this.getGestorBusquedaIdClaseRecursoParValor().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdClaseRecursoParValor1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdClaseRecursoParValor().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdClaseRecursoParValor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFiltroClaRecFunDataProvider().getIdClaseRecursoParValor(rowKey));
        }
        this.getGestorBusquedaIdClaseRecursoParValor().setFiltroBusqueda(this.getFiltroBusquedaIdClaseRecursoParValor());
        return this.getGestorBusquedaIdClaseRecursoParValor().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdClaseRecursoParValor1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ClaseRecursoParCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO_PAR;
        String campo = bean.getCampoIdClaseRecursoParValor1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdClaseRecursoParValor());
    }

    public String getScriptCampoIdClaseRecursoParValor1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_CLASE_RECURSO_PAR;
//      Long id = bean.getFiltroClaRecFunDataProvider().getIdClaseRecursoParValor(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdClaseRecursoParValor1Boton2Rendered() {
        return bean == null ? true : bean.getClaseRecursoParReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdClaseRecursoParValor1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdClaseRecursoParValor1Boton2Rendered();
    }

    public boolean isCampoIdClaseRecursoParValor1Panel2Rendered() {
        return isCampoIdClaseRecursoParValor1Boton2Rendered();
    }

    public boolean isTableColumnIdClaseRecursoParValor3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdClaseRecursoParValor1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroOperadorCom1() {
        return JSF.getListaOpciones(EnumOperadorCom.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroOperadorCom() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroOperadorCom() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null;
    }

    public boolean isNumeroOperadorComEsNulo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO.intValue());
    }

    public boolean isNumeroOperadorComNoEsNulo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_ES_NULO.intValue());
    }

    public boolean isNumeroOperadorComEsIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComNoEsIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_ES_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsMayor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_MAYOR.intValue());
    }

    public boolean isNumeroOperadorComEsMenorOIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_MENOR_O_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsMayorOIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_MAYOR_O_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsMenor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_MENOR.intValue());
    }

    public boolean isNumeroOperadorComComienzaPor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.COMIENZA_POR.intValue());
    }

    public boolean isNumeroOperadorComNoComienzaPor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_COMIENZA_POR.intValue());
    }

    public boolean isNumeroOperadorComContiene() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.CONTIENE.intValue());
    }

    public boolean isNumeroOperadorComNoContiene() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_CONTIENE.intValue());
    }

    public boolean isNumeroOperadorComTerminaEn() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.TERMINA_EN.intValue());
    }

    public boolean isNumeroOperadorComNoTerminaEn() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_TERMINA_EN.intValue());
    }

    public boolean isNumeroOperadorComEstaEntre() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ESTA_ENTRE.intValue());
    }

    public boolean isNumeroOperadorComNoEstaEntre() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_ESTA_ENTRE.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOEsIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_ES_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsNuloONoEsIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_NO_ES_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOEsMayor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_ES_MAYOR.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOEsMenorOIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_ES_MENOR_O_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOEsMayorOIgual() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_ES_MAYOR_O_IGUAL.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOEsMenor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_ES_MENOR.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOComienzaPor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_COMIENZA_POR.intValue());
    }

    public boolean isNumeroOperadorComEsNuloONoComienzaPor() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_NO_COMIENZA_POR.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOContiene() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_CONTIENE.intValue());
    }

    public boolean isNumeroOperadorComEsNuloONoContiene() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_NO_CONTIENE.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOTerminaEn() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_TERMINA_EN.intValue());
    }

    public boolean isNumeroOperadorComEsNuloONoTerminaEn() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_NO_TERMINA_EN.intValue());
    }

    public boolean isNumeroOperadorComEsNuloOEstaEntre() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_ESTA_ENTRE.intValue());
    }

    public boolean isNumeroOperadorComEsNuloONoEstaEntre() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.ES_NULO_O_NO_ESTA_ENTRE.intValue());
    }

    public boolean isNumeroOperadorComExiste() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.EXISTE.intValue());
    }

    public boolean isNumeroOperadorComNoExiste() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFiltroClaRecFunDataProvider().getNumeroOperadorCom(rowKey);
        return value != null && value.equals(EnumOperadorCom.NO_EXISTE.intValue());
    }

    public boolean isGridIdFiltroClaRecFunRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoParColumnaRendered() {
        return true;
    }

    public boolean isGridNumeroOperadorComRendered() {
        return true;
    }

    public boolean isGridIdClaseRecursoParValorRendered() {
        return true;
    }

    public boolean isGridValorRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
