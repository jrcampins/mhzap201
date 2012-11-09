/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.aplicacion.web;

import com.egt.base.constants.CPP;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.aplicacion.Mensaje;
import com.egt.base.constants.URX2;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.enums.EnumOpcionAbrirVentana;
import com.egt.core.enums.EnumSeveridadMensaje;
import com.egt.core.jsf.JSF;
import com.egt.core.util.JS;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.model.Option;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.faces.application.FacesMessage;
import org.apache.commons.lang.StringUtils;

public class GestorPaginaBasica {

    public GestorPaginaBasica() {
        this.designing = true;
        this.paginaAbstracta = null;
        this.i18n = GestorPaginaBasicaI18N.getInstance();
    }

    public GestorPaginaBasica(PaginaAbstracta paginaAbstracta) {
        this.designing = false;
        this.paginaAbstracta = paginaAbstracta;
        this.i18n = GestorPaginaBasicaI18N.getInstance();
        this.getPaginaBasica().getContextoPeticion(); /* inicia contexto petición */
    }

    protected boolean designing;

    public boolean isDesigning() {
        return designing;
    }

    protected String getDesignTimeString(String metodo) {
        return metodo + " @ " + this.getClass().getSimpleName();
    }

    private GestorPaginaBasicaI18N i18n;

    public GestorPaginaBasicaI18N getI18n() {
        return i18n;
    }

    protected boolean paginaAutorizada;

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar de la pagina basica">
    /**
     * Conserva el valor de la propiedad paginaAbstracta.
     */
    private PaginaAbstracta paginaAbstracta;

    /**
     * Getter para propiedad paginaAbstracta.
     * @return Valor de la propiedad paginaAbstracta.
     */
    protected PaginaAbstracta getPaginaAbstracta() {
        return this.paginaAbstracta;
    }

    /**
     * Getter para propiedad paginaBasica.
     * @return Valor de la propiedad paginaBasica.
     */
    protected PaginaBasica getPaginaBasica() {
        return this.getPaginaAbstracta() instanceof PaginaBasica ? (PaginaBasica) this.paginaAbstracta : null;
    }

    /**
     * Getter para propiedad paginaBasicaConAccionMultiple.
     * @return Valor de la propiedad paginaBasicaConAccionMultiple.
     */
    protected PaginaBasicaConAccionMultiple getPaginaBasicaConAccionMultiple() {
        return this.getPaginaAbstracta() instanceof PaginaBasicaConAccionMultiple
                ? (PaginaBasicaConAccionMultiple) this.getPaginaAbstracta()
                : null;
    }

    protected boolean isPaginaBasicaConAccionMultiple() {
        return this.getPaginaAbstracta() instanceof PaginaBasicaConAccionMultiple;
    }

    protected String getClavePagina() {
        return designing ? null : this.getPaginaAbstracta().getClass().getName();
    }

    public boolean isMensajeDisponible() {
        if (designing) {
            return true;
        }
        return StringUtils.isNotBlank(this.getMensaje());
    }

    public boolean isMensajeNoDisponible() {
        return !this.isMensajeDisponible();
    }

    /**
     * Getter para propiedad identificacionFuncionAccionPagina.
     * @return Valor de la propiedad identificacionFuncionAccionPagina.
     */
    public Long getValorListaFuncionAccion1() {
        if (designing) {
            return null;
        }
        return this.getPaginaBasica().getContextoSesion().getIdentificacionFuncionAccionPagina(this.getClavePagina());
    }

    /**
     * Setter para propiedad identificacionFuncionAccionPagina.
     * @param funcion Nuevo valor de la propiedad identificacionFuncionAccionPagina.
     */
    public void setValorListaFuncionAccion1(Long valor) {
        this.getPaginaBasica().getContextoSesion().setIdentificacionFuncionAccionPagina(this.getClavePagina(), valor);
    }

    /**
     * Conserva el valor de la propiedad urlAnclaPie1.
     */
    private String urlAnclaPie1;

    /**
     * Getter para propiedad urlAnclaPie1.
     * @return Valor de la propiedad urlAnclaPie1.
     */
    public String getUrlAnclaPie1() {
        if (designing) {
            return null;
        }
//      return this.urlAnclaPie1 == null ? this.getPaginaJSP() + Global.PREFIJO_ENLACE_URL_HTTP + "anclaPie1" : JSF.encodeURX(this.urlAnclaPie1);
        return JSF.encodeURX(this.urlAnclaPie1);
    }

    /**
     * Setter para propiedad urlAnclaPie1.
     * @param urlAnclaPie1 Nuevo valor de la propiedad urlAnclaPie1.
     */
    public void setUrlAnclaPie1(String urlAnclaPie1) {
        this.urlAnclaPie1 = urlAnclaPie1;
    }

    /**
     * Conserva el valor de la propiedad mensaje.
     */
    private String mensaje;

