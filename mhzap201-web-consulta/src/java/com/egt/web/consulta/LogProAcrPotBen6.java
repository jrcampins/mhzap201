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

import com.egt.data.specific.xdp2.LogProAcrPotBenCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
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

public class LogProAcrPotBen6 extends AbstractPageBean
        implements PaginaActualizacionLogProAcrPotBen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdLogProAcrPotBen1.setMinimum(0L);
        validatorIdLogProAcrPotBen1.setMaximum(1000000000000000000L);
        validatorNombrePotencialBen1.setMaximum(255);
        validatorCodigoPotencialBen1.setMaximum(255);
        converterFechaRegistroPotBen1.setPattern("dd/MM/yyyy");
        converterFechaRegistroPotBen1.setType("date");
        validatorNombrePersona1.setMaximum(255);
        validatorCodigoPersona1.setMaximum(255);
        validatorCodigoFichaPersona1.setMaximum(255);
        validatorNombreFichaPersona1.setMaximum(255);
        validatorCodigoFichaHogar1.setMaximum(255);
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorIndiceCalidadVida1.setMinimum(0.0);
        validatorIndiceCalidadVida1.setMaximum(1.0E2);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        logProAcrPotBenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logProAcrPotBenRowSet}"));
        potencialBenReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.potencialBenReferenceRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
        fichaPersonaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaPersonaReferenceRowSet}"));
        fichaHogarReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaHogarReferenceRowSet}"));
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

    private Label labelIdLogProAcrPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogProAcrPotBen1() {
        return labelIdLogProAcrPotBen1;
    }

    public void setLabelIdLogProAcrPotBen1(Label l) {
        this.labelIdLogProAcrPotBen1 = l;
    }

    private TextField campoIdLogProAcrPotBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogProAcrPotBen1() {
        return campoIdLogProAcrPotBen1;
    }

    public void setCampoIdLogProAcrPotBen1(TextField component) {
        this.campoIdLogProAcrPotBen1 = component;
    }

    private HelpInline helpInlineIdLogProAcrPotBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdLogProAcrPotBen1() {
        return helpInlineIdLogProAcrPotBen1;
    }

    public void setHelpInlineIdLogProAcrPotBen1(HelpInline hi) {
        this.helpInlineIdLogProAcrPotBen1 = hi;
    }

    private StaticText campoIdLogProAcrPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogProAcrPotBen1Texto1() {
        return campoIdLogProAcrPotBen1Texto1;
    }

    public void setCampoIdLogProAcrPotBen1Texto1(StaticText component) {
        this.campoIdLogProAcrPotBen1Texto1 = component;
    }

    private LongConverter converterIdLogProAcrPotBen1 = new LongConverter();
  
    public LongConverter getConverterIdLogProAcrPotBen1() {
        return converterIdLogProAcrPotBen1;
    }
  
    public void setConverterIdLogProAcrPotBen1(LongConverter converter) {
        this.converterIdLogProAcrPotBen1 = converter;
    }
  
    private LongRangeValidator validatorIdLogProAcrPotBen1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogProAcrPotBen1() {
        return validatorIdLogProAcrPotBen1;
    }
  
    public void setValidatorIdLogProAcrPotBen1(LongRangeValidator validator) {
        this.validatorIdLogProAcrPotBen1 = validator;
    }
  
    private Label labelIdPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1() {
        return labelIdPotencialBen1;
    }

    public void setLabelIdPotencialBen1(Label l) {
        this.labelIdPotencialBen1 = l;
    }

    private TextField campoIdPotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPotencialBen1() {
        return campoIdPotencialBen1;
    }

    public void setCampoIdPotencialBen1(TextField component) {
        this.campoIdPotencialBen1 = component;
    }

    private HelpInline helpInlineIdPotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPotencialBen1() {
        return helpInlineIdPotencialBen1;
    }

    public void setHelpInlineIdPotencialBen1(HelpInline hi) {
        this.helpInlineIdPotencialBen1 = hi;
    }

    private StaticText campoIdPotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPotencialBen1Texto1() {
        return campoIdPotencialBen1Texto1;
    }

    public void setCampoIdPotencialBen1Texto1(StaticText component) {
        this.campoIdPotencialBen1Texto1 = component;
    }

    private Button campoIdPotencialBen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPotencialBen1Boton1() {
        return campoIdPotencialBen1Boton1;
    }

    public void setCampoIdPotencialBen1Boton1(Button component) {
        this.campoIdPotencialBen1Boton1 = component;
    }

    private Button campoIdPotencialBen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton3() {
        return campoIdPotencialBen1Boton3;
    }

    public void setCampoIdPotencialBen1Boton3(Button component) {
        this.campoIdPotencialBen1Boton3 = component;
    }

    private Label labelIdPotencialBen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen2() {
        return labelIdPotencialBen2;
    }

    public void setLabelIdPotencialBen2(Label l) {
        this.labelIdPotencialBen2 = l;
    }

    private StaticText campoIdPotencialBen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPotencialBen1Texto2() {
        return campoIdPotencialBen1Texto2;
    }

    public void setCampoIdPotencialBen1Texto2(StaticText component) {
        this.campoIdPotencialBen1Texto2 = component;
    }

    private Button campoIdPotencialBen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton2() {
        return campoIdPotencialBen1Boton2;
    }

    public void setCampoIdPotencialBen1Boton2(Button component) {
        this.campoIdPotencialBen1Boton2 = component;
    }

    private Label labelNombrePotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombrePotencialBen1() {
        return labelNombrePotencialBen1;
    }

    public void setLabelNombrePotencialBen1(Label l) {
        this.labelNombrePotencialBen1 = l;
    }

    private TextArea campoNombrePotencialBen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombrePotencialBen1() {
        return campoNombrePotencialBen1;
    }

    public void setCampoNombrePotencialBen1(TextArea component) {
        this.campoNombrePotencialBen1 = component;
    }

    private HelpInline helpInlineNombrePotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombrePotencialBen1() {
        return helpInlineNombrePotencialBen1;
    }

    public void setHelpInlineNombrePotencialBen1(HelpInline hi) {
        this.helpInlineNombrePotencialBen1 = hi;
    }

    private StaticText campoNombrePotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombrePotencialBen1Texto1() {
        return campoNombrePotencialBen1Texto1;
    }

    public void setCampoNombrePotencialBen1Texto1(StaticText component) {
        this.campoNombrePotencialBen1Texto1 = component;
    }

    private LengthValidator validatorNombrePotencialBen1 = new LengthValidator();
  
    public LengthValidator getValidatorNombrePotencialBen1() {
        return validatorNombrePotencialBen1;
    }
  
    public void setValidatorNombrePotencialBen1(LengthValidator validator) {
        this.validatorNombrePotencialBen1 = validator;
    }
  
    private Label labelCodigoPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoPotencialBen1() {
        return labelCodigoPotencialBen1;
    }

    public void setLabelCodigoPotencialBen1(Label l) {
        this.labelCodigoPotencialBen1 = l;
    }

    private TextArea campoCodigoPotencialBen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCodigoPotencialBen1() {
        return campoCodigoPotencialBen1;
    }

    public void setCampoCodigoPotencialBen1(TextArea component) {
        this.campoCodigoPotencialBen1 = component;
    }

    private HelpInline helpInlineCodigoPotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoPotencialBen1() {
        return helpInlineCodigoPotencialBen1;
    }

    public void setHelpInlineCodigoPotencialBen1(HelpInline hi) {
        this.helpInlineCodigoPotencialBen1 = hi;
    }

    private StaticText campoCodigoPotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoPotencialBen1Texto1() {
        return campoCodigoPotencialBen1Texto1;
    }

    public void setCampoCodigoPotencialBen1Texto1(StaticText component) {
        this.campoCodigoPotencialBen1Texto1 = component;
    }

    private LengthValidator validatorCodigoPotencialBen1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoPotencialBen1() {
        return validatorCodigoPotencialBen1;
    }
  
    public void setValidatorCodigoPotencialBen1(LengthValidator validator) {
        this.validatorCodigoPotencialBen1 = validator;
    }
  
    private Label labelFechaRegistroPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroPotBen1() {
        return labelFechaRegistroPotBen1;
    }

    public void setLabelFechaRegistroPotBen1(Label l) {
        this.labelFechaRegistroPotBen1 = l;
    }

    private Calendar campoFechaRegistroPotBen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroPotBen1() {
        return campoFechaRegistroPotBen1;
    }

    public void setCampoFechaRegistroPotBen1(Calendar component) {
        this.campoFechaRegistroPotBen1 = component;
    }

    private HelpInline helpInlineFechaRegistroPotBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroPotBen1() {
        return helpInlineFechaRegistroPotBen1;
    }

    public void setHelpInlineFechaRegistroPotBen1(HelpInline hi) {
        this.helpInlineFechaRegistroPotBen1 = hi;
    }

    private StaticText campoFechaRegistroPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroPotBen1Texto1() {
        return campoFechaRegistroPotBen1Texto1;
    }

    public void setCampoFechaRegistroPotBen1Texto1(StaticText component) {
        this.campoFechaRegistroPotBen1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRegistroPotBen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRegistroPotBen1() {
        return converterFechaRegistroPotBen1;
    }
  
    public void setConverterFechaRegistroPotBen1(SqlTimestampConverter converter) {
        this.converterFechaRegistroPotBen1 = converter;
    }
  
    private Label labelIdPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona1() {
        return labelIdPersona1;
    }

    public void setLabelIdPersona1(Label l) {
        this.labelIdPersona1 = l;
    }

    private TextField campoIdPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPersona1() {
        return campoIdPersona1;
    }

    public void setCampoIdPersona1(TextField component) {
        this.campoIdPersona1 = component;
    }

    private HelpInline helpInlineIdPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPersona1() {
        return helpInlineIdPersona1;
    }

    public void setHelpInlineIdPersona1(HelpInline hi) {
        this.helpInlineIdPersona1 = hi;
    }

    private StaticText campoIdPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPersona1Texto1() {
        return campoIdPersona1Texto1;
    }

    public void setCampoIdPersona1Texto1(StaticText component) {
        this.campoIdPersona1Texto1 = component;
    }

    private Button campoIdPersona1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPersona1Boton1() {
        return campoIdPersona1Boton1;
    }

    public void setCampoIdPersona1Boton1(Button component) {
        this.campoIdPersona1Boton1 = component;
    }

    private Button campoIdPersona1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1Boton3() {
        return campoIdPersona1Boton3;
    }

    public void setCampoIdPersona1Boton3(Button component) {
        this.campoIdPersona1Boton3 = component;
    }

    private Label labelIdPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona2() {
        return labelIdPersona2;
    }

    public void setLabelIdPersona2(Label l) {
        this.labelIdPersona2 = l;
    }

    private StaticText campoIdPersona1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPersona1Texto2() {
        return campoIdPersona1Texto2;
    }

    public void setCampoIdPersona1Texto2(StaticText component) {
        this.campoIdPersona1Texto2 = component;
    }

    private Button campoIdPersona1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1Boton2() {
        return campoIdPersona1Boton2;
    }

    public void setCampoIdPersona1Boton2(Button component) {
        this.campoIdPersona1Boton2 = component;
    }

    private Label labelNombrePersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombrePersona1() {
        return labelNombrePersona1;
    }

    public void setLabelNombrePersona1(Label l) {
        this.labelNombrePersona1 = l;
    }

    private TextArea campoNombrePersona1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombrePersona1() {
        return campoNombrePersona1;
    }

    public void setCampoNombrePersona1(TextArea component) {
        this.campoNombrePersona1 = component;
    }

    private HelpInline helpInlineNombrePersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombrePersona1() {
        return helpInlineNombrePersona1;
    }

    public void setHelpInlineNombrePersona1(HelpInline hi) {
        this.helpInlineNombrePersona1 = hi;
    }

    private StaticText campoNombrePersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombrePersona1Texto1() {
        return campoNombrePersona1Texto1;
    }

    public void setCampoNombrePersona1Texto1(StaticText component) {
        this.campoNombrePersona1Texto1 = component;
    }

    private LengthValidator validatorNombrePersona1 = new LengthValidator();
  
    public LengthValidator getValidatorNombrePersona1() {
        return validatorNombrePersona1;
    }
  
    public void setValidatorNombrePersona1(LengthValidator validator) {
        this.validatorNombrePersona1 = validator;
    }
  
    private Label labelCodigoPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoPersona1() {
        return labelCodigoPersona1;
    }

    public void setLabelCodigoPersona1(Label l) {
        this.labelCodigoPersona1 = l;
    }

    private TextArea campoCodigoPersona1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCodigoPersona1() {
        return campoCodigoPersona1;
    }

    public void setCampoCodigoPersona1(TextArea component) {
        this.campoCodigoPersona1 = component;
    }

    private HelpInline helpInlineCodigoPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoPersona1() {
        return helpInlineCodigoPersona1;
    }

    public void setHelpInlineCodigoPersona1(HelpInline hi) {
        this.helpInlineCodigoPersona1 = hi;
    }

    private StaticText campoCodigoPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoPersona1Texto1() {
        return campoCodigoPersona1Texto1;
    }

    public void setCampoCodigoPersona1Texto1(StaticText component) {
        this.campoCodigoPersona1Texto1 = component;
    }

    private LengthValidator validatorCodigoPersona1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoPersona1() {
        return validatorCodigoPersona1;
    }
  
    public void setValidatorCodigoPersona1(LengthValidator validator) {
        this.validatorCodigoPersona1 = validator;
    }
  
    private Label labelIdDepartamento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1() {
        return labelIdDepartamento1;
    }

    public void setLabelIdDepartamento1(Label l) {
        this.labelIdDepartamento1 = l;
    }

    private TextField campoIdDepartamento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDepartamento1() {
        return campoIdDepartamento1;
    }

    public void setCampoIdDepartamento1(TextField component) {
        this.campoIdDepartamento1 = component;
    }

    private HelpInline helpInlineIdDepartamento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamento1() {
        return helpInlineIdDepartamento1;
    }

    public void setHelpInlineIdDepartamento1(HelpInline hi) {
        this.helpInlineIdDepartamento1 = hi;
    }

    private StaticText campoIdDepartamento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamento1Texto1() {
        return campoIdDepartamento1Texto1;
    }

    public void setCampoIdDepartamento1Texto1(StaticText component) {
        this.campoIdDepartamento1Texto1 = component;
    }

    private Button campoIdDepartamento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamento1Boton1() {
        return campoIdDepartamento1Boton1;
    }

    public void setCampoIdDepartamento1Boton1(Button component) {
        this.campoIdDepartamento1Boton1 = component;
    }

    private Button campoIdDepartamento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton3() {
        return campoIdDepartamento1Boton3;
    }

    public void setCampoIdDepartamento1Boton3(Button component) {
        this.campoIdDepartamento1Boton3 = component;
    }

    private Label labelIdDepartamento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento2() {
        return labelIdDepartamento2;
    }

    public void setLabelIdDepartamento2(Label l) {
        this.labelIdDepartamento2 = l;
    }

    private StaticText campoIdDepartamento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamento1Texto2() {
        return campoIdDepartamento1Texto2;
    }

    public void setCampoIdDepartamento1Texto2(StaticText component) {
        this.campoIdDepartamento1Texto2 = component;
    }

    private Button campoIdDepartamento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton2() {
        return campoIdDepartamento1Boton2;
    }

    public void setCampoIdDepartamento1Boton2(Button component) {
        this.campoIdDepartamento1Boton2 = component;
    }

    private Label labelIdDistrito1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1() {
        return labelIdDistrito1;
    }

    public void setLabelIdDistrito1(Label l) {
        this.labelIdDistrito1 = l;
    }

    private TextField campoIdDistrito1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDistrito1() {
        return campoIdDistrito1;
    }

    public void setCampoIdDistrito1(TextField component) {
        this.campoIdDistrito1 = component;
    }

    private HelpInline helpInlineIdDistrito1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistrito1() {
        return helpInlineIdDistrito1;
    }

    public void setHelpInlineIdDistrito1(HelpInline hi) {
        this.helpInlineIdDistrito1 = hi;
    }

    private StaticText campoIdDistrito1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistrito1Texto1() {
        return campoIdDistrito1Texto1;
    }

    public void setCampoIdDistrito1Texto1(StaticText component) {
        this.campoIdDistrito1Texto1 = component;
    }

    private Button campoIdDistrito1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistrito1Boton1() {
        return campoIdDistrito1Boton1;
    }

    public void setCampoIdDistrito1Boton1(Button component) {
        this.campoIdDistrito1Boton1 = component;
    }

    private Button campoIdDistrito1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton3() {
        return campoIdDistrito1Boton3;
    }

    public void setCampoIdDistrito1Boton3(Button component) {
        this.campoIdDistrito1Boton3 = component;
    }

    private Label labelIdDistrito2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito2() {
        return labelIdDistrito2;
    }

    public void setLabelIdDistrito2(Label l) {
        this.labelIdDistrito2 = l;
    }

    private StaticText campoIdDistrito1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistrito1Texto2() {
        return campoIdDistrito1Texto2;
    }

    public void setCampoIdDistrito1Texto2(StaticText component) {
        this.campoIdDistrito1Texto2 = component;
    }

    private Button campoIdDistrito1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton2() {
        return campoIdDistrito1Boton2;
    }

    public void setCampoIdDistrito1Boton2(Button component) {
        this.campoIdDistrito1Boton2 = component;
    }

    private Label labelIdBarrio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1() {
        return labelIdBarrio1;
    }

    public void setLabelIdBarrio1(Label l) {
        this.labelIdBarrio1 = l;
    }

    private TextField campoIdBarrio1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdBarrio1() {
        return campoIdBarrio1;
    }

    public void setCampoIdBarrio1(TextField component) {
        this.campoIdBarrio1 = component;
    }

    private HelpInline helpInlineIdBarrio1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdBarrio1() {
        return helpInlineIdBarrio1;
    }

    public void setHelpInlineIdBarrio1(HelpInline hi) {
        this.helpInlineIdBarrio1 = hi;
    }

    private StaticText campoIdBarrio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdBarrio1Texto1() {
        return campoIdBarrio1Texto1;
    }

    public void setCampoIdBarrio1Texto1(StaticText component) {
        this.campoIdBarrio1Texto1 = component;
    }

    private Button campoIdBarrio1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdBarrio1Boton1() {
        return campoIdBarrio1Boton1;
    }

    public void setCampoIdBarrio1Boton1(Button component) {
        this.campoIdBarrio1Boton1 = component;
    }

    private Button campoIdBarrio1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton3() {
        return campoIdBarrio1Boton3;
    }

    public void setCampoIdBarrio1Boton3(Button component) {
        this.campoIdBarrio1Boton3 = component;
    }

    private Label labelIdBarrio2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio2() {
        return labelIdBarrio2;
    }

    public void setLabelIdBarrio2(Label l) {
        this.labelIdBarrio2 = l;
    }

    private StaticText campoIdBarrio1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdBarrio1Texto2() {
        return campoIdBarrio1Texto2;
    }

    public void setCampoIdBarrio1Texto2(StaticText component) {
        this.campoIdBarrio1Texto2 = component;
    }

    private Button campoIdBarrio1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton2() {
        return campoIdBarrio1Boton2;
    }

    public void setCampoIdBarrio1Boton2(Button component) {
        this.campoIdBarrio1Boton2 = component;
    }

    private Label labelIdFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona1() {
        return labelIdFichaPersona1;
    }

    public void setLabelIdFichaPersona1(Label l) {
        this.labelIdFichaPersona1 = l;
    }

    private TextField campoIdFichaPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFichaPersona1() {
        return campoIdFichaPersona1;
    }

    public void setCampoIdFichaPersona1(TextField component) {
        this.campoIdFichaPersona1 = component;
    }

    private HelpInline helpInlineIdFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaPersona1() {
        return helpInlineIdFichaPersona1;
    }

    public void setHelpInlineIdFichaPersona1(HelpInline hi) {
        this.helpInlineIdFichaPersona1 = hi;
    }

    private StaticText campoIdFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaPersona1Texto1() {
        return campoIdFichaPersona1Texto1;
    }

    public void setCampoIdFichaPersona1Texto1(StaticText component) {
        this.campoIdFichaPersona1Texto1 = component;
    }

    private Button campoIdFichaPersona1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaPersona1Boton1() {
        return campoIdFichaPersona1Boton1;
    }

    public void setCampoIdFichaPersona1Boton1(Button component) {
        this.campoIdFichaPersona1Boton1 = component;
    }

    private Button campoIdFichaPersona1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1Boton3() {
        return campoIdFichaPersona1Boton3;
    }

    public void setCampoIdFichaPersona1Boton3(Button component) {
        this.campoIdFichaPersona1Boton3 = component;
    }

    private Label labelIdFichaPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona2() {
        return labelIdFichaPersona2;
    }

    public void setLabelIdFichaPersona2(Label l) {
        this.labelIdFichaPersona2 = l;
    }

    private StaticText campoIdFichaPersona1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaPersona1Texto2() {
        return campoIdFichaPersona1Texto2;
    }

    public void setCampoIdFichaPersona1Texto2(StaticText component) {
        this.campoIdFichaPersona1Texto2 = component;
    }

    private Button campoIdFichaPersona1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1Boton2() {
        return campoIdFichaPersona1Boton2;
    }

    public void setCampoIdFichaPersona1Boton2(Button component) {
        this.campoIdFichaPersona1Boton2 = component;
    }

    private Label labelCodigoFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoFichaPersona1() {
        return labelCodigoFichaPersona1;
    }

    public void setLabelCodigoFichaPersona1(Label l) {
        this.labelCodigoFichaPersona1 = l;
    }

    private TextArea campoCodigoFichaPersona1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCodigoFichaPersona1() {
        return campoCodigoFichaPersona1;
    }

    public void setCampoCodigoFichaPersona1(TextArea component) {
        this.campoCodigoFichaPersona1 = component;
    }

    private HelpInline helpInlineCodigoFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoFichaPersona1() {
        return helpInlineCodigoFichaPersona1;
    }

    public void setHelpInlineCodigoFichaPersona1(HelpInline hi) {
        this.helpInlineCodigoFichaPersona1 = hi;
    }

    private StaticText campoCodigoFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoFichaPersona1Texto1() {
        return campoCodigoFichaPersona1Texto1;
    }

    public void setCampoCodigoFichaPersona1Texto1(StaticText component) {
        this.campoCodigoFichaPersona1Texto1 = component;
    }

    private LengthValidator validatorCodigoFichaPersona1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoFichaPersona1() {
        return validatorCodigoFichaPersona1;
    }
  
    public void setValidatorCodigoFichaPersona1(LengthValidator validator) {
        this.validatorCodigoFichaPersona1 = validator;
    }
  
    private Label labelNombreFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreFichaPersona1() {
        return labelNombreFichaPersona1;
    }

    public void setLabelNombreFichaPersona1(Label l) {
        this.labelNombreFichaPersona1 = l;
    }

    private TextArea campoNombreFichaPersona1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreFichaPersona1() {
        return campoNombreFichaPersona1;
    }

    public void setCampoNombreFichaPersona1(TextArea component) {
        this.campoNombreFichaPersona1 = component;
    }

    private HelpInline helpInlineNombreFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreFichaPersona1() {
        return helpInlineNombreFichaPersona1;
    }

    public void setHelpInlineNombreFichaPersona1(HelpInline hi) {
        this.helpInlineNombreFichaPersona1 = hi;
    }

    private StaticText campoNombreFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreFichaPersona1Texto1() {
        return campoNombreFichaPersona1Texto1;
    }

    public void setCampoNombreFichaPersona1Texto1(StaticText component) {
        this.campoNombreFichaPersona1Texto1 = component;
    }

    private LengthValidator validatorNombreFichaPersona1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreFichaPersona1() {
        return validatorNombreFichaPersona1;
    }
  
    public void setValidatorNombreFichaPersona1(LengthValidator validator) {
        this.validatorNombreFichaPersona1 = validator;
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

    private Button campoIdFichaHogar1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaHogar1Boton1() {
        return campoIdFichaHogar1Boton1;
    }

    public void setCampoIdFichaHogar1Boton1(Button component) {
        this.campoIdFichaHogar1Boton1 = component;
    }

    private Button campoIdFichaHogar1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1Boton3() {
        return campoIdFichaHogar1Boton3;
    }

    public void setCampoIdFichaHogar1Boton3(Button component) {
        this.campoIdFichaHogar1Boton3 = component;
    }

    private Label labelIdFichaHogar2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar2() {
        return labelIdFichaHogar2;
    }

    public void setLabelIdFichaHogar2(Label l) {
        this.labelIdFichaHogar2 = l;
    }

    private StaticText campoIdFichaHogar1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaHogar1Texto2() {
        return campoIdFichaHogar1Texto2;
    }

    public void setCampoIdFichaHogar1Texto2(StaticText component) {
        this.campoIdFichaHogar1Texto2 = component;
    }

    private Button campoIdFichaHogar1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1Boton2() {
        return campoIdFichaHogar1Boton2;
    }

    public void setCampoIdFichaHogar1Boton2(Button component) {
        this.campoIdFichaHogar1Boton2 = component;
    }

    private Label labelCodigoFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoFichaHogar1() {
        return labelCodigoFichaHogar1;
    }

    public void setLabelCodigoFichaHogar1(Label l) {
        this.labelCodigoFichaHogar1 = l;
    }

    private TextArea campoCodigoFichaHogar1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCodigoFichaHogar1() {
        return campoCodigoFichaHogar1;
    }

    public void setCampoCodigoFichaHogar1(TextArea component) {
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
  
    private Label labelIndiceCalidadVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVida1() {
        return labelIndiceCalidadVida1;
    }

    public void setLabelIndiceCalidadVida1(Label l) {
        this.labelIndiceCalidadVida1 = l;
    }

    private TextField campoIndiceCalidadVida1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIndiceCalidadVida1() {
        return campoIndiceCalidadVida1;
    }

    public void setCampoIndiceCalidadVida1(TextField component) {
        this.campoIndiceCalidadVida1 = component;
    }

    private HelpInline helpInlineIndiceCalidadVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVida1() {
        return helpInlineIndiceCalidadVida1;
    }

    public void setHelpInlineIndiceCalidadVida1(HelpInline hi) {
        this.helpInlineIndiceCalidadVida1 = hi;
    }

    private StaticText campoIndiceCalidadVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVida1Texto1() {
        return campoIndiceCalidadVida1Texto1;
    }

    public void setCampoIndiceCalidadVida1Texto1(StaticText component) {
        this.campoIndiceCalidadVida1Texto1 = component;
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
  
    private Label labelEsProcesado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsProcesado1() {
        return labelEsProcesado1;
    }

    public void setLabelEsProcesado1(Label l) {
        this.labelEsProcesado1 = l;
    }

    private DropDown listaEsProcesado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsProcesado1() {
        return listaEsProcesado1;
    }

    public void setListaEsProcesado1(DropDown component) {
        this.listaEsProcesado1 = component;
    }

    private HelpInline helpInlineEsProcesado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsProcesado1() {
        return helpInlineEsProcesado1;
    }

    public void setHelpInlineEsProcesado1(HelpInline hi) {
        this.helpInlineEsProcesado1 = hi;
    }

    private StaticText listaEsProcesado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsProcesado1Texto1() {
        return listaEsProcesado1Texto1;
    }

    public void setListaEsProcesado1Texto1(StaticText component) {
        this.listaEsProcesado1Texto1 = component;
    }

    private IntegerConverter converterEsProcesado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsProcesado1() {
        return converterEsProcesado1;
    }
  
    public void setConverterEsProcesado1(IntegerConverter converter) {
        this.converterEsProcesado1 = converter;
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

    private HelpInline helpInlineObservacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservacion1() {
        return helpInlineObservacion1;
    }

    public void setHelpInlineObservacion1(HelpInline hi) {
        this.helpInlineObservacion1 = hi;
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

    private HelpInline helpInlineFechaHoraTransaccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraTransaccion1() {
        return helpInlineFechaHoraTransaccion1;
    }

    public void setHelpInlineFechaHoraTransaccion1(HelpInline hi) {
        this.helpInlineFechaHoraTransaccion1 = hi;
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

    private LogProAcrPotBenCachedRowSetDataProvider2 logProAcrPotBenDataProvider = new LogProAcrPotBenCachedRowSetDataProvider2();

    @Override
    public LogProAcrPotBenCachedRowSetDataProvider2 getLogProAcrPotBenDataProvider() {
        return logProAcrPotBenDataProvider;
    }

    public void setLogProAcrPotBenDataProvider(LogProAcrPotBenCachedRowSetDataProvider2 crsdp) {
        this.logProAcrPotBenDataProvider = crsdp;
    }

    private PotencialBenCachedRowSetDataProvider2 potencialBenReferenceDataProvider = new PotencialBenCachedRowSetDataProvider2();

    @Override
    public PotencialBenCachedRowSetDataProvider2 getPotencialBenReferenceDataProvider() {
        return potencialBenReferenceDataProvider;
    }

    public void setPotencialBenReferenceDataProvider(PotencialBenCachedRowSetDataProvider2 crsdp) {
        this.potencialBenReferenceDataProvider = crsdp;
    }

    private PersonaCachedRowSetDataProvider2 personaReferenceDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider() {
        return personaReferenceDataProvider;
    }

    public void setPersonaReferenceDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaReferenceDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
    }

    private FichaPersonaCachedRowSetDataProvider2 fichaPersonaReferenceDataProvider = new FichaPersonaCachedRowSetDataProvider2();

    @Override
    public FichaPersonaCachedRowSetDataProvider2 getFichaPersonaReferenceDataProvider() {
        return fichaPersonaReferenceDataProvider;
    }

    public void setFichaPersonaReferenceDataProvider(FichaPersonaCachedRowSetDataProvider2 crsdp) {
        this.fichaPersonaReferenceDataProvider = crsdp;
    }

    private FichaHogarCachedRowSetDataProvider2 fichaHogarReferenceDataProvider = new FichaHogarCachedRowSetDataProvider2();

    @Override
    public FichaHogarCachedRowSetDataProvider2 getFichaHogarReferenceDataProvider() {
        return fichaHogarReferenceDataProvider;
    }

    public void setFichaHogarReferenceDataProvider(FichaHogarCachedRowSetDataProvider2 crsdp) {
        this.fichaHogarReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogProAcrPotBen6() {
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
        logProAcrPotBenDataProvider.close();
        potencialBenReferenceDataProvider.close();
        personaReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
        fichaPersonaReferenceDataProvider.close();
        fichaHogarReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogProAcrPotBen...">
    @Override
    public TextField getTextFieldCampoFechaRegistroPotBen1() {
        return this.getCampoFechaRegistroPotBen1();
    }

    @Override
    public TextField getTextFieldCampoFechaHoraTransaccion1() {
        return this.getCampoFechaHoraTransaccion1();
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
    private AsistentePaginaActualizacionLogProAcrPotBen asistente = new AsistentePaginaActualizacionLogProAcrPotBen(this);

    public AsistentePaginaActualizacionLogProAcrPotBen getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogProAcrPotBen6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogProAcrPotBen6_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogProAcrPotBenDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogProAcrPotBenCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_PRO_ACR_POT_BEN;
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
    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPotencialBen1_validate(context, component, value);
    }

    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPersona1_validate(context, component, value);
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

    public void campoIdFichaPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFichaPersona1_validate(context, component, value);
    }

    public void campoIdFichaHogar1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFichaHogar1_validate(context, component, value);
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
