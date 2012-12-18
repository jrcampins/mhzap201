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
import com.egt.data.specific.xdp1.LogImpHogCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogImpHogCachedRowSetDataProvider2 extends LogImpHogCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogImpHogCachedRowSetDataProvider2() {
        super();
    }

    public LogImpHogCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 331100101L;

    public static final long FUNCION_CONSULTAR_LOG_IMP_HOG = 331100101L;

    protected static final long PARAMETRO_ID_LOG_IMP_HOG = 20716L;
    protected static final long PARAMETRO_VERSION_LOG_IMP_HOG = 20874L;
    protected static final long PARAMETRO_P20D = 20760L;
    protected static final long PARAMETRO_P20M = 20761L;
    protected static final long PARAMETRO_P20A = 20759L;
    protected static final long PARAMETRO_P17 = 20756L;
    protected static final long PARAMETRO_P18 = 20757L;
    protected static final long PARAMETRO_VAR00001 = 20845L;
    protected static final long PARAMETRO_P19 = 20758L;
    protected static final long PARAMETRO_OBSERVACIONES = 20433L;
    protected static final long PARAMETRO_UTM = 20844L;
    protected static final long PARAMETRO_GPS = 20711L;
    protected static final long PARAMETRO_ORDEN = 20739L;
    protected static final long PARAMETRO_COORDX = 20701L;
    protected static final long PARAMETRO_P01A = 20740L;
    protected static final long PARAMETRO_P01B = 20741L;
    protected static final long PARAMETRO_P01C = 20742L;
    protected static final long PARAMETRO_P01D = 20743L;
    protected static final long PARAMETRO_P02 = 20744L;
    protected static final long PARAMETRO_P03 = 20745L;
    protected static final long PARAMETRO_P04 = 20746L;
    protected static final long PARAMETRO_P05 = 20747L;
    protected static final long PARAMETRO_P06 = 20748L;
    protected static final long PARAMETRO_P08 = 20750L;
    protected static final long PARAMETRO_P07 = 20749L;
    protected static final long PARAMETRO_P09 = 20751L;
    protected static final long PARAMETRO_P14 = 20753L;
    protected static final long PARAMETRO_P15 = 20754L;
    protected static final long PARAMETRO_P16 = 20755L;
    protected static final long PARAMETRO_P24 = 20762L;
    protected static final long PARAMETRO_P25 = 20763L;
    protected static final long PARAMETRO_P26 = 20764L;
    protected static final long PARAMETRO_P27 = 20765L;
    protected static final long PARAMETRO_P27E = 20766L;
    protected static final long PARAMETRO_P28A = 20767L;
    protected static final long PARAMETRO_P28B = 20768L;
    protected static final long PARAMETRO_P29 = 20769L;
    protected static final long PARAMETRO_P30 = 20770L;
    protected static final long PARAMETRO_P31 = 20771L;
    protected static final long PARAMETRO_P32 = 20772L;
    protected static final long PARAMETRO_P33 = 20773L;
    protected static final long PARAMETRO_P34 = 20774L;
    protected static final long PARAMETRO_P35 = 20775L;
    protected static final long PARAMETRO_P36 = 20776L;
    protected static final long PARAMETRO_P37 = 20777L;
    protected static final long PARAMETRO_NRO_CELULAR = 20736L;
    protected static final long PARAMETRO_P38 = 20778L;
    protected static final long PARAMETRO_NRO_LINEA_BAJA = 20737L;
    protected static final long PARAMETRO_P391 = 20779L;
    protected static final long PARAMETRO_P392 = 20780L;
    protected static final long PARAMETRO_P393 = 20781L;
    protected static final long PARAMETRO_P394 = 20782L;
    protected static final long PARAMETRO_P395 = 20783L;
    protected static final long PARAMETRO_P396 = 20784L;
    protected static final long PARAMETRO_P397 = 20785L;
    protected static final long PARAMETRO_P42N = 20787L;
    protected static final long PARAMETRO_P42CI = 20786L;
    protected static final long PARAMETRO_LETRA_CI = 20730L;
    protected static final long PARAMETRO_P43 = 20788L;
    protected static final long PARAMETRO_VAR00002 = 20846L;
    protected static final long PARAMETRO_VAR00003 = 20847L;
    protected static final long PARAMETRO_VAR00004 = 20848L;
    protected static final long PARAMETRO_P104 = 20752L;
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
        if (funcion == FUNCION_CONSULTAR_LOG_IMP_HOG) {
            this.consultarLogImpHog(filtro);
            return;
        }
    }

    public void consultarLogImpHog() throws ExcepcionAplicacion {
        this.consultarLogImpHog(new FiltroBusqueda());
    }

    public void consultarLogImpHog(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogImpHog(new FiltroBusqueda());
        } else {
            this.consultarLogImpHog(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogImpHog(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_IMP_HOG);
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
                comando += clausula + " id_log_imp_hog ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
