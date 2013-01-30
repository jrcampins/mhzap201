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
import com.egt.data.specific.xdp1.LogImpPerEecCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class LogImpPerEecCachedRowSetDataProvider2 extends LogImpPerEecCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public LogImpPerEecCachedRowSetDataProvider2() {
        super();
    }

    public LogImpPerEecCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 331150101L;

    public static final long FUNCION_CONSULTAR_LOG_IMP_PER_EEC = 331150101L;

    protected static final long PARAMETRO_ID_LOG_IMP_PER_EEC = 20912L;
    protected static final long PARAMETRO_VERSION_LOG_IMP_PER_EEC = 20994L;
    protected static final long PARAMETRO_DPTOD = 20907L;
    protected static final long PARAMETRO_DISTRITOD = 20906L;
    protected static final long PARAMETRO_DISTRIPG = 20905L;
    protected static final long PARAMETRO_AREA = 20902L;
    protected static final long PARAMETRO_BARRIO = 20696L;
    protected static final long PARAMETRO_MANZANA = 20664L;
    protected static final long PARAMETRO_FORMULARIO = 20909L;
    protected static final long PARAMETRO_VIVI = 20995L;
    protected static final long PARAMETRO_HOGAR = 20910L;
    protected static final long PARAMETRO_ORDEN = 20739L;
    protected static final long PARAMETRO_P30 = 20770L;
    protected static final long PARAMETRO_P31 = 20771L;
    protected static final long PARAMETRO_P32 = 20772L;
    protected static final long PARAMETRO_P33 = 20773L;
    protected static final long PARAMETRO_P34 = 20774L;
    protected static final long PARAMETRO_P35 = 20775L;
    protected static final long PARAMETRO_P36_ORDEN_CONYUGUE = 20915L;
    protected static final long PARAMETRO_P36_ORDEN_PADRE = 20917L;
    protected static final long PARAMETRO_P36_ORDEN_MADRE = 20916L;
    protected static final long PARAMETRO_P37 = 20777L;
    protected static final long PARAMETRO_P37_CEDULA = 20918L;
    protected static final long PARAMETRO_P38_DIA = 20920L;
    protected static final long PARAMETRO_P38_MES = 20921L;
    protected static final long PARAMETRO_P38_ANO = 20919L;
    protected static final long PARAMETRO_P39PAIS = 20925L;
    protected static final long PARAMETRO_P39DPTO = 20924L;
    protected static final long PARAMETRO_P39DIST = 20923L;
    protected static final long PARAMETRO_P39AREA = 20922L;
    protected static final long PARAMETRO_P40_IDIOMA = 20926L;
    protected static final long PARAMETRO_P40OTR = 20927L;
    protected static final long PARAMETRO_P41 = 20928L;
    protected static final long PARAMETRO_P42 = 20929L;
    protected static final long PARAMETRO_P43 = 20788L;
    protected static final long PARAMETRO_P44_45T = 20931L;
    protected static final long PARAMETRO_P44 = 20930L;
    protected static final long PARAMETRO_P45 = 20932L;
    protected static final long PARAMETRO_P46 = 20793L;
    protected static final long PARAMETRO_P47 = 20794L;
    protected static final long PARAMETRO_P48 = 20795L;
    protected static final long PARAMETRO_P49 = 20796L;
    protected static final long PARAMETRO_P49_OTR = 20933L;
    protected static final long PARAMETRO_P50 = 20934L;
    protected static final long PARAMETRO_P50_OTR = 20935L;
    protected static final long PARAMETRO_P51 = 20800L;
    protected static final long PARAMETRO_P52 = 20936L;
    protected static final long PARAMETRO_P52_OTR = 20937L;
    protected static final long PARAMETRO_P53 = 20938L;
    protected static final long PARAMETRO_P54 = 20808L;
    protected static final long PARAMETRO_P54A = 20940L;
    protected static final long PARAMETRO_P54_OTR = 20939L;
    protected static final long PARAMETRO_P55 = 20941L;
    protected static final long PARAMETRO_P55_OTR = 20942L;
    protected static final long PARAMETRO_P56 = 20810L;
    protected static final long PARAMETRO_P57 = 20943L;
    protected static final long PARAMETRO_P58 = 20811L;
    protected static final long PARAMETRO_P59 = 20813L;
    protected static final long PARAMETRO_P60 = 20814L;
    protected static final long PARAMETRO_P61 = 20815L;
    protected static final long PARAMETRO_P62 = 20816L;
    protected static final long PARAMETRO_P63 = 20817L;
    protected static final long PARAMETRO_P63_ESPECIFICAR = 20944L;
    protected static final long PARAMETRO_P64DES = 20946L;
    protected static final long PARAMETRO_P64C = 20945L;
    protected static final long PARAMETRO_P65DES = 20948L;
    protected static final long PARAMETRO_P65C = 20947L;
    protected static final long PARAMETRO_P66 = 20821L;
    protected static final long PARAMETRO_P67A = 20949L;
    protected static final long PARAMETRO_P67B = 20950L;
    protected static final long PARAMETRO_P67C = 20951L;
    protected static final long PARAMETRO_P67D = 20952L;
    protected static final long PARAMETRO_P67E = 20953L;
    protected static final long PARAMETRO_P67F = 20954L;
    protected static final long PARAMETRO_P67G = 20955L;
    protected static final long PARAMETRO_P67H = 20956L;
    protected static final long PARAMETRO_P67I = 20957L;
    protected static final long PARAMETRO_P67J = 20958L;
    protected static final long PARAMETRO_P67K = 20959L;
    protected static final long PARAMETRO_P67L = 20960L;
    protected static final long PARAMETRO_P67TOT = 20961L;
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
        if (funcion == FUNCION_CONSULTAR_LOG_IMP_PER_EEC) {
            this.consultarLogImpPerEec(filtro);
            return;
        }
    }

    public void consultarLogImpPerEec() throws ExcepcionAplicacion {
        this.consultarLogImpPerEec(new FiltroBusqueda());
    }

    public void consultarLogImpPerEec(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarLogImpPerEec(new FiltroBusqueda());
        } else {
            this.consultarLogImpPerEec(new FiltroBusqueda(filtro));
        }
    }

    public void consultarLogImpPerEec(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_LOG_IMP_PER_EEC);
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
                comando += clausula + " id_log_imp_per_eec ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
