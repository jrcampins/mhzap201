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
package com.egt.web.proceso;

import com.egt.base.entity.constants.ProcesoConstants;
import com.egt.base.entity.constants.UbicacionConstants;
import com.egt.ejb.persistence.entity.Proceso;
import com.egt.ejb.persistence.entity.Ubicacion;
import com.egt.ejb.persistence.facade.ProcesoFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.constants.CBM2;
import com.egt.base.constants.FGS;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.Bit;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaBasica;
import com.egt.core.aplicacion.web.PaginaBasicaConAccionMultiple;
import com.egt.core.db.xdp.RecursoCachedRowSet;
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
import java.util.List;
import javax.ejb.EJB;
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
import org.apache.commons.lang.StringUtils;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.core.control.Auditor;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.ProcesoImportarArchivosExtMessage;
import com.egt.ejb.business.message.ProcesoAcreditarPotBenMessage;
import com.egt.ejb.business.message.ProcesoAsignarMesaMessage;
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoDenegarPensionesObjMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoAsignarMontoPensionMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenJupeMessage;
import com.egt.ejb.business.message.ProcesoRevocarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoAprobarExclusionPenMessage;
import com.egt.ejb.business.message.ProcesoExpPenAprMessage;
import com.egt.ejb.business.message.ProcesoExpPenDenMessage;
import com.egt.ejb.business.message.ProcesoExpPenRevMessage;
import com.egt.ejb.business.process.ProcesoBusinessProcessLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class Proceso4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        converterFechaRegistroPotBenDesde1.setPattern("dd/MM/yyyy");
        converterFechaRegistroPotBenDesde1.setType("date");
        converterFechaRegistroPotBenHasta1.setPattern("dd/MM/yyyy");
        converterFechaRegistroPotBenHasta1.setType("date");
        validatorEdadDesde1.setMinimum(0L);
        validatorEdadDesde1.setMaximum(1000000000L);
        validatorEdadHasta1.setMinimum(0L);
        validatorEdadHasta1.setMaximum(1000000000L);
        validatorLote1.setMinimum(0L);
        validatorLote1.setMaximum(1000000000000000000L);
        validatorCodigoSime1.setMaximum(2000);
        converterFechaSolicitudPensionDesde1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudPensionDesde1.setType("date");
        converterFechaSolicitudPensionHasta1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudPensionHasta1.setType("date");
        validatorNumeroResolucionOtorPen1.setMaximum(2000);
        converterFechaResolucionOtorPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionOtorPen1.setType("date");
        validatorCedulaDesde1.setMaximum(2000);
        validatorCedulaHasta1.setMaximum(2000);
        validatorNumeroResolucionDenPen1.setMaximum(2000);
        converterFechaResolucionDenPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionDenPen1.setType("date");
        converterMontoPension1.setMinIntegerDigits(1);
        converterMontoPension1.setMaxIntegerDigits(40);
        converterMontoPension1.setMaxFractionDigits(3);
        validatorMontoPension1.setMinimum(0.0);
        validatorMontoPension1.setMaximum(1.0E15);
        converterFechaResolucionRevPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionRevPen1.setType("date");
        validatorNumeroResolucionRevPen1.setMaximum(2000);
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

    private Label etiquetaListaFuncionAccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaListaFuncionAccion1() {
        return etiquetaListaFuncionAccion1;
    }

    public void setEtiquetaListaFuncionAccion1(Label l) {
        this.etiquetaListaFuncionAccion1 = l;
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
  
    private HelpInline helpInlineListaFuncionAccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineListaFuncionAccion1() {
        return helpInlineListaFuncionAccion1;
    }

    public void setHelpInlineListaFuncionAccion1(HelpInline hi) {
        this.helpInlineListaFuncionAccion1 = hi;
    }

    private StaticText listaFuncionAccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaFuncionAccion1Texto1() {
        return listaFuncionAccion1Texto1;
    }

    public void setListaFuncionAccion1Texto1(StaticText component) {
        this.listaFuncionAccion1Texto1 = component;
    }

    private Label labelIdUbicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUbicacion1() {
        return labelIdUbicacion1;
    }

    public void setLabelIdUbicacion1(Label l) {
        this.labelIdUbicacion1 = l;
    }

    private TextField campoIdUbicacion1 = new com.egt.core.jsf.component.CampoTexto();

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

    private Button campoIdUbicacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUbicacion1Boton1() {
        return campoIdUbicacion1Boton1;
    }

    public void setCampoIdUbicacion1Boton1(Button component) {
        this.campoIdUbicacion1Boton1 = component;
    }

    private Button campoIdUbicacion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUbicacion1Boton3() {
        return campoIdUbicacion1Boton3;
    }

    public void setCampoIdUbicacion1Boton3(Button component) {
        this.campoIdUbicacion1Boton3 = component;
    }

    private Label labelIdUbicacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUbicacion2() {
        return labelIdUbicacion2;
    }

    public void setLabelIdUbicacion2(Label l) {
        this.labelIdUbicacion2 = l;
    }

    private StaticText campoIdUbicacion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUbicacion1Texto2() {
        return campoIdUbicacion1Texto2;
    }

    public void setCampoIdUbicacion1Texto2(StaticText component) {
        this.campoIdUbicacion1Texto2 = component;
    }

    private Button campoIdUbicacion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUbicacion1Boton2() {
        return campoIdUbicacion1Boton2;
    }

    public void setCampoIdUbicacion1Boton2(Button component) {
        this.campoIdUbicacion1Boton2 = component;
    }

    private Label labelFechaRegistroPotBenDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroPotBenDesde1() {
        return labelFechaRegistroPotBenDesde1;
    }

    public void setLabelFechaRegistroPotBenDesde1(Label l) {
        this.labelFechaRegistroPotBenDesde1 = l;
    }

    private Calendar campoFechaRegistroPotBenDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroPotBenDesde1() {
        return campoFechaRegistroPotBenDesde1;
    }

    public void setCampoFechaRegistroPotBenDesde1(Calendar component) {
        this.campoFechaRegistroPotBenDesde1 = component;
    }

    private HelpInline helpInlineFechaRegistroPotBenDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroPotBenDesde1() {
        return helpInlineFechaRegistroPotBenDesde1;
    }

    public void setHelpInlineFechaRegistroPotBenDesde1(HelpInline hi) {
        this.helpInlineFechaRegistroPotBenDesde1 = hi;
    }

    private StaticText campoFechaRegistroPotBenDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroPotBenDesde1Texto1() {
        return campoFechaRegistroPotBenDesde1Texto1;
    }

    public void setCampoFechaRegistroPotBenDesde1Texto1(StaticText component) {
        this.campoFechaRegistroPotBenDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRegistroPotBenDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRegistroPotBenDesde1() {
        return converterFechaRegistroPotBenDesde1;
    }
  
    public void setConverterFechaRegistroPotBenDesde1(SqlTimestampConverter converter) {
        this.converterFechaRegistroPotBenDesde1 = converter;
    }
  
    private Label labelFechaRegistroPotBenHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroPotBenHasta1() {
        return labelFechaRegistroPotBenHasta1;
    }

    public void setLabelFechaRegistroPotBenHasta1(Label l) {
        this.labelFechaRegistroPotBenHasta1 = l;
    }

    private Calendar campoFechaRegistroPotBenHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroPotBenHasta1() {
        return campoFechaRegistroPotBenHasta1;
    }

    public void setCampoFechaRegistroPotBenHasta1(Calendar component) {
        this.campoFechaRegistroPotBenHasta1 = component;
    }

    private HelpInline helpInlineFechaRegistroPotBenHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroPotBenHasta1() {
        return helpInlineFechaRegistroPotBenHasta1;
    }

    public void setHelpInlineFechaRegistroPotBenHasta1(HelpInline hi) {
        this.helpInlineFechaRegistroPotBenHasta1 = hi;
    }

    private StaticText campoFechaRegistroPotBenHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroPotBenHasta1Texto1() {
        return campoFechaRegistroPotBenHasta1Texto1;
    }

    public void setCampoFechaRegistroPotBenHasta1Texto1(StaticText component) {
        this.campoFechaRegistroPotBenHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRegistroPotBenHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRegistroPotBenHasta1() {
        return converterFechaRegistroPotBenHasta1;
    }
  
    public void setConverterFechaRegistroPotBenHasta1(SqlTimestampConverter converter) {
        this.converterFechaRegistroPotBenHasta1 = converter;
    }
  
    private Label labelEdadDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEdadDesde1() {
        return labelEdadDesde1;
    }

    public void setLabelEdadDesde1(Label l) {
        this.labelEdadDesde1 = l;
    }

    private TextField campoEdadDesde1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoEdadDesde1() {
        return campoEdadDesde1;
    }

    public void setCampoEdadDesde1(TextField component) {
        this.campoEdadDesde1 = component;
    }

    private HelpInline helpInlineEdadDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEdadDesde1() {
        return helpInlineEdadDesde1;
    }

    public void setHelpInlineEdadDesde1(HelpInline hi) {
        this.helpInlineEdadDesde1 = hi;
    }

    private StaticText campoEdadDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEdadDesde1Texto1() {
        return campoEdadDesde1Texto1;
    }

    public void setCampoEdadDesde1Texto1(StaticText component) {
        this.campoEdadDesde1Texto1 = component;
    }

    private IntegerConverter converterEdadDesde1 = new IntegerConverter();
  
    public IntegerConverter getConverterEdadDesde1() {
        return converterEdadDesde1;
    }
  
    public void setConverterEdadDesde1(IntegerConverter converter) {
        this.converterEdadDesde1 = converter;
    }
  
    private LongRangeValidator validatorEdadDesde1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorEdadDesde1() {
        return validatorEdadDesde1;
    }
  
    public void setValidatorEdadDesde1(LongRangeValidator validator) {
        this.validatorEdadDesde1 = validator;
    }
  
    private Label labelEdadHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEdadHasta1() {
        return labelEdadHasta1;
    }

    public void setLabelEdadHasta1(Label l) {
        this.labelEdadHasta1 = l;
    }

    private TextField campoEdadHasta1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoEdadHasta1() {
        return campoEdadHasta1;
    }

    public void setCampoEdadHasta1(TextField component) {
        this.campoEdadHasta1 = component;
    }

    private HelpInline helpInlineEdadHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEdadHasta1() {
        return helpInlineEdadHasta1;
    }

    public void setHelpInlineEdadHasta1(HelpInline hi) {
        this.helpInlineEdadHasta1 = hi;
    }

    private StaticText campoEdadHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEdadHasta1Texto1() {
        return campoEdadHasta1Texto1;
    }

    public void setCampoEdadHasta1Texto1(StaticText component) {
        this.campoEdadHasta1Texto1 = component;
    }

    private IntegerConverter converterEdadHasta1 = new IntegerConverter();
  
    public IntegerConverter getConverterEdadHasta1() {
        return converterEdadHasta1;
    }
  
    public void setConverterEdadHasta1(IntegerConverter converter) {
        this.converterEdadHasta1 = converter;
    }
  
    private LongRangeValidator validatorEdadHasta1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorEdadHasta1() {
        return validatorEdadHasta1;
    }
  
    public void setValidatorEdadHasta1(LongRangeValidator validator) {
        this.validatorEdadHasta1 = validator;
    }
  
    private Label labelLote1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLote1() {
        return labelLote1;
    }

    public void setLabelLote1(Label l) {
        this.labelLote1 = l;
    }

    private TextField campoLote1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLote1() {
        return campoLote1;
    }

    public void setCampoLote1(TextField component) {
        this.campoLote1 = component;
    }

    private HelpInline helpInlineLote1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLote1() {
        return helpInlineLote1;
    }

    public void setHelpInlineLote1(HelpInline hi) {
        this.helpInlineLote1 = hi;
    }

    private StaticText campoLote1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLote1Texto1() {
        return campoLote1Texto1;
    }

    public void setCampoLote1Texto1(StaticText component) {
        this.campoLote1Texto1 = component;
    }

    private LongConverter converterLote1 = new LongConverter();
  
    public LongConverter getConverterLote1() {
        return converterLote1;
    }
  
    public void setConverterLote1(LongConverter converter) {
        this.converterLote1 = converter;
    }
  
    private LongRangeValidator validatorLote1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLote1() {
        return validatorLote1;
    }
  
    public void setValidatorLote1(LongRangeValidator validator) {
        this.validatorLote1 = validator;
    }
  
    private Label labelCodigoSime1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoSime1() {
        return labelCodigoSime1;
    }

    public void setLabelCodigoSime1(Label l) {
        this.labelCodigoSime1 = l;
    }

    private TextField campoCodigoSime1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCodigoSime1() {
        return campoCodigoSime1;
    }

    public void setCampoCodigoSime1(TextField component) {
        this.campoCodigoSime1 = component;
    }

    private HelpInline helpInlineCodigoSime1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoSime1() {
        return helpInlineCodigoSime1;
    }

    public void setHelpInlineCodigoSime1(HelpInline hi) {
        this.helpInlineCodigoSime1 = hi;
    }

    private StaticText campoCodigoSime1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoSime1Texto1() {
        return campoCodigoSime1Texto1;
    }

    public void setCampoCodigoSime1Texto1(StaticText component) {
        this.campoCodigoSime1Texto1 = component;
    }

    private LengthValidator validatorCodigoSime1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoSime1() {
        return validatorCodigoSime1;
    }
  
    public void setValidatorCodigoSime1(LengthValidator validator) {
        this.validatorCodigoSime1 = validator;
    }
  
    private Label labelFechaSolicitudPensionDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudPensionDesde1() {
        return labelFechaSolicitudPensionDesde1;
    }

    public void setLabelFechaSolicitudPensionDesde1(Label l) {
        this.labelFechaSolicitudPensionDesde1 = l;
    }

    private Calendar campoFechaSolicitudPensionDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudPensionDesde1() {
        return campoFechaSolicitudPensionDesde1;
    }

    public void setCampoFechaSolicitudPensionDesde1(Calendar component) {
        this.campoFechaSolicitudPensionDesde1 = component;
    }

    private HelpInline helpInlineFechaSolicitudPensionDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudPensionDesde1() {
        return helpInlineFechaSolicitudPensionDesde1;
    }

    public void setHelpInlineFechaSolicitudPensionDesde1(HelpInline hi) {
        this.helpInlineFechaSolicitudPensionDesde1 = hi;
    }

    private StaticText campoFechaSolicitudPensionDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudPensionDesde1Texto1() {
        return campoFechaSolicitudPensionDesde1Texto1;
    }

    public void setCampoFechaSolicitudPensionDesde1Texto1(StaticText component) {
        this.campoFechaSolicitudPensionDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaSolicitudPensionDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaSolicitudPensionDesde1() {
        return converterFechaSolicitudPensionDesde1;
    }
  
    public void setConverterFechaSolicitudPensionDesde1(SqlTimestampConverter converter) {
        this.converterFechaSolicitudPensionDesde1 = converter;
    }
  
    private Label labelFechaSolicitudPensionHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudPensionHasta1() {
        return labelFechaSolicitudPensionHasta1;
    }

    public void setLabelFechaSolicitudPensionHasta1(Label l) {
        this.labelFechaSolicitudPensionHasta1 = l;
    }

    private Calendar campoFechaSolicitudPensionHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudPensionHasta1() {
        return campoFechaSolicitudPensionHasta1;
    }

    public void setCampoFechaSolicitudPensionHasta1(Calendar component) {
        this.campoFechaSolicitudPensionHasta1 = component;
    }

    private HelpInline helpInlineFechaSolicitudPensionHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudPensionHasta1() {
        return helpInlineFechaSolicitudPensionHasta1;
    }

    public void setHelpInlineFechaSolicitudPensionHasta1(HelpInline hi) {
        this.helpInlineFechaSolicitudPensionHasta1 = hi;
    }

    private StaticText campoFechaSolicitudPensionHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudPensionHasta1Texto1() {
        return campoFechaSolicitudPensionHasta1Texto1;
    }

    public void setCampoFechaSolicitudPensionHasta1Texto1(StaticText component) {
        this.campoFechaSolicitudPensionHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaSolicitudPensionHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaSolicitudPensionHasta1() {
        return converterFechaSolicitudPensionHasta1;
    }
  
    public void setConverterFechaSolicitudPensionHasta1(SqlTimestampConverter converter) {
        this.converterFechaSolicitudPensionHasta1 = converter;
    }
  
    private Label labelNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionOtorPen1() {
        return labelNumeroResolucionOtorPen1;
    }

    public void setLabelNumeroResolucionOtorPen1(Label l) {
        this.labelNumeroResolucionOtorPen1 = l;
    }

    private TextField campoNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroResolucionOtorPen1() {
        return campoNumeroResolucionOtorPen1;
    }

    public void setCampoNumeroResolucionOtorPen1(TextField component) {
        this.campoNumeroResolucionOtorPen1 = component;
    }

    private HelpInline helpInlineNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionOtorPen1() {
        return helpInlineNumeroResolucionOtorPen1;
    }

    public void setHelpInlineNumeroResolucionOtorPen1(HelpInline hi) {
        this.helpInlineNumeroResolucionOtorPen1 = hi;
    }

    private StaticText campoNumeroResolucionOtorPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionOtorPen1Texto1() {
        return campoNumeroResolucionOtorPen1Texto1;
    }

    public void setCampoNumeroResolucionOtorPen1Texto1(StaticText component) {
        this.campoNumeroResolucionOtorPen1Texto1 = component;
    }

    private LengthValidator validatorNumeroResolucionOtorPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroResolucionOtorPen1() {
        return validatorNumeroResolucionOtorPen1;
    }
  
    public void setValidatorNumeroResolucionOtorPen1(LengthValidator validator) {
        this.validatorNumeroResolucionOtorPen1 = validator;
    }
  
    private Label labelFechaResolucionOtorPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionOtorPen1() {
        return labelFechaResolucionOtorPen1;
    }

    public void setLabelFechaResolucionOtorPen1(Label l) {
        this.labelFechaResolucionOtorPen1 = l;
    }

    private Calendar campoFechaResolucionOtorPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionOtorPen1() {
        return campoFechaResolucionOtorPen1;
    }

    public void setCampoFechaResolucionOtorPen1(Calendar component) {
        this.campoFechaResolucionOtorPen1 = component;
    }

    private HelpInline helpInlineFechaResolucionOtorPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionOtorPen1() {
        return helpInlineFechaResolucionOtorPen1;
    }

    public void setHelpInlineFechaResolucionOtorPen1(HelpInline hi) {
        this.helpInlineFechaResolucionOtorPen1 = hi;
    }

    private StaticText campoFechaResolucionOtorPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionOtorPen1Texto1() {
        return campoFechaResolucionOtorPen1Texto1;
    }

    public void setCampoFechaResolucionOtorPen1Texto1(StaticText component) {
        this.campoFechaResolucionOtorPen1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionOtorPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionOtorPen1() {
        return converterFechaResolucionOtorPen1;
    }
  
    public void setConverterFechaResolucionOtorPen1(SqlTimestampConverter converter) {
        this.converterFechaResolucionOtorPen1 = converter;
    }
  
    private Label labelCedulaDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCedulaDesde1() {
        return labelCedulaDesde1;
    }

    public void setLabelCedulaDesde1(Label l) {
        this.labelCedulaDesde1 = l;
    }

    private TextField campoCedulaDesde1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCedulaDesde1() {
        return campoCedulaDesde1;
    }

    public void setCampoCedulaDesde1(TextField component) {
        this.campoCedulaDesde1 = component;
    }

    private HelpInline helpInlineCedulaDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCedulaDesde1() {
        return helpInlineCedulaDesde1;
    }

    public void setHelpInlineCedulaDesde1(HelpInline hi) {
        this.helpInlineCedulaDesde1 = hi;
    }

    private StaticText campoCedulaDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCedulaDesde1Texto1() {
        return campoCedulaDesde1Texto1;
    }

    public void setCampoCedulaDesde1Texto1(StaticText component) {
        this.campoCedulaDesde1Texto1 = component;
    }

    private LengthValidator validatorCedulaDesde1 = new LengthValidator();
  
    public LengthValidator getValidatorCedulaDesde1() {
        return validatorCedulaDesde1;
    }
  
    public void setValidatorCedulaDesde1(LengthValidator validator) {
        this.validatorCedulaDesde1 = validator;
    }
  
    private Label labelCedulaHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCedulaHasta1() {
        return labelCedulaHasta1;
    }

    public void setLabelCedulaHasta1(Label l) {
        this.labelCedulaHasta1 = l;
    }

    private TextField campoCedulaHasta1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCedulaHasta1() {
        return campoCedulaHasta1;
    }

    public void setCampoCedulaHasta1(TextField component) {
        this.campoCedulaHasta1 = component;
    }

    private HelpInline helpInlineCedulaHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCedulaHasta1() {
        return helpInlineCedulaHasta1;
    }

    public void setHelpInlineCedulaHasta1(HelpInline hi) {
        this.helpInlineCedulaHasta1 = hi;
    }

    private StaticText campoCedulaHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCedulaHasta1Texto1() {
        return campoCedulaHasta1Texto1;
    }

    public void setCampoCedulaHasta1Texto1(StaticText component) {
        this.campoCedulaHasta1Texto1 = component;
    }

    private LengthValidator validatorCedulaHasta1 = new LengthValidator();
  
    public LengthValidator getValidatorCedulaHasta1() {
        return validatorCedulaHasta1;
    }
  
    public void setValidatorCedulaHasta1(LengthValidator validator) {
        this.validatorCedulaHasta1 = validator;
    }
  
    private Label labelNumeroResolucionDenPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionDenPen1() {
        return labelNumeroResolucionDenPen1;
    }

    public void setLabelNumeroResolucionDenPen1(Label l) {
        this.labelNumeroResolucionDenPen1 = l;
    }

    private TextField campoNumeroResolucionDenPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroResolucionDenPen1() {
        return campoNumeroResolucionDenPen1;
    }

    public void setCampoNumeroResolucionDenPen1(TextField component) {
        this.campoNumeroResolucionDenPen1 = component;
    }

    private HelpInline helpInlineNumeroResolucionDenPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionDenPen1() {
        return helpInlineNumeroResolucionDenPen1;
    }

    public void setHelpInlineNumeroResolucionDenPen1(HelpInline hi) {
        this.helpInlineNumeroResolucionDenPen1 = hi;
    }

    private StaticText campoNumeroResolucionDenPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionDenPen1Texto1() {
        return campoNumeroResolucionDenPen1Texto1;
    }

    public void setCampoNumeroResolucionDenPen1Texto1(StaticText component) {
        this.campoNumeroResolucionDenPen1Texto1 = component;
    }

    private LengthValidator validatorNumeroResolucionDenPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroResolucionDenPen1() {
        return validatorNumeroResolucionDenPen1;
    }
  
    public void setValidatorNumeroResolucionDenPen1(LengthValidator validator) {
        this.validatorNumeroResolucionDenPen1 = validator;
    }
  
    private Label labelFechaResolucionDenPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionDenPen1() {
        return labelFechaResolucionDenPen1;
    }

    public void setLabelFechaResolucionDenPen1(Label l) {
        this.labelFechaResolucionDenPen1 = l;
    }

    private Calendar campoFechaResolucionDenPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionDenPen1() {
        return campoFechaResolucionDenPen1;
    }

    public void setCampoFechaResolucionDenPen1(Calendar component) {
        this.campoFechaResolucionDenPen1 = component;
    }

    private HelpInline helpInlineFechaResolucionDenPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionDenPen1() {
        return helpInlineFechaResolucionDenPen1;
    }

    public void setHelpInlineFechaResolucionDenPen1(HelpInline hi) {
        this.helpInlineFechaResolucionDenPen1 = hi;
    }

    private StaticText campoFechaResolucionDenPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionDenPen1Texto1() {
        return campoFechaResolucionDenPen1Texto1;
    }

    public void setCampoFechaResolucionDenPen1Texto1(StaticText component) {
        this.campoFechaResolucionDenPen1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionDenPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionDenPen1() {
        return converterFechaResolucionDenPen1;
    }
  
    public void setConverterFechaResolucionDenPen1(SqlTimestampConverter converter) {
        this.converterFechaResolucionDenPen1 = converter;
    }
  
    private Label labelMontoPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoPension1() {
        return labelMontoPension1;
    }

    public void setLabelMontoPension1(Label l) {
        this.labelMontoPension1 = l;
    }

    private TextField campoMontoPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoPension1() {
        return campoMontoPension1;
    }

    public void setCampoMontoPension1(TextField component) {
        this.campoMontoPension1 = component;
    }

    private HelpInline helpInlineMontoPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoPension1() {
        return helpInlineMontoPension1;
    }

    public void setHelpInlineMontoPension1(HelpInline hi) {
        this.helpInlineMontoPension1 = hi;
    }

    private StaticText campoMontoPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoPension1Texto1() {
        return campoMontoPension1Texto1;
    }

    public void setCampoMontoPension1Texto1(StaticText component) {
        this.campoMontoPension1Texto1 = component;
    }

    private NumberConverter converterMontoPension1 = new NumberConverter();
  
    public NumberConverter getConverterMontoPension1() {
        return converterMontoPension1;
    }
  
    public void setConverterMontoPension1(NumberConverter converter) {
        this.converterMontoPension1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoPension1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoPension1() {
        return validatorMontoPension1;
    }
  
    public void setValidatorMontoPension1(DoubleRangeValidator validator) {
        this.validatorMontoPension1 = validator;
    }
  
    private Label labelFechaResolucionRevPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionRevPen1() {
        return labelFechaResolucionRevPen1;
    }

    public void setLabelFechaResolucionRevPen1(Label l) {
        this.labelFechaResolucionRevPen1 = l;
    }

    private Calendar campoFechaResolucionRevPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionRevPen1() {
        return campoFechaResolucionRevPen1;
    }

    public void setCampoFechaResolucionRevPen1(Calendar component) {
        this.campoFechaResolucionRevPen1 = component;
    }

    private HelpInline helpInlineFechaResolucionRevPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionRevPen1() {
        return helpInlineFechaResolucionRevPen1;
    }

    public void setHelpInlineFechaResolucionRevPen1(HelpInline hi) {
        this.helpInlineFechaResolucionRevPen1 = hi;
    }

    private StaticText campoFechaResolucionRevPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionRevPen1Texto1() {
        return campoFechaResolucionRevPen1Texto1;
    }

    public void setCampoFechaResolucionRevPen1Texto1(StaticText component) {
        this.campoFechaResolucionRevPen1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionRevPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionRevPen1() {
        return converterFechaResolucionRevPen1;
    }
  
    public void setConverterFechaResolucionRevPen1(SqlTimestampConverter converter) {
        this.converterFechaResolucionRevPen1 = converter;
    }
  
    private Label labelNumeroResolucionRevPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionRevPen1() {
        return labelNumeroResolucionRevPen1;
    }

    public void setLabelNumeroResolucionRevPen1(Label l) {
        this.labelNumeroResolucionRevPen1 = l;
    }

    private TextField campoNumeroResolucionRevPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroResolucionRevPen1() {
        return campoNumeroResolucionRevPen1;
    }

    public void setCampoNumeroResolucionRevPen1(TextField component) {
        this.campoNumeroResolucionRevPen1 = component;
    }

    private HelpInline helpInlineNumeroResolucionRevPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionRevPen1() {
        return helpInlineNumeroResolucionRevPen1;
    }

    public void setHelpInlineNumeroResolucionRevPen1(HelpInline hi) {
        this.helpInlineNumeroResolucionRevPen1 = hi;
    }

    private StaticText campoNumeroResolucionRevPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionRevPen1Texto1() {
        return campoNumeroResolucionRevPen1Texto1;
    }

    public void setCampoNumeroResolucionRevPen1Texto1(StaticText component) {
        this.campoNumeroResolucionRevPen1Texto1 = component;
    }

    private LengthValidator validatorNumeroResolucionRevPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroResolucionRevPen1() {
        return validatorNumeroResolucionRevPen1;
    }
  
    public void setValidatorNumeroResolucionRevPen1(LengthValidator validator) {
        this.validatorNumeroResolucionRevPen1 = validator;
    }
  
    private Button botonAplicar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonAplicar1() {
        return botonAplicar1;
    }

    public void setBotonAplicar1(Button component) {
        this.botonAplicar1 = component;
    }

    private Button botonProcesar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesar1() {
        return botonProcesar1;
    }

    public void setBotonProcesar1(Button component) {
        this.botonProcesar1 = component;
    }

    // </editor-fold>
/**/
    public Proceso4() {
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
/**/
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Proceso4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = ProcesoConstants.FUNCION_PROCESO_IMPORTAR_ARCHIVOS_EXT;

    static long FUNCION_ACCION_2 = ProcesoConstants.FUNCION_PROCESO_ACREDITAR_POT_BEN;

    static long FUNCION_ACCION_3 = ProcesoConstants.FUNCION_PROCESO_ASIGNAR_MESA;

    static long FUNCION_ACCION_4 = ProcesoConstants.FUNCION_PROCESO_PREPARAR_PROX_PAGO_PEN;

    static long FUNCION_ACCION_5 = ProcesoConstants.FUNCION_PROCESO_OTORGAR_PENSIONES_APR;

    static long FUNCION_ACCION_6 = ProcesoConstants.FUNCION_PROCESO_DENEGAR_PENSIONES_OBJ;

    static long FUNCION_ACCION_7 = ProcesoConstants.FUNCION_PROCESO_ACTUALIZAR_PEN_EN_JUPE;

    static long FUNCION_ACCION_8 = ProcesoConstants.FUNCION_PROCESO_ASIGNAR_MONTO_PENSION;

    static long FUNCION_ACCION_9 = ProcesoConstants.FUNCION_PROCESO_VERIFICAR_ELE_PEN;

    static long FUNCION_ACCION_10 = ProcesoConstants.FUNCION_PROCESO_VERIFICAR_ELE_PEN_JUPE;

    static long FUNCION_ACCION_11 = ProcesoConstants.FUNCION_PROCESO_REVOCAR_PENSIONES_APR;

    static long FUNCION_ACCION_12 = ProcesoConstants.FUNCION_PROCESO_APROBAR_EXCLUSION_PEN;

    static long FUNCION_ACCION_13 = ProcesoConstants.FUNCION_PROCESO_EXP_PEN_APR;

    static long FUNCION_ACCION_14 = ProcesoConstants.FUNCION_PROCESO_EXP_PEN_DEN;

    static long FUNCION_ACCION_15 = ProcesoConstants.FUNCION_PROCESO_EXP_PEN_REV;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, BundleWebui.getString("proceso_importar_archivos_ext")),
            new Option(FUNCION_ACCION_2, BundleWebui.getString("proceso_acreditar_pot_ben")),
            new Option(FUNCION_ACCION_3, BundleWebui.getString("proceso_asignar_mesa")),
            new Option(FUNCION_ACCION_4, BundleWebui.getString("proceso_preparar_prox_pago_pen")),
            new Option(FUNCION_ACCION_5, BundleWebui.getString("proceso_otorgar_pensiones_apr")),
            new Option(FUNCION_ACCION_6, BundleWebui.getString("proceso_denegar_pensiones_obj")),
            new Option(FUNCION_ACCION_7, BundleWebui.getString("proceso_actualizar_pen_en_jupe")),
            new Option(FUNCION_ACCION_8, BundleWebui.getString("proceso_asignar_monto_pension")),
            new Option(FUNCION_ACCION_9, BundleWebui.getString("proceso_verificar_ele_pen")),
            new Option(FUNCION_ACCION_10, BundleWebui.getString("proceso_verificar_ele_pen_jupe")),
            new Option(FUNCION_ACCION_11, BundleWebui.getString("proceso_revocar_pensiones_apr")),
            new Option(FUNCION_ACCION_12, BundleWebui.getString("proceso_aprobar_exclusion_pen")),
            new Option(FUNCION_ACCION_13, BundleWebui.getString("proceso_exp_pen_apr")),
            new Option(FUNCION_ACCION_14, BundleWebui.getString("proceso_exp_pen_den")),
            new Option(FUNCION_ACCION_15, BundleWebui.getString("proceso_exp_pen_rev"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdUbicacionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_7 || f == FUNCION_ACCION_9;
    }

    private Bit bitIdUbicacionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdUbicacionRendered();
        }
    };

    public Bit getBitIdUbicacionRendered() {
        return bitIdUbicacionRendered;
    }

    public boolean isFechaRegistroPotBenDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitFechaRegistroPotBenDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaRegistroPotBenDesdeRendered();
        }
    };

    public Bit getBitFechaRegistroPotBenDesdeRendered() {
        return bitFechaRegistroPotBenDesdeRendered;
    }

    public boolean isFechaRegistroPotBenHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitFechaRegistroPotBenHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaRegistroPotBenHastaRendered();
        }
    };

    public Bit getBitFechaRegistroPotBenHastaRendered() {
        return bitFechaRegistroPotBenHastaRendered;
    }

    public boolean isEdadDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitEdadDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isEdadDesdeRendered();
        }
    };

    public Bit getBitEdadDesdeRendered() {
        return bitEdadDesdeRendered;
    }

    public boolean isEdadHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitEdadHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isEdadHastaRendered();
        }
    };

    public Bit getBitEdadHastaRendered() {
        return bitEdadHastaRendered;
    }

    public boolean isLoteRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_3;
    }

    private Bit bitLoteRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isLoteRendered();
        }
    };

    public Bit getBitLoteRendered() {
        return bitLoteRendered;
    }

    public boolean isCodigoSimeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_7 || f == FUNCION_ACCION_8 || f == FUNCION_ACCION_9 || f == FUNCION_ACCION_11 || f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15;
    }

    private Bit bitCodigoSimeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCodigoSimeRendered();
        }
    };

    public Bit getBitCodigoSimeRendered() {
        return bitCodigoSimeRendered;
    }

    public boolean isFechaSolicitudPensionDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_4;
    }

    private Bit bitFechaSolicitudPensionDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaSolicitudPensionDesdeRendered();
        }
    };

    public Bit getBitFechaSolicitudPensionDesdeRendered() {
        return bitFechaSolicitudPensionDesdeRendered;
    }

    public boolean isFechaSolicitudPensionHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_4;
    }

    private Bit bitFechaSolicitudPensionHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaSolicitudPensionHastaRendered();
        }
    };

    public Bit getBitFechaSolicitudPensionHastaRendered() {
        return bitFechaSolicitudPensionHastaRendered;
    }

    public boolean isNumeroResolucionOtorPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5;
    }

    private Bit bitNumeroResolucionOtorPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroResolucionOtorPenRendered();
        }
    };

    public Bit getBitNumeroResolucionOtorPenRendered() {
        return bitNumeroResolucionOtorPenRendered;
    }

    public boolean isFechaResolucionOtorPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5;
    }

    private Bit bitFechaResolucionOtorPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaResolucionOtorPenRendered();
        }
    };

    public Bit getBitFechaResolucionOtorPenRendered() {
        return bitFechaResolucionOtorPenRendered;
    }

    public boolean isCedulaDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_11;
    }

    private Bit bitCedulaDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCedulaDesdeRendered();
        }
    };

    public Bit getBitCedulaDesdeRendered() {
        return bitCedulaDesdeRendered;
    }

    public boolean isCedulaHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_11;
    }

    private Bit bitCedulaHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCedulaHastaRendered();
        }
    };

    public Bit getBitCedulaHastaRendered() {
        return bitCedulaHastaRendered;
    }

    public boolean isNumeroResolucionDenPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_6;
    }

    private Bit bitNumeroResolucionDenPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroResolucionDenPenRendered();
        }
    };

    public Bit getBitNumeroResolucionDenPenRendered() {
        return bitNumeroResolucionDenPenRendered;
    }

    public boolean isFechaResolucionDenPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_6;
    }

    private Bit bitFechaResolucionDenPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaResolucionDenPenRendered();
        }
    };

    public Bit getBitFechaResolucionDenPenRendered() {
        return bitFechaResolucionDenPenRendered;
    }

    public boolean isMontoPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8;
    }

    private Bit bitMontoPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isMontoPensionRendered();
        }
    };

    public Bit getBitMontoPensionRendered() {
        return bitMontoPensionRendered;
    }

    public boolean isFechaResolucionRevPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_11;
    }

    private Bit bitFechaResolucionRevPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaResolucionRevPenRendered();
        }
    };

    public Bit getBitFechaResolucionRevPenRendered() {
        return bitFechaResolucionRevPenRendered;
    }

    public boolean isNumeroResolucionRevPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_11;
    }

    private Bit bitNumeroResolucionRevPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroResolucionRevPenRendered();
        }
    };

    public Bit getBitNumeroResolucionRevPenRendered() {
        return bitNumeroResolucionRevPenRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private ProcesoFacadeLocal procesoFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar: preiniciar, iniciar, preprocesar, prepresentar">
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
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer los valores de los campos">
    private java.sql.Timestamp valorCampoFechaRegistroPotBenDesde1;

    public java.sql.Timestamp getValorCampoFechaRegistroPotBenDesde1() {
        return this.valorCampoFechaRegistroPotBenDesde1;
    }

    public void setValorCampoFechaRegistroPotBenDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaRegistroPotBenDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaRegistroPotBenHasta1;

    public java.sql.Timestamp getValorCampoFechaRegistroPotBenHasta1() {
        return this.valorCampoFechaRegistroPotBenHasta1;
    }

    public void setValorCampoFechaRegistroPotBenHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaRegistroPotBenHasta1 = valor;
    }

    private String textoCampoEdadDesde1;

    public String getTextoCampoEdadDesde1() {
        return this.textoCampoEdadDesde1;
    }

    public void setTextoCampoEdadDesde1(String valor) {
        this.textoCampoEdadDesde1 = valor;
    }

    private String textoCampoEdadHasta1;

    public String getTextoCampoEdadHasta1() {
        return this.textoCampoEdadHasta1;
    }

    public void setTextoCampoEdadHasta1(String valor) {
        this.textoCampoEdadHasta1 = valor;
    }

    private String textoCampoLote1;

    public String getTextoCampoLote1() {
        return this.textoCampoLote1;
    }

    public void setTextoCampoLote1(String valor) {
        this.textoCampoLote1 = valor;
    }

    private String textoCampoCodigoSime1;

    public String getTextoCampoCodigoSime1() {
        return this.textoCampoCodigoSime1;
    }

    public void setTextoCampoCodigoSime1(String valor) {
        this.textoCampoCodigoSime1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaSolicitudPensionDesde1;

    public java.sql.Timestamp getValorCampoFechaSolicitudPensionDesde1() {
        return this.valorCampoFechaSolicitudPensionDesde1;
    }

    public void setValorCampoFechaSolicitudPensionDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaSolicitudPensionDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaSolicitudPensionHasta1;

    public java.sql.Timestamp getValorCampoFechaSolicitudPensionHasta1() {
        return this.valorCampoFechaSolicitudPensionHasta1;
    }

    public void setValorCampoFechaSolicitudPensionHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaSolicitudPensionHasta1 = valor;
    }

    private String textoCampoNumeroResolucionOtorPen1;

    public String getTextoCampoNumeroResolucionOtorPen1() {
        return this.textoCampoNumeroResolucionOtorPen1;
    }

    public void setTextoCampoNumeroResolucionOtorPen1(String valor) {
        this.textoCampoNumeroResolucionOtorPen1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaResolucionOtorPen1;

    public java.sql.Timestamp getValorCampoFechaResolucionOtorPen1() {
        return this.valorCampoFechaResolucionOtorPen1;
    }

    public void setValorCampoFechaResolucionOtorPen1(java.sql.Timestamp valor) {
        this.valorCampoFechaResolucionOtorPen1 = valor;
    }

    private String textoCampoCedulaDesde1;

    public String getTextoCampoCedulaDesde1() {
        return this.textoCampoCedulaDesde1;
    }

    public void setTextoCampoCedulaDesde1(String valor) {
        this.textoCampoCedulaDesde1 = valor;
    }

    private String textoCampoCedulaHasta1;

    public String getTextoCampoCedulaHasta1() {
        return this.textoCampoCedulaHasta1;
    }

    public void setTextoCampoCedulaHasta1(String valor) {
        this.textoCampoCedulaHasta1 = valor;
    }

    private String textoCampoNumeroResolucionDenPen1;

    public String getTextoCampoNumeroResolucionDenPen1() {
        return this.textoCampoNumeroResolucionDenPen1;
    }

    public void setTextoCampoNumeroResolucionDenPen1(String valor) {
        this.textoCampoNumeroResolucionDenPen1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaResolucionDenPen1;

    public java.sql.Timestamp getValorCampoFechaResolucionDenPen1() {
        return this.valorCampoFechaResolucionDenPen1;
    }

    public void setValorCampoFechaResolucionDenPen1(java.sql.Timestamp valor) {
        this.valorCampoFechaResolucionDenPen1 = valor;
    }

    private String textoCampoMontoPension1;

    public String getTextoCampoMontoPension1() {
        return this.textoCampoMontoPension1;
    }

    public void setTextoCampoMontoPension1(String valor) {
        this.textoCampoMontoPension1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaResolucionRevPen1;

    public java.sql.Timestamp getValorCampoFechaResolucionRevPen1() {
        return this.valorCampoFechaResolucionRevPen1;
    }

    public void setValorCampoFechaResolucionRevPen1(java.sql.Timestamp valor) {
        this.valorCampoFechaResolucionRevPen1 = valor;
    }

    private String textoCampoNumeroResolucionRevPen1;

    public String getTextoCampoNumeroResolucionRevPen1() {
        return this.textoCampoNumeroResolucionRevPen1;
    }

    public void setTextoCampoNumeroResolucionRevPen1(String valor) {
        this.textoCampoNumeroResolucionRevPen1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUbicacion">
    private Ubicacion ubicacionIdUbicacion;

    private FiltroBusqueda getFiltroBusquedaIdUbicacion() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        return filtro;
    }

    public Ubicacion getUbicacionIdUbicacion() {
        return this.ubicacionIdUbicacion;
    }

    public void campoIdUbicacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.ubicacionIdUbicacion = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdUbicacion();
                String query = "select * from ubicacion ";
                List<Ubicacion> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdUbicacion = this.ubicacionFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdUbicacion = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdUbicacion = this.ubicacionFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdUbicacion = lista.get(0);
                        }
                    }
                }
                if (this.ubicacionIdUbicacion == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + c + ">", ""));
                }
            } catch (Exception ex) {
                if (ex instanceof ValidatorException) {
                    throw (ValidatorException) ex;
                } else {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null);
                    throw new ValidatorException(message);
                }
            }
        }
    }

    private String textoCampoIdUbicacion1;

    public String getTextoCampoIdUbicacion1() {
        return this.textoCampoIdUbicacion1 != null ? this.textoCampoIdUbicacion1
                : this.ubicacionIdUbicacion != null ? this.ubicacionIdUbicacion.getCodigoUbicacion()
                : null;
    }

    public void setTextoCampoIdUbicacion1(String valor) {
        this.textoCampoIdUbicacion1 = valor;
    }

    public String getToolTipCampoIdUbicacion1() {
        return this.ubicacionIdUbicacion == null ? null : STP.trimToStringRecursoSinNombre(this.ubicacionIdUbicacion.getNombreUbicacion());
    }

    public String getScriptCampoIdUbicacion1Boton1() {
        long funcion = UbicacionConstants.FUNCION_CONSULTAR_UBICACION;
        String campo = this.getCampoIdUbicacion1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdUbicacion());
    }

    public String getScriptCampoIdUbicacion1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = this.ubicacionIdUbicacion == null ? null : this.ubicacionIdUbicacion.getIdUbicacion();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdUbicacion1Boton2Rendered() {
        return this.isIdUbicacionRendered();
    }

    private Bit bitCampoIdUbicacion1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdUbicacion1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdUbicacion1Boton2Rendered() {
        return bitCampoIdUbicacion1Boton2Rendered;
    }

    private boolean isCampoIdUbicacion1Boton3Rendered() {
        return !this.isCampoIdUbicacion1Boton2Rendered();
    }

    private Bit bitCampoIdUbicacion1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdUbicacion1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdUbicacion1Boton3Rendered() {
        return bitCampoIdUbicacion1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* procesoImportarArchivosExt */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* procesoAcreditarPotBen */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* procesoAsignarMesa */
                : f == FUNCION_ACCION_4 ? this.accion4(f) /* procesoPrepararProxPagoPen */
                : f == FUNCION_ACCION_5 ? this.accion5(f) /* procesoOtorgarPensionesApr */
                : f == FUNCION_ACCION_6 ? this.accion6(f) /* procesoDenegarPensionesObj */
                : f == FUNCION_ACCION_7 ? this.accion7(f) /* procesoActualizarPenEnJupe */
                : f == FUNCION_ACCION_8 ? this.accion8(f) /* procesoAsignarMontoPension */
                : f == FUNCION_ACCION_9 ? this.accion9(f) /* procesoVerificarElePen */
                : f == FUNCION_ACCION_10 ? this.accion10(f) /* procesoVerificarElePenJupe */
                : f == FUNCION_ACCION_11 ? this.accion11(f) /* procesoRevocarPensionesApr */
                : f == FUNCION_ACCION_12 ? this.accion12(f) /* procesoAprobarExclusionPen */
                : f == FUNCION_ACCION_13 ? this.accion13(f) /* procesoExpPenApr */
                : f == FUNCION_ACCION_14 ? this.accion14(f) /* procesoExpPenDen */
                : f == FUNCION_ACCION_15 ? this.accion15(f) /* procesoExpPenRev */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoImportarArchivosExt();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_importar_archivos_ext");
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoAcreditarPotBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_acreditar_pot_ben");
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoAsignarMesa();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_asignar_mesa");
        }
        return null;
    }

    private String accion4(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoPrepararProxPagoPen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_preparar_prox_pago_pen");
        }
        return null;
    }

    private String accion5(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoOtorgarPensionesApr();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_otorgar_pensiones_apr");
        }
        return null;
    }

    private String accion6(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoDenegarPensionesObj();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_denegar_pensiones_obj");
        }
        return null;
    }

    private String accion7(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoActualizarPenEnJupe();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_actualizar_pen_en_jupe");
        }
        return null;
    }

    private String accion8(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoAsignarMontoPension();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_asignar_monto_pension");
        }
        return null;
    }

    private String accion9(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoVerificarElePen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_verificar_ele_pen");
        }
        return null;
    }

    private String accion10(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoVerificarElePenJupe();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_verificar_ele_pen_jupe");
        }
        return null;
    }

    private String accion11(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoRevocarPensionesApr();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_revocar_pensiones_apr");
        }
        return null;
    }

    private String accion12(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoAprobarExclusionPen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_aprobar_exclusion_pen");
        }
        return null;
    }

    private String accion13(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoExpPenApr();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_exp_pen_apr");
        }
        return null;
    }

    private String accion14(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoExpPenDen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_exp_pen_den");
        }
        return null;
    }

    private String accion15(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.procesoExpPenRev();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "proceso_exp_pen_rev");
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private ProcesoBusinessProcessLocal procesoBusinessProcess;

    private void procesoImportarArchivosExt() { /* proceso importar archivos ext */
        this.procesoImportarArchivosExt(synchronously);
    }

    private void procesoImportarArchivosExt(boolean synchronously) { /* proceso importar archivos ext */
        try {
            ProcesoImportarArchivosExtMessage message = new ProcesoImportarArchivosExtMessage();
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoImportarArchivosExt(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoAcreditarPotBen() { /* proceso acreditar pot ben */
        this.procesoAcreditarPotBen(synchronously);
    }

    private void procesoAcreditarPotBen(boolean synchronously) { /* proceso acreditar pot ben */
        try {
            Long idUbicacion = this.getUbicacionIdUbicacion() == null ? null : this.getUbicacionIdUbicacion().getIdUbicacion();
            Date fechaRegistroPotBenDesde = this.getValorCampoFechaRegistroPotBenDesde1();
            Date fechaRegistroPotBenHasta = this.getValorCampoFechaRegistroPotBenHasta1();
            Integer edadDesde = (Integer) STP.getObjeto(this.getTextoCampoEdadDesde1(), EnumTipoDatoPar.ENTERO);
            Integer edadHasta = (Integer) STP.getObjeto(this.getTextoCampoEdadHasta1(), EnumTipoDatoPar.ENTERO);
            ProcesoAcreditarPotBenMessage message = new ProcesoAcreditarPotBenMessage(idUbicacion, fechaRegistroPotBenDesde, fechaRegistroPotBenHasta, edadDesde, edadHasta);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoAcreditarPotBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoAsignarMesa() { /* proceso asignar mesa */
        this.procesoAsignarMesa(synchronously);
    }

    private void procesoAsignarMesa(boolean synchronously) { /* proceso asignar mesa */
        try {
            Long lote = (Long) STP.getObjeto(this.getTextoCampoLote1(), EnumTipoDatoPar.ENTERO_GRANDE);
            String codigoSime = this.getTextoCampoCodigoSime1();
            ProcesoAsignarMesaMessage message = new ProcesoAsignarMesaMessage(lote, codigoSime);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoAsignarMesa(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoPrepararProxPagoPen() { /* proceso preparar prox pago pen */
        this.procesoPrepararProxPagoPen(synchronously);
    }

    private void procesoPrepararProxPagoPen(boolean synchronously) { /* proceso preparar prox pago pen */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            Long idUbicacion = this.getUbicacionIdUbicacion() == null ? null : this.getUbicacionIdUbicacion().getIdUbicacion();
            Date fechaSolicitudPensionDesde = this.getValorCampoFechaSolicitudPensionDesde1();
            Date fechaSolicitudPensionHasta = this.getValorCampoFechaSolicitudPensionHasta1();
            ProcesoPrepararProxPagoPenMessage message = new ProcesoPrepararProxPagoPenMessage(codigoSime, idUbicacion, fechaSolicitudPensionDesde, fechaSolicitudPensionHasta);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoPrepararProxPagoPen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoOtorgarPensionesApr() { /* proceso otorgar pensiones apr */
        this.procesoOtorgarPensionesApr(synchronously);
    }

    private void procesoOtorgarPensionesApr(boolean synchronously) { /* proceso otorgar pensiones apr */
        try {
            Long idUbicacion = this.getUbicacionIdUbicacion() == null ? null : this.getUbicacionIdUbicacion().getIdUbicacion();
            String numeroResolucionOtorPen = this.getTextoCampoNumeroResolucionOtorPen1();
            Date fechaResolucionOtorPen = this.getValorCampoFechaResolucionOtorPen1();
            String codigoSime = this.getTextoCampoCodigoSime1();
            String cedulaDesde = this.getTextoCampoCedulaDesde1();
            String cedulaHasta = this.getTextoCampoCedulaHasta1();
            ProcesoOtorgarPensionesAprMessage message = new ProcesoOtorgarPensionesAprMessage(idUbicacion, numeroResolucionOtorPen, fechaResolucionOtorPen, codigoSime, cedulaDesde, cedulaHasta);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoOtorgarPensionesApr(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoDenegarPensionesObj() { /* proceso denegar pensiones obj */
        this.procesoDenegarPensionesObj(synchronously);
    }

    private void procesoDenegarPensionesObj(boolean synchronously) { /* proceso denegar pensiones obj */
        try {
            Long idUbicacion = this.getUbicacionIdUbicacion() == null ? null : this.getUbicacionIdUbicacion().getIdUbicacion();
            String numeroResolucionDenPen = this.getTextoCampoNumeroResolucionDenPen1();
            Date fechaResolucionDenPen = this.getValorCampoFechaResolucionDenPen1();
            String codigoSime = this.getTextoCampoCodigoSime1();
            String cedulaDesde = this.getTextoCampoCedulaDesde1();
            String cedulaHasta = this.getTextoCampoCedulaHasta1();
            ProcesoDenegarPensionesObjMessage message = new ProcesoDenegarPensionesObjMessage(idUbicacion, numeroResolucionDenPen, fechaResolucionDenPen, codigoSime, cedulaDesde, cedulaHasta);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoDenegarPensionesObj(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoActualizarPenEnJupe() { /* proceso actualizar pen en jupe */
        this.procesoActualizarPenEnJupe(synchronously);
    }

    private void procesoActualizarPenEnJupe(boolean synchronously) { /* proceso actualizar pen en jupe */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            Long idUbicacion = this.getUbicacionIdUbicacion() == null ? null : this.getUbicacionIdUbicacion().getIdUbicacion();
            ProcesoActualizarPenEnJupeMessage message = new ProcesoActualizarPenEnJupeMessage(codigoSime, idUbicacion);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoActualizarPenEnJupe(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoAsignarMontoPension() { /* proceso asignar monto pension */
        this.procesoAsignarMontoPension(synchronously);
    }

    private void procesoAsignarMontoPension(boolean synchronously) { /* proceso asignar monto pension */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            BigDecimal montoPension = (BigDecimal) STP.getObjeto(this.getTextoCampoMontoPension1(), EnumTipoDatoPar.NUMERICO);
            ProcesoAsignarMontoPensionMessage message = new ProcesoAsignarMontoPensionMessage(codigoSime, montoPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoAsignarMontoPension(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoVerificarElePen() { /* proceso verificar ele pen */
        this.procesoVerificarElePen(synchronously);
    }

    private void procesoVerificarElePen(boolean synchronously) { /* proceso verificar ele pen */
        try {
            Long idUbicacion = this.getUbicacionIdUbicacion() == null ? null : this.getUbicacionIdUbicacion().getIdUbicacion();
            String codigoSime = this.getTextoCampoCodigoSime1();
            ProcesoVerificarElePenMessage message = new ProcesoVerificarElePenMessage(idUbicacion, codigoSime);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoVerificarElePen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoVerificarElePenJupe() { /* proceso verificar ele pen jupe */
        this.procesoVerificarElePenJupe(synchronously);
    }

    private void procesoVerificarElePenJupe(boolean synchronously) { /* proceso verificar ele pen jupe */
        try {
            ProcesoVerificarElePenJupeMessage message = new ProcesoVerificarElePenJupeMessage();
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoVerificarElePenJupe(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoRevocarPensionesApr() { /* proceso revocar pensiones apr */
        this.procesoRevocarPensionesApr(synchronously);
    }

    private void procesoRevocarPensionesApr(boolean synchronously) { /* proceso revocar pensiones apr */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            Date fechaResolucionRevPen = this.getValorCampoFechaResolucionRevPen1();
            String numeroResolucionRevPen = this.getTextoCampoNumeroResolucionRevPen1();
            String cedulaDesde = this.getTextoCampoCedulaDesde1();
            String cedulaHasta = this.getTextoCampoCedulaHasta1();
            ProcesoRevocarPensionesAprMessage message = new ProcesoRevocarPensionesAprMessage(codigoSime, fechaResolucionRevPen, numeroResolucionRevPen, cedulaDesde, cedulaHasta);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoRevocarPensionesApr(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoAprobarExclusionPen() { /* proceso aprobar exclusion pen */
        this.procesoAprobarExclusionPen(synchronously);
    }

    private void procesoAprobarExclusionPen(boolean synchronously) { /* proceso aprobar exclusion pen */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            ProcesoAprobarExclusionPenMessage message = new ProcesoAprobarExclusionPenMessage(codigoSime);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoAprobarExclusionPen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoExpPenApr() { /* proceso exp pen apr */
        this.procesoExpPenApr(synchronously);
    }

    private void procesoExpPenApr(boolean synchronously) { /* proceso exp pen apr */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            ProcesoExpPenAprMessage message = new ProcesoExpPenAprMessage(codigoSime);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoExpPenApr(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoExpPenDen() { /* proceso exp pen den */
        this.procesoExpPenDen(synchronously);
    }

    private void procesoExpPenDen(boolean synchronously) { /* proceso exp pen den */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            ProcesoExpPenDenMessage message = new ProcesoExpPenDenMessage(codigoSime);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoExpPenDen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void procesoExpPenRev() { /* proceso exp pen rev */
        this.procesoExpPenRev(synchronously);
    }

    private void procesoExpPenRev(boolean synchronously) { /* proceso exp pen rev */
        try {
            String codigoSime = this.getTextoCampoCodigoSime1();
            ProcesoExpPenRevMessage message = new ProcesoExpPenRevMessage(codigoSime);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.procesoBusinessProcess.procesoExpPenRev(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private AbstractMessage requestReply(AbstractMessage message) throws Exception {
        ObjectMessage solicitud = this.messenger.postRequest(message);
        ObjectMessage respuesta = this.messenger.receiveReply(solicitud);
        AbstractMessage mensaje = respuesta == null
                ? (AbstractMessage) solicitud.getObject()
                : (AbstractMessage) respuesta.getObject();
        /**/
        TLC.getBitacora().add(mensaje);
        return mensaje;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
