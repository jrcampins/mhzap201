/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.web.filtro;

import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.aplicacion.web.PaginaConsultaConMaestro;
import com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.data.general.xdp2.FiltroFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.FiltroFuncionParCachedRowSetDataProvider3;
import com.egt.ejb.persistence.facade.FuncionFacadeLocal;
import com.sun.rave.faces.converter.SqlTimestampConverter;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
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
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.convert.IntegerConverter;
import javax.faces.context.FacesContext;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class FiltroFuncionPar2 extends AbstractPageBean
        implements FiltroFuncionParPageBean, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        integerRangeValidator1.setMaximum(2147483647L);
        integerRangeValidator1.setMinimum(1L);
        lengthValidator1.setMaximum(30);
        lengthValidator2.setMaximum(100);
        lengthValidator3.setMaximum(255);
        sqlTimestampConverter1.setPattern("dd/MM/yyyy");
        filtroFuncionParDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.filtroFuncionParRowSet}"));
        filtroFuncionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.filtroFuncionRowSet}"));
        recursoValorDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.recursoValorRowSet}"));
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

    private Anchor anclaPie1 = new Anchor();

    public Anchor getAnclaPie1() {
        return anclaPie1;
    }

    public void setAnclaPie1(Anchor a) {
        this.anclaPie1 = a;
    }

    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }

    private LongRangeValidator integerRangeValidator1 = new LongRangeValidator();

    public LongRangeValidator getIntegerRangeValidator1() {
        return integerRangeValidator1;
    }

    public void setIntegerRangeValidator1(LongRangeValidator lrv) {
        this.integerRangeValidator1 = lrv;
    }

    private Breadcrumbs breadcrumbs1 = new Breadcrumbs();

    public Breadcrumbs getBreadcrumbs1() {
        return breadcrumbs1;
    }

    public void setBreadcrumbs1(Breadcrumbs b) {
        this.breadcrumbs1 = b;
    }

    private HtmlPanelGrid gridPanel2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel2() {
        return gridPanel2;
    }

    public void setGridPanel2(HtmlPanelGrid hpg) {
        this.gridPanel2 = hpg;
    }

    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }

    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
    }

    private Button botonIrAlPrimero1 = new Button();

    public Button getBotonIrAlPrimero1() {
        return botonIrAlPrimero1;
    }

    public void setBotonIrAlPrimero1(Button b) {
        this.botonIrAlPrimero1 = b;
    }

    private Button botonIrAlAnterior1 = new Button();

    public Button getBotonIrAlAnterior1() {
        return botonIrAlAnterior1;
    }

    public void setBotonIrAlAnterior1(Button b) {
        this.botonIrAlAnterior1 = b;
    }

    private Button botonIrAlSiguiente1 = new Button();

    public Button getBotonIrAlSiguiente1() {
        return botonIrAlSiguiente1;
    }

    public void setBotonIrAlSiguiente1(Button b) {
        this.botonIrAlSiguiente1 = b;
    }

    private Button botonIrAlUltimo1 = new Button();

    public Button getBotonIrAlUltimo1() {
        return botonIrAlUltimo1;
    }

    public void setBotonIrAlUltimo1(Button b) {
        this.botonIrAlUltimo1 = b;
    }

    private HtmlPanelGrid gridPanel4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel4() {
        return gridPanel4;
    }

    public void setGridPanel4(HtmlPanelGrid hpg) {
        this.gridPanel4 = hpg;
    }

    private HtmlPanelGrid gridPanel5 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel5() {
        return gridPanel5;
    }

    public void setGridPanel5(HtmlPanelGrid hpg) {
        this.gridPanel5 = hpg;
    }

    private Label etiquetaIdentificacionFila1 = new Label();

    public Label getEtiquetaIdentificacionFila1() {
        return etiquetaIdentificacionFila1;
    }

    public void setEtiquetaIdentificacionFila1(Label l) {
        this.etiquetaIdentificacionFila1 = l;
    }

    private HtmlPanelGrid gridPanel6 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel6() {
        return gridPanel6;
    }

    public void setGridPanel6(HtmlPanelGrid hpg) {
        this.gridPanel6 = hpg;
    }

    private ImageComponent imagenFilaProcesada1 = new ImageComponent();

    public ImageComponent getImagenFilaProcesada1() {
        return imagenFilaProcesada1;
    }

    public void setImagenFilaProcesada1(ImageComponent ic) {
        this.imagenFilaProcesada1 = ic;
    }

    private StaticText textoIdentificacionFila1 = new StaticText();

    public StaticText getTextoIdentificacionFila1() {
        return textoIdentificacionFila1;
    }

    public void setTextoIdentificacionFila1(StaticText st) {
        this.textoIdentificacionFila1 = st;
    }

    private HtmlPanelGrid gridPanel7 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel7() {
        return gridPanel7;
    }

    public void setGridPanel7(HtmlPanelGrid hpg) {
        this.gridPanel7 = hpg;
    }

    private Label etiquetaDenominacionFilaMaestro1 = new Label();

    public Label getEtiquetaDenominacionFilaMaestro1() {
        return etiquetaDenominacionFilaMaestro1;
    }

    public void setEtiquetaDenominacionFilaMaestro1(Label l) {
        this.etiquetaDenominacionFilaMaestro1 = l;
    }

    private HtmlPanelGrid gridPanel8 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel8() {
        return gridPanel8;
    }

    public void setGridPanel8(HtmlPanelGrid hpg) {
        this.gridPanel8 = hpg;
    }

    private ImageComponent imagenFilaMaestro1 = new ImageComponent();

    public ImageComponent getImagenFilaMaestro1() {
        return imagenFilaMaestro1;
    }

    public void setImagenFilaMaestro1(ImageComponent ic) {
        this.imagenFilaMaestro1 = ic;
    }

    private StaticText textoDenominacionFilaMaestro1 = new StaticText();

    public StaticText getTextoDenominacionFilaMaestro1() {
        return textoDenominacionFilaMaestro1;
    }

    public void setTextoDenominacionFilaMaestro1(StaticText st) {
        this.textoDenominacionFilaMaestro1 = st;
    }

    private HtmlPanelGrid gridPanel9 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel9() {
        return gridPanel9;
    }

    public void setGridPanel9(HtmlPanelGrid hpg) {
        this.gridPanel9 = hpg;
    }

    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }

    private HtmlPanelGrid gridPanel10 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel10() {
        return gridPanel10;
    }

    public void setGridPanel10(HtmlPanelGrid hpg) {
        this.gridPanel10 = hpg;
    }

    private TextField textField1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }

    private Message message1 = new Message();

    public Message getMessage1() {
        return message1;
    }

    public void setMessage1(Message m) {
        this.message1 = m;
    }

    private HtmlPanelGrid gridPanel11 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel11() {
        return gridPanel11;
    }

    public void setGridPanel11(HtmlPanelGrid hpg) {
        this.gridPanel11 = hpg;
    }

    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }

    private HtmlPanelGrid gridPanel12 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel12() {
        return gridPanel12;
    }

    public void setGridPanel12(HtmlPanelGrid hpg) {
        this.gridPanel12 = hpg;
    }

    private Message message2 = new Message();

    public Message getMessage2() {
        return message2;
    }

    public void setMessage2(Message m) {
        this.message2 = m;
    }

    private HtmlPanelGrid gridPanel13 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel13() {
        return gridPanel13;
    }

    public void setGridPanel13(HtmlPanelGrid hpg) {
        this.gridPanel13 = hpg;
    }

    private Label label5 = new Label();

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label l) {
        this.label5 = l;
    }

    private HtmlPanelGrid gridPanel14 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel14() {
        return gridPanel14;
    }

    public void setGridPanel14(HtmlPanelGrid hpg) {
        this.gridPanel14 = hpg;
    }

    private Message message3 = new Message();

    public Message getMessage3() {
        return message3;
    }

    public void setMessage3(Message m) {
        this.message3 = m;
    }

    private HtmlPanelGrid gridPanel15 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel15() {
        return gridPanel15;
    }

    public void setGridPanel15(HtmlPanelGrid hpg) {
        this.gridPanel15 = hpg;
    }

    private Label label6 = new Label();

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label l) {
        this.label6 = l;
    }

    private HtmlPanelGrid gridPanel16 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel16() {
        return gridPanel16;
    }

    public void setGridPanel16(HtmlPanelGrid hpg) {
        this.gridPanel16 = hpg;
    }

    private TextArea textoSignificado1 = new TextArea();

    public TextArea getTextoSignificado1() {
        return textoSignificado1;
    }

    public void setTextoSignificado1(TextArea ta) {
        this.textoSignificado1 = ta;
    }

    private Message message4 = new Message();

    public Message getMessage4() {
        return message4;
    }

    public void setMessage4(Message m) {
        this.message4 = m;
    }

    private HtmlPanelGrid gridPanel17 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel17() {
        return gridPanel17;
    }

    public void setGridPanel17(HtmlPanelGrid hpg) {
        this.gridPanel17 = hpg;
    }

    private Label label7 = new Label();

    public Label getLabel7() {
        return label7;
    }

    public void setLabel7(Label l) {
        this.label7 = l;
    }

    private HtmlPanelGrid gridPanel18 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel18() {
        return gridPanel18;
    }

    public void setGridPanel18(HtmlPanelGrid hpg) {
        this.gridPanel18 = hpg;
    }

    private Message message5 = new Message();

    public Message getMessage5() {
        return message5;
    }

    public void setMessage5(Message m) {
        this.message5 = m;
    }

    private HtmlPanelGrid gridPanel19 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel19() {
        return gridPanel19;
    }

    public void setGridPanel19(HtmlPanelGrid hpg) {
        this.gridPanel19 = hpg;
    }

    private Label label8 = new Label();

    public Label getLabel8() {
        return label8;
    }

    public void setLabel8(Label l) {
        this.label8 = l;
    }

    private HtmlPanelGrid gridPanel20 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel20() {
        return gridPanel20;
    }

    public void setGridPanel20(HtmlPanelGrid hpg) {
        this.gridPanel20 = hpg;
    }

    private TextField textoCodigoObjeto1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getTextoCodigoObjeto1() {
        return textoCodigoObjeto1;
    }

    public void setTextoCodigoObjeto1(TextField tf) {
        this.textoCodigoObjeto1 = tf;
    }

    private Message message6 = new Message();

    public Message getMessage6() {
        return message6;
    }

    public void setMessage6(Message m) {
        this.message6 = m;
    }

    private HtmlPanelGrid gridPanel21 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel21() {
        return gridPanel21;
    }

    public void setGridPanel21(HtmlPanelGrid hpg) {
        this.gridPanel21 = hpg;
    }

    private Label label9 = new Label();

    public Label getLabel9() {
        return label9;
    }

    public void setLabel9(Label l) {
        this.label9 = l;
    }

    private HtmlPanelGrid gridPanel22 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel22() {
        return gridPanel22;
    }

    public void setGridPanel22(HtmlPanelGrid hpg) {
        this.gridPanel22 = hpg;
    }

    private TextField textoCodigoRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getTextoCodigoRecurso1() {
        return textoCodigoRecurso1;
    }

    public void setTextoCodigoRecurso1(TextField tf) {
        this.textoCodigoRecurso1 = tf;
    }

    private Message message7 = new Message();

    public Message getMessage7() {
        return message7;
    }

    public void setMessage7(Message m) {
        this.message7 = m;
    }

    private HtmlPanelGrid gridPanel23 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel23() {
        return gridPanel23;
    }

    public void setGridPanel23(HtmlPanelGrid hpg) {
        this.gridPanel23 = hpg;
    }

    private Label label10 = new Label();

    public Label getLabel10() {
        return label10;
    }

    public void setLabel10(Label l) {
        this.label10 = l;
    }

    private HtmlPanelGrid gridPanel24 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel24() {
        return gridPanel24;
    }

    public void setGridPanel24(HtmlPanelGrid hpg) {
        this.gridPanel24 = hpg;
    }

    private TextField textoValor1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getTextoValor1() {
        return textoValor1;
    }

    public void setTextoValor1(TextField tf) {
        this.textoValor1 = tf;
    }

    private Message message8 = new Message();

    public Message getMessage8() {
        return message8;
    }

    public void setMessage8(Message m) {
        this.message8 = m;
    }

    private HtmlPanelGrid gridPanel25 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel25() {
        return gridPanel25;
    }

    public void setGridPanel25(HtmlPanelGrid hpg) {
        this.gridPanel25 = hpg;
    }

    private Button botonIrAlPrimero2 = new Button();

    public Button getBotonIrAlPrimero2() {
        return botonIrAlPrimero2;
    }

    public void setBotonIrAlPrimero2(Button b) {
        this.botonIrAlPrimero2 = b;
    }

    private Button botonIrAlAnterior2 = new Button();

    public Button getBotonIrAlAnterior2() {
        return botonIrAlAnterior2;
    }

    public void setBotonIrAlAnterior2(Button b) {
        this.botonIrAlAnterior2 = b;
    }

    private Button botonIrAlSiguiente2 = new Button();

    public Button getBotonIrAlSiguiente2() {
        return botonIrAlSiguiente2;
    }

    public void setBotonIrAlSiguiente2(Button b) {
        this.botonIrAlSiguiente2 = b;
    }

    private Button botonIrAlUltimo2 = new Button();

    public Button getBotonIrAlUltimo2() {
        return botonIrAlUltimo2;
    }

    public void setBotonIrAlUltimo2(Button b) {
        this.botonIrAlUltimo2 = b;
    }

    private HtmlPanelGrid gridPanel28 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel28() {
        return gridPanel28;
    }

    public void setGridPanel28(HtmlPanelGrid hpg) {
        this.gridPanel28 = hpg;
    }

    private LengthValidator lengthValidator1 = new LengthValidator();

    public LengthValidator getLengthValidator1() {
        return lengthValidator1;
    }

    public void setLengthValidator1(LengthValidator lv) {
        this.lengthValidator1 = lv;
    }

    private LengthValidator lengthValidator2 = new LengthValidator();

    public LengthValidator getLengthValidator2() {
        return lengthValidator2;
    }

    public void setLengthValidator2(LengthValidator lv) {
        this.lengthValidator2 = lv;
    }

    private LengthValidator lengthValidator3 = new LengthValidator();

    public LengthValidator getLengthValidator3() {
        return lengthValidator3;
    }

    public void setLengthValidator3(LengthValidator lv) {
        this.lengthValidator3 = lv;
    }

    private SqlTimestampConverter sqlTimestampConverter1 = new SqlTimestampConverter();

    public SqlTimestampConverter getSqlTimestampConverter1() {
        return sqlTimestampConverter1;
    }

    public void setSqlTimestampConverter1(SqlTimestampConverter stc) {
        this.sqlTimestampConverter1 = stc;
    }

    private Script script1 = new Script();

    public Script getScript1() {
        return script1;
    }

    public void setScript1(Script s) {
        this.script1 = s;
    }

    private LongConverter longConverter1 = new LongConverter();

    public LongConverter getLongConverter1() {
        return longConverter1;
    }

    public void setLongConverter1(LongConverter lc) {
        this.longConverter1 = lc;
    }

    private LongRangeValidator longRangeValidator1 = new LongRangeValidator();

    public LongRangeValidator getLongRangeValidator1() {
        return longRangeValidator1;
    }

    public void setLongRangeValidator1(LongRangeValidator lrv) {
        this.longRangeValidator1 = lrv;
    }

    private FiltroFuncionParCachedRowSetDataProvider3 filtroFuncionParDataProvider = new FiltroFuncionParCachedRowSetDataProvider3();

    public FiltroFuncionParCachedRowSetDataProvider3 getFiltroFuncionParDataProvider() {
        return filtroFuncionParDataProvider;
    }

    public void setFiltroFuncionParDataProvider(FiltroFuncionParCachedRowSetDataProvider3 crsdp) {
        this.filtroFuncionParDataProvider = crsdp;
    }

    private FiltroFuncionCachedRowSetDataProvider2 filtroFuncionDataProvider = new FiltroFuncionCachedRowSetDataProvider2();

    public FiltroFuncionCachedRowSetDataProvider2 getFiltroFuncionDataProvider() {
        return filtroFuncionDataProvider;
    }

    public void setFiltroFuncionDataProvider(FiltroFuncionCachedRowSetDataProvider2 crsdp) {
        this.filtroFuncionDataProvider = crsdp;
    }

    private DropDown listaFuncionParametro1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaFuncionParametro1() {
        return listaFuncionParametro1;
    }

    public void setListaFuncionParametro1(DropDown dd) {
        this.listaFuncionParametro1 = dd;
    }

    private StaticText listaFuncionParametro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaFuncionParametro1Texto1() {
        return listaFuncionParametro1Texto1;
    }

    public void setListaFuncionParametro1Texto1(StaticText st) {
        this.listaFuncionParametro1Texto1 = st;
    }

    private DropDown listaOperadorCom1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaOperadorCom1() {
        return listaOperadorCom1;
    }

    public void setListaOperadorCom1(DropDown dd) {
        this.listaOperadorCom1 = dd;
    }

    private StaticText listaOperadorCom1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaOperadorCom1Texto1() {
        return listaOperadorCom1Texto1;
    }

    public void setListaOperadorCom1Texto1(StaticText st) {
        this.listaOperadorCom1Texto1 = st;
    }

    private ListaRecursoCachedRowSetDataProvider recursoValorDataProvider = new ListaRecursoCachedRowSetDataProvider();

    public ListaRecursoCachedRowSetDataProvider getRecursoValorDataProvider() {
        return recursoValorDataProvider;
    }

    public void setRecursoValorDataProvider(ListaRecursoCachedRowSetDataProvider crsdp) {
        this.recursoValorDataProvider = crsdp;
    }

    private DropDown listaValorLista1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaValorLista1() {
        return listaValorLista1;
    }

    public void setListaValorLista1(DropDown dd) {
        this.listaValorLista1 = dd;
    }

    private StaticText listaValorLista1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaValorLista1Texto1() {
        return listaValorLista1Texto1;
    }

    public void setListaValorLista1Texto1(StaticText st) {
        this.listaValorLista1Texto1 = st;
    }

    private Button textoCodigoObjeto1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getTextoCodigoObjeto1Boton1() {
        return textoCodigoObjeto1Boton1;
    }

    public void setTextoCodigoObjeto1Boton1(Button b) {
        this.textoCodigoObjeto1Boton1 = b;
    }

    private Button textoCodigoRecurso1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getTextoCodigoRecurso1Boton1() {
        return textoCodigoRecurso1Boton1;
    }

    public void setTextoCodigoRecurso1Boton1(Button b) {
        this.textoCodigoRecurso1Boton1 = b;
    }

    private HtmlPanelGrid gridPanel33 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel33() {
        return gridPanel33;
    }

    public void setGridPanel33(HtmlPanelGrid hpg) {
        this.gridPanel33 = hpg;
    }

    private HtmlPanelGrid gridPanel34 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel34() {
        return gridPanel34;
    }

    public void setGridPanel34(HtmlPanelGrid hpg) {
        this.gridPanel34 = hpg;
    }

    private Label label11 = new Label();

    public Label getLabel11() {
        return label11;
    }

    public void setLabel11(Label l) {
        this.label11 = l;
    }

    private HtmlPanelGrid gridPanel31 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel31() {
        return gridPanel31;
    }

    public void setGridPanel31(HtmlPanelGrid hpg) {
        this.gridPanel31 = hpg;
    }

    private Label label12 = new Label();

    public Label getLabel12() {
        return label12;
    }

    public void setLabel12(Label l) {
        this.label12 = l;
    }

    private HtmlPanelGrid gridPanel32 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel32() {
        return gridPanel32;
    }

    public void setGridPanel32(HtmlPanelGrid hpg) {
        this.gridPanel32 = hpg;
    }

    private StaticText textoCodigoRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getTextoCodigoRecurso1Texto1() {
        return textoCodigoRecurso1Texto1;
    }

    public void setTextoCodigoRecurso1Texto1(StaticText st) {
        this.textoCodigoRecurso1Texto1 = st;
    }

    private StaticText textoCodigoObjeto1Texto1 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getTextoCodigoObjeto1Texto1() {
        return textoCodigoObjeto1Texto1;
    }

    public void setTextoCodigoObjeto1Texto1(StaticText st) {
        this.textoCodigoObjeto1Texto1 = st;
    }

    private Button textoCodigoObjeto1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getTextoCodigoObjeto1Boton2() {
        return textoCodigoObjeto1Boton2;
    }

    public void setTextoCodigoObjeto1Boton2(Button b) {
        this.textoCodigoObjeto1Boton2 = b;
    }

    private HtmlPanelGrid gridPanel35 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel35() {
        return gridPanel35;
    }

    public void setGridPanel35(HtmlPanelGrid hpg) {
        this.gridPanel35 = hpg;
    }

    private Label label13 = new Label();

    public Label getLabel13() {
        return label13;
    }

    public void setLabel13(Label l) {
        this.label13 = l;
    }

    private HtmlPanelGrid gridPanel36 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel36() {
        return gridPanel36;
    }

    public void setGridPanel36(HtmlPanelGrid hpg) {
        this.gridPanel36 = hpg;
    }

    private DropDown listaValorRecurso1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaValorRecurso1() {
        return listaValorRecurso1;
    }

    public void setListaValorRecurso1(DropDown dd) {
        this.listaValorRecurso1 = dd;
    }

    private StaticText listaValorRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaValorRecurso1Texto1() {
        return listaValorRecurso1Texto1;
    }

    public void setListaValorRecurso1Texto1(StaticText st) {
        this.listaValorRecurso1Texto1 = st;
    }

    private Message message9 = new Message();

    public Message getMessage9() {
        return message9;
    }

    public void setMessage9(Message m) {
        this.message9 = m;
    }

    private HtmlPanelGrid gridPanel37 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel37() {
        return gridPanel37;
    }

    public void setGridPanel37(HtmlPanelGrid hpg) {
        this.gridPanel37 = hpg;
    }

    private Label label14 = new Label();

    public Label getLabel14() {
        return label14;
    }

    public void setLabel14(Label l) {
        this.label14 = l;
    }

    private HtmlPanelGrid gridPanel38 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel38() {
        return gridPanel38;
    }

    public void setGridPanel38(HtmlPanelGrid hpg) {
        this.gridPanel38 = hpg;
    }

    private Message message10 = new Message();

    public Message getMessage10() {
        return message10;
    }

    public void setMessage10(Message m) {
        this.message10 = m;
    }

    private Calendar fechaValor1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getFechaValor1() {
        return fechaValor1;
    }

    public void setFechaValor1(Calendar c) {
        this.fechaValor1 = c;
    }

    private StaticText fechaValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getFechaValor1Texto1() {
        return fechaValor1Texto1;
    }

    public void setFechaValor1Texto1(StaticText st) {
        this.fechaValor1Texto1 = st;
    }

    private HtmlPanelGrid gridPanel29 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel29() {
        return gridPanel29;
    }

    public void setGridPanel29(HtmlPanelGrid hpg) {
        this.gridPanel29 = hpg;
    }

    private Button botonAgregar1 = new Button();

    public Button getBotonAgregar1() {
        return botonAgregar1;
    }

    public void setBotonAgregar1(Button b) {
        this.botonAgregar1 = b;
    }

    private Button botonEditar1 = new Button();

    public Button getBotonEditar1() {
        return botonEditar1;
    }

    public void setBotonEditar1(Button b) {
        this.botonEditar1 = b;
    }

    private Button botonDeshacer1 = new Button();

    public Button getBotonDeshacer1() {
        return botonDeshacer1;
    }

    public void setBotonDeshacer1(Button b) {
        this.botonDeshacer1 = b;
    }

    private Button botonEliminar1 = new Button();

    public Button getBotonEliminar1() {
        return botonEliminar1;
    }

    public void setBotonEliminar1(Button b) {
        this.botonEliminar1 = b;
    }

    private Button botonAplicar1 = new Button();

    public Button getBotonAplicar1() {
        return botonAplicar1;
    }

    public void setBotonAplicar1(Button b) {
        this.botonAplicar1 = b;
    }

    private Button botonConfirmar1 = new Button();

    public Button getBotonConfirmar1() {
        return botonConfirmar1;
    }

    public void setBotonConfirmar1(Button b) {
        this.botonConfirmar1 = b;
    }

    private Button botonDescartar1 = new Button();

    public Button getBotonDescartar1() {
        return botonDescartar1;
    }

    public void setBotonDescartar1(Button b) {
        this.botonDescartar1 = b;
    }

    private Button botonRefrescar1 = new Button();

    public Button getBotonRefrescar1() {
        return botonRefrescar1;
    }

    public void setBotonRefrescar1(Button b) {
        this.botonRefrescar1 = b;
    }

    private Button botonRetornar1 = new Button();

    public Button getBotonRetornar1() {
        return botonRetornar1;
    }

    public void setBotonRetornar1(Button b) {
        this.botonRetornar1 = b;
    }

    private HtmlPanelGrid gridPanel30 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel30() {
        return gridPanel30;
    }

    public void setGridPanel30(HtmlPanelGrid hpg) {
        this.gridPanel30 = hpg;
    }

    private HtmlPanelGrid gridPanel39 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel39() {
        return gridPanel39;
    }

    public void setGridPanel39(HtmlPanelGrid hpg) {
        this.gridPanel39 = hpg;
    }

    private ImageComponent imagenMensaje1 = new ImageComponent();

    public ImageComponent getImagenMensaje1() {
        return imagenMensaje1;
    }

    public void setImagenMensaje1(ImageComponent ic) {
        this.imagenMensaje1 = ic;
    }

    private ImageHyperlink hipervinculoMensaje1 = new ImageHyperlink();

    public ImageHyperlink getHipervinculoMensaje1() {
        return hipervinculoMensaje1;
    }

    public void setHipervinculoMensaje1(ImageHyperlink ih) {
        this.hipervinculoMensaje1 = ih;
    }

    private HtmlPanelGrid gridPanel40 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel40() {
        return gridPanel40;
    }

    public void setGridPanel40(HtmlPanelGrid hpg) {
        this.gridPanel40 = hpg;
    }

    private HtmlPanelGrid gridPanel41 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel41() {
        return gridPanel41;
    }

    public void setGridPanel41(HtmlPanelGrid hpg) {
        this.gridPanel41 = hpg;
    }

    private HtmlPanelGrid gridPanel42 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel42() {
        return gridPanel42;
    }

    public void setGridPanel42(HtmlPanelGrid hpg) {
        this.gridPanel42 = hpg;
    }

    private StaticText textoMensajeCambiosPorConfirmar1 = new StaticText();

    public StaticText getTextoMensajeCambiosPorConfirmar1() {
        return textoMensajeCambiosPorConfirmar1;
    }

    public void setTextoMensajeCambiosPorConfirmar1(StaticText st) {
        this.textoMensajeCambiosPorConfirmar1 = st;
    }

    private StaticText textoTituloConsulta1 = new StaticText();

    public StaticText getTextoTituloConsulta1() {
        return textoTituloConsulta1;
    }

    public void setTextoTituloConsulta1(StaticText st) {
        this.textoTituloConsulta1 = st;
    }

    private HtmlPanelGrid gridPanel26 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel26() {
        return gridPanel26;
    }

    public void setGridPanel26(HtmlPanelGrid hpg) {
        this.gridPanel26 = hpg;
    }

    private Anchor anchor1 = new Anchor();

    public Anchor getAnchor1() {
        return anchor1;
    }

    public void setAnchor1(Anchor a) {
        this.anchor1 = a;
    }
    // </editor-fold>