    /**
     * Getter para propiedad mensaje.
     * @return Valor de la propiedad mensaje.
     */
    public String getMensaje() {
        if (designing) {
            return this.getDesignTimeString("getMensaje");
        }
        return this.mensaje;
    }

    /**
     * Setter para propiedad mensaje.
     * @param mensaje Nuevo valor de la propiedad mensaje.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Conserva el valor de la propiedad severidad.
     */
    private EnumSeveridadMensaje severidad;

    /**
     * Getter para propiedad severidad.
     * @return Valor de la propiedad severidad.
     */
    public EnumSeveridadMensaje getSeveridad() {
        return this.severidad;
    }

    /**
     * Setter para propiedad severidad.
     * @param severidad Nuevo valor de la propiedad severidad.
     */
    public void setSeveridad(EnumSeveridadMensaje severidad) {
        this.severidad = severidad;
    }

    /**
     * Conserva el valor de la propiedad paginaJSP.
     */
    private String paginaJSP;

    /**
     * Getter para propiedad paginaJSP.
     * @return Valor de la propiedad paginaJSP.
     */
    public String getPaginaJSP() {
        return this.paginaJSP;
    }

    /**
     * Setter para propiedad paginaJSP.
     * @param paginaJSP Nuevo valor de la propiedad paginaJSP.
     */
    public void setPaginaJSP(String paginaJSP) {
        this.paginaJSP = paginaJSP;
    }

    /**
     * Conserva el valor de la propiedad peticionProcesada.
     */
    private boolean peticionProcesada = false;

    /**
     * Getter para propiedad peticionProcesada.
     * @return Valor de la propiedad peticionProcesada.
     */
    public boolean isPeticionProcesada() {
        return this.peticionProcesada;
    }

    /**
     * Setter para propiedad peticionProcesada.
     * @param peticionProcesada Nuevo valor de la propiedad peticionProcesada.
     */
    public void setPeticionProcesada(boolean peticionProcesada) {
        this.peticionProcesada = peticionProcesada;
    }

    /**
     * Conserva el valor de la propiedad recursion.
     */
    private boolean recursion = false;

    /**
     * Getter para propiedad recursion.
     * @return Valor de la propiedad recursion.
     */
    public boolean isRecursion() {
        return this.recursion;
    }

    /**
     * Setter para propiedad recursion.
     * @param recursion Nuevo valor de la propiedad recursion.
     */
    public void setRecursion(boolean recursion) {
        this.recursion = recursion;
    }

    /**
     * Conserva el valor de la propiedad reinicio.
     */
    private boolean reinicio = false;

    /**
     * Getter para propiedad reinicio.
     * @return Valor de la propiedad reinicio.
     */
    public boolean isReinicio() {
        return this.reinicio;
    }

    /**
     * Setter para propiedad reinicio.
     * @param reinicio Nuevo valor de la propiedad reinicio.
     */
    public void setReinicio(boolean reinicio) {
        this.reinicio = reinicio;
    }

    /**
     * Conserva el valor de la propiedad restauracion.
     */
    private boolean restauracion = false;

    /**
     * Getter para propiedad restauracion.
     * @return Valor de la propiedad restauracion.
     */
    public boolean isRestauracion() {
        return this.restauracion;
    }

    /**
     * Setter para propiedad restauracion.
     * @param restauracion Nuevo valor de la propiedad restauracion.
     */
    public void setRestauracion(boolean restauracion) {
        this.restauracion = restauracion;
    }

    /**
     * Conserva el valor de la propiedad retorno.
     */
    private boolean retorno = false;

    /**
     * Getter para propiedad retorno.
     * @return Valor de la propiedad retorno.
     */
    public boolean isRetorno() {
        return this.retorno;
    }

    /**
     * Setter para propiedad retorno.
     * @param retorno Nuevo valor de la propiedad retorno.
     */
    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    /**
     * Conserva el valor de la propiedad retruque.
     */
    private boolean retruque = false;

    /**
     * Getter para propiedad retruque.
     * @return Valor de la propiedad retruque.
     */
    public boolean isRetruque() {
        return this.retruque;
    }

    /**
     * Setter para propiedad retruque.
     * @param retruque Nuevo valor de la propiedad retruque.
     */
    public void setRetruque(boolean retruque) {
        this.retruque = retruque;
    }

    /**
     * Conserva el valor de la propiedad focus.
     */
    private String focus;

    /**
     * Getter para propiedad focus.
     * @return Valor de la propiedad focus.
     */
    public String getFocus() {
        return designing ? null : focus;
    }

    /**
     * Setter para propiedad focus.
     * @param focus Nuevo valor de la propiedad focus.
     */
    public void setFocus(String focus) {
        this.focus = focus;
    }

    /**
     * Conserva el valor de la propiedad preserveFocus.
     */
    private boolean preserveFocus = false;

    /**
     * Getter para propiedad preserveFocus.
     * @return Valor de la propiedad preserveFocus.
     */
    public boolean isPreserveFocus() {
        return this.preserveFocus;
    }

