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
import com.egt.data.specific.xdp1.LogImpHogEecCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogImpHogEecCachedRowSetDataProvider2 extends LogImpHogEecCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogImpHogEecCachedRowSetDataProvider2() {
        super();
    }

    public LogImpHogEecCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 331050101L;

    public static final long FUNCION_CONSULTAR_LOG_IMP_HOG_EEC = 331050101L;

    protected static final long PARAMETRO_ID_LOG_IMP_HOG_EEC = 20911L;
    protected static final long PARAMETRO_VERSION_LOG_IMP_HOG_EEC = 20993L;
    protected static final long PARAMETRO_DPTOD = 20907L;
    protected static final long PARAMETRO_DISTRITOD = 20906L;
    protected static final long PARAMETRO_DISTRIPG = 20905L;
    protected static final long PARAMETRO_AREA = 20902L;
    protected static final long PARAMETRO_BARRIO = 20696L;
    protected static final long PARAMETRO_MANZANA = 20664L;
    protected static final long PARAMETRO_FORMULARIO = 20909L;
    protected static final long PARAMETRO_VIVI = 20995L;
    protected static final long PARAMETRO_HOGAR = 20910L;
    protected static final long PARAMETRO_DIRECCION = 20326L;
    protected static final long PARAMETRO_NRO_DE = 20914L;
    protected static final long PARAMETRO_TELEFONO = 20838L;
    protected static final long PARAMETRO_FECHA = 20908L;
    protected static final long PARAMETRO_DIA = 20904L;
    protected static final long PARAMETRO_MES = 20913L;
    protected static final long PARAMETRO_ANO = 20901L;
    protected static final long PARAMETRO_V10T = 20962L;
    protected static final long PARAMETRO_V11 = 20963L;
    protected static final long PARAMETRO_V12 = 20964L;
    protected static final long PARAMETRO_V13 = 20965L;
    protected static final long PARAMETRO_V14 = 20966L;
    protected static final long PARAMETRO_V15 = 20967L;
    protected static final long PARAMETRO_V16 = 20968L;
    protected static final long PARAMETRO_V16_OTR = 20969L;
    protected static final long PARAMETRO_V17A = 20970L;
    protected static final long PARAMETRO_V17B = 20971L;
    protected static final long PARAMETRO_V18 = 20972L;
    protected static final long PARAMETRO_V19 = 20973L;
    protected static final long PARAMETRO_V20 = 20974L;
    protected static final long PARAMETRO_V21 = 20975L;
    protected static final long PARAMETRO_V22 = 20976L;
    protected static final long PARAMETRO_V23 = 20977L;
    protected static final long PARAMETRO_V24 = 20978L;
    protected static final long PARAMETRO_V25 = 20979L;
    protected static final long PARAMETRO_V26 = 20980L;
    protected static final long PARAMETRO_V26ESP_CELULAR = 20981L;
    protected static final long PARAMETRO_V27 = 20982L;
    protected static final long PARAMETRO_V27ESP_LINEA = 20983L;
    protected static final long PARAMETRO_V28_1 = 20984L;
    protected static final long PARAMETRO_V28_2 = 20985L;
    protected static final long PARAMETRO_V28_3 = 20986L;
    protected static final long PARAMETRO_V28_4 = 20987L;
    protected static final long PARAMETRO_V28_5 = 20988L;
    protected static final long PARAMETRO_V28_6 = 20989L;
    protected static final long PARAMETRO_V28_7 = 20990L;
    protected static final long PARAMETRO_V28_8 = 20991L;
    protected static final long PARAMETRO_V29NOMBRE_JEFE = 20992L;
    protected static final long PARAMETRO_CEDULAJEFE = 20903L;
    protected static final long PARAMETRO_VAR00001 = 20845L;
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
        if (funcion == FUNCION_CONSULTAR_LOG_IMP_HOG_EEC) {
            this.consultarLogImpHogEec(filtro);
            return;
        }
    }

    public void consultarLogImpHogEec() throws ExcepcionAplicacion {
        this.consultarLogImpHogEec(new FiltroBusqueda());
    }

    public void consultarLogImpHogEec(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogImpHogEec(new FiltroBusqueda());
        } else {
            this.consultarLogImpHogEec(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogImpHogEec(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_IMP_HOG_EEC);
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
                comando += clausula + " id_log_imp_hog_eec ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
