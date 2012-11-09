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
import com.egt.data.general.xdp1.RastroProcesoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RastroProcesoCachedRowSetDataProvider2 extends RastroProcesoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RastroProcesoCachedRowSetDataProvider2() {
        super();
    }

    public RastroProcesoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 107400101L;

    public static final long FUNCION_CONSULTAR_RASTRO_PROCESO = 107400101L;

    protected static final long PARAMETRO_ID_RASTRO_PROCESO = 1361L;
    protected static final long PARAMETRO_VERSION_RASTRO_PROCESO = 1621L;
    protected static final long PARAMETRO_FECHA_HORA_INICIO_EJECUCION = 1291L;
    protected static final long PARAMETRO_FECHA_HORA_FIN_EJECUCION = 1290L;
    protected static final long PARAMETRO_ID_USUARIO = 1379L;
    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_NUMERO_CONDICION_EJE_FUN = 1473L;
    protected static final long PARAMETRO_NOMBRE_ARCHIVO = 1389L;
    protected static final long PARAMETRO_DESCRIPCION_ERROR = 1222L;
    protected static final long PARAMETRO_ID_GRUPO_PROCESO = 1333L;
    protected static final long PARAMETRO_ID_RASTRO_PROCESO_SUPERIOR = 1362L;
    protected static final long PARAMETRO_SUBPROCESOS = 1701L;
    protected static final long PARAMETRO_SUBPROCESOS_PENDIENTES = 1705L;
    protected static final long PARAMETRO_SUBPROCESOS_EN_PROGRESO = 1704L;
    protected static final long PARAMETRO_SUBPROCESOS_SIN_ERRORES = 1706L;
    protected static final long PARAMETRO_SUBPROCESOS_CON_ERRORES = 1703L;
    protected static final long PARAMETRO_SUBPROCESOS_CANCELADOS = 1702L;
    protected static final long PARAMETRO_PROCEDIMIENTO_AFTER_UPDATE = 1511L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_EJE_FUN = 107800101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_EJE_FUN = {"condicion_eje_fun", "numero_condicion_eje_fun", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_RASTRO_PROCESO) {
            this.consultarRastroProceso(filtro);
            return;
        }
    }

    public void consultarRastroProceso() throws ExcepcionAplicacion {
        this.consultarRastroProceso(new FiltroBusqueda());
    }

    public void consultarRastroProceso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRastroProceso(new FiltroBusqueda());
        } else {
            this.consultarRastroProceso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRastroProceso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_RASTRO_PROCESO);
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
                comando += clausula + " id_rastro_proceso DESC ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
