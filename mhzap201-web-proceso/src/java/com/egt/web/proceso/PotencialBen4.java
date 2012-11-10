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
package com.egt.web.proceso;

import com.egt.base.enums.EnumCausaInvCenso;
import com.egt.base.enums.EnumCausaDenReclCen;
import com.egt.base.enums.EnumCondicionCenso;
import com.egt.base.enums.EnumTipoRegPotBen;
import com.egt.base.entity.constants.PotencialBenConstants;
import com.egt.base.entity.constants.PersonaConstants;
import com.egt.base.entity.constants.FuncionarioConstants;
import com.egt.base.entity.constants.UbicacionConstants;
import com.egt.ejb.persistence.entity.PotencialBen;
import com.egt.ejb.persistence.entity.Persona;
import com.egt.ejb.persistence.entity.Funcionario;
import com.egt.ejb.persistence.entity.Ubicacion;
import com.egt.ejb.persistence.facade.PotencialBenFacadeLocal;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionarioFacadeLocal;
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
import com.egt.ejb.business.message.DesactivarPotencialBenMessage;
import com.egt.ejb.business.message.ReactivarPotencialBenMessage;
import com.egt.ejb.business.message.VincularPotencialBenMessage;
import com.egt.ejb.business.message.ValidarCensoPotencialBenMessage;
import com.egt.ejb.business.message.InvalidarCensoPotencialBenMessage;
import com.egt.ejb.business.message.RegReclCenPotencialBenMessage;
import com.egt.ejb.business.message.AprobarReclCenPotencialBenMessage;
import com.egt.ejb.business.message.DenegarReclCenPotencialBenMessage;
import com.egt.ejb.business.message.AcreditarPotencialBenMessage;
import com.egt.ejb.business.message.RegUltVisCenPotencialBenMessage;
import com.egt.ejb.business.process.PotencialBenBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class PotencialBen4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorComentariosValidacionCenso1.setMaximum(2000);
        validatorOtraCausaInvCenso1.setMaximum(2000);
        validatorComentariosReclamoCenso1.setMaximum(2000);
        validatorComentariosAprReclCen1.setMaximum(2000);
        validatorOtraCausaDenReclCen1.setMaximum(2000);
        validatorComentariosDenReclCen1.setMaximum(2000);
        converterFechaUltimaVisitaCenso1.setPattern("dd/MM/yyyy");
        converterFechaUltimaVisitaCenso1.setType("date");
        validatorObservacionesUltVisitaCen1.setMaximum(2000);
        converterFechaRegistroPotBenDesde1.setPattern("dd/MM/yyyy");
        converterFechaRegistroPotBenDesde1.setType("date");
        converterFechaRegistroPotBenHasta1.setPattern("dd/MM/yyyy");
        converterFechaRegistroPotBenHasta1.setType("date");
        converterIndiceCalidadVidaDesde1.setMinIntegerDigits(1);
        converterIndiceCalidadVidaDesde1.setMaxIntegerDigits(40);
        converterIndiceCalidadVidaDesde1.setMaxFractionDigits(3);
        validatorIndiceCalidadVidaDesde1.setMinimum(0.0);
        validatorIndiceCalidadVidaDesde1.setMaximum(1.0E15);
        converterIndiceCalidadVidaHasta1.setMinIntegerDigits(1);
        converterIndiceCalidadVidaHasta1.setMaxIntegerDigits(40);
        converterIndiceCalidadVidaHasta1.setMaxFractionDigits(3);
        validatorIndiceCalidadVidaHasta1.setMinimum(0.0);
        validatorIndiceCalidadVidaHasta1.setMaximum(1.0E15);
        converterFechaValidacionCensoDesde1.setPattern("dd/MM/yyyy");
        converterFechaValidacionCensoDesde1.setType("date");
        converterFechaValidacionCensoHasta1.setPattern("dd/MM/yyyy");
        converterFechaValidacionCensoHasta1.setType("date");
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

    private Label labelIdPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1() {
        return labelIdPotencialBen1;
    }

    public void setLabelIdPotencialBen1(Label l) {
        this.labelIdPotencialBen1 = l;
    }

    private TextField campoIdPotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

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

    private Label labelIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen1() {
        return labelIdFuncionarioValidacionCen1;
    }

    public void setLabelIdFuncionarioValidacionCen1(Label l) {
        this.labelIdFuncionarioValidacionCen1 = l;
    }

    private TextField campoIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioValidacionCen1() {
        return campoIdFuncionarioValidacionCen1;
    }

    public void setCampoIdFuncionarioValidacionCen1(TextField component) {
        this.campoIdFuncionarioValidacionCen1 = component;
    }

    private HelpInline helpInlineIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioValidacionCen1() {
        return helpInlineIdFuncionarioValidacionCen1;
    }

    public void setHelpInlineIdFuncionarioValidacionCen1(HelpInline hi) {
        this.helpInlineIdFuncionarioValidacionCen1 = hi;
    }

    private StaticText campoIdFuncionarioValidacionCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioValidacionCen1Texto1() {
        return campoIdFuncionarioValidacionCen1Texto1;
    }

    public void setCampoIdFuncionarioValidacionCen1Texto1(StaticText component) {
        this.campoIdFuncionarioValidacionCen1Texto1 = component;
    }

    private Button campoIdFuncionarioValidacionCen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioValidacionCen1Boton1() {
        return campoIdFuncionarioValidacionCen1Boton1;
    }

    public void setCampoIdFuncionarioValidacionCen1Boton1(Button component) {
        this.campoIdFuncionarioValidacionCen1Boton1 = component;
    }

    private Button campoIdFuncionarioValidacionCen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioValidacionCen1Boton3() {
        return campoIdFuncionarioValidacionCen1Boton3;
    }

    public void setCampoIdFuncionarioValidacionCen1Boton3(Button component) {
        this.campoIdFuncionarioValidacionCen1Boton3 = component;
    }

    private Label labelIdFuncionarioValidacionCen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen2() {
        return labelIdFuncionarioValidacionCen2;
    }

    public void setLabelIdFuncionarioValidacionCen2(Label l) {
        this.labelIdFuncionarioValidacionCen2 = l;
    }

    private StaticText campoIdFuncionarioValidacionCen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioValidacionCen1Texto2() {
        return campoIdFuncionarioValidacionCen1Texto2;
    }

    public void setCampoIdFuncionarioValidacionCen1Texto2(StaticText component) {
        this.campoIdFuncionarioValidacionCen1Texto2 = component;
    }

    private Button campoIdFuncionarioValidacionCen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioValidacionCen1Boton2() {
        return campoIdFuncionarioValidacionCen1Boton2;
    }

    public void setCampoIdFuncionarioValidacionCen1Boton2(Button component) {
        this.campoIdFuncionarioValidacionCen1Boton2 = component;
    }

    private Label labelComentariosValidacionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosValidacionCenso1() {
        return labelComentariosValidacionCenso1;
    }

    public void setLabelComentariosValidacionCenso1(Label l) {
        this.labelComentariosValidacionCenso1 = l;
    }

    private TextField campoComentariosValidacionCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosValidacionCenso1() {
        return campoComentariosValidacionCenso1;
    }

    public void setCampoComentariosValidacionCenso1(TextField component) {
        this.campoComentariosValidacionCenso1 = component;
    }

    private HelpInline helpInlineComentariosValidacionCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosValidacionCenso1() {
        return helpInlineComentariosValidacionCenso1;
    }

    public void setHelpInlineComentariosValidacionCenso1(HelpInline hi) {
        this.helpInlineComentariosValidacionCenso1 = hi;
    }

    private StaticText campoComentariosValidacionCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosValidacionCenso1Texto1() {
        return campoComentariosValidacionCenso1Texto1;
    }

    public void setCampoComentariosValidacionCenso1Texto1(StaticText component) {
        this.campoComentariosValidacionCenso1Texto1 = component;
    }

    private LengthValidator validatorComentariosValidacionCenso1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosValidacionCenso1() {
        return validatorComentariosValidacionCenso1;
    }
  
    public void setValidatorComentariosValidacionCenso1(LengthValidator validator) {
        this.validatorComentariosValidacionCenso1 = validator;
    }
  
    private Label labelNumeroCausaInvCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaInvCenso1() {
        return labelNumeroCausaInvCenso1;
    }

    public void setLabelNumeroCausaInvCenso1(Label l) {
        this.labelNumeroCausaInvCenso1 = l;
    }

    private DropDown listaNumeroCausaInvCenso1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaInvCenso1() {
        return listaNumeroCausaInvCenso1;
    }

    public void setListaNumeroCausaInvCenso1(DropDown component) {
        this.listaNumeroCausaInvCenso1 = component;
    }

    private HelpInline helpInlineNumeroCausaInvCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaInvCenso1() {
        return helpInlineNumeroCausaInvCenso1;
    }

    public void setHelpInlineNumeroCausaInvCenso1(HelpInline hi) {
        this.helpInlineNumeroCausaInvCenso1 = hi;
    }

    private StaticText listaNumeroCausaInvCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaInvCenso1Texto1() {
        return listaNumeroCausaInvCenso1Texto1;
    }

    public void setListaNumeroCausaInvCenso1Texto1(StaticText component) {
        this.listaNumeroCausaInvCenso1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaInvCenso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaInvCenso1() {
        return converterNumeroCausaInvCenso1;
    }
  
    public void setConverterNumeroCausaInvCenso1(IntegerConverter converter) {
        this.converterNumeroCausaInvCenso1 = converter;
    }
  
    private Label labelOtraCausaInvCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaInvCenso1() {
        return labelOtraCausaInvCenso1;
    }

    public void setLabelOtraCausaInvCenso1(Label l) {
        this.labelOtraCausaInvCenso1 = l;
    }

    private TextField campoOtraCausaInvCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaInvCenso1() {
        return campoOtraCausaInvCenso1;
    }

    public void setCampoOtraCausaInvCenso1(TextField component) {
        this.campoOtraCausaInvCenso1 = component;
    }

    private HelpInline helpInlineOtraCausaInvCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaInvCenso1() {
        return helpInlineOtraCausaInvCenso1;
    }

    public void setHelpInlineOtraCausaInvCenso1(HelpInline hi) {
        this.helpInlineOtraCausaInvCenso1 = hi;
    }

    private StaticText campoOtraCausaInvCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaInvCenso1Texto1() {
        return campoOtraCausaInvCenso1Texto1;
    }

    public void setCampoOtraCausaInvCenso1Texto1(StaticText component) {
        this.campoOtraCausaInvCenso1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaInvCenso1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaInvCenso1() {
        return validatorOtraCausaInvCenso1;
    }
  
    public void setValidatorOtraCausaInvCenso1(LengthValidator validator) {
        this.validatorOtraCausaInvCenso1 = validator;
    }
  
    private Label labelComentariosReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosReclamoCenso1() {
        return labelComentariosReclamoCenso1;
    }

    public void setLabelComentariosReclamoCenso1(Label l) {
        this.labelComentariosReclamoCenso1 = l;
    }

    private TextField campoComentariosReclamoCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosReclamoCenso1() {
        return campoComentariosReclamoCenso1;
    }

    public void setCampoComentariosReclamoCenso1(TextField component) {
        this.campoComentariosReclamoCenso1 = component;
    }

    private HelpInline helpInlineComentariosReclamoCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosReclamoCenso1() {
        return helpInlineComentariosReclamoCenso1;
    }

    public void setHelpInlineComentariosReclamoCenso1(HelpInline hi) {
        this.helpInlineComentariosReclamoCenso1 = hi;
    }

    private StaticText campoComentariosReclamoCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosReclamoCenso1Texto1() {
        return campoComentariosReclamoCenso1Texto1;
    }

    public void setCampoComentariosReclamoCenso1Texto1(StaticText component) {
        this.campoComentariosReclamoCenso1Texto1 = component;
    }

    private LengthValidator validatorComentariosReclamoCenso1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosReclamoCenso1() {
        return validatorComentariosReclamoCenso1;
    }
  
    public void setValidatorComentariosReclamoCenso1(LengthValidator validator) {
        this.validatorComentariosReclamoCenso1 = validator;
    }
  
    private Label labelComentariosAprReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprReclCen1() {
        return labelComentariosAprReclCen1;
    }

    public void setLabelComentariosAprReclCen1(Label l) {
        this.labelComentariosAprReclCen1 = l;
    }

    private TextField campoComentariosAprReclCen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosAprReclCen1() {
        return campoComentariosAprReclCen1;
    }

    public void setCampoComentariosAprReclCen1(TextField component) {
        this.campoComentariosAprReclCen1 = component;
    }

    private HelpInline helpInlineComentariosAprReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprReclCen1() {
        return helpInlineComentariosAprReclCen1;
    }

    public void setHelpInlineComentariosAprReclCen1(HelpInline hi) {
        this.helpInlineComentariosAprReclCen1 = hi;
    }

    private StaticText campoComentariosAprReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprReclCen1Texto1() {
        return campoComentariosAprReclCen1Texto1;
    }

    public void setCampoComentariosAprReclCen1Texto1(StaticText component) {
        this.campoComentariosAprReclCen1Texto1 = component;
    }

    private LengthValidator validatorComentariosAprReclCen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAprReclCen1() {
        return validatorComentariosAprReclCen1;
    }
  
    public void setValidatorComentariosAprReclCen1(LengthValidator validator) {
        this.validatorComentariosAprReclCen1 = validator;
    }
  
    private Label labelNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenReclCen1() {
        return labelNumeroCausaDenReclCen1;
    }

    public void setLabelNumeroCausaDenReclCen1(Label l) {
        this.labelNumeroCausaDenReclCen1 = l;
    }

    private DropDown listaNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaDenReclCen1() {
        return listaNumeroCausaDenReclCen1;
    }

    public void setListaNumeroCausaDenReclCen1(DropDown component) {
        this.listaNumeroCausaDenReclCen1 = component;
    }

    private HelpInline helpInlineNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenReclCen1() {
        return helpInlineNumeroCausaDenReclCen1;
    }

    public void setHelpInlineNumeroCausaDenReclCen1(HelpInline hi) {
        this.helpInlineNumeroCausaDenReclCen1 = hi;
    }

    private StaticText listaNumeroCausaDenReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenReclCen1Texto1() {
        return listaNumeroCausaDenReclCen1Texto1;
    }

    public void setListaNumeroCausaDenReclCen1Texto1(StaticText component) {
        this.listaNumeroCausaDenReclCen1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaDenReclCen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaDenReclCen1() {
        return converterNumeroCausaDenReclCen1;
    }
  
    public void setConverterNumeroCausaDenReclCen1(IntegerConverter converter) {
        this.converterNumeroCausaDenReclCen1 = converter;
    }
  
    private Label labelOtraCausaDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenReclCen1() {
        return labelOtraCausaDenReclCen1;
    }

    public void setLabelOtraCausaDenReclCen1(Label l) {
        this.labelOtraCausaDenReclCen1 = l;
    }

    private TextField campoOtraCausaDenReclCen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaDenReclCen1() {
        return campoOtraCausaDenReclCen1;
    }

    public void setCampoOtraCausaDenReclCen1(TextField component) {
        this.campoOtraCausaDenReclCen1 = component;
    }

    private HelpInline helpInlineOtraCausaDenReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenReclCen1() {
        return helpInlineOtraCausaDenReclCen1;
    }

    public void setHelpInlineOtraCausaDenReclCen1(HelpInline hi) {
        this.helpInlineOtraCausaDenReclCen1 = hi;
    }

    private StaticText campoOtraCausaDenReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenReclCen1Texto1() {
        return campoOtraCausaDenReclCen1Texto1;
    }

    public void setCampoOtraCausaDenReclCen1Texto1(StaticText component) {
        this.campoOtraCausaDenReclCen1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaDenReclCen1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaDenReclCen1() {
        return validatorOtraCausaDenReclCen1;
    }
  
    public void setValidatorOtraCausaDenReclCen1(LengthValidator validator) {
        this.validatorOtraCausaDenReclCen1 = validator;
    }
  
    private Label labelComentariosDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenReclCen1() {
        return labelComentariosDenReclCen1;
    }

    public void setLabelComentariosDenReclCen1(Label l) {
        this.labelComentariosDenReclCen1 = l;
    }

    private TextField campoComentariosDenReclCen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoComentariosDenReclCen1() {
        return campoComentariosDenReclCen1;
    }

    public void setCampoComentariosDenReclCen1(TextField component) {
        this.campoComentariosDenReclCen1 = component;
    }

    private HelpInline helpInlineComentariosDenReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenReclCen1() {
        return helpInlineComentariosDenReclCen1;
    }

    public void setHelpInlineComentariosDenReclCen1(HelpInline hi) {
        this.helpInlineComentariosDenReclCen1 = hi;
    }

    private StaticText campoComentariosDenReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenReclCen1Texto1() {
        return campoComentariosDenReclCen1Texto1;
    }

    public void setCampoComentariosDenReclCen1Texto1(StaticText component) {
        this.campoComentariosDenReclCen1Texto1 = component;
    }

    private LengthValidator validatorComentariosDenReclCen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDenReclCen1() {
        return validatorComentariosDenReclCen1;
    }
  
    public void setValidatorComentariosDenReclCen1(LengthValidator validator) {
        this.validatorComentariosDenReclCen1 = validator;
    }
  
    private Label labelFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimaVisitaCenso1() {
        return labelFechaUltimaVisitaCenso1;
    }

    public void setLabelFechaUltimaVisitaCenso1(Label l) {
        this.labelFechaUltimaVisitaCenso1 = l;
    }

    private Calendar campoFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimaVisitaCenso1() {
        return campoFechaUltimaVisitaCenso1;
    }

    public void setCampoFechaUltimaVisitaCenso1(Calendar component) {
        this.campoFechaUltimaVisitaCenso1 = component;
    }

    private HelpInline helpInlineFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimaVisitaCenso1() {
        return helpInlineFechaUltimaVisitaCenso1;
    }

    public void setHelpInlineFechaUltimaVisitaCenso1(HelpInline hi) {
        this.helpInlineFechaUltimaVisitaCenso1 = hi;
    }

    private StaticText campoFechaUltimaVisitaCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimaVisitaCenso1Texto1() {
        return campoFechaUltimaVisitaCenso1Texto1;
    }

    public void setCampoFechaUltimaVisitaCenso1Texto1(StaticText component) {
        this.campoFechaUltimaVisitaCenso1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaUltimaVisitaCenso1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaUltimaVisitaCenso1() {
        return converterFechaUltimaVisitaCenso1;
    }
  
    public void setConverterFechaUltimaVisitaCenso1(SqlTimestampConverter converter) {
        this.converterFechaUltimaVisitaCenso1 = converter;
    }
  
    private Label labelIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen1() {
        return labelIdFuncionarioUltVisitaCen1;
    }

    public void setLabelIdFuncionarioUltVisitaCen1(Label l) {
        this.labelIdFuncionarioUltVisitaCen1 = l;
    }

    private TextField campoIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioUltVisitaCen1() {
        return campoIdFuncionarioUltVisitaCen1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1(TextField component) {
        this.campoIdFuncionarioUltVisitaCen1 = component;
    }

    private HelpInline helpInlineIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioUltVisitaCen1() {
        return helpInlineIdFuncionarioUltVisitaCen1;
    }

    public void setHelpInlineIdFuncionarioUltVisitaCen1(HelpInline hi) {
        this.helpInlineIdFuncionarioUltVisitaCen1 = hi;
    }

    private StaticText campoIdFuncionarioUltVisitaCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioUltVisitaCen1Texto1() {
        return campoIdFuncionarioUltVisitaCen1Texto1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Texto1(StaticText component) {
        this.campoIdFuncionarioUltVisitaCen1Texto1 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioUltVisitaCen1Boton1() {
        return campoIdFuncionarioUltVisitaCen1Boton1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Boton1(Button component) {
        this.campoIdFuncionarioUltVisitaCen1Boton1 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioUltVisitaCen1Boton3() {
        return campoIdFuncionarioUltVisitaCen1Boton3;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Boton3(Button component) {
        this.campoIdFuncionarioUltVisitaCen1Boton3 = component;
    }

    private Label labelIdFuncionarioUltVisitaCen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen2() {
        return labelIdFuncionarioUltVisitaCen2;
    }

    public void setLabelIdFuncionarioUltVisitaCen2(Label l) {
        this.labelIdFuncionarioUltVisitaCen2 = l;
    }

    private StaticText campoIdFuncionarioUltVisitaCen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioUltVisitaCen1Texto2() {
        return campoIdFuncionarioUltVisitaCen1Texto2;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Texto2(StaticText component) {
        this.campoIdFuncionarioUltVisitaCen1Texto2 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioUltVisitaCen1Boton2() {
        return campoIdFuncionarioUltVisitaCen1Boton2;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Boton2(Button component) {
        this.campoIdFuncionarioUltVisitaCen1Boton2 = component;
    }

    private Label labelObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacionesUltVisitaCen1() {
        return labelObservacionesUltVisitaCen1;
    }

    public void setLabelObservacionesUltVisitaCen1(Label l) {
        this.labelObservacionesUltVisitaCen1 = l;
    }

    private TextField campoObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoObservacionesUltVisitaCen1() {
        return campoObservacionesUltVisitaCen1;
    }

    public void setCampoObservacionesUltVisitaCen1(TextField component) {
        this.campoObservacionesUltVisitaCen1 = component;
    }

    private HelpInline helpInlineObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservacionesUltVisitaCen1() {
        return helpInlineObservacionesUltVisitaCen1;
    }

    public void setHelpInlineObservacionesUltVisitaCen1(HelpInline hi) {
        this.helpInlineObservacionesUltVisitaCen1 = hi;
    }

    private StaticText campoObservacionesUltVisitaCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacionesUltVisitaCen1Texto1() {
        return campoObservacionesUltVisitaCen1Texto1;
    }

    public void setCampoObservacionesUltVisitaCen1Texto1(StaticText component) {
        this.campoObservacionesUltVisitaCen1Texto1 = component;
    }

    private LengthValidator validatorObservacionesUltVisitaCen1 = new LengthValidator();
  
    public LengthValidator getValidatorObservacionesUltVisitaCen1() {
        return validatorObservacionesUltVisitaCen1;
    }
  
    public void setValidatorObservacionesUltVisitaCen1(LengthValidator validator) {
        this.validatorObservacionesUltVisitaCen1 = validator;
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
  
    private Label labelIndiceCalidadVidaDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVidaDesde1() {
        return labelIndiceCalidadVidaDesde1;
    }

    public void setLabelIndiceCalidadVidaDesde1(Label l) {
        this.labelIndiceCalidadVidaDesde1 = l;
    }

    private TextField campoIndiceCalidadVidaDesde1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIndiceCalidadVidaDesde1() {
        return campoIndiceCalidadVidaDesde1;
    }

    public void setCampoIndiceCalidadVidaDesde1(TextField component) {
        this.campoIndiceCalidadVidaDesde1 = component;
    }

    private HelpInline helpInlineIndiceCalidadVidaDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVidaDesde1() {
        return helpInlineIndiceCalidadVidaDesde1;
    }

    public void setHelpInlineIndiceCalidadVidaDesde1(HelpInline hi) {
        this.helpInlineIndiceCalidadVidaDesde1 = hi;
    }

    private StaticText campoIndiceCalidadVidaDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVidaDesde1Texto1() {
        return campoIndiceCalidadVidaDesde1Texto1;
    }

    public void setCampoIndiceCalidadVidaDesde1Texto1(StaticText component) {
        this.campoIndiceCalidadVidaDesde1Texto1 = component;
    }

    private NumberConverter converterIndiceCalidadVidaDesde1 = new NumberConverter();
  
    public NumberConverter getConverterIndiceCalidadVidaDesde1() {
        return converterIndiceCalidadVidaDesde1;
    }
  
    public void setConverterIndiceCalidadVidaDesde1(NumberConverter converter) {
        this.converterIndiceCalidadVidaDesde1 = converter;
    }
  
    private DoubleRangeValidator validatorIndiceCalidadVidaDesde1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorIndiceCalidadVidaDesde1() {
        return validatorIndiceCalidadVidaDesde1;
    }
  
    public void setValidatorIndiceCalidadVidaDesde1(DoubleRangeValidator validator) {
        this.validatorIndiceCalidadVidaDesde1 = validator;
    }
  
    private Label labelIndiceCalidadVidaHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVidaHasta1() {
        return labelIndiceCalidadVidaHasta1;
    }

    public void setLabelIndiceCalidadVidaHasta1(Label l) {
        this.labelIndiceCalidadVidaHasta1 = l;
    }

    private TextField campoIndiceCalidadVidaHasta1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIndiceCalidadVidaHasta1() {
        return campoIndiceCalidadVidaHasta1;
    }

    public void setCampoIndiceCalidadVidaHasta1(TextField component) {
        this.campoIndiceCalidadVidaHasta1 = component;
    }

    private HelpInline helpInlineIndiceCalidadVidaHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVidaHasta1() {
        return helpInlineIndiceCalidadVidaHasta1;
    }

    public void setHelpInlineIndiceCalidadVidaHasta1(HelpInline hi) {
        this.helpInlineIndiceCalidadVidaHasta1 = hi;
    }

    private StaticText campoIndiceCalidadVidaHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVidaHasta1Texto1() {
        return campoIndiceCalidadVidaHasta1Texto1;
    }

    public void setCampoIndiceCalidadVidaHasta1Texto1(StaticText component) {
        this.campoIndiceCalidadVidaHasta1Texto1 = component;
    }

    private NumberConverter converterIndiceCalidadVidaHasta1 = new NumberConverter();
  
    public NumberConverter getConverterIndiceCalidadVidaHasta1() {
        return converterIndiceCalidadVidaHasta1;
    }
  
    public void setConverterIndiceCalidadVidaHasta1(NumberConverter converter) {
        this.converterIndiceCalidadVidaHasta1 = converter;
    }
  
    private DoubleRangeValidator validatorIndiceCalidadVidaHasta1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorIndiceCalidadVidaHasta1() {
        return validatorIndiceCalidadVidaHasta1;
    }
  
    public void setValidatorIndiceCalidadVidaHasta1(DoubleRangeValidator validator) {
        this.validatorIndiceCalidadVidaHasta1 = validator;
    }
  
    private Label labelFechaValidacionCensoDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaValidacionCensoDesde1() {
        return labelFechaValidacionCensoDesde1;
    }

    public void setLabelFechaValidacionCensoDesde1(Label l) {
        this.labelFechaValidacionCensoDesde1 = l;
    }

    private Calendar campoFechaValidacionCensoDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaValidacionCensoDesde1() {
        return campoFechaValidacionCensoDesde1;
    }

    public void setCampoFechaValidacionCensoDesde1(Calendar component) {
        this.campoFechaValidacionCensoDesde1 = component;
    }

    private HelpInline helpInlineFechaValidacionCensoDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaValidacionCensoDesde1() {
        return helpInlineFechaValidacionCensoDesde1;
    }

    public void setHelpInlineFechaValidacionCensoDesde1(HelpInline hi) {
        this.helpInlineFechaValidacionCensoDesde1 = hi;
    }

    private StaticText campoFechaValidacionCensoDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaValidacionCensoDesde1Texto1() {
        return campoFechaValidacionCensoDesde1Texto1;
    }

    public void setCampoFechaValidacionCensoDesde1Texto1(StaticText component) {
        this.campoFechaValidacionCensoDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaValidacionCensoDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaValidacionCensoDesde1() {
        return converterFechaValidacionCensoDesde1;
    }
  
    public void setConverterFechaValidacionCensoDesde1(SqlTimestampConverter converter) {
        this.converterFechaValidacionCensoDesde1 = converter;
    }
  
    private Label labelFechaValidacionCensoHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaValidacionCensoHasta1() {
        return labelFechaValidacionCensoHasta1;
    }

    public void setLabelFechaValidacionCensoHasta1(Label l) {
        this.labelFechaValidacionCensoHasta1 = l;
    }

    private Calendar campoFechaValidacionCensoHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaValidacionCensoHasta1() {
        return campoFechaValidacionCensoHasta1;
    }

    public void setCampoFechaValidacionCensoHasta1(Calendar component) {
        this.campoFechaValidacionCensoHasta1 = component;
    }

    private HelpInline helpInlineFechaValidacionCensoHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaValidacionCensoHasta1() {
        return helpInlineFechaValidacionCensoHasta1;
    }

    public void setHelpInlineFechaValidacionCensoHasta1(HelpInline hi) {
        this.helpInlineFechaValidacionCensoHasta1 = hi;
    }

    private StaticText campoFechaValidacionCensoHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaValidacionCensoHasta1Texto1() {
        return campoFechaValidacionCensoHasta1Texto1;
    }

    public void setCampoFechaValidacionCensoHasta1Texto1(StaticText component) {
        this.campoFechaValidacionCensoHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaValidacionCensoHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaValidacionCensoHasta1() {
        return converterFechaValidacionCensoHasta1;
    }
  
    public void setConverterFechaValidacionCensoHasta1(SqlTimestampConverter converter) {
        this.converterFechaValidacionCensoHasta1 = converter;
    }
  
    private Label labelNumeroCondicionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionCenso1() {
        return labelNumeroCondicionCenso1;
    }

    public void setLabelNumeroCondicionCenso1(Label l) {
        this.labelNumeroCondicionCenso1 = l;
    }

    private DropDown listaNumeroCondicionCenso1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCondicionCenso1() {
        return listaNumeroCondicionCenso1;
    }

    public void setListaNumeroCondicionCenso1(DropDown component) {
        this.listaNumeroCondicionCenso1 = component;
    }

    private HelpInline helpInlineNumeroCondicionCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionCenso1() {
        return helpInlineNumeroCondicionCenso1;
    }

    public void setHelpInlineNumeroCondicionCenso1(HelpInline hi) {
        this.helpInlineNumeroCondicionCenso1 = hi;
    }

    private StaticText listaNumeroCondicionCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionCenso1Texto1() {
        return listaNumeroCondicionCenso1Texto1;
    }

    public void setListaNumeroCondicionCenso1Texto1(StaticText component) {
        this.listaNumeroCondicionCenso1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionCenso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionCenso1() {
        return converterNumeroCondicionCenso1;
    }
  
    public void setConverterNumeroCondicionCenso1(IntegerConverter converter) {
        this.converterNumeroCondicionCenso1 = converter;
    }
  
    private Label labelNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRegPotBen1() {
        return labelNumeroTipoRegPotBen1;
    }

    public void setLabelNumeroTipoRegPotBen1(Label l) {
        this.labelNumeroTipoRegPotBen1 = l;
    }

    private DropDown listaNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoRegPotBen1() {
        return listaNumeroTipoRegPotBen1;
    }

    public void setListaNumeroTipoRegPotBen1(DropDown component) {
        this.listaNumeroTipoRegPotBen1 = component;
    }

    private HelpInline helpInlineNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoRegPotBen1() {
        return helpInlineNumeroTipoRegPotBen1;
    }

    public void setHelpInlineNumeroTipoRegPotBen1(HelpInline hi) {
        this.helpInlineNumeroTipoRegPotBen1 = hi;
    }

    private StaticText listaNumeroTipoRegPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRegPotBen1Texto1() {
        return listaNumeroTipoRegPotBen1Texto1;
    }

    public void setListaNumeroTipoRegPotBen1Texto1(StaticText component) {
        this.listaNumeroTipoRegPotBen1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoRegPotBen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoRegPotBen1() {
        return converterNumeroTipoRegPotBen1;
    }
  
    public void setConverterNumeroTipoRegPotBen1(IntegerConverter converter) {
        this.converterNumeroTipoRegPotBen1 = converter;
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
    public PotencialBen4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("PotencialBen4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = PotencialBenConstants.FUNCION_DESACTIVAR_POTENCIAL_BEN;

    static long FUNCION_ACCION_2 = PotencialBenConstants.FUNCION_REACTIVAR_POTENCIAL_BEN;

    static long FUNCION_ACCION_3 = PotencialBenConstants.FUNCION_VINCULAR_POTENCIAL_BEN;

    static long FUNCION_ACCION_4 = PotencialBenConstants.FUNCION_VALIDAR_CENSO_POTENCIAL_BEN;

    static long FUNCION_ACCION_5 = PotencialBenConstants.FUNCION_INVALIDAR_CENSO_POTENCIAL_BEN;

    static long FUNCION_ACCION_6 = PotencialBenConstants.FUNCION_REG_RECL_CEN_POTENCIAL_BEN;

    static long FUNCION_ACCION_7 = PotencialBenConstants.FUNCION_APROBAR_RECL_CEN_POTENCIAL_BEN;

    static long FUNCION_ACCION_8 = PotencialBenConstants.FUNCION_DENEGAR_RECL_CEN_POTENCIAL_BEN;

    static long FUNCION_ACCION_9 = PotencialBenConstants.FUNCION_ACREDITAR_POTENCIAL_BEN;

    static long FUNCION_ACCION_10 = PotencialBenConstants.FUNCION_REG_ULT_VIS_CEN_POTENCIAL_BEN;

    static long FUNCION_ACCION_11 = PotencialBenConstants.FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN;

    static long FUNCION_ACCION_12 = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR;

    static long FUNCION_ACCION_13 = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR;

    static long FUNCION_ACCION_14 = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION;

    static long FUNCION_ACCION_15 = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV;

    static long FUNCION_ACCION_16 = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, Bundle.getString("desactivar")),
            new Option(FUNCION_ACCION_2, Bundle.getString("reactivar")),
            new Option(FUNCION_ACCION_3, Bundle.getString("vincular")),
            new Option(FUNCION_ACCION_4, Bundle.getString("validar censo")),
            new Option(FUNCION_ACCION_5, Bundle.getString("invalidar censo")),
            new Option(FUNCION_ACCION_6, Bundle.getString("reg recl cen")),
            new Option(FUNCION_ACCION_7, Bundle.getString("aprobar recl cen")),
            new Option(FUNCION_ACCION_8, Bundle.getString("denegar recl cen")),
            new Option(FUNCION_ACCION_9, Bundle.getString("acreditar")),
            new Option(FUNCION_ACCION_10, Bundle.getString("reg ult vis cen")),
            new Option(FUNCION_ACCION_11, Bundle.getString("emitir constancia registro")),
            new Option(FUNCION_ACCION_12, Bundle.getString("emitir por censar")),
            new Option(FUNCION_ACCION_13, Bundle.getString("emitir por validar")),
            new Option(FUNCION_ACCION_14, Bundle.getString("emitir por resultado validacion")),
            new Option(FUNCION_ACCION_15, Bundle.getString("emitir por icv")),
            new Option(FUNCION_ACCION_16, Bundle.getString("emitir acreditado"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdPotencialBenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_7 || f == FUNCION_ACCION_8 || f == FUNCION_ACCION_9 || f == FUNCION_ACCION_10 || f == FUNCION_ACCION_11;
    }

    private Bit bitIdPotencialBenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdPotencialBenRendered();
        }
    };

    public Bit getBitIdPotencialBenRendered() {
        return bitIdPotencialBenRendered;
    }

    public boolean isIdPersonaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_3;
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

    public boolean isIdFuncionarioValidacionCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_14;
    }

    private Bit bitIdFuncionarioValidacionCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdFuncionarioValidacionCenRendered();
        }
    };

    public Bit getBitIdFuncionarioValidacionCenRendered() {
        return bitIdFuncionarioValidacionCenRendered;
    }

    public boolean isComentariosValidacionCensoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5;
    }

    private Bit bitComentariosValidacionCensoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosValidacionCensoRendered();
        }
    };

    public Bit getBitComentariosValidacionCensoRendered() {
        return bitComentariosValidacionCensoRendered;
    }

    public boolean isNumeroCausaInvCensoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5;
    }

    private Bit bitNumeroCausaInvCensoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroCausaInvCensoRendered();
        }
    };

    public Bit getBitNumeroCausaInvCensoRendered() {
        return bitNumeroCausaInvCensoRendered;
    }

    public boolean isOtraCausaInvCensoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_5;
    }

    private Bit bitOtraCausaInvCensoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isOtraCausaInvCensoRendered();
        }
    };

    public Bit getBitOtraCausaInvCensoRendered() {
        return bitOtraCausaInvCensoRendered;
    }

    public boolean isComentariosReclamoCensoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_6;
    }

    private Bit bitComentariosReclamoCensoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosReclamoCensoRendered();
        }
    };

    public Bit getBitComentariosReclamoCensoRendered() {
        return bitComentariosReclamoCensoRendered;
    }

    public boolean isComentariosAprReclCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_7;
    }

    private Bit bitComentariosAprReclCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosAprReclCenRendered();
        }
    };

    public Bit getBitComentariosAprReclCenRendered() {
        return bitComentariosAprReclCenRendered;
    }

    public boolean isNumeroCausaDenReclCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8;
    }

    private Bit bitNumeroCausaDenReclCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroCausaDenReclCenRendered();
        }
    };

    public Bit getBitNumeroCausaDenReclCenRendered() {
        return bitNumeroCausaDenReclCenRendered;
    }

    public boolean isOtraCausaDenReclCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8;
    }

    private Bit bitOtraCausaDenReclCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isOtraCausaDenReclCenRendered();
        }
    };

    public Bit getBitOtraCausaDenReclCenRendered() {
        return bitOtraCausaDenReclCenRendered;
    }

    public boolean isComentariosDenReclCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_8;
    }

    private Bit bitComentariosDenReclCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isComentariosDenReclCenRendered();
        }
    };

    public Bit getBitComentariosDenReclCenRendered() {
        return bitComentariosDenReclCenRendered;
    }

    public boolean isFechaUltimaVisitaCensoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_10;
    }

    private Bit bitFechaUltimaVisitaCensoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaUltimaVisitaCensoRendered();
        }
    };

    public Bit getBitFechaUltimaVisitaCensoRendered() {
        return bitFechaUltimaVisitaCensoRendered;
    }

    public boolean isIdFuncionarioUltVisitaCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_10;
    }

    private Bit bitIdFuncionarioUltVisitaCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdFuncionarioUltVisitaCenRendered();
        }
    };

    public Bit getBitIdFuncionarioUltVisitaCenRendered() {
        return bitIdFuncionarioUltVisitaCenRendered;
    }

    public boolean isObservacionesUltVisitaCenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_10;
    }

    private Bit bitObservacionesUltVisitaCenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isObservacionesUltVisitaCenRendered();
        }
    };

    public Bit getBitObservacionesUltVisitaCenRendered() {
        return bitObservacionesUltVisitaCenRendered;
    }

    public boolean isIdDepartamentoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16;
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
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16;
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
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16;
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

    public boolean isFechaRegistroPotBenDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16;
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
        return f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16;
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

    public boolean isIndiceCalidadVidaDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15;
    }

    private Bit bitIndiceCalidadVidaDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIndiceCalidadVidaDesdeRendered();
        }
    };

    public Bit getBitIndiceCalidadVidaDesdeRendered() {
        return bitIndiceCalidadVidaDesdeRendered;
    }

    public boolean isIndiceCalidadVidaHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15;
    }

    private Bit bitIndiceCalidadVidaHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIndiceCalidadVidaHastaRendered();
        }
    };

    public Bit getBitIndiceCalidadVidaHastaRendered() {
        return bitIndiceCalidadVidaHastaRendered;
    }

    public boolean isFechaValidacionCensoDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_14;
    }

    private Bit bitFechaValidacionCensoDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaValidacionCensoDesdeRendered();
        }
    };

    public Bit getBitFechaValidacionCensoDesdeRendered() {
        return bitFechaValidacionCensoDesdeRendered;
    }

    public boolean isFechaValidacionCensoHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_14;
    }

    private Bit bitFechaValidacionCensoHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaValidacionCensoHastaRendered();
        }
    };

    public Bit getBitFechaValidacionCensoHastaRendered() {
        return bitFechaValidacionCensoHastaRendered;
    }

    public boolean isNumeroCondicionCensoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15;
    }

    private Bit bitNumeroCondicionCensoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroCondicionCensoRendered();
        }
    };

    public Bit getBitNumeroCondicionCensoRendered() {
        return bitNumeroCondicionCensoRendered;
    }

    public boolean isNumeroTipoRegPotBenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_16;
    }

    private Bit bitNumeroTipoRegPotBenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNumeroTipoRegPotBenRendered();
        }
    };

    public Bit getBitNumeroTipoRegPotBenRendered() {
        return bitNumeroTipoRegPotBenRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private PotencialBenFacadeLocal potencialBenFacade;

    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private FuncionarioFacadeLocal funcionarioFacade;

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
        this.initPotencialBenIdPotencialBen();
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
    private String textoCampoComentariosValidacionCenso1;

    public String getTextoCampoComentariosValidacionCenso1() {
        return this.textoCampoComentariosValidacionCenso1;
    }

    public void setTextoCampoComentariosValidacionCenso1(String valor) {
        this.textoCampoComentariosValidacionCenso1 = valor;
    }

    private String textoCampoOtraCausaInvCenso1;

    public String getTextoCampoOtraCausaInvCenso1() {
        return this.textoCampoOtraCausaInvCenso1;
    }

    public void setTextoCampoOtraCausaInvCenso1(String valor) {
        this.textoCampoOtraCausaInvCenso1 = valor;
    }

    private String textoCampoComentariosReclamoCenso1;

    public String getTextoCampoComentariosReclamoCenso1() {
        return this.textoCampoComentariosReclamoCenso1;
    }

    public void setTextoCampoComentariosReclamoCenso1(String valor) {
        this.textoCampoComentariosReclamoCenso1 = valor;
    }

    private String textoCampoComentariosAprReclCen1;

    public String getTextoCampoComentariosAprReclCen1() {
        return this.textoCampoComentariosAprReclCen1;
    }

    public void setTextoCampoComentariosAprReclCen1(String valor) {
        this.textoCampoComentariosAprReclCen1 = valor;
    }

    private String textoCampoOtraCausaDenReclCen1;

    public String getTextoCampoOtraCausaDenReclCen1() {
        return this.textoCampoOtraCausaDenReclCen1;
    }

    public void setTextoCampoOtraCausaDenReclCen1(String valor) {
        this.textoCampoOtraCausaDenReclCen1 = valor;
    }

    private String textoCampoComentariosDenReclCen1;

    public String getTextoCampoComentariosDenReclCen1() {
        return this.textoCampoComentariosDenReclCen1;
    }

    public void setTextoCampoComentariosDenReclCen1(String valor) {
        this.textoCampoComentariosDenReclCen1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaUltimaVisitaCenso1;

    public java.sql.Timestamp getValorCampoFechaUltimaVisitaCenso1() {
        return this.valorCampoFechaUltimaVisitaCenso1;
    }

    public void setValorCampoFechaUltimaVisitaCenso1(java.sql.Timestamp valor) {
        this.valorCampoFechaUltimaVisitaCenso1 = valor;
    }

    private String textoCampoObservacionesUltVisitaCen1;

    public String getTextoCampoObservacionesUltVisitaCen1() {
        return this.textoCampoObservacionesUltVisitaCen1;
    }

    public void setTextoCampoObservacionesUltVisitaCen1(String valor) {
        this.textoCampoObservacionesUltVisitaCen1 = valor;
    }

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

    private String textoCampoIndiceCalidadVidaDesde1;

    public String getTextoCampoIndiceCalidadVidaDesde1() {
        return this.textoCampoIndiceCalidadVidaDesde1;
    }

    public void setTextoCampoIndiceCalidadVidaDesde1(String valor) {
        this.textoCampoIndiceCalidadVidaDesde1 = valor;
    }

    private String textoCampoIndiceCalidadVidaHasta1;

    public String getTextoCampoIndiceCalidadVidaHasta1() {
        return this.textoCampoIndiceCalidadVidaHasta1;
    }

    public void setTextoCampoIndiceCalidadVidaHasta1(String valor) {
        this.textoCampoIndiceCalidadVidaHasta1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaValidacionCensoDesde1;

    public java.sql.Timestamp getValorCampoFechaValidacionCensoDesde1() {
        return this.valorCampoFechaValidacionCensoDesde1;
    }

    public void setValorCampoFechaValidacionCensoDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaValidacionCensoDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaValidacionCensoHasta1;

    public java.sql.Timestamp getValorCampoFechaValidacionCensoHasta1() {
        return this.valorCampoFechaValidacionCensoHasta1;
    }

    public void setValorCampoFechaValidacionCensoHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaValidacionCensoHasta1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPotencialBen">
    private PotencialBen potencialBenIdPotencialBen;

    private FiltroBusqueda getFiltroBusquedaIdPotencialBen() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public PotencialBen getPotencialBenIdPotencialBen() {
        return this.potencialBenIdPotencialBen;
    }

    private void initPotencialBenIdPotencialBen() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.potencialBenIdPotencialBen = id == null ? null : this.potencialBenFacade.find(id, true);
    }

    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.potencialBenIdPotencialBen = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = PotencialBenConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdPotencialBen();
                String query = "select * from potencial_ben ";
                List<PotencialBen> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.potencialBenIdPotencialBen = this.potencialBenFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(PotencialBenConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.potencialBenFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.potencialBenIdPotencialBen = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.potencialBenIdPotencialBen = this.potencialBenFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(PotencialBenConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.potencialBenFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.potencialBenIdPotencialBen = lista.get(0);
                        }
                    }
                }
                if (this.potencialBenIdPotencialBen == null) {
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

    private String textoCampoIdPotencialBen1;

    public String getTextoCampoIdPotencialBen1() {
        return this.textoCampoIdPotencialBen1 != null ? this.textoCampoIdPotencialBen1
                : this.potencialBenIdPotencialBen != null ? this.potencialBenIdPotencialBen.getCodigoPotencialBen()
                : null;
    }

    public void setTextoCampoIdPotencialBen1(String valor) {
        this.textoCampoIdPotencialBen1 = valor;
    }

    public String getToolTipCampoIdPotencialBen1() {
        return this.potencialBenIdPotencialBen == null ? null : STP.trimToStringRecursoSinNombre(this.potencialBenIdPotencialBen.getNombrePotencialBen());
    }

    public String getScriptCampoIdPotencialBen1Boton1() {
        long funcion = PotencialBenConstants.FUNCION_CONSULTAR_POTENCIAL_BEN;
        String campo = this.getCampoIdPotencialBen1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_POTENCIAL_BEN;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdPotencialBen());
    }

    public String getScriptCampoIdPotencialBen1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_POTENCIAL_BEN;
        Long id = this.potencialBenIdPotencialBen == null ? null : this.potencialBenIdPotencialBen.getIdPotencialBen();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdPotencialBen1Boton2Rendered() {
        return this.isIdPotencialBenRendered();
    }

    private Bit bitCampoIdPotencialBen1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdPotencialBen1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdPotencialBen1Boton2Rendered() {
        return bitCampoIdPotencialBen1Boton2Rendered;
    }

    private boolean isCampoIdPotencialBen1Boton3Rendered() {
        return !this.isCampoIdPotencialBen1Boton2Rendered();
    }

    private Bit bitCampoIdPotencialBen1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdPotencialBen1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdPotencialBen1Boton3Rendered() {
        return bitCampoIdPotencialBen1Boton3Rendered;
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioValidacionCen">
    private Funcionario funcionarioIdFuncionarioValidacionCen;

    private FiltroBusqueda getFiltroBusquedaIdFuncionarioValidacionCen() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public Funcionario getFuncionarioIdFuncionarioValidacionCen() {
        return this.funcionarioIdFuncionarioValidacionCen;
    }

    public void campoIdFuncionarioValidacionCen1_validate(FacesContext context, UIComponent component, Object value) {
        this.funcionarioIdFuncionarioValidacionCen = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = FuncionarioConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdFuncionarioValidacionCen();
                String query = "select * from funcionario ";
                List<Funcionario> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.funcionarioIdFuncionarioValidacionCen = this.funcionarioFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(FuncionarioConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.funcionarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.funcionarioIdFuncionarioValidacionCen = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.funcionarioIdFuncionarioValidacionCen = this.funcionarioFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(FuncionarioConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.funcionarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.funcionarioIdFuncionarioValidacionCen = lista.get(0);
                        }
                    }
                }
                if (this.funcionarioIdFuncionarioValidacionCen == null) {
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

    private String textoCampoIdFuncionarioValidacionCen1;

    public String getTextoCampoIdFuncionarioValidacionCen1() {
        return this.textoCampoIdFuncionarioValidacionCen1 != null ? this.textoCampoIdFuncionarioValidacionCen1
                : this.funcionarioIdFuncionarioValidacionCen != null ? this.funcionarioIdFuncionarioValidacionCen.getCodigoFuncionario()
                : null;
    }

    public void setTextoCampoIdFuncionarioValidacionCen1(String valor) {
        this.textoCampoIdFuncionarioValidacionCen1 = valor;
    }

    public String getToolTipCampoIdFuncionarioValidacionCen1() {
        return this.funcionarioIdFuncionarioValidacionCen == null ? null : STP.trimToStringRecursoSinNombre(this.funcionarioIdFuncionarioValidacionCen.getNombreFuncionario());
    }

    public String getScriptCampoIdFuncionarioValidacionCen1Boton1() {
        long funcion = FuncionarioConstants.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = this.getCampoIdFuncionarioValidacionCen1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdFuncionarioValidacionCen());
    }

    public String getScriptCampoIdFuncionarioValidacionCen1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = this.funcionarioIdFuncionarioValidacionCen == null ? null : this.funcionarioIdFuncionarioValidacionCen.getIdFuncionario();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdFuncionarioValidacionCen1Boton2Rendered() {
        return this.isIdFuncionarioValidacionCenRendered();
    }

    private Bit bitCampoIdFuncionarioValidacionCen1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFuncionarioValidacionCen1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdFuncionarioValidacionCen1Boton2Rendered() {
        return bitCampoIdFuncionarioValidacionCen1Boton2Rendered;
    }

    private boolean isCampoIdFuncionarioValidacionCen1Boton3Rendered() {
        return !this.isCampoIdFuncionarioValidacionCen1Boton2Rendered();
    }

    private Bit bitCampoIdFuncionarioValidacionCen1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFuncionarioValidacionCen1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdFuncionarioValidacionCen1Boton3Rendered() {
        return bitCampoIdFuncionarioValidacionCen1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFuncionarioUltVisitaCen">
    private Funcionario funcionarioIdFuncionarioUltVisitaCen;

    private FiltroBusqueda getFiltroBusquedaIdFuncionarioUltVisitaCen() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public Funcionario getFuncionarioIdFuncionarioUltVisitaCen() {
        return this.funcionarioIdFuncionarioUltVisitaCen;
    }

    public void campoIdFuncionarioUltVisitaCen1_validate(FacesContext context, UIComponent component, Object value) {
        this.funcionarioIdFuncionarioUltVisitaCen = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = FuncionarioConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdFuncionarioUltVisitaCen();
                String query = "select * from funcionario ";
                List<Funcionario> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.funcionarioIdFuncionarioUltVisitaCen = this.funcionarioFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(FuncionarioConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.funcionarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.funcionarioIdFuncionarioUltVisitaCen = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.funcionarioIdFuncionarioUltVisitaCen = this.funcionarioFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(FuncionarioConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.funcionarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.funcionarioIdFuncionarioUltVisitaCen = lista.get(0);
                        }
                    }
                }
                if (this.funcionarioIdFuncionarioUltVisitaCen == null) {
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

    private String textoCampoIdFuncionarioUltVisitaCen1;

    public String getTextoCampoIdFuncionarioUltVisitaCen1() {
        return this.textoCampoIdFuncionarioUltVisitaCen1 != null ? this.textoCampoIdFuncionarioUltVisitaCen1
                : this.funcionarioIdFuncionarioUltVisitaCen != null ? this.funcionarioIdFuncionarioUltVisitaCen.getCodigoFuncionario()
                : null;
    }

    public void setTextoCampoIdFuncionarioUltVisitaCen1(String valor) {
        this.textoCampoIdFuncionarioUltVisitaCen1 = valor;
    }

    public String getToolTipCampoIdFuncionarioUltVisitaCen1() {
        return this.funcionarioIdFuncionarioUltVisitaCen == null ? null : STP.trimToStringRecursoSinNombre(this.funcionarioIdFuncionarioUltVisitaCen.getNombreFuncionario());
    }

    public String getScriptCampoIdFuncionarioUltVisitaCen1Boton1() {
        long funcion = FuncionarioConstants.FUNCION_CONSULTAR_FUNCIONARIO;
        String campo = this.getCampoIdFuncionarioUltVisitaCen1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FUNCIONARIO;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdFuncionarioUltVisitaCen());
    }

    public String getScriptCampoIdFuncionarioUltVisitaCen1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_FUNCIONARIO;
        Long id = this.funcionarioIdFuncionarioUltVisitaCen == null ? null : this.funcionarioIdFuncionarioUltVisitaCen.getIdFuncionario();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdFuncionarioUltVisitaCen1Boton2Rendered() {
        return this.isIdFuncionarioUltVisitaCenRendered();
    }

    private Bit bitCampoIdFuncionarioUltVisitaCen1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFuncionarioUltVisitaCen1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdFuncionarioUltVisitaCen1Boton2Rendered() {
        return bitCampoIdFuncionarioUltVisitaCen1Boton2Rendered;
    }

    private boolean isCampoIdFuncionarioUltVisitaCen1Boton3Rendered() {
        return !this.isCampoIdFuncionarioUltVisitaCen1Boton2Rendered();
    }

    private Bit bitCampoIdFuncionarioUltVisitaCen1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFuncionarioUltVisitaCen1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdFuncionarioUltVisitaCen1Boton3Rendered() {
        return bitCampoIdFuncionarioUltVisitaCen1Boton3Rendered;
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
    public Object getOpcionesListaNumeroCausaInvCenso1() {
        return JSF.getListaOpciones(EnumCausaInvCenso.values(), true, false);
    }

    private Integer valorListaNumeroCausaInvCenso1;

    public Integer getValorListaNumeroCausaInvCenso1() {
        return this.valorListaNumeroCausaInvCenso1;
    }

    public void setValorListaNumeroCausaInvCenso1(Integer valor) {
        this.valorListaNumeroCausaInvCenso1 = valor;
    }

    public Object getOpcionesListaNumeroCausaDenReclCen1() {
        return JSF.getListaOpciones(EnumCausaDenReclCen.values(), true, false);
    }

    private Integer valorListaNumeroCausaDenReclCen1;

    public Integer getValorListaNumeroCausaDenReclCen1() {
        return this.valorListaNumeroCausaDenReclCen1;
    }

    public void setValorListaNumeroCausaDenReclCen1(Integer valor) {
        this.valorListaNumeroCausaDenReclCen1 = valor;
    }

    public Object getOpcionesListaNumeroCondicionCenso1() {
        return JSF.getListaOpciones(EnumCondicionCenso.values(), true, false);
    }

    private Integer valorListaNumeroCondicionCenso1;

    public Integer getValorListaNumeroCondicionCenso1() {
        return this.valorListaNumeroCondicionCenso1;
    }

    public void setValorListaNumeroCondicionCenso1(Integer valor) {
        this.valorListaNumeroCondicionCenso1 = valor;
    }

    public Object getOpcionesListaNumeroTipoRegPotBen1() {
        return JSF.getListaOpciones(EnumTipoRegPotBen.values(), true, false);
    }

    private Integer valorListaNumeroTipoRegPotBen1;

    public Integer getValorListaNumeroTipoRegPotBen1() {
        return this.valorListaNumeroTipoRegPotBen1;
    }

    public void setValorListaNumeroTipoRegPotBen1(Integer valor) {
        this.valorListaNumeroTipoRegPotBen1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* desactivarPotencialBen */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* reactivarPotencialBen */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* vincularPotencialBen */
                : f == FUNCION_ACCION_4 ? this.accion4(f) /* validarCensoPotencialBen */
                : f == FUNCION_ACCION_5 ? this.accion5(f) /* invalidarCensoPotencialBen */
                : f == FUNCION_ACCION_6 ? this.accion6(f) /* regReclCenPotencialBen */
                : f == FUNCION_ACCION_7 ? this.accion7(f) /* aprobarReclCenPotencialBen */
                : f == FUNCION_ACCION_8 ? this.accion8(f) /* denegarReclCenPotencialBen */
                : f == FUNCION_ACCION_9 ? this.accion9(f) /* acreditarPotencialBen */
                : f == FUNCION_ACCION_10 ? this.accion10(f) /* regUltVisCenPotencialBen */
                : f == FUNCION_ACCION_11 ? this.accion11(f) /* emitirConstanciaRegistroPotencialBen */
                : f == FUNCION_ACCION_12 ? this.accion12(f) /* emitirPotencialBenPorCensar */
                : f == FUNCION_ACCION_13 ? this.accion13(f) /* emitirPotencialBenPorValidar */
                : f == FUNCION_ACCION_14 ? this.accion14(f) /* emitirPotencialBenPorResultadoValidacion */
                : f == FUNCION_ACCION_15 ? this.accion15(f) /* emitirPotencialBenPorIcv */
                : f == FUNCION_ACCION_16 ? this.accion16(f) /* emitirPotencialBenAcreditado */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.desactivarPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("desactivar potencial ben"));
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.reactivarPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("reactivar potencial ben"));
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.vincularPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("vincular potencial ben"));
        }
        return null;
    }

    private String accion4(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.validarCensoPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("validar censo potencial ben"));
        }
        return null;
    }

    private String accion5(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.invalidarCensoPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("invalidar censo potencial ben"));
        }
        return null;
    }

    private String accion6(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.regReclCenPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("reg recl cen potencial ben"));
        }
        return null;
    }

    private String accion7(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.aprobarReclCenPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("aprobar recl cen potencial ben"));
        }
        return null;
    }

    private String accion8(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.denegarReclCenPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("denegar recl cen potencial ben"));
        }
        return null;
    }

    private String accion9(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.acreditarPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("acreditar potencial ben"));
        }
        return null;
    }

    private String accion10(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.regUltVisCenPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("reg ult vis cen potencial ben"));
        }
        return null;
    }

    private String accion11(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirConstanciaRegistroPotencialBen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir constancia registro potencial ben"));
        }
        return null;
    }

    private String accion12(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPotencialBenPorCensar();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir potencial ben por censar"));
        }
        return null;
    }

    private String accion13(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPotencialBenPorValidar();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir potencial ben por validar"));
        }
        return null;
    }

    private String accion14(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPotencialBenPorResultadoValidacion();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir potencial ben por resultado validacion"));
        }
        return null;
    }

    private String accion15(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPotencialBenPorIcv();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir potencial ben por icv"));
        }
        return null;
    }

    private String accion16(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirPotencialBenAcreditado();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir potencial ben acreditado"));
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private PotencialBenBusinessProcessLocal potencialBenBusinessProcess;

    @EJB
    private ReporterBrokerLocal reporter;

    private void desactivarPotencialBen() { /* desactivar potencial ben */
        this.desactivarPotencialBen(synchronously);
    }

    private void desactivarPotencialBen(boolean synchronously) { /* desactivar potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            DesactivarPotencialBenMessage message = new DesactivarPotencialBenMessage(idPotencialBen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.desactivarPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void reactivarPotencialBen() { /* reactivar potencial ben */
        this.reactivarPotencialBen(synchronously);
    }

    private void reactivarPotencialBen(boolean synchronously) { /* reactivar potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            ReactivarPotencialBenMessage message = new ReactivarPotencialBenMessage(idPotencialBen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.reactivarPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void vincularPotencialBen() { /* vincular potencial ben */
        this.vincularPotencialBen(synchronously);
    }

    private void vincularPotencialBen(boolean synchronously) { /* vincular potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            Long idPersona = this.getPersonaIdPersona() == null ? null : this.getPersonaIdPersona().getIdPersona();
            VincularPotencialBenMessage message = new VincularPotencialBenMessage(idPotencialBen, idPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.vincularPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void validarCensoPotencialBen() { /* validar censo potencial ben */
        this.validarCensoPotencialBen(synchronously);
    }

    private void validarCensoPotencialBen(boolean synchronously) { /* validar censo potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            Long idFuncionarioValidacionCen = this.getFuncionarioIdFuncionarioValidacionCen() == null ? null : this.getFuncionarioIdFuncionarioValidacionCen().getIdFuncionario();
            String comentariosValidacionCenso = this.getTextoCampoComentariosValidacionCenso1();
            ValidarCensoPotencialBenMessage message = new ValidarCensoPotencialBenMessage(idPotencialBen, idFuncionarioValidacionCen, comentariosValidacionCenso);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.validarCensoPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void invalidarCensoPotencialBen() { /* invalidar censo potencial ben */
        this.invalidarCensoPotencialBen(synchronously);
    }

    private void invalidarCensoPotencialBen(boolean synchronously) { /* invalidar censo potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            Long idFuncionarioValidacionCen = this.getFuncionarioIdFuncionarioValidacionCen() == null ? null : this.getFuncionarioIdFuncionarioValidacionCen().getIdFuncionario();
            Integer numeroCausaInvCenso = this.getValorListaNumeroCausaInvCenso1();
            String otraCausaInvCenso = this.getTextoCampoOtraCausaInvCenso1();
            String comentariosValidacionCenso = this.getTextoCampoComentariosValidacionCenso1();
            InvalidarCensoPotencialBenMessage message = new InvalidarCensoPotencialBenMessage(idPotencialBen, idFuncionarioValidacionCen, numeroCausaInvCenso, otraCausaInvCenso, comentariosValidacionCenso);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.invalidarCensoPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void regReclCenPotencialBen() { /* reg recl cen potencial ben */
        this.regReclCenPotencialBen(synchronously);
    }

    private void regReclCenPotencialBen(boolean synchronously) { /* reg recl cen potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            String comentariosReclamoCenso = this.getTextoCampoComentariosReclamoCenso1();
            RegReclCenPotencialBenMessage message = new RegReclCenPotencialBenMessage(idPotencialBen, comentariosReclamoCenso);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.regReclCenPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void aprobarReclCenPotencialBen() { /* aprobar recl cen potencial ben */
        this.aprobarReclCenPotencialBen(synchronously);
    }

    private void aprobarReclCenPotencialBen(boolean synchronously) { /* aprobar recl cen potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            String comentariosAprReclCen = this.getTextoCampoComentariosAprReclCen1();
            AprobarReclCenPotencialBenMessage message = new AprobarReclCenPotencialBenMessage(idPotencialBen, comentariosAprReclCen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.aprobarReclCenPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void denegarReclCenPotencialBen() { /* denegar recl cen potencial ben */
        this.denegarReclCenPotencialBen(synchronously);
    }

    private void denegarReclCenPotencialBen(boolean synchronously) { /* denegar recl cen potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            Integer numeroCausaDenReclCen = this.getValorListaNumeroCausaDenReclCen1();
            String otraCausaDenReclCen = this.getTextoCampoOtraCausaDenReclCen1();
            String comentariosDenReclCen = this.getTextoCampoComentariosDenReclCen1();
            DenegarReclCenPotencialBenMessage message = new DenegarReclCenPotencialBenMessage(idPotencialBen, numeroCausaDenReclCen, otraCausaDenReclCen, comentariosDenReclCen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.denegarReclCenPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void acreditarPotencialBen() { /* acreditar potencial ben */
        this.acreditarPotencialBen(synchronously);
    }

    private void acreditarPotencialBen(boolean synchronously) { /* acreditar potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            AcreditarPotencialBenMessage message = new AcreditarPotencialBenMessage(idPotencialBen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.acreditarPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void regUltVisCenPotencialBen() { /* reg ult vis cen potencial ben */
        this.regUltVisCenPotencialBen(synchronously);
    }

    private void regUltVisCenPotencialBen(boolean synchronously) { /* reg ult vis cen potencial ben */
        try {
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            Date fechaUltimaVisitaCenso = this.getValorCampoFechaUltimaVisitaCenso1();
            Long idFuncionarioUltVisitaCen = this.getFuncionarioIdFuncionarioUltVisitaCen() == null ? null : this.getFuncionarioIdFuncionarioUltVisitaCen().getIdFuncionario();
            String observacionesUltVisitaCen = this.getTextoCampoObservacionesUltVisitaCen1();
            RegUltVisCenPotencialBenMessage message = new RegUltVisCenPotencialBenMessage(idPotencialBen, fechaUltimaVisitaCenso, idFuncionarioUltVisitaCen, observacionesUltVisitaCen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.potencialBenBusinessProcess.regUltVisCenPotencialBen(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void emitirConstanciaRegistroPotencialBen() { /* emitir constancia registro potencial ben */
        Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
        String report = PotencialBenConstants.INFORME_FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN;
        long function = PotencialBenConstants.FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN;
        Map parameters = new LinkedHashMap();
        parameters.put("id_potencial_ben", idPotencialBen);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
        String search = "";
        ArrayList args = new ArrayList();
        if (idPotencialBen != null) {
            args.add(idPotencialBen);
            search += " and id_potencial_ben=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPotencialBenPorCensar() { /* emitir potencial ben por censar */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaRegistroPotBenDesde = this.getValorCampoFechaRegistroPotBenDesde1();
        Date fechaRegistroPotBenHasta = this.getValorCampoFechaRegistroPotBenHasta1();
        String report = PotencialBenConstants.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR;
        long function = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPotencialBenPorValidar() { /* emitir potencial ben por validar */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaRegistroPotBenDesde = this.getValorCampoFechaRegistroPotBenDesde1();
        Date fechaRegistroPotBenHasta = this.getValorCampoFechaRegistroPotBenHasta1();
        String report = PotencialBenConstants.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR;
        long function = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPotencialBenPorResultadoValidacion() { /* emitir potencial ben por resultado validacion */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaRegistroPotBenDesde = this.getValorCampoFechaRegistroPotBenDesde1();
        Date fechaRegistroPotBenHasta = this.getValorCampoFechaRegistroPotBenHasta1();
        BigDecimal indiceCalidadVidaDesde = (BigDecimal) STP.getObjeto(this.getTextoCampoIndiceCalidadVidaDesde1(), EnumTipoDatoPar.NUMERICO);
        BigDecimal indiceCalidadVidaHasta = (BigDecimal) STP.getObjeto(this.getTextoCampoIndiceCalidadVidaHasta1(), EnumTipoDatoPar.NUMERICO);
        Date fechaValidacionCensoDesde = this.getValorCampoFechaValidacionCensoDesde1();
        Date fechaValidacionCensoHasta = this.getValorCampoFechaValidacionCensoHasta1();
        Integer numeroCondicionCenso = this.getValorListaNumeroCondicionCenso1();
        Long idFuncionarioValidacionCen = this.getFuncionarioIdFuncionarioValidacionCen() == null ? null : this.getFuncionarioIdFuncionarioValidacionCen().getIdFuncionario();
        String report = PotencialBenConstants.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION;
        long function = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
        parameters.put("indice_calidad_vida_desde", indiceCalidadVidaDesde);
        parameters.put("indice_calidad_vida_hasta", indiceCalidadVidaHasta);
        parameters.put("fecha_validacion_censo_desde", fechaValidacionCensoDesde);
        parameters.put("fecha_validacion_censo_hasta", fechaValidacionCensoHasta);
        parameters.put("numero_condicion_censo", numeroCondicionCenso);
        parameters.put("id_funcionario_validacion_cen", idFuncionarioValidacionCen);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (indiceCalidadVidaDesde != null) {
            args.add(indiceCalidadVidaDesde);
            search += " and indice_calidad_vida>=?";
        }
        if (indiceCalidadVidaHasta != null) {
            args.add(indiceCalidadVidaHasta);
            search += " and indice_calidad_vida<=?";
        }
        if (fechaValidacionCensoDesde != null) {
            args.add(fechaValidacionCensoDesde);
            search += " and fecha_validacion_censo>=?";
        }
        if (fechaValidacionCensoHasta != null) {
            args.add(fechaValidacionCensoHasta);
            search += " and fecha_validacion_censo<=?";
        }
        if (numeroCondicionCenso != null) {
            args.add(numeroCondicionCenso);
            search += " and numero_condicion_censo=?";
        }
        if (idFuncionarioValidacionCen != null) {
            args.add(idFuncionarioValidacionCen);
            search += " and id_funcionario_validacion_cen=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPotencialBenPorIcv() { /* emitir potencial ben por icv */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaRegistroPotBenDesde = this.getValorCampoFechaRegistroPotBenDesde1();
        Date fechaRegistroPotBenHasta = this.getValorCampoFechaRegistroPotBenHasta1();
        BigDecimal indiceCalidadVidaDesde = (BigDecimal) STP.getObjeto(this.getTextoCampoIndiceCalidadVidaDesde1(), EnumTipoDatoPar.NUMERICO);
        BigDecimal indiceCalidadVidaHasta = (BigDecimal) STP.getObjeto(this.getTextoCampoIndiceCalidadVidaHasta1(), EnumTipoDatoPar.NUMERICO);
        Integer numeroCondicionCenso = this.getValorListaNumeroCondicionCenso1();
        String report = PotencialBenConstants.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV;
        long function = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
        parameters.put("indice_calidad_vida_desde", indiceCalidadVidaDesde);
        parameters.put("indice_calidad_vida_hasta", indiceCalidadVidaHasta);
        parameters.put("numero_condicion_censo", numeroCondicionCenso);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (indiceCalidadVidaDesde != null) {
            args.add(indiceCalidadVidaDesde);
            search += " and indice_calidad_vida>=?";
        }
        if (indiceCalidadVidaHasta != null) {
            args.add(indiceCalidadVidaHasta);
            search += " and indice_calidad_vida<=?";
        }
        if (numeroCondicionCenso != null) {
            args.add(numeroCondicionCenso);
            search += " and numero_condicion_censo=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirPotencialBenAcreditado() { /* emitir potencial ben acreditado */
        Long idDepartamento = this.getUbicacionIdDepartamento() == null ? null : this.getUbicacionIdDepartamento().getIdUbicacion();
        Long idDistrito = this.getUbicacionIdDistrito() == null ? null : this.getUbicacionIdDistrito().getIdUbicacion();
        Long idBarrio = this.getUbicacionIdBarrio() == null ? null : this.getUbicacionIdBarrio().getIdUbicacion();
        Date fechaRegistroPotBenDesde = this.getValorCampoFechaRegistroPotBenDesde1();
        Date fechaRegistroPotBenHasta = this.getValorCampoFechaRegistroPotBenHasta1();
        Integer numeroTipoRegPotBen = this.getValorListaNumeroTipoRegPotBen1();
        String report = PotencialBenConstants.INFORME_FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO;
        long function = PotencialBenConstants.FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO;
        Map parameters = new LinkedHashMap();
        parameters.put("id_departamento", idDepartamento);
        parameters.put("id_distrito", idDistrito);
        parameters.put("id_barrio", idBarrio);
        parameters.put("fecha_registro_pot_ben_desde", fechaRegistroPotBenDesde);
        parameters.put("fecha_registro_pot_ben_hasta", fechaRegistroPotBenHasta);
        parameters.put("numero_tipo_reg_pot_ben", numeroTipoRegPotBen);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from potencial_ben";
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
        if (fechaRegistroPotBenDesde != null) {
            args.add(fechaRegistroPotBenDesde);
            search += " and fecha_registro_pot_ben>=?";
        }
        if (fechaRegistroPotBenHasta != null) {
            args.add(fechaRegistroPotBenHasta);
            search += " and fecha_registro_pot_ben<=?";
        }
        if (numeroTipoRegPotBen != null) {
            args.add(numeroTipoRegPotBen);
            search += " and numero_tipo_reg_pot_ben=?";
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
