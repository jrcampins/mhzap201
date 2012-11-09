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
package com.egt.web;

import com.egt.base.constants.URX2;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.Mensaje;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.Global;
import com.egt.core.enums.EnumSeveridadMensaje;
import com.egt.core.jsf.JSF;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.Script;
import com.sun.webui.jsf.component.StaticText;
import java.util.Iterator;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;

/**
 * <p>Page bean that corresponds to a similarly named JSP page. This class contains component definitions (and
 * initialization code) for all components that you have defined on this page, as well as lifecycle methods
 * and event handlers where you may add behavior to respond to incoming events.</p>
 */
public class Inicio extends AbstractPageBean {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong> This method is
     * automatically generated, so any user-specified code inserted here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private Page page1 = new Page();

    public Page getPage1() {
        return page1;
    }

    public void setPage1(Page p) {
        this.page1 = p;
    }

    private Html html1 = new Html();

    public Html getHtml1() {
        return html1;
    }

    public void setHtml1(Html h) {
        this.html1 = h;
    }

    private Head head1 = new Head();

    public Head getHead1() {
        return head1;
    }

    public void setHead1(Head h) {
        this.head1 = h;
    }

    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link l) {
        this.link1 = l;
    }

    private Body body1 = new Body();

    public Body getBody1() {
        return body1;
    }

    public void setBody1(Body b) {
        this.body1 = b;
    }

    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }

    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }

    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }

    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }

    private ImageComponent image2 = new ImageComponent();

    public ImageComponent getImage2() {
        return image2;
    }

    public void setImage2(ImageComponent ic) {
        this.image2 = ic;
    }

    private ImageComponent image1 = new ImageComponent();

    public ImageComponent getImage1() {
        return image1;
    }

    public void setImage1(ImageComponent ic) {
        this.image1 = ic;
    }

    private HtmlPanelGrid gridPanel2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel2() {
        return gridPanel2;
    }

    public void setGridPanel2(HtmlPanelGrid hpg) {
        this.gridPanel2 = hpg;
    }

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }

    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
    }

    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }

    private HtmlPanelGrid gridPanel4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel4() {
        return gridPanel4;
    }

    public void setGridPanel4(HtmlPanelGrid hpg) {
        this.gridPanel4 = hpg;
    }

    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {
        return staticText4;
    }

    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }

    private ImageComponent image3 = new ImageComponent();

    public ImageComponent getImage3() {
        return image3;
    }

    public void setImage3(ImageComponent ic) {
        this.image3 = ic;
    }

    private Script script1 = new Script();

    public Script getScript1() {
        return script1;
    }

    public void setScript1(Script s) {
        this.script1 = s;
    }

    private HtmlPanelGrid gridPanel5 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel5() {
        return gridPanel5;
    }

    public void setGridPanel5(HtmlPanelGrid hpg) {
        this.gridPanel5 = hpg;
    }
    // </editor-fold>

    /**
     * <p>Construir una instancia de bean de pagina.</p>
     */
    public Inicio() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se navega hasta esta pagina, ya sea
     * directamente mediante un URL o de manera indirecta a traves de la navegacion de paginas. Puede
     * personalizar este metodo para adquirir recursos que se necesitaran para los controladores de eventos y
     * metodos del proceso, sin tener en cuenta si esta pagina realiza procesamiento de devolucion de
     * envios.</p>
     *
     * <p>Tenga en cuenta que si la peticion actual es una devolucion de envio, los valores de propiedad de
     * los componentes <strong>no</strong> representan ningun valor enviado con esta peticion. En su lugar,
     * representan los valores de propiedades que se guardaron para esta vista cuando se proceso.</p>
     */
    @Override
    @PostConstruct
    public void init() {
        // Realizar iniciaciones heredadas de la superclase
        super.init();
        // Realizar iniciaciones que deben finalizar **antes** de que se inicien los componentes administrados
        this.preiniciar();
        // <editor-fold defaultstate="collapsed" desc="Inicio de componentes administrados por el programa">
        // Iniciar componentes administrados automaticamente
        // *Nota* - esta logica NO debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Realizar iniciaciones que deben finalizar *despues* de que se inicien los componentes administrados
        this.iniciar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando el arbol de componentes se ha restaurado,
     * pero antes de que se produzca el procesamiento de cualquier evento. Este metodo <strong>solo</strong>
     * se llamara en una peticion de devolucion de envio que este procesando el envio de un formulario. Puede
     * personalizar este metodo para asignar recursos necesarios para los controladores de eventos.</p>
     */
    @Override
    public void preprocess() {
        this.preprocesar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama justo antes del procesamiento. <strong>solo</strong>
     * se llamara a este metodo en la pagina que se procesa, no se llamara, por ejemplo, en una pagina que ha
     * procesado una devolucion de envio y a continuacion ha navegado hasta otra pagina. Puede personalizar
     * este metodo para asignar recursos necesarios para procesar esta pagina.</p>
     */
    @Override
    public void prerender() {
        this.prepresentar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se completa el procesamiento de esta
     * peticion, si se llamo al metodo
     * <code>init()</code> (sin tener en cuenta si se trata de la pagina que se ha procesado o no). Puede
     * personalizar este metodo para liberar los recursos adquiridos en los metodos
     * <code>init()</code>,
     * <code>preprocess()</code> o
     * <code>prerender()</code> (o durante la ejecucion de un controlador de eventos).</p>
     */
    @Override
    @PreDestroy
    public void destroy() {
        Bitacora.trace(this.getClass(), "destroy");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar para el manejo de los beans de contexto: request, session y application">
    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }
    // </editor-fold>
/**/

    public void preiniciar() {
    }

    public void iniciar() {
    }

    public void preprocesar() {
    }

    public void prepresentar() {
        this.tell();
    }

    public String getDefaultWindowName() {
        return Global.DEFAULT_WINDOW_NAME;
    }

    public String getUrlMenu() {
        return URX2.REDIRECT + "?url=" + JSF.encodeURX(URX2.INICIO);
    }

    public String getUrlFavoritos() {
        return URX2.REDIRECT + "?url=" + JSF.encodeURX(URX2.FAVORITOS);
    }

    public String getScriptAbrirHomePage() {
        String url = "http://www.hacienda.gov.py/";
//      return JSF.getOpenURLWindowJavaScript(url);
        return "location.replace('" + url + "')";
    }

    public String hyperlink1_action() {
        return null;
    }

    public String hyperlink2_action() {
        return null;
    }
//
//  private String signoff() {
//      HttpServletRequest request = (HttpServletRequest) this.getFacesContext().getExternalContext().getRequest();
//      HttpSession session = request.getSession(false);
//      session.invalidate();
//      return null;
//  }

    private void tell() {
        EnumSeveridadMensaje menor = TLC.getBitacora().getSeveridadMinima();
        Iterator iterator = TLC.getBitacora().iterator();
        while (iterator.hasNext()) {
            Mensaje m = (Mensaje) iterator.next();
            if (m != null && m.getSeveridad().intValue() >= menor.intValue()) {
                switch (m.getSeveridad()) {
                    case INFORMATIVO:
                        info(m.toString());
                        break;
                    case ADVERTENCIA:
                        warn(m.toString());
                        break;
                    case ERROR:
                        error(m.toString());
                        break;
                    case FATAL:
                        fatal(m.toString());
                        break;
                    default:
                        info(m.toString());
                        break;
                }
            }
        }
        TLC.getBitacora().clear();
    }

}
