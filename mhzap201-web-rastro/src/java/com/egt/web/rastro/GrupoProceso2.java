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
package com.egt.web.rastro;

import com.egt.data.general.xdp2.GrupoProcesoCachedRowSetDataProvider2;
import com.egt.base.util.BundleWebui;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.aplicacion.web.PaginaActualizacionConAccionMultiple;
import com.egt.core.aplicacion.web.PaginaActualizacionConEdicionMultiple;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.HelpInline;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;
import javax.ejb.EJB;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.process.GrupoProcesoBusinessProcessLocal;

public class GrupoProceso2 extends AbstractPageBean
        implements PaginaActualizacionGrupoProceso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdGrupoProceso1.setMinimum(0L);
        validatorIdGrupoProceso1.setMaximum(1000000000000000000L);
        validatorCodigoGrupoProceso1.setMaximum(30);
        validatorNombreGrupoProceso1.setMaximum(100);
        validatorDescripcionGrupoProceso1.setMaximum(2000);
        validatorIdRastroProceso1.setMinimum(0L);
        validatorIdRastroProceso1.setMaximum(1000000000000000000L);
        grupoProcesoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.grupoProcesoRowSet}"));
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

    private Label labelIdGrupoProceso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoProceso1() {
        return labelIdGrupoProceso1;
    }

    public void setLabelIdGrupoProceso1(Label l) {
        this.labelIdGrupoProceso1 = l;
    }

    private TextField campoIdGrupoProceso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdGrupoProceso1() {
        return campoIdGrupoProceso1;
    }

    public void setCampoIdGrupoProceso1(TextField component) {
        this.campoIdGrupoProceso1 = component;
    }

    private HelpInline helpInlineIdGrupoProceso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdGrupoProceso1() {
        return helpInlineIdGrupoProceso1;
    }

    public void setHelpInlineIdGrupoProceso1(HelpInline hi) {
        this.helpInlineIdGrupoProceso1 = hi;
    }

    private StaticText campoIdGrupoProceso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdGrupoProceso1Texto1() {
        return campoIdGrupoProceso1Texto1;
    }

    public void setCampoIdGrupoProceso1Texto1(StaticText component) {
        this.campoIdGrupoProceso1Texto1 = component;
    }

    private LongConverter converterIdGrupoProceso1 = new LongConverter();

    public LongConverter getConverterIdGrupoProceso1() {
        return converterIdGrupoProceso1;
    }

    public void setConverterIdGrupoProceso1(LongConverter converter) {
        this.converterIdGrupoProceso1 = converter;
    }

    private LongRangeValidator validatorIdGrupoProceso1 = new LongRangeValidator();

    public LongRangeValidator getValidatorIdGrupoProceso1() {
        return validatorIdGrupoProceso1;
    }

    public void setValidatorIdGrupoProceso1(LongRangeValidator validator) {
        this.validatorIdGrupoProceso1 = validator;
    }

    private Label labelCodigoGrupoProceso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoGrupoProceso1() {
        return labelCodigoGrupoProceso1;
    }

    public void setLabelCodigoGrupoProceso1(Label l) {
        this.labelCodigoGrupoProceso1 = l;
    }

    private TextField campoCodigoGrupoProceso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoGrupoProceso1() {
        return campoCodigoGrupoProceso1;
    }

    public void setCampoCodigoGrupoProceso1(TextField component) {
        this.campoCodigoGrupoProceso1 = component;
    }

    private HelpInline helpInlineCodigoGrupoProceso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoGrupoProceso1() {
        return helpInlineCodigoGrupoProceso1;
    }

    public void setHelpInlineCodigoGrupoProceso1(HelpInline hi) {
        this.helpInlineCodigoGrupoProceso1 = hi;
    }

    private StaticText campoCodigoGrupoProceso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoGrupoProceso1Texto1() {
        return campoCodigoGrupoProceso1Texto1;
    }

    public void setCampoCodigoGrupoProceso1Texto1(StaticText component) {
        this.campoCodigoGrupoProceso1Texto1 = component;
    }

    private LengthValidator validatorCodigoGrupoProceso1 = new LengthValidator();

    public LengthValidator getValidatorCodigoGrupoProceso1() {
        return validatorCodigoGrupoProceso1;
    }

    public void setValidatorCodigoGrupoProceso1(LengthValidator validator) {
        this.validatorCodigoGrupoProceso1 = validator;
    }

    private Label labelNombreGrupoProceso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreGrupoProceso1() {
        return labelNombreGrupoProceso1;
    }

    public void setLabelNombreGrupoProceso1(Label l) {
        this.labelNombreGrupoProceso1 = l;
    }

    private TextField campoNombreGrupoProceso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreGrupoProceso1() {
        return campoNombreGrupoProceso1;
    }

    public void setCampoNombreGrupoProceso1(TextField component) {
        this.campoNombreGrupoProceso1 = component;
    }

    private HelpInline helpInlineNombreGrupoProceso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreGrupoProceso1() {
        return helpInlineNombreGrupoProceso1;
    }

    public void setHelpInlineNombreGrupoProceso1(HelpInline hi) {
        this.helpInlineNombreGrupoProceso1 = hi;
    }

    private StaticText campoNombreGrupoProceso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreGrupoProceso1Texto1() {
        return campoNombreGrupoProceso1Texto1;
    }

    public void setCampoNombreGrupoProceso1Texto1(StaticText component) {
        this.campoNombreGrupoProceso1Texto1 = component;
    }

    private LengthValidator validatorNombreGrupoProceso1 = new LengthValidator();

    public LengthValidator getValidatorNombreGrupoProceso1() {
        return validatorNombreGrupoProceso1;
    }

    public void setValidatorNombreGrupoProceso1(LengthValidator validator) {
        this.validatorNombreGrupoProceso1 = validator;
    }

    private Label labelDescripcionGrupoProceso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionGrupoProceso1() {
        return labelDescripcionGrupoProceso1;
    }

    public void setLabelDescripcionGrupoProceso1(Label l) {
        this.labelDescripcionGrupoProceso1 = l;
    }

    private TextArea campoDescripcionGrupoProceso1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionGrupoProceso1() {
        return campoDescripcionGrupoProceso1;
    }

    public void setCampoDescripcionGrupoProceso1(TextArea component) {
        this.campoDescripcionGrupoProceso1 = component;
    }

    private HelpInline helpInlineDescripcionGrupoProceso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionGrupoProceso1() {
        return helpInlineDescripcionGrupoProceso1;
    }

    public void setHelpInlineDescripcionGrupoProceso1(HelpInline hi) {
        this.helpInlineDescripcionGrupoProceso1 = hi;
    }

    private StaticText campoDescripcionGrupoProceso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionGrupoProceso1Texto1() {
        return campoDescripcionGrupoProceso1Texto1;
    }

    public void setCampoDescripcionGrupoProceso1Texto1(StaticText component) {
        this.campoDescripcionGrupoProceso1Texto1 = component;
    }

    private LengthValidator validatorDescripcionGrupoProceso1 = new LengthValidator();

    public LengthValidator getValidatorDescripcionGrupoProceso1() {
        return validatorDescripcionGrupoProceso1;
    }

    public void setValidatorDescripcionGrupoProceso1(LengthValidator validator) {
        this.validatorDescripcionGrupoProceso1 = validator;
    }

    private Label labelIdRastroProceso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdRastroProceso1() {
        return labelIdRastroProceso1;
    }

    public void setLabelIdRastroProceso1(Label l) {
        this.labelIdRastroProceso1 = l;
    }

    private TextField campoIdRastroProceso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdRastroProceso1() {
        return campoIdRastroProceso1;
    }

    public void setCampoIdRastroProceso1(TextField component) {
        this.campoIdRastroProceso1 = component;
    }

    private HelpInline helpInlineIdRastroProceso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdRastroProceso1() {
        return helpInlineIdRastroProceso1;
    }

    public void setHelpInlineIdRastroProceso1(HelpInline hi) {
        this.helpInlineIdRastroProceso1 = hi;
    }

    private StaticText campoIdRastroProceso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdRastroProceso1Texto1() {
        return campoIdRastroProceso1Texto1;
    }

    public void setCampoIdRastroProceso1Texto1(StaticText component) {
        this.campoIdRastroProceso1Texto1 = component;
    }

    private LongConverter converterIdRastroProceso1 = new LongConverter();

    public LongConverter getConverterIdRastroProceso1() {
        return converterIdRastroProceso1;
    }

    public void setConverterIdRastroProceso1(LongConverter converter) {
        this.converterIdRastroProceso1 = converter;
    }

    private LongRangeValidator validatorIdRastroProceso1 = new LongRangeValidator();

    public LongRangeValidator getValidatorIdRastroProceso1() {
        return validatorIdRastroProceso1;
    }

    public void setValidatorIdRastroProceso1(LongRangeValidator validator) {
        this.validatorIdRastroProceso1 = validator;
    }

    private Label labelNumeroCondicionEjeFun1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionEjeFun1() {
        return labelNumeroCondicionEjeFun1;
    }

    public void setLabelNumeroCondicionEjeFun1(Label l) {
        this.labelNumeroCondicionEjeFun1 = l;
    }

    private DropDown listaNumeroCondicionEjeFun1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCondicionEjeFun1() {
        return listaNumeroCondicionEjeFun1;
    }

    public void setListaNumeroCondicionEjeFun1(DropDown component) {
        this.listaNumeroCondicionEjeFun1 = component;
    }

    private HelpInline helpInlineNumeroCondicionEjeFun1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionEjeFun1() {
        return helpInlineNumeroCondicionEjeFun1;
    }

    public void setHelpInlineNumeroCondicionEjeFun1(HelpInline hi) {
        this.helpInlineNumeroCondicionEjeFun1 = hi;
    }

    private StaticText listaNumeroCondicionEjeFun1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionEjeFun1Texto1() {
        return listaNumeroCondicionEjeFun1Texto1;
    }

    public void setListaNumeroCondicionEjeFun1Texto1(StaticText component) {
        this.listaNumeroCondicionEjeFun1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionEjeFun1 = new IntegerConverter();

    public IntegerConverter getConverterNumeroCondicionEjeFun1() {
        return converterNumeroCondicionEjeFun1;
    }

    public void setConverterNumeroCondicionEjeFun1(IntegerConverter converter) {
        this.converterNumeroCondicionEjeFun1 = converter;
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

    private GrupoProcesoCachedRowSetDataProvider2 grupoProcesoDataProvider = new GrupoProcesoCachedRowSetDataProvider2();

    @Override
    public GrupoProcesoCachedRowSetDataProvider2 getGrupoProcesoDataProvider() {
        return grupoProcesoDataProvider;
    }

    public void setGrupoProcesoDataProvider(GrupoProcesoCachedRowSetDataProvider2 crsdp) {
        this.grupoProcesoDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public GrupoProceso2() {
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
        grupoProcesoDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionGrupoProceso...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionGrupoProceso asistente = new AsistentePaginaActualizacionGrupoProceso(this);

    public AsistentePaginaActualizacionGrupoProceso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("GrupoProceso2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("GrupoProceso2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getGrupoProcesoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return GrupoProcesoCachedRowSetDataProvider2.FUNCION_CONSULTAR_GRUPO_PROCESO;
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
/**/
    @EJB
    GrupoProcesoBusinessProcessLocal grupoProcesoBusinessProcess;

    @Override
    public Object getGrupoProcesoBusinessProcess() {
        return grupoProcesoBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
