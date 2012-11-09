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

package com.egt.web.usuario;

import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.business.process.UsuarioBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import com.sun.data.provider.RowKey;
import com.sun.webui.jsf.model.Option;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.jms.ObjectMessage;

public class AsistentePaginaActualizacionUsuario {

    private PaginaActualizacionUsuario bean;

    public AsistentePaginaActualizacionUsuario() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionUsuario(PaginaActualizacionUsuario bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(UsuarioCachedRowSetDataProvider3.FUNCION_MODIFICAR_USUARIO, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(UsuarioCachedRowSetDataProvider3.FUNCION_DESIGNAR_SUPER_USUARIO, BundleWebui.getString("designar súper")),
            new Option(UsuarioCachedRowSetDataProvider3.FUNCION_ANULAR_SUPER_USUARIO, BundleWebui.getString("anular designación súper")),
            new Option(UsuarioCachedRowSetDataProvider3.FUNCION_DESACTIVAR_USUARIO, BundleWebui.getString("desactivar")),
            new Option(UsuarioCachedRowSetDataProvider3.FUNCION_REACTIVAR_USUARIO, BundleWebui.getString("reactivar")),
            new Option(UsuarioCachedRowSetDataProvider3.FUNCION_SINCRONIZAR_USUARIO, BundleWebui.getString("sincronizar"))
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
        } else if (f == UsuarioCachedRowSetDataProvider3.FUNCION_DESIGNAR_SUPER_USUARIO) {
            this.designarSuperUsuario(rowKey);
        } else if (f == UsuarioCachedRowSetDataProvider3.FUNCION_ANULAR_SUPER_USUARIO) {
            this.anularSuperUsuario(rowKey);
        } else if (f == UsuarioCachedRowSetDataProvider3.FUNCION_DESACTIVAR_USUARIO) {
            this.desactivarUsuario(rowKey);
        } else if (f == UsuarioCachedRowSetDataProvider3.FUNCION_REACTIVAR_USUARIO) {
            this.reactivarUsuario(rowKey);
        } else if (f == UsuarioCachedRowSetDataProvider3.FUNCION_SINCRONIZAR_USUARIO) {
            this.sincronizarUsuario(rowKey);
//      } else if (f == UsuarioCachedRowSetDataProvider3.FUNCION_EMITIR_RELACION_USUARIO) {
//          this.emitirRelacionUsuario(rowKey);
        }
    }

