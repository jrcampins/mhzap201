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

import com.egt.data.general.xdp2.PaginaFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
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

public class PaginaFuncionPorPagina2 extends AbstractPageBean
        implements PaginaActualizacionPaginaFuncionPorPagina, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdPaginaFuncion1.setMinimum(0L);
        validatorIdPaginaFuncion1.setMaximum(1000000000000000000L);
        validatorControlPaginaFuncion1.setMaximum(100);
        paginaFuncionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paginaFuncionRowSet}"));
        paginaDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paginaRowSet}"));
        funcionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionReferenceRowSet}"));
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

    private Label labelIdPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPagina1() {
        return labelIdPagina1;
    }

    public void setLabelIdPagina1(Label l) {
        this.labelIdPagina1 = l;
    }

    private Label labelIdPaginaFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaFuncion1() {
        return labelIdPaginaFuncion1;
    }

    public void setLabelIdPaginaFuncion1(Label l) {
        this.labelIdPaginaFuncion1 = l;
    }

    private TextField campoIdPaginaFuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPaginaFuncion1() {
        return campoIdPaginaFuncion1;
    }

    public void setCampoIdPaginaFuncion1(TextField component) {
        this.campoIdPaginaFuncion1 = component;
    }

    private HelpInline helpInlineIdPaginaFuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPaginaFuncion1() {
        return helpInlineIdPaginaFuncion1;
    }

    public void setHelpInlineIdPaginaFuncion1(HelpInline hi) {
        this.helpInlineIdPaginaFuncion1 = hi;
    }

    private StaticText campoIdPaginaFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPaginaFuncion1Texto1() {
        return campoIdPaginaFuncion1Texto1;
    }

    public void setCampoIdPaginaFuncion1Texto1(StaticText component) {
        this.campoIdPaginaFuncion1Texto1 = component;
    }

    private LongConverter converterIdPaginaFuncion1 = new LongConverter();
  
    public LongConverter getConverterIdPaginaFuncion1() {
        return converterIdPaginaFuncion1;
    }
  
    public void setConverterIdPaginaFuncion1(LongConverter converter) {
        this.converterIdPaginaFuncion1 = converter;
    }
  
    private LongRangeValidator validatorIdPaginaFuncion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdPaginaFuncion1() {
        return validatorIdPaginaFuncion1;
    }
  
    public void setValidatorIdPaginaFuncion1(LongRangeValidator validator) {
        this.validatorIdPaginaFuncion1 = validator;
    }
  
    private Label labelIdFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncion1() {
        return labelIdFuncion1;
    }

    public void setLabelIdFuncion1(Label l) {
        this.labelIdFuncion1 = l;
    }

    private TextField campoIdFuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncion1() {
        return campoIdFuncion1;
    }

    public void setCampoIdFuncion1(TextField component) {
        this.campoIdFuncion1 = component;
    }

    private HelpInline helpInlineIdFuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncion1() {
        return helpInlineIdFuncion1;
    }

    public void setHelpInlineIdFuncion1(HelpInline hi) {
        this.helpInlineIdFuncion1 = hi;
    }

    private StaticText campoIdFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncion1Texto1() {
        return campoIdFuncion1Texto1;
    }

    public void setCampoIdFuncion1Texto1(StaticText component) {
        this.campoIdFuncion1Texto1 = component;
    }

    private Button campoIdFuncion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncion1Boton1() {
        return campoIdFuncion1Boton1;
    }

    public void setCampoIdFuncion1Boton1(Button component) {
        this.campoIdFuncion1Boton1 = component;
    }

    private Button campoIdFuncion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncion1Boton3() {
        return campoIdFuncion1Boton3;
    }

    public void setCampoIdFuncion1Boton3(Button component) {
        this.campoIdFuncion1Boton3 = component;
    }

    private Label labelIdFuncion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncion2() {
        return labelIdFuncion2;
    }

    public void setLabelIdFuncion2(Label l) {
        this.labelIdFuncion2 = l;
    }

    private StaticText campoIdFuncion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncion1Texto2() {
        return campoIdFuncion1Texto2;
    }

    public void setCampoIdFuncion1Texto2(StaticText component) {
        this.campoIdFuncion1Texto2 = component;
    }

    private Button campoIdFuncion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncion1Boton2() {
        return campoIdFuncion1Boton2;
    }

    public void setCampoIdFuncion1Boton2(Button component) {
        this.campoIdFuncion1Boton2 = component;
    }

    private Label labelEsFuncionInicial1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsFuncionInicial1() {
        return labelEsFuncionInicial1;
    }

    public void setLabelEsFuncionInicial1(Label l) {
        this.labelEsFuncionInicial1 = l;
    }

    private DropDown listaEsFuncionInicial1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsFuncionInicial1() {
        return listaEsFuncionInicial1;
    }

    public void setListaEsFuncionInicial1(DropDown component) {
        this.listaEsFuncionInicial1 = component;
    }

    private HelpInline helpInlineEsFuncionInicial1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsFuncionInicial1() {
        return helpInlineEsFuncionInicial1;
    }

    public void setHelpInlineEsFuncionInicial1(HelpInline hi) {
        this.helpInlineEsFuncionInicial1 = hi;
    }

    private StaticText listaEsFuncionInicial1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsFuncionInicial1Texto1() {
        return listaEsFuncionInicial1Texto1;
    }

    public void setListaEsFuncionInicial1Texto1(StaticText component) {
        this.listaEsFuncionInicial1Texto1 = component;
    }

    private IntegerConverter converterEsFuncionInicial1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsFuncionInicial1() {
        return converterEsFuncionInicial1;
    }
  
    public void setConverterEsFuncionInicial1(IntegerConverter converter) {
        this.converterEsFuncionInicial1 = converter;
    }
  
    private Label labelControlPaginaFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelControlPaginaFuncion1() {
        return labelControlPaginaFuncion1;
    }

    public void setLabelControlPaginaFuncion1(Label l) {
        this.labelControlPaginaFuncion1 = l;
    }

    private TextField campoControlPaginaFuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoControlPaginaFuncion1() {
        return campoControlPaginaFuncion1;
    }

    public void setCampoControlPaginaFuncion1(TextField component) {
        this.campoControlPaginaFuncion1 = component;
    }

    private HelpInline helpInlineControlPaginaFuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineControlPaginaFuncion1() {
        return helpInlineControlPaginaFuncion1;
    }

    public void setHelpInlineControlPaginaFuncion1(HelpInline hi) {
        this.helpInlineControlPaginaFuncion1 = hi;
    }

    private StaticText campoControlPaginaFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoControlPaginaFuncion1Texto1() {
        return campoControlPaginaFuncion1Texto1;
    }

    public void setCampoControlPaginaFuncion1Texto1(StaticText component) {
        this.campoControlPaginaFuncion1Texto1 = component;
    }

    private LengthValidator validatorControlPaginaFuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorControlPaginaFuncion1() {
        return validatorControlPaginaFuncion1;
    }
  
    public void setValidatorControlPaginaFuncion1(LengthValidator validator) {
        this.validatorControlPaginaFuncion1 = validator;
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

    private PaginaFuncionCachedRowSetDataProvider2 paginaFuncionDataProvider = new PaginaFuncionCachedRowSetDataProvider2();

    @Override
    public PaginaFuncionCachedRowSetDataProvider2 getPaginaFuncionDataProvider() {
        return paginaFuncionDataProvider;
    }

    public void setPaginaFuncionDataProvider(PaginaFuncionCachedRowSetDataProvider2 crsdp) {
        this.paginaFuncionDataProvider = crsdp;
    }

    private PaginaCachedRowSetDataProvider2 paginaDataProvider = new PaginaCachedRowSetDataProvider2();

    @Override
    public PaginaCachedRowSetDataProvider2 getPaginaDataProvider() {
        return paginaDataProvider;
    }

    public void setPaginaDataProvider(PaginaCachedRowSetDataProvider2 crsdp) {
        this.paginaDataProvider = crsdp;
    }

    private FuncionCachedRowSetDataProvider2 funcionReferenceDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider() {
        return funcionReferenceDataProvider;
    }

    public void setFuncionReferenceDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public PaginaFuncionPorPagina2() {
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
        paginaFuncionDataProvider.close();
        paginaDataProvider.close();
        funcionReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionPaginaFuncion...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionPaginaFuncionPorPagina asistente = new AsistentePaginaActualizacionPaginaFuncionPorPagina(this);

    public AsistentePaginaActualizacionPaginaFuncionPorPagina getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("PaginaFuncionPorPagina2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("PaginaFuncionPorPagina2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getPaginaFuncionDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return PaginaFuncionCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAGINA_FUNCION;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return PaginaFuncionCachedRowSetDataProvider2.FUNCION_CREAR_PAGINA_FUNCION;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return PaginaFuncionCachedRowSetDataProvider2.FUNCION_MODIFICAR_PAGINA_FUNCION;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return PaginaFuncionCachedRowSetDataProvider2.FUNCION_ELIMINAR_PAGINA_FUNCION;
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
        return this.getPaginaDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return PaginaFuncionCachedRowSetDataProvider2.COLUMNA_ID_PAGINA;
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
    public void campoIdFuncion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncion1_validate(context, component, value);
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
}
