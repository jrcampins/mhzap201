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
package com.egt.web.toolkit;

import com.egt.base.constants.CBM2;
import com.egt.base.constants.FGS;
import com.egt.base.constants.URX2;
import com.egt.base.entity.constants.AplicacionConstants;
import com.egt.base.entity.constants.PaginaConstants;
import com.egt.commons.util.Bit;
import com.egt.commons.util.LongUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaBasica;
import com.egt.core.aplicacion.web.PaginaBasica;
import com.egt.core.util.JS;
import com.egt.core.util.STP;
import com.egt.ejb.persistence.entity.Aplicacion;
import com.egt.ejb.persistence.entity.Pagina;
import com.egt.ejb.persistence.facade.AplicacionFacadeLocal;
import com.egt.ejb.persistence.facade.PaginaFacadeLocal;
import com.egt.ejb.toolkit.ToolKitBrokerLocal;
import com.egt.ejb.toolkit.ToolKitSessionLocal;
import com.egt.ejb.toolkit.ToolKitUtils;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.HelpInline;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Message;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.Script;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.LongConverter;
import javax.faces.validator.ValidatorException;

public class Toolkit410 extends AbstractPageBean
        implements PaginaBasica {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
    }

    private Page page1 = new Page();

    public Page getPage1() {
        return page1;
    }

    public void setPage1(Page component) {
        this.page1 = component;
    }

    private Html html1 = new Html();

    public Html getHtml1() {
        return html1;
    }

    public void setHtml1(Html component) {
        this.html1 = component;
    }

    private Head head1 = new Head();

    public Head getHead1() {
        return head1;
    }

    public void setHead1(Head component) {
        this.head1 = component;
    }

    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link component) {
        this.link1 = component;
    }

    private Script script1 = new Script();

    public Script getScript1() {
        return script1;
    }

    public void setScript1(Script component) {
        this.script1 = component;
    }

    private Body body1 = new Body();

    public Body getBody1() {
        return body1;
    }

    public void setBody1(Body component) {
        this.body1 = component;
    }

    private Form form1 = new Form();

    @Override
    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form component) {
        this.form1 = component;
    }

    private Breadcrumbs breadcrumbs1 = new Breadcrumbs();

    @Override
    public Breadcrumbs getBreadcrumbs1() {
        return breadcrumbs1;
    }

    public void setBreadcrumbs1(Breadcrumbs component) {
        this.breadcrumbs1 = component;
    }

    private HtmlPanelGrid gridPanel101 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel101() {
        return gridPanel101;
    }

    public void setGridPanel101(HtmlPanelGrid component) {
        this.gridPanel101 = component;
    }

    private HtmlPanelGrid gridPanel102 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel102() {
        return gridPanel102;
    }

    public void setGridPanel102(HtmlPanelGrid component) {
        this.gridPanel102 = component;
    }

    private HtmlPanelGrid gridPanel103 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel103() {
        return gridPanel103;
    }

    public void setGridPanel103(HtmlPanelGrid component) {
        this.gridPanel103 = component;
    }

    private HtmlPanelGrid gridPanel104 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel104() {
        return gridPanel104;
    }

    public void setGridPanel104(HtmlPanelGrid component) {
        this.gridPanel104 = component;
    }

    private HtmlPanelGrid gridPanel105 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel105() {
        return gridPanel105;
    }

    public void setGridPanel105(HtmlPanelGrid component) {
        this.gridPanel105 = component;
    }

    private HtmlPanelGrid gridPanel106 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel106() {
        return gridPanel106;
    }

    public void setGridPanel106(HtmlPanelGrid component) {
        this.gridPanel106 = component;
    }

    private HtmlPanelGrid gridPanel107 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel107() {
        return gridPanel107;
    }

    public void setGridPanel107(HtmlPanelGrid component) {
        this.gridPanel107 = component;
    }

    private HtmlPanelGrid gridPanel108 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel108() {
        return gridPanel108;
    }

    public void setGridPanel108(HtmlPanelGrid component) {
        this.gridPanel108 = component;
    }

    private HtmlPanelGrid gridPanel109 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel109() {
        return gridPanel109;
    }

    public void setGridPanel109(HtmlPanelGrid component) {
        this.gridPanel109 = component;
    }

    private HtmlPanelGrid gridPanel110 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel110() {
        return gridPanel110;
    }

    public void setGridPanel110(HtmlPanelGrid component) {
        this.gridPanel110 = component;
    }

    private HtmlPanelGrid gridPanel111 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel111() {
        return gridPanel111;
    }

    public void setGridPanel111(HtmlPanelGrid component) {
        this.gridPanel111 = component;
    }

    private HtmlPanelGrid gridPanel112 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel112() {
        return gridPanel112;
    }

    public void setGridPanel112(HtmlPanelGrid component) {
        this.gridPanel112 = component;
    }

    private HtmlPanelGrid gridPanel113 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel113() {
        return gridPanel113;
    }

    public void setGridPanel113(HtmlPanelGrid component) {
        this.gridPanel113 = component;
    }

    private HtmlPanelGrid gridPanel114 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel114() {
        return gridPanel114;
    }

    public void setGridPanel114(HtmlPanelGrid component) {
        this.gridPanel114 = component;
    }

    private HtmlPanelGrid gridPanel115 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel115() {
        return gridPanel115;
    }

    public void setGridPanel115(HtmlPanelGrid component) {
        this.gridPanel115 = component;
    }

    private HtmlPanelGrid gridPanel116 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel116() {
        return gridPanel116;
    }

    public void setGridPanel116(HtmlPanelGrid component) {
        this.gridPanel116 = component;
    }

    private ImageComponent imagenMensaje1 = new ImageComponent();

    public ImageComponent getImagenMensaje1() {
        return imagenMensaje1;
    }

    public void setImagenMensaje1(ImageComponent component) {
        this.imagenMensaje1 = component;
    }

    private ImageHyperlink hipervinculoMensaje1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getHipervinculoMensaje1() {
        return hipervinculoMensaje1;
    }

    public void setHipervinculoMensaje1(ImageHyperlink component) {
        this.hipervinculoMensaje1 = component;
    }

    private Anchor ancla1 = new Anchor();

    public Anchor getAncla1() {
        return ancla1;
    }

    public void setAncla1(Anchor component) {
        this.ancla1 = component;
    }

    private Anchor ancla2 = new Anchor();

    public Anchor getAncla2() {
        return ancla2;
    }

    public void setAncla2(Anchor component) {
        this.ancla2 = component;
    }

    private StaticText textoTitulo1 = new StaticText();

    public StaticText getTextoTitulo1() {
        return textoTitulo1;
    }

    public void setTextoTitulo1(StaticText st) {
        this.textoTitulo1 = st;
    }

    private Label etiquetaListaFuncionAccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaListaFuncionAccion1() {
        return etiquetaListaFuncionAccion1;
    }

    public void setEtiquetaListaFuncionAccion1(Label l) {
        this.etiquetaListaFuncionAccion1 = l;
    }

    private DropDown listaFuncionAccion1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaFuncionAccion1() {
        return listaFuncionAccion1;
    }

    public void setListaFuncionAccion1(DropDown component) {
        this.listaFuncionAccion1 = component;
    }

    private LongConverter converterListaFuncionAccion1 = new LongConverter();

    public LongConverter getConverterListaFuncionAccion1() {
        return converterListaFuncionAccion1;
    }

    public void setConverterListaFuncionAccion1(LongConverter component) {
        this.converterListaFuncionAccion1 = component;
    }

    private Message messageListaFuncionAccion1 = new Message();

    public Message getMessageListaFuncionAccion1() {
        return messageListaFuncionAccion1;
    }

    public void setMessageListaFuncionAccion1(Message m) {
        this.messageListaFuncionAccion1 = m;
    }

    private StaticText listaFuncionAccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaFuncionAccion1Texto1() {
        return listaFuncionAccion1Texto1;
    }

    public void setListaFuncionAccion1Texto1(StaticText component) {
        this.listaFuncionAccion1Texto1 = component;
    }

    private HtmlPanelGrid gridIdAplicacion1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdAplicacion1() {
        return gridIdAplicacion1;
    }

    public void setGridIdAplicacion1(HtmlPanelGrid hpg) {
        this.gridIdAplicacion1 = hpg;
    }

    private Label labelIdAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdAplicacion1() {
        return labelIdAplicacion1;
    }

    public void setLabelIdAplicacion1(Label l) {
        this.labelIdAplicacion1 = l;
    }

    private HtmlPanelGrid gridIdAplicacion2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdAplicacion2() {
        return gridIdAplicacion2;
    }

    public void setGridIdAplicacion2(HtmlPanelGrid hpg) {
        this.gridIdAplicacion2 = hpg;
    }

    private TextField campoIdAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdAplicacion1() {
        return campoIdAplicacion1;
    }

    public void setCampoIdAplicacion1(TextField component) {
        this.campoIdAplicacion1 = component;
    }

    private Message messageIdAplicacion1 = new Message();

    public Message getMessageIdAplicacion1() {
        return messageIdAplicacion1;
    }

    public void setMessageIdAplicacion1(Message m) {
        this.messageIdAplicacion1 = m;
    }

    private StaticText campoIdAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdAplicacion1Texto1() {
        return campoIdAplicacion1Texto1;
    }

    public void setCampoIdAplicacion1Texto1(StaticText component) {
        this.campoIdAplicacion1Texto1 = component;
    }

    private Button campoIdAplicacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdAplicacion1Boton1() {
        return campoIdAplicacion1Boton1;
    }

    public void setCampoIdAplicacion1Boton1(Button component) {
        this.campoIdAplicacion1Boton1 = component;
    }

    private HtmlPanelGrid gridIdAplicacion3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdAplicacion3() {
        return gridIdAplicacion3;
    }

    public void setGridIdAplicacion3(HtmlPanelGrid hpg) {
        this.gridIdAplicacion3 = hpg;
    }

    private Label labelIdAplicacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdAplicacion2() {
        return labelIdAplicacion2;
    }

    public void setLabelIdAplicacion2(Label l) {
        this.labelIdAplicacion2 = l;
    }

    private HtmlPanelGrid gridIdAplicacion4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdAplicacion4() {
        return gridIdAplicacion4;
    }

    public void setGridIdAplicacion4(HtmlPanelGrid hpg) {
        this.gridIdAplicacion4 = hpg;
    }

    private StaticText campoIdAplicacion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdAplicacion1Texto2() {
        return campoIdAplicacion1Texto2;
    }

    public void setCampoIdAplicacion1Texto2(StaticText component) {
        this.campoIdAplicacion1Texto2 = component;
    }

    private Button campoIdAplicacion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdAplicacion1Boton2() {
        return campoIdAplicacion1Boton2;
    }

    public void setCampoIdAplicacion1Boton2(Button component) {
        this.campoIdAplicacion1Boton2 = component;
    }

    private HtmlPanelGrid gridIdPagina1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdPagina1() {
        return gridIdPagina1;
    }

    public void setGridIdPagina1(HtmlPanelGrid hpg) {
        this.gridIdPagina1 = hpg;
    }

    private Label labelIdPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPagina1() {
        return labelIdPagina1;
    }

    public void setLabelIdPagina1(Label l) {
        this.labelIdPagina1 = l;
    }

    private HtmlPanelGrid gridIdPagina2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdPagina2() {
        return gridIdPagina2;
    }

    public void setGridIdPagina2(HtmlPanelGrid hpg) {
        this.gridIdPagina2 = hpg;
    }

    private TextField campoIdPagina1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdPagina1() {
        return campoIdPagina1;
    }

    public void setCampoIdPagina1(TextField component) {
        this.campoIdPagina1 = component;
    }

    private Message messageIdPagina1 = new Message();

    public Message getMessageIdPagina1() {
        return messageIdPagina1;
    }

    public void setMessageIdPagina1(Message m) {
        this.messageIdPagina1 = m;
    }

    private StaticText campoIdPagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPagina1Texto1() {
        return campoIdPagina1Texto1;
    }

    public void setCampoIdPagina1Texto1(StaticText component) {
        this.campoIdPagina1Texto1 = component;
    }

    private Button campoIdPagina1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPagina1Boton1() {
        return campoIdPagina1Boton1;
    }

    public void setCampoIdPagina1Boton1(Button component) {
        this.campoIdPagina1Boton1 = component;
    }

    private HtmlPanelGrid gridIdPagina3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdPagina3() {
        return gridIdPagina3;
    }

    public void setGridIdPagina3(HtmlPanelGrid hpg) {
        this.gridIdPagina3 = hpg;
    }

    private Label labelIdPagina2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPagina2() {
        return labelIdPagina2;
    }

    public void setLabelIdPagina2(Label l) {
        this.labelIdPagina2 = l;
    }

    private HtmlPanelGrid gridIdPagina4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdPagina4() {
        return gridIdPagina4;
    }

    public void setGridIdPagina4(HtmlPanelGrid hpg) {
        this.gridIdPagina4 = hpg;
    }

    private StaticText campoIdPagina1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPagina1Texto2() {
        return campoIdPagina1Texto2;
    }

    public void setCampoIdPagina1Texto2(StaticText component) {
        this.campoIdPagina1Texto2 = component;
    }

    private Button campoIdPagina1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPagina1Boton2() {
        return campoIdPagina1Boton2;
    }

    public void setCampoIdPagina1Boton2(Button component) {
        this.campoIdPagina1Boton2 = component;
    }

    private StaticText textoMensaje1 = new StaticText();

    public StaticText getTextoMensaje1() {
        return textoMensaje1;
    }

    public void setTextoMensaje1(StaticText st) {
        this.textoMensaje1 = st;
    }

    private Anchor anchor1 = new Anchor();

    public Anchor getAnchor1() {
        return anchor1;
    }

    public void setAnchor1(Anchor a) {
        this.anchor1 = a;
    }

    private Button botonAplicar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonAplicar1() {
        return botonAplicar1;
    }

    public void setBotonAplicar1(Button component) {
        this.botonAplicar1 = component;
    }

    private Button botonProcesar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesar1() {
        return botonProcesar1;
    }

    public void setBotonProcesar1(Button component) {
        this.botonProcesar1 = component;
    }

    private Anchor anclaPie1 = new Anchor();

    public Anchor getAnclaPie1() {
        return anclaPie1;
    }

    public void setAnclaPie1(Anchor component) {
        this.anclaPie1 = component;
    }

    private HelpInline helpInlineListaFuncionAccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineListaFuncionAccion1() {
        return helpInlineListaFuncionAccion1;
    }

    public void setHelpInlineListaFuncionAccion1(HelpInline hi) {
        this.helpInlineListaFuncionAccion1 = hi;
    }

    private HelpInline campoIdAplicacion1Ayuda1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getCampoIdAplicacion1Ayuda1() {
        return campoIdAplicacion1Ayuda1;
    }

    public void setCampoIdAplicacion1Ayuda1(HelpInline hi) {
        this.campoIdAplicacion1Ayuda1 = hi;
    }

    private HelpInline campoIdPagina1Ayuda1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getCampoIdPagina1Ayuda1() {
        return campoIdPagina1Ayuda1;
    }

    public void setCampoIdPagina1Ayuda1(HelpInline hi) {
        this.campoIdPagina1Ayuda1 = hi;
    }

    // </editor-fold>
