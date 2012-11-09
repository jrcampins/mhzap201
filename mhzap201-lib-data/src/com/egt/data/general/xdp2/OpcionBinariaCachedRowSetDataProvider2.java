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
package com.egt.data.general.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.general.xdp1.OpcionBinariaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class OpcionBinariaCachedRowSetDataProvider2 extends OpcionBinariaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public OpcionBinariaCachedRowSetDataProvider2() {
        super();
    }

    public OpcionBinariaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 100100101L;

    public static final long FUNCION_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_CREAR_OPCION_BINARIA = 100100102L;
    public static final long FUNCION_MODIFICAR_OPCION_BINARIA = 100100103L;
    public static final long FUNCION_ELIMINAR_OPCION_BINARIA = 100100104L;

    protected static final long PARAMETRO_NUMERO_OPCION_BINARIA = 1480L;
    protected static final long PARAMETRO_CODIGO_OPCION_SI_NO = 1174L;
    protected static final long PARAMETRO_CODIGO_OPCION_ACTIVO_INACTIVO = 1154L;
    protected static final long PARAMETRO_CODIGO_OPCION_ENC_APA = 1155L;
    protected static final long PARAMETRO_CODIGO_OPCION_PRESENTE_AUSENTE = 1173L;
    protected static final long PARAMETRO_CODIGO_OPCION_POS_NEG = 1172L;
    protected static final long PARAMETRO_CODIGO_OPCION_VERDADERO_FALSO = 1175L;

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
        if (funcion == FUNCION_CONSULTAR_OPCION_BINARIA) {
            this.consultarOpcionBinaria(filtro);
            return;
        }
    }

    public void consultarOpcionBinaria() throws ExcepcionAplicacion {
        this.consultarOpcionBinaria(new FiltroBusqueda());
    }

    public void consultarOpcionBinaria(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarOpcionBinaria(new FiltroBusqueda());
        } else {
            this.consultarOpcionBinaria(new FiltroBusqueda(filtro));
        }
    }

    public void consultarOpcionBinaria(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_OPCION_BINARIA);
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
                comando += clausula + " numero_opcion_binaria ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearOpcionBinaria() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_OPCION_BINARIA);
    }

    public void modificarOpcionBinaria(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_OPCION_BINARIA);
    }

    public void modificarOpcionBinaria(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_OPCION_BINARIA);
    }

    public void eliminarOpcionBinaria(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_OPCION_BINARIA);
    }

    public void eliminarOpcionBinaria(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_OPCION_BINARIA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_OPCION_BINARIA) {
            this.posCrearOpcionBinaria(rowKey);
            return;
        }
    }

    protected void posCrearOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_OPCION_BINARIA) {
            es = this.esFilaModificableConModificarOpcionBinaria(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarOpcionBinaria(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_OPCION_BINARIA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_OPCION_BINARIA) {
            this.posModificarOpcionBinaria(rowKey);
            return;
        }
    }

    protected void posModificarOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_OPCION_BINARIA) {
            es = this.esFilaEliminableConEliminarOpcionBinaria(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarOpcionBinaria(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_OPCION_BINARIA) {
            this.preEliminarOpcionBinaria(rowKey);
            return;
        }
    }

    protected void preEliminarOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_OPCION_BINARIA) {
            this.posEliminarOpcionBinaria(rowKey);
            return;
        }
    }

    protected void posEliminarOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_OPCION_BINARIA) {
            es = this.esFilaValidaParaCrearOpcionBinaria(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_OPCION_BINARIA) {
            es = this.esFilaValidaParaModificarOpcionBinaria(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearOpcionBinaria(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarOpcionBinaria(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_OPCION_BINARIA) {
            this.preCommitCrearOpcionBinaria(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_OPCION_BINARIA) {
            this.preCommitModificarOpcionBinaria(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_OPCION_BINARIA) {
            this.preCommitEliminarOpcionBinaria(rowKey);
            return;
        }
    }

    protected void preCommitCrearOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_OPCION_BINARIA);
        rastro.addParametro(PARAMETRO_NUMERO_OPCION_BINARIA, this.getNumeroOpcionBinaria(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_SI_NO, this.getCodigoOpcionSiNo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_ACTIVO_INACTIVO, this.getCodigoOpcionActivoInactivo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_ENC_APA, this.getCodigoOpcionEncApa(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_PRESENTE_AUSENTE, this.getCodigoOpcionPresenteAusente(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_POS_NEG, this.getCodigoOpcionPosNeg(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_VERDADERO_FALSO, this.getCodigoOpcionVerdaderoFalso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_OPCION_BINARIA);
        rastro.addParametro(PARAMETRO_NUMERO_OPCION_BINARIA, this.getNumeroOpcionBinaria(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_SI_NO, this.getCodigoOpcionSiNo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_ACTIVO_INACTIVO, this.getCodigoOpcionActivoInactivo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_ENC_APA, this.getCodigoOpcionEncApa(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_PRESENTE_AUSENTE, this.getCodigoOpcionPresenteAusente(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_POS_NEG, this.getCodigoOpcionPosNeg(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_OPCION_VERDADERO_FALSO, this.getCodigoOpcionVerdaderoFalso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarOpcionBinaria(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_OPCION_BINARIA);
        rastro.addParametro(PARAMETRO_NUMERO_OPCION_BINARIA, this.getNumeroOpcionBinaria(rowKey));
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
    }
}
