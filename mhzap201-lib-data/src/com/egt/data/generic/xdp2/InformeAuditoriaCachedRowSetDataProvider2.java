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
import com.egt.commons.util.TimeUtils;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.generic.xdp1.InformeAuditoriaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class InformeAuditoriaCachedRowSetDataProvider2 extends InformeAuditoriaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public InformeAuditoriaCachedRowSetDataProvider2() {
        super();
    }

    public InformeAuditoriaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 200300101L;

    public static final long FUNCION_CONSULTAR_INFORME_AUDITORIA = 200300101L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_DEUDORES = 200300151L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_EMPLEADOS = 200300152L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FALLECIDOS = 200300153L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_HOGAR = 200300154L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_PERSONA = 200300155L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_IDENTIFICACIONES = 200300156L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_JUBILADOS = 200300157L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_PENSIONADOS = 200300158L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_POTENCIALES_BENEFICIARIOS = 200300159L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_SUBSIDIOS = 200300160L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_ARCHIVOS_EXTERNOS = 200300161L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_ACREDITAR_POTENCIALES_BENEFICIARIOS = 200300162L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_APROBAR_DENEGAR_PENSION = 200300163L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_APROBATORIA = 200300164L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_DENEGATORIA = 200300165L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_INCORPORAR_PENSIONADOS_AL_JUPE = 200300166L;
    public static final long FUNCION_EMITIR_INFORME_AUDITORIA_VERIFICAR_ELEGIBILIDAD_PARA_PENSION = 200300167L;

    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_DEUDORES = "informe_auditoria_importar_deudores";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_EMPLEADOS = "informe_auditoria_importar_empleados";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FALLECIDOS = "informe_auditoria_importar_fallecidos";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_HOGAR = "informe_auditoria_importar_ficha_hogar";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_PERSONA = "informe_auditoria_importar_ficha_persona";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_IDENTIFICACIONES = "informe_auditoria_importar_identificaciones";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_JUBILADOS = "informe_auditoria_importar_jubilados";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_PENSIONADOS = "informe_auditoria_importar_pensionados";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_POTENCIALES_BENEFICIARIOS = "informe_auditoria_importar_potenciales_beneficiarios";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_SUBSIDIOS = "informe_auditoria_importar_subsidios";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_ARCHIVOS_EXTERNOS = "informe_auditoria_importar_archivos_externos";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_ACREDITAR_POTENCIALES_BENEFICIARIOS = "informe_auditoria_acreditar_potenciales_beneficiarios";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_APROBAR_DENEGAR_PENSION = "informe_auditoria_aprobar_denegar_pension";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_APROBATORIA = "informe_auditoria_registrar_resolucion_aprobatoria";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_DENEGATORIA = "informe_auditoria_registrar_resolucion_denegatoria";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_INCORPORAR_PENSIONADOS_AL_JUPE = "informe_auditoria_incorporar_pensionados_al_jupe";
    public static final String INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_VERIFICAR_ELEGIBILIDAD_PARA_PENSION = "informe_auditoria_verificar_elegibilidad_para_pension";

    protected static final long PARAMETRO_ID_INFORME_AUDITORIA = 20685L;
    protected static final long PARAMETRO_VERSION_INFORME_AUDITORIA = 20687L;
    protected static final long PARAMETRO_CODIGO_INFORME_AUDITORIA = 20689L;
    protected static final long PARAMETRO_NOMBRE_INFORME_AUDITORIA = 20692L;
    protected static final long PARAMETRO_FECHA_TRANSACCION = 1990L;
    protected static final long PARAMETRO_FECHA_TRANSACCION_DESDE = 1991L;
    protected static final long PARAMETRO_FECHA_TRANSACCION_HASTA = 1992L;

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
        if (funcion == FUNCION_CONSULTAR_INFORME_AUDITORIA) {
            this.consultarInformeAuditoria(filtro);
            return;
        }
    }

    public void consultarInformeAuditoria() throws ExcepcionAplicacion {
        this.consultarInformeAuditoria(new FiltroBusqueda());
    }

    public void consultarInformeAuditoria(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarInformeAuditoria(new FiltroBusqueda());
        } else {
            this.consultarInformeAuditoria(new FiltroBusqueda(filtro));
        }
    }

    public void consultarInformeAuditoria(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_INFORME_AUDITORIA);
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
                comando += clausula + " id_informe_auditoria ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }
}
