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
import com.egt.data.general.xdp1.GrupoAplicacionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class GrupoAplicacionCachedRowSetDataProvider2 extends GrupoAplicacionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public GrupoAplicacionCachedRowSetDataProvider2() {
        super();
    }

    public GrupoAplicacionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104500101L;

    public static final long FUNCION_CONSULTAR_GRUPO_APLICACION = 104500101L;
    public static final long FUNCION_CREAR_GRUPO_APLICACION = 104500102L;
    public static final long FUNCION_MODIFICAR_GRUPO_APLICACION = 104500103L;
    public static final long FUNCION_ELIMINAR_GRUPO_APLICACION = 104500104L;

    protected static final long PARAMETRO_ID_GRUPO_APLICACION = 1332L;
    protected static final long PARAMETRO_VERSION_GRUPO_APLICACION = 1617L;
    protected static final long PARAMETRO_CODIGO_GRUPO_APLICACION = 1050L;
    protected static final long PARAMETRO_NOMBRE_GRUPO_APLICACION = 1423L;
    protected static final long PARAMETRO_DESCRIPCION_GRUPO_APLICACION = 1237L;

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
        if (funcion == FUNCION_CONSULTAR_GRUPO_APLICACION) {
            this.consultarGrupoAplicacion(filtro);
            return;
        }
    }

    public void consultarGrupoAplicacion() throws ExcepcionAplicacion {
        this.consultarGrupoAplicacion(new FiltroBusqueda());
    }

    public void consultarGrupoAplicacion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarGrupoAplicacion(new FiltroBusqueda());
        } else {
            this.consultarGrupoAplicacion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarGrupoAplicacion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_GRUPO_APLICACION);
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
                comando += clausula + " id_grupo_aplicacion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearGrupoAplicacion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_GRUPO_APLICACION);
    }

    public void modificarGrupoAplicacion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_GRUPO_APLICACION);
    }

    public void modificarGrupoAplicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_GRUPO_APLICACION);
    }

    public void eliminarGrupoAplicacion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_GRUPO_APLICACION);
    }

    public void eliminarGrupoAplicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_GRUPO_APLICACION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_GRUPO_APLICACION) {
            this.posCrearGrupoAplicacion(rowKey);
            return;
        }
    }

    protected void posCrearGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_GRUPO_APLICACION) {
            es = this.esFilaModificableConModificarGrupoAplicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarGrupoAplicacion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_GRUPO_APLICACION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_GRUPO_APLICACION) {
            this.posModificarGrupoAplicacion(rowKey);
            return;
        }
    }

    protected void posModificarGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_GRUPO_APLICACION) {
            es = this.esFilaEliminableConEliminarGrupoAplicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarGrupoAplicacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_GRUPO_APLICACION) {
            this.preEliminarGrupoAplicacion(rowKey);
            return;
        }
    }

    protected void preEliminarGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_GRUPO_APLICACION) {
            this.posEliminarGrupoAplicacion(rowKey);
            return;
        }
    }

    protected void posEliminarGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_GRUPO_APLICACION) {
            es = this.esFilaValidaParaCrearGrupoAplicacion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_GRUPO_APLICACION) {
            es = this.esFilaValidaParaModificarGrupoAplicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearGrupoAplicacion(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarGrupoAplicacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_GRUPO_APLICACION) {
            this.preCommitCrearGrupoAplicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_GRUPO_APLICACION) {
            this.preCommitModificarGrupoAplicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_GRUPO_APLICACION) {
            this.preCommitEliminarGrupoAplicacion(rowKey);
            return;
        }
    }

    protected void preCommitCrearGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_GRUPO_APLICACION);
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_GRUPO_APLICACION, this.getVersionGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_GRUPO_APLICACION, this.getCodigoGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_GRUPO_APLICACION, this.getNombreGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_GRUPO_APLICACION, this.getDescripcionGrupoAplicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_GRUPO_APLICACION);
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_GRUPO_APLICACION, this.getVersionGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_GRUPO_APLICACION, this.getCodigoGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_GRUPO_APLICACION, this.getNombreGrupoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_GRUPO_APLICACION, this.getDescripcionGrupoAplicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarGrupoAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_GRUPO_APLICACION);
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
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
        this.setVersionGrupoAplicacion(rowKey, 0L);
    }
}
