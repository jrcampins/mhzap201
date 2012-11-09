/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */

package com.egt.web.usuario;

import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.base.constants.URX2;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConTabla;
import com.egt.core.aplicacion.web.PaginaActualizacionConAccionMultiple;
import com.egt.core.aplicacion.web.PaginaActualizacionConEdicionMultiple;
import com.egt.core.aplicacion.web.PaginaConsultaConFiltro;
import com.egt.core.aplicacion.web.PaginaConsultaConTabla;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;
import javax.ejb.EJB;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.process.UsuarioBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;

public class Usuario1 extends AbstractPageBean
        implements PaginaActualizacionUsuario, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro,
        PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdUsuario1.setMinimum(0L);
        validatorIdUsuario1.setMaximum(1000000000000000000L);
        validatorCodigoUsuario1.setMaximum(30);
        validatorNombreUsuario1.setMaximum(100);
        validatorCorreoElectronico1.setMaximum(100);
        usuarioDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.usuarioRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
        usuarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.usuarioReferenceRowSet}"));
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

    private TableColumn tableColumnIdUsuario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuario1() {
        return tableColumnIdUsuario1;
    }

    public void setTableColumnIdUsuario1(TableColumn component) {
        this.tableColumnIdUsuario1 = component;
    }

    private Label labelIdUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuario1() {
        return labelIdUsuario1;
    }

    public void setLabelIdUsuario1(Label l) {
        this.labelIdUsuario1 = l;
    }

    private TextField campoIdUsuario1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuario1() {
        return campoIdUsuario1;
    }

    public void setCampoIdUsuario1(TextField component) {
        this.campoIdUsuario1 = component;
    }

    private StaticText campoIdUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuario1Texto1() {
        return campoIdUsuario1Texto1;
    }

    public void setCampoIdUsuario1Texto1(StaticText component) {
        this.campoIdUsuario1Texto1 = component;
    }

    private LongConverter converterIdUsuario1 = new LongConverter();

    public LongConverter getConverterIdUsuario1() {
        return converterIdUsuario1;
    }

    public void setConverterIdUsuario1(LongConverter converter) {
        this.converterIdUsuario1 = converter;
    }

    private LongRangeValidator validatorIdUsuario1 = new LongRangeValidator();

    public LongRangeValidator getValidatorIdUsuario1() {
        return validatorIdUsuario1;
    }

    public void setValidatorIdUsuario1(LongRangeValidator validator) {
        this.validatorIdUsuario1 = validator;
    }

    private TableColumn tableColumnCodigoUsuario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoUsuario1() {
        return tableColumnCodigoUsuario1;
    }

    public void setTableColumnCodigoUsuario1(TableColumn component) {
        this.tableColumnCodigoUsuario1 = component;
    }

    private Label labelCodigoUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoUsuario1() {
        return labelCodigoUsuario1;
    }

    public void setLabelCodigoUsuario1(Label l) {
        this.labelCodigoUsuario1 = l;
    }

    private TextField campoCodigoUsuario1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoUsuario1() {
        return campoCodigoUsuario1;
    }

    public void setCampoCodigoUsuario1(TextField component) {
        this.campoCodigoUsuario1 = component;
    }

    private StaticText campoCodigoUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoUsuario1Texto1() {
        return campoCodigoUsuario1Texto1;
    }

    public void setCampoCodigoUsuario1Texto1(StaticText component) {
        this.campoCodigoUsuario1Texto1 = component;
    }

    private LengthValidator validatorCodigoUsuario1 = new LengthValidator();

    public LengthValidator getValidatorCodigoUsuario1() {
        return validatorCodigoUsuario1;
    }

    public void setValidatorCodigoUsuario1(LengthValidator validator) {
        this.validatorCodigoUsuario1 = validator;
    }

    private TableColumn tableColumnNombreUsuario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreUsuario1() {
        return tableColumnNombreUsuario1;
    }

    public void setTableColumnNombreUsuario1(TableColumn component) {
        this.tableColumnNombreUsuario1 = component;
    }

    private Label labelNombreUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreUsuario1() {
        return labelNombreUsuario1;
    }

    public void setLabelNombreUsuario1(Label l) {
        this.labelNombreUsuario1 = l;
    }

    private TextField campoNombreUsuario1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreUsuario1() {
        return campoNombreUsuario1;
    }

    public void setCampoNombreUsuario1(TextField component) {
        this.campoNombreUsuario1 = component;
    }

    private StaticText campoNombreUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreUsuario1Texto1() {
        return campoNombreUsuario1Texto1;
    }

    public void setCampoNombreUsuario1Texto1(StaticText component) {
        this.campoNombreUsuario1Texto1 = component;
    }

    private LengthValidator validatorNombreUsuario1 = new LengthValidator();

    public LengthValidator getValidatorNombreUsuario1() {
        return validatorNombreUsuario1;
    }

    public void setValidatorNombreUsuario1(LengthValidator validator) {
        this.validatorNombreUsuario1 = validator;
    }

    private TableColumn tableColumnCorreoElectronico1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCorreoElectronico1() {
        return tableColumnCorreoElectronico1;
    }

    public void setTableColumnCorreoElectronico1(TableColumn component) {
        this.tableColumnCorreoElectronico1 = component;
    }

    private Label labelCorreoElectronico1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCorreoElectronico1() {
        return labelCorreoElectronico1;
    }

    public void setLabelCorreoElectronico1(Label l) {
        this.labelCorreoElectronico1 = l;
    }

    private TextField campoCorreoElectronico1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCorreoElectronico1() {
        return campoCorreoElectronico1;
    }

    public void setCampoCorreoElectronico1(TextField component) {
        this.campoCorreoElectronico1 = component;
    }

    private StaticText campoCorreoElectronico1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCorreoElectronico1Texto1() {
        return campoCorreoElectronico1Texto1;
    }

    public void setCampoCorreoElectronico1Texto1(StaticText component) {
        this.campoCorreoElectronico1Texto1 = component;
    }

    private LengthValidator validatorCorreoElectronico1 = new LengthValidator();

    public LengthValidator getValidatorCorreoElectronico1() {
        return validatorCorreoElectronico1;
    }

    public void setValidatorCorreoElectronico1(LengthValidator validator) {
        this.validatorCorreoElectronico1 = validator;
    }

    private TableColumn tableColumnIdUsuarioSupervisor1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioSupervisor1() {
        return tableColumnIdUsuarioSupervisor1;
    }

    public void setTableColumnIdUsuarioSupervisor1(TableColumn component) {
        this.tableColumnIdUsuarioSupervisor1 = component;
    }

    private Label labelIdUsuarioSupervisor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioSupervisor1() {
        return labelIdUsuarioSupervisor1;
    }

    public void setLabelIdUsuarioSupervisor1(Label l) {
        this.labelIdUsuarioSupervisor1 = l;
    }

    private TextField campoIdUsuarioSupervisor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuarioSupervisor1() {
        return campoIdUsuarioSupervisor1;
    }

    public void setCampoIdUsuarioSupervisor1(TextField component) {
        this.campoIdUsuarioSupervisor1 = component;
    }

    private StaticText campoIdUsuarioSupervisor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioSupervisor1Texto1() {
        return campoIdUsuarioSupervisor1Texto1;
    }

    public void setCampoIdUsuarioSupervisor1Texto1(StaticText component) {
        this.campoIdUsuarioSupervisor1Texto1 = component;
    }

    private Button campoIdUsuarioSupervisor1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioSupervisor1Boton1() {
        return campoIdUsuarioSupervisor1Boton1;
    }

    public void setCampoIdUsuarioSupervisor1Boton1(Button component) {
        this.campoIdUsuarioSupervisor1Boton1 = component;
    }

    private Button campoIdUsuarioSupervisor1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioSupervisor1Boton3() {
        return campoIdUsuarioSupervisor1Boton3;
    }

    public void setCampoIdUsuarioSupervisor1Boton3(Button component) {
        this.campoIdUsuarioSupervisor1Boton3 = component;
    }

    private TableColumn tableColumnIdUsuarioSupervisor2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioSupervisor2() {
        return tableColumnIdUsuarioSupervisor2;
    }

    public void setTableColumnIdUsuarioSupervisor2(TableColumn component) {
        this.tableColumnIdUsuarioSupervisor2 = component;
    }

    private Label labelIdUsuarioSupervisor2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioSupervisor2() {
        return labelIdUsuarioSupervisor2;
    }

    public void setLabelIdUsuarioSupervisor2(Label l) {
        this.labelIdUsuarioSupervisor2 = l;
    }

    private ImageHyperlink campoIdUsuarioSupervisor1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdUsuarioSupervisor1Hiper1() {
        return campoIdUsuarioSupervisor1Hiper1;
    }

    public void setCampoIdUsuarioSupervisor1Hiper1(ImageHyperlink component) {
        this.campoIdUsuarioSupervisor1Hiper1 = component;
    }

    private TableColumn tableColumnEsSuperUsuario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsSuperUsuario1() {
        return tableColumnEsSuperUsuario1;
    }

    public void setTableColumnEsSuperUsuario1(TableColumn component) {
        this.tableColumnEsSuperUsuario1 = component;
    }

    private Label labelEsSuperUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsSuperUsuario1() {
        return labelEsSuperUsuario1;
    }

    public void setLabelEsSuperUsuario1(Label l) {
        this.labelEsSuperUsuario1 = l;
    }

    private DropDown listaEsSuperUsuario1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsSuperUsuario1() {
        return listaEsSuperUsuario1;
    }

    public void setListaEsSuperUsuario1(DropDown component) {
        this.listaEsSuperUsuario1 = component;
    }

    private StaticText listaEsSuperUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsSuperUsuario1Texto1() {
        return listaEsSuperUsuario1Texto1;
    }

    public void setListaEsSuperUsuario1Texto1(StaticText component) {
        this.listaEsSuperUsuario1Texto1 = component;
    }

    private IntegerConverter converterEsSuperUsuario1 = new IntegerConverter();

    public IntegerConverter getConverterEsSuperUsuario1() {
        return converterEsSuperUsuario1;
    }

    public void setConverterEsSuperUsuario1(IntegerConverter converter) {
        this.converterEsSuperUsuario1 = converter;
    }

    private TableColumn tableColumnEsUsuarioInactivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsUsuarioInactivo1() {
        return tableColumnEsUsuarioInactivo1;
    }

    public void setTableColumnEsUsuarioInactivo1(TableColumn component) {
        this.tableColumnEsUsuarioInactivo1 = component;
    }

    private Label labelEsUsuarioInactivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsUsuarioInactivo1() {
        return labelEsUsuarioInactivo1;
    }

    public void setLabelEsUsuarioInactivo1(Label l) {
        this.labelEsUsuarioInactivo1 = l;
    }

    private DropDown listaEsUsuarioInactivo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsUsuarioInactivo1() {
        return listaEsUsuarioInactivo1;
    }

    public void setListaEsUsuarioInactivo1(DropDown component) {
        this.listaEsUsuarioInactivo1 = component;
    }

    private StaticText listaEsUsuarioInactivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsUsuarioInactivo1Texto1() {
        return listaEsUsuarioInactivo1Texto1;
    }

    public void setListaEsUsuarioInactivo1Texto1(StaticText component) {
        this.listaEsUsuarioInactivo1Texto1 = component;
    }

    private IntegerConverter converterEsUsuarioInactivo1 = new IntegerConverter();

    public IntegerConverter getConverterEsUsuarioInactivo1() {
        return converterEsUsuarioInactivo1;
    }

    public void setConverterEsUsuarioInactivo1(IntegerConverter converter) {
        this.converterEsUsuarioInactivo1 = converter;
    }

    private TableColumn tableColumnEsUsuarioModificado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsUsuarioModificado1() {
        return tableColumnEsUsuarioModificado1;
    }

    public void setTableColumnEsUsuarioModificado1(TableColumn component) {
        this.tableColumnEsUsuarioModificado1 = component;
    }

    private Label labelEsUsuarioModificado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsUsuarioModificado1() {
        return labelEsUsuarioModificado1;
    }

    public void setLabelEsUsuarioModificado1(Label l) {
        this.labelEsUsuarioModificado1 = l;
    }

    private DropDown listaEsUsuarioModificado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsUsuarioModificado1() {
        return listaEsUsuarioModificado1;
    }

    public void setListaEsUsuarioModificado1(DropDown component) {
        this.listaEsUsuarioModificado1 = component;
    }

    private StaticText listaEsUsuarioModificado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsUsuarioModificado1Texto1() {
        return listaEsUsuarioModificado1Texto1;
    }

    public void setListaEsUsuarioModificado1Texto1(StaticText component) {
        this.listaEsUsuarioModificado1Texto1 = component;
    }

    private IntegerConverter converterEsUsuarioModificado1 = new IntegerConverter();

    public IntegerConverter getConverterEsUsuarioModificado1() {
        return converterEsUsuarioModificado1;
    }

    public void setConverterEsUsuarioModificado1(IntegerConverter converter) {
        this.converterEsUsuarioModificado1 = converter;
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

    private ImageHyperlink imageHyperlink2 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink component) {
        this.imageHyperlink2 = component;
    }

    private UsuarioCachedRowSetDataProvider3 usuarioDataProvider = new UsuarioCachedRowSetDataProvider3();

    @Override
    public UsuarioCachedRowSetDataProvider3 getUsuarioDataProvider() {
        return usuarioDataProvider;
    }

    public void setUsuarioDataProvider(UsuarioCachedRowSetDataProvider3 crsdp) {
        this.usuarioDataProvider = crsdp;
    }

    private PersonaCachedRowSetDataProvider2 personaReferenceDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider() {
        return personaReferenceDataProvider;
    }

    public void setPersonaReferenceDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaReferenceDataProvider = crsdp;
    }

    private UsuarioCachedRowSetDataProvider3 usuarioReferenceDataProvider = new UsuarioCachedRowSetDataProvider3();

    @Override
    public UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider() {
        return usuarioReferenceDataProvider;
    }

    public void setUsuarioReferenceDataProvider(UsuarioCachedRowSetDataProvider3 crsdp) {
        this.usuarioReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public Usuario1() {
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
        usuarioDataProvider.close();
        personaReferenceDataProvider.close();
        usuarioReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionUsuario...">
    // </editor-fold>
/**/
    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionUsuario asistente = new AsistentePaginaActualizacionUsuario(this);

    public AsistentePaginaActualizacionUsuario getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Usuario1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("Usuario1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("Usuario1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getUsuarioDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_USUARIO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return UsuarioCachedRowSetDataProvider3.FUNCION_CREAR_USUARIO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return UsuarioCachedRowSetDataProvider3.FUNCION_MODIFICAR_USUARIO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return UsuarioCachedRowSetDataProvider3.FUNCION_ELIMINAR_USUARIO;
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
            this.getUsuarioDataProvider().consultarUsuario(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getUsuarioDataProvider().consultarUsuario(filtro);
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
    public void campoIdUsuarioSupervisor1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUsuarioSupervisor1_validate(context, component, value);
    }

    // </editor-fold>
/**/
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
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones especificas de la pagina">
    public String botonProcesarFila1_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila1() {
        String urx = URX2.COMANDO_USUARIO;
        return this.getGestor().getScriptAbrirVentana(urx);
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
    @EJB
    UsuarioBusinessProcessLocal usuarioBusinessProcess;

    @Override
    public Object getUsuarioBusinessProcess() {
        return usuarioBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    @EJB
    private ReporterBrokerLocal reporter;

    @Override
    public Object getReporter() {
        return reporter;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";

}
