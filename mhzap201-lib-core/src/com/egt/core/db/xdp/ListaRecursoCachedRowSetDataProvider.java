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
package com.egt.core.db.xdp;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.persistence.entity.DominioBase;
import com.egt.base.persistence.entity.DominioParametroBase;
import com.egt.base.persistence.entity.FuncionBase;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.IntUtils;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.EJBL;
import com.sun.data.provider.RowKey;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;
import org.apache.commons.lang.StringUtils;

public class ListaRecursoCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements
        RecursoIdentificableDataProvider,
        RecursoVersionableDataProvider,
        RecursoCodificableDataProvider,
        RecursoNombrableDataProvider,
        RecursoPersonalizableDataProvider,
        RecursoSegmentableDataProvider,
        RecursoJerarquizableDataProvider,
        RecursoDesactivableDataProvider,
        RecursoEnumerableDataProvider,
        RecursoConsultableDataProvider {

    public ListaRecursoCachedRowSetDataProvider() {
        super();
    }

    public ListaRecursoCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
        if (cachedRowSet != null) {
            initCachedRowSet();
        }
    }

    @Override
    public void setCachedRowSet(CachedRowSet cachedRowSet) {
        super.setCachedRowSet(cachedRowSet);
        if (cachedRowSet != null) {
            initCachedRowSet();
        }
    }

    private void initCachedRowSet() {
        try {
            if (isInicializado()) {
                if (getFuncionSelect() > 0) {
                    resetStringsDominioFuncion();
                }
            } else {
                setInicializado(true);
                setComandoCachedRowSet(COMANDO_SELECT_NOTHING);
                setTablaCachedRowSet(TABLA_DESTINO);
                setColumnasInsertables();
                setColumnasModificables();
            }
        } catch (Exception ex) {
            TLC.getBitacora().error(ex);
        }
    }

    public void setColumnasInsertables() {
        setColumnasInsertables(false);
    }

    public void setColumnasModificables() {
        setColumnasModificables(false);
    }

    FuncionBase objFuncion;

    DominioBase objDominio;

    public String COMANDO_SELECT = "SELECT * FROM recurso ";

    public String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";

    public String COMANDO_SELECT_NOTHING_AT_ALL = COMANDO_SELECT_NOTHING;

    public String TABLA_DESTINO = "recurso";

    public String TABLA_RECURSO = TABLA_DESTINO;

    private static final String COLUMNA_IDENTIFICACION_RECURSO = "id_recurso";

    private static final String COLUMNA_VERSION_RECURSO = "version_recurso";

    private static final String COLUMNA_CODIGO_RECURSO = "codigo_recurso";

    private static final String COLUMNA_NOMBRE_RECURSO = "nombre_recurso";

    private static final String COLUMNA_PROPIETARIO_RECURSO = "id_propietario_recurso";

    private static final String COLUMNA_SEGMENTO_RECURSO = "id_segmento_recurso";

    private static final String COLUMNA_RECURSO_SUPERIOR = "id_recurso_superior";

    private static final String COLUMNA_ES_RECURSO_INACTIVO = "es_recurso_inactivo";

    private static final String COLUMNA_NUMERO_RECURSO = "numero_recurso";

    private static final String ETIQUETA_COLUMNA_IDENTIFICACION_RECURSO = "Identificación";

    private static final String ETIQUETA_COLUMNA_VERSION_RECURSO = "Versión";

    private static final String ETIQUETA_COLUMNA_CODIGO_RECURSO = "Código";

    private static final String ETIQUETA_COLUMNA_NOMBRE_RECURSO = "Nombre";

    private static final String ETIQUETA_COLUMNA_PROPIETARIO_RECURSO = "Propietario";

    private static final String ETIQUETA_COLUMNA_SEGMENTO_RECURSO = "Segmento";

    private static final String ETIQUETA_COLUMNA_RECURSO_SUPERIOR = "Superior";

    private static final String ETIQUETA_COLUMNA_ES_RECURSO_INACTIVO = "Inactivo";

    private static final String ETIQUETA_COLUMNA_NUMERO_RECURSO = "Número";

    private static final int INDICE_TABLA_RECURSO = 0;

    private static final int INDICE_COLUMNA_IDENTIFICACION_RECURSO = 1;

    private static final int INDICE_COLUMNA_VERSION_RECURSO = 2;

    private static final int INDICE_COLUMNA_CODIGO_RECURSO = 3;

    private static final int INDICE_COLUMNA_NOMBRE_RECURSO = 4;

    private static final int INDICE_COLUMNA_PROPIETARIO_RECURSO = 5;

    private static final int INDICE_COLUMNA_SEGMENTO_RECURSO = 6;

    private static final int INDICE_COLUMNA_RECURSO_SUPERIOR = 7;

    private static final int INDICE_COLUMNA_ES_RECURSO_INACTIVO = 8;

    private static final int INDICE_COLUMNA_NUMERO_RECURSO = 9;

    /**
     * Conserva el valor de la propiedad strings1.
     */
    private String[] strings1 = {
        TABLA_RECURSO,
        COLUMNA_IDENTIFICACION_RECURSO,
        COLUMNA_VERSION_RECURSO,
        COLUMNA_CODIGO_RECURSO,
        COLUMNA_NOMBRE_RECURSO,
        COLUMNA_PROPIETARIO_RECURSO,
        COLUMNA_SEGMENTO_RECURSO,
        COLUMNA_RECURSO_SUPERIOR,
        COLUMNA_ES_RECURSO_INACTIVO,
        COLUMNA_NUMERO_RECURSO
    };

    /**
     * Setter para propiedad strings1.
     *
     * @param strings Nuevo valor de la propiedad strings1.
     */
    private void setStrings1(String[] strings) {
        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = null;
        }
        if (strings != null && strings.length > 0) {
            for (int i = 0; i < strings1.length && i < strings.length; i++) {
                strings1[i] = strings[i];
            }
        }
    }

    /**
     * Setter para propiedad strings.
     *
     * @param strings Nuevo valor de la propiedad strings.
     */
    private void setStrings1(String string, int index) {
        if (index >= 0 && index < strings1.length) {
            strings1[index] = string;
        }
    }

    /**
     * Conserva el valor de la propiedad strings2.
     */
    private String[] strings2 = {
        TABLA_RECURSO,
        ETIQUETA_COLUMNA_IDENTIFICACION_RECURSO,
        ETIQUETA_COLUMNA_VERSION_RECURSO,
        ETIQUETA_COLUMNA_CODIGO_RECURSO,
        ETIQUETA_COLUMNA_NOMBRE_RECURSO,
        ETIQUETA_COLUMNA_PROPIETARIO_RECURSO,
        ETIQUETA_COLUMNA_SEGMENTO_RECURSO,
        ETIQUETA_COLUMNA_RECURSO_SUPERIOR,
        ETIQUETA_COLUMNA_ES_RECURSO_INACTIVO,
        ETIQUETA_COLUMNA_NUMERO_RECURSO
    };

    /**
     * Setter para propiedad strings2.
     *
     * @param labels Nuevo valor de la propiedad strings2.
     */
    private void setStrings2(String[] labels) {
        for (int i = 0; i < strings2.length; i++) {
            strings2[i] = null;
        }
        if (labels != null && labels.length > 0) {
            for (int i = 0; i < strings2.length && i < labels.length; i++) {
                strings2[i] = labels[i];
            }
        }
    }

    /**
     * Setter para propiedad strings2.
     *
     * @param labels Nuevo valor de la propiedad strings2.
     */
    private void setStrings2(String string, int index) {
        if (index >= 0 && index < strings2.length) {
            strings2[index] = string;
        }
    }

    /**
     * Conserva el valor de la propiedad LABEL
     */
    private static final String[] LABEL = {
        null,
        ETIQUETA_COLUMNA_IDENTIFICACION_RECURSO,
        ETIQUETA_COLUMNA_VERSION_RECURSO,
        ETIQUETA_COLUMNA_CODIGO_RECURSO,
        ETIQUETA_COLUMNA_NOMBRE_RECURSO,
        ETIQUETA_COLUMNA_PROPIETARIO_RECURSO,
        ETIQUETA_COLUMNA_SEGMENTO_RECURSO,
        ETIQUETA_COLUMNA_RECURSO_SUPERIOR,
        ETIQUETA_COLUMNA_ES_RECURSO_INACTIVO,
        ETIQUETA_COLUMNA_NUMERO_RECURSO
    };

    private String cname(int i) {
        String value1 = strings1[i];
        String value2 = null;
        return StringUtils.isBlank(value1) ? value2 : value1;
    }

    private String clabel(int i) {
        String value1 = strings2[i];
        String value2 = LABEL[i];
        return StringUtils.isBlank(value1) ? value2 : value1;
    }

    private void resetStringsDominioFuncion() throws ExcepcionAplicacion {
        long funcion = getFuncionSelect();
        resetStringsDominioFuncion(funcion);
    }

    private void resetStringsDominioFuncion(long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(getClass(), "resetStringsDominioFuncion", "funcion=" + funcion);
        Long dominio = null;
        clausulaWhere = null;
        clausulaOrder = null;
        codigoDominioRecurso = super.getCodigoDominioRecurso();
        nombreDominioRecurso = super.getNombreDominioRecurso();
        setStrings1(null);
        setStrings2(null);
        if (funcion > 0) {
            objFuncion = EJBL.getFuncionFacade().find(Long.valueOf(funcion));
            if (objFuncion != null) {
                dominio = objFuncion.getDominioIdDominio().getIdDominio();
                clausulaWhere = objFuncion.getClausulaWhere();
                clausulaOrder = objFuncion.getClausulaOrder();
            }
        }
        Bitacora.trace("dominio=" + dominio);
        // determinar los strings a partir del dominio de la funcion.
        if (dominio != null) {
//          objDominio = EJBL.getDominioFacade().find(dominio);
            objDominio = findDominio(dominio);
//
            if (objDominio != null) {
                String str1;
                String str2;
                codigoDominioRecurso = objDominio.getCodigoDominio();
                nombreDominioRecurso = objDominio.getNombreDominio();
                setStrings1(codigoDominioRecurso, 0);
                setStrings2(nombreDominioRecurso, 0);
                Collection<? extends DominioParametroBase> cdp = objDominio.getDominioParametroIdDominioCollection();
                if (cdp != null && !cdp.isEmpty()) {
                    for (DominioParametroBase dp : cdp) { /* col1 == null -> JNPE? */
                        Integer tipo = dp.getTipoParametroDomNumeroTipoParametroDom().getNumeroTipoParametroDom();
                        if (tipo != null) {
                            str1 = dp.getParametroIdParametro().getCodigoParametro();
                            str2 = dp.getEtiquetaParametro();
                            if (StringUtils.isBlank(str2)) {
                                str2 = dp.getTipoParametroDomNumeroTipoParametroDom().getEtiquetaParametro();
                            }
                            setStrings1(str1, tipo);
                            setStrings2(str2, tipo);
                        }
                    }
                }
            }
        }
        traceStringsDominioFuncion();
        if (strings1[INDICE_TABLA_RECURSO] == null) {
            throw new ExcepcionAplicacion(TLC.getBitacora().error(CBM2.ERROR_COMANDO_SELECT));
        } else {
            resetPseudoConstantes();
        }
    }

    private DominioBase findDominio(long id) {
//      String query = "select o from Dominio as o where o.idDominio = :id";
        String query = "select a from Dominio as a "
                + "left join fetch a.dominioParametroIdDominioCollection as b "
                + "where a.idDominio = " + id;
        List<? extends DominioBase> list = EJBL.getDominioFacade().findByQuery(query, true);
        DominioBase element = list == null || list.isEmpty() ? null : list.get(0);
        return element;
    }

    private void resetPseudoConstantes() {
        COMANDO_SELECT = getSelectCommand();
        COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
        TABLA_DESTINO = strings1[INDICE_TABLA_RECURSO];
//      COLUMNA_IDENTIFICACION_RECURSO = strings1[INDICE_COLUMNA_IDENTIFICACION_RECURSO];
//      COLUMNA_VERSION_RECURSO = strings1[INDICE_COLUMNA_VERSION_RECURSO];
//      COLUMNA_CODIGO_RECURSO = strings1[INDICE_COLUMNA_CODIGO_RECURSO];
//      COLUMNA_NOMBRE_RECURSO = strings1[INDICE_COLUMNA_NOMBRE_RECURSO];
//      COLUMNA_PROPIETARIO_RECURSO = strings1[INDICE_COLUMNA_PROPIETARIO_RECURSO];
//      COLUMNA_SEGMENTO_RECURSO = strings1[INDICE_COLUMNA_SEGMENTO_RECURSO];
//      COLUMNA_RECURSO_SUPERIOR = strings1[INDICE_COLUMNA_RECURSO_SUPERIOR];
//      COLUMNA_ES_RECURSO_INACTIVO = strings1[INDICE_COLUMNA_ES_RECURSO_INACTIVO];
//      COLUMNA_NUMERO_RECURSO = strings1[INDICE_COLUMNA_NUMERO_RECURSO];
//      ETIQUETA_COLUMNA_IDENTIFICACION_RECURSO = strings2[INDICE_COLUMNA_IDENTIFICACION_RECURSO];
//      ETIQUETA_COLUMNA_VERSION_RECURSO = strings2[INDICE_COLUMNA_VERSION_RECURSO];
//      ETIQUETA_COLUMNA_CODIGO_RECURSO = strings2[INDICE_COLUMNA_CODIGO_RECURSO];
//      ETIQUETA_COLUMNA_NOMBRE_RECURSO = strings2[INDICE_COLUMNA_NOMBRE_RECURSO];
//      ETIQUETA_COLUMNA_PROPIETARIO_RECURSO = strings2[INDICE_COLUMNA_PROPIETARIO_RECURSO];
//      ETIQUETA_COLUMNA_SEGMENTO_RECURSO = strings2[INDICE_COLUMNA_SEGMENTO_RECURSO];
//      ETIQUETA_COLUMNA_RECURSO_SUPERIOR = strings2[INDICE_COLUMNA_RECURSO_SUPERIOR];
//      ETIQUETA_COLUMNA_ES_RECURSO_INACTIVO = strings2[INDICE_COLUMNA_ES_RECURSO_INACTIVO];
//      ETIQUETA_COLUMNA_NUMERO_RECURSO = strings2[INDICE_COLUMNA_NUMERO_RECURSO];
    }

    private void traceStringsDominioFuncion() {
        Bitacora.trace("CodigoDominio=" + getCodigoDominioRecurso());
        Bitacora.trace("NombreDominio=" + getNombreDominioRecurso());
        String string;
        String[] strings;
        string = "";
        strings = strings1;
        for (int i = 0; i < strings.length; i++) {
            string += ", " + strings[i];
        }
        if (string.startsWith(", ")) {
            string = string.substring(2);
        }
        Bitacora.trace("strings1=" + string);
        string = "";
        strings = strings2;
        for (int i = 0; i < strings.length; i++) {
            string += ", " + strings[i];
        }
        if (string.startsWith(", ")) {
            string = string.substring(2);
        }
        Bitacora.trace("strings2=" + string);
    }

    /**
     * Conserva el valor de la propiedad clausulaWhere.
     */
    private String clausulaWhere = null;

    /**
     * Conserva el valor de la propiedad clausulaOrder.
     */
    private String clausulaOrder = null;

    /**
     * Conserva el valor de la propiedad codigoDominioRecurso.
     */
    private String codigoDominioRecurso = super.getCodigoDominioRecurso();

    /**
     * Getter para propiedad codigoDominioRecurso.
     *
     * @return Valor de la propiedad codigoDominioRecurso.
     */
    @Override
    public String getCodigoDominioRecurso() {
        return codigoDominioRecurso;
    }

    /**
     * Conserva el valor de la propiedad nombreDominioRecurso.
     */
    private String nombreDominioRecurso = super.getNombreDominioRecurso();

    /**
     * Getter para propiedad nombreDominioRecurso.
     *
     * @return Valor de la propiedad nombreDominioRecurso.
     */
    @Override
    public String getNombreDominioRecurso() {
        return nombreDominioRecurso;
    }

    @Override
    public String getComandoSelect() {
        return COMANDO_SELECT;
    }

    @Override
    public String getComandoSelectNothing() {
        return COMANDO_SELECT_NOTHING;
    }

    @Override
    public String getTablaDestino() {
        return TABLA_DESTINO;
    }

    private String getSelectCommand() {
        String comando = "SELECT * FROM " + strings1[INDICE_TABLA_RECURSO] + " ";
        // <editor-fold defaultstate="collapsed">
//      String columnas = "";
//      for (int i = 1; i < strings1.length; i++) {
//          if (StringUtils.isNotBlank(strings1[i])) {
//              columnas += ", " + strings1[i];
//          }
//      }
//      if (columnas.length() > 2) {
//          comando = comando.replace("*", columnas.substring(2));
//      }
        // </editor-fold>
        Set<String> set = new LinkedHashSet<>();
        for (int i = 1; i < strings1.length; i++) {
            if (StringUtils.isNotBlank(strings1[i])) {
                set.add(strings1[i]);
            }
        }
        if (!set.isEmpty()) {
            String columnas = StringUtils.join(set, ", ");
            comando = comando.replace("*", columnas);
        }
        Bitacora.trace("ComandoSelect=" + comando);
        return comando;
    }

    public Long getIdRecurso() {
        int i = INDICE_COLUMNA_IDENTIFICACION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname));
        }
        return null;
    }

    public Long getIdRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_IDENTIFICACION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname, rowKey));
        }
        return null;
    }

    public void setIdRecurso(Long valor) {
        int i = INDICE_COLUMNA_IDENTIFICACION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    public void setIdRecurso(RowKey rowKey, Long valor) {
        int i = INDICE_COLUMNA_IDENTIFICACION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    @Override
    public Long getVersionRecurso() {
        int i = INDICE_COLUMNA_VERSION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname));
        }
        return null;
    }

    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_VERSION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname, rowKey));
        }
        return null;
    }

    @Override
    public void setVersionRecurso(Long valor) {
        int i = INDICE_COLUMNA_VERSION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    @Override
    public void setVersionRecurso(RowKey rowKey, Long valor) {
        int i = INDICE_COLUMNA_VERSION_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    @Override
    public String getCodigoRecurso() {
        int i = INDICE_COLUMNA_CODIGO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return (String) super.getValue(colname);
        }
        return null;
    }

    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_CODIGO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return (String) super.getValue(colname, rowKey);
        }
        return null;
    }

    @Override
    public void setCodigoRecurso(String valor) {
        int i = INDICE_COLUMNA_CODIGO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    @Override
    public void setCodigoRecurso(RowKey rowKey, String valor) {
        int i = INDICE_COLUMNA_CODIGO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    @Override
    public String getNombreRecurso() {
        int i = INDICE_COLUMNA_NOMBRE_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return (String) super.getValue(colname);
        }
        return null;
    }

    @Override
    public String getNombreRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_NOMBRE_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return (String) super.getValue(colname, rowKey);
        }
        return null;
    }

    @Override
    public void setNombreRecurso(String valor) {
        int i = INDICE_COLUMNA_NOMBRE_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    @Override
    public void setNombreRecurso(RowKey rowKey, String valor) {
        int i = INDICE_COLUMNA_NOMBRE_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    public Long getIdPropietarioRecurso() {
        int i = INDICE_COLUMNA_PROPIETARIO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname));
        }
        return null;
    }

    public Long getIdPropietarioRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_PROPIETARIO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname, rowKey));
        }
        return null;
    }

    public void setIdPropietarioRecurso(Long valor) {
        int i = INDICE_COLUMNA_PROPIETARIO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    public void setIdPropietarioRecurso(RowKey rowKey, Long valor) {
        int i = INDICE_COLUMNA_PROPIETARIO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    public Long getIdSegmentoRecurso() {
        int i = INDICE_COLUMNA_SEGMENTO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname));
        }
        return null;
    }

    public Long getIdSegmentoRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_SEGMENTO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname, rowKey));
        }
        return null;
    }

    public void setIdSegmentoRecurso(Long valor) {
        int i = INDICE_COLUMNA_SEGMENTO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    public void setIdSegmentoRecurso(RowKey rowKey, Long valor) {
        int i = INDICE_COLUMNA_SEGMENTO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    public Long getIdRecursoSuperior() {
        int i = INDICE_COLUMNA_RECURSO_SUPERIOR;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname));
        }
        return null;
    }

    public Long getIdRecursoSuperior(RowKey rowKey) {
        int i = INDICE_COLUMNA_RECURSO_SUPERIOR;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return LongUtils.toLong(super.getValue(colname, rowKey));
        }
        return null;
    }

    public void setIdRecursoSuperior(Long valor) {
        int i = INDICE_COLUMNA_RECURSO_SUPERIOR;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    public void setIdRecursoSuperior(RowKey rowKey, Long valor) {
        int i = INDICE_COLUMNA_RECURSO_SUPERIOR;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    @Override
    public Integer getEsRecursoInactivo() {
        int i = INDICE_COLUMNA_ES_RECURSO_INACTIVO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return IntUtils.toInteger(super.getValue(colname));
        }
        return null;
    }

    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        int i = INDICE_COLUMNA_ES_RECURSO_INACTIVO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return IntUtils.toInteger(super.getValue(colname, rowKey));
        }
        return null;
    }

    @Override
    public void setEsRecursoInactivo(Integer valor) {
        int i = INDICE_COLUMNA_ES_RECURSO_INACTIVO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer valor) {
        int i = INDICE_COLUMNA_ES_RECURSO_INACTIVO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    @Override
    public Integer getNumeroRecurso() {
        int i = INDICE_COLUMNA_NUMERO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return IntUtils.toInteger(super.getValue(colname));
        }
        return null;
    }

    @Override
    public Integer getNumeroRecurso(RowKey rowKey) {
        int i = INDICE_COLUMNA_NUMERO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            return IntUtils.toInteger(super.getValue(colname, rowKey));
        }
        return null;
    }

    @Override
    public void setNumeroRecurso(Integer valor) {
        int i = INDICE_COLUMNA_NUMERO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, valor);
        }
    }

    @Override
    public void setNumeroRecurso(RowKey rowKey, Integer valor) {
        int i = INDICE_COLUMNA_NUMERO_RECURSO;
        String colname = cname(i);
        if (StringUtils.isNotBlank(colname)) {
            super.setValue(colname, rowKey, valor);
        }
    }

    @Override
    public String getColumnaIdentificacionRecurso() {
        int i = INDICE_COLUMNA_IDENTIFICACION_RECURSO;
        return cname(i);
    }

    @Override
    public String getColumnaVersionRecurso() {
        int i = INDICE_COLUMNA_VERSION_RECURSO;
        return cname(i);
    }

    @Override
    public String getColumnaCodigoRecurso() {
        int i = INDICE_COLUMNA_CODIGO_RECURSO;
        return cname(i);
    }

    @Override
    public String getColumnaNombreRecurso() {
        int i = INDICE_COLUMNA_NOMBRE_RECURSO;
        return cname(i);
    }

    @Override
    public String getColumnaPropietarioRecurso() {
        int i = INDICE_COLUMNA_PROPIETARIO_RECURSO;
        return cname(i);
    }

    @Override
    public String getColumnaSegmentoRecurso() {
        int i = INDICE_COLUMNA_SEGMENTO_RECURSO;
        return cname(i);
    }

    @Override
    public String getColumnaRecursoSuperior() {
        int i = INDICE_COLUMNA_RECURSO_SUPERIOR;
        return cname(i);
    }

    @Override
    public String getColumnaEsRecursoInactivo() {
        int i = INDICE_COLUMNA_ES_RECURSO_INACTIVO;
        return cname(i);
    }

    @Override
    public String getColumnaNumeroRecurso() {
        int i = INDICE_COLUMNA_NUMERO_RECURSO;
        return cname(i);
    }

    @Override
    public String getEtiquetaIdentificacionRecurso() {
        int i = INDICE_COLUMNA_IDENTIFICACION_RECURSO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaVersionRecurso() {
        int i = INDICE_COLUMNA_VERSION_RECURSO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaCodigoRecurso() {
        int i = INDICE_COLUMNA_CODIGO_RECURSO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaNombreRecurso() {
        int i = INDICE_COLUMNA_NOMBRE_RECURSO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaPropietarioRecurso() {
        int i = INDICE_COLUMNA_PROPIETARIO_RECURSO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaSegmentoRecurso() {
        int i = INDICE_COLUMNA_SEGMENTO_RECURSO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaRecursoSuperior() {
        int i = INDICE_COLUMNA_RECURSO_SUPERIOR;
        return clabel(i);
    }

    @Override
    public String getEtiquetaEsRecursoInactivo() {
        int i = INDICE_COLUMNA_ES_RECURSO_INACTIVO;
        return clabel(i);
    }

    @Override
    public String getEtiquetaNumeroRecurso() {
        int i = INDICE_COLUMNA_NUMERO_RECURSO;
        return clabel(i);
    }

    @Override
    public Long getIdentificacionRecurso() {
        return getIdRecurso();
    }

    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return getIdRecurso(rowKey);
    }

    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        setIdRecurso(identificacionRecurso);
    }

    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        setIdRecurso(rowKey, identificacionRecurso);
    }

    @Override
    public Long getPropietarioRecurso() {
        return getIdPropietarioRecurso();
    }

    @Override
    public Long getPropietarioRecurso(RowKey rowKey) {
        return getIdPropietarioRecurso(rowKey);
    }

    @Override
    public void setPropietarioRecurso(Long propietarioRecurso) {
        setIdPropietarioRecurso(propietarioRecurso);
    }

    @Override
    public void setPropietarioRecurso(RowKey rowKey, Long propietarioRecurso) {
        setIdPropietarioRecurso(rowKey, propietarioRecurso);
    }

    @Override
    public Long getSegmentoRecurso() {
        return getIdSegmentoRecurso();
    }

    @Override
    public Long getSegmentoRecurso(RowKey rowKey) {
        return getIdSegmentoRecurso(rowKey);
    }

    @Override
    public void setSegmentoRecurso(Long segmentoRecurso) {
        setIdSegmentoRecurso(segmentoRecurso);
    }

    @Override
    public void setSegmentoRecurso(RowKey rowKey, Long segmentoRecurso) {
        setIdSegmentoRecurso(rowKey, segmentoRecurso);
    }

    @Override
    public Long getRecursoSuperior() {
        return getIdRecursoSuperior();
    }

    @Override
    public Long getRecursoSuperior(RowKey rowKey) {
        return getIdRecursoSuperior(rowKey);
    }

    @Override
    public void setRecursoSuperior(Long recursoSuperior) {
        setIdRecursoSuperior(recursoSuperior);
    }

    @Override
    public void setRecursoSuperior(RowKey rowKey, Long recursoSuperior) {
        setIdRecursoSuperior(rowKey, recursoSuperior);
    }

    public void consultarRecurso() throws ExcepcionAplicacion {
//      consultarRecurso(new FiltroBusqueda(getCachedRowSet().getDataSourceName()));
        consultarRecurso(new FiltroBusqueda());
    }

    public void consultarRecurso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
//          consultarRecurso(new FiltroBusqueda(getCachedRowSet().getDataSourceName()));
            consultarRecurso(new FiltroBusqueda());
        } else {
//          consultarRecurso(new FiltroBusqueda(getCachedRowSet().getDataSourceName(), filtro));
            consultarRecurso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRecurso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (isFuncionSelectAutorizada()) {
            resetStringsDominioFuncion();
            String comando = COMANDO_SELECT;
            String clausula = "WHERE";
            String criterios;
            boolean personalizable = StringUtils.isNotBlank(strings1[INDICE_COLUMNA_PROPIETARIO_RECURSO]);
            boolean segmentable = StringUtils.isNotBlank(strings1[INDICE_COLUMNA_SEGMENTO_RECURSO]);
//          boolean desactivable = StringUtils.isNotBlank(strings1[INDICE_COLUMNA_ES_RECURSO_INACTIVO]);
            if (personalizable) {
                personalizable = BitUtils.valueOf(objFuncion.getEsPersonalizada());
            }
            if (segmentable) {
                segmentable = BitUtils.valueOf(objFuncion.getEsSegmentada());
            }
            if (filtro == null) {
                filtro = new FiltroBusqueda();
            }
            try {
                if (personalizable) {
                    Long propietario = TLC.getControlador().getPropietarioAutorizado();
                    if (propietario != null) {
                        filtro.addCriterio(strings1[INDICE_COLUMNA_PROPIETARIO_RECURSO],
                                EnumOperadorCom.ES_NULO_O_ES_IGUAL, propietario);
                    }
                }
                if (segmentable) {
                    String segmentos = TLC.getControlador().getSegmentosAutorizados(getFuncionSelect());
                    if (segmentos != null) {
                        filtro.addCriterio(strings1[INDICE_COLUMNA_SEGMENTO_RECURSO],
                                EnumOperadorCom.ES_NULO_O_ESTA_ENTRE, segmentos);
                    }
                }
//              if (desactivable) {
//                  filtro.addCriterio(strings1[INDICE_COLUMNA_ES_RECURSO_INACTIVO], Entero.valueOf(false));
//              }
                criterios = clausulaWhere;
                if (StringUtils.isNotBlank(criterios)) {
                    comando += clausula + " (" + criterios + ") ";
                    clausula = "AND";
                }
                criterios = getCriteriosBusqueda();
                if (StringUtils.isNotBlank(criterios)) {
                    comando += clausula + " (" + criterios + ") ";
                    clausula = "AND";
                }
                criterios = filtro.toString();
                if (StringUtils.isNotBlank(criterios)) {
                    comando += clausula + " (" + criterios + ") ";
                }
                clausula = "ORDER BY";
                if (StringUtils.isBlank(clausulaOrder)) {
                    if (StringUtils.isBlank(strings1[INDICE_COLUMNA_CODIGO_RECURSO])) {
                        comando += clausula + " " + strings1[INDICE_COLUMNA_IDENTIFICACION_RECURSO] + " ";
                    } else {
                        comando += clausula + " " + strings1[INDICE_COLUMNA_CODIGO_RECURSO] + " ";
                    }
                } else {
                    comando += clausula + " " + clausulaOrder + " ";
                }
            } catch (Exception ex) {
                comando = COMANDO_SELECT_NOTHING;
                throw ex instanceof ExcepcionAplicacion ? (ExcepcionAplicacion) ex : new ExcepcionAplicacion(ex);
            } finally {
                setComandoCachedRowSet(comando, true);
                setTablaCachedRowSet(TABLA_DESTINO);
            }
        } else {
            setComandoCachedRowSet(COMANDO_SELECT_NOTHING_AT_ALL, true);
            setTablaCachedRowSet(TABLA_RECURSO);
        }
    }

    public void consultarRecursoPorIdentificacionRecurso(Long valor) throws ExcepcionAplicacion {
        consultarRecursoPorIdentificacionRecurso(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorIdentificacionRecurso(Long valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_IDENTIFICACION_RECURSO], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorCodigoRecurso(String valor) throws ExcepcionAplicacion {
        consultarRecursoPorCodigoRecurso(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorCodigoRecurso(String valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_CODIGO_RECURSO], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorNombreRecurso(String valor) throws ExcepcionAplicacion {
        consultarRecursoPorNombreRecurso(valor, EnumOperadorCom.COMIENZA_POR);
    }

    public void consultarRecursoPorNombreRecurso(String valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_NOMBRE_RECURSO], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorPropietarioRecurso(Long valor) throws ExcepcionAplicacion {
        consultarRecursoPorPropietarioRecurso(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorPropietarioRecurso(Long valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_PROPIETARIO_RECURSO], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorSegmentoRecurso(Long valor) throws ExcepcionAplicacion {
        consultarRecursoPorSegmentoRecurso(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorSegmentoRecurso(Long valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_SEGMENTO_RECURSO], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorRecursoSuperior(Long valor) throws ExcepcionAplicacion {
        consultarRecursoPorRecursoSuperior(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorRecursoSuperior(Long valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_RECURSO_SUPERIOR], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorEsRecursoInactivo(Integer valor) throws ExcepcionAplicacion {
        consultarRecursoPorEsRecursoInactivo(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorEsRecursoInactivo(Integer valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_ES_RECURSO_INACTIVO], operador, valor);
        consultarRecurso(filtro);
    }

    public void consultarRecursoPorNumeroRecurso(Integer valor) throws ExcepcionAplicacion {
        consultarRecursoPorNumeroRecurso(valor, EnumOperadorCom.ES_IGUAL);
    }

    public void consultarRecursoPorNumeroRecurso(Integer valor, EnumOperadorCom operador) throws ExcepcionAplicacion {
//      FiltroBusqueda filtro = new FiltroBusqueda(getCachedRowSet().getDataSourceName());
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings1[INDICE_COLUMNA_NUMERO_RECURSO], operador, valor);
        consultarRecurso(filtro);
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return 0;
    }

    @Override
    public void ejecutarFuncionSelect() throws ExcepcionAplicacion {
        if (isFuncionSelectAutorizada()) {
            ejecutarFuncionSelect(getFuncionSelect());
        } else {
            ejecutarFuncionSelect(getFuncionConsultarRecurso());
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion) throws ExcepcionAplicacion {
//      ejecutarFuncionSelect(funcion, new FiltroBusqueda(getCachedRowSet().getDataSourceName()));
        ejecutarFuncionSelect(funcion, new FiltroBusqueda());
    }

    @Override
    public void ejecutarFuncionSelect(Long filtro) throws ExcepcionAplicacion {
        if (isFuncionSelectAutorizada()) {
            ejecutarFuncionSelect(getFuncionSelect(), filtro);
        } else {
            ejecutarFuncionSelect(getFuncionConsultarRecurso(), filtro);
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion, Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
//          ejecutarFuncionSelect(funcion, new FiltroBusqueda(getCachedRowSet().getDataSourceName()));
            ejecutarFuncionSelect(funcion, new FiltroBusqueda());
        } else {
//          ejecutarFuncionSelect(funcion, new FiltroBusqueda(getCachedRowSet().getDataSourceName(), filtro));
            ejecutarFuncionSelect(funcion, new FiltroBusqueda(filtro));
        }
    }

    @Override
    public void ejecutarFuncionSelect(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (isFuncionSelectAutorizada()) {
            ejecutarFuncionSelect(getFuncionSelect(), filtro);
        } else {
            ejecutarFuncionSelect(getFuncionConsultarRecurso(), filtro);
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion, FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (funcion != getFuncionSelect()) {
            setFuncionSelect(funcion);
        }
        consultarRecurso(filtro);
    }

    @Override
    public void setFuncionSelect(long funcion) throws ExcepcionAplicacion {
        Bitacora.trace(getClass(), "setFuncionSelect", "funcion=" + funcion);
        if (funcion != getFuncionSelect()) {
            super.setFuncionSelect(funcion);
            resetStringsDominioFuncion(funcion);
            setComandoEmptyCachedRowSet();
        }
    }

    public void setFuncionSelect(long funcion, String criterios) throws ExcepcionAplicacion {
        Bitacora.trace(getClass(), "setFuncionSelect", "funcion=" + funcion, "criterios=" + criterios);
        if (funcion == getFuncionSelect()) {
            String cb1 = StringUtils.trimToEmpty(criterios);
            String cb2 = StringUtils.trimToEmpty(getCriteriosBusqueda());
            if (cb1.equals(cb2)) {
            } else {
                setComandoEmptyCachedRowSet();
                setCriteriosBusqueda(criterios);
            }
        } else {
            setFuncionSelect(funcion);
            setCriteriosBusqueda(criterios);
        }
    }

    @Override
    public void setComandoEmptyCachedRowSet() throws ExcepcionAplicacion {
        Bitacora.trace(getClass(), "setComandoEmptyCachedRowSet");
        setComandoEmptyCachedRowSet(COMANDO_SELECT_NOTHING);
    }

}
