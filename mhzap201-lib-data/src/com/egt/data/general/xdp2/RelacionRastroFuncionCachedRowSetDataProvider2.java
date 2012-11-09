/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.general.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.commons.util.TimeUtils;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.general.xdp1.RelacionRastroFuncionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RelacionRastroFuncionCachedRowSetDataProvider2 extends RelacionRastroFuncionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RelacionRastroFuncionCachedRowSetDataProvider2() {
        super();
    }

    public RelacionRastroFuncionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
        if (cachedRowSet != null) {
            this.initCachedRowSet();
        }
    }

    @Override
    public void setCachedRowSet(CachedRowSet cachedRowSet) {
        super.setCachedRowSet(cachedRowSet);
        if (cachedRowSet != null) {
            this.initCachedRowSet();
        }
    }

    private void initCachedRowSet() {
        try {
            if (!this.isInicializado()) {
                this.setInicializado(true);
                this.setComandoCachedRowSet(this.getComandoSelectNothing());
                this.setTablaCachedRowSet(this.getTablaDestino());
                this.setMapaTiposJava();
                this.setColumnasInsertables();
                this.setColumnasModificables();
            }
        } catch (Exception ex) {
            TLC.getBitacora().error(ex);
        }
    }

    @Override
    public void setComandoEmptyCachedRowSet() throws ExcepcionAplicacion {
        this.setComandoEmptyCachedRowSet(this.getComandoSelectNothing());
    }

    public static final long FUNCION_CONSULTAR_RECURSO = 107105001L;

    public static final long FUNCION_CONSULTAR_RELACION_RASTRO_FUNCION = 107105001L;

    protected static final long PARAMETRO_ID_RASTRO_FUNCION = 1358L;
    protected static final long PARAMETRO_FECHA_HORA_EJECUCION = 1289L;
    protected static final long PARAMETRO_ID_USUARIO = 1379L;
    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_ID_RECURSO = 1363L;
    protected static final long PARAMETRO_VERSION_RECURSO = 1584L;
    protected static final long PARAMETRO_CODIGO_RECURSO = 1183L;
    protected static final long PARAMETRO_NOMBRE_RECURSO = 1464L;
    protected static final long PARAMETRO_ID_PROPIETARIO_RECURSO = 1357L;
    protected static final long PARAMETRO_ID_SEGMENTO_RECURSO = 1376L;
    protected static final long PARAMETRO_NUMERO_ERROR = 1474L;
    protected static final long PARAMETRO_DESCRIPCION_ERROR = 1222L;
    protected static final long PARAMETRO_NUMERO_USUARIO = 1504L;
    protected static final long PARAMETRO_LETRA_USUARIO = 1385L;
    protected static final long PARAMETRO_NOMBRE_USUARIO = 1471L;
    protected static final long PARAMETRO_CODIGO_USUARIO = 1207L;
    protected static final long PARAMETRO_ES_SUPER_USUARIO = 1281L;
    protected static final long PARAMETRO_ES_USUARIO_MODIFICADO = 1283L;
    protected static final long PARAMETRO_CODIGO_FUNCION = 1083L;
    protected static final long PARAMETRO_NOMBRE_FUNCION = 1422L;
    protected static final long PARAMETRO_NUMERO_TIPO_FUNCION = 1492L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO = 1303L;
    protected static final long PARAMETRO_ES_PUBLICA = 1274L;
    protected static final long PARAMETRO_ES_PROGRAMATICA = 1270L;
    protected static final long PARAMETRO_ES_PERSONALIZADA = 1269L;
    protected static final long PARAMETRO_ES_SEGMENTADA = 1280L;
    protected static final long PARAMETRO_CODIGO_CLASE_RECURSO = 1056L;
    protected static final long PARAMETRO_NOMBRE_CLASE_RECURSO = 1394L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_FUNCION = 103200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_FUNCION = {"tipo_funcion", "numero_tipo_funcion", "", ""};

    @Override
    public long getFuncionConsultarRecurso() {
        return FUNCION_CONSULTAR_RECURSO;
    }

    @Override
    public void ejecutarFuncionSelect() throws ExcepcionAplicacion {
        if (this.isFuncionSelectAutorizada()) {
            this.ejecutarFuncionSelect(this.getFuncionSelect());
        } else {
            this.ejecutarFuncionSelect(this.getFuncionConsultarRecurso());
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion) throws ExcepcionAplicacion {
        this.ejecutarFuncionSelect(funcion, new FiltroBusqueda());
    }

    @Override
    public void ejecutarFuncionSelect(Long filtro) throws ExcepcionAplicacion {
        if (this.isFuncionSelectAutorizada()) {
            this.ejecutarFuncionSelect(this.getFuncionSelect(), filtro);
        } else {
            this.ejecutarFuncionSelect(this.getFuncionConsultarRecurso(), filtro);
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion, Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.ejecutarFuncionSelect(funcion, new FiltroBusqueda());
        } else {
            this.ejecutarFuncionSelect(funcion, new FiltroBusqueda(filtro));
        }
    }

    @Override
    public void ejecutarFuncionSelect(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (this.isFuncionSelectAutorizada()) {
            this.ejecutarFuncionSelect(this.getFuncionSelect(), filtro);
        } else {
            this.ejecutarFuncionSelect(this.getFuncionConsultarRecurso(), filtro);
        }
    }

    @Override
    public void ejecutarFuncionSelect(long funcion, FiltroBusqueda filtro) throws ExcepcionAplicacion {
        if (funcion == FUNCION_CONSULTAR_RELACION_RASTRO_FUNCION) {
            this.consultarRelacionRastroFuncion(filtro);
            return;
        }
    }

    public void consultarRelacionRastroFuncion() throws ExcepcionAplicacion {
        this.consultarRelacionRastroFuncion(new FiltroBusqueda());
    }

    public void consultarRelacionRastroFuncion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRelacionRastroFuncion(new FiltroBusqueda());
        } else {
            this.consultarRelacionRastroFuncion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRelacionRastroFuncion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_RELACION_RASTRO_FUNCION);
            if (filtro == null) {
                filtro = new FiltroBusqueda();
            }
            Long propietario = TLC.getControlador().getPropietarioAutorizado();
            if (propietario != null) {
                filtro.addCriterio(COLUMNA_PROPIETARIO_RECURSO, EnumOperadorCom.ES_NULO_O_ES_IGUAL, propietario);
            }
            criterios = this.getCriteriosBusqueda();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
                clausula = "AND";
            }
            criterios = filtro.toString(CODIGO_DOMINIO_RECURSO);
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
            }
            clausula = "ORDER BY";
            criterios = this.getCriteriosOrden();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " " + criterios + " ";
            } else {
                comando += clausula + " id_rastro_funcion DESC ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
