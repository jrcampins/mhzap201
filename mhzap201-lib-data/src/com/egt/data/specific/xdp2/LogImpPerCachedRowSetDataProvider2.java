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
import com.egt.data.specific.xdp1.LogImpPerCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogImpPerCachedRowSetDataProvider2 extends LogImpPerCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogImpPerCachedRowSetDataProvider2() {
        super();
    }

    public LogImpPerCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 331200101L;

    public static final long FUNCION_CONSULTAR_LOG_IMP_PER = 331200101L;

    protected static final long PARAMETRO_ID_LOG_IMP_PER = 20720L;
    protected static final long PARAMETRO_VERSION_LOG_IMP_PER = 20878L;
    protected static final long PARAMETRO_P01A = 20740L;
    protected static final long PARAMETRO_P01B = 20741L;
    protected static final long PARAMETRO_P01C = 20742L;
    protected static final long PARAMETRO_P01D = 20743L;
    protected static final long PARAMETRO_P02 = 20744L;
    protected static final long PARAMETRO_P03 = 20745L;
    protected static final long PARAMETRO_P104 = 20752L;
    protected static final long PARAMETRO_P43 = 20788L;
    protected static final long PARAMETRO_P45A = 20791L;
    protected static final long PARAMETRO_P45B = 20792L;
    protected static final long PARAMETRO_P44A = 20789L;
    protected static final long PARAMETRO_P44B = 20790L;
    protected static final long PARAMETRO_VAR00001 = 20845L;
    protected static final long PARAMETRO_VAR00002 = 20846L;
    protected static final long PARAMETRO_P46 = 20793L;
    protected static final long PARAMETRO_P47 = 20794L;
    protected static final long PARAMETRO_VAR00030 = 20869L;
    protected static final long PARAMETRO_P48 = 20795L;
    protected static final long PARAMETRO_P49 = 20796L;
    protected static final long PARAMETRO_P50A = 20797L;
    protected static final long PARAMETRO_P50B = 20798L;
    protected static final long PARAMETRO_P50C = 20799L;
    protected static final long PARAMETRO_P51 = 20800L;
    protected static final long PARAMETRO_VAR00003 = 20847L;
    protected static final long PARAMETRO_VAR00004 = 20848L;
    protected static final long PARAMETRO_P52D = 20802L;
    protected static final long PARAMETRO_P52M = 20803L;
    protected static final long PARAMETRO_P52A = 20801L;
    protected static final long PARAMETRO_P53A = 20804L;
    protected static final long PARAMETRO_P53B = 20805L;
    protected static final long PARAMETRO_P53C = 20806L;
    protected static final long PARAMETRO_P53Z = 20807L;
    protected static final long PARAMETRO_P54 = 20808L;
    protected static final long PARAMETRO_P54E = 20809L;
    protected static final long PARAMETRO_P56 = 20810L;
    protected static final long PARAMETRO_P58 = 20811L;
    protected static final long PARAMETRO_P58E = 20812L;
    protected static final long PARAMETRO_P59 = 20813L;
    protected static final long PARAMETRO_P60 = 20814L;
    protected static final long PARAMETRO_P61 = 20815L;
    protected static final long PARAMETRO_P62 = 20816L;
    protected static final long PARAMETRO_P63 = 20817L;
    protected static final long PARAMETRO_P64 = 20818L;
    protected static final long PARAMETRO_P65 = 20819L;
    protected static final long PARAMETRO_P65E = 20820L;
    protected static final long PARAMETRO_P66 = 20821L;
    protected static final long PARAMETRO_P66E = 20822L;
    protected static final long PARAMETRO_P67 = 20823L;
    protected static final long PARAMETRO_P68 = 20824L;
    protected static final long PARAMETRO_P68E = 20825L;
    protected static final long PARAMETRO_P73 = 20826L;
    protected static final long PARAMETRO_P74 = 20827L;
    protected static final long PARAMETRO_VAR00006 = 20849L;
    protected static final long PARAMETRO_VAR00007 = 20850L;
    protected static final long PARAMETRO_VAR00008 = 20851L;
    protected static final long PARAMETRO_VAR00009 = 20852L;
    protected static final long PARAMETRO_VAR00010 = 20853L;
    protected static final long PARAMETRO_VAR00011 = 20854L;
    protected static final long PARAMETRO_VAR00031 = 20870L;
    protected static final long PARAMETRO_VAR00012 = 20855L;
    protected static final long PARAMETRO_VAR00013 = 20856L;
    protected static final long PARAMETRO_P86 = 20828L;
    protected static final long PARAMETRO_P87 = 20829L;
    protected static final long PARAMETRO_P87E = 20830L;
    protected static final long PARAMETRO_P88 = 20831L;
    protected static final long PARAMETRO_P88E = 20832L;
    protected static final long PARAMETRO_P91 = 20833L;
    protected static final long PARAMETRO_VAR00017 = 20857L;
    protected static final long PARAMETRO_VAR00018 = 20858L;
    protected static final long PARAMETRO_VAR00019 = 20859L;
    protected static final long PARAMETRO_VAR00020 = 20860L;
    protected static final long PARAMETRO_VAR00021 = 20861L;
    protected static final long PARAMETRO_VAR00022 = 20862L;
    protected static final long PARAMETRO_VAR00023 = 20863L;
    protected static final long PARAMETRO_VAR00024 = 20864L;
    protected static final long PARAMETRO_VAR00025 = 20865L;
    protected static final long PARAMETRO_VAR00026 = 20866L;
    protected static final long PARAMETRO_VAR00027 = 20867L;
    protected static final long PARAMETRO_VAR00028 = 20868L;
    protected static final long PARAMETRO_P92 = 20834L;
    protected static final long PARAMETRO_ICV = 20712L;
    protected static final long PARAMETRO_FICHA_ACTIVA = 20710L;
    protected static final long PARAMETRO_ES_IMPORTADO = 20706L;
    protected static final long PARAMETRO_OBSERVACION = 20738L;
    protected static final long PARAMETRO_FECHA_HORA_TRANSACCION = 20709L;
    protected static final long PARAMETRO_NOMBRE_ARCHIVO = 1389L;
    protected static final long PARAMETRO_CODIGO_ARCHIVO = 20699L;
    protected static final long PARAMETRO_ID_FICHA_PERSONA = 20342L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA = 320200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA = {"ficha_persona", "id_ficha_persona", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_LOG_IMP_PER) {
            this.consultarLogImpPer(filtro);
            return;
        }
    }

    public void consultarLogImpPer() throws ExcepcionAplicacion {
        this.consultarLogImpPer(new FiltroBusqueda());
    }

    public void consultarLogImpPer(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogImpPer(new FiltroBusqueda());
        } else {
            this.consultarLogImpPer(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogImpPer(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_IMP_PER);
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
                comando += clausula + " id_log_imp_per ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
