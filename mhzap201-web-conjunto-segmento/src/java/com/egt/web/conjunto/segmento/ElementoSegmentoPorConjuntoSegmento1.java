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

import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConTabla;
import com.egt.core.aplicacion.web.PaginaConsultaConFiltro;
import com.egt.core.aplicacion.web.PaginaConsultaConMaestro;
import com.egt.core.aplicacion.web.PaginaConsultaConTabla;
import com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.data.general.xdp2.ConjuntoSegmentoCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.ElementoSegmentoCachedRowSetDataProvider3;
import com.egt.ejb.persistence.entity.ClaseRecurso;
import com.egt.ejb.persistence.entity.Funcion;
import com.egt.ejb.persistence.facade.ClaseRecursoFacadeLocal;
import com.sun.data.provider.RowKey;
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
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;

public class ElementoSegmentoPorConjuntoSegmento1 extends AbstractPageBean
        implements PaginaActualizacionElementoSegmentoPorConjuntoSegmento, PaginaConsultaConFiltro, PaginaConsultaConTabla, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdElementoSegmento1.setMinimum(0L);
        validatorIdElementoSegmento1.setMaximum(1000000000000000000L);
        validatorIdSegmento1.setMinimum(0L);
        validatorIdSegmento1.setMaximum(1000000000000000000L);
        validatorValorSegmento1.setMaximum(255);
        validatorSignificadoSegmento1.setMaximum(255);
        elementoSegmentoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.elementoSegmentoRowSet}"));
        conjuntoSegmentoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.conjuntoSegmentoRowSet}"));
        listaRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.recursoReferenceRowSet}"));
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

    private TableColumn tableColumnIdElementoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdElementoSegmento1() {
        return tableColumnIdElementoSegmento1;
    }

    public void setTableColumnIdElementoSegmento1(TableColumn component) {
        this.tableColumnIdElementoSegmento1 = component;
    }

    private StaticText hiddenStaticTextIdElementoSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextIdElementoSegmento1() {
        return hiddenStaticTextIdElementoSegmento1;
    }

    public void setHiddenStaticTextIdElementoSegmento1(StaticText component) {
        this.hiddenStaticTextIdElementoSegmento1 = component;
    }

    private Label labelIdElementoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdElementoSegmento1() {
        return labelIdElementoSegmento1;
    }

    public void setLabelIdElementoSegmento1(Label l) {
        this.labelIdElementoSegmento1 = l;
    }

    private TextField campoIdElementoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdElementoSegmento1() {
        return campoIdElementoSegmento1;
    }

    public void setCampoIdElementoSegmento1(TextField component) {
        this.campoIdElementoSegmento1 = component;
    }

    private Message messageIdElementoSegmento1 = new Message();

    public Message getMessageIdElementoSegmento1() {
        return messageIdElementoSegmento1;
    }

    public void setMessageIdElementoSegmento1(Message m) {
        this.messageIdElementoSegmento1 = m;
    }

    private StaticText campoIdElementoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdElementoSegmento1Texto1() {
        return campoIdElementoSegmento1Texto1;
    }

    public void setCampoIdElementoSegmento1Texto1(StaticText component) {
        this.campoIdElementoSegmento1Texto1 = component;
    }

    private LongConverter converterIdElementoSegmento1 = new LongConverter();

    public LongConverter getConverterIdElementoSegmento1() {
        return converterIdElementoSegmento1;
    }

    public void setConverterIdElementoSegmento1(LongConverter converter) {
        this.converterIdElementoSegmento1 = converter;
    }

    private LongRangeValidator validatorIdElementoSegmento1 = new LongRangeValidator();

    public LongRangeValidator getValidatorIdElementoSegmento1() {
        return validatorIdElementoSegmento1;
    }

    public void setValidatorIdElementoSegmento1(LongRangeValidator validator) {
        this.validatorIdElementoSegmento1 = validator;
    }

    private TableColumn tableColumnIdSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdSegmento1() {
        return tableColumnIdSegmento1;
    }

    public void setTableColumnIdSegmento1(TableColumn component) {
        this.tableColumnIdSegmento1 = component;
    }

    private StaticText hiddenStaticTextIdSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextIdSegmento1() {
        return hiddenStaticTextIdSegmento1;
    }

    public void setHiddenStaticTextIdSegmento1(StaticText component) {
        this.hiddenStaticTextIdSegmento1 = component;
    }

    private Label labelIdSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdSegmento1() {
        return labelIdSegmento1;
    }

    public void setLabelIdSegmento1(Label l) {
        this.labelIdSegmento1 = l;
    }

    private TextField campoIdSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdSegmento1() {
        return campoIdSegmento1;
    }

    public void setCampoIdSegmento1(TextField component) {
        this.campoIdSegmento1 = component;
    }

    private Message messageIdSegmento1 = new Message();

    public Message getMessageIdSegmento1() {
        return messageIdSegmento1;
    }

    public void setMessageIdSegmento1(Message m) {
        this.messageIdSegmento1 = m;
    }

    private StaticText campoIdSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdSegmento1Texto1() {
        return campoIdSegmento1Texto1;
    }

    public void setCampoIdSegmento1Texto1(StaticText component) {
        this.campoIdSegmento1Texto1 = component;
    }

    private LongConverter converterIdSegmento1 = new LongConverter();

    public LongConverter getConverterIdSegmento1() {
        return converterIdSegmento1;
    }

    public void setConverterIdSegmento1(LongConverter converter) {
        this.converterIdSegmento1 = converter;
    }

    private LongRangeValidator validatorIdSegmento1 = new LongRangeValidator();

    public LongRangeValidator getValidatorIdSegmento1() {
        return validatorIdSegmento1;
    }

    public void setValidatorIdSegmento1(LongRangeValidator validator) {
        this.validatorIdSegmento1 = validator;
    }

    private TableColumn tableColumnValorSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnValorSegmento1() {
        return tableColumnValorSegmento1;
    }

    public void setTableColumnValorSegmento1(TableColumn component) {
        this.tableColumnValorSegmento1 = component;
    }

    private StaticText hiddenStaticTextValorSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextValorSegmento1() {
        return hiddenStaticTextValorSegmento1;
    }

    public void setHiddenStaticTextValorSegmento1(StaticText component) {
        this.hiddenStaticTextValorSegmento1 = component;
    }

    private Label labelValorSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorSegmento1() {
        return labelValorSegmento1;
    }

    public void setLabelValorSegmento1(Label l) {
        this.labelValorSegmento1 = l;
    }

    private TextArea campoValorSegmento1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoValorSegmento1() {
        return campoValorSegmento1;
    }

    public void setCampoValorSegmento1(TextArea component) {
        this.campoValorSegmento1 = component;
    }

    private Message messageValorSegmento1 = new Message();

    public Message getMessageValorSegmento1() {
        return messageValorSegmento1;
    }

    public void setMessageValorSegmento1(Message m) {
        this.messageValorSegmento1 = m;
    }

    private StaticText campoValorSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorSegmento1Texto1() {
        return campoValorSegmento1Texto1;
    }

    public void setCampoValorSegmento1Texto1(StaticText component) {
        this.campoValorSegmento1Texto1 = component;
    }

    private LengthValidator validatorValorSegmento1 = new LengthValidator();

    public LengthValidator getValidatorValorSegmento1() {
        return validatorValorSegmento1;
    }

    public void setValidatorValorSegmento1(LengthValidator validator) {
        this.validatorValorSegmento1 = validator;
    }

    private TableColumn tableColumnSignificadoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnSignificadoSegmento1() {
        return tableColumnSignificadoSegmento1;
    }

    public void setTableColumnSignificadoSegmento1(TableColumn component) {
        this.tableColumnSignificadoSegmento1 = component;
    }

    private StaticText hiddenStaticTextSignificadoSegmento1 = new StaticText();

    public StaticText getHiddenStaticTextSignificadoSegmento1() {
        return hiddenStaticTextSignificadoSegmento1;
    }

    public void setHiddenStaticTextSignificadoSegmento1(StaticText component) {
        this.hiddenStaticTextSignificadoSegmento1 = component;
    }

    private Label labelSignificadoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSignificadoSegmento1() {
        return labelSignificadoSegmento1;
    }

    public void setLabelSignificadoSegmento1(Label l) {
        this.labelSignificadoSegmento1 = l;
    }

    private TextArea campoSignificadoSegmento1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoSignificadoSegmento1() {
        return campoSignificadoSegmento1;
    }

    public void setCampoSignificadoSegmento1(TextArea component) {
        this.campoSignificadoSegmento1 = component;
    }

    private Message messageSignificadoSegmento1 = new Message();

    public Message getMessageSignificadoSegmento1() {
        return messageSignificadoSegmento1;
    }

    public void setMessageSignificadoSegmento1(Message m) {
        this.messageSignificadoSegmento1 = m;
    }

    private StaticText campoSignificadoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSignificadoSegmento1Texto1() {
        return campoSignificadoSegmento1Texto1;
    }

    public void setCampoSignificadoSegmento1Texto1(StaticText component) {
        this.campoSignificadoSegmento1Texto1 = component;
    }

    private LengthValidator validatorSignificadoSegmento1 = new LengthValidator();

    public LengthValidator getValidatorSignificadoSegmento1() {
        return validatorSignificadoSegmento1;
    }

    public void setValidatorSignificadoSegmento1(LengthValidator validator) {
        this.validatorSignificadoSegmento1 = validator;
    }

    private TableColumn tableColumnIdRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdRecurso1() {
        return tableColumnIdRecurso1;
    }

    public void setTableColumnIdRecurso1(TableColumn component) {
        this.tableColumnIdRecurso1 = component;
    }

    private StaticText hiddenStaticTextIdRecurso1 = new StaticText();

    public StaticText getHiddenStaticTextIdRecurso1() {
        return hiddenStaticTextIdRecurso1;
    }

    public void setHiddenStaticTextIdRecurso1(StaticText component) {
        this.hiddenStaticTextIdRecurso1 = component;
    }

    private Label labelIdRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdRecurso1() {
        return labelIdRecurso1;
    }

    public void setLabelIdRecurso1(Label l) {
        this.labelIdRecurso1 = l;
    }

    private TextField campoIdRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdRecurso1() {
        return campoIdRecurso1;
    }

    public void setCampoIdRecurso1(TextField component) {
        this.campoIdRecurso1 = component;
    }

    private Message messageIdRecurso1 = new Message();

    public Message getMessageIdRecurso1() {
        return messageIdRecurso1;
    }

    public void setMessageIdRecurso1(Message m) {
        this.messageIdRecurso1 = m;
    }

    private StaticText campoIdRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdRecurso1Texto1() {
        return campoIdRecurso1Texto1;
    }

    public void setCampoIdRecurso1Texto1(StaticText component) {
        this.campoIdRecurso1Texto1 = component;
    }

    private Button campoIdRecurso1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdRecurso1Boton1() {
        return campoIdRecurso1Boton1;
    }

    public void setCampoIdRecurso1Boton1(Button component) {
        this.campoIdRecurso1Boton1 = component;
    }

    private TableColumn tableColumnIdRecurso2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdRecurso2() {
        return tableColumnIdRecurso2;
    }

    public void setTableColumnIdRecurso2(TableColumn component) {
        this.tableColumnIdRecurso2 = component;
    }

    private Label labelIdRecurso2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdRecurso2() {
        return labelIdRecurso2;
    }

    public void setLabelIdRecurso2(Label l) {
        this.labelIdRecurso2 = l;
    }

    private ImageHyperlink campoIdRecurso1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdRecurso1Hiper1() {
        return campoIdRecurso1Hiper1;
    }

    public void setCampoIdRecurso1Hiper1(ImageHyperlink component) {
        this.campoIdRecurso1Hiper1 = component;
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

    private Anchor anclaPie1 = new Anchor();

    public Anchor getAnclaPie1() {
        return anclaPie1;
    }

    public void setAnclaPie1(Anchor component) {
        this.anclaPie1 = component;
    }

    private ElementoSegmentoCachedRowSetDataProvider3 elementoSegmentoDataProvider = new ElementoSegmentoCachedRowSetDataProvider3();

    @Override
    public ElementoSegmentoCachedRowSetDataProvider3 getElementoSegmentoDataProvider() {
        return elementoSegmentoDataProvider;
    }

    public void setElementoSegmentoDataProvider(ElementoSegmentoCachedRowSetDataProvider3 crsdp) {
        this.elementoSegmentoDataProvider = crsdp;
    }

    private ConjuntoSegmentoCachedRowSetDataProvider2 conjuntoSegmentoDataProvider = new ConjuntoSegmentoCachedRowSetDataProvider2();

    @Override
    public ConjuntoSegmentoCachedRowSetDataProvider2 getConjuntoSegmentoDataProvider() {
        return conjuntoSegmentoDataProvider;
    }

    public void setConjuntoSegmentoDataProvider(ConjuntoSegmentoCachedRowSetDataProvider2 crsdp) {
        this.conjuntoSegmentoDataProvider = crsdp;
    }

    private ListaRecursoCachedRowSetDataProvider listaRecursoDataProvider = new ListaRecursoCachedRowSetDataProvider();

    @Override
    public ListaRecursoCachedRowSetDataProvider getListaRecursoReferenceDataProvider() {
        return listaRecursoDataProvider;
    }

    public void setListaRecursoReferenceDataProvider(ListaRecursoCachedRowSetDataProvider crsdp) {
        this.listaRecursoDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ElementoSegmentoPorConjuntoSegmento1() {
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
        elementoSegmentoDataProvider.close();
        conjuntoSegmentoDataProvider.close();
        listaRecursoDataProvider.close();
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
    @Override
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
    private AsistentePaginaActualizacionElementoSegmentoPorConjuntoSegmento asistente = new AsistentePaginaActualizacionElementoSegmentoPorConjuntoSegmento(this);

    public AsistentePaginaActualizacionElementoSegmentoPorConjuntoSegmento getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos y propiedades estandar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ElementoSegmentoPorConjuntoSegmento1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ElementoSegmentoPorConjuntoSegmento1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ElementoSegmentoPorConjuntoSegmento1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getElementoSegmentoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ElementoSegmentoCachedRowSetDataProvider3.FUNCION_CONSULTAR_ELEMENTO_SEGMENTO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ElementoSegmentoCachedRowSetDataProvider3.FUNCION_CREAR_ELEMENTO_SEGMENTO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ElementoSegmentoCachedRowSetDataProvider3.FUNCION_MODIFICAR_ELEMENTO_SEGMENTO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ElementoSegmentoCachedRowSetDataProvider3.FUNCION_ELIMINAR_ELEMENTO_SEGMENTO;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    @Override
    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return this.getConjuntoSegmentoDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return ElementoSegmentoCachedRowSetDataProvider3.COLUMNA_ID_CONJUNTO_SEGMENTO;
    }

    @Override
    public String getVinculoPaginaConsultaConArbol() {
        return "arbol";
    }

    @Override
    public String getVinculoPaginaConsultaDetalle() {
//      return "detalle";
        return null;
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
        if (this.getGestor().isRetruque()) {
        } else {
            this.consultarRecurso();
        }
        this.setRecursoCombinadoDataProvider();
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
            this.getElementoSegmentoDataProvider().consultarElementoSegmento(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getElementoSegmentoDataProvider().consultarElementoSegmento(filtro);
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
        this.posrefrescar();
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
    public void campoIdRecurso1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdRecurso1_validate(context, component, value);
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

    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";

    @EJB
    ClaseRecursoFacadeLocal claseRecursoFacade;

    private void consultarRecurso() {
        this.getGestor().track("consultarRecurso");
        try {
            this.initRecursoCombinadoSessionBean1();
            RowKey rowKey = this.getConjuntoSegmentoDataProvider().getFilaEscogida();
            this.getGestor().track("consultarRecurso", rowKey);
            if (this.getConjuntoSegmentoDataProvider().isRowAvailable(rowKey)) {
                Long clase = this.getConjuntoSegmentoDataProvider().getIdClaseRecurso(rowKey);
                this.getGestor().track("consultarRecurso", rowKey, clase);
                if (clase == null) {
                    this.getListaRecursoReferenceDataProvider().setComandoEmptyCachedRowSet();
                } else {
                    ClaseRecurso claseRecurso = claseRecursoFacade.find(clase);
                    this.getGestor().track("consultarRecurso", rowKey, clase, claseRecurso);
                    if (claseRecurso == null) {
                        this.getListaRecursoReferenceDataProvider().setComandoEmptyCachedRowSet();
                    } else {
                        Funcion funcion = claseRecurso.getFuncionIdFuncionSeleccion();
                        this.getGestor().track("consultarRecurso", rowKey, clase, claseRecurso, funcion);
                        if (funcion == null) {
                            this.getListaRecursoReferenceDataProvider().setComandoEmptyCachedRowSet();
                        } else {
                            this.getListaRecursoReferenceDataProvider().setLimiteFilasFuncionSelect(0); // sin límite de filas (por si acaso son mas de 250)
                            this.getListaRecursoReferenceDataProvider().ejecutarFuncionSelect(funcion.getIdFuncion().longValue());
                            this.setRecursoCombinadoSessionBean1();
                        }
                    }
                }
            } else {
                this.getListaRecursoReferenceDataProvider().setComandoEmptyCachedRowSet();
            }
            this.getGestor().track("consultarRecurso", "RowCount=" + this.getListaRecursoReferenceDataProvider().getRowCount());
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void initRecursoCombinadoSessionBean1() {
        this.getSessionBean1().setTablaRecursoCombinado(null);
        this.getSessionBean1().setColumnaIdentificacionRecursoCombinado(null);
        this.getSessionBean1().setColumnaCodigoRecursoCombinado(null);
        this.getSessionBean1().setColumnaNombreRecursoCombinado(null);
    }

    private void setRecursoCombinadoSessionBean1() {
        this.getSessionBean1().setTablaRecursoCombinado(
            this.getListaRecursoReferenceDataProvider().getCodigoDominioRecurso());
        this.getSessionBean1().setColumnaIdentificacionRecursoCombinado(
            this.getListaRecursoReferenceDataProvider().getColumnaIdentificacionRecurso());
        this.getSessionBean1().setColumnaCodigoRecursoCombinado(
            this.getListaRecursoReferenceDataProvider().getColumnaCodigoRecurso());
        this.getSessionBean1().setColumnaNombreRecursoCombinado(
            this.getListaRecursoReferenceDataProvider().getColumnaNombreRecurso());
    }

    private void setRecursoCombinadoDataProvider() {
        this.getElementoSegmentoDataProvider().setTablaRecursoCombinado(
            this.getSessionBean1().getTablaRecursoCombinado());
        this.getElementoSegmentoDataProvider().setColumnaIdentificacionRecursoCombinado(
            this.getSessionBean1().getColumnaIdentificacionRecursoCombinado());
        this.getElementoSegmentoDataProvider().setColumnaCodigoRecursoCombinado(
            this.getSessionBean1().getColumnaCodigoRecursoCombinado());
        this.getElementoSegmentoDataProvider().setColumnaNombreRecursoCombinado(
            this.getSessionBean1().getColumnaNombreRecursoCombinado());
    }

}
