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
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConTabla;
import com.egt.core.aplicacion.web.PaginaConsultaConFiltro;
import com.egt.core.aplicacion.web.PaginaConsultaConTabla;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
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
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;

public class ConjuntoSegmento1 extends AbstractPageBean
        implements PaginaActualizacionConjuntoSegmento, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
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

    private Table table1 = new Table();

    @Override
    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table t) {
        this.table1 = t;
    }

    private TableRowGroup tableRowGroup1 = new com.egt.core.jsf.component.GrupoFilasTabla();

    @Override
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    @Override
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }

    private TableColumn tableRowGroup1SelectionColumn = new TableColumn();

    public TableColumn getTableRowGroup1SelectionColumn() {
        return tableRowGroup1SelectionColumn;
    }

    public void setTableRowGroup1SelectionColumn(TableColumn tc) {
        this.tableRowGroup1SelectionColumn = tc;
    }

    private Checkbox checkbox1 = new Checkbox();

    @Override
    public Checkbox getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(Checkbox c) {
        this.checkbox1 = c;
    }

    private TableColumn tableColumn1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }

    private Button botonEscogerFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonEscogerFila1() {
        return botonEscogerFila1;
    }

    public void setBotonEscogerFila1(Button b) {
        this.botonEscogerFila1 = b;
    }

    private Button botonDetallarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonDetallarFila1() {
        return botonDetallarFila1;
    }

    public void setBotonDetallarFila1(Button b) {
        this.botonDetallarFila1 = b;
    }

    private Button botonRetornarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRetornarFila1() {
        return botonRetornarFila1;
    }

    public void setBotonRetornarFila1(Button b) {
        this.botonRetornarFila1 = b;
    }

    private TableColumn tableColumn2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }

    private ImageHyperlink hipervinculoAccionFila1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getHipervinculoAccionFila1() {
        return hipervinculoAccionFila1;
    }

    public void setHipervinculoAccionFila1(ImageHyperlink ih) {
        this.hipervinculoAccionFila1 = ih;
    }

    private TableColumn tableColumn3 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumn3() {
        return tableColumn3;
    }

    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }

    private ImageHyperlink hipervinculoDetallarFila1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getHipervinculoDetallarFila1() {
        return hipervinculoDetallarFila1;
    }

    public void setHipervinculoDetallarFila1(ImageHyperlink ih) {
        this.hipervinculoDetallarFila1 = ih;
    }

    private TableColumn tableColumnIdConjuntoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdConjuntoSegmento1() {
        return tableColumnIdConjuntoSegmento1;
    }

    public void setTableColumnIdConjuntoSegmento1(TableColumn component) {
        this.tableColumnIdConjuntoSegmento1 = component;
    }

    private StaticText hiddenStaticTextIdConjuntoSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextIdConjuntoSegmento1() {
        return hiddenStaticTextIdConjuntoSegmento1;
    }

    public void setHiddenStaticTextIdConjuntoSegmento1(StaticText component) {
        this.hiddenStaticTextIdConjuntoSegmento1 = component;
    }

    private Label labelIdConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdConjuntoSegmento1() {
        return labelIdConjuntoSegmento1;
    }

    public void setLabelIdConjuntoSegmento1(Label l) {
        this.labelIdConjuntoSegmento1 = l;
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

    private TableColumn tableColumnCodigoConjuntoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoConjuntoSegmento1() {
        return tableColumnCodigoConjuntoSegmento1;
    }

    public void setTableColumnCodigoConjuntoSegmento1(TableColumn component) {
        this.tableColumnCodigoConjuntoSegmento1 = component;
    }

    private StaticText hiddenStaticTextCodigoConjuntoSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextCodigoConjuntoSegmento1() {
        return hiddenStaticTextCodigoConjuntoSegmento1;
    }

    public void setHiddenStaticTextCodigoConjuntoSegmento1(StaticText component) {
        this.hiddenStaticTextCodigoConjuntoSegmento1 = component;
    }

    private Label labelCodigoConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoConjuntoSegmento1() {
        return labelCodigoConjuntoSegmento1;
    }

    public void setLabelCodigoConjuntoSegmento1(Label l) {
        this.labelCodigoConjuntoSegmento1 = l;
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

    private TableColumn tableColumnNombreConjuntoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreConjuntoSegmento1() {
        return tableColumnNombreConjuntoSegmento1;
    }

    public void setTableColumnNombreConjuntoSegmento1(TableColumn component) {
        this.tableColumnNombreConjuntoSegmento1 = component;
    }

    private StaticText hiddenStaticTextNombreConjuntoSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextNombreConjuntoSegmento1() {
        return hiddenStaticTextNombreConjuntoSegmento1;
    }

    public void setHiddenStaticTextNombreConjuntoSegmento1(StaticText component) {
        this.hiddenStaticTextNombreConjuntoSegmento1 = component;
    }

    private Label labelNombreConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreConjuntoSegmento1() {
        return labelNombreConjuntoSegmento1;
    }

    public void setLabelNombreConjuntoSegmento1(Label l) {
        this.labelNombreConjuntoSegmento1 = l;
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

    private TableColumn tableColumnDescripcionConjuntoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionConjuntoSegmento1() {
        return tableColumnDescripcionConjuntoSegmento1;
    }

    public void setTableColumnDescripcionConjuntoSegmento1(TableColumn component) {
        this.tableColumnDescripcionConjuntoSegmento1 = component;
    }

    private StaticText hiddenStaticTextDescripcionConjuntoSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextDescripcionConjuntoSegmento1() {
        return hiddenStaticTextDescripcionConjuntoSegmento1;
    }

    public void setHiddenStaticTextDescripcionConjuntoSegmento1(StaticText component) {
        this.hiddenStaticTextDescripcionConjuntoSegmento1 = component;
    }

    private Label labelDescripcionConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionConjuntoSegmento1() {
        return labelDescripcionConjuntoSegmento1;
    }

    public void setLabelDescripcionConjuntoSegmento1(Label l) {
        this.labelDescripcionConjuntoSegmento1 = l;
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

    private TableColumn tableColumnIdClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecurso1() {
        return tableColumnIdClaseRecurso1;
    }

    public void setTableColumnIdClaseRecurso1(TableColumn component) {
        this.tableColumnIdClaseRecurso1 = component;
    }

    private StaticText hiddenStaticTextIdClaseRecurso1 = new StaticText();

    public StaticText getHiddenStaticTextIdClaseRecurso1() {
        return hiddenStaticTextIdClaseRecurso1;
    }

    public void setHiddenStaticTextIdClaseRecurso1(StaticText component) {
        this.hiddenStaticTextIdClaseRecurso1 = component;
    }

    private Label labelIdClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso1() {
        return labelIdClaseRecurso1;
    }

    public void setLabelIdClaseRecurso1(Label l) {
        this.labelIdClaseRecurso1 = l;
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

    private TableColumn tableColumnIdClaseRecurso2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecurso2() {
        return tableColumnIdClaseRecurso2;
    }

    public void setTableColumnIdClaseRecurso2(TableColumn component) {
        this.tableColumnIdClaseRecurso2 = component;
    }

    private Label labelIdClaseRecurso2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso2() {
        return labelIdClaseRecurso2;
    }

    public void setLabelIdClaseRecurso2(Label l) {
        this.labelIdClaseRecurso2 = l;
    }

    private ImageHyperlink campoIdClaseRecurso1Hiper2 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdClaseRecurso1Hiper2() {
        return campoIdClaseRecurso1Hiper2;
    }

    public void setCampoIdClaseRecurso1Hiper2(ImageHyperlink component) {
        this.campoIdClaseRecurso1Hiper2 = component;
    }

    private Label etiquetaTextoFilasPorPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaTextoFilasPorPagina1() {
        return etiquetaTextoFilasPorPagina1;
    }

    public void setEtiquetaTextoFilasPorPagina1(Label l) {
        this.etiquetaTextoFilasPorPagina1 = l;
    }

    private TextField textoFilasPorPagina1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getTextoFilasPorPagina1() {
        return textoFilasPorPagina1;
    }

    public void setTextoFilasPorPagina1(TextField tf) {
        this.textoFilasPorPagina1 = tf;
    }

    private Button botonRepaginar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRepaginar1() {
        return botonRepaginar1;
    }

    public void setBotonRepaginar1(Button b) {
        this.botonRepaginar1 = b;
    }

    private Message messageFilasPorPagina1 = new Message();

    public Message getMessageFilasPorPagina1() {
        return messageFilasPorPagina1;
    }

    public void setMessageFilasPorPagina1(Message m) {
        this.messageFilasPorPagina1 = m;
    }

    private IntegerConverter textoFilasPorPagina1Converter1 = new IntegerConverter();

    public IntegerConverter getTextoFilasPorPagina1Converter1() {
        return textoFilasPorPagina1Converter1;
    }

    public void setTextoFilasPorPagina1Converter1(IntegerConverter ic) {
        this.textoFilasPorPagina1Converter1 = ic;
    }

    private LongRangeValidator textoFilasPorPagina1Validator1 = new LongRangeValidator();

    public LongRangeValidator getTextoFilasPorPagina1Validator1() {
        return textoFilasPorPagina1Validator1;
    }

    public void setTextoFilasPorPagina1Validator1(LongRangeValidator lrv) {
        this.textoFilasPorPagina1Validator1 = lrv;
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
    public ConjuntoSegmento1() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
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

    @Override
    public void preprocess() {
        this.preprocesar();
    }

    @Override
    public void prerender() {
        this.prepresentar();
    }

    @Override
    //@PreDestroy
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

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ConjuntoSegmento1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ConjuntoSegmento1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ConjuntoSegmento1_ETIQUETA_CLASE_MAESTRO");

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

    @Override
    public String getVinculoPaginaConsultaConArbol() {
        return "arbol";
    }

    @Override
    public String getVinculoPaginaConsultaDetalle() {
        return "detalle";
    }

    public String getScriptAbrirVentanaVerDetalle() {
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
        FiltroBusqueda filtro = this.getGestor().getFiltroBusqueda(
                this.getContextoPeticion().getFiltroFuncionSelect(),
                this.getContextoPeticion().getCodigoFuncionSelect(),
                this.getContextoPeticion().getNombreFuncionSelect());

        this.consultar(filtro);
    }

    @Override
    public void consultar(Long filtro) {
        try {
            this.getConjuntoSegmentoDataProvider().consultarConjuntoSegmento(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getConjuntoSegmentoDataProvider().consultarConjuntoSegmento(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
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

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para refrescar, agregar, editar, deshacer y eliminar de la plantilla #1">
    public String botonEscogerFila1_action() {
        this.getGestor().escoger();
        return null;
    }

    public String botonDetallarFila1_action() {
        if (this.getGestor().escoger()) {
            return this.getGestor().accionVincularDetalle();
        }
        return null;
    }

    public String botonRetornarFila1_action() {
        this.getGestor().retornar();
        return null;
    }

    public String hipervinculoDetallarFila1_action() {
        if (this.getGestor().escoger()) {
            return this.getGestor().accionVincularDetalle();
        }
        return null;
    }

    public String botonRepaginar1_action() {
        this.getGestor().repaginar();
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

    // <editor-fold defaultstate="collapsed" desc="metodos para validar referencias">
    public void campoIdClaseRecurso1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecurso1_validate(context, component, value);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones de los hipervinculos de la plantilla #1">
    public String hipervinculoAccionFila1_action() {
        this.getGestor().escoger();
        return null;
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