    private boolean designarSuperUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "designarSuperUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idUsuario = bean.getUsuarioDataProvider().getIdUsuario(rowKey);
        DesignarSuperUsuarioMessage message = new DesignarSuperUsuarioMessage(idUsuario);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getUsuarioBusinessProcess().designarSuperUsuario(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean anularSuperUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "anularSuperUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idUsuario = bean.getUsuarioDataProvider().getIdUsuario(rowKey);
        AnularSuperUsuarioMessage message = new AnularSuperUsuarioMessage(idUsuario);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getUsuarioBusinessProcess().anularSuperUsuario(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean desactivarUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "desactivarUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idUsuario = bean.getUsuarioDataProvider().getIdUsuario(rowKey);
        DesactivarUsuarioMessage message = new DesactivarUsuarioMessage(idUsuario);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getUsuarioBusinessProcess().desactivarUsuario(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean reactivarUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "reactivarUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idUsuario = bean.getUsuarioDataProvider().getIdUsuario(rowKey);
        ReactivarUsuarioMessage message = new ReactivarUsuarioMessage(idUsuario);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getUsuarioBusinessProcess().reactivarUsuario(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean sincronizarUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "sincronizarUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idUsuario = bean.getUsuarioDataProvider().getIdUsuario(rowKey);
        SincronizarUsuarioMessage message = new SincronizarUsuarioMessage(idUsuario);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getUsuarioBusinessProcess().sincronizarUsuario(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    private boolean emitirRelacionUsuario(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "emitirRelacionUsuario", rowKey);
        bean.getGestor().setReadOnlyProcessing(true);
//      String report = UsuarioCachedRowSetDataProvider3.INFORME_FUNCION_EMITIR_RELACION_USUARIO;
//      long function = UsuarioCachedRowSetDataProvider3.FUNCION_EMITIR_RELACION_USUARIO;
//      this.getReporter().executeReport(report, function);
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_USUARIO;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuario">
    private GestorBusquedaReferencia gestorBusquedaIdUsuario = null;

    private boolean funcionSelectEjecutableIdUsuario = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuario() {
        if (this.gestorBusquedaIdUsuario == null) {
            this.gestorBusquedaIdUsuario = new GestorBusquedaReferencia(
                    bean.getUsuarioDataProvider(),
                    bean.getPersonaReferenceDataProvider(),
                    UsuarioCachedRowSetDataProvider3.COLUMNA_ID_USUARIO,
                    this.funcionSelectEjecutableIdUsuario);
        }
        return this.gestorBusquedaIdUsuario;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuario() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
//      columna = PersonaCachedRowSetDataProvider2.COLUMNA_NUMERO_TIPO_PERSONA;
//      comparacion = EnumOperadorCom.ES_IGUAL;
//      valor = EnumTipoPersona.NATURAL.getOptionValue();
//      filtro.addCriterio(columna, comparacion, valor);
        /**/
        columna = PersonaCachedRowSetDataProvider2.COLUMNA_ID_PERSONA;
        comparacion = EnumOperadorCom.NO_ESTA_ENTRE;
        string = "select id_usuario from usuario";
        filtro.addCriterio(columna, comparacion, string);
        /**/
        return filtro;
    }

    public void campoIdUsuario1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        this.getGestorBusquedaIdUsuario().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUsuario1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getUsuarioDataProvider().getIdUsuario(rowKey));
        }
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        return this.getGestorBusquedaIdUsuario().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUsuario1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuario().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUsuario1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getUsuarioDataProvider().getIdUsuario(rowKey));
        }
        this.getGestorBusquedaIdUsuario().setFiltroBusqueda(this.getFiltroBusquedaIdUsuario());
        return this.getGestorBusquedaIdUsuario().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuario1Boton1() {
        if (bean == null) {
            return null;
        }
        String urx = URX2.CONSULTA_TABLA_PERSONA;
        long funcion = UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuario1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdUsuario());
    }

    public String getScriptCampoIdUsuario1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_PERSONA;
        Long id = bean.getUsuarioDataProvider().getIdUsuario(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUsuario1Boton2Rendered() {
        return bean == null ? true : bean.getPersonaReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuario1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuario1Boton2Rendered();
    }

    public boolean isCampoIdUsuario1Panel2Rendered() {
        return isCampoIdUsuario1Boton2Rendered();
    }

    public boolean isTableColumnIdUsuario3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuario1Boton3Rendered();
    }

    // </editor-fold>
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuarioSupervisor">
    private GestorBusquedaReferencia gestorBusquedaIdUsuarioSupervisor = null;

    private boolean funcionSelectEjecutableIdUsuarioSupervisor = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuarioSupervisor() {
        if (this.gestorBusquedaIdUsuarioSupervisor == null) {
            this.gestorBusquedaIdUsuarioSupervisor = new GestorBusquedaReferencia(
                    bean.getUsuarioDataProvider(),
                    bean.getUsuarioReferenceDataProvider(),
                    UsuarioCachedRowSetDataProvider3.COLUMNA_ID_USUARIO_SUPERVISOR,
                    this.funcionSelectEjecutableIdUsuarioSupervisor);
        }
        return this.gestorBusquedaIdUsuarioSupervisor;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuarioSupervisor() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        FiltroBusqueda filtro = new FiltroBusqueda();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UsuarioCachedRowSetDataProvider3.COLUMNA_ES_USUARIO_ESPECIAL;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = com.egt.base.enums.EnumOpcionBinaria.NO.getOptionValue();
        filtro.addCriterio(columna, comparacion, valor);
        /**/
        return filtro;
    }

