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
import com.egt.data.general.xdp1.TipoParametroDomCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoParametroDomCachedRowSetDataProvider2 extends TipoParametroDomCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoParametroDomCachedRowSetDataProvider2() {
        super();
    }

    public TipoParametroDomCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102600101L;

    public static final long FUNCION_CONSULTAR_TIPO_PARAMETRO_DOM = 102600101L;
    public static final long FUNCION_CREAR_TIPO_PARAMETRO_DOM = 102600102L;
    public static final long FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM = 102600103L;
    public static final long FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM = 102600104L;

    protected static final long PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM = 1497L;
    protected static final long PARAMETRO_CODIGO_TIPO_PARAMETRO_DOM = 1200L;
    protected static final long PARAMETRO_CODIGO_PROPIEDAD_INTERFAZ = 1182L;
    protected static final long PARAMETRO_NOMBRE_INTERFAZ = 1430L;
    protected static final long PARAMETRO_ETIQUETA_PARAMETRO = 1286L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_PARAMETRO_DOM) {
            this.consultarTipoParametroDom(filtro);
            return;
        }
    }

    public void consultarTipoParametroDom() throws ExcepcionAplicacion {
        this.consultarTipoParametroDom(new FiltroBusqueda());
    }

    public void consultarTipoParametroDom(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoParametroDom(new FiltroBusqueda());
        } else {
            this.consultarTipoParametroDom(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoParametroDom(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_PARAMETRO_DOM);
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
                comando += clausula + " numero_tipo_parametro_dom ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoParametroDom() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_PARAMETRO_DOM);
    }

    public void modificarTipoParametroDom(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM);
    }

    public void modificarTipoParametroDom(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM);
    }

    public void eliminarTipoParametroDom(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM);
    }

    public void eliminarTipoParametroDom(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_PARAMETRO_DOM) {
            this.posCrearTipoParametroDom(rowKey);
            return;
        }
    }

    protected void posCrearTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM) {
            es = this.esFilaModificableConModificarTipoParametroDom(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoParametroDom(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM) {
            this.posModificarTipoParametroDom(rowKey);
            return;
        }
    }

    protected void posModificarTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM) {
            es = this.esFilaEliminableConEliminarTipoParametroDom(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoParametroDom(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM) {
            this.preEliminarTipoParametroDom(rowKey);
            return;
        }
    }

    protected void preEliminarTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM) {
            this.posEliminarTipoParametroDom(rowKey);
            return;
        }
    }

    protected void posEliminarTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_PARAMETRO_DOM) {
            es = this.esFilaValidaParaCrearTipoParametroDom(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM) {
            es = this.esFilaValidaParaModificarTipoParametroDom(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoParametroDom(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoParametroDom(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_PARAMETRO_DOM) {
            this.preCommitCrearTipoParametroDom(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM) {
            this.preCommitModificarTipoParametroDom(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM) {
            this.preCommitEliminarTipoParametroDom(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_PARAMETRO_DOM);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM, this.getNumeroTipoParametroDom(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PARAMETRO_DOM, this.getCodigoTipoParametroDom(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PROPIEDAD_INTERFAZ, this.getCodigoPropiedadInterfaz(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_INTERFAZ, this.getNombreInterfaz(rowKey));
        rastro.addParametro(PARAMETRO_ETIQUETA_PARAMETRO, this.getEtiquetaParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_PARAMETRO_DOM);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM, this.getNumeroTipoParametroDom(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PARAMETRO_DOM, this.getCodigoTipoParametroDom(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PROPIEDAD_INTERFAZ, this.getCodigoPropiedadInterfaz(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_INTERFAZ, this.getNombreInterfaz(rowKey));
        rastro.addParametro(PARAMETRO_ETIQUETA_PARAMETRO, this.getEtiquetaParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoParametroDom(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_PARAMETRO_DOM);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM, this.getNumeroTipoParametroDom(rowKey));
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
