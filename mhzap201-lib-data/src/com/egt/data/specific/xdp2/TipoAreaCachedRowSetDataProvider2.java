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
import com.egt.data.specific.xdp1.TipoAreaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoAreaCachedRowSetDataProvider2 extends TipoAreaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoAreaCachedRowSetDataProvider2() {
        super();
    }

    public TipoAreaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 322200101L;

    public static final long FUNCION_CONSULTAR_TIPO_AREA = 322200101L;
    public static final long FUNCION_CREAR_TIPO_AREA = 322200102L;
    public static final long FUNCION_MODIFICAR_TIPO_AREA = 322200103L;
    public static final long FUNCION_ELIMINAR_TIPO_AREA = 322200104L;

    protected static final long PARAMETRO_NUMERO_TIPO_AREA = 20412L;
    protected static final long PARAMETRO_CODIGO_TIPO_AREA = 20308L;
    protected static final long PARAMETRO_LIMITE_INDICE_CALIDAD_VIDA = 20658L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_AREA) {
            this.consultarTipoArea(filtro);
            return;
        }
    }

    public void consultarTipoArea() throws ExcepcionAplicacion {
        this.consultarTipoArea(new FiltroBusqueda());
    }

    public void consultarTipoArea(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoArea(new FiltroBusqueda());
        } else {
            this.consultarTipoArea(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoArea(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_AREA);
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
                comando += clausula + " numero_tipo_area ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoArea() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_AREA);
    }

    public void modificarTipoArea(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_AREA);
    }

    public void modificarTipoArea(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_AREA);
    }

    public void eliminarTipoArea(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_AREA);
    }

    public void eliminarTipoArea(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_AREA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_AREA) {
            this.posCrearTipoArea(rowKey);
            return;
        }
    }

    protected void posCrearTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_AREA) {
            es = this.esFilaModificableConModificarTipoArea(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoArea(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_AREA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_AREA) {
            this.posModificarTipoArea(rowKey);
            return;
        }
    }

    protected void posModificarTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_AREA) {
            es = this.esFilaEliminableConEliminarTipoArea(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoArea(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_AREA) {
            this.preEliminarTipoArea(rowKey);
            return;
        }
    }

    protected void preEliminarTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_AREA) {
            this.posEliminarTipoArea(rowKey);
            return;
        }
    }

    protected void posEliminarTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_AREA) {
            es = this.esFilaValidaParaCrearTipoArea(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_AREA) {
            es = this.esFilaValidaParaModificarTipoArea(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoArea(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoArea(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_AREA) {
            this.preCommitCrearTipoArea(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_AREA) {
            this.preCommitModificarTipoArea(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_AREA) {
            this.preCommitEliminarTipoArea(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_AREA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_AREA, this.getCodigoTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_INDICE_CALIDAD_VIDA, this.getLimiteIndiceCalidadVida(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_AREA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_AREA, this.getCodigoTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_LIMITE_INDICE_CALIDAD_VIDA, this.getLimiteIndiceCalidadVida(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoArea(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_AREA);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
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