/**/
    public Toolkit410() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    @Override
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

    @Override
    public void preprocess() {
        this.preprocesar();
    }

    @Override
    public void prerender() {
        this.prepresentar();
    }

    @Override
    public void destroy() {
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar para el manejo de los beans de contexto: request, session y application">
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades y metodos de la interfaz PaginaAbstracta">
    @Override
    public FacesContext getFacesContext() {
        return super.getFacesContext();
    }

    @Override
    public Object getBean(String name) {
        return super.getBean(name);
    }

    @Override
    public boolean isPostBack() {
        return super.isPostBack();
    }

    @Override
    public void erase() {
        super.erase();
    }

    @Override
    public void info(String summary) {
        super.info(summary);
    }

    @Override
    public void warn(String summary) {
        super.warn(summary);
    }

    @Override
    public void error(String summary) {
        super.error(summary);
    }

    @Override
    public void fatal(String summary) {
        super.fatal(summary);
    }

    @Override
    public void log(String message) {
        super.log(message);
    }

    @Override
    public void log(String message, Throwable throwable) {
        super.log(message, throwable);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaBasica">
    @Override
    public ContextoPeticionEstandar getContextoPeticion() {
        return (ContextoPeticionEstandar) this.getRequestBean1().getContextoPeticion();
    }

    @Override
    public ContextoSesionEstandar getContextoSesion() {
        return (ContextoSesionEstandar) this.getSessionBean1().getContextoSesion();
    }

    @Override
    public ContextoAplicacionEstandar getContextoAplicacion() {
        return (ContextoAplicacionEstandar) this.getApplicationBean1().getContextoAplicacion();
    }

    @Override
    public String getEtiquetaMigasPan() {
        return ETIQUETA_MIGAS_PAN;
    }
    // </editor-fold>

    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Toolkit410_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina básica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    private static long FUNCION_ACCION_901 = FGS.FUNCION_GENERAR_ENTITY_CLASS;

    private static long FUNCION_ACCION_902 = FGS.FUNCION_GENERAR_FACADE;

    private static long FUNCION_ACCION_911 = FGS.FUNCION_GENERAR_URX;

    private static long FUNCION_ACCION_912 = FGS.FUNCION_GENERAR_MENU;

    private static long FUNCION_ACCION_913 = FGS.FUNCION_GENERAR_BUNDLES;

    private static long FUNCION_ACCION_914 = FGS.FUNCION_GENERAR_ENTITY_CONSTANTS;

    private static long FUNCION_ACCION_921 = FGS.FUNCION_GENERAR_JASPER_REPORT;

    private static long FUNCION_ACCION_922 = FGS.FUNCION_GENERAR_JASPER_VIEWS;

    private static long FUNCION_ACCION_931 = FGS.FUNCION_GENERAR_BUSINESS_MESSAGE;

    private static long FUNCION_ACCION_932 = FGS.FUNCION_GENERAR_BUSINESS_PROCESS;

    private static long FUNCION_ACCION_941 = FGS.FUNCION_GENERAR_PLANTILLAS;

    private static long FUNCION_ACCION_942 = FGS.FUNCION_GENERAR_APLICACIONES;

    private static long FUNCION_ACCION_943 = FGS.FUNCION_GENERAR_APLICACIONES_ESPECIFICAS;

    private static long FUNCION_ACCION_944 = FGS.FUNCION_GENERAR_WEB_VIEWS;

    private static long FUNCION_ACCION_991 = AplicacionConstants.FUNCION_GENERAR_APLICACION;

    private static long FUNCION_ACCION_992 = PaginaConstants.FUNCION_GENERAR_PAGINA;

    public Option[] getOpcionesListaFuncionAccion() {
        return new Option[]{ //
                    new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
                    new Option(Toolkit410.FUNCION_ACCION_901, Bundle.getString("generar entities")),
                    new Option(Toolkit410.FUNCION_ACCION_902, Bundle.getString("generar facades")),
                    new Option(Toolkit410.FUNCION_ACCION_911, Bundle.getString("generar urx")),
                    new Option(Toolkit410.FUNCION_ACCION_912, Bundle.getString("generar menu")),
                    new Option(Toolkit410.FUNCION_ACCION_913, Bundle.getString("generar bundles")),
                    new Option(Toolkit410.FUNCION_ACCION_914, Bundle.getString("generar constants")),
                    new Option(Toolkit410.FUNCION_ACCION_921, Bundle.getString("generar jasper reports")),
                    new Option(Toolkit410.FUNCION_ACCION_922, Bundle.getString("generar jasper views")),
                    new Option(Toolkit410.FUNCION_ACCION_931, Bundle.getString("generar mensajes")),
                    new Option(Toolkit410.FUNCION_ACCION_932, Bundle.getString("generar procesos")),
                    new Option(Toolkit410.FUNCION_ACCION_941, Bundle.getString("generar plantillas")),
                    new Option(Toolkit410.FUNCION_ACCION_942, Bundle.getString("generar aplicaciones")),
                    new Option(Toolkit410.FUNCION_ACCION_943, Bundle.getString("generar aplicaciones específicas")),
                    new Option(Toolkit410.FUNCION_ACCION_944, Bundle.getString("generar web views")),
                    new Option(Toolkit410.FUNCION_ACCION_991, Bundle.getString("generar aplicacion")),
                    new Option(Toolkit410.FUNCION_ACCION_992, Bundle.getString("generar pagina"))
                };
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    private Bit bitIdAplicacionRendered = new Bit() {
        // override isOn

        @Override
        public boolean isOn() {
            return isIdAplicacionRendered();
        }

    };

    public Bit getBitIdAplicacionRendered() {
        return bitIdAplicacionRendered;
    }

    public boolean isIdAplicacionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == Toolkit410.FUNCION_ACCION_991;
    }

    private Bit bitIdPaginaRendered = new Bit() {
        // override isOn

        @Override
        public boolean isOn() {
            return isIdPaginaRendered();
        }

    };

    public Bit getBitIdPaginaRendered() {
        return bitIdPaginaRendered;
    }

    public boolean isIdPaginaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == Toolkit410.FUNCION_ACCION_992;
    }    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Entities">
    private Aplicacion aplicacion;

    public Aplicacion getAplicacion() {
        return this.aplicacion;
    }

    private Pagina pagina;

    public Pagina getPagina() {
        return this.pagina;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private AplicacionFacadeLocal aplicacionFacade;

    @EJB
    private PaginaFacadeLocal paginaFacade;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="metodos y propiedades estandar">
    protected void preiniciar() {
        /*
         * Esta funcion debe ejecutarse al comienzo de init(),
         * *antes* de que se inicien los componentes administrados.
         */
        this.getGestor().preiniciar();
    }

    protected void iniciar() {
        /*
         * Esta funcion debe ejecutarse al final de init(),
         * *despues* de que se inicien los componentes administrados.
         */
        this.getGestor().iniciar();
    }

    protected void preprocesar() {
        /*
         * Esta funcion debe ejecutarse al final de preprocess().
         */
        this.getGestor().preprocesar();
    }

    protected void prepresentar() {
        /*
         * Esta funcion debe ejecutarse al final de prerender().
         */
        this.getGestor().prepresentar();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer los valores de los campos">
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idAplicacion">
    private Aplicacion aplicacionIdAplicacion;

    public Aplicacion getAplicacionIdAplicacion() {
        return this.aplicacionIdAplicacion;
    }

    public void campoIdAplicacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getGestor().track("campoIdAplicacion1_validate", value);
        this.aplicacionIdAplicacion = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = "id_aplicacion"; /* COLUMNA_IDENTIFICACION_RECURSO */
                boolean refresh = false;
                if (o instanceof Long) {
                    this.aplicacionIdAplicacion = this.aplicacionFacade.find(o, refresh);
                } else if (o instanceof String) {
                    this.aplicacionIdAplicacion = this.aplicacionFacade.findByCodigo(o.toString(), refresh);
                }
                if (this.aplicacionIdAplicacion == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + c + ">"));
                }
            } catch (Exception ex) {
                if (ex instanceof ValidatorException) {
                    throw (ValidatorException) ex;
                } else {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ThrowableUtils.getString(ex), null);
                    throw new ValidatorException(message);
                }
            }
        }
    }

    private String textoCampoIdAplicacion1;

    public String getTextoCampoIdAplicacion1() {
        this.getGestor().track("getTextoCampoIdAplicacion1", textoCampoIdAplicacion1);
        return this.textoCampoIdAplicacion1;
    }

    public void setTextoCampoIdAplicacion1(String valor) {
        this.getGestor().track("setTextoCampoIdAplicacion1", valor);
        this.textoCampoIdAplicacion1 = valor;
    }

    public String getToolTipCampoIdAplicacion1() {
        this.getGestor().track("getToolTipCampoIdAplicacion1", textoCampoIdAplicacion1, aplicacionIdAplicacion);
        return this.aplicacionIdAplicacion == null ? null : STP.trimToStringRecursoSinNombre(this.aplicacionIdAplicacion.getNombreAplicacion());
    }

    public String getScriptCampoIdAplicacion1Boton1() {
        long funcion = AplicacionConstants.FUNCION_CONSULTAR_APLICACION;
        String campo = this.getCampoIdAplicacion1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton);
    }

    public String getScriptCampoIdAplicacion1Boton2() {
        String urx = URX2.DETALLE_APLICACION;
        Long id = this.aplicacionIdAplicacion == null ? null : this.aplicacionIdAplicacion.getIdAplicacion();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPagina">
    private Pagina paginaIdPagina;

    public Pagina getPaginaIdPagina() {
        return this.paginaIdPagina;
    }

    public void campoIdPagina1_validate(FacesContext context, UIComponent component, Object value) {
        this.getGestor().track("campoIdPagina1_validate", value);
        this.paginaIdPagina = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = "id_pagina"; /* COLUMNA_IDENTIFICACION_RECURSO */
                boolean refresh = false;
                if (o instanceof Long) {
                    this.paginaIdPagina = this.paginaFacade.find(o, refresh);
                } else if (o instanceof String) {
                    this.paginaIdPagina = this.paginaFacade.findByCodigo(o.toString(), refresh);
                }
                if (this.paginaIdPagina == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + c + ">"));
                }
            } catch (Exception ex) {
                if (ex instanceof ValidatorException) {
                    throw (ValidatorException) ex;
                } else {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null);
                    throw new ValidatorException(message);
                }
            }
        }
    }

    private String textoCampoIdPagina1;

    public String getTextoCampoIdPagina1() {
        this.getGestor().track("getTextoCampoIdPagina1", textoCampoIdPagina1);
        return this.textoCampoIdPagina1;
    }

    public void setTextoCampoIdPagina1(String valor) {
        this.getGestor().track("setTextoCampoIdPagina1", valor);
        this.textoCampoIdPagina1 = valor;
    }

    public String getToolTipCampoIdPagina1() {
        this.getGestor().track("getToolTipCampoIdPagina1", textoCampoIdPagina1, paginaIdPagina);
        return this.paginaIdPagina == null ? null : STP.trimToStringRecursoSinNombre(this.paginaIdPagina.getNombrePagina());
    }

    public String getScriptCampoIdPagina1Boton1() {
        long funcion = PaginaConstants.FUNCION_CONSULTAR_PAGINA;
        String campo = this.getCampoIdPagina1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton);
    }

    public String getScriptCampoIdPagina1Boton2() {
        String urx = URX2.DETALLE_PAGINA;
        Long id = this.paginaIdPagina == null ? null : this.paginaIdPagina.getIdPagina();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        this.getGestor().track("botonAplicar1_action", this.getGestor().getValorListaFuncionAccion1());
        return null;
    }

    public String botonProcesar1_action() {
        this.getGestor().track("botonProcesar1_action", this.getGestor().getValorListaFuncionAccion1(), textoCampoIdAplicacion1, textoCampoIdPagina1);
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_901 ? accion901(f) /* generarEntityClass */
                : f == FUNCION_ACCION_902 ? accion902(f) /* generarFacade */
                : f == FUNCION_ACCION_911 ? accion911(f) /* generarUrx */
                : f == FUNCION_ACCION_912 ? accion912(f) /* generarMenu */
                : f == FUNCION_ACCION_913 ? accion913(f) /* generarBundles */
                : f == FUNCION_ACCION_914 ? accion914(f) /* generarEntityConstants */
                : f == FUNCION_ACCION_921 ? accion921(f) /* generarJasperReport */
                : f == FUNCION_ACCION_922 ? accion922(f) /* generarJasperViews */
                : f == FUNCION_ACCION_931 ? accion931(f) /* generarBusinessMessage */
                : f == FUNCION_ACCION_932 ? accion932(f) /* generarBusinessProcess */
                : f == FUNCION_ACCION_941 ? accion941(f) /* generarPlantillas */
                : f == FUNCION_ACCION_942 ? accion942(f) /* generarAplicaciones */
                : f == FUNCION_ACCION_943 ? accion943(f) /* generarAplicacionesEspecificas */
                : f == FUNCION_ACCION_944 ? accion944(f) /* generarWebViews */
                : f == FUNCION_ACCION_991 ? accion991(f) /* generarAplicacion */
                : f == FUNCION_ACCION_992 ? accion992(f) /* generarPagina */
                : null;
    }

    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";

    @EJB
    private ToolKitBrokerLocal broker;

    @EJB
    private ToolKitSessionLocal toolkit;

    private String accion901(long f) { /* generarEntityClass */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarEntityClass();
        }
        return null;
    }

    private String accion902(long f) { /* generarFacade */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarFacade();
        }
        return null;
    }

    private String accion911(long f) { /* generarURX */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarURX();
        }
        return null;
    }

    private String accion912(long f) { /* generarMenu */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarMenu();
        }
        return null;
    }

    private String accion913(long f) { /* generarBundles */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarBundles();
        }
        return null;
    }

    private String accion914(long f) { /* generarEntityConstants */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarEntityConstants();
        }
        return null;
    }

    private String accion921(long f) { /* generarJasperReport */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarJasperReport();
        }
        return null;
    }

    private String accion922(long f) { /* generarJasperViews */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarJasperViews();
        }
        return null;
    }

    private String accion931(long f) { /* generarBusinessMessage */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarBusinessMessage();
        }
        return null;
    }

    private String accion932(long f) { /* generarBusinessProcess */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarBusinessProcess();
        }
        return null;
    }

    private String accion941(long f) { /* generarPlantillas */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarPlantillas();
        }
        return null;
    }

    private String accion942(long f) { /* generarAplicaciones */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarAplicaciones();
        }
        return null;
    }

    private String accion943(long f) { /* generarAplicacionesEspecificas */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarAplicacionesEspecificas();
        }
        return null;
    }

    private String accion944(long f) { /* generarWebViews */
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            broker.generarWebViews();
        }
        return null;
    }

    private String accion991(long f) { /* generarAplicacion */
        if (this.aplicacionIdAplicacion != null) {
            boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
            if (esFuncionAutorizada) {
                try {
                    toolkit.generarAplicacion(aplicacionIdAplicacion.getIdAplicacion());
                    TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, aplicacionIdAplicacion.getCodigoAplicacion());
                } catch (Exception ex) {
                    this.getGestor().handle(ex);
                }
            }
        }
        return null;
    }

    private String accion992(long f) { /* generarPagina */
        if (this.paginaIdPagina != null) {
            boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
            if (esFuncionAutorizada) {
                try {
                    toolkit.generarPagina(paginaIdPagina.getIdPagina());
                    TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, paginaIdPagina.getCodigoPagina());
                } catch (Exception ex) {
                    this.getGestor().handle(ex);
                }
            }
        }
        return null;
    }

    public String botonGenerar1_action() {
        broker.generar();
        return null;
    }

    public String getScriptGenerar() {
        return JS.getConfirmDialogJavaScript(Bundle.getString("Toolkit410_ETIQUETA_MIGAS_PAN"), false);
    }

    public String getTargetApplicationServer() {
        return ToolKitUtils.getenv("TARGET_APPLICATION_SERVER");
    }

    public String getWorkspaceDir() {
        return ToolKitUtils.getenv("WORKSPACE");
    }

}
