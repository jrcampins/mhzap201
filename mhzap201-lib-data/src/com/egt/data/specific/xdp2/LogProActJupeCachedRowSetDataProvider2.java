/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.specific.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.commons.util.TimeUtils;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.specific.xdp1.LogProActJupeCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogProActJupeCachedRowSetDataProvider2 extends LogProActJupeCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogProActJupeCachedRowSetDataProvider2() {
        super();
    }

    public LogProActJupeCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 332700101L;

    public static final long FUNCION_CONSULTAR_LOG_PRO_ACT_JUPE = 332700101L;

    protected static final long PARAMETRO_ID_LOG_PRO_ACT_JUPE = 20898L;
    protected static final long PARAMETRO_VERSION_LOG_PRO_ACT_JUPE = 20899L;
    protected static final long PARAMETRO_ID_PERSONA = 20002L;
    protected static final long PARAMETRO_CODIGO_PERSONA = 20001L;
    protected static final long PARAMETRO_NOMBRE_PERSONA = 20003L;
    protected static final long PARAMETRO_ID_DEPARTAMENTO = 20336L;
    protected static final long PARAMETRO_ID_DISTRITO = 20339L;
    protected static final long PARAMETRO_ID_BARRIO = 20333L;
    protected static final long PARAMETRO_NUMERO_CONDICION_PENSION = 20169L;
    protected static final long PARAMETRO_ES_PROCESADO = 20707L;
    protected static final long PARAMETRO_OBSERVACION = 20738L;
    protected static final long PARAMETRO_FECHA_HORA_TRANSACCION = 20709L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_PERSONA = 201000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_PENSION = 311300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PERSONA = {"persona", "id_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_PENSION = {"condicion_pension", "numero_condicion_pension", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_LOG_PRO_ACT_JUPE) {
            this.consultarLogProActJupe(filtro);
            return;
        }
    }

    public void consultarLogProActJupe() throws ExcepcionAplicacion {
        this.consultarLogProActJupe(new FiltroBusqueda());
    }

    public void consultarLogProActJupe(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogProActJupe(new FiltroBusqueda());
        } else {
            this.consultarLogProActJupe(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogProActJupe(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_PRO_ACT_JUPE);
            criterios = this.getCriteriosBusqueda();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
                clausula = "AND";
            }
            criterios = filtro == null ? null : filtro.toString(CODIGO_DOMINIO_RECURSO);
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
            }
            clausula = "ORDER BY";
            criterios = this.getCriteriosOrden();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " " + criterios + " ";
            } else {
                comando += clausula + " id_log_pro_act_jupe ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
