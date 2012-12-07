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

import com.egt.data.general.xdp2.ClaseRecursoSecCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
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

public class ClaseRecursoSeccionPorClaseRecurso2 extends AbstractPageBean
        implements PaginaActualizacionClaseRecursoSecPorClaseRecurso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdClaseRecursoSec1.setMinimum(0L);
        validatorIdClaseRecursoSec1.setMaximum(1000000000000000000L);
        validatorEtiquetaClaseRecursoSec1.setMaximum(30);
        validatorDescripcionClaseRecursoSec1.setMaximum(8160);
        validatorOrdenPresentacion1.setMinimum(0L);
        validatorOrdenPresentacion1.setMaximum(1000L);
        claseRecursoSecDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoSecRowSet}"));
        claseRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoRowSet}"));
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

    private Label labelIdClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso1() {
        return labelIdClaseRecurso1;
    }

    public void setLabelIdClaseRecurso1(Label l) {
        this.labelIdClaseRecurso1 = l;
    }

    private Label labelIdClaseRecursoSec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSec1() {
        return labelIdClaseRecursoSec1;
    }

    public void setLabelIdClaseRecursoSec1(Label l) {
        this.labelIdClaseRecursoSec1 = l;
    }

    private TextField campoIdClaseRecursoSec1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoSec1() {
        return campoIdClaseRecursoSec1;
    }

    public void setCampoIdClaseRecursoSec1(TextField component) {
        this.campoIdClaseRecursoSec1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoSec1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoSec1() {
        return helpInlineIdClaseRecursoSec1;
    }

    public void setHelpInlineIdClaseRecursoSec1(HelpInline hi) {
        this.helpInlineIdClaseRecursoSec1 = hi;
    }

    private StaticText campoIdClaseRecursoSec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoSec1Texto1() {
        return campoIdClaseRecursoSec1Texto1;
    }

    public void setCampoIdClaseRecursoSec1Texto1(StaticText component) {
        this.campoIdClaseRecursoSec1Texto1 = component;
    }

    private LongConverter converterIdClaseRecursoSec1 = new LongConverter();
  
    public LongConverter getConverterIdClaseRecursoSec1() {
        return converterIdClaseRecursoSec1;
    }
  
    public void setConverterIdClaseRecursoSec1(LongConverter converter) {
        this.converterIdClaseRecursoSec1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseRecursoSec1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseRecursoSec1() {
        return validatorIdClaseRecursoSec1;
    }
  
    public void setValidatorIdClaseRecursoSec1(LongRangeValidator validator) {
        this.validatorIdClaseRecursoSec1 = validator;
    }
  
    private Label labelEtiquetaClaseRecursoSec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEtiquetaClaseRecursoSec1() {
        return labelEtiquetaClaseRecursoSec1;
    }

    public void setLabelEtiquetaClaseRecursoSec1(Label l) {
        this.labelEtiquetaClaseRecursoSec1 = l;
    }

    private TextField campoEtiquetaClaseRecursoSec1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoEtiquetaClaseRecursoSec1() {
        return campoEtiquetaClaseRecursoSec1;
    }

    public void setCampoEtiquetaClaseRecursoSec1(TextField component) {
        this.campoEtiquetaClaseRecursoSec1 = component;
    }

    private HelpInline helpInlineEtiquetaClaseRecursoSec1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEtiquetaClaseRecursoSec1() {
        return helpInlineEtiquetaClaseRecursoSec1;
    }

    public void setHelpInlineEtiquetaClaseRecursoSec1(HelpInline hi) {
        this.helpInlineEtiquetaClaseRecursoSec1 = hi;
    }

    private StaticText campoEtiquetaClaseRecursoSec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEtiquetaClaseRecursoSec1Texto1() {
        return campoEtiquetaClaseRecursoSec1Texto1;
    }

    public void setCampoEtiquetaClaseRecursoSec1Texto1(StaticText component) {
        this.campoEtiquetaClaseRecursoSec1Texto1 = component;
    }

    private LengthValidator validatorEtiquetaClaseRecursoSec1 = new LengthValidator();
  
    public LengthValidator getValidatorEtiquetaClaseRecursoSec1() {
        return validatorEtiquetaClaseRecursoSec1;
    }
  
    public void setValidatorEtiquetaClaseRecursoSec1(LengthValidator validator) {
        this.validatorEtiquetaClaseRecursoSec1 = validator;
    }
  
    private Label labelDescripcionClaseRecursoSec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionClaseRecursoSec1() {
        return labelDescripcionClaseRecursoSec1;
    }

    public void setLabelDescripcionClaseRecursoSec1(Label l) {
        this.labelDescripcionClaseRecursoSec1 = l;
    }

    private TextArea campoDescripcionClaseRecursoSec1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionClaseRecursoSec1() {
        return campoDescripcionClaseRecursoSec1;
    }

    public void setCampoDescripcionClaseRecursoSec1(TextArea component) {
        this.campoDescripcionClaseRecursoSec1 = component;
    }

    private HelpInline helpInlineDescripcionClaseRecursoSec1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionClaseRecursoSec1() {
        return helpInlineDescripcionClaseRecursoSec1;
    }

    public void setHelpInlineDescripcionClaseRecursoSec1(HelpInline hi) {
        this.helpInlineDescripcionClaseRecursoSec1 = hi;
    }

    private StaticText campoDescripcionClaseRecursoSec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionClaseRecursoSec1Texto1() {
        return campoDescripcionClaseRecursoSec1Texto1;
    }

    public void setCampoDescripcionClaseRecursoSec1Texto1(StaticText component) {
        this.campoDescripcionClaseRecursoSec1Texto1 = component;
    }

    private LengthValidator validatorDescripcionClaseRecursoSec1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionClaseRecursoSec1() {
        return validatorDescripcionClaseRecursoSec1;
    }
  
    public void setValidatorDescripcionClaseRecursoSec1(LengthValidator validator) {
        this.validatorDescripcionClaseRecursoSec1 = validator;
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
  
    private Label labelEsPestanaDetalle1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPestanaDetalle1() {
        return labelEsPestanaDetalle1;
    }

    public void setLabelEsPestanaDetalle1(Label l) {
        this.labelEsPestanaDetalle1 = l;
    }

    private DropDown listaEsPestanaDetalle1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPestanaDetalle1() {
        return listaEsPestanaDetalle1;
    }

    public void setListaEsPestanaDetalle1(DropDown component) {
        this.listaEsPestanaDetalle1 = component;
    }

    private HelpInline helpInlineEsPestanaDetalle1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPestanaDetalle1() {
        return helpInlineEsPestanaDetalle1;
    }

    public void setHelpInlineEsPestanaDetalle1(HelpInline hi) {
        this.helpInlineEsPestanaDetalle1 = hi;
    }

    private StaticText listaEsPestanaDetalle1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPestanaDetalle1Texto1() {
        return listaEsPestanaDetalle1Texto1;
    }

    public void setListaEsPestanaDetalle1Texto1(StaticText component) {
        this.listaEsPestanaDetalle1Texto1 = component;
    }

    private IntegerConverter converterEsPestanaDetalle1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPestanaDetalle1() {
        return converterEsPestanaDetalle1;
    }
  
    public void setConverterEsPestanaDetalle1(IntegerConverter converter) {
        this.converterEsPestanaDetalle1 = converter;
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

    private ClaseRecursoSecCachedRowSetDataProvider2 claseRecursoSecDataProvider = new ClaseRecursoSecCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoSecCachedRowSetDataProvider2 getClaseRecursoSecDataProvider() {
        return claseRecursoSecDataProvider;
    }

    public void setClaseRecursoSecDataProvider(ClaseRecursoSecCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoSecDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider() {
        return claseRecursoDataProvider;
    }

    public void setClaseRecursoDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ClaseRecursoSeccionPorClaseRecurso2() {
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
        claseRecursoSecDataProvider.close();
        claseRecursoDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionClaseRecursoSec...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionClaseRecursoSecPorClaseRecurso asistente = new AsistentePaginaActualizacionClaseRecursoSecPorClaseRecurso(this);

    public AsistentePaginaActualizacionClaseRecursoSecPorClaseRecurso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ClaseRecursoSeccionPorClaseRecurso2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ClaseRecursoSeccionPorClaseRecurso2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getClaseRecursoSecDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ClaseRecursoSecCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO_SEC;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ClaseRecursoSecCachedRowSetDataProvider2.FUNCION_CREAR_CLASE_RECURSO_SEC;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ClaseRecursoSecCachedRowSetDataProvider2.FUNCION_MODIFICAR_CLASE_RECURSO_SEC;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ClaseRecursoSecCachedRowSetDataProvider2.FUNCION_ELIMINAR_CLASE_RECURSO_SEC;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        return this.getAsistente().getOpcionesListaFuncionAccion();
    }

    @Override
    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return this.getClaseRecursoDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return ClaseRecursoSecCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO;
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
