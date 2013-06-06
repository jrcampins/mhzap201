/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.manual;

import com.egt.base.enums.EnumTipoArea;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
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
import com.egt.ejb.business.message.ReconstruirUbicacionMessage;
import com.egt.ejb.business.process.UbicacionBusinessProcessLocal;
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

public class AsistentePaginaActualizacionUbicacion {

    private PaginaActualizacionUbicacion bean;

    public AsistentePaginaActualizacionUbicacion() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionUbicacion(PaginaActualizacionUbicacion bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(UbicacionCachedRowSetDataProvider2.FUNCION_MODIFICAR_UBICACION, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
            new Option("", etiquetaSeleccioneUnaOpcion),
            new Option(UbicacionCachedRowSetDataProvider2.FUNCION_RECONSTRUIR_UBICACION, BundleWebui.getString("reconstruir_ubicacion"))
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
        } else if (f == UbicacionCachedRowSetDataProvider2.FUNCION_RECONSTRUIR_UBICACION) {
            this.reconstruirUbicacion(rowKey);
        }
    }

    private boolean reconstruirUbicacion(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "reconstruirUbicacion", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        ReconstruirUbicacionMessage message = new ReconstruirUbicacionMessage();
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getUbicacionBusinessProcess().reconstruirUbicacion(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_UBICACION;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUbicacionSuperior">
    private GestorBusquedaReferencia gestorBusquedaIdUbicacionSuperior = null;

    private boolean funcionSelectEjecutableIdUbicacionSuperior = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUbicacionSuperior() {
        if (this.gestorBusquedaIdUbicacionSuperior == null) {
            this.gestorBusquedaIdUbicacionSuperior = new GestorBusquedaReferencia(
                    bean.getUbicacionDataProvider(),
                    bean.getUbicacionReferenceDataProvider(),
                    UbicacionCachedRowSetDataProvider2.COLUMNA_ID_UBICACION_SUPERIOR,
                    this.funcionSelectEjecutableIdUbicacionSuperior);
        }
        return this.gestorBusquedaIdUbicacionSuperior;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUbicacionSuperior() {
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

    public void campoIdUbicacionSuperior1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUbicacionSuperior().setFiltroBusqueda(this.getFiltroBusquedaIdUbicacionSuperior());
        this.getGestorBusquedaIdUbicacionSuperior().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUbicacionSuperior1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getUbicacionDataProvider().getIdUbicacionSuperior(rowKey));
        }
        this.getGestorBusquedaIdUbicacionSuperior().setFiltroBusqueda(this.getFiltroBusquedaIdUbicacionSuperior());
        return this.getGestorBusquedaIdUbicacionSuperior().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUbicacionSuperior1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUbicacionSuperior().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUbicacionSuperior1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getUbicacionDataProvider().getIdUbicacionSuperior(rowKey));
        }
        this.getGestorBusquedaIdUbicacionSuperior().setFiltroBusqueda(this.getFiltroBusquedaIdUbicacionSuperior());
        return this.getGestorBusquedaIdUbicacionSuperior().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUbicacionSuperior1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
        String campo = bean.getCampoIdUbicacionSuperior1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, this.getFiltroBusquedaIdUbicacionSuperior());
    }

    public String getScriptCampoIdUbicacionSuperior1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = bean.getUbicacionDataProvider().getIdUbicacionSuperior(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUbicacionSuperior1Boton2Rendered() {
        return bean == null ? true : bean.getUbicacionReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUbicacionSuperior1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUbicacionSuperior1Boton2Rendered();
    }

    public boolean isCampoIdUbicacionSuperior1Panel2Rendered() {
        return isCampoIdUbicacionSuperior1Boton2Rendered();
    }

    public boolean isTableColumnIdUbicacionSuperior3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUbicacionSuperior1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoArea1() {
        return JSF.getListaOpciones(EnumTipoArea.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUbicacionDataProvider().getNumeroTipoArea(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoArea() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUbicacionDataProvider().getNumeroTipoArea(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoAreaUrbana() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUbicacionDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.URBANA.intValue());
    }

    public boolean isNumeroTipoAreaRural() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getUbicacionDataProvider().getNumeroTipoArea(rowKey);
        return value != null && value.equals(EnumTipoArea.RURAL.intValue());
    }

    public boolean isGridIdUbicacionRendered() {
        return true;
    }

    public boolean isGridCodigoUbicacionRendered() {
        return true;
    }

    public boolean isGridNombreUbicacionRendered() {
        return true;
    }

    public boolean isGridIdUbicacionSuperiorRendered() {
        return true;
    }

    public boolean isGridNumeroTipoAreaRendered() {
        return true;
    }

    public boolean isGridCodigoUbicacionJupeRendered() {
        return true;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private UbicacionBusinessProcessLocal getUbicacionBusinessProcess() {
        return (UbicacionBusinessProcessLocal) bean.getUbicacionBusinessProcess();
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
