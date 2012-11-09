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
package com.egt.web.conjunto.segmento;

import com.egt.data.general.xdp2.ConjuntoSegmentoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.base.util.BundleWebui;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Message;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.Script;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;

public class ConjuntoSegmento2 extends AbstractPageBean
        implements PaginaActualizacionConjuntoSegmento {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdConjuntoSegmento1.setMinimum(0L);
        validatorIdConjuntoSegmento1.setMaximum(1000000000000000000L);
        validatorCodigoConjuntoSegmento1.setMaximum(30);
        validatorNombreConjuntoSegmento1.setMaximum(100);
        validatorDescripcionConjuntoSegmento1.setMaximum(255);
        conjuntoSegmentoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.conjuntoSegmentoRowSet}"));
        claseRecursoReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoReferenceRowSet}"));
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

    private HtmlPanelGrid gridPanel117 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel117() {
        return gridPanel117;
    }

    public void setGridPanel117(HtmlPanelGrid component) {
        this.gridPanel117 = component;
    }

    private HtmlPanelGrid gridPanel118 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel118() {
        return gridPanel118;
    }

    public void setGridPanel118(HtmlPanelGrid component) {
        this.gridPanel118 = component;
    }

    private HtmlPanelGrid gridPanel119 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel119() {
        return gridPanel119;
    }

    public void setGridPanel119(HtmlPanelGrid component) {
        this.gridPanel119 = component;
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

    private Button botonIrAlPrimero1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlPrimero1() {
        return botonIrAlPrimero1;
    }

    public void setBotonIrAlPrimero1(Button component) {
        this.botonIrAlPrimero1 = component;
    }

    private Button botonIrAlAnterior1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlAnterior1() {
        return botonIrAlAnterior1;
    }

    public void setBotonIrAlAnterior1(Button component) {
        this.botonIrAlAnterior1 = component;
    }

    private Button botonIrAlSiguiente1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlSiguiente1() {
        return botonIrAlSiguiente1;
    }

    public void setBotonIrAlSiguiente1(Button component) {
        this.botonIrAlSiguiente1 = component;
    }

    private Button botonIrAlUltimo1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlUltimo1() {
        return botonIrAlUltimo1;
    }

    public void setBotonIrAlUltimo1(Button component) {
        this.botonIrAlUltimo1 = component;
    }

    private StaticText textoTituloConsulta1 = new StaticText();

    public StaticText getTextoTituloConsulta1() {
        return textoTituloConsulta1;
    }

    public void setTextoTituloConsulta1(StaticText st) {
        this.textoTituloConsulta1 = st;
    }

    private Label etiquetaIdentificacionFila1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaIdentificacionFila1() {
        return etiquetaIdentificacionFila1;
    }

    public void setEtiquetaIdentificacionFila1(Label l) {
        this.etiquetaIdentificacionFila1 = l;
    }

    private StaticText textoIdentificacionFila1 = new StaticText();

    public StaticText getTextoIdentificacionFila1() {
        return textoIdentificacionFila1;
    }

    public void setTextoIdentificacionFila1(StaticText st) {
        this.textoIdentificacionFila1 = st;
    }

    private ImageComponent imagenFilaProcesada1 = new ImageComponent();

    public ImageComponent getImagenFilaProcesada1() {
        return imagenFilaProcesada1;
    }

    public void setImagenFilaProcesada1(ImageComponent ic) {
        this.imagenFilaProcesada1 = ic;
    }

    private Label etiquetaDenominacionFilaMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaDenominacionFilaMaestro1() {
        return etiquetaDenominacionFilaMaestro1;
    }

    public void setEtiquetaDenominacionFilaMaestro1(Label l) {
        this.etiquetaDenominacionFilaMaestro1 = l;
    }

    private StaticText textoDenominacionFilaMaestro1 = new StaticText();

    public StaticText getTextoDenominacionFilaMaestro1() {
        return textoDenominacionFilaMaestro1;
    }

    public void setTextoDenominacionFilaMaestro1(StaticText st) {
        this.textoDenominacionFilaMaestro1 = st;
    }

    private ImageComponent imagenFilaMaestro1 = new ImageComponent();

    public ImageComponent getImagenFilaMaestro1() {
        return imagenFilaMaestro1;
    }

    public void setImagenFilaMaestro1(ImageComponent ic) {
        this.imagenFilaMaestro1 = ic;
    }

    private HtmlPanelGrid gridIdConjuntoSegmento1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdConjuntoSegmento1() {
        return gridIdConjuntoSegmento1;
    }

    public void setGridIdConjuntoSegmento1(HtmlPanelGrid hpg) {
        this.gridIdConjuntoSegmento1 = hpg;
    }

    private Label labelIdConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdConjuntoSegmento1() {
        return labelIdConjuntoSegmento1;
    }

    public void setLabelIdConjuntoSegmento1(Label l) {
        this.labelIdConjuntoSegmento1 = l;
    }

    private HtmlPanelGrid gridIdConjuntoSegmento2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdConjuntoSegmento2() {
        return gridIdConjuntoSegmento2;
    }

    public void setGridIdConjuntoSegmento2(HtmlPanelGrid hpg) {
        this.gridIdConjuntoSegmento2 = hpg;
    }

    private TextField campoIdConjuntoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdConjuntoSegmento1() {
        return campoIdConjuntoSegmento1;
    }

    public void setCampoIdConjuntoSegmento1(TextField component) {
        this.campoIdConjuntoSegmento1 = component;
    }

    private Message messageIdConjuntoSegmento1 = new Message();

    public Message getMessageIdConjuntoSegmento1() {
        return messageIdConjuntoSegmento1;
    }

    public void setMessageIdConjuntoSegmento1(Message m) {
        this.messageIdConjuntoSegmento1 = m;
    }

    private StaticText campoIdConjuntoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdConjuntoSegmento1Texto1() {
        return campoIdConjuntoSegmento1Texto1;
    }

    public void setCampoIdConjuntoSegmento1Texto1(StaticText component) {
        this.campoIdConjuntoSegmento1Texto1 = component;
    }

    private LongConverter converterIdConjuntoSegmento1 = new LongConverter();

    public LongConverter getConverterIdConjuntoSegmento1() {
        return converterIdConjuntoSegmento1;
    }

    public void setConverterIdConjuntoSegmento1(LongConverter converter) {
        this.converterIdConjuntoSegmento1 = converter;
    }

    private LongRangeValidator validatorIdConjuntoSegmento1 = new LongRangeValidator();

    public LongRangeValidator getValidatorIdConjuntoSegmento1() {
        return validatorIdConjuntoSegmento1;
    }

    public void setValidatorIdConjuntoSegmento1(LongRangeValidator validator) {
        this.validatorIdConjuntoSegmento1 = validator;
    }

    private HtmlPanelGrid gridCodigoConjuntoSegmento1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridCodigoConjuntoSegmento1() {
        return gridCodigoConjuntoSegmento1;
    }

    public void setGridCodigoConjuntoSegmento1(HtmlPanelGrid hpg) {
        this.gridCodigoConjuntoSegmento1 = hpg;
    }

    private Label labelCodigoConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoConjuntoSegmento1() {
        return labelCodigoConjuntoSegmento1;
    }

    public void setLabelCodigoConjuntoSegmento1(Label l) {
        this.labelCodigoConjuntoSegmento1 = l;
    }

    private HtmlPanelGrid gridCodigoConjuntoSegmento2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridCodigoConjuntoSegmento2() {
        return gridCodigoConjuntoSegmento2;
    }

    public void setGridCodigoConjuntoSegmento2(HtmlPanelGrid hpg) {
        this.gridCodigoConjuntoSegmento2 = hpg;
    }

    private TextField campoCodigoConjuntoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoConjuntoSegmento1() {
        return campoCodigoConjuntoSegmento1;
    }

    public void setCampoCodigoConjuntoSegmento1(TextField component) {
        this.campoCodigoConjuntoSegmento1 = component;
    }

    private Message messageCodigoConjuntoSegmento1 = new Message();

    public Message getMessageCodigoConjuntoSegmento1() {
        return messageCodigoConjuntoSegmento1;
    }

    public void setMessageCodigoConjuntoSegmento1(Message m) {
        this.messageCodigoConjuntoSegmento1 = m;
    }

    private StaticText campoCodigoConjuntoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoConjuntoSegmento1Texto1() {
        return campoCodigoConjuntoSegmento1Texto1;
    }

    public void setCampoCodigoConjuntoSegmento1Texto1(StaticText component) {
        this.campoCodigoConjuntoSegmento1Texto1 = component;
    }

    private LengthValidator validatorCodigoConjuntoSegmento1 = new LengthValidator();

    public LengthValidator getValidatorCodigoConjuntoSegmento1() {
        return validatorCodigoConjuntoSegmento1;
    }

    public void setValidatorCodigoConjuntoSegmento1(LengthValidator validator) {
        this.validatorCodigoConjuntoSegmento1 = validator;
    }

    private HtmlPanelGrid gridNombreConjuntoSegmento1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridNombreConjuntoSegmento1() {
        return gridNombreConjuntoSegmento1;
    }

    public void setGridNombreConjuntoSegmento1(HtmlPanelGrid hpg) {
        this.gridNombreConjuntoSegmento1 = hpg;
    }

    private Label labelNombreConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreConjuntoSegmento1() {
        return labelNombreConjuntoSegmento1;
    }

    public void setLabelNombreConjuntoSegmento1(Label l) {
        this.labelNombreConjuntoSegmento1 = l;
    }

    private HtmlPanelGrid gridNombreConjuntoSegmento2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridNombreConjuntoSegmento2() {
        return gridNombreConjuntoSegmento2;
    }

    public void setGridNombreConjuntoSegmento2(HtmlPanelGrid hpg) {
        this.gridNombreConjuntoSegmento2 = hpg;
    }

    private TextField campoNombreConjuntoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreConjuntoSegmento1() {
        return campoNombreConjuntoSegmento1;
    }

    public void setCampoNombreConjuntoSegmento1(TextField component) {
        this.campoNombreConjuntoSegmento1 = component;
    }

    private Message messageNombreConjuntoSegmento1 = new Message();

    public Message getMessageNombreConjuntoSegmento1() {
        return messageNombreConjuntoSegmento1;
    }

    public void setMessageNombreConjuntoSegmento1(Message m) {
        this.messageNombreConjuntoSegmento1 = m;
    }

    private StaticText campoNombreConjuntoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreConjuntoSegmento1Texto1() {
        return campoNombreConjuntoSegmento1Texto1;
    }

    public void setCampoNombreConjuntoSegmento1Texto1(StaticText component) {
        this.campoNombreConjuntoSegmento1Texto1 = component;
    }

    private LengthValidator validatorNombreConjuntoSegmento1 = new LengthValidator();

    public LengthValidator getValidatorNombreConjuntoSegmento1() {
        return validatorNombreConjuntoSegmento1;
    }

    public void setValidatorNombreConjuntoSegmento1(LengthValidator validator) {
        this.validatorNombreConjuntoSegmento1 = validator;
    }

    private HtmlPanelGrid gridDescripcionConjuntoSegmento1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridDescripcionConjuntoSegmento1() {
        return gridDescripcionConjuntoSegmento1;
    }

    public void setGridDescripcionConjuntoSegmento1(HtmlPanelGrid hpg) {
        this.gridDescripcionConjuntoSegmento1 = hpg;
    }

    private Label labelDescripcionConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionConjuntoSegmento1() {
        return labelDescripcionConjuntoSegmento1;
    }

    public void setLabelDescripcionConjuntoSegmento1(Label l) {
        this.labelDescripcionConjuntoSegmento1 = l;
    }

    private HtmlPanelGrid gridDescripcionConjuntoSegmento2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridDescripcionConjuntoSegmento2() {
        return gridDescripcionConjuntoSegmento2;
    }

    public void setGridDescripcionConjuntoSegmento2(HtmlPanelGrid hpg) {
        this.gridDescripcionConjuntoSegmento2 = hpg;
    }

    private TextArea campoDescripcionConjuntoSegmento1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionConjuntoSegmento1() {
        return campoDescripcionConjuntoSegmento1;
    }

    public void setCampoDescripcionConjuntoSegmento1(TextArea component) {
        this.campoDescripcionConjuntoSegmento1 = component;
    }

    private Message messageDescripcionConjuntoSegmento1 = new Message();

    public Message getMessageDescripcionConjuntoSegmento1() {
        return messageDescripcionConjuntoSegmento1;
    }

    public void setMessageDescripcionConjuntoSegmento1(Message m) {
        this.messageDescripcionConjuntoSegmento1 = m;
    }

    private StaticText campoDescripcionConjuntoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionConjuntoSegmento1Texto1() {
        return campoDescripcionConjuntoSegmento1Texto1;
    }

    public void setCampoDescripcionConjuntoSegmento1Texto1(StaticText component) {
        this.campoDescripcionConjuntoSegmento1Texto1 = component;
    }

    private LengthValidator validatorDescripcionConjuntoSegmento1 = new LengthValidator();

    public LengthValidator getValidatorDescripcionConjuntoSegmento1() {
        return validatorDescripcionConjuntoSegmento1;
    }

    public void setValidatorDescripcionConjuntoSegmento1(LengthValidator validator) {
        this.validatorDescripcionConjuntoSegmento1 = validator;
    }

    private HtmlPanelGrid gridIdClaseRecurso1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdClaseRecurso1() {
        return gridIdClaseRecurso1;
    }

    public void setGridIdClaseRecurso1(HtmlPanelGrid hpg) {
        this.gridIdClaseRecurso1 = hpg;
    }

    private Label labelIdClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso1() {
        return labelIdClaseRecurso1;
    }

    public void setLabelIdClaseRecurso1(Label l) {
        this.labelIdClaseRecurso1 = l;
    }

    private HtmlPanelGrid gridIdClaseRecurso2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdClaseRecurso2() {
        return gridIdClaseRecurso2;
    }

    public void setGridIdClaseRecurso2(HtmlPanelGrid hpg) {
        this.gridIdClaseRecurso2 = hpg;
    }

    private TextField campoIdClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecurso1() {
        return campoIdClaseRecurso1;
    }

    public void setCampoIdClaseRecurso1(TextField component) {
        this.campoIdClaseRecurso1 = component;
    }

    private Message messageIdClaseRecurso1 = new Message();

    public Message getMessageIdClaseRecurso1() {
        return messageIdClaseRecurso1;
    }

    public void setMessageIdClaseRecurso1(Message m) {
        this.messageIdClaseRecurso1 = m;
    }

    private StaticText campoIdClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecurso1Texto1() {
        return campoIdClaseRecurso1Texto1;
    }

    public void setCampoIdClaseRecurso1Texto1(StaticText component) {
        this.campoIdClaseRecurso1Texto1 = component;
    }

    private Button campoIdClaseRecurso1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecurso1Boton1() {
        return campoIdClaseRecurso1Boton1;
    }

    public void setCampoIdClaseRecurso1Boton1(Button component) {
        this.campoIdClaseRecurso1Boton1 = component;
    }

    private HtmlPanelGrid gridIdClaseRecurso3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdClaseRecurso3() {
        return gridIdClaseRecurso3;
    }

    public void setGridIdClaseRecurso3(HtmlPanelGrid hpg) {
        this.gridIdClaseRecurso3 = hpg;
    }

    private Label labelIdClaseRecurso2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso2() {
        return labelIdClaseRecurso2;
    }

    public void setLabelIdClaseRecurso2(Label l) {
        this.labelIdClaseRecurso2 = l;
    }

    private HtmlPanelGrid gridIdClaseRecurso4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridIdClaseRecurso4() {
        return gridIdClaseRecurso4;
    }

    public void setGridIdClaseRecurso4(HtmlPanelGrid hpg) {
        this.gridIdClaseRecurso4 = hpg;
    }

    private StaticText campoIdClaseRecurso1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdClaseRecurso1Texto2() {
        return campoIdClaseRecurso1Texto2;
    }

    public void setCampoIdClaseRecurso1Texto2(StaticText component) {
        this.campoIdClaseRecurso1Texto2 = component;
    }

    private Button campoIdClaseRecurso1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecurso1Boton2() {
        return campoIdClaseRecurso1Boton2;
    }

    public void setCampoIdClaseRecurso1Boton2(Button component) {
        this.campoIdClaseRecurso1Boton2 = component;
    }

    private StaticText textoMensajeCambiosPorConfirmar1 = new StaticText();

    public StaticText getTextoMensajeCambiosPorConfirmar1() {
        return textoMensajeCambiosPorConfirmar1;
    }

    public void setTextoMensajeCambiosPorConfirmar1(StaticText st) {
        this.textoMensajeCambiosPorConfirmar1 = st;
    }

    private Anchor anchor1 = new Anchor();

    public Anchor getAnchor1() {
        return anchor1;
    }

    public void setAnchor1(Anchor a) {
        this.anchor1 = a;
    }

    private Button botonIrAlPrimero2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlPrimero2() {
        return botonIrAlPrimero2;
    }

    public void setBotonIrAlPrimero2(Button component) {
        this.botonIrAlPrimero2 = component;
    }

    private Button botonIrAlAnterior2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlAnterior2() {
        return botonIrAlAnterior2;
    }

    public void setBotonIrAlAnterior2(Button component) {
        this.botonIrAlAnterior2 = component;
    }

    private Button botonIrAlSiguiente2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlSiguiente2() {
        return botonIrAlSiguiente2;
    }

    public void setBotonIrAlSiguiente2(Button component) {
        this.botonIrAlSiguiente2 = component;
    }

    private Button botonIrAlUltimo2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlUltimo2() {
        return botonIrAlUltimo2;
    }

    public void setBotonIrAlUltimo2(Button component) {
        this.botonIrAlUltimo2 = component;
    }

    private Button botonAgregar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonAgregar1() {
        return botonAgregar1;
    }

    public void setBotonAgregar1(Button component) {
        this.botonAgregar1 = component;
    }

    private DropDown listaFuncionEdicion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaFuncionEdicion1() {
        return listaFuncionEdicion1;
    }

    public void setListaFuncionEdicion1(DropDown component) {
        this.listaFuncionEdicion1 = component;
    }

    private LongConverter converterListaFuncionEdicion1 = new LongConverter();

    public LongConverter getConverterListaFuncionEdicion1() {
        return converterListaFuncionEdicion1;
    }

    public void setConverterListaFuncionEdicion1(LongConverter component) {
        this.converterListaFuncionEdicion1 = component;
    }

    private Button botonEditar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonEditar1() {
        return botonEditar1;
    }

    public void setBotonEditar1(Button component) {
        this.botonEditar1 = component;
    }

    private Button botonDeshacer1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonDeshacer1() {
        return botonDeshacer1;
    }

    public void setBotonDeshacer1(Button component) {
        this.botonDeshacer1 = component;
    }

    private Button botonEliminar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonEliminar1() {
        return botonEliminar1;
    }

    public void setBotonEliminar1(Button component) {
        this.botonEliminar1 = component;
    }

    private Button botonAplicar1 = new com.egt.core.jsf.component.Boton();

    @Override
    public Button getBotonAplicar1() {
        return botonAplicar1;
    }

    public void setBotonAplicar1(Button component) {
        this.botonAplicar1 = component;
    }

    private Button botonConfirmar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonConfirmar1() {
        return botonConfirmar1;
    }

    public void setBotonConfirmar1(Button component) {
        this.botonConfirmar1 = component;
    }

    private Button botonDescartar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonDescartar1() {
        return botonDescartar1;
    }

    public void setBotonDescartar1(Button component) {
        this.botonDescartar1 = component;
    }

    private Button botonRefrescar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRefrescar1() {
        return botonRefrescar1;
    }

    public void setBotonRefrescar1(Button component) {
        this.botonRefrescar1 = component;
    }

    private Button botonRetornar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRetornar1() {
        return botonRetornar1;
    }

    public void setBotonRetornar1(Button component) {
        this.botonRetornar1 = component;
    }

    private ImageHyperlink imageHyperlink1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink component) {
        this.imageHyperlink1 = component;
    }

    private ImageHyperlink imageHyperlink2 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink component) {
        this.imageHyperlink2 = component;
    }

    private Anchor anclaPie1 = new Anchor();

    public Anchor getAnclaPie1() {
        return anclaPie1;
    }

    public void setAnclaPie1(Anchor component) {
        this.anclaPie1 = component;
    }

    private ConjuntoSegmentoCachedRowSetDataProvider2 conjuntoSegmentoDataProvider = new ConjuntoSegmentoCachedRowSetDataProvider2();

    @Override
    public ConjuntoSegmentoCachedRowSetDataProvider2 getConjuntoSegmentoDataProvider() {
        return conjuntoSegmentoDataProvider;
    }

    public void setConjuntoSegmentoDataProvider(ConjuntoSegmentoCachedRowSetDataProvider2 crsdp) {
        this.conjuntoSegmentoDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoReferenceDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider() {
        return claseRecursoReferenceDataProvider;
    }

    public void setClaseRecursoReferenceDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ConjuntoSegmento2() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
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

    @Override
    public void preprocess() {
        this.preprocesar();
    }

    @Override
    public void prerender() {
        this.prepresentar();
    }

    @Override
    @PreDestroy
    public void destroy() {
        conjuntoSegmentoDataProvider.close();
        claseRecursoReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsulta">
    @Override
    public boolean isConsultaPendiente() {
        return this.getGestor().isConsultaPendiente();
    }

    @Override
    public void setConsultaPendiente(boolean consultaPendiente) {
        this.getGestor().setConsultaPendiente(consultaPendiente);
    }

    @Override
    public String getEtiquetaClaseDetalle() {
        return ETIQUETA_CLASE_DETALLE;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsultaConMaestro">
    public String getEtiquetaClaseMaestro() {
        return ETIQUETA_CLASE_MAESTRO;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionConjuntoSegmento asistente = new AsistentePaginaActualizacionConjuntoSegmento(this);

    public AsistentePaginaActualizacionConjuntoSegmento getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos y propiedades estandar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ConjuntoSegmento2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ConjuntoSegmento2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getConjuntoSegmentoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CONJUNTO_SEGMENTO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_CREAR_CONJUNTO_SEGMENTO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_MODIFICAR_CONJUNTO_SEGMENTO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ConjuntoSegmentoCachedRowSetDataProvider2.FUNCION_ELIMINAR_CONJUNTO_SEGMENTO;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return null;
    }

    public String getColumnaIdentificacionRecursoMaestro() {
        return null;
    }

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

    @Override
    public void consultar() {
        if (this.getContextoPeticion().getIdentificacionRecurso() != null) {
            this.getGestor().posicionar(this.getContextoPeticion().getIdentificacionRecurso());
        } else {
            this.getGestor().reposicionar();
        }

        this.setConsultaPendiente(false);
    }

    @Override
    public void posconsultar() {
        /*
         * ejecutar las funciones de consulta de los data provider "secundarios" de la pagina,
         * tales como, por ejemplo, los data provider de las listas desplegables y otros componentes,
         * que NO correspondan a recursos del tipo "Gestión Manual" (NO modificables por el usuario).
         */

        /*
         * invocar posrefrescar() para consultar los recursos del tipo "Gestión Manual".
         */
        // this.posrefrescar();
    }

    @Override
    public void posrefrescar() {
        /*
         * ejecutar las funciones de consulta de los data provider "secundarios" de la pagina,
         * tales como, por ejemplo, los data provider de las listas desplegables y otros componentes,
         * que correspondan a recursos del tipo "Gestión Manual" (modificables por el usuario).
         */
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para manejar el cursor">
    public String botonIrAlPrimero1_action() {
        this.getGestor().irAlPrimero();
        return null;
    }

    public String botonIrAlAnterior1_action() {
        this.getGestor().irAlAnterior();
        return null;
    }

    public String botonIrAlSiguiente1_action() {
        this.getGestor().irAlSiguiente();
        return null;
    }

    public String botonIrAlUltimo1_action() {
        this.getGestor().irAlUltimo();
        return null;
    }

    public String botonIrAlPrimero2_action() {
        this.getGestor().irAlPrimero();
        return null;
    }

    public String botonIrAlAnterior2_action() {
        this.getGestor().irAlAnterior();
        return null;
    }

    public String botonIrAlSiguiente2_action() {
        this.getGestor().irAlSiguiente();
        return null;
    }

    public String botonIrAlUltimo2_action() {
        this.getGestor().irAlUltimo();
        return null;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para refrescar, agregar, editar, deshacer y eliminar de la plantilla #2">
    public String botonRefrescar1_action() {
        this.getGestor().refrescar();
        return null;
    }

    public String botonAgregar1_action() {
        this.getGestor().agregar();
        return null;
    }

    public String botonEditar1_action() {
        this.getGestor().editar();
        return null;
    }

    public String botonEliminar1_action() {
        this.getGestor().eliminar();
        return null;
    }

    public String botonAplicar1_action() {
        this.getGestor().aplicar();
        return null;
    }

    public String botonDeshacer1_action() {
        this.getGestor().deshacer();
        return null;
    }

    public String botonConfirmar1_action() {
        this.getGestor().confirmar();
        return null;
    }

    public String botonDescartar1_action() {
        this.getGestor().descartar();
        return null;
    }

    public String botonRetornar1_action() {
        this.getGestor().retornar();
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para validar referencias">
    public void campoIdClaseRecurso1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecurso1_validate(context, component, value);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones de los hipervinculos">
    public String imageHyperlink1_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case1";
    }

    public String imageHyperlink2_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case2";
    }

    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
