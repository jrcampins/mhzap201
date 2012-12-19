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

import com.egt.data.specific.xdp2.LogImpPerCachedRowSetDataProvider2;
import com.egt.base.constants.CBM2;
import com.egt.base.constants.URX2;
import com.egt.base.util.BundleWebui;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConArbol;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConTabla;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.egt.core.aplicacion.web.PaginaActualizacionConAccionMultiple;
import com.egt.core.aplicacion.web.PaginaActualizacionConEdicionMultiple;
import com.egt.core.aplicacion.web.PaginaConsultaConArbol;
import com.egt.core.aplicacion.web.PaginaConsultaConFiltro;
import com.egt.core.aplicacion.web.PaginaConsultaConMaestro;
import com.egt.core.aplicacion.web.PaginaConsultaConTabla;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.enums.EnumOpcionZumNodo;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.sun.rave.faces.converter.SqlTimestampConverter;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.Checkbox;
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
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Tree;
import com.sun.webui.jsf.component.Upload;
import com.sun.webui.jsf.model.Option;
import java.io.File;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.convert.NumberConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.DoubleRangeValidator;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;
import javax.faces.validator.ValidatorException;

public class LogImpPer5 extends AbstractPageBean
        implements PaginaActualizacionLogImpPer, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogImpPer1.setMinimum(0L);
        validatorIdLogImpPer1.setMaximum(1000000000000000000L);
        validatorP01a1.setMaximum(8160);
        validatorP01b1.setMaximum(8160);
        validatorP01c1.setMaximum(8160);
        validatorP01d1.setMaximum(8160);
        validatorP021.setMaximum(8160);
        validatorP031.setMaximum(8160);
        validatorP1041.setMaximum(8160);
        validatorP431.setMaximum(8160);
        validatorP45a1.setMaximum(8160);
        validatorP45b1.setMaximum(8160);
        validatorP44a1.setMaximum(8160);
        validatorP44b1.setMaximum(8160);
        validatorVar000011.setMaximum(8160);
        validatorVar000021.setMaximum(8160);
        validatorP461.setMaximum(8160);
        validatorP471.setMaximum(8160);
        validatorVar000301.setMaximum(8160);
        validatorP481.setMaximum(8160);
        validatorP491.setMaximum(8160);
        validatorP50a1.setMaximum(8160);
        validatorP50b1.setMaximum(8160);
        validatorP50c1.setMaximum(8160);
        validatorP511.setMaximum(8160);
        validatorVar000031.setMaximum(8160);
        validatorVar000041.setMaximum(8160);
        validatorP52d1.setMaximum(8160);
        validatorP52m1.setMaximum(8160);
        validatorP52a1.setMaximum(8160);
        validatorP53a1.setMaximum(8160);
        validatorP53b1.setMaximum(8160);
        validatorP53c1.setMaximum(8160);
        validatorP53z1.setMaximum(8160);
        validatorP541.setMaximum(8160);
        validatorP54e1.setMaximum(8160);
        validatorP561.setMaximum(8160);
        validatorP581.setMaximum(8160);
        validatorP58e1.setMaximum(8160);
        validatorP591.setMaximum(8160);
        validatorP601.setMaximum(8160);
        validatorP611.setMaximum(8160);
        validatorP621.setMaximum(8160);
        validatorP631.setMaximum(8160);
        validatorP641.setMaximum(8160);
        validatorP651.setMaximum(8160);
        validatorP65e1.setMaximum(8160);
        validatorP661.setMaximum(8160);
        validatorP66e1.setMaximum(8160);
        validatorP671.setMaximum(8160);
        validatorP681.setMaximum(8160);
        validatorP68e1.setMaximum(8160);
        validatorP731.setMaximum(8160);
        validatorP741.setMaximum(8160);
        validatorVar000061.setMaximum(8160);
        validatorVar000071.setMaximum(8160);
        validatorVar000081.setMaximum(8160);
        validatorVar000091.setMaximum(8160);
        validatorVar000101.setMaximum(8160);
        validatorVar000111.setMaximum(8160);
        validatorVar000311.setMaximum(8160);
        validatorVar000121.setMaximum(8160);
        validatorVar000131.setMaximum(8160);
        validatorP861.setMaximum(8160);
        validatorP871.setMaximum(8160);
        validatorP87e1.setMaximum(8160);
        validatorP881.setMaximum(8160);
        validatorP88e1.setMaximum(8160);
        validatorP911.setMaximum(8160);
        validatorVar000171.setMaximum(8160);
        validatorVar000181.setMaximum(8160);
        validatorVar000191.setMaximum(8160);
        validatorVar000201.setMaximum(8160);
        validatorVar000211.setMaximum(8160);
        validatorVar000221.setMaximum(8160);
        validatorVar000231.setMaximum(8160);
        validatorVar000241.setMaximum(8160);
        validatorVar000251.setMaximum(8160);
        validatorVar000261.setMaximum(8160);
        validatorVar000271.setMaximum(8160);
        validatorVar000281.setMaximum(8160);
        validatorP921.setMaximum(8160);
        validatorIcv1.setMaximum(8160);
        validatorFichaActiva1.setMaximum(8160);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        validatorNombreArchivo1.setMaximum(8160);
        validatorCodigoArchivo1.setMaximum(8160);
        logImpPerDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logImpPerRowSet}"));
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

    private Button botonProcesarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesarFila1() {
        return botonProcesarFila1;
    }

    public void setBotonProcesarFila1(Button b) {
        this.botonProcesarFila1 = b;
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

    private TableColumn tableColumnIdLogImpPer1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogImpPer1() {
        return tableColumnIdLogImpPer1;
    }

    public void setTableColumnIdLogImpPer1(TableColumn component) {
        this.tableColumnIdLogImpPer1 = component;
    }

    private Label labelIdLogImpPer1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogImpPer1() {
        return labelIdLogImpPer1;
    }

    public void setLabelIdLogImpPer1(Label l) {
        this.labelIdLogImpPer1 = l;
    }

    private TextField campoIdLogImpPer1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogImpPer1() {
        return campoIdLogImpPer1;
    }

    public void setCampoIdLogImpPer1(TextField component) {
        this.campoIdLogImpPer1 = component;
    }

    private StaticText campoIdLogImpPer1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogImpPer1Texto1() {
        return campoIdLogImpPer1Texto1;
    }

    public void setCampoIdLogImpPer1Texto1(StaticText component) {
        this.campoIdLogImpPer1Texto1 = component;
    }

    private LongConverter converterIdLogImpPer1 = new LongConverter();
  
    public LongConverter getConverterIdLogImpPer1() {
        return converterIdLogImpPer1;
    }
  
    public void setConverterIdLogImpPer1(LongConverter converter) {
        this.converterIdLogImpPer1 = converter;
    }
  
    private LongRangeValidator validatorIdLogImpPer1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogImpPer1() {
        return validatorIdLogImpPer1;
    }
  
    public void setValidatorIdLogImpPer1(LongRangeValidator validator) {
        this.validatorIdLogImpPer1 = validator;
    }
  
    private TableColumn tableColumnP01a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP01a1() {
        return tableColumnP01a1;
    }

    public void setTableColumnP01a1(TableColumn component) {
        this.tableColumnP01a1 = component;
    }

    private Label labelP01a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01a1() {
        return labelP01a1;
    }

    public void setLabelP01a1(Label l) {
        this.labelP01a1 = l;
    }

    private TextArea campoP01a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01a1() {
        return campoP01a1;
    }

    public void setCampoP01a1(TextArea component) {
        this.campoP01a1 = component;
    }

    private StaticText campoP01a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01a1Texto1() {
        return campoP01a1Texto1;
    }

    public void setCampoP01a1Texto1(StaticText component) {
        this.campoP01a1Texto1 = component;
    }

    private LengthValidator validatorP01a1 = new LengthValidator();
  
    public LengthValidator getValidatorP01a1() {
        return validatorP01a1;
    }
  
    public void setValidatorP01a1(LengthValidator validator) {
        this.validatorP01a1 = validator;
    }
  
    private TableColumn tableColumnP01b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP01b1() {
        return tableColumnP01b1;
    }

    public void setTableColumnP01b1(TableColumn component) {
        this.tableColumnP01b1 = component;
    }

    private Label labelP01b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01b1() {
        return labelP01b1;
    }

    public void setLabelP01b1(Label l) {
        this.labelP01b1 = l;
    }

    private TextArea campoP01b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01b1() {
        return campoP01b1;
    }

    public void setCampoP01b1(TextArea component) {
        this.campoP01b1 = component;
    }

    private StaticText campoP01b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01b1Texto1() {
        return campoP01b1Texto1;
    }

    public void setCampoP01b1Texto1(StaticText component) {
        this.campoP01b1Texto1 = component;
    }

    private LengthValidator validatorP01b1 = new LengthValidator();
  
    public LengthValidator getValidatorP01b1() {
        return validatorP01b1;
    }
  
    public void setValidatorP01b1(LengthValidator validator) {
        this.validatorP01b1 = validator;
    }
  
    private TableColumn tableColumnP01c1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP01c1() {
        return tableColumnP01c1;
    }

    public void setTableColumnP01c1(TableColumn component) {
        this.tableColumnP01c1 = component;
    }

    private Label labelP01c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01c1() {
        return labelP01c1;
    }

    public void setLabelP01c1(Label l) {
        this.labelP01c1 = l;
    }

    private TextArea campoP01c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01c1() {
        return campoP01c1;
    }

    public void setCampoP01c1(TextArea component) {
        this.campoP01c1 = component;
    }

    private StaticText campoP01c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01c1Texto1() {
        return campoP01c1Texto1;
    }

    public void setCampoP01c1Texto1(StaticText component) {
        this.campoP01c1Texto1 = component;
    }

    private LengthValidator validatorP01c1 = new LengthValidator();
  
    public LengthValidator getValidatorP01c1() {
        return validatorP01c1;
    }
  
    public void setValidatorP01c1(LengthValidator validator) {
        this.validatorP01c1 = validator;
    }
  
    private TableColumn tableColumnP01d1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP01d1() {
        return tableColumnP01d1;
    }

    public void setTableColumnP01d1(TableColumn component) {
        this.tableColumnP01d1 = component;
    }

    private Label labelP01d1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01d1() {
        return labelP01d1;
    }

    public void setLabelP01d1(Label l) {
        this.labelP01d1 = l;
    }

    private TextArea campoP01d1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01d1() {
        return campoP01d1;
    }

    public void setCampoP01d1(TextArea component) {
        this.campoP01d1 = component;
    }

    private StaticText campoP01d1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01d1Texto1() {
        return campoP01d1Texto1;
    }

    public void setCampoP01d1Texto1(StaticText component) {
        this.campoP01d1Texto1 = component;
    }

    private LengthValidator validatorP01d1 = new LengthValidator();
  
    public LengthValidator getValidatorP01d1() {
        return validatorP01d1;
    }
  
    public void setValidatorP01d1(LengthValidator validator) {
        this.validatorP01d1 = validator;
    }
  
    private TableColumn tableColumnP021 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP021() {
        return tableColumnP021;
    }

    public void setTableColumnP021(TableColumn component) {
        this.tableColumnP021 = component;
    }

    private Label labelP021 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP021() {
        return labelP021;
    }

    public void setLabelP021(Label l) {
        this.labelP021 = l;
    }

    private TextArea campoP021 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP021() {
        return campoP021;
    }

    public void setCampoP021(TextArea component) {
        this.campoP021 = component;
    }

    private StaticText campoP021Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP021Texto1() {
        return campoP021Texto1;
    }

    public void setCampoP021Texto1(StaticText component) {
        this.campoP021Texto1 = component;
    }

    private LengthValidator validatorP021 = new LengthValidator();
  
    public LengthValidator getValidatorP021() {
        return validatorP021;
    }
  
    public void setValidatorP021(LengthValidator validator) {
        this.validatorP021 = validator;
    }
  
    private TableColumn tableColumnP031 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP031() {
        return tableColumnP031;
    }

    public void setTableColumnP031(TableColumn component) {
        this.tableColumnP031 = component;
    }

    private Label labelP031 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP031() {
        return labelP031;
    }

    public void setLabelP031(Label l) {
        this.labelP031 = l;
    }

    private TextArea campoP031 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP031() {
        return campoP031;
    }

    public void setCampoP031(TextArea component) {
        this.campoP031 = component;
    }

    private StaticText campoP031Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP031Texto1() {
        return campoP031Texto1;
    }

    public void setCampoP031Texto1(StaticText component) {
        this.campoP031Texto1 = component;
    }

    private LengthValidator validatorP031 = new LengthValidator();
  
    public LengthValidator getValidatorP031() {
        return validatorP031;
    }
  
    public void setValidatorP031(LengthValidator validator) {
        this.validatorP031 = validator;
    }
  
    private TableColumn tableColumnP1041 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP1041() {
        return tableColumnP1041;
    }

    public void setTableColumnP1041(TableColumn component) {
        this.tableColumnP1041 = component;
    }

    private Label labelP1041 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP1041() {
        return labelP1041;
    }

    public void setLabelP1041(Label l) {
        this.labelP1041 = l;
    }

    private TextArea campoP1041 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP1041() {
        return campoP1041;
    }

    public void setCampoP1041(TextArea component) {
        this.campoP1041 = component;
    }

    private StaticText campoP1041Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP1041Texto1() {
        return campoP1041Texto1;
    }

    public void setCampoP1041Texto1(StaticText component) {
        this.campoP1041Texto1 = component;
    }

    private LengthValidator validatorP1041 = new LengthValidator();
  
    public LengthValidator getValidatorP1041() {
        return validatorP1041;
    }
  
    public void setValidatorP1041(LengthValidator validator) {
        this.validatorP1041 = validator;
    }
  
    private TableColumn tableColumnP431 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP431() {
        return tableColumnP431;
    }

    public void setTableColumnP431(TableColumn component) {
        this.tableColumnP431 = component;
    }

    private Label labelP431 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP431() {
        return labelP431;
    }

    public void setLabelP431(Label l) {
        this.labelP431 = l;
    }

    private TextArea campoP431 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP431() {
        return campoP431;
    }

    public void setCampoP431(TextArea component) {
        this.campoP431 = component;
    }

    private StaticText campoP431Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP431Texto1() {
        return campoP431Texto1;
    }

    public void setCampoP431Texto1(StaticText component) {
        this.campoP431Texto1 = component;
    }

    private LengthValidator validatorP431 = new LengthValidator();
  
    public LengthValidator getValidatorP431() {
        return validatorP431;
    }
  
    public void setValidatorP431(LengthValidator validator) {
        this.validatorP431 = validator;
    }
  
    private TableColumn tableColumnP45a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP45a1() {
        return tableColumnP45a1;
    }

    public void setTableColumnP45a1(TableColumn component) {
        this.tableColumnP45a1 = component;
    }

    private Label labelP45a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP45a1() {
        return labelP45a1;
    }

    public void setLabelP45a1(Label l) {
        this.labelP45a1 = l;
    }

    private TextArea campoP45a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP45a1() {
        return campoP45a1;
    }

    public void setCampoP45a1(TextArea component) {
        this.campoP45a1 = component;
    }

    private StaticText campoP45a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP45a1Texto1() {
        return campoP45a1Texto1;
    }

    public void setCampoP45a1Texto1(StaticText component) {
        this.campoP45a1Texto1 = component;
    }

    private LengthValidator validatorP45a1 = new LengthValidator();
  
    public LengthValidator getValidatorP45a1() {
        return validatorP45a1;
    }
  
    public void setValidatorP45a1(LengthValidator validator) {
        this.validatorP45a1 = validator;
    }
  
    private TableColumn tableColumnP45b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP45b1() {
        return tableColumnP45b1;
    }

    public void setTableColumnP45b1(TableColumn component) {
        this.tableColumnP45b1 = component;
    }

    private Label labelP45b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP45b1() {
        return labelP45b1;
    }

    public void setLabelP45b1(Label l) {
        this.labelP45b1 = l;
    }

    private TextArea campoP45b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP45b1() {
        return campoP45b1;
    }

    public void setCampoP45b1(TextArea component) {
        this.campoP45b1 = component;
    }

    private StaticText campoP45b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP45b1Texto1() {
        return campoP45b1Texto1;
    }

    public void setCampoP45b1Texto1(StaticText component) {
        this.campoP45b1Texto1 = component;
    }

    private LengthValidator validatorP45b1 = new LengthValidator();
  
    public LengthValidator getValidatorP45b1() {
        return validatorP45b1;
    }
  
    public void setValidatorP45b1(LengthValidator validator) {
        this.validatorP45b1 = validator;
    }
  
    private TableColumn tableColumnP44a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP44a1() {
        return tableColumnP44a1;
    }

    public void setTableColumnP44a1(TableColumn component) {
        this.tableColumnP44a1 = component;
    }

    private Label labelP44a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP44a1() {
        return labelP44a1;
    }

    public void setLabelP44a1(Label l) {
        this.labelP44a1 = l;
    }

    private TextArea campoP44a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP44a1() {
        return campoP44a1;
    }

    public void setCampoP44a1(TextArea component) {
        this.campoP44a1 = component;
    }

    private StaticText campoP44a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP44a1Texto1() {
        return campoP44a1Texto1;
    }

    public void setCampoP44a1Texto1(StaticText component) {
        this.campoP44a1Texto1 = component;
    }

    private LengthValidator validatorP44a1 = new LengthValidator();
  
    public LengthValidator getValidatorP44a1() {
        return validatorP44a1;
    }
  
    public void setValidatorP44a1(LengthValidator validator) {
        this.validatorP44a1 = validator;
    }
  
    private TableColumn tableColumnP44b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP44b1() {
        return tableColumnP44b1;
    }

    public void setTableColumnP44b1(TableColumn component) {
        this.tableColumnP44b1 = component;
    }

    private Label labelP44b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP44b1() {
        return labelP44b1;
    }

    public void setLabelP44b1(Label l) {
        this.labelP44b1 = l;
    }

    private TextArea campoP44b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP44b1() {
        return campoP44b1;
    }

    public void setCampoP44b1(TextArea component) {
        this.campoP44b1 = component;
    }

    private StaticText campoP44b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP44b1Texto1() {
        return campoP44b1Texto1;
    }

    public void setCampoP44b1Texto1(StaticText component) {
        this.campoP44b1Texto1 = component;
    }

    private LengthValidator validatorP44b1 = new LengthValidator();
  
    public LengthValidator getValidatorP44b1() {
        return validatorP44b1;
    }
  
    public void setValidatorP44b1(LengthValidator validator) {
        this.validatorP44b1 = validator;
    }
  
    private TableColumn tableColumnVar000011 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000011() {
        return tableColumnVar000011;
    }

    public void setTableColumnVar000011(TableColumn component) {
        this.tableColumnVar000011 = component;
    }

    private Label labelVar000011 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000011() {
        return labelVar000011;
    }

    public void setLabelVar000011(Label l) {
        this.labelVar000011 = l;
    }

    private TextArea campoVar000011 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000011() {
        return campoVar000011;
    }

    public void setCampoVar000011(TextArea component) {
        this.campoVar000011 = component;
    }

    private StaticText campoVar000011Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000011Texto1() {
        return campoVar000011Texto1;
    }

    public void setCampoVar000011Texto1(StaticText component) {
        this.campoVar000011Texto1 = component;
    }

    private LengthValidator validatorVar000011 = new LengthValidator();
  
    public LengthValidator getValidatorVar000011() {
        return validatorVar000011;
    }
  
    public void setValidatorVar000011(LengthValidator validator) {
        this.validatorVar000011 = validator;
    }
  
    private TableColumn tableColumnVar000021 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000021() {
        return tableColumnVar000021;
    }

    public void setTableColumnVar000021(TableColumn component) {
        this.tableColumnVar000021 = component;
    }

    private Label labelVar000021 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000021() {
        return labelVar000021;
    }

    public void setLabelVar000021(Label l) {
        this.labelVar000021 = l;
    }

    private TextArea campoVar000021 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000021() {
        return campoVar000021;
    }

    public void setCampoVar000021(TextArea component) {
        this.campoVar000021 = component;
    }

    private StaticText campoVar000021Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000021Texto1() {
        return campoVar000021Texto1;
    }

    public void setCampoVar000021Texto1(StaticText component) {
        this.campoVar000021Texto1 = component;
    }

    private LengthValidator validatorVar000021 = new LengthValidator();
  
    public LengthValidator getValidatorVar000021() {
        return validatorVar000021;
    }
  
    public void setValidatorVar000021(LengthValidator validator) {
        this.validatorVar000021 = validator;
    }
  
    private TableColumn tableColumnP461 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP461() {
        return tableColumnP461;
    }

    public void setTableColumnP461(TableColumn component) {
        this.tableColumnP461 = component;
    }

    private Label labelP461 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP461() {
        return labelP461;
    }

    public void setLabelP461(Label l) {
        this.labelP461 = l;
    }

    private TextArea campoP461 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP461() {
        return campoP461;
    }

    public void setCampoP461(TextArea component) {
        this.campoP461 = component;
    }

    private StaticText campoP461Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP461Texto1() {
        return campoP461Texto1;
    }

    public void setCampoP461Texto1(StaticText component) {
        this.campoP461Texto1 = component;
    }

    private LengthValidator validatorP461 = new LengthValidator();
  
    public LengthValidator getValidatorP461() {
        return validatorP461;
    }
  
    public void setValidatorP461(LengthValidator validator) {
        this.validatorP461 = validator;
    }
  
    private TableColumn tableColumnP471 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP471() {
        return tableColumnP471;
    }

    public void setTableColumnP471(TableColumn component) {
        this.tableColumnP471 = component;
    }

    private Label labelP471 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP471() {
        return labelP471;
    }

    public void setLabelP471(Label l) {
        this.labelP471 = l;
    }

    private TextArea campoP471 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP471() {
        return campoP471;
    }

    public void setCampoP471(TextArea component) {
        this.campoP471 = component;
    }

    private StaticText campoP471Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP471Texto1() {
        return campoP471Texto1;
    }

    public void setCampoP471Texto1(StaticText component) {
        this.campoP471Texto1 = component;
    }

    private LengthValidator validatorP471 = new LengthValidator();
  
    public LengthValidator getValidatorP471() {
        return validatorP471;
    }
  
    public void setValidatorP471(LengthValidator validator) {
        this.validatorP471 = validator;
    }
  
    private TableColumn tableColumnVar000301 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000301() {
        return tableColumnVar000301;
    }

    public void setTableColumnVar000301(TableColumn component) {
        this.tableColumnVar000301 = component;
    }

    private Label labelVar000301 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000301() {
        return labelVar000301;
    }

    public void setLabelVar000301(Label l) {
        this.labelVar000301 = l;
    }

    private TextArea campoVar000301 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000301() {
        return campoVar000301;
    }

    public void setCampoVar000301(TextArea component) {
        this.campoVar000301 = component;
    }

    private StaticText campoVar000301Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000301Texto1() {
        return campoVar000301Texto1;
    }

    public void setCampoVar000301Texto1(StaticText component) {
        this.campoVar000301Texto1 = component;
    }

    private LengthValidator validatorVar000301 = new LengthValidator();
  
    public LengthValidator getValidatorVar000301() {
        return validatorVar000301;
    }
  
    public void setValidatorVar000301(LengthValidator validator) {
        this.validatorVar000301 = validator;
    }
  
    private TableColumn tableColumnP481 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP481() {
        return tableColumnP481;
    }

    public void setTableColumnP481(TableColumn component) {
        this.tableColumnP481 = component;
    }

    private Label labelP481 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP481() {
        return labelP481;
    }

    public void setLabelP481(Label l) {
        this.labelP481 = l;
    }

    private TextArea campoP481 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP481() {
        return campoP481;
    }

    public void setCampoP481(TextArea component) {
        this.campoP481 = component;
    }

    private StaticText campoP481Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP481Texto1() {
        return campoP481Texto1;
    }

    public void setCampoP481Texto1(StaticText component) {
        this.campoP481Texto1 = component;
    }

    private LengthValidator validatorP481 = new LengthValidator();
  
    public LengthValidator getValidatorP481() {
        return validatorP481;
    }
  
    public void setValidatorP481(LengthValidator validator) {
        this.validatorP481 = validator;
    }
  
    private TableColumn tableColumnP491 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP491() {
        return tableColumnP491;
    }

    public void setTableColumnP491(TableColumn component) {
        this.tableColumnP491 = component;
    }

    private Label labelP491 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP491() {
        return labelP491;
    }

    public void setLabelP491(Label l) {
        this.labelP491 = l;
    }

    private TextArea campoP491 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP491() {
        return campoP491;
    }

    public void setCampoP491(TextArea component) {
        this.campoP491 = component;
    }

    private StaticText campoP491Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP491Texto1() {
        return campoP491Texto1;
    }

    public void setCampoP491Texto1(StaticText component) {
        this.campoP491Texto1 = component;
    }

    private LengthValidator validatorP491 = new LengthValidator();
  
    public LengthValidator getValidatorP491() {
        return validatorP491;
    }
  
    public void setValidatorP491(LengthValidator validator) {
        this.validatorP491 = validator;
    }
  
    private TableColumn tableColumnP50a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP50a1() {
        return tableColumnP50a1;
    }

    public void setTableColumnP50a1(TableColumn component) {
        this.tableColumnP50a1 = component;
    }

    private Label labelP50a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP50a1() {
        return labelP50a1;
    }

    public void setLabelP50a1(Label l) {
        this.labelP50a1 = l;
    }

    private TextArea campoP50a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP50a1() {
        return campoP50a1;
    }

    public void setCampoP50a1(TextArea component) {
        this.campoP50a1 = component;
    }

    private StaticText campoP50a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP50a1Texto1() {
        return campoP50a1Texto1;
    }

    public void setCampoP50a1Texto1(StaticText component) {
        this.campoP50a1Texto1 = component;
    }

    private LengthValidator validatorP50a1 = new LengthValidator();
  
    public LengthValidator getValidatorP50a1() {
        return validatorP50a1;
    }
  
    public void setValidatorP50a1(LengthValidator validator) {
        this.validatorP50a1 = validator;
    }
  
    private TableColumn tableColumnP50b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP50b1() {
        return tableColumnP50b1;
    }

    public void setTableColumnP50b1(TableColumn component) {
        this.tableColumnP50b1 = component;
    }

    private Label labelP50b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP50b1() {
        return labelP50b1;
    }

    public void setLabelP50b1(Label l) {
        this.labelP50b1 = l;
    }

    private TextArea campoP50b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP50b1() {
        return campoP50b1;
    }

    public void setCampoP50b1(TextArea component) {
        this.campoP50b1 = component;
    }

    private StaticText campoP50b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP50b1Texto1() {
        return campoP50b1Texto1;
    }

    public void setCampoP50b1Texto1(StaticText component) {
        this.campoP50b1Texto1 = component;
    }

    private LengthValidator validatorP50b1 = new LengthValidator();
  
    public LengthValidator getValidatorP50b1() {
        return validatorP50b1;
    }
  
    public void setValidatorP50b1(LengthValidator validator) {
        this.validatorP50b1 = validator;
    }
  
    private TableColumn tableColumnP50c1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP50c1() {
        return tableColumnP50c1;
    }

    public void setTableColumnP50c1(TableColumn component) {
        this.tableColumnP50c1 = component;
    }

    private Label labelP50c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP50c1() {
        return labelP50c1;
    }

    public void setLabelP50c1(Label l) {
        this.labelP50c1 = l;
    }

    private TextArea campoP50c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP50c1() {
        return campoP50c1;
    }

    public void setCampoP50c1(TextArea component) {
        this.campoP50c1 = component;
    }

    private StaticText campoP50c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP50c1Texto1() {
        return campoP50c1Texto1;
    }

    public void setCampoP50c1Texto1(StaticText component) {
        this.campoP50c1Texto1 = component;
    }

    private LengthValidator validatorP50c1 = new LengthValidator();
  
    public LengthValidator getValidatorP50c1() {
        return validatorP50c1;
    }
  
    public void setValidatorP50c1(LengthValidator validator) {
        this.validatorP50c1 = validator;
    }
  
    private TableColumn tableColumnP511 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP511() {
        return tableColumnP511;
    }

    public void setTableColumnP511(TableColumn component) {
        this.tableColumnP511 = component;
    }

    private Label labelP511 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP511() {
        return labelP511;
    }

    public void setLabelP511(Label l) {
        this.labelP511 = l;
    }

    private TextArea campoP511 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP511() {
        return campoP511;
    }

    public void setCampoP511(TextArea component) {
        this.campoP511 = component;
    }

    private StaticText campoP511Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP511Texto1() {
        return campoP511Texto1;
    }

    public void setCampoP511Texto1(StaticText component) {
        this.campoP511Texto1 = component;
    }

    private LengthValidator validatorP511 = new LengthValidator();
  
    public LengthValidator getValidatorP511() {
        return validatorP511;
    }
  
    public void setValidatorP511(LengthValidator validator) {
        this.validatorP511 = validator;
    }
  
    private TableColumn tableColumnVar000031 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000031() {
        return tableColumnVar000031;
    }

    public void setTableColumnVar000031(TableColumn component) {
        this.tableColumnVar000031 = component;
    }

    private Label labelVar000031 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000031() {
        return labelVar000031;
    }

    public void setLabelVar000031(Label l) {
        this.labelVar000031 = l;
    }

    private TextArea campoVar000031 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000031() {
        return campoVar000031;
    }

    public void setCampoVar000031(TextArea component) {
        this.campoVar000031 = component;
    }

    private StaticText campoVar000031Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000031Texto1() {
        return campoVar000031Texto1;
    }

    public void setCampoVar000031Texto1(StaticText component) {
        this.campoVar000031Texto1 = component;
    }

    private LengthValidator validatorVar000031 = new LengthValidator();
  
    public LengthValidator getValidatorVar000031() {
        return validatorVar000031;
    }
  
    public void setValidatorVar000031(LengthValidator validator) {
        this.validatorVar000031 = validator;
    }
  
    private TableColumn tableColumnVar000041 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000041() {
        return tableColumnVar000041;
    }

    public void setTableColumnVar000041(TableColumn component) {
        this.tableColumnVar000041 = component;
    }

    private Label labelVar000041 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000041() {
        return labelVar000041;
    }

    public void setLabelVar000041(Label l) {
        this.labelVar000041 = l;
    }

    private TextArea campoVar000041 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000041() {
        return campoVar000041;
    }

    public void setCampoVar000041(TextArea component) {
        this.campoVar000041 = component;
    }

    private StaticText campoVar000041Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000041Texto1() {
        return campoVar000041Texto1;
    }

    public void setCampoVar000041Texto1(StaticText component) {
        this.campoVar000041Texto1 = component;
    }

    private LengthValidator validatorVar000041 = new LengthValidator();
  
    public LengthValidator getValidatorVar000041() {
        return validatorVar000041;
    }
  
    public void setValidatorVar000041(LengthValidator validator) {
        this.validatorVar000041 = validator;
    }
  
    private TableColumn tableColumnP52d1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP52d1() {
        return tableColumnP52d1;
    }

    public void setTableColumnP52d1(TableColumn component) {
        this.tableColumnP52d1 = component;
    }

    private Label labelP52d1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP52d1() {
        return labelP52d1;
    }

    public void setLabelP52d1(Label l) {
        this.labelP52d1 = l;
    }

    private TextArea campoP52d1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP52d1() {
        return campoP52d1;
    }

    public void setCampoP52d1(TextArea component) {
        this.campoP52d1 = component;
    }

    private StaticText campoP52d1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP52d1Texto1() {
        return campoP52d1Texto1;
    }

    public void setCampoP52d1Texto1(StaticText component) {
        this.campoP52d1Texto1 = component;
    }

    private LengthValidator validatorP52d1 = new LengthValidator();
  
    public LengthValidator getValidatorP52d1() {
        return validatorP52d1;
    }
  
    public void setValidatorP52d1(LengthValidator validator) {
        this.validatorP52d1 = validator;
    }
  
    private TableColumn tableColumnP52m1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP52m1() {
        return tableColumnP52m1;
    }

    public void setTableColumnP52m1(TableColumn component) {
        this.tableColumnP52m1 = component;
    }

    private Label labelP52m1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP52m1() {
        return labelP52m1;
    }

    public void setLabelP52m1(Label l) {
        this.labelP52m1 = l;
    }

    private TextArea campoP52m1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP52m1() {
        return campoP52m1;
    }

    public void setCampoP52m1(TextArea component) {
        this.campoP52m1 = component;
    }

    private StaticText campoP52m1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP52m1Texto1() {
        return campoP52m1Texto1;
    }

    public void setCampoP52m1Texto1(StaticText component) {
        this.campoP52m1Texto1 = component;
    }

    private LengthValidator validatorP52m1 = new LengthValidator();
  
    public LengthValidator getValidatorP52m1() {
        return validatorP52m1;
    }
  
    public void setValidatorP52m1(LengthValidator validator) {
        this.validatorP52m1 = validator;
    }
  
    private TableColumn tableColumnP52a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP52a1() {
        return tableColumnP52a1;
    }

    public void setTableColumnP52a1(TableColumn component) {
        this.tableColumnP52a1 = component;
    }

    private Label labelP52a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP52a1() {
        return labelP52a1;
    }

    public void setLabelP52a1(Label l) {
        this.labelP52a1 = l;
    }

    private TextArea campoP52a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP52a1() {
        return campoP52a1;
    }

    public void setCampoP52a1(TextArea component) {
        this.campoP52a1 = component;
    }

    private StaticText campoP52a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP52a1Texto1() {
        return campoP52a1Texto1;
    }

    public void setCampoP52a1Texto1(StaticText component) {
        this.campoP52a1Texto1 = component;
    }

    private LengthValidator validatorP52a1 = new LengthValidator();
  
    public LengthValidator getValidatorP52a1() {
        return validatorP52a1;
    }
  
    public void setValidatorP52a1(LengthValidator validator) {
        this.validatorP52a1 = validator;
    }
  
    private TableColumn tableColumnP53a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP53a1() {
        return tableColumnP53a1;
    }

    public void setTableColumnP53a1(TableColumn component) {
        this.tableColumnP53a1 = component;
    }

    private Label labelP53a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP53a1() {
        return labelP53a1;
    }

    public void setLabelP53a1(Label l) {
        this.labelP53a1 = l;
    }

    private TextArea campoP53a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP53a1() {
        return campoP53a1;
    }

    public void setCampoP53a1(TextArea component) {
        this.campoP53a1 = component;
    }

    private StaticText campoP53a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP53a1Texto1() {
        return campoP53a1Texto1;
    }

    public void setCampoP53a1Texto1(StaticText component) {
        this.campoP53a1Texto1 = component;
    }

    private LengthValidator validatorP53a1 = new LengthValidator();
  
    public LengthValidator getValidatorP53a1() {
        return validatorP53a1;
    }
  
    public void setValidatorP53a1(LengthValidator validator) {
        this.validatorP53a1 = validator;
    }
  
    private TableColumn tableColumnP53b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP53b1() {
        return tableColumnP53b1;
    }

    public void setTableColumnP53b1(TableColumn component) {
        this.tableColumnP53b1 = component;
    }

    private Label labelP53b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP53b1() {
        return labelP53b1;
    }

    public void setLabelP53b1(Label l) {
        this.labelP53b1 = l;
    }

    private TextArea campoP53b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP53b1() {
        return campoP53b1;
    }

    public void setCampoP53b1(TextArea component) {
        this.campoP53b1 = component;
    }

    private StaticText campoP53b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP53b1Texto1() {
        return campoP53b1Texto1;
    }

    public void setCampoP53b1Texto1(StaticText component) {
        this.campoP53b1Texto1 = component;
    }

    private LengthValidator validatorP53b1 = new LengthValidator();
  
    public LengthValidator getValidatorP53b1() {
        return validatorP53b1;
    }
  
    public void setValidatorP53b1(LengthValidator validator) {
        this.validatorP53b1 = validator;
    }
  
    private TableColumn tableColumnP53c1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP53c1() {
        return tableColumnP53c1;
    }

    public void setTableColumnP53c1(TableColumn component) {
        this.tableColumnP53c1 = component;
    }

    private Label labelP53c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP53c1() {
        return labelP53c1;
    }

    public void setLabelP53c1(Label l) {
        this.labelP53c1 = l;
    }

    private TextArea campoP53c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP53c1() {
        return campoP53c1;
    }

    public void setCampoP53c1(TextArea component) {
        this.campoP53c1 = component;
    }

    private StaticText campoP53c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP53c1Texto1() {
        return campoP53c1Texto1;
    }

    public void setCampoP53c1Texto1(StaticText component) {
        this.campoP53c1Texto1 = component;
    }

    private LengthValidator validatorP53c1 = new LengthValidator();
  
    public LengthValidator getValidatorP53c1() {
        return validatorP53c1;
    }
  
    public void setValidatorP53c1(LengthValidator validator) {
        this.validatorP53c1 = validator;
    }
  
    private TableColumn tableColumnP53z1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP53z1() {
        return tableColumnP53z1;
    }

    public void setTableColumnP53z1(TableColumn component) {
        this.tableColumnP53z1 = component;
    }

    private Label labelP53z1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP53z1() {
        return labelP53z1;
    }

    public void setLabelP53z1(Label l) {
        this.labelP53z1 = l;
    }

    private TextArea campoP53z1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP53z1() {
        return campoP53z1;
    }

    public void setCampoP53z1(TextArea component) {
        this.campoP53z1 = component;
    }

    private StaticText campoP53z1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP53z1Texto1() {
        return campoP53z1Texto1;
    }

    public void setCampoP53z1Texto1(StaticText component) {
        this.campoP53z1Texto1 = component;
    }

    private LengthValidator validatorP53z1 = new LengthValidator();
  
    public LengthValidator getValidatorP53z1() {
        return validatorP53z1;
    }
  
    public void setValidatorP53z1(LengthValidator validator) {
        this.validatorP53z1 = validator;
    }
  
    private TableColumn tableColumnP541 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP541() {
        return tableColumnP541;
    }

    public void setTableColumnP541(TableColumn component) {
        this.tableColumnP541 = component;
    }

    private Label labelP541 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP541() {
        return labelP541;
    }

    public void setLabelP541(Label l) {
        this.labelP541 = l;
    }

    private TextArea campoP541 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP541() {
        return campoP541;
    }

    public void setCampoP541(TextArea component) {
        this.campoP541 = component;
    }

    private StaticText campoP541Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP541Texto1() {
        return campoP541Texto1;
    }

    public void setCampoP541Texto1(StaticText component) {
        this.campoP541Texto1 = component;
    }

    private LengthValidator validatorP541 = new LengthValidator();
  
    public LengthValidator getValidatorP541() {
        return validatorP541;
    }
  
    public void setValidatorP541(LengthValidator validator) {
        this.validatorP541 = validator;
    }
  
    private TableColumn tableColumnP54e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP54e1() {
        return tableColumnP54e1;
    }

    public void setTableColumnP54e1(TableColumn component) {
        this.tableColumnP54e1 = component;
    }

    private Label labelP54e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP54e1() {
        return labelP54e1;
    }

    public void setLabelP54e1(Label l) {
        this.labelP54e1 = l;
    }

    private TextArea campoP54e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP54e1() {
        return campoP54e1;
    }

    public void setCampoP54e1(TextArea component) {
        this.campoP54e1 = component;
    }

    private StaticText campoP54e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP54e1Texto1() {
        return campoP54e1Texto1;
    }

    public void setCampoP54e1Texto1(StaticText component) {
        this.campoP54e1Texto1 = component;
    }

    private LengthValidator validatorP54e1 = new LengthValidator();
  
    public LengthValidator getValidatorP54e1() {
        return validatorP54e1;
    }
  
    public void setValidatorP54e1(LengthValidator validator) {
        this.validatorP54e1 = validator;
    }
  
    private TableColumn tableColumnP561 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP561() {
        return tableColumnP561;
    }

    public void setTableColumnP561(TableColumn component) {
        this.tableColumnP561 = component;
    }

    private Label labelP561 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP561() {
        return labelP561;
    }

    public void setLabelP561(Label l) {
        this.labelP561 = l;
    }

    private TextArea campoP561 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP561() {
        return campoP561;
    }

    public void setCampoP561(TextArea component) {
        this.campoP561 = component;
    }

    private StaticText campoP561Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP561Texto1() {
        return campoP561Texto1;
    }

    public void setCampoP561Texto1(StaticText component) {
        this.campoP561Texto1 = component;
    }

    private LengthValidator validatorP561 = new LengthValidator();
  
    public LengthValidator getValidatorP561() {
        return validatorP561;
    }
  
    public void setValidatorP561(LengthValidator validator) {
        this.validatorP561 = validator;
    }
  
    private TableColumn tableColumnP581 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP581() {
        return tableColumnP581;
    }

    public void setTableColumnP581(TableColumn component) {
        this.tableColumnP581 = component;
    }

    private Label labelP581 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP581() {
        return labelP581;
    }

    public void setLabelP581(Label l) {
        this.labelP581 = l;
    }

    private TextArea campoP581 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP581() {
        return campoP581;
    }

    public void setCampoP581(TextArea component) {
        this.campoP581 = component;
    }

    private StaticText campoP581Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP581Texto1() {
        return campoP581Texto1;
    }

    public void setCampoP581Texto1(StaticText component) {
        this.campoP581Texto1 = component;
    }

    private LengthValidator validatorP581 = new LengthValidator();
  
    public LengthValidator getValidatorP581() {
        return validatorP581;
    }
  
    public void setValidatorP581(LengthValidator validator) {
        this.validatorP581 = validator;
    }
  
    private TableColumn tableColumnP58e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP58e1() {
        return tableColumnP58e1;
    }

    public void setTableColumnP58e1(TableColumn component) {
        this.tableColumnP58e1 = component;
    }

    private Label labelP58e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP58e1() {
        return labelP58e1;
    }

    public void setLabelP58e1(Label l) {
        this.labelP58e1 = l;
    }

    private TextArea campoP58e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP58e1() {
        return campoP58e1;
    }

    public void setCampoP58e1(TextArea component) {
        this.campoP58e1 = component;
    }

    private StaticText campoP58e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP58e1Texto1() {
        return campoP58e1Texto1;
    }

    public void setCampoP58e1Texto1(StaticText component) {
        this.campoP58e1Texto1 = component;
    }

    private LengthValidator validatorP58e1 = new LengthValidator();
  
    public LengthValidator getValidatorP58e1() {
        return validatorP58e1;
    }
  
    public void setValidatorP58e1(LengthValidator validator) {
        this.validatorP58e1 = validator;
    }
  
    private TableColumn tableColumnP591 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP591() {
        return tableColumnP591;
    }

    public void setTableColumnP591(TableColumn component) {
        this.tableColumnP591 = component;
    }

    private Label labelP591 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP591() {
        return labelP591;
    }

    public void setLabelP591(Label l) {
        this.labelP591 = l;
    }

    private TextArea campoP591 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP591() {
        return campoP591;
    }

    public void setCampoP591(TextArea component) {
        this.campoP591 = component;
    }

    private StaticText campoP591Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP591Texto1() {
        return campoP591Texto1;
    }

    public void setCampoP591Texto1(StaticText component) {
        this.campoP591Texto1 = component;
    }

    private LengthValidator validatorP591 = new LengthValidator();
  
    public LengthValidator getValidatorP591() {
        return validatorP591;
    }
  
    public void setValidatorP591(LengthValidator validator) {
        this.validatorP591 = validator;
    }
  
    private TableColumn tableColumnP601 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP601() {
        return tableColumnP601;
    }

    public void setTableColumnP601(TableColumn component) {
        this.tableColumnP601 = component;
    }

    private Label labelP601 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP601() {
        return labelP601;
    }

    public void setLabelP601(Label l) {
        this.labelP601 = l;
    }

    private TextArea campoP601 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP601() {
        return campoP601;
    }

    public void setCampoP601(TextArea component) {
        this.campoP601 = component;
    }

    private StaticText campoP601Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP601Texto1() {
        return campoP601Texto1;
    }

    public void setCampoP601Texto1(StaticText component) {
        this.campoP601Texto1 = component;
    }

    private LengthValidator validatorP601 = new LengthValidator();
  
    public LengthValidator getValidatorP601() {
        return validatorP601;
    }
  
    public void setValidatorP601(LengthValidator validator) {
        this.validatorP601 = validator;
    }
  
    private TableColumn tableColumnP611 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP611() {
        return tableColumnP611;
    }

    public void setTableColumnP611(TableColumn component) {
        this.tableColumnP611 = component;
    }

    private Label labelP611 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP611() {
        return labelP611;
    }

    public void setLabelP611(Label l) {
        this.labelP611 = l;
    }

    private TextArea campoP611 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP611() {
        return campoP611;
    }

    public void setCampoP611(TextArea component) {
        this.campoP611 = component;
    }

    private StaticText campoP611Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP611Texto1() {
        return campoP611Texto1;
    }

    public void setCampoP611Texto1(StaticText component) {
        this.campoP611Texto1 = component;
    }

    private LengthValidator validatorP611 = new LengthValidator();
  
    public LengthValidator getValidatorP611() {
        return validatorP611;
    }
  
    public void setValidatorP611(LengthValidator validator) {
        this.validatorP611 = validator;
    }
  
    private TableColumn tableColumnP621 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP621() {
        return tableColumnP621;
    }

    public void setTableColumnP621(TableColumn component) {
        this.tableColumnP621 = component;
    }

    private Label labelP621 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP621() {
        return labelP621;
    }

    public void setLabelP621(Label l) {
        this.labelP621 = l;
    }

    private TextArea campoP621 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP621() {
        return campoP621;
    }

    public void setCampoP621(TextArea component) {
        this.campoP621 = component;
    }

    private StaticText campoP621Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP621Texto1() {
        return campoP621Texto1;
    }

    public void setCampoP621Texto1(StaticText component) {
        this.campoP621Texto1 = component;
    }

    private LengthValidator validatorP621 = new LengthValidator();
  
    public LengthValidator getValidatorP621() {
        return validatorP621;
    }
  
    public void setValidatorP621(LengthValidator validator) {
        this.validatorP621 = validator;
    }
  
    private TableColumn tableColumnP631 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP631() {
        return tableColumnP631;
    }

    public void setTableColumnP631(TableColumn component) {
        this.tableColumnP631 = component;
    }

    private Label labelP631 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP631() {
        return labelP631;
    }

    public void setLabelP631(Label l) {
        this.labelP631 = l;
    }

    private TextArea campoP631 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP631() {
        return campoP631;
    }

    public void setCampoP631(TextArea component) {
        this.campoP631 = component;
    }

    private StaticText campoP631Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP631Texto1() {
        return campoP631Texto1;
    }

    public void setCampoP631Texto1(StaticText component) {
        this.campoP631Texto1 = component;
    }

    private LengthValidator validatorP631 = new LengthValidator();
  
    public LengthValidator getValidatorP631() {
        return validatorP631;
    }
  
    public void setValidatorP631(LengthValidator validator) {
        this.validatorP631 = validator;
    }
  
    private TableColumn tableColumnP641 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP641() {
        return tableColumnP641;
    }

    public void setTableColumnP641(TableColumn component) {
        this.tableColumnP641 = component;
    }

    private Label labelP641 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP641() {
        return labelP641;
    }

    public void setLabelP641(Label l) {
        this.labelP641 = l;
    }

    private TextArea campoP641 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP641() {
        return campoP641;
    }

    public void setCampoP641(TextArea component) {
        this.campoP641 = component;
    }

    private StaticText campoP641Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP641Texto1() {
        return campoP641Texto1;
    }

    public void setCampoP641Texto1(StaticText component) {
        this.campoP641Texto1 = component;
    }

    private LengthValidator validatorP641 = new LengthValidator();
  
    public LengthValidator getValidatorP641() {
        return validatorP641;
    }
  
    public void setValidatorP641(LengthValidator validator) {
        this.validatorP641 = validator;
    }
  
    private TableColumn tableColumnP651 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP651() {
        return tableColumnP651;
    }

    public void setTableColumnP651(TableColumn component) {
        this.tableColumnP651 = component;
    }

    private Label labelP651 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP651() {
        return labelP651;
    }

    public void setLabelP651(Label l) {
        this.labelP651 = l;
    }

    private TextArea campoP651 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP651() {
        return campoP651;
    }

    public void setCampoP651(TextArea component) {
        this.campoP651 = component;
    }

    private StaticText campoP651Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP651Texto1() {
        return campoP651Texto1;
    }

    public void setCampoP651Texto1(StaticText component) {
        this.campoP651Texto1 = component;
    }

    private LengthValidator validatorP651 = new LengthValidator();
  
    public LengthValidator getValidatorP651() {
        return validatorP651;
    }
  
    public void setValidatorP651(LengthValidator validator) {
        this.validatorP651 = validator;
    }
  
    private TableColumn tableColumnP65e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP65e1() {
        return tableColumnP65e1;
    }

    public void setTableColumnP65e1(TableColumn component) {
        this.tableColumnP65e1 = component;
    }

    private Label labelP65e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP65e1() {
        return labelP65e1;
    }

    public void setLabelP65e1(Label l) {
        this.labelP65e1 = l;
    }

    private TextArea campoP65e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP65e1() {
        return campoP65e1;
    }

    public void setCampoP65e1(TextArea component) {
        this.campoP65e1 = component;
    }

    private StaticText campoP65e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP65e1Texto1() {
        return campoP65e1Texto1;
    }

    public void setCampoP65e1Texto1(StaticText component) {
        this.campoP65e1Texto1 = component;
    }

    private LengthValidator validatorP65e1 = new LengthValidator();
  
    public LengthValidator getValidatorP65e1() {
        return validatorP65e1;
    }
  
    public void setValidatorP65e1(LengthValidator validator) {
        this.validatorP65e1 = validator;
    }
  
    private TableColumn tableColumnP661 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP661() {
        return tableColumnP661;
    }

    public void setTableColumnP661(TableColumn component) {
        this.tableColumnP661 = component;
    }

    private Label labelP661 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP661() {
        return labelP661;
    }

    public void setLabelP661(Label l) {
        this.labelP661 = l;
    }

    private TextArea campoP661 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP661() {
        return campoP661;
    }

    public void setCampoP661(TextArea component) {
        this.campoP661 = component;
    }

    private StaticText campoP661Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP661Texto1() {
        return campoP661Texto1;
    }

    public void setCampoP661Texto1(StaticText component) {
        this.campoP661Texto1 = component;
    }

    private LengthValidator validatorP661 = new LengthValidator();
  
    public LengthValidator getValidatorP661() {
        return validatorP661;
    }
  
    public void setValidatorP661(LengthValidator validator) {
        this.validatorP661 = validator;
    }
  
    private TableColumn tableColumnP66e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP66e1() {
        return tableColumnP66e1;
    }

    public void setTableColumnP66e1(TableColumn component) {
        this.tableColumnP66e1 = component;
    }

    private Label labelP66e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP66e1() {
        return labelP66e1;
    }

    public void setLabelP66e1(Label l) {
        this.labelP66e1 = l;
    }

    private TextArea campoP66e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP66e1() {
        return campoP66e1;
    }

    public void setCampoP66e1(TextArea component) {
        this.campoP66e1 = component;
    }

    private StaticText campoP66e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP66e1Texto1() {
        return campoP66e1Texto1;
    }

    public void setCampoP66e1Texto1(StaticText component) {
        this.campoP66e1Texto1 = component;
    }

    private LengthValidator validatorP66e1 = new LengthValidator();
  
    public LengthValidator getValidatorP66e1() {
        return validatorP66e1;
    }
  
    public void setValidatorP66e1(LengthValidator validator) {
        this.validatorP66e1 = validator;
    }
  
    private TableColumn tableColumnP671 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP671() {
        return tableColumnP671;
    }

    public void setTableColumnP671(TableColumn component) {
        this.tableColumnP671 = component;
    }

    private Label labelP671 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP671() {
        return labelP671;
    }

    public void setLabelP671(Label l) {
        this.labelP671 = l;
    }

    private TextArea campoP671 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP671() {
        return campoP671;
    }

    public void setCampoP671(TextArea component) {
        this.campoP671 = component;
    }

    private StaticText campoP671Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP671Texto1() {
        return campoP671Texto1;
    }

    public void setCampoP671Texto1(StaticText component) {
        this.campoP671Texto1 = component;
    }

    private LengthValidator validatorP671 = new LengthValidator();
  
    public LengthValidator getValidatorP671() {
        return validatorP671;
    }
  
    public void setValidatorP671(LengthValidator validator) {
        this.validatorP671 = validator;
    }
  
    private TableColumn tableColumnP681 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP681() {
        return tableColumnP681;
    }

    public void setTableColumnP681(TableColumn component) {
        this.tableColumnP681 = component;
    }

    private Label labelP681 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP681() {
        return labelP681;
    }

    public void setLabelP681(Label l) {
        this.labelP681 = l;
    }

    private TextArea campoP681 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP681() {
        return campoP681;
    }

    public void setCampoP681(TextArea component) {
        this.campoP681 = component;
    }

    private StaticText campoP681Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP681Texto1() {
        return campoP681Texto1;
    }

    public void setCampoP681Texto1(StaticText component) {
        this.campoP681Texto1 = component;
    }

    private LengthValidator validatorP681 = new LengthValidator();
  
    public LengthValidator getValidatorP681() {
        return validatorP681;
    }
  
    public void setValidatorP681(LengthValidator validator) {
        this.validatorP681 = validator;
    }
  
    private TableColumn tableColumnP68e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP68e1() {
        return tableColumnP68e1;
    }

    public void setTableColumnP68e1(TableColumn component) {
        this.tableColumnP68e1 = component;
    }

    private Label labelP68e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP68e1() {
        return labelP68e1;
    }

    public void setLabelP68e1(Label l) {
        this.labelP68e1 = l;
    }

    private TextArea campoP68e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP68e1() {
        return campoP68e1;
    }

    public void setCampoP68e1(TextArea component) {
        this.campoP68e1 = component;
    }

    private StaticText campoP68e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP68e1Texto1() {
        return campoP68e1Texto1;
    }

    public void setCampoP68e1Texto1(StaticText component) {
        this.campoP68e1Texto1 = component;
    }

    private LengthValidator validatorP68e1 = new LengthValidator();
  
    public LengthValidator getValidatorP68e1() {
        return validatorP68e1;
    }
  
    public void setValidatorP68e1(LengthValidator validator) {
        this.validatorP68e1 = validator;
    }
  
    private TableColumn tableColumnP731 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP731() {
        return tableColumnP731;
    }

    public void setTableColumnP731(TableColumn component) {
        this.tableColumnP731 = component;
    }

    private Label labelP731 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP731() {
        return labelP731;
    }

    public void setLabelP731(Label l) {
        this.labelP731 = l;
    }

    private TextArea campoP731 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP731() {
        return campoP731;
    }

    public void setCampoP731(TextArea component) {
        this.campoP731 = component;
    }

    private StaticText campoP731Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP731Texto1() {
        return campoP731Texto1;
    }

    public void setCampoP731Texto1(StaticText component) {
        this.campoP731Texto1 = component;
    }

    private LengthValidator validatorP731 = new LengthValidator();
  
    public LengthValidator getValidatorP731() {
        return validatorP731;
    }
  
    public void setValidatorP731(LengthValidator validator) {
        this.validatorP731 = validator;
    }
  
    private TableColumn tableColumnP741 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP741() {
        return tableColumnP741;
    }

    public void setTableColumnP741(TableColumn component) {
        this.tableColumnP741 = component;
    }

    private Label labelP741 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP741() {
        return labelP741;
    }

    public void setLabelP741(Label l) {
        this.labelP741 = l;
    }

    private TextArea campoP741 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP741() {
        return campoP741;
    }

    public void setCampoP741(TextArea component) {
        this.campoP741 = component;
    }

    private StaticText campoP741Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP741Texto1() {
        return campoP741Texto1;
    }

    public void setCampoP741Texto1(StaticText component) {
        this.campoP741Texto1 = component;
    }

    private LengthValidator validatorP741 = new LengthValidator();
  
    public LengthValidator getValidatorP741() {
        return validatorP741;
    }
  
    public void setValidatorP741(LengthValidator validator) {
        this.validatorP741 = validator;
    }
  
    private TableColumn tableColumnVar000061 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000061() {
        return tableColumnVar000061;
    }

    public void setTableColumnVar000061(TableColumn component) {
        this.tableColumnVar000061 = component;
    }

    private Label labelVar000061 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000061() {
        return labelVar000061;
    }

    public void setLabelVar000061(Label l) {
        this.labelVar000061 = l;
    }

    private TextArea campoVar000061 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000061() {
        return campoVar000061;
    }

    public void setCampoVar000061(TextArea component) {
        this.campoVar000061 = component;
    }

    private StaticText campoVar000061Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000061Texto1() {
        return campoVar000061Texto1;
    }

    public void setCampoVar000061Texto1(StaticText component) {
        this.campoVar000061Texto1 = component;
    }

    private LengthValidator validatorVar000061 = new LengthValidator();
  
    public LengthValidator getValidatorVar000061() {
        return validatorVar000061;
    }
  
    public void setValidatorVar000061(LengthValidator validator) {
        this.validatorVar000061 = validator;
    }
  
    private TableColumn tableColumnVar000071 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000071() {
        return tableColumnVar000071;
    }

    public void setTableColumnVar000071(TableColumn component) {
        this.tableColumnVar000071 = component;
    }

    private Label labelVar000071 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000071() {
        return labelVar000071;
    }

    public void setLabelVar000071(Label l) {
        this.labelVar000071 = l;
    }

    private TextArea campoVar000071 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000071() {
        return campoVar000071;
    }

    public void setCampoVar000071(TextArea component) {
        this.campoVar000071 = component;
    }

    private StaticText campoVar000071Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000071Texto1() {
        return campoVar000071Texto1;
    }

    public void setCampoVar000071Texto1(StaticText component) {
        this.campoVar000071Texto1 = component;
    }

    private LengthValidator validatorVar000071 = new LengthValidator();
  
    public LengthValidator getValidatorVar000071() {
        return validatorVar000071;
    }
  
    public void setValidatorVar000071(LengthValidator validator) {
        this.validatorVar000071 = validator;
    }
  
    private TableColumn tableColumnVar000081 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000081() {
        return tableColumnVar000081;
    }

    public void setTableColumnVar000081(TableColumn component) {
        this.tableColumnVar000081 = component;
    }

    private Label labelVar000081 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000081() {
        return labelVar000081;
    }

    public void setLabelVar000081(Label l) {
        this.labelVar000081 = l;
    }

    private TextArea campoVar000081 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000081() {
        return campoVar000081;
    }

    public void setCampoVar000081(TextArea component) {
        this.campoVar000081 = component;
    }

    private StaticText campoVar000081Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000081Texto1() {
        return campoVar000081Texto1;
    }

    public void setCampoVar000081Texto1(StaticText component) {
        this.campoVar000081Texto1 = component;
    }

    private LengthValidator validatorVar000081 = new LengthValidator();
  
    public LengthValidator getValidatorVar000081() {
        return validatorVar000081;
    }
  
    public void setValidatorVar000081(LengthValidator validator) {
        this.validatorVar000081 = validator;
    }
  
    private TableColumn tableColumnVar000091 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000091() {
        return tableColumnVar000091;
    }

    public void setTableColumnVar000091(TableColumn component) {
        this.tableColumnVar000091 = component;
    }

    private Label labelVar000091 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000091() {
        return labelVar000091;
    }

    public void setLabelVar000091(Label l) {
        this.labelVar000091 = l;
    }

    private TextArea campoVar000091 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000091() {
        return campoVar000091;
    }

    public void setCampoVar000091(TextArea component) {
        this.campoVar000091 = component;
    }

    private StaticText campoVar000091Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000091Texto1() {
        return campoVar000091Texto1;
    }

    public void setCampoVar000091Texto1(StaticText component) {
        this.campoVar000091Texto1 = component;
    }

    private LengthValidator validatorVar000091 = new LengthValidator();
  
    public LengthValidator getValidatorVar000091() {
        return validatorVar000091;
    }
  
    public void setValidatorVar000091(LengthValidator validator) {
        this.validatorVar000091 = validator;
    }
  
    private TableColumn tableColumnVar000101 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000101() {
        return tableColumnVar000101;
    }

    public void setTableColumnVar000101(TableColumn component) {
        this.tableColumnVar000101 = component;
    }

    private Label labelVar000101 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000101() {
        return labelVar000101;
    }

    public void setLabelVar000101(Label l) {
        this.labelVar000101 = l;
    }

    private TextArea campoVar000101 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000101() {
        return campoVar000101;
    }

    public void setCampoVar000101(TextArea component) {
        this.campoVar000101 = component;
    }

    private StaticText campoVar000101Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000101Texto1() {
        return campoVar000101Texto1;
    }

    public void setCampoVar000101Texto1(StaticText component) {
        this.campoVar000101Texto1 = component;
    }

    private LengthValidator validatorVar000101 = new LengthValidator();
  
    public LengthValidator getValidatorVar000101() {
        return validatorVar000101;
    }
  
    public void setValidatorVar000101(LengthValidator validator) {
        this.validatorVar000101 = validator;
    }
  
    private TableColumn tableColumnVar000111 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000111() {
        return tableColumnVar000111;
    }

    public void setTableColumnVar000111(TableColumn component) {
        this.tableColumnVar000111 = component;
    }

    private Label labelVar000111 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000111() {
        return labelVar000111;
    }

    public void setLabelVar000111(Label l) {
        this.labelVar000111 = l;
    }

    private TextArea campoVar000111 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000111() {
        return campoVar000111;
    }

    public void setCampoVar000111(TextArea component) {
        this.campoVar000111 = component;
    }

    private StaticText campoVar000111Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000111Texto1() {
        return campoVar000111Texto1;
    }

    public void setCampoVar000111Texto1(StaticText component) {
        this.campoVar000111Texto1 = component;
    }

    private LengthValidator validatorVar000111 = new LengthValidator();
  
    public LengthValidator getValidatorVar000111() {
        return validatorVar000111;
    }
  
    public void setValidatorVar000111(LengthValidator validator) {
        this.validatorVar000111 = validator;
    }
  
    private TableColumn tableColumnVar000311 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000311() {
        return tableColumnVar000311;
    }

    public void setTableColumnVar000311(TableColumn component) {
        this.tableColumnVar000311 = component;
    }

    private Label labelVar000311 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000311() {
        return labelVar000311;
    }

    public void setLabelVar000311(Label l) {
        this.labelVar000311 = l;
    }

    private TextArea campoVar000311 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000311() {
        return campoVar000311;
    }

    public void setCampoVar000311(TextArea component) {
        this.campoVar000311 = component;
    }

    private StaticText campoVar000311Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000311Texto1() {
        return campoVar000311Texto1;
    }

    public void setCampoVar000311Texto1(StaticText component) {
        this.campoVar000311Texto1 = component;
    }

    private LengthValidator validatorVar000311 = new LengthValidator();
  
    public LengthValidator getValidatorVar000311() {
        return validatorVar000311;
    }
  
    public void setValidatorVar000311(LengthValidator validator) {
        this.validatorVar000311 = validator;
    }
  
    private TableColumn tableColumnVar000121 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000121() {
        return tableColumnVar000121;
    }

    public void setTableColumnVar000121(TableColumn component) {
        this.tableColumnVar000121 = component;
    }

    private Label labelVar000121 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000121() {
        return labelVar000121;
    }

    public void setLabelVar000121(Label l) {
        this.labelVar000121 = l;
    }

    private TextArea campoVar000121 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000121() {
        return campoVar000121;
    }

    public void setCampoVar000121(TextArea component) {
        this.campoVar000121 = component;
    }

    private StaticText campoVar000121Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000121Texto1() {
        return campoVar000121Texto1;
    }

    public void setCampoVar000121Texto1(StaticText component) {
        this.campoVar000121Texto1 = component;
    }

    private LengthValidator validatorVar000121 = new LengthValidator();
  
    public LengthValidator getValidatorVar000121() {
        return validatorVar000121;
    }
  
    public void setValidatorVar000121(LengthValidator validator) {
        this.validatorVar000121 = validator;
    }
  
    private TableColumn tableColumnVar000131 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000131() {
        return tableColumnVar000131;
    }

    public void setTableColumnVar000131(TableColumn component) {
        this.tableColumnVar000131 = component;
    }

    private Label labelVar000131 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000131() {
        return labelVar000131;
    }

    public void setLabelVar000131(Label l) {
        this.labelVar000131 = l;
    }

    private TextArea campoVar000131 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000131() {
        return campoVar000131;
    }

    public void setCampoVar000131(TextArea component) {
        this.campoVar000131 = component;
    }

    private StaticText campoVar000131Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000131Texto1() {
        return campoVar000131Texto1;
    }

    public void setCampoVar000131Texto1(StaticText component) {
        this.campoVar000131Texto1 = component;
    }

    private LengthValidator validatorVar000131 = new LengthValidator();
  
    public LengthValidator getValidatorVar000131() {
        return validatorVar000131;
    }
  
    public void setValidatorVar000131(LengthValidator validator) {
        this.validatorVar000131 = validator;
    }
  
    private TableColumn tableColumnP861 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP861() {
        return tableColumnP861;
    }

    public void setTableColumnP861(TableColumn component) {
        this.tableColumnP861 = component;
    }

    private Label labelP861 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP861() {
        return labelP861;
    }

    public void setLabelP861(Label l) {
        this.labelP861 = l;
    }

    private TextArea campoP861 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP861() {
        return campoP861;
    }

    public void setCampoP861(TextArea component) {
        this.campoP861 = component;
    }

    private StaticText campoP861Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP861Texto1() {
        return campoP861Texto1;
    }

    public void setCampoP861Texto1(StaticText component) {
        this.campoP861Texto1 = component;
    }

    private LengthValidator validatorP861 = new LengthValidator();
  
    public LengthValidator getValidatorP861() {
        return validatorP861;
    }
  
    public void setValidatorP861(LengthValidator validator) {
        this.validatorP861 = validator;
    }
  
    private TableColumn tableColumnP871 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP871() {
        return tableColumnP871;
    }

    public void setTableColumnP871(TableColumn component) {
        this.tableColumnP871 = component;
    }

    private Label labelP871 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP871() {
        return labelP871;
    }

    public void setLabelP871(Label l) {
        this.labelP871 = l;
    }

    private TextArea campoP871 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP871() {
        return campoP871;
    }

    public void setCampoP871(TextArea component) {
        this.campoP871 = component;
    }

    private StaticText campoP871Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP871Texto1() {
        return campoP871Texto1;
    }

    public void setCampoP871Texto1(StaticText component) {
        this.campoP871Texto1 = component;
    }

    private LengthValidator validatorP871 = new LengthValidator();
  
    public LengthValidator getValidatorP871() {
        return validatorP871;
    }
  
    public void setValidatorP871(LengthValidator validator) {
        this.validatorP871 = validator;
    }
  
    private TableColumn tableColumnP87e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP87e1() {
        return tableColumnP87e1;
    }

    public void setTableColumnP87e1(TableColumn component) {
        this.tableColumnP87e1 = component;
    }

    private Label labelP87e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP87e1() {
        return labelP87e1;
    }

    public void setLabelP87e1(Label l) {
        this.labelP87e1 = l;
    }

    private TextArea campoP87e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP87e1() {
        return campoP87e1;
    }

    public void setCampoP87e1(TextArea component) {
        this.campoP87e1 = component;
    }

    private StaticText campoP87e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP87e1Texto1() {
        return campoP87e1Texto1;
    }

    public void setCampoP87e1Texto1(StaticText component) {
        this.campoP87e1Texto1 = component;
    }

    private LengthValidator validatorP87e1 = new LengthValidator();
  
    public LengthValidator getValidatorP87e1() {
        return validatorP87e1;
    }
  
    public void setValidatorP87e1(LengthValidator validator) {
        this.validatorP87e1 = validator;
    }
  
    private TableColumn tableColumnP881 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP881() {
        return tableColumnP881;
    }

    public void setTableColumnP881(TableColumn component) {
        this.tableColumnP881 = component;
    }

    private Label labelP881 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP881() {
        return labelP881;
    }

    public void setLabelP881(Label l) {
        this.labelP881 = l;
    }

    private TextArea campoP881 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP881() {
        return campoP881;
    }

    public void setCampoP881(TextArea component) {
        this.campoP881 = component;
    }

    private StaticText campoP881Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP881Texto1() {
        return campoP881Texto1;
    }

    public void setCampoP881Texto1(StaticText component) {
        this.campoP881Texto1 = component;
    }

    private LengthValidator validatorP881 = new LengthValidator();
  
    public LengthValidator getValidatorP881() {
        return validatorP881;
    }
  
    public void setValidatorP881(LengthValidator validator) {
        this.validatorP881 = validator;
    }
  
    private TableColumn tableColumnP88e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP88e1() {
        return tableColumnP88e1;
    }

    public void setTableColumnP88e1(TableColumn component) {
        this.tableColumnP88e1 = component;
    }

    private Label labelP88e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP88e1() {
        return labelP88e1;
    }

    public void setLabelP88e1(Label l) {
        this.labelP88e1 = l;
    }

    private TextArea campoP88e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP88e1() {
        return campoP88e1;
    }

    public void setCampoP88e1(TextArea component) {
        this.campoP88e1 = component;
    }

    private StaticText campoP88e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP88e1Texto1() {
        return campoP88e1Texto1;
    }

    public void setCampoP88e1Texto1(StaticText component) {
        this.campoP88e1Texto1 = component;
    }

    private LengthValidator validatorP88e1 = new LengthValidator();
  
    public LengthValidator getValidatorP88e1() {
        return validatorP88e1;
    }
  
    public void setValidatorP88e1(LengthValidator validator) {
        this.validatorP88e1 = validator;
    }
  
    private TableColumn tableColumnP911 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP911() {
        return tableColumnP911;
    }

    public void setTableColumnP911(TableColumn component) {
        this.tableColumnP911 = component;
    }

    private Label labelP911 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP911() {
        return labelP911;
    }

    public void setLabelP911(Label l) {
        this.labelP911 = l;
    }

    private TextArea campoP911 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP911() {
        return campoP911;
    }

    public void setCampoP911(TextArea component) {
        this.campoP911 = component;
    }

    private StaticText campoP911Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP911Texto1() {
        return campoP911Texto1;
    }

    public void setCampoP911Texto1(StaticText component) {
        this.campoP911Texto1 = component;
    }

    private LengthValidator validatorP911 = new LengthValidator();
  
    public LengthValidator getValidatorP911() {
        return validatorP911;
    }
  
    public void setValidatorP911(LengthValidator validator) {
        this.validatorP911 = validator;
    }
  
    private TableColumn tableColumnVar000171 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000171() {
        return tableColumnVar000171;
    }

    public void setTableColumnVar000171(TableColumn component) {
        this.tableColumnVar000171 = component;
    }

    private Label labelVar000171 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000171() {
        return labelVar000171;
    }

    public void setLabelVar000171(Label l) {
        this.labelVar000171 = l;
    }

    private TextArea campoVar000171 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000171() {
        return campoVar000171;
    }

    public void setCampoVar000171(TextArea component) {
        this.campoVar000171 = component;
    }

    private StaticText campoVar000171Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000171Texto1() {
        return campoVar000171Texto1;
    }

    public void setCampoVar000171Texto1(StaticText component) {
        this.campoVar000171Texto1 = component;
    }

    private LengthValidator validatorVar000171 = new LengthValidator();
  
    public LengthValidator getValidatorVar000171() {
        return validatorVar000171;
    }
  
    public void setValidatorVar000171(LengthValidator validator) {
        this.validatorVar000171 = validator;
    }
  
    private TableColumn tableColumnVar000181 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000181() {
        return tableColumnVar000181;
    }

    public void setTableColumnVar000181(TableColumn component) {
        this.tableColumnVar000181 = component;
    }

    private Label labelVar000181 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000181() {
        return labelVar000181;
    }

    public void setLabelVar000181(Label l) {
        this.labelVar000181 = l;
    }

    private TextArea campoVar000181 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000181() {
        return campoVar000181;
    }

    public void setCampoVar000181(TextArea component) {
        this.campoVar000181 = component;
    }

    private StaticText campoVar000181Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000181Texto1() {
        return campoVar000181Texto1;
    }

    public void setCampoVar000181Texto1(StaticText component) {
        this.campoVar000181Texto1 = component;
    }

    private LengthValidator validatorVar000181 = new LengthValidator();
  
    public LengthValidator getValidatorVar000181() {
        return validatorVar000181;
    }
  
    public void setValidatorVar000181(LengthValidator validator) {
        this.validatorVar000181 = validator;
    }
  
    private TableColumn tableColumnVar000191 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000191() {
        return tableColumnVar000191;
    }

    public void setTableColumnVar000191(TableColumn component) {
        this.tableColumnVar000191 = component;
    }

    private Label labelVar000191 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000191() {
        return labelVar000191;
    }

    public void setLabelVar000191(Label l) {
        this.labelVar000191 = l;
    }

    private TextArea campoVar000191 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000191() {
        return campoVar000191;
    }

    public void setCampoVar000191(TextArea component) {
        this.campoVar000191 = component;
    }

    private StaticText campoVar000191Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000191Texto1() {
        return campoVar000191Texto1;
    }

    public void setCampoVar000191Texto1(StaticText component) {
        this.campoVar000191Texto1 = component;
    }

    private LengthValidator validatorVar000191 = new LengthValidator();
  
    public LengthValidator getValidatorVar000191() {
        return validatorVar000191;
    }
  
    public void setValidatorVar000191(LengthValidator validator) {
        this.validatorVar000191 = validator;
    }
  
    private TableColumn tableColumnVar000201 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000201() {
        return tableColumnVar000201;
    }

    public void setTableColumnVar000201(TableColumn component) {
        this.tableColumnVar000201 = component;
    }

    private Label labelVar000201 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000201() {
        return labelVar000201;
    }

    public void setLabelVar000201(Label l) {
        this.labelVar000201 = l;
    }

    private TextArea campoVar000201 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000201() {
        return campoVar000201;
    }

    public void setCampoVar000201(TextArea component) {
        this.campoVar000201 = component;
    }

    private StaticText campoVar000201Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000201Texto1() {
        return campoVar000201Texto1;
    }

    public void setCampoVar000201Texto1(StaticText component) {
        this.campoVar000201Texto1 = component;
    }

    private LengthValidator validatorVar000201 = new LengthValidator();
  
    public LengthValidator getValidatorVar000201() {
        return validatorVar000201;
    }
  
    public void setValidatorVar000201(LengthValidator validator) {
        this.validatorVar000201 = validator;
    }
  
    private TableColumn tableColumnVar000211 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000211() {
        return tableColumnVar000211;
    }

    public void setTableColumnVar000211(TableColumn component) {
        this.tableColumnVar000211 = component;
    }

    private Label labelVar000211 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000211() {
        return labelVar000211;
    }

    public void setLabelVar000211(Label l) {
        this.labelVar000211 = l;
    }

    private TextArea campoVar000211 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000211() {
        return campoVar000211;
    }

    public void setCampoVar000211(TextArea component) {
        this.campoVar000211 = component;
    }

    private StaticText campoVar000211Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000211Texto1() {
        return campoVar000211Texto1;
    }

    public void setCampoVar000211Texto1(StaticText component) {
        this.campoVar000211Texto1 = component;
    }

    private LengthValidator validatorVar000211 = new LengthValidator();
  
    public LengthValidator getValidatorVar000211() {
        return validatorVar000211;
    }
  
    public void setValidatorVar000211(LengthValidator validator) {
        this.validatorVar000211 = validator;
    }
  
    private TableColumn tableColumnVar000221 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000221() {
        return tableColumnVar000221;
    }

    public void setTableColumnVar000221(TableColumn component) {
        this.tableColumnVar000221 = component;
    }

    private Label labelVar000221 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000221() {
        return labelVar000221;
    }

    public void setLabelVar000221(Label l) {
        this.labelVar000221 = l;
    }

    private TextArea campoVar000221 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000221() {
        return campoVar000221;
    }

    public void setCampoVar000221(TextArea component) {
        this.campoVar000221 = component;
    }

    private StaticText campoVar000221Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000221Texto1() {
        return campoVar000221Texto1;
    }

    public void setCampoVar000221Texto1(StaticText component) {
        this.campoVar000221Texto1 = component;
    }

    private LengthValidator validatorVar000221 = new LengthValidator();
  
    public LengthValidator getValidatorVar000221() {
        return validatorVar000221;
    }
  
    public void setValidatorVar000221(LengthValidator validator) {
        this.validatorVar000221 = validator;
    }
  
    private TableColumn tableColumnVar000231 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000231() {
        return tableColumnVar000231;
    }

    public void setTableColumnVar000231(TableColumn component) {
        this.tableColumnVar000231 = component;
    }

    private Label labelVar000231 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000231() {
        return labelVar000231;
    }

    public void setLabelVar000231(Label l) {
        this.labelVar000231 = l;
    }

    private TextArea campoVar000231 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000231() {
        return campoVar000231;
    }

    public void setCampoVar000231(TextArea component) {
        this.campoVar000231 = component;
    }

    private StaticText campoVar000231Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000231Texto1() {
        return campoVar000231Texto1;
    }

    public void setCampoVar000231Texto1(StaticText component) {
        this.campoVar000231Texto1 = component;
    }

    private LengthValidator validatorVar000231 = new LengthValidator();
  
    public LengthValidator getValidatorVar000231() {
        return validatorVar000231;
    }
  
    public void setValidatorVar000231(LengthValidator validator) {
        this.validatorVar000231 = validator;
    }
  
    private TableColumn tableColumnVar000241 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000241() {
        return tableColumnVar000241;
    }

    public void setTableColumnVar000241(TableColumn component) {
        this.tableColumnVar000241 = component;
    }

    private Label labelVar000241 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000241() {
        return labelVar000241;
    }

    public void setLabelVar000241(Label l) {
        this.labelVar000241 = l;
    }

    private TextArea campoVar000241 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000241() {
        return campoVar000241;
    }

    public void setCampoVar000241(TextArea component) {
        this.campoVar000241 = component;
    }

    private StaticText campoVar000241Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000241Texto1() {
        return campoVar000241Texto1;
    }

    public void setCampoVar000241Texto1(StaticText component) {
        this.campoVar000241Texto1 = component;
    }

    private LengthValidator validatorVar000241 = new LengthValidator();
  
    public LengthValidator getValidatorVar000241() {
        return validatorVar000241;
    }
  
    public void setValidatorVar000241(LengthValidator validator) {
        this.validatorVar000241 = validator;
    }
  
    private TableColumn tableColumnVar000251 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000251() {
        return tableColumnVar000251;
    }

    public void setTableColumnVar000251(TableColumn component) {
        this.tableColumnVar000251 = component;
    }

    private Label labelVar000251 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000251() {
        return labelVar000251;
    }

    public void setLabelVar000251(Label l) {
        this.labelVar000251 = l;
    }

    private TextArea campoVar000251 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000251() {
        return campoVar000251;
    }

    public void setCampoVar000251(TextArea component) {
        this.campoVar000251 = component;
    }

    private StaticText campoVar000251Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000251Texto1() {
        return campoVar000251Texto1;
    }

    public void setCampoVar000251Texto1(StaticText component) {
        this.campoVar000251Texto1 = component;
    }

    private LengthValidator validatorVar000251 = new LengthValidator();
  
    public LengthValidator getValidatorVar000251() {
        return validatorVar000251;
    }
  
    public void setValidatorVar000251(LengthValidator validator) {
        this.validatorVar000251 = validator;
    }
  
    private TableColumn tableColumnVar000261 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000261() {
        return tableColumnVar000261;
    }

    public void setTableColumnVar000261(TableColumn component) {
        this.tableColumnVar000261 = component;
    }

    private Label labelVar000261 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000261() {
        return labelVar000261;
    }

    public void setLabelVar000261(Label l) {
        this.labelVar000261 = l;
    }

    private TextArea campoVar000261 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000261() {
        return campoVar000261;
    }

    public void setCampoVar000261(TextArea component) {
        this.campoVar000261 = component;
    }

    private StaticText campoVar000261Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000261Texto1() {
        return campoVar000261Texto1;
    }

    public void setCampoVar000261Texto1(StaticText component) {
        this.campoVar000261Texto1 = component;
    }

    private LengthValidator validatorVar000261 = new LengthValidator();
  
    public LengthValidator getValidatorVar000261() {
        return validatorVar000261;
    }
  
    public void setValidatorVar000261(LengthValidator validator) {
        this.validatorVar000261 = validator;
    }
  
    private TableColumn tableColumnVar000271 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000271() {
        return tableColumnVar000271;
    }

    public void setTableColumnVar000271(TableColumn component) {
        this.tableColumnVar000271 = component;
    }

    private Label labelVar000271 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000271() {
        return labelVar000271;
    }

    public void setLabelVar000271(Label l) {
        this.labelVar000271 = l;
    }

    private TextArea campoVar000271 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000271() {
        return campoVar000271;
    }

    public void setCampoVar000271(TextArea component) {
        this.campoVar000271 = component;
    }

    private StaticText campoVar000271Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000271Texto1() {
        return campoVar000271Texto1;
    }

    public void setCampoVar000271Texto1(StaticText component) {
        this.campoVar000271Texto1 = component;
    }

    private LengthValidator validatorVar000271 = new LengthValidator();
  
    public LengthValidator getValidatorVar000271() {
        return validatorVar000271;
    }
  
    public void setValidatorVar000271(LengthValidator validator) {
        this.validatorVar000271 = validator;
    }
  
    private TableColumn tableColumnVar000281 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000281() {
        return tableColumnVar000281;
    }

    public void setTableColumnVar000281(TableColumn component) {
        this.tableColumnVar000281 = component;
    }

    private Label labelVar000281 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000281() {
        return labelVar000281;
    }

    public void setLabelVar000281(Label l) {
        this.labelVar000281 = l;
    }

    private TextArea campoVar000281 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000281() {
        return campoVar000281;
    }

    public void setCampoVar000281(TextArea component) {
        this.campoVar000281 = component;
    }

    private StaticText campoVar000281Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000281Texto1() {
        return campoVar000281Texto1;
    }

    public void setCampoVar000281Texto1(StaticText component) {
        this.campoVar000281Texto1 = component;
    }

    private LengthValidator validatorVar000281 = new LengthValidator();
  
    public LengthValidator getValidatorVar000281() {
        return validatorVar000281;
    }
  
    public void setValidatorVar000281(LengthValidator validator) {
        this.validatorVar000281 = validator;
    }
  
    private TableColumn tableColumnP921 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP921() {
        return tableColumnP921;
    }

    public void setTableColumnP921(TableColumn component) {
        this.tableColumnP921 = component;
    }

    private Label labelP921 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP921() {
        return labelP921;
    }

    public void setLabelP921(Label l) {
        this.labelP921 = l;
    }

    private TextArea campoP921 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP921() {
        return campoP921;
    }

    public void setCampoP921(TextArea component) {
        this.campoP921 = component;
    }

    private StaticText campoP921Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP921Texto1() {
        return campoP921Texto1;
    }

    public void setCampoP921Texto1(StaticText component) {
        this.campoP921Texto1 = component;
    }

    private LengthValidator validatorP921 = new LengthValidator();
  
    public LengthValidator getValidatorP921() {
        return validatorP921;
    }
  
    public void setValidatorP921(LengthValidator validator) {
        this.validatorP921 = validator;
    }
  
    private TableColumn tableColumnIcv1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIcv1() {
        return tableColumnIcv1;
    }

    public void setTableColumnIcv1(TableColumn component) {
        this.tableColumnIcv1 = component;
    }

    private Label labelIcv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIcv1() {
        return labelIcv1;
    }

    public void setLabelIcv1(Label l) {
        this.labelIcv1 = l;
    }

    private TextArea campoIcv1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoIcv1() {
        return campoIcv1;
    }

    public void setCampoIcv1(TextArea component) {
        this.campoIcv1 = component;
    }

    private StaticText campoIcv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIcv1Texto1() {
        return campoIcv1Texto1;
    }

    public void setCampoIcv1Texto1(StaticText component) {
        this.campoIcv1Texto1 = component;
    }

    private LengthValidator validatorIcv1 = new LengthValidator();
  
    public LengthValidator getValidatorIcv1() {
        return validatorIcv1;
    }
  
    public void setValidatorIcv1(LengthValidator validator) {
        this.validatorIcv1 = validator;
    }
  
    private TableColumn tableColumnFichaActiva1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFichaActiva1() {
        return tableColumnFichaActiva1;
    }

    public void setTableColumnFichaActiva1(TableColumn component) {
        this.tableColumnFichaActiva1 = component;
    }

    private Label labelFichaActiva1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFichaActiva1() {
        return labelFichaActiva1;
    }

    public void setLabelFichaActiva1(Label l) {
        this.labelFichaActiva1 = l;
    }

    private TextArea campoFichaActiva1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoFichaActiva1() {
        return campoFichaActiva1;
    }

    public void setCampoFichaActiva1(TextArea component) {
        this.campoFichaActiva1 = component;
    }

    private StaticText campoFichaActiva1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFichaActiva1Texto1() {
        return campoFichaActiva1Texto1;
    }

    public void setCampoFichaActiva1Texto1(StaticText component) {
        this.campoFichaActiva1Texto1 = component;
    }

    private LengthValidator validatorFichaActiva1 = new LengthValidator();
  
    public LengthValidator getValidatorFichaActiva1() {
        return validatorFichaActiva1;
    }
  
    public void setValidatorFichaActiva1(LengthValidator validator) {
        this.validatorFichaActiva1 = validator;
    }
  
    private TableColumn tableColumnEsImportado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsImportado1() {
        return tableColumnEsImportado1;
    }

    public void setTableColumnEsImportado1(TableColumn component) {
        this.tableColumnEsImportado1 = component;
    }

    private Label labelEsImportado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsImportado1() {
        return labelEsImportado1;
    }

    public void setLabelEsImportado1(Label l) {
        this.labelEsImportado1 = l;
    }

    private DropDown listaEsImportado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsImportado1() {
        return listaEsImportado1;
    }

    public void setListaEsImportado1(DropDown component) {
        this.listaEsImportado1 = component;
    }

    private StaticText listaEsImportado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsImportado1Texto1() {
        return listaEsImportado1Texto1;
    }

    public void setListaEsImportado1Texto1(StaticText component) {
        this.listaEsImportado1Texto1 = component;
    }

    private IntegerConverter converterEsImportado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsImportado1() {
        return converterEsImportado1;
    }
  
    public void setConverterEsImportado1(IntegerConverter converter) {
        this.converterEsImportado1 = converter;
    }
  
    private TableColumn tableColumnObservacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnObservacion1() {
        return tableColumnObservacion1;
    }

    public void setTableColumnObservacion1(TableColumn component) {
        this.tableColumnObservacion1 = component;
    }

    private Label labelObservacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacion1() {
        return labelObservacion1;
    }

    public void setLabelObservacion1(Label l) {
        this.labelObservacion1 = l;
    }

    private TextArea campoObservacion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservacion1() {
        return campoObservacion1;
    }

    public void setCampoObservacion1(TextArea component) {
        this.campoObservacion1 = component;
    }

    private StaticText campoObservacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacion1Texto1() {
        return campoObservacion1Texto1;
    }

    public void setCampoObservacion1Texto1(StaticText component) {
        this.campoObservacion1Texto1 = component;
    }

    private LengthValidator validatorObservacion1 = new LengthValidator();
  
    public LengthValidator getValidatorObservacion1() {
        return validatorObservacion1;
    }
  
    public void setValidatorObservacion1(LengthValidator validator) {
        this.validatorObservacion1 = validator;
    }
  
    private TableColumn tableColumnFechaHoraTransaccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaHoraTransaccion1() {
        return tableColumnFechaHoraTransaccion1;
    }

    public void setTableColumnFechaHoraTransaccion1(TableColumn component) {
        this.tableColumnFechaHoraTransaccion1 = component;
    }

    private Label labelFechaHoraTransaccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraTransaccion1() {
        return labelFechaHoraTransaccion1;
    }

    public void setLabelFechaHoraTransaccion1(Label l) {
        this.labelFechaHoraTransaccion1 = l;
    }

    private TextField campoFechaHoraTransaccion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraTransaccion1() {
        return campoFechaHoraTransaccion1;
    }

    public void setCampoFechaHoraTransaccion1(TextField component) {
        this.campoFechaHoraTransaccion1 = component;
    }

    private StaticText campoFechaHoraTransaccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraTransaccion1Texto1() {
        return campoFechaHoraTransaccion1Texto1;
    }

    public void setCampoFechaHoraTransaccion1Texto1(StaticText component) {
        this.campoFechaHoraTransaccion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraTransaccion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraTransaccion1() {
        return converterFechaHoraTransaccion1;
    }
  
    public void setConverterFechaHoraTransaccion1(SqlTimestampConverter converter) {
        this.converterFechaHoraTransaccion1 = converter;
    }
  
    private TableColumn tableColumnNombreArchivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreArchivo1() {
        return tableColumnNombreArchivo1;
    }

    public void setTableColumnNombreArchivo1(TableColumn component) {
        this.tableColumnNombreArchivo1 = component;
    }

    private Label labelNombreArchivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivo1() {
        return labelNombreArchivo1;
    }

    public void setLabelNombreArchivo1(Label l) {
        this.labelNombreArchivo1 = l;
    }

    private TextArea campoNombreArchivo1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreArchivo1() {
        return campoNombreArchivo1;
    }

    public void setCampoNombreArchivo1(TextArea component) {
        this.campoNombreArchivo1 = component;
    }

    private StaticText campoNombreArchivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivo1Texto1() {
        return campoNombreArchivo1Texto1;
    }

    public void setCampoNombreArchivo1Texto1(StaticText component) {
        this.campoNombreArchivo1Texto1 = component;
    }

    private Button campoNombreArchivo1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivo1Boton3() {
        return campoNombreArchivo1Boton3;
    }

    public void setCampoNombreArchivo1Boton3(Button component) {
        this.campoNombreArchivo1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivo1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivo1() {
        return validatorNombreArchivo1;
    }
  
    public void setValidatorNombreArchivo1(LengthValidator validator) {
        this.validatorNombreArchivo1 = validator;
    }
  
    private TableColumn tableColumnCodigoArchivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoArchivo1() {
        return tableColumnCodigoArchivo1;
    }

    public void setTableColumnCodigoArchivo1(TableColumn component) {
        this.tableColumnCodigoArchivo1 = component;
    }

    private Label labelCodigoArchivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoArchivo1() {
        return labelCodigoArchivo1;
    }

    public void setLabelCodigoArchivo1(Label l) {
        this.labelCodigoArchivo1 = l;
    }

    private TextArea campoCodigoArchivo1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCodigoArchivo1() {
        return campoCodigoArchivo1;
    }

    public void setCampoCodigoArchivo1(TextArea component) {
        this.campoCodigoArchivo1 = component;
    }

    private StaticText campoCodigoArchivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoArchivo1Texto1() {
        return campoCodigoArchivo1Texto1;
    }

    public void setCampoCodigoArchivo1Texto1(StaticText component) {
        this.campoCodigoArchivo1Texto1 = component;
    }

    private LengthValidator validatorCodigoArchivo1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoArchivo1() {
        return validatorCodigoArchivo1;
    }
  
    public void setValidatorCodigoArchivo1(LengthValidator validator) {
        this.validatorCodigoArchivo1 = validator;
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

    private DropDown listaFuncionAccion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
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
  
    private Button botonProcesar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesar1() {
        return botonProcesar1;
    }

    public void setBotonProcesar1(Button component) {
        this.botonProcesar1 = component;
    }

    private Button botonRefrescar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRefrescar1() {
        return botonRefrescar1;
    }

    public void setBotonRefrescar1(Button component) {
        this.botonRefrescar1 = component;
    }

    private Button botonReconsultar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonReconsultar1() {
        return botonReconsultar1;
    }

    public void setBotonReconsultar1(Button component) {
        this.botonReconsultar1 = component;
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

    private LogImpPerCachedRowSetDataProvider2 logImpPerDataProvider = new LogImpPerCachedRowSetDataProvider2();

    @Override
    public LogImpPerCachedRowSetDataProvider2 getLogImpPerDataProvider() {
        return logImpPerDataProvider;
    }

    public void setLogImpPerDataProvider(LogImpPerCachedRowSetDataProvider2 crsdp) {
        this.logImpPerDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogImpPer5() {
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
        logImpPerDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogImpPer...">
    @Override
    public TextField getTextFieldCampoFechaHoraTransaccion1() {
        return this.getCampoFechaHoraTransaccion1();
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
    private AsistentePaginaActualizacionLogImpPer asistente = new AsistentePaginaActualizacionLogImpPer(this);

    public AsistentePaginaActualizacionLogImpPer getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogImpPer5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogImpPer5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogImpPer5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogImpPerDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogImpPerCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_IMP_PER;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return -1;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return -1;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return -1;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        return this.getAsistente().getOpcionesListaFuncionAccion();
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
            this.getLogImpPerDataProvider().consultarLogImpPer(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogImpPerDataProvider().consultarLogImpPer(filtro);
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

    public String botonProcesar1_action() {
        this.getAsistente().procesar();
        return null;
    }

    public String botonRefrescar1_action() {
        this.getGestor().refrescar();
        return null;
    }

    public String botonReconsultar1_action() {
        this.getGestor().reconsultar();
        return null;
    }

    public String botonRetornar1_action() {
        this.getGestor().retornar();
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para validar referencias">
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

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones especificas de la pagina">
    public String botonProcesarFila1_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila1() {
        return null;
    }

    public String hipervinculoAccionFila1_action() {
        this.getGestor().escoger();
        this.getGestor().procesar(new RowProcessor() {
            // override metodo processRow
            @Override
            public void processRow(RowKey rowKey) throws Exception {
                accionFila1(rowKey);
            }
        });
        return null;
    }

    public String getScriptAbrirVentanaAccionFila1() {
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    public void accionFila1(RowKey rowKey) {
        long funcion = -1; /* TODO: cambiar -1 por el id de la funcion a ejecutar */
        boolean ok = this.getRecursoDataProvider().esFilaAutorizada(rowKey, funcion);
        if (ok) {
            // TODO: ejecutar funcion
        }
    }
 
    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
