/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.web.filtro;

import com.egt.base.constants.CBM2;
import com.egt.base.constants.CPP;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.enums.EnumTipoParametro;
import com.egt.base.enums.EnumTipoRecurso;
import com.egt.base.enums.EnumTipoValor;
import com.egt.base.persistence.entity.FuncionBase;
import com.egt.base.persistence.entity.FuncionParametroBase;
import com.egt.commons.list.ListOptions;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.data.general.xdp3.FiltroFuncionParCachedRowSetDataProvider3;
import com.sun.data.provider.RowKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class FiltroFuncionParSidekick {

    private FiltroFuncionParPageBean bean;

    public FiltroFuncionParSidekick() {
    }

    public FiltroFuncionParSidekick(FiltroFuncionParPageBean callbackPageBean) {
        bean = callbackPageBean;
    }

    public void validateIdFuncionParametro(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Long) {
            RowKey rowKey = bean.getGestor().getCurrentRowKey();
            bean.getFiltroFuncionParDataProvider().setIdFuncionParametro(rowKey, (Long) value);
        }
    }

    public void validateValorParametro(FacesContext context, UIComponent component, Object value) {
        if (value instanceof String) {
            String string = (String) value;
            RowKey rowKey = bean.getGestor().getCurrentRowKey();
            EnumTipoDatoPar tipo = bean.getFiltroFuncionParDataProvider().getEnumTipoDatoPar(rowKey);
            if (tipo != null) {
                Object object = STP.getObjeto(string, tipo);
                if (object == null) {
                    String mensaje = Bitacora.getTextoMensaje(CBM2.CHECK_CHANGES_EXCEPTION_4, tipo.getLabel());
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, null);
                    throw new ValidatorException(message);
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="métodos para establecer la propiedad rendered">
    public boolean isFilaTipoValorContinuo() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        EnumTipoValor tv = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
        EnumTipoDatoPar td = bean.getFiltroFuncionParDataProvider().getEnumTipoDatoPar(rowKey);
        return EnumTipoValor.CONTINUO.equals(tv) && !EnumTipoDatoPar.FECHA_HORA.equals(td);
    }

    public boolean isFilaTipoValorContinuoFechaHora() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        EnumTipoValor tv = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
        EnumTipoDatoPar td = bean.getFiltroFuncionParDataProvider().getEnumTipoDatoPar(rowKey);
        return EnumTipoValor.CONTINUO.equals(tv) && EnumTipoDatoPar.FECHA_HORA.equals(td);
    }

    public boolean isFilaTipoValorDiscreto() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        EnumTipoValor e = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
        return EnumTipoValor.DISCRETO.equals(e);
    }

    public boolean isFilaTipoValorObjeto() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        EnumTipoValor e = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
        return EnumTipoValor.OBJETO.equals(e);
    }

    public boolean isFilaTipoValorRecurso() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        EnumTipoValor tv = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
        EnumTipoRecurso tr = bean.getFiltroFuncionParDataProvider().getEnumTipoRecurso(rowKey);
        return EnumTipoValor.RECURSO.equals(tv) && !EnumTipoRecurso.CONFIGURACION_FIJA.equals(tr);
    }

    public boolean isFilaTipoValorRecursoConfiguracionFija() {
        if (bean == null) {
            return true;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        EnumTipoValor tv = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
        EnumTipoRecurso tr = bean.getFiltroFuncionParDataProvider().getEnumTipoRecurso(rowKey);
        return EnumTipoValor.RECURSO.equals(tv) && EnumTipoRecurso.CONFIGURACION_FIJA.equals(tr);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="métodos para establecer la propiedad items de las listas desplegables">
    public Object getOpcionesListaFuncionParametro1() {
        if (bean == null) {
            return null;
        }
        try {
            RowKey rowKey = bean.getFiltroFuncionDataProvider().getFilaEscogida();
            if (bean.getFiltroFuncionDataProvider().isRowAvailable(rowKey)) {
                Long id = bean.getFiltroFuncionDataProvider().getIdFuncion(rowKey);
//              Funcion funcion = bean.getFuncionFacade().find(id);
                FuncionBase funcion = findFuncion(id);
//
                return this.getOpcionesListaFuncionParametro1(funcion);
            }
        } catch (Exception ex) {
            bean.getGestor().handle(ex);
        }
        return null;
    }

    private FuncionBase findFuncion(long id) {
//      String query = "select o from Funcion as o where o.idFuncion = :id";
        String query = "select a from Funcion as a "
                + "left join fetch a.funcionParametroIdFuncionCollection as b "
                + "where a.idFuncion = " + id;
        List<? extends FuncionBase> list = bean.getFuncionFacade().findByQuery(query, true);
        FuncionBase element = list == null || list.isEmpty() ? null : list.get(0);
        return element;
    }

    private ArrayList getOpcionesListaFuncionParametro1(FuncionBase funcion) {
        ListOptions list = new ListOptions(true, true);
        Collection<? extends FuncionParametroBase> cfp = funcion == null ? null : funcion.getFuncionParametroIdFuncionCollection();
        if (cfp != null && !cfp.isEmpty()) {
            EnumTipoParametro tp;
            for (FuncionParametroBase fp : cfp) {
                tp = EnumTipoParametro.valueOf(fp.getTipoParametroNumeroTipoParametro().getNumeroTipoParametro());
                if (EnumTipoParametro.OBLIGATORIO.equals(tp) || EnumTipoParametro.OPCIONAL.equals(tp)) {
                    list.add(fp.getIdFuncionParametro(), fp.getParametroIdParametro().getNombreParametro());
                }
            }
        }
        return JSF.getListaOpciones(list);
    }

    public Object getOpcionesListaOperadorCom1() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        if (bean.getRecursoDataProvider().esFilaProcesada(rowKey)) {
            EnumTipoValor tv = bean.getFiltroFuncionParDataProvider().getEnumTipoValor(rowKey);
            EnumTipoDatoPar td = bean.getFiltroFuncionParDataProvider().getEnumTipoDatoPar(rowKey);
            if (EnumTipoValor.CONTINUO.equals(tv)) {
                if (EnumTipoDatoPar.ALFANUMERICO.equals(td)) {
                    return JSF.getListaOpciones(oc1(), true, false);
                } else {
                    return JSF.getListaOpciones(oc2(), true, false);
                }
            } else {
                return JSF.getListaOpciones(oc3(), true, false);
            }
        }
        return JSF.getListaOpciones(EnumOperadorCom.values(), true, false);
    }

//  private EnumOperadorCom[] oc0() {
//      EnumOperadorCom[] values = {
//          EnumOperadorCom.ES_NULO,
//          EnumOperadorCom.NO_ES_NULO,
//          EnumOperadorCom.ES_IGUAL,
//          EnumOperadorCom.NO_ES_IGUAL,
//          EnumOperadorCom.ES_MAYOR,
//          EnumOperadorCom.ES_MENOR_O_IGUAL,
//          EnumOperadorCom.ES_MAYOR_O_IGUAL,
//          EnumOperadorCom.ES_MENOR,
//          EnumOperadorCom.COMIENZA_POR,
//          EnumOperadorCom.NO_COMIENZA_POR,
//          EnumOperadorCom.CONTIENE,
//          EnumOperadorCom.NO_CONTIENE,
//          EnumOperadorCom.TERMINA_EN,
//          EnumOperadorCom.NO_TERMINA_EN,
//          EnumOperadorCom.ESTA_ENTRE,
//          EnumOperadorCom.NO_ESTA_ENTRE,
//          EnumOperadorCom.ES_NULO_O_ES_IGUAL,
//          EnumOperadorCom.ES_NULO_O_NO_ES_IGUAL,
//          EnumOperadorCom.ES_NULO_O_ES_MAYOR,
//          EnumOperadorCom.ES_NULO_O_ES_MENOR_O_IGUAL,
//          EnumOperadorCom.ES_NULO_O_ES_MAYOR_O_IGUAL,
//          EnumOperadorCom.ES_NULO_O_ES_MENOR,
//          EnumOperadorCom.ES_NULO_O_COMIENZA_POR,
//          EnumOperadorCom.ES_NULO_O_NO_COMIENZA_POR,
//          EnumOperadorCom.ES_NULO_O_CONTIENE,
//          EnumOperadorCom.ES_NULO_O_NO_CONTIENE,
//          EnumOperadorCom.ES_NULO_O_TERMINA_EN,
//          EnumOperadorCom.ES_NULO_O_NO_TERMINA_EN,
//          EnumOperadorCom.ES_NULO_O_ESTA_ENTRE,
//          EnumOperadorCom.ES_NULO_O_NO_ESTA_ENTRE,
//          EnumOperadorCom.EXISTE,
//          EnumOperadorCom.NO_EXISTE
//      };
//      return values;
//  }
//
    private EnumOperadorCom[] oc1() {
        EnumOperadorCom[] values = {
            EnumOperadorCom.ES_NULO,
            EnumOperadorCom.NO_ES_NULO,
            EnumOperadorCom.ES_IGUAL,
            EnumOperadorCom.NO_ES_IGUAL,
            EnumOperadorCom.ES_MAYOR,
            EnumOperadorCom.ES_MENOR_O_IGUAL,
            EnumOperadorCom.ES_MAYOR_O_IGUAL,
            EnumOperadorCom.ES_MENOR,
            EnumOperadorCom.COMIENZA_POR,
            EnumOperadorCom.NO_COMIENZA_POR,
            EnumOperadorCom.CONTIENE,
            EnumOperadorCom.NO_CONTIENE,
            EnumOperadorCom.TERMINA_EN,
            EnumOperadorCom.NO_TERMINA_EN,
            EnumOperadorCom.ES_NULO_O_ES_IGUAL,
            EnumOperadorCom.ES_NULO_O_NO_ES_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_MAYOR,
            EnumOperadorCom.ES_NULO_O_ES_MENOR_O_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_MAYOR_O_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_MENOR,
            EnumOperadorCom.ES_NULO_O_COMIENZA_POR,
            EnumOperadorCom.ES_NULO_O_NO_COMIENZA_POR,
            EnumOperadorCom.ES_NULO_O_CONTIENE,
            EnumOperadorCom.ES_NULO_O_NO_CONTIENE,
            EnumOperadorCom.ES_NULO_O_TERMINA_EN,
            EnumOperadorCom.ES_NULO_O_NO_TERMINA_EN
        };
        return values;
    }

    private EnumOperadorCom[] oc2() {
        EnumOperadorCom[] values = {
            EnumOperadorCom.ES_NULO,
            EnumOperadorCom.NO_ES_NULO,
            EnumOperadorCom.ES_IGUAL,
            EnumOperadorCom.NO_ES_IGUAL,
            EnumOperadorCom.ES_MAYOR,
            EnumOperadorCom.ES_MENOR_O_IGUAL,
            EnumOperadorCom.ES_MAYOR_O_IGUAL,
            EnumOperadorCom.ES_MENOR,
            EnumOperadorCom.ES_NULO_O_ES_IGUAL,
            EnumOperadorCom.ES_NULO_O_NO_ES_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_MAYOR,
            EnumOperadorCom.ES_NULO_O_ES_MENOR_O_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_MAYOR_O_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_MENOR
        };
        return values;
    }

    private EnumOperadorCom[] oc3() {
        EnumOperadorCom[] values = {
            EnumOperadorCom.ES_NULO,
            EnumOperadorCom.NO_ES_NULO,
            EnumOperadorCom.ES_IGUAL,
            EnumOperadorCom.NO_ES_IGUAL,
            EnumOperadorCom.ES_NULO_O_ES_IGUAL,
            EnumOperadorCom.ES_NULO_O_NO_ES_IGUAL
        };
        return values;
    }

    public Object getOpcionesListaValorLista1() {
        if (bean == null) {
            return null;
        }
//      if (this.isFilaTipoValorDiscreto()) {
//          try {
//              RowKey rowKey = bean.getGestor().getCurrentRowKey();
//              String clave = ValorListaCachedRowSetDataProvider2.COLUMNA_ID_LISTA_VALOR;
//              Long valor = bean.getFiltroFuncionParDataProvider().getIdDominioValor(rowKey);
//              FiltroBusqueda filtroBusqueda = new FiltroBusqueda();
//              filtroBusqueda.addCriterio(clave, valor);
//              bean.getValorListaDataProvider().consultarValorLista(filtroBusqueda);
//              return bean.getValorListaDataProvider().getListaOpciones(true);
//          } catch (Exception ex) {
//              bean.getGestor().handle(ex);
//          }
//      }
        return null;
    }

    public Object getOpcionesListaValorRecurso1() {
        if (bean == null) {
            return null;
        }
        if (this.isFilaTipoValorRecursoConfiguracionFija()) {
            try {
                RowKey rowKey = bean.getGestor().getCurrentRowKey();
                Long funcion = bean.getFiltroFuncionParDataProvider().getIdFuncionReferencia(rowKey);
                if (funcion != null) {
                    bean.getRecursoValorDataProvider().setFuncionSelect(funcion);
                    bean.getRecursoValorDataProvider().consultarRecurso();
                    return bean.getRecursoValorDataProvider().getListaOpciones(true);
                }
            } catch (Exception ex) {
                bean.getGestor().handle(ex);
            }
        }
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="métodos para establecer, buscar con lupa y validar el Objeto-Valor">
    public void consultarObjetoValor() {
    }

    public void validateCodigoObjetoValor(FacesContext context, UIComponent component, Object value) {
    }

    public String getCodigoObjetoValor() {
        return null;
    }

    public void setCodigoObjetoValor(String valor) {
    }

    public String getNombreObjetoValor() {
        return null;
    }

    public String getScriptBotonBuscarObjetoValor() {
        return null;
    }

    public String getScriptBotonVerDetalleObjetoValor() {
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="métodos para establecer, buscar con lupa y validar el Recurso-Valor">
    private GestorBusquedaReferencia gestorBusquedaRecursoValor = null;

    private boolean funcionSelectRecursoValorEjecutable = true;

    private RowKey rowKeyRecursoValor = null;

    private FiltroBusqueda filtroBusquedaRecursoValor = null;

    private GestorBusquedaReferencia getGestorBusquedaRecursoValor() {
        if (gestorBusquedaRecursoValor == null) {
            gestorBusquedaRecursoValor = new GestorBusquedaReferencia(
                    bean.getFiltroFuncionParDataProvider(),
                    bean.getRecursoValorDataProvider(),
                    FiltroFuncionParCachedRowSetDataProvider3.COLUMNA_ID_RECURSO_VALOR,
                    this.funcionSelectRecursoValorEjecutable);
        }
        return gestorBusquedaRecursoValor;
    }

    private FiltroBusqueda getFiltroBusquedaRecursoValor() {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        bean.getGestor().track("getFiltroBusquedaRecursoValor", rowKey, "", this.rowKeyRecursoValor, this.filtroBusquedaRecursoValor);
        if (this.isFilaTipoValorRecurso()) {
            try {
                Long funcion = bean.getFiltroFuncionParDataProvider().getIdFuncionReferencia(rowKey);
                if (funcion != null) {
                    bean.getRecursoValorDataProvider().setFuncionSelect(funcion);
                }
            } catch (Exception ex) {
                bean.getGestor().handle(ex);
            }
        }
        if (rowKey.equals(this.rowKeyRecursoValor)) {
            return this.filtroBusquedaRecursoValor;
        }
        this.rowKeyRecursoValor = rowKey;
        this.filtroBusquedaRecursoValor = null;
        return this.filtroBusquedaRecursoValor;
    }

    public void consultarRecursoValor() {
    }

    public void validateCodigoRecursoValor(FacesContext context, UIComponent component, Object value) {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaRecursoValor().setFiltroBusqueda(this.getFiltroBusquedaRecursoValor());
        this.getGestorBusquedaRecursoValor().validarCodigoRecursoReferenciado(context, component, value, rowKey, true);
    }

    public String getCodigoRecursoValor() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaRecursoValor().setFiltroBusqueda(this.getFiltroBusquedaRecursoValor());
        return this.getGestorBusquedaRecursoValor().getCodigoRecursoReferenciado(rowKey);
    }

    public void setCodigoRecursoValor(String valor) {
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaRecursoValor().setCodigoRecursoReferenciado(rowKey, valor);
    }

    public String getNombreRecursoValor() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
        this.getGestorBusquedaRecursoValor().setFiltroBusqueda(this.getFiltroBusquedaRecursoValor());
        return this.getGestorBusquedaRecursoValor().getNombreRecursoReferenciado(rowKey);
    }

    public String getScriptBotonBuscarRecursoValor() {
        if (bean == null) {
            return null;
        }
        RowKey rowKey = bean.getGestor().getCurrentRowKey();
//      long funcion = RecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_RECURSO;
        String urx = URX2.FILTRO_FUNCION_PAR_RECURSO;
        String campo = bean.getTextoCodigoRecurso1().getClientId(bean.getFacesContext());
        String boton = bean.getBotonAplicar1().getClientId(bean.getFacesContext());
        ListaParametros rpl = new ListaParametros();
        String clave = CPP.ID_FUNCION_REFERENCIA;
        Long valor = bean.getFiltroFuncionParDataProvider().getIdFuncionReferencia(rowKey);
        rpl.addParametro(clave, valor);
//      return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, rpl);
        return bean.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, campo, boton, rpl);
    }

    public String getScriptBotonVerDetalleRecursoValor() {
        return null;
    }
    // </editor-fold>
}