    /**
     * Setter para propiedad preserveFocus.
     * @param preserveFocus Nuevo valor de la propiedad preserveFocus.
     */
    public void setPreserveFocus(boolean preserveFocus) {
        this.preserveFocus = preserveFocus;
    }

    /**
     * Conserva el valor de la propiedad preserveScroll.
     */
    private boolean preserveScroll = false;

    /**
     * Getter para propiedad preserveScroll.
     * @return Valor de la propiedad preserveScroll.
     */
    public boolean isPreserveScroll() {
        return this.preserveScroll;
    }

    /**
     * Setter para propiedad preserveScroll.
     * @param preserveScroll Nuevo valor de la propiedad preserveScroll.
     */
    public void setPreserveScroll(boolean preserveScroll) {
        this.preserveScroll = preserveScroll;
    }

    private boolean botonesAccionSinImagen = true;

    /**
     * Getter para propiedad botonesAccionSinImagen.
     * @return Valor de la propiedad botonesAccionSinImagen.
     */
    public boolean isBotonesAccionSinImagen() {
        return this.botonesAccionSinImagen;
    }

    protected String getToolTipHipervinculoMigasPan() {
        return designing ? null : this.getPaginaBasica().getEtiquetaMigasPan();
    }

    protected String getMensajePeticionPorOmision() {
        return null;
    }

// </editor-fold>
/**/
    public void preiniciar() {
        this.track("preiniciar");
        this.getPaginaBasica().getContextoPeticion().setPaginaActual((AbstractPageBean) this.getPaginaBasica());
        this.getPaginaBasica().getContextoPeticion().setGestorActual(this);
        this.paginaAutorizada = this.getPaginaBasica().isPostBack();
        if (this.paginaAutorizada) {
        } else {
            this.autorizar();
            if (this.paginaAutorizada) {
            } else {
                this.redireccionar();
            }
        }
    }

    protected void autorizar() {
        this.track("autorizar");
        Long funcion = null;
        if (this.isPaginaBasicaConAccionMultiple()) {
            for (Option option : this.getPaginaBasicaConAccionMultiple().getOpcionesListaFuncionAccion()) {
                if (option.getValue() instanceof Long) {
                    funcion = (Long) option.getValue();
                    this.paginaAutorizada = TLC.getControlador().esFuncionAutorizada(funcion);
                    if (this.paginaAutorizada) {
                        break;
                    }
                }
            }
        }
        if (funcion == null) {
            this.paginaAutorizada = true;
        }
    }

    private void redireccionar() {
        this.track("redireccionar");
        try {
            JSF.redirect(URX2.REJECT);
        } catch (IOException ex) {
            TLC.getBitacora().error(ex);
        }
    }

    public void iniciar() {
        this.track("iniciar");
        this.setPeticionProcesada(false);
        this.setSeveridad(EnumSeveridadMensaje.INFORMATIVO);
        this.setRecursion(BitUtils.valueOf(JSF.getRequestParameter(Global.PARAMETRO_RECURSION)));
        this.setReinicio(this.getPaginaBasica().getContextoPeticion().getCondicionSesion() != null);
        this.setRestauracion(BitUtils.valueOf(this.getPaginaBasica().getContextoPeticion().getCondicionSesion()));
        this.setRetorno(StringUtils.isNotBlank(JSF.getRequestParameter(Global.PARAMETRO_RETRUCAR)));
        this.setFocus(null);
        String requestSP = this.getPaginaBasica().getFacesContext().getExternalContext().getRequestServletPath();
        String urlOrigen = requestSP + this.getPaginaBasica().getFacesContext().getExternalContext().getRequestPathInfo();
        String urlActual = requestSP + "/" + this.getPaginaBasica().getClass().getSimpleName() + "." + "jsp";
        this.setRetruque(this.getPaginaBasica().isPostBack() || (urlActual.equals(urlOrigen) && !this.isReinicio()));
        this.setPaginaJSP(urlActual);
//      this.trace();
        this.updateMigasSesion();
    }

    private void trace() {
        this.track("trace@GestorPaginaBasica");
        this.trace("isRecursion=" + this.isRecursion());
        this.trace("isReinicio=" + this.isReinicio());
        this.trace("isRestauracion=" + this.isRestauracion());
        this.trace("isRetorno=" + this.isRetorno());
        this.trace("isRetruque=" + this.isRetruque());
        this.trace("urlOrigen=" + this.getPaginaBasica().getFacesContext().getExternalContext().getRequestPathInfo());
        this.trace("urlActual=" + "/" + this.getPaginaBasica().getClass().getSimpleName() + "." + "jsp");
    }

    public void preprocesar() { /* no se ejecuta si al apenas abrir la pagina se hace click en un link con url */
        this.track("preprocesar");
        this.setPeticionProcesada(true);
    }

    public void prepresentar() {
        this.track("prepresentar");
        this.posprepresentar();
    }