/**/
    /**
     * <p>Construir una instancia de bean de pagina.</p>
     */
    public FiltroFuncionPar2() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se navega hasta esta pagina,
     * ya sea directamente mediante un URL o de manera indirecta a traves de la navegacion de paginas.
     * Puede personalizar este metodo para adquirir recursos que se necesitaran
     * para los controladores de eventos y metodos del proceso, sin tener en cuenta si esta
     * pagina realiza procesamiento de devolucion de envios.</p>
     *
     * <p>Tenga en cuenta que si la peticion actual es una devolucion de envio, los valores
     * de propiedad de los componentes <strong>no</strong> representan ningun
     * valor enviado con esta peticion.  En su lugar, representan los
     * valores de propiedades que se guardaron para esta vista cuando se proceso.</p>
     */
    @Override
    //@PostConstruct
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
     * <p>Metodo de devolucion de llamada al que se llama cuando el arbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este metodo
     * <strong>solo</strong> se llamara en una peticion de devolucion de envio que
     * este procesando el envio de un formulario.  Puede personalizar este metodo para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    @Override
    public void preprocess() {
        this.preprocesar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama justo antes del procesamiento.
     * <strong>solo</strong> se llamara a este metodo en la pagina que
     * se procesa, no se llamara, por ejemplo, en una pagina que
     * ha procesado una devolucion de envio y a continuacion ha navegado hasta otra pagina.  Puede personalizar
     * este metodo para asignar recursos necesarios para procesar
     * esta pagina.</p>
     */
    @Override
    public void prerender() {
        this.prepresentar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se completa el procesamiento de
     * esta peticion, si se llamo al metodo <code>init()</code> (sin tener en cuenta
     * si se trata de la pagina que se ha procesado o no).  Puede personalizar este
     * metodo para liberar los recursos adquiridos en los metodos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecucion de un controlador de eventos).</p>
     */
    @Override
    //@PreDestroy
    public void destroy() {
        filtroFuncionParDataProvider.close();
        filtroFuncionDataProvider.close();
        recursoValorDataProvider.close();
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
    public ContextoPeticionEstandar getContextoPeticion() {
        return (ContextoPeticionEstandar) this.getRequestBean1().getContextoPeticion();
    }

    public ContextoSesionEstandar getContextoSesion() {
        return (ContextoSesionEstandar) this.getSessionBean1().getContextoSesion();
    }

    public ContextoAplicacionEstandar getContextoAplicacion() {
        return (ContextoAplicacionEstandar) this.getApplicationBean1().getContextoAplicacion();
    }

    public String getEtiquetaMigasPan() {
        return ETIQUETA_MIGAS_PAN;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsulta">
    public boolean isConsultaPendiente() {
        return this.getGestor().isConsultaPendiente();
    }

    public void setConsultaPendiente(boolean consultaPendiente) {
        this.getGestor().setConsultaPendiente(consultaPendiente);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsultaConMaestro">
    public String getEtiquetaClaseMaestro() {
        return ETIQUETA_CLASE_MAESTRO;
    }

    public String getEtiquetaClaseDetalle() {
        return ETIQUETA_CLASE_DETALLE;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    private final static String ETIQUETA_MIGAS_PAN = "Detalle";

    private final static String ETIQUETA_CLASE_DETALLE = "Criterios";

    private final static String ETIQUETA_CLASE_MAESTRO = "del Filtro"; // "de la clase|del tipo|del segmento|en condicion|..."

    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getFiltroFuncionParDataProvider();
    }

    public long getFuncionConsultarRecurso() {
        return FiltroFuncionParCachedRowSetDataProvider3.FUNCION_CONSULTAR_FILTRO_FUNCION_PAR;
    }

    public long getFuncionCrearRecurso() {
        return FiltroFuncionParCachedRowSetDataProvider3.FUNCION_CREAR_FILTRO_FUNCION_PAR;
    }

    public long getFuncionModificarRecurso() {
        return FiltroFuncionParCachedRowSetDataProvider3.FUNCION_MODIFICAR_FILTRO_FUNCION_PAR;
    }

    public long getFuncionEliminarRecurso() {
        return FiltroFuncionParCachedRowSetDataProvider3.FUNCION_ELIMINAR_FILTRO_FUNCION_PAR;
    }

    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return this.getFiltroFuncionDataProvider();
    }

    public String getColumnaIdentificacionRecursoMaestro() {
        return FiltroFuncionParCachedRowSetDataProvider3.COLUMNA_ID_FILTRO_FUNCION;
    }

    protected void preiniciar() {
        /*
         * Esta funcion debe ejecutarse al comienzo de init(),
         * *antes* de que se inicien los componentes administrados.
         */
        this.getGestor().preiniciar();
//      if (!this.isPostBack()) {
//          listaFuncionParametro1 = new ListaDesplegable();
//          listaFuncionParametro1Texto1 = new TextoEstaticoAlternativo();
//          /**/
//          listaOperadorCom1 = new ListaDesplegable();
//          listaOperadorCom1Texto1 = new TextoEstaticoAlternativo();
//          /**/
//          listaValorLista1 = new ListaDesplegable();
//          listaValorLista1Texto1 = new TextoEstaticoAlternativo();
//          /**/
//          listaValorRecurso1 = new ListaDesplegable();
//          listaValorRecurso1Texto1 = new TextoEstaticoAlternativo();
//          /**/
//          textoCodigoObjeto1Boton1 = new BotonBuscar();
//          textoCodigoObjeto1Texto1 = new TextoEstaticoComplementario();
//          textoCodigoObjeto1Boton2 = new BotonVerDetalle();
//          /**/
//          textoCodigoRecurso1Boton1 = new BotonBuscar();
//          textoCodigoRecurso1Texto1 = new TextoEstaticoComplementario();
//          /**/
//          fechaValor1 = new Calendario();
//          fechaValor1Texto1 = new TextoEstaticoAlternativo();
//      }
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

    public void consultar() {
        if (this.getContextoPeticion().getIdentificacionRecurso() != null) {
            this.getGestor().posicionar(this.getContextoPeticion().getIdentificacionRecurso());
        } else {
            this.getGestor().reposicionar();
        }

        this.setConsultaPendiente(false);
    }

    public void posconsultar() {
    }

    public void posrefrescar() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para cursor, refrescar, agregar, editar, deshacer y eliminar de la plantilla #2">
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
/**/
    private FiltroFuncionParSidekick sidekick = new FiltroFuncionParSidekick(this);

    public FiltroFuncionParSidekick getSidekick() {
        return sidekick;
    }

    @EJB
    private FuncionFacadeLocal funcionFacade;

    public FuncionFacadeLocal getFuncionFacade() {
        return funcionFacade;
    }

    public void listaFuncionParametro1_validate(FacesContext context, UIComponent component, Object value) {
        sidekick.validateIdFuncionParametro(context, component, value);
    }

    public void textoValor1_validate(FacesContext context, UIComponent component, Object value) {
        sidekick.validateValorParametro(context, component, value);
    }

    public void textoCodigoObjeto1_validate(FacesContext context, UIComponent component, Object value) {
        sidekick.validateCodigoObjetoValor(context, component, value);
    }

    public void textoCodigoRecurso1_validate(FacesContext context, UIComponent component, Object value) {
        sidekick.validateCodigoRecursoValor(context, component, value);
    }
}
