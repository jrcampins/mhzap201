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
import com.egt.data.specific.xdp1.NivelEducativoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class NivelEducativoCachedRowSetDataProvider2 extends NivelEducativoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public NivelEducativoCachedRowSetDataProvider2() {
        super();
    }

    public NivelEducativoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 321100101L;

    public static final long FUNCION_CONSULTAR_NIVEL_EDUCATIVO = 321100101L;
    public static final long FUNCION_CREAR_NIVEL_EDUCATIVO = 321100102L;
    public static final long FUNCION_MODIFICAR_NIVEL_EDUCATIVO = 321100103L;
    public static final long FUNCION_ELIMINAR_NIVEL_EDUCATIVO = 321100104L;

    protected static final long PARAMETRO_NUMERO_NIVEL_EDUCATIVO = 20609L;
    protected static final long PARAMETRO_CODIGO_NIVEL_EDUCATIVO = 20305L;
    protected static final long PARAMETRO_PRIMER_CURSO = 20594L;
    protected static final long PARAMETRO_ULTIMO_CURSO = 20595L;

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
        if (funcion == FUNCION_CONSULTAR_NIVEL_EDUCATIVO) {
            this.consultarNivelEducativo(filtro);
            return;
        }
    }

    public void consultarNivelEducativo() throws ExcepcionAplicacion {
        this.consultarNivelEducativo(new FiltroBusqueda());
    }

    public void consultarNivelEducativo(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarNivelEducativo(new FiltroBusqueda());
        } else {
            this.consultarNivelEducativo(new FiltroBusqueda(filtro));
        }
    }

    public void consultarNivelEducativo(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_NIVEL_EDUCATIVO);
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
                comando += clausula + " numero_nivel_educativo ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearNivelEducativo() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_NIVEL_EDUCATIVO);
    }

    public void modificarNivelEducativo(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_NIVEL_EDUCATIVO);
    }

    public void modificarNivelEducativo(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_NIVEL_EDUCATIVO);
    }

    public void eliminarNivelEducativo(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_NIVEL_EDUCATIVO);
    }

    public void eliminarNivelEducativo(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_NIVEL_EDUCATIVO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_NIVEL_EDUCATIVO) {
            this.posCrearNivelEducativo(rowKey);
            return;
        }
    }

    protected void posCrearNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_NIVEL_EDUCATIVO) {
            es = this.esFilaModificableConModificarNivelEducativo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarNivelEducativo(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_NIVEL_EDUCATIVO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_NIVEL_EDUCATIVO) {
            this.posModificarNivelEducativo(rowKey);
            return;
        }
    }

    protected void posModificarNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_NIVEL_EDUCATIVO) {
            es = this.esFilaEliminableConEliminarNivelEducativo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarNivelEducativo(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_NIVEL_EDUCATIVO) {
            this.preEliminarNivelEducativo(rowKey);
            return;
        }
    }

    protected void preEliminarNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_NIVEL_EDUCATIVO) {
            this.posEliminarNivelEducativo(rowKey);
            return;
        }
    }

    protected void posEliminarNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_NIVEL_EDUCATIVO) {
            es = this.esFilaValidaParaCrearNivelEducativo(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_NIVEL_EDUCATIVO) {
            es = this.esFilaValidaParaModificarNivelEducativo(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearNivelEducativo(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarNivelEducativo(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_NIVEL_EDUCATIVO) {
            this.preCommitCrearNivelEducativo(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_NIVEL_EDUCATIVO) {
            this.preCommitModificarNivelEducativo(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_NIVEL_EDUCATIVO) {
            this.preCommitEliminarNivelEducativo(rowKey);
            return;
        }
    }

    protected void preCommitCrearNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_NIVEL_EDUCATIVO);
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_EDUCATIVO, this.getNumeroNivelEducativo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_NIVEL_EDUCATIVO, this.getCodigoNivelEducativo(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_CURSO, this.getPrimerCurso(rowKey));
        rastro.addParametro(PARAMETRO_ULTIMO_CURSO, this.getUltimoCurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_NIVEL_EDUCATIVO);
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_EDUCATIVO, this.getNumeroNivelEducativo(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_NIVEL_EDUCATIVO, this.getCodigoNivelEducativo(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_CURSO, this.getPrimerCurso(rowKey));
        rastro.addParametro(PARAMETRO_ULTIMO_CURSO, this.getUltimoCurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarNivelEducativo(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_NIVEL_EDUCATIVO);
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_EDUCATIVO, this.getNumeroNivelEducativo(rowKey));
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
