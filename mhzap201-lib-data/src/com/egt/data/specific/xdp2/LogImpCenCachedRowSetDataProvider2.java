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
import com.egt.data.specific.xdp1.LogImpCenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogImpCenCachedRowSetDataProvider2 extends LogImpCenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogImpCenCachedRowSetDataProvider2() {
        super();
    }

    public LogImpCenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 331000101L;

    public static final long FUNCION_CONSULTAR_LOG_IMP_CEN = 331000101L;

    protected static final long PARAMETRO_ID_LOG_IMP_CEN = 20890L;
    protected static final long PARAMETRO_VERSION_LOG_IMP_CEN = 20894L;
    protected static final long PARAMETRO_ORDEN = 20739L;
    protected static final long PARAMETRO_BARRIO = 20696L;
    protected static final long PARAMETRO_DIRECCION = 20326L;
    protected static final long PARAMETRO_TELEFONO = 20838L;
    protected static final long PARAMETRO_PRIMER_NOMBRE = 20104L;
    protected static final long PARAMETRO_SEGUNDO_NOMBRE = 20107L;
    protected static final long PARAMETRO_PRIMER_APELLIDO = 20103L;
    protected static final long PARAMETRO_SEGUNDO_APELLIDO = 20106L;
    protected static final long PARAMETRO_EDAD_A_LA_FECHA = 20705L;
    protected static final long PARAMETRO_SEXO = 20837L;
    protected static final long PARAMETRO_PARENTESCO = 20892L;
    protected static final long PARAMETRO_CEDULA = 20697L;
    protected static final long PARAMETRO_NOMBRE_JEFE_HOGAR = 20361L;
    protected static final long PARAMETRO_CEDULA_JEFE_HOGAR = 20888L;
    protected static final long PARAMETRO_ICV = 20712L;
    protected static final long PARAMETRO_VALIDADO = 20893L;
    protected static final long PARAMETRO_OBSERVACIONES = 20433L;
    protected static final long PARAMETRO_FUNCIONARIO = 20889L;
    protected static final long PARAMETRO_CAUSA_INVALIDACION = 20887L;
    protected static final long PARAMETRO_ES_IMPORTADO = 20706L;
    protected static final long PARAMETRO_OBSERVACION = 20738L;
    protected static final long PARAMETRO_FECHA_HORA_TRANSACCION = 20709L;
    protected static final long PARAMETRO_NOMBRE_ARCHIVO = 1389L;
    protected static final long PARAMETRO_CODIGO_ARCHIVO = 20699L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

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
        if (funcion == FUNCION_CONSULTAR_LOG_IMP_CEN) {
            this.consultarLogImpCen(filtro);
            return;
        }
    }

    public void consultarLogImpCen() throws ExcepcionAplicacion {
        this.consultarLogImpCen(new FiltroBusqueda());
    }

    public void consultarLogImpCen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogImpCen(new FiltroBusqueda());
        } else {
            this.consultarLogImpCen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogImpCen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_IMP_CEN);
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
                comando += clausula + " id_log_imp_cen ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
