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

import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
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
import javax.ejb.EJB;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.process.FichaHogarBusinessProcessLocal;

public class FichaHogar6 extends AbstractPageBean
        implements PaginaActualizacionFichaHogar, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdFichaHogar1.setMinimum(0L);
        validatorIdFichaHogar1.setMaximum(1000000000000000000L);
        validatorCodigoFichaHogar1.setMaximum(30);
        converterFechaEntrevista1.setPattern("dd/MM/yyyy");
        converterFechaEntrevista1.setType("date");
        validatorObservaciones1.setMaximum(8160);
        validatorHusoUtm1.setMinimum(1L);
        validatorHusoUtm1.setMaximum(60L);
        validatorFranjaUtm1.setMaximum(1);
        validatorDistanciaEsteUtm1.setMinimum(0L);
        validatorDistanciaEsteUtm1.setMaximum(1000000000L);
        validatorDistanciaNorteUtm1.setMinimum(0L);
        validatorDistanciaNorteUtm1.setMaximum(1000000000L);
        validatorNumeroFormulario1.setMinimum(0L);
        validatorNumeroFormulario1.setMaximum(1000000000L);
        validatorNumeroVivienda1.setMinimum(0L);
        validatorNumeroVivienda1.setMaximum(1000000000L);
        validatorNumeroHogar1.setMinimum(0L);
        validatorNumeroHogar1.setMaximum(1000000000L);
        validatorManzana1.setMaximum(30);
        validatorDireccion1.setMaximum(8160);
        validatorTotalPersonas1.setMinimum(0L);
        validatorTotalPersonas1.setMaximum(1000000000L);
        validatorTotalHombres1.setMinimum(0L);
        validatorTotalHombres1.setMaximum(1000000000L);
        validatorTotalMujeres1.setMinimum(0L);
        validatorTotalMujeres1.setMaximum(1000000000L);
        validatorOtroTipoOcupacionViv1.setMaximum(100);
        validatorCantidadPiezas1.setMinimum(0L);
        validatorCantidadPiezas1.setMaximum(1000000000L);
        validatorCantidadDormitorios1.setMinimum(0L);
        validatorCantidadDormitorios1.setMaximum(1000000000L);
        validatorNumeroTelefonoCelular1.setMaximum(50);
        validatorNumeroTelefonoLineaBaja1.setMaximum(50);
        validatorNombreJefeHogar1.setMaximum(100);
        validatorNumeroCedulaJefeHogar1.setMinimum(0L);
        validatorNumeroCedulaJefeHogar1.setMaximum(1000000000L);
        validatorLetraCedulaJefeHogar1.setMaximum(1);
        validatorNumeroOrdenIdenJefeHogar1.setMinimum(0L);
        validatorNumeroOrdenIdenJefeHogar1.setMaximum(1000000000L);
        validatorNombreRespondente1.setMaximum(100);
        validatorNumeroCedulaRespondente1.setMinimum(0L);
        validatorNumeroCedulaRespondente1.setMaximum(1000000000L);
        validatorLetraCedulaRespondente1.setMaximum(1);
        validatorNumeroOrdenIdenRespondente1.setMinimum(0L);
        validatorNumeroOrdenIdenRespondente1.setMaximum(1000000000L);
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorIndiceCalidadVida1.setMinimum(0.0);
        validatorIndiceCalidadVida1.setMaximum(1.0E2);
        fichaHogarDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaHogarRowSet}"));
        funcionarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionarioReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
        proveedorDatExtReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.proveedorDatExtReferenceRowSet}"));
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

    private Label labelIdFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar1() {
        return labelIdFichaHogar1;
    }

    public void setLabelIdFichaHogar1(Label l) {
        this.labelIdFichaHogar1 = l;
    }

    private TextField campoIdFichaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFichaHogar1() {
        return campoIdFichaHogar1;
    }

    public void setCampoIdFichaHogar1(TextField component) {
        this.campoIdFichaHogar1 = component;
    }

    private HelpInline helpInlineIdFichaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaHogar1() {
        return helpInlineIdFichaHogar1;
    }

    public void setHelpInlineIdFichaHogar1(HelpInline hi) {
        this.helpInlineIdFichaHogar1 = hi;
    }

    private StaticText campoIdFichaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaHogar1Texto1() {
        return campoIdFichaHogar1Texto1;
    }

    public void setCampoIdFichaHogar1Texto1(StaticText component) {
        this.campoIdFichaHogar1Texto1 = component;
    }

    private LongConverter converterIdFichaHogar1 = new LongConverter();
  
    public LongConverter getConverterIdFichaHogar1() {
        return converterIdFichaHogar1;
    }
  
    public void setConverterIdFichaHogar1(LongConverter converter) {
        this.converterIdFichaHogar1 = converter;
    }
  
    private LongRangeValidator validatorIdFichaHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdFichaHogar1() {
        return validatorIdFichaHogar1;
    }
  
    public void setValidatorIdFichaHogar1(LongRangeValidator validator) {
        this.validatorIdFichaHogar1 = validator;
    }
  
    private Label labelCodigoFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoFichaHogar1() {
        return labelCodigoFichaHogar1;
    }

    public void setLabelCodigoFichaHogar1(Label l) {
        this.labelCodigoFichaHogar1 = l;
    }

    private TextField campoCodigoFichaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoFichaHogar1() {
        return campoCodigoFichaHogar1;
    }

    public void setCampoCodigoFichaHogar1(TextField component) {
        this.campoCodigoFichaHogar1 = component;
    }

    private HelpInline helpInlineCodigoFichaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoFichaHogar1() {
        return helpInlineCodigoFichaHogar1;
    }

    public void setHelpInlineCodigoFichaHogar1(HelpInline hi) {
        this.helpInlineCodigoFichaHogar1 = hi;
    }

    private StaticText campoCodigoFichaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoFichaHogar1Texto1() {
        return campoCodigoFichaHogar1Texto1;
    }

    public void setCampoCodigoFichaHogar1Texto1(StaticText component) {
        this.campoCodigoFichaHogar1Texto1 = component;
    }

    private LengthValidator validatorCodigoFichaHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoFichaHogar1() {
        return validatorCodigoFichaHogar1;
    }
  
    public void setValidatorCodigoFichaHogar1(LengthValidator validator) {
        this.validatorCodigoFichaHogar1 = validator;
    }
  
    private Label labelFechaEntrevista1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaEntrevista1() {
        return labelFechaEntrevista1;
    }

    public void setLabelFechaEntrevista1(Label l) {
        this.labelFechaEntrevista1 = l;
    }

    private Label labelFechaEntrevista1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaEntrevista1x1() {
        return labelFechaEntrevista1x1;
    }

    public void setLabelFechaEntrevista1x1(Label l) {
        this.labelFechaEntrevista1x1 = l;
    }

    private Calendar campoFechaEntrevista1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaEntrevista1() {
        return campoFechaEntrevista1;
    }

    public void setCampoFechaEntrevista1(Calendar component) {
        this.campoFechaEntrevista1 = component;
    }

    private Calendar campoFechaEntrevista1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaEntrevista1x1() {
        return campoFechaEntrevista1x1;
    }

    public void setCampoFechaEntrevista1x1(Calendar component) {
        this.campoFechaEntrevista1x1 = component;
    }

    private HelpInline helpInlineFechaEntrevista1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaEntrevista1() {
        return helpInlineFechaEntrevista1;
    }

    public void setHelpInlineFechaEntrevista1(HelpInline hi) {
        this.helpInlineFechaEntrevista1 = hi;
    }

    private HelpInline helpInlineFechaEntrevista1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaEntrevista1x1() {
        return helpInlineFechaEntrevista1x1;
    }

    public void setHelpInlineFechaEntrevista1x1(HelpInline hi) {
        this.helpInlineFechaEntrevista1x1 = hi;
    }

    private StaticText campoFechaEntrevista1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaEntrevista1Texto1() {
        return campoFechaEntrevista1Texto1;
    }

    public void setCampoFechaEntrevista1Texto1(StaticText component) {
        this.campoFechaEntrevista1Texto1 = component;
    }

    private StaticText campoFechaEntrevista1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaEntrevista1x1Texto1() {
        return campoFechaEntrevista1x1Texto1;
    }

    public void setCampoFechaEntrevista1x1Texto1(StaticText component) {
        this.campoFechaEntrevista1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaEntrevista1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaEntrevista1() {
        return converterFechaEntrevista1;
    }
  
    public void setConverterFechaEntrevista1(SqlTimestampConverter converter) {
        this.converterFechaEntrevista1 = converter;
    }
  
    private Label labelIdFuncionarioCensista1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCensista1() {
        return labelIdFuncionarioCensista1;
    }

    public void setLabelIdFuncionarioCensista1(Label l) {
        this.labelIdFuncionarioCensista1 = l;
    }

    private Label labelIdFuncionarioCensista1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCensista1x1() {
        return labelIdFuncionarioCensista1x1;
    }

    public void setLabelIdFuncionarioCensista1x1(Label l) {
        this.labelIdFuncionarioCensista1x1 = l;
    }

    private TextField campoIdFuncionarioCensista1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioCensista1() {
        return campoIdFuncionarioCensista1;
    }

    public void setCampoIdFuncionarioCensista1(TextField component) {
        this.campoIdFuncionarioCensista1 = component;
    }

    private TextField campoIdFuncionarioCensista1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioCensista1x1() {
        return campoIdFuncionarioCensista1x1;
    }

    public void setCampoIdFuncionarioCensista1x1(TextField component) {
        this.campoIdFuncionarioCensista1x1 = component;
    }

    private HelpInline helpInlineIdFuncionarioCensista1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioCensista1() {
        return helpInlineIdFuncionarioCensista1;
    }

    public void setHelpInlineIdFuncionarioCensista1(HelpInline hi) {
        this.helpInlineIdFuncionarioCensista1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioCensista1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioCensista1x1() {
        return helpInlineIdFuncionarioCensista1x1;
    }

    public void setHelpInlineIdFuncionarioCensista1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioCensista1x1 = hi;
    }

    private StaticText campoIdFuncionarioCensista1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCensista1Texto1() {
        return campoIdFuncionarioCensista1Texto1;
    }

    public void setCampoIdFuncionarioCensista1Texto1(StaticText component) {
        this.campoIdFuncionarioCensista1Texto1 = component;
    }

    private StaticText campoIdFuncionarioCensista1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCensista1x1Texto1() {
        return campoIdFuncionarioCensista1x1Texto1;
    }

    public void setCampoIdFuncionarioCensista1x1Texto1(StaticText component) {
        this.campoIdFuncionarioCensista1x1Texto1 = component;
    }

    private Button campoIdFuncionarioCensista1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCensista1Boton1() {
        return campoIdFuncionarioCensista1Boton1;
    }

    public void setCampoIdFuncionarioCensista1Boton1(Button component) {
        this.campoIdFuncionarioCensista1Boton1 = component;
    }

    private Button campoIdFuncionarioCensista1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCensista1x1Boton1() {
        return campoIdFuncionarioCensista1x1Boton1;
    }

    public void setCampoIdFuncionarioCensista1x1Boton1(Button component) {
        this.campoIdFuncionarioCensista1x1Boton1 = component;
    }

    private Button campoIdFuncionarioCensista1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1Boton3() {
        return campoIdFuncionarioCensista1Boton3;
    }

    public void setCampoIdFuncionarioCensista1Boton3(Button component) {
        this.campoIdFuncionarioCensista1Boton3 = component;
    }

    private Button campoIdFuncionarioCensista1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1x1Boton3() {
        return campoIdFuncionarioCensista1x1Boton3;
    }

    public void setCampoIdFuncionarioCensista1x1Boton3(Button component) {
        this.campoIdFuncionarioCensista1x1Boton3 = component;
    }

    private Label labelIdFuncionarioCensista2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCensista2() {
        return labelIdFuncionarioCensista2;
    }

    public void setLabelIdFuncionarioCensista2(Label l) {
        this.labelIdFuncionarioCensista2 = l;
    }

    private Label labelIdFuncionarioCensista1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCensista1x2() {
        return labelIdFuncionarioCensista1x2;
    }

    public void setLabelIdFuncionarioCensista1x2(Label l) {
        this.labelIdFuncionarioCensista1x2 = l;
    }

    private StaticText campoIdFuncionarioCensista1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioCensista1Texto2() {
        return campoIdFuncionarioCensista1Texto2;
    }

    public void setCampoIdFuncionarioCensista1Texto2(StaticText component) {
        this.campoIdFuncionarioCensista1Texto2 = component;
    }

    private StaticText campoIdFuncionarioCensista1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioCensista1x1Texto2() {
        return campoIdFuncionarioCensista1x1Texto2;
    }

    public void setCampoIdFuncionarioCensista1x1Texto2(StaticText component) {
        this.campoIdFuncionarioCensista1x1Texto2 = component;
    }

    private Button campoIdFuncionarioCensista1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1Boton2() {
        return campoIdFuncionarioCensista1Boton2;
    }

    public void setCampoIdFuncionarioCensista1Boton2(Button component) {
        this.campoIdFuncionarioCensista1Boton2 = component;
    }

    private Button campoIdFuncionarioCensista1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1x1Boton2() {
        return campoIdFuncionarioCensista1x1Boton2;
    }

    public void setCampoIdFuncionarioCensista1x1Boton2(Button component) {
        this.campoIdFuncionarioCensista1x1Boton2 = component;
    }

    private Label labelIdFuncionarioSupervisor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioSupervisor1() {
        return labelIdFuncionarioSupervisor1;
    }

    public void setLabelIdFuncionarioSupervisor1(Label l) {
        this.labelIdFuncionarioSupervisor1 = l;
    }

    private Label labelIdFuncionarioSupervisor1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioSupervisor1x1() {
        return labelIdFuncionarioSupervisor1x1;
    }

    public void setLabelIdFuncionarioSupervisor1x1(Label l) {
        this.labelIdFuncionarioSupervisor1x1 = l;
    }

    private TextField campoIdFuncionarioSupervisor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioSupervisor1() {
        return campoIdFuncionarioSupervisor1;
    }

    public void setCampoIdFuncionarioSupervisor1(TextField component) {
        this.campoIdFuncionarioSupervisor1 = component;
    }

    private TextField campoIdFuncionarioSupervisor1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioSupervisor1x1() {
        return campoIdFuncionarioSupervisor1x1;
    }

    public void setCampoIdFuncionarioSupervisor1x1(TextField component) {
        this.campoIdFuncionarioSupervisor1x1 = component;
    }

    private HelpInline helpInlineIdFuncionarioSupervisor1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioSupervisor1() {
        return helpInlineIdFuncionarioSupervisor1;
    }

    public void setHelpInlineIdFuncionarioSupervisor1(HelpInline hi) {
        this.helpInlineIdFuncionarioSupervisor1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioSupervisor1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioSupervisor1x1() {
        return helpInlineIdFuncionarioSupervisor1x1;
    }

    public void setHelpInlineIdFuncionarioSupervisor1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioSupervisor1x1 = hi;
    }

    private StaticText campoIdFuncionarioSupervisor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioSupervisor1Texto1() {
        return campoIdFuncionarioSupervisor1Texto1;
    }

    public void setCampoIdFuncionarioSupervisor1Texto1(StaticText component) {
        this.campoIdFuncionarioSupervisor1Texto1 = component;
    }

    private StaticText campoIdFuncionarioSupervisor1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioSupervisor1x1Texto1() {
        return campoIdFuncionarioSupervisor1x1Texto1;
    }

    public void setCampoIdFuncionarioSupervisor1x1Texto1(StaticText component) {
        this.campoIdFuncionarioSupervisor1x1Texto1 = component;
    }

    private Button campoIdFuncionarioSupervisor1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioSupervisor1Boton1() {
        return campoIdFuncionarioSupervisor1Boton1;
    }

    public void setCampoIdFuncionarioSupervisor1Boton1(Button component) {
        this.campoIdFuncionarioSupervisor1Boton1 = component;
    }

    private Button campoIdFuncionarioSupervisor1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioSupervisor1x1Boton1() {
        return campoIdFuncionarioSupervisor1x1Boton1;
    }

    public void setCampoIdFuncionarioSupervisor1x1Boton1(Button component) {
        this.campoIdFuncionarioSupervisor1x1Boton1 = component;
    }

    private Button campoIdFuncionarioSupervisor1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioSupervisor1Boton3() {
        return campoIdFuncionarioSupervisor1Boton3;
    }

    public void setCampoIdFuncionarioSupervisor1Boton3(Button component) {
        this.campoIdFuncionarioSupervisor1Boton3 = component;
    }

    private Button campoIdFuncionarioSupervisor1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioSupervisor1x1Boton3() {
        return campoIdFuncionarioSupervisor1x1Boton3;
    }

    public void setCampoIdFuncionarioSupervisor1x1Boton3(Button component) {
        this.campoIdFuncionarioSupervisor1x1Boton3 = component;
    }

    private Label labelIdFuncionarioSupervisor2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioSupervisor2() {
        return labelIdFuncionarioSupervisor2;
    }

    public void setLabelIdFuncionarioSupervisor2(Label l) {
        this.labelIdFuncionarioSupervisor2 = l;
    }

    private Label labelIdFuncionarioSupervisor1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioSupervisor1x2() {
        return labelIdFuncionarioSupervisor1x2;
    }

    public void setLabelIdFuncionarioSupervisor1x2(Label l) {
        this.labelIdFuncionarioSupervisor1x2 = l;
    }

    private StaticText campoIdFuncionarioSupervisor1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioSupervisor1Texto2() {
        return campoIdFuncionarioSupervisor1Texto2;
    }

    public void setCampoIdFuncionarioSupervisor1Texto2(StaticText component) {
        this.campoIdFuncionarioSupervisor1Texto2 = component;
    }

    private StaticText campoIdFuncionarioSupervisor1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioSupervisor1x1Texto2() {
        return campoIdFuncionarioSupervisor1x1Texto2;
    }

    public void setCampoIdFuncionarioSupervisor1x1Texto2(StaticText component) {
        this.campoIdFuncionarioSupervisor1x1Texto2 = component;
    }

    private Button campoIdFuncionarioSupervisor1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioSupervisor1Boton2() {
        return campoIdFuncionarioSupervisor1Boton2;
    }

    public void setCampoIdFuncionarioSupervisor1Boton2(Button component) {
        this.campoIdFuncionarioSupervisor1Boton2 = component;
    }

    private Button campoIdFuncionarioSupervisor1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioSupervisor1x1Boton2() {
        return campoIdFuncionarioSupervisor1x1Boton2;
    }

    public void setCampoIdFuncionarioSupervisor1x1Boton2(Button component) {
        this.campoIdFuncionarioSupervisor1x1Boton2 = component;
    }

    private Label labelIdFuncionarioCriticoDeco1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCriticoDeco1() {
        return labelIdFuncionarioCriticoDeco1;
    }

    public void setLabelIdFuncionarioCriticoDeco1(Label l) {
        this.labelIdFuncionarioCriticoDeco1 = l;
    }

    private Label labelIdFuncionarioCriticoDeco1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCriticoDeco1x1() {
        return labelIdFuncionarioCriticoDeco1x1;
    }

    public void setLabelIdFuncionarioCriticoDeco1x1(Label l) {
        this.labelIdFuncionarioCriticoDeco1x1 = l;
    }

    private TextField campoIdFuncionarioCriticoDeco1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioCriticoDeco1() {
        return campoIdFuncionarioCriticoDeco1;
    }

    public void setCampoIdFuncionarioCriticoDeco1(TextField component) {
        this.campoIdFuncionarioCriticoDeco1 = component;
    }

    private TextField campoIdFuncionarioCriticoDeco1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioCriticoDeco1x1() {
        return campoIdFuncionarioCriticoDeco1x1;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1(TextField component) {
        this.campoIdFuncionarioCriticoDeco1x1 = component;
    }

    private HelpInline helpInlineIdFuncionarioCriticoDeco1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioCriticoDeco1() {
        return helpInlineIdFuncionarioCriticoDeco1;
    }

    public void setHelpInlineIdFuncionarioCriticoDeco1(HelpInline hi) {
        this.helpInlineIdFuncionarioCriticoDeco1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioCriticoDeco1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioCriticoDeco1x1() {
        return helpInlineIdFuncionarioCriticoDeco1x1;
    }

    public void setHelpInlineIdFuncionarioCriticoDeco1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioCriticoDeco1x1 = hi;
    }

    private StaticText campoIdFuncionarioCriticoDeco1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCriticoDeco1Texto1() {
        return campoIdFuncionarioCriticoDeco1Texto1;
    }

    public void setCampoIdFuncionarioCriticoDeco1Texto1(StaticText component) {
        this.campoIdFuncionarioCriticoDeco1Texto1 = component;
    }

    private StaticText campoIdFuncionarioCriticoDeco1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCriticoDeco1x1Texto1() {
        return campoIdFuncionarioCriticoDeco1x1Texto1;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Texto1(StaticText component) {
        this.campoIdFuncionarioCriticoDeco1x1Texto1 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCriticoDeco1Boton1() {
        return campoIdFuncionarioCriticoDeco1Boton1;
    }

    public void setCampoIdFuncionarioCriticoDeco1Boton1(Button component) {
        this.campoIdFuncionarioCriticoDeco1Boton1 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCriticoDeco1x1Boton1() {
        return campoIdFuncionarioCriticoDeco1x1Boton1;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Boton1(Button component) {
        this.campoIdFuncionarioCriticoDeco1x1Boton1 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCriticoDeco1Boton3() {
        return campoIdFuncionarioCriticoDeco1Boton3;
    }

    public void setCampoIdFuncionarioCriticoDeco1Boton3(Button component) {
        this.campoIdFuncionarioCriticoDeco1Boton3 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCriticoDeco1x1Boton3() {
        return campoIdFuncionarioCriticoDeco1x1Boton3;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Boton3(Button component) {
        this.campoIdFuncionarioCriticoDeco1x1Boton3 = component;
    }

    private Label labelIdFuncionarioCriticoDeco2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCriticoDeco2() {
        return labelIdFuncionarioCriticoDeco2;
    }

    public void setLabelIdFuncionarioCriticoDeco2(Label l) {
        this.labelIdFuncionarioCriticoDeco2 = l;
    }

    private Label labelIdFuncionarioCriticoDeco1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCriticoDeco1x2() {
        return labelIdFuncionarioCriticoDeco1x2;
    }

    public void setLabelIdFuncionarioCriticoDeco1x2(Label l) {
        this.labelIdFuncionarioCriticoDeco1x2 = l;
    }

    private StaticText campoIdFuncionarioCriticoDeco1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioCriticoDeco1Texto2() {
        return campoIdFuncionarioCriticoDeco1Texto2;
    }

    public void setCampoIdFuncionarioCriticoDeco1Texto2(StaticText component) {
        this.campoIdFuncionarioCriticoDeco1Texto2 = component;
    }

    private StaticText campoIdFuncionarioCriticoDeco1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioCriticoDeco1x1Texto2() {
        return campoIdFuncionarioCriticoDeco1x1Texto2;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Texto2(StaticText component) {
        this.campoIdFuncionarioCriticoDeco1x1Texto2 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCriticoDeco1Boton2() {
        return campoIdFuncionarioCriticoDeco1Boton2;
    }

    public void setCampoIdFuncionarioCriticoDeco1Boton2(Button component) {
        this.campoIdFuncionarioCriticoDeco1Boton2 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCriticoDeco1x1Boton2() {
        return campoIdFuncionarioCriticoDeco1x1Boton2;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Boton2(Button component) {
        this.campoIdFuncionarioCriticoDeco1x1Boton2 = component;
    }

    private Label labelIdFuncionarioDigitador1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioDigitador1() {
        return labelIdFuncionarioDigitador1;
    }

    public void setLabelIdFuncionarioDigitador1(Label l) {
        this.labelIdFuncionarioDigitador1 = l;
    }

    private Label labelIdFuncionarioDigitador1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioDigitador1x1() {
        return labelIdFuncionarioDigitador1x1;
    }

    public void setLabelIdFuncionarioDigitador1x1(Label l) {
        this.labelIdFuncionarioDigitador1x1 = l;
    }

    private TextField campoIdFuncionarioDigitador1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioDigitador1() {
        return campoIdFuncionarioDigitador1;
    }

    public void setCampoIdFuncionarioDigitador1(TextField component) {
        this.campoIdFuncionarioDigitador1 = component;
    }

    private TextField campoIdFuncionarioDigitador1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioDigitador1x1() {
        return campoIdFuncionarioDigitador1x1;
    }

    public void setCampoIdFuncionarioDigitador1x1(TextField component) {
        this.campoIdFuncionarioDigitador1x1 = component;
    }

    private HelpInline helpInlineIdFuncionarioDigitador1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioDigitador1() {
        return helpInlineIdFuncionarioDigitador1;
    }

    public void setHelpInlineIdFuncionarioDigitador1(HelpInline hi) {
        this.helpInlineIdFuncionarioDigitador1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioDigitador1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioDigitador1x1() {
        return helpInlineIdFuncionarioDigitador1x1;
    }

    public void setHelpInlineIdFuncionarioDigitador1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioDigitador1x1 = hi;
    }

    private StaticText campoIdFuncionarioDigitador1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioDigitador1Texto1() {
        return campoIdFuncionarioDigitador1Texto1;
    }

    public void setCampoIdFuncionarioDigitador1Texto1(StaticText component) {
        this.campoIdFuncionarioDigitador1Texto1 = component;
    }

    private StaticText campoIdFuncionarioDigitador1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioDigitador1x1Texto1() {
        return campoIdFuncionarioDigitador1x1Texto1;
    }

    public void setCampoIdFuncionarioDigitador1x1Texto1(StaticText component) {
        this.campoIdFuncionarioDigitador1x1Texto1 = component;
    }

    private Button campoIdFuncionarioDigitador1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioDigitador1Boton1() {
        return campoIdFuncionarioDigitador1Boton1;
    }

    public void setCampoIdFuncionarioDigitador1Boton1(Button component) {
        this.campoIdFuncionarioDigitador1Boton1 = component;
    }

    private Button campoIdFuncionarioDigitador1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioDigitador1x1Boton1() {
        return campoIdFuncionarioDigitador1x1Boton1;
    }

    public void setCampoIdFuncionarioDigitador1x1Boton1(Button component) {
        this.campoIdFuncionarioDigitador1x1Boton1 = component;
    }

    private Button campoIdFuncionarioDigitador1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioDigitador1Boton3() {
        return campoIdFuncionarioDigitador1Boton3;
    }

    public void setCampoIdFuncionarioDigitador1Boton3(Button component) {
        this.campoIdFuncionarioDigitador1Boton3 = component;
    }

    private Button campoIdFuncionarioDigitador1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioDigitador1x1Boton3() {
        return campoIdFuncionarioDigitador1x1Boton3;
    }

    public void setCampoIdFuncionarioDigitador1x1Boton3(Button component) {
        this.campoIdFuncionarioDigitador1x1Boton3 = component;
    }

    private Label labelIdFuncionarioDigitador2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioDigitador2() {
        return labelIdFuncionarioDigitador2;
    }

    public void setLabelIdFuncionarioDigitador2(Label l) {
        this.labelIdFuncionarioDigitador2 = l;
    }

    private Label labelIdFuncionarioDigitador1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioDigitador1x2() {
        return labelIdFuncionarioDigitador1x2;
    }

    public void setLabelIdFuncionarioDigitador1x2(Label l) {
        this.labelIdFuncionarioDigitador1x2 = l;
    }

    private StaticText campoIdFuncionarioDigitador1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioDigitador1Texto2() {
        return campoIdFuncionarioDigitador1Texto2;
    }

    public void setCampoIdFuncionarioDigitador1Texto2(StaticText component) {
        this.campoIdFuncionarioDigitador1Texto2 = component;
    }

    private StaticText campoIdFuncionarioDigitador1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioDigitador1x1Texto2() {
        return campoIdFuncionarioDigitador1x1Texto2;
    }

    public void setCampoIdFuncionarioDigitador1x1Texto2(StaticText component) {
        this.campoIdFuncionarioDigitador1x1Texto2 = component;
    }

    private Button campoIdFuncionarioDigitador1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioDigitador1Boton2() {
        return campoIdFuncionarioDigitador1Boton2;
    }

    public void setCampoIdFuncionarioDigitador1Boton2(Button component) {
        this.campoIdFuncionarioDigitador1Boton2 = component;
    }

    private Button campoIdFuncionarioDigitador1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioDigitador1x1Boton2() {
        return campoIdFuncionarioDigitador1x1Boton2;
    }

    public void setCampoIdFuncionarioDigitador1x1Boton2(Button component) {
        this.campoIdFuncionarioDigitador1x1Boton2 = component;
    }

    private Label labelObservaciones1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservaciones1() {
        return labelObservaciones1;
    }

    public void setLabelObservaciones1(Label l) {
        this.labelObservaciones1 = l;
    }

    private Label labelObservaciones1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservaciones1x1() {
        return labelObservaciones1x1;
    }

    public void setLabelObservaciones1x1(Label l) {
        this.labelObservaciones1x1 = l;
    }

    private TextArea campoObservaciones1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservaciones1() {
        return campoObservaciones1;
    }

    public void setCampoObservaciones1(TextArea component) {
        this.campoObservaciones1 = component;
    }

    private TextArea campoObservaciones1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoObservaciones1x1() {
        return campoObservaciones1x1;
    }

    public void setCampoObservaciones1x1(TextArea component) {
        this.campoObservaciones1x1 = component;
    }

    private HelpInline helpInlineObservaciones1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservaciones1() {
        return helpInlineObservaciones1;
    }

    public void setHelpInlineObservaciones1(HelpInline hi) {
        this.helpInlineObservaciones1 = hi;
    }

    private HelpInline helpInlineObservaciones1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservaciones1x1() {
        return helpInlineObservaciones1x1;
    }

    public void setHelpInlineObservaciones1x1(HelpInline hi) {
        this.helpInlineObservaciones1x1 = hi;
    }

    private StaticText campoObservaciones1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservaciones1Texto1() {
        return campoObservaciones1Texto1;
    }

    public void setCampoObservaciones1Texto1(StaticText component) {
        this.campoObservaciones1Texto1 = component;
    }

    private StaticText campoObservaciones1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservaciones1x1Texto1() {
        return campoObservaciones1x1Texto1;
    }

    public void setCampoObservaciones1x1Texto1(StaticText component) {
        this.campoObservaciones1x1Texto1 = component;
    }

    private LengthValidator validatorObservaciones1 = new LengthValidator();
  
    public LengthValidator getValidatorObservaciones1() {
        return validatorObservaciones1;
    }
  
    public void setValidatorObservaciones1(LengthValidator validator) {
        this.validatorObservaciones1 = validator;
    }
  
    private Label labelHusoUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelHusoUtm1() {
        return labelHusoUtm1;
    }

    public void setLabelHusoUtm1(Label l) {
        this.labelHusoUtm1 = l;
    }

    private Label labelHusoUtm1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelHusoUtm1x1() {
        return labelHusoUtm1x1;
    }

    public void setLabelHusoUtm1x1(Label l) {
        this.labelHusoUtm1x1 = l;
    }

    private TextField campoHusoUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoHusoUtm1() {
        return campoHusoUtm1;
    }

    public void setCampoHusoUtm1(TextField component) {
        this.campoHusoUtm1 = component;
    }

    private TextField campoHusoUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoHusoUtm1x1() {
        return campoHusoUtm1x1;
    }

    public void setCampoHusoUtm1x1(TextField component) {
        this.campoHusoUtm1x1 = component;
    }

    private HelpInline helpInlineHusoUtm1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineHusoUtm1() {
        return helpInlineHusoUtm1;
    }

    public void setHelpInlineHusoUtm1(HelpInline hi) {
        this.helpInlineHusoUtm1 = hi;
    }

    private HelpInline helpInlineHusoUtm1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineHusoUtm1x1() {
        return helpInlineHusoUtm1x1;
    }

    public void setHelpInlineHusoUtm1x1(HelpInline hi) {
        this.helpInlineHusoUtm1x1 = hi;
    }

    private StaticText campoHusoUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoHusoUtm1Texto1() {
        return campoHusoUtm1Texto1;
    }

    public void setCampoHusoUtm1Texto1(StaticText component) {
        this.campoHusoUtm1Texto1 = component;
    }

    private StaticText campoHusoUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoHusoUtm1x1Texto1() {
        return campoHusoUtm1x1Texto1;
    }

    public void setCampoHusoUtm1x1Texto1(StaticText component) {
        this.campoHusoUtm1x1Texto1 = component;
    }

    private IntegerConverter converterHusoUtm1 = new IntegerConverter();
  
    public IntegerConverter getConverterHusoUtm1() {
        return converterHusoUtm1;
    }
  
    public void setConverterHusoUtm1(IntegerConverter converter) {
        this.converterHusoUtm1 = converter;
    }
  
    private LongRangeValidator validatorHusoUtm1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorHusoUtm1() {
        return validatorHusoUtm1;
    }
  
    public void setValidatorHusoUtm1(LongRangeValidator validator) {
        this.validatorHusoUtm1 = validator;
    }
  
    private Label labelFranjaUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFranjaUtm1() {
        return labelFranjaUtm1;
    }

    public void setLabelFranjaUtm1(Label l) {
        this.labelFranjaUtm1 = l;
    }

    private Label labelFranjaUtm1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFranjaUtm1x1() {
        return labelFranjaUtm1x1;
    }

    public void setLabelFranjaUtm1x1(Label l) {
        this.labelFranjaUtm1x1 = l;
    }

    private TextField campoFranjaUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoFranjaUtm1() {
        return campoFranjaUtm1;
    }

    public void setCampoFranjaUtm1(TextField component) {
        this.campoFranjaUtm1 = component;
    }

    private TextField campoFranjaUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFranjaUtm1x1() {
        return campoFranjaUtm1x1;
    }

    public void setCampoFranjaUtm1x1(TextField component) {
        this.campoFranjaUtm1x1 = component;
    }

    private HelpInline helpInlineFranjaUtm1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFranjaUtm1() {
        return helpInlineFranjaUtm1;
    }

    public void setHelpInlineFranjaUtm1(HelpInline hi) {
        this.helpInlineFranjaUtm1 = hi;
    }

    private HelpInline helpInlineFranjaUtm1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFranjaUtm1x1() {
        return helpInlineFranjaUtm1x1;
    }

    public void setHelpInlineFranjaUtm1x1(HelpInline hi) {
        this.helpInlineFranjaUtm1x1 = hi;
    }

    private StaticText campoFranjaUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFranjaUtm1Texto1() {
        return campoFranjaUtm1Texto1;
    }

    public void setCampoFranjaUtm1Texto1(StaticText component) {
        this.campoFranjaUtm1Texto1 = component;
    }

    private StaticText campoFranjaUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFranjaUtm1x1Texto1() {
        return campoFranjaUtm1x1Texto1;
    }

    public void setCampoFranjaUtm1x1Texto1(StaticText component) {
        this.campoFranjaUtm1x1Texto1 = component;
    }

    private LengthValidator validatorFranjaUtm1 = new LengthValidator();
  
    public LengthValidator getValidatorFranjaUtm1() {
        return validatorFranjaUtm1;
    }
  
    public void setValidatorFranjaUtm1(LengthValidator validator) {
        this.validatorFranjaUtm1 = validator;
    }
  
    private Label labelDistanciaEsteUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistanciaEsteUtm1() {
        return labelDistanciaEsteUtm1;
    }

    public void setLabelDistanciaEsteUtm1(Label l) {
        this.labelDistanciaEsteUtm1 = l;
    }

    private Label labelDistanciaEsteUtm1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistanciaEsteUtm1x1() {
        return labelDistanciaEsteUtm1x1;
    }

    public void setLabelDistanciaEsteUtm1x1(Label l) {
        this.labelDistanciaEsteUtm1x1 = l;
    }

    private TextField campoDistanciaEsteUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoDistanciaEsteUtm1() {
        return campoDistanciaEsteUtm1;
    }

    public void setCampoDistanciaEsteUtm1(TextField component) {
        this.campoDistanciaEsteUtm1 = component;
    }

    private TextField campoDistanciaEsteUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDistanciaEsteUtm1x1() {
        return campoDistanciaEsteUtm1x1;
    }

    public void setCampoDistanciaEsteUtm1x1(TextField component) {
        this.campoDistanciaEsteUtm1x1 = component;
    }

    private HelpInline helpInlineDistanciaEsteUtm1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDistanciaEsteUtm1() {
        return helpInlineDistanciaEsteUtm1;
    }

    public void setHelpInlineDistanciaEsteUtm1(HelpInline hi) {
        this.helpInlineDistanciaEsteUtm1 = hi;
    }

    private HelpInline helpInlineDistanciaEsteUtm1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDistanciaEsteUtm1x1() {
        return helpInlineDistanciaEsteUtm1x1;
    }

    public void setHelpInlineDistanciaEsteUtm1x1(HelpInline hi) {
        this.helpInlineDistanciaEsteUtm1x1 = hi;
    }

    private StaticText campoDistanciaEsteUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaEsteUtm1Texto1() {
        return campoDistanciaEsteUtm1Texto1;
    }

    public void setCampoDistanciaEsteUtm1Texto1(StaticText component) {
        this.campoDistanciaEsteUtm1Texto1 = component;
    }

    private StaticText campoDistanciaEsteUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaEsteUtm1x1Texto1() {
        return campoDistanciaEsteUtm1x1Texto1;
    }

    public void setCampoDistanciaEsteUtm1x1Texto1(StaticText component) {
        this.campoDistanciaEsteUtm1x1Texto1 = component;
    }

    private IntegerConverter converterDistanciaEsteUtm1 = new IntegerConverter();
  
    public IntegerConverter getConverterDistanciaEsteUtm1() {
        return converterDistanciaEsteUtm1;
    }
  
    public void setConverterDistanciaEsteUtm1(IntegerConverter converter) {
        this.converterDistanciaEsteUtm1 = converter;
    }
  
    private LongRangeValidator validatorDistanciaEsteUtm1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorDistanciaEsteUtm1() {
        return validatorDistanciaEsteUtm1;
    }
  
    public void setValidatorDistanciaEsteUtm1(LongRangeValidator validator) {
        this.validatorDistanciaEsteUtm1 = validator;
    }
  
    private Label labelDistanciaNorteUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistanciaNorteUtm1() {
        return labelDistanciaNorteUtm1;
    }

    public void setLabelDistanciaNorteUtm1(Label l) {
        this.labelDistanciaNorteUtm1 = l;
    }

    private Label labelDistanciaNorteUtm1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistanciaNorteUtm1x1() {
        return labelDistanciaNorteUtm1x1;
    }

    public void setLabelDistanciaNorteUtm1x1(Label l) {
        this.labelDistanciaNorteUtm1x1 = l;
    }

    private TextField campoDistanciaNorteUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoDistanciaNorteUtm1() {
        return campoDistanciaNorteUtm1;
    }

    public void setCampoDistanciaNorteUtm1(TextField component) {
        this.campoDistanciaNorteUtm1 = component;
    }

    private TextField campoDistanciaNorteUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDistanciaNorteUtm1x1() {
        return campoDistanciaNorteUtm1x1;
    }

    public void setCampoDistanciaNorteUtm1x1(TextField component) {
        this.campoDistanciaNorteUtm1x1 = component;
    }

    private HelpInline helpInlineDistanciaNorteUtm1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDistanciaNorteUtm1() {
        return helpInlineDistanciaNorteUtm1;
    }

    public void setHelpInlineDistanciaNorteUtm1(HelpInline hi) {
        this.helpInlineDistanciaNorteUtm1 = hi;
    }

    private HelpInline helpInlineDistanciaNorteUtm1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDistanciaNorteUtm1x1() {
        return helpInlineDistanciaNorteUtm1x1;
    }

    public void setHelpInlineDistanciaNorteUtm1x1(HelpInline hi) {
        this.helpInlineDistanciaNorteUtm1x1 = hi;
    }

    private StaticText campoDistanciaNorteUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaNorteUtm1Texto1() {
        return campoDistanciaNorteUtm1Texto1;
    }

    public void setCampoDistanciaNorteUtm1Texto1(StaticText component) {
        this.campoDistanciaNorteUtm1Texto1 = component;
    }

    private StaticText campoDistanciaNorteUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaNorteUtm1x1Texto1() {
        return campoDistanciaNorteUtm1x1Texto1;
    }

    public void setCampoDistanciaNorteUtm1x1Texto1(StaticText component) {
        this.campoDistanciaNorteUtm1x1Texto1 = component;
    }

    private IntegerConverter converterDistanciaNorteUtm1 = new IntegerConverter();
  
    public IntegerConverter getConverterDistanciaNorteUtm1() {
        return converterDistanciaNorteUtm1;
    }
  
    public void setConverterDistanciaNorteUtm1(IntegerConverter converter) {
        this.converterDistanciaNorteUtm1 = converter;
    }
  
    private LongRangeValidator validatorDistanciaNorteUtm1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorDistanciaNorteUtm1() {
        return validatorDistanciaNorteUtm1;
    }
  
    public void setValidatorDistanciaNorteUtm1(LongRangeValidator validator) {
        this.validatorDistanciaNorteUtm1 = validator;
    }
  
    private Label labelNumeroFormulario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroFormulario1() {
        return labelNumeroFormulario1;
    }

    public void setLabelNumeroFormulario1(Label l) {
        this.labelNumeroFormulario1 = l;
    }

    private Label labelNumeroFormulario1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroFormulario1x1() {
        return labelNumeroFormulario1x1;
    }

    public void setLabelNumeroFormulario1x1(Label l) {
        this.labelNumeroFormulario1x1 = l;
    }

    private TextField campoNumeroFormulario1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroFormulario1() {
        return campoNumeroFormulario1;
    }

    public void setCampoNumeroFormulario1(TextField component) {
        this.campoNumeroFormulario1 = component;
    }

    private TextField campoNumeroFormulario1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroFormulario1x1() {
        return campoNumeroFormulario1x1;
    }

    public void setCampoNumeroFormulario1x1(TextField component) {
        this.campoNumeroFormulario1x1 = component;
    }

    private HelpInline helpInlineNumeroFormulario1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroFormulario1() {
        return helpInlineNumeroFormulario1;
    }

    public void setHelpInlineNumeroFormulario1(HelpInline hi) {
        this.helpInlineNumeroFormulario1 = hi;
    }

    private HelpInline helpInlineNumeroFormulario1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroFormulario1x1() {
        return helpInlineNumeroFormulario1x1;
    }

    public void setHelpInlineNumeroFormulario1x1(HelpInline hi) {
        this.helpInlineNumeroFormulario1x1 = hi;
    }

    private StaticText campoNumeroFormulario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroFormulario1Texto1() {
        return campoNumeroFormulario1Texto1;
    }

    public void setCampoNumeroFormulario1Texto1(StaticText component) {
        this.campoNumeroFormulario1Texto1 = component;
    }

    private StaticText campoNumeroFormulario1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroFormulario1x1Texto1() {
        return campoNumeroFormulario1x1Texto1;
    }

    public void setCampoNumeroFormulario1x1Texto1(StaticText component) {
        this.campoNumeroFormulario1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroFormulario1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroFormulario1() {
        return converterNumeroFormulario1;
    }
  
    public void setConverterNumeroFormulario1(IntegerConverter converter) {
        this.converterNumeroFormulario1 = converter;
    }
  
    private LongRangeValidator validatorNumeroFormulario1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroFormulario1() {
        return validatorNumeroFormulario1;
    }
  
    public void setValidatorNumeroFormulario1(LongRangeValidator validator) {
        this.validatorNumeroFormulario1 = validator;
    }
  
    private Label labelNumeroVivienda1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroVivienda1() {
        return labelNumeroVivienda1;
    }

    public void setLabelNumeroVivienda1(Label l) {
        this.labelNumeroVivienda1 = l;
    }

    private Label labelNumeroVivienda1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroVivienda1x1() {
        return labelNumeroVivienda1x1;
    }

    public void setLabelNumeroVivienda1x1(Label l) {
        this.labelNumeroVivienda1x1 = l;
    }

    private TextField campoNumeroVivienda1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroVivienda1() {
        return campoNumeroVivienda1;
    }

    public void setCampoNumeroVivienda1(TextField component) {
        this.campoNumeroVivienda1 = component;
    }

    private TextField campoNumeroVivienda1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroVivienda1x1() {
        return campoNumeroVivienda1x1;
    }

    public void setCampoNumeroVivienda1x1(TextField component) {
        this.campoNumeroVivienda1x1 = component;
    }

    private HelpInline helpInlineNumeroVivienda1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroVivienda1() {
        return helpInlineNumeroVivienda1;
    }

    public void setHelpInlineNumeroVivienda1(HelpInline hi) {
        this.helpInlineNumeroVivienda1 = hi;
    }

    private HelpInline helpInlineNumeroVivienda1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroVivienda1x1() {
        return helpInlineNumeroVivienda1x1;
    }

    public void setHelpInlineNumeroVivienda1x1(HelpInline hi) {
        this.helpInlineNumeroVivienda1x1 = hi;
    }

    private StaticText campoNumeroVivienda1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroVivienda1Texto1() {
        return campoNumeroVivienda1Texto1;
    }

    public void setCampoNumeroVivienda1Texto1(StaticText component) {
        this.campoNumeroVivienda1Texto1 = component;
    }

    private StaticText campoNumeroVivienda1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroVivienda1x1Texto1() {
        return campoNumeroVivienda1x1Texto1;
    }

    public void setCampoNumeroVivienda1x1Texto1(StaticText component) {
        this.campoNumeroVivienda1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroVivienda1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroVivienda1() {
        return converterNumeroVivienda1;
    }
  
    public void setConverterNumeroVivienda1(IntegerConverter converter) {
        this.converterNumeroVivienda1 = converter;
    }
  
    private LongRangeValidator validatorNumeroVivienda1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroVivienda1() {
        return validatorNumeroVivienda1;
    }
  
    public void setValidatorNumeroVivienda1(LongRangeValidator validator) {
        this.validatorNumeroVivienda1 = validator;
    }
  
    private Label labelNumeroHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroHogar1() {
        return labelNumeroHogar1;
    }

    public void setLabelNumeroHogar1(Label l) {
        this.labelNumeroHogar1 = l;
    }

    private Label labelNumeroHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroHogar1x1() {
        return labelNumeroHogar1x1;
    }

    public void setLabelNumeroHogar1x1(Label l) {
        this.labelNumeroHogar1x1 = l;
    }

    private TextField campoNumeroHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroHogar1() {
        return campoNumeroHogar1;
    }

    public void setCampoNumeroHogar1(TextField component) {
        this.campoNumeroHogar1 = component;
    }

    private TextField campoNumeroHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroHogar1x1() {
        return campoNumeroHogar1x1;
    }

    public void setCampoNumeroHogar1x1(TextField component) {
        this.campoNumeroHogar1x1 = component;
    }

    private HelpInline helpInlineNumeroHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroHogar1() {
        return helpInlineNumeroHogar1;
    }

    public void setHelpInlineNumeroHogar1(HelpInline hi) {
        this.helpInlineNumeroHogar1 = hi;
    }

    private HelpInline helpInlineNumeroHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroHogar1x1() {
        return helpInlineNumeroHogar1x1;
    }

    public void setHelpInlineNumeroHogar1x1(HelpInline hi) {
        this.helpInlineNumeroHogar1x1 = hi;
    }

    private StaticText campoNumeroHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroHogar1Texto1() {
        return campoNumeroHogar1Texto1;
    }

    public void setCampoNumeroHogar1Texto1(StaticText component) {
        this.campoNumeroHogar1Texto1 = component;
    }

    private StaticText campoNumeroHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroHogar1x1Texto1() {
        return campoNumeroHogar1x1Texto1;
    }

    public void setCampoNumeroHogar1x1Texto1(StaticText component) {
        this.campoNumeroHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroHogar1() {
        return converterNumeroHogar1;
    }
  
    public void setConverterNumeroHogar1(IntegerConverter converter) {
        this.converterNumeroHogar1 = converter;
    }
  
    private LongRangeValidator validatorNumeroHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroHogar1() {
        return validatorNumeroHogar1;
    }
  
    public void setValidatorNumeroHogar1(LongRangeValidator validator) {
        this.validatorNumeroHogar1 = validator;
    }
  
    private Label labelIdDepartamento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1() {
        return labelIdDepartamento1;
    }

    public void setLabelIdDepartamento1(Label l) {
        this.labelIdDepartamento1 = l;
    }

    private Label labelIdDepartamento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1x1() {
        return labelIdDepartamento1x1;
    }

    public void setLabelIdDepartamento1x1(Label l) {
        this.labelIdDepartamento1x1 = l;
    }

    private TextField campoIdDepartamento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDepartamento1() {
        return campoIdDepartamento1;
    }

    public void setCampoIdDepartamento1(TextField component) {
        this.campoIdDepartamento1 = component;
    }

    private TextField campoIdDepartamento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdDepartamento1x1() {
        return campoIdDepartamento1x1;
    }

    public void setCampoIdDepartamento1x1(TextField component) {
        this.campoIdDepartamento1x1 = component;
    }

    private HelpInline helpInlineIdDepartamento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamento1() {
        return helpInlineIdDepartamento1;
    }

    public void setHelpInlineIdDepartamento1(HelpInline hi) {
        this.helpInlineIdDepartamento1 = hi;
    }

    private HelpInline helpInlineIdDepartamento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamento1x1() {
        return helpInlineIdDepartamento1x1;
    }

    public void setHelpInlineIdDepartamento1x1(HelpInline hi) {
        this.helpInlineIdDepartamento1x1 = hi;
    }

    private StaticText campoIdDepartamento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamento1Texto1() {
        return campoIdDepartamento1Texto1;
    }

    public void setCampoIdDepartamento1Texto1(StaticText component) {
        this.campoIdDepartamento1Texto1 = component;
    }

    private StaticText campoIdDepartamento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamento1x1Texto1() {
        return campoIdDepartamento1x1Texto1;
    }

    public void setCampoIdDepartamento1x1Texto1(StaticText component) {
        this.campoIdDepartamento1x1Texto1 = component;
    }

    private Button campoIdDepartamento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamento1Boton1() {
        return campoIdDepartamento1Boton1;
    }

    public void setCampoIdDepartamento1Boton1(Button component) {
        this.campoIdDepartamento1Boton1 = component;
    }

    private Button campoIdDepartamento1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamento1x1Boton1() {
        return campoIdDepartamento1x1Boton1;
    }

    public void setCampoIdDepartamento1x1Boton1(Button component) {
        this.campoIdDepartamento1x1Boton1 = component;
    }

    private Button campoIdDepartamento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton3() {
        return campoIdDepartamento1Boton3;
    }

    public void setCampoIdDepartamento1Boton3(Button component) {
        this.campoIdDepartamento1Boton3 = component;
    }

    private Button campoIdDepartamento1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1x1Boton3() {
        return campoIdDepartamento1x1Boton3;
    }

    public void setCampoIdDepartamento1x1Boton3(Button component) {
        this.campoIdDepartamento1x1Boton3 = component;
    }

    private Label labelIdDepartamento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento2() {
        return labelIdDepartamento2;
    }

    public void setLabelIdDepartamento2(Label l) {
        this.labelIdDepartamento2 = l;
    }

    private Label labelIdDepartamento1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1x2() {
        return labelIdDepartamento1x2;
    }

    public void setLabelIdDepartamento1x2(Label l) {
        this.labelIdDepartamento1x2 = l;
    }

    private StaticText campoIdDepartamento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamento1Texto2() {
        return campoIdDepartamento1Texto2;
    }

    public void setCampoIdDepartamento1Texto2(StaticText component) {
        this.campoIdDepartamento1Texto2 = component;
    }

    private StaticText campoIdDepartamento1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamento1x1Texto2() {
        return campoIdDepartamento1x1Texto2;
    }

    public void setCampoIdDepartamento1x1Texto2(StaticText component) {
        this.campoIdDepartamento1x1Texto2 = component;
    }

    private Button campoIdDepartamento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton2() {
        return campoIdDepartamento1Boton2;
    }

    public void setCampoIdDepartamento1Boton2(Button component) {
        this.campoIdDepartamento1Boton2 = component;
    }

    private Button campoIdDepartamento1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1x1Boton2() {
        return campoIdDepartamento1x1Boton2;
    }

    public void setCampoIdDepartamento1x1Boton2(Button component) {
        this.campoIdDepartamento1x1Boton2 = component;
    }

    private Label labelIdDistrito1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1() {
        return labelIdDistrito1;
    }

    public void setLabelIdDistrito1(Label l) {
        this.labelIdDistrito1 = l;
    }

    private Label labelIdDistrito1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1x1() {
        return labelIdDistrito1x1;
    }

    public void setLabelIdDistrito1x1(Label l) {
        this.labelIdDistrito1x1 = l;
    }

    private TextField campoIdDistrito1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDistrito1() {
        return campoIdDistrito1;
    }

    public void setCampoIdDistrito1(TextField component) {
        this.campoIdDistrito1 = component;
    }

    private TextField campoIdDistrito1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdDistrito1x1() {
        return campoIdDistrito1x1;
    }

    public void setCampoIdDistrito1x1(TextField component) {
        this.campoIdDistrito1x1 = component;
    }

    private HelpInline helpInlineIdDistrito1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistrito1() {
        return helpInlineIdDistrito1;
    }

    public void setHelpInlineIdDistrito1(HelpInline hi) {
        this.helpInlineIdDistrito1 = hi;
    }

    private HelpInline helpInlineIdDistrito1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistrito1x1() {
        return helpInlineIdDistrito1x1;
    }

    public void setHelpInlineIdDistrito1x1(HelpInline hi) {
        this.helpInlineIdDistrito1x1 = hi;
    }

    private StaticText campoIdDistrito1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistrito1Texto1() {
        return campoIdDistrito1Texto1;
    }

    public void setCampoIdDistrito1Texto1(StaticText component) {
        this.campoIdDistrito1Texto1 = component;
    }

    private StaticText campoIdDistrito1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistrito1x1Texto1() {
        return campoIdDistrito1x1Texto1;
    }

    public void setCampoIdDistrito1x1Texto1(StaticText component) {
        this.campoIdDistrito1x1Texto1 = component;
    }

    private Button campoIdDistrito1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistrito1Boton1() {
        return campoIdDistrito1Boton1;
    }

    public void setCampoIdDistrito1Boton1(Button component) {
        this.campoIdDistrito1Boton1 = component;
    }

    private Button campoIdDistrito1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistrito1x1Boton1() {
        return campoIdDistrito1x1Boton1;
    }

    public void setCampoIdDistrito1x1Boton1(Button component) {
        this.campoIdDistrito1x1Boton1 = component;
    }

    private Button campoIdDistrito1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton3() {
        return campoIdDistrito1Boton3;
    }

    public void setCampoIdDistrito1Boton3(Button component) {
        this.campoIdDistrito1Boton3 = component;
    }

    private Button campoIdDistrito1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1x1Boton3() {
        return campoIdDistrito1x1Boton3;
    }

    public void setCampoIdDistrito1x1Boton3(Button component) {
        this.campoIdDistrito1x1Boton3 = component;
    }

    private Label labelIdDistrito2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito2() {
        return labelIdDistrito2;
    }

    public void setLabelIdDistrito2(Label l) {
        this.labelIdDistrito2 = l;
    }

    private Label labelIdDistrito1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1x2() {
        return labelIdDistrito1x2;
    }

    public void setLabelIdDistrito1x2(Label l) {
        this.labelIdDistrito1x2 = l;
    }

    private StaticText campoIdDistrito1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistrito1Texto2() {
        return campoIdDistrito1Texto2;
    }

    public void setCampoIdDistrito1Texto2(StaticText component) {
        this.campoIdDistrito1Texto2 = component;
    }

    private StaticText campoIdDistrito1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistrito1x1Texto2() {
        return campoIdDistrito1x1Texto2;
    }

    public void setCampoIdDistrito1x1Texto2(StaticText component) {
        this.campoIdDistrito1x1Texto2 = component;
    }

    private Button campoIdDistrito1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton2() {
        return campoIdDistrito1Boton2;
    }

    public void setCampoIdDistrito1Boton2(Button component) {
        this.campoIdDistrito1Boton2 = component;
    }

    private Button campoIdDistrito1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1x1Boton2() {
        return campoIdDistrito1x1Boton2;
    }

    public void setCampoIdDistrito1x1Boton2(Button component) {
        this.campoIdDistrito1x1Boton2 = component;
    }

    private Label labelNumeroTipoArea1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArea1() {
        return labelNumeroTipoArea1;
    }

    public void setLabelNumeroTipoArea1(Label l) {
        this.labelNumeroTipoArea1 = l;
    }

    private Label labelNumeroTipoArea1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArea1x1() {
        return labelNumeroTipoArea1x1;
    }

    public void setLabelNumeroTipoArea1x1(Label l) {
        this.labelNumeroTipoArea1x1 = l;
    }

    private DropDown listaNumeroTipoArea1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoArea1() {
        return listaNumeroTipoArea1;
    }

    public void setListaNumeroTipoArea1(DropDown component) {
        this.listaNumeroTipoArea1 = component;
    }

    private DropDown listaNumeroTipoArea1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoArea1x1() {
        return listaNumeroTipoArea1x1;
    }

    public void setListaNumeroTipoArea1x1(DropDown component) {
        this.listaNumeroTipoArea1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoArea1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoArea1() {
        return helpInlineNumeroTipoArea1;
    }

    public void setHelpInlineNumeroTipoArea1(HelpInline hi) {
        this.helpInlineNumeroTipoArea1 = hi;
    }

    private HelpInline helpInlineNumeroTipoArea1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoArea1x1() {
        return helpInlineNumeroTipoArea1x1;
    }

    public void setHelpInlineNumeroTipoArea1x1(HelpInline hi) {
        this.helpInlineNumeroTipoArea1x1 = hi;
    }

    private StaticText listaNumeroTipoArea1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArea1Texto1() {
        return listaNumeroTipoArea1Texto1;
    }

    public void setListaNumeroTipoArea1Texto1(StaticText component) {
        this.listaNumeroTipoArea1Texto1 = component;
    }

    private StaticText listaNumeroTipoArea1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArea1x1Texto1() {
        return listaNumeroTipoArea1x1Texto1;
    }

    public void setListaNumeroTipoArea1x1Texto1(StaticText component) {
        this.listaNumeroTipoArea1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoArea1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoArea1() {
        return converterNumeroTipoArea1;
    }
  
    public void setConverterNumeroTipoArea1(IntegerConverter converter) {
        this.converterNumeroTipoArea1 = converter;
    }
  
    private Label labelIdBarrio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1() {
        return labelIdBarrio1;
    }

    public void setLabelIdBarrio1(Label l) {
        this.labelIdBarrio1 = l;
    }

    private Label labelIdBarrio1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1x1() {
        return labelIdBarrio1x1;
    }

    public void setLabelIdBarrio1x1(Label l) {
        this.labelIdBarrio1x1 = l;
    }

    private TextField campoIdBarrio1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdBarrio1() {
        return campoIdBarrio1;
    }

    public void setCampoIdBarrio1(TextField component) {
        this.campoIdBarrio1 = component;
    }

    private TextField campoIdBarrio1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdBarrio1x1() {
        return campoIdBarrio1x1;
    }

    public void setCampoIdBarrio1x1(TextField component) {
        this.campoIdBarrio1x1 = component;
    }

    private HelpInline helpInlineIdBarrio1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdBarrio1() {
        return helpInlineIdBarrio1;
    }

    public void setHelpInlineIdBarrio1(HelpInline hi) {
        this.helpInlineIdBarrio1 = hi;
    }

    private HelpInline helpInlineIdBarrio1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdBarrio1x1() {
        return helpInlineIdBarrio1x1;
    }

    public void setHelpInlineIdBarrio1x1(HelpInline hi) {
        this.helpInlineIdBarrio1x1 = hi;
    }

    private StaticText campoIdBarrio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdBarrio1Texto1() {
        return campoIdBarrio1Texto1;
    }

    public void setCampoIdBarrio1Texto1(StaticText component) {
        this.campoIdBarrio1Texto1 = component;
    }

    private StaticText campoIdBarrio1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdBarrio1x1Texto1() {
        return campoIdBarrio1x1Texto1;
    }

    public void setCampoIdBarrio1x1Texto1(StaticText component) {
        this.campoIdBarrio1x1Texto1 = component;
    }

    private Button campoIdBarrio1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdBarrio1Boton1() {
        return campoIdBarrio1Boton1;
    }

    public void setCampoIdBarrio1Boton1(Button component) {
        this.campoIdBarrio1Boton1 = component;
    }

    private Button campoIdBarrio1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdBarrio1x1Boton1() {
        return campoIdBarrio1x1Boton1;
    }

    public void setCampoIdBarrio1x1Boton1(Button component) {
        this.campoIdBarrio1x1Boton1 = component;
    }

    private Button campoIdBarrio1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton3() {
        return campoIdBarrio1Boton3;
    }

    public void setCampoIdBarrio1Boton3(Button component) {
        this.campoIdBarrio1Boton3 = component;
    }

    private Button campoIdBarrio1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1x1Boton3() {
        return campoIdBarrio1x1Boton3;
    }

    public void setCampoIdBarrio1x1Boton3(Button component) {
        this.campoIdBarrio1x1Boton3 = component;
    }

    private Label labelIdBarrio2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio2() {
        return labelIdBarrio2;
    }

    public void setLabelIdBarrio2(Label l) {
        this.labelIdBarrio2 = l;
    }

    private Label labelIdBarrio1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1x2() {
        return labelIdBarrio1x2;
    }

    public void setLabelIdBarrio1x2(Label l) {
        this.labelIdBarrio1x2 = l;
    }

    private StaticText campoIdBarrio1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdBarrio1Texto2() {
        return campoIdBarrio1Texto2;
    }

    public void setCampoIdBarrio1Texto2(StaticText component) {
        this.campoIdBarrio1Texto2 = component;
    }

    private StaticText campoIdBarrio1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdBarrio1x1Texto2() {
        return campoIdBarrio1x1Texto2;
    }

    public void setCampoIdBarrio1x1Texto2(StaticText component) {
        this.campoIdBarrio1x1Texto2 = component;
    }

    private Button campoIdBarrio1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton2() {
        return campoIdBarrio1Boton2;
    }

    public void setCampoIdBarrio1Boton2(Button component) {
        this.campoIdBarrio1Boton2 = component;
    }

    private Button campoIdBarrio1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1x1Boton2() {
        return campoIdBarrio1x1Boton2;
    }

    public void setCampoIdBarrio1x1Boton2(Button component) {
        this.campoIdBarrio1x1Boton2 = component;
    }

    private Label labelManzana1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelManzana1() {
        return labelManzana1;
    }

    public void setLabelManzana1(Label l) {
        this.labelManzana1 = l;
    }

    private Label labelManzana1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelManzana1x1() {
        return labelManzana1x1;
    }

    public void setLabelManzana1x1(Label l) {
        this.labelManzana1x1 = l;
    }

    private TextField campoManzana1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoManzana1() {
        return campoManzana1;
    }

    public void setCampoManzana1(TextField component) {
        this.campoManzana1 = component;
    }

    private TextField campoManzana1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoManzana1x1() {
        return campoManzana1x1;
    }

    public void setCampoManzana1x1(TextField component) {
        this.campoManzana1x1 = component;
    }

    private HelpInline helpInlineManzana1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineManzana1() {
        return helpInlineManzana1;
    }

    public void setHelpInlineManzana1(HelpInline hi) {
        this.helpInlineManzana1 = hi;
    }

    private HelpInline helpInlineManzana1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineManzana1x1() {
        return helpInlineManzana1x1;
    }

    public void setHelpInlineManzana1x1(HelpInline hi) {
        this.helpInlineManzana1x1 = hi;
    }

    private StaticText campoManzana1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoManzana1Texto1() {
        return campoManzana1Texto1;
    }

    public void setCampoManzana1Texto1(StaticText component) {
        this.campoManzana1Texto1 = component;
    }

    private StaticText campoManzana1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoManzana1x1Texto1() {
        return campoManzana1x1Texto1;
    }

    public void setCampoManzana1x1Texto1(StaticText component) {
        this.campoManzana1x1Texto1 = component;
    }

    private LengthValidator validatorManzana1 = new LengthValidator();
  
    public LengthValidator getValidatorManzana1() {
        return validatorManzana1;
    }
  
    public void setValidatorManzana1(LengthValidator validator) {
        this.validatorManzana1 = validator;
    }
  
    private Label labelDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1() {
        return labelDireccion1;
    }

    public void setLabelDireccion1(Label l) {
        this.labelDireccion1 = l;
    }

    private Label labelDireccion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1x1() {
        return labelDireccion1x1;
    }

    public void setLabelDireccion1x1(Label l) {
        this.labelDireccion1x1 = l;
    }

    private TextArea campoDireccion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDireccion1() {
        return campoDireccion1;
    }

    public void setCampoDireccion1(TextArea component) {
        this.campoDireccion1 = component;
    }

    private TextArea campoDireccion1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoDireccion1x1() {
        return campoDireccion1x1;
    }

    public void setCampoDireccion1x1(TextArea component) {
        this.campoDireccion1x1 = component;
    }

    private HelpInline helpInlineDireccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDireccion1() {
        return helpInlineDireccion1;
    }

    public void setHelpInlineDireccion1(HelpInline hi) {
        this.helpInlineDireccion1 = hi;
    }

    private HelpInline helpInlineDireccion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDireccion1x1() {
        return helpInlineDireccion1x1;
    }

    public void setHelpInlineDireccion1x1(HelpInline hi) {
        this.helpInlineDireccion1x1 = hi;
    }

    private StaticText campoDireccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDireccion1Texto1() {
        return campoDireccion1Texto1;
    }

    public void setCampoDireccion1Texto1(StaticText component) {
        this.campoDireccion1Texto1 = component;
    }

    private StaticText campoDireccion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDireccion1x1Texto1() {
        return campoDireccion1x1Texto1;
    }

    public void setCampoDireccion1x1Texto1(StaticText component) {
        this.campoDireccion1x1Texto1 = component;
    }

    private LengthValidator validatorDireccion1 = new LengthValidator();
  
    public LengthValidator getValidatorDireccion1() {
        return validatorDireccion1;
    }
  
    public void setValidatorDireccion1(LengthValidator validator) {
        this.validatorDireccion1 = validator;
    }
  
    private Label labelTotalPersonas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalPersonas1() {
        return labelTotalPersonas1;
    }

    public void setLabelTotalPersonas1(Label l) {
        this.labelTotalPersonas1 = l;
    }

    private Label labelTotalPersonas1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalPersonas1x1() {
        return labelTotalPersonas1x1;
    }

    public void setLabelTotalPersonas1x1(Label l) {
        this.labelTotalPersonas1x1 = l;
    }

    private TextField campoTotalPersonas1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalPersonas1() {
        return campoTotalPersonas1;
    }

    public void setCampoTotalPersonas1(TextField component) {
        this.campoTotalPersonas1 = component;
    }

    private TextField campoTotalPersonas1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalPersonas1x1() {
        return campoTotalPersonas1x1;
    }

    public void setCampoTotalPersonas1x1(TextField component) {
        this.campoTotalPersonas1x1 = component;
    }

    private HelpInline helpInlineTotalPersonas1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalPersonas1() {
        return helpInlineTotalPersonas1;
    }

    public void setHelpInlineTotalPersonas1(HelpInline hi) {
        this.helpInlineTotalPersonas1 = hi;
    }

    private HelpInline helpInlineTotalPersonas1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalPersonas1x1() {
        return helpInlineTotalPersonas1x1;
    }

    public void setHelpInlineTotalPersonas1x1(HelpInline hi) {
        this.helpInlineTotalPersonas1x1 = hi;
    }

    private StaticText campoTotalPersonas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalPersonas1Texto1() {
        return campoTotalPersonas1Texto1;
    }

    public void setCampoTotalPersonas1Texto1(StaticText component) {
        this.campoTotalPersonas1Texto1 = component;
    }

    private StaticText campoTotalPersonas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalPersonas1x1Texto1() {
        return campoTotalPersonas1x1Texto1;
    }

    public void setCampoTotalPersonas1x1Texto1(StaticText component) {
        this.campoTotalPersonas1x1Texto1 = component;
    }

    private IntegerConverter converterTotalPersonas1 = new IntegerConverter();
  
    public IntegerConverter getConverterTotalPersonas1() {
        return converterTotalPersonas1;
    }
  
    public void setConverterTotalPersonas1(IntegerConverter converter) {
        this.converterTotalPersonas1 = converter;
    }
  
    private LongRangeValidator validatorTotalPersonas1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorTotalPersonas1() {
        return validatorTotalPersonas1;
    }
  
    public void setValidatorTotalPersonas1(LongRangeValidator validator) {
        this.validatorTotalPersonas1 = validator;
    }
  
    private Label labelTotalHombres1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalHombres1() {
        return labelTotalHombres1;
    }

    public void setLabelTotalHombres1(Label l) {
        this.labelTotalHombres1 = l;
    }

    private Label labelTotalHombres1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalHombres1x1() {
        return labelTotalHombres1x1;
    }

    public void setLabelTotalHombres1x1(Label l) {
        this.labelTotalHombres1x1 = l;
    }

    private TextField campoTotalHombres1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalHombres1() {
        return campoTotalHombres1;
    }

    public void setCampoTotalHombres1(TextField component) {
        this.campoTotalHombres1 = component;
    }

    private TextField campoTotalHombres1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalHombres1x1() {
        return campoTotalHombres1x1;
    }

    public void setCampoTotalHombres1x1(TextField component) {
        this.campoTotalHombres1x1 = component;
    }

    private HelpInline helpInlineTotalHombres1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalHombres1() {
        return helpInlineTotalHombres1;
    }

    public void setHelpInlineTotalHombres1(HelpInline hi) {
        this.helpInlineTotalHombres1 = hi;
    }

    private HelpInline helpInlineTotalHombres1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalHombres1x1() {
        return helpInlineTotalHombres1x1;
    }

    public void setHelpInlineTotalHombres1x1(HelpInline hi) {
        this.helpInlineTotalHombres1x1 = hi;
    }

    private StaticText campoTotalHombres1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalHombres1Texto1() {
        return campoTotalHombres1Texto1;
    }

    public void setCampoTotalHombres1Texto1(StaticText component) {
        this.campoTotalHombres1Texto1 = component;
    }

    private StaticText campoTotalHombres1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalHombres1x1Texto1() {
        return campoTotalHombres1x1Texto1;
    }

    public void setCampoTotalHombres1x1Texto1(StaticText component) {
        this.campoTotalHombres1x1Texto1 = component;
    }

    private IntegerConverter converterTotalHombres1 = new IntegerConverter();
  
    public IntegerConverter getConverterTotalHombres1() {
        return converterTotalHombres1;
    }
  
    public void setConverterTotalHombres1(IntegerConverter converter) {
        this.converterTotalHombres1 = converter;
    }
  
    private LongRangeValidator validatorTotalHombres1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorTotalHombres1() {
        return validatorTotalHombres1;
    }
  
    public void setValidatorTotalHombres1(LongRangeValidator validator) {
        this.validatorTotalHombres1 = validator;
    }
  
    private Label labelTotalMujeres1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalMujeres1() {
        return labelTotalMujeres1;
    }

    public void setLabelTotalMujeres1(Label l) {
        this.labelTotalMujeres1 = l;
    }

    private Label labelTotalMujeres1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalMujeres1x1() {
        return labelTotalMujeres1x1;
    }

    public void setLabelTotalMujeres1x1(Label l) {
        this.labelTotalMujeres1x1 = l;
    }

    private TextField campoTotalMujeres1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalMujeres1() {
        return campoTotalMujeres1;
    }

    public void setCampoTotalMujeres1(TextField component) {
        this.campoTotalMujeres1 = component;
    }

    private TextField campoTotalMujeres1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalMujeres1x1() {
        return campoTotalMujeres1x1;
    }

    public void setCampoTotalMujeres1x1(TextField component) {
        this.campoTotalMujeres1x1 = component;
    }

    private HelpInline helpInlineTotalMujeres1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalMujeres1() {
        return helpInlineTotalMujeres1;
    }

    public void setHelpInlineTotalMujeres1(HelpInline hi) {
        this.helpInlineTotalMujeres1 = hi;
    }

    private HelpInline helpInlineTotalMujeres1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalMujeres1x1() {
        return helpInlineTotalMujeres1x1;
    }

    public void setHelpInlineTotalMujeres1x1(HelpInline hi) {
        this.helpInlineTotalMujeres1x1 = hi;
    }

    private StaticText campoTotalMujeres1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalMujeres1Texto1() {
        return campoTotalMujeres1Texto1;
    }

    public void setCampoTotalMujeres1Texto1(StaticText component) {
        this.campoTotalMujeres1Texto1 = component;
    }

    private StaticText campoTotalMujeres1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalMujeres1x1Texto1() {
        return campoTotalMujeres1x1Texto1;
    }

    public void setCampoTotalMujeres1x1Texto1(StaticText component) {
        this.campoTotalMujeres1x1Texto1 = component;
    }

    private IntegerConverter converterTotalMujeres1 = new IntegerConverter();
  
    public IntegerConverter getConverterTotalMujeres1() {
        return converterTotalMujeres1;
    }
  
    public void setConverterTotalMujeres1(IntegerConverter converter) {
        this.converterTotalMujeres1 = converter;
    }
  
    private LongRangeValidator validatorTotalMujeres1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorTotalMujeres1() {
        return validatorTotalMujeres1;
    }
  
    public void setValidatorTotalMujeres1(LongRangeValidator validator) {
        this.validatorTotalMujeres1 = validator;
    }
  
    private Label labelNumeroTipoMatParedes1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatParedes1() {
        return labelNumeroTipoMatParedes1;
    }

    public void setLabelNumeroTipoMatParedes1(Label l) {
        this.labelNumeroTipoMatParedes1 = l;
    }

    private Label labelNumeroTipoMatParedes1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatParedes1x1() {
        return labelNumeroTipoMatParedes1x1;
    }

    public void setLabelNumeroTipoMatParedes1x1(Label l) {
        this.labelNumeroTipoMatParedes1x1 = l;
    }

    private DropDown listaNumeroTipoMatParedes1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoMatParedes1() {
        return listaNumeroTipoMatParedes1;
    }

    public void setListaNumeroTipoMatParedes1(DropDown component) {
        this.listaNumeroTipoMatParedes1 = component;
    }

    private DropDown listaNumeroTipoMatParedes1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoMatParedes1x1() {
        return listaNumeroTipoMatParedes1x1;
    }

    public void setListaNumeroTipoMatParedes1x1(DropDown component) {
        this.listaNumeroTipoMatParedes1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoMatParedes1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoMatParedes1() {
        return helpInlineNumeroTipoMatParedes1;
    }

    public void setHelpInlineNumeroTipoMatParedes1(HelpInline hi) {
        this.helpInlineNumeroTipoMatParedes1 = hi;
    }

    private HelpInline helpInlineNumeroTipoMatParedes1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoMatParedes1x1() {
        return helpInlineNumeroTipoMatParedes1x1;
    }

    public void setHelpInlineNumeroTipoMatParedes1x1(HelpInline hi) {
        this.helpInlineNumeroTipoMatParedes1x1 = hi;
    }

    private StaticText listaNumeroTipoMatParedes1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatParedes1Texto1() {
        return listaNumeroTipoMatParedes1Texto1;
    }

    public void setListaNumeroTipoMatParedes1Texto1(StaticText component) {
        this.listaNumeroTipoMatParedes1Texto1 = component;
    }

    private StaticText listaNumeroTipoMatParedes1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatParedes1x1Texto1() {
        return listaNumeroTipoMatParedes1x1Texto1;
    }

    public void setListaNumeroTipoMatParedes1x1Texto1(StaticText component) {
        this.listaNumeroTipoMatParedes1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoMatParedes1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoMatParedes1() {
        return converterNumeroTipoMatParedes1;
    }
  
    public void setConverterNumeroTipoMatParedes1(IntegerConverter converter) {
        this.converterNumeroTipoMatParedes1 = converter;
    }
  
    private Label labelNumeroTipoMatPiso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatPiso1() {
        return labelNumeroTipoMatPiso1;
    }

    public void setLabelNumeroTipoMatPiso1(Label l) {
        this.labelNumeroTipoMatPiso1 = l;
    }

    private Label labelNumeroTipoMatPiso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatPiso1x1() {
        return labelNumeroTipoMatPiso1x1;
    }

    public void setLabelNumeroTipoMatPiso1x1(Label l) {
        this.labelNumeroTipoMatPiso1x1 = l;
    }

    private DropDown listaNumeroTipoMatPiso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoMatPiso1() {
        return listaNumeroTipoMatPiso1;
    }

    public void setListaNumeroTipoMatPiso1(DropDown component) {
        this.listaNumeroTipoMatPiso1 = component;
    }

    private DropDown listaNumeroTipoMatPiso1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoMatPiso1x1() {
        return listaNumeroTipoMatPiso1x1;
    }

    public void setListaNumeroTipoMatPiso1x1(DropDown component) {
        this.listaNumeroTipoMatPiso1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoMatPiso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoMatPiso1() {
        return helpInlineNumeroTipoMatPiso1;
    }

    public void setHelpInlineNumeroTipoMatPiso1(HelpInline hi) {
        this.helpInlineNumeroTipoMatPiso1 = hi;
    }

    private HelpInline helpInlineNumeroTipoMatPiso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoMatPiso1x1() {
        return helpInlineNumeroTipoMatPiso1x1;
    }

    public void setHelpInlineNumeroTipoMatPiso1x1(HelpInline hi) {
        this.helpInlineNumeroTipoMatPiso1x1 = hi;
    }

    private StaticText listaNumeroTipoMatPiso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatPiso1Texto1() {
        return listaNumeroTipoMatPiso1Texto1;
    }

    public void setListaNumeroTipoMatPiso1Texto1(StaticText component) {
        this.listaNumeroTipoMatPiso1Texto1 = component;
    }

    private StaticText listaNumeroTipoMatPiso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatPiso1x1Texto1() {
        return listaNumeroTipoMatPiso1x1Texto1;
    }

    public void setListaNumeroTipoMatPiso1x1Texto1(StaticText component) {
        this.listaNumeroTipoMatPiso1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoMatPiso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoMatPiso1() {
        return converterNumeroTipoMatPiso1;
    }
  
    public void setConverterNumeroTipoMatPiso1(IntegerConverter converter) {
        this.converterNumeroTipoMatPiso1 = converter;
    }
  
    private Label labelNumeroTipoMatTecho1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatTecho1() {
        return labelNumeroTipoMatTecho1;
    }

    public void setLabelNumeroTipoMatTecho1(Label l) {
        this.labelNumeroTipoMatTecho1 = l;
    }

    private Label labelNumeroTipoMatTecho1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatTecho1x1() {
        return labelNumeroTipoMatTecho1x1;
    }

    public void setLabelNumeroTipoMatTecho1x1(Label l) {
        this.labelNumeroTipoMatTecho1x1 = l;
    }

    private DropDown listaNumeroTipoMatTecho1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoMatTecho1() {
        return listaNumeroTipoMatTecho1;
    }

    public void setListaNumeroTipoMatTecho1(DropDown component) {
        this.listaNumeroTipoMatTecho1 = component;
    }

    private DropDown listaNumeroTipoMatTecho1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoMatTecho1x1() {
        return listaNumeroTipoMatTecho1x1;
    }

    public void setListaNumeroTipoMatTecho1x1(DropDown component) {
        this.listaNumeroTipoMatTecho1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoMatTecho1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoMatTecho1() {
        return helpInlineNumeroTipoMatTecho1;
    }

    public void setHelpInlineNumeroTipoMatTecho1(HelpInline hi) {
        this.helpInlineNumeroTipoMatTecho1 = hi;
    }

    private HelpInline helpInlineNumeroTipoMatTecho1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoMatTecho1x1() {
        return helpInlineNumeroTipoMatTecho1x1;
    }

    public void setHelpInlineNumeroTipoMatTecho1x1(HelpInline hi) {
        this.helpInlineNumeroTipoMatTecho1x1 = hi;
    }

    private StaticText listaNumeroTipoMatTecho1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatTecho1Texto1() {
        return listaNumeroTipoMatTecho1Texto1;
    }

    public void setListaNumeroTipoMatTecho1Texto1(StaticText component) {
        this.listaNumeroTipoMatTecho1Texto1 = component;
    }

    private StaticText listaNumeroTipoMatTecho1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatTecho1x1Texto1() {
        return listaNumeroTipoMatTecho1x1Texto1;
    }

    public void setListaNumeroTipoMatTecho1x1Texto1(StaticText component) {
        this.listaNumeroTipoMatTecho1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoMatTecho1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoMatTecho1() {
        return converterNumeroTipoMatTecho1;
    }
  
    public void setConverterNumeroTipoMatTecho1(IntegerConverter converter) {
        this.converterNumeroTipoMatTecho1 = converter;
    }
  
    private Label labelNumeroTipoOcupacionViv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoOcupacionViv1() {
        return labelNumeroTipoOcupacionViv1;
    }

    public void setLabelNumeroTipoOcupacionViv1(Label l) {
        this.labelNumeroTipoOcupacionViv1 = l;
    }

    private Label labelNumeroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoOcupacionViv1x1() {
        return labelNumeroTipoOcupacionViv1x1;
    }

    public void setLabelNumeroTipoOcupacionViv1x1(Label l) {
        this.labelNumeroTipoOcupacionViv1x1 = l;
    }

    private DropDown listaNumeroTipoOcupacionViv1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoOcupacionViv1() {
        return listaNumeroTipoOcupacionViv1;
    }

    public void setListaNumeroTipoOcupacionViv1(DropDown component) {
        this.listaNumeroTipoOcupacionViv1 = component;
    }

    private DropDown listaNumeroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoOcupacionViv1x1() {
        return listaNumeroTipoOcupacionViv1x1;
    }

    public void setListaNumeroTipoOcupacionViv1x1(DropDown component) {
        this.listaNumeroTipoOcupacionViv1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoOcupacionViv1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoOcupacionViv1() {
        return helpInlineNumeroTipoOcupacionViv1;
    }

    public void setHelpInlineNumeroTipoOcupacionViv1(HelpInline hi) {
        this.helpInlineNumeroTipoOcupacionViv1 = hi;
    }

    private HelpInline helpInlineNumeroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoOcupacionViv1x1() {
        return helpInlineNumeroTipoOcupacionViv1x1;
    }

    public void setHelpInlineNumeroTipoOcupacionViv1x1(HelpInline hi) {
        this.helpInlineNumeroTipoOcupacionViv1x1 = hi;
    }

    private StaticText listaNumeroTipoOcupacionViv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoOcupacionViv1Texto1() {
        return listaNumeroTipoOcupacionViv1Texto1;
    }

    public void setListaNumeroTipoOcupacionViv1Texto1(StaticText component) {
        this.listaNumeroTipoOcupacionViv1Texto1 = component;
    }

    private StaticText listaNumeroTipoOcupacionViv1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoOcupacionViv1x1Texto1() {
        return listaNumeroTipoOcupacionViv1x1Texto1;
    }

    public void setListaNumeroTipoOcupacionViv1x1Texto1(StaticText component) {
        this.listaNumeroTipoOcupacionViv1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoOcupacionViv1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoOcupacionViv1() {
        return converterNumeroTipoOcupacionViv1;
    }
  
    public void setConverterNumeroTipoOcupacionViv1(IntegerConverter converter) {
        this.converterNumeroTipoOcupacionViv1 = converter;
    }
  
    private Label labelOtroTipoOcupacionViv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroTipoOcupacionViv1() {
        return labelOtroTipoOcupacionViv1;
    }

    public void setLabelOtroTipoOcupacionViv1(Label l) {
        this.labelOtroTipoOcupacionViv1 = l;
    }

    private Label labelOtroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroTipoOcupacionViv1x1() {
        return labelOtroTipoOcupacionViv1x1;
    }

    public void setLabelOtroTipoOcupacionViv1x1(Label l) {
        this.labelOtroTipoOcupacionViv1x1 = l;
    }

    private TextField campoOtroTipoOcupacionViv1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtroTipoOcupacionViv1() {
        return campoOtroTipoOcupacionViv1;
    }

    public void setCampoOtroTipoOcupacionViv1(TextField component) {
        this.campoOtroTipoOcupacionViv1 = component;
    }

    private TextField campoOtroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtroTipoOcupacionViv1x1() {
        return campoOtroTipoOcupacionViv1x1;
    }

    public void setCampoOtroTipoOcupacionViv1x1(TextField component) {
        this.campoOtroTipoOcupacionViv1x1 = component;
    }

    private HelpInline helpInlineOtroTipoOcupacionViv1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroTipoOcupacionViv1() {
        return helpInlineOtroTipoOcupacionViv1;
    }

    public void setHelpInlineOtroTipoOcupacionViv1(HelpInline hi) {
        this.helpInlineOtroTipoOcupacionViv1 = hi;
    }

    private HelpInline helpInlineOtroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroTipoOcupacionViv1x1() {
        return helpInlineOtroTipoOcupacionViv1x1;
    }

    public void setHelpInlineOtroTipoOcupacionViv1x1(HelpInline hi) {
        this.helpInlineOtroTipoOcupacionViv1x1 = hi;
    }

    private StaticText campoOtroTipoOcupacionViv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroTipoOcupacionViv1Texto1() {
        return campoOtroTipoOcupacionViv1Texto1;
    }

    public void setCampoOtroTipoOcupacionViv1Texto1(StaticText component) {
        this.campoOtroTipoOcupacionViv1Texto1 = component;
    }

    private StaticText campoOtroTipoOcupacionViv1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroTipoOcupacionViv1x1Texto1() {
        return campoOtroTipoOcupacionViv1x1Texto1;
    }

    public void setCampoOtroTipoOcupacionViv1x1Texto1(StaticText component) {
        this.campoOtroTipoOcupacionViv1x1Texto1 = component;
    }

    private LengthValidator validatorOtroTipoOcupacionViv1 = new LengthValidator();
  
    public LengthValidator getValidatorOtroTipoOcupacionViv1() {
        return validatorOtroTipoOcupacionViv1;
    }
  
    public void setValidatorOtroTipoOcupacionViv1(LengthValidator validator) {
        this.validatorOtroTipoOcupacionViv1 = validator;
    }
  
    private Label labelCantidadPiezas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCantidadPiezas1() {
        return labelCantidadPiezas1;
    }

    public void setLabelCantidadPiezas1(Label l) {
        this.labelCantidadPiezas1 = l;
    }

    private Label labelCantidadPiezas1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCantidadPiezas1x1() {
        return labelCantidadPiezas1x1;
    }

    public void setLabelCantidadPiezas1x1(Label l) {
        this.labelCantidadPiezas1x1 = l;
    }

    private TextField campoCantidadPiezas1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCantidadPiezas1() {
        return campoCantidadPiezas1;
    }

    public void setCampoCantidadPiezas1(TextField component) {
        this.campoCantidadPiezas1 = component;
    }

    private TextField campoCantidadPiezas1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCantidadPiezas1x1() {
        return campoCantidadPiezas1x1;
    }

    public void setCampoCantidadPiezas1x1(TextField component) {
        this.campoCantidadPiezas1x1 = component;
    }

    private HelpInline helpInlineCantidadPiezas1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCantidadPiezas1() {
        return helpInlineCantidadPiezas1;
    }

    public void setHelpInlineCantidadPiezas1(HelpInline hi) {
        this.helpInlineCantidadPiezas1 = hi;
    }

    private HelpInline helpInlineCantidadPiezas1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCantidadPiezas1x1() {
        return helpInlineCantidadPiezas1x1;
    }

    public void setHelpInlineCantidadPiezas1x1(HelpInline hi) {
        this.helpInlineCantidadPiezas1x1 = hi;
    }

    private StaticText campoCantidadPiezas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadPiezas1Texto1() {
        return campoCantidadPiezas1Texto1;
    }

    public void setCampoCantidadPiezas1Texto1(StaticText component) {
        this.campoCantidadPiezas1Texto1 = component;
    }

    private StaticText campoCantidadPiezas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadPiezas1x1Texto1() {
        return campoCantidadPiezas1x1Texto1;
    }

    public void setCampoCantidadPiezas1x1Texto1(StaticText component) {
        this.campoCantidadPiezas1x1Texto1 = component;
    }

    private IntegerConverter converterCantidadPiezas1 = new IntegerConverter();
  
    public IntegerConverter getConverterCantidadPiezas1() {
        return converterCantidadPiezas1;
    }
  
    public void setConverterCantidadPiezas1(IntegerConverter converter) {
        this.converterCantidadPiezas1 = converter;
    }
  
    private LongRangeValidator validatorCantidadPiezas1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorCantidadPiezas1() {
        return validatorCantidadPiezas1;
    }
  
    public void setValidatorCantidadPiezas1(LongRangeValidator validator) {
        this.validatorCantidadPiezas1 = validator;
    }
  
    private Label labelCantidadDormitorios1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCantidadDormitorios1() {
        return labelCantidadDormitorios1;
    }

    public void setLabelCantidadDormitorios1(Label l) {
        this.labelCantidadDormitorios1 = l;
    }

    private Label labelCantidadDormitorios1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCantidadDormitorios1x1() {
        return labelCantidadDormitorios1x1;
    }

    public void setLabelCantidadDormitorios1x1(Label l) {
        this.labelCantidadDormitorios1x1 = l;
    }

    private TextField campoCantidadDormitorios1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCantidadDormitorios1() {
        return campoCantidadDormitorios1;
    }

    public void setCampoCantidadDormitorios1(TextField component) {
        this.campoCantidadDormitorios1 = component;
    }

    private TextField campoCantidadDormitorios1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCantidadDormitorios1x1() {
        return campoCantidadDormitorios1x1;
    }

    public void setCampoCantidadDormitorios1x1(TextField component) {
        this.campoCantidadDormitorios1x1 = component;
    }

    private HelpInline helpInlineCantidadDormitorios1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCantidadDormitorios1() {
        return helpInlineCantidadDormitorios1;
    }

    public void setHelpInlineCantidadDormitorios1(HelpInline hi) {
        this.helpInlineCantidadDormitorios1 = hi;
    }

    private HelpInline helpInlineCantidadDormitorios1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCantidadDormitorios1x1() {
        return helpInlineCantidadDormitorios1x1;
    }

    public void setHelpInlineCantidadDormitorios1x1(HelpInline hi) {
        this.helpInlineCantidadDormitorios1x1 = hi;
    }

    private StaticText campoCantidadDormitorios1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadDormitorios1Texto1() {
        return campoCantidadDormitorios1Texto1;
    }

    public void setCampoCantidadDormitorios1Texto1(StaticText component) {
        this.campoCantidadDormitorios1Texto1 = component;
    }

    private StaticText campoCantidadDormitorios1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadDormitorios1x1Texto1() {
        return campoCantidadDormitorios1x1Texto1;
    }

    public void setCampoCantidadDormitorios1x1Texto1(StaticText component) {
        this.campoCantidadDormitorios1x1Texto1 = component;
    }

    private IntegerConverter converterCantidadDormitorios1 = new IntegerConverter();
  
    public IntegerConverter getConverterCantidadDormitorios1() {
        return converterCantidadDormitorios1;
    }
  
    public void setConverterCantidadDormitorios1(IntegerConverter converter) {
        this.converterCantidadDormitorios1 = converter;
    }
  
    private LongRangeValidator validatorCantidadDormitorios1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorCantidadDormitorios1() {
        return validatorCantidadDormitorios1;
    }
  
    public void setValidatorCantidadDormitorios1(LongRangeValidator validator) {
        this.validatorCantidadDormitorios1 = validator;
    }
  
    private Label labelNumeroSionoPiezaCocina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoPiezaCocina1() {
        return labelNumeroSionoPiezaCocina1;
    }

    public void setLabelNumeroSionoPiezaCocina1(Label l) {
        this.labelNumeroSionoPiezaCocina1 = l;
    }

    private Label labelNumeroSionoPiezaCocina1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoPiezaCocina1x1() {
        return labelNumeroSionoPiezaCocina1x1;
    }

    public void setLabelNumeroSionoPiezaCocina1x1(Label l) {
        this.labelNumeroSionoPiezaCocina1x1 = l;
    }

    private DropDown listaNumeroSionoPiezaCocina1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoPiezaCocina1() {
        return listaNumeroSionoPiezaCocina1;
    }

    public void setListaNumeroSionoPiezaCocina1(DropDown component) {
        this.listaNumeroSionoPiezaCocina1 = component;
    }

    private DropDown listaNumeroSionoPiezaCocina1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoPiezaCocina1x1() {
        return listaNumeroSionoPiezaCocina1x1;
    }

    public void setListaNumeroSionoPiezaCocina1x1(DropDown component) {
        this.listaNumeroSionoPiezaCocina1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoPiezaCocina1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoPiezaCocina1() {
        return helpInlineNumeroSionoPiezaCocina1;
    }

    public void setHelpInlineNumeroSionoPiezaCocina1(HelpInline hi) {
        this.helpInlineNumeroSionoPiezaCocina1 = hi;
    }

    private HelpInline helpInlineNumeroSionoPiezaCocina1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoPiezaCocina1x1() {
        return helpInlineNumeroSionoPiezaCocina1x1;
    }

    public void setHelpInlineNumeroSionoPiezaCocina1x1(HelpInline hi) {
        this.helpInlineNumeroSionoPiezaCocina1x1 = hi;
    }

    private StaticText listaNumeroSionoPiezaCocina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoPiezaCocina1Texto1() {
        return listaNumeroSionoPiezaCocina1Texto1;
    }

    public void setListaNumeroSionoPiezaCocina1Texto1(StaticText component) {
        this.listaNumeroSionoPiezaCocina1Texto1 = component;
    }

    private StaticText listaNumeroSionoPiezaCocina1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoPiezaCocina1x1Texto1() {
        return listaNumeroSionoPiezaCocina1x1Texto1;
    }

    public void setListaNumeroSionoPiezaCocina1x1Texto1(StaticText component) {
        this.listaNumeroSionoPiezaCocina1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoPiezaCocina1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoPiezaCocina1() {
        return converterNumeroSionoPiezaCocina1;
    }
  
    public void setConverterNumeroSionoPiezaCocina1(IntegerConverter converter) {
        this.converterNumeroSionoPiezaCocina1 = converter;
    }
  
    private Label labelNumeroTipoCombustible1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoCombustible1() {
        return labelNumeroTipoCombustible1;
    }

    public void setLabelNumeroTipoCombustible1(Label l) {
        this.labelNumeroTipoCombustible1 = l;
    }

    private Label labelNumeroTipoCombustible1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoCombustible1x1() {
        return labelNumeroTipoCombustible1x1;
    }

    public void setLabelNumeroTipoCombustible1x1(Label l) {
        this.labelNumeroTipoCombustible1x1 = l;
    }

    private DropDown listaNumeroTipoCombustible1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoCombustible1() {
        return listaNumeroTipoCombustible1;
    }

    public void setListaNumeroTipoCombustible1(DropDown component) {
        this.listaNumeroTipoCombustible1 = component;
    }

    private DropDown listaNumeroTipoCombustible1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoCombustible1x1() {
        return listaNumeroTipoCombustible1x1;
    }

    public void setListaNumeroTipoCombustible1x1(DropDown component) {
        this.listaNumeroTipoCombustible1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoCombustible1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoCombustible1() {
        return helpInlineNumeroTipoCombustible1;
    }

    public void setHelpInlineNumeroTipoCombustible1(HelpInline hi) {
        this.helpInlineNumeroTipoCombustible1 = hi;
    }

    private HelpInline helpInlineNumeroTipoCombustible1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoCombustible1x1() {
        return helpInlineNumeroTipoCombustible1x1;
    }

    public void setHelpInlineNumeroTipoCombustible1x1(HelpInline hi) {
        this.helpInlineNumeroTipoCombustible1x1 = hi;
    }

    private StaticText listaNumeroTipoCombustible1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoCombustible1Texto1() {
        return listaNumeroTipoCombustible1Texto1;
    }

    public void setListaNumeroTipoCombustible1Texto1(StaticText component) {
        this.listaNumeroTipoCombustible1Texto1 = component;
    }

    private StaticText listaNumeroTipoCombustible1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoCombustible1x1Texto1() {
        return listaNumeroTipoCombustible1x1Texto1;
    }

    public void setListaNumeroTipoCombustible1x1Texto1(StaticText component) {
        this.listaNumeroTipoCombustible1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoCombustible1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoCombustible1() {
        return converterNumeroTipoCombustible1;
    }
  
    public void setConverterNumeroTipoCombustible1(IntegerConverter converter) {
        this.converterNumeroTipoCombustible1 = converter;
    }
  
    private Label labelNumeroTipoPiezaBano1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoPiezaBano1() {
        return labelNumeroTipoPiezaBano1;
    }

    public void setLabelNumeroTipoPiezaBano1(Label l) {
        this.labelNumeroTipoPiezaBano1 = l;
    }

    private Label labelNumeroTipoPiezaBano1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoPiezaBano1x1() {
        return labelNumeroTipoPiezaBano1x1;
    }

    public void setLabelNumeroTipoPiezaBano1x1(Label l) {
        this.labelNumeroTipoPiezaBano1x1 = l;
    }

    private DropDown listaNumeroTipoPiezaBano1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoPiezaBano1() {
        return listaNumeroTipoPiezaBano1;
    }

    public void setListaNumeroTipoPiezaBano1(DropDown component) {
        this.listaNumeroTipoPiezaBano1 = component;
    }

    private DropDown listaNumeroTipoPiezaBano1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoPiezaBano1x1() {
        return listaNumeroTipoPiezaBano1x1;
    }

    public void setListaNumeroTipoPiezaBano1x1(DropDown component) {
        this.listaNumeroTipoPiezaBano1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoPiezaBano1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoPiezaBano1() {
        return helpInlineNumeroTipoPiezaBano1;
    }

    public void setHelpInlineNumeroTipoPiezaBano1(HelpInline hi) {
        this.helpInlineNumeroTipoPiezaBano1 = hi;
    }

    private HelpInline helpInlineNumeroTipoPiezaBano1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoPiezaBano1x1() {
        return helpInlineNumeroTipoPiezaBano1x1;
    }

    public void setHelpInlineNumeroTipoPiezaBano1x1(HelpInline hi) {
        this.helpInlineNumeroTipoPiezaBano1x1 = hi;
    }

    private StaticText listaNumeroTipoPiezaBano1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPiezaBano1Texto1() {
        return listaNumeroTipoPiezaBano1Texto1;
    }

    public void setListaNumeroTipoPiezaBano1Texto1(StaticText component) {
        this.listaNumeroTipoPiezaBano1Texto1 = component;
    }

    private StaticText listaNumeroTipoPiezaBano1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPiezaBano1x1Texto1() {
        return listaNumeroTipoPiezaBano1x1Texto1;
    }

    public void setListaNumeroTipoPiezaBano1x1Texto1(StaticText component) {
        this.listaNumeroTipoPiezaBano1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoPiezaBano1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoPiezaBano1() {
        return converterNumeroTipoPiezaBano1;
    }
  
    public void setConverterNumeroTipoPiezaBano1(IntegerConverter converter) {
        this.converterNumeroTipoPiezaBano1 = converter;
    }
  
    private Label labelNumeroTipoServicioSan1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoServicioSan1() {
        return labelNumeroTipoServicioSan1;
    }

    public void setLabelNumeroTipoServicioSan1(Label l) {
        this.labelNumeroTipoServicioSan1 = l;
    }

    private Label labelNumeroTipoServicioSan1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoServicioSan1x1() {
        return labelNumeroTipoServicioSan1x1;
    }

    public void setLabelNumeroTipoServicioSan1x1(Label l) {
        this.labelNumeroTipoServicioSan1x1 = l;
    }

    private DropDown listaNumeroTipoServicioSan1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoServicioSan1() {
        return listaNumeroTipoServicioSan1;
    }

    public void setListaNumeroTipoServicioSan1(DropDown component) {
        this.listaNumeroTipoServicioSan1 = component;
    }

    private DropDown listaNumeroTipoServicioSan1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoServicioSan1x1() {
        return listaNumeroTipoServicioSan1x1;
    }

    public void setListaNumeroTipoServicioSan1x1(DropDown component) {
        this.listaNumeroTipoServicioSan1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoServicioSan1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoServicioSan1() {
        return helpInlineNumeroTipoServicioSan1;
    }

    public void setHelpInlineNumeroTipoServicioSan1(HelpInline hi) {
        this.helpInlineNumeroTipoServicioSan1 = hi;
    }

    private HelpInline helpInlineNumeroTipoServicioSan1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoServicioSan1x1() {
        return helpInlineNumeroTipoServicioSan1x1;
    }

    public void setHelpInlineNumeroTipoServicioSan1x1(HelpInline hi) {
        this.helpInlineNumeroTipoServicioSan1x1 = hi;
    }

    private StaticText listaNumeroTipoServicioSan1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioSan1Texto1() {
        return listaNumeroTipoServicioSan1Texto1;
    }

    public void setListaNumeroTipoServicioSan1Texto1(StaticText component) {
        this.listaNumeroTipoServicioSan1Texto1 = component;
    }

    private StaticText listaNumeroTipoServicioSan1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioSan1x1Texto1() {
        return listaNumeroTipoServicioSan1x1Texto1;
    }

    public void setListaNumeroTipoServicioSan1x1Texto1(StaticText component) {
        this.listaNumeroTipoServicioSan1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoServicioSan1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoServicioSan1() {
        return converterNumeroTipoServicioSan1;
    }
  
    public void setConverterNumeroTipoServicioSan1(IntegerConverter converter) {
        this.converterNumeroTipoServicioSan1 = converter;
    }
  
    private Label labelNumeroTipoServicioAgua1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoServicioAgua1() {
        return labelNumeroTipoServicioAgua1;
    }

    public void setLabelNumeroTipoServicioAgua1(Label l) {
        this.labelNumeroTipoServicioAgua1 = l;
    }

    private Label labelNumeroTipoServicioAgua1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoServicioAgua1x1() {
        return labelNumeroTipoServicioAgua1x1;
    }

    public void setLabelNumeroTipoServicioAgua1x1(Label l) {
        this.labelNumeroTipoServicioAgua1x1 = l;
    }

    private DropDown listaNumeroTipoServicioAgua1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoServicioAgua1() {
        return listaNumeroTipoServicioAgua1;
    }

    public void setListaNumeroTipoServicioAgua1(DropDown component) {
        this.listaNumeroTipoServicioAgua1 = component;
    }

    private DropDown listaNumeroTipoServicioAgua1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoServicioAgua1x1() {
        return listaNumeroTipoServicioAgua1x1;
    }

    public void setListaNumeroTipoServicioAgua1x1(DropDown component) {
        this.listaNumeroTipoServicioAgua1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoServicioAgua1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoServicioAgua1() {
        return helpInlineNumeroTipoServicioAgua1;
    }

    public void setHelpInlineNumeroTipoServicioAgua1(HelpInline hi) {
        this.helpInlineNumeroTipoServicioAgua1 = hi;
    }

    private HelpInline helpInlineNumeroTipoServicioAgua1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoServicioAgua1x1() {
        return helpInlineNumeroTipoServicioAgua1x1;
    }

    public void setHelpInlineNumeroTipoServicioAgua1x1(HelpInline hi) {
        this.helpInlineNumeroTipoServicioAgua1x1 = hi;
    }

    private StaticText listaNumeroTipoServicioAgua1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioAgua1Texto1() {
        return listaNumeroTipoServicioAgua1Texto1;
    }

    public void setListaNumeroTipoServicioAgua1Texto1(StaticText component) {
        this.listaNumeroTipoServicioAgua1Texto1 = component;
    }

    private StaticText listaNumeroTipoServicioAgua1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioAgua1x1Texto1() {
        return listaNumeroTipoServicioAgua1x1Texto1;
    }

    public void setListaNumeroTipoServicioAgua1x1Texto1(StaticText component) {
        this.listaNumeroTipoServicioAgua1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoServicioAgua1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoServicioAgua1() {
        return converterNumeroTipoServicioAgua1;
    }
  
    public void setConverterNumeroTipoServicioAgua1(IntegerConverter converter) {
        this.converterNumeroTipoServicioAgua1 = converter;
    }
  
    private Label labelNumeroTipoAbaAgua1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoAbaAgua1() {
        return labelNumeroTipoAbaAgua1;
    }

    public void setLabelNumeroTipoAbaAgua1(Label l) {
        this.labelNumeroTipoAbaAgua1 = l;
    }

    private Label labelNumeroTipoAbaAgua1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoAbaAgua1x1() {
        return labelNumeroTipoAbaAgua1x1;
    }

    public void setLabelNumeroTipoAbaAgua1x1(Label l) {
        this.labelNumeroTipoAbaAgua1x1 = l;
    }

    private DropDown listaNumeroTipoAbaAgua1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoAbaAgua1() {
        return listaNumeroTipoAbaAgua1;
    }

    public void setListaNumeroTipoAbaAgua1(DropDown component) {
        this.listaNumeroTipoAbaAgua1 = component;
    }

    private DropDown listaNumeroTipoAbaAgua1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoAbaAgua1x1() {
        return listaNumeroTipoAbaAgua1x1;
    }

    public void setListaNumeroTipoAbaAgua1x1(DropDown component) {
        this.listaNumeroTipoAbaAgua1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoAbaAgua1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoAbaAgua1() {
        return helpInlineNumeroTipoAbaAgua1;
    }

    public void setHelpInlineNumeroTipoAbaAgua1(HelpInline hi) {
        this.helpInlineNumeroTipoAbaAgua1 = hi;
    }

    private HelpInline helpInlineNumeroTipoAbaAgua1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoAbaAgua1x1() {
        return helpInlineNumeroTipoAbaAgua1x1;
    }

    public void setHelpInlineNumeroTipoAbaAgua1x1(HelpInline hi) {
        this.helpInlineNumeroTipoAbaAgua1x1 = hi;
    }

    private StaticText listaNumeroTipoAbaAgua1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoAbaAgua1Texto1() {
        return listaNumeroTipoAbaAgua1Texto1;
    }

    public void setListaNumeroTipoAbaAgua1Texto1(StaticText component) {
        this.listaNumeroTipoAbaAgua1Texto1 = component;
    }

    private StaticText listaNumeroTipoAbaAgua1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoAbaAgua1x1Texto1() {
        return listaNumeroTipoAbaAgua1x1Texto1;
    }

    public void setListaNumeroTipoAbaAgua1x1Texto1(StaticText component) {
        this.listaNumeroTipoAbaAgua1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoAbaAgua1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoAbaAgua1() {
        return converterNumeroTipoAbaAgua1;
    }
  
    public void setConverterNumeroTipoAbaAgua1(IntegerConverter converter) {
        this.converterNumeroTipoAbaAgua1 = converter;
    }
  
    private Label labelNumeroSionoCorrienteElec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCorrienteElec1() {
        return labelNumeroSionoCorrienteElec1;
    }

    public void setLabelNumeroSionoCorrienteElec1(Label l) {
        this.labelNumeroSionoCorrienteElec1 = l;
    }

    private Label labelNumeroSionoCorrienteElec1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCorrienteElec1x1() {
        return labelNumeroSionoCorrienteElec1x1;
    }

    public void setLabelNumeroSionoCorrienteElec1x1(Label l) {
        this.labelNumeroSionoCorrienteElec1x1 = l;
    }

    private DropDown listaNumeroSionoCorrienteElec1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoCorrienteElec1() {
        return listaNumeroSionoCorrienteElec1;
    }

    public void setListaNumeroSionoCorrienteElec1(DropDown component) {
        this.listaNumeroSionoCorrienteElec1 = component;
    }

    private DropDown listaNumeroSionoCorrienteElec1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoCorrienteElec1x1() {
        return listaNumeroSionoCorrienteElec1x1;
    }

    public void setListaNumeroSionoCorrienteElec1x1(DropDown component) {
        this.listaNumeroSionoCorrienteElec1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoCorrienteElec1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoCorrienteElec1() {
        return helpInlineNumeroSionoCorrienteElec1;
    }

    public void setHelpInlineNumeroSionoCorrienteElec1(HelpInline hi) {
        this.helpInlineNumeroSionoCorrienteElec1 = hi;
    }

    private HelpInline helpInlineNumeroSionoCorrienteElec1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoCorrienteElec1x1() {
        return helpInlineNumeroSionoCorrienteElec1x1;
    }

    public void setHelpInlineNumeroSionoCorrienteElec1x1(HelpInline hi) {
        this.helpInlineNumeroSionoCorrienteElec1x1 = hi;
    }

    private StaticText listaNumeroSionoCorrienteElec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCorrienteElec1Texto1() {
        return listaNumeroSionoCorrienteElec1Texto1;
    }

    public void setListaNumeroSionoCorrienteElec1Texto1(StaticText component) {
        this.listaNumeroSionoCorrienteElec1Texto1 = component;
    }

    private StaticText listaNumeroSionoCorrienteElec1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCorrienteElec1x1Texto1() {
        return listaNumeroSionoCorrienteElec1x1Texto1;
    }

    public void setListaNumeroSionoCorrienteElec1x1Texto1(StaticText component) {
        this.listaNumeroSionoCorrienteElec1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoCorrienteElec1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoCorrienteElec1() {
        return converterNumeroSionoCorrienteElec1;
    }
  
    public void setConverterNumeroSionoCorrienteElec1(IntegerConverter converter) {
        this.converterNumeroSionoCorrienteElec1 = converter;
    }
  
    private Label labelNumeroTipoDesechoBas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoDesechoBas1() {
        return labelNumeroTipoDesechoBas1;
    }

    public void setLabelNumeroTipoDesechoBas1(Label l) {
        this.labelNumeroTipoDesechoBas1 = l;
    }

    private Label labelNumeroTipoDesechoBas1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoDesechoBas1x1() {
        return labelNumeroTipoDesechoBas1x1;
    }

    public void setLabelNumeroTipoDesechoBas1x1(Label l) {
        this.labelNumeroTipoDesechoBas1x1 = l;
    }

    private DropDown listaNumeroTipoDesechoBas1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoDesechoBas1() {
        return listaNumeroTipoDesechoBas1;
    }

    public void setListaNumeroTipoDesechoBas1(DropDown component) {
        this.listaNumeroTipoDesechoBas1 = component;
    }

    private DropDown listaNumeroTipoDesechoBas1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoDesechoBas1x1() {
        return listaNumeroTipoDesechoBas1x1;
    }

    public void setListaNumeroTipoDesechoBas1x1(DropDown component) {
        this.listaNumeroTipoDesechoBas1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoDesechoBas1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoDesechoBas1() {
        return helpInlineNumeroTipoDesechoBas1;
    }

    public void setHelpInlineNumeroTipoDesechoBas1(HelpInline hi) {
        this.helpInlineNumeroTipoDesechoBas1 = hi;
    }

    private HelpInline helpInlineNumeroTipoDesechoBas1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoDesechoBas1x1() {
        return helpInlineNumeroTipoDesechoBas1x1;
    }

    public void setHelpInlineNumeroTipoDesechoBas1x1(HelpInline hi) {
        this.helpInlineNumeroTipoDesechoBas1x1 = hi;
    }

    private StaticText listaNumeroTipoDesechoBas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoDesechoBas1Texto1() {
        return listaNumeroTipoDesechoBas1Texto1;
    }

    public void setListaNumeroTipoDesechoBas1Texto1(StaticText component) {
        this.listaNumeroTipoDesechoBas1Texto1 = component;
    }

    private StaticText listaNumeroTipoDesechoBas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoDesechoBas1x1Texto1() {
        return listaNumeroTipoDesechoBas1x1Texto1;
    }

    public void setListaNumeroTipoDesechoBas1x1Texto1(StaticText component) {
        this.listaNumeroTipoDesechoBas1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoDesechoBas1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoDesechoBas1() {
        return converterNumeroTipoDesechoBas1;
    }
  
    public void setConverterNumeroTipoDesechoBas1(IntegerConverter converter) {
        this.converterNumeroTipoDesechoBas1 = converter;
    }
  
    private Label labelNumeroSionoTelefonoCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTelefonoCelular1() {
        return labelNumeroSionoTelefonoCelular1;
    }

    public void setLabelNumeroSionoTelefonoCelular1(Label l) {
        this.labelNumeroSionoTelefonoCelular1 = l;
    }

    private Label labelNumeroSionoTelefonoCelular1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTelefonoCelular1x1() {
        return labelNumeroSionoTelefonoCelular1x1;
    }

    public void setLabelNumeroSionoTelefonoCelular1x1(Label l) {
        this.labelNumeroSionoTelefonoCelular1x1 = l;
    }

    private DropDown listaNumeroSionoTelefonoCelular1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoTelefonoCelular1() {
        return listaNumeroSionoTelefonoCelular1;
    }

    public void setListaNumeroSionoTelefonoCelular1(DropDown component) {
        this.listaNumeroSionoTelefonoCelular1 = component;
    }

    private DropDown listaNumeroSionoTelefonoCelular1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoTelefonoCelular1x1() {
        return listaNumeroSionoTelefonoCelular1x1;
    }

    public void setListaNumeroSionoTelefonoCelular1x1(DropDown component) {
        this.listaNumeroSionoTelefonoCelular1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoTelefonoCelular1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoTelefonoCelular1() {
        return helpInlineNumeroSionoTelefonoCelular1;
    }

    public void setHelpInlineNumeroSionoTelefonoCelular1(HelpInline hi) {
        this.helpInlineNumeroSionoTelefonoCelular1 = hi;
    }

    private HelpInline helpInlineNumeroSionoTelefonoCelular1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoTelefonoCelular1x1() {
        return helpInlineNumeroSionoTelefonoCelular1x1;
    }

    public void setHelpInlineNumeroSionoTelefonoCelular1x1(HelpInline hi) {
        this.helpInlineNumeroSionoTelefonoCelular1x1 = hi;
    }

    private StaticText listaNumeroSionoTelefonoCelular1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTelefonoCelular1Texto1() {
        return listaNumeroSionoTelefonoCelular1Texto1;
    }

    public void setListaNumeroSionoTelefonoCelular1Texto1(StaticText component) {
        this.listaNumeroSionoTelefonoCelular1Texto1 = component;
    }

    private StaticText listaNumeroSionoTelefonoCelular1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTelefonoCelular1x1Texto1() {
        return listaNumeroSionoTelefonoCelular1x1Texto1;
    }

    public void setListaNumeroSionoTelefonoCelular1x1Texto1(StaticText component) {
        this.listaNumeroSionoTelefonoCelular1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoTelefonoCelular1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoTelefonoCelular1() {
        return converterNumeroSionoTelefonoCelular1;
    }
  
    public void setConverterNumeroSionoTelefonoCelular1(IntegerConverter converter) {
        this.converterNumeroSionoTelefonoCelular1 = converter;
    }
  
    private Label labelNumeroTelefonoCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoCelular1() {
        return labelNumeroTelefonoCelular1;
    }

    public void setLabelNumeroTelefonoCelular1(Label l) {
        this.labelNumeroTelefonoCelular1 = l;
    }

    private Label labelNumeroTelefonoCelular1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoCelular1x1() {
        return labelNumeroTelefonoCelular1x1;
    }

    public void setLabelNumeroTelefonoCelular1x1(Label l) {
        this.labelNumeroTelefonoCelular1x1 = l;
    }

    private TextField campoNumeroTelefonoCelular1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroTelefonoCelular1() {
        return campoNumeroTelefonoCelular1;
    }

    public void setCampoNumeroTelefonoCelular1(TextField component) {
        this.campoNumeroTelefonoCelular1 = component;
    }

    private TextField campoNumeroTelefonoCelular1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroTelefonoCelular1x1() {
        return campoNumeroTelefonoCelular1x1;
    }

    public void setCampoNumeroTelefonoCelular1x1(TextField component) {
        this.campoNumeroTelefonoCelular1x1 = component;
    }

    private HelpInline helpInlineNumeroTelefonoCelular1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoCelular1() {
        return helpInlineNumeroTelefonoCelular1;
    }

    public void setHelpInlineNumeroTelefonoCelular1(HelpInline hi) {
        this.helpInlineNumeroTelefonoCelular1 = hi;
    }

    private HelpInline helpInlineNumeroTelefonoCelular1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoCelular1x1() {
        return helpInlineNumeroTelefonoCelular1x1;
    }

    public void setHelpInlineNumeroTelefonoCelular1x1(HelpInline hi) {
        this.helpInlineNumeroTelefonoCelular1x1 = hi;
    }

    private StaticText campoNumeroTelefonoCelular1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoCelular1Texto1() {
        return campoNumeroTelefonoCelular1Texto1;
    }

    public void setCampoNumeroTelefonoCelular1Texto1(StaticText component) {
        this.campoNumeroTelefonoCelular1Texto1 = component;
    }

    private StaticText campoNumeroTelefonoCelular1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoCelular1x1Texto1() {
        return campoNumeroTelefonoCelular1x1Texto1;
    }

    public void setCampoNumeroTelefonoCelular1x1Texto1(StaticText component) {
        this.campoNumeroTelefonoCelular1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroTelefonoCelular1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroTelefonoCelular1() {
        return validatorNumeroTelefonoCelular1;
    }
  
    public void setValidatorNumeroTelefonoCelular1(LengthValidator validator) {
        this.validatorNumeroTelefonoCelular1 = validator;
    }
  
    private Label labelNumeroSionoTlfLineaBaja1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTlfLineaBaja1() {
        return labelNumeroSionoTlfLineaBaja1;
    }

    public void setLabelNumeroSionoTlfLineaBaja1(Label l) {
        this.labelNumeroSionoTlfLineaBaja1 = l;
    }

    private Label labelNumeroSionoTlfLineaBaja1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTlfLineaBaja1x1() {
        return labelNumeroSionoTlfLineaBaja1x1;
    }

    public void setLabelNumeroSionoTlfLineaBaja1x1(Label l) {
        this.labelNumeroSionoTlfLineaBaja1x1 = l;
    }

    private DropDown listaNumeroSionoTlfLineaBaja1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoTlfLineaBaja1() {
        return listaNumeroSionoTlfLineaBaja1;
    }

    public void setListaNumeroSionoTlfLineaBaja1(DropDown component) {
        this.listaNumeroSionoTlfLineaBaja1 = component;
    }

    private DropDown listaNumeroSionoTlfLineaBaja1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoTlfLineaBaja1x1() {
        return listaNumeroSionoTlfLineaBaja1x1;
    }

    public void setListaNumeroSionoTlfLineaBaja1x1(DropDown component) {
        this.listaNumeroSionoTlfLineaBaja1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoTlfLineaBaja1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoTlfLineaBaja1() {
        return helpInlineNumeroSionoTlfLineaBaja1;
    }

    public void setHelpInlineNumeroSionoTlfLineaBaja1(HelpInline hi) {
        this.helpInlineNumeroSionoTlfLineaBaja1 = hi;
    }

    private HelpInline helpInlineNumeroSionoTlfLineaBaja1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoTlfLineaBaja1x1() {
        return helpInlineNumeroSionoTlfLineaBaja1x1;
    }

    public void setHelpInlineNumeroSionoTlfLineaBaja1x1(HelpInline hi) {
        this.helpInlineNumeroSionoTlfLineaBaja1x1 = hi;
    }

    private StaticText listaNumeroSionoTlfLineaBaja1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTlfLineaBaja1Texto1() {
        return listaNumeroSionoTlfLineaBaja1Texto1;
    }

    public void setListaNumeroSionoTlfLineaBaja1Texto1(StaticText component) {
        this.listaNumeroSionoTlfLineaBaja1Texto1 = component;
    }

    private StaticText listaNumeroSionoTlfLineaBaja1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTlfLineaBaja1x1Texto1() {
        return listaNumeroSionoTlfLineaBaja1x1Texto1;
    }

    public void setListaNumeroSionoTlfLineaBaja1x1Texto1(StaticText component) {
        this.listaNumeroSionoTlfLineaBaja1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoTlfLineaBaja1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoTlfLineaBaja1() {
        return converterNumeroSionoTlfLineaBaja1;
    }
  
    public void setConverterNumeroSionoTlfLineaBaja1(IntegerConverter converter) {
        this.converterNumeroSionoTlfLineaBaja1 = converter;
    }
  
    private Label labelNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoLineaBaja1() {
        return labelNumeroTelefonoLineaBaja1;
    }

    public void setLabelNumeroTelefonoLineaBaja1(Label l) {
        this.labelNumeroTelefonoLineaBaja1 = l;
    }

    private Label labelNumeroTelefonoLineaBaja1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoLineaBaja1x1() {
        return labelNumeroTelefonoLineaBaja1x1;
    }

    public void setLabelNumeroTelefonoLineaBaja1x1(Label l) {
        this.labelNumeroTelefonoLineaBaja1x1 = l;
    }

    private TextField campoNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroTelefonoLineaBaja1() {
        return campoNumeroTelefonoLineaBaja1;
    }

    public void setCampoNumeroTelefonoLineaBaja1(TextField component) {
        this.campoNumeroTelefonoLineaBaja1 = component;
    }

    private TextField campoNumeroTelefonoLineaBaja1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroTelefonoLineaBaja1x1() {
        return campoNumeroTelefonoLineaBaja1x1;
    }

    public void setCampoNumeroTelefonoLineaBaja1x1(TextField component) {
        this.campoNumeroTelefonoLineaBaja1x1 = component;
    }

    private HelpInline helpInlineNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoLineaBaja1() {
        return helpInlineNumeroTelefonoLineaBaja1;
    }

    public void setHelpInlineNumeroTelefonoLineaBaja1(HelpInline hi) {
        this.helpInlineNumeroTelefonoLineaBaja1 = hi;
    }

    private HelpInline helpInlineNumeroTelefonoLineaBaja1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoLineaBaja1x1() {
        return helpInlineNumeroTelefonoLineaBaja1x1;
    }

    public void setHelpInlineNumeroTelefonoLineaBaja1x1(HelpInline hi) {
        this.helpInlineNumeroTelefonoLineaBaja1x1 = hi;
    }

    private StaticText campoNumeroTelefonoLineaBaja1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoLineaBaja1Texto1() {
        return campoNumeroTelefonoLineaBaja1Texto1;
    }

    public void setCampoNumeroTelefonoLineaBaja1Texto1(StaticText component) {
        this.campoNumeroTelefonoLineaBaja1Texto1 = component;
    }

    private StaticText campoNumeroTelefonoLineaBaja1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoLineaBaja1x1Texto1() {
        return campoNumeroTelefonoLineaBaja1x1Texto1;
    }

    public void setCampoNumeroTelefonoLineaBaja1x1Texto1(StaticText component) {
        this.campoNumeroTelefonoLineaBaja1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroTelefonoLineaBaja1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroTelefonoLineaBaja1() {
        return validatorNumeroTelefonoLineaBaja1;
    }
  
    public void setValidatorNumeroTelefonoLineaBaja1(LengthValidator validator) {
        this.validatorNumeroTelefonoLineaBaja1 = validator;
    }
  
    private Label labelNumeroSionoDispHeladera1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispHeladera1() {
        return labelNumeroSionoDispHeladera1;
    }

    public void setLabelNumeroSionoDispHeladera1(Label l) {
        this.labelNumeroSionoDispHeladera1 = l;
    }

    private Label labelNumeroSionoDispHeladera1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispHeladera1x1() {
        return labelNumeroSionoDispHeladera1x1;
    }

    public void setLabelNumeroSionoDispHeladera1x1(Label l) {
        this.labelNumeroSionoDispHeladera1x1 = l;
    }

    private DropDown listaNumeroSionoDispHeladera1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispHeladera1() {
        return listaNumeroSionoDispHeladera1;
    }

    public void setListaNumeroSionoDispHeladera1(DropDown component) {
        this.listaNumeroSionoDispHeladera1 = component;
    }

    private DropDown listaNumeroSionoDispHeladera1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispHeladera1x1() {
        return listaNumeroSionoDispHeladera1x1;
    }

    public void setListaNumeroSionoDispHeladera1x1(DropDown component) {
        this.listaNumeroSionoDispHeladera1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispHeladera1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispHeladera1() {
        return helpInlineNumeroSionoDispHeladera1;
    }

    public void setHelpInlineNumeroSionoDispHeladera1(HelpInline hi) {
        this.helpInlineNumeroSionoDispHeladera1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispHeladera1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispHeladera1x1() {
        return helpInlineNumeroSionoDispHeladera1x1;
    }

    public void setHelpInlineNumeroSionoDispHeladera1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispHeladera1x1 = hi;
    }

    private StaticText listaNumeroSionoDispHeladera1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispHeladera1Texto1() {
        return listaNumeroSionoDispHeladera1Texto1;
    }

    public void setListaNumeroSionoDispHeladera1Texto1(StaticText component) {
        this.listaNumeroSionoDispHeladera1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispHeladera1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispHeladera1x1Texto1() {
        return listaNumeroSionoDispHeladera1x1Texto1;
    }

    public void setListaNumeroSionoDispHeladera1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispHeladera1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispHeladera1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispHeladera1() {
        return converterNumeroSionoDispHeladera1;
    }
  
    public void setConverterNumeroSionoDispHeladera1(IntegerConverter converter) {
        this.converterNumeroSionoDispHeladera1 = converter;
    }
  
    private Label labelNumeroSionoDispLavarropas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispLavarropas1() {
        return labelNumeroSionoDispLavarropas1;
    }

    public void setLabelNumeroSionoDispLavarropas1(Label l) {
        this.labelNumeroSionoDispLavarropas1 = l;
    }

    private Label labelNumeroSionoDispLavarropas1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispLavarropas1x1() {
        return labelNumeroSionoDispLavarropas1x1;
    }

    public void setLabelNumeroSionoDispLavarropas1x1(Label l) {
        this.labelNumeroSionoDispLavarropas1x1 = l;
    }

    private DropDown listaNumeroSionoDispLavarropas1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispLavarropas1() {
        return listaNumeroSionoDispLavarropas1;
    }

    public void setListaNumeroSionoDispLavarropas1(DropDown component) {
        this.listaNumeroSionoDispLavarropas1 = component;
    }

    private DropDown listaNumeroSionoDispLavarropas1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispLavarropas1x1() {
        return listaNumeroSionoDispLavarropas1x1;
    }

    public void setListaNumeroSionoDispLavarropas1x1(DropDown component) {
        this.listaNumeroSionoDispLavarropas1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispLavarropas1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispLavarropas1() {
        return helpInlineNumeroSionoDispLavarropas1;
    }

    public void setHelpInlineNumeroSionoDispLavarropas1(HelpInline hi) {
        this.helpInlineNumeroSionoDispLavarropas1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispLavarropas1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispLavarropas1x1() {
        return helpInlineNumeroSionoDispLavarropas1x1;
    }

    public void setHelpInlineNumeroSionoDispLavarropas1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispLavarropas1x1 = hi;
    }

    private StaticText listaNumeroSionoDispLavarropas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispLavarropas1Texto1() {
        return listaNumeroSionoDispLavarropas1Texto1;
    }

    public void setListaNumeroSionoDispLavarropas1Texto1(StaticText component) {
        this.listaNumeroSionoDispLavarropas1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispLavarropas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispLavarropas1x1Texto1() {
        return listaNumeroSionoDispLavarropas1x1Texto1;
    }

    public void setListaNumeroSionoDispLavarropas1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispLavarropas1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispLavarropas1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispLavarropas1() {
        return converterNumeroSionoDispLavarropas1;
    }
  
    public void setConverterNumeroSionoDispLavarropas1(IntegerConverter converter) {
        this.converterNumeroSionoDispLavarropas1 = converter;
    }
  
    private Label labelNumeroSionoDispTermo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispTermo1() {
        return labelNumeroSionoDispTermo1;
    }

    public void setLabelNumeroSionoDispTermo1(Label l) {
        this.labelNumeroSionoDispTermo1 = l;
    }

    private Label labelNumeroSionoDispTermo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispTermo1x1() {
        return labelNumeroSionoDispTermo1x1;
    }

    public void setLabelNumeroSionoDispTermo1x1(Label l) {
        this.labelNumeroSionoDispTermo1x1 = l;
    }

    private DropDown listaNumeroSionoDispTermo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispTermo1() {
        return listaNumeroSionoDispTermo1;
    }

    public void setListaNumeroSionoDispTermo1(DropDown component) {
        this.listaNumeroSionoDispTermo1 = component;
    }

    private DropDown listaNumeroSionoDispTermo1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispTermo1x1() {
        return listaNumeroSionoDispTermo1x1;
    }

    public void setListaNumeroSionoDispTermo1x1(DropDown component) {
        this.listaNumeroSionoDispTermo1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispTermo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispTermo1() {
        return helpInlineNumeroSionoDispTermo1;
    }

    public void setHelpInlineNumeroSionoDispTermo1(HelpInline hi) {
        this.helpInlineNumeroSionoDispTermo1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispTermo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispTermo1x1() {
        return helpInlineNumeroSionoDispTermo1x1;
    }

    public void setHelpInlineNumeroSionoDispTermo1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispTermo1x1 = hi;
    }

    private StaticText listaNumeroSionoDispTermo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispTermo1Texto1() {
        return listaNumeroSionoDispTermo1Texto1;
    }

    public void setListaNumeroSionoDispTermo1Texto1(StaticText component) {
        this.listaNumeroSionoDispTermo1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispTermo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispTermo1x1Texto1() {
        return listaNumeroSionoDispTermo1x1Texto1;
    }

    public void setListaNumeroSionoDispTermo1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispTermo1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispTermo1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispTermo1() {
        return converterNumeroSionoDispTermo1;
    }
  
    public void setConverterNumeroSionoDispTermo1(IntegerConverter converter) {
        this.converterNumeroSionoDispTermo1 = converter;
    }
  
    private Label labelNumeroSionoDispAireAcon1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispAireAcon1() {
        return labelNumeroSionoDispAireAcon1;
    }

    public void setLabelNumeroSionoDispAireAcon1(Label l) {
        this.labelNumeroSionoDispAireAcon1 = l;
    }

    private Label labelNumeroSionoDispAireAcon1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispAireAcon1x1() {
        return labelNumeroSionoDispAireAcon1x1;
    }

    public void setLabelNumeroSionoDispAireAcon1x1(Label l) {
        this.labelNumeroSionoDispAireAcon1x1 = l;
    }

    private DropDown listaNumeroSionoDispAireAcon1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispAireAcon1() {
        return listaNumeroSionoDispAireAcon1;
    }

    public void setListaNumeroSionoDispAireAcon1(DropDown component) {
        this.listaNumeroSionoDispAireAcon1 = component;
    }

    private DropDown listaNumeroSionoDispAireAcon1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispAireAcon1x1() {
        return listaNumeroSionoDispAireAcon1x1;
    }

    public void setListaNumeroSionoDispAireAcon1x1(DropDown component) {
        this.listaNumeroSionoDispAireAcon1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispAireAcon1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispAireAcon1() {
        return helpInlineNumeroSionoDispAireAcon1;
    }

    public void setHelpInlineNumeroSionoDispAireAcon1(HelpInline hi) {
        this.helpInlineNumeroSionoDispAireAcon1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispAireAcon1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispAireAcon1x1() {
        return helpInlineNumeroSionoDispAireAcon1x1;
    }

    public void setHelpInlineNumeroSionoDispAireAcon1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispAireAcon1x1 = hi;
    }

    private StaticText listaNumeroSionoDispAireAcon1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAireAcon1Texto1() {
        return listaNumeroSionoDispAireAcon1Texto1;
    }

    public void setListaNumeroSionoDispAireAcon1Texto1(StaticText component) {
        this.listaNumeroSionoDispAireAcon1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispAireAcon1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAireAcon1x1Texto1() {
        return listaNumeroSionoDispAireAcon1x1Texto1;
    }

    public void setListaNumeroSionoDispAireAcon1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispAireAcon1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispAireAcon1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispAireAcon1() {
        return converterNumeroSionoDispAireAcon1;
    }
  
    public void setConverterNumeroSionoDispAireAcon1(IntegerConverter converter) {
        this.converterNumeroSionoDispAireAcon1 = converter;
    }
  
    private Label labelNumeroSionoDispAutomovil1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispAutomovil1() {
        return labelNumeroSionoDispAutomovil1;
    }

    public void setLabelNumeroSionoDispAutomovil1(Label l) {
        this.labelNumeroSionoDispAutomovil1 = l;
    }

    private Label labelNumeroSionoDispAutomovil1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispAutomovil1x1() {
        return labelNumeroSionoDispAutomovil1x1;
    }

    public void setLabelNumeroSionoDispAutomovil1x1(Label l) {
        this.labelNumeroSionoDispAutomovil1x1 = l;
    }

    private DropDown listaNumeroSionoDispAutomovil1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispAutomovil1() {
        return listaNumeroSionoDispAutomovil1;
    }

    public void setListaNumeroSionoDispAutomovil1(DropDown component) {
        this.listaNumeroSionoDispAutomovil1 = component;
    }

    private DropDown listaNumeroSionoDispAutomovil1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispAutomovil1x1() {
        return listaNumeroSionoDispAutomovil1x1;
    }

    public void setListaNumeroSionoDispAutomovil1x1(DropDown component) {
        this.listaNumeroSionoDispAutomovil1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispAutomovil1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispAutomovil1() {
        return helpInlineNumeroSionoDispAutomovil1;
    }

    public void setHelpInlineNumeroSionoDispAutomovil1(HelpInline hi) {
        this.helpInlineNumeroSionoDispAutomovil1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispAutomovil1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispAutomovil1x1() {
        return helpInlineNumeroSionoDispAutomovil1x1;
    }

    public void setHelpInlineNumeroSionoDispAutomovil1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispAutomovil1x1 = hi;
    }

    private StaticText listaNumeroSionoDispAutomovil1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAutomovil1Texto1() {
        return listaNumeroSionoDispAutomovil1Texto1;
    }

    public void setListaNumeroSionoDispAutomovil1Texto1(StaticText component) {
        this.listaNumeroSionoDispAutomovil1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispAutomovil1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAutomovil1x1Texto1() {
        return listaNumeroSionoDispAutomovil1x1Texto1;
    }

    public void setListaNumeroSionoDispAutomovil1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispAutomovil1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispAutomovil1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispAutomovil1() {
        return converterNumeroSionoDispAutomovil1;
    }
  
    public void setConverterNumeroSionoDispAutomovil1(IntegerConverter converter) {
        this.converterNumeroSionoDispAutomovil1 = converter;
    }
  
    private Label labelNumeroSionoDispCamion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispCamion1() {
        return labelNumeroSionoDispCamion1;
    }

    public void setLabelNumeroSionoDispCamion1(Label l) {
        this.labelNumeroSionoDispCamion1 = l;
    }

    private Label labelNumeroSionoDispCamion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispCamion1x1() {
        return labelNumeroSionoDispCamion1x1;
    }

    public void setLabelNumeroSionoDispCamion1x1(Label l) {
        this.labelNumeroSionoDispCamion1x1 = l;
    }

    private DropDown listaNumeroSionoDispCamion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispCamion1() {
        return listaNumeroSionoDispCamion1;
    }

    public void setListaNumeroSionoDispCamion1(DropDown component) {
        this.listaNumeroSionoDispCamion1 = component;
    }

    private DropDown listaNumeroSionoDispCamion1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispCamion1x1() {
        return listaNumeroSionoDispCamion1x1;
    }

    public void setListaNumeroSionoDispCamion1x1(DropDown component) {
        this.listaNumeroSionoDispCamion1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispCamion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispCamion1() {
        return helpInlineNumeroSionoDispCamion1;
    }

    public void setHelpInlineNumeroSionoDispCamion1(HelpInline hi) {
        this.helpInlineNumeroSionoDispCamion1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispCamion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispCamion1x1() {
        return helpInlineNumeroSionoDispCamion1x1;
    }

    public void setHelpInlineNumeroSionoDispCamion1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispCamion1x1 = hi;
    }

    private StaticText listaNumeroSionoDispCamion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispCamion1Texto1() {
        return listaNumeroSionoDispCamion1Texto1;
    }

    public void setListaNumeroSionoDispCamion1Texto1(StaticText component) {
        this.listaNumeroSionoDispCamion1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispCamion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispCamion1x1Texto1() {
        return listaNumeroSionoDispCamion1x1Texto1;
    }

    public void setListaNumeroSionoDispCamion1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispCamion1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispCamion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispCamion1() {
        return converterNumeroSionoDispCamion1;
    }
  
    public void setConverterNumeroSionoDispCamion1(IntegerConverter converter) {
        this.converterNumeroSionoDispCamion1 = converter;
    }
  
    private Label labelNumeroSionoDispMotocicleta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispMotocicleta1() {
        return labelNumeroSionoDispMotocicleta1;
    }

    public void setLabelNumeroSionoDispMotocicleta1(Label l) {
        this.labelNumeroSionoDispMotocicleta1 = l;
    }

    private Label labelNumeroSionoDispMotocicleta1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispMotocicleta1x1() {
        return labelNumeroSionoDispMotocicleta1x1;
    }

    public void setLabelNumeroSionoDispMotocicleta1x1(Label l) {
        this.labelNumeroSionoDispMotocicleta1x1 = l;
    }

    private DropDown listaNumeroSionoDispMotocicleta1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispMotocicleta1() {
        return listaNumeroSionoDispMotocicleta1;
    }

    public void setListaNumeroSionoDispMotocicleta1(DropDown component) {
        this.listaNumeroSionoDispMotocicleta1 = component;
    }

    private DropDown listaNumeroSionoDispMotocicleta1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispMotocicleta1x1() {
        return listaNumeroSionoDispMotocicleta1x1;
    }

    public void setListaNumeroSionoDispMotocicleta1x1(DropDown component) {
        this.listaNumeroSionoDispMotocicleta1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDispMotocicleta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispMotocicleta1() {
        return helpInlineNumeroSionoDispMotocicleta1;
    }

    public void setHelpInlineNumeroSionoDispMotocicleta1(HelpInline hi) {
        this.helpInlineNumeroSionoDispMotocicleta1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDispMotocicleta1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDispMotocicleta1x1() {
        return helpInlineNumeroSionoDispMotocicleta1x1;
    }

    public void setHelpInlineNumeroSionoDispMotocicleta1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDispMotocicleta1x1 = hi;
    }

    private StaticText listaNumeroSionoDispMotocicleta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispMotocicleta1Texto1() {
        return listaNumeroSionoDispMotocicleta1Texto1;
    }

    public void setListaNumeroSionoDispMotocicleta1Texto1(StaticText component) {
        this.listaNumeroSionoDispMotocicleta1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispMotocicleta1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispMotocicleta1x1Texto1() {
        return listaNumeroSionoDispMotocicleta1x1Texto1;
    }

    public void setListaNumeroSionoDispMotocicleta1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispMotocicleta1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispMotocicleta1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispMotocicleta1() {
        return converterNumeroSionoDispMotocicleta1;
    }
  
    public void setConverterNumeroSionoDispMotocicleta1(IntegerConverter converter) {
        this.converterNumeroSionoDispMotocicleta1 = converter;
    }
  
    private Label labelNombreJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreJefeHogar1() {
        return labelNombreJefeHogar1;
    }

    public void setLabelNombreJefeHogar1(Label l) {
        this.labelNombreJefeHogar1 = l;
    }

    private Label labelNombreJefeHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreJefeHogar1x1() {
        return labelNombreJefeHogar1x1;
    }

    public void setLabelNombreJefeHogar1x1(Label l) {
        this.labelNombreJefeHogar1x1 = l;
    }

    private TextField campoNombreJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreJefeHogar1() {
        return campoNombreJefeHogar1;
    }

    public void setCampoNombreJefeHogar1(TextField component) {
        this.campoNombreJefeHogar1 = component;
    }

    private TextField campoNombreJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreJefeHogar1x1() {
        return campoNombreJefeHogar1x1;
    }

    public void setCampoNombreJefeHogar1x1(TextField component) {
        this.campoNombreJefeHogar1x1 = component;
    }

    private HelpInline helpInlineNombreJefeHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreJefeHogar1() {
        return helpInlineNombreJefeHogar1;
    }

    public void setHelpInlineNombreJefeHogar1(HelpInline hi) {
        this.helpInlineNombreJefeHogar1 = hi;
    }

    private HelpInline helpInlineNombreJefeHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreJefeHogar1x1() {
        return helpInlineNombreJefeHogar1x1;
    }

    public void setHelpInlineNombreJefeHogar1x1(HelpInline hi) {
        this.helpInlineNombreJefeHogar1x1 = hi;
    }

    private StaticText campoNombreJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreJefeHogar1Texto1() {
        return campoNombreJefeHogar1Texto1;
    }

    public void setCampoNombreJefeHogar1Texto1(StaticText component) {
        this.campoNombreJefeHogar1Texto1 = component;
    }

    private StaticText campoNombreJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreJefeHogar1x1Texto1() {
        return campoNombreJefeHogar1x1Texto1;
    }

    public void setCampoNombreJefeHogar1x1Texto1(StaticText component) {
        this.campoNombreJefeHogar1x1Texto1 = component;
    }

    private LengthValidator validatorNombreJefeHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreJefeHogar1() {
        return validatorNombreJefeHogar1;
    }
  
    public void setValidatorNombreJefeHogar1(LengthValidator validator) {
        this.validatorNombreJefeHogar1 = validator;
    }
  
    private Label labelNumeroCedulaJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedulaJefeHogar1() {
        return labelNumeroCedulaJefeHogar1;
    }

    public void setLabelNumeroCedulaJefeHogar1(Label l) {
        this.labelNumeroCedulaJefeHogar1 = l;
    }

    private Label labelNumeroCedulaJefeHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedulaJefeHogar1x1() {
        return labelNumeroCedulaJefeHogar1x1;
    }

    public void setLabelNumeroCedulaJefeHogar1x1(Label l) {
        this.labelNumeroCedulaJefeHogar1x1 = l;
    }

    private TextField campoNumeroCedulaJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroCedulaJefeHogar1() {
        return campoNumeroCedulaJefeHogar1;
    }

    public void setCampoNumeroCedulaJefeHogar1(TextField component) {
        this.campoNumeroCedulaJefeHogar1 = component;
    }

    private TextField campoNumeroCedulaJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroCedulaJefeHogar1x1() {
        return campoNumeroCedulaJefeHogar1x1;
    }

    public void setCampoNumeroCedulaJefeHogar1x1(TextField component) {
        this.campoNumeroCedulaJefeHogar1x1 = component;
    }

    private HelpInline helpInlineNumeroCedulaJefeHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCedulaJefeHogar1() {
        return helpInlineNumeroCedulaJefeHogar1;
    }

    public void setHelpInlineNumeroCedulaJefeHogar1(HelpInline hi) {
        this.helpInlineNumeroCedulaJefeHogar1 = hi;
    }

    private HelpInline helpInlineNumeroCedulaJefeHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCedulaJefeHogar1x1() {
        return helpInlineNumeroCedulaJefeHogar1x1;
    }

    public void setHelpInlineNumeroCedulaJefeHogar1x1(HelpInline hi) {
        this.helpInlineNumeroCedulaJefeHogar1x1 = hi;
    }

    private StaticText campoNumeroCedulaJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaJefeHogar1Texto1() {
        return campoNumeroCedulaJefeHogar1Texto1;
    }

    public void setCampoNumeroCedulaJefeHogar1Texto1(StaticText component) {
        this.campoNumeroCedulaJefeHogar1Texto1 = component;
    }

    private StaticText campoNumeroCedulaJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaJefeHogar1x1Texto1() {
        return campoNumeroCedulaJefeHogar1x1Texto1;
    }

    public void setCampoNumeroCedulaJefeHogar1x1Texto1(StaticText component) {
        this.campoNumeroCedulaJefeHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCedulaJefeHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCedulaJefeHogar1() {
        return converterNumeroCedulaJefeHogar1;
    }
  
    public void setConverterNumeroCedulaJefeHogar1(IntegerConverter converter) {
        this.converterNumeroCedulaJefeHogar1 = converter;
    }
  
    private LongRangeValidator validatorNumeroCedulaJefeHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroCedulaJefeHogar1() {
        return validatorNumeroCedulaJefeHogar1;
    }
  
    public void setValidatorNumeroCedulaJefeHogar1(LongRangeValidator validator) {
        this.validatorNumeroCedulaJefeHogar1 = validator;
    }
  
    private Label labelLetraCedulaJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedulaJefeHogar1() {
        return labelLetraCedulaJefeHogar1;
    }

    public void setLabelLetraCedulaJefeHogar1(Label l) {
        this.labelLetraCedulaJefeHogar1 = l;
    }

    private Label labelLetraCedulaJefeHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedulaJefeHogar1x1() {
        return labelLetraCedulaJefeHogar1x1;
    }

    public void setLabelLetraCedulaJefeHogar1x1(Label l) {
        this.labelLetraCedulaJefeHogar1x1 = l;
    }

    private TextField campoLetraCedulaJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLetraCedulaJefeHogar1() {
        return campoLetraCedulaJefeHogar1;
    }

    public void setCampoLetraCedulaJefeHogar1(TextField component) {
        this.campoLetraCedulaJefeHogar1 = component;
    }

    private TextField campoLetraCedulaJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLetraCedulaJefeHogar1x1() {
        return campoLetraCedulaJefeHogar1x1;
    }

    public void setCampoLetraCedulaJefeHogar1x1(TextField component) {
        this.campoLetraCedulaJefeHogar1x1 = component;
    }

    private HelpInline helpInlineLetraCedulaJefeHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCedulaJefeHogar1() {
        return helpInlineLetraCedulaJefeHogar1;
    }

    public void setHelpInlineLetraCedulaJefeHogar1(HelpInline hi) {
        this.helpInlineLetraCedulaJefeHogar1 = hi;
    }

    private HelpInline helpInlineLetraCedulaJefeHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCedulaJefeHogar1x1() {
        return helpInlineLetraCedulaJefeHogar1x1;
    }

    public void setHelpInlineLetraCedulaJefeHogar1x1(HelpInline hi) {
        this.helpInlineLetraCedulaJefeHogar1x1 = hi;
    }

    private StaticText campoLetraCedulaJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaJefeHogar1Texto1() {
        return campoLetraCedulaJefeHogar1Texto1;
    }

    public void setCampoLetraCedulaJefeHogar1Texto1(StaticText component) {
        this.campoLetraCedulaJefeHogar1Texto1 = component;
    }

    private StaticText campoLetraCedulaJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaJefeHogar1x1Texto1() {
        return campoLetraCedulaJefeHogar1x1Texto1;
    }

    public void setCampoLetraCedulaJefeHogar1x1Texto1(StaticText component) {
        this.campoLetraCedulaJefeHogar1x1Texto1 = component;
    }

    private LengthValidator validatorLetraCedulaJefeHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCedulaJefeHogar1() {
        return validatorLetraCedulaJefeHogar1;
    }
  
    public void setValidatorLetraCedulaJefeHogar1(LengthValidator validator) {
        this.validatorLetraCedulaJefeHogar1 = validator;
    }
  
    private Label labelNumeroOrdenIdenJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenJefeHogar1() {
        return labelNumeroOrdenIdenJefeHogar1;
    }

    public void setLabelNumeroOrdenIdenJefeHogar1(Label l) {
        this.labelNumeroOrdenIdenJefeHogar1 = l;
    }

    private Label labelNumeroOrdenIdenJefeHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenJefeHogar1x1() {
        return labelNumeroOrdenIdenJefeHogar1x1;
    }

    public void setLabelNumeroOrdenIdenJefeHogar1x1(Label l) {
        this.labelNumeroOrdenIdenJefeHogar1x1 = l;
    }

    private TextField campoNumeroOrdenIdenJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenJefeHogar1() {
        return campoNumeroOrdenIdenJefeHogar1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1(TextField component) {
        this.campoNumeroOrdenIdenJefeHogar1 = component;
    }

    private TextField campoNumeroOrdenIdenJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenJefeHogar1x1() {
        return campoNumeroOrdenIdenJefeHogar1x1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1x1(TextField component) {
        this.campoNumeroOrdenIdenJefeHogar1x1 = component;
    }

    private HelpInline helpInlineNumeroOrdenIdenJefeHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenJefeHogar1() {
        return helpInlineNumeroOrdenIdenJefeHogar1;
    }

    public void setHelpInlineNumeroOrdenIdenJefeHogar1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenJefeHogar1 = hi;
    }

    private HelpInline helpInlineNumeroOrdenIdenJefeHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenJefeHogar1x1() {
        return helpInlineNumeroOrdenIdenJefeHogar1x1;
    }

    public void setHelpInlineNumeroOrdenIdenJefeHogar1x1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenJefeHogar1x1 = hi;
    }

    private StaticText campoNumeroOrdenIdenJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenJefeHogar1Texto1() {
        return campoNumeroOrdenIdenJefeHogar1Texto1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenJefeHogar1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenJefeHogar1x1Texto1() {
        return campoNumeroOrdenIdenJefeHogar1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenJefeHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenJefeHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenJefeHogar1() {
        return converterNumeroOrdenIdenJefeHogar1;
    }
  
    public void setConverterNumeroOrdenIdenJefeHogar1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenJefeHogar1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenJefeHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenJefeHogar1() {
        return validatorNumeroOrdenIdenJefeHogar1;
    }
  
    public void setValidatorNumeroOrdenIdenJefeHogar1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenJefeHogar1 = validator;
    }
  
    private Label labelNombreRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreRespondente1() {
        return labelNombreRespondente1;
    }

    public void setLabelNombreRespondente1(Label l) {
        this.labelNombreRespondente1 = l;
    }

    private Label labelNombreRespondente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreRespondente1x1() {
        return labelNombreRespondente1x1;
    }

    public void setLabelNombreRespondente1x1(Label l) {
        this.labelNombreRespondente1x1 = l;
    }

    private TextField campoNombreRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreRespondente1() {
        return campoNombreRespondente1;
    }

    public void setCampoNombreRespondente1(TextField component) {
        this.campoNombreRespondente1 = component;
    }

    private TextField campoNombreRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreRespondente1x1() {
        return campoNombreRespondente1x1;
    }

    public void setCampoNombreRespondente1x1(TextField component) {
        this.campoNombreRespondente1x1 = component;
    }

    private HelpInline helpInlineNombreRespondente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreRespondente1() {
        return helpInlineNombreRespondente1;
    }

    public void setHelpInlineNombreRespondente1(HelpInline hi) {
        this.helpInlineNombreRespondente1 = hi;
    }

    private HelpInline helpInlineNombreRespondente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreRespondente1x1() {
        return helpInlineNombreRespondente1x1;
    }

    public void setHelpInlineNombreRespondente1x1(HelpInline hi) {
        this.helpInlineNombreRespondente1x1 = hi;
    }

    private StaticText campoNombreRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreRespondente1Texto1() {
        return campoNombreRespondente1Texto1;
    }

    public void setCampoNombreRespondente1Texto1(StaticText component) {
        this.campoNombreRespondente1Texto1 = component;
    }

    private StaticText campoNombreRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreRespondente1x1Texto1() {
        return campoNombreRespondente1x1Texto1;
    }

    public void setCampoNombreRespondente1x1Texto1(StaticText component) {
        this.campoNombreRespondente1x1Texto1 = component;
    }

    private LengthValidator validatorNombreRespondente1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreRespondente1() {
        return validatorNombreRespondente1;
    }
  
    public void setValidatorNombreRespondente1(LengthValidator validator) {
        this.validatorNombreRespondente1 = validator;
    }
  
    private Label labelNumeroCedulaRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedulaRespondente1() {
        return labelNumeroCedulaRespondente1;
    }

    public void setLabelNumeroCedulaRespondente1(Label l) {
        this.labelNumeroCedulaRespondente1 = l;
    }

    private Label labelNumeroCedulaRespondente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedulaRespondente1x1() {
        return labelNumeroCedulaRespondente1x1;
    }

    public void setLabelNumeroCedulaRespondente1x1(Label l) {
        this.labelNumeroCedulaRespondente1x1 = l;
    }

    private TextField campoNumeroCedulaRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroCedulaRespondente1() {
        return campoNumeroCedulaRespondente1;
    }

    public void setCampoNumeroCedulaRespondente1(TextField component) {
        this.campoNumeroCedulaRespondente1 = component;
    }

    private TextField campoNumeroCedulaRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroCedulaRespondente1x1() {
        return campoNumeroCedulaRespondente1x1;
    }

    public void setCampoNumeroCedulaRespondente1x1(TextField component) {
        this.campoNumeroCedulaRespondente1x1 = component;
    }

    private HelpInline helpInlineNumeroCedulaRespondente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCedulaRespondente1() {
        return helpInlineNumeroCedulaRespondente1;
    }

    public void setHelpInlineNumeroCedulaRespondente1(HelpInline hi) {
        this.helpInlineNumeroCedulaRespondente1 = hi;
    }

    private HelpInline helpInlineNumeroCedulaRespondente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCedulaRespondente1x1() {
        return helpInlineNumeroCedulaRespondente1x1;
    }

    public void setHelpInlineNumeroCedulaRespondente1x1(HelpInline hi) {
        this.helpInlineNumeroCedulaRespondente1x1 = hi;
    }

    private StaticText campoNumeroCedulaRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaRespondente1Texto1() {
        return campoNumeroCedulaRespondente1Texto1;
    }

    public void setCampoNumeroCedulaRespondente1Texto1(StaticText component) {
        this.campoNumeroCedulaRespondente1Texto1 = component;
    }

    private StaticText campoNumeroCedulaRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaRespondente1x1Texto1() {
        return campoNumeroCedulaRespondente1x1Texto1;
    }

    public void setCampoNumeroCedulaRespondente1x1Texto1(StaticText component) {
        this.campoNumeroCedulaRespondente1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCedulaRespondente1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCedulaRespondente1() {
        return converterNumeroCedulaRespondente1;
    }
  
    public void setConverterNumeroCedulaRespondente1(IntegerConverter converter) {
        this.converterNumeroCedulaRespondente1 = converter;
    }
  
    private LongRangeValidator validatorNumeroCedulaRespondente1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroCedulaRespondente1() {
        return validatorNumeroCedulaRespondente1;
    }
  
    public void setValidatorNumeroCedulaRespondente1(LongRangeValidator validator) {
        this.validatorNumeroCedulaRespondente1 = validator;
    }
  
    private Label labelLetraCedulaRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedulaRespondente1() {
        return labelLetraCedulaRespondente1;
    }

    public void setLabelLetraCedulaRespondente1(Label l) {
        this.labelLetraCedulaRespondente1 = l;
    }

    private Label labelLetraCedulaRespondente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedulaRespondente1x1() {
        return labelLetraCedulaRespondente1x1;
    }

    public void setLabelLetraCedulaRespondente1x1(Label l) {
        this.labelLetraCedulaRespondente1x1 = l;
    }

    private TextField campoLetraCedulaRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLetraCedulaRespondente1() {
        return campoLetraCedulaRespondente1;
    }

    public void setCampoLetraCedulaRespondente1(TextField component) {
        this.campoLetraCedulaRespondente1 = component;
    }

    private TextField campoLetraCedulaRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLetraCedulaRespondente1x1() {
        return campoLetraCedulaRespondente1x1;
    }

    public void setCampoLetraCedulaRespondente1x1(TextField component) {
        this.campoLetraCedulaRespondente1x1 = component;
    }

    private HelpInline helpInlineLetraCedulaRespondente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCedulaRespondente1() {
        return helpInlineLetraCedulaRespondente1;
    }

    public void setHelpInlineLetraCedulaRespondente1(HelpInline hi) {
        this.helpInlineLetraCedulaRespondente1 = hi;
    }

    private HelpInline helpInlineLetraCedulaRespondente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCedulaRespondente1x1() {
        return helpInlineLetraCedulaRespondente1x1;
    }

    public void setHelpInlineLetraCedulaRespondente1x1(HelpInline hi) {
        this.helpInlineLetraCedulaRespondente1x1 = hi;
    }

    private StaticText campoLetraCedulaRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaRespondente1Texto1() {
        return campoLetraCedulaRespondente1Texto1;
    }

    public void setCampoLetraCedulaRespondente1Texto1(StaticText component) {
        this.campoLetraCedulaRespondente1Texto1 = component;
    }

    private StaticText campoLetraCedulaRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaRespondente1x1Texto1() {
        return campoLetraCedulaRespondente1x1Texto1;
    }

    public void setCampoLetraCedulaRespondente1x1Texto1(StaticText component) {
        this.campoLetraCedulaRespondente1x1Texto1 = component;
    }

    private LengthValidator validatorLetraCedulaRespondente1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCedulaRespondente1() {
        return validatorLetraCedulaRespondente1;
    }
  
    public void setValidatorLetraCedulaRespondente1(LengthValidator validator) {
        this.validatorLetraCedulaRespondente1 = validator;
    }
  
    private Label labelNumeroOrdenIdenRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenRespondente1() {
        return labelNumeroOrdenIdenRespondente1;
    }

    public void setLabelNumeroOrdenIdenRespondente1(Label l) {
        this.labelNumeroOrdenIdenRespondente1 = l;
    }

    private Label labelNumeroOrdenIdenRespondente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenRespondente1x1() {
        return labelNumeroOrdenIdenRespondente1x1;
    }

    public void setLabelNumeroOrdenIdenRespondente1x1(Label l) {
        this.labelNumeroOrdenIdenRespondente1x1 = l;
    }

    private TextField campoNumeroOrdenIdenRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenRespondente1() {
        return campoNumeroOrdenIdenRespondente1;
    }

    public void setCampoNumeroOrdenIdenRespondente1(TextField component) {
        this.campoNumeroOrdenIdenRespondente1 = component;
    }

    private TextField campoNumeroOrdenIdenRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenRespondente1x1() {
        return campoNumeroOrdenIdenRespondente1x1;
    }

    public void setCampoNumeroOrdenIdenRespondente1x1(TextField component) {
        this.campoNumeroOrdenIdenRespondente1x1 = component;
    }

    private HelpInline helpInlineNumeroOrdenIdenRespondente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenRespondente1() {
        return helpInlineNumeroOrdenIdenRespondente1;
    }

    public void setHelpInlineNumeroOrdenIdenRespondente1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenRespondente1 = hi;
    }

    private HelpInline helpInlineNumeroOrdenIdenRespondente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenRespondente1x1() {
        return helpInlineNumeroOrdenIdenRespondente1x1;
    }

    public void setHelpInlineNumeroOrdenIdenRespondente1x1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenRespondente1x1 = hi;
    }

    private StaticText campoNumeroOrdenIdenRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenRespondente1Texto1() {
        return campoNumeroOrdenIdenRespondente1Texto1;
    }

    public void setCampoNumeroOrdenIdenRespondente1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenRespondente1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenRespondente1x1Texto1() {
        return campoNumeroOrdenIdenRespondente1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenRespondente1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenRespondente1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenRespondente1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenRespondente1() {
        return converterNumeroOrdenIdenRespondente1;
    }
  
    public void setConverterNumeroOrdenIdenRespondente1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenRespondente1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenRespondente1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenRespondente1() {
        return validatorNumeroOrdenIdenRespondente1;
    }
  
    public void setValidatorNumeroOrdenIdenRespondente1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenRespondente1 = validator;
    }
  
    private Label labelIdProveedorDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt1() {
        return labelIdProveedorDatExt1;
    }

    public void setLabelIdProveedorDatExt1(Label l) {
        this.labelIdProveedorDatExt1 = l;
    }

    private Label labelIdProveedorDatExt1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt1x1() {
        return labelIdProveedorDatExt1x1;
    }

    public void setLabelIdProveedorDatExt1x1(Label l) {
        this.labelIdProveedorDatExt1x1 = l;
    }

    private TextField campoIdProveedorDatExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdProveedorDatExt1() {
        return campoIdProveedorDatExt1;
    }

    public void setCampoIdProveedorDatExt1(TextField component) {
        this.campoIdProveedorDatExt1 = component;
    }

    private TextField campoIdProveedorDatExt1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdProveedorDatExt1x1() {
        return campoIdProveedorDatExt1x1;
    }

    public void setCampoIdProveedorDatExt1x1(TextField component) {
        this.campoIdProveedorDatExt1x1 = component;
    }

    private HelpInline helpInlineIdProveedorDatExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdProveedorDatExt1() {
        return helpInlineIdProveedorDatExt1;
    }

    public void setHelpInlineIdProveedorDatExt1(HelpInline hi) {
        this.helpInlineIdProveedorDatExt1 = hi;
    }

    private HelpInline helpInlineIdProveedorDatExt1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdProveedorDatExt1x1() {
        return helpInlineIdProveedorDatExt1x1;
    }

    public void setHelpInlineIdProveedorDatExt1x1(HelpInline hi) {
        this.helpInlineIdProveedorDatExt1x1 = hi;
    }

    private StaticText campoIdProveedorDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdProveedorDatExt1Texto1() {
        return campoIdProveedorDatExt1Texto1;
    }

    public void setCampoIdProveedorDatExt1Texto1(StaticText component) {
        this.campoIdProveedorDatExt1Texto1 = component;
    }

    private StaticText campoIdProveedorDatExt1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdProveedorDatExt1x1Texto1() {
        return campoIdProveedorDatExt1x1Texto1;
    }

    public void setCampoIdProveedorDatExt1x1Texto1(StaticText component) {
        this.campoIdProveedorDatExt1x1Texto1 = component;
    }

    private Button campoIdProveedorDatExt1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdProveedorDatExt1Boton1() {
        return campoIdProveedorDatExt1Boton1;
    }

    public void setCampoIdProveedorDatExt1Boton1(Button component) {
        this.campoIdProveedorDatExt1Boton1 = component;
    }

    private Button campoIdProveedorDatExt1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdProveedorDatExt1x1Boton1() {
        return campoIdProveedorDatExt1x1Boton1;
    }

    public void setCampoIdProveedorDatExt1x1Boton1(Button component) {
        this.campoIdProveedorDatExt1x1Boton1 = component;
    }

    private Button campoIdProveedorDatExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1Boton3() {
        return campoIdProveedorDatExt1Boton3;
    }

    public void setCampoIdProveedorDatExt1Boton3(Button component) {
        this.campoIdProveedorDatExt1Boton3 = component;
    }

    private Button campoIdProveedorDatExt1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1x1Boton3() {
        return campoIdProveedorDatExt1x1Boton3;
    }

    public void setCampoIdProveedorDatExt1x1Boton3(Button component) {
        this.campoIdProveedorDatExt1x1Boton3 = component;
    }

    private Label labelIdProveedorDatExt2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt2() {
        return labelIdProveedorDatExt2;
    }

    public void setLabelIdProveedorDatExt2(Label l) {
        this.labelIdProveedorDatExt2 = l;
    }

    private Label labelIdProveedorDatExt1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt1x2() {
        return labelIdProveedorDatExt1x2;
    }

    public void setLabelIdProveedorDatExt1x2(Label l) {
        this.labelIdProveedorDatExt1x2 = l;
    }

    private StaticText campoIdProveedorDatExt1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdProveedorDatExt1Texto2() {
        return campoIdProveedorDatExt1Texto2;
    }

    public void setCampoIdProveedorDatExt1Texto2(StaticText component) {
        this.campoIdProveedorDatExt1Texto2 = component;
    }

    private StaticText campoIdProveedorDatExt1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdProveedorDatExt1x1Texto2() {
        return campoIdProveedorDatExt1x1Texto2;
    }

    public void setCampoIdProveedorDatExt1x1Texto2(StaticText component) {
        this.campoIdProveedorDatExt1x1Texto2 = component;
    }

    private Button campoIdProveedorDatExt1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1Boton2() {
        return campoIdProveedorDatExt1Boton2;
    }

    public void setCampoIdProveedorDatExt1Boton2(Button component) {
        this.campoIdProveedorDatExt1Boton2 = component;
    }

    private Button campoIdProveedorDatExt1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1x1Boton2() {
        return campoIdProveedorDatExt1x1Boton2;
    }

    public void setCampoIdProveedorDatExt1x1Boton2(Button component) {
        this.campoIdProveedorDatExt1x1Boton2 = component;
    }

    private Label labelIndiceCalidadVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVida1() {
        return labelIndiceCalidadVida1;
    }

    public void setLabelIndiceCalidadVida1(Label l) {
        this.labelIndiceCalidadVida1 = l;
    }

    private Label labelIndiceCalidadVida1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVida1x1() {
        return labelIndiceCalidadVida1x1;
    }

    public void setLabelIndiceCalidadVida1x1(Label l) {
        this.labelIndiceCalidadVida1x1 = l;
    }

    private TextField campoIndiceCalidadVida1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIndiceCalidadVida1() {
        return campoIndiceCalidadVida1;
    }

    public void setCampoIndiceCalidadVida1(TextField component) {
        this.campoIndiceCalidadVida1 = component;
    }

    private TextField campoIndiceCalidadVida1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIndiceCalidadVida1x1() {
        return campoIndiceCalidadVida1x1;
    }

    public void setCampoIndiceCalidadVida1x1(TextField component) {
        this.campoIndiceCalidadVida1x1 = component;
    }

    private HelpInline helpInlineIndiceCalidadVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVida1() {
        return helpInlineIndiceCalidadVida1;
    }

    public void setHelpInlineIndiceCalidadVida1(HelpInline hi) {
        this.helpInlineIndiceCalidadVida1 = hi;
    }

    private HelpInline helpInlineIndiceCalidadVida1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVida1x1() {
        return helpInlineIndiceCalidadVida1x1;
    }

    public void setHelpInlineIndiceCalidadVida1x1(HelpInline hi) {
        this.helpInlineIndiceCalidadVida1x1 = hi;
    }

    private StaticText campoIndiceCalidadVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVida1Texto1() {
        return campoIndiceCalidadVida1Texto1;
    }

    public void setCampoIndiceCalidadVida1Texto1(StaticText component) {
        this.campoIndiceCalidadVida1Texto1 = component;
    }

    private StaticText campoIndiceCalidadVida1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVida1x1Texto1() {
        return campoIndiceCalidadVida1x1Texto1;
    }

    public void setCampoIndiceCalidadVida1x1Texto1(StaticText component) {
        this.campoIndiceCalidadVida1x1Texto1 = component;
    }

    private NumberConverter converterIndiceCalidadVida1 = new NumberConverter();
  
    public NumberConverter getConverterIndiceCalidadVida1() {
        return converterIndiceCalidadVida1;
    }
  
    public void setConverterIndiceCalidadVida1(NumberConverter converter) {
        this.converterIndiceCalidadVida1 = converter;
    }
  
    private DoubleRangeValidator validatorIndiceCalidadVida1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorIndiceCalidadVida1() {
        return validatorIndiceCalidadVida1;
    }
  
    public void setValidatorIndiceCalidadVida1(DoubleRangeValidator validator) {
        this.validatorIndiceCalidadVida1 = validator;
    }
  
    private Label labelEsFichaHogarInactiva1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsFichaHogarInactiva1() {
        return labelEsFichaHogarInactiva1;
    }

    public void setLabelEsFichaHogarInactiva1(Label l) {
        this.labelEsFichaHogarInactiva1 = l;
    }

    private Label labelEsFichaHogarInactiva1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsFichaHogarInactiva1x1() {
        return labelEsFichaHogarInactiva1x1;
    }

    public void setLabelEsFichaHogarInactiva1x1(Label l) {
        this.labelEsFichaHogarInactiva1x1 = l;
    }

    private DropDown listaEsFichaHogarInactiva1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsFichaHogarInactiva1() {
        return listaEsFichaHogarInactiva1;
    }

    public void setListaEsFichaHogarInactiva1(DropDown component) {
        this.listaEsFichaHogarInactiva1 = component;
    }

    private DropDown listaEsFichaHogarInactiva1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsFichaHogarInactiva1x1() {
        return listaEsFichaHogarInactiva1x1;
    }

    public void setListaEsFichaHogarInactiva1x1(DropDown component) {
        this.listaEsFichaHogarInactiva1x1 = component;
    }

    private HelpInline helpInlineEsFichaHogarInactiva1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsFichaHogarInactiva1() {
        return helpInlineEsFichaHogarInactiva1;
    }

    public void setHelpInlineEsFichaHogarInactiva1(HelpInline hi) {
        this.helpInlineEsFichaHogarInactiva1 = hi;
    }

    private HelpInline helpInlineEsFichaHogarInactiva1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsFichaHogarInactiva1x1() {
        return helpInlineEsFichaHogarInactiva1x1;
    }

    public void setHelpInlineEsFichaHogarInactiva1x1(HelpInline hi) {
        this.helpInlineEsFichaHogarInactiva1x1 = hi;
    }

    private StaticText listaEsFichaHogarInactiva1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsFichaHogarInactiva1Texto1() {
        return listaEsFichaHogarInactiva1Texto1;
    }

    public void setListaEsFichaHogarInactiva1Texto1(StaticText component) {
        this.listaEsFichaHogarInactiva1Texto1 = component;
    }

    private StaticText listaEsFichaHogarInactiva1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsFichaHogarInactiva1x1Texto1() {
        return listaEsFichaHogarInactiva1x1Texto1;
    }

    public void setListaEsFichaHogarInactiva1x1Texto1(StaticText component) {
        this.listaEsFichaHogarInactiva1x1Texto1 = component;
    }

    private IntegerConverter converterEsFichaHogarInactiva1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsFichaHogarInactiva1() {
        return converterEsFichaHogarInactiva1;
    }
  
    public void setConverterEsFichaHogarInactiva1(IntegerConverter converter) {
        this.converterEsFichaHogarInactiva1 = converter;
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

    private FichaHogarCachedRowSetDataProvider2 fichaHogarDataProvider = new FichaHogarCachedRowSetDataProvider2();

    @Override
    public FichaHogarCachedRowSetDataProvider2 getFichaHogarDataProvider() {
        return fichaHogarDataProvider;
    }

    public void setFichaHogarDataProvider(FichaHogarCachedRowSetDataProvider2 crsdp) {
        this.fichaHogarDataProvider = crsdp;
    }

    private FuncionarioCachedRowSetDataProvider2 funcionarioReferenceDataProvider = new FuncionarioCachedRowSetDataProvider2();

    @Override
    public FuncionarioCachedRowSetDataProvider2 getFuncionarioReferenceDataProvider() {
        return funcionarioReferenceDataProvider;
    }

    public void setFuncionarioReferenceDataProvider(FuncionarioCachedRowSetDataProvider2 crsdp) {
        this.funcionarioReferenceDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
    }

    private ProveedorDatExtCachedRowSetDataProvider2 proveedorDatExtReferenceDataProvider = new ProveedorDatExtCachedRowSetDataProvider2();

    @Override
    public ProveedorDatExtCachedRowSetDataProvider2 getProveedorDatExtReferenceDataProvider() {
        return proveedorDatExtReferenceDataProvider;
    }

    public void setProveedorDatExtReferenceDataProvider(ProveedorDatExtCachedRowSetDataProvider2 crsdp) {
        this.proveedorDatExtReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public FichaHogar6() {
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
        fichaHogarDataProvider.close();
        funcionarioReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
        proveedorDatExtReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionFichaHogar...">
    @Override
    public TextField getTextFieldCampoFechaEntrevista1() {
        return this.getCampoFechaEntrevista1();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionFichaHogar asistente = new AsistentePaginaActualizacionFichaHogar(this);

    public AsistentePaginaActualizacionFichaHogar getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("FichaHogar6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("FichaHogar6_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getFichaHogarDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return FichaHogarCachedRowSetDataProvider2.FUNCION_CONSULTAR_FICHA_HOGAR;
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
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(3);
        converterIndiceCalidadVida1.setMaxFractionDigits(4);
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
        String urx = URX2.COMANDO_FICHA_HOGAR;
        return this.getGestor().getScriptAbrirVentana(urx);
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
        String urx = URX2.COMANDO_FICHA_HOGAR;
        return this.getGestor().getScriptAbrirVentana(urx);
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
    public void campoIdFuncionarioCensista1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioCensista1_validate(context, component, value);
    }

    public void campoIdFuncionarioSupervisor1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioSupervisor1_validate(context, component, value);
    }

    public void campoIdFuncionarioCriticoDeco1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioCriticoDeco1_validate(context, component, value);
    }

    public void campoIdFuncionarioDigitador1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioDigitador1_validate(context, component, value);
    }

    public void campoIdDepartamento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDepartamento1_validate(context, component, value);
    }

    public void campoIdDistrito1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDistrito1_validate(context, component, value);
    }

    public void campoIdBarrio1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdBarrio1_validate(context, component, value);
    }

    public void campoIdProveedorDatExt1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdProveedorDatExt1_validate(context, component, value);
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
    @EJB
    FichaHogarBusinessProcessLocal fichaHogarBusinessProcess;

    @Override
    public Object getFichaHogarBusinessProcess() {
        return fichaHogarBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
