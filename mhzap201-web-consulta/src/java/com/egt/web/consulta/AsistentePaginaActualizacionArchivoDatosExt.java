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
import com.egt.data.specific.xdp2.ArchivoDatosExtCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
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
import com.egt.ejb.business.message.ImportarArchivoDatosExtMessage;
import com.egt.ejb.business.process.ArchivoDatosExtBusinessProcessLocal;
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

public class AsistentePaginaActualizacionArchivoDatosExt {

    private PaginaActualizacionArchivoDatosExt bean;

    public AsistentePaginaActualizacionArchivoDatosExt() {
        this.bean = null;
    }

    public AsistentePaginaActualizacionArchivoDatosExt(PaginaActualizacionArchivoDatosExt bean) {
        this.bean = bean;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion();
        return new Option[]{ //
                //  new Option("", etiquetaSeleccioneUnaOpcion),
                //  new Option(ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT, BundleWebui.getString("editar"))
                };
    }

    public Option[] getOpcionesListaFuncionAccion() {
        String etiquetaSeleccioneUnaOpcion = bean == null ? "" : bean.getGestor().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion();
        Option[] opciones = new Option[]{
        //  new Option("", etiquetaSeleccioneUnaOpcion),
        //  new Option(ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_IMPORTAR_ARCHIVO_DATOS_EXT, BundleWebui.getString("importar_archivo_datos_ext"))
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
        } else if (f == ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_IMPORTAR_ARCHIVO_DATOS_EXT) {
            this.importarArchivoDatosExt(rowKey);
        }
    }

    private boolean importarArchivoDatosExt(RowKey rowKey) throws Exception {
        Bitacora.trace(this.getClass(), "importarArchivoDatosExt", rowKey);
        bean.getGestor().setReadOnlyProcessing(false);
        Long idArchivoDatosExt = bean.getArchivoDatosExtDataProvider().getIdArchivoDatosExt(rowKey);
        ImportarArchivoDatosExtMessage message = new ImportarArchivoDatosExtMessage(idArchivoDatosExt);
        TLC.getControlador().ponerUsuarioEnMensaje(message);
        if (synchronously) {
            this.getArchivoDatosExtBusinessProcess().importarArchivoDatosExt(message);
        } else {
            this.requestReply(message);
        }
        return true;
    }

    public boolean isComandoDisponible() {
        if (bean == null) {
            return true;
        }
//      String urx = URX2.COMANDO_ARCHIVO_DATOS_EXT;
        return bean.getGestor().isLoteSinCambios();
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para abrir archivos adjuntos">
    public String getTextCampoNombreArchivoDatosExt1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getArchivoDatosExtDataProvider().getNombreArchivoDatosExt(rowKey);
        return JSF.getExtensionNombreArchivo(nombre);
    }

