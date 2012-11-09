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
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.specific.xdp1.ParametroGlobalCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ParametroGlobalCachedRowSetDataProvider2 extends ParametroGlobalCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ParametroGlobalCachedRowSetDataProvider2() {
        super();
    }

    public ParametroGlobalCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 300100101L;

    public static final long FUNCION_CONSULTAR_PARAMETRO_GLOBAL = 300100101L;
    public static final long FUNCION_CREAR_PARAMETRO_GLOBAL = 300100102L;
    public static final long FUNCION_MODIFICAR_PARAMETRO_GLOBAL = 300100103L;
    public static final long FUNCION_ELIMINAR_PARAMETRO_GLOBAL = 300100104L;

    protected static final long PARAMETRO_NUMERO_PARAMETRO_GLOBAL = 20202L;
    protected static final long PARAMETRO_CODIGO_PARAMETRO_GLOBAL = 20624L;
    protected static final long PARAMETRO_MONTO_SALARIO_MINIMO = 20198L;
    protected static final long PARAMETRO_PORCENTAJE_PENSION_ALIMENTARIA = 20560L;
    protected static final long PARAMETRO_ES_CONTROL_CER_VIDA_ACTIVO = 20194L;
    protected static final long PARAMETRO_MESES_VALIDEZ_CERTIFICADO_VIDA = 20196L;
    protected static final long PARAMETRO_ES_CONTROL_COBRO_PENSION_ACTIV = 20656L;
    protected static final long PARAMETRO_MESES_ULTIMO_COBRO_PENSION = 20660L;
    protected static final long PARAMETRO_ES_CONTROL_REPROCESO_PEN_ACTIV = 20657L;
    protected static final long PARAMETRO_LIMITE_INDICE_CALIDAD_VIDA = 20658L;
    protected static final long PARAMETRO_LIMITE_PENSIONES = 20659L;

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
        if (funcion == FUNCION_CONSULTAR_PARAMETRO_GLOBAL) {
            this.consultarParametroGlobal(filtro);
            return;
        }
    }

    public void consultarParametroGlobal() throws ExcepcionAplicacion {
        this.consultarParametroGlobal(new FiltroBusqueda());
    }

    public void consultarParametroGlobal(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarParametroGlobal(new FiltroBusqueda());
        } else {
            this.consultarParametroGlobal(new FiltroBusqueda(filtro));
        }
    }

    public void consultarParametroGlobal(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PARAMETRO_GLOBAL);
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
                comando += clausula + " numero_parametro_global ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearParametroGlobal() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PARAMETRO_GLOBAL);
    }

    public void modificarParametroGlobal(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PARAMETRO_GLOBAL);
    }

    public void modificarParametroGlobal(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PARAMETRO_GLOBAL);
    }

    public void eliminarParametroGlobal(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PARAMETRO_GLOBAL);
    }

    public void eliminarParametroGlobal(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PARAMETRO_GLOBAL);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PARAMETRO_GLOBAL) {
            this.posCrearParametroGlobal(rowKey);
            return;
        }
    }

    protected void posCrearParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PARAMETRO_GLOBAL) {
            es = this.esFilaModificableConModificarParametroGlobal(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarParametroGlobal(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PARAMETRO_GLOBAL);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PARAMETRO_GLOBAL) {
            this.posModificarParametroGlobal(rowKey);
            return;
        }
    }

    protected void posModificarParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PARAMETRO_GLOBAL) {
            es = this.esFilaEliminableConEliminarParametroGlobal(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarParametroGlobal(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PARAMETRO_GLOBAL) {
            this.preEliminarParametroGlobal(rowKey);
            return;
        }
    }

    protected void preEliminarParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PARAMETRO_GLOBAL) {
            this.posEliminarParametroGlobal(rowKey);
            return;
        }
    }

    protected void posEliminarParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PARAMETRO_GLOBAL) {
            es = this.esFilaValidaParaCrearParametroGlobal(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PARAMETRO_GLOBAL) {
            es = this.esFilaValidaParaModificarParametroGlobal(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearParametroGlobal(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarParametroGlobal(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_PARAMETRO_GLOBAL) {
            this.preCommitCrearParametroGlobal(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PARAMETRO_GLOBAL) {
            this.preCommitModificarParametroGlobal(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PARAMETRO_GLOBAL) {
            this.preCommitEliminarParametroGlobal(rowKey);
            return;
        }
    }

    protected void preCommitCrearParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PARAMETRO_GLOBAL);
        rastro.addParametro(PARAMETRO_NUMERO_PARAMETRO_GLOBAL, this.getNumeroParametroGlobal(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PARAMETRO_GLOBAL, this.getCodigoParametroGlobal(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_SALARIO_MINIMO, this.getMontoSalarioMinimo(rowKey));
        rastro.addParametro(PARAMETRO_PORCENTAJE_PENSION_ALIMENTARIA, this.getPorcentajePensionAlimentaria(rowKey));
        rastro.addParametro(PARAMETRO_ES_CONTROL_CER_VIDA_ACTIVO, this.getEsControlCerVidaActivo(rowKey));
        rastro.addParametro(PARAMETRO_MESES_VALIDEZ_CERTIFICADO_VIDA, this.getMesesValidezCertificadoVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_CONTROL_COBRO_PENSION_ACTIV, this.getEsControlCobroPensionActiv(rowKey));
        rastro.addParametro(PARAMETRO_MESES_ULTIMO_COBRO_PENSION, this.getMesesUltimoCobroPension(rowKey));
        rastro.addParametro(PARAMETRO_ES_CONTROL_REPROCESO_PEN_ACTIV, this.getEsControlReprocesoPenActiv(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_INDICE_CALIDAD_VIDA, this.getLimiteIndiceCalidadVida(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_PENSIONES, this.getLimitePensiones(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PARAMETRO_GLOBAL);
        rastro.addParametro(PARAMETRO_NUMERO_PARAMETRO_GLOBAL, this.getNumeroParametroGlobal(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PARAMETRO_GLOBAL, this.getCodigoParametroGlobal(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_SALARIO_MINIMO, this.getMontoSalarioMinimo(rowKey));
        rastro.addParametro(PARAMETRO_PORCENTAJE_PENSION_ALIMENTARIA, this.getPorcentajePensionAlimentaria(rowKey));
        rastro.addParametro(PARAMETRO_ES_CONTROL_CER_VIDA_ACTIVO, this.getEsControlCerVidaActivo(rowKey));
        rastro.addParametro(PARAMETRO_MESES_VALIDEZ_CERTIFICADO_VIDA, this.getMesesValidezCertificadoVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_CONTROL_COBRO_PENSION_ACTIV, this.getEsControlCobroPensionActiv(rowKey));
        rastro.addParametro(PARAMETRO_MESES_ULTIMO_COBRO_PENSION, this.getMesesUltimoCobroPension(rowKey));
        rastro.addParametro(PARAMETRO_ES_CONTROL_REPROCESO_PEN_ACTIV, this.getEsControlReprocesoPenActiv(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_INDICE_CALIDAD_VIDA, this.getLimiteIndiceCalidadVida(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_PENSIONES, this.getLimitePensiones(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarParametroGlobal(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PARAMETRO_GLOBAL);
        rastro.addParametro(PARAMETRO_NUMERO_PARAMETRO_GLOBAL, this.getNumeroParametroGlobal(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setEsControlCerVidaActivo(rowKey, 0);
        this.setEsControlCobroPensionActiv(rowKey, 0);
        this.setEsControlReprocesoPenActiv(rowKey, 0);
        this.setLimitePensiones(rowKey, 0);
    }
}