    protected void posprepresentar() {
        String clientId = JSF.getFirstClientIdWithMessages();
        if (clientId != null) {
            this.setFocus(clientId);
            JSF.fixFacesMessages();
        }
        this.setMensajePeticion();
        this.setPropiedadesPresentacionPagina();
        this.tell();
        if (this.isRetorno() || !this.isPeticionProcesada()) {
            this.descartarFormulariosVirtuales();
        }
    }

    protected void setPropiedadesPresentacionPagina() {
        this.updateMigasPagina();
    }

    protected void removerHipervinculo(boolean remover) {
        if (remover) {
            Breadcrumbs migasSesion = this.getPaginaBasica().getContextoSesion().getMigas();
            JSF.removeHipervinculo(migasSesion, this.getPaginaJSP());
        }
    }

    protected void updateMigasSesion() {
        Breadcrumbs migasSesion = this.getPaginaBasica().getContextoSesion().getMigas();
        String text = this.getPaginaBasica().getEtiquetaMigasPan();
        String toolTip = this.getToolTipHipervinculoMigasPan();
//      String url = this.getPaginaJSP();
        String url = this.getBreadcrumbsHyperlinkUrl();
        JSF.updateHipervinculo(migasSesion, text, toolTip, url);
    }

    protected void updateMigasPagina() {
        Breadcrumbs migasSesion = this.getPaginaBasica().getContextoSesion().getMigas();
        Breadcrumbs migasPagina = this.getPaginaBasica().getBreadcrumbs1();
        String text = this.getPaginaBasica().getEtiquetaMigasPan();
        String toolTip = this.getToolTipHipervinculoMigasPan();
//      String url = this.getPaginaJSP();
        String url = this.getBreadcrumbsHyperlinkUrl();
        JSF.addHipervinculo(migasSesion, text, toolTip, url, this.isReinicio() && !this.isRecursion());
        JSF.addHipervinculos(migasSesion, migasPagina);
    }

    private String getBreadcrumbsHyperlinkUrl() {
        String url = null;
        String jsp = this.getPaginaJSP();
        if (StringUtils.isNotBlank(jsp)) {
            url = jsp;
            String opcion = this.getPaginaBasica().getContextoSesion().getOpcionCampoRetorno();
            if (StringUtils.isNotBlank(opcion)) {
                String campo = this.getPaginaBasica().getContextoSesion().getCampoAccionRetorno();
                String boton = this.getPaginaBasica().getContextoSesion().getBotonAccionRetorno();
                url += "?" + CPP.ID_OPCION_CAMPO_RETORNO + "=" + opcion;
                if (StringUtils.isNotBlank(campo)) {
                    url += "&" + CPP.ID_CAMPO_ACCION_RETORNO + "=" + campo;
                }
                if (StringUtils.isNotBlank(boton)) {
                    url += "&" + CPP.ID_BOTON_ACCION_RETORNO + "=" + boton;
                }
            }
        }
        return url;
    }

    public Object getIdentificacionOpcionSeleccionada(DropDown lista) {
        Option opcion = JSF.getOpcion(lista);
        if (opcion != null) {
            Object objeto = opcion.getValue();
//          if (objeto != null && objeto instanceof Integer) {
//              return (Integer) objeto;
//          }
//          if (objeto != null && objeto instanceof Long) {
//              return (Long) objeto;
//          }
            return objeto;
        }
        return null;
    }

    public String getEtiquetaOpcionSeleccionada(DropDown lista) {
        Option opcion = JSF.getOpcion(lista);
        return opcion == null ? null : opcion.getLabel();
    }

    public String getDescripcionOpcionSeleccionada(DropDown lista) {
        Option opcion = JSF.getOpcion(lista);
        return opcion == null ? null : opcion.getDescription();
    }

    public Option getOpcionListaDesplegable(Object valor, DropDown lista) {
        return JSF.getOpcion(valor, lista.getItems());
    }

    private static Calendar calendar = Calendar.getInstance();

    public Date getDefaultMinDate() {
        calendar.clear();
//      calendar.setTime(this.getCurrentDate());
//      calendar.add(Calendar.YEAR, -1);
        calendar.set(1900, 0, 1, 0, 0, 0);
        return calendar.getTime();
    }

    public Date getDefaultMaxDate() {
        calendar.clear();
//      calendar.setTime(this.getCurrentDate());
//      calendar.add(Calendar.YEAR, 1);
        calendar.set(2100, 11, 31, 23, 59, 59);
        return calendar.getTime();
    }

    public Date getCurrentDate() {
        calendar.clear();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int y = calendar.get(Calendar.YEAR);
        int m = calendar.get(Calendar.MONTH);
        int d = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.clear();
        calendar.set(y, m, d);
        return calendar.getTime();
    }

    public String getWhiteLabel() {
        if (designing) {
            return "abc";
        }
        return " ";
    }

