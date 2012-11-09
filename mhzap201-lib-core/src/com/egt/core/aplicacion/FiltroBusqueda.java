/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.aplicacion;

import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.enums.EnumTipoValor;
import com.egt.base.persistence.entity.FiltroFuncionBase;
import com.egt.base.persistence.entity.FiltroFuncionParBase;
import com.egt.core.aplicacion.web.EJBL;
import com.egt.core.enums.EnumConjuncion;
import com.egt.core.util.STP;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.StringUtils;

public class FiltroBusqueda {

    /**
     * Creates a new instance of FiltroBusqueda
     */
    public FiltroBusqueda() {
        this.init();
    }

    /**
     * Creates a new instance of FiltroBusqueda from the criteria stored in the database
     */
    public FiltroBusqueda(long filtro) {
        this.init();
        this.populate(filtro);
    }

    private void init() {
        criterios = new LinkedHashSet<>();
        filtros = new LinkedHashSet<>();
        conjuncion = EnumConjuncion.Y;
    }

    private Set<CriterioBusqueda> criterios;

    private Set<CriterioBusqueda> getCriterios() {
        return criterios;
    }

    private Set<FiltroBusqueda> filtros;

    private Set<FiltroBusqueda> getFiltros() {
        return filtros;
    }

    private EnumConjuncion conjuncion;

    public EnumConjuncion getConjuncion() {
        return conjuncion;
    }

    public void setConjuncion(EnumConjuncion conjuncion) {
        this.conjuncion = conjuncion;
    }

    private void populate(long filtro) {
//      FiltroFuncionBase ff = EJBL.getFiltroFuncionFacade().find(filtro, true);
        FiltroFuncionBase ff = findFiltroFuncion(filtro);
//
        if (ff != null) {
            Collection<? extends FiltroFuncionParBase> parametros = ff.getFiltroFuncionParIdFiltroFuncionCollection();
            if (parametros != null && !parametros.isEmpty()) {
                String columna;
                Integer i;
                EnumOperadorCom operadorCom;
                EnumTipoValor tipoValor;
                EnumTipoDatoPar tipoDatoPar;
                String string;
                Object objeto = null;
                for (FiltroFuncionParBase ffp : parametros) {
                    columna = ffp.getFuncionParametroIdFuncionParametro().getParametroIdParametro().getCodigoParametro();
                    i = ffp.getOperadorComNumeroOperadorCom().getNumeroOperadorCom();
                    operadorCom = EnumOperadorCom.valueOf(i);
                    i = ffp.getFuncionParametroIdFuncionParametro().getTipoValorNumeroTipoValor().getNumeroTipoValor();
                    tipoValor = EnumTipoValor.valueOf(i);
                    i = ffp.getFuncionParametroIdFuncionParametro().getParametroIdParametro().getTipoDatoParNumeroTipoDatoPar().getNumeroTipoDatoPar();
                    tipoDatoPar = EnumTipoDatoPar.valueOf(i);
                    string = ffp.getValorParametro();
                    if (tipoValor == null) {
                        objeto = null;
                    } else {
                        switch (tipoValor) {
                            case CONTINUO:
                                objeto = STP.getObjeto(string, tipoDatoPar);
                                break;
                            case DISCRETO:
//                              objeto = ffp.getValorListaIdValorLista();
                                break;
                            case OBJETO:
//                              objeto = ffp.getObjetoIdObjetoValor();
                                break;
                            case RECURSO:
                                objeto = ffp.getIdRecursoValor();
                                break;
                            default:
                                objeto = null;
                                break;
                        }
                    }
                    if (this.isCriterioValido(operadorCom, tipoValor, tipoDatoPar)) {
                        this.addCriterio(columna, operadorCom, objeto);
                    }
                }
            }
        }
    }

    private FiltroFuncionBase findFiltroFuncion(long id) {
//      String query = "select o from FiltroFuncion as o where o.idFiltroFuncion = :id";
        String query = "select a from FiltroFuncion as a "
                + "left join fetch a.filtroFuncionParIdFiltroFuncionCollection as b "
                + "where a.idFiltroFuncion = " + id;
        List<? extends FiltroFuncionBase> list = EJBL.getFiltroFuncionFacade().findByQuery(query, true);
        FiltroFuncionBase element = list == null || list.isEmpty() ? null : list.get(0);
        return element;
    }

