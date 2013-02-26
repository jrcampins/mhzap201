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

import com.egt.data.specific.xdp2.ArchivoDatosExtCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
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
import com.egt.ejb.business.process.ArchivoDatosExtBusinessProcessLocal;

public class ArchivoDatosExt6 extends AbstractPageBean
        implements PaginaActualizacionArchivoDatosExt, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdArchivoDatosExt1.setMinimum(0L);
        validatorIdArchivoDatosExt1.setMaximum(1000000000000000000L);
        validatorCodigoArchivoDatosExt1.setMaximum(100);
        validatorNombreArchivoDatosExt1.setMaximum(100);
        converterFechaHoraUltimaCarga1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltimaCarga1.setType("both");
        validatorNombreArchivoDatos1.setMaximum(250);
        validatorNombreOriginalArchivoDatos1.setMaximum(250);
        converterFechaHoraUltimaImportacion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltimaImportacion1.setType("both");
        archivoDatosExtDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.archivoDatosExtRowSet}"));
        proveedorDatExtReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.proveedorDatExtReferenceRowSet}"));
        usuarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.usuarioReferenceRowSet}"));
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

    private Label labelIdArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdArchivoDatosExt1() {
        return labelIdArchivoDatosExt1;
    }

    public void setLabelIdArchivoDatosExt1(Label l) {
        this.labelIdArchivoDatosExt1 = l;
    }

    private TextField campoIdArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdArchivoDatosExt1() {
        return campoIdArchivoDatosExt1;
    }

    public void setCampoIdArchivoDatosExt1(TextField component) {
        this.campoIdArchivoDatosExt1 = component;
    }

    private HelpInline helpInlineIdArchivoDatosExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdArchivoDatosExt1() {
        return helpInlineIdArchivoDatosExt1;
    }

    public void setHelpInlineIdArchivoDatosExt1(HelpInline hi) {
        this.helpInlineIdArchivoDatosExt1 = hi;
    }

    private StaticText campoIdArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdArchivoDatosExt1Texto1() {
        return campoIdArchivoDatosExt1Texto1;
    }

    public void setCampoIdArchivoDatosExt1Texto1(StaticText component) {
        this.campoIdArchivoDatosExt1Texto1 = component;
    }

    private LongConverter converterIdArchivoDatosExt1 = new LongConverter();
  
    public LongConverter getConverterIdArchivoDatosExt1() {
        return converterIdArchivoDatosExt1;
    }
  
    public void setConverterIdArchivoDatosExt1(LongConverter converter) {
        this.converterIdArchivoDatosExt1 = converter;
    }
  
    private LongRangeValidator validatorIdArchivoDatosExt1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdArchivoDatosExt1() {
        return validatorIdArchivoDatosExt1;
    }
  
    public void setValidatorIdArchivoDatosExt1(LongRangeValidator validator) {
        this.validatorIdArchivoDatosExt1 = validator;
    }
  
    private Label labelCodigoArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoArchivoDatosExt1() {
        return labelCodigoArchivoDatosExt1;
    }

    public void setLabelCodigoArchivoDatosExt1(Label l) {
        this.labelCodigoArchivoDatosExt1 = l;
    }

    private TextField campoCodigoArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoArchivoDatosExt1() {
        return campoCodigoArchivoDatosExt1;
    }

    public void setCampoCodigoArchivoDatosExt1(TextField component) {
        this.campoCodigoArchivoDatosExt1 = component;
    }

    private HelpInline helpInlineCodigoArchivoDatosExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoArchivoDatosExt1() {
        return helpInlineCodigoArchivoDatosExt1;
    }

    public void setHelpInlineCodigoArchivoDatosExt1(HelpInline hi) {
        this.helpInlineCodigoArchivoDatosExt1 = hi;
    }

    private StaticText campoCodigoArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoArchivoDatosExt1Texto1() {
        return campoCodigoArchivoDatosExt1Texto1;
    }

    public void setCampoCodigoArchivoDatosExt1Texto1(StaticText component) {
        this.campoCodigoArchivoDatosExt1Texto1 = component;
    }

    private LengthValidator validatorCodigoArchivoDatosExt1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoArchivoDatosExt1() {
        return validatorCodigoArchivoDatosExt1;
    }
  
    public void setValidatorCodigoArchivoDatosExt1(LengthValidator validator) {
        this.validatorCodigoArchivoDatosExt1 = validator;
    }
  
    private Label labelNombreArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivoDatosExt1() {
        return labelNombreArchivoDatosExt1;
    }

    public void setLabelNombreArchivoDatosExt1(Label l) {
        this.labelNombreArchivoDatosExt1 = l;
    }

    private TextField campoNombreArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreArchivoDatosExt1() {
        return campoNombreArchivoDatosExt1;
    }

    public void setCampoNombreArchivoDatosExt1(TextField component) {
        this.campoNombreArchivoDatosExt1 = component;
    }

    private HelpInline helpInlineNombreArchivoDatosExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreArchivoDatosExt1() {
        return helpInlineNombreArchivoDatosExt1;
    }

    public void setHelpInlineNombreArchivoDatosExt1(HelpInline hi) {
        this.helpInlineNombreArchivoDatosExt1 = hi;
    }

    private StaticText campoNombreArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivoDatosExt1Texto1() {
        return campoNombreArchivoDatosExt1Texto1;
    }

    public void setCampoNombreArchivoDatosExt1Texto1(StaticText component) {
        this.campoNombreArchivoDatosExt1Texto1 = component;
    }

    private Button campoNombreArchivoDatosExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivoDatosExt1Boton3() {
        return campoNombreArchivoDatosExt1Boton3;
    }

    public void setCampoNombreArchivoDatosExt1Boton3(Button component) {
        this.campoNombreArchivoDatosExt1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivoDatosExt1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivoDatosExt1() {
        return validatorNombreArchivoDatosExt1;
    }
  
    public void setValidatorNombreArchivoDatosExt1(LengthValidator validator) {
        this.validatorNombreArchivoDatosExt1 = validator;
    }
  
    private Label labelIdProveedorDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt1() {
        return labelIdProveedorDatExt1;
    }

    public void setLabelIdProveedorDatExt1(Label l) {
        this.labelIdProveedorDatExt1 = l;
    }

    private TextField campoIdProveedorDatExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdProveedorDatExt1() {
        return campoIdProveedorDatExt1;
    }

    public void setCampoIdProveedorDatExt1(TextField component) {
        this.campoIdProveedorDatExt1 = component;
    }

    private HelpInline helpInlineIdProveedorDatExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdProveedorDatExt1() {
        return helpInlineIdProveedorDatExt1;
    }

    public void setHelpInlineIdProveedorDatExt1(HelpInline hi) {
        this.helpInlineIdProveedorDatExt1 = hi;
    }

    private StaticText campoIdProveedorDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdProveedorDatExt1Texto1() {
        return campoIdProveedorDatExt1Texto1;
    }

    public void setCampoIdProveedorDatExt1Texto1(StaticText component) {
        this.campoIdProveedorDatExt1Texto1 = component;
    }

    private Button campoIdProveedorDatExt1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdProveedorDatExt1Boton1() {
        return campoIdProveedorDatExt1Boton1;
    }

    public void setCampoIdProveedorDatExt1Boton1(Button component) {
        this.campoIdProveedorDatExt1Boton1 = component;
    }

    private Button campoIdProveedorDatExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1Boton3() {
        return campoIdProveedorDatExt1Boton3;
    }

    public void setCampoIdProveedorDatExt1Boton3(Button component) {
        this.campoIdProveedorDatExt1Boton3 = component;
    }

    private Label labelIdProveedorDatExt2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt2() {
        return labelIdProveedorDatExt2;
    }

    public void setLabelIdProveedorDatExt2(Label l) {
        this.labelIdProveedorDatExt2 = l;
    }

    private StaticText campoIdProveedorDatExt1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdProveedorDatExt1Texto2() {
        return campoIdProveedorDatExt1Texto2;
    }

    public void setCampoIdProveedorDatExt1Texto2(StaticText component) {
        this.campoIdProveedorDatExt1Texto2 = component;
    }

    private Button campoIdProveedorDatExt1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1Boton2() {
        return campoIdProveedorDatExt1Boton2;
    }

    public void setCampoIdProveedorDatExt1Boton2(Button component) {
        this.campoIdProveedorDatExt1Boton2 = component;
    }

    private Label labelNumeroTipoArcDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArcDatExt1() {
        return labelNumeroTipoArcDatExt1;
    }

    public void setLabelNumeroTipoArcDatExt1(Label l) {
        this.labelNumeroTipoArcDatExt1 = l;
    }

    private DropDown listaNumeroTipoArcDatExt1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoArcDatExt1() {
        return listaNumeroTipoArcDatExt1;
    }

    public void setListaNumeroTipoArcDatExt1(DropDown component) {
        this.listaNumeroTipoArcDatExt1 = component;
    }

    private HelpInline helpInlineNumeroTipoArcDatExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoArcDatExt1() {
        return helpInlineNumeroTipoArcDatExt1;
    }

    public void setHelpInlineNumeroTipoArcDatExt1(HelpInline hi) {
        this.helpInlineNumeroTipoArcDatExt1 = hi;
    }

    private StaticText listaNumeroTipoArcDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArcDatExt1Texto1() {
        return listaNumeroTipoArcDatExt1Texto1;
    }

    public void setListaNumeroTipoArcDatExt1Texto1(StaticText component) {
        this.listaNumeroTipoArcDatExt1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoArcDatExt1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoArcDatExt1() {
        return converterNumeroTipoArcDatExt1;
    }
  
    public void setConverterNumeroTipoArcDatExt1(IntegerConverter converter) {
        this.converterNumeroTipoArcDatExt1 = converter;
    }
  
    private Label labelEsArchivoDatosExtImportado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsArchivoDatosExtImportado1() {
        return labelEsArchivoDatosExtImportado1;
    }

    public void setLabelEsArchivoDatosExtImportado1(Label l) {
        this.labelEsArchivoDatosExtImportado1 = l;
    }

    private DropDown listaEsArchivoDatosExtImportado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsArchivoDatosExtImportado1() {
        return listaEsArchivoDatosExtImportado1;
    }

    public void setListaEsArchivoDatosExtImportado1(DropDown component) {
        this.listaEsArchivoDatosExtImportado1 = component;
    }

    private HelpInline helpInlineEsArchivoDatosExtImportado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsArchivoDatosExtImportado1() {
        return helpInlineEsArchivoDatosExtImportado1;
    }

    public void setHelpInlineEsArchivoDatosExtImportado1(HelpInline hi) {
        this.helpInlineEsArchivoDatosExtImportado1 = hi;
    }

    private StaticText listaEsArchivoDatosExtImportado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsArchivoDatosExtImportado1Texto1() {
        return listaEsArchivoDatosExtImportado1Texto1;
    }

    public void setListaEsArchivoDatosExtImportado1Texto1(StaticText component) {
        this.listaEsArchivoDatosExtImportado1Texto1 = component;
    }

    private IntegerConverter converterEsArchivoDatosExtImportado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsArchivoDatosExtImportado1() {
        return converterEsArchivoDatosExtImportado1;
    }
  
    public void setConverterEsArchivoDatosExtImportado1(IntegerConverter converter) {
        this.converterEsArchivoDatosExtImportado1 = converter;
    }
  
    private Label labelFechaHoraUltimaCarga1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltimaCarga1() {
        return labelFechaHoraUltimaCarga1;
    }

    public void setLabelFechaHoraUltimaCarga1(Label l) {
        this.labelFechaHoraUltimaCarga1 = l;
    }

    private TextField campoFechaHoraUltimaCarga1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltimaCarga1() {
        return campoFechaHoraUltimaCarga1;
    }

    public void setCampoFechaHoraUltimaCarga1(TextField component) {
        this.campoFechaHoraUltimaCarga1 = component;
    }

    private HelpInline helpInlineFechaHoraUltimaCarga1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraUltimaCarga1() {
        return helpInlineFechaHoraUltimaCarga1;
    }

    public void setHelpInlineFechaHoraUltimaCarga1(HelpInline hi) {
        this.helpInlineFechaHoraUltimaCarga1 = hi;
    }

    private StaticText campoFechaHoraUltimaCarga1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltimaCarga1Texto1() {
        return campoFechaHoraUltimaCarga1Texto1;
    }

    public void setCampoFechaHoraUltimaCarga1Texto1(StaticText component) {
        this.campoFechaHoraUltimaCarga1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltimaCarga1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltimaCarga1() {
        return converterFechaHoraUltimaCarga1;
    }
  
    public void setConverterFechaHoraUltimaCarga1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltimaCarga1 = converter;
    }
  
    private Label labelIdUsuarioUltimaCarga1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaCarga1() {
        return labelIdUsuarioUltimaCarga1;
    }

    public void setLabelIdUsuarioUltimaCarga1(Label l) {
        this.labelIdUsuarioUltimaCarga1 = l;
    }

    private TextField campoIdUsuarioUltimaCarga1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuarioUltimaCarga1() {
        return campoIdUsuarioUltimaCarga1;
    }

    public void setCampoIdUsuarioUltimaCarga1(TextField component) {
        this.campoIdUsuarioUltimaCarga1 = component;
    }

    private HelpInline helpInlineIdUsuarioUltimaCarga1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUsuarioUltimaCarga1() {
        return helpInlineIdUsuarioUltimaCarga1;
    }

    public void setHelpInlineIdUsuarioUltimaCarga1(HelpInline hi) {
        this.helpInlineIdUsuarioUltimaCarga1 = hi;
    }

    private StaticText campoIdUsuarioUltimaCarga1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioUltimaCarga1Texto1() {
        return campoIdUsuarioUltimaCarga1Texto1;
    }

    public void setCampoIdUsuarioUltimaCarga1Texto1(StaticText component) {
        this.campoIdUsuarioUltimaCarga1Texto1 = component;
    }

    private Button campoIdUsuarioUltimaCarga1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioUltimaCarga1Boton1() {
        return campoIdUsuarioUltimaCarga1Boton1;
    }

    public void setCampoIdUsuarioUltimaCarga1Boton1(Button component) {
        this.campoIdUsuarioUltimaCarga1Boton1 = component;
    }

    private Button campoIdUsuarioUltimaCarga1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioUltimaCarga1Boton3() {
        return campoIdUsuarioUltimaCarga1Boton3;
    }

    public void setCampoIdUsuarioUltimaCarga1Boton3(Button component) {
        this.campoIdUsuarioUltimaCarga1Boton3 = component;
    }

    private Label labelIdUsuarioUltimaCarga2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaCarga2() {
        return labelIdUsuarioUltimaCarga2;
    }

    public void setLabelIdUsuarioUltimaCarga2(Label l) {
        this.labelIdUsuarioUltimaCarga2 = l;
    }

    private StaticText campoIdUsuarioUltimaCarga1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUsuarioUltimaCarga1Texto2() {
        return campoIdUsuarioUltimaCarga1Texto2;
    }

    public void setCampoIdUsuarioUltimaCarga1Texto2(StaticText component) {
        this.campoIdUsuarioUltimaCarga1Texto2 = component;
    }

    private Button campoIdUsuarioUltimaCarga1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioUltimaCarga1Boton2() {
        return campoIdUsuarioUltimaCarga1Boton2;
    }

    public void setCampoIdUsuarioUltimaCarga1Boton2(Button component) {
        this.campoIdUsuarioUltimaCarga1Boton2 = component;
    }

    private Label labelNombreArchivoDatos1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivoDatos1() {
        return labelNombreArchivoDatos1;
    }

    public void setLabelNombreArchivoDatos1(Label l) {
        this.labelNombreArchivoDatos1 = l;
    }

    private TextArea campoNombreArchivoDatos1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreArchivoDatos1() {
        return campoNombreArchivoDatos1;
    }

    public void setCampoNombreArchivoDatos1(TextArea component) {
        this.campoNombreArchivoDatos1 = component;
    }

    private HelpInline helpInlineNombreArchivoDatos1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreArchivoDatos1() {
        return helpInlineNombreArchivoDatos1;
    }

    public void setHelpInlineNombreArchivoDatos1(HelpInline hi) {
        this.helpInlineNombreArchivoDatos1 = hi;
    }

    private StaticText campoNombreArchivoDatos1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivoDatos1Texto1() {
        return campoNombreArchivoDatos1Texto1;
    }

    public void setCampoNombreArchivoDatos1Texto1(StaticText component) {
        this.campoNombreArchivoDatos1Texto1 = component;
    }

    private Button campoNombreArchivoDatos1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivoDatos1Boton3() {
        return campoNombreArchivoDatos1Boton3;
    }

    public void setCampoNombreArchivoDatos1Boton3(Button component) {
        this.campoNombreArchivoDatos1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivoDatos1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivoDatos1() {
        return validatorNombreArchivoDatos1;
    }
  
    public void setValidatorNombreArchivoDatos1(LengthValidator validator) {
        this.validatorNombreArchivoDatos1 = validator;
    }
  
    private Label labelNombreOriginalArchivoDatos1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreOriginalArchivoDatos1() {
        return labelNombreOriginalArchivoDatos1;
    }

    public void setLabelNombreOriginalArchivoDatos1(Label l) {
        this.labelNombreOriginalArchivoDatos1 = l;
    }

    private TextArea campoNombreOriginalArchivoDatos1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreOriginalArchivoDatos1() {
        return campoNombreOriginalArchivoDatos1;
    }

    public void setCampoNombreOriginalArchivoDatos1(TextArea component) {
        this.campoNombreOriginalArchivoDatos1 = component;
    }

    private HelpInline helpInlineNombreOriginalArchivoDatos1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreOriginalArchivoDatos1() {
        return helpInlineNombreOriginalArchivoDatos1;
    }

    public void setHelpInlineNombreOriginalArchivoDatos1(HelpInline hi) {
        this.helpInlineNombreOriginalArchivoDatos1 = hi;
    }

    private StaticText campoNombreOriginalArchivoDatos1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreOriginalArchivoDatos1Texto1() {
        return campoNombreOriginalArchivoDatos1Texto1;
    }

    public void setCampoNombreOriginalArchivoDatos1Texto1(StaticText component) {
        this.campoNombreOriginalArchivoDatos1Texto1 = component;
    }

    private LengthValidator validatorNombreOriginalArchivoDatos1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreOriginalArchivoDatos1() {
        return validatorNombreOriginalArchivoDatos1;
    }
  
    public void setValidatorNombreOriginalArchivoDatos1(LengthValidator validator) {
        this.validatorNombreOriginalArchivoDatos1 = validator;
    }
  
    private Label labelFechaHoraUltimaImportacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltimaImportacion1() {
        return labelFechaHoraUltimaImportacion1;
    }

    public void setLabelFechaHoraUltimaImportacion1(Label l) {
        this.labelFechaHoraUltimaImportacion1 = l;
    }

    private TextField campoFechaHoraUltimaImportacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltimaImportacion1() {
        return campoFechaHoraUltimaImportacion1;
    }

    public void setCampoFechaHoraUltimaImportacion1(TextField component) {
        this.campoFechaHoraUltimaImportacion1 = component;
    }

    private HelpInline helpInlineFechaHoraUltimaImportacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraUltimaImportacion1() {
        return helpInlineFechaHoraUltimaImportacion1;
    }

    public void setHelpInlineFechaHoraUltimaImportacion1(HelpInline hi) {
        this.helpInlineFechaHoraUltimaImportacion1 = hi;
    }

    private StaticText campoFechaHoraUltimaImportacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltimaImportacion1Texto1() {
        return campoFechaHoraUltimaImportacion1Texto1;
    }

    public void setCampoFechaHoraUltimaImportacion1Texto1(StaticText component) {
        this.campoFechaHoraUltimaImportacion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltimaImportacion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltimaImportacion1() {
        return converterFechaHoraUltimaImportacion1;
    }
  
    public void setConverterFechaHoraUltimaImportacion1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltimaImportacion1 = converter;
    }
  
    private Label labelIdUsuarioUltimaImportacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaImportacion1() {
        return labelIdUsuarioUltimaImportacion1;
    }

    public void setLabelIdUsuarioUltimaImportacion1(Label l) {
        this.labelIdUsuarioUltimaImportacion1 = l;
    }

    private TextField campoIdUsuarioUltimaImportacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuarioUltimaImportacion1() {
        return campoIdUsuarioUltimaImportacion1;
    }

    public void setCampoIdUsuarioUltimaImportacion1(TextField component) {
        this.campoIdUsuarioUltimaImportacion1 = component;
    }

    private HelpInline helpInlineIdUsuarioUltimaImportacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUsuarioUltimaImportacion1() {
        return helpInlineIdUsuarioUltimaImportacion1;
    }

    public void setHelpInlineIdUsuarioUltimaImportacion1(HelpInline hi) {
        this.helpInlineIdUsuarioUltimaImportacion1 = hi;
    }

    private StaticText campoIdUsuarioUltimaImportacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioUltimaImportacion1Texto1() {
        return campoIdUsuarioUltimaImportacion1Texto1;
    }

    public void setCampoIdUsuarioUltimaImportacion1Texto1(StaticText component) {
        this.campoIdUsuarioUltimaImportacion1Texto1 = component;
    }

    private Button campoIdUsuarioUltimaImportacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioUltimaImportacion1Boton1() {
        return campoIdUsuarioUltimaImportacion1Boton1;
    }

    public void setCampoIdUsuarioUltimaImportacion1Boton1(Button component) {
        this.campoIdUsuarioUltimaImportacion1Boton1 = component;
    }

    private Button campoIdUsuarioUltimaImportacion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioUltimaImportacion1Boton3() {
        return campoIdUsuarioUltimaImportacion1Boton3;
    }

    public void setCampoIdUsuarioUltimaImportacion1Boton3(Button component) {
        this.campoIdUsuarioUltimaImportacion1Boton3 = component;
    }

    private Label labelIdUsuarioUltimaImportacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaImportacion2() {
        return labelIdUsuarioUltimaImportacion2;
    }

    public void setLabelIdUsuarioUltimaImportacion2(Label l) {
        this.labelIdUsuarioUltimaImportacion2 = l;
    }

    private StaticText campoIdUsuarioUltimaImportacion1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUsuarioUltimaImportacion1Texto2() {
        return campoIdUsuarioUltimaImportacion1Texto2;
    }

    public void setCampoIdUsuarioUltimaImportacion1Texto2(StaticText component) {
        this.campoIdUsuarioUltimaImportacion1Texto2 = component;
    }

    private Button campoIdUsuarioUltimaImportacion1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioUltimaImportacion1Boton2() {
        return campoIdUsuarioUltimaImportacion1Boton2;
    }

    public void setCampoIdUsuarioUltimaImportacion1Boton2(Button component) {
        this.campoIdUsuarioUltimaImportacion1Boton2 = component;
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

    private ArchivoDatosExtCachedRowSetDataProvider2 archivoDatosExtDataProvider = new ArchivoDatosExtCachedRowSetDataProvider2();

    @Override
    public ArchivoDatosExtCachedRowSetDataProvider2 getArchivoDatosExtDataProvider() {
        return archivoDatosExtDataProvider;
    }

    public void setArchivoDatosExtDataProvider(ArchivoDatosExtCachedRowSetDataProvider2 crsdp) {
        this.archivoDatosExtDataProvider = crsdp;
    }

    private ProveedorDatExtCachedRowSetDataProvider2 proveedorDatExtReferenceDataProvider = new ProveedorDatExtCachedRowSetDataProvider2();

    @Override
    public ProveedorDatExtCachedRowSetDataProvider2 getProveedorDatExtReferenceDataProvider() {
        return proveedorDatExtReferenceDataProvider;
    }

    public void setProveedorDatExtReferenceDataProvider(ProveedorDatExtCachedRowSetDataProvider2 crsdp) {
        this.proveedorDatExtReferenceDataProvider = crsdp;
    }

    private UsuarioCachedRowSetDataProvider3 usuarioReferenceDataProvider = new UsuarioCachedRowSetDataProvider3();

    @Override
    public UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider() {
        return usuarioReferenceDataProvider;
    }

    public void setUsuarioReferenceDataProvider(UsuarioCachedRowSetDataProvider3 crsdp) {
        this.usuarioReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ArchivoDatosExt6() {
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
        archivoDatosExtDataProvider.close();
        proveedorDatExtReferenceDataProvider.close();
        usuarioReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionArchivoDatosExt...">
    @Override
    public TextField getTextFieldCampoFechaHoraUltimaCarga1() {
        return this.getCampoFechaHoraUltimaCarga1();
    }

    @Override
    public TextField getTextFieldCampoFechaHoraUltimaImportacion1() {
        return this.getCampoFechaHoraUltimaImportacion1();
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
    private AsistentePaginaActualizacionArchivoDatosExt asistente = new AsistentePaginaActualizacionArchivoDatosExt(this);

    public AsistentePaginaActualizacionArchivoDatosExt getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ArchivoDatosExt6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ArchivoDatosExt6_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getArchivoDatosExtDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT;
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
        String urx = URX2.COMANDO_ARCHIVO_DATOS_EXT;
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
        String urx = URX2.COMANDO_ARCHIVO_DATOS_EXT;
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
    public void campoIdProveedorDatExt1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdProveedorDatExt1_validate(context, component, value);
    }

    public void campoIdUsuarioUltimaCarga1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUsuarioUltimaCarga1_validate(context, component, value);
    }

    public void campoIdUsuarioUltimaImportacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUsuarioUltimaImportacion1_validate(context, component, value);
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
    ArchivoDatosExtBusinessProcessLocal archivoDatosExtBusinessProcess;

    @Override
    public Object getArchivoDatosExtBusinessProcess() {
        return archivoDatosExtBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
