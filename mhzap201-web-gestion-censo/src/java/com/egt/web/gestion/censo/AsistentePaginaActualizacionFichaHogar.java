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

import com.egt.base.enums.EnumTipoArea;
import com.egt.base.enums.EnumTipoMatParedes;
import com.egt.base.enums.EnumTipoMatPiso;
import com.egt.base.enums.EnumTipoMatTecho;
import com.egt.base.enums.EnumTipoOcupacionViv;
import com.egt.base.enums.EnumSiono;
import com.egt.base.enums.EnumTipoCombustible;
import com.egt.base.enums.EnumTipoPiezaBano;
import com.egt.base.enums.EnumTipoServicioSan;
import com.egt.base.enums.EnumTipoServicioAgua;
import com.egt.base.enums.EnumTipoAbaAgua;
import com.egt.base.enums.EnumTipoDesechoBas;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.control.Auditor;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.DesactivarFichaHogarMessage;
import com.egt.ejb.business.message.ReactivarFichaHogarMessage;
import com.egt.ejb.business.message.CalcularIcvFichaHogarMessage;
import com.egt.ejb.business.process.FichaHogarBusinessProcessLocal;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.jms.ObjectMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AsistentePaginaActualizacionFichaHogar {

    private PaginaActualizacionFichaHogar bean;

    public AsistentePaginaActualizacionFichaHogar() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionFichaHogar(PaginaActualizacionFichaHogar bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(FichaHogarCachedRowSetDataProvider2.FUNCION_MODIFICAR_FICHA_HOGAR, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(FichaHogarCachedRowSetDataProvider2.FUNCION_DESACTIVAR_FICHA_HOGAR, BundleWebui.getString("desactivar_ficha_hogar")),
            new Option(FichaHogarCachedRowSetDataProvider2.FUNCION_REACTIVAR_FICHA_HOGAR, BundleWebui.getString("reactivar_ficha_hogar")),
            new Option(FichaHogarCachedRowSetDataProvider2.FUNCION_CALCULAR_ICV_FICHA_HOGAR, BundleWebui.getString("calcular_icv_ficha_hogar"))
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
        long f = bean.getRecursoDataProvider().getFuncionBusinessProcess();
        boolean esFilaAutorizada = bean.getRecursoDataProvider().esFilaAutorizada(rowKey, f);
        if (!esFilaAutorizada) {
        } else if (f == FichaHogarCachedRowSetDataProvider2.FUNCION_DESACTIVAR_FICHA_HOGAR) {
            this.desactivarFichaHogar(rowKey);
        } else if (f == FichaHogarCachedRowSetDataProvider2.FUNCION_REACTIVAR_FICHA_HOGAR) {
            this.reactivarFichaHogar(rowKey);
        } else if (f == FichaHogarCachedRowSetDataProvider2.FUNCION_CALCULAR_ICV_FICHA_HOGAR) {
            this.calcularIcvFichaHogar(rowKey);
        }
    }

    private boolean desactivarFichaHogar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "desactivarFichaHogar", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idFichaHogar = bean.getFichaHogarDataProvider().getIdFichaHogar(rowKey);
        DesactivarFichaHogarMessage message = new DesactivarFichaHogarMessage(idFichaHogar);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getFichaHogarBusinessProcess().desactivarFichaHogar(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean reactivarFichaHogar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "reactivarFichaHogar", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idFichaHogar = bean.getFichaHogarDataProvider().getIdFichaHogar(rowKey);
        ReactivarFichaHogarMessage message = new ReactivarFichaHogarMessage(idFichaHogar);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getFichaHogarBusinessProcess().reactivarFichaHogar(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean calcularIcvFichaHogar(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "calcularIcvFichaHogar", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idFichaHogar = bean.getFichaHogarDataProvider().getIdFichaHogar(rowKey);
        CalcularIcvFichaHogarMessage message = new CalcularIcvFichaHogarMessage(idFichaHogar);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getFichaHogarBusinessProcess().calcularIcvFichaHogar(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_FICHA_HOGAR;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioCensista">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioCensista = null;

    private boolean funcionSelectEjecutableIdFuncionarioCensista = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioCensista() {
        if (this.gestorBusquedaIdFuncionarioCensista == null) {
            this.gestorBusquedaIdFuncionarioCensista = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_CENSISTA,
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
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioCensista(rowKey));
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
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioCensista(rowKey));
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
        Long id = bean.getFichaHogarDataProvider().getIdFuncionarioCensista(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioCensista1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioCensista1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioCensista1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioCensista1Panel2Rendered() {
        return isCampoIdFuncionarioCensista1Boton2Rendered() && isGridIdFuncionarioCensistaRendered();
    }

    public boolean isTableColumnIdFuncionarioCensista3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioCensista1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioSupervisor">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioSupervisor = null;

    private boolean funcionSelectEjecutableIdFuncionarioSupervisor = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioSupervisor() {
        if (this.gestorBusquedaIdFuncionarioSupervisor == null) {
            this.gestorBusquedaIdFuncionarioSupervisor = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_SUPERVISOR,
                    this.funcionSelectEjecutableIdFuncionarioSupervisor);
        }
        return this.gestorBusquedaIdFuncionarioSupervisor;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionarioSupervisor() {
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

    public void campoIdFuncionarioSupervisor1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioSupervisor().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioSupervisor());
        this.getGestorBusquedaIdFuncionarioSupervisor().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionarioSupervisor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioSupervisor(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioSupervisor().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioSupervisor());
        return this.getGestorBusquedaIdFuncionarioSupervisor().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionarioSupervisor1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioSupervisor().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionarioSupervisor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioSupervisor(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioSupervisor().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioSupervisor());
        return this.getGestorBusquedaIdFuncionarioSupervisor().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionarioSupervisor1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = bean.getCampoIdFuncionarioSupervisor1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFuncionarioSupervisor());
    }

    public String getScriptCampoIdFuncionarioSupervisor1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = bean.getFichaHogarDataProvider().getIdFuncionarioSupervisor(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioSupervisor1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioSupervisor1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioSupervisor1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioSupervisor1Panel2Rendered() {
        return isCampoIdFuncionarioSupervisor1Boton2Rendered() && isGridIdFuncionarioSupervisorRendered();
    }

    public boolean isTableColumnIdFuncionarioSupervisor3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioSupervisor1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioCriticoDeco">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioCriticoDeco = null;

    private boolean funcionSelectEjecutableIdFuncionarioCriticoDeco = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioCriticoDeco() {
        if (this.gestorBusquedaIdFuncionarioCriticoDeco == null) {
            this.gestorBusquedaIdFuncionarioCriticoDeco = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_CRITICO_DECO,
                    this.funcionSelectEjecutableIdFuncionarioCriticoDeco);
        }
        return this.gestorBusquedaIdFuncionarioCriticoDeco;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionarioCriticoDeco() {
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

    public void campoIdFuncionarioCriticoDeco1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioCriticoDeco().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioCriticoDeco());
        this.getGestorBusquedaIdFuncionarioCriticoDeco().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionarioCriticoDeco1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioCriticoDeco(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioCriticoDeco().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioCriticoDeco());
        return this.getGestorBusquedaIdFuncionarioCriticoDeco().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionarioCriticoDeco1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioCriticoDeco().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionarioCriticoDeco1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioCriticoDeco(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioCriticoDeco().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioCriticoDeco());
        return this.getGestorBusquedaIdFuncionarioCriticoDeco().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionarioCriticoDeco1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = bean.getCampoIdFuncionarioCriticoDeco1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFuncionarioCriticoDeco());
    }

    public String getScriptCampoIdFuncionarioCriticoDeco1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = bean.getFichaHogarDataProvider().getIdFuncionarioCriticoDeco(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioCriticoDeco1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioCriticoDeco1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioCriticoDeco1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioCriticoDeco1Panel2Rendered() {
        return isCampoIdFuncionarioCriticoDeco1Boton2Rendered() && isGridIdFuncionarioCriticoDecoRendered();
    }

    public boolean isTableColumnIdFuncionarioCriticoDeco3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioCriticoDeco1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioDigitador">
    private GestorBusquedaReferencia gestorBusquedaIdFuncionarioDigitador = null;

    private boolean funcionSelectEjecutableIdFuncionarioDigitador = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdFuncionarioDigitador() {
        if (this.gestorBusquedaIdFuncionarioDigitador == null) {
            this.gestorBusquedaIdFuncionarioDigitador = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getFuncionarioReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_FUNCIONARIO_DIGITADOR,
                    this.funcionSelectEjecutableIdFuncionarioDigitador);
        }
        return this.gestorBusquedaIdFuncionarioDigitador;
    }

    protected FiltroBusqueda getFiltroBusquedaIdFuncionarioDigitador() {
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

    public void campoIdFuncionarioDigitador1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioDigitador().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioDigitador());
        this.getGestorBusquedaIdFuncionarioDigitador().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdFuncionarioDigitador1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioDigitador(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioDigitador().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioDigitador());
        return this.getGestorBusquedaIdFuncionarioDigitador().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdFuncionarioDigitador1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdFuncionarioDigitador().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdFuncionarioDigitador1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdFuncionarioDigitador(rowKey));
        }
        this.getGestorBusquedaIdFuncionarioDigitador().setFiltroBusqueda(this.getFiltroBusquedaIdFuncionarioDigitador());
        return this.getGestorBusquedaIdFuncionarioDigitador().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdFuncionarioDigitador1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = FuncionarioCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = bean.getCampoIdFuncionarioDigitador1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdFuncionarioDigitador());
    }

    public String getScriptCampoIdFuncionarioDigitador1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = bean.getFichaHogarDataProvider().getIdFuncionarioDigitador(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdFuncionarioDigitador1Boton2Rendered() {
        return bean == null ? true : bean.getFuncionarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdFuncionarioDigitador1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdFuncionarioDigitador1Boton2Rendered();
    }

    public boolean isCampoIdFuncionarioDigitador1Panel2Rendered() {
        return isCampoIdFuncionarioDigitador1Boton2Rendered() && isGridIdFuncionarioDigitadorRendered();
    }

    public boolean isTableColumnIdFuncionarioDigitador3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdFuncionarioDigitador1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDepartamento">
    private GestorBusquedaReferencia gestorBusquedaIdDepartamento = null;

    private boolean funcionSelectEjecutableIdDepartamento = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDepartamento() {
        if (this.gestorBusquedaIdDepartamento == null) {
            this.gestorBusquedaIdDepartamento = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_DEPARTAMENTO,
                    this.funcionSelectEjecutableIdDepartamento);
        }
        return this.gestorBusquedaIdDepartamento;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDepartamento() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_NULO;
        valor = null;
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdDepartamento1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        this.getGestorBusquedaIdDepartamento().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDepartamento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdDepartamento(rowKey));
        }
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        return this.getGestorBusquedaIdDepartamento().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDepartamento1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDepartamento().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDepartamento1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdDepartamento(rowKey));
        }
        this.getGestorBusquedaIdDepartamento().setFiltroBusqueda(this.getFiltroBusquedaIdDepartamento());
        return this.getGestorBusquedaIdDepartamento().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDepartamento1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDepartamento1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDepartamento());
    }

    public String getScriptCampoIdDepartamento1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getFichaHogarDataProvider().getIdDepartamento(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDepartamento1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDepartamento1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDepartamento1Boton2Rendered();
    }

    public boolean isCampoIdDepartamento1Panel2Rendered() {
        return isCampoIdDepartamento1Boton2Rendered() && isGridIdDepartamentoRendered();
    }

    public boolean isTableColumnIdDepartamento3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDepartamento1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDistrito">
    private GestorBusquedaReferencia gestorBusquedaIdDistrito = null;

    private boolean funcionSelectEjecutableIdDistrito = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdDistrito() {
        if (this.gestorBusquedaIdDistrito == null) {
            this.gestorBusquedaIdDistrito = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_DISTRITO,
                    this.funcionSelectEjecutableIdDistrito);
        }
        return this.gestorBusquedaIdDistrito;
    }

    protected FiltroBusqueda getFiltroBusquedaIdDistrito() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = bean.getFichaHogarDataProvider().getIdDepartamento(rowKey);
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdDistrito1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        this.getGestorBusquedaIdDistrito().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdDistrito1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdDistrito(rowKey));
        }
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        return this.getGestorBusquedaIdDistrito().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdDistrito1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdDistrito().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdDistrito1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdDistrito(rowKey));
        }
        this.getGestorBusquedaIdDistrito().setFiltroBusqueda(this.getFiltroBusquedaIdDistrito());
        return this.getGestorBusquedaIdDistrito().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdDistrito1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdDistrito1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdDistrito());
    }

    public String getScriptCampoIdDistrito1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getFichaHogarDataProvider().getIdDistrito(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdDistrito1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdDistrito1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdDistrito1Boton2Rendered();
    }

    public boolean isCampoIdDistrito1Panel2Rendered() {
        return isCampoIdDistrito1Boton2Rendered() && isGridIdDistritoRendered();
    }

    public boolean isTableColumnIdDistrito3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdDistrito1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idBarrio">
    private GestorBusquedaReferencia gestorBusquedaIdBarrio = null;

    private boolean funcionSelectEjecutableIdBarrio = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdBarrio() {
        if (this.gestorBusquedaIdBarrio == null) {
            this.gestorBusquedaIdBarrio = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_BARRIO,
                    this.funcionSelectEjecutableIdBarrio);
        }
        return this.gestorBusquedaIdBarrio;
    }

    protected FiltroBusqueda getFiltroBusquedaIdBarrio() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = bean.getFichaHogarDataProvider().getIdDistrito(rowKey);
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public void campoIdBarrio1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        this.getGestorBusquedaIdBarrio().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdBarrio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdBarrio(rowKey));
        }
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        return this.getGestorBusquedaIdBarrio().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdBarrio1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdBarrio().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdBarrio1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdBarrio(rowKey));
        }
        this.getGestorBusquedaIdBarrio().setFiltroBusqueda(this.getFiltroBusquedaIdBarrio());
        return this.getGestorBusquedaIdBarrio().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdBarrio1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdBarrio1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdBarrio());
    }

    public String getScriptCampoIdBarrio1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getFichaHogarDataProvider().getIdBarrio(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdBarrio1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdBarrio1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdBarrio1Boton2Rendered();
    }

    public boolean isCampoIdBarrio1Panel2Rendered() {
        return isCampoIdBarrio1Boton2Rendered() && isGridIdBarrioRendered();
    }

    public boolean isTableColumnIdBarrio3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdBarrio1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idProveedorDatExt">
    private GestorBusquedaReferencia gestorBusquedaIdProveedorDatExt = null;

    private boolean funcionSelectEjecutableIdProveedorDatExt = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdProveedorDatExt() {
        if (this.gestorBusquedaIdProveedorDatExt == null) {
            this.gestorBusquedaIdProveedorDatExt = new GestorBusquedaReferencia(
                    bean.getFichaHogarDataProvider(),
                    bean.getProveedorDatExtReferenceDataProvider(),
                    FichaHogarCachedRowSetDataProvider2.COLUMNA_ID_PROVEEDOR_DAT_EXT,
                    this.funcionSelectEjecutableIdProveedorDatExt);
        }
        return this.gestorBusquedaIdProveedorDatExt;
    }

    protected FiltroBusqueda getFiltroBusquedaIdProveedorDatExt() {
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

    public void campoIdProveedorDatExt1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdProveedorDatExt().setFiltroBusqueda(this.getFiltroBusquedaIdProveedorDatExt());
        this.getGestorBusquedaIdProveedorDatExt().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdProveedorDatExt1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdProveedorDatExt(rowKey));
        }
        this.getGestorBusquedaIdProveedorDatExt().setFiltroBusqueda(this.getFiltroBusquedaIdProveedorDatExt());
        return this.getGestorBusquedaIdProveedorDatExt().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdProveedorDatExt1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdProveedorDatExt().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdProveedorDatExt1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getFichaHogarDataProvider().getIdProveedorDatExt(rowKey));
        }
        this.getGestorBusquedaIdProveedorDatExt().setFiltroBusqueda(this.getFiltroBusquedaIdProveedorDatExt());
        return this.getGestorBusquedaIdProveedorDatExt().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdProveedorDatExt1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = ProveedorDatExtCachedRowSetDataProvider2.FUNCION_CONSULTAR_PROVEEDOR_DAT_EXT;
        String campo = bean.getCampoIdProveedorDatExt1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_PROVEEDOR_DAT_EXT;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdProveedorDatExt());
    }

    public String getScriptCampoIdProveedorDatExt1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_PROVEEDOR_DAT_EXT;
        Long id = bean.getFichaHogarDataProvider().getIdProveedorDatExt(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdProveedorDatExt1Boton2Rendered() {
        return bean == null ? true : bean.getProveedorDatExtReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdProveedorDatExt1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdProveedorDatExt1Boton2Rendered();
    }

    public boolean isCampoIdProveedorDatExt1Panel2Rendered() {
        return isCampoIdProveedorDatExt1Boton2Rendered() && isGridIdProveedorDatExtRendered();
    }

    public boolean isTableColumnIdProveedorDatExt3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdProveedorDatExt1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoArea1() {
        return JSF.getListaOpciones(EnumTipoArea.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoMatParedes1() {
        return JSF.getListaOpciones(EnumTipoMatParedes.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoMatPiso1() {
        return JSF.getListaOpciones(EnumTipoMatPiso.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoMatTecho1() {
        return JSF.getListaOpciones(EnumTipoMatTecho.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoOcupacionViv1() {
        return JSF.getListaOpciones(EnumTipoOcupacionViv.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoPiezaCocina1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoCombustible1() {
        return JSF.getListaOpciones(EnumTipoCombustible.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoPiezaBano1() {
        return JSF.getListaOpciones(EnumTipoPiezaBano.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoServicioSan1() {
        return JSF.getListaOpciones(EnumTipoServicioSan.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoServicioAgua1() {
        return JSF.getListaOpciones(EnumTipoServicioAgua.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoAbaAgua1() {
        return JSF.getListaOpciones(EnumTipoAbaAgua.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoCorrienteElec1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroTipoDesechoBas1() {
        return JSF.getListaOpciones(EnumTipoDesechoBas.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoTelefonoCelular1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoTlfLineaBaja1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispHeladera1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispLavarropas1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispTermo1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispAireAcon1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispAutomovil1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispCamion1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaNumeroSionoDispMotocicleta1() {
        return JSF.getListaOpciones(EnumSiono.values(), true, false);
    }

    public Object getOpcionesListaEsFichaHogarInactiva1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoArea(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoArea(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoAreaUrbana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.URBANA.intValue());
    }

    public boolean isNumeroTipoAreaRural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.RURAL.intValue());
    }

    public boolean isNullNumeroTipoMatParedes() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoMatParedes() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoMatParedesEstaqueo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.ESTAQUEO.intValue());
    }

    public boolean isNumeroTipoMatParedesAdobeCarnizo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.ADOBE_CARNIZO.intValue());
    }

    public boolean isNumeroTipoMatParedesMadera() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.MADERA.intValue());
    }

    public boolean isNumeroTipoMatParedesLadrilloCemento() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.LADRILLO_CEMENTO.intValue());
    }

    public boolean isNumeroTipoMatParedesPiedra() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.PIEDRA.intValue());
    }

    public boolean isNumeroTipoMatParedesChapaTelaCartonLatasOtros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.CHAPA_TELA_CARTON_LATAS_OTROS.intValue());
    }

    public boolean isNumeroTipoMatParedesSinParedes() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatParedes(rowKey);
        return value != null && value.equals(EnumTipoMatParedes.SIN_PAREDES.intValue());
    }

    public boolean isNullNumeroTipoMatPiso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoMatPiso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoMatPisoTierra() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.TIERRA.intValue());
    }

    public boolean isNumeroTipoMatPisoMadera() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.MADERA.intValue());
    }

    public boolean isNumeroTipoMatPisoLadrillo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.LADRILLO.intValue());
    }

    public boolean isNumeroTipoMatPisoLecherada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.LECHERADA.intValue());
    }

    public boolean isNumeroTipoMatPisoBaldosa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.BALDOSA.intValue());
    }

    public boolean isNumeroTipoMatPisoCeramicaAlfombraViniloOtros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.CERAMICA_ALFOMBRA_VINILO_OTROS.intValue());
    }

    public boolean isNumeroTipoMatPisoGranitoParquetMarmol() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatPiso(rowKey);
        return value != null && value.equals(EnumTipoMatPiso.GRANITO_PARQUET_MARMOL.intValue());
    }

    public boolean isNullNumeroTipoMatTecho() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatTecho(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoMatTecho() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatTecho(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoMatTechoPajaMaderaTacuaraOtros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatTecho(rowKey);
        return value != null && value.equals(EnumTipoMatTecho.PAJA_MADERA_TACUARA_OTROS.intValue());
    }

    public boolean isNumeroTipoMatTechoTejaLosa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatTecho(rowKey);
        return value != null && value.equals(EnumTipoMatTecho.TEJA_LOSA.intValue());
    }

    public boolean isNumeroTipoMatTechoEthernit() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatTecho(rowKey);
        return value != null && value.equals(EnumTipoMatTecho.ETHERNIT.intValue());
    }

    public boolean isNumeroTipoMatTechoZinc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoMatTecho(rowKey);
        return value != null && value.equals(EnumTipoMatTecho.ZINC.intValue());
    }

    public boolean isNullNumeroTipoOcupacionViv() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoOcupacionViv() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoOcupacionVivPropiaOEnCondominio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null && value.equals(EnumTipoOcupacionViv.PROPIA_O_EN_CONDOMINIO.intValue());
    }

    public boolean isNumeroTipoOcupacionVivPagandoEnCuotas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null && value.equals(EnumTipoOcupacionViv.PAGANDO_EN_CUOTAS.intValue());
    }

    public boolean isNumeroTipoOcupacionVivAlquilada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null && value.equals(EnumTipoOcupacionViv.ALQUILADA.intValue());
    }

    public boolean isNumeroTipoOcupacionVivOcupadaDeHecho() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null && value.equals(EnumTipoOcupacionViv.OCUPADA_DE_HECHO.intValue());
    }

    public boolean isNumeroTipoOcupacionVivCedida() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null && value.equals(EnumTipoOcupacionViv.CEDIDA.intValue());
    }

    public boolean isNumeroTipoOcupacionVivOtros() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoOcupacionViv(rowKey);
        return value != null && value.equals(EnumTipoOcupacionViv.OTROS.intValue());
    }

    public boolean isNullNumeroSionoPiezaCocina() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoPiezaCocina(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoPiezaCocina() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoPiezaCocina(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoPiezaCocinaSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoPiezaCocina(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoPiezaCocinaNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoPiezaCocina(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroTipoCombustible() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoCombustible() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoCombustibleLena() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null && value.equals(EnumTipoCombustible.LENA.intValue());
    }

    public boolean isNumeroTipoCombustibleCarbon() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null && value.equals(EnumTipoCombustible.CARBON.intValue());
    }

    public boolean isNumeroTipoCombustibleGas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null && value.equals(EnumTipoCombustible.GAS.intValue());
    }

    public boolean isNumeroTipoCombustibleKeroseneAlcohol() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null && value.equals(EnumTipoCombustible.KEROSENE_ALCOHOL.intValue());
    }

    public boolean isNumeroTipoCombustibleElectricidad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null && value.equals(EnumTipoCombustible.ELECTRICIDAD.intValue());
    }

    public boolean isNumeroTipoCombustibleNoCocina() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoCombustible(rowKey);
        return value != null && value.equals(EnumTipoCombustible.NO_COCINA.intValue());
    }

    public boolean isNullNumeroTipoPiezaBano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoPiezaBano() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoPiezaBanoConTermoCalefon() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value != null && value.equals(EnumTipoPiezaBano.CON_TERMO_CALEFON.intValue());
    }

    public boolean isNumeroTipoPiezaBanoConDuchaElectrica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value != null && value.equals(EnumTipoPiezaBano.CON_DUCHA_ELECTRICA.intValue());
    }

    public boolean isNumeroTipoPiezaBanoConDuchaComun() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value != null && value.equals(EnumTipoPiezaBano.CON_DUCHA_COMUN.intValue());
    }

    public boolean isNumeroTipoPiezaBanoPiezaSinDucha() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value != null && value.equals(EnumTipoPiezaBano.PIEZA_SIN_DUCHA.intValue());
    }

    public boolean isNumeroTipoPiezaBanoNoTienePiezaParaBanarse() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoPiezaBano(rowKey);
        return value != null && value.equals(EnumTipoPiezaBano.NO_TIENE_PIEZA_PARA_BANARSE.intValue());
    }

    public boolean isNullNumeroTipoServicioSan() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoServicioSan() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoServicioSanWcConectadoALaRedPublica() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null && value.equals(EnumTipoServicioSan.WC_CONECTADO_A_LA_RED_PUBLICA.intValue());
    }

    public boolean isNumeroTipoServicioSanWcConPozoCiego() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null && value.equals(EnumTipoServicioSan.WC_CON_POZO_CIEGO.intValue());
    }

    public boolean isNumeroTipoServicioSanExcusadoTipoMunicipal() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null && value.equals(EnumTipoServicioSan.EXCUSADO_TIPO_MUNICIPAL.intValue());
    }

    public boolean isNumeroTipoServicioSanLetrinaComun() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null && value.equals(EnumTipoServicioSan.LETRINA_COMUN.intValue());
    }

    public boolean isNumeroTipoServicioSanDesagueEnRioArroyoLaguna() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null && value.equals(EnumTipoServicioSan.DESAGUE_EN_RIO_ARROYO_LAGUNA.intValue());
    }

    public boolean isNumeroTipoServicioSanNoTiene() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioSan(rowKey);
        return value != null && value.equals(EnumTipoServicioSan.NO_TIENE.intValue());
    }

    public boolean isNullNumeroTipoServicioAgua() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoServicioAgua() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoServicioAguaEssapSenasa() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.ESSAP_SENASA.intValue());
    }

    public boolean isNumeroTipoServicioAguaRedPrivada() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.RED_PRIVADA.intValue());
    }

    public boolean isNumeroTipoServicioAguaPozoConBomba() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.POZO_CON_BOMBA.intValue());
    }

    public boolean isNumeroTipoServicioAguaPozoSinBomba() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.POZO_SIN_BOMBA.intValue());
    }

    public boolean isNumeroTipoServicioAguaAguaderoSinCaneria() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.AGUADERO_SIN_CANERIA.intValue());
    }

    public boolean isNumeroTipoServicioAguaYouaManantial() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.YOUA_MANANTIAL.intValue());
    }

    public boolean isNumeroTipoServicioAguaArroyoRio() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoServicioAgua(rowKey);
        return value != null && value.equals(EnumTipoServicioAgua.ARROYO_RIO.intValue());
    }

    public boolean isNullNumeroTipoAbaAgua() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoAbaAgua(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoAbaAgua() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoAbaAgua(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoAbaAguaDentroDeLaVivienda() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoAbaAgua(rowKey);
        return value != null && value.equals(EnumTipoAbaAgua.DENTRO_DE_LA_VIVIENDA.intValue());
    }

    public boolean isNumeroTipoAbaAguaDentroDeLaPropiedad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoAbaAgua(rowKey);
        return value != null && value.equals(EnumTipoAbaAgua.DENTRO_DE_LA_PROPIEDAD.intValue());
    }

    public boolean isNumeroTipoAbaAguaFueraDeLaPropiedad() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoAbaAgua(rowKey);
        return value != null && value.equals(EnumTipoAbaAgua.FUERA_DE_LA_PROPIEDAD.intValue());
    }

    public boolean isNullNumeroSionoCorrienteElec() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoCorrienteElec(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoCorrienteElec() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoCorrienteElec(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoCorrienteElecSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoCorrienteElec(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoCorrienteElecNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoCorrienteElec(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroTipoDesechoBas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoDesechoBas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoDesechoBasRecogeCamionPublicoPrivado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null && value.equals(EnumTipoDesechoBas.RECOGE_CAMION_PUBLICO_PRIVADO.intValue());
    }

    public boolean isNumeroTipoDesechoBasQuema() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null && value.equals(EnumTipoDesechoBas.QUEMA.intValue());
    }

    public boolean isNumeroTipoDesechoBasArrojaEnUnHoyo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null && value.equals(EnumTipoDesechoBas.ARROJA_EN_UN_HOYO.intValue());
    }

    public boolean isNumeroTipoDesechoBasTiraEnElPatioDeLaChacra() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null && value.equals(EnumTipoDesechoBas.TIRA_EN_EL_PATIO_DE_LA_CHACRA.intValue());
    }

    public boolean isNumeroTipoDesechoBasTiraEnZanjaArroyoRioEtc() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null && value.equals(EnumTipoDesechoBas.TIRA_EN_ZANJA_ARROYO_RIO_ETC.intValue());
    }

    public boolean isNumeroTipoDesechoBasRecogeEnCarrito() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroTipoDesechoBas(rowKey);
        return value != null && value.equals(EnumTipoDesechoBas.RECOGE_EN_CARRITO.intValue());
    }

    public boolean isNullNumeroSionoTelefonoCelular() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTelefonoCelular(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoTelefonoCelular() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTelefonoCelular(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoTelefonoCelularSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTelefonoCelular(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoTelefonoCelularNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTelefonoCelular(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoTlfLineaBaja() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTlfLineaBaja(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoTlfLineaBaja() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTlfLineaBaja(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoTlfLineaBajaSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTlfLineaBaja(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoTlfLineaBajaNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoTlfLineaBaja(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispHeladera() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispHeladera(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispHeladera() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispHeladera(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispHeladeraSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispHeladera(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispHeladeraNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispHeladera(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispLavarropas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispLavarropas(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispLavarropas() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispLavarropas(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispLavarropasSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispLavarropas(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispLavarropasNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispLavarropas(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispTermo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispTermo(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispTermo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispTermo(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispTermoSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispTermo(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispTermoNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispTermo(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispAireAcon() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAireAcon(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispAireAcon() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAireAcon(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispAireAconSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAireAcon(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispAireAconNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAireAcon(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispAutomovil() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAutomovil(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispAutomovil() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAutomovil(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispAutomovilSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAutomovil(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispAutomovilNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispAutomovil(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispCamion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispCamion(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispCamion() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispCamion(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispCamionSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispCamion(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispCamionNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispCamion(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

    public boolean isNullNumeroSionoDispMotocicleta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispMotocicleta(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroSionoDispMotocicleta() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispMotocicleta(rowKey);
        return value != null;
    }

    public boolean isNumeroSionoDispMotocicletaSi() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispMotocicleta(rowKey);
        return value != null && value.equals(EnumSiono.SI.intValue());
    }

    public boolean isNumeroSionoDispMotocicletaNo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getNumeroSionoDispMotocicleta(rowKey);
        return value != null && value.equals(EnumSiono.NO.intValue());
    }

   public boolean isEsFichaHogarInactiva() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getEsFichaHogarInactiva(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsFichaHogarInactiva() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getFichaHogarDataProvider().getEsFichaHogarInactiva(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdFichaHogarRendered() {
        return true;
    }

    public boolean isGridCodigoFichaHogarRendered() {
        return true;
    }

    public boolean isGridIdFuncionarioCensistaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridIdFuncionarioSupervisorRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridIdFuncionarioCriticoDecoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridIdFuncionarioDigitadorRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridNumeroFormularioRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridNumeroViviendaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridNumeroHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridFechaEntrevistaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridObservacionesRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPortadaRendered();
    }

    public boolean isGridHusoUtmRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPosicionamientoRendered();
    }

    public boolean isGridFranjaUtmRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPosicionamientoRendered();
    }

    public boolean isGridDistanciaEsteUtmRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPosicionamientoRendered();
    }

    public boolean isGridDistanciaNorteUtmRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionPosicionamientoRendered();
    }

    public boolean isGridManzanaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionUbicacionRendered();
    }

    public boolean isGridIdDepartamentoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionUbicacionRendered();
    }

    public boolean isGridIdDistritoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionUbicacionRendered();
    }

    public boolean isGridNumeroTipoAreaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionUbicacionRendered();
    }

    public boolean isGridIdBarrioRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionUbicacionRendered();
    }

    public boolean isGridDireccionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionUbicacionRendered();
    }

    public boolean isGridTotalPersonasRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionResumenRendered();
    }

    public boolean isGridTotalHombresRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionResumenRendered();
    }

    public boolean isGridTotalMujeresRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionResumenRendered();
    }

    public boolean isGridNumeroTipoMatParedesRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridNumeroTipoMatPisoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridNumeroTipoMatTechoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridNumeroTipoOcupacionVivRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridOtroTipoOcupacionVivRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridCantidadPiezasRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridCantidadDormitoriosRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda1Rendered();
    }

    public boolean isGridNumeroSionoPiezaCocinaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroTipoCombustibleRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroTipoPiezaBanoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroTipoServicioSanRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroTipoServicioAguaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroTipoAbaAguaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroSionoCorrienteElecRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroTipoDesechoBasRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda2Rendered();
    }

    public boolean isGridNumeroSionoTelefonoCelularRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda3Rendered();
    }

    public boolean isGridNumeroTelefonoCelularRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda3Rendered();
    }

    public boolean isGridNumeroSionoTlfLineaBajaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda3Rendered();
    }

    public boolean isGridNumeroTelefonoLineaBajaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda3Rendered();
    }

    public boolean isGridNumeroSionoDispHeladeraRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNumeroSionoDispLavarropasRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNumeroSionoDispTermoRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNumeroSionoDispAireAconRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNumeroSionoDispAutomovilRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNumeroSionoDispCamionRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNumeroSionoDispMotocicletaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionVivienda4Rendered();
    }

    public boolean isGridNombreJefeHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionJefeRendered();
    }

    public boolean isGridNumeroCedulaJefeHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionJefeRendered();
    }

    public boolean isGridLetraCedulaJefeHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionJefeRendered();
    }

    public boolean isGridNumeroOrdenIdenJefeHogarRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionJefeRendered();
    }

    public boolean isGridNombreRespondenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRespondenteRendered();
    }

    public boolean isGridNumeroCedulaRespondenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRespondenteRendered();
    }

    public boolean isGridLetraCedulaRespondenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRespondenteRendered();
    }

    public boolean isGridNumeroOrdenIdenRespondenteRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionRespondenteRendered();
    }

    public boolean isGridIdProveedorDatExtRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridIndiceCalidadVidaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isGridEsFichaHogarInactivaRendered() {
        if (bean == null) {
            return true;
        }
        return bean.getGestor().isFilaProcesada() && isSeccionOtrosRendered();
    }

    public boolean isSeccionPortadaRendered() {
        return true;
    }

    public boolean isSeccionPortadaHidden() {
        return !isSeccionPortadaRendered();
    }

    public boolean isSeccionPosicionamientoRendered() {
        return true;
    }

    public boolean isSeccionPosicionamientoHidden() {
        return !isSeccionPosicionamientoRendered();
    }

    public boolean isSeccionUbicacionRendered() {
        return true;
    }

    public boolean isSeccionUbicacionHidden() {
        return !isSeccionUbicacionRendered();
    }

    public boolean isSeccionResumenRendered() {
        return true;
    }

    public boolean isSeccionResumenHidden() {
        return !isSeccionResumenRendered();
    }

    public boolean isSeccionVivienda1Rendered() {
        return true;
    }

    public boolean isSeccionVivienda1Hidden() {
        return !isSeccionVivienda1Rendered();
    }

    public boolean isSeccionVivienda2Rendered() {
        return true;
    }

    public boolean isSeccionVivienda2Hidden() {
        return !isSeccionVivienda2Rendered();
    }

    public boolean isSeccionVivienda3Rendered() {
        return true;
    }

    public boolean isSeccionVivienda3Hidden() {
        return !isSeccionVivienda3Rendered();
    }

    public boolean isSeccionVivienda4Rendered() {
        return true;
    }

    public boolean isSeccionVivienda4Hidden() {
        return !isSeccionVivienda4Rendered();
    }

    public boolean isSeccionJefeRendered() {
        return true;
    }

    public boolean isSeccionJefeHidden() {
        return !isSeccionJefeRendered();
    }

    public boolean isSeccionRespondenteRendered() {
        return true;
    }

    public boolean isSeccionRespondenteHidden() {
        return !isSeccionRespondenteRendered();
    }

    public boolean isSeccionOtrosRendered() {
        return true;
    }

    public boolean isSeccionOtrosHidden() {
        return !isSeccionOtrosRendered();
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private FichaHogarBusinessProcessLocal getFichaHogarBusinessProcess() {
        return (FichaHogarBusinessProcessLocal) bean.getFichaHogarBusinessProcess();
    }

    private BusinessProcessMessengerLocal getMessenger() {
        return (BusinessProcessMessengerLocal) bean.getMessenger();
    }

    private AbstractMessage requestReply(AbstractMessage message) throws Exception {
        ObjectMessage solicitud = this.getMessenger().postRequest(message);
        ObjectMessage respuesta = this.getMessenger().receiveReply(solicitud);
        AbstractMessage mensaje = respuesta == null
                ? (AbstractMessage) solicitud.getObject()
                : (AbstractMessage) respuesta.getObject();
        /**/
        TLC.getBitacora().add(mensaje);
        return mensaje;
    }
}