    public void campoIdUsuarioSupervisor1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioSupervisor().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioSupervisor());
        this.getGestorBusquedaIdUsuarioSupervisor().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUsuarioSupervisor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getUsuarioDataProvider().getIdUsuarioSupervisor(rowKey));
        }
        this.getGestorBusquedaIdUsuarioSupervisor().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioSupervisor());
        return this.getGestorBusquedaIdUsuarioSupervisor().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUsuarioSupervisor1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioSupervisor().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUsuarioSupervisor1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getUsuarioDataProvider().getIdUsuarioSupervisor(rowKey));
        }
        this.getGestorBusquedaIdUsuarioSupervisor().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioSupervisor());
        return this.getGestorBusquedaIdUsuarioSupervisor().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuarioSupervisor1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuarioSupervisor1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
//      String urx = URX2.TABLA_USUARIO;
//      return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdUsuarioSupervisor());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuarioSupervisor());
    }

    public String getScriptCampoIdUsuarioSupervisor1Boton2() {
        if (bean == null) {
            return null;
        }
//      RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      String urx = URX2.DETALLE_USUARIO;
//      Long id = bean.getUsuarioDataProvider().getIdUsuarioSupervisor(rowKey);
//      return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    public boolean isCampoIdUsuarioSupervisor1Boton2Rendered() {
        return bean == null ? true : bean.getUsuarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuarioSupervisor1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuarioSupervisor1Boton2Rendered();
    }

    public boolean isCampoIdUsuarioSupervisor1Panel2Rendered() {
        return isCampoIdUsuarioSupervisor1Boton2Rendered();
    }

    public boolean isTableColumnIdUsuarioSupervisor3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuarioSupervisor1Boton3Rendered();
    }

    // </editor-fold>
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsSuperUsuario1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsUsuarioInactivo1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsUsuarioModificado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsEjecutivoNegocio1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    public Object getOpcionesListaEsAnalistaCredito1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>
    /**/
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isEsSuperUsuario() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUsuarioDataProvider().getEsSuperUsuario(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsSuperUsuario() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUsuarioDataProvider().getEsSuperUsuario(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isEsUsuarioInactivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUsuarioDataProvider().getEsUsuarioInactivo(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsUsuarioInactivo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUsuarioDataProvider().getEsUsuarioInactivo(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isEsUsuarioModificado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUsuarioDataProvider().getEsUsuarioModificado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsUsuarioModificado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUsuarioDataProvider().getEsUsuarioModificado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdUsuarioRendered() {
        return true;
    }

    public boolean isGridCodigoUsuarioRendered() {
        return true;
    }

    public boolean isGridNombreUsuarioRendered() {
        return true;
    }

    public boolean isGridCorreoElectronicoRendered() {
        return true;
    }

    public boolean isGridIdUsuarioSupervisorRendered() {
        return true;
    }

    public boolean isGridEsSuperUsuarioRendered() {
        return true;
    }

    public boolean isGridEsUsuarioInactivoRendered() {
        return true;
    }

    public boolean isGridEsUsuarioModificadoRendered() {
        return true;
    }

    public boolean isGridEsEjecutivoNegocioRendered() {
        return true;
    }

    public boolean isGridEsAnalistaCreditoRendered() {
        return true;
    }

    // </editor-fold>

    /**/
    boolean synchronously = false;

    private UsuarioBusinessProcessLocal getUsuarioBusinessProcess() {
        return (UsuarioBusinessProcessLocal) bean.getUsuarioBusinessProcess();
    }

    private BusinessProcessMessengerLocal getMessenger() {
        return (BusinessProcessMessengerLocal) bean.getMessenger();
    }

    private ReporterBrokerLocal getReporter() {
        return (ReporterBrokerLocal) bean.getReporter();
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
