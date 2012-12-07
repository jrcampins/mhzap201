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
package com.egt.web.configuracion.basica;

import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoAplicacionCachedRowSetDataProvider2;
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

public class ClaseRecurso2 extends AbstractPageBean
        implements PaginaActualizacionClaseRecurso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdClaseRecurso1.setMinimum(0L);
        validatorIdClaseRecurso1.setMaximum(1000000000000000000L);
        validatorCodigoClaseRecurso1.setMaximum(100);
        validatorNombreClaseRecurso1.setMaximum(100);
        validatorDescripcionClaseRecurso1.setMaximum(8160);
        validatorIdAplicacionWeb1.setMinimum(0L);
        validatorIdAplicacionWeb1.setMaximum(1000000000000000000L);
        validatorLimiteFilasConsulta1.setMinimum(0L);
        validatorLimiteFilasConsulta1.setMaximum(1000000000L);
        validatorLimiteFilasInforme1.setMinimum(0L);
        validatorLimiteFilasInforme1.setMaximum(1000000000L);
        validatorOrdenPresentacion1.setMinimum(0L);
        validatorOrdenPresentacion1.setMaximum(1000000000L);
        validatorEtiquetaHipervinculo1.setMaximum(20);
        validatorAliasClaseRecurso1.setMaximum(100);
        claseRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoRowSet}"));
        funcionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionReferenceRowSet}"));
        paginaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paginaReferenceRowSet}"));
        claseRecursoReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoReferenceRowSet}"));
        grupoAplicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.grupoAplicacionReferenceRowSet}"));
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

    private Button botonProcesarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesarFila1() {
        return botonProcesarFila1;
    }

    public void setBotonProcesarFila1(Button b) {
        this.botonProcesarFila1 = b;
    }

    private Label etiquetaIdentificacionFila1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaIdentificacionFila1() {
        return etiquetaIdentificacionFila1;
    }

    public void setEtiquetaIdentificacionFila1(Label l) {
        this.etiquetaIdentificacionFila1 = l;
    }

    private Label etiquetaDenominacionFilaMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaDenominacionFilaMaestro1() {
        return etiquetaDenominacionFilaMaestro1;
    }

    public void setEtiquetaDenominacionFilaMaestro1(Label l) {
        this.etiquetaDenominacionFilaMaestro1 = l;
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

    private HelpInline helpInlineIdClaseRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecurso1() {
        return helpInlineIdClaseRecurso1;
    }

    public void setHelpInlineIdClaseRecurso1(HelpInline hi) {
        this.helpInlineIdClaseRecurso1 = hi;
    }

    private StaticText campoIdClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecurso1Texto1() {
        return campoIdClaseRecurso1Texto1;
    }

    public void setCampoIdClaseRecurso1Texto1(StaticText component) {
        this.campoIdClaseRecurso1Texto1 = component;
    }

    private LongConverter converterIdClaseRecurso1 = new LongConverter();
  
    public LongConverter getConverterIdClaseRecurso1() {
        return converterIdClaseRecurso1;
    }
  
    public void setConverterIdClaseRecurso1(LongConverter converter) {
        this.converterIdClaseRecurso1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseRecurso1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseRecurso1() {
        return validatorIdClaseRecurso1;
    }
  
    public void setValidatorIdClaseRecurso1(LongRangeValidator validator) {
        this.validatorIdClaseRecurso1 = validator;
    }
  
    private Label labelCodigoClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoClaseRecurso1() {
        return labelCodigoClaseRecurso1;
    }

    public void setLabelCodigoClaseRecurso1(Label l) {
        this.labelCodigoClaseRecurso1 = l;
    }

    private TextField campoCodigoClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoClaseRecurso1() {
        return campoCodigoClaseRecurso1;
    }

    public void setCampoCodigoClaseRecurso1(TextField component) {
        this.campoCodigoClaseRecurso1 = component;
    }

    private HelpInline helpInlineCodigoClaseRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoClaseRecurso1() {
        return helpInlineCodigoClaseRecurso1;
    }

    public void setHelpInlineCodigoClaseRecurso1(HelpInline hi) {
        this.helpInlineCodigoClaseRecurso1 = hi;
    }

    private StaticText campoCodigoClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoClaseRecurso1Texto1() {
        return campoCodigoClaseRecurso1Texto1;
    }

    public void setCampoCodigoClaseRecurso1Texto1(StaticText component) {
        this.campoCodigoClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorCodigoClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoClaseRecurso1() {
        return validatorCodigoClaseRecurso1;
    }
  
    public void setValidatorCodigoClaseRecurso1(LengthValidator validator) {
        this.validatorCodigoClaseRecurso1 = validator;
    }
  
    private Label labelNombreClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreClaseRecurso1() {
        return labelNombreClaseRecurso1;
    }

    public void setLabelNombreClaseRecurso1(Label l) {
        this.labelNombreClaseRecurso1 = l;
    }

    private TextField campoNombreClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreClaseRecurso1() {
        return campoNombreClaseRecurso1;
    }

    public void setCampoNombreClaseRecurso1(TextField component) {
        this.campoNombreClaseRecurso1 = component;
    }

    private HelpInline helpInlineNombreClaseRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreClaseRecurso1() {
        return helpInlineNombreClaseRecurso1;
    }

    public void setHelpInlineNombreClaseRecurso1(HelpInline hi) {
        this.helpInlineNombreClaseRecurso1 = hi;
    }

    private StaticText campoNombreClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreClaseRecurso1Texto1() {
        return campoNombreClaseRecurso1Texto1;
    }

    public void setCampoNombreClaseRecurso1Texto1(StaticText component) {
        this.campoNombreClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorNombreClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreClaseRecurso1() {
        return validatorNombreClaseRecurso1;
    }
  
    public void setValidatorNombreClaseRecurso1(LengthValidator validator) {
        this.validatorNombreClaseRecurso1 = validator;
    }
  
    private Label labelDescripcionClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionClaseRecurso1() {
        return labelDescripcionClaseRecurso1;
    }

    public void setLabelDescripcionClaseRecurso1(Label l) {
        this.labelDescripcionClaseRecurso1 = l;
    }

    private TextArea campoDescripcionClaseRecurso1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionClaseRecurso1() {
        return campoDescripcionClaseRecurso1;
    }

    public void setCampoDescripcionClaseRecurso1(TextArea component) {
        this.campoDescripcionClaseRecurso1 = component;
    }

    private HelpInline helpInlineDescripcionClaseRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionClaseRecurso1() {
        return helpInlineDescripcionClaseRecurso1;
    }

    public void setHelpInlineDescripcionClaseRecurso1(HelpInline hi) {
        this.helpInlineDescripcionClaseRecurso1 = hi;
    }

    private StaticText campoDescripcionClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionClaseRecurso1Texto1() {
        return campoDescripcionClaseRecurso1Texto1;
    }

    public void setCampoDescripcionClaseRecurso1Texto1(StaticText component) {
        this.campoDescripcionClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorDescripcionClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionClaseRecurso1() {
        return validatorDescripcionClaseRecurso1;
    }
  
    public void setValidatorDescripcionClaseRecurso1(LengthValidator validator) {
        this.validatorDescripcionClaseRecurso1 = validator;
    }
  
    private Label labelEsClaseRecursoIndependiente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoIndependiente1() {
        return labelEsClaseRecursoIndependiente1;
    }

    public void setLabelEsClaseRecursoIndependiente1(Label l) {
        this.labelEsClaseRecursoIndependiente1 = l;
    }

    private DropDown listaEsClaseRecursoIndependiente1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoIndependiente1() {
        return listaEsClaseRecursoIndependiente1;
    }

    public void setListaEsClaseRecursoIndependiente1(DropDown component) {
        this.listaEsClaseRecursoIndependiente1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoIndependiente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoIndependiente1() {
        return helpInlineEsClaseRecursoIndependiente1;
    }

    public void setHelpInlineEsClaseRecursoIndependiente1(HelpInline hi) {
        this.helpInlineEsClaseRecursoIndependiente1 = hi;
    }

    private StaticText listaEsClaseRecursoIndependiente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoIndependiente1Texto1() {
        return listaEsClaseRecursoIndependiente1Texto1;
    }

    public void setListaEsClaseRecursoIndependiente1Texto1(StaticText component) {
        this.listaEsClaseRecursoIndependiente1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoIndependiente1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoIndependiente1() {
        return converterEsClaseRecursoIndependiente1;
    }
  
    public void setConverterEsClaseRecursoIndependiente1(IntegerConverter converter) {
        this.converterEsClaseRecursoIndependiente1 = converter;
    }
  
    private Label labelEsClaseRecursoSinDetalle1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoSinDetalle1() {
        return labelEsClaseRecursoSinDetalle1;
    }

    public void setLabelEsClaseRecursoSinDetalle1(Label l) {
        this.labelEsClaseRecursoSinDetalle1 = l;
    }

    private DropDown listaEsClaseRecursoSinDetalle1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoSinDetalle1() {
        return listaEsClaseRecursoSinDetalle1;
    }

    public void setListaEsClaseRecursoSinDetalle1(DropDown component) {
        this.listaEsClaseRecursoSinDetalle1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoSinDetalle1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoSinDetalle1() {
        return helpInlineEsClaseRecursoSinDetalle1;
    }

    public void setHelpInlineEsClaseRecursoSinDetalle1(HelpInline hi) {
        this.helpInlineEsClaseRecursoSinDetalle1 = hi;
    }

    private StaticText listaEsClaseRecursoSinDetalle1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoSinDetalle1Texto1() {
        return listaEsClaseRecursoSinDetalle1Texto1;
    }

    public void setListaEsClaseRecursoSinDetalle1Texto1(StaticText component) {
        this.listaEsClaseRecursoSinDetalle1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoSinDetalle1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoSinDetalle1() {
        return converterEsClaseRecursoSinDetalle1;
    }
  
    public void setConverterEsClaseRecursoSinDetalle1(IntegerConverter converter) {
        this.converterEsClaseRecursoSinDetalle1 = converter;
    }
  
    private Label labelEsClaseRecursoConArbol1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoConArbol1() {
        return labelEsClaseRecursoConArbol1;
    }

    public void setLabelEsClaseRecursoConArbol1(Label l) {
        this.labelEsClaseRecursoConArbol1 = l;
    }

    private DropDown listaEsClaseRecursoConArbol1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoConArbol1() {
        return listaEsClaseRecursoConArbol1;
    }

    public void setListaEsClaseRecursoConArbol1(DropDown component) {
        this.listaEsClaseRecursoConArbol1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoConArbol1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoConArbol1() {
        return helpInlineEsClaseRecursoConArbol1;
    }

    public void setHelpInlineEsClaseRecursoConArbol1(HelpInline hi) {
        this.helpInlineEsClaseRecursoConArbol1 = hi;
    }

    private StaticText listaEsClaseRecursoConArbol1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoConArbol1Texto1() {
        return listaEsClaseRecursoConArbol1Texto1;
    }

    public void setListaEsClaseRecursoConArbol1Texto1(StaticText component) {
        this.listaEsClaseRecursoConArbol1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoConArbol1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoConArbol1() {
        return converterEsClaseRecursoConArbol1;
    }
  
    public void setConverterEsClaseRecursoConArbol1(IntegerConverter converter) {
        this.converterEsClaseRecursoConArbol1 = converter;
    }
  
    private Label labelNumeroTipoClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoClaseRecurso1() {
        return labelNumeroTipoClaseRecurso1;
    }

    public void setLabelNumeroTipoClaseRecurso1(Label l) {
        this.labelNumeroTipoClaseRecurso1 = l;
    }

    private DropDown listaNumeroTipoClaseRecurso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoClaseRecurso1() {
        return listaNumeroTipoClaseRecurso1;
    }

    public void setListaNumeroTipoClaseRecurso1(DropDown component) {
        this.listaNumeroTipoClaseRecurso1 = component;
    }

    private HelpInline helpInlineNumeroTipoClaseRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoClaseRecurso1() {
        return helpInlineNumeroTipoClaseRecurso1;
    }

    public void setHelpInlineNumeroTipoClaseRecurso1(HelpInline hi) {
        this.helpInlineNumeroTipoClaseRecurso1 = hi;
    }

    private StaticText listaNumeroTipoClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoClaseRecurso1Texto1() {
        return listaNumeroTipoClaseRecurso1Texto1;
    }

    public void setListaNumeroTipoClaseRecurso1Texto1(StaticText component) {
        this.listaNumeroTipoClaseRecurso1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoClaseRecurso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoClaseRecurso1() {
        return converterNumeroTipoClaseRecurso1;
    }
  
    public void setConverterNumeroTipoClaseRecurso1(IntegerConverter converter) {
        this.converterNumeroTipoClaseRecurso1 = converter;
    }
  
    private Label labelNumeroTipoRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRecurso1() {
        return labelNumeroTipoRecurso1;
    }

    public void setLabelNumeroTipoRecurso1(Label l) {
        this.labelNumeroTipoRecurso1 = l;
    }

    private DropDown listaNumeroTipoRecurso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoRecurso1() {
        return listaNumeroTipoRecurso1;
    }

    public void setListaNumeroTipoRecurso1(DropDown component) {
        this.listaNumeroTipoRecurso1 = component;
    }

    private HelpInline helpInlineNumeroTipoRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoRecurso1() {
        return helpInlineNumeroTipoRecurso1;
    }

    public void setHelpInlineNumeroTipoRecurso1(HelpInline hi) {
        this.helpInlineNumeroTipoRecurso1 = hi;
    }

    private StaticText listaNumeroTipoRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRecurso1Texto1() {
        return listaNumeroTipoRecurso1Texto1;
    }

    public void setListaNumeroTipoRecurso1Texto1(StaticText component) {
        this.listaNumeroTipoRecurso1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoRecurso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoRecurso1() {
        return converterNumeroTipoRecurso1;
    }
  
    public void setConverterNumeroTipoRecurso1(IntegerConverter converter) {
        this.converterNumeroTipoRecurso1 = converter;
    }
  
    private Label labelIdFuncionSeleccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionSeleccion1() {
        return labelIdFuncionSeleccion1;
    }

    public void setLabelIdFuncionSeleccion1(Label l) {
        this.labelIdFuncionSeleccion1 = l;
    }

    private TextField campoIdFuncionSeleccion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionSeleccion1() {
        return campoIdFuncionSeleccion1;
    }

    public void setCampoIdFuncionSeleccion1(TextField component) {
        this.campoIdFuncionSeleccion1 = component;
    }

    private HelpInline helpInlineIdFuncionSeleccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionSeleccion1() {
        return helpInlineIdFuncionSeleccion1;
    }

    public void setHelpInlineIdFuncionSeleccion1(HelpInline hi) {
        this.helpInlineIdFuncionSeleccion1 = hi;
    }

    private StaticText campoIdFuncionSeleccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionSeleccion1Texto1() {
        return campoIdFuncionSeleccion1Texto1;
    }

    public void setCampoIdFuncionSeleccion1Texto1(StaticText component) {
        this.campoIdFuncionSeleccion1Texto1 = component;
    }

    private Button campoIdFuncionSeleccion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionSeleccion1Boton1() {
        return campoIdFuncionSeleccion1Boton1;
    }

    public void setCampoIdFuncionSeleccion1Boton1(Button component) {
        this.campoIdFuncionSeleccion1Boton1 = component;
    }

    private Button campoIdFuncionSeleccion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionSeleccion1Boton3() {
        return campoIdFuncionSeleccion1Boton3;
    }

    public void setCampoIdFuncionSeleccion1Boton3(Button component) {
        this.campoIdFuncionSeleccion1Boton3 = component;
    }

    private Label labelIdFuncionSeleccion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionSeleccion2() {
        return labelIdFuncionSeleccion2;
    }

    public void setLabelIdFuncionSeleccion2(Label l) {
        this.labelIdFuncionSeleccion2 = l;
    }

    private StaticText campoIdFuncionSeleccion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionSeleccion1Texto2() {
        return campoIdFuncionSeleccion1Texto2;
    }

    public void setCampoIdFuncionSeleccion1Texto2(StaticText component) {
        this.campoIdFuncionSeleccion1Texto2 = component;
    }

    private Button campoIdFuncionSeleccion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionSeleccion1Boton2() {
        return campoIdFuncionSeleccion1Boton2;
    }

    public void setCampoIdFuncionSeleccion1Boton2(Button component) {
        this.campoIdFuncionSeleccion1Boton2 = component;
    }

    private Label labelIdPaginaSeleccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaSeleccion1() {
        return labelIdPaginaSeleccion1;
    }

    public void setLabelIdPaginaSeleccion1(Label l) {
        this.labelIdPaginaSeleccion1 = l;
    }

    private TextField campoIdPaginaSeleccion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPaginaSeleccion1() {
        return campoIdPaginaSeleccion1;
    }

    public void setCampoIdPaginaSeleccion1(TextField component) {
        this.campoIdPaginaSeleccion1 = component;
    }

    private HelpInline helpInlineIdPaginaSeleccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPaginaSeleccion1() {
        return helpInlineIdPaginaSeleccion1;
    }

    public void setHelpInlineIdPaginaSeleccion1(HelpInline hi) {
        this.helpInlineIdPaginaSeleccion1 = hi;
    }

    private StaticText campoIdPaginaSeleccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPaginaSeleccion1Texto1() {
        return campoIdPaginaSeleccion1Texto1;
    }

    public void setCampoIdPaginaSeleccion1Texto1(StaticText component) {
        this.campoIdPaginaSeleccion1Texto1 = component;
    }

    private Button campoIdPaginaSeleccion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPaginaSeleccion1Boton1() {
        return campoIdPaginaSeleccion1Boton1;
    }

    public void setCampoIdPaginaSeleccion1Boton1(Button component) {
        this.campoIdPaginaSeleccion1Boton1 = component;
    }

    private Button campoIdPaginaSeleccion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaginaSeleccion1Boton3() {
        return campoIdPaginaSeleccion1Boton3;
    }

    public void setCampoIdPaginaSeleccion1Boton3(Button component) {
        this.campoIdPaginaSeleccion1Boton3 = component;
    }

    private Label labelIdPaginaSeleccion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaSeleccion2() {
        return labelIdPaginaSeleccion2;
    }

    public void setLabelIdPaginaSeleccion2(Label l) {
        this.labelIdPaginaSeleccion2 = l;
    }

    private StaticText campoIdPaginaSeleccion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPaginaSeleccion1Texto2() {
        return campoIdPaginaSeleccion1Texto2;
    }

    public void setCampoIdPaginaSeleccion1Texto2(StaticText component) {
        this.campoIdPaginaSeleccion1Texto2 = component;
    }

    private Button campoIdPaginaSeleccion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaginaSeleccion1Boton2() {
        return campoIdPaginaSeleccion1Boton2;
    }

    public void setCampoIdPaginaSeleccion1Boton2(Button component) {
        this.campoIdPaginaSeleccion1Boton2 = component;
    }

    private Label labelIdPaginaDetalle1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaDetalle1() {
        return labelIdPaginaDetalle1;
    }

    public void setLabelIdPaginaDetalle1(Label l) {
        this.labelIdPaginaDetalle1 = l;
    }

    private TextField campoIdPaginaDetalle1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPaginaDetalle1() {
        return campoIdPaginaDetalle1;
    }

    public void setCampoIdPaginaDetalle1(TextField component) {
        this.campoIdPaginaDetalle1 = component;
    }

    private HelpInline helpInlineIdPaginaDetalle1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPaginaDetalle1() {
        return helpInlineIdPaginaDetalle1;
    }

    public void setHelpInlineIdPaginaDetalle1(HelpInline hi) {
        this.helpInlineIdPaginaDetalle1 = hi;
    }

    private StaticText campoIdPaginaDetalle1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPaginaDetalle1Texto1() {
        return campoIdPaginaDetalle1Texto1;
    }

    public void setCampoIdPaginaDetalle1Texto1(StaticText component) {
        this.campoIdPaginaDetalle1Texto1 = component;
    }

    private Button campoIdPaginaDetalle1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPaginaDetalle1Boton1() {
        return campoIdPaginaDetalle1Boton1;
    }

    public void setCampoIdPaginaDetalle1Boton1(Button component) {
        this.campoIdPaginaDetalle1Boton1 = component;
    }

    private Button campoIdPaginaDetalle1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaginaDetalle1Boton3() {
        return campoIdPaginaDetalle1Boton3;
    }

    public void setCampoIdPaginaDetalle1Boton3(Button component) {
        this.campoIdPaginaDetalle1Boton3 = component;
    }

    private Label labelIdPaginaDetalle2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaDetalle2() {
        return labelIdPaginaDetalle2;
    }

    public void setLabelIdPaginaDetalle2(Label l) {
        this.labelIdPaginaDetalle2 = l;
    }

    private StaticText campoIdPaginaDetalle1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPaginaDetalle1Texto2() {
        return campoIdPaginaDetalle1Texto2;
    }

    public void setCampoIdPaginaDetalle1Texto2(StaticText component) {
        this.campoIdPaginaDetalle1Texto2 = component;
    }

    private Button campoIdPaginaDetalle1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaginaDetalle1Boton2() {
        return campoIdPaginaDetalle1Boton2;
    }

    public void setCampoIdPaginaDetalle1Boton2(Button component) {
        this.campoIdPaginaDetalle1Boton2 = component;
    }

    private Label labelIdClaseRecursoMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoMaestro1() {
        return labelIdClaseRecursoMaestro1;
    }

    public void setLabelIdClaseRecursoMaestro1(Label l) {
        this.labelIdClaseRecursoMaestro1 = l;
    }

    private TextField campoIdClaseRecursoMaestro1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoMaestro1() {
        return campoIdClaseRecursoMaestro1;
    }

    public void setCampoIdClaseRecursoMaestro1(TextField component) {
        this.campoIdClaseRecursoMaestro1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoMaestro1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoMaestro1() {
        return helpInlineIdClaseRecursoMaestro1;
    }

    public void setHelpInlineIdClaseRecursoMaestro1(HelpInline hi) {
        this.helpInlineIdClaseRecursoMaestro1 = hi;
    }

    private StaticText campoIdClaseRecursoMaestro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoMaestro1Texto1() {
        return campoIdClaseRecursoMaestro1Texto1;
    }

    public void setCampoIdClaseRecursoMaestro1Texto1(StaticText component) {
        this.campoIdClaseRecursoMaestro1Texto1 = component;
    }

    private Button campoIdClaseRecursoMaestro1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoMaestro1Boton1() {
        return campoIdClaseRecursoMaestro1Boton1;
    }

    public void setCampoIdClaseRecursoMaestro1Boton1(Button component) {
        this.campoIdClaseRecursoMaestro1Boton1 = component;
    }

    private Button campoIdClaseRecursoMaestro1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoMaestro1Boton3() {
        return campoIdClaseRecursoMaestro1Boton3;
    }

    public void setCampoIdClaseRecursoMaestro1Boton3(Button component) {
        this.campoIdClaseRecursoMaestro1Boton3 = component;
    }

    private Label labelIdClaseRecursoMaestro2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoMaestro2() {
        return labelIdClaseRecursoMaestro2;
    }

    public void setLabelIdClaseRecursoMaestro2(Label l) {
        this.labelIdClaseRecursoMaestro2 = l;
    }

    private StaticText campoIdClaseRecursoMaestro1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdClaseRecursoMaestro1Texto2() {
        return campoIdClaseRecursoMaestro1Texto2;
    }

    public void setCampoIdClaseRecursoMaestro1Texto2(StaticText component) {
        this.campoIdClaseRecursoMaestro1Texto2 = component;
    }

    private Button campoIdClaseRecursoMaestro1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoMaestro1Boton2() {
        return campoIdClaseRecursoMaestro1Boton2;
    }

    public void setCampoIdClaseRecursoMaestro1Boton2(Button component) {
        this.campoIdClaseRecursoMaestro1Boton2 = component;
    }

    private Label labelIdClaseRecursoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSegmento1() {
        return labelIdClaseRecursoSegmento1;
    }

    public void setLabelIdClaseRecursoSegmento1(Label l) {
        this.labelIdClaseRecursoSegmento1 = l;
    }

    private TextField campoIdClaseRecursoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoSegmento1() {
        return campoIdClaseRecursoSegmento1;
    }

    public void setCampoIdClaseRecursoSegmento1(TextField component) {
        this.campoIdClaseRecursoSegmento1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoSegmento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoSegmento1() {
        return helpInlineIdClaseRecursoSegmento1;
    }

    public void setHelpInlineIdClaseRecursoSegmento1(HelpInline hi) {
        this.helpInlineIdClaseRecursoSegmento1 = hi;
    }

    private StaticText campoIdClaseRecursoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoSegmento1Texto1() {
        return campoIdClaseRecursoSegmento1Texto1;
    }

    public void setCampoIdClaseRecursoSegmento1Texto1(StaticText component) {
        this.campoIdClaseRecursoSegmento1Texto1 = component;
    }

    private Button campoIdClaseRecursoSegmento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoSegmento1Boton1() {
        return campoIdClaseRecursoSegmento1Boton1;
    }

    public void setCampoIdClaseRecursoSegmento1Boton1(Button component) {
        this.campoIdClaseRecursoSegmento1Boton1 = component;
    }

    private Button campoIdClaseRecursoSegmento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoSegmento1Boton3() {
        return campoIdClaseRecursoSegmento1Boton3;
    }

    public void setCampoIdClaseRecursoSegmento1Boton3(Button component) {
        this.campoIdClaseRecursoSegmento1Boton3 = component;
    }

    private Label labelIdClaseRecursoSegmento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSegmento2() {
        return labelIdClaseRecursoSegmento2;
    }

    public void setLabelIdClaseRecursoSegmento2(Label l) {
        this.labelIdClaseRecursoSegmento2 = l;
    }

    private StaticText campoIdClaseRecursoSegmento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdClaseRecursoSegmento1Texto2() {
        return campoIdClaseRecursoSegmento1Texto2;
    }

    public void setCampoIdClaseRecursoSegmento1Texto2(StaticText component) {
        this.campoIdClaseRecursoSegmento1Texto2 = component;
    }

    private Button campoIdClaseRecursoSegmento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoSegmento1Boton2() {
        return campoIdClaseRecursoSegmento1Boton2;
    }

    public void setCampoIdClaseRecursoSegmento1Boton2(Button component) {
        this.campoIdClaseRecursoSegmento1Boton2 = component;
    }

    private Label labelIdClaseRecursoBase1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoBase1() {
        return labelIdClaseRecursoBase1;
    }

    public void setLabelIdClaseRecursoBase1(Label l) {
        this.labelIdClaseRecursoBase1 = l;
    }

    private TextField campoIdClaseRecursoBase1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoBase1() {
        return campoIdClaseRecursoBase1;
    }

    public void setCampoIdClaseRecursoBase1(TextField component) {
        this.campoIdClaseRecursoBase1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoBase1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoBase1() {
        return helpInlineIdClaseRecursoBase1;
    }

    public void setHelpInlineIdClaseRecursoBase1(HelpInline hi) {
        this.helpInlineIdClaseRecursoBase1 = hi;
    }

    private StaticText campoIdClaseRecursoBase1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoBase1Texto1() {
        return campoIdClaseRecursoBase1Texto1;
    }

    public void setCampoIdClaseRecursoBase1Texto1(StaticText component) {
        this.campoIdClaseRecursoBase1Texto1 = component;
    }

    private Button campoIdClaseRecursoBase1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoBase1Boton1() {
        return campoIdClaseRecursoBase1Boton1;
    }

    public void setCampoIdClaseRecursoBase1Boton1(Button component) {
        this.campoIdClaseRecursoBase1Boton1 = component;
    }

    private Button campoIdClaseRecursoBase1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoBase1Boton3() {
        return campoIdClaseRecursoBase1Boton3;
    }

    public void setCampoIdClaseRecursoBase1Boton3(Button component) {
        this.campoIdClaseRecursoBase1Boton3 = component;
    }

    private Label labelIdClaseRecursoBase2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoBase2() {
        return labelIdClaseRecursoBase2;
    }

    public void setLabelIdClaseRecursoBase2(Label l) {
        this.labelIdClaseRecursoBase2 = l;
    }

    private StaticText campoIdClaseRecursoBase1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdClaseRecursoBase1Texto2() {
        return campoIdClaseRecursoBase1Texto2;
    }

    public void setCampoIdClaseRecursoBase1Texto2(StaticText component) {
        this.campoIdClaseRecursoBase1Texto2 = component;
    }

    private Button campoIdClaseRecursoBase1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoBase1Boton2() {
        return campoIdClaseRecursoBase1Boton2;
    }

    public void setCampoIdClaseRecursoBase1Boton2(Button component) {
        this.campoIdClaseRecursoBase1Boton2 = component;
    }

    private Label labelIdGrupoAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoAplicacion1() {
        return labelIdGrupoAplicacion1;
    }

    public void setLabelIdGrupoAplicacion1(Label l) {
        this.labelIdGrupoAplicacion1 = l;
    }

    private TextField campoIdGrupoAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdGrupoAplicacion1() {
        return campoIdGrupoAplicacion1;
    }

    public void setCampoIdGrupoAplicacion1(TextField component) {
        this.campoIdGrupoAplicacion1 = component;
    }

    private HelpInline helpInlineIdGrupoAplicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdGrupoAplicacion1() {
        return helpInlineIdGrupoAplicacion1;
    }

    public void setHelpInlineIdGrupoAplicacion1(HelpInline hi) {
        this.helpInlineIdGrupoAplicacion1 = hi;
    }

    private StaticText campoIdGrupoAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdGrupoAplicacion1Texto1() {
        return campoIdGrupoAplicacion1Texto1;
    }

    public void setCampoIdGrupoAplicacion1Texto1(StaticText component) {
        this.campoIdGrupoAplicacion1Texto1 = component;
    }

    private Button campoIdGrupoAplicacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdGrupoAplicacion1Boton1() {
        return campoIdGrupoAplicacion1Boton1;
    }

    public void setCampoIdGrupoAplicacion1Boton1(Button component) {
        this.campoIdGrupoAplicacion1Boton1 = component;
    }

    private Button campoIdGrupoAplicacion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdGrupoAplicacion1Boton3() {
        return campoIdGrupoAplicacion1Boton3;
    }

    public void setCampoIdGrupoAplicacion1Boton3(Button component) {
        this.campoIdGrupoAplicacion1Boton3 = component;
    }

    private Label labelIdGrupoAplicacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoAplicacion2() {
        return labelIdGrupoAplicacion2;
    }

    public void setLabelIdGrupoAplicacion2(Label l) {
        this.labelIdGrupoAplicacion2 = l;
    }

    private StaticText campoIdGrupoAplicacion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdGrupoAplicacion1Texto2() {
        return campoIdGrupoAplicacion1Texto2;
    }

    public void setCampoIdGrupoAplicacion1Texto2(StaticText component) {
        this.campoIdGrupoAplicacion1Texto2 = component;
    }

    private Button campoIdGrupoAplicacion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdGrupoAplicacion1Boton2() {
        return campoIdGrupoAplicacion1Boton2;
    }

    public void setCampoIdGrupoAplicacion1Boton2(Button component) {
        this.campoIdGrupoAplicacion1Boton2 = component;
    }

    private Label labelIdAplicacionWeb1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdAplicacionWeb1() {
        return labelIdAplicacionWeb1;
    }

    public void setLabelIdAplicacionWeb1(Label l) {
        this.labelIdAplicacionWeb1 = l;
    }

    private TextField campoIdAplicacionWeb1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdAplicacionWeb1() {
        return campoIdAplicacionWeb1;
    }

    public void setCampoIdAplicacionWeb1(TextField component) {
        this.campoIdAplicacionWeb1 = component;
    }

    private HelpInline helpInlineIdAplicacionWeb1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdAplicacionWeb1() {
        return helpInlineIdAplicacionWeb1;
    }

    public void setHelpInlineIdAplicacionWeb1(HelpInline hi) {
        this.helpInlineIdAplicacionWeb1 = hi;
    }

    private StaticText campoIdAplicacionWeb1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdAplicacionWeb1Texto1() {
        return campoIdAplicacionWeb1Texto1;
    }

    public void setCampoIdAplicacionWeb1Texto1(StaticText component) {
        this.campoIdAplicacionWeb1Texto1 = component;
    }

    private LongConverter converterIdAplicacionWeb1 = new LongConverter();
  
    public LongConverter getConverterIdAplicacionWeb1() {
        return converterIdAplicacionWeb1;
    }
  
    public void setConverterIdAplicacionWeb1(LongConverter converter) {
        this.converterIdAplicacionWeb1 = converter;
    }
  
    private LongRangeValidator validatorIdAplicacionWeb1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdAplicacionWeb1() {
        return validatorIdAplicacionWeb1;
    }
  
    public void setValidatorIdAplicacionWeb1(LongRangeValidator validator) {
        this.validatorIdAplicacionWeb1 = validator;
    }
  
    private Label labelLimiteFilasConsulta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLimiteFilasConsulta1() {
        return labelLimiteFilasConsulta1;
    }

    public void setLabelLimiteFilasConsulta1(Label l) {
        this.labelLimiteFilasConsulta1 = l;
    }

    private TextField campoLimiteFilasConsulta1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLimiteFilasConsulta1() {
        return campoLimiteFilasConsulta1;
    }

    public void setCampoLimiteFilasConsulta1(TextField component) {
        this.campoLimiteFilasConsulta1 = component;
    }

    private HelpInline helpInlineLimiteFilasConsulta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLimiteFilasConsulta1() {
        return helpInlineLimiteFilasConsulta1;
    }

    public void setHelpInlineLimiteFilasConsulta1(HelpInline hi) {
        this.helpInlineLimiteFilasConsulta1 = hi;
    }

    private StaticText campoLimiteFilasConsulta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLimiteFilasConsulta1Texto1() {
        return campoLimiteFilasConsulta1Texto1;
    }

    public void setCampoLimiteFilasConsulta1Texto1(StaticText component) {
        this.campoLimiteFilasConsulta1Texto1 = component;
    }

    private IntegerConverter converterLimiteFilasConsulta1 = new IntegerConverter();
  
    public IntegerConverter getConverterLimiteFilasConsulta1() {
        return converterLimiteFilasConsulta1;
    }
  
    public void setConverterLimiteFilasConsulta1(IntegerConverter converter) {
        this.converterLimiteFilasConsulta1 = converter;
    }
  
    private LongRangeValidator validatorLimiteFilasConsulta1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLimiteFilasConsulta1() {
        return validatorLimiteFilasConsulta1;
    }
  
    public void setValidatorLimiteFilasConsulta1(LongRangeValidator validator) {
        this.validatorLimiteFilasConsulta1 = validator;
    }
  
    private Label labelLimiteFilasInforme1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLimiteFilasInforme1() {
        return labelLimiteFilasInforme1;
    }

    public void setLabelLimiteFilasInforme1(Label l) {
        this.labelLimiteFilasInforme1 = l;
    }

    private TextField campoLimiteFilasInforme1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLimiteFilasInforme1() {
        return campoLimiteFilasInforme1;
    }

    public void setCampoLimiteFilasInforme1(TextField component) {
        this.campoLimiteFilasInforme1 = component;
    }

    private HelpInline helpInlineLimiteFilasInforme1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLimiteFilasInforme1() {
        return helpInlineLimiteFilasInforme1;
    }

    public void setHelpInlineLimiteFilasInforme1(HelpInline hi) {
        this.helpInlineLimiteFilasInforme1 = hi;
    }

    private StaticText campoLimiteFilasInforme1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLimiteFilasInforme1Texto1() {
        return campoLimiteFilasInforme1Texto1;
    }

    public void setCampoLimiteFilasInforme1Texto1(StaticText component) {
        this.campoLimiteFilasInforme1Texto1 = component;
    }

    private IntegerConverter converterLimiteFilasInforme1 = new IntegerConverter();
  
    public IntegerConverter getConverterLimiteFilasInforme1() {
        return converterLimiteFilasInforme1;
    }
  
    public void setConverterLimiteFilasInforme1(IntegerConverter converter) {
        this.converterLimiteFilasInforme1 = converter;
    }
  
    private LongRangeValidator validatorLimiteFilasInforme1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLimiteFilasInforme1() {
        return validatorLimiteFilasInforme1;
    }
  
    public void setValidatorLimiteFilasInforme1(LongRangeValidator validator) {
        this.validatorLimiteFilasInforme1 = validator;
    }
  
    private Label labelOrdenPresentacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOrdenPresentacion1() {
        return labelOrdenPresentacion1;
    }

    public void setLabelOrdenPresentacion1(Label l) {
        this.labelOrdenPresentacion1 = l;
    }

    private TextField campoOrdenPresentacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOrdenPresentacion1() {
        return campoOrdenPresentacion1;
    }

    public void setCampoOrdenPresentacion1(TextField component) {
        this.campoOrdenPresentacion1 = component;
    }

    private HelpInline helpInlineOrdenPresentacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOrdenPresentacion1() {
        return helpInlineOrdenPresentacion1;
    }

    public void setHelpInlineOrdenPresentacion1(HelpInline hi) {
        this.helpInlineOrdenPresentacion1 = hi;
    }

    private StaticText campoOrdenPresentacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOrdenPresentacion1Texto1() {
        return campoOrdenPresentacion1Texto1;
    }

    public void setCampoOrdenPresentacion1Texto1(StaticText component) {
        this.campoOrdenPresentacion1Texto1 = component;
    }

    private IntegerConverter converterOrdenPresentacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterOrdenPresentacion1() {
        return converterOrdenPresentacion1;
    }
  
    public void setConverterOrdenPresentacion1(IntegerConverter converter) {
        this.converterOrdenPresentacion1 = converter;
    }
  
    private LongRangeValidator validatorOrdenPresentacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorOrdenPresentacion1() {
        return validatorOrdenPresentacion1;
    }
  
    public void setValidatorOrdenPresentacion1(LongRangeValidator validator) {
        this.validatorOrdenPresentacion1 = validator;
    }
  
    private Label labelEsClaseRecursoInsertable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoInsertable1() {
        return labelEsClaseRecursoInsertable1;
    }

    public void setLabelEsClaseRecursoInsertable1(Label l) {
        this.labelEsClaseRecursoInsertable1 = l;
    }

    private DropDown listaEsClaseRecursoInsertable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoInsertable1() {
        return listaEsClaseRecursoInsertable1;
    }

    public void setListaEsClaseRecursoInsertable1(DropDown component) {
        this.listaEsClaseRecursoInsertable1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoInsertable1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoInsertable1() {
        return helpInlineEsClaseRecursoInsertable1;
    }

    public void setHelpInlineEsClaseRecursoInsertable1(HelpInline hi) {
        this.helpInlineEsClaseRecursoInsertable1 = hi;
    }

    private StaticText listaEsClaseRecursoInsertable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoInsertable1Texto1() {
        return listaEsClaseRecursoInsertable1Texto1;
    }

    public void setListaEsClaseRecursoInsertable1Texto1(StaticText component) {
        this.listaEsClaseRecursoInsertable1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoInsertable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoInsertable1() {
        return converterEsClaseRecursoInsertable1;
    }
  
    public void setConverterEsClaseRecursoInsertable1(IntegerConverter converter) {
        this.converterEsClaseRecursoInsertable1 = converter;
    }
  
    private Label labelEsClaseRecursoModificable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoModificable1() {
        return labelEsClaseRecursoModificable1;
    }

    public void setLabelEsClaseRecursoModificable1(Label l) {
        this.labelEsClaseRecursoModificable1 = l;
    }

    private DropDown listaEsClaseRecursoModificable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoModificable1() {
        return listaEsClaseRecursoModificable1;
    }

    public void setListaEsClaseRecursoModificable1(DropDown component) {
        this.listaEsClaseRecursoModificable1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoModificable1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoModificable1() {
        return helpInlineEsClaseRecursoModificable1;
    }

    public void setHelpInlineEsClaseRecursoModificable1(HelpInline hi) {
        this.helpInlineEsClaseRecursoModificable1 = hi;
    }

    private StaticText listaEsClaseRecursoModificable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoModificable1Texto1() {
        return listaEsClaseRecursoModificable1Texto1;
    }

    public void setListaEsClaseRecursoModificable1Texto1(StaticText component) {
        this.listaEsClaseRecursoModificable1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoModificable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoModificable1() {
        return converterEsClaseRecursoModificable1;
    }
  
    public void setConverterEsClaseRecursoModificable1(IntegerConverter converter) {
        this.converterEsClaseRecursoModificable1 = converter;
    }
  
    private Label labelEsClaseRecursoEliminable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoEliminable1() {
        return labelEsClaseRecursoEliminable1;
    }

    public void setLabelEsClaseRecursoEliminable1(Label l) {
        this.labelEsClaseRecursoEliminable1 = l;
    }

    private DropDown listaEsClaseRecursoEliminable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoEliminable1() {
        return listaEsClaseRecursoEliminable1;
    }

    public void setListaEsClaseRecursoEliminable1(DropDown component) {
        this.listaEsClaseRecursoEliminable1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoEliminable1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoEliminable1() {
        return helpInlineEsClaseRecursoEliminable1;
    }

    public void setHelpInlineEsClaseRecursoEliminable1(HelpInline hi) {
        this.helpInlineEsClaseRecursoEliminable1 = hi;
    }

    private StaticText listaEsClaseRecursoEliminable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoEliminable1Texto1() {
        return listaEsClaseRecursoEliminable1Texto1;
    }

    public void setListaEsClaseRecursoEliminable1Texto1(StaticText component) {
        this.listaEsClaseRecursoEliminable1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoEliminable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoEliminable1() {
        return converterEsClaseRecursoEliminable1;
    }
  
    public void setConverterEsClaseRecursoEliminable1(IntegerConverter converter) {
        this.converterEsClaseRecursoEliminable1 = converter;
    }
  
    private Label labelEsClaseRecursoExtendida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoExtendida1() {
        return labelEsClaseRecursoExtendida1;
    }

    public void setLabelEsClaseRecursoExtendida1(Label l) {
        this.labelEsClaseRecursoExtendida1 = l;
    }

    private DropDown listaEsClaseRecursoExtendida1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoExtendida1() {
        return listaEsClaseRecursoExtendida1;
    }

    public void setListaEsClaseRecursoExtendida1(DropDown component) {
        this.listaEsClaseRecursoExtendida1 = component;
    }

    private HelpInline helpInlineEsClaseRecursoExtendida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsClaseRecursoExtendida1() {
        return helpInlineEsClaseRecursoExtendida1;
    }

    public void setHelpInlineEsClaseRecursoExtendida1(HelpInline hi) {
        this.helpInlineEsClaseRecursoExtendida1 = hi;
    }

    private StaticText listaEsClaseRecursoExtendida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoExtendida1Texto1() {
        return listaEsClaseRecursoExtendida1Texto1;
    }

    public void setListaEsClaseRecursoExtendida1Texto1(StaticText component) {
        this.listaEsClaseRecursoExtendida1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoExtendida1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoExtendida1() {
        return converterEsClaseRecursoExtendida1;
    }
  
    public void setConverterEsClaseRecursoExtendida1(IntegerConverter converter) {
        this.converterEsClaseRecursoExtendida1 = converter;
    }
  
    private Label labelEtiquetaHipervinculo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEtiquetaHipervinculo1() {
        return labelEtiquetaHipervinculo1;
    }

    public void setLabelEtiquetaHipervinculo1(Label l) {
        this.labelEtiquetaHipervinculo1 = l;
    }

    private TextField campoEtiquetaHipervinculo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoEtiquetaHipervinculo1() {
        return campoEtiquetaHipervinculo1;
    }

    public void setCampoEtiquetaHipervinculo1(TextField component) {
        this.campoEtiquetaHipervinculo1 = component;
    }

    private HelpInline helpInlineEtiquetaHipervinculo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEtiquetaHipervinculo1() {
        return helpInlineEtiquetaHipervinculo1;
    }

    public void setHelpInlineEtiquetaHipervinculo1(HelpInline hi) {
        this.helpInlineEtiquetaHipervinculo1 = hi;
    }

    private StaticText campoEtiquetaHipervinculo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEtiquetaHipervinculo1Texto1() {
        return campoEtiquetaHipervinculo1Texto1;
    }

    public void setCampoEtiquetaHipervinculo1Texto1(StaticText component) {
        this.campoEtiquetaHipervinculo1Texto1 = component;
    }

    private LengthValidator validatorEtiquetaHipervinculo1 = new LengthValidator();
  
    public LengthValidator getValidatorEtiquetaHipervinculo1() {
        return validatorEtiquetaHipervinculo1;
    }
  
    public void setValidatorEtiquetaHipervinculo1(LengthValidator validator) {
        this.validatorEtiquetaHipervinculo1 = validator;
    }
  
    private Label labelEsEnumeradorConNumero1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsEnumeradorConNumero1() {
        return labelEsEnumeradorConNumero1;
    }

    public void setLabelEsEnumeradorConNumero1(Label l) {
        this.labelEsEnumeradorConNumero1 = l;
    }

    private DropDown listaEsEnumeradorConNumero1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsEnumeradorConNumero1() {
        return listaEsEnumeradorConNumero1;
    }

    public void setListaEsEnumeradorConNumero1(DropDown component) {
        this.listaEsEnumeradorConNumero1 = component;
    }

    private HelpInline helpInlineEsEnumeradorConNumero1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsEnumeradorConNumero1() {
        return helpInlineEsEnumeradorConNumero1;
    }

    public void setHelpInlineEsEnumeradorConNumero1(HelpInline hi) {
        this.helpInlineEsEnumeradorConNumero1 = hi;
    }

    private StaticText listaEsEnumeradorConNumero1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsEnumeradorConNumero1Texto1() {
        return listaEsEnumeradorConNumero1Texto1;
    }

    public void setListaEsEnumeradorConNumero1Texto1(StaticText component) {
        this.listaEsEnumeradorConNumero1Texto1 = component;
    }

    private IntegerConverter converterEsEnumeradorConNumero1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsEnumeradorConNumero1() {
        return converterEsEnumeradorConNumero1;
    }
  
    public void setConverterEsEnumeradorConNumero1(IntegerConverter converter) {
        this.converterEsEnumeradorConNumero1 = converter;
    }
  
    private Label labelAliasClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelAliasClaseRecurso1() {
        return labelAliasClaseRecurso1;
    }

    public void setLabelAliasClaseRecurso1(Label l) {
        this.labelAliasClaseRecurso1 = l;
    }

    private TextField campoAliasClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoAliasClaseRecurso1() {
        return campoAliasClaseRecurso1;
    }

    public void setCampoAliasClaseRecurso1(TextField component) {
        this.campoAliasClaseRecurso1 = component;
    }

    private HelpInline helpInlineAliasClaseRecurso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineAliasClaseRecurso1() {
        return helpInlineAliasClaseRecurso1;
    }

    public void setHelpInlineAliasClaseRecurso1(HelpInline hi) {
        this.helpInlineAliasClaseRecurso1 = hi;
    }

    private StaticText campoAliasClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoAliasClaseRecurso1Texto1() {
        return campoAliasClaseRecurso1Texto1;
    }

    public void setCampoAliasClaseRecurso1Texto1(StaticText component) {
        this.campoAliasClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorAliasClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorAliasClaseRecurso1() {
        return validatorAliasClaseRecurso1;
    }
  
    public void setValidatorAliasClaseRecurso1(LengthValidator validator) {
        this.validatorAliasClaseRecurso1 = validator;
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

    private Button botonProcesarFila2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesarFila2() {
        return botonProcesarFila2;
    }

    public void setBotonProcesarFila2(Button b) {
        this.botonProcesarFila2 = b;
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

    private ImageHyperlink imageHyperlink3 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink3() {
        return imageHyperlink3;
    }

    public void setImageHyperlink3(ImageHyperlink component) {
        this.imageHyperlink3 = component;
    }

    private ImageHyperlink imageHyperlink4 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink4() {
        return imageHyperlink4;
    }

    public void setImageHyperlink4(ImageHyperlink component) {
        this.imageHyperlink4 = component;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider() {
        return claseRecursoDataProvider;
    }

    public void setClaseRecursoDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoDataProvider = crsdp;
    }

    private FuncionCachedRowSetDataProvider2 funcionReferenceDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider() {
        return funcionReferenceDataProvider;
    }

    public void setFuncionReferenceDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionReferenceDataProvider = crsdp;
    }

    private PaginaCachedRowSetDataProvider2 paginaReferenceDataProvider = new PaginaCachedRowSetDataProvider2();

    @Override
    public PaginaCachedRowSetDataProvider2 getPaginaReferenceDataProvider() {
        return paginaReferenceDataProvider;
    }

    public void setPaginaReferenceDataProvider(PaginaCachedRowSetDataProvider2 crsdp) {
        this.paginaReferenceDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoReferenceDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider() {
        return claseRecursoReferenceDataProvider;
    }

    public void setClaseRecursoReferenceDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoReferenceDataProvider = crsdp;
    }

    private GrupoAplicacionCachedRowSetDataProvider2 grupoAplicacionReferenceDataProvider = new GrupoAplicacionCachedRowSetDataProvider2();

    @Override
    public GrupoAplicacionCachedRowSetDataProvider2 getGrupoAplicacionReferenceDataProvider() {
        return grupoAplicacionReferenceDataProvider;
    }

    public void setGrupoAplicacionReferenceDataProvider(GrupoAplicacionCachedRowSetDataProvider2 crsdp) {
        this.grupoAplicacionReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ClaseRecurso2() {
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
        claseRecursoDataProvider.close();
        funcionReferenceDataProvider.close();
        paginaReferenceDataProvider.close();
        claseRecursoReferenceDataProvider.close();
        grupoAplicacionReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionClaseRecurso...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionClaseRecurso asistente = new AsistentePaginaActualizacionClaseRecurso(this);

    public AsistentePaginaActualizacionClaseRecurso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ClaseRecurso2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ClaseRecurso2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getClaseRecursoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_CREAR_CLASE_RECURSO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_MODIFICAR_CLASE_RECURSO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_ELIMINAR_CLASE_RECURSO;
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

    public String botonProcesarFila1_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila1() {
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

    public String botonProcesarFila2_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila2() {
        return null;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para refrescar, agregar, editar, deshacer y eliminar de la plantilla #2">
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
    public void campoIdFuncionSeleccion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionSeleccion1_validate(context, component, value);
    }

    public void campoIdPaginaSeleccion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPaginaSeleccion1_validate(context, component, value);
    }

    public void campoIdPaginaDetalle1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPaginaDetalle1_validate(context, component, value);
    }

    public void campoIdClaseRecursoMaestro1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoMaestro1_validate(context, component, value);
    }

    public void campoIdClaseRecursoSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoSegmento1_validate(context, component, value);
    }

    public void campoIdClaseRecursoBase1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoBase1_validate(context, component, value);
    }

    public void campoIdGrupoAplicacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdGrupoAplicacion1_validate(context, component, value);
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

    public String imageHyperlink3_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case3";
    }

    public String imageHyperlink4_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case4";
    }

    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
