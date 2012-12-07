/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.manual;

import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
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
import com.egt.ejb.business.process.UbicacionBusinessProcessLocal;

public class Ubicacion2 extends AbstractPageBean
        implements PaginaActualizacionUbicacion, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdUbicacion1.setMinimum(0L);
        validatorIdUbicacion1.setMaximum(1000000000000000000L);
        validatorCodigoUbicacion1.setMaximum(30);
        validatorNombreUbicacion1.setMaximum(100);
        validatorSecuenciaUbicacion1.setMinimum(0L);
        validatorSecuenciaUbicacion1.setMaximum(100L);
        validatorClaveUbicacion1.setMaximum(30);
        ubicacionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
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

    private Label labelIdUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUbicacion1() {
        return labelIdUbicacion1;
    }

    public void setLabelIdUbicacion1(Label l) {
        this.labelIdUbicacion1 = l;
    }

    private TextField campoIdUbicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUbicacion1() {
        return campoIdUbicacion1;
    }

    public void setCampoIdUbicacion1(TextField component) {
        this.campoIdUbicacion1 = component;
    }

    private HelpInline helpInlineIdUbicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUbicacion1() {
        return helpInlineIdUbicacion1;
    }

    public void setHelpInlineIdUbicacion1(HelpInline hi) {
        this.helpInlineIdUbicacion1 = hi;
    }

    private StaticText campoIdUbicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUbicacion1Texto1() {
        return campoIdUbicacion1Texto1;
    }

    public void setCampoIdUbicacion1Texto1(StaticText component) {
        this.campoIdUbicacion1Texto1 = component;
    }

    private LongConverter converterIdUbicacion1 = new LongConverter();
  
    public LongConverter getConverterIdUbicacion1() {
        return converterIdUbicacion1;
    }
  
    public void setConverterIdUbicacion1(LongConverter converter) {
        this.converterIdUbicacion1 = converter;
    }
  
    private LongRangeValidator validatorIdUbicacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdUbicacion1() {
        return validatorIdUbicacion1;
    }
  
    public void setValidatorIdUbicacion1(LongRangeValidator validator) {
        this.validatorIdUbicacion1 = validator;
    }
  
    private Label labelCodigoUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoUbicacion1() {
        return labelCodigoUbicacion1;
    }

    public void setLabelCodigoUbicacion1(Label l) {
        this.labelCodigoUbicacion1 = l;
    }

    private TextField campoCodigoUbicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoUbicacion1() {
        return campoCodigoUbicacion1;
    }

    public void setCampoCodigoUbicacion1(TextField component) {
        this.campoCodigoUbicacion1 = component;
    }

    private HelpInline helpInlineCodigoUbicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoUbicacion1() {
        return helpInlineCodigoUbicacion1;
    }

    public void setHelpInlineCodigoUbicacion1(HelpInline hi) {
        this.helpInlineCodigoUbicacion1 = hi;
    }

    private StaticText campoCodigoUbicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoUbicacion1Texto1() {
        return campoCodigoUbicacion1Texto1;
    }

    public void setCampoCodigoUbicacion1Texto1(StaticText component) {
        this.campoCodigoUbicacion1Texto1 = component;
    }

    private LengthValidator validatorCodigoUbicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoUbicacion1() {
        return validatorCodigoUbicacion1;
    }
  
    public void setValidatorCodigoUbicacion1(LengthValidator validator) {
        this.validatorCodigoUbicacion1 = validator;
    }
  
    private Label labelNombreUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreUbicacion1() {
        return labelNombreUbicacion1;
    }

    public void setLabelNombreUbicacion1(Label l) {
        this.labelNombreUbicacion1 = l;
    }

    private TextField campoNombreUbicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreUbicacion1() {
        return campoNombreUbicacion1;
    }

    public void setCampoNombreUbicacion1(TextField component) {
        this.campoNombreUbicacion1 = component;
    }

    private HelpInline helpInlineNombreUbicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreUbicacion1() {
        return helpInlineNombreUbicacion1;
    }

    public void setHelpInlineNombreUbicacion1(HelpInline hi) {
        this.helpInlineNombreUbicacion1 = hi;
    }

    private StaticText campoNombreUbicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreUbicacion1Texto1() {
        return campoNombreUbicacion1Texto1;
    }

    public void setCampoNombreUbicacion1Texto1(StaticText component) {
        this.campoNombreUbicacion1Texto1 = component;
    }

    private LengthValidator validatorNombreUbicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreUbicacion1() {
        return validatorNombreUbicacion1;
    }
  
    public void setValidatorNombreUbicacion1(LengthValidator validator) {
        this.validatorNombreUbicacion1 = validator;
    }
  
    private Label labelIdUbicacionSuperior1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUbicacionSuperior1() {
        return labelIdUbicacionSuperior1;
    }

    public void setLabelIdUbicacionSuperior1(Label l) {
        this.labelIdUbicacionSuperior1 = l;
    }

    private TextField campoIdUbicacionSuperior1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUbicacionSuperior1() {
        return campoIdUbicacionSuperior1;
    }

    public void setCampoIdUbicacionSuperior1(TextField component) {
        this.campoIdUbicacionSuperior1 = component;
    }

    private HelpInline helpInlineIdUbicacionSuperior1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUbicacionSuperior1() {
        return helpInlineIdUbicacionSuperior1;
    }

    public void setHelpInlineIdUbicacionSuperior1(HelpInline hi) {
        this.helpInlineIdUbicacionSuperior1 = hi;
    }

    private StaticText campoIdUbicacionSuperior1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUbicacionSuperior1Texto1() {
        return campoIdUbicacionSuperior1Texto1;
    }

    public void setCampoIdUbicacionSuperior1Texto1(StaticText component) {
        this.campoIdUbicacionSuperior1Texto1 = component;
    }

    private Button campoIdUbicacionSuperior1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUbicacionSuperior1Boton1() {
        return campoIdUbicacionSuperior1Boton1;
    }

    public void setCampoIdUbicacionSuperior1Boton1(Button component) {
        this.campoIdUbicacionSuperior1Boton1 = component;
    }

    private Button campoIdUbicacionSuperior1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUbicacionSuperior1Boton3() {
        return campoIdUbicacionSuperior1Boton3;
    }

    public void setCampoIdUbicacionSuperior1Boton3(Button component) {
        this.campoIdUbicacionSuperior1Boton3 = component;
    }

    private Label labelIdUbicacionSuperior2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUbicacionSuperior2() {
        return labelIdUbicacionSuperior2;
    }

    public void setLabelIdUbicacionSuperior2(Label l) {
        this.labelIdUbicacionSuperior2 = l;
    }

    private StaticText campoIdUbicacionSuperior1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUbicacionSuperior1Texto2() {
        return campoIdUbicacionSuperior1Texto2;
    }

    public void setCampoIdUbicacionSuperior1Texto2(StaticText component) {
        this.campoIdUbicacionSuperior1Texto2 = component;
    }

    private Button campoIdUbicacionSuperior1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUbicacionSuperior1Boton2() {
        return campoIdUbicacionSuperior1Boton2;
    }

    public void setCampoIdUbicacionSuperior1Boton2(Button component) {
        this.campoIdUbicacionSuperior1Boton2 = component;
    }

    private Label labelNumeroTipoNodo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoNodo1() {
        return labelNumeroTipoNodo1;
    }

    public void setLabelNumeroTipoNodo1(Label l) {
        this.labelNumeroTipoNodo1 = l;
    }

    private DropDown listaNumeroTipoNodo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoNodo1() {
        return listaNumeroTipoNodo1;
    }

    public void setListaNumeroTipoNodo1(DropDown component) {
        this.listaNumeroTipoNodo1 = component;
    }

    private HelpInline helpInlineNumeroTipoNodo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoNodo1() {
        return helpInlineNumeroTipoNodo1;
    }

    public void setHelpInlineNumeroTipoNodo1(HelpInline hi) {
        this.helpInlineNumeroTipoNodo1 = hi;
    }

    private StaticText listaNumeroTipoNodo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoNodo1Texto1() {
        return listaNumeroTipoNodo1Texto1;
    }

    public void setListaNumeroTipoNodo1Texto1(StaticText component) {
        this.listaNumeroTipoNodo1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoNodo1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoNodo1() {
        return converterNumeroTipoNodo1;
    }
  
    public void setConverterNumeroTipoNodo1(IntegerConverter converter) {
        this.converterNumeroTipoNodo1 = converter;
    }
  
    private Label labelNumeroNivelUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroNivelUbicacion1() {
        return labelNumeroNivelUbicacion1;
    }

    public void setLabelNumeroNivelUbicacion1(Label l) {
        this.labelNumeroNivelUbicacion1 = l;
    }

    private DropDown listaNumeroNivelUbicacion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroNivelUbicacion1() {
        return listaNumeroNivelUbicacion1;
    }

    public void setListaNumeroNivelUbicacion1(DropDown component) {
        this.listaNumeroNivelUbicacion1 = component;
    }

    private HelpInline helpInlineNumeroNivelUbicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroNivelUbicacion1() {
        return helpInlineNumeroNivelUbicacion1;
    }

    public void setHelpInlineNumeroNivelUbicacion1(HelpInline hi) {
        this.helpInlineNumeroNivelUbicacion1 = hi;
    }

    private StaticText listaNumeroNivelUbicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroNivelUbicacion1Texto1() {
        return listaNumeroNivelUbicacion1Texto1;
    }

    public void setListaNumeroNivelUbicacion1Texto1(StaticText component) {
        this.listaNumeroNivelUbicacion1Texto1 = component;
    }

    private IntegerConverter converterNumeroNivelUbicacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroNivelUbicacion1() {
        return converterNumeroNivelUbicacion1;
    }
  
    public void setConverterNumeroNivelUbicacion1(IntegerConverter converter) {
        this.converterNumeroNivelUbicacion1 = converter;
    }
  
    private Label labelSecuenciaUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSecuenciaUbicacion1() {
        return labelSecuenciaUbicacion1;
    }

    public void setLabelSecuenciaUbicacion1(Label l) {
        this.labelSecuenciaUbicacion1 = l;
    }

    private TextField campoSecuenciaUbicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoSecuenciaUbicacion1() {
        return campoSecuenciaUbicacion1;
    }

    public void setCampoSecuenciaUbicacion1(TextField component) {
        this.campoSecuenciaUbicacion1 = component;
    }

    private HelpInline helpInlineSecuenciaUbicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineSecuenciaUbicacion1() {
        return helpInlineSecuenciaUbicacion1;
    }

    public void setHelpInlineSecuenciaUbicacion1(HelpInline hi) {
        this.helpInlineSecuenciaUbicacion1 = hi;
    }

    private StaticText campoSecuenciaUbicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSecuenciaUbicacion1Texto1() {
        return campoSecuenciaUbicacion1Texto1;
    }

    public void setCampoSecuenciaUbicacion1Texto1(StaticText component) {
        this.campoSecuenciaUbicacion1Texto1 = component;
    }

    private IntegerConverter converterSecuenciaUbicacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterSecuenciaUbicacion1() {
        return converterSecuenciaUbicacion1;
    }
  
    public void setConverterSecuenciaUbicacion1(IntegerConverter converter) {
        this.converterSecuenciaUbicacion1 = converter;
    }
  
    private LongRangeValidator validatorSecuenciaUbicacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorSecuenciaUbicacion1() {
        return validatorSecuenciaUbicacion1;
    }
  
    public void setValidatorSecuenciaUbicacion1(LongRangeValidator validator) {
        this.validatorSecuenciaUbicacion1 = validator;
    }
  
    private Label labelClaveUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelClaveUbicacion1() {
        return labelClaveUbicacion1;
    }

    public void setLabelClaveUbicacion1(Label l) {
        this.labelClaveUbicacion1 = l;
    }

    private TextField campoClaveUbicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoClaveUbicacion1() {
        return campoClaveUbicacion1;
    }

    public void setCampoClaveUbicacion1(TextField component) {
        this.campoClaveUbicacion1 = component;
    }

    private HelpInline helpInlineClaveUbicacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineClaveUbicacion1() {
        return helpInlineClaveUbicacion1;
    }

    public void setHelpInlineClaveUbicacion1(HelpInline hi) {
        this.helpInlineClaveUbicacion1 = hi;
    }

    private StaticText campoClaveUbicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoClaveUbicacion1Texto1() {
        return campoClaveUbicacion1Texto1;
    }

    public void setCampoClaveUbicacion1Texto1(StaticText component) {
        this.campoClaveUbicacion1Texto1 = component;
    }

    private LengthValidator validatorClaveUbicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorClaveUbicacion1() {
        return validatorClaveUbicacion1;
    }
  
    public void setValidatorClaveUbicacion1(LengthValidator validator) {
        this.validatorClaveUbicacion1 = validator;
    }
  
    private Label labelNumeroTipoArea1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArea1() {
        return labelNumeroTipoArea1;
    }

    public void setLabelNumeroTipoArea1(Label l) {
        this.labelNumeroTipoArea1 = l;
    }

    private DropDown listaNumeroTipoArea1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoArea1() {
        return listaNumeroTipoArea1;
    }

    public void setListaNumeroTipoArea1(DropDown component) {
        this.listaNumeroTipoArea1 = component;
    }

    private HelpInline helpInlineNumeroTipoArea1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoArea1() {
        return helpInlineNumeroTipoArea1;
    }

    public void setHelpInlineNumeroTipoArea1(HelpInline hi) {
        this.helpInlineNumeroTipoArea1 = hi;
    }

    private StaticText listaNumeroTipoArea1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArea1Texto1() {
        return listaNumeroTipoArea1Texto1;
    }

    public void setListaNumeroTipoArea1Texto1(StaticText component) {
        this.listaNumeroTipoArea1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoArea1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoArea1() {
        return converterNumeroTipoArea1;
    }
  
    public void setConverterNumeroTipoArea1(IntegerConverter converter) {
        this.converterNumeroTipoArea1 = converter;
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

    private UbicacionCachedRowSetDataProvider2 ubicacionDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionDataProvider() {
        return ubicacionDataProvider;
    }

    public void setUbicacionDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public Ubicacion2() {
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
        ubicacionDataProvider.close();
        ubicacionReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionUbicacion...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionUbicacion asistente = new AsistentePaginaActualizacionUbicacion(this);

    public AsistentePaginaActualizacionUbicacion getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("Ubicacion2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("Ubicacion2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getUbicacionDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return UbicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_UBICACION;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return UbicacionCachedRowSetDataProvider2.FUNCION_CREAR_UBICACION;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return UbicacionCachedRowSetDataProvider2.FUNCION_MODIFICAR_UBICACION;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return UbicacionCachedRowSetDataProvider2.FUNCION_ELIMINAR_UBICACION;
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
        String urx = URX2.COMANDO_UBICACION;
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
        String urx = URX2.COMANDO_UBICACION;
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
    public void campoIdUbicacionSuperior1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUbicacionSuperior1_validate(context, component, value);
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
    UbicacionBusinessProcessLocal ubicacionBusinessProcess;

    @Override
    public Object getUbicacionBusinessProcess() {
        return ubicacionBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
