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

import com.egt.data.specific.xdp2.LogImpHogCachedRowSetDataProvider2;
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

public class LogImpHog6 extends AbstractPageBean
        implements PaginaActualizacionLogImpHog, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdLogImpHog1.setMinimum(0L);
        validatorIdLogImpHog1.setMaximum(1000000000000000000L);
        validatorP20d1.setMaximum(255);
        validatorP20m1.setMaximum(255);
        validatorP20a1.setMaximum(255);
        validatorP171.setMaximum(255);
        validatorP181.setMaximum(255);
        validatorVar000011.setMaximum(255);
        validatorP191.setMaximum(255);
        validatorObservaciones1.setMaximum(255);
        validatorUtm1.setMaximum(255);
        validatorGps1.setMaximum(255);
        validatorOrden1.setMaximum(255);
        validatorCoordx1.setMaximum(255);
        validatorP01a1.setMaximum(255);
        validatorP01b1.setMaximum(255);
        validatorP01c1.setMaximum(255);
        validatorP01d1.setMaximum(255);
        validatorP021.setMaximum(255);
        validatorP031.setMaximum(255);
        validatorP041.setMaximum(255);
        validatorP051.setMaximum(255);
        validatorP061.setMaximum(255);
        validatorP081.setMaximum(255);
        validatorP071.setMaximum(255);
        validatorP091.setMaximum(255);
        validatorP141.setMaximum(255);
        validatorP151.setMaximum(255);
        validatorP161.setMaximum(255);
        validatorP241.setMaximum(255);
        validatorP251.setMaximum(255);
        validatorP261.setMaximum(255);
        validatorP271.setMaximum(255);
        validatorP27e1.setMaximum(255);
        validatorP28a1.setMaximum(255);
        validatorP28b1.setMaximum(255);
        validatorP291.setMaximum(255);
        validatorP301.setMaximum(255);
        validatorP311.setMaximum(255);
        validatorP321.setMaximum(255);
        validatorP331.setMaximum(255);
        validatorP341.setMaximum(255);
        validatorP351.setMaximum(255);
        validatorP361.setMaximum(255);
        validatorP371.setMaximum(255);
        validatorNroCelular1.setMaximum(255);
        validatorP381.setMaximum(255);
        validatorNroLineaBaja1.setMaximum(255);
        validatorP3911.setMaximum(255);
        validatorP3921.setMaximum(255);
        validatorP3931.setMaximum(255);
        validatorP3941.setMaximum(255);
        validatorP3951.setMaximum(255);
        validatorP3961.setMaximum(255);
        validatorP3971.setMaximum(255);
        validatorP42n1.setMaximum(255);
        validatorP42ci1.setMaximum(255);
        validatorLetraCi1.setMaximum(255);
        validatorP431.setMaximum(255);
        validatorVar000021.setMaximum(255);
        validatorVar000031.setMaximum(255);
        validatorVar000041.setMaximum(255);
        validatorP1041.setMaximum(255);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        validatorNombreArchivo1.setMaximum(8160);
        validatorCodigoArchivo1.setMaximum(8160);
        logImpHogDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logImpHogRowSet}"));
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

    private Label labelIdLogImpHog1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogImpHog1() {
        return labelIdLogImpHog1;
    }

    public void setLabelIdLogImpHog1(Label l) {
        this.labelIdLogImpHog1 = l;
    }

    private TextField campoIdLogImpHog1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogImpHog1() {
        return campoIdLogImpHog1;
    }

    public void setCampoIdLogImpHog1(TextField component) {
        this.campoIdLogImpHog1 = component;
    }

    private HelpInline helpInlineIdLogImpHog1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdLogImpHog1() {
        return helpInlineIdLogImpHog1;
    }

    public void setHelpInlineIdLogImpHog1(HelpInline hi) {
        this.helpInlineIdLogImpHog1 = hi;
    }

    private StaticText campoIdLogImpHog1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogImpHog1Texto1() {
        return campoIdLogImpHog1Texto1;
    }

    public void setCampoIdLogImpHog1Texto1(StaticText component) {
        this.campoIdLogImpHog1Texto1 = component;
    }

    private LongConverter converterIdLogImpHog1 = new LongConverter();
  
    public LongConverter getConverterIdLogImpHog1() {
        return converterIdLogImpHog1;
    }
  
    public void setConverterIdLogImpHog1(LongConverter converter) {
        this.converterIdLogImpHog1 = converter;
    }
  
    private LongRangeValidator validatorIdLogImpHog1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogImpHog1() {
        return validatorIdLogImpHog1;
    }
  
    public void setValidatorIdLogImpHog1(LongRangeValidator validator) {
        this.validatorIdLogImpHog1 = validator;
    }
  
    private Label labelP20d1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP20d1() {
        return labelP20d1;
    }

    public void setLabelP20d1(Label l) {
        this.labelP20d1 = l;
    }

    private TextArea campoP20d1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP20d1() {
        return campoP20d1;
    }

    public void setCampoP20d1(TextArea component) {
        this.campoP20d1 = component;
    }

    private HelpInline helpInlineP20d1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP20d1() {
        return helpInlineP20d1;
    }

    public void setHelpInlineP20d1(HelpInline hi) {
        this.helpInlineP20d1 = hi;
    }

    private StaticText campoP20d1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP20d1Texto1() {
        return campoP20d1Texto1;
    }

    public void setCampoP20d1Texto1(StaticText component) {
        this.campoP20d1Texto1 = component;
    }

    private LengthValidator validatorP20d1 = new LengthValidator();
  
    public LengthValidator getValidatorP20d1() {
        return validatorP20d1;
    }
  
    public void setValidatorP20d1(LengthValidator validator) {
        this.validatorP20d1 = validator;
    }
  
    private Label labelP20m1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP20m1() {
        return labelP20m1;
    }

    public void setLabelP20m1(Label l) {
        this.labelP20m1 = l;
    }

    private TextArea campoP20m1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP20m1() {
        return campoP20m1;
    }

    public void setCampoP20m1(TextArea component) {
        this.campoP20m1 = component;
    }

    private HelpInline helpInlineP20m1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP20m1() {
        return helpInlineP20m1;
    }

    public void setHelpInlineP20m1(HelpInline hi) {
        this.helpInlineP20m1 = hi;
    }

    private StaticText campoP20m1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP20m1Texto1() {
        return campoP20m1Texto1;
    }

    public void setCampoP20m1Texto1(StaticText component) {
        this.campoP20m1Texto1 = component;
    }

    private LengthValidator validatorP20m1 = new LengthValidator();
  
    public LengthValidator getValidatorP20m1() {
        return validatorP20m1;
    }
  
    public void setValidatorP20m1(LengthValidator validator) {
        this.validatorP20m1 = validator;
    }
  
    private Label labelP20a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP20a1() {
        return labelP20a1;
    }

    public void setLabelP20a1(Label l) {
        this.labelP20a1 = l;
    }

    private TextArea campoP20a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP20a1() {
        return campoP20a1;
    }

    public void setCampoP20a1(TextArea component) {
        this.campoP20a1 = component;
    }

    private HelpInline helpInlineP20a1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP20a1() {
        return helpInlineP20a1;
    }

    public void setHelpInlineP20a1(HelpInline hi) {
        this.helpInlineP20a1 = hi;
    }

    private StaticText campoP20a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP20a1Texto1() {
        return campoP20a1Texto1;
    }

    public void setCampoP20a1Texto1(StaticText component) {
        this.campoP20a1Texto1 = component;
    }

    private LengthValidator validatorP20a1 = new LengthValidator();
  
    public LengthValidator getValidatorP20a1() {
        return validatorP20a1;
    }
  
    public void setValidatorP20a1(LengthValidator validator) {
        this.validatorP20a1 = validator;
    }
  
    private Label labelP171 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP171() {
        return labelP171;
    }

    public void setLabelP171(Label l) {
        this.labelP171 = l;
    }

    private TextArea campoP171 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP171() {
        return campoP171;
    }

    public void setCampoP171(TextArea component) {
        this.campoP171 = component;
    }

    private HelpInline helpInlineP171 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP171() {
        return helpInlineP171;
    }

    public void setHelpInlineP171(HelpInline hi) {
        this.helpInlineP171 = hi;
    }

    private StaticText campoP171Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP171Texto1() {
        return campoP171Texto1;
    }

    public void setCampoP171Texto1(StaticText component) {
        this.campoP171Texto1 = component;
    }

    private LengthValidator validatorP171 = new LengthValidator();
  
    public LengthValidator getValidatorP171() {
        return validatorP171;
    }
  
    public void setValidatorP171(LengthValidator validator) {
        this.validatorP171 = validator;
    }
  
    private Label labelP181 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP181() {
        return labelP181;
    }

    public void setLabelP181(Label l) {
        this.labelP181 = l;
    }

    private TextArea campoP181 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP181() {
        return campoP181;
    }

    public void setCampoP181(TextArea component) {
        this.campoP181 = component;
    }

    private HelpInline helpInlineP181 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP181() {
        return helpInlineP181;
    }

    public void setHelpInlineP181(HelpInline hi) {
        this.helpInlineP181 = hi;
    }

    private StaticText campoP181Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP181Texto1() {
        return campoP181Texto1;
    }

    public void setCampoP181Texto1(StaticText component) {
        this.campoP181Texto1 = component;
    }

    private LengthValidator validatorP181 = new LengthValidator();
  
    public LengthValidator getValidatorP181() {
        return validatorP181;
    }
  
    public void setValidatorP181(LengthValidator validator) {
        this.validatorP181 = validator;
    }
  
    private Label labelVar000011 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000011() {
        return labelVar000011;
    }

    public void setLabelVar000011(Label l) {
        this.labelVar000011 = l;
    }

    private TextArea campoVar000011 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000011() {
        return campoVar000011;
    }

    public void setCampoVar000011(TextArea component) {
        this.campoVar000011 = component;
    }

    private HelpInline helpInlineVar000011 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineVar000011() {
        return helpInlineVar000011;
    }

    public void setHelpInlineVar000011(HelpInline hi) {
        this.helpInlineVar000011 = hi;
    }

    private StaticText campoVar000011Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000011Texto1() {
        return campoVar000011Texto1;
    }

    public void setCampoVar000011Texto1(StaticText component) {
        this.campoVar000011Texto1 = component;
    }

    private LengthValidator validatorVar000011 = new LengthValidator();
  
    public LengthValidator getValidatorVar000011() {
        return validatorVar000011;
    }
  
    public void setValidatorVar000011(LengthValidator validator) {
        this.validatorVar000011 = validator;
    }
  
    private Label labelP191 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP191() {
        return labelP191;
    }

    public void setLabelP191(Label l) {
        this.labelP191 = l;
    }

    private TextArea campoP191 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP191() {
        return campoP191;
    }

    public void setCampoP191(TextArea component) {
        this.campoP191 = component;
    }

    private HelpInline helpInlineP191 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP191() {
        return helpInlineP191;
    }

    public void setHelpInlineP191(HelpInline hi) {
        this.helpInlineP191 = hi;
    }

    private StaticText campoP191Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP191Texto1() {
        return campoP191Texto1;
    }

    public void setCampoP191Texto1(StaticText component) {
        this.campoP191Texto1 = component;
    }

    private LengthValidator validatorP191 = new LengthValidator();
  
    public LengthValidator getValidatorP191() {
        return validatorP191;
    }
  
    public void setValidatorP191(LengthValidator validator) {
        this.validatorP191 = validator;
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

    private HelpInline helpInlineObservaciones1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservaciones1() {
        return helpInlineObservaciones1;
    }

    public void setHelpInlineObservaciones1(HelpInline hi) {
        this.helpInlineObservaciones1 = hi;
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
  
    private Label labelUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelUtm1() {
        return labelUtm1;
    }

    public void setLabelUtm1(Label l) {
        this.labelUtm1 = l;
    }

    private TextArea campoUtm1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoUtm1() {
        return campoUtm1;
    }

    public void setCampoUtm1(TextArea component) {
        this.campoUtm1 = component;
    }

    private HelpInline helpInlineUtm1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineUtm1() {
        return helpInlineUtm1;
    }

    public void setHelpInlineUtm1(HelpInline hi) {
        this.helpInlineUtm1 = hi;
    }

    private StaticText campoUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoUtm1Texto1() {
        return campoUtm1Texto1;
    }

    public void setCampoUtm1Texto1(StaticText component) {
        this.campoUtm1Texto1 = component;
    }

    private LengthValidator validatorUtm1 = new LengthValidator();
  
    public LengthValidator getValidatorUtm1() {
        return validatorUtm1;
    }
  
    public void setValidatorUtm1(LengthValidator validator) {
        this.validatorUtm1 = validator;
    }
  
    private Label labelGps1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelGps1() {
        return labelGps1;
    }

    public void setLabelGps1(Label l) {
        this.labelGps1 = l;
    }

    private TextArea campoGps1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoGps1() {
        return campoGps1;
    }

    public void setCampoGps1(TextArea component) {
        this.campoGps1 = component;
    }

    private HelpInline helpInlineGps1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineGps1() {
        return helpInlineGps1;
    }

    public void setHelpInlineGps1(HelpInline hi) {
        this.helpInlineGps1 = hi;
    }

    private StaticText campoGps1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoGps1Texto1() {
        return campoGps1Texto1;
    }

    public void setCampoGps1Texto1(StaticText component) {
        this.campoGps1Texto1 = component;
    }

    private LengthValidator validatorGps1 = new LengthValidator();
  
    public LengthValidator getValidatorGps1() {
        return validatorGps1;
    }
  
    public void setValidatorGps1(LengthValidator validator) {
        this.validatorGps1 = validator;
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

    private HelpInline helpInlineOrden1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOrden1() {
        return helpInlineOrden1;
    }

    public void setHelpInlineOrden1(HelpInline hi) {
        this.helpInlineOrden1 = hi;
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
  
    private Label labelCoordx1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCoordx1() {
        return labelCoordx1;
    }

    public void setLabelCoordx1(Label l) {
        this.labelCoordx1 = l;
    }

    private TextArea campoCoordx1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCoordx1() {
        return campoCoordx1;
    }

    public void setCampoCoordx1(TextArea component) {
        this.campoCoordx1 = component;
    }

    private HelpInline helpInlineCoordx1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCoordx1() {
        return helpInlineCoordx1;
    }

    public void setHelpInlineCoordx1(HelpInline hi) {
        this.helpInlineCoordx1 = hi;
    }

    private StaticText campoCoordx1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCoordx1Texto1() {
        return campoCoordx1Texto1;
    }

    public void setCampoCoordx1Texto1(StaticText component) {
        this.campoCoordx1Texto1 = component;
    }

    private LengthValidator validatorCoordx1 = new LengthValidator();
  
    public LengthValidator getValidatorCoordx1() {
        return validatorCoordx1;
    }
  
    public void setValidatorCoordx1(LengthValidator validator) {
        this.validatorCoordx1 = validator;
    }
  
    private Label labelP01a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01a1() {
        return labelP01a1;
    }

    public void setLabelP01a1(Label l) {
        this.labelP01a1 = l;
    }

    private TextArea campoP01a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01a1() {
        return campoP01a1;
    }

    public void setCampoP01a1(TextArea component) {
        this.campoP01a1 = component;
    }

    private HelpInline helpInlineP01a1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP01a1() {
        return helpInlineP01a1;
    }

    public void setHelpInlineP01a1(HelpInline hi) {
        this.helpInlineP01a1 = hi;
    }

    private StaticText campoP01a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01a1Texto1() {
        return campoP01a1Texto1;
    }

    public void setCampoP01a1Texto1(StaticText component) {
        this.campoP01a1Texto1 = component;
    }

    private LengthValidator validatorP01a1 = new LengthValidator();
  
    public LengthValidator getValidatorP01a1() {
        return validatorP01a1;
    }
  
    public void setValidatorP01a1(LengthValidator validator) {
        this.validatorP01a1 = validator;
    }
  
    private Label labelP01b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01b1() {
        return labelP01b1;
    }

    public void setLabelP01b1(Label l) {
        this.labelP01b1 = l;
    }

    private TextArea campoP01b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01b1() {
        return campoP01b1;
    }

    public void setCampoP01b1(TextArea component) {
        this.campoP01b1 = component;
    }

    private HelpInline helpInlineP01b1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP01b1() {
        return helpInlineP01b1;
    }

    public void setHelpInlineP01b1(HelpInline hi) {
        this.helpInlineP01b1 = hi;
    }

    private StaticText campoP01b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01b1Texto1() {
        return campoP01b1Texto1;
    }

    public void setCampoP01b1Texto1(StaticText component) {
        this.campoP01b1Texto1 = component;
    }

    private LengthValidator validatorP01b1 = new LengthValidator();
  
    public LengthValidator getValidatorP01b1() {
        return validatorP01b1;
    }
  
    public void setValidatorP01b1(LengthValidator validator) {
        this.validatorP01b1 = validator;
    }
  
    private Label labelP01c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01c1() {
        return labelP01c1;
    }

    public void setLabelP01c1(Label l) {
        this.labelP01c1 = l;
    }

    private TextArea campoP01c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01c1() {
        return campoP01c1;
    }

    public void setCampoP01c1(TextArea component) {
        this.campoP01c1 = component;
    }

    private HelpInline helpInlineP01c1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP01c1() {
        return helpInlineP01c1;
    }

    public void setHelpInlineP01c1(HelpInline hi) {
        this.helpInlineP01c1 = hi;
    }

    private StaticText campoP01c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01c1Texto1() {
        return campoP01c1Texto1;
    }

    public void setCampoP01c1Texto1(StaticText component) {
        this.campoP01c1Texto1 = component;
    }

    private LengthValidator validatorP01c1 = new LengthValidator();
  
    public LengthValidator getValidatorP01c1() {
        return validatorP01c1;
    }
  
    public void setValidatorP01c1(LengthValidator validator) {
        this.validatorP01c1 = validator;
    }
  
    private Label labelP01d1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP01d1() {
        return labelP01d1;
    }

    public void setLabelP01d1(Label l) {
        this.labelP01d1 = l;
    }

    private TextArea campoP01d1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP01d1() {
        return campoP01d1;
    }

    public void setCampoP01d1(TextArea component) {
        this.campoP01d1 = component;
    }

    private HelpInline helpInlineP01d1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP01d1() {
        return helpInlineP01d1;
    }

    public void setHelpInlineP01d1(HelpInline hi) {
        this.helpInlineP01d1 = hi;
    }

    private StaticText campoP01d1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP01d1Texto1() {
        return campoP01d1Texto1;
    }

    public void setCampoP01d1Texto1(StaticText component) {
        this.campoP01d1Texto1 = component;
    }

    private LengthValidator validatorP01d1 = new LengthValidator();
  
    public LengthValidator getValidatorP01d1() {
        return validatorP01d1;
    }
  
    public void setValidatorP01d1(LengthValidator validator) {
        this.validatorP01d1 = validator;
    }
  
    private Label labelP021 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP021() {
        return labelP021;
    }

    public void setLabelP021(Label l) {
        this.labelP021 = l;
    }

    private TextArea campoP021 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP021() {
        return campoP021;
    }

    public void setCampoP021(TextArea component) {
        this.campoP021 = component;
    }

    private HelpInline helpInlineP021 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP021() {
        return helpInlineP021;
    }

    public void setHelpInlineP021(HelpInline hi) {
        this.helpInlineP021 = hi;
    }

    private StaticText campoP021Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP021Texto1() {
        return campoP021Texto1;
    }

    public void setCampoP021Texto1(StaticText component) {
        this.campoP021Texto1 = component;
    }

    private LengthValidator validatorP021 = new LengthValidator();
  
    public LengthValidator getValidatorP021() {
        return validatorP021;
    }
  
    public void setValidatorP021(LengthValidator validator) {
        this.validatorP021 = validator;
    }
  
    private Label labelP031 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP031() {
        return labelP031;
    }

    public void setLabelP031(Label l) {
        this.labelP031 = l;
    }

    private TextArea campoP031 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP031() {
        return campoP031;
    }

    public void setCampoP031(TextArea component) {
        this.campoP031 = component;
    }

    private HelpInline helpInlineP031 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP031() {
        return helpInlineP031;
    }

    public void setHelpInlineP031(HelpInline hi) {
        this.helpInlineP031 = hi;
    }

    private StaticText campoP031Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP031Texto1() {
        return campoP031Texto1;
    }

    public void setCampoP031Texto1(StaticText component) {
        this.campoP031Texto1 = component;
    }

    private LengthValidator validatorP031 = new LengthValidator();
  
    public LengthValidator getValidatorP031() {
        return validatorP031;
    }
  
    public void setValidatorP031(LengthValidator validator) {
        this.validatorP031 = validator;
    }
  
    private Label labelP041 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP041() {
        return labelP041;
    }

    public void setLabelP041(Label l) {
        this.labelP041 = l;
    }

    private TextArea campoP041 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP041() {
        return campoP041;
    }

    public void setCampoP041(TextArea component) {
        this.campoP041 = component;
    }

    private HelpInline helpInlineP041 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP041() {
        return helpInlineP041;
    }

    public void setHelpInlineP041(HelpInline hi) {
        this.helpInlineP041 = hi;
    }

    private StaticText campoP041Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP041Texto1() {
        return campoP041Texto1;
    }

    public void setCampoP041Texto1(StaticText component) {
        this.campoP041Texto1 = component;
    }

    private LengthValidator validatorP041 = new LengthValidator();
  
    public LengthValidator getValidatorP041() {
        return validatorP041;
    }
  
    public void setValidatorP041(LengthValidator validator) {
        this.validatorP041 = validator;
    }
  
    private Label labelP051 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP051() {
        return labelP051;
    }

    public void setLabelP051(Label l) {
        this.labelP051 = l;
    }

    private TextArea campoP051 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP051() {
        return campoP051;
    }

    public void setCampoP051(TextArea component) {
        this.campoP051 = component;
    }

    private HelpInline helpInlineP051 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP051() {
        return helpInlineP051;
    }

    public void setHelpInlineP051(HelpInline hi) {
        this.helpInlineP051 = hi;
    }

    private StaticText campoP051Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP051Texto1() {
        return campoP051Texto1;
    }

    public void setCampoP051Texto1(StaticText component) {
        this.campoP051Texto1 = component;
    }

    private LengthValidator validatorP051 = new LengthValidator();
  
    public LengthValidator getValidatorP051() {
        return validatorP051;
    }
  
    public void setValidatorP051(LengthValidator validator) {
        this.validatorP051 = validator;
    }
  
    private Label labelP061 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP061() {
        return labelP061;
    }

    public void setLabelP061(Label l) {
        this.labelP061 = l;
    }

    private TextArea campoP061 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP061() {
        return campoP061;
    }

    public void setCampoP061(TextArea component) {
        this.campoP061 = component;
    }

    private HelpInline helpInlineP061 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP061() {
        return helpInlineP061;
    }

    public void setHelpInlineP061(HelpInline hi) {
        this.helpInlineP061 = hi;
    }

    private StaticText campoP061Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP061Texto1() {
        return campoP061Texto1;
    }

    public void setCampoP061Texto1(StaticText component) {
        this.campoP061Texto1 = component;
    }

    private LengthValidator validatorP061 = new LengthValidator();
  
    public LengthValidator getValidatorP061() {
        return validatorP061;
    }
  
    public void setValidatorP061(LengthValidator validator) {
        this.validatorP061 = validator;
    }
  
    private Label labelP081 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP081() {
        return labelP081;
    }

    public void setLabelP081(Label l) {
        this.labelP081 = l;
    }

    private TextArea campoP081 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP081() {
        return campoP081;
    }

    public void setCampoP081(TextArea component) {
        this.campoP081 = component;
    }

    private HelpInline helpInlineP081 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP081() {
        return helpInlineP081;
    }

    public void setHelpInlineP081(HelpInline hi) {
        this.helpInlineP081 = hi;
    }

    private StaticText campoP081Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP081Texto1() {
        return campoP081Texto1;
    }

    public void setCampoP081Texto1(StaticText component) {
        this.campoP081Texto1 = component;
    }

    private LengthValidator validatorP081 = new LengthValidator();
  
    public LengthValidator getValidatorP081() {
        return validatorP081;
    }
  
    public void setValidatorP081(LengthValidator validator) {
        this.validatorP081 = validator;
    }
  
    private Label labelP071 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP071() {
        return labelP071;
    }

    public void setLabelP071(Label l) {
        this.labelP071 = l;
    }

    private TextArea campoP071 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP071() {
        return campoP071;
    }

    public void setCampoP071(TextArea component) {
        this.campoP071 = component;
    }

    private HelpInline helpInlineP071 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP071() {
        return helpInlineP071;
    }

    public void setHelpInlineP071(HelpInline hi) {
        this.helpInlineP071 = hi;
    }

    private StaticText campoP071Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP071Texto1() {
        return campoP071Texto1;
    }

    public void setCampoP071Texto1(StaticText component) {
        this.campoP071Texto1 = component;
    }

    private LengthValidator validatorP071 = new LengthValidator();
  
    public LengthValidator getValidatorP071() {
        return validatorP071;
    }
  
    public void setValidatorP071(LengthValidator validator) {
        this.validatorP071 = validator;
    }
  
    private Label labelP091 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP091() {
        return labelP091;
    }

    public void setLabelP091(Label l) {
        this.labelP091 = l;
    }

    private TextArea campoP091 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP091() {
        return campoP091;
    }

    public void setCampoP091(TextArea component) {
        this.campoP091 = component;
    }

    private HelpInline helpInlineP091 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP091() {
        return helpInlineP091;
    }

    public void setHelpInlineP091(HelpInline hi) {
        this.helpInlineP091 = hi;
    }

    private StaticText campoP091Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP091Texto1() {
        return campoP091Texto1;
    }

    public void setCampoP091Texto1(StaticText component) {
        this.campoP091Texto1 = component;
    }

    private LengthValidator validatorP091 = new LengthValidator();
  
    public LengthValidator getValidatorP091() {
        return validatorP091;
    }
  
    public void setValidatorP091(LengthValidator validator) {
        this.validatorP091 = validator;
    }
  
    private Label labelP141 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP141() {
        return labelP141;
    }

    public void setLabelP141(Label l) {
        this.labelP141 = l;
    }

    private TextArea campoP141 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP141() {
        return campoP141;
    }

    public void setCampoP141(TextArea component) {
        this.campoP141 = component;
    }

    private HelpInline helpInlineP141 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP141() {
        return helpInlineP141;
    }

    public void setHelpInlineP141(HelpInline hi) {
        this.helpInlineP141 = hi;
    }

    private StaticText campoP141Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP141Texto1() {
        return campoP141Texto1;
    }

    public void setCampoP141Texto1(StaticText component) {
        this.campoP141Texto1 = component;
    }

    private LengthValidator validatorP141 = new LengthValidator();
  
    public LengthValidator getValidatorP141() {
        return validatorP141;
    }
  
    public void setValidatorP141(LengthValidator validator) {
        this.validatorP141 = validator;
    }
  
    private Label labelP151 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP151() {
        return labelP151;
    }

    public void setLabelP151(Label l) {
        this.labelP151 = l;
    }

    private TextArea campoP151 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP151() {
        return campoP151;
    }

    public void setCampoP151(TextArea component) {
        this.campoP151 = component;
    }

    private HelpInline helpInlineP151 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP151() {
        return helpInlineP151;
    }

    public void setHelpInlineP151(HelpInline hi) {
        this.helpInlineP151 = hi;
    }

    private StaticText campoP151Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP151Texto1() {
        return campoP151Texto1;
    }

    public void setCampoP151Texto1(StaticText component) {
        this.campoP151Texto1 = component;
    }

    private LengthValidator validatorP151 = new LengthValidator();
  
    public LengthValidator getValidatorP151() {
        return validatorP151;
    }
  
    public void setValidatorP151(LengthValidator validator) {
        this.validatorP151 = validator;
    }
  
    private Label labelP161 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP161() {
        return labelP161;
    }

    public void setLabelP161(Label l) {
        this.labelP161 = l;
    }

    private TextArea campoP161 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP161() {
        return campoP161;
    }

    public void setCampoP161(TextArea component) {
        this.campoP161 = component;
    }

    private HelpInline helpInlineP161 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP161() {
        return helpInlineP161;
    }

    public void setHelpInlineP161(HelpInline hi) {
        this.helpInlineP161 = hi;
    }

    private StaticText campoP161Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP161Texto1() {
        return campoP161Texto1;
    }

    public void setCampoP161Texto1(StaticText component) {
        this.campoP161Texto1 = component;
    }

    private LengthValidator validatorP161 = new LengthValidator();
  
    public LengthValidator getValidatorP161() {
        return validatorP161;
    }
  
    public void setValidatorP161(LengthValidator validator) {
        this.validatorP161 = validator;
    }
  
    private Label labelP241 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP241() {
        return labelP241;
    }

    public void setLabelP241(Label l) {
        this.labelP241 = l;
    }

    private TextArea campoP241 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP241() {
        return campoP241;
    }

    public void setCampoP241(TextArea component) {
        this.campoP241 = component;
    }

    private HelpInline helpInlineP241 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP241() {
        return helpInlineP241;
    }

    public void setHelpInlineP241(HelpInline hi) {
        this.helpInlineP241 = hi;
    }

    private StaticText campoP241Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP241Texto1() {
        return campoP241Texto1;
    }

    public void setCampoP241Texto1(StaticText component) {
        this.campoP241Texto1 = component;
    }

    private LengthValidator validatorP241 = new LengthValidator();
  
    public LengthValidator getValidatorP241() {
        return validatorP241;
    }
  
    public void setValidatorP241(LengthValidator validator) {
        this.validatorP241 = validator;
    }
  
    private Label labelP251 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP251() {
        return labelP251;
    }

    public void setLabelP251(Label l) {
        this.labelP251 = l;
    }

    private TextArea campoP251 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP251() {
        return campoP251;
    }

    public void setCampoP251(TextArea component) {
        this.campoP251 = component;
    }

    private HelpInline helpInlineP251 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP251() {
        return helpInlineP251;
    }

    public void setHelpInlineP251(HelpInline hi) {
        this.helpInlineP251 = hi;
    }

    private StaticText campoP251Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP251Texto1() {
        return campoP251Texto1;
    }

    public void setCampoP251Texto1(StaticText component) {
        this.campoP251Texto1 = component;
    }

    private LengthValidator validatorP251 = new LengthValidator();
  
    public LengthValidator getValidatorP251() {
        return validatorP251;
    }
  
    public void setValidatorP251(LengthValidator validator) {
        this.validatorP251 = validator;
    }
  
    private Label labelP261 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP261() {
        return labelP261;
    }

    public void setLabelP261(Label l) {
        this.labelP261 = l;
    }

    private TextArea campoP261 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP261() {
        return campoP261;
    }

    public void setCampoP261(TextArea component) {
        this.campoP261 = component;
    }

    private HelpInline helpInlineP261 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP261() {
        return helpInlineP261;
    }

    public void setHelpInlineP261(HelpInline hi) {
        this.helpInlineP261 = hi;
    }

    private StaticText campoP261Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP261Texto1() {
        return campoP261Texto1;
    }

    public void setCampoP261Texto1(StaticText component) {
        this.campoP261Texto1 = component;
    }

    private LengthValidator validatorP261 = new LengthValidator();
  
    public LengthValidator getValidatorP261() {
        return validatorP261;
    }
  
    public void setValidatorP261(LengthValidator validator) {
        this.validatorP261 = validator;
    }
  
    private Label labelP271 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP271() {
        return labelP271;
    }

    public void setLabelP271(Label l) {
        this.labelP271 = l;
    }

    private TextArea campoP271 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP271() {
        return campoP271;
    }

    public void setCampoP271(TextArea component) {
        this.campoP271 = component;
    }

    private HelpInline helpInlineP271 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP271() {
        return helpInlineP271;
    }

    public void setHelpInlineP271(HelpInline hi) {
        this.helpInlineP271 = hi;
    }

    private StaticText campoP271Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP271Texto1() {
        return campoP271Texto1;
    }

    public void setCampoP271Texto1(StaticText component) {
        this.campoP271Texto1 = component;
    }

    private LengthValidator validatorP271 = new LengthValidator();
  
    public LengthValidator getValidatorP271() {
        return validatorP271;
    }
  
    public void setValidatorP271(LengthValidator validator) {
        this.validatorP271 = validator;
    }
  
    private Label labelP27e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP27e1() {
        return labelP27e1;
    }

    public void setLabelP27e1(Label l) {
        this.labelP27e1 = l;
    }

    private TextArea campoP27e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP27e1() {
        return campoP27e1;
    }

    public void setCampoP27e1(TextArea component) {
        this.campoP27e1 = component;
    }

    private HelpInline helpInlineP27e1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP27e1() {
        return helpInlineP27e1;
    }

    public void setHelpInlineP27e1(HelpInline hi) {
        this.helpInlineP27e1 = hi;
    }

    private StaticText campoP27e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP27e1Texto1() {
        return campoP27e1Texto1;
    }

    public void setCampoP27e1Texto1(StaticText component) {
        this.campoP27e1Texto1 = component;
    }

    private LengthValidator validatorP27e1 = new LengthValidator();
  
    public LengthValidator getValidatorP27e1() {
        return validatorP27e1;
    }
  
    public void setValidatorP27e1(LengthValidator validator) {
        this.validatorP27e1 = validator;
    }
  
    private Label labelP28a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP28a1() {
        return labelP28a1;
    }

    public void setLabelP28a1(Label l) {
        this.labelP28a1 = l;
    }

    private TextArea campoP28a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP28a1() {
        return campoP28a1;
    }

    public void setCampoP28a1(TextArea component) {
        this.campoP28a1 = component;
    }

    private HelpInline helpInlineP28a1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP28a1() {
        return helpInlineP28a1;
    }

    public void setHelpInlineP28a1(HelpInline hi) {
        this.helpInlineP28a1 = hi;
    }

    private StaticText campoP28a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP28a1Texto1() {
        return campoP28a1Texto1;
    }

    public void setCampoP28a1Texto1(StaticText component) {
        this.campoP28a1Texto1 = component;
    }

    private LengthValidator validatorP28a1 = new LengthValidator();
  
    public LengthValidator getValidatorP28a1() {
        return validatorP28a1;
    }
  
    public void setValidatorP28a1(LengthValidator validator) {
        this.validatorP28a1 = validator;
    }
  
    private Label labelP28b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP28b1() {
        return labelP28b1;
    }

    public void setLabelP28b1(Label l) {
        this.labelP28b1 = l;
    }

    private TextArea campoP28b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP28b1() {
        return campoP28b1;
    }

    public void setCampoP28b1(TextArea component) {
        this.campoP28b1 = component;
    }

    private HelpInline helpInlineP28b1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP28b1() {
        return helpInlineP28b1;
    }

    public void setHelpInlineP28b1(HelpInline hi) {
        this.helpInlineP28b1 = hi;
    }

    private StaticText campoP28b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP28b1Texto1() {
        return campoP28b1Texto1;
    }

    public void setCampoP28b1Texto1(StaticText component) {
        this.campoP28b1Texto1 = component;
    }

    private LengthValidator validatorP28b1 = new LengthValidator();
  
    public LengthValidator getValidatorP28b1() {
        return validatorP28b1;
    }
  
    public void setValidatorP28b1(LengthValidator validator) {
        this.validatorP28b1 = validator;
    }
  
    private Label labelP291 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP291() {
        return labelP291;
    }

    public void setLabelP291(Label l) {
        this.labelP291 = l;
    }

    private TextArea campoP291 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP291() {
        return campoP291;
    }

    public void setCampoP291(TextArea component) {
        this.campoP291 = component;
    }

    private HelpInline helpInlineP291 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP291() {
        return helpInlineP291;
    }

    public void setHelpInlineP291(HelpInline hi) {
        this.helpInlineP291 = hi;
    }

    private StaticText campoP291Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP291Texto1() {
        return campoP291Texto1;
    }

    public void setCampoP291Texto1(StaticText component) {
        this.campoP291Texto1 = component;
    }

    private LengthValidator validatorP291 = new LengthValidator();
  
    public LengthValidator getValidatorP291() {
        return validatorP291;
    }
  
    public void setValidatorP291(LengthValidator validator) {
        this.validatorP291 = validator;
    }
  
    private Label labelP301 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP301() {
        return labelP301;
    }

    public void setLabelP301(Label l) {
        this.labelP301 = l;
    }

    private TextArea campoP301 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP301() {
        return campoP301;
    }

    public void setCampoP301(TextArea component) {
        this.campoP301 = component;
    }

    private HelpInline helpInlineP301 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP301() {
        return helpInlineP301;
    }

    public void setHelpInlineP301(HelpInline hi) {
        this.helpInlineP301 = hi;
    }

    private StaticText campoP301Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP301Texto1() {
        return campoP301Texto1;
    }

    public void setCampoP301Texto1(StaticText component) {
        this.campoP301Texto1 = component;
    }

    private LengthValidator validatorP301 = new LengthValidator();
  
    public LengthValidator getValidatorP301() {
        return validatorP301;
    }
  
    public void setValidatorP301(LengthValidator validator) {
        this.validatorP301 = validator;
    }
  
    private Label labelP311 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP311() {
        return labelP311;
    }

    public void setLabelP311(Label l) {
        this.labelP311 = l;
    }

    private TextArea campoP311 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP311() {
        return campoP311;
    }

    public void setCampoP311(TextArea component) {
        this.campoP311 = component;
    }

    private HelpInline helpInlineP311 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP311() {
        return helpInlineP311;
    }

    public void setHelpInlineP311(HelpInline hi) {
        this.helpInlineP311 = hi;
    }

    private StaticText campoP311Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP311Texto1() {
        return campoP311Texto1;
    }

    public void setCampoP311Texto1(StaticText component) {
        this.campoP311Texto1 = component;
    }

    private LengthValidator validatorP311 = new LengthValidator();
  
    public LengthValidator getValidatorP311() {
        return validatorP311;
    }
  
    public void setValidatorP311(LengthValidator validator) {
        this.validatorP311 = validator;
    }
  
    private Label labelP321 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP321() {
        return labelP321;
    }

    public void setLabelP321(Label l) {
        this.labelP321 = l;
    }

    private TextArea campoP321 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP321() {
        return campoP321;
    }

    public void setCampoP321(TextArea component) {
        this.campoP321 = component;
    }

    private HelpInline helpInlineP321 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP321() {
        return helpInlineP321;
    }

    public void setHelpInlineP321(HelpInline hi) {
        this.helpInlineP321 = hi;
    }

    private StaticText campoP321Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP321Texto1() {
        return campoP321Texto1;
    }

    public void setCampoP321Texto1(StaticText component) {
        this.campoP321Texto1 = component;
    }

    private LengthValidator validatorP321 = new LengthValidator();
  
    public LengthValidator getValidatorP321() {
        return validatorP321;
    }
  
    public void setValidatorP321(LengthValidator validator) {
        this.validatorP321 = validator;
    }
  
    private Label labelP331 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP331() {
        return labelP331;
    }

    public void setLabelP331(Label l) {
        this.labelP331 = l;
    }

    private TextArea campoP331 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP331() {
        return campoP331;
    }

    public void setCampoP331(TextArea component) {
        this.campoP331 = component;
    }

    private HelpInline helpInlineP331 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP331() {
        return helpInlineP331;
    }

    public void setHelpInlineP331(HelpInline hi) {
        this.helpInlineP331 = hi;
    }

    private StaticText campoP331Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP331Texto1() {
        return campoP331Texto1;
    }

    public void setCampoP331Texto1(StaticText component) {
        this.campoP331Texto1 = component;
    }

    private LengthValidator validatorP331 = new LengthValidator();
  
    public LengthValidator getValidatorP331() {
        return validatorP331;
    }
  
    public void setValidatorP331(LengthValidator validator) {
        this.validatorP331 = validator;
    }
  
    private Label labelP341 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP341() {
        return labelP341;
    }

    public void setLabelP341(Label l) {
        this.labelP341 = l;
    }

    private TextArea campoP341 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP341() {
        return campoP341;
    }

    public void setCampoP341(TextArea component) {
        this.campoP341 = component;
    }

    private HelpInline helpInlineP341 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP341() {
        return helpInlineP341;
    }

    public void setHelpInlineP341(HelpInline hi) {
        this.helpInlineP341 = hi;
    }

    private StaticText campoP341Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP341Texto1() {
        return campoP341Texto1;
    }

    public void setCampoP341Texto1(StaticText component) {
        this.campoP341Texto1 = component;
    }

    private LengthValidator validatorP341 = new LengthValidator();
  
    public LengthValidator getValidatorP341() {
        return validatorP341;
    }
  
    public void setValidatorP341(LengthValidator validator) {
        this.validatorP341 = validator;
    }
  
    private Label labelP351 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP351() {
        return labelP351;
    }

    public void setLabelP351(Label l) {
        this.labelP351 = l;
    }

    private TextArea campoP351 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP351() {
        return campoP351;
    }

    public void setCampoP351(TextArea component) {
        this.campoP351 = component;
    }

    private HelpInline helpInlineP351 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP351() {
        return helpInlineP351;
    }

    public void setHelpInlineP351(HelpInline hi) {
        this.helpInlineP351 = hi;
    }

    private StaticText campoP351Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP351Texto1() {
        return campoP351Texto1;
    }

    public void setCampoP351Texto1(StaticText component) {
        this.campoP351Texto1 = component;
    }

    private LengthValidator validatorP351 = new LengthValidator();
  
    public LengthValidator getValidatorP351() {
        return validatorP351;
    }
  
    public void setValidatorP351(LengthValidator validator) {
        this.validatorP351 = validator;
    }
  
    private Label labelP361 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP361() {
        return labelP361;
    }

    public void setLabelP361(Label l) {
        this.labelP361 = l;
    }

    private TextArea campoP361 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP361() {
        return campoP361;
    }

    public void setCampoP361(TextArea component) {
        this.campoP361 = component;
    }

    private HelpInline helpInlineP361 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP361() {
        return helpInlineP361;
    }

    public void setHelpInlineP361(HelpInline hi) {
        this.helpInlineP361 = hi;
    }

    private StaticText campoP361Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP361Texto1() {
        return campoP361Texto1;
    }

    public void setCampoP361Texto1(StaticText component) {
        this.campoP361Texto1 = component;
    }

    private LengthValidator validatorP361 = new LengthValidator();
  
    public LengthValidator getValidatorP361() {
        return validatorP361;
    }
  
    public void setValidatorP361(LengthValidator validator) {
        this.validatorP361 = validator;
    }
  
    private Label labelP371 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP371() {
        return labelP371;
    }

    public void setLabelP371(Label l) {
        this.labelP371 = l;
    }

    private TextArea campoP371 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP371() {
        return campoP371;
    }

    public void setCampoP371(TextArea component) {
        this.campoP371 = component;
    }

    private HelpInline helpInlineP371 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP371() {
        return helpInlineP371;
    }

    public void setHelpInlineP371(HelpInline hi) {
        this.helpInlineP371 = hi;
    }

    private StaticText campoP371Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP371Texto1() {
        return campoP371Texto1;
    }

    public void setCampoP371Texto1(StaticText component) {
        this.campoP371Texto1 = component;
    }

    private LengthValidator validatorP371 = new LengthValidator();
  
    public LengthValidator getValidatorP371() {
        return validatorP371;
    }
  
    public void setValidatorP371(LengthValidator validator) {
        this.validatorP371 = validator;
    }
  
    private Label labelNroCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNroCelular1() {
        return labelNroCelular1;
    }

    public void setLabelNroCelular1(Label l) {
        this.labelNroCelular1 = l;
    }

    private TextArea campoNroCelular1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNroCelular1() {
        return campoNroCelular1;
    }

    public void setCampoNroCelular1(TextArea component) {
        this.campoNroCelular1 = component;
    }

    private HelpInline helpInlineNroCelular1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNroCelular1() {
        return helpInlineNroCelular1;
    }

    public void setHelpInlineNroCelular1(HelpInline hi) {
        this.helpInlineNroCelular1 = hi;
    }

    private StaticText campoNroCelular1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNroCelular1Texto1() {
        return campoNroCelular1Texto1;
    }

    public void setCampoNroCelular1Texto1(StaticText component) {
        this.campoNroCelular1Texto1 = component;
    }

    private LengthValidator validatorNroCelular1 = new LengthValidator();
  
    public LengthValidator getValidatorNroCelular1() {
        return validatorNroCelular1;
    }
  
    public void setValidatorNroCelular1(LengthValidator validator) {
        this.validatorNroCelular1 = validator;
    }
  
    private Label labelP381 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP381() {
        return labelP381;
    }

    public void setLabelP381(Label l) {
        this.labelP381 = l;
    }

    private TextArea campoP381 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP381() {
        return campoP381;
    }

    public void setCampoP381(TextArea component) {
        this.campoP381 = component;
    }

    private HelpInline helpInlineP381 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP381() {
        return helpInlineP381;
    }

    public void setHelpInlineP381(HelpInline hi) {
        this.helpInlineP381 = hi;
    }

    private StaticText campoP381Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP381Texto1() {
        return campoP381Texto1;
    }

    public void setCampoP381Texto1(StaticText component) {
        this.campoP381Texto1 = component;
    }

    private LengthValidator validatorP381 = new LengthValidator();
  
    public LengthValidator getValidatorP381() {
        return validatorP381;
    }
  
    public void setValidatorP381(LengthValidator validator) {
        this.validatorP381 = validator;
    }
  
    private Label labelNroLineaBaja1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNroLineaBaja1() {
        return labelNroLineaBaja1;
    }

    public void setLabelNroLineaBaja1(Label l) {
        this.labelNroLineaBaja1 = l;
    }

    private TextArea campoNroLineaBaja1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNroLineaBaja1() {
        return campoNroLineaBaja1;
    }

    public void setCampoNroLineaBaja1(TextArea component) {
        this.campoNroLineaBaja1 = component;
    }

    private HelpInline helpInlineNroLineaBaja1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNroLineaBaja1() {
        return helpInlineNroLineaBaja1;
    }

    public void setHelpInlineNroLineaBaja1(HelpInline hi) {
        this.helpInlineNroLineaBaja1 = hi;
    }

    private StaticText campoNroLineaBaja1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNroLineaBaja1Texto1() {
        return campoNroLineaBaja1Texto1;
    }

    public void setCampoNroLineaBaja1Texto1(StaticText component) {
        this.campoNroLineaBaja1Texto1 = component;
    }

    private LengthValidator validatorNroLineaBaja1 = new LengthValidator();
  
    public LengthValidator getValidatorNroLineaBaja1() {
        return validatorNroLineaBaja1;
    }
  
    public void setValidatorNroLineaBaja1(LengthValidator validator) {
        this.validatorNroLineaBaja1 = validator;
    }
  
    private Label labelP3911 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3911() {
        return labelP3911;
    }

    public void setLabelP3911(Label l) {
        this.labelP3911 = l;
    }

    private TextArea campoP3911 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3911() {
        return campoP3911;
    }

    public void setCampoP3911(TextArea component) {
        this.campoP3911 = component;
    }

    private HelpInline helpInlineP3911 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3911() {
        return helpInlineP3911;
    }

    public void setHelpInlineP3911(HelpInline hi) {
        this.helpInlineP3911 = hi;
    }

    private StaticText campoP3911Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3911Texto1() {
        return campoP3911Texto1;
    }

    public void setCampoP3911Texto1(StaticText component) {
        this.campoP3911Texto1 = component;
    }

    private LengthValidator validatorP3911 = new LengthValidator();
  
    public LengthValidator getValidatorP3911() {
        return validatorP3911;
    }
  
    public void setValidatorP3911(LengthValidator validator) {
        this.validatorP3911 = validator;
    }
  
    private Label labelP3921 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3921() {
        return labelP3921;
    }

    public void setLabelP3921(Label l) {
        this.labelP3921 = l;
    }

    private TextArea campoP3921 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3921() {
        return campoP3921;
    }

    public void setCampoP3921(TextArea component) {
        this.campoP3921 = component;
    }

    private HelpInline helpInlineP3921 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3921() {
        return helpInlineP3921;
    }

    public void setHelpInlineP3921(HelpInline hi) {
        this.helpInlineP3921 = hi;
    }

    private StaticText campoP3921Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3921Texto1() {
        return campoP3921Texto1;
    }

    public void setCampoP3921Texto1(StaticText component) {
        this.campoP3921Texto1 = component;
    }

    private LengthValidator validatorP3921 = new LengthValidator();
  
    public LengthValidator getValidatorP3921() {
        return validatorP3921;
    }
  
    public void setValidatorP3921(LengthValidator validator) {
        this.validatorP3921 = validator;
    }
  
    private Label labelP3931 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3931() {
        return labelP3931;
    }

    public void setLabelP3931(Label l) {
        this.labelP3931 = l;
    }

    private TextArea campoP3931 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3931() {
        return campoP3931;
    }

    public void setCampoP3931(TextArea component) {
        this.campoP3931 = component;
    }

    private HelpInline helpInlineP3931 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3931() {
        return helpInlineP3931;
    }

    public void setHelpInlineP3931(HelpInline hi) {
        this.helpInlineP3931 = hi;
    }

    private StaticText campoP3931Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3931Texto1() {
        return campoP3931Texto1;
    }

    public void setCampoP3931Texto1(StaticText component) {
        this.campoP3931Texto1 = component;
    }

    private LengthValidator validatorP3931 = new LengthValidator();
  
    public LengthValidator getValidatorP3931() {
        return validatorP3931;
    }
  
    public void setValidatorP3931(LengthValidator validator) {
        this.validatorP3931 = validator;
    }
  
    private Label labelP3941 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3941() {
        return labelP3941;
    }

    public void setLabelP3941(Label l) {
        this.labelP3941 = l;
    }

    private TextArea campoP3941 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3941() {
        return campoP3941;
    }

    public void setCampoP3941(TextArea component) {
        this.campoP3941 = component;
    }

    private HelpInline helpInlineP3941 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3941() {
        return helpInlineP3941;
    }

    public void setHelpInlineP3941(HelpInline hi) {
        this.helpInlineP3941 = hi;
    }

    private StaticText campoP3941Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3941Texto1() {
        return campoP3941Texto1;
    }

    public void setCampoP3941Texto1(StaticText component) {
        this.campoP3941Texto1 = component;
    }

    private LengthValidator validatorP3941 = new LengthValidator();
  
    public LengthValidator getValidatorP3941() {
        return validatorP3941;
    }
  
    public void setValidatorP3941(LengthValidator validator) {
        this.validatorP3941 = validator;
    }
  
    private Label labelP3951 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3951() {
        return labelP3951;
    }

    public void setLabelP3951(Label l) {
        this.labelP3951 = l;
    }

    private TextArea campoP3951 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3951() {
        return campoP3951;
    }

    public void setCampoP3951(TextArea component) {
        this.campoP3951 = component;
    }

    private HelpInline helpInlineP3951 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3951() {
        return helpInlineP3951;
    }

    public void setHelpInlineP3951(HelpInline hi) {
        this.helpInlineP3951 = hi;
    }

    private StaticText campoP3951Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3951Texto1() {
        return campoP3951Texto1;
    }

    public void setCampoP3951Texto1(StaticText component) {
        this.campoP3951Texto1 = component;
    }

    private LengthValidator validatorP3951 = new LengthValidator();
  
    public LengthValidator getValidatorP3951() {
        return validatorP3951;
    }
  
    public void setValidatorP3951(LengthValidator validator) {
        this.validatorP3951 = validator;
    }
  
    private Label labelP3961 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3961() {
        return labelP3961;
    }

    public void setLabelP3961(Label l) {
        this.labelP3961 = l;
    }

    private TextArea campoP3961 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3961() {
        return campoP3961;
    }

    public void setCampoP3961(TextArea component) {
        this.campoP3961 = component;
    }

    private HelpInline helpInlineP3961 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3961() {
        return helpInlineP3961;
    }

    public void setHelpInlineP3961(HelpInline hi) {
        this.helpInlineP3961 = hi;
    }

    private StaticText campoP3961Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3961Texto1() {
        return campoP3961Texto1;
    }

    public void setCampoP3961Texto1(StaticText component) {
        this.campoP3961Texto1 = component;
    }

    private LengthValidator validatorP3961 = new LengthValidator();
  
    public LengthValidator getValidatorP3961() {
        return validatorP3961;
    }
  
    public void setValidatorP3961(LengthValidator validator) {
        this.validatorP3961 = validator;
    }
  
    private Label labelP3971 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP3971() {
        return labelP3971;
    }

    public void setLabelP3971(Label l) {
        this.labelP3971 = l;
    }

    private TextArea campoP3971 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP3971() {
        return campoP3971;
    }

    public void setCampoP3971(TextArea component) {
        this.campoP3971 = component;
    }

    private HelpInline helpInlineP3971 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP3971() {
        return helpInlineP3971;
    }

    public void setHelpInlineP3971(HelpInline hi) {
        this.helpInlineP3971 = hi;
    }

    private StaticText campoP3971Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP3971Texto1() {
        return campoP3971Texto1;
    }

    public void setCampoP3971Texto1(StaticText component) {
        this.campoP3971Texto1 = component;
    }

    private LengthValidator validatorP3971 = new LengthValidator();
  
    public LengthValidator getValidatorP3971() {
        return validatorP3971;
    }
  
    public void setValidatorP3971(LengthValidator validator) {
        this.validatorP3971 = validator;
    }
  
    private Label labelP42n1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP42n1() {
        return labelP42n1;
    }

    public void setLabelP42n1(Label l) {
        this.labelP42n1 = l;
    }

    private TextArea campoP42n1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP42n1() {
        return campoP42n1;
    }

    public void setCampoP42n1(TextArea component) {
        this.campoP42n1 = component;
    }

    private HelpInline helpInlineP42n1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP42n1() {
        return helpInlineP42n1;
    }

    public void setHelpInlineP42n1(HelpInline hi) {
        this.helpInlineP42n1 = hi;
    }

    private StaticText campoP42n1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP42n1Texto1() {
        return campoP42n1Texto1;
    }

    public void setCampoP42n1Texto1(StaticText component) {
        this.campoP42n1Texto1 = component;
    }

    private LengthValidator validatorP42n1 = new LengthValidator();
  
    public LengthValidator getValidatorP42n1() {
        return validatorP42n1;
    }
  
    public void setValidatorP42n1(LengthValidator validator) {
        this.validatorP42n1 = validator;
    }
  
    private Label labelP42ci1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP42ci1() {
        return labelP42ci1;
    }

    public void setLabelP42ci1(Label l) {
        this.labelP42ci1 = l;
    }

    private TextArea campoP42ci1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP42ci1() {
        return campoP42ci1;
    }

    public void setCampoP42ci1(TextArea component) {
        this.campoP42ci1 = component;
    }

    private HelpInline helpInlineP42ci1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP42ci1() {
        return helpInlineP42ci1;
    }

    public void setHelpInlineP42ci1(HelpInline hi) {
        this.helpInlineP42ci1 = hi;
    }

    private StaticText campoP42ci1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP42ci1Texto1() {
        return campoP42ci1Texto1;
    }

    public void setCampoP42ci1Texto1(StaticText component) {
        this.campoP42ci1Texto1 = component;
    }

    private LengthValidator validatorP42ci1 = new LengthValidator();
  
    public LengthValidator getValidatorP42ci1() {
        return validatorP42ci1;
    }
  
    public void setValidatorP42ci1(LengthValidator validator) {
        this.validatorP42ci1 = validator;
    }
  
    private Label labelLetraCi1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCi1() {
        return labelLetraCi1;
    }

    public void setLabelLetraCi1(Label l) {
        this.labelLetraCi1 = l;
    }

    private TextArea campoLetraCi1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoLetraCi1() {
        return campoLetraCi1;
    }

    public void setCampoLetraCi1(TextArea component) {
        this.campoLetraCi1 = component;
    }

    private HelpInline helpInlineLetraCi1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCi1() {
        return helpInlineLetraCi1;
    }

    public void setHelpInlineLetraCi1(HelpInline hi) {
        this.helpInlineLetraCi1 = hi;
    }

    private StaticText campoLetraCi1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCi1Texto1() {
        return campoLetraCi1Texto1;
    }

    public void setCampoLetraCi1Texto1(StaticText component) {
        this.campoLetraCi1Texto1 = component;
    }

    private LengthValidator validatorLetraCi1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCi1() {
        return validatorLetraCi1;
    }
  
    public void setValidatorLetraCi1(LengthValidator validator) {
        this.validatorLetraCi1 = validator;
    }
  
    private Label labelP431 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP431() {
        return labelP431;
    }

    public void setLabelP431(Label l) {
        this.labelP431 = l;
    }

    private TextArea campoP431 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP431() {
        return campoP431;
    }

    public void setCampoP431(TextArea component) {
        this.campoP431 = component;
    }

    private HelpInline helpInlineP431 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP431() {
        return helpInlineP431;
    }

    public void setHelpInlineP431(HelpInline hi) {
        this.helpInlineP431 = hi;
    }

    private StaticText campoP431Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP431Texto1() {
        return campoP431Texto1;
    }

    public void setCampoP431Texto1(StaticText component) {
        this.campoP431Texto1 = component;
    }

    private LengthValidator validatorP431 = new LengthValidator();
  
    public LengthValidator getValidatorP431() {
        return validatorP431;
    }
  
    public void setValidatorP431(LengthValidator validator) {
        this.validatorP431 = validator;
    }
  
    private Label labelVar000021 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000021() {
        return labelVar000021;
    }

    public void setLabelVar000021(Label l) {
        this.labelVar000021 = l;
    }

    private TextArea campoVar000021 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000021() {
        return campoVar000021;
    }

    public void setCampoVar000021(TextArea component) {
        this.campoVar000021 = component;
    }

    private HelpInline helpInlineVar000021 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineVar000021() {
        return helpInlineVar000021;
    }

    public void setHelpInlineVar000021(HelpInline hi) {
        this.helpInlineVar000021 = hi;
    }

    private StaticText campoVar000021Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000021Texto1() {
        return campoVar000021Texto1;
    }

    public void setCampoVar000021Texto1(StaticText component) {
        this.campoVar000021Texto1 = component;
    }

    private LengthValidator validatorVar000021 = new LengthValidator();
  
    public LengthValidator getValidatorVar000021() {
        return validatorVar000021;
    }
  
    public void setValidatorVar000021(LengthValidator validator) {
        this.validatorVar000021 = validator;
    }
  
    private Label labelVar000031 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000031() {
        return labelVar000031;
    }

    public void setLabelVar000031(Label l) {
        this.labelVar000031 = l;
    }

    private TextArea campoVar000031 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000031() {
        return campoVar000031;
    }

    public void setCampoVar000031(TextArea component) {
        this.campoVar000031 = component;
    }

    private HelpInline helpInlineVar000031 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineVar000031() {
        return helpInlineVar000031;
    }

    public void setHelpInlineVar000031(HelpInline hi) {
        this.helpInlineVar000031 = hi;
    }

    private StaticText campoVar000031Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000031Texto1() {
        return campoVar000031Texto1;
    }

    public void setCampoVar000031Texto1(StaticText component) {
        this.campoVar000031Texto1 = component;
    }

    private LengthValidator validatorVar000031 = new LengthValidator();
  
    public LengthValidator getValidatorVar000031() {
        return validatorVar000031;
    }
  
    public void setValidatorVar000031(LengthValidator validator) {
        this.validatorVar000031 = validator;
    }
  
    private Label labelVar000041 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000041() {
        return labelVar000041;
    }

    public void setLabelVar000041(Label l) {
        this.labelVar000041 = l;
    }

    private TextArea campoVar000041 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000041() {
        return campoVar000041;
    }

    public void setCampoVar000041(TextArea component) {
        this.campoVar000041 = component;
    }

    private HelpInline helpInlineVar000041 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineVar000041() {
        return helpInlineVar000041;
    }

    public void setHelpInlineVar000041(HelpInline hi) {
        this.helpInlineVar000041 = hi;
    }

    private StaticText campoVar000041Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000041Texto1() {
        return campoVar000041Texto1;
    }

    public void setCampoVar000041Texto1(StaticText component) {
        this.campoVar000041Texto1 = component;
    }

    private LengthValidator validatorVar000041 = new LengthValidator();
  
    public LengthValidator getValidatorVar000041() {
        return validatorVar000041;
    }
  
    public void setValidatorVar000041(LengthValidator validator) {
        this.validatorVar000041 = validator;
    }
  
    private Label labelP1041 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP1041() {
        return labelP1041;
    }

    public void setLabelP1041(Label l) {
        this.labelP1041 = l;
    }

    private TextArea campoP1041 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP1041() {
        return campoP1041;
    }

    public void setCampoP1041(TextArea component) {
        this.campoP1041 = component;
    }

    private HelpInline helpInlineP1041 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineP1041() {
        return helpInlineP1041;
    }

    public void setHelpInlineP1041(HelpInline hi) {
        this.helpInlineP1041 = hi;
    }

    private StaticText campoP1041Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP1041Texto1() {
        return campoP1041Texto1;
    }

    public void setCampoP1041Texto1(StaticText component) {
        this.campoP1041Texto1 = component;
    }

    private LengthValidator validatorP1041 = new LengthValidator();
  
    public LengthValidator getValidatorP1041() {
        return validatorP1041;
    }
  
    public void setValidatorP1041(LengthValidator validator) {
        this.validatorP1041 = validator;
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

    private HelpInline helpInlineEsImportado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsImportado1() {
        return helpInlineEsImportado1;
    }

    public void setHelpInlineEsImportado1(HelpInline hi) {
        this.helpInlineEsImportado1 = hi;
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

    private HelpInline helpInlineNombreArchivo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreArchivo1() {
        return helpInlineNombreArchivo1;
    }

    public void setHelpInlineNombreArchivo1(HelpInline hi) {
        this.helpInlineNombreArchivo1 = hi;
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

    private HelpInline helpInlineCodigoArchivo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoArchivo1() {
        return helpInlineCodigoArchivo1;
    }

    public void setHelpInlineCodigoArchivo1(HelpInline hi) {
        this.helpInlineCodigoArchivo1 = hi;
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

    private LogImpHogCachedRowSetDataProvider2 logImpHogDataProvider = new LogImpHogCachedRowSetDataProvider2();

    @Override
    public LogImpHogCachedRowSetDataProvider2 getLogImpHogDataProvider() {
        return logImpHogDataProvider;
    }

    public void setLogImpHogDataProvider(LogImpHogCachedRowSetDataProvider2 crsdp) {
        this.logImpHogDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogImpHog6() {
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
        logImpHogDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogImpHog...">
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
    private AsistentePaginaActualizacionLogImpHog asistente = new AsistentePaginaActualizacionLogImpHog(this);

    public AsistentePaginaActualizacionLogImpHog getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogImpHog6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogImpHog6_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogImpHogDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogImpHogCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_IMP_HOG;
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

    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