    public String getToolTipCampoNombreArchivoDatosExt1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getArchivoDatosExtDataProvider().getNombreArchivoDatosExt(rowKey);
        return JSF.getUrlNombreArchivo(nombre);
    }

    public String getScriptCampoNombreArchivoDatosExt1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getArchivoDatosExtDataProvider().getNombreArchivoDatosExt(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivoDatosExt1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivoDatosExt1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivoDatosExt3Rendered() {
        return true;
    }

    public String getTextCampoNombreArchivoDatos1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getArchivoDatosExtDataProvider().getNombreArchivoDatos(rowKey);
        return JSF.getExtensionNombreArchivo(nombre);
    }

    public String getToolTipCampoNombreArchivoDatos1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getArchivoDatosExtDataProvider().getNombreArchivoDatos(rowKey);
        return JSF.getUrlNombreArchivo(nombre);
    }

    public String getScriptCampoNombreArchivoDatos1Boton3() {
        if (bean == null) {
            return null;
        }
        if (bean.getGestor().isFilaNoDisponible()) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String nombre = bean.getArchivoDatosExtDataProvider().getNombreArchivoDatos(rowKey);
        return JSF.getScriptAbrirVentanaArchivo(nombre);
    }

    public boolean isCampoNombreArchivoDatos1Boton3Rendered() {
        return bean == null ? true : this.getTextCampoNombreArchivoDatos1Boton3() != null;
    }

    public boolean isTableColumnNombreArchivoDatos3Rendered() {
        return true;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idProveedorDatExt">
    private GestorBusquedaReferencia gestorBusquedaIdProveedorDatExt = null;

    private boolean funcionSelectEjecutableIdProveedorDatExt = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdProveedorDatExt() {
        if (this.gestorBusquedaIdProveedorDatExt == null) {
            this.gestorBusquedaIdProveedorDatExt = new GestorBusquedaReferencia(
                    bean.getArchivoDatosExtDataProvider(),
                    bean.getProveedorDatExtReferenceDataProvider(),
                    ArchivoDatosExtCachedRowSetDataProvider2.COLUMNA_ID_PROVEEDOR_DAT_EXT,
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
            return STP.getString(bean.getArchivoDatosExtDataProvider().getIdProveedorDatExt(rowKey));
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
            return STP.getString(bean.getArchivoDatosExtDataProvider().getIdProveedorDatExt(rowKey));
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
        Long id = bean.getArchivoDatosExtDataProvider().getIdProveedorDatExt(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdProveedorDatExt1Boton2Rendered() {
        return bean == null ? true : bean.getProveedorDatExtReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdProveedorDatExt1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdProveedorDatExt1Boton2Rendered();
    }

    public boolean isCampoIdProveedorDatExt1Panel2Rendered() {
        return isCampoIdProveedorDatExt1Boton2Rendered();
    }

    public boolean isTableColumnIdProveedorDatExt3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdProveedorDatExt1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuarioUltimaCarga">
    private GestorBusquedaReferencia gestorBusquedaIdUsuarioUltimaCarga = null;

    private boolean funcionSelectEjecutableIdUsuarioUltimaCarga = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuarioUltimaCarga() {
        if (this.gestorBusquedaIdUsuarioUltimaCarga == null) {
            this.gestorBusquedaIdUsuarioUltimaCarga = new GestorBusquedaReferencia(
                    bean.getArchivoDatosExtDataProvider(),
                    bean.getUsuarioReferenceDataProvider(),
                    ArchivoDatosExtCachedRowSetDataProvider2.COLUMNA_ID_USUARIO_ULTIMA_CARGA,
                    this.funcionSelectEjecutableIdUsuarioUltimaCarga);
        }
        return this.gestorBusquedaIdUsuarioUltimaCarga;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuarioUltimaCarga() {
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

    public void campoIdUsuarioUltimaCarga1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioUltimaCarga().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioUltimaCarga());
        this.getGestorBusquedaIdUsuarioUltimaCarga().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUsuarioUltimaCarga1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getArchivoDatosExtDataProvider().getIdUsuarioUltimaCarga(rowKey));
        }
        this.getGestorBusquedaIdUsuarioUltimaCarga().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioUltimaCarga());
        return this.getGestorBusquedaIdUsuarioUltimaCarga().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUsuarioUltimaCarga1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioUltimaCarga().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUsuarioUltimaCarga1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getArchivoDatosExtDataProvider().getIdUsuarioUltimaCarga(rowKey));
        }
        this.getGestorBusquedaIdUsuarioUltimaCarga().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioUltimaCarga());
        return this.getGestorBusquedaIdUsuarioUltimaCarga().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuarioUltimaCarga1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuarioUltimaCarga1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuarioUltimaCarga());
    }

    public String getScriptCampoIdUsuarioUltimaCarga1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_USUARIO;
        Long id = bean.getArchivoDatosExtDataProvider().getIdUsuarioUltimaCarga(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUsuarioUltimaCarga1Boton2Rendered() {
        return bean == null ? true : bean.getUsuarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuarioUltimaCarga1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuarioUltimaCarga1Boton2Rendered();
    }

    public boolean isCampoIdUsuarioUltimaCarga1Panel2Rendered() {
        return isCampoIdUsuarioUltimaCarga1Boton2Rendered();
    }

    public boolean isTableColumnIdUsuarioUltimaCarga3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuarioUltimaCarga1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuarioUltimaImportacion">
    private GestorBusquedaReferencia gestorBusquedaIdUsuarioUltimaImportacion = null;

    private boolean funcionSelectEjecutableIdUsuarioUltimaImportacion = true;

    protected GestorBusquedaReferencia getGestorBusquedaIdUsuarioUltimaImportacion() {
        if (this.gestorBusquedaIdUsuarioUltimaImportacion == null) {
            this.gestorBusquedaIdUsuarioUltimaImportacion = new GestorBusquedaReferencia(
                    bean.getArchivoDatosExtDataProvider(),
                    bean.getUsuarioReferenceDataProvider(),
                    ArchivoDatosExtCachedRowSetDataProvider2.COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION,
                    this.funcionSelectEjecutableIdUsuarioUltimaImportacion);
        }
        return this.gestorBusquedaIdUsuarioUltimaImportacion;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuarioUltimaImportacion() {
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

    public void campoIdUsuarioUltimaImportacion1_validate(FacesContext context, UIComponent component, Object value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioUltimaImportacion().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioUltimaImportacion());
        this.getGestorBusquedaIdUsuarioUltimaImportacion().validarCodigoRecursoReferenciado(context, component, value, rowKey, false);
    }

    public String getTextoCampoIdUsuarioUltimaImportacion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getArchivoDatosExtDataProvider().getIdUsuarioUltimaImportacion(rowKey));
        }
        this.getGestorBusquedaIdUsuarioUltimaImportacion().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioUltimaImportacion());
        return this.getGestorBusquedaIdUsuarioUltimaImportacion().getCodigoRecursoReferenciado(rowKey);
    }

    public void setTextoCampoIdUsuarioUltimaImportacion1(String value) {
        if (bean == null) {
            return;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaIdUsuarioUltimaImportacion().setCodigoRecursoReferenciado(rowKey, value);
    }

    public String getToolTipCampoIdUsuarioUltimaImportacion1() {
        if (bean == null) {
            return "abc";
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getGestor().isFilaNoProcesada()) {
            return STP.getString(bean.getArchivoDatosExtDataProvider().getIdUsuarioUltimaImportacion(rowKey));
        }
        this.getGestorBusquedaIdUsuarioUltimaImportacion().setFiltroBusqueda(this.getFiltroBusquedaIdUsuarioUltimaImportacion());
        return this.getGestorBusquedaIdUsuarioUltimaImportacion().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptCampoIdUsuarioUltimaImportacion1Boton1() {
        if (bean == null) {
            return null;
        }
        long funcion = UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
        String campo = bean.getCampoIdUsuarioUltimaImportacion1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuarioUltimaImportacion());
    }

    public String getScriptCampoIdUsuarioUltimaImportacion1Boton2() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        String urx = URX2.DETALLE_USUARIO;
        Long id = bean.getArchivoDatosExtDataProvider().getIdUsuarioUltimaImportacion(rowKey);
        return bean.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    public boolean isCampoIdUsuarioUltimaImportacion1Boton2Rendered() {
        return bean == null ? true : bean.getUsuarioReferenceDataProvider().isRecursoNombrable();
    }

    public boolean isCampoIdUsuarioUltimaImportacion1Boton3Rendered() {
        return bean == null ? true : !this.isCampoIdUsuarioUltimaImportacion1Boton2Rendered();
    }

    public boolean isCampoIdUsuarioUltimaImportacion1Panel2Rendered() {
        return isCampoIdUsuarioUltimaImportacion1Boton2Rendered();
    }

    public boolean isTableColumnIdUsuarioUltimaImportacion3Rendered() {
        return bean == null ? true : bean.getGestor().isFuncionCheckChangesHabilitada() || this.isCampoIdUsuarioUltimaImportacion1Boton3Rendered();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroTipoArcDatExt1() {
        return JSF.getListaOpciones(EnumTipoArcDatExt.values(), true, false);
    }

    public Object getOpcionesListaEsArchivoDatosExtImportado1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isNullNumeroTipoArcDatExt() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value == null;
    }

    public boolean isNotNullNumeroTipoArcDatExt() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null;
    }

    public boolean isNumeroTipoArcDatExtIdentificaciones() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.IDENTIFICACIONES.intValue());
    }

    public boolean isNumeroTipoArcDatExtPotencialesBeneficiarios() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.POTENCIALES_BENEFICIARIOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtEmpleados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.EMPLEADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtJubilados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.JUBILADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtDeudores() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.DEUDORES.intValue());
    }

    public boolean isNumeroTipoArcDatExtPenasJudicialesPendientes() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.PENAS_JUDICIALES_PENDIENTES.intValue());
    }

    public boolean isNumeroTipoArcDatExtPensionados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.PENSIONADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtSubsidiados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.SUBSIDIADOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtFallecidos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.FALLECIDOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtPresuntosFallecidos() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.PRESUNTOS_FALLECIDOS.intValue());
    }

    public boolean isNumeroTipoArcDatExtFichaHogar() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.FICHA_HOGAR.intValue());
    }

    public boolean isNumeroTipoArcDatExtFichaPersona() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.FICHA_PERSONA.intValue());
    }

    public boolean isNumeroTipoArcDatExtCensosValidados() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getNumeroTipoArcDatExt(rowKey);
        return value != null && value.equals(EnumTipoArcDatExt.CENSOS_VALIDADOS.intValue());
    }

   public boolean isEsArchivoDatosExtImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getEsArchivoDatosExtImportado(rowKey);
        return BitUtils.valueOf(value);
    }

    public boolean isNoEsArchivoDatosExtImportado() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        Integer value = bean.getArchivoDatosExtDataProvider().getEsArchivoDatosExtImportado(rowKey);
        return !BitUtils.valueOf(value);
    }

    public boolean isGridIdArchivoDatosExtRendered() {
        return true;
    }

    public boolean isGridCodigoArchivoDatosExtRendered() {
        return true;
    }

    public boolean isGridNombreArchivoDatosExtRendered() {
        return true;
    }

    public boolean isGridIdProveedorDatExtRendered() {
        return true;
    }

    public boolean isGridNumeroTipoArcDatExtRendered() {
        return true;
    }

    public boolean isGridEsArchivoDatosExtImportadoRendered() {
        return true;
    }

    public boolean isGridFechaHoraUltimaCargaRendered() {
        return true;
    }

    public boolean isGridIdUsuarioUltimaCargaRendered() {
        return true;
    }

    public boolean isGridNombreArchivoDatosRendered() {
        return true;
    }

    public boolean isGridNombreOriginalArchivoDatosRendered() {
        return true;
    }

    public boolean isGridFechaHoraUltimaImportacionRendered() {
        return true;
    }

    public boolean isGridIdUsuarioUltimaImportacionRendered() {
        return true;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    private ArchivoDatosExtBusinessProcessLocal getArchivoDatosExtBusinessProcess() {
        return (ArchivoDatosExtBusinessProcessLocal) bean.getArchivoDatosExtBusinessProcess();
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
