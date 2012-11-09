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
import com.egt.data.specific.xdp1.EtniaIndigenaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class EtniaIndigenaCachedRowSetDataProvider2 extends EtniaIndigenaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public EtniaIndigenaCachedRowSetDataProvider2() {
        super();
    }

    public EtniaIndigenaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 301100101L;

    public static final long FUNCION_CONSULTAR_ETNIA_INDIGENA = 301100101L;
    public static final long FUNCION_CREAR_ETNIA_INDIGENA = 301100102L;
    public static final long FUNCION_MODIFICAR_ETNIA_INDIGENA = 301100103L;
    public static final long FUNCION_ELIMINAR_ETNIA_INDIGENA = 301100104L;

    protected static final long PARAMETRO_ID_ETNIA_INDIGENA = 20159L;
    protected static final long PARAMETRO_VERSION_ETNIA_INDIGENA = 20176L;
    protected static final long PARAMETRO_CODIGO_ETNIA_INDIGENA = 20138L;
    protected static final long PARAMETRO_NOMBRE_ETNIA_INDIGENA = 20167L;
    protected static final long PARAMETRO_DESCRIPCION_ETNIA_INDIGENA = 20143L;

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
        if (funcion == FUNCION_CONSULTAR_ETNIA_INDIGENA) {
            this.consultarEtniaIndigena(filtro);
            return;
        }
    }

    public void consultarEtniaIndigena() throws ExcepcionAplicacion {
        this.consultarEtniaIndigena(new FiltroBusqueda());
    }

    public void consultarEtniaIndigena(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarEtniaIndigena(new FiltroBusqueda());
        } else {
            this.consultarEtniaIndigena(new FiltroBusqueda(filtro));
        }
    }

    public void consultarEtniaIndigena(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ETNIA_INDIGENA);
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
                comando += clausula + " id_etnia_indigena ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearEtniaIndigena() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ETNIA_INDIGENA);
    }

    public void modificarEtniaIndigena(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ETNIA_INDIGENA);
    }

    public void modificarEtniaIndigena(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ETNIA_INDIGENA);
    }

    public void eliminarEtniaIndigena(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ETNIA_INDIGENA);
    }

    public void eliminarEtniaIndigena(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ETNIA_INDIGENA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ETNIA_INDIGENA) {
            this.posCrearEtniaIndigena(rowKey);
            return;
        }
    }

    protected void posCrearEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ETNIA_INDIGENA) {
            es = this.esFilaModificableConModificarEtniaIndigena(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarEtniaIndigena(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ETNIA_INDIGENA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ETNIA_INDIGENA) {
            this.posModificarEtniaIndigena(rowKey);
            return;
        }
    }

    protected void posModificarEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ETNIA_INDIGENA) {
            es = this.esFilaEliminableConEliminarEtniaIndigena(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarEtniaIndigena(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ETNIA_INDIGENA) {
            this.preEliminarEtniaIndigena(rowKey);
            return;
        }
    }

    protected void preEliminarEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ETNIA_INDIGENA) {
            this.posEliminarEtniaIndigena(rowKey);
            return;
        }
    }

    protected void posEliminarEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ETNIA_INDIGENA) {
            es = this.esFilaValidaParaCrearEtniaIndigena(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ETNIA_INDIGENA) {
            es = this.esFilaValidaParaModificarEtniaIndigena(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearEtniaIndigena(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarEtniaIndigena(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_ETNIA_INDIGENA) {
            this.preCommitCrearEtniaIndigena(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ETNIA_INDIGENA) {
            this.preCommitModificarEtniaIndigena(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ETNIA_INDIGENA) {
            this.preCommitEliminarEtniaIndigena(rowKey);
            return;
        }
    }

    protected void preCommitCrearEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ETNIA_INDIGENA);
        rastro.addParametro(PARAMETRO_ID_ETNIA_INDIGENA, this.getIdEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ETNIA_INDIGENA, this.getVersionEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ETNIA_INDIGENA, this.getCodigoEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_ETNIA_INDIGENA, this.getNombreEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_ETNIA_INDIGENA, this.getDescripcionEtniaIndigena(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ETNIA_INDIGENA);
        rastro.addParametro(PARAMETRO_ID_ETNIA_INDIGENA, this.getIdEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ETNIA_INDIGENA, this.getVersionEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ETNIA_INDIGENA, this.getCodigoEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_ETNIA_INDIGENA, this.getNombreEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_ETNIA_INDIGENA, this.getDescripcionEtniaIndigena(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarEtniaIndigena(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ETNIA_INDIGENA);
        rastro.addParametro(PARAMETRO_ID_ETNIA_INDIGENA, this.getIdEtniaIndigena(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        rastro.setNombreRecurso(this.getNombreRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionEtniaIndigena(rowKey, 0L);
    }
}