    public Option[] getOpcionesListaFuncionAccionAutorizadas(Option[] opciones) {
        ArrayList<Option> autorizadas = new ArrayList<Option>();
        for (Option option : opciones) {
            if (option.getValue() instanceof Long) {
                if (TLC.getControlador().esFuncionAutorizada((Long) option.getValue())) {
                    autorizadas.add(option);
                }
            } else {
                autorizadas.add(option);
            }
        }
        return (Option[]) autorizadas.toArray(new Option[0]);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para abrir archivos y/o paginas con el explorador">
    public void abrirArchivo(String file) {
        if (StringUtils.isBlank(file)) {
            return;
        }
        this.redirect(JSF.getFileURL(file));
    }

    public void abrirArchivo(String file, String folder) {
        if (StringUtils.isBlank(file) || StringUtils.isBlank(folder)) {
            return;
        }
        this.redirect(JSF.getFileURL(file, folder));
    }

    public void abrirURI(String uri) {
        if (StringUtils.isBlank(uri)) {
            return;
        }
        this.redirect(JSF.encodeURI(uri));
    }

    public void abrirURL(String url) {
        if (StringUtils.isBlank(url)) {
            return;
        }
        this.redirect(JSF.encodeURL(url));
    }

    public void abrirURX(String urx) {
        if (StringUtils.isBlank(urx)) {
            return;
        }
        this.redirect(JSF.encodeURX(urx));
    }

    public void redirect(String url) {
        if (StringUtils.isBlank(url)) {
            return;
        }
        try {
            JSF.redirect(url);
        } catch (Exception ex) {
            this.handle(ex);
        }
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el script de los botones de la pagina basica">
    public String getScriptAbrirVentanaBuscarCodigo(String urx, long funcion, String campo, String boton) {
        return TLC.getControlador().esFuncionAutorizada(funcion)
                ? this.getScriptAbrirVentanaBuscarCodigo(urx, campo, boton)
                : this.getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton);
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, long funcion, String campo, String boton, FiltroBusqueda filtro) {
        return TLC.getControlador().esFuncionAutorizada(funcion)
                ? this.getScriptAbrirVentanaBuscarCodigo(urx, campo, boton, filtro)
                : this.getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, filtro);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, long funcion, String campo, String boton) {
        return TLC.getControlador().esFuncionAutorizada(funcion)
                ? this.getScriptAbrirVentanaBuscarIdentificacion(urx, campo, boton)
                : this.getScriptAbrirVentanaBuscarIdentificacion(funcion, campo, boton);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, long funcion, String campo, String boton, FiltroBusqueda filtro) {
        return TLC.getControlador().esFuncionAutorizada(funcion)
                ? this.getScriptAbrirVentanaBuscarIdentificacion(urx, campo, boton, filtro)
                : this.getScriptAbrirVentanaBuscarIdentificacion(funcion, campo, boton, filtro);
    }

    public String getScriptAbrirVentanaBuscar(String urx, long funcion, String columna, String campo, String boton) {
        return TLC.getControlador().esFuncionAutorizada(funcion)
                ? this.getScriptAbrirVentanaBuscar(urx, columna, campo, boton)
                : this.getScriptAbrirVentanaBuscar(funcion, columna, campo, boton);
    }

    public String getScriptAbrirVentanaBuscar(String urx, long funcion, String columna, String campo, String boton, FiltroBusqueda filtro) {
        return TLC.getControlador().esFuncionAutorizada(funcion)
                ? this.getScriptAbrirVentanaBuscar(urx, columna, campo, boton, filtro)
                : this.getScriptAbrirVentanaBuscar(funcion, columna, campo, boton, filtro);
    }

