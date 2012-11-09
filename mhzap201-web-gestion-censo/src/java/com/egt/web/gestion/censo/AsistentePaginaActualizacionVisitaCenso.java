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
package com.egt.web.gestion.censo;

import com.egt.data.specific.xdp2.VisitaCensoCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
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

public class AsistentePaginaActualizacionVisitaCenso {

    private PaginaActualizacionVisitaCenso bean;

    public AsistentePaginaActualizacionVisitaCenso() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionVisitaCenso(PaginaActualizacionVisitaCenso bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(VisitaCensoCachedRowSetDataProvider2.FUNCION_MODIFICAR_VISITA_CENSO, BundleWebui.getString("editar"))
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPotencialBen">
    private GestorBusquedaReferencia gestorBusquedaIdPotencialBen = null;

    private boolean funcionSelectEjecutableIdPotencialBen = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdPotencialBen() {
        if (this.gestorBusquedaIdPotencialBen == null) {
            this.gestorBusquedaIdPotencialBen = new GestorBusquedaReferencia(
                    bean.getVisitaCensoDataProvider(),
                    bean.getPotencialBenReferenceDataProvider(),
                    VisitaCensoCachedRowSetDataProvider2.COLUMNA_ID_POTENCIAL_BEN,
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
            return STP.getString(bean.getVisitaCensoDataProvider().getIdPotencialBen(rowKey));
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
            return STP.getString(bean.getVisitaCensoDataProvider().getIdPotencialBen(rowKey));
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
        Long id = bean.getVisitaCensoDataProvider().getIdPotencialBen(rowKey);
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioCensista">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioCensista = null;

    private boolean funcionSelectEjecutableIdFuncionarioCensista = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioCensista() {
        if (this.gestorBusquedaIdFuncionarioCensista == null) {
            this.gestorBusquedaIdFuncionarioCensista = new GestorBusquedaReferencia(
                    bean.getVisitaCensoDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    VisitaCensoCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_CENSISTA,
                    this.funcionSelectEjecutableIdFuncionarioCensista);
        }
        return this.gestorBusquedaIdFuncionarioCensista;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionarioCensista() {
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

    public void campoIdFuncionarioCensista1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioCensista().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioCensista());
        this.getGestorBusquedaIdFuncionarioCensista().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionarioCensista1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getVisitaCensoDataProvider().getIdFuncionarioCensista(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioCensista().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioCensista());
        return this.getGestorBusquedaIdFuncionarioCensista().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionarioCensista1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioCensista().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionarioCensista1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getVisitaCensoDataProvider().getIdFuncionarioCensista(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioCensista().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioCensista());
        return this.getGestorBusquedaIdFuncionarioCensista().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionarioCensista1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = bean.getCampoIdFuncionarioCensista1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFuncionarioCensista());
    }

    public String getScriptCampoIdFuncionarioCensista1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = bean.getVisitaCensoDataProvider().getIdFuncionarioCensista(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioCensista1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioCensista1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioCensista1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioCensista1Panel2Rendered() {
        return isCampoIdFuncionarioCensista1Boton2Rendered();
    }

    public boolean isTableColumnIdFuncionarioCensista3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioCensista1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isGridIdVisitaCensoRendered() {
        return true;
    }

    public boolean isGridIdPotencialBenRendered() {
        return true;
    }

    public boolean isGridIdFuncionarioCensistaRendered() {
        return true;
    }

    public boolean isGridFechaVisitaRendered() {
        return true;
    }

    public boolean isGridObservacionesRendered() {
        return true;
    }

    // </editor-fold>

/**/
}
