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

import com.egt.data.specific.xdp2.LogImpIdsCachedRowSetDataProvider2;
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

public class LogImpIds5 extends AbstractPageBean
        implements PaginaActualizacionLogImpIds, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogImpIds1.setMinimum(0L);
        validatorIdLogImpIds1.setMaximum(1000000000000000000L);
        validatorCedula1.setMaximum(8160);
        validatorLetraCedula1.setMaximum(8160);
        validatorApellidos1.setMaximum(8160);
        validatorNombres1.setMaximum(8160);
        validatorNacimiento1.setMaximum(8160);
        validatorSexo1.setMaximum(8160);
        validatorNacionalidad1.setMaximum(8160);
        validatorEstadoCivil1.setMaximum(8160);
        validatorLugarNacimiento1.setMaximum(8160);
        validatorIndigena1.setMaximum(8160);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        validatorNombreArchivo1.setMaximum(8160);
        validatorCodigoArchivo1.setMaximum(8160);
        logImpIdsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logImpIdsRowSet}"));
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

    private TableColumn tableColumnIdLogImpIds1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogImpIds1() {
        return tableColumnIdLogImpIds1;
    }

    public void setTableColumnIdLogImpIds1(TableColumn component) {
        this.tableColumnIdLogImpIds1 = component;
    }

    private Label labelIdLogImpIds1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogImpIds1() {
        return labelIdLogImpIds1;
    }

    public void setLabelIdLogImpIds1(Label l) {
        this.labelIdLogImpIds1 = l;
    }

    private TextField campoIdLogImpIds1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogImpIds1() {
        return campoIdLogImpIds1;
    }

    public void setCampoIdLogImpIds1(TextField component) {
        this.campoIdLogImpIds1 = component;
    }

    private StaticText campoIdLogImpIds1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogImpIds1Texto1() {
        return campoIdLogImpIds1Texto1;
    }

    public void setCampoIdLogImpIds1Texto1(StaticText component) {
        this.campoIdLogImpIds1Texto1 = component;
    }

    private LongConverter converterIdLogImpIds1 = new LongConverter();
  
    public LongConverter getConverterIdLogImpIds1() {
        return converterIdLogImpIds1;
    }
  
    public void setConverterIdLogImpIds1(LongConverter converter) {
        this.converterIdLogImpIds1 = converter;
    }
  
    private LongRangeValidator validatorIdLogImpIds1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogImpIds1() {
        return validatorIdLogImpIds1;
    }
  
    public void setValidatorIdLogImpIds1(LongRangeValidator validator) {
        this.validatorIdLogImpIds1 = validator;
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
  
    private TableColumn tableColumnLetraCedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLetraCedula1() {
        return tableColumnLetraCedula1;
    }

    public void setTableColumnLetraCedula1(TableColumn component) {
        this.tableColumnLetraCedula1 = component;
    }

    private Label labelLetraCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedula1() {
        return labelLetraCedula1;
    }

    public void setLabelLetraCedula1(Label l) {
        this.labelLetraCedula1 = l;
    }

    private TextArea campoLetraCedula1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoLetraCedula1() {
        return campoLetraCedula1;
    }

    public void setCampoLetraCedula1(TextArea component) {
        this.campoLetraCedula1 = component;
    }

    private StaticText campoLetraCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedula1Texto1() {
        return campoLetraCedula1Texto1;
    }

    public void setCampoLetraCedula1Texto1(StaticText component) {
        this.campoLetraCedula1Texto1 = component;
    }

    private LengthValidator validatorLetraCedula1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCedula1() {
        return validatorLetraCedula1;
    }
  
    public void setValidatorLetraCedula1(LengthValidator validator) {
        this.validatorLetraCedula1 = validator;
    }
  
    private TableColumn tableColumnApellidos1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnApellidos1() {
        return tableColumnApellidos1;
    }

    public void setTableColumnApellidos1(TableColumn component) {
        this.tableColumnApellidos1 = component;
    }

    private Label labelApellidos1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApellidos1() {
        return labelApellidos1;
    }

    public void setLabelApellidos1(Label l) {
        this.labelApellidos1 = l;
    }

    private TextArea campoApellidos1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoApellidos1() {
        return campoApellidos1;
    }

    public void setCampoApellidos1(TextArea component) {
        this.campoApellidos1 = component;
    }

    private StaticText campoApellidos1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoApellidos1Texto1() {
        return campoApellidos1Texto1;
    }

    public void setCampoApellidos1Texto1(StaticText component) {
        this.campoApellidos1Texto1 = component;
    }

    private LengthValidator validatorApellidos1 = new LengthValidator();
  
    public LengthValidator getValidatorApellidos1() {
        return validatorApellidos1;
    }
  
    public void setValidatorApellidos1(LengthValidator validator) {
        this.validatorApellidos1 = validator;
    }
  
    private TableColumn tableColumnNombres1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombres1() {
        return tableColumnNombres1;
    }

    public void setTableColumnNombres1(TableColumn component) {
        this.tableColumnNombres1 = component;
    }

    private Label labelNombres1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombres1() {
        return labelNombres1;
    }

    public void setLabelNombres1(Label l) {
        this.labelNombres1 = l;
    }

    private TextArea campoNombres1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombres1() {
        return campoNombres1;
    }

    public void setCampoNombres1(TextArea component) {
        this.campoNombres1 = component;
    }

    private StaticText campoNombres1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombres1Texto1() {
        return campoNombres1Texto1;
    }

    public void setCampoNombres1Texto1(StaticText component) {
        this.campoNombres1Texto1 = component;
    }

    private LengthValidator validatorNombres1 = new LengthValidator();
  
    public LengthValidator getValidatorNombres1() {
        return validatorNombres1;
    }
  
    public void setValidatorNombres1(LengthValidator validator) {
        this.validatorNombres1 = validator;
    }
  
    private TableColumn tableColumnNacimiento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNacimiento1() {
        return tableColumnNacimiento1;
    }

    public void setTableColumnNacimiento1(TableColumn component) {
        this.tableColumnNacimiento1 = component;
    }

    private Label labelNacimiento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNacimiento1() {
        return labelNacimiento1;
    }

    public void setLabelNacimiento1(Label l) {
        this.labelNacimiento1 = l;
    }

    private TextArea campoNacimiento1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNacimiento1() {
        return campoNacimiento1;
    }

    public void setCampoNacimiento1(TextArea component) {
        this.campoNacimiento1 = component;
    }

    private StaticText campoNacimiento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNacimiento1Texto1() {
        return campoNacimiento1Texto1;
    }

    public void setCampoNacimiento1Texto1(StaticText component) {
        this.campoNacimiento1Texto1 = component;
    }

    private LengthValidator validatorNacimiento1 = new LengthValidator();
  
    public LengthValidator getValidatorNacimiento1() {
        return validatorNacimiento1;
    }
  
    public void setValidatorNacimiento1(LengthValidator validator) {
        this.validatorNacimiento1 = validator;
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
  
    private TableColumn tableColumnNacionalidad1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNacionalidad1() {
        return tableColumnNacionalidad1;
    }

    public void setTableColumnNacionalidad1(TableColumn component) {
        this.tableColumnNacionalidad1 = component;
    }

    private Label labelNacionalidad1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNacionalidad1() {
        return labelNacionalidad1;
    }

    public void setLabelNacionalidad1(Label l) {
        this.labelNacionalidad1 = l;
    }

    private TextArea campoNacionalidad1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNacionalidad1() {
        return campoNacionalidad1;
    }

    public void setCampoNacionalidad1(TextArea component) {
        this.campoNacionalidad1 = component;
    }

    private StaticText campoNacionalidad1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNacionalidad1Texto1() {
        return campoNacionalidad1Texto1;
    }

    public void setCampoNacionalidad1Texto1(StaticText component) {
        this.campoNacionalidad1Texto1 = component;
    }

    private LengthValidator validatorNacionalidad1 = new LengthValidator();
  
    public LengthValidator getValidatorNacionalidad1() {
        return validatorNacionalidad1;
    }
  
    public void setValidatorNacionalidad1(LengthValidator validator) {
        this.validatorNacionalidad1 = validator;
    }
  
    private TableColumn tableColumnEstadoCivil1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEstadoCivil1() {
        return tableColumnEstadoCivil1;
    }

    public void setTableColumnEstadoCivil1(TableColumn component) {
        this.tableColumnEstadoCivil1 = component;
    }

    private Label labelEstadoCivil1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEstadoCivil1() {
        return labelEstadoCivil1;
    }

    public void setLabelEstadoCivil1(Label l) {
        this.labelEstadoCivil1 = l;
    }

    private TextArea campoEstadoCivil1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoEstadoCivil1() {
        return campoEstadoCivil1;
    }

    public void setCampoEstadoCivil1(TextArea component) {
        this.campoEstadoCivil1 = component;
    }

    private StaticText campoEstadoCivil1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEstadoCivil1Texto1() {
        return campoEstadoCivil1Texto1;
    }

    public void setCampoEstadoCivil1Texto1(StaticText component) {
        this.campoEstadoCivil1Texto1 = component;
    }

    private LengthValidator validatorEstadoCivil1 = new LengthValidator();
  
    public LengthValidator getValidatorEstadoCivil1() {
        return validatorEstadoCivil1;
    }
  
    public void setValidatorEstadoCivil1(LengthValidator validator) {
        this.validatorEstadoCivil1 = validator;
    }
  
    private TableColumn tableColumnLugarNacimiento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLugarNacimiento1() {
        return tableColumnLugarNacimiento1;
    }

    public void setTableColumnLugarNacimiento1(TableColumn component) {
        this.tableColumnLugarNacimiento1 = component;
    }

    private Label labelLugarNacimiento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLugarNacimiento1() {
        return labelLugarNacimiento1;
    }

    public void setLabelLugarNacimiento1(Label l) {
        this.labelLugarNacimiento1 = l;
    }

    private TextArea campoLugarNacimiento1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoLugarNacimiento1() {
        return campoLugarNacimiento1;
    }

    public void setCampoLugarNacimiento1(TextArea component) {
        this.campoLugarNacimiento1 = component;
    }

    private StaticText campoLugarNacimiento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLugarNacimiento1Texto1() {
        return campoLugarNacimiento1Texto1;
    }

    public void setCampoLugarNacimiento1Texto1(StaticText component) {
        this.campoLugarNacimiento1Texto1 = component;
    }

    private LengthValidator validatorLugarNacimiento1 = new LengthValidator();
  
    public LengthValidator getValidatorLugarNacimiento1() {
        return validatorLugarNacimiento1;
    }
  
    public void setValidatorLugarNacimiento1(LengthValidator validator) {
        this.validatorLugarNacimiento1 = validator;
    }
  
    private TableColumn tableColumnIndigena1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIndigena1() {
        return tableColumnIndigena1;
    }

    public void setTableColumnIndigena1(TableColumn component) {
        this.tableColumnIndigena1 = component;
    }

    private Label labelIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndigena1() {
        return labelIndigena1;
    }

    public void setLabelIndigena1(Label l) {
        this.labelIndigena1 = l;
    }

    private TextArea campoIndigena1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoIndigena1() {
        return campoIndigena1;
    }

    public void setCampoIndigena1(TextArea component) {
        this.campoIndigena1 = component;
    }

    private StaticText campoIndigena1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndigena1Texto1() {
        return campoIndigena1Texto1;
    }

    public void setCampoIndigena1Texto1(StaticText component) {
        this.campoIndigena1Texto1 = component;
    }

    private LengthValidator validatorIndigena1 = new LengthValidator();
  
    public LengthValidator getValidatorIndigena1() {
        return validatorIndigena1;
    }
  
    public void setValidatorIndigena1(LengthValidator validator) {
        this.validatorIndigena1 = validator;
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

    private LogImpIdsCachedRowSetDataProvider2 logImpIdsDataProvider = new LogImpIdsCachedRowSetDataProvider2();

    @Override
    public LogImpIdsCachedRowSetDataProvider2 getLogImpIdsDataProvider() {
        return logImpIdsDataProvider;
    }

    public void setLogImpIdsDataProvider(LogImpIdsCachedRowSetDataProvider2 crsdp) {
        this.logImpIdsDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogImpIds5() {
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
        logImpIdsDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogImpIds...">
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
    private AsistentePaginaActualizacionLogImpIds asistente = new AsistentePaginaActualizacionLogImpIds(this);

    public AsistentePaginaActualizacionLogImpIds getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogImpIds5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogImpIds5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogImpIds5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogImpIdsDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogImpIdsCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_IMP_IDS;
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
            this.getLogImpIdsDataProvider().consultarLogImpIds(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogImpIdsDataProvider().consultarLogImpIds(filtro);
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
