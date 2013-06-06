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
package com.egt.data.generic.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.generic.xdp1.ProcesoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ProcesoCachedRowSetDataProvider2 extends ProcesoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ProcesoCachedRowSetDataProvider2() {
        super();
    }

    public ProcesoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 200200101L;

    public static final long FUNCION_PROCESO_IMPORTAR_ARCHIVOS_EXT = 200200151L;
    public static final long FUNCION_PROCESO_ACREDITAR_POT_BEN = 200200152L;
    public static final long FUNCION_PROCESO_ASIGNAR_MESA = 200200153L;
    public static final long FUNCION_PROCESO_PREPARAR_PROX_PAGO_PEN = 200200154L;
    public static final long FUNCION_PROCESO_OTORGAR_PENSIONES_APR = 200200155L;
    public static final long FUNCION_PROCESO_DENEGAR_PENSIONES_OBJ = 200200156L;
    public static final long FUNCION_PROCESO_ACTUALIZAR_PEN_EN_JUPE = 200200157L;
    public static final long FUNCION_PROCESO_ASIGNAR_MONTO_PENSION = 200200158L;
    public static final long FUNCION_PROCESO_VERIFICAR_ELE_PEN = 200200159L;
    public static final long FUNCION_PROCESO_VERIFICAR_ELE_PEN_JUPE = 200200160L;
    public static final long FUNCION_PROCESO_REVOCAR_PENSIONES_APR = 200200161L;
    public static final long FUNCION_PROCESO_APROBAR_EXCLUSION_PEN = 200200162L;
    public static final long FUNCION_PROCESO_EXP_PEN_APR = 200200163L;
    public static final long FUNCION_PROCESO_EXP_PEN_DEN = 200200164L;
    public static final long FUNCION_PROCESO_EXP_PEN_REV = 200200165L;
    public static final long FUNCION_CONSULTAR_PROCESO = 200200101L;

    public static final String PROCESO_FUNCION_PROCESO_IMPORTAR_ARCHIVOS_EXT = "proceso_importar_archivos_ext";
    public static final String PROCESO_FUNCION_PROCESO_ACREDITAR_POT_BEN = "proceso_acreditar_pot_ben";
    public static final String PROCESO_FUNCION_PROCESO_ASIGNAR_MESA = "proceso_asignar_mesa";
    public static final String PROCESO_FUNCION_PROCESO_PREPARAR_PROX_PAGO_PEN = "proceso_preparar_prox_pago_pen";
    public static final String PROCESO_FUNCION_PROCESO_OTORGAR_PENSIONES_APR = "proceso_otorgar_pensiones_apr";
    public static final String PROCESO_FUNCION_PROCESO_DENEGAR_PENSIONES_OBJ = "proceso_denegar_pensiones_obj";
    public static final String PROCESO_FUNCION_PROCESO_ACTUALIZAR_PEN_EN_JUPE = "proceso_actualizar_pen_en_jupe";
    public static final String PROCESO_FUNCION_PROCESO_ASIGNAR_MONTO_PENSION = "proceso_asignar_monto_pension";
    public static final String PROCESO_FUNCION_PROCESO_VERIFICAR_ELE_PEN = "proceso_verificar_ele_pen";
    public static final String PROCESO_FUNCION_PROCESO_VERIFICAR_ELE_PEN_JUPE = "proceso_verificar_ele_pen_jupe";
    public static final String PROCESO_FUNCION_PROCESO_REVOCAR_PENSIONES_APR = "proceso_revocar_pensiones_apr";
    public static final String PROCESO_FUNCION_PROCESO_APROBAR_EXCLUSION_PEN = "proceso_aprobar_exclusion_pen";
    public static final String PROCESO_FUNCION_PROCESO_EXP_PEN_APR = "proceso_exp_pen_apr";
    public static final String PROCESO_FUNCION_PROCESO_EXP_PEN_DEN = "proceso_exp_pen_den";
    public static final String PROCESO_FUNCION_PROCESO_EXP_PEN_REV = "proceso_exp_pen_rev";

    protected static final long PARAMETRO_ID_UBICACION = 20513L;
    protected static final long PARAMETRO_FECHA_REGISTRO_POT_BEN_DESDE = 10011L;
    protected static final long PARAMETRO_FECHA_REGISTRO_POT_BEN_HASTA = 10012L;
    protected static final long PARAMETRO_EDAD_DESDE = 10027L;
    protected static final long PARAMETRO_EDAD_HASTA = 10028L;
    protected static final long PARAMETRO_LOTE = 20997L;
    protected static final long PARAMETRO_CODIGO_SIME = 20996L;
    protected static final long PARAMETRO_FECHA_SOLICITUD_PENSION_DESDE = 10001L;
    protected static final long PARAMETRO_FECHA_SOLICITUD_PENSION_HASTA = 10002L;
    protected static final long PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN = 20675L;
    protected static final long PARAMETRO_FECHA_RESOLUCION_OTOR_PEN = 20672L;
    protected static final long PARAMETRO_CEDULA_DESDE = 10029L;
    protected static final long PARAMETRO_CEDULA_HASTA = 10030L;
    protected static final long PARAMETRO_NUMERO_RESOLUCION_DEN_PEN = 20683L;
    protected static final long PARAMETRO_FECHA_RESOLUCION_DEN_PEN = 20681L;
    protected static final long PARAMETRO_MONTO_PENSION = 20197L;
    protected static final long PARAMETRO_FECHA_RESOLUCION_REV_PEN = 21009L;
    protected static final long PARAMETRO_NUMERO_RESOLUCION_REV_PEN = 21011L;
    protected static final long PARAMETRO_ID_PROCESO = 20253L;
    protected static final long PARAMETRO_VERSION_PROCESO = 20257L;
    protected static final long PARAMETRO_CODIGO_PROCESO = 20690L;
    protected static final long PARAMETRO_NOMBRE_PROCESO = 20693L;

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
        if (funcion == FUNCION_CONSULTAR_PROCESO) {
            this.consultarProceso(filtro);
            return;
        }
    }

    public void consultarProceso() throws ExcepcionAplicacion {
        this.consultarProceso(new FiltroBusqueda());
    }

    public void consultarProceso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarProceso(new FiltroBusqueda());
        } else {
            this.consultarProceso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarProceso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PROCESO);
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
                comando += clausula + " id_proceso ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
