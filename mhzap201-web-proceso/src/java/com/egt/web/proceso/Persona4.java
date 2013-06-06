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

import com.egt.base.enums.EnumCausaDenPension;
import com.egt.base.enums.EnumCausaRevPension;
import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.base.enums.EnumCausaDenRecoPen;
import com.egt.base.entity.constants.PersonaConstants;
import com.egt.base.entity.constants.UsuarioConstants;
import com.egt.base.entity.constants.UbicacionConstants;
import com.egt.ejb.persistence.entity.Persona;
import com.egt.ejb.persistence.entity.Usuario;
import com.egt.ejb.persistence.entity.Ubicacion;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
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
import com.egt.ejb.business.message.RegistrarCerVidaPersonaMessage;
import com.egt.ejb.business.message.AnularCerVidaPersonaMessage;
import com.egt.ejb.business.message.RegistrarCerDefunPersonaMessage;
import com.egt.ejb.business.message.AnularCerDefunPersonaMessage;
import com.egt.ejb.business.message.AprobarPensionPersonaMessage;
import com.egt.ejb.business.message.AnularAprobacionPenPersonaMessage;
import com.egt.ejb.business.message.ObjetarPensionPersonaMessage;
import com.egt.ejb.business.message.RevocarPensionPersonaMessage;
import com.egt.ejb.business.message.OtorgarPensionPersonaMessage;
import com.egt.ejb.business.message.DenegarPensionPersonaMessage;
import com.egt.ejb.business.message.AnularDenegacionPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarEntregaDocPersonaMessage;
import com.egt.ejb.business.message.IncluirPersonaEnJupeMessage;
import com.egt.ejb.business.message.AsignarMontoPensionPersonaMessage;
import com.egt.ejb.business.message.ActFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.AnulFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AsignarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarDenuPenPersonaMessage;
import com.egt.ejb.business.message.ConfirmarDenuPenPersonaMessage;
import com.egt.ejb.business.message.DesmentirDenuPenPersonaMessage;
import com.egt.ejb.business.message.AnotarPersonaMessage;
import com.egt.ejb.business.message.BorrarPersonaMessage;
import com.egt.ejb.business.message.BorrarPersonaOtroMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.AsignarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaSelMessage;
import com.egt.ejb.business.process.PersonaBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class Persona4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorCertificadoVida1.setMaximum(2000);
        converterFechaCertificadoVida1.setPattern("dd/MM/yyyy");
        converterFechaCertificadoVida1.setType("date");
        validatorDiasVigenciaCertificadoVida1.setMinimum(0L);
        validatorDiasVigenciaCertificadoVida1.setMaximum(1000000000L);
        validatorCertificadoDefuncion1.setMaximum(2000);
        converterFechaCertificadoDefuncion1.setPattern("dd/MM/yyyy");
        converterFechaCertificadoDefuncion1.setType("date");
        validatorComentariosAprobacionPension1.setMaximum(2000);
        validatorOtraCausaDenPension1.setMaximum(2000);
        validatorComentariosObjecionPension1.setMaximum(2000);
        validatorOtraCausaRevPension1.setMaximum(2000);
        validatorComentariosRevocacionPension1.setMaximum(2000);
        validatorNumeroResolucionOtorPen1.setMaximum(2000);
        converterFechaResolucionOtorPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionOtorPen1.setType("date");
        validatorComentariosOtorgamientoPen1.setMaximum(2000);
        validatorNumeroResolucionDenPen1.setMaximum(2000);
        converterFechaResolucionDenPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionDenPen1.setType("date");
        validatorComentariosDenegacionPension1.setMaximum(2000);
        validatorComentariosEntregaDocumentos1.setMaximum(2000);
        converterMontoPension1.setMinIntegerDigits(1);
        converterMontoPension1.setMaxIntegerDigits(40);
        converterMontoPension1.setMaxFractionDigits(3);
        validatorMontoPension1.setMinimum(0.0);
        validatorMontoPension1.setMaximum(1.0E15);
        converterFechaUltimoCobroPension1.setPattern("dd/MM/yyyy");
        converterFechaUltimoCobroPension1.setType("date");
        validatorNotasAnulFecUltCobPen1.setMaximum(2000);
        validatorComentariosSolicitudRecoPen1.setMaximum(2000);
        validatorCodigoSimeRecoPen1.setMaximum(2000);
        validatorComentariosAprRecoPen1.setMaximum(2000);
        validatorOtraCausaDenRecoPen1.setMaximum(2000);
        validatorComentariosDenRecoPen1.setMaximum(2000);
        validatorComentariosRegistroDenuPen1.setMaximum(2000);
        validatorComentariosConfDenuPen1.setMaximum(2000);
        validatorComentariosDesDenuPen1.setMaximum(2000);
        validatorObservacion1.setMaximum(2000);
        converterFechaSolicitudPensionDesde1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudPensionDesde1.setType("date");
        converterFechaSolicitudPensionHasta1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudPensionHasta1.setType("date");
        validatorCodigoSime1.setMaximum(2000);
        converterFechaAprobacionPensionDesde1.setPattern("dd/MM/yyyy");
        converterFechaAprobacionPensionDesde1.setType("date");
        converterFechaAprobacionPensionHasta1.setPattern("dd/MM/yyyy");
        converterFechaAprobacionPensionHasta1.setType("date");
        converterFechaDenegacionPensionDesde1.setPattern("dd/MM/yyyy");
        converterFechaDenegacionPensionDesde1.setType("date");
        converterFechaDenegacionPensionHasta1.setPattern("dd/MM/yyyy");
        converterFechaDenegacionPensionHasta1.setType("date");
        converterFechaRevocacionPensionDesde1.setPattern("dd/MM/yyyy");
        converterFechaRevocacionPensionDesde1.setType("date");
        converterFechaRevocacionPensionHasta1.setPattern("dd/MM/yyyy");
        converterFechaRevocacionPensionHasta1.setType("date");
        converterFechaOtorgamientoPenDesde1.setPattern("dd/MM/yyyy");
        converterFechaOtorgamientoPenDesde1.setType("date");
        converterFechaOtorgamientoPenHasta1.setPattern("dd/MM/yyyy");
        converterFechaOtorgamientoPenHasta1.setType("date");
        converterFechaHoraUltActJupeDesde1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltActJupeDesde1.setType("both");
        converterFechaHoraUltActJupeHasta1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltActJupeHasta1.setType("both");
        converterFechaSolicitudRecoPenDesde1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudRecoPenDesde1.setType("date");
        converterFechaSolicitudRecoPenHasta1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudRecoPenHasta1.setType("date");
        converterFechaResolucionDenPenDesde1.setPattern("dd/MM/yyyy");
        converterFechaResolucionDenPenDesde1.setType("date");
        converterFechaResolucionDenPenHasta1.setPattern("dd/MM/yyyy");
        converterFechaResolucionDenPenHasta1.setType("date");
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

    private Label labelIdPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona1() {
        return labelIdPersona1;
    }

    public void setLabelIdPersona1(Label l) {
        this.labelIdPersona1 = l;
    }

    private TextField campoIdPersona1 = new com.egt.core.jsf.component.CampoTexto();

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

    private Label labelCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoVida1() {
        return labelCertificadoVida1;
    }

    public void setLabelCertificadoVida1(Label l) {
        this.labelCertificadoVida1 = l;
    }

    private TextField campoCertificadoVida1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCertificadoVida1() {
        return campoCertificadoVida1;
    }

    public void setCampoCertificadoVida1(TextField component) {
        this.campoCertificadoVida1 = component;
    }

    private HelpInline helpInlineCertificadoVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCertificadoVida1() {
        return helpInlineCertificadoVida1;
    }

    public void setHelpInlineCertificadoVida1(HelpInline hi) {
        this.helpInlineCertificadoVida1 = hi;
    }

    private StaticText campoCertificadoVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCertificadoVida1Texto1() {
        return campoCertificadoVida1Texto1;
    }

    public void setCampoCertificadoVida1Texto1(StaticText component) {
        this.campoCertificadoVida1Texto1 = component;
    }

    private LengthValidator validatorCertificadoVida1 = new LengthValidator();
  
    public LengthValidator getValidatorCertificadoVida1() {
        return validatorCertificadoVida1;
    }
  
    public void setValidatorCertificadoVida1(LengthValidator validator) {
        this.validatorCertificadoVida1 = validator;
    }
  
    private Label labelFechaCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoVida1() {
        return labelFechaCertificadoVida1;
    }

    public void setLabelFechaCertificadoVida1(Label l) {
        this.labelFechaCertificadoVida1 = l;
    }

    private Calendar campoFechaCertificadoVida1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaCertificadoVida1() {
        return campoFechaCertificadoVida1;
    }

    public void setCampoFechaCertificadoVida1(Calendar component) {
        this.campoFechaCertificadoVida1 = component;
    }

    private HelpInline helpInlineFechaCertificadoVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaCertificadoVida1() {
        return helpInlineFechaCertificadoVida1;
    }

    public void setHelpInlineFechaCertificadoVida1(HelpInline hi) {
        this.helpInlineFechaCertificadoVida1 = hi;
    }

    private StaticText campoFechaCertificadoVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaCertificadoVida1Texto1() {
        return campoFechaCertificadoVida1Texto1;
    }

    public void setCampoFechaCertificadoVida1Texto1(StaticText component) {
        this.campoFechaCertificadoVida1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaCertificadoVida1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaCertificadoVida1() {
        return converterFechaCertificadoVida1;
    }
  
    public void setConverterFechaCertificadoVida1(SqlTimestampConverter converter) {
        this.converterFechaCertificadoVida1 = converter;
    }
  
    private Label labelDiasVigenciaCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDiasVigenciaCertificadoVida1() {
        return labelDiasVigenciaCertificadoVida1;
    }

    public void setLabelDiasVigenciaCertificadoVida1(Label l) {
        this.labelDiasVigenciaCertificadoVida1 = l;
    }

    private TextField campoDiasVigenciaCertificadoVida1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDiasVigenciaCertificadoVida1() {
        return campoDiasVigenciaCertificadoVida1;
    }

    public void setCampoDiasVigenciaCertificadoVida1(TextField component) {
        this.campoDiasVigenciaCertificadoVida1 = component;
    }

    private HelpInline helpInlineDiasVigenciaCertificadoVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDiasVigenciaCertificadoVida1() {
        return helpInlineDiasVigenciaCertificadoVida1;
    }

    public void setHelpInlineDiasVigenciaCertificadoVida1(HelpInline hi) {
        this.helpInlineDiasVigenciaCertificadoVida1 = hi;
    }

    private StaticText campoDiasVigenciaCertificadoVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDiasVigenciaCertificadoVida1Texto1() {
        return campoDiasVigenciaCertificadoVida1Texto1;
    }

    public void setCampoDiasVigenciaCertificadoVida1Texto1(StaticText component) {
        this.campoDiasVigenciaCertificadoVida1Texto1 = component;
    }

    private IntegerConverter converterDiasVigenciaCertificadoVida1 = new IntegerConverter();
  
    public IntegerConverter getConverterDiasVigenciaCertificadoVida1() {
        return converterDiasVigenciaCertificadoVida1;
    }
  
    public void setConverterDiasVigenciaCertificadoVida1(IntegerConverter converter) {
        this.converterDiasVigenciaCertificadoVida1 = converter;
    }
  
    private LongRangeValidator validatorDiasVigenciaCertificadoVida1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorDiasVigenciaCertificadoVida1() {
        return validatorDiasVigenciaCertificadoVida1;
    }
  
    public void setValidatorDiasVigenciaCertificadoVida1(LongRangeValidator validator) {
        this.validatorDiasVigenciaCertificadoVida1 = validator;
    }
  
    private Label labelCertificadoDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoDefuncion1() {
        return labelCertificadoDefuncion1;
    }

    public void setLabelCertificadoDefuncion1(Label l) {
        this.labelCertificadoDefuncion1 = l;
    }

    private TextField campoCertificadoDefuncion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCertificadoDefuncion1() {
        return campoCertificadoDefuncion1;
    }

    public void setCampoCertificadoDefuncion1(TextField component) {
        this.campoCertificadoDefuncion1 = component;
    }

    private HelpInline helpInlineCertificadoDefuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCertificadoDefuncion1() {
        return helpInlineCertificadoDefuncion1;
    }

    public void setHelpInlineCertificadoDefuncion1(HelpInline hi) {
        this.helpInlineCertificadoDefuncion1 = hi;
    }

    private StaticText campoCertificadoDefuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCertificadoDefuncion1Texto1() {
        return campoCertificadoDefuncion1Texto1;
    }

    public void setCampoCertificadoDefuncion1Texto1(StaticText component) {
        this.campoCertificadoDefuncion1Texto1 = component;
    }

    private LengthValidator validatorCertificadoDefuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorCertificadoDefuncion1() {
        return validatorCertificadoDefuncion1;
    }
  
    public void setValidatorCertificadoDefuncion1(LengthValidator validator) {
        this.validatorCertificadoDefuncion1 = validator;
    }
  
    private Label labelFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoDefuncion1() {
        return labelFechaCertificadoDefuncion1;
    }

    public void setLabelFechaCertificadoDefuncion1(Label l) {
        this.labelFechaCertificadoDefuncion1 = l;
    }

    private Calendar campoFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaCertificadoDefuncion1() {
        return campoFechaCertificadoDefuncion1;
    }

    public void setCampoFechaCertificadoDefuncion1(Calendar component) {
        this.campoFechaCertificadoDefuncion1 = component;
    }

    private HelpInline helpInlineFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaCertificadoDefuncion1() {
        return helpInlineFechaCertificadoDefuncion1;
    }

    public void setHelpInlineFechaCertificadoDefuncion1(HelpInline hi) {
        this.helpInlineFechaCertificadoDefuncion1 = hi;
    }

    private StaticText campoFechaCertificadoDefuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaCertificadoDefuncion1Texto1() {
        return campoFechaCertificadoDefuncion1Texto1;
    }

    public void setCampoFechaCertificadoDefuncion1Texto1(StaticText component) {
        this.campoFechaCertificadoDefuncion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaCertificadoDefuncion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaCertificadoDefuncion1() {
        return converterFechaCertificadoDefuncion1;
    }
  
    public void setConverterFechaCertificadoDefuncion1(SqlTimestampConverter converter) {
        this.converterFechaCertificadoDefuncion1 = converter;
    }
  
    private Label labelComentariosAprobacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprobacionPension1() {
        return labelComentariosAprobacionPension1;
    }

    public void setLabelComentariosAprobacionPension1(Label l) {
        this.labelComentariosAprobacionPension1 = l;
    }

    private TextField campoComentariosAprobacionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosAprobacionPension1() {
        return campoComentariosAprobacionPension1;
    }

    public void setCampoComentariosAprobacionPension1(TextField component) {
        this.campoComentariosAprobacionPension1 = component;
    }

    private HelpInline helpInlineComentariosAprobacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprobacionPension1() {
        return helpInlineComentariosAprobacionPension1;
    }

    public void setHelpInlineComentariosAprobacionPension1(HelpInline hi) {
        this.helpInlineComentariosAprobacionPension1 = hi;
    }

    private StaticText campoComentariosAprobacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprobacionPension1Texto1() {
        return campoComentariosAprobacionPension1Texto1;
    }

    public void setCampoComentariosAprobacionPension1Texto1(StaticText component) {
        this.campoComentariosAprobacionPension1Texto1 = component;
    }

    private LengthValidator validatorComentariosAprobacionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAprobacionPension1() {
        return validatorComentariosAprobacionPension1;
    }
  
    public void setValidatorComentariosAprobacionPension1(LengthValidator validator) {
        this.validatorComentariosAprobacionPension1 = validator;
    }
  
    private Label labelNumeroCausaDenPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenPension1() {
        return labelNumeroCausaDenPension1;
    }

    public void setLabelNumeroCausaDenPension1(Label l) {
        this.labelNumeroCausaDenPension1 = l;
    }

    private DropDown listaNumeroCausaDenPension1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaDenPension1() {
        return listaNumeroCausaDenPension1;
    }

    public void setListaNumeroCausaDenPension1(DropDown component) {
        this.listaNumeroCausaDenPension1 = component;
    }

    private HelpInline helpInlineNumeroCausaDenPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenPension1() {
        return helpInlineNumeroCausaDenPension1;
    }

    public void setHelpInlineNumeroCausaDenPension1(HelpInline hi) {
        this.helpInlineNumeroCausaDenPension1 = hi;
    }

    private StaticText listaNumeroCausaDenPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenPension1Texto1() {
        return listaNumeroCausaDenPension1Texto1;
    }

    public void setListaNumeroCausaDenPension1Texto1(StaticText component) {
        this.listaNumeroCausaDenPension1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaDenPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaDenPension1() {
        return converterNumeroCausaDenPension1;
    }
  
    public void setConverterNumeroCausaDenPension1(IntegerConverter converter) {
        this.converterNumeroCausaDenPension1 = converter;
    }
  
    private Label labelOtraCausaDenPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenPension1() {
        return labelOtraCausaDenPension1;
    }

    public void setLabelOtraCausaDenPension1(Label l) {
        this.labelOtraCausaDenPension1 = l;
    }

    private TextField campoOtraCausaDenPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaDenPension1() {
        return campoOtraCausaDenPension1;
    }

    public void setCampoOtraCausaDenPension1(TextField component) {
        this.campoOtraCausaDenPension1 = component;
    }

    private HelpInline helpInlineOtraCausaDenPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenPension1() {
        return helpInlineOtraCausaDenPension1;
    }

    public void setHelpInlineOtraCausaDenPension1(HelpInline hi) {
        this.helpInlineOtraCausaDenPension1 = hi;
    }

    private StaticText campoOtraCausaDenPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenPension1Texto1() {
        return campoOtraCausaDenPension1Texto1;
    }

    public void setCampoOtraCausaDenPension1Texto1(StaticText component) {
        this.campoOtraCausaDenPension1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaDenPension1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaDenPension1() {
        return validatorOtraCausaDenPension1;
    }
  
    public void setValidatorOtraCausaDenPension1(LengthValidator validator) {
        this.validatorOtraCausaDenPension1 = validator;
    }
  
    private Label labelComentariosObjecionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosObjecionPension1() {
        return labelComentariosObjecionPension1;
    }

    public void setLabelComentariosObjecionPension1(Label l) {
        this.labelComentariosObjecionPension1 = l;
    }

    private TextField campoComentariosObjecionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosObjecionPension1() {
        return campoComentariosObjecionPension1;
    }

    public void setCampoComentariosObjecionPension1(TextField component) {
        this.campoComentariosObjecionPension1 = component;
    }

    private HelpInline helpInlineComentariosObjecionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosObjecionPension1() {
        return helpInlineComentariosObjecionPension1;
    }

    public void setHelpInlineComentariosObjecionPension1(HelpInline hi) {
        this.helpInlineComentariosObjecionPension1 = hi;
    }

    private StaticText campoComentariosObjecionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosObjecionPension1Texto1() {
        return campoComentariosObjecionPension1Texto1;
    }

    public void setCampoComentariosObjecionPension1Texto1(StaticText component) {
        this.campoComentariosObjecionPension1Texto1 = component;
    }

    private LengthValidator validatorComentariosObjecionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosObjecionPension1() {
        return validatorComentariosObjecionPension1;
    }
  
    public void setValidatorComentariosObjecionPension1(LengthValidator validator) {
        this.validatorComentariosObjecionPension1 = validator;
    }
  
    private Label labelNumeroCausaRevPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaRevPension1() {
        return labelNumeroCausaRevPension1;
    }

    public void setLabelNumeroCausaRevPension1(Label l) {
        this.labelNumeroCausaRevPension1 = l;
    }

    private DropDown listaNumeroCausaRevPension1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaRevPension1() {
        return listaNumeroCausaRevPension1;
    }

    public void setListaNumeroCausaRevPension1(DropDown component) {
        this.listaNumeroCausaRevPension1 = component;
    }

    private HelpInline helpInlineNumeroCausaRevPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaRevPension1() {
        return helpInlineNumeroCausaRevPension1;
    }

    public void setHelpInlineNumeroCausaRevPension1(HelpInline hi) {
        this.helpInlineNumeroCausaRevPension1 = hi;
    }

    private StaticText listaNumeroCausaRevPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaRevPension1Texto1() {
        return listaNumeroCausaRevPension1Texto1;
    }

    public void setListaNumeroCausaRevPension1Texto1(StaticText component) {
        this.listaNumeroCausaRevPension1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaRevPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaRevPension1() {
        return converterNumeroCausaRevPension1;
    }
  
    public void setConverterNumeroCausaRevPension1(IntegerConverter converter) {
        this.converterNumeroCausaRevPension1 = converter;
    }
  
    private Label labelOtraCausaRevPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaRevPension1() {
        return labelOtraCausaRevPension1;
    }

    public void setLabelOtraCausaRevPension1(Label l) {
        this.labelOtraCausaRevPension1 = l;
    }

    private TextField campoOtraCausaRevPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaRevPension1() {
        return campoOtraCausaRevPension1;
    }

    public void setCampoOtraCausaRevPension1(TextField component) {
        this.campoOtraCausaRevPension1 = component;
    }

    private HelpInline helpInlineOtraCausaRevPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaRevPension1() {
        return helpInlineOtraCausaRevPension1;
    }

    public void setHelpInlineOtraCausaRevPension1(HelpInline hi) {
        this.helpInlineOtraCausaRevPension1 = hi;
    }

    private StaticText campoOtraCausaRevPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaRevPension1Texto1() {
        return campoOtraCausaRevPension1Texto1;
    }

    public void setCampoOtraCausaRevPension1Texto1(StaticText component) {
        this.campoOtraCausaRevPension1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaRevPension1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaRevPension1() {
        return validatorOtraCausaRevPension1;
    }
  
    public void setValidatorOtraCausaRevPension1(LengthValidator validator) {
        this.validatorOtraCausaRevPension1 = validator;
    }
  
    private Label labelComentariosRevocacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRevocacionPension1() {
        return labelComentariosRevocacionPension1;
    }

    public void setLabelComentariosRevocacionPension1(Label l) {
        this.labelComentariosRevocacionPension1 = l;
    }

    private TextField campoComentariosRevocacionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosRevocacionPension1() {
        return campoComentariosRevocacionPension1;
    }

    public void setCampoComentariosRevocacionPension1(TextField component) {
        this.campoComentariosRevocacionPension1 = component;
    }

    private HelpInline helpInlineComentariosRevocacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosRevocacionPension1() {
        return helpInlineComentariosRevocacionPension1;
    }

    public void setHelpInlineComentariosRevocacionPension1(HelpInline hi) {
        this.helpInlineComentariosRevocacionPension1 = hi;
    }

    private StaticText campoComentariosRevocacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosRevocacionPension1Texto1() {
        return campoComentariosRevocacionPension1Texto1;
    }

    public void setCampoComentariosRevocacionPension1Texto1(StaticText component) {
        this.campoComentariosRevocacionPension1Texto1 = component;
    }

    private LengthValidator validatorComentariosRevocacionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosRevocacionPension1() {
        return validatorComentariosRevocacionPension1;
    }
  
    public void setValidatorComentariosRevocacionPension1(LengthValidator validator) {
        this.validatorComentariosRevocacionPension1 = validator;
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
  
    private Label labelComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosOtorgamientoPen1() {
        return labelComentariosOtorgamientoPen1;
    }

    public void setLabelComentariosOtorgamientoPen1(Label l) {
        this.labelComentariosOtorgamientoPen1 = l;
    }

    private TextField campoComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosOtorgamientoPen1() {
        return campoComentariosOtorgamientoPen1;
    }

    public void setCampoComentariosOtorgamientoPen1(TextField component) {
        this.campoComentariosOtorgamientoPen1 = component;
    }

    private HelpInline helpInlineComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosOtorgamientoPen1() {
        return helpInlineComentariosOtorgamientoPen1;
    }

    public void setHelpInlineComentariosOtorgamientoPen1(HelpInline hi) {
        this.helpInlineComentariosOtorgamientoPen1 = hi;
    }

    private StaticText campoComentariosOtorgamientoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosOtorgamientoPen1Texto1() {
        return campoComentariosOtorgamientoPen1Texto1;
    }

    public void setCampoComentariosOtorgamientoPen1Texto1(StaticText component) {
        this.campoComentariosOtorgamientoPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosOtorgamientoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosOtorgamientoPen1() {
        return validatorComentariosOtorgamientoPen1;
    }
  
    public void setValidatorComentariosOtorgamientoPen1(LengthValidator validator) {
        this.validatorComentariosOtorgamientoPen1 = validator;
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
  
    private Label labelComentariosDenegacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenegacionPension1() {
        return labelComentariosDenegacionPension1;
    }

    public void setLabelComentariosDenegacionPension1(Label l) {
        this.labelComentariosDenegacionPension1 = l;
    }

    private TextField campoComentariosDenegacionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosDenegacionPension1() {
        return campoComentariosDenegacionPension1;
    }

    public void setCampoComentariosDenegacionPension1(TextField component) {
        this.campoComentariosDenegacionPension1 = component;
    }

    private HelpInline helpInlineComentariosDenegacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenegacionPension1() {
        return helpInlineComentariosDenegacionPension1;
    }

    public void setHelpInlineComentariosDenegacionPension1(HelpInline hi) {
        this.helpInlineComentariosDenegacionPension1 = hi;
    }

    private StaticText campoComentariosDenegacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenegacionPension1Texto1() {
        return campoComentariosDenegacionPension1Texto1;
    }

    public void setCampoComentariosDenegacionPension1Texto1(StaticText component) {
        this.campoComentariosDenegacionPension1Texto1 = component;
    }

    private LengthValidator validatorComentariosDenegacionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDenegacionPension1() {
        return validatorComentariosDenegacionPension1;
    }
  
    public void setValidatorComentariosDenegacionPension1(LengthValidator validator) {
        this.validatorComentariosDenegacionPension1 = validator;
    }
  
    private Label labelEsPersonaConCerVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCerVida1() {
        return labelEsPersonaConCerVida1;
    }

    public void setLabelEsPersonaConCerVida1(Label l) {
        this.labelEsPersonaConCerVida1 = l;
    }

    private DropDown listaEsPersonaConCerVida1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConCerVida1() {
        return listaEsPersonaConCerVida1;
    }

    public void setListaEsPersonaConCerVida1(DropDown component) {
        this.listaEsPersonaConCerVida1 = component;
    }

    private HelpInline helpInlineEsPersonaConCerVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCerVida1() {
        return helpInlineEsPersonaConCerVida1;
    }

    public void setHelpInlineEsPersonaConCerVida1(HelpInline hi) {
        this.helpInlineEsPersonaConCerVida1 = hi;
    }

    private StaticText listaEsPersonaConCerVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCerVida1Texto1() {
        return listaEsPersonaConCerVida1Texto1;
    }

    public void setListaEsPersonaConCerVida1Texto1(StaticText component) {
        this.listaEsPersonaConCerVida1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConCerVida1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConCerVida1() {
        return converterEsPersonaConCerVida1;
    }
  
    public void setConverterEsPersonaConCerVida1(IntegerConverter converter) {
        this.converterEsPersonaConCerVida1 = converter;
    }
  
    private Label labelEsPersonaConCopiaCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCopiaCedula1() {
        return labelEsPersonaConCopiaCedula1;
    }

    public void setLabelEsPersonaConCopiaCedula1(Label l) {
        this.labelEsPersonaConCopiaCedula1 = l;
    }

    private DropDown listaEsPersonaConCopiaCedula1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConCopiaCedula1() {
        return listaEsPersonaConCopiaCedula1;
    }

    public void setListaEsPersonaConCopiaCedula1(DropDown component) {
        this.listaEsPersonaConCopiaCedula1 = component;
    }

    private HelpInline helpInlineEsPersonaConCopiaCedula1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCopiaCedula1() {
        return helpInlineEsPersonaConCopiaCedula1;
    }

    public void setHelpInlineEsPersonaConCopiaCedula1(HelpInline hi) {
        this.helpInlineEsPersonaConCopiaCedula1 = hi;
    }

    private StaticText listaEsPersonaConCopiaCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCopiaCedula1Texto1() {
        return listaEsPersonaConCopiaCedula1Texto1;
    }

    public void setListaEsPersonaConCopiaCedula1Texto1(StaticText component) {
        this.listaEsPersonaConCopiaCedula1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConCopiaCedula1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConCopiaCedula1() {
        return converterEsPersonaConCopiaCedula1;
    }
  
    public void setConverterEsPersonaConCopiaCedula1(IntegerConverter converter) {
        this.converterEsPersonaConCopiaCedula1 = converter;
    }
  
    private Label labelEsPersonaConDeclaracionJur1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConDeclaracionJur1() {
        return labelEsPersonaConDeclaracionJur1;
    }

    public void setLabelEsPersonaConDeclaracionJur1(Label l) {
        this.labelEsPersonaConDeclaracionJur1 = l;
    }

    private DropDown listaEsPersonaConDeclaracionJur1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConDeclaracionJur1() {
        return listaEsPersonaConDeclaracionJur1;
    }

    public void setListaEsPersonaConDeclaracionJur1(DropDown component) {
        this.listaEsPersonaConDeclaracionJur1 = component;
    }

    private HelpInline helpInlineEsPersonaConDeclaracionJur1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConDeclaracionJur1() {
        return helpInlineEsPersonaConDeclaracionJur1;
    }

    public void setHelpInlineEsPersonaConDeclaracionJur1(HelpInline hi) {
        this.helpInlineEsPersonaConDeclaracionJur1 = hi;
    }

    private StaticText listaEsPersonaConDeclaracionJur1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConDeclaracionJur1Texto1() {
        return listaEsPersonaConDeclaracionJur1Texto1;
    }

    public void setListaEsPersonaConDeclaracionJur1Texto1(StaticText component) {
        this.listaEsPersonaConDeclaracionJur1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConDeclaracionJur1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConDeclaracionJur1() {
        return converterEsPersonaConDeclaracionJur1;
    }
  
    public void setConverterEsPersonaConDeclaracionJur1(IntegerConverter converter) {
        this.converterEsPersonaConDeclaracionJur1 = converter;
    }
  
    private Label labelComentariosEntregaDocumentos1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosEntregaDocumentos1() {
        return labelComentariosEntregaDocumentos1;
    }

    public void setLabelComentariosEntregaDocumentos1(Label l) {
        this.labelComentariosEntregaDocumentos1 = l;
    }

    private TextField campoComentariosEntregaDocumentos1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosEntregaDocumentos1() {
        return campoComentariosEntregaDocumentos1;
    }

    public void setCampoComentariosEntregaDocumentos1(TextField component) {
        this.campoComentariosEntregaDocumentos1 = component;
    }

    private HelpInline helpInlineComentariosEntregaDocumentos1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosEntregaDocumentos1() {
        return helpInlineComentariosEntregaDocumentos1;
    }

    public void setHelpInlineComentariosEntregaDocumentos1(HelpInline hi) {
        this.helpInlineComentariosEntregaDocumentos1 = hi;
    }

    private StaticText campoComentariosEntregaDocumentos1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosEntregaDocumentos1Texto1() {
        return campoComentariosEntregaDocumentos1Texto1;
    }

    public void setCampoComentariosEntregaDocumentos1Texto1(StaticText component) {
        this.campoComentariosEntregaDocumentos1Texto1 = component;
    }

    private LengthValidator validatorComentariosEntregaDocumentos1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosEntregaDocumentos1() {
        return validatorComentariosEntregaDocumentos1;
    }
  
    public void setValidatorComentariosEntregaDocumentos1(LengthValidator validator) {
        this.validatorComentariosEntregaDocumentos1 = validator;
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
  
    private Label labelFechaUltimoCobroPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimoCobroPension1() {
        return labelFechaUltimoCobroPension1;
    }

    public void setLabelFechaUltimoCobroPension1(Label l) {
        this.labelFechaUltimoCobroPension1 = l;
    }

    private Calendar campoFechaUltimoCobroPension1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimoCobroPension1() {
        return campoFechaUltimoCobroPension1;
    }

    public void setCampoFechaUltimoCobroPension1(Calendar component) {
        this.campoFechaUltimoCobroPension1 = component;
    }

    private HelpInline helpInlineFechaUltimoCobroPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimoCobroPension1() {
        return helpInlineFechaUltimoCobroPension1;
    }

    public void setHelpInlineFechaUltimoCobroPension1(HelpInline hi) {
        this.helpInlineFechaUltimoCobroPension1 = hi;
    }

    private StaticText campoFechaUltimoCobroPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimoCobroPension1Texto1() {
        return campoFechaUltimoCobroPension1Texto1;
    }

    public void setCampoFechaUltimoCobroPension1Texto1(StaticText component) {
        this.campoFechaUltimoCobroPension1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaUltimoCobroPension1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaUltimoCobroPension1() {
        return converterFechaUltimoCobroPension1;
    }
  
    public void setConverterFechaUltimoCobroPension1(SqlTimestampConverter converter) {
        this.converterFechaUltimoCobroPension1 = converter;
    }
  
    private Label labelNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNotasAnulFecUltCobPen1() {
        return labelNotasAnulFecUltCobPen1;
    }

    public void setLabelNotasAnulFecUltCobPen1(Label l) {
        this.labelNotasAnulFecUltCobPen1 = l;
    }

    private TextField campoNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNotasAnulFecUltCobPen1() {
        return campoNotasAnulFecUltCobPen1;
    }

    public void setCampoNotasAnulFecUltCobPen1(TextField component) {
        this.campoNotasAnulFecUltCobPen1 = component;
    }

    private HelpInline helpInlineNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNotasAnulFecUltCobPen1() {
        return helpInlineNotasAnulFecUltCobPen1;
    }

    public void setHelpInlineNotasAnulFecUltCobPen1(HelpInline hi) {
        this.helpInlineNotasAnulFecUltCobPen1 = hi;
    }

    private StaticText campoNotasAnulFecUltCobPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNotasAnulFecUltCobPen1Texto1() {
        return campoNotasAnulFecUltCobPen1Texto1;
    }

    public void setCampoNotasAnulFecUltCobPen1Texto1(StaticText component) {
        this.campoNotasAnulFecUltCobPen1Texto1 = component;
    }

    private LengthValidator validatorNotasAnulFecUltCobPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNotasAnulFecUltCobPen1() {
        return validatorNotasAnulFecUltCobPen1;
    }
  
    public void setValidatorNotasAnulFecUltCobPen1(LengthValidator validator) {
        this.validatorNotasAnulFecUltCobPen1 = validator;
    }
  
    private Label labelComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudRecoPen1() {
        return labelComentariosSolicitudRecoPen1;
    }

    public void setLabelComentariosSolicitudRecoPen1(Label l) {
        this.labelComentariosSolicitudRecoPen1 = l;
    }

    private TextField campoComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosSolicitudRecoPen1() {
        return campoComentariosSolicitudRecoPen1;
    }

    public void setCampoComentariosSolicitudRecoPen1(TextField component) {
        this.campoComentariosSolicitudRecoPen1 = component;
    }

    private HelpInline helpInlineComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosSolicitudRecoPen1() {
        return helpInlineComentariosSolicitudRecoPen1;
    }

    public void setHelpInlineComentariosSolicitudRecoPen1(HelpInline hi) {
        this.helpInlineComentariosSolicitudRecoPen1 = hi;
    }

    private StaticText campoComentariosSolicitudRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosSolicitudRecoPen1Texto1() {
        return campoComentariosSolicitudRecoPen1Texto1;
    }

    public void setCampoComentariosSolicitudRecoPen1Texto1(StaticText component) {
        this.campoComentariosSolicitudRecoPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosSolicitudRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosSolicitudRecoPen1() {
        return validatorComentariosSolicitudRecoPen1;
    }
  
    public void setValidatorComentariosSolicitudRecoPen1(LengthValidator validator) {
        this.validatorComentariosSolicitudRecoPen1 = validator;
    }
  
    private Label labelCodigoSimeRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoSimeRecoPen1() {
        return labelCodigoSimeRecoPen1;
    }

    public void setLabelCodigoSimeRecoPen1(Label l) {
        this.labelCodigoSimeRecoPen1 = l;
    }

    private TextField campoCodigoSimeRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCodigoSimeRecoPen1() {
        return campoCodigoSimeRecoPen1;
    }

    public void setCampoCodigoSimeRecoPen1(TextField component) {
        this.campoCodigoSimeRecoPen1 = component;
    }

    private HelpInline helpInlineCodigoSimeRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoSimeRecoPen1() {
        return helpInlineCodigoSimeRecoPen1;
    }

    public void setHelpInlineCodigoSimeRecoPen1(HelpInline hi) {
        this.helpInlineCodigoSimeRecoPen1 = hi;
    }

    private StaticText campoCodigoSimeRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoSimeRecoPen1Texto1() {
        return campoCodigoSimeRecoPen1Texto1;
    }

    public void setCampoCodigoSimeRecoPen1Texto1(StaticText component) {
        this.campoCodigoSimeRecoPen1Texto1 = component;
    }

    private LengthValidator validatorCodigoSimeRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoSimeRecoPen1() {
        return validatorCodigoSimeRecoPen1;
    }
  
    public void setValidatorCodigoSimeRecoPen1(LengthValidator validator) {
        this.validatorCodigoSimeRecoPen1 = validator;
    }
  
    private Label labelComentariosAprRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprRecoPen1() {
        return labelComentariosAprRecoPen1;
    }

    public void setLabelComentariosAprRecoPen1(Label l) {
        this.labelComentariosAprRecoPen1 = l;
    }

    private TextField campoComentariosAprRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosAprRecoPen1() {
        return campoComentariosAprRecoPen1;
    }

    public void setCampoComentariosAprRecoPen1(TextField component) {
        this.campoComentariosAprRecoPen1 = component;
    }

    private HelpInline helpInlineComentariosAprRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprRecoPen1() {
        return helpInlineComentariosAprRecoPen1;
    }

    public void setHelpInlineComentariosAprRecoPen1(HelpInline hi) {
        this.helpInlineComentariosAprRecoPen1 = hi;
    }

    private StaticText campoComentariosAprRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprRecoPen1Texto1() {
        return campoComentariosAprRecoPen1Texto1;
    }

    public void setCampoComentariosAprRecoPen1Texto1(StaticText component) {
        this.campoComentariosAprRecoPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosAprRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAprRecoPen1() {
        return validatorComentariosAprRecoPen1;
    }
  
    public void setValidatorComentariosAprRecoPen1(LengthValidator validator) {
        this.validatorComentariosAprRecoPen1 = validator;
    }
  
    private Label labelNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenRecoPen1() {
        return labelNumeroCausaDenRecoPen1;
    }

    public void setLabelNumeroCausaDenRecoPen1(Label l) {
        this.labelNumeroCausaDenRecoPen1 = l;
    }

    private DropDown listaNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaDenRecoPen1() {
        return listaNumeroCausaDenRecoPen1;
    }

    public void setListaNumeroCausaDenRecoPen1(DropDown component) {
        this.listaNumeroCausaDenRecoPen1 = component;
    }

    private HelpInline helpInlineNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenRecoPen1() {
        return helpInlineNumeroCausaDenRecoPen1;
    }

    public void setHelpInlineNumeroCausaDenRecoPen1(HelpInline hi) {
        this.helpInlineNumeroCausaDenRecoPen1 = hi;
    }

    private StaticText listaNumeroCausaDenRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenRecoPen1Texto1() {
        return listaNumeroCausaDenRecoPen1Texto1;
    }

    public void setListaNumeroCausaDenRecoPen1Texto1(StaticText component) {
        this.listaNumeroCausaDenRecoPen1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaDenRecoPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaDenRecoPen1() {
        return converterNumeroCausaDenRecoPen1;
    }
  
    public void setConverterNumeroCausaDenRecoPen1(IntegerConverter converter) {
        this.converterNumeroCausaDenRecoPen1 = converter;
    }
  
    private Label labelOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenRecoPen1() {
        return labelOtraCausaDenRecoPen1;
    }

    public void setLabelOtraCausaDenRecoPen1(Label l) {
        this.labelOtraCausaDenRecoPen1 = l;
    }

    private TextField campoOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaDenRecoPen1() {
        return campoOtraCausaDenRecoPen1;
    }

    public void setCampoOtraCausaDenRecoPen1(TextField component) {
        this.campoOtraCausaDenRecoPen1 = component;
    }

    private HelpInline helpInlineOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenRecoPen1() {
        return helpInlineOtraCausaDenRecoPen1;
    }

    public void setHelpInlineOtraCausaDenRecoPen1(HelpInline hi) {
        this.helpInlineOtraCausaDenRecoPen1 = hi;
    }

    private StaticText campoOtraCausaDenRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenRecoPen1Texto1() {
        return campoOtraCausaDenRecoPen1Texto1;
    }

    public void setCampoOtraCausaDenRecoPen1Texto1(StaticText component) {
        this.campoOtraCausaDenRecoPen1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaDenRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaDenRecoPen1() {
        return validatorOtraCausaDenRecoPen1;
    }
  
    public void setValidatorOtraCausaDenRecoPen1(LengthValidator validator) {
        this.validatorOtraCausaDenRecoPen1 = validator;
    }
  
    private Label labelComentariosDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenRecoPen1() {
        return labelComentariosDenRecoPen1;
    }

    public void setLabelComentariosDenRecoPen1(Label l) {
        this.labelComentariosDenRecoPen1 = l;
    }

    private TextField campoComentariosDenRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosDenRecoPen1() {
        return campoComentariosDenRecoPen1;
    }

    public void setCampoComentariosDenRecoPen1(TextField component) {
        this.campoComentariosDenRecoPen1 = component;
    }

    private HelpInline helpInlineComentariosDenRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenRecoPen1() {
        return helpInlineComentariosDenRecoPen1;
    }

    public void setHelpInlineComentariosDenRecoPen1(HelpInline hi) {
        this.helpInlineComentariosDenRecoPen1 = hi;
    }

    private StaticText campoComentariosDenRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenRecoPen1Texto1() {
        return campoComentariosDenRecoPen1Texto1;
    }

    public void setCampoComentariosDenRecoPen1Texto1(StaticText component) {
        this.campoComentariosDenRecoPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosDenRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDenRecoPen1() {
        return validatorComentariosDenRecoPen1;
    }
  
    public void setValidatorComentariosDenRecoPen1(LengthValidator validator) {
        this.validatorComentariosDenRecoPen1 = validator;
    }
  
    private Label labelComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRegistroDenuPen1() {
        return labelComentariosRegistroDenuPen1;
    }

    public void setLabelComentariosRegistroDenuPen1(Label l) {
        this.labelComentariosRegistroDenuPen1 = l;
    }

    private TextField campoComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosRegistroDenuPen1() {
        return campoComentariosRegistroDenuPen1;
    }

    public void setCampoComentariosRegistroDenuPen1(TextField component) {
        this.campoComentariosRegistroDenuPen1 = component;
    }

    private HelpInline helpInlineComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosRegistroDenuPen1() {
        return helpInlineComentariosRegistroDenuPen1;
    }

    public void setHelpInlineComentariosRegistroDenuPen1(HelpInline hi) {
        this.helpInlineComentariosRegistroDenuPen1 = hi;
    }

    private StaticText campoComentariosRegistroDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosRegistroDenuPen1Texto1() {
        return campoComentariosRegistroDenuPen1Texto1;
    }

    public void setCampoComentariosRegistroDenuPen1Texto1(StaticText component) {
        this.campoComentariosRegistroDenuPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosRegistroDenuPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosRegistroDenuPen1() {
        return validatorComentariosRegistroDenuPen1;
    }
  
    public void setValidatorComentariosRegistroDenuPen1(LengthValidator validator) {
        this.validatorComentariosRegistroDenuPen1 = validator;
    }
  
    private Label labelComentariosConfDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosConfDenuPen1() {
        return labelComentariosConfDenuPen1;
    }

    public void setLabelComentariosConfDenuPen1(Label l) {
        this.labelComentariosConfDenuPen1 = l;
    }

    private TextField campoComentariosConfDenuPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosConfDenuPen1() {
        return campoComentariosConfDenuPen1;
    }

    public void setCampoComentariosConfDenuPen1(TextField component) {
        this.campoComentariosConfDenuPen1 = component;
    }

    private HelpInline helpInlineComentariosConfDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosConfDenuPen1() {
        return helpInlineComentariosConfDenuPen1;
    }

    public void setHelpInlineComentariosConfDenuPen1(HelpInline hi) {
        this.helpInlineComentariosConfDenuPen1 = hi;
    }

    private StaticText campoComentariosConfDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosConfDenuPen1Texto1() {
        return campoComentariosConfDenuPen1Texto1;
    }

    public void setCampoComentariosConfDenuPen1Texto1(StaticText component) {
        this.campoComentariosConfDenuPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosConfDenuPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosConfDenuPen1() {
        return validatorComentariosConfDenuPen1;
    }
  
    public void setValidatorComentariosConfDenuPen1(LengthValidator validator) {
        this.validatorComentariosConfDenuPen1 = validator;
    }
  
    private Label labelComentariosDesDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDesDenuPen1() {
        return labelComentariosDesDenuPen1;
    }

    public void setLabelComentariosDesDenuPen1(Label l) {
        this.labelComentariosDesDenuPen1 = l;
    }

    private TextField campoComentariosDesDenuPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosDesDenuPen1() {
        return campoComentariosDesDenuPen1;
    }

    public void setCampoComentariosDesDenuPen1(TextField component) {
        this.campoComentariosDesDenuPen1 = component;
    }

    private HelpInline helpInlineComentariosDesDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDesDenuPen1() {
        return helpInlineComentariosDesDenuPen1;
    }

    public void setHelpInlineComentariosDesDenuPen1(HelpInline hi) {
        this.helpInlineComentariosDesDenuPen1 = hi;
    }

    private StaticText campoComentariosDesDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDesDenuPen1Texto1() {
        return campoComentariosDesDenuPen1Texto1;
    }

    public void setCampoComentariosDesDenuPen1Texto1(StaticText component) {
        this.campoComentariosDesDenuPen1Texto1 = component;
    }

    private LengthValidator validatorComentariosDesDenuPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDesDenuPen1() {
        return validatorComentariosDesDenuPen1;
    }
  
    public void setValidatorComentariosDesDenuPen1(LengthValidator validator) {
        this.validatorComentariosDesDenuPen1 = validator;
    }
  
    private Label labelIdUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuario1() {
        return labelIdUsuario1;
    }

    public void setLabelIdUsuario1(Label l) {
        this.labelIdUsuario1 = l;
    }

    private TextField campoIdUsuario1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdUsuario1() {
        return campoIdUsuario1;
    }

    public void setCampoIdUsuario1(TextField component) {
        this.campoIdUsuario1 = component;
    }

    private HelpInline helpInlineIdUsuario1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUsuario1() {
        return helpInlineIdUsuario1;
    }

    public void setHelpInlineIdUsuario1(HelpInline hi) {
        this.helpInlineIdUsuario1 = hi;
    }

    private StaticText campoIdUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuario1Texto1() {
        return campoIdUsuario1Texto1;
    }

    public void setCampoIdUsuario1Texto1(StaticText component) {
        this.campoIdUsuario1Texto1 = component;
    }

    private Button campoIdUsuario1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuario1Boton1() {
        return campoIdUsuario1Boton1;
    }

    public void setCampoIdUsuario1Boton1(Button component) {
        this.campoIdUsuario1Boton1 = component;
    }

    private Button campoIdUsuario1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuario1Boton3() {
        return campoIdUsuario1Boton3;
    }

    public void setCampoIdUsuario1Boton3(Button component) {
        this.campoIdUsuario1Boton3 = component;
    }

    private Label labelIdUsuario2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuario2() {
        return labelIdUsuario2;
    }

    public void setLabelIdUsuario2(Label l) {
        this.labelIdUsuario2 = l;
    }

    private StaticText campoIdUsuario1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUsuario1Texto2() {
        return campoIdUsuario1Texto2;
    }

    public void setCampoIdUsuario1Texto2(StaticText component) {
        this.campoIdUsuario1Texto2 = component;
    }

    private Button campoIdUsuario1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuario1Boton2() {
        return campoIdUsuario1Boton2;
    }

    public void setCampoIdUsuario1Boton2(Button component) {
        this.campoIdUsuario1Boton2 = component;
    }

    private Label labelObservacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacion1() {
        return labelObservacion1;
    }

    public void setLabelObservacion1(Label l) {
        this.labelObservacion1 = l;
    }

    private TextField campoObservacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoObservacion1() {
        return campoObservacion1;
    }

    public void setCampoObservacion1(TextField component) {
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
  
    private Label labelIdDepartamento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1() {
        return labelIdDepartamento1;
    }

    public void setLabelIdDepartamento1(Label l) {
        this.labelIdDepartamento1 = l;
    }

    private TextField campoIdDepartamento1 = new com.egt.core.jsf.component.CampoTexto();

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
  
    private Label labelFechaAprobacionPensionDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionPensionDesde1() {
        return labelFechaAprobacionPensionDesde1;
    }

    public void setLabelFechaAprobacionPensionDesde1(Label l) {
        this.labelFechaAprobacionPensionDesde1 = l;
    }

    private Calendar campoFechaAprobacionPensionDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionPensionDesde1() {
        return campoFechaAprobacionPensionDesde1;
    }

    public void setCampoFechaAprobacionPensionDesde1(Calendar component) {
        this.campoFechaAprobacionPensionDesde1 = component;
    }

    private HelpInline helpInlineFechaAprobacionPensionDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionPensionDesde1() {
        return helpInlineFechaAprobacionPensionDesde1;
    }

    public void setHelpInlineFechaAprobacionPensionDesde1(HelpInline hi) {
        this.helpInlineFechaAprobacionPensionDesde1 = hi;
    }

    private StaticText campoFechaAprobacionPensionDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionPensionDesde1Texto1() {
        return campoFechaAprobacionPensionDesde1Texto1;
    }

    public void setCampoFechaAprobacionPensionDesde1Texto1(StaticText component) {
        this.campoFechaAprobacionPensionDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaAprobacionPensionDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaAprobacionPensionDesde1() {
        return converterFechaAprobacionPensionDesde1;
    }
  
    public void setConverterFechaAprobacionPensionDesde1(SqlTimestampConverter converter) {
        this.converterFechaAprobacionPensionDesde1 = converter;
    }
  
    private Label labelFechaAprobacionPensionHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionPensionHasta1() {
        return labelFechaAprobacionPensionHasta1;
    }

    public void setLabelFechaAprobacionPensionHasta1(Label l) {
        this.labelFechaAprobacionPensionHasta1 = l;
    }

    private Calendar campoFechaAprobacionPensionHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionPensionHasta1() {
        return campoFechaAprobacionPensionHasta1;
    }

    public void setCampoFechaAprobacionPensionHasta1(Calendar component) {
        this.campoFechaAprobacionPensionHasta1 = component;
    }

    private HelpInline helpInlineFechaAprobacionPensionHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionPensionHasta1() {
        return helpInlineFechaAprobacionPensionHasta1;
    }

    public void setHelpInlineFechaAprobacionPensionHasta1(HelpInline hi) {
        this.helpInlineFechaAprobacionPensionHasta1 = hi;
    }

    private StaticText campoFechaAprobacionPensionHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionPensionHasta1Texto1() {
        return campoFechaAprobacionPensionHasta1Texto1;
    }

    public void setCampoFechaAprobacionPensionHasta1Texto1(StaticText component) {
        this.campoFechaAprobacionPensionHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaAprobacionPensionHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaAprobacionPensionHasta1() {
        return converterFechaAprobacionPensionHasta1;
    }
  
    public void setConverterFechaAprobacionPensionHasta1(SqlTimestampConverter converter) {
        this.converterFechaAprobacionPensionHasta1 = converter;
    }
  
    private Label labelFechaDenegacionPensionDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionPensionDesde1() {
        return labelFechaDenegacionPensionDesde1;
    }

    public void setLabelFechaDenegacionPensionDesde1(Label l) {
        this.labelFechaDenegacionPensionDesde1 = l;
    }

    private Calendar campoFechaDenegacionPensionDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionPensionDesde1() {
        return campoFechaDenegacionPensionDesde1;
    }

    public void setCampoFechaDenegacionPensionDesde1(Calendar component) {
        this.campoFechaDenegacionPensionDesde1 = component;
    }

    private HelpInline helpInlineFechaDenegacionPensionDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionPensionDesde1() {
        return helpInlineFechaDenegacionPensionDesde1;
    }

    public void setHelpInlineFechaDenegacionPensionDesde1(HelpInline hi) {
        this.helpInlineFechaDenegacionPensionDesde1 = hi;
    }

    private StaticText campoFechaDenegacionPensionDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionPensionDesde1Texto1() {
        return campoFechaDenegacionPensionDesde1Texto1;
    }

    public void setCampoFechaDenegacionPensionDesde1Texto1(StaticText component) {
        this.campoFechaDenegacionPensionDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaDenegacionPensionDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaDenegacionPensionDesde1() {
        return converterFechaDenegacionPensionDesde1;
    }
  
    public void setConverterFechaDenegacionPensionDesde1(SqlTimestampConverter converter) {
        this.converterFechaDenegacionPensionDesde1 = converter;
    }
  
    private Label labelFechaDenegacionPensionHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionPensionHasta1() {
        return labelFechaDenegacionPensionHasta1;
    }

    public void setLabelFechaDenegacionPensionHasta1(Label l) {
        this.labelFechaDenegacionPensionHasta1 = l;
    }

    private Calendar campoFechaDenegacionPensionHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionPensionHasta1() {
        return campoFechaDenegacionPensionHasta1;
    }

    public void setCampoFechaDenegacionPensionHasta1(Calendar component) {
        this.campoFechaDenegacionPensionHasta1 = component;
    }

    private HelpInline helpInlineFechaDenegacionPensionHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionPensionHasta1() {
        return helpInlineFechaDenegacionPensionHasta1;
    }

    public void setHelpInlineFechaDenegacionPensionHasta1(HelpInline hi) {
        this.helpInlineFechaDenegacionPensionHasta1 = hi;
    }

    private StaticText campoFechaDenegacionPensionHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionPensionHasta1Texto1() {
        return campoFechaDenegacionPensionHasta1Texto1;
    }

    public void setCampoFechaDenegacionPensionHasta1Texto1(StaticText component) {
        this.campoFechaDenegacionPensionHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaDenegacionPensionHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaDenegacionPensionHasta1() {
        return converterFechaDenegacionPensionHasta1;
    }
  
    public void setConverterFechaDenegacionPensionHasta1(SqlTimestampConverter converter) {
        this.converterFechaDenegacionPensionHasta1 = converter;
    }
  
    private Label labelFechaRevocacionPensionDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRevocacionPensionDesde1() {
        return labelFechaRevocacionPensionDesde1;
    }

    public void setLabelFechaRevocacionPensionDesde1(Label l) {
        this.labelFechaRevocacionPensionDesde1 = l;
    }

    private Calendar campoFechaRevocacionPensionDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRevocacionPensionDesde1() {
        return campoFechaRevocacionPensionDesde1;
    }

    public void setCampoFechaRevocacionPensionDesde1(Calendar component) {
        this.campoFechaRevocacionPensionDesde1 = component;
    }

    private HelpInline helpInlineFechaRevocacionPensionDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRevocacionPensionDesde1() {
        return helpInlineFechaRevocacionPensionDesde1;
    }

    public void setHelpInlineFechaRevocacionPensionDesde1(HelpInline hi) {
        this.helpInlineFechaRevocacionPensionDesde1 = hi;
    }

    private StaticText campoFechaRevocacionPensionDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRevocacionPensionDesde1Texto1() {
        return campoFechaRevocacionPensionDesde1Texto1;
    }

    public void setCampoFechaRevocacionPensionDesde1Texto1(StaticText component) {
        this.campoFechaRevocacionPensionDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRevocacionPensionDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRevocacionPensionDesde1() {
        return converterFechaRevocacionPensionDesde1;
    }
  
    public void setConverterFechaRevocacionPensionDesde1(SqlTimestampConverter converter) {
        this.converterFechaRevocacionPensionDesde1 = converter;
    }
  
    private Label labelFechaRevocacionPensionHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRevocacionPensionHasta1() {
        return labelFechaRevocacionPensionHasta1;
    }

    public void setLabelFechaRevocacionPensionHasta1(Label l) {
        this.labelFechaRevocacionPensionHasta1 = l;
    }

    private Calendar campoFechaRevocacionPensionHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRevocacionPensionHasta1() {
        return campoFechaRevocacionPensionHasta1;
    }

    public void setCampoFechaRevocacionPensionHasta1(Calendar component) {
        this.campoFechaRevocacionPensionHasta1 = component;
    }

    private HelpInline helpInlineFechaRevocacionPensionHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRevocacionPensionHasta1() {
        return helpInlineFechaRevocacionPensionHasta1;
    }

    public void setHelpInlineFechaRevocacionPensionHasta1(HelpInline hi) {
        this.helpInlineFechaRevocacionPensionHasta1 = hi;
    }

    private StaticText campoFechaRevocacionPensionHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRevocacionPensionHasta1Texto1() {
        return campoFechaRevocacionPensionHasta1Texto1;
    }

    public void setCampoFechaRevocacionPensionHasta1Texto1(StaticText component) {
        this.campoFechaRevocacionPensionHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRevocacionPensionHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRevocacionPensionHasta1() {
        return converterFechaRevocacionPensionHasta1;
    }
  
    public void setConverterFechaRevocacionPensionHasta1(SqlTimestampConverter converter) {
        this.converterFechaRevocacionPensionHasta1 = converter;
    }
  
    private Label labelFechaOtorgamientoPenDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaOtorgamientoPenDesde1() {
        return labelFechaOtorgamientoPenDesde1;
    }

    public void setLabelFechaOtorgamientoPenDesde1(Label l) {
        this.labelFechaOtorgamientoPenDesde1 = l;
    }

    private Calendar campoFechaOtorgamientoPenDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaOtorgamientoPenDesde1() {
        return campoFechaOtorgamientoPenDesde1;
    }

    public void setCampoFechaOtorgamientoPenDesde1(Calendar component) {
        this.campoFechaOtorgamientoPenDesde1 = component;
    }

    private HelpInline helpInlineFechaOtorgamientoPenDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaOtorgamientoPenDesde1() {
        return helpInlineFechaOtorgamientoPenDesde1;
    }

    public void setHelpInlineFechaOtorgamientoPenDesde1(HelpInline hi) {
        this.helpInlineFechaOtorgamientoPenDesde1 = hi;
    }

    private StaticText campoFechaOtorgamientoPenDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaOtorgamientoPenDesde1Texto1() {
        return campoFechaOtorgamientoPenDesde1Texto1;
    }

    public void setCampoFechaOtorgamientoPenDesde1Texto1(StaticText component) {
        this.campoFechaOtorgamientoPenDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaOtorgamientoPenDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaOtorgamientoPenDesde1() {
        return converterFechaOtorgamientoPenDesde1;
    }
  
    public void setConverterFechaOtorgamientoPenDesde1(SqlTimestampConverter converter) {
        this.converterFechaOtorgamientoPenDesde1 = converter;
    }
  
    private Label labelFechaOtorgamientoPenHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaOtorgamientoPenHasta1() {
        return labelFechaOtorgamientoPenHasta1;
    }

    public void setLabelFechaOtorgamientoPenHasta1(Label l) {
        this.labelFechaOtorgamientoPenHasta1 = l;
    }

    private Calendar campoFechaOtorgamientoPenHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaOtorgamientoPenHasta1() {
        return campoFechaOtorgamientoPenHasta1;
    }

    public void setCampoFechaOtorgamientoPenHasta1(Calendar component) {
        this.campoFechaOtorgamientoPenHasta1 = component;
    }

    private HelpInline helpInlineFechaOtorgamientoPenHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaOtorgamientoPenHasta1() {
        return helpInlineFechaOtorgamientoPenHasta1;
    }

    public void setHelpInlineFechaOtorgamientoPenHasta1(HelpInline hi) {
        this.helpInlineFechaOtorgamientoPenHasta1 = hi;
    }

    private StaticText campoFechaOtorgamientoPenHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaOtorgamientoPenHasta1Texto1() {
        return campoFechaOtorgamientoPenHasta1Texto1;
    }

    public void setCampoFechaOtorgamientoPenHasta1Texto1(StaticText component) {
        this.campoFechaOtorgamientoPenHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaOtorgamientoPenHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaOtorgamientoPenHasta1() {
        return converterFechaOtorgamientoPenHasta1;
    }
  
    public void setConverterFechaOtorgamientoPenHasta1(SqlTimestampConverter converter) {
        this.converterFechaOtorgamientoPenHasta1 = converter;
    }
  
    private Label labelFechaHoraUltActJupeDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltActJupeDesde1() {
        return labelFechaHoraUltActJupeDesde1;
    }

    public void setLabelFechaHoraUltActJupeDesde1(Label l) {
        this.labelFechaHoraUltActJupeDesde1 = l;
    }

    private TextField campoFechaHoraUltActJupeDesde1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltActJupeDesde1() {
        return campoFechaHoraUltActJupeDesde1;
    }

    public void setCampoFechaHoraUltActJupeDesde1(TextField component) {
        this.campoFechaHoraUltActJupeDesde1 = component;
    }

    private HelpInline helpInlineFechaHoraUltActJupeDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraUltActJupeDesde1() {
        return helpInlineFechaHoraUltActJupeDesde1;
    }

    public void setHelpInlineFechaHoraUltActJupeDesde1(HelpInline hi) {
        this.helpInlineFechaHoraUltActJupeDesde1 = hi;
    }

    private StaticText campoFechaHoraUltActJupeDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltActJupeDesde1Texto1() {
        return campoFechaHoraUltActJupeDesde1Texto1;
    }

    public void setCampoFechaHoraUltActJupeDesde1Texto1(StaticText component) {
        this.campoFechaHoraUltActJupeDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltActJupeDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltActJupeDesde1() {
        return converterFechaHoraUltActJupeDesde1;
    }
  
    public void setConverterFechaHoraUltActJupeDesde1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltActJupeDesde1 = converter;
    }
  
    private Label labelFechaHoraUltActJupeHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltActJupeHasta1() {
        return labelFechaHoraUltActJupeHasta1;
    }

    public void setLabelFechaHoraUltActJupeHasta1(Label l) {
        this.labelFechaHoraUltActJupeHasta1 = l;
    }

    private TextField campoFechaHoraUltActJupeHasta1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltActJupeHasta1() {
        return campoFechaHoraUltActJupeHasta1;
    }

    public void setCampoFechaHoraUltActJupeHasta1(TextField component) {
        this.campoFechaHoraUltActJupeHasta1 = component;
    }

    private HelpInline helpInlineFechaHoraUltActJupeHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraUltActJupeHasta1() {
        return helpInlineFechaHoraUltActJupeHasta1;
    }

    public void setHelpInlineFechaHoraUltActJupeHasta1(HelpInline hi) {
        this.helpInlineFechaHoraUltActJupeHasta1 = hi;
    }

    private StaticText campoFechaHoraUltActJupeHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltActJupeHasta1Texto1() {
        return campoFechaHoraUltActJupeHasta1Texto1;
    }

    public void setCampoFechaHoraUltActJupeHasta1Texto1(StaticText component) {
        this.campoFechaHoraUltActJupeHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltActJupeHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltActJupeHasta1() {
        return converterFechaHoraUltActJupeHasta1;
    }
  
    public void setConverterFechaHoraUltActJupeHasta1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltActJupeHasta1 = converter;
    }
  
    private Label labelFechaSolicitudRecoPenDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudRecoPenDesde1() {
        return labelFechaSolicitudRecoPenDesde1;
    }

    public void setLabelFechaSolicitudRecoPenDesde1(Label l) {
        this.labelFechaSolicitudRecoPenDesde1 = l;
    }

    private Calendar campoFechaSolicitudRecoPenDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudRecoPenDesde1() {
        return campoFechaSolicitudRecoPenDesde1;
    }

    public void setCampoFechaSolicitudRecoPenDesde1(Calendar component) {
        this.campoFechaSolicitudRecoPenDesde1 = component;
    }

    private HelpInline helpInlineFechaSolicitudRecoPenDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudRecoPenDesde1() {
        return helpInlineFechaSolicitudRecoPenDesde1;
    }

    public void setHelpInlineFechaSolicitudRecoPenDesde1(HelpInline hi) {
        this.helpInlineFechaSolicitudRecoPenDesde1 = hi;
    }

    private StaticText campoFechaSolicitudRecoPenDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudRecoPenDesde1Texto1() {
        return campoFechaSolicitudRecoPenDesde1Texto1;
    }

    public void setCampoFechaSolicitudRecoPenDesde1Texto1(StaticText component) {
        this.campoFechaSolicitudRecoPenDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaSolicitudRecoPenDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaSolicitudRecoPenDesde1() {
        return converterFechaSolicitudRecoPenDesde1;
    }
  
    public void setConverterFechaSolicitudRecoPenDesde1(SqlTimestampConverter converter) {
        this.converterFechaSolicitudRecoPenDesde1 = converter;
    }
  
    private Label labelFechaSolicitudRecoPenHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudRecoPenHasta1() {
        return labelFechaSolicitudRecoPenHasta1;
    }

    public void setLabelFechaSolicitudRecoPenHasta1(Label l) {
        this.labelFechaSolicitudRecoPenHasta1 = l;
    }

    private Calendar campoFechaSolicitudRecoPenHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudRecoPenHasta1() {
        return campoFechaSolicitudRecoPenHasta1;
    }

    public void setCampoFechaSolicitudRecoPenHasta1(Calendar component) {
        this.campoFechaSolicitudRecoPenHasta1 = component;
    }

    private HelpInline helpInlineFechaSolicitudRecoPenHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudRecoPenHasta1() {
        return helpInlineFechaSolicitudRecoPenHasta1;
    }

    public void setHelpInlineFechaSolicitudRecoPenHasta1(HelpInline hi) {
        this.helpInlineFechaSolicitudRecoPenHasta1 = hi;
    }

    private StaticText campoFechaSolicitudRecoPenHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudRecoPenHasta1Texto1() {
        return campoFechaSolicitudRecoPenHasta1Texto1;
    }

    public void setCampoFechaSolicitudRecoPenHasta1Texto1(StaticText component) {
        this.campoFechaSolicitudRecoPenHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaSolicitudRecoPenHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaSolicitudRecoPenHasta1() {
        return converterFechaSolicitudRecoPenHasta1;
    }
  
    public void setConverterFechaSolicitudRecoPenHasta1(SqlTimestampConverter converter) {
        this.converterFechaSolicitudRecoPenHasta1 = converter;
    }
  
    private Label labelFechaResolucionDenPenDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionDenPenDesde1() {
        return labelFechaResolucionDenPenDesde1;
    }

    public void setLabelFechaResolucionDenPenDesde1(Label l) {
        this.labelFechaResolucionDenPenDesde1 = l;
    }

    private Calendar campoFechaResolucionDenPenDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionDenPenDesde1() {
        return campoFechaResolucionDenPenDesde1;
    }

    public void setCampoFechaResolucionDenPenDesde1(Calendar component) {
        this.campoFechaResolucionDenPenDesde1 = component;
    }

    private HelpInline helpInlineFechaResolucionDenPenDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionDenPenDesde1() {
        return helpInlineFechaResolucionDenPenDesde1;
    }

    public void setHelpInlineFechaResolucionDenPenDesde1(HelpInline hi) {
        this.helpInlineFechaResolucionDenPenDesde1 = hi;
    }

    private StaticText campoFechaResolucionDenPenDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionDenPenDesde1Texto1() {
        return campoFechaResolucionDenPenDesde1Texto1;
    }

    public void setCampoFechaResolucionDenPenDesde1Texto1(StaticText component) {
        this.campoFechaResolucionDenPenDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionDenPenDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionDenPenDesde1() {
        return converterFechaResolucionDenPenDesde1;
    }
  
    public void setConverterFechaResolucionDenPenDesde1(SqlTimestampConverter converter) {
        this.converterFechaResolucionDenPenDesde1 = converter;
    }
  
    private Label labelFechaResolucionDenPenHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionDenPenHasta1() {
        return labelFechaResolucionDenPenHasta1;
    }

    public void setLabelFechaResolucionDenPenHasta1(Label l) {
        this.labelFechaResolucionDenPenHasta1 = l;
    }

    private Calendar campoFechaResolucionDenPenHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionDenPenHasta1() {
        return campoFechaResolucionDenPenHasta1;
    }

    public void setCampoFechaResolucionDenPenHasta1(Calendar component) {
        this.campoFechaResolucionDenPenHasta1 = component;
    }

    private HelpInline helpInlineFechaResolucionDenPenHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionDenPenHasta1() {
        return helpInlineFechaResolucionDenPenHasta1;
    }

    public void setHelpInlineFechaResolucionDenPenHasta1(HelpInline hi) {
        this.helpInlineFechaResolucionDenPenHasta1 = hi;
    }

    private StaticText campoFechaResolucionDenPenHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionDenPenHasta1Texto1() {
        return campoFechaResolucionDenPenHasta1Texto1;
    }

    public void setCampoFechaResolucionDenPenHasta1Texto1(StaticText component) {
        this.campoFechaResolucionDenPenHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionDenPenHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionDenPenHasta1() {
        return converterFechaResolucionDenPenHasta1;
    }
  
    public void setConverterFechaResolucionDenPenHasta1(SqlTimestampConverter converter) {
        this.converterFechaResolucionDenPenHasta1 = converter;
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
    public Persona4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Persona4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = PersonaConstants.FUNCION_REGISTRAR_CER_VIDA_PERSONA;

    static long FUNCION_ACCION_2 = PersonaConstants.FUNCION_ANULAR_CER_VIDA_PERSONA;

    static long FUNCION_ACCION_3 = PersonaConstants.FUNCION_REGISTRAR_CER_DEFUN_PERSONA;

    static long FUNCION_ACCION_4 = PersonaConstants.FUNCION_ANULAR_CER_DEFUN_PERSONA;

    static long FUNCION_ACCION_5 = PersonaConstants.FUNCION_APROBAR_PENSION_PERSONA;

    static long FUNCION_ACCION_6 = PersonaConstants.FUNCION_ANULAR_APROBACION_PEN_PERSONA;

    static long FUNCION_ACCION_7 = PersonaConstants.FUNCION_OBJETAR_PENSION_PERSONA;

    static long FUNCION_ACCION_8 = PersonaConstants.FUNCION_REVOCAR_PENSION_PERSONA;

    static long FUNCION_ACCION_9 = PersonaConstants.FUNCION_OTORGAR_PENSION_PERSONA;

    static long FUNCION_ACCION_10 = PersonaConstants.FUNCION_DENEGAR_PENSION_PERSONA;

    static long FUNCION_ACCION_11 = PersonaConstants.FUNCION_ANULAR_DENEGACION_PEN_PERSONA;

    static long FUNCION_ACCION_12 = PersonaConstants.FUNCION_REGISTRAR_ENTREGA_DOC_PERSONA;

    static long FUNCION_ACCION_13 = PersonaConstants.FUNCION_INCLUIR_PERSONA_EN_JUPE;

    static long FUNCION_ACCION_14 = PersonaConstants.FUNCION_ASIGNAR_MONTO_PENSION_PERSONA;

    static long FUNCION_ACCION_15 = PersonaConstants.FUNCION_ACT_FEC_ULT_COB_PEN_PERSONA;

    static long FUNCION_ACCION_16 = PersonaConstants.FUNCION_ANUL_FEC_ULT_COB_PEN_PERSONA;

    static long FUNCION_ACCION_17 = PersonaConstants.FUNCION_SOLICITAR_RECO_PEN_PERSONA;

    static long FUNCION_ACCION_18 = PersonaConstants.FUNCION_ASIGNAR_RECO_PEN_PERSONA;

    static long FUNCION_ACCION_19 = PersonaConstants.FUNCION_APROBAR_RECO_PEN_PERSONA;

    static long FUNCION_ACCION_20 = PersonaConstants.FUNCION_DENEGAR_RECO_PEN_PERSONA;

    static long FUNCION_ACCION_21 = PersonaConstants.FUNCION_REGISTRAR_DENU_PEN_PERSONA;

    static long FUNCION_ACCION_22 = PersonaConstants.FUNCION_CONFIRMAR_DENU_PEN_PERSONA;

    static long FUNCION_ACCION_23 = PersonaConstants.FUNCION_DESMENTIR_DENU_PEN_PERSONA;

    static long FUNCION_ACCION_24 = PersonaConstants.FUNCION_ANOTAR_PERSONA;

    static long FUNCION_ACCION_25 = PersonaConstants.FUNCION_BORRAR_PERSONA;

    static long FUNCION_ACCION_26 = PersonaConstants.FUNCION_BORRAR_PERSONA_OTRO;

    static long FUNCION_ACCION_27 = PersonaConstants.FUNCION_SOLICITAR_RECO_PEN_PERSONA_SEL;

    static long FUNCION_ACCION_28 = PersonaConstants.FUNCION_ASIGNAR_RECO_PEN_PERSONA_SEL;

    static long FUNCION_ACCION_29 = PersonaConstants.FUNCION_APROBAR_RECO_PEN_PERSONA_SEL;

    static long FUNCION_ACCION_30 = PersonaConstants.FUNCION_DENEGAR_RECO_PEN_PERSONA_SEL;

    static long FUNCION_ACCION_31 = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA;

    static long FUNCION_ACCION_32 = PersonaConstants.FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES;

    static long FUNCION_ACCION_33 = PersonaConstants.FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES;

    static long FUNCION_ACCION_34 = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA;

    static long FUNCION_ACCION_35 = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA;

    static long FUNCION_ACCION_36 = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA;

    static long FUNCION_ACCION_37 = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA;

    static long FUNCION_ACCION_38 = PersonaConstants.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA;

    static long FUNCION_ACCION_39 = PersonaConstants.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_DENEGADA;

    static long FUNCION_ACCION_40 = PersonaConstants.FUNCION_EMITIR_PERSONA_INCLUIDA_EN_JUPE;

    static long FUNCION_ACCION_41 = PersonaConstants.FUNCION_EMITIR_PERSONA_EXCLUIDA_DE_JUPE;

    static long FUNCION_ACCION_42 = PersonaConstants.FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA;

    static long FUNCION_ACCION_43 = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_RECONSIDERACION_SOLICITADA;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, BundleWebui.getString("registrar_cer_vida_persona")),
            new Option(FUNCION_ACCION_2, BundleWebui.getString("anular_cer_vida_persona")),
            new Option(FUNCION_ACCION_3, BundleWebui.getString("registrar_cer_defun_persona")),
            new Option(FUNCION_ACCION_4, BundleWebui.getString("anular_cer_defun_persona")),
            new Option(FUNCION_ACCION_5, BundleWebui.getString("aprobar_pension_persona")),
            new Option(FUNCION_ACCION_6, BundleWebui.getString("anular_aprobacion_pen_persona")),
            new Option(FUNCION_ACCION_7, BundleWebui.getString("objetar_pension_persona")),
            new Option(FUNCION_ACCION_8, BundleWebui.getString("revocar_pension_persona")),
            new Option(FUNCION_ACCION_9, BundleWebui.getString("otorgar_pension_persona")),
            new Option(FUNCION_ACCION_10, BundleWebui.getString("denegar_pension_persona")),
            new Option(FUNCION_ACCION_11, BundleWebui.getString("anular_denegacion_pen_persona")),
            new Option(FUNCION_ACCION_12, BundleWebui.getString("registrar_entrega_doc_persona")),
            new Option(FUNCION_ACCION_13, BundleWebui.getString("incluir_persona_en_jupe")),
            new Option(FUNCION_ACCION_14, BundleWebui.getString("asignar_monto_pension_persona")),
            new Option(FUNCION_ACCION_15, BundleWebui.getString("act_fec_ult_cob_pen_persona")),
            new Option(FUNCION_ACCION_16, BundleWebui.getString("anul_fec_ult_cob_pen_persona")),
            new Option(FUNCION_ACCION_17, BundleWebui.getString("solicitar_reco_pen_persona")),
            new Option(FUNCION_ACCION_18, BundleWebui.getString("asignar_reco_pen_persona")),
            new Option(FUNCION_ACCION_19, BundleWebui.getString("aprobar_reco_pen_persona")),
            new Option(FUNCION_ACCION_20, BundleWebui.getString("denegar_reco_pen_persona")),
            new Option(FUNCION_ACCION_21, BundleWebui.getString("registrar_denu_pen_persona")),
            new Option(FUNCION_ACCION_22, BundleWebui.getString("confirmar_denu_pen_persona")),
            new Option(FUNCION_ACCION_23, BundleWebui.getString("desmentir_denu_pen_persona")),
            new Option(FUNCION_ACCION_24, BundleWebui.getString("anotar_persona")),
            new Option(FUNCION_ACCION_25, BundleWebui.getString("borrar_persona")),
            new Option(FUNCION_ACCION_26, BundleWebui.getString("borrar_persona_otro")),
            new Option(FUNCION_ACCION_27, BundleWebui.getString("solicitar_reco_pen_persona_sel")),
            new Option(FUNCION_ACCION_28, BundleWebui.getString("asignar_reco_pen_persona_sel")),
            new Option(FUNCION_ACCION_29, BundleWebui.getString("aprobar_reco_pen_persona_sel")),
            new Option(FUNCION_ACCION_30, BundleWebui.getString("denegar_reco_pen_persona_sel")),
            new Option(FUNCION_ACCION_31, BundleWebui.getString("emitir_persona_con_pension_solicitada")),
            new Option(FUNCION_ACCION_32, BundleWebui.getString("emitir_persona_acreditada_sin_objeciones")),
            new Option(FUNCION_ACCION_33, BundleWebui.getString("emitir_persona_acreditada_con_objeciones")),
            new Option(FUNCION_ACCION_34, BundleWebui.getString("emitir_persona_con_pension_aprobada")),
            new Option(FUNCION_ACCION_35, BundleWebui.getString("emitir_persona_con_pension_denegada")),
            new Option(FUNCION_ACCION_36, BundleWebui.getString("emitir_persona_con_pension_revocada")),
            new Option(FUNCION_ACCION_37, BundleWebui.getString("emitir_persona_con_pension_otorgada")),
            new Option(FUNCION_ACCION_38, BundleWebui.getString("emitir_documentos_persona_pension_otorgada")),
            new Option(FUNCION_ACCION_39, BundleWebui.getString("emitir_documentos_persona_pension_denegada")),
            new Option(FUNCION_ACCION_40, BundleWebui.getString("emitir_persona_incluida_en_jupe")),
            new Option(FUNCION_ACCION_41, BundleWebui.getString("emitir_persona_excluida_de_jupe")),
            new Option(FUNCION_ACCION_42, BundleWebui.getString("emitir_cuadro_resumen_pension_persona")),
            new Option(FUNCION_ACCION_43, BundleWebui.getString("emitir_persona_con_reconsideracion_solicitada"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdPersonaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_7 || f == FUNCION_ACCION_8 || f == FUNCION_ACCION_9 || f == FUNCION_ACCION_10 || f == FUNCION_ACCION_11 || f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16 || f == FUNCION_ACCION_17 || f == FUNCION_ACCION_18 || f == FUNCION_ACCION_19 || f == FUNCION_ACCION_20 || f == FUNCION_ACCION_21 || f == FUNCION_ACCION_22 || f == FUNCION_ACCION_23 || f == FUNCION_ACCION_24;
    }

    private Bit bitIdPersonaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdPersonaRendered();
        }
    };

    public Bit getBitIdPersonaRendered() {
        return bitIdPersonaRendered;
    }

    public boolean isCertificadoVidaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1 || f == FUNCION_ACCION_12;
    }

    private Bit bitCertificadoVidaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCertificadoVidaRendered();
        }
    };

    public Bit getBitCertificadoVidaRendered() {
        return bitCertificadoVidaRendered;
    }

    public boolean isFechaCertificadoVidaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1 || f == FUNCION_ACCION_12;
    }

    private Bit bitFechaCertificadoVidaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaCertificadoVidaRendered();
        }
    };

    public Bit getBitFechaCertificadoVidaRendered() {
        return bitFechaCertificadoVidaRendered;
    }

    public boolean isDiasVigenciaCertificadoVidaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1;
    }

    private Bit bitDiasVigenciaCertificadoVidaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isDiasVigenciaCertificadoVidaRendered();
        }
    };

    public Bit getBitDiasVigenciaCertificadoVidaRendered() {
        return bitDiasVigenciaCertificadoVidaRendered;
    }

    public boolean isCertificadoDefuncionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_3;
    }

    private Bit bitCertificadoDefuncionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCertificadoDefuncionRendered();
        }
    };

    public Bit getBitCertificadoDefuncionRendered() {
        return bitCertificadoDefuncionRendered;
    }

    public boolean isFechaCertificadoDefuncionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_3;
    }

    private Bit bitFechaCertificadoDefuncionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaCertificadoDefuncionRendered();
        }
    };

    public Bit getBitFechaCertificadoDefuncionRendered() {
        return bitFechaCertificadoDefuncionRendered;
    }

    public boolean isComentariosAprobacionPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5;
    }

    private Bit bitComentariosAprobacionPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosAprobacionPensionRendered();
        }
    };

    public Bit getBitComentariosAprobacionPensionRendered() {
        return bitComentariosAprobacionPensionRendered;
    }

    public boolean isNumeroCausaDenPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_7 || f == FUNCION_ACCION_35;
    }

    private Bit bitNumeroCausaDenPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroCausaDenPensionRendered();
        }
    };

    public Bit getBitNumeroCausaDenPensionRendered() {
        return bitNumeroCausaDenPensionRendered;
    }

    public boolean isOtraCausaDenPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_7;
    }

    private Bit bitOtraCausaDenPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isOtraCausaDenPensionRendered();
        }
    };

    public Bit getBitOtraCausaDenPensionRendered() {
        return bitOtraCausaDenPensionRendered;
    }

    public boolean isComentariosObjecionPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_7;
    }

    private Bit bitComentariosObjecionPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosObjecionPensionRendered();
        }
    };

    public Bit getBitComentariosObjecionPensionRendered() {
        return bitComentariosObjecionPensionRendered;
    }

    public boolean isNumeroCausaRevPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8 || f == FUNCION_ACCION_22 || f == FUNCION_ACCION_36;
    }

    private Bit bitNumeroCausaRevPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroCausaRevPensionRendered();
        }
    };

    public Bit getBitNumeroCausaRevPensionRendered() {
        return bitNumeroCausaRevPensionRendered;
    }

    public boolean isOtraCausaRevPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8 || f == FUNCION_ACCION_22;
    }

    private Bit bitOtraCausaRevPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isOtraCausaRevPensionRendered();
        }
    };

    public Bit getBitOtraCausaRevPensionRendered() {
        return bitOtraCausaRevPensionRendered;
    }

    public boolean isComentariosRevocacionPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8;
    }

    private Bit bitComentariosRevocacionPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosRevocacionPensionRendered();
        }
    };

    public Bit getBitComentariosRevocacionPensionRendered() {
        return bitComentariosRevocacionPensionRendered;
    }

    public boolean isNumeroResolucionOtorPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_9;
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
        return f == FUNCION_ACCION_9;
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

    public boolean isComentariosOtorgamientoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_9;
    }

    private Bit bitComentariosOtorgamientoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosOtorgamientoPenRendered();
        }
    };

    public Bit getBitComentariosOtorgamientoPenRendered() {
        return bitComentariosOtorgamientoPenRendered;
    }

    public boolean isNumeroResolucionDenPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_10 || f == FUNCION_ACCION_43;
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
        return f == FUNCION_ACCION_10;
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

    public boolean isComentariosDenegacionPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_10;
    }

    private Bit bitComentariosDenegacionPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosDenegacionPensionRendered();
        }
    };

    public Bit getBitComentariosDenegacionPensionRendered() {
        return bitComentariosDenegacionPensionRendered;
    }

    public boolean isEsPersonaConCerVidaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39;
    }

    private Bit bitEsPersonaConCerVidaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isEsPersonaConCerVidaRendered();
        }
    };

    public Bit getBitEsPersonaConCerVidaRendered() {
        return bitEsPersonaConCerVidaRendered;
    }

    public boolean isEsPersonaConCopiaCedulaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39;
    }

    private Bit bitEsPersonaConCopiaCedulaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isEsPersonaConCopiaCedulaRendered();
        }
    };

    public Bit getBitEsPersonaConCopiaCedulaRendered() {
        return bitEsPersonaConCopiaCedulaRendered;
    }

    public boolean isEsPersonaConDeclaracionJurRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39;
    }

    private Bit bitEsPersonaConDeclaracionJurRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isEsPersonaConDeclaracionJurRendered();
        }
    };

    public Bit getBitEsPersonaConDeclaracionJurRendered() {
        return bitEsPersonaConDeclaracionJurRendered;
    }

    public boolean isComentariosEntregaDocumentosRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_12;
    }

    private Bit bitComentariosEntregaDocumentosRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosEntregaDocumentosRendered();
        }
    };

    public Bit getBitComentariosEntregaDocumentosRendered() {
        return bitComentariosEntregaDocumentosRendered;
    }

    public boolean isMontoPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_14;
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

    public boolean isFechaUltimoCobroPensionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_15;
    }

    private Bit bitFechaUltimoCobroPensionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaUltimoCobroPensionRendered();
        }
    };

    public Bit getBitFechaUltimoCobroPensionRendered() {
        return bitFechaUltimoCobroPensionRendered;
    }

    public boolean isNotasAnulFecUltCobPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_16;
    }

    private Bit bitNotasAnulFecUltCobPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNotasAnulFecUltCobPenRendered();
        }
    };

    public Bit getBitNotasAnulFecUltCobPenRendered() {
        return bitNotasAnulFecUltCobPenRendered;
    }

    public boolean isComentariosSolicitudRecoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_17;
    }

    private Bit bitComentariosSolicitudRecoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosSolicitudRecoPenRendered();
        }
    };

    public Bit getBitComentariosSolicitudRecoPenRendered() {
        return bitComentariosSolicitudRecoPenRendered;
    }

    public boolean isCodigoSimeRecoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_18 || f == FUNCION_ACCION_28;
    }

    private Bit bitCodigoSimeRecoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCodigoSimeRecoPenRendered();
        }
    };

    public Bit getBitCodigoSimeRecoPenRendered() {
        return bitCodigoSimeRecoPenRendered;
    }

    public boolean isComentariosAprRecoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_19;
    }

    private Bit bitComentariosAprRecoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosAprRecoPenRendered();
        }
    };

    public Bit getBitComentariosAprRecoPenRendered() {
        return bitComentariosAprRecoPenRendered;
    }

    public boolean isNumeroCausaDenRecoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_20;
    }

    private Bit bitNumeroCausaDenRecoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroCausaDenRecoPenRendered();
        }
    };

    public Bit getBitNumeroCausaDenRecoPenRendered() {
        return bitNumeroCausaDenRecoPenRendered;
    }

    public boolean isOtraCausaDenRecoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_20;
    }

    private Bit bitOtraCausaDenRecoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isOtraCausaDenRecoPenRendered();
        }
    };

    public Bit getBitOtraCausaDenRecoPenRendered() {
        return bitOtraCausaDenRecoPenRendered;
    }

    public boolean isComentariosDenRecoPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_20;
    }

    private Bit bitComentariosDenRecoPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosDenRecoPenRendered();
        }
    };

    public Bit getBitComentariosDenRecoPenRendered() {
        return bitComentariosDenRecoPenRendered;
    }

    public boolean isComentariosRegistroDenuPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_21;
    }

    private Bit bitComentariosRegistroDenuPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosRegistroDenuPenRendered();
        }
    };

    public Bit getBitComentariosRegistroDenuPenRendered() {
        return bitComentariosRegistroDenuPenRendered;
    }

    public boolean isComentariosConfDenuPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_22;
    }

    private Bit bitComentariosConfDenuPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosConfDenuPenRendered();
        }
    };

    public Bit getBitComentariosConfDenuPenRendered() {
        return bitComentariosConfDenuPenRendered;
    }

    public boolean isComentariosDesDenuPenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_23;
    }

    private Bit bitComentariosDesDenuPenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosDesDenuPenRendered();
        }
    };

    public Bit getBitComentariosDesDenuPenRendered() {
        return bitComentariosDesDenuPenRendered;
    }

    public boolean isIdUsuarioRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_26;
    }

    private Bit bitIdUsuarioRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdUsuarioRendered();
        }
    };

    public Bit getBitIdUsuarioRendered() {
        return bitIdUsuarioRendered;
    }

    public boolean isObservacionRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_27 || f == FUNCION_ACCION_29 || f == FUNCION_ACCION_30;
    }

    private Bit bitObservacionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isObservacionRendered();
        }
    };

    public Bit getBitObservacionRendered() {
        return bitObservacionRendered;
    }

    public boolean isIdDepartamentoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_31 || f == FUNCION_ACCION_32 || f == FUNCION_ACCION_33 || f == FUNCION_ACCION_34 || f == FUNCION_ACCION_35 || f == FUNCION_ACCION_36 || f == FUNCION_ACCION_37 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39 || f == FUNCION_ACCION_40 || f == FUNCION_ACCION_41 || f == FUNCION_ACCION_42 || f == FUNCION_ACCION_43;
    }

    private Bit bitIdDepartamentoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdDepartamentoRendered();
        }
    };

    public Bit getBitIdDepartamentoRendered() {
        return bitIdDepartamentoRendered;
    }

    public boolean isIdDistritoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_31 || f == FUNCION_ACCION_32 || f == FUNCION_ACCION_33 || f == FUNCION_ACCION_34 || f == FUNCION_ACCION_35 || f == FUNCION_ACCION_36 || f == FUNCION_ACCION_37 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39 || f == FUNCION_ACCION_40 || f == FUNCION_ACCION_41 || f == FUNCION_ACCION_42 || f == FUNCION_ACCION_43;
    }

    private Bit bitIdDistritoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdDistritoRendered();
        }
    };

    public Bit getBitIdDistritoRendered() {
        return bitIdDistritoRendered;
    }

    public boolean isIdBarrioRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_31 || f == FUNCION_ACCION_32 || f == FUNCION_ACCION_33 || f == FUNCION_ACCION_34 || f == FUNCION_ACCION_35 || f == FUNCION_ACCION_36 || f == FUNCION_ACCION_37 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39 || f == FUNCION_ACCION_40 || f == FUNCION_ACCION_41 || f == FUNCION_ACCION_42 || f == FUNCION_ACCION_43;
    }

    private Bit bitIdBarrioRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdBarrioRendered();
        }
    };

    public Bit getBitIdBarrioRendered() {
        return bitIdBarrioRendered;
    }

    public boolean isFechaSolicitudPensionDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_31 || f == FUNCION_ACCION_32 || f == FUNCION_ACCION_33;
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
        return f == FUNCION_ACCION_31 || f == FUNCION_ACCION_32 || f == FUNCION_ACCION_33;
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

    public boolean isCodigoSimeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_31 || f == FUNCION_ACCION_32 || f == FUNCION_ACCION_33 || f == FUNCION_ACCION_34 || f == FUNCION_ACCION_35 || f == FUNCION_ACCION_36 || f == FUNCION_ACCION_37 || f == FUNCION_ACCION_38 || f == FUNCION_ACCION_39 || f == FUNCION_ACCION_40 || f == FUNCION_ACCION_41 || f == FUNCION_ACCION_43;
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

    public boolean isFechaAprobacionPensionDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_34;
    }

    private Bit bitFechaAprobacionPensionDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaAprobacionPensionDesdeRendered();
        }
    };

    public Bit getBitFechaAprobacionPensionDesdeRendered() {
        return bitFechaAprobacionPensionDesdeRendered;
    }

    public boolean isFechaAprobacionPensionHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_34;
    }

    private Bit bitFechaAprobacionPensionHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaAprobacionPensionHastaRendered();
        }
    };

    public Bit getBitFechaAprobacionPensionHastaRendered() {
        return bitFechaAprobacionPensionHastaRendered;
    }

    public boolean isFechaDenegacionPensionDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_35 || f == FUNCION_ACCION_39;
    }

    private Bit bitFechaDenegacionPensionDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaDenegacionPensionDesdeRendered();
        }
    };

    public Bit getBitFechaDenegacionPensionDesdeRendered() {
        return bitFechaDenegacionPensionDesdeRendered;
    }

    public boolean isFechaDenegacionPensionHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_35 || f == FUNCION_ACCION_39;
    }

    private Bit bitFechaDenegacionPensionHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaDenegacionPensionHastaRendered();
        }
    };

    public Bit getBitFechaDenegacionPensionHastaRendered() {
        return bitFechaDenegacionPensionHastaRendered;
    }

    public boolean isFechaRevocacionPensionDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_36;
    }

    private Bit bitFechaRevocacionPensionDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaRevocacionPensionDesdeRendered();
        }
    };

    public Bit getBitFechaRevocacionPensionDesdeRendered() {
        return bitFechaRevocacionPensionDesdeRendered;
    }

    public boolean isFechaRevocacionPensionHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_36;
    }

    private Bit bitFechaRevocacionPensionHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaRevocacionPensionHastaRendered();
        }
    };

    public Bit getBitFechaRevocacionPensionHastaRendered() {
        return bitFechaRevocacionPensionHastaRendered;
    }

    public boolean isFechaOtorgamientoPenDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_37 || f == FUNCION_ACCION_38;
    }

    private Bit bitFechaOtorgamientoPenDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaOtorgamientoPenDesdeRendered();
        }
    };

    public Bit getBitFechaOtorgamientoPenDesdeRendered() {
        return bitFechaOtorgamientoPenDesdeRendered;
    }

    public boolean isFechaOtorgamientoPenHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_37 || f == FUNCION_ACCION_38;
    }

    private Bit bitFechaOtorgamientoPenHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaOtorgamientoPenHastaRendered();
        }
    };

    public Bit getBitFechaOtorgamientoPenHastaRendered() {
        return bitFechaOtorgamientoPenHastaRendered;
    }

    public boolean isFechaHoraUltActJupeDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_40;
    }

    private Bit bitFechaHoraUltActJupeDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaHoraUltActJupeDesdeRendered();
        }
    };

    public Bit getBitFechaHoraUltActJupeDesdeRendered() {
        return bitFechaHoraUltActJupeDesdeRendered;
    }

    public boolean isFechaHoraUltActJupeHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_40;
    }

    private Bit bitFechaHoraUltActJupeHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaHoraUltActJupeHastaRendered();
        }
    };

    public Bit getBitFechaHoraUltActJupeHastaRendered() {
        return bitFechaHoraUltActJupeHastaRendered;
    }

    public boolean isFechaSolicitudRecoPenDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_43;
    }

    private Bit bitFechaSolicitudRecoPenDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaSolicitudRecoPenDesdeRendered();
        }
    };

    public Bit getBitFechaSolicitudRecoPenDesdeRendered() {
        return bitFechaSolicitudRecoPenDesdeRendered;
    }

    public boolean isFechaSolicitudRecoPenHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_43;
    }

    private Bit bitFechaSolicitudRecoPenHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaSolicitudRecoPenHastaRendered();
        }
    };

    public Bit getBitFechaSolicitudRecoPenHastaRendered() {
        return bitFechaSolicitudRecoPenHastaRendered;
    }

    public boolean isFechaResolucionDenPenDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_43;
    }

    private Bit bitFechaResolucionDenPenDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaResolucionDenPenDesdeRendered();
        }
    };

    public Bit getBitFechaResolucionDenPenDesdeRendered() {
        return bitFechaResolucionDenPenDesdeRendered;
    }

    public boolean isFechaResolucionDenPenHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_43;
    }

    private Bit bitFechaResolucionDenPenHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaResolucionDenPenHastaRendered();
        }
    };

    public Bit getBitFechaResolucionDenPenHastaRendered() {
        return bitFechaResolucionDenPenHastaRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;

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
        this.initPersonaIdPersona();
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
    private String textoCampoCertificadoVida1;

    public String getTextoCampoCertificadoVida1() {
        return this.textoCampoCertificadoVida1;
    }

    public void setTextoCampoCertificadoVida1(String valor) {
        this.textoCampoCertificadoVida1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaCertificadoVida1;

    public java.sql.Timestamp getValorCampoFechaCertificadoVida1() {
        return this.valorCampoFechaCertificadoVida1;
    }

    public void setValorCampoFechaCertificadoVida1(java.sql.Timestamp valor) {
        this.valorCampoFechaCertificadoVida1 = valor;
    }

    private String textoCampoDiasVigenciaCertificadoVida1;

    public String getTextoCampoDiasVigenciaCertificadoVida1() {
        return this.textoCampoDiasVigenciaCertificadoVida1;
    }

    public void setTextoCampoDiasVigenciaCertificadoVida1(String valor) {
        this.textoCampoDiasVigenciaCertificadoVida1 = valor;
    }

    private String textoCampoCertificadoDefuncion1;

    public String getTextoCampoCertificadoDefuncion1() {
        return this.textoCampoCertificadoDefuncion1;
    }

    public void setTextoCampoCertificadoDefuncion1(String valor) {
        this.textoCampoCertificadoDefuncion1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaCertificadoDefuncion1;

    public java.sql.Timestamp getValorCampoFechaCertificadoDefuncion1() {
        return this.valorCampoFechaCertificadoDefuncion1;
    }

    public void setValorCampoFechaCertificadoDefuncion1(java.sql.Timestamp valor) {
        this.valorCampoFechaCertificadoDefuncion1 = valor;
    }

    private String textoCampoComentariosAprobacionPension1;

    public String getTextoCampoComentariosAprobacionPension1() {
        return this.textoCampoComentariosAprobacionPension1;
    }

    public void setTextoCampoComentariosAprobacionPension1(String valor) {
        this.textoCampoComentariosAprobacionPension1 = valor;
    }

    private String textoCampoOtraCausaDenPension1;

    public String getTextoCampoOtraCausaDenPension1() {
        return this.textoCampoOtraCausaDenPension1;
    }

    public void setTextoCampoOtraCausaDenPension1(String valor) {
        this.textoCampoOtraCausaDenPension1 = valor;
    }

    private String textoCampoComentariosObjecionPension1;

    public String getTextoCampoComentariosObjecionPension1() {
        return this.textoCampoComentariosObjecionPension1;
    }

    public void setTextoCampoComentariosObjecionPension1(String valor) {
        this.textoCampoComentariosObjecionPension1 = valor;
    }

    private String textoCampoOtraCausaRevPension1;

    public String getTextoCampoOtraCausaRevPension1() {
        return this.textoCampoOtraCausaRevPension1;
    }

    public void setTextoCampoOtraCausaRevPension1(String valor) {
        this.textoCampoOtraCausaRevPension1 = valor;
    }

    private String textoCampoComentariosRevocacionPension1;

    public String getTextoCampoComentariosRevocacionPension1() {
        return this.textoCampoComentariosRevocacionPension1;
    }

    public void setTextoCampoComentariosRevocacionPension1(String valor) {
        this.textoCampoComentariosRevocacionPension1 = valor;
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

    private String textoCampoComentariosOtorgamientoPen1;

    public String getTextoCampoComentariosOtorgamientoPen1() {
        return this.textoCampoComentariosOtorgamientoPen1;
    }

    public void setTextoCampoComentariosOtorgamientoPen1(String valor) {
        this.textoCampoComentariosOtorgamientoPen1 = valor;
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

    private String textoCampoComentariosDenegacionPension1;

    public String getTextoCampoComentariosDenegacionPension1() {
        return this.textoCampoComentariosDenegacionPension1;
    }

    public void setTextoCampoComentariosDenegacionPension1(String valor) {
        this.textoCampoComentariosDenegacionPension1 = valor;
    }

    private String textoCampoComentariosEntregaDocumentos1;

    public String getTextoCampoComentariosEntregaDocumentos1() {
        return this.textoCampoComentariosEntregaDocumentos1;
    }

    public void setTextoCampoComentariosEntregaDocumentos1(String valor) {
        this.textoCampoComentariosEntregaDocumentos1 = valor;
    }

    private String textoCampoMontoPension1;

    public String getTextoCampoMontoPension1() {
        return this.textoCampoMontoPension1;
    }

    public void setTextoCampoMontoPension1(String valor) {
        this.textoCampoMontoPension1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaUltimoCobroPension1;

    public java.sql.Timestamp getValorCampoFechaUltimoCobroPension1() {
        return this.valorCampoFechaUltimoCobroPension1;
    }

    public void setValorCampoFechaUltimoCobroPension1(java.sql.Timestamp valor) {
        this.valorCampoFechaUltimoCobroPension1 = valor;
    }

    private String textoCampoNotasAnulFecUltCobPen1;

    public String getTextoCampoNotasAnulFecUltCobPen1() {
        return this.textoCampoNotasAnulFecUltCobPen1;
    }

    public void setTextoCampoNotasAnulFecUltCobPen1(String valor) {
        this.textoCampoNotasAnulFecUltCobPen1 = valor;
    }

    private String textoCampoComentariosSolicitudRecoPen1;

    public String getTextoCampoComentariosSolicitudRecoPen1() {
        return this.textoCampoComentariosSolicitudRecoPen1;
    }

    public void setTextoCampoComentariosSolicitudRecoPen1(String valor) {
        this.textoCampoComentariosSolicitudRecoPen1 = valor;
    }

    private String textoCampoCodigoSimeRecoPen1;

    public String getTextoCampoCodigoSimeRecoPen1() {
        return this.textoCampoCodigoSimeRecoPen1;
    }

    public void setTextoCampoCodigoSimeRecoPen1(String valor) {
        this.textoCampoCodigoSimeRecoPen1 = valor;
    }

    private String textoCampoComentariosAprRecoPen1;

    public String getTextoCampoComentariosAprRecoPen1() {
        return this.textoCampoComentariosAprRecoPen1;
    }

    public void setTextoCampoComentariosAprRecoPen1(String valor) {
        this.textoCampoComentariosAprRecoPen1 = valor;
    }

    private String textoCampoOtraCausaDenRecoPen1;

    public String getTextoCampoOtraCausaDenRecoPen1() {
        return this.textoCampoOtraCausaDenRecoPen1;
    }

    public void setTextoCampoOtraCausaDenRecoPen1(String valor) {
        this.textoCampoOtraCausaDenRecoPen1 = valor;
    }

    private String textoCampoComentariosDenRecoPen1;

    public String getTextoCampoComentariosDenRecoPen1() {
        return this.textoCampoComentariosDenRecoPen1;
    }

    public void setTextoCampoComentariosDenRecoPen1(String valor) {
        this.textoCampoComentariosDenRecoPen1 = valor;
    }

    private String textoCampoComentariosRegistroDenuPen1;

    public String getTextoCampoComentariosRegistroDenuPen1() {
        return this.textoCampoComentariosRegistroDenuPen1;
    }

    public void setTextoCampoComentariosRegistroDenuPen1(String valor) {
        this.textoCampoComentariosRegistroDenuPen1 = valor;
    }

    private String textoCampoComentariosConfDenuPen1;

    public String getTextoCampoComentariosConfDenuPen1() {
        return this.textoCampoComentariosConfDenuPen1;
    }

    public void setTextoCampoComentariosConfDenuPen1(String valor) {
        this.textoCampoComentariosConfDenuPen1 = valor;
    }

    private String textoCampoComentariosDesDenuPen1;

    public String getTextoCampoComentariosDesDenuPen1() {
        return this.textoCampoComentariosDesDenuPen1;
    }

    public void setTextoCampoComentariosDesDenuPen1(String valor) {
        this.textoCampoComentariosDesDenuPen1 = valor;
    }

    private String textoCampoObservacion1;

    public String getTextoCampoObservacion1() {
        return this.textoCampoObservacion1;
    }

    public void setTextoCampoObservacion1(String valor) {
        this.textoCampoObservacion1 = valor;
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

    private String textoCampoCodigoSime1;

    public String getTextoCampoCodigoSime1() {
        return this.textoCampoCodigoSime1;
    }

    public void setTextoCampoCodigoSime1(String valor) {
        this.textoCampoCodigoSime1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaAprobacionPensionDesde1;

    public java.sql.Timestamp getValorCampoFechaAprobacionPensionDesde1() {
        return this.valorCampoFechaAprobacionPensionDesde1;
    }

    public void setValorCampoFechaAprobacionPensionDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaAprobacionPensionDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaAprobacionPensionHasta1;

    public java.sql.Timestamp getValorCampoFechaAprobacionPensionHasta1() {
        return this.valorCampoFechaAprobacionPensionHasta1;
    }

    public void setValorCampoFechaAprobacionPensionHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaAprobacionPensionHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaDenegacionPensionDesde1;

    public java.sql.Timestamp getValorCampoFechaDenegacionPensionDesde1() {
        return this.valorCampoFechaDenegacionPensionDesde1;
    }

    public void setValorCampoFechaDenegacionPensionDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaDenegacionPensionDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaDenegacionPensionHasta1;

    public java.sql.Timestamp getValorCampoFechaDenegacionPensionHasta1() {
        return this.valorCampoFechaDenegacionPensionHasta1;
    }

    public void setValorCampoFechaDenegacionPensionHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaDenegacionPensionHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaRevocacionPensionDesde1;

    public java.sql.Timestamp getValorCampoFechaRevocacionPensionDesde1() {
        return this.valorCampoFechaRevocacionPensionDesde1;
    }

    public void setValorCampoFechaRevocacionPensionDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaRevocacionPensionDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaRevocacionPensionHasta1;

    public java.sql.Timestamp getValorCampoFechaRevocacionPensionHasta1() {
        return this.valorCampoFechaRevocacionPensionHasta1;
    }

    public void setValorCampoFechaRevocacionPensionHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaRevocacionPensionHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaOtorgamientoPenDesde1;

    public java.sql.Timestamp getValorCampoFechaOtorgamientoPenDesde1() {
        return this.valorCampoFechaOtorgamientoPenDesde1;
    }

    public void setValorCampoFechaOtorgamientoPenDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaOtorgamientoPenDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaOtorgamientoPenHasta1;

    public java.sql.Timestamp getValorCampoFechaOtorgamientoPenHasta1() {
        return this.valorCampoFechaOtorgamientoPenHasta1;
    }

    public void setValorCampoFechaOtorgamientoPenHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaOtorgamientoPenHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaHoraUltActJupeDesde1;

    public java.sql.Timestamp getValorCampoFechaHoraUltActJupeDesde1() {
        return this.valorCampoFechaHoraUltActJupeDesde1;
    }

    public void setValorCampoFechaHoraUltActJupeDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaHoraUltActJupeDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaHoraUltActJupeHasta1;

    public java.sql.Timestamp getValorCampoFechaHoraUltActJupeHasta1() {
        return this.valorCampoFechaHoraUltActJupeHasta1;
    }

    public void setValorCampoFechaHoraUltActJupeHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaHoraUltActJupeHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaSolicitudRecoPenDesde1;

    public java.sql.Timestamp getValorCampoFechaSolicitudRecoPenDesde1() {
        return this.valorCampoFechaSolicitudRecoPenDesde1;
    }

    public void setValorCampoFechaSolicitudRecoPenDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaSolicitudRecoPenDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaSolicitudRecoPenHasta1;

    public java.sql.Timestamp getValorCampoFechaSolicitudRecoPenHasta1() {
        return this.valorCampoFechaSolicitudRecoPenHasta1;
    }

    public void setValorCampoFechaSolicitudRecoPenHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaSolicitudRecoPenHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaResolucionDenPenDesde1;

    public java.sql.Timestamp getValorCampoFechaResolucionDenPenDesde1() {
        return this.valorCampoFechaResolucionDenPenDesde1;
    }

    public void setValorCampoFechaResolucionDenPenDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaResolucionDenPenDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaResolucionDenPenHasta1;

    public java.sql.Timestamp getValorCampoFechaResolucionDenPenHasta1() {
        return this.valorCampoFechaResolucionDenPenHasta1;
    }

    public void setValorCampoFechaResolucionDenPenHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaResolucionDenPenHasta1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPersona">
    private Persona personaIdPersona;

    private FiltroBusqueda getFiltroBusquedaIdPersona() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public Persona getPersonaIdPersona() {
        return this.personaIdPersona;
    }

    private void initPersonaIdPersona() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.personaIdPersona = id == null ? null : this.personaFacade.find(id, true);
    }

    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.personaIdPersona = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = PersonaConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdPersona();
                String query = "select * from persona ";
                List<Persona> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.personaIdPersona = this.personaFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(PersonaConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.personaFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.personaIdPersona = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.personaIdPersona = this.personaFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(PersonaConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.personaFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.personaIdPersona = lista.get(0);
                        }
                    }
                }
                if (this.personaIdPersona == null) {
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

    private String textoCampoIdPersona1;

    public String getTextoCampoIdPersona1() {
        return this.textoCampoIdPersona1 != null ? this.textoCampoIdPersona1
                : this.personaIdPersona != null ? this.personaIdPersona.getCodigoPersona()
                : null;
    }

    public void setTextoCampoIdPersona1(String valor) {
        this.textoCampoIdPersona1 = valor;
    }

    public String getToolTipCampoIdPersona1() {
        return this.personaIdPersona == null ? null : STP.trimToStringRecursoSinNombre(this.personaIdPersona.getNombrePersona());
    }

    public String getScriptCampoIdPersona1Boton1() {
        long funcion = PersonaConstants.FUNCION_CONSULTAR_PERSONA;
        String campo = this.getCampoIdPersona1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_PERSONA;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdPersona());
    }

    public String getScriptCampoIdPersona1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_PERSONA;
        Long id = this.personaIdPersona == null ? null : this.personaIdPersona.getIdPersona();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdPersona1Boton2Rendered() {
        return this.isIdPersonaRendered();
    }

    private Bit bitCampoIdPersona1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdPersona1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdPersona1Boton2Rendered() {
        return bitCampoIdPersona1Boton2Rendered;
    }

    private boolean isCampoIdPersona1Boton3Rendered() {
        return !this.isCampoIdPersona1Boton2Rendered();
    }

    private Bit bitCampoIdPersona1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdPersona1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdPersona1Boton3Rendered() {
        return bitCampoIdPersona1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuario">
    private Usuario usuarioIdUsuario;

    private FiltroBusqueda getFiltroBusquedaIdUsuario() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        return filtro;
    }

    public Usuario getUsuarioIdUsuario() {
        return this.usuarioIdUsuario;
    }

    public void campoIdUsuario1_validate(FacesContext context, UIComponent component, Object value) {
        this.usuarioIdUsuario = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UsuarioConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdUsuario();
                String query = "select * from usuario ";
                List<Usuario> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.usuarioIdUsuario = this.usuarioFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(UsuarioConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.usuarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.usuarioIdUsuario = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.usuarioIdUsuario = this.usuarioFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(UsuarioConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.usuarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.usuarioIdUsuario = lista.get(0);
                        }
                    }
                }
                if (this.usuarioIdUsuario == null) {
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

    private String textoCampoIdUsuario1;

    public String getTextoCampoIdUsuario1() {
        return this.textoCampoIdUsuario1 != null ? this.textoCampoIdUsuario1
                : this.usuarioIdUsuario != null ? this.usuarioIdUsuario.getCodigoUsuario()
                : null;
    }

    public void setTextoCampoIdUsuario1(String valor) {
        this.textoCampoIdUsuario1 = valor;
    }

    public String getToolTipCampoIdUsuario1() {
        return this.usuarioIdUsuario == null ? null : STP.trimToStringRecursoSinNombre(this.usuarioIdUsuario.getNombreUsuario());
    }

    public String getScriptCampoIdUsuario1Boton1() {
        long funcion = UsuarioConstants.FUNCION_CONSULTAR_USUARIO;
        String campo = this.getCampoIdUsuario1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.TABLA_USUARIO;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdUsuario());
    }

    public String getScriptCampoIdUsuario1Boton2() {
        String urx = URX2.DETALLE_USUARIO;
        Long id = this.usuarioIdUsuario == null ? null : this.usuarioIdUsuario.getIdUsuario();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdUsuario1Boton2Rendered() {
        return this.isIdUsuarioRendered();
    }

    private Bit bitCampoIdUsuario1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdUsuario1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdUsuario1Boton2Rendered() {
        return bitCampoIdUsuario1Boton2Rendered;
    }

    private boolean isCampoIdUsuario1Boton3Rendered() {
        return !this.isCampoIdUsuario1Boton2Rendered();
    }

    private Bit bitCampoIdUsuario1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdUsuario1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdUsuario1Boton3Rendered() {
        return bitCampoIdUsuario1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDepartamento">
    private Ubicacion ubicacionIdDepartamento;

    private FiltroBusqueda getFiltroBusquedaIdDepartamento() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionConstants.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_NULO;
        valor = null;
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public Ubicacion getUbicacionIdDepartamento() {
        return this.ubicacionIdDepartamento;
    }

    public void campoIdDepartamento1_validate(FacesContext context, UIComponent component, Object value) {
        this.ubicacionIdDepartamento = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdDepartamento();
                String query = "select * from ubicacion ";
                List<Ubicacion> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdDepartamento = this.ubicacionFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdDepartamento = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdDepartamento = this.ubicacionFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdDepartamento = lista.get(0);
                        }
                    }
                }
                if (this.ubicacionIdDepartamento == null) {
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

    private String textoCampoIdDepartamento1;

    public String getTextoCampoIdDepartamento1() {
        return this.textoCampoIdDepartamento1 != null ? this.textoCampoIdDepartamento1
                : this.ubicacionIdDepartamento != null ? this.ubicacionIdDepartamento.getCodigoUbicacion()
                : null;
    }

    public void setTextoCampoIdDepartamento1(String valor) {
        this.textoCampoIdDepartamento1 = valor;
    }

    public String getToolTipCampoIdDepartamento1() {
        return this.ubicacionIdDepartamento == null ? null : STP.trimToStringRecursoSinNombre(this.ubicacionIdDepartamento.getNombreUbicacion());
    }

    public String getScriptCampoIdDepartamento1Boton1() {
        long funcion = UbicacionConstants.FUNCION_CONSULTAR_UBICACION;
        String campo = this.getCampoIdDepartamento1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdDepartamento());
    }

    public String getScriptCampoIdDepartamento1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = this.ubicacionIdDepartamento == null ? null : this.ubicacionIdDepartamento.getIdUbicacion();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdDepartamento1Boton2Rendered() {
        return this.isIdDepartamentoRendered();
    }

    private Bit bitCampoIdDepartamento1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdDepartamento1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdDepartamento1Boton2Rendered() {
        return bitCampoIdDepartamento1Boton2Rendered;
    }

    private boolean isCampoIdDepartamento1Boton3Rendered() {
        return !this.isCampoIdDepartamento1Boton2Rendered();
    }

    private Bit bitCampoIdDepartamento1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdDepartamento1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdDepartamento1Boton3Rendered() {
        return bitCampoIdDepartamento1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idDistrito">
    private Ubicacion ubicacionIdDistrito;

    private FiltroBusqueda getFiltroBusquedaIdDistrito() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionConstants.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = ubicacionIdDepartamento == null ? null : ubicacionIdDepartamento.getIdUbicacion();
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public Ubicacion getUbicacionIdDistrito() {
        return this.ubicacionIdDistrito;
    }

    public void campoIdDistrito1_validate(FacesContext context, UIComponent component, Object value) {
        this.ubicacionIdDistrito = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdDistrito();
                String query = "select * from ubicacion ";
                List<Ubicacion> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdDistrito = this.ubicacionFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdDistrito = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdDistrito = this.ubicacionFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdDistrito = lista.get(0);
                        }
                    }
                }
                if (this.ubicacionIdDistrito == null) {
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

    private String textoCampoIdDistrito1;

    public String getTextoCampoIdDistrito1() {
        return this.textoCampoIdDistrito1 != null ? this.textoCampoIdDistrito1
                : this.ubicacionIdDistrito != null ? this.ubicacionIdDistrito.getCodigoUbicacion()
                : null;
    }

    public void setTextoCampoIdDistrito1(String valor) {
        this.textoCampoIdDistrito1 = valor;
    }

    public String getToolTipCampoIdDistrito1() {
        return this.ubicacionIdDistrito == null ? null : STP.trimToStringRecursoSinNombre(this.ubicacionIdDistrito.getNombreUbicacion());
    }

    public String getScriptCampoIdDistrito1Boton1() {
        long funcion = UbicacionConstants.FUNCION_CONSULTAR_UBICACION;
        String campo = this.getCampoIdDistrito1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdDistrito());
    }

    public String getScriptCampoIdDistrito1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = this.ubicacionIdDistrito == null ? null : this.ubicacionIdDistrito.getIdUbicacion();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdDistrito1Boton2Rendered() {
        return this.isIdDistritoRendered();
    }

    private Bit bitCampoIdDistrito1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdDistrito1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdDistrito1Boton2Rendered() {
        return bitCampoIdDistrito1Boton2Rendered;
    }

    private boolean isCampoIdDistrito1Boton3Rendered() {
        return !this.isCampoIdDistrito1Boton2Rendered();
    }

    private Bit bitCampoIdDistrito1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdDistrito1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdDistrito1Boton3Rendered() {
        return bitCampoIdDistrito1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idBarrio">
    private Ubicacion ubicacionIdBarrio;

    private FiltroBusqueda getFiltroBusquedaIdBarrio() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        ArrayList array = new ArrayList();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UbicacionConstants.COLUMNA_ID_UBICACION_SUPERIOR;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = ubicacionIdDistrito == null ? null : ubicacionIdDistrito.getIdUbicacion();
        filtro.addCriterio(columna, comparacion, valor);
        return filtro;
    }

    public Ubicacion getUbicacionIdBarrio() {
        return this.ubicacionIdBarrio;
    }

    public void campoIdBarrio1_validate(FacesContext context, UIComponent component, Object value) {
        this.ubicacionIdBarrio = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdBarrio();
                String query = "select * from ubicacion ";
                List<Ubicacion> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdBarrio = this.ubicacionFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdBarrio = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.ubicacionIdBarrio = this.ubicacionFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(UbicacionConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.ubicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.ubicacionIdBarrio = lista.get(0);
                        }
                    }
                }
                if (this.ubicacionIdBarrio == null) {
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

    private String textoCampoIdBarrio1;

    public String getTextoCampoIdBarrio1() {
        return this.textoCampoIdBarrio1 != null ? this.textoCampoIdBarrio1
                : this.ubicacionIdBarrio != null ? this.ubicacionIdBarrio.getCodigoUbicacion()
                : null;
    }

    public void setTextoCampoIdBarrio1(String valor) {
        this.textoCampoIdBarrio1 = valor;
    }

    public String getToolTipCampoIdBarrio1() {
        return this.ubicacionIdBarrio == null ? null : STP.trimToStringRecursoSinNombre(this.ubicacionIdBarrio.getNombreUbicacion());
    }

    public String getScriptCampoIdBarrio1Boton1() {
        long funcion = UbicacionConstants.FUNCION_CONSULTAR_UBICACION;
        String campo = this.getCampoIdBarrio1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_UBICACION;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdBarrio());
    }

    public String getScriptCampoIdBarrio1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_UBICACION;
        Long id = this.ubicacionIdBarrio == null ? null : this.ubicacionIdBarrio.getIdUbicacion();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdBarrio1Boton2Rendered() {
        return this.isIdBarrioRendered();
    }

    private Bit bitCampoIdBarrio1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdBarrio1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdBarrio1Boton2Rendered() {
        return bitCampoIdBarrio1Boton2Rendered;
    }

    private boolean isCampoIdBarrio1Boton3Rendered() {
        return !this.isCampoIdBarrio1Boton2Rendered();
    }

    private Bit bitCampoIdBarrio1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdBarrio1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdBarrio1Boton3Rendered() {
        return bitCampoIdBarrio1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaNumeroCausaDenPension1() {
        return JSF.getListaOpciones(EnumCausaDenPension.values(), true, false);
    }

    private Integer valorListaNumeroCausaDenPension1;

    public Integer getValorListaNumeroCausaDenPension1() {
        return this.valorListaNumeroCausaDenPension1;
    }

    public void setValorListaNumeroCausaDenPension1(Integer valor) {
        this.valorListaNumeroCausaDenPension1 = valor;
    }

    public Object getOpcionesListaNumeroCausaRevPension1() {
        return JSF.getListaOpciones(EnumCausaRevPension.values(), true, false);
    }

    private Integer valorListaNumeroCausaRevPension1;

    public Integer getValorListaNumeroCausaRevPension1() {
        return this.valorListaNumeroCausaRevPension1;
    }

    public void setValorListaNumeroCausaRevPension1(Integer valor) {
        this.valorListaNumeroCausaRevPension1 = valor;
    }

    public Object getOpcionesListaEsPersonaConCerVida1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    private Integer valorListaEsPersonaConCerVida1;

    public Integer getValorListaEsPersonaConCerVida1() {
        return this.valorListaEsPersonaConCerVida1;
    }

    public void setValorListaEsPersonaConCerVida1(Integer valor) {
        this.valorListaEsPersonaConCerVida1 = valor;
    }

    public Object getOpcionesListaEsPersonaConCopiaCedula1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    private Integer valorListaEsPersonaConCopiaCedula1;

    public Integer getValorListaEsPersonaConCopiaCedula1() {
        return this.valorListaEsPersonaConCopiaCedula1;
    }

    public void setValorListaEsPersonaConCopiaCedula1(Integer valor) {
        this.valorListaEsPersonaConCopiaCedula1 = valor;
    }

    public Object getOpcionesListaEsPersonaConDeclaracionJur1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    private Integer valorListaEsPersonaConDeclaracionJur1;

    public Integer getValorListaEsPersonaConDeclaracionJur1() {
        return this.valorListaEsPersonaConDeclaracionJur1;
    }

    public void setValorListaEsPersonaConDeclaracionJur1(Integer valor) {
        this.valorListaEsPersonaConDeclaracionJur1 = valor;
    }

    public Object getOpcionesListaNumeroCausaDenRecoPen1() {
        return JSF.getListaOpciones(EnumCausaDenRecoPen.values(), true, false);
    }

    private Integer valorListaNumeroCausaDenRecoPen1;

    public Integer getValorListaNumeroCausaDenRecoPen1() {
        return this.valorListaNumeroCausaDenRecoPen1;
    }

    public void setValorListaNumeroCausaDenRecoPen1(Integer valor) {
        this.valorListaNumeroCausaDenRecoPen1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* registrarCerVidaPersona */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* anularCerVidaPersona */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* registrarCerDefunPersona */
                : f == FUNCION_ACCION_4 ? this.accion4(f) /* anularCerDefunPersona */
                : f == FUNCION_ACCION_5 ? this.accion5(f) /* aprobarPensionPersona */
                : f == FUNCION_ACCION_6 ? this.accion6(f) /* anularAprobacionPenPersona */
                : f == FUNCION_ACCION_7 ? this.accion7(f) /* objetarPensionPersona */
                : f == FUNCION_ACCION_8 ? this.accion8(f) /* revocarPensionPersona */
                : f == FUNCION_ACCION_9 ? this.accion9(f) /* otorgarPensionPersona */
                : f == FUNCION_ACCION_10 ? this.accion10(f) /* denegarPensionPersona */
                : f == FUNCION_ACCION_11 ? this.accion11(f) /* anularDenegacionPenPersona */
                : f == FUNCION_ACCION_12 ? this.accion12(f) /* registrarEntregaDocPersona */
                : f == FUNCION_ACCION_13 ? this.accion13(f) /* incluirPersonaEnJupe */
                : f == FUNCION_ACCION_14 ? this.accion14(f) /* asignarMontoPensionPersona */
                : f == FUNCION_ACCION_15 ? this.accion15(f) /* actFecUltCobPenPersona */
                : f == FUNCION_ACCION_16 ? this.accion16(f) /* anulFecUltCobPenPersona */
                : f == FUNCION_ACCION_17 ? this.accion17(f) /* solicitarRecoPenPersona */
                : f == FUNCION_ACCION_18 ? this.accion18(f) /* asignarRecoPenPersona */
                : f == FUNCION_ACCION_19 ? this.accion19(f) /* aprobarRecoPenPersona */
                : f == FUNCION_ACCION_20 ? this.accion20(f) /* denegarRecoPenPersona */
                : f == FUNCION_ACCION_21 ? this.accion21(f) /* registrarDenuPenPersona */
                : f == FUNCION_ACCION_22 ? this.accion22(f) /* confirmarDenuPenPersona */
                : f == FUNCION_ACCION_23 ? this.accion23(f) /* desmentirDenuPenPersona */
                : f == FUNCION_ACCION_24 ? this.accion24(f) /* anotarPersona */
                : f == FUNCION_ACCION_25 ? this.accion25(f) /* borrarPersona */
                : f == FUNCION_ACCION_26 ? this.accion26(f) /* borrarPersonaOtro */
                : f == FUNCION_ACCION_27 ? this.accion27(f) /* solicitarRecoPenPersonaSel */
                : f == FUNCION_ACCION_28 ? this.accion28(f) /* asignarRecoPenPersonaSel */
                : f == FUNCION_ACCION_29 ? this.accion29(f) /* aprobarRecoPenPersonaSel */
                : f == FUNCION_ACCION_30 ? this.accion30(f) /* denegarRecoPenPersonaSel */
                : f == FUNCION_ACCION_31 ? this.accion31(f) /* emitirPersonaConPensionSolicitada */
                : f == FUNCION_ACCION_32 ? this.accion32(f) /* emitirPersonaAcreditadaSinObjeciones */
                : f == FUNCION_ACCION_33 ? this.accion33(f) /* emitirPersonaAcreditadaConObjeciones */
                : f == FUNCION_ACCION_34 ? this.accion34(f) /* emitirPersonaConPensionAprobada */
                : f == FUNCION_ACCION_35 ? this.accion35(f) /* emitirPersonaConPensionDenegada */
                : f == FUNCION_ACCION_36 ? this.accion36(f) /* emitirPersonaConPensionRevocada */
                : f == FUNCION_ACCION_37 ? this.accion37(f) /* emitirPersonaConPensionOtorgada */
                : f == FUNCION_ACCION_38 ? this.accion38(f) /* emitirDocumentosPersonaPensionOtorgada */
                : f == FUNCION_ACCION_39 ? this.accion39(f) /* emitirDocumentosPersonaPensionDenegada */
                : f == FUNCION_ACCION_40 ? this.accion40(f) /* emitirPersonaIncluidaEnJupe */
                : f == FUNCION_ACCION_41 ? this.accion41(f) /* emitirPersonaExcluidaDeJupe */
                : f == FUNCION_ACCION_42 ? this.accion42(f) /* emitirCuadroResumenPensionPersona */
                : f == FUNCION_ACCION_43 ? this.accion43(f) /* emitirPersonaConReconsideracionSolicitada */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.registrarCerVidaPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "registrar_cer_vida_persona");
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anularCerVidaPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anular_cer_vida_persona");
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.registrarCerDefunPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "registrar_cer_defun_persona");
        }
        return null;
    }

    private String accion4(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anularCerDefunPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anular_cer_defun_persona");
        }
        return null;
    }

    private String accion5(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.aprobarPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "aprobar_pension_persona");
        }
        return null;
    }

    private String accion6(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anularAprobacionPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anular_aprobacion_pen_persona");
        }
        return null;
    }

    private String accion7(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.objetarPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "objetar_pension_persona");
        }
        return null;
    }

    private String accion8(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.revocarPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "revocar_pension_persona");
        }
        return null;
    }

    private String accion9(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.otorgarPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "otorgar_pension_persona");
        }
        return null;
    }

    private String accion10(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.denegarPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "denegar_pension_persona");
        }
        return null;
    }

    private String accion11(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anularDenegacionPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anular_denegacion_pen_persona");
        }
        return null;
    }

    private String accion12(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.registrarEntregaDocPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "registrar_entrega_doc_persona");
        }
        return null;
    }

    private String accion13(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.incluirPersonaEnJupe();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "incluir_persona_en_jupe");
        }
        return null;
    }

    private String accion14(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.asignarMontoPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "asignar_monto_pension_persona");
        }
        return null;
    }

    private String accion15(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.actFecUltCobPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "act_fec_ult_cob_pen_persona");
        }
        return null;
    }

    private String accion16(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anulFecUltCobPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anul_fec_ult_cob_pen_persona");
        }
        return null;
    }

    private String accion17(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.solicitarRecoPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "solicitar_reco_pen_persona");
        }
        return null;
    }

    private String accion18(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.asignarRecoPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "asignar_reco_pen_persona");
        }
        return null;
    }

    private String accion19(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.aprobarRecoPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "aprobar_reco_pen_persona");
        }
        return null;
    }

    private String accion20(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.denegarRecoPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "denegar_reco_pen_persona");
        }
        return null;
    }

    private String accion21(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.registrarDenuPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "registrar_denu_pen_persona");
        }
        return null;
    }

    private String accion22(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.confirmarDenuPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "confirmar_denu_pen_persona");
        }
        return null;
    }

    private String accion23(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.desmentirDenuPenPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "desmentir_denu_pen_persona");
        }
        return null;
    }

    private String accion24(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anotarPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anotar_persona");
        }
        return null;
    }

    private String accion25(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.borrarPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "borrar_persona");
        }
        return null;
    }

    private String accion26(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.borrarPersonaOtro();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "borrar_persona_otro");
        }
        return null;
    }

    private String accion27(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.solicitarRecoPenPersonaSel();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "solicitar_reco_pen_persona_sel");
        }
        return null;
    }

    private String accion28(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.asignarRecoPenPersonaSel();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "asignar_reco_pen_persona_sel");
        }
        return null;
    }

    private String accion29(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.aprobarRecoPenPersonaSel();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "aprobar_reco_pen_persona_sel");
        }
        return null;
    }

    private String accion30(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.denegarRecoPenPersonaSel();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "denegar_reco_pen_persona_sel");
        }
        return null;
    }

    private String accion31(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaConPensionSolicitada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_con_pension_solicitada");
        }
        return null;
    }

    private String accion32(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaAcreditadaSinObjeciones();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_acreditada_sin_objeciones");
        }
        return null;
    }

    private String accion33(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaAcreditadaConObjeciones();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_acreditada_con_objeciones");
        }
        return null;
    }

    private String accion34(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaConPensionAprobada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_con_pension_aprobada");
        }
        return null;
    }

    private String accion35(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaConPensionDenegada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_con_pension_denegada");
        }
        return null;
    }

    private String accion36(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaConPensionRevocada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_con_pension_revocada");
        }
        return null;
    }

    private String accion37(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaConPensionOtorgada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_con_pension_otorgada");
        }
        return null;
    }

    private String accion38(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirDocumentosPersonaPensionOtorgada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_documentos_persona_pension_otorgada");
        }
        return null;
    }

    private String accion39(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirDocumentosPersonaPensionDenegada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_documentos_persona_pension_denegada");
        }
        return null;
    }

    private String accion40(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaIncluidaEnJupe();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_incluida_en_jupe");
        }
        return null;
    }

    private String accion41(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaExcluidaDeJupe();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_excluida_de_jupe");
        }
        return null;
    }

    private String accion42(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirCuadroResumenPensionPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_cuadro_resumen_pension_persona");
        }
        return null;
    }

    private String accion43(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPersonaConReconsideracionSolicitada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "emitir_persona_con_reconsideracion_solicitada");
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private PersonaBusinessProcessLocal personaBusinessProcess;

    @EJB
    private ReporterBrokerLocal reporter;

    private void registrarCerVidaPersona() { /* registrar cer vida persona */
        this.registrarCerVidaPersona(synchronously);
    }

    private void registrarCerVidaPersona(boolean synchronously) { /* registrar cer vida persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String certificadoVida = this.getTextoCampoCertificadoVida1();
            Date fechaCertificadoVida = this.getValorCampoFechaCertificadoVida1();
            Integer diasVigenciaCertificadoVida = (Integer) STP.getObjeto(this.getTextoCampoDiasVigenciaCertificadoVida1(), EnumTipoDatoPar.ENTERO);
            RegistrarCerVidaPersonaMessage message = new RegistrarCerVidaPersonaMessage(idPersona, certificadoVida, fechaCertificadoVida, diasVigenciaCertificadoVida);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.registrarCerVidaPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anularCerVidaPersona() { /* anular cer vida persona */
        this.anularCerVidaPersona(synchronously);
    }

    private void anularCerVidaPersona(boolean synchronously) { /* anular cer vida persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            AnularCerVidaPersonaMessage message = new AnularCerVidaPersonaMessage(idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.anularCerVidaPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void registrarCerDefunPersona() { /* registrar cer defun persona */
        this.registrarCerDefunPersona(synchronously);
    }

    private void registrarCerDefunPersona(boolean synchronously) { /* registrar cer defun persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String certificadoDefuncion = this.getTextoCampoCertificadoDefuncion1();
            Date fechaCertificadoDefuncion = this.getValorCampoFechaCertificadoDefuncion1();
            RegistrarCerDefunPersonaMessage message = new RegistrarCerDefunPersonaMessage(idPersona, certificadoDefuncion, fechaCertificadoDefuncion);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.registrarCerDefunPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anularCerDefunPersona() { /* anular cer defun persona */
        this.anularCerDefunPersona(synchronously);
    }

    private void anularCerDefunPersona(boolean synchronously) { /* anular cer defun persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            AnularCerDefunPersonaMessage message = new AnularCerDefunPersonaMessage(idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.anularCerDefunPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void aprobarPensionPersona() { /* aprobar pension persona */
        this.aprobarPensionPersona(synchronously);
    }

    private void aprobarPensionPersona(boolean synchronously) { /* aprobar pension persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String comentariosAprobacionPension = this.getTextoCampoComentariosAprobacionPension1();
            AprobarPensionPersonaMessage message = new AprobarPensionPersonaMessage(idPersona, comentariosAprobacionPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.aprobarPensionPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anularAprobacionPenPersona() { /* anular aprobacion pen persona */
        this.anularAprobacionPenPersona(synchronously);
    }

    private void anularAprobacionPenPersona(boolean synchronously) { /* anular aprobacion pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            AnularAprobacionPenPersonaMessage message = new AnularAprobacionPenPersonaMessage(idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.anularAprobacionPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void objetarPensionPersona() { /* objetar pension persona */
        this.objetarPensionPersona(synchronously);
    }

    private void objetarPensionPersona(boolean synchronously) { /* objetar pension persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            Integer numeroCausaDenPension = this.getValorListaNumeroCausaDenPension1();
            String otraCausaDenPension = this.getTextoCampoOtraCausaDenPension1();
            String comentariosObjecionPension = this.getTextoCampoComentariosObjecionPension1();
            ObjetarPensionPersonaMessage message = new ObjetarPensionPersonaMessage(idPersona, numeroCausaDenPension, otraCausaDenPension, comentariosObjecionPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.objetarPensionPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void revocarPensionPersona() { /* revocar pension persona */
        this.revocarPensionPersona(synchronously);
    }

    private void revocarPensionPersona(boolean synchronously) { /* revocar pension persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            Integer numeroCausaRevPension = this.getValorListaNumeroCausaRevPension1();
            String otraCausaRevPension = this.getTextoCampoOtraCausaRevPension1();
            String comentariosRevocacionPension = this.getTextoCampoComentariosRevocacionPension1();
            RevocarPensionPersonaMessage message = new RevocarPensionPersonaMessage(idPersona, numeroCausaRevPension, otraCausaRevPension, comentariosRevocacionPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.revocarPensionPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void otorgarPensionPersona() { /* otorgar pension persona */
        this.otorgarPensionPersona(synchronously);
    }

    private void otorgarPensionPersona(boolean synchronously) { /* otorgar pension persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String numeroResolucionOtorPen = this.getTextoCampoNumeroResolucionOtorPen1();
            Date fechaResolucionOtorPen = this.getValorCampoFechaResolucionOtorPen1();
            String comentariosOtorgamientoPen = this.getTextoCampoComentariosOtorgamientoPen1();
            OtorgarPensionPersonaMessage message = new OtorgarPensionPersonaMessage(idPersona, numeroResolucionOtorPen, fechaResolucionOtorPen, comentariosOtorgamientoPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.otorgarPensionPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void denegarPensionPersona() { /* denegar pension persona */
        this.denegarPensionPersona(synchronously);
    }

    private void denegarPensionPersona(boolean synchronously) { /* denegar pension persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String numeroResolucionDenPen = this.getTextoCampoNumeroResolucionDenPen1();
            Date fechaResolucionDenPen = this.getValorCampoFechaResolucionDenPen1();
            String comentariosDenegacionPension = this.getTextoCampoComentariosDenegacionPension1();
            DenegarPensionPersonaMessage message = new DenegarPensionPersonaMessage(idPersona, numeroResolucionDenPen, fechaResolucionDenPen, comentariosDenegacionPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.denegarPensionPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anularDenegacionPenPersona() { /* anular denegacion pen persona */
        this.anularDenegacionPenPersona(synchronously);
    }

    private void anularDenegacionPenPersona(boolean synchronously) { /* anular denegacion pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            AnularDenegacionPenPersonaMessage message = new AnularDenegacionPenPersonaMessage(idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.anularDenegacionPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void registrarEntregaDocPersona() { /* registrar entrega doc persona */
        this.registrarEntregaDocPersona(synchronously);
    }

    private void registrarEntregaDocPersona(boolean synchronously) { /* registrar entrega doc persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            Integer esPersonaConCerVida = this.getValorListaEsPersonaConCerVida1();
            String certificadoVida = this.getTextoCampoCertificadoVida1();
            Date fechaCertificadoVida = this.getValorCampoFechaCertificadoVida1();
            Integer esPersonaConCopiaCedula = this.getValorListaEsPersonaConCopiaCedula1();
            Integer esPersonaConDeclaracionJur = this.getValorListaEsPersonaConDeclaracionJur1();
            String comentariosEntregaDocumentos = this.getTextoCampoComentariosEntregaDocumentos1();
            RegistrarEntregaDocPersonaMessage message = new RegistrarEntregaDocPersonaMessage(idPersona, esPersonaConCerVida, certificadoVida, fechaCertificadoVida, esPersonaConCopiaCedula, esPersonaConDeclaracionJur, comentariosEntregaDocumentos);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.registrarEntregaDocPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void incluirPersonaEnJupe() { /* incluir persona en jupe */
        this.incluirPersonaEnJupe(synchronously);
    }

    private void incluirPersonaEnJupe(boolean synchronously) { /* incluir persona en jupe */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            IncluirPersonaEnJupeMessage message = new IncluirPersonaEnJupeMessage(idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.incluirPersonaEnJupe(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void asignarMontoPensionPersona() { /* asignar monto pension persona */
        this.asignarMontoPensionPersona(synchronously);
    }

    private void asignarMontoPensionPersona(boolean synchronously) { /* asignar monto pension persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            BigDecimal montoPension = (BigDecimal) STP.getObjeto(this.getTextoCampoMontoPension1(), EnumTipoDatoPar.NUMERICO);
            AsignarMontoPensionPersonaMessage message = new AsignarMontoPensionPersonaMessage(idPersona, montoPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.asignarMontoPensionPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void actFecUltCobPenPersona() { /* act fec ult cob pen persona */
        this.actFecUltCobPenPersona(synchronously);
    }

    private void actFecUltCobPenPersona(boolean synchronously) { /* act fec ult cob pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            Date fechaUltimoCobroPension = this.getValorCampoFechaUltimoCobroPension1();
            ActFecUltCobPenPersonaMessage message = new ActFecUltCobPenPersonaMessage(idPersona, fechaUltimoCobroPension);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.actFecUltCobPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anulFecUltCobPenPersona() { /* anul fec ult cob pen persona */
        this.anulFecUltCobPenPersona(synchronously);
    }

    private void anulFecUltCobPenPersona(boolean synchronously) { /* anul fec ult cob pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String notasAnulFecUltCobPen = this.getTextoCampoNotasAnulFecUltCobPen1();
            AnulFecUltCobPenPersonaMessage message = new AnulFecUltCobPenPersonaMessage(idPersona, notasAnulFecUltCobPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.anulFecUltCobPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void solicitarRecoPenPersona() { /* solicitar reco pen persona */
        this.solicitarRecoPenPersona(synchronously);
    }

    private void solicitarRecoPenPersona(boolean synchronously) { /* solicitar reco pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String comentariosSolicitudRecoPen = this.getTextoCampoComentariosSolicitudRecoPen1();
            SolicitarRecoPenPersonaMessage message = new SolicitarRecoPenPersonaMessage(idPersona, comentariosSolicitudRecoPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.solicitarRecoPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void asignarRecoPenPersona() { /* asignar reco pen persona */
        this.asignarRecoPenPersona(synchronously);
    }

    private void asignarRecoPenPersona(boolean synchronously) { /* asignar reco pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String codigoSimeRecoPen = this.getTextoCampoCodigoSimeRecoPen1();
            AsignarRecoPenPersonaMessage message = new AsignarRecoPenPersonaMessage(idPersona, codigoSimeRecoPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.asignarRecoPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void aprobarRecoPenPersona() { /* aprobar reco pen persona */
        this.aprobarRecoPenPersona(synchronously);
    }

    private void aprobarRecoPenPersona(boolean synchronously) { /* aprobar reco pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String comentariosAprRecoPen = this.getTextoCampoComentariosAprRecoPen1();
            AprobarRecoPenPersonaMessage message = new AprobarRecoPenPersonaMessage(idPersona, comentariosAprRecoPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.aprobarRecoPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void denegarRecoPenPersona() { /* denegar reco pen persona */
        this.denegarRecoPenPersona(synchronously);
    }

    private void denegarRecoPenPersona(boolean synchronously) { /* denegar reco pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            Integer numeroCausaDenRecoPen = this.getValorListaNumeroCausaDenRecoPen1();
            String otraCausaDenRecoPen = this.getTextoCampoOtraCausaDenRecoPen1();
            String comentariosDenRecoPen = this.getTextoCampoComentariosDenRecoPen1();
            DenegarRecoPenPersonaMessage message = new DenegarRecoPenPersonaMessage(idPersona, numeroCausaDenRecoPen, otraCausaDenRecoPen, comentariosDenRecoPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.denegarRecoPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void registrarDenuPenPersona() { /* registrar denu pen persona */
        this.registrarDenuPenPersona(synchronously);
    }

    private void registrarDenuPenPersona(boolean synchronously) { /* registrar denu pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String comentariosRegistroDenuPen = this.getTextoCampoComentariosRegistroDenuPen1();
            RegistrarDenuPenPersonaMessage message = new RegistrarDenuPenPersonaMessage(idPersona, comentariosRegistroDenuPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.registrarDenuPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void confirmarDenuPenPersona() { /* confirmar denu pen persona */
        this.confirmarDenuPenPersona(synchronously);
    }

    private void confirmarDenuPenPersona(boolean synchronously) { /* confirmar denu pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            Integer numeroCausaRevPension = this.getValorListaNumeroCausaRevPension1();
            String otraCausaRevPension = this.getTextoCampoOtraCausaRevPension1();
            String comentariosConfDenuPen = this.getTextoCampoComentariosConfDenuPen1();
            ConfirmarDenuPenPersonaMessage message = new ConfirmarDenuPenPersonaMessage(idPersona, numeroCausaRevPension, otraCausaRevPension, comentariosConfDenuPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.confirmarDenuPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void desmentirDenuPenPersona() { /* desmentir denu pen persona */
        this.desmentirDenuPenPersona(synchronously);
    }

    private void desmentirDenuPenPersona(boolean synchronously) { /* desmentir denu pen persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            String comentariosDesDenuPen = this.getTextoCampoComentariosDesDenuPen1();
            DesmentirDenuPenPersonaMessage message = new DesmentirDenuPenPersonaMessage(idPersona, comentariosDesDenuPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.desmentirDenuPenPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anotarPersona() { /* anotar persona */
        this.anotarPersona(synchronously);
    }

    private void anotarPersona(boolean synchronously) { /* anotar persona */
        try {
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            AnotarPersonaMessage message = new AnotarPersonaMessage(idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.anotarPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void borrarPersona() { /* borrar persona */
        this.borrarPersona(synchronously);
    }

    private void borrarPersona(boolean synchronously) { /* borrar persona */
        try {
            BorrarPersonaMessage message = new BorrarPersonaMessage();
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.borrarPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void borrarPersonaOtro() { /* borrar persona otro */
        this.borrarPersonaOtro(synchronously);
    }

    private void borrarPersonaOtro(boolean synchronously) { /* borrar persona otro */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            BorrarPersonaOtroMessage message = new BorrarPersonaOtroMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.borrarPersonaOtro(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void solicitarRecoPenPersonaSel() { /* solicitar reco pen persona sel */
        this.solicitarRecoPenPersonaSel(synchronously);
    }

    private void solicitarRecoPenPersonaSel(boolean synchronously) { /* solicitar reco pen persona sel */
        try {
            String observacion = this.getTextoCampoObservacion1();
            SolicitarRecoPenPersonaSelMessage message = new SolicitarRecoPenPersonaSelMessage(observacion);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.solicitarRecoPenPersonaSel(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void asignarRecoPenPersonaSel() { /* asignar reco pen persona sel */
        this.asignarRecoPenPersonaSel(synchronously);
    }

    private void asignarRecoPenPersonaSel(boolean synchronously) { /* asignar reco pen persona sel */
        try {
            String codigoSimeRecoPen = this.getTextoCampoCodigoSimeRecoPen1();
            AsignarRecoPenPersonaSelMessage message = new AsignarRecoPenPersonaSelMessage(codigoSimeRecoPen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.asignarRecoPenPersonaSel(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void aprobarRecoPenPersonaSel() { /* aprobar reco pen persona sel */
        this.aprobarRecoPenPersonaSel(synchronously);
    }

    private void aprobarRecoPenPersonaSel(boolean synchronously) { /* aprobar reco pen persona sel */
        try {
            String observacion = this.getTextoCampoObservacion1();
            AprobarRecoPenPersonaSelMessage message = new AprobarRecoPenPersonaSelMessage(observacion);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.aprobarRecoPenPersonaSel(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void denegarRecoPenPersonaSel() { /* denegar reco pen persona sel */
        this.denegarRecoPenPersonaSel(synchronously);
    }

    private void denegarRecoPenPersonaSel(boolean synchronously) { /* denegar reco pen persona sel */
        try {
            String observacion = this.getTextoCampoObservacion1();
            DenegarRecoPenPersonaSelMessage message = new DenegarRecoPenPersonaSelMessage(observacion);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaBusinessProcess.denegarRecoPenPersonaSel(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void emitirPersonaConPensionSolicitada() { /* emitir persona con pension solicitada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaSolicitudPensionDesde = this.getValorCampoFechaSolicitudPensionDesde1();
        Date fechaSolicitudPensionHasta = this.getValorCampoFechaSolicitudPensionHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_pension_desde", fechaSolicitudPensionDesde);
        parameters.put("fecha_solicitud_pension_hasta", fechaSolicitudPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudPensionDesde != null) {
            args.add(fechaSolicitudPensionDesde);
            search += " and fecha_solicitud_pension>=?";
        }
        if (fechaSolicitudPensionHasta != null) {
            args.add(fechaSolicitudPensionHasta);
            search += " and fecha_solicitud_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaAcreditadaSinObjeciones() { /* emitir persona acreditada sin objeciones */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaSolicitudPensionDesde = this.getValorCampoFechaSolicitudPensionDesde1();
        Date fechaSolicitudPensionHasta = this.getValorCampoFechaSolicitudPensionHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_pension_desde", fechaSolicitudPensionDesde);
        parameters.put("fecha_solicitud_pension_hasta", fechaSolicitudPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudPensionDesde != null) {
            args.add(fechaSolicitudPensionDesde);
            search += " and fecha_solicitud_pension>=?";
        }
        if (fechaSolicitudPensionHasta != null) {
            args.add(fechaSolicitudPensionHasta);
            search += " and fecha_solicitud_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaAcreditadaConObjeciones() { /* emitir persona acreditada con objeciones */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaSolicitudPensionDesde = this.getValorCampoFechaSolicitudPensionDesde1();
        Date fechaSolicitudPensionHasta = this.getValorCampoFechaSolicitudPensionHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_pension_desde", fechaSolicitudPensionDesde);
        parameters.put("fecha_solicitud_pension_hasta", fechaSolicitudPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudPensionDesde != null) {
            args.add(fechaSolicitudPensionDesde);
            search += " and fecha_solicitud_pension>=?";
        }
        if (fechaSolicitudPensionHasta != null) {
            args.add(fechaSolicitudPensionHasta);
            search += " and fecha_solicitud_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaConPensionAprobada() { /* emitir persona con pension aprobada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaAprobacionPensionDesde = this.getValorCampoFechaAprobacionPensionDesde1();
        Date fechaAprobacionPensionHasta = this.getValorCampoFechaAprobacionPensionHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_aprobacion_pension_desde", fechaAprobacionPensionDesde);
        parameters.put("fecha_aprobacion_pension_hasta", fechaAprobacionPensionHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaAprobacionPensionDesde != null) {
            args.add(fechaAprobacionPensionDesde);
            search += " and fecha_aprobacion_pension>=?";
        }
        if (fechaAprobacionPensionHasta != null) {
            args.add(fechaAprobacionPensionHasta);
            search += " and fecha_aprobacion_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaConPensionDenegada() { /* emitir persona con pension denegada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaDenegacionPensionDesde = this.getValorCampoFechaDenegacionPensionDesde1();
        Date fechaDenegacionPensionHasta = this.getValorCampoFechaDenegacionPensionHasta1();
        Integer numeroCausaDenPension = this.getValorListaNumeroCausaDenPension1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_denegacion_pension_desde", fechaDenegacionPensionDesde);
        parameters.put("fecha_denegacion_pension_hasta", fechaDenegacionPensionHasta);
        parameters.put("numero_causa_den_pension", numeroCausaDenPension);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaDenegacionPensionDesde != null) {
            args.add(fechaDenegacionPensionDesde);
            search += " and fecha_denegacion_pension>=?";
        }
        if (fechaDenegacionPensionHasta != null) {
            args.add(fechaDenegacionPensionHasta);
            search += " and fecha_denegacion_pension<=?";
        }
        if (numeroCausaDenPension != null) {
            args.add(numeroCausaDenPension);
            search += " and numero_causa_den_pension=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaConPensionRevocada() { /* emitir persona con pension revocada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaRevocacionPensionDesde = this.getValorCampoFechaRevocacionPensionDesde1();
        Date fechaRevocacionPensionHasta = this.getValorCampoFechaRevocacionPensionHasta1();
        Integer numeroCausaRevPension = this.getValorListaNumeroCausaRevPension1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_revocacion_pension_desde", fechaRevocacionPensionDesde);
        parameters.put("fecha_revocacion_pension_hasta", fechaRevocacionPensionHasta);
        parameters.put("numero_causa_rev_pension", numeroCausaRevPension);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaRevocacionPensionDesde != null) {
            args.add(fechaRevocacionPensionDesde);
            search += " and fecha_revocacion_pension>=?";
        }
        if (fechaRevocacionPensionHasta != null) {
            args.add(fechaRevocacionPensionHasta);
            search += " and fecha_revocacion_pension<=?";
        }
        if (numeroCausaRevPension != null) {
            args.add(numeroCausaRevPension);
            search += " and numero_causa_rev_pension=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaConPensionOtorgada() { /* emitir persona con pension otorgada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaOtorgamientoPenDesde = this.getValorCampoFechaOtorgamientoPenDesde1();
        Date fechaOtorgamientoPenHasta = this.getValorCampoFechaOtorgamientoPenHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_otorgamiento_pen_desde", fechaOtorgamientoPenDesde);
        parameters.put("fecha_otorgamiento_pen_hasta", fechaOtorgamientoPenHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaOtorgamientoPenDesde != null) {
            args.add(fechaOtorgamientoPenDesde);
            search += " and fecha_otorgamiento_pen>=?";
        }
        if (fechaOtorgamientoPenHasta != null) {
            args.add(fechaOtorgamientoPenHasta);
            search += " and fecha_otorgamiento_pen<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirDocumentosPersonaPensionOtorgada() { /* emitir documentos persona pension otorgada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaOtorgamientoPenDesde = this.getValorCampoFechaOtorgamientoPenDesde1();
        Date fechaOtorgamientoPenHasta = this.getValorCampoFechaOtorgamientoPenHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        Integer esPersonaConCerVida = this.getValorListaEsPersonaConCerVida1();
        Integer esPersonaConCopiaCedula = this.getValorListaEsPersonaConCopiaCedula1();
        Integer esPersonaConDeclaracionJur = this.getValorListaEsPersonaConDeclaracionJur1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA;
        long function = PersonaConstants.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_otorgamiento_pen_desde", fechaOtorgamientoPenDesde);
        parameters.put("fecha_otorgamiento_pen_hasta", fechaOtorgamientoPenHasta);
        parameters.put("codigo_sime", codigoSime);
        parameters.put("es_persona_con_cer_vida", esPersonaConCerVida);
        parameters.put("es_persona_con_copia_cedula", esPersonaConCopiaCedula);
        parameters.put("es_persona_con_declaracion_jur", esPersonaConDeclaracionJur);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaOtorgamientoPenDesde != null) {
            args.add(fechaOtorgamientoPenDesde);
            search += " and fecha_otorgamiento_pen>=?";
        }
        if (fechaOtorgamientoPenHasta != null) {
            args.add(fechaOtorgamientoPenHasta);
            search += " and fecha_otorgamiento_pen<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (esPersonaConCerVida != null) {
            args.add(esPersonaConCerVida);
            search += " and es_persona_con_cer_vida=?";
        }
        if (esPersonaConCopiaCedula != null) {
            args.add(esPersonaConCopiaCedula);
            search += " and es_persona_con_copia_cedula=?";
        }
        if (esPersonaConDeclaracionJur != null) {
            args.add(esPersonaConDeclaracionJur);
            search += " and es_persona_con_declaracion_jur=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirDocumentosPersonaPensionDenegada() { /* emitir documentos persona pension denegada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaDenegacionPensionDesde = this.getValorCampoFechaDenegacionPensionDesde1();
        Date fechaDenegacionPensionHasta = this.getValorCampoFechaDenegacionPensionHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        Integer esPersonaConCerVida = this.getValorListaEsPersonaConCerVida1();
        Integer esPersonaConCopiaCedula = this.getValorListaEsPersonaConCopiaCedula1();
        Integer esPersonaConDeclaracionJur = this.getValorListaEsPersonaConDeclaracionJur1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_DENEGADA;
        long function = PersonaConstants.FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_DENEGADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_denegacion_pension_desde", fechaDenegacionPensionDesde);
        parameters.put("fecha_denegacion_pension_hasta", fechaDenegacionPensionHasta);
        parameters.put("codigo_sime", codigoSime);
        parameters.put("es_persona_con_cer_vida", esPersonaConCerVida);
        parameters.put("es_persona_con_copia_cedula", esPersonaConCopiaCedula);
        parameters.put("es_persona_con_declaracion_jur", esPersonaConDeclaracionJur);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaDenegacionPensionDesde != null) {
            args.add(fechaDenegacionPensionDesde);
            search += " and fecha_denegacion_pension>=?";
        }
        if (fechaDenegacionPensionHasta != null) {
            args.add(fechaDenegacionPensionHasta);
            search += " and fecha_denegacion_pension<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (esPersonaConCerVida != null) {
            args.add(esPersonaConCerVida);
            search += " and es_persona_con_cer_vida=?";
        }
        if (esPersonaConCopiaCedula != null) {
            args.add(esPersonaConCopiaCedula);
            search += " and es_persona_con_copia_cedula=?";
        }
        if (esPersonaConDeclaracionJur != null) {
            args.add(esPersonaConDeclaracionJur);
            search += " and es_persona_con_declaracion_jur=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaIncluidaEnJupe() { /* emitir persona incluida en jupe */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaHoraUltActJupeDesde = this.getValorCampoFechaHoraUltActJupeDesde1();
        Date fechaHoraUltActJupeHasta = this.getValorCampoFechaHoraUltActJupeHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_INCLUIDA_EN_JUPE;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_INCLUIDA_EN_JUPE;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_hora_ult_act_jupe_desde", fechaHoraUltActJupeDesde);
        parameters.put("fecha_hora_ult_act_jupe_hasta", fechaHoraUltActJupeHasta);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaHoraUltActJupeDesde != null) {
            args.add(fechaHoraUltActJupeDesde);
            search += " and fecha_hora_ult_act_jupe>=?";
        }
        if (fechaHoraUltActJupeHasta != null) {
            args.add(fechaHoraUltActJupeHasta);
            search += " and fecha_hora_ult_act_jupe<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaExcluidaDeJupe() { /* emitir persona excluida de jupe */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_EXCLUIDA_DE_JUPE;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_EXCLUIDA_DE_JUPE;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("codigo_sime", codigoSime);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirCuadroResumenPensionPersona() { /* emitir cuadro resumen pension persona */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA;
        long function = PersonaConstants.FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPersonaConReconsideracionSolicitada() { /* emitir persona con reconsideracion solicitada */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaSolicitudRecoPenDesde = this.getValorCampoFechaSolicitudRecoPenDesde1();
        Date fechaSolicitudRecoPenHasta = this.getValorCampoFechaSolicitudRecoPenHasta1();
        String codigoSime = this.getTextoCampoCodigoSime1();
        String numeroResolucionDenPen = this.getTextoCampoNumeroResolucionDenPen1();
        Date fechaResolucionDenPenDesde = this.getValorCampoFechaResolucionDenPenDesde1();
        Date fechaResolucionDenPenHasta = this.getValorCampoFechaResolucionDenPenHasta1();
        String report = PersonaConstants.INFORME_FUNCION_EMITIR_PERSONA_CON_RECONSIDERACION_SOLICITADA;
        long function = PersonaConstants.FUNCION_EMITIR_PERSONA_CON_RECONSIDERACION_SOLICITADA;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_solicitud_reco_pen_desde", fechaSolicitudRecoPenDesde);
        parameters.put("fecha_solicitud_reco_pen_hasta", fechaSolicitudRecoPenHasta);
        parameters.put("codigo_sime", codigoSime);
        parameters.put("numero_resolucion_den_pen", numeroResolucionDenPen);
        parameters.put("fecha_resolucion_den_pen_desde", fechaResolucionDenPenDesde);
        parameters.put("fecha_resolucion_den_pen_hasta", fechaResolucionDenPenHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from persona";
        String search = "";
        ArrayList args = new ArrayList();
        if (idDepartamento != null) {
            args.add(idDepartamento);
            search += " and id_departamento=?";
        }
        if (idDistrito != null) {
            args.add(idDistrito);
            search += " and id_distrito=?";
        }
        if (idBarrio != null) {
            args.add(idBarrio);
            search += " and id_barrio=?";
        }
        if (fechaSolicitudRecoPenDesde != null) {
            args.add(fechaSolicitudRecoPenDesde);
            search += " and fecha_solicitud_reco_pen>=?";
        }
        if (fechaSolicitudRecoPenHasta != null) {
            args.add(fechaSolicitudRecoPenHasta);
            search += " and fecha_solicitud_reco_pen<=?";
        }
        if (codigoSime != null) {
            args.add(codigoSime);
            search += " and codigo_sime=?";
        }
        if (numeroResolucionDenPen != null) {
            args.add(numeroResolucionDenPen);
            search += " and numero_resolucion_den_pen=?";
        }
        if (fechaResolucionDenPenDesde != null) {
            args.add(fechaResolucionDenPenDesde);
            search += " and fecha_resolucion_den_pen>=?";
        }
        if (fechaResolucionDenPenHasta != null) {
            args.add(fechaResolucionDenPenHasta);
            search += " and fecha_resolucion_den_pen<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
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