    public String getScriptAbrirVentanaBuscarCodigo(long funcion, String campo) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, null, false);
    }

    public String getScriptAbrirVentanaBuscarCodigo(long funcion, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, false);
    }

    public String getScriptAbrirVentanaBuscarCodigo(long funcion, String campo, boolean arbol) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, null, arbol);
    }

    public String getScriptAbrirVentanaBuscarCodigo(long funcion, String campo, String boton, boolean arbol) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, arbol);
    }

    public String getScriptAbrirVentanaBuscarCodigo(long funcion, String campo, String boton, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, filtro);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(long funcion, String campo) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_ID, campo, null, false);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(long funcion, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, false);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(long funcion, String campo, boolean arbol) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_ID, campo, null, arbol);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(long funcion, String campo, String boton, boolean arbol) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, arbol);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(long funcion, String campo, String boton, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(funcion, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, filtro);
    }

    public String getScriptAbrirVentanaBuscar(long funcion, EnumOpcionAbrirVentana opcion, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(funcion, opcion, campo, boton, false);
    }

    public String getScriptAbrirVentanaBuscar(long funcion, EnumOpcionAbrirVentana opcion, String campo, String boton, boolean arbol) {
        String urx = arbol ? URX2.ARBOL_RECURSOS : URX2.LISTA_RECURSOS;
        return JSF.getOpenSearchWindowJavaScript(urx, opcion, campo, boton, this.getListaParametrosFuncion(funcion));
    }

    public String getScriptAbrirVentanaBuscar(long funcion, EnumOpcionAbrirVentana opcion, String campo, String boton, FiltroBusqueda filtro) {
        String urx = URX2.LISTA_RECURSOS;
        return JSF.getOpenSearchWindowJavaScript(urx, opcion, campo, boton, this.getListaParametrosFuncion(funcion, filtro));
    }

    public String getScriptAbrirVentanaBuscar(long funcion, String columna, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(funcion, columna, campo, boton, false);
    }

    public String getScriptAbrirVentanaBuscar(long funcion, String columna, String campo, String boton, boolean arbol) {
        String urx = arbol ? URX2.ARBOL_RECURSOS : URX2.LISTA_RECURSOS;
        return JSF.getOpenSearchWindowJavaScript(urx, columna, campo, boton, this.getListaParametrosFuncion(funcion));
    }

    public String getScriptAbrirVentanaBuscar(long funcion, String columna, String campo, String boton, FiltroBusqueda filtro) {
        String urx = URX2.LISTA_RECURSOS;
        return JSF.getOpenSearchWindowJavaScript(urx, columna, campo, boton, this.getListaParametrosFuncion(funcion, filtro));
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, String campo) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, null, null, null);
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, null, null);
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, String campo, String boton, Long maestro) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, maestro, null);
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, String campo, String boton, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, null, filtro);
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, String campo, String boton, Long maestro, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, maestro, filtro);
    }

    public String getScriptAbrirVentanaBuscarCodigo(String urx, String campo, String boton, ListaParametros rpl) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_CODIGO, campo, boton, rpl);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, String campo) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_ID, campo, null, null, null);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, null, null);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, String campo, String boton, Long maestro) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, maestro, null);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, String campo, String boton, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, null, filtro);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, String campo, String boton, Long maestro, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, maestro, filtro);
    }

    public String getScriptAbrirVentanaBuscarIdentificacion(String urx, String campo, String boton, ListaParametros rpl) {
        return this.getScriptAbrirVentanaBuscar(urx, EnumOpcionAbrirVentana.BUSCAR_ID, campo, boton, rpl);
    }

    public String getScriptAbrirVentanaBuscar(String urx, EnumOpcionAbrirVentana opcion, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(urx, opcion, campo, boton, null, null);
    }

    public String getScriptAbrirVentanaBuscar(String urx, EnumOpcionAbrirVentana opcion, String campo, String boton, Long maestro) {
        return this.getScriptAbrirVentanaBuscar(urx, opcion, campo, boton, maestro, null);
    }

    public String getScriptAbrirVentanaBuscar(String urx, EnumOpcionAbrirVentana opcion, String campo, String boton, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, opcion, campo, boton, null, filtro);
    }

    public String getScriptAbrirVentanaBuscar(String urx, EnumOpcionAbrirVentana opcion, String campo, String boton, Long maestro, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, opcion, campo, boton, this.getListaParametrosMaestro(maestro, filtro));
    }

    public String getScriptAbrirVentanaBuscar(String urx, EnumOpcionAbrirVentana opcion, String campo, String boton, ListaParametros rpl) {
        return JSF.getOpenSearchWindowJavaScript(urx, opcion, campo, boton, rpl);
    }

    public String getScriptAbrirVentanaBuscar(String urx, String columna, String campo, String boton) {
        return this.getScriptAbrirVentanaBuscar(urx, columna, campo, boton, null, null);
    }

    public String getScriptAbrirVentanaBuscar(String urx, String columna, String campo, String boton, Long maestro) {
        return this.getScriptAbrirVentanaBuscar(urx, columna, campo, boton, maestro, null);
    }

    public String getScriptAbrirVentanaBuscar(String urx, String columna, String campo, String boton, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, columna, campo, boton, null, filtro);
    }

    public String getScriptAbrirVentanaBuscar(String urx, String columna, String campo, String boton, Long maestro, FiltroBusqueda filtro) {
        return this.getScriptAbrirVentanaBuscar(urx, columna, campo, boton, this.getListaParametrosMaestro(maestro, filtro));
    }

    public String getScriptAbrirVentanaBuscar(String urx, String columna, String campo, String boton, ListaParametros rpl) {
        return JSF.getOpenSearchWindowJavaScript(urx, columna, campo, boton, rpl);
    }

    public String getScriptAbrirVentanaVerRastroInformes() {
        String urx = URX2.RASTRO_INFORME;
        return JSF.getOpenWindowJavaScript(urx, null);
    }

    public String getScriptAbrirVentanaVerRastroProcesos() {
        String urx = URX2.RASTRO_PROCESO;
        return JSF.getOpenWindowJavaScript(urx, null);
    }

    public String getScriptAbrirVentana(String urx, Long recurso) {
        return recurso == null ? null : JSF.getOpenWindowJavaScript(urx, this.getListaParametrosRecurso(recurso).toString());
    }

    public String getScriptAbrirVentanaVerDetalle(String urx, Long recurso) {
        return recurso == null ? null : JSF.getOpenDetailWindowJavaScript(urx, this.getListaParametrosRecurso(recurso).toString());
    }

    public String getScriptAbrirVinculo() {
        return null;
    }

    public String getScriptAbrirVentanaBuscarNoDisponible() {
        return JS.getAlertScript("funcion_buscar_recurso_no_disponible");
    }

    public String getScriptAbrirVentanaVerDetalleNoDisponible() {
        return JS.getAlertScript("funcion_ver_detalle_recurso_no_disponible");
    }

    private ListaParametros getListaParametrosFuncion(long funcion) {
        return this.getListaParametrosFuncion(funcion, null);
    }

    private ListaParametros getListaParametrosFuncion(long funcion, FiltroBusqueda filtro) {
        ListaParametros rpl = new ListaParametros();
        rpl.addParametro(CPP.ID_FUNCION_REFERENCIA, Long.valueOf(funcion));
        String criterios = filtro == null ? null : StringUtils.trimToNull(filtro.toString());
        if (criterios != null) {
            rpl.addParametro(filtro.getClass().getSimpleName(), criterios);
        }
        return rpl;
    }

    private ListaParametros getListaParametrosRecurso(Long recurso) {
        ListaParametros rpl = new ListaParametros();
        if (BitUtils.valueOf(recurso)) {
            rpl.addParametro(CPP.ID_RECURSO, recurso);
        }
        return rpl;
    }

    private ListaParametros getListaParametrosMaestro(Long maestro, FiltroBusqueda filtro) {
        boolean masterly = BitUtils.valueOf(maestro);
        String criterios = filtro == null ? null : StringUtils.trimToNull(filtro.toString());
        if (masterly || criterios != null) {
            ListaParametros rpl = new ListaParametros();
            if (masterly) {
                rpl.addParametro(CPP.ID_RECURSO_MAESTRO, maestro);
            }
            if (criterios != null) {
                rpl.addParametro(filtro.getClass().getSimpleName(), criterios);
            }
            return rpl;
        }
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el estilo de botones e hipervinculos">
    public String getEstiloBotonesAccion() {
        return this.isBotonesAccionSinImagen() ? "width: 64px" : null;
    }

    public String getEstiloHipervinculos() {
        return "margin-right: 8px";
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el url de la imagen botones e hipervinculos">
    public String getUrlImagenAbrirVinculo() {
        return "resources/open_link_enabled.gif";
    }

    public String getUrlImagenAbrirVinculoInhabilitado() {
        return "resources/open_link_disabled.gif";
    }

    public String getUrlImagenAbrirVinculoHabilitado() {
        return "resources/open_link_enabled.gif";
    }

    public String getUrlImagenAbrirVentanaBuscar() {
        return "resources/search.gif";
    }

    public String getUrlImagenEjecutarInforme() {
        return "resources/run_report.gif";
    }

    public String getUrlImagenEjecutarInformeInhabilitado() {
        return "resources/run_report_dimmed.gif";
    }

    public String getUrlImagenEjecutarProceso() {
        return "resources/run.gif";
    }

    public String getUrlImagenEjecutarProcesoInhabilitado() {
        return "resources/run_dimmed.gif";
    }

    public String getUrlImagenExportarArchivo() {
        return "resources/run_export.gif";
    }

    public String getUrlImagenExportarArchivoInhabilitado() {
        return "resources/run_export_dimmed.gif";
    }

    public String getUrlImagenEjecutarVinculo() {
        return "resources/run_link_enabled.gif";
    }

    public String getUrlImagenEjecutarVinculoInhabilitado() {
        return "resources/run_link_disabled.gif";
    }

    public String getUrlImagenEjecutarVinculoHabilitado() {
        return "resources/run_link_enabled.gif";
    }

    public String getUrlImagenSeveridadMensaje() {
        if (designing) {
            return "resources/info_medium.gif";
        }
        String imagen = "resources/go_dimmed.gif";
        if (this.getMensaje() != null) {
            switch (this.getSeveridad()) {
                case INFORMATIVO:
                    imagen = "resources/info_medium.gif";
                    break;
                case ADVERTENCIA:
                    imagen = "resources/warning_medium.gif";
                    break;
                case ERROR:
                    imagen = "resources/error_medium.gif";
                    break;
                case FATAL:
                    imagen = "resources/failed_medium.gif";
                    break;
                default:
                    imagen = "resources/unknown_medium.gif";
                    break;
            }
        }
        return imagen;
    }

    public boolean isUrlImagenSeveridadMensajeDisponible() {
        if (designing) {
            return true;
        }
        return StringUtils.isNotBlank(this.getUrlImagenSeveridadMensaje());
    }

    public boolean isUrlImagenSeveridadMensajeNoDisponible() {
        return !this.isUrlImagenSeveridadMensajeDisponible();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para descartar los formularios virtuales">
    public void descartarFormulariosVirtuales() {
        this.track("descartarFormulariosVirtuales");
        if (this.isRetruque()) {
            try {
                this.getPaginaBasica().getForm1().discardSubmittedValues("virtualForm1");
            } catch (Exception ex) {
//              this.handle(ex);
            }
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para establecer el mensaje por omision de la peticion">
    protected void setMensajePeticion() {
        this.track("setMensajePeticion");
        if (this.getPaginaBasica().getFacesContext().getMaximumSeverity() == null) {
            this.setMensaje(this.getMensajePeticionPorOmision());
            this.setSeveridad(EnumSeveridadMensaje.INFORMATIVO);
        } else {
            int mayor = this.getPaginaBasica().getFacesContext().getMaximumSeverity().getOrdinal();
            this.setSeveridad(EnumSeveridadMensaje.valueOf(mayor));
            boolean continuar = true;
            Iterator iterator = this.getPaginaBasica().getFacesContext().getMessages();
            while (continuar && iterator.hasNext()) {
                FacesMessage fm = (FacesMessage) iterator.next();
                if (fm != null && fm.getSeverity().getOrdinal() == mayor) {
                    this.setMensaje(fm.getSummary());
                //  continuar = false;
                }
            }
        }
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de errores (track, trace, handle, show, ...)">
    public void track(String metodo) {
        if (!designing) {
            Bitacora.trace(this.getPaginaBasica().getClass(), this.getClass().getSimpleName() + "_" + metodo);
        }
    }

    public void track(String metodo, Object arg0) {
        if (!designing) {
            Bitacora.trace(this.getPaginaBasica().getClass(), this.getClass().getSimpleName() + "_" + metodo,
                    arg0);
        }
    }

    public void track(String metodo, Object arg0, Object arg1) {
        if (!designing) {
            Bitacora.trace(this.getPaginaBasica().getClass(), this.getClass().getSimpleName() + "_" + metodo,
                    arg0, arg1);
        }
    }

    public void track(String metodo, Object arg0, Object arg1, Object arg2) {
        if (!designing) {
            Bitacora.trace(this.getPaginaBasica().getClass(), this.getClass().getSimpleName() + "_" + metodo,
                    arg0, arg1, arg2);
        }
    }

    public void track(String metodo, Object arg0, Object arg1, Object arg2, Object arg3) {
        if (!designing) {
            Bitacora.trace(this.getPaginaBasica().getClass(), this.getClass().getSimpleName() + "_" + metodo,
                    arg0, arg1, arg2, arg3);
        }
    }

    public void trace(String mensaje) {
        if (!designing) {
            this.trace(mensaje, null, null, null, null);
        }
    }

    public void trace(String mensaje, Object arg0) {
        if (!designing) {
            this.trace(mensaje, arg0, null, null, null);
        }
    }

    public void trace(String mensaje, Object arg0, Object arg1) {
        if (!designing) {
            this.trace(mensaje, arg0, arg1, null, null);
        }
    }

    public void trace(String mensaje, Object arg0, Object arg1, Object arg2) {
        if (!designing) {
            this.trace(mensaje, arg0, arg1, arg2, null);
        }
    }

    public void trace(String mensaje, Object arg0, Object arg1, Object arg2, Object arg3) {
        if (!designing) {
            Bitacora.trace(mensaje, arg0, arg1, arg2, arg3);
        }
    }

    public void tell() {
        Mensaje m;
        int s;
        int menor = TLC.getBitacora().getSeveridadMinima().intValue();
        int mayor = this.getMensaje() == null ? menor - 1 : this.getSeveridad().intValue();
        boolean b = true;
        Iterator iterator = TLC.getBitacora().iterator();
        while (iterator.hasNext()) {
            m = (Mensaje) iterator.next();
            if (m != null) {
                s = m.getSeveridad().intValue();
                if (s >= menor) {
                    if (mayor < s || (mayor == s && b)) {
                        mayor = s;
                        b = false;
                        this.setMensaje(m.toString());
                        this.setSeveridad(m.getSeveridad());
                    }
                    switch (m.getSeveridad()) {
                        case INFORMATIVO:
                            this.getPaginaBasica().info(m.toString());
                            break;
                        case ADVERTENCIA:
                            this.getPaginaBasica().warn(m.toString());
                            break;
                        case ERROR:
                            this.getPaginaBasica().error(m.toString());
                            break;
                        case FATAL:
                            this.getPaginaBasica().fatal(m.toString());
                            break;
                        default:
                            this.getPaginaBasica().info(m.toString());
                            break;
                    }
                }
            }
        }
        TLC.getBitacora().clear();
    }

    public void handle(Exception ex) {
        String string = ThrowableUtils.getString(ex);
        if (TLC.getBitacora().contiene(string)) {
            this.tell();
        } else {
            this.tell();
            this.getPaginaBasica().fatal(string);
            this.getPaginaBasica().log(string, ex);
        }
    }
    // </editor-fold>
}
