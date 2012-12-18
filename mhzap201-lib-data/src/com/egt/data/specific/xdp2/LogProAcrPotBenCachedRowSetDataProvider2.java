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
import com.egt.data.specific.xdp1.LogProAcrPotBenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogProAcrPotBenCachedRowSetDataProvider2 extends LogProAcrPotBenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogProAcrPotBenCachedRowSetDataProvider2() {
        super();
    }

    public LogProAcrPotBenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 332100101L;

    public static final long FUNCION_CONSULTAR_LOG_PRO_ACR_POT_BEN = 332100101L;

    protected static final long PARAMETRO_ID_LOG_PRO_ACR_POT_BEN = 20724L;
    protected static final long PARAMETRO_VERSION_LOG_PRO_ACR_POT_BEN = 20882L;
    protected static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;
    protected static final long PARAMETRO_NOMBRE_POTENCIAL_BEN = 20573L;
    protected static final long PARAMETRO_CODIGO_POTENCIAL_BEN = 20577L;
    protected static final long PARAMETRO_FECHA_REGISTRO_POT_BEN = 20653L;
    protected static final long PARAMETRO_ID_PERSONA = 20002L;
    protected static final long PARAMETRO_NOMBRE_PERSONA = 20003L;
    protected static final long PARAMETRO_CODIGO_PERSONA = 20001L;
    protected static final long PARAMETRO_ID_DEPARTAMENTO = 20336L;
    protected static final long PARAMETRO_ID_DISTRITO = 20339L;
    protected static final long PARAMETRO_ID_BARRIO = 20333L;
    protected static final long PARAMETRO_ID_FICHA_PERSONA = 20342L;
    protected static final long PARAMETRO_CODIGO_FICHA_PERSONA = 20451L;
    protected static final long PARAMETRO_NOMBRE_FICHA_PERSONA = 20552L;
    protected static final long PARAMETRO_ID_FICHA_HOGAR = 20341L;
    protected static final long PARAMETRO_CODIGO_FICHA_HOGAR = 20450L;
    protected static final long PARAMETRO_INDICE_CALIDAD_VIDA = 20219L;
    protected static final long PARAMETRO_ES_PROCESADO = 20707L;
    protected static final long PARAMETRO_OBSERVACION = 20738L;
    protected static final long PARAMETRO_FECHA_HORA_TRANSACCION = 20709L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN = 320400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PERSONA = 201000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA = 320200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FICHA_HOGAR = 320100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN = {"potencial_ben", "id_potencial_ben", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PERSONA = {"persona", "id_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA = {"ficha_persona", "id_ficha_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FICHA_HOGAR = {"ficha_hogar", "id_ficha_hogar", "", ""};
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
        if (funcion == FUNCION_CONSULTAR_LOG_PRO_ACR_POT_BEN) {
            this.consultarLogProAcrPotBen(filtro);
            return;
        }
    }

    public void consultarLogProAcrPotBen() throws ExcepcionAplicacion {
        this.consultarLogProAcrPotBen(new FiltroBusqueda());
    }

    public void consultarLogProAcrPotBen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogProAcrPotBen(new FiltroBusqueda());
        } else {
            this.consultarLogProAcrPotBen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogProAcrPotBen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_PRO_ACR_POT_BEN);
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
                comando += clausula + " id_log_pro_acr_pot_ben ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
