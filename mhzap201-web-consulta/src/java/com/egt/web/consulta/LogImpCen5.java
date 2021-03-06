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

import com.egt.data.specific.xdp2.LogImpCenCachedRowSetDataProvider2;
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

public class LogImpCen5 extends AbstractPageBean
        implements PaginaActualizacionLogImpCen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogImpCen1.setMinimum(0L);
        validatorIdLogImpCen1.setMaximum(1000000000000000000L);
        validatorOrden1.setMaximum(8160);
        validatorBarrio1.setMaximum(8160);
        validatorDireccion1.setMaximum(8160);
        validatorTelefono1.setMaximum(8160);
        validatorPrimerNombre1.setMaximum(8160);
        validatorSegundoNombre1.setMaximum(8160);
        validatorPrimerApellido1.setMaximum(8160);
        validatorSegundoApellido1.setMaximum(8160);
        validatorEdadALaFecha1.setMaximum(8160);
        validatorSexo1.setMaximum(8160);
        validatorParentesco1.setMaximum(8160);
        validatorCedula1.setMaximum(8160);
        validatorNombreJefeHogar1.setMaximum(8160);
        validatorCedulaJefeHogar1.setMaximum(8160);
        validatorIcv1.setMaximum(8160);
        validatorValidado1.setMaximum(8160);
        validatorObservaciones1.setMaximum(8160);
        validatorFuncionario1.setMaximum(8160);
        validatorCausaInvalidacion1.setMaximum(8160);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        validatorNombreArchivo1.setMaximum(8160);
        validatorCodigoArchivo1.setMaximum(8160);
        logImpCenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logImpCenRowSet}"));
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

    private TableColumn tableColumnIdLogImpCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogImpCen1() {
        return tableColumnIdLogImpCen1;
    }

    public void setTableColumnIdLogImpCen1(TableColumn component) {
        this.tableColumnIdLogImpCen1 = component;
    }

    private Label labelIdLogImpCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogImpCen1() {
        return labelIdLogImpCen1;
    }

    public void setLabelIdLogImpCen1(Label l) {
        this.labelIdLogImpCen1 = l;
    }

    private TextField campoIdLogImpCen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogImpCen1() {
        return campoIdLogImpCen1;
    }

    public void setCampoIdLogImpCen1(TextField component) {
        this.campoIdLogImpCen1 = component;
    }

    private StaticText campoIdLogImpCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogImpCen1Texto1() {
        return campoIdLogImpCen1Texto1;
    }

    public void setCampoIdLogImpCen1Texto1(StaticText component) {
        this.campoIdLogImpCen1Texto1 = component;
    }

    private LongConverter converterIdLogImpCen1 = new LongConverter();
  
    public LongConverter getConverterIdLogImpCen1() {
        return converterIdLogImpCen1;
    }
  
    public void setConverterIdLogImpCen1(LongConverter converter) {
        this.converterIdLogImpCen1 = converter;
    }
  
    private LongRangeValidator validatorIdLogImpCen1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogImpCen1() {
        return validatorIdLogImpCen1;
    }
  
    public void setValidatorIdLogImpCen1(LongRangeValidator validator) {
        this.validatorIdLogImpCen1 = validator;
    }
  
    private TableColumn tableColumnOrden1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOrden1() {
        return tableColumnOrden1;
    }

    public void setTableColumnOrden1(TableColumn component) {
        this.tableColumnOrden1 = component;
    }

    private Label labelOrden1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOrden1() {
        return labelOrden1;
    }

    public void setLabelOrden1(Label l) {
        this.labelOrden1 = l;
    }

    private TextArea campoOrden1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoOrden1() {
        return campoOrden1;
    }

    public void setCampoOrden1(TextArea component) {
        this.campoOrden1 = component;
    }

    private StaticText campoOrden1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOrden1Texto1() {
        return campoOrden1Texto1;
    }

    public void setCampoOrden1Texto1(StaticText component) {
        this.campoOrden1Texto1 = component;
    }

    private LengthValidator validatorOrden1 = new LengthValidator();
  
    public LengthValidator getValidatorOrden1() {
        return validatorOrden1;
    }
  
    public void setValidatorOrden1(LengthValidator validator) {
        this.validatorOrden1 = validator;
    }
  
    private TableColumn tableColumnBarrio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnBarrio1() {
        return tableColumnBarrio1;
    }

    public void setTableColumnBarrio1(TableColumn component) {
        this.tableColumnBarrio1 = component;
    }

    private Label labelBarrio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelBarrio1() {
        return labelBarrio1;
    }

    public void setLabelBarrio1(Label l) {
        this.labelBarrio1 = l;
    }

    private TextArea campoBarrio1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoBarrio1() {
        return campoBarrio1;
    }

    public void setCampoBarrio1(TextArea component) {
        this.campoBarrio1 = component;
    }

    private StaticText campoBarrio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoBarrio1Texto1() {
        return campoBarrio1Texto1;
    }

    public void setCampoBarrio1Texto1(StaticText component) {
        this.campoBarrio1Texto1 = component;
    }

    private LengthValidator validatorBarrio1 = new LengthValidator();
  
    public LengthValidator getValidatorBarrio1() {
        return validatorBarrio1;
    }
  
    public void setValidatorBarrio1(LengthValidator validator) {
        this.validatorBarrio1 = validator;
    }
  
    private TableColumn tableColumnDireccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDireccion1() {
        return tableColumnDireccion1;
    }

    public void setTableColumnDireccion1(TableColumn component) {
        this.tableColumnDireccion1 = component;
    }

    private Label labelDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1() {
        return labelDireccion1;
    }

    public void setLabelDireccion1(Label l) {
        this.labelDireccion1 = l;
    }

    private TextArea campoDireccion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDireccion1() {
        return campoDireccion1;
    }

    public void setCampoDireccion1(TextArea component) {
        this.campoDireccion1 = component;
    }

    private StaticText campoDireccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDireccion1Texto1() {
        return campoDireccion1Texto1;
    }

    public void setCampoDireccion1Texto1(StaticText component) {
        this.campoDireccion1Texto1 = component;
    }

    private LengthValidator validatorDireccion1 = new LengthValidator();
  
    public LengthValidator getValidatorDireccion1() {
        return validatorDireccion1;
    }
  
    public void setValidatorDireccion1(LengthValidator validator) {
        this.validatorDireccion1 = validator;
    }
  
    private TableColumn tableColumnTelefono1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnTelefono1() {
        return tableColumnTelefono1;
    }

    public void setTableColumnTelefono1(TableColumn component) {
        this.tableColumnTelefono1 = component;
    }

    private Label labelTelefono1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTelefono1() {
        return labelTelefono1;
    }

    public void setLabelTelefono1(Label l) {
        this.labelTelefono1 = l;
    }

    private TextArea campoTelefono1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoTelefono1() {
        return campoTelefono1;
    }

    public void setCampoTelefono1(TextArea component) {
        this.campoTelefono1 = component;
    }

    private StaticText campoTelefono1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTelefono1Texto1() {
        return campoTelefono1Texto1;
    }

    public void setCampoTelefono1Texto1(StaticText component) {
        this.campoTelefono1Texto1 = component;
    }

    private LengthValidator validatorTelefono1 = new LengthValidator();
  
    public LengthValidator getValidatorTelefono1() {
        return validatorTelefono1;
    }
  
    public void setValidatorTelefono1(LengthValidator validator) {
        this.validatorTelefono1 = validator;
    }
  
    private TableColumn tableColumnPrimerNombre1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnPrimerNombre1() {
        return tableColumnPrimerNombre1;
    }

    public void setTableColumnPrimerNombre1(TableColumn component) {
        this.tableColumnPrimerNombre1 = component;
    }

    private Label labelPrimerNombre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerNombre1() {
        return labelPrimerNombre1;
    }

    public void setLabelPrimerNombre1(Label l) {
        this.labelPrimerNombre1 = l;
    }

    private TextArea campoPrimerNombre1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoPrimerNombre1() {
        return campoPrimerNombre1;
    }

    public void setCampoPrimerNombre1(TextArea component) {
        this.campoPrimerNombre1 = component;
    }

    private StaticText campoPrimerNombre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPrimerNombre1Texto1() {
        return campoPrimerNombre1Texto1;
    }

    public void setCampoPrimerNombre1Texto1(StaticText component) {
        this.campoPrimerNombre1Texto1 = component;
    }

    private LengthValidator validatorPrimerNombre1 = new LengthValidator();
  
    public LengthValidator getValidatorPrimerNombre1() {
        return validatorPrimerNombre1;
    }
  
    public void setValidatorPrimerNombre1(LengthValidator validator) {
        this.validatorPrimerNombre1 = validator;
    }
  
    private TableColumn tableColumnSegundoNombre1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnSegundoNombre1() {
        return tableColumnSegundoNombre1;
    }

    public void setTableColumnSegundoNombre1(TableColumn component) {
        this.tableColumnSegundoNombre1 = component;
    }

    private Label labelSegundoNombre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoNombre1() {
        return labelSegundoNombre1;
    }

    public void setLabelSegundoNombre1(Label l) {
        this.labelSegundoNombre1 = l;
    }

    private TextArea campoSegundoNombre1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoSegundoNombre1() {
        return campoSegundoNombre1;
    }

    public void setCampoSegundoNombre1(TextArea component) {
        this.campoSegundoNombre1 = component;
    }

    private StaticText campoSegundoNombre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSegundoNombre1Texto1() {
        return campoSegundoNombre1Texto1;
    }

    public void setCampoSegundoNombre1Texto1(StaticText component) {
        this.campoSegundoNombre1Texto1 = component;
    }

    private LengthValidator validatorSegundoNombre1 = new LengthValidator();
  
    public LengthValidator getValidatorSegundoNombre1() {
        return validatorSegundoNombre1;
    }
  
    public void setValidatorSegundoNombre1(LengthValidator validator) {
        this.validatorSegundoNombre1 = validator;
    }
  
    private TableColumn tableColumnPrimerApellido1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnPrimerApellido1() {
        return tableColumnPrimerApellido1;
    }

    public void setTableColumnPrimerApellido1(TableColumn component) {
        this.tableColumnPrimerApellido1 = component;
    }

    private Label labelPrimerApellido1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerApellido1() {
        return labelPrimerApellido1;
    }

    public void setLabelPrimerApellido1(Label l) {
        this.labelPrimerApellido1 = l;
    }

    private TextArea campoPrimerApellido1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoPrimerApellido1() {
        return campoPrimerApellido1;
    }

    public void setCampoPrimerApellido1(TextArea component) {
        this.campoPrimerApellido1 = component;
    }

    private StaticText campoPrimerApellido1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPrimerApellido1Texto1() {
        return campoPrimerApellido1Texto1;
    }

    public void setCampoPrimerApellido1Texto1(StaticText component) {
        this.campoPrimerApellido1Texto1 = component;
    }

    private LengthValidator validatorPrimerApellido1 = new LengthValidator();
  
    public LengthValidator getValidatorPrimerApellido1() {
        return validatorPrimerApellido1;
    }
  
    public void setValidatorPrimerApellido1(LengthValidator validator) {
        this.validatorPrimerApellido1 = validator;
    }
  
    private TableColumn tableColumnSegundoApellido1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnSegundoApellido1() {
        return tableColumnSegundoApellido1;
    }

    public void setTableColumnSegundoApellido1(TableColumn component) {
        this.tableColumnSegundoApellido1 = component;
    }

    private Label labelSegundoApellido1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoApellido1() {
        return labelSegundoApellido1;
    }

    public void setLabelSegundoApellido1(Label l) {
        this.labelSegundoApellido1 = l;
    }

    private TextArea campoSegundoApellido1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoSegundoApellido1() {
        return campoSegundoApellido1;
    }

    public void setCampoSegundoApellido1(TextArea component) {
        this.campoSegundoApellido1 = component;
    }

    private StaticText campoSegundoApellido1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSegundoApellido1Texto1() {
        return campoSegundoApellido1Texto1;
    }

    public void setCampoSegundoApellido1Texto1(StaticText component) {
        this.campoSegundoApellido1Texto1 = component;
    }

    private LengthValidator validatorSegundoApellido1 = new LengthValidator();
  
    public LengthValidator getValidatorSegundoApellido1() {
        return validatorSegundoApellido1;
    }
  
    public void setValidatorSegundoApellido1(LengthValidator validator) {
        this.validatorSegundoApellido1 = validator;
    }
  
    private TableColumn tableColumnEdadALaFecha1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEdadALaFecha1() {
        return tableColumnEdadALaFecha1;
    }

    public void setTableColumnEdadALaFecha1(TableColumn component) {
        this.tableColumnEdadALaFecha1 = component;
    }

    private Label labelEdadALaFecha1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEdadALaFecha1() {
        return labelEdadALaFecha1;
    }

    public void setLabelEdadALaFecha1(Label l) {
        this.labelEdadALaFecha1 = l;
    }

    private TextArea campoEdadALaFecha1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoEdadALaFecha1() {
        return campoEdadALaFecha1;
    }

    public void setCampoEdadALaFecha1(TextArea component) {
        this.campoEdadALaFecha1 = component;
    }

    private StaticText campoEdadALaFecha1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEdadALaFecha1Texto1() {
        return campoEdadALaFecha1Texto1;
    }

    public void setCampoEdadALaFecha1Texto1(StaticText component) {
        this.campoEdadALaFecha1Texto1 = component;
    }

    private LengthValidator validatorEdadALaFecha1 = new LengthValidator();
  
    public LengthValidator getValidatorEdadALaFecha1() {
        return validatorEdadALaFecha1;
    }
  
    public void setValidatorEdadALaFecha1(LengthValidator validator) {
        this.validatorEdadALaFecha1 = validator;
    }
  
    private TableColumn tableColumnSexo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnSexo1() {
        return tableColumnSexo1;
    }

    public void setTableColumnSexo1(TableColumn component) {
        this.tableColumnSexo1 = component;
    }

    private Label labelSexo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSexo1() {
        return labelSexo1;
    }

    public void setLabelSexo1(Label l) {
        this.labelSexo1 = l;
    }

    private TextArea campoSexo1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoSexo1() {
        return campoSexo1;
    }

    public void setCampoSexo1(TextArea component) {
        this.campoSexo1 = component;
    }

    private StaticText campoSexo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSexo1Texto1() {
        return campoSexo1Texto1;
    }

    public void setCampoSexo1Texto1(StaticText component) {
        this.campoSexo1Texto1 = component;
    }

    private LengthValidator validatorSexo1 = new LengthValidator();
  
    public LengthValidator getValidatorSexo1() {
        return validatorSexo1;
    }
  
    public void setValidatorSexo1(LengthValidator validator) {
        this.validatorSexo1 = validator;
    }
  
    private TableColumn tableColumnParentesco1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnParentesco1() {
        return tableColumnParentesco1;
    }

    public void setTableColumnParentesco1(TableColumn component) {
        this.tableColumnParentesco1 = component;
    }

    private Label labelParentesco1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelParentesco1() {
        return labelParentesco1;
    }

    public void setLabelParentesco1(Label l) {
        this.labelParentesco1 = l;
    }

    private TextArea campoParentesco1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoParentesco1() {
        return campoParentesco1;
    }

    public void setCampoParentesco1(TextArea component) {
        this.campoParentesco1 = component;
    }

    private StaticText campoParentesco1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoParentesco1Texto1() {
        return campoParentesco1Texto1;
    }

    public void setCampoParentesco1Texto1(StaticText component) {
        this.campoParentesco1Texto1 = component;
    }

    private LengthValidator validatorParentesco1 = new LengthValidator();
  
    public LengthValidator getValidatorParentesco1() {
        return validatorParentesco1;
    }
  
    public void setValidatorParentesco1(LengthValidator validator) {
        this.validatorParentesco1 = validator;
    }
  
    private TableColumn tableColumnCedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCedula1() {
        return tableColumnCedula1;
    }

    public void setTableColumnCedula1(TableColumn component) {
        this.tableColumnCedula1 = component;
    }

    private Label labelCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCedula1() {
        return labelCedula1;
    }

    public void setLabelCedula1(Label l) {
        this.labelCedula1 = l;
    }

    private TextArea campoCedula1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCedula1() {
        return campoCedula1;
    }

    public void setCampoCedula1(TextArea component) {
        this.campoCedula1 = component;
    }

    private StaticText campoCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCedula1Texto1() {
        return campoCedula1Texto1;
    }

    public void setCampoCedula1Texto1(StaticText component) {
        this.campoCedula1Texto1 = component;
    }

    private LengthValidator validatorCedula1 = new LengthValidator();
  
    public LengthValidator getValidatorCedula1() {
        return validatorCedula1;
    }
  
    public void setValidatorCedula1(LengthValidator validator) {
        this.validatorCedula1 = validator;
    }
  
    private TableColumn tableColumnNombreJefeHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreJefeHogar1() {
        return tableColumnNombreJefeHogar1;
    }

    public void setTableColumnNombreJefeHogar1(TableColumn component) {
        this.tableColumnNombreJefeHogar1 = component;
    }

    private Label labelNombreJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreJefeHogar1() {
        return labelNombreJefeHogar1;
    }

    public void setLabelNombreJefeHogar1(Label l) {
        this.labelNombreJefeHogar1 = l;
    }

    private TextArea campoNombreJefeHogar1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreJefeHogar1() {
        return campoNombreJefeHogar1;
    }

    public void setCampoNombreJefeHogar1(TextArea component) {
        this.campoNombreJefeHogar1 = component;
    }

    private StaticText campoNombreJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreJefeHogar1Texto1() {
        return campoNombreJefeHogar1Texto1;
    }

    public void setCampoNombreJefeHogar1Texto1(StaticText component) {
        this.campoNombreJefeHogar1Texto1 = component;
    }

    private LengthValidator validatorNombreJefeHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreJefeHogar1() {
        return validatorNombreJefeHogar1;
    }
  
    public void setValidatorNombreJefeHogar1(LengthValidator validator) {
        this.validatorNombreJefeHogar1 = validator;
    }
  
    private TableColumn tableColumnCedulaJefeHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCedulaJefeHogar1() {
        return tableColumnCedulaJefeHogar1;
    }

    public void setTableColumnCedulaJefeHogar1(TableColumn component) {
        this.tableColumnCedulaJefeHogar1 = component;
    }

    private Label labelCedulaJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCedulaJefeHogar1() {
        return labelCedulaJefeHogar1;
    }

    public void setLabelCedulaJefeHogar1(Label l) {
        this.labelCedulaJefeHogar1 = l;
    }

    private TextArea campoCedulaJefeHogar1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCedulaJefeHogar1() {
        return campoCedulaJefeHogar1;
    }

    public void setCampoCedulaJefeHogar1(TextArea component) {
        this.campoCedulaJefeHogar1 = component;
    }

    private StaticText campoCedulaJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCedulaJefeHogar1Texto1() {
        return campoCedulaJefeHogar1Texto1;
    }

    public void setCampoCedulaJefeHogar1Texto1(StaticText component) {
        this.campoCedulaJefeHogar1Texto1 = component;
    }

    private LengthValidator validatorCedulaJefeHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorCedulaJefeHogar1() {
        return validatorCedulaJefeHogar1;
    }
  
    public void setValidatorCedulaJefeHogar1(LengthValidator validator) {
        this.validatorCedulaJefeHogar1 = validator;
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
  
    private TableColumn tableColumnValidado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnValidado1() {
        return tableColumnValidado1;
    }

    public void setTableColumnValidado1(TableColumn component) {
        this.tableColumnValidado1 = component;
    }

    private Label labelValidado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValidado1() {
        return labelValidado1;
    }

    public void setLabelValidado1(Label l) {
        this.labelValidado1 = l;
    }

    private TextArea campoValidado1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoValidado1() {
        return campoValidado1;
    }

    public void setCampoValidado1(TextArea component) {
        this.campoValidado1 = component;
    }

    private StaticText campoValidado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValidado1Texto1() {
        return campoValidado1Texto1;
    }

    public void setCampoValidado1Texto1(StaticText component) {
        this.campoValidado1Texto1 = component;
    }

    private LengthValidator validatorValidado1 = new LengthValidator();
  
    public LengthValidator getValidatorValidado1() {
        return validatorValidado1;
    }
  
    public void setValidatorValidado1(LengthValidator validator) {
        this.validatorValidado1 = validator;
    }
  
    private TableColumn tableColumnObservaciones1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnObservaciones1() {
        return tableColumnObservaciones1;
    }

    public void setTableColumnObservaciones1(TableColumn component) {
        this.tableColumnObservaciones1 = component;
    }

    private Label labelObservaciones1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservaciones1() {
        return labelObservaciones1;
    }

    public void setLabelObservaciones1(Label l) {
        this.labelObservaciones1 = l;
    }

    private TextArea campoObservaciones1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservaciones1() {
        return campoObservaciones1;
    }

    public void setCampoObservaciones1(TextArea component) {
        this.campoObservaciones1 = component;
    }

    private StaticText campoObservaciones1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservaciones1Texto1() {
        return campoObservaciones1Texto1;
    }

    public void setCampoObservaciones1Texto1(StaticText component) {
        this.campoObservaciones1Texto1 = component;
    }

    private LengthValidator validatorObservaciones1 = new LengthValidator();
  
    public LengthValidator getValidatorObservaciones1() {
        return validatorObservaciones1;
    }
  
    public void setValidatorObservaciones1(LengthValidator validator) {
        this.validatorObservaciones1 = validator;
    }
  
    private TableColumn tableColumnFuncionario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFuncionario1() {
        return tableColumnFuncionario1;
    }

    public void setTableColumnFuncionario1(TableColumn component) {
        this.tableColumnFuncionario1 = component;
    }

    private Label labelFuncionario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFuncionario1() {
        return labelFuncionario1;
    }

    public void setLabelFuncionario1(Label l) {
        this.labelFuncionario1 = l;
    }

    private TextArea campoFuncionario1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoFuncionario1() {
        return campoFuncionario1;
    }

    public void setCampoFuncionario1(TextArea component) {
        this.campoFuncionario1 = component;
    }

    private StaticText campoFuncionario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFuncionario1Texto1() {
        return campoFuncionario1Texto1;
    }

    public void setCampoFuncionario1Texto1(StaticText component) {
        this.campoFuncionario1Texto1 = component;
    }

    private LengthValidator validatorFuncionario1 = new LengthValidator();
  
    public LengthValidator getValidatorFuncionario1() {
        return validatorFuncionario1;
    }
  
    public void setValidatorFuncionario1(LengthValidator validator) {
        this.validatorFuncionario1 = validator;
    }
  
    private TableColumn tableColumnCausaInvalidacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCausaInvalidacion1() {
        return tableColumnCausaInvalidacion1;
    }

    public void setTableColumnCausaInvalidacion1(TableColumn component) {
        this.tableColumnCausaInvalidacion1 = component;
    }

    private Label labelCausaInvalidacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCausaInvalidacion1() {
        return labelCausaInvalidacion1;
    }

    public void setLabelCausaInvalidacion1(Label l) {
        this.labelCausaInvalidacion1 = l;
    }

    private TextArea campoCausaInvalidacion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCausaInvalidacion1() {
        return campoCausaInvalidacion1;
    }

    public void setCampoCausaInvalidacion1(TextArea component) {
        this.campoCausaInvalidacion1 = component;
    }

    private StaticText campoCausaInvalidacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCausaInvalidacion1Texto1() {
        return campoCausaInvalidacion1Texto1;
    }

    public void setCampoCausaInvalidacion1Texto1(StaticText component) {
        this.campoCausaInvalidacion1Texto1 = component;
    }

    private LengthValidator validatorCausaInvalidacion1 = new LengthValidator();
  
    public LengthValidator getValidatorCausaInvalidacion1() {
        return validatorCausaInvalidacion1;
    }
  
    public void setValidatorCausaInvalidacion1(LengthValidator validator) {
        this.validatorCausaInvalidacion1 = validator;
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

    private LogImpCenCachedRowSetDataProvider2 logImpCenDataProvider = new LogImpCenCachedRowSetDataProvider2();

    @Override
    public LogImpCenCachedRowSetDataProvider2 getLogImpCenDataProvider() {
        return logImpCenDataProvider;
    }

    public void setLogImpCenDataProvider(LogImpCenCachedRowSetDataProvider2 crsdp) {
        this.logImpCenDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogImpCen5() {
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
        logImpCenDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogImpCen...">
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
    private AsistentePaginaActualizacionLogImpCen asistente = new AsistentePaginaActualizacionLogImpCen(this);

    public AsistentePaginaActualizacionLogImpCen getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogImpCen5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogImpCen5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogImpCen5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogImpCenDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogImpCenCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_IMP_CEN;
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
            this.getLogImpCenDataProvider().consultarLogImpCen(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogImpCenDataProvider().consultarLogImpCen(filtro);
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
        if (this.getGestor().agregar()) {
            return this.getGestor().accionVincularDetalle();
        }
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