    private boolean isCriterioValido(EnumOperadorCom operadorCom, EnumTipoValor tipoValor, EnumTipoDatoPar tipoDatoPar) {
        switch (operadorCom) {
            case ES_NULO:
            case NO_ES_NULO:
            case ES_IGUAL:
            case NO_ES_IGUAL:
            case ES_NULO_O_ES_IGUAL:
            case ES_NULO_O_NO_ES_IGUAL:
                return true;
            case ESTA_ENTRE:
            case NO_ESTA_ENTRE:
            case ES_NULO_O_ESTA_ENTRE:
            case ES_NULO_O_NO_ESTA_ENTRE:
            case EXISTE:
            case NO_EXISTE:
                return false;
            default:
                switch (tipoValor) {
                    case CONTINUO:
                        switch (tipoDatoPar) {
                            case ALFANUMERICO:
                                return true;
                            default:
                                switch (operadorCom) {
                                    case ES_MAYOR:
                                    case ES_MENOR_O_IGUAL:
                                    case ES_MAYOR_O_IGUAL:
                                    case ES_MENOR:
                                    case ES_NULO_O_ES_MAYOR:
                                    case ES_NULO_O_ES_MENOR_O_IGUAL:
                                    case ES_NULO_O_ES_MAYOR_O_IGUAL:
                                    case ES_NULO_O_ES_MENOR:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                    default:
                        return false;
                }
        }
    }

    public boolean addCriterio(String columna) {
        if (StringUtils.isBlank(columna)) {
            return false;
        }
        CriterioBusqueda criterio = new CriterioBusqueda(columna);
        return criterios.add(criterio);
    }

    public boolean addCriterio(String columna, Object valor) {
        if (StringUtils.isBlank(columna)) {
            return false;
        }
        CriterioBusqueda criterio = new CriterioBusqueda(columna, valor);
        return criterios.add(criterio);
    }

    public boolean addCriterio(String columna, EnumOperadorCom comparacion, Object valor) {
        if (StringUtils.isBlank(columna)) {
            return false;
        }
        CriterioBusqueda criterio = new CriterioBusqueda(columna, comparacion, valor);
        return criterios.add(criterio);
    }

    public boolean addCriterio(String columna, boolean nulo) {
        if (StringUtils.isBlank(columna)) {
            return false;
        }
        CriterioBusqueda criterio = new CriterioBusqueda(columna, nulo);
        return criterios.add(criterio);
    }

    public boolean addCriterio(boolean existe, String expresion) {
        if (StringUtils.isBlank(expresion)) {
            return false;
        }
        CriterioBusqueda criterio = new CriterioBusqueda(existe, expresion);
        return criterios.add(criterio);
    }

    public boolean addFiltro(FiltroBusqueda filtro) {
        return filtro == null ? false : filtros.add(filtro);
    }

    public void clear() {
        criterios.clear();
        filtros.clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof FiltroBusqueda) {
            FiltroBusqueda that = (FiltroBusqueda) obj;
            String str1 = this.toString();
            String str2 = that.toString();
            if (str1 == null && str2 == null) {
                return true;
            }
            if (str1 == null || str2 == null) {
                return false;
            }
            return str1.equals(str2);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.criterios != null ? this.criterios.hashCode() : 0);
        return hash;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.toString(null);
    }

    public String toString(String dominio) {
        String where = StringUtils.EMPTY;
        String token;
        for (CriterioBusqueda criterio : criterios) {
            token = criterio.toString(dominio);
            where += StringUtils.isBlank(token) ? "" : conjuncion.palabra() + token;
        }
        for (FiltroBusqueda filtro : filtros) {
            token = filtro.toString(dominio);
            where += StringUtils.isBlank(token) ? "" : conjuncion.palabra() + token;
        }
        where = StringUtils.removeStart(where, conjuncion.palabra());
        return StringUtils.isBlank(where) ? null : "(" + where.trim() + ")";
    }

}
