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

import com.egt.data.specific.xdp2.ObjecionElePenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
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

public class ObjecionElePen6 extends AbstractPageBean
        implements PaginaActualizacionObjecionElePen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdObjecionElePen1.setMinimum(0L);
        validatorIdObjecionElePen1.setMaximum(1000000000000000000L);
        converterFechaUltimaActualizacion1.setPattern("dd/MM/yyyy");
        converterFechaUltimaActualizacion1.setType("date");
        validatorNombreArchivoUltimaAct1.setMaximum(200);
        objecionElePenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.objecionElePenRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
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

    private Label labelIdObjecionElePen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdObjecionElePen1() {
        return labelIdObjecionElePen1;
    }

    public void setLabelIdObjecionElePen1(Label l) {
        this.labelIdObjecionElePen1 = l;
    }

    private TextField campoIdObjecionElePen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdObjecionElePen1() {
        return campoIdObjecionElePen1;
    }

    public void setCampoIdObjecionElePen1(TextField component) {
        this.campoIdObjecionElePen1 = component;
    }

    private HelpInline helpInlineIdObjecionElePen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdObjecionElePen1() {
        return helpInlineIdObjecionElePen1;
    }

    public void setHelpInlineIdObjecionElePen1(HelpInline hi) {
        this.helpInlineIdObjecionElePen1 = hi;
    }

    private StaticText campoIdObjecionElePen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdObjecionElePen1Texto1() {
        return campoIdObjecionElePen1Texto1;
    }

    public void setCampoIdObjecionElePen1Texto1(StaticText component) {
        this.campoIdObjecionElePen1Texto1 = component;
    }

    private LongConverter converterIdObjecionElePen1 = new LongConverter();
  
    public LongConverter getConverterIdObjecionElePen1() {
        return converterIdObjecionElePen1;
    }
  
    public void setConverterIdObjecionElePen1(LongConverter converter) {
        this.converterIdObjecionElePen1 = converter;
    }
  
    private LongRangeValidator validatorIdObjecionElePen1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdObjecionElePen1() {
        return validatorIdObjecionElePen1;
    }
  
    public void setValidatorIdObjecionElePen1(LongRangeValidator validator) {
        this.validatorIdObjecionElePen1 = validator;
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

    private Label labelNumeroTipoObjElePen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoObjElePen1() {
        return labelNumeroTipoObjElePen1;
    }

    public void setLabelNumeroTipoObjElePen1(Label l) {
        this.labelNumeroTipoObjElePen1 = l;
    }

    private DropDown listaNumeroTipoObjElePen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoObjElePen1() {
        return listaNumeroTipoObjElePen1;
    }

    public void setListaNumeroTipoObjElePen1(DropDown component) {
        this.listaNumeroTipoObjElePen1 = component;
    }

    private HelpInline helpInlineNumeroTipoObjElePen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoObjElePen1() {
        return helpInlineNumeroTipoObjElePen1;
    }

    public void setHelpInlineNumeroTipoObjElePen1(HelpInline hi) {
        this.helpInlineNumeroTipoObjElePen1 = hi;
    }

    private StaticText listaNumeroTipoObjElePen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoObjElePen1Texto1() {
        return listaNumeroTipoObjElePen1Texto1;
    }

    public void setListaNumeroTipoObjElePen1Texto1(StaticText component) {
        this.listaNumeroTipoObjElePen1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoObjElePen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoObjElePen1() {
        return converterNumeroTipoObjElePen1;
    }
  
    public void setConverterNumeroTipoObjElePen1(IntegerConverter converter) {
        this.converterNumeroTipoObjElePen1 = converter;
    }
  
    private Label labelEsObjecionElePenInactiva1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsObjecionElePenInactiva1() {
        return labelEsObjecionElePenInactiva1;
    }

    public void setLabelEsObjecionElePenInactiva1(Label l) {
        this.labelEsObjecionElePenInactiva1 = l;
    }

    private DropDown listaEsObjecionElePenInactiva1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsObjecionElePenInactiva1() {
        return listaEsObjecionElePenInactiva1;
    }

    public void setListaEsObjecionElePenInactiva1(DropDown component) {
        this.listaEsObjecionElePenInactiva1 = component;
    }

    private HelpInline helpInlineEsObjecionElePenInactiva1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsObjecionElePenInactiva1() {
        return helpInlineEsObjecionElePenInactiva1;
    }

    public void setHelpInlineEsObjecionElePenInactiva1(HelpInline hi) {
        this.helpInlineEsObjecionElePenInactiva1 = hi;
    }

    private StaticText listaEsObjecionElePenInactiva1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsObjecionElePenInactiva1Texto1() {
        return listaEsObjecionElePenInactiva1Texto1;
    }

    public void setListaEsObjecionElePenInactiva1Texto1(StaticText component) {
        this.listaEsObjecionElePenInactiva1Texto1 = component;
    }

    private IntegerConverter converterEsObjecionElePenInactiva1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsObjecionElePenInactiva1() {
        return converterEsObjecionElePenInactiva1;
    }
  
    public void setConverterEsObjecionElePenInactiva1(IntegerConverter converter) {
        this.converterEsObjecionElePenInactiva1 = converter;
    }
  
    private Label labelFechaUltimaActualizacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimaActualizacion1() {
        return labelFechaUltimaActualizacion1;
    }

    public void setLabelFechaUltimaActualizacion1(Label l) {
        this.labelFechaUltimaActualizacion1 = l;
    }

    private Calendar campoFechaUltimaActualizacion1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimaActualizacion1() {
        return campoFechaUltimaActualizacion1;
    }

    public void setCampoFechaUltimaActualizacion1(Calendar component) {
        this.campoFechaUltimaActualizacion1 = component;
    }

    private HelpInline helpInlineFechaUltimaActualizacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimaActualizacion1() {
        return helpInlineFechaUltimaActualizacion1;
    }

    public void setHelpInlineFechaUltimaActualizacion1(HelpInline hi) {
        this.helpInlineFechaUltimaActualizacion1 = hi;
    }

    private StaticText campoFechaUltimaActualizacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimaActualizacion1Texto1() {
        return campoFechaUltimaActualizacion1Texto1;
    }

    public void setCampoFechaUltimaActualizacion1Texto1(StaticText component) {
        this.campoFechaUltimaActualizacion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaUltimaActualizacion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaUltimaActualizacion1() {
        return converterFechaUltimaActualizacion1;
    }
  
    public void setConverterFechaUltimaActualizacion1(SqlTimestampConverter converter) {
        this.converterFechaUltimaActualizacion1 = converter;
    }
  
    private Label labelNombreArchivoUltimaAct1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivoUltimaAct1() {
        return labelNombreArchivoUltimaAct1;
    }

    public void setLabelNombreArchivoUltimaAct1(Label l) {
        this.labelNombreArchivoUltimaAct1 = l;
    }

    private TextArea campoNombreArchivoUltimaAct1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreArchivoUltimaAct1() {
        return campoNombreArchivoUltimaAct1;
    }

    public void setCampoNombreArchivoUltimaAct1(TextArea component) {
        this.campoNombreArchivoUltimaAct1 = component;
    }

    private HelpInline helpInlineNombreArchivoUltimaAct1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreArchivoUltimaAct1() {
        return helpInlineNombreArchivoUltimaAct1;
    }

    public void setHelpInlineNombreArchivoUltimaAct1(HelpInline hi) {
        this.helpInlineNombreArchivoUltimaAct1 = hi;
    }

    private StaticText campoNombreArchivoUltimaAct1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivoUltimaAct1Texto1() {
        return campoNombreArchivoUltimaAct1Texto1;
    }

    public void setCampoNombreArchivoUltimaAct1Texto1(StaticText component) {
        this.campoNombreArchivoUltimaAct1Texto1 = component;
    }

    private Button campoNombreArchivoUltimaAct1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivoUltimaAct1Boton3() {
        return campoNombreArchivoUltimaAct1Boton3;
    }

    public void setCampoNombreArchivoUltimaAct1Boton3(Button component) {
        this.campoNombreArchivoUltimaAct1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivoUltimaAct1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivoUltimaAct1() {
        return validatorNombreArchivoUltimaAct1;
    }
  
    public void setValidatorNombreArchivoUltimaAct1(LengthValidator validator) {
        this.validatorNombreArchivoUltimaAct1 = validator;
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

    private ObjecionElePenCachedRowSetDataProvider2 objecionElePenDataProvider = new ObjecionElePenCachedRowSetDataProvider2();

    @Override
    public ObjecionElePenCachedRowSetDataProvider2 getObjecionElePenDataProvider() {
        return objecionElePenDataProvider;
    }

    public void setObjecionElePenDataProvider(ObjecionElePenCachedRowSetDataProvider2 crsdp) {
        this.objecionElePenDataProvider = crsdp;
    }

    private PersonaCachedRowSetDataProvider2 personaReferenceDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider() {
        return personaReferenceDataProvider;
    }

    public void setPersonaReferenceDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaReferenceDataProvider = crsdp;
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
    public ObjecionElePen6() {
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
        objecionElePenDataProvider.close();
        personaReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionObjecionElePen...">
    @Override
    public TextField getTextFieldCampoFechaUltimaActualizacion1() {
        return this.getCampoFechaUltimaActualizacion1();
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
    private AsistentePaginaActualizacionObjecionElePen asistente = new AsistentePaginaActualizacionObjecionElePen(this);

    public AsistentePaginaActualizacionObjecionElePen getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ObjecionElePen6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ObjecionElePen6_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getObjecionElePenDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ObjecionElePenCachedRowSetDataProvider2.FUNCION_CONSULTAR_OBJECION_ELE_PEN;
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
    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPersona1_validate(context, component, value);
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
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
