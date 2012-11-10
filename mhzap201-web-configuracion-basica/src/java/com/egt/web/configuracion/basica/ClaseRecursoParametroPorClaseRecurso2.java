/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.basica;

import com.egt.data.general.xdp2.ClaseRecursoParCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoSecCachedRowSetDataProvider2;
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

public class ClaseRecursoParametroPorClaseRecurso2 extends AbstractPageBean
        implements PaginaActualizacionClaseRecursoParPorClaseRecurso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdClaseRecursoPar1.setMinimum(0L);
        validatorIdClaseRecursoPar1.setMaximum(1000000000000000000L);
        validatorIdListaValor1.setMinimum(0L);
        validatorIdListaValor1.setMaximum(1000000000000000000L);
        validatorIdClaseObjetoValor1.setMinimum(0L);
        validatorIdClaseObjetoValor1.setMaximum(1000000000000000000L);
        validatorValorMinimo1.setMaximum(100);
        validatorValorMaximo1.setMaximum(100);
        validatorValorOmision1.setMaximum(100);
        validatorOrdenPresentacion1.setMinimum(0L);
        validatorOrdenPresentacion1.setMaximum(1000000000L);
        validatorIdFuncionReferenciaAlt1.setMinimum(0L);
        validatorIdFuncionReferenciaAlt1.setMaximum(1000000000000000000L);
        validatorIdListaValorAlternativa1.setMinimum(0L);
        validatorIdListaValorAlternativa1.setMaximum(1000000000000000000L);
        validatorIdClaseObjetoValorAlt1.setMinimum(0L);
        validatorIdClaseObjetoValorAlt1.setMaximum(1000000000000000000L);
        validatorIdClaseRecursoValorAlt1.setMinimum(0L);
        validatorIdClaseRecursoValorAlt1.setMaximum(1000000000000000000L);
        validatorOrdenPaginaSeleccion1.setMinimum(0L);
        validatorOrdenPaginaSeleccion1.setMaximum(1000000000L);
        claseRecursoParDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoParRowSet}"));
        claseRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoRowSet}"));
        parametroReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.parametroReferenceRowSet}"));
        funcionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionReferenceRowSet}"));
        claseRecursoReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoReferenceRowSet}"));
        claseRecursoSecReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoSecReferenceRowSet}"));
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

    private Label labelIdClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso1() {
        return labelIdClaseRecurso1;
    }

    public void setLabelIdClaseRecurso1(Label l) {
        this.labelIdClaseRecurso1 = l;
    }

    private Label labelIdClaseRecursoPar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoPar1() {
        return labelIdClaseRecursoPar1;
    }

    public void setLabelIdClaseRecursoPar1(Label l) {
        this.labelIdClaseRecursoPar1 = l;
    }

    private TextField campoIdClaseRecursoPar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoPar1() {
        return campoIdClaseRecursoPar1;
    }

    public void setCampoIdClaseRecursoPar1(TextField component) {
        this.campoIdClaseRecursoPar1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoPar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoPar1() {
        return helpInlineIdClaseRecursoPar1;
    }

    public void setHelpInlineIdClaseRecursoPar1(HelpInline hi) {
        this.helpInlineIdClaseRecursoPar1 = hi;
    }

    private StaticText campoIdClaseRecursoPar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoPar1Texto1() {
        return campoIdClaseRecursoPar1Texto1;
    }

    public void setCampoIdClaseRecursoPar1Texto1(StaticText component) {
        this.campoIdClaseRecursoPar1Texto1 = component;
    }

    private LongConverter converterIdClaseRecursoPar1 = new LongConverter();
  
    public LongConverter getConverterIdClaseRecursoPar1() {
        return converterIdClaseRecursoPar1;
    }
  
    public void setConverterIdClaseRecursoPar1(LongConverter converter) {
        this.converterIdClaseRecursoPar1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseRecursoPar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseRecursoPar1() {
        return validatorIdClaseRecursoPar1;
    }
  
    public void setValidatorIdClaseRecursoPar1(LongRangeValidator validator) {
        this.validatorIdClaseRecursoPar1 = validator;
    }
  
    private Label labelIdParametro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdParametro1() {
        return labelIdParametro1;
    }

    public void setLabelIdParametro1(Label l) {
        this.labelIdParametro1 = l;
    }

    private TextField campoIdParametro1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdParametro1() {
        return campoIdParametro1;
    }

    public void setCampoIdParametro1(TextField component) {
        this.campoIdParametro1 = component;
    }

    private HelpInline helpInlineIdParametro1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdParametro1() {
        return helpInlineIdParametro1;
    }

    public void setHelpInlineIdParametro1(HelpInline hi) {
        this.helpInlineIdParametro1 = hi;
    }

    private StaticText campoIdParametro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdParametro1Texto1() {
        return campoIdParametro1Texto1;
    }

    public void setCampoIdParametro1Texto1(StaticText component) {
        this.campoIdParametro1Texto1 = component;
    }

    private Button campoIdParametro1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdParametro1Boton1() {
        return campoIdParametro1Boton1;
    }

    public void setCampoIdParametro1Boton1(Button component) {
        this.campoIdParametro1Boton1 = component;
    }

    private Button campoIdParametro1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdParametro1Boton3() {
        return campoIdParametro1Boton3;
    }

    public void setCampoIdParametro1Boton3(Button component) {
        this.campoIdParametro1Boton3 = component;
    }

    private Label labelIdParametro2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdParametro2() {
        return labelIdParametro2;
    }

    public void setLabelIdParametro2(Label l) {
        this.labelIdParametro2 = l;
    }

    private StaticText campoIdParametro1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdParametro1Texto2() {
        return campoIdParametro1Texto2;
    }

    public void setCampoIdParametro1Texto2(StaticText component) {
        this.campoIdParametro1Texto2 = component;
    }

    private Button campoIdParametro1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdParametro1Boton2() {
        return campoIdParametro1Boton2;
    }

    public void setCampoIdParametro1Boton2(Button component) {
        this.campoIdParametro1Boton2 = component;
    }

    private Label labelNumeroTipoParametro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoParametro1() {
        return labelNumeroTipoParametro1;
    }

    public void setLabelNumeroTipoParametro1(Label l) {
        this.labelNumeroTipoParametro1 = l;
    }

    private DropDown listaNumeroTipoParametro1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoParametro1() {
        return listaNumeroTipoParametro1;
    }

    public void setListaNumeroTipoParametro1(DropDown component) {
        this.listaNumeroTipoParametro1 = component;
    }

    private HelpInline helpInlineNumeroTipoParametro1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoParametro1() {
        return helpInlineNumeroTipoParametro1;
    }

    public void setHelpInlineNumeroTipoParametro1(HelpInline hi) {
        this.helpInlineNumeroTipoParametro1 = hi;
    }

    private StaticText listaNumeroTipoParametro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoParametro1Texto1() {
        return listaNumeroTipoParametro1Texto1;
    }

    public void setListaNumeroTipoParametro1Texto1(StaticText component) {
        this.listaNumeroTipoParametro1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoParametro1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoParametro1() {
        return converterNumeroTipoParametro1;
    }
  
    public void setConverterNumeroTipoParametro1(IntegerConverter converter) {
        this.converterNumeroTipoParametro1 = converter;
    }
  
    private Label labelNumeroTipoComparacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoComparacion1() {
        return labelNumeroTipoComparacion1;
    }

    public void setLabelNumeroTipoComparacion1(Label l) {
        this.labelNumeroTipoComparacion1 = l;
    }

    private DropDown listaNumeroTipoComparacion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoComparacion1() {
        return listaNumeroTipoComparacion1;
    }

    public void setListaNumeroTipoComparacion1(DropDown component) {
        this.listaNumeroTipoComparacion1 = component;
    }

    private HelpInline helpInlineNumeroTipoComparacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoComparacion1() {
        return helpInlineNumeroTipoComparacion1;
    }

    public void setHelpInlineNumeroTipoComparacion1(HelpInline hi) {
        this.helpInlineNumeroTipoComparacion1 = hi;
    }

    private StaticText listaNumeroTipoComparacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoComparacion1Texto1() {
        return listaNumeroTipoComparacion1Texto1;
    }

    public void setListaNumeroTipoComparacion1Texto1(StaticText component) {
        this.listaNumeroTipoComparacion1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoComparacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoComparacion1() {
        return converterNumeroTipoComparacion1;
    }
  
    public void setConverterNumeroTipoComparacion1(IntegerConverter converter) {
        this.converterNumeroTipoComparacion1 = converter;
    }
  
    private Label labelIdFuncionReferencia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionReferencia1() {
        return labelIdFuncionReferencia1;
    }

    public void setLabelIdFuncionReferencia1(Label l) {
        this.labelIdFuncionReferencia1 = l;
    }

    private TextField campoIdFuncionReferencia1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionReferencia1() {
        return campoIdFuncionReferencia1;
    }

    public void setCampoIdFuncionReferencia1(TextField component) {
        this.campoIdFuncionReferencia1 = component;
    }

    private HelpInline helpInlineIdFuncionReferencia1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionReferencia1() {
        return helpInlineIdFuncionReferencia1;
    }

    public void setHelpInlineIdFuncionReferencia1(HelpInline hi) {
        this.helpInlineIdFuncionReferencia1 = hi;
    }

    private StaticText campoIdFuncionReferencia1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionReferencia1Texto1() {
        return campoIdFuncionReferencia1Texto1;
    }

    public void setCampoIdFuncionReferencia1Texto1(StaticText component) {
        this.campoIdFuncionReferencia1Texto1 = component;
    }

    private Button campoIdFuncionReferencia1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionReferencia1Boton1() {
        return campoIdFuncionReferencia1Boton1;
    }

    public void setCampoIdFuncionReferencia1Boton1(Button component) {
        this.campoIdFuncionReferencia1Boton1 = component;
    }

    private Button campoIdFuncionReferencia1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionReferencia1Boton3() {
        return campoIdFuncionReferencia1Boton3;
    }

    public void setCampoIdFuncionReferencia1Boton3(Button component) {
        this.campoIdFuncionReferencia1Boton3 = component;
    }

    private Label labelIdFuncionReferencia2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionReferencia2() {
        return labelIdFuncionReferencia2;
    }

    public void setLabelIdFuncionReferencia2(Label l) {
        this.labelIdFuncionReferencia2 = l;
    }

    private StaticText campoIdFuncionReferencia1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionReferencia1Texto2() {
        return campoIdFuncionReferencia1Texto2;
    }

    public void setCampoIdFuncionReferencia1Texto2(StaticText component) {
        this.campoIdFuncionReferencia1Texto2 = component;
    }

    private Button campoIdFuncionReferencia1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionReferencia1Boton2() {
        return campoIdFuncionReferencia1Boton2;
    }

    public void setCampoIdFuncionReferencia1Boton2(Button component) {
        this.campoIdFuncionReferencia1Boton2 = component;
    }

    private Label labelNumeroTipoValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoValor1() {
        return labelNumeroTipoValor1;
    }

    public void setLabelNumeroTipoValor1(Label l) {
        this.labelNumeroTipoValor1 = l;
    }

    private DropDown listaNumeroTipoValor1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoValor1() {
        return listaNumeroTipoValor1;
    }

    public void setListaNumeroTipoValor1(DropDown component) {
        this.listaNumeroTipoValor1 = component;
    }

    private HelpInline helpInlineNumeroTipoValor1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoValor1() {
        return helpInlineNumeroTipoValor1;
    }

    public void setHelpInlineNumeroTipoValor1(HelpInline hi) {
        this.helpInlineNumeroTipoValor1 = hi;
    }

    private StaticText listaNumeroTipoValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoValor1Texto1() {
        return listaNumeroTipoValor1Texto1;
    }

    public void setListaNumeroTipoValor1Texto1(StaticText component) {
        this.listaNumeroTipoValor1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoValor1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoValor1() {
        return converterNumeroTipoValor1;
    }
  
    public void setConverterNumeroTipoValor1(IntegerConverter converter) {
        this.converterNumeroTipoValor1 = converter;
    }
  
    private Label labelIdListaValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdListaValor1() {
        return labelIdListaValor1;
    }

    public void setLabelIdListaValor1(Label l) {
        this.labelIdListaValor1 = l;
    }

    private TextField campoIdListaValor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdListaValor1() {
        return campoIdListaValor1;
    }

    public void setCampoIdListaValor1(TextField component) {
        this.campoIdListaValor1 = component;
    }

    private HelpInline helpInlineIdListaValor1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdListaValor1() {
        return helpInlineIdListaValor1;
    }

    public void setHelpInlineIdListaValor1(HelpInline hi) {
        this.helpInlineIdListaValor1 = hi;
    }

    private StaticText campoIdListaValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdListaValor1Texto1() {
        return campoIdListaValor1Texto1;
    }

    public void setCampoIdListaValor1Texto1(StaticText component) {
        this.campoIdListaValor1Texto1 = component;
    }

    private LongConverter converterIdListaValor1 = new LongConverter();
  
    public LongConverter getConverterIdListaValor1() {
        return converterIdListaValor1;
    }
  
    public void setConverterIdListaValor1(LongConverter converter) {
        this.converterIdListaValor1 = converter;
    }
  
    private LongRangeValidator validatorIdListaValor1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdListaValor1() {
        return validatorIdListaValor1;
    }
  
    public void setValidatorIdListaValor1(LongRangeValidator validator) {
        this.validatorIdListaValor1 = validator;
    }
  
    private Label labelIdClaseObjetoValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseObjetoValor1() {
        return labelIdClaseObjetoValor1;
    }

    public void setLabelIdClaseObjetoValor1(Label l) {
        this.labelIdClaseObjetoValor1 = l;
    }

    private TextField campoIdClaseObjetoValor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseObjetoValor1() {
        return campoIdClaseObjetoValor1;
    }

    public void setCampoIdClaseObjetoValor1(TextField component) {
        this.campoIdClaseObjetoValor1 = component;
    }

    private HelpInline helpInlineIdClaseObjetoValor1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseObjetoValor1() {
        return helpInlineIdClaseObjetoValor1;
    }

    public void setHelpInlineIdClaseObjetoValor1(HelpInline hi) {
        this.helpInlineIdClaseObjetoValor1 = hi;
    }

    private StaticText campoIdClaseObjetoValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseObjetoValor1Texto1() {
        return campoIdClaseObjetoValor1Texto1;
    }

    public void setCampoIdClaseObjetoValor1Texto1(StaticText component) {
        this.campoIdClaseObjetoValor1Texto1 = component;
    }

    private LongConverter converterIdClaseObjetoValor1 = new LongConverter();
  
    public LongConverter getConverterIdClaseObjetoValor1() {
        return converterIdClaseObjetoValor1;
    }
  
    public void setConverterIdClaseObjetoValor1(LongConverter converter) {
        this.converterIdClaseObjetoValor1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseObjetoValor1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseObjetoValor1() {
        return validatorIdClaseObjetoValor1;
    }
  
    public void setValidatorIdClaseObjetoValor1(LongRangeValidator validator) {
        this.validatorIdClaseObjetoValor1 = validator;
    }
  
    private Label labelIdClaseRecursoValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoValor1() {
        return labelIdClaseRecursoValor1;
    }

    public void setLabelIdClaseRecursoValor1(Label l) {
        this.labelIdClaseRecursoValor1 = l;
    }

    private TextField campoIdClaseRecursoValor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoValor1() {
        return campoIdClaseRecursoValor1;
    }

    public void setCampoIdClaseRecursoValor1(TextField component) {
        this.campoIdClaseRecursoValor1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoValor1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoValor1() {
        return helpInlineIdClaseRecursoValor1;
    }

    public void setHelpInlineIdClaseRecursoValor1(HelpInline hi) {
        this.helpInlineIdClaseRecursoValor1 = hi;
    }

    private StaticText campoIdClaseRecursoValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoValor1Texto1() {
        return campoIdClaseRecursoValor1Texto1;
    }

    public void setCampoIdClaseRecursoValor1Texto1(StaticText component) {
        this.campoIdClaseRecursoValor1Texto1 = component;
    }

    private Button campoIdClaseRecursoValor1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoValor1Boton1() {
        return campoIdClaseRecursoValor1Boton1;
    }

    public void setCampoIdClaseRecursoValor1Boton1(Button component) {
        this.campoIdClaseRecursoValor1Boton1 = component;
    }

    private Button campoIdClaseRecursoValor1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoValor1Boton3() {
        return campoIdClaseRecursoValor1Boton3;
    }

    public void setCampoIdClaseRecursoValor1Boton3(Button component) {
        this.campoIdClaseRecursoValor1Boton3 = component;
    }

    private Label labelIdClaseRecursoValor2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoValor2() {
        return labelIdClaseRecursoValor2;
    }

    public void setLabelIdClaseRecursoValor2(Label l) {
        this.labelIdClaseRecursoValor2 = l;
    }

    private StaticText campoIdClaseRecursoValor1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdClaseRecursoValor1Texto2() {
        return campoIdClaseRecursoValor1Texto2;
    }

    public void setCampoIdClaseRecursoValor1Texto2(StaticText component) {
        this.campoIdClaseRecursoValor1Texto2 = component;
    }

    private Button campoIdClaseRecursoValor1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoValor1Boton2() {
        return campoIdClaseRecursoValor1Boton2;
    }

    public void setCampoIdClaseRecursoValor1Boton2(Button component) {
        this.campoIdClaseRecursoValor1Boton2 = component;
    }

    private Label labelValorMinimo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorMinimo1() {
        return labelValorMinimo1;
    }

    public void setLabelValorMinimo1(Label l) {
        this.labelValorMinimo1 = l;
    }

    private TextField campoValorMinimo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoValorMinimo1() {
        return campoValorMinimo1;
    }

    public void setCampoValorMinimo1(TextField component) {
        this.campoValorMinimo1 = component;
    }

    private HelpInline helpInlineValorMinimo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineValorMinimo1() {
        return helpInlineValorMinimo1;
    }

    public void setHelpInlineValorMinimo1(HelpInline hi) {
        this.helpInlineValorMinimo1 = hi;
    }

    private StaticText campoValorMinimo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorMinimo1Texto1() {
        return campoValorMinimo1Texto1;
    }

    public void setCampoValorMinimo1Texto1(StaticText component) {
        this.campoValorMinimo1Texto1 = component;
    }

    private LengthValidator validatorValorMinimo1 = new LengthValidator();
  
    public LengthValidator getValidatorValorMinimo1() {
        return validatorValorMinimo1;
    }
  
    public void setValidatorValorMinimo1(LengthValidator validator) {
        this.validatorValorMinimo1 = validator;
    }
  
    private Label labelValorMaximo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorMaximo1() {
        return labelValorMaximo1;
    }

    public void setLabelValorMaximo1(Label l) {
        this.labelValorMaximo1 = l;
    }

    private TextField campoValorMaximo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoValorMaximo1() {
        return campoValorMaximo1;
    }

    public void setCampoValorMaximo1(TextField component) {
        this.campoValorMaximo1 = component;
    }

    private HelpInline helpInlineValorMaximo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineValorMaximo1() {
        return helpInlineValorMaximo1;
    }

    public void setHelpInlineValorMaximo1(HelpInline hi) {
        this.helpInlineValorMaximo1 = hi;
    }

    private StaticText campoValorMaximo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorMaximo1Texto1() {
        return campoValorMaximo1Texto1;
    }

    public void setCampoValorMaximo1Texto1(StaticText component) {
        this.campoValorMaximo1Texto1 = component;
    }

    private LengthValidator validatorValorMaximo1 = new LengthValidator();
  
    public LengthValidator getValidatorValorMaximo1() {
        return validatorValorMaximo1;
    }
  
    public void setValidatorValorMaximo1(LengthValidator validator) {
        this.validatorValorMaximo1 = validator;
    }
  
    private Label labelValorOmision1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorOmision1() {
        return labelValorOmision1;
    }

    public void setLabelValorOmision1(Label l) {
        this.labelValorOmision1 = l;
    }

    private TextField campoValorOmision1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoValorOmision1() {
        return campoValorOmision1;
    }

    public void setCampoValorOmision1(TextField component) {
        this.campoValorOmision1 = component;
    }

    private HelpInline helpInlineValorOmision1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineValorOmision1() {
        return helpInlineValorOmision1;
    }

    public void setHelpInlineValorOmision1(HelpInline hi) {
        this.helpInlineValorOmision1 = hi;
    }

    private StaticText campoValorOmision1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorOmision1Texto1() {
        return campoValorOmision1Texto1;
    }

    public void setCampoValorOmision1Texto1(StaticText component) {
        this.campoValorOmision1Texto1 = component;
    }

    private LengthValidator validatorValorOmision1 = new LengthValidator();
  
    public LengthValidator getValidatorValorOmision1() {
        return validatorValorOmision1;
    }
  
    public void setValidatorValorOmision1(LengthValidator validator) {
        this.validatorValorOmision1 = validator;
    }
  
    private Label labelEsParametroOmisible1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroOmisible1() {
        return labelEsParametroOmisible1;
    }

    public void setLabelEsParametroOmisible1(Label l) {
        this.labelEsParametroOmisible1 = l;
    }

    private DropDown listaEsParametroOmisible1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroOmisible1() {
        return listaEsParametroOmisible1;
    }

    public void setListaEsParametroOmisible1(DropDown component) {
        this.listaEsParametroOmisible1 = component;
    }

    private HelpInline helpInlineEsParametroOmisible1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroOmisible1() {
        return helpInlineEsParametroOmisible1;
    }

    public void setHelpInlineEsParametroOmisible1(HelpInline hi) {
        this.helpInlineEsParametroOmisible1 = hi;
    }

    private StaticText listaEsParametroOmisible1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroOmisible1Texto1() {
        return listaEsParametroOmisible1Texto1;
    }

    public void setListaEsParametroOmisible1Texto1(StaticText component) {
        this.listaEsParametroOmisible1Texto1 = component;
    }

    private IntegerConverter converterEsParametroOmisible1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroOmisible1() {
        return converterEsParametroOmisible1;
    }
  
    public void setConverterEsParametroOmisible1(IntegerConverter converter) {
        this.converterEsParametroOmisible1 = converter;
    }
  
    private Label labelEsParametroInmutable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroInmutable1() {
        return labelEsParametroInmutable1;
    }

    public void setLabelEsParametroInmutable1(Label l) {
        this.labelEsParametroInmutable1 = l;
    }

    private DropDown listaEsParametroInmutable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroInmutable1() {
        return listaEsParametroInmutable1;
    }

    public void setListaEsParametroInmutable1(DropDown component) {
        this.listaEsParametroInmutable1 = component;
    }

    private HelpInline helpInlineEsParametroInmutable1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroInmutable1() {
        return helpInlineEsParametroInmutable1;
    }

    public void setHelpInlineEsParametroInmutable1(HelpInline hi) {
        this.helpInlineEsParametroInmutable1 = hi;
    }

    private StaticText listaEsParametroInmutable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroInmutable1Texto1() {
        return listaEsParametroInmutable1Texto1;
    }

    public void setListaEsParametroInmutable1Texto1(StaticText component) {
        this.listaEsParametroInmutable1Texto1 = component;
    }

    private IntegerConverter converterEsParametroInmutable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroInmutable1() {
        return converterEsParametroInmutable1;
    }
  
    public void setConverterEsParametroInmutable1(IntegerConverter converter) {
        this.converterEsParametroInmutable1 = converter;
    }
  
    private Label labelEsParametroSubmit1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroSubmit1() {
        return labelEsParametroSubmit1;
    }

    public void setLabelEsParametroSubmit1(Label l) {
        this.labelEsParametroSubmit1 = l;
    }

    private DropDown listaEsParametroSubmit1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroSubmit1() {
        return listaEsParametroSubmit1;
    }

    public void setListaEsParametroSubmit1(DropDown component) {
        this.listaEsParametroSubmit1 = component;
    }

    private HelpInline helpInlineEsParametroSubmit1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroSubmit1() {
        return helpInlineEsParametroSubmit1;
    }

    public void setHelpInlineEsParametroSubmit1(HelpInline hi) {
        this.helpInlineEsParametroSubmit1 = hi;
    }

    private StaticText listaEsParametroSubmit1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroSubmit1Texto1() {
        return listaEsParametroSubmit1Texto1;
    }

    public void setListaEsParametroSubmit1Texto1(StaticText component) {
        this.listaEsParametroSubmit1Texto1 = component;
    }

    private IntegerConverter converterEsParametroSubmit1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroSubmit1() {
        return converterEsParametroSubmit1;
    }
  
    public void setConverterEsParametroSubmit1(IntegerConverter converter) {
        this.converterEsParametroSubmit1 = converter;
    }
  
    private Label labelEsParametroPrimordial1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroPrimordial1() {
        return labelEsParametroPrimordial1;
    }

    public void setLabelEsParametroPrimordial1(Label l) {
        this.labelEsParametroPrimordial1 = l;
    }

    private DropDown listaEsParametroPrimordial1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroPrimordial1() {
        return listaEsParametroPrimordial1;
    }

    public void setListaEsParametroPrimordial1(DropDown component) {
        this.listaEsParametroPrimordial1 = component;
    }

    private HelpInline helpInlineEsParametroPrimordial1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroPrimordial1() {
        return helpInlineEsParametroPrimordial1;
    }

    public void setHelpInlineEsParametroPrimordial1(HelpInline hi) {
        this.helpInlineEsParametroPrimordial1 = hi;
    }

    private StaticText listaEsParametroPrimordial1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroPrimordial1Texto1() {
        return listaEsParametroPrimordial1Texto1;
    }

    public void setListaEsParametroPrimordial1Texto1(StaticText component) {
        this.listaEsParametroPrimordial1Texto1 = component;
    }

    private IntegerConverter converterEsParametroPrimordial1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroPrimordial1() {
        return converterEsParametroPrimordial1;
    }
  
    public void setConverterEsParametroPrimordial1(IntegerConverter converter) {
        this.converterEsParametroPrimordial1 = converter;
    }
  
    private Label labelEsParametroMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroMaestro1() {
        return labelEsParametroMaestro1;
    }

    public void setLabelEsParametroMaestro1(Label l) {
        this.labelEsParametroMaestro1 = l;
    }

    private DropDown listaEsParametroMaestro1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroMaestro1() {
        return listaEsParametroMaestro1;
    }

    public void setListaEsParametroMaestro1(DropDown component) {
        this.listaEsParametroMaestro1 = component;
    }

    private HelpInline helpInlineEsParametroMaestro1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroMaestro1() {
        return helpInlineEsParametroMaestro1;
    }

    public void setHelpInlineEsParametroMaestro1(HelpInline hi) {
        this.helpInlineEsParametroMaestro1 = hi;
    }

    private StaticText listaEsParametroMaestro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroMaestro1Texto1() {
        return listaEsParametroMaestro1Texto1;
    }

    public void setListaEsParametroMaestro1Texto1(StaticText component) {
        this.listaEsParametroMaestro1Texto1 = component;
    }

    private IntegerConverter converterEsParametroMaestro1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroMaestro1() {
        return converterEsParametroMaestro1;
    }
  
    public void setConverterEsParametroMaestro1(IntegerConverter converter) {
        this.converterEsParametroMaestro1 = converter;
    }
  
    private Label labelEsParametroSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroSegmento1() {
        return labelEsParametroSegmento1;
    }

    public void setLabelEsParametroSegmento1(Label l) {
        this.labelEsParametroSegmento1 = l;
    }

    private DropDown listaEsParametroSegmento1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroSegmento1() {
        return listaEsParametroSegmento1;
    }

    public void setListaEsParametroSegmento1(DropDown component) {
        this.listaEsParametroSegmento1 = component;
    }

    private HelpInline helpInlineEsParametroSegmento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroSegmento1() {
        return helpInlineEsParametroSegmento1;
    }

    public void setHelpInlineEsParametroSegmento1(HelpInline hi) {
        this.helpInlineEsParametroSegmento1 = hi;
    }

    private StaticText listaEsParametroSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroSegmento1Texto1() {
        return listaEsParametroSegmento1Texto1;
    }

    public void setListaEsParametroSegmento1Texto1(StaticText component) {
        this.listaEsParametroSegmento1Texto1 = component;
    }

    private IntegerConverter converterEsParametroSegmento1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroSegmento1() {
        return converterEsParametroSegmento1;
    }
  
    public void setConverterEsParametroSegmento1(IntegerConverter converter) {
        this.converterEsParametroSegmento1 = converter;
    }
  
    private Label labelEsParametroSinRastro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroSinRastro1() {
        return labelEsParametroSinRastro1;
    }

    public void setLabelEsParametroSinRastro1(Label l) {
        this.labelEsParametroSinRastro1 = l;
    }

    private DropDown listaEsParametroSinRastro1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroSinRastro1() {
        return listaEsParametroSinRastro1;
    }

    public void setListaEsParametroSinRastro1(DropDown component) {
        this.listaEsParametroSinRastro1 = component;
    }

    private HelpInline helpInlineEsParametroSinRastro1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroSinRastro1() {
        return helpInlineEsParametroSinRastro1;
    }

    public void setHelpInlineEsParametroSinRastro1(HelpInline hi) {
        this.helpInlineEsParametroSinRastro1 = hi;
    }

    private StaticText listaEsParametroSinRastro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroSinRastro1Texto1() {
        return listaEsParametroSinRastro1Texto1;
    }

    public void setListaEsParametroSinRastro1Texto1(StaticText component) {
        this.listaEsParametroSinRastro1Texto1 = component;
    }

    private IntegerConverter converterEsParametroSinRastro1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroSinRastro1() {
        return converterEsParametroSinRastro1;
    }
  
    public void setConverterEsParametroSinRastro1(IntegerConverter converter) {
        this.converterEsParametroSinRastro1 = converter;
    }
  
    private Label labelEsParametroSincronizado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroSincronizado1() {
        return labelEsParametroSincronizado1;
    }

    public void setLabelEsParametroSincronizado1(Label l) {
        this.labelEsParametroSincronizado1 = l;
    }

    private DropDown listaEsParametroSincronizado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroSincronizado1() {
        return listaEsParametroSincronizado1;
    }

    public void setListaEsParametroSincronizado1(DropDown component) {
        this.listaEsParametroSincronizado1 = component;
    }

    private HelpInline helpInlineEsParametroSincronizado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParametroSincronizado1() {
        return helpInlineEsParametroSincronizado1;
    }

    public void setHelpInlineEsParametroSincronizado1(HelpInline hi) {
        this.helpInlineEsParametroSincronizado1 = hi;
    }

    private StaticText listaEsParametroSincronizado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroSincronizado1Texto1() {
        return listaEsParametroSincronizado1Texto1;
    }

    public void setListaEsParametroSincronizado1Texto1(StaticText component) {
        this.listaEsParametroSincronizado1Texto1 = component;
    }

    private IntegerConverter converterEsParametroSincronizado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroSincronizado1() {
        return converterEsParametroSincronizado1;
    }
  
    public void setConverterEsParametroSincronizado1(IntegerConverter converter) {
        this.converterEsParametroSincronizado1 = converter;
    }
  
    private Label labelOrdenPresentacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOrdenPresentacion1() {
        return labelOrdenPresentacion1;
    }

    public void setLabelOrdenPresentacion1(Label l) {
        this.labelOrdenPresentacion1 = l;
    }

    private TextField campoOrdenPresentacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOrdenPresentacion1() {
        return campoOrdenPresentacion1;
    }

    public void setCampoOrdenPresentacion1(TextField component) {
        this.campoOrdenPresentacion1 = component;
    }

    private HelpInline helpInlineOrdenPresentacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOrdenPresentacion1() {
        return helpInlineOrdenPresentacion1;
    }

    public void setHelpInlineOrdenPresentacion1(HelpInline hi) {
        this.helpInlineOrdenPresentacion1 = hi;
    }

    private StaticText campoOrdenPresentacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOrdenPresentacion1Texto1() {
        return campoOrdenPresentacion1Texto1;
    }

    public void setCampoOrdenPresentacion1Texto1(StaticText component) {
        this.campoOrdenPresentacion1Texto1 = component;
    }

    private IntegerConverter converterOrdenPresentacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterOrdenPresentacion1() {
        return converterOrdenPresentacion1;
    }
  
    public void setConverterOrdenPresentacion1(IntegerConverter converter) {
        this.converterOrdenPresentacion1 = converter;
    }
  
    private LongRangeValidator validatorOrdenPresentacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorOrdenPresentacion1() {
        return validatorOrdenPresentacion1;
    }
  
    public void setValidatorOrdenPresentacion1(LongRangeValidator validator) {
        this.validatorOrdenPresentacion1 = validator;
    }
  
    private Label labelIdClaseRecursoSec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSec1() {
        return labelIdClaseRecursoSec1;
    }

    public void setLabelIdClaseRecursoSec1(Label l) {
        this.labelIdClaseRecursoSec1 = l;
    }

    private TextField campoIdClaseRecursoSec1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoSec1() {
        return campoIdClaseRecursoSec1;
    }

    public void setCampoIdClaseRecursoSec1(TextField component) {
        this.campoIdClaseRecursoSec1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoSec1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoSec1() {
        return helpInlineIdClaseRecursoSec1;
    }

    public void setHelpInlineIdClaseRecursoSec1(HelpInline hi) {
        this.helpInlineIdClaseRecursoSec1 = hi;
    }

    private StaticText campoIdClaseRecursoSec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoSec1Texto1() {
        return campoIdClaseRecursoSec1Texto1;
    }

    public void setCampoIdClaseRecursoSec1Texto1(StaticText component) {
        this.campoIdClaseRecursoSec1Texto1 = component;
    }

    private Button campoIdClaseRecursoSec1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoSec1Boton1() {
        return campoIdClaseRecursoSec1Boton1;
    }

    public void setCampoIdClaseRecursoSec1Boton1(Button component) {
        this.campoIdClaseRecursoSec1Boton1 = component;
    }

    private Button campoIdClaseRecursoSec1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoSec1Boton3() {
        return campoIdClaseRecursoSec1Boton3;
    }

    public void setCampoIdClaseRecursoSec1Boton3(Button component) {
        this.campoIdClaseRecursoSec1Boton3 = component;
    }

    private Label labelIdClaseRecursoSec2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSec2() {
        return labelIdClaseRecursoSec2;
    }

    public void setLabelIdClaseRecursoSec2(Label l) {
        this.labelIdClaseRecursoSec2 = l;
    }

    private StaticText campoIdClaseRecursoSec1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdClaseRecursoSec1Texto2() {
        return campoIdClaseRecursoSec1Texto2;
    }

    public void setCampoIdClaseRecursoSec1Texto2(StaticText component) {
        this.campoIdClaseRecursoSec1Texto2 = component;
    }

    private Button campoIdClaseRecursoSec1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoSec1Boton2() {
        return campoIdClaseRecursoSec1Boton2;
    }

    public void setCampoIdClaseRecursoSec1Boton2(Button component) {
        this.campoIdClaseRecursoSec1Boton2 = component;
    }

    private Label labelEsReferenciaAlternativa1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsReferenciaAlternativa1() {
        return labelEsReferenciaAlternativa1;
    }

    public void setLabelEsReferenciaAlternativa1(Label l) {
        this.labelEsReferenciaAlternativa1 = l;
    }

    private DropDown listaEsReferenciaAlternativa1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsReferenciaAlternativa1() {
        return listaEsReferenciaAlternativa1;
    }

    public void setListaEsReferenciaAlternativa1(DropDown component) {
        this.listaEsReferenciaAlternativa1 = component;
    }

    private HelpInline helpInlineEsReferenciaAlternativa1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsReferenciaAlternativa1() {
        return helpInlineEsReferenciaAlternativa1;
    }

    public void setHelpInlineEsReferenciaAlternativa1(HelpInline hi) {
        this.helpInlineEsReferenciaAlternativa1 = hi;
    }

    private StaticText listaEsReferenciaAlternativa1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsReferenciaAlternativa1Texto1() {
        return listaEsReferenciaAlternativa1Texto1;
    }

    public void setListaEsReferenciaAlternativa1Texto1(StaticText component) {
        this.listaEsReferenciaAlternativa1Texto1 = component;
    }

    private IntegerConverter converterEsReferenciaAlternativa1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsReferenciaAlternativa1() {
        return converterEsReferenciaAlternativa1;
    }
  
    public void setConverterEsReferenciaAlternativa1(IntegerConverter converter) {
        this.converterEsReferenciaAlternativa1 = converter;
    }
  
    private Label labelNumeroTipoValorAlternativo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoValorAlternativo1() {
        return labelNumeroTipoValorAlternativo1;
    }

    public void setLabelNumeroTipoValorAlternativo1(Label l) {
        this.labelNumeroTipoValorAlternativo1 = l;
    }

    private DropDown listaNumeroTipoValorAlternativo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoValorAlternativo1() {
        return listaNumeroTipoValorAlternativo1;
    }

    public void setListaNumeroTipoValorAlternativo1(DropDown component) {
        this.listaNumeroTipoValorAlternativo1 = component;
    }

    private HelpInline helpInlineNumeroTipoValorAlternativo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoValorAlternativo1() {
        return helpInlineNumeroTipoValorAlternativo1;
    }

    public void setHelpInlineNumeroTipoValorAlternativo1(HelpInline hi) {
        this.helpInlineNumeroTipoValorAlternativo1 = hi;
    }

    private StaticText listaNumeroTipoValorAlternativo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoValorAlternativo1Texto1() {
        return listaNumeroTipoValorAlternativo1Texto1;
    }

    public void setListaNumeroTipoValorAlternativo1Texto1(StaticText component) {
        this.listaNumeroTipoValorAlternativo1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoValorAlternativo1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoValorAlternativo1() {
        return converterNumeroTipoValorAlternativo1;
    }
  
    public void setConverterNumeroTipoValorAlternativo1(IntegerConverter converter) {
        this.converterNumeroTipoValorAlternativo1 = converter;
    }
  
    private Label labelIdFuncionReferenciaAlt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionReferenciaAlt1() {
        return labelIdFuncionReferenciaAlt1;
    }

    public void setLabelIdFuncionReferenciaAlt1(Label l) {
        this.labelIdFuncionReferenciaAlt1 = l;
    }

    private TextField campoIdFuncionReferenciaAlt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionReferenciaAlt1() {
        return campoIdFuncionReferenciaAlt1;
    }

    public void setCampoIdFuncionReferenciaAlt1(TextField component) {
        this.campoIdFuncionReferenciaAlt1 = component;
    }

    private HelpInline helpInlineIdFuncionReferenciaAlt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionReferenciaAlt1() {
        return helpInlineIdFuncionReferenciaAlt1;
    }

    public void setHelpInlineIdFuncionReferenciaAlt1(HelpInline hi) {
        this.helpInlineIdFuncionReferenciaAlt1 = hi;
    }

    private StaticText campoIdFuncionReferenciaAlt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionReferenciaAlt1Texto1() {
        return campoIdFuncionReferenciaAlt1Texto1;
    }

    public void setCampoIdFuncionReferenciaAlt1Texto1(StaticText component) {
        this.campoIdFuncionReferenciaAlt1Texto1 = component;
    }

    private LongConverter converterIdFuncionReferenciaAlt1 = new LongConverter();
  
    public LongConverter getConverterIdFuncionReferenciaAlt1() {
        return converterIdFuncionReferenciaAlt1;
    }
  
    public void setConverterIdFuncionReferenciaAlt1(LongConverter converter) {
        this.converterIdFuncionReferenciaAlt1 = converter;
    }
  
    private LongRangeValidator validatorIdFuncionReferenciaAlt1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdFuncionReferenciaAlt1() {
        return validatorIdFuncionReferenciaAlt1;
    }
  
    public void setValidatorIdFuncionReferenciaAlt1(LongRangeValidator validator) {
        this.validatorIdFuncionReferenciaAlt1 = validator;
    }
  
    private Label labelIdListaValorAlternativa1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdListaValorAlternativa1() {
        return labelIdListaValorAlternativa1;
    }

    public void setLabelIdListaValorAlternativa1(Label l) {
        this.labelIdListaValorAlternativa1 = l;
    }

    private TextField campoIdListaValorAlternativa1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdListaValorAlternativa1() {
        return campoIdListaValorAlternativa1;
    }

    public void setCampoIdListaValorAlternativa1(TextField component) {
        this.campoIdListaValorAlternativa1 = component;
    }

    private HelpInline helpInlineIdListaValorAlternativa1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdListaValorAlternativa1() {
        return helpInlineIdListaValorAlternativa1;
    }

    public void setHelpInlineIdListaValorAlternativa1(HelpInline hi) {
        this.helpInlineIdListaValorAlternativa1 = hi;
    }

    private StaticText campoIdListaValorAlternativa1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdListaValorAlternativa1Texto1() {
        return campoIdListaValorAlternativa1Texto1;
    }

    public void setCampoIdListaValorAlternativa1Texto1(StaticText component) {
        this.campoIdListaValorAlternativa1Texto1 = component;
    }

    private LongConverter converterIdListaValorAlternativa1 = new LongConverter();
  
    public LongConverter getConverterIdListaValorAlternativa1() {
        return converterIdListaValorAlternativa1;
    }
  
    public void setConverterIdListaValorAlternativa1(LongConverter converter) {
        this.converterIdListaValorAlternativa1 = converter;
    }
  
    private LongRangeValidator validatorIdListaValorAlternativa1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdListaValorAlternativa1() {
        return validatorIdListaValorAlternativa1;
    }
  
    public void setValidatorIdListaValorAlternativa1(LongRangeValidator validator) {
        this.validatorIdListaValorAlternativa1 = validator;
    }
  
    private Label labelIdClaseObjetoValorAlt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseObjetoValorAlt1() {
        return labelIdClaseObjetoValorAlt1;
    }

    public void setLabelIdClaseObjetoValorAlt1(Label l) {
        this.labelIdClaseObjetoValorAlt1 = l;
    }

    private TextField campoIdClaseObjetoValorAlt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseObjetoValorAlt1() {
        return campoIdClaseObjetoValorAlt1;
    }

    public void setCampoIdClaseObjetoValorAlt1(TextField component) {
        this.campoIdClaseObjetoValorAlt1 = component;
    }

    private HelpInline helpInlineIdClaseObjetoValorAlt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseObjetoValorAlt1() {
        return helpInlineIdClaseObjetoValorAlt1;
    }

    public void setHelpInlineIdClaseObjetoValorAlt1(HelpInline hi) {
        this.helpInlineIdClaseObjetoValorAlt1 = hi;
    }

    private StaticText campoIdClaseObjetoValorAlt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseObjetoValorAlt1Texto1() {
        return campoIdClaseObjetoValorAlt1Texto1;
    }

    public void setCampoIdClaseObjetoValorAlt1Texto1(StaticText component) {
        this.campoIdClaseObjetoValorAlt1Texto1 = component;
    }

    private LongConverter converterIdClaseObjetoValorAlt1 = new LongConverter();
  
    public LongConverter getConverterIdClaseObjetoValorAlt1() {
        return converterIdClaseObjetoValorAlt1;
    }
  
    public void setConverterIdClaseObjetoValorAlt1(LongConverter converter) {
        this.converterIdClaseObjetoValorAlt1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseObjetoValorAlt1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseObjetoValorAlt1() {
        return validatorIdClaseObjetoValorAlt1;
    }
  
    public void setValidatorIdClaseObjetoValorAlt1(LongRangeValidator validator) {
        this.validatorIdClaseObjetoValorAlt1 = validator;
    }
  
    private Label labelIdClaseRecursoValorAlt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoValorAlt1() {
        return labelIdClaseRecursoValorAlt1;
    }

    public void setLabelIdClaseRecursoValorAlt1(Label l) {
        this.labelIdClaseRecursoValorAlt1 = l;
    }

    private TextField campoIdClaseRecursoValorAlt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoValorAlt1() {
        return campoIdClaseRecursoValorAlt1;
    }

    public void setCampoIdClaseRecursoValorAlt1(TextField component) {
        this.campoIdClaseRecursoValorAlt1 = component;
    }

    private HelpInline helpInlineIdClaseRecursoValorAlt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdClaseRecursoValorAlt1() {
        return helpInlineIdClaseRecursoValorAlt1;
    }

    public void setHelpInlineIdClaseRecursoValorAlt1(HelpInline hi) {
        this.helpInlineIdClaseRecursoValorAlt1 = hi;
    }

    private StaticText campoIdClaseRecursoValorAlt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoValorAlt1Texto1() {
        return campoIdClaseRecursoValorAlt1Texto1;
    }

    public void setCampoIdClaseRecursoValorAlt1Texto1(StaticText component) {
        this.campoIdClaseRecursoValorAlt1Texto1 = component;
    }

    private LongConverter converterIdClaseRecursoValorAlt1 = new LongConverter();
  
    public LongConverter getConverterIdClaseRecursoValorAlt1() {
        return converterIdClaseRecursoValorAlt1;
    }
  
    public void setConverterIdClaseRecursoValorAlt1(LongConverter converter) {
        this.converterIdClaseRecursoValorAlt1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseRecursoValorAlt1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseRecursoValorAlt1() {
        return validatorIdClaseRecursoValorAlt1;
    }
  
    public void setValidatorIdClaseRecursoValorAlt1(LongRangeValidator validator) {
        this.validatorIdClaseRecursoValorAlt1 = validator;
    }
  
    private Label labelOrdenPaginaSeleccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOrdenPaginaSeleccion1() {
        return labelOrdenPaginaSeleccion1;
    }

    public void setLabelOrdenPaginaSeleccion1(Label l) {
        this.labelOrdenPaginaSeleccion1 = l;
    }

    private TextField campoOrdenPaginaSeleccion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOrdenPaginaSeleccion1() {
        return campoOrdenPaginaSeleccion1;
    }

    public void setCampoOrdenPaginaSeleccion1(TextField component) {
        this.campoOrdenPaginaSeleccion1 = component;
    }

    private HelpInline helpInlineOrdenPaginaSeleccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOrdenPaginaSeleccion1() {
        return helpInlineOrdenPaginaSeleccion1;
    }

    public void setHelpInlineOrdenPaginaSeleccion1(HelpInline hi) {
        this.helpInlineOrdenPaginaSeleccion1 = hi;
    }

    private StaticText campoOrdenPaginaSeleccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOrdenPaginaSeleccion1Texto1() {
        return campoOrdenPaginaSeleccion1Texto1;
    }

    public void setCampoOrdenPaginaSeleccion1Texto1(StaticText component) {
        this.campoOrdenPaginaSeleccion1Texto1 = component;
    }

    private IntegerConverter converterOrdenPaginaSeleccion1 = new IntegerConverter();
  
    public IntegerConverter getConverterOrdenPaginaSeleccion1() {
        return converterOrdenPaginaSeleccion1;
    }
  
    public void setConverterOrdenPaginaSeleccion1(IntegerConverter converter) {
        this.converterOrdenPaginaSeleccion1 = converter;
    }
  
    private LongRangeValidator validatorOrdenPaginaSeleccion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorOrdenPaginaSeleccion1() {
        return validatorOrdenPaginaSeleccion1;
    }
  
    public void setValidatorOrdenPaginaSeleccion1(LongRangeValidator validator) {
        this.validatorOrdenPaginaSeleccion1 = validator;
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

    private ImageHyperlink imageHyperlink2 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink component) {
        this.imageHyperlink2 = component;
    }

    private ImageHyperlink imageHyperlink3 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink3() {
        return imageHyperlink3;
    }

    public void setImageHyperlink3(ImageHyperlink component) {
        this.imageHyperlink3 = component;
    }

    private ClaseRecursoParCachedRowSetDataProvider2 claseRecursoParDataProvider = new ClaseRecursoParCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoParCachedRowSetDataProvider2 getClaseRecursoParDataProvider() {
        return claseRecursoParDataProvider;
    }

    public void setClaseRecursoParDataProvider(ClaseRecursoParCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoParDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider() {
        return claseRecursoDataProvider;
    }

    public void setClaseRecursoDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoDataProvider = crsdp;
    }

    private ParametroCachedRowSetDataProvider2 parametroReferenceDataProvider = new ParametroCachedRowSetDataProvider2();

    @Override
    public ParametroCachedRowSetDataProvider2 getParametroReferenceDataProvider() {
        return parametroReferenceDataProvider;
    }

    public void setParametroReferenceDataProvider(ParametroCachedRowSetDataProvider2 crsdp) {
        this.parametroReferenceDataProvider = crsdp;
    }

    private FuncionCachedRowSetDataProvider2 funcionReferenceDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider() {
        return funcionReferenceDataProvider;
    }

    public void setFuncionReferenceDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionReferenceDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoReferenceDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider() {
        return claseRecursoReferenceDataProvider;
    }

    public void setClaseRecursoReferenceDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoReferenceDataProvider = crsdp;
    }

    private ClaseRecursoSecCachedRowSetDataProvider2 claseRecursoSecReferenceDataProvider = new ClaseRecursoSecCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoSecCachedRowSetDataProvider2 getClaseRecursoSecReferenceDataProvider() {
        return claseRecursoSecReferenceDataProvider;
    }

    public void setClaseRecursoSecReferenceDataProvider(ClaseRecursoSecCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoSecReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ClaseRecursoParametroPorClaseRecurso2() {
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
        claseRecursoParDataProvider.close();
        claseRecursoDataProvider.close();
        parametroReferenceDataProvider.close();
        funcionReferenceDataProvider.close();
        claseRecursoReferenceDataProvider.close();
        claseRecursoSecReferenceDataProvider.close();
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
    @Override
    public String getEtiquetaClaseMaestro() {
        return ETIQUETA_CLASE_MAESTRO;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionClaseRecursoPar...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionClaseRecursoParPorClaseRecurso asistente = new AsistentePaginaActualizacionClaseRecursoParPorClaseRecurso(this);

    public AsistentePaginaActualizacionClaseRecursoParPorClaseRecurso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ClaseRecursoParametroPorClaseRecurso2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ClaseRecursoParametroPorClaseRecurso2_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getClaseRecursoParDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ClaseRecursoParCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO_PAR;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ClaseRecursoParCachedRowSetDataProvider2.FUNCION_CREAR_CLASE_RECURSO_PAR;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ClaseRecursoParCachedRowSetDataProvider2.FUNCION_MODIFICAR_CLASE_RECURSO_PAR;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ClaseRecursoParCachedRowSetDataProvider2.FUNCION_ELIMINAR_CLASE_RECURSO_PAR;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        return this.getAsistente().getOpcionesListaFuncionAccion();
    }

    @Override
    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return this.getClaseRecursoDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return ClaseRecursoParCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO;
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
    public void campoIdParametro1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdParametro1_validate(context, component, value);
    }

    public void campoIdFuncionReferencia1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionReferencia1_validate(context, component, value);
    }

    public void campoIdClaseRecursoValor1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoValor1_validate(context, component, value);
    }

    public void campoIdClaseRecursoSec1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoSec1_validate(context, component, value);
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

    public String imageHyperlink2_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case2";
    }

    public String imageHyperlink3_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case3";
    }

    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
