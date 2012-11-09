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
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.generic.xdp1.NivelUbicacionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class NivelUbicacionCachedRowSetDataProvider2 extends NivelUbicacionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public NivelUbicacionCachedRowSetDataProvider2() {
        super();
    }

    public NivelUbicacionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 202200101L;

    public static final long FUNCION_CONSULTAR_NIVEL_UBICACION = 202200101L;
    public static final long FUNCION_CREAR_NIVEL_UBICACION = 202200102L;
    public static final long FUNCION_MODIFICAR_NIVEL_UBICACION = 202200103L;
    public static final long FUNCION_ELIMINAR_NIVEL_UBICACION = 202200104L;

    protected static final long PARAMETRO_NUMERO_NIVEL_UBICACION = 20531L;
    protected static final long PARAMETRO_CODIGO_NIVEL_UBICACION = 20480L;
    protected static final long PARAMETRO_DIGITOS_NIVEL_UBICACION = 20512L;

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
        if (funcion == FUNCION_CONSULTAR_NIVEL_UBICACION) {
            this.consultarNivelUbicacion(filtro);
            return;
        }
    }

    public void consultarNivelUbicacion() throws ExcepcionAplicacion {
        this.consultarNivelUbicacion(new FiltroBusqueda());
    }

    public void consultarNivelUbicacion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarNivelUbicacion(new FiltroBusqueda());
        } else {
            this.consultarNivelUbicacion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarNivelUbicacion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_NIVEL_UBICACION);
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
                comando += clausula + " numero_nivel_ubicacion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearNivelUbicacion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_NIVEL_UBICACION);
    }

    public void modificarNivelUbicacion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_NIVEL_UBICACION);
    }

    public void modificarNivelUbicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_NIVEL_UBICACION);
    }

    public void eliminarNivelUbicacion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_NIVEL_UBICACION);
    }

    public void eliminarNivelUbicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_NIVEL_UBICACION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_NIVEL_UBICACION) {
            this.posCrearNivelUbicacion(rowKey);
            return;
        }
    }

    protected void posCrearNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_NIVEL_UBICACION) {
            es = this.esFilaModificableConModificarNivelUbicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarNivelUbicacion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_NIVEL_UBICACION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_NIVEL_UBICACION) {
            this.posModificarNivelUbicacion(rowKey);
            return;
        }
    }

    protected void posModificarNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_NIVEL_UBICACION) {
            es = this.esFilaEliminableConEliminarNivelUbicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarNivelUbicacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_NIVEL_UBICACION) {
            this.preEliminarNivelUbicacion(rowKey);
            return;
        }
    }

    protected void preEliminarNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_NIVEL_UBICACION) {
            this.posEliminarNivelUbicacion(rowKey);
            return;
        }
    }

    protected void posEliminarNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_NIVEL_UBICACION) {
            es = this.esFilaValidaParaCrearNivelUbicacion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_NIVEL_UBICACION) {
            es = this.esFilaValidaParaModificarNivelUbicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearNivelUbicacion(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarNivelUbicacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_NIVEL_UBICACION) {
            this.preCommitCrearNivelUbicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_NIVEL_UBICACION) {
            this.preCommitModificarNivelUbicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_NIVEL_UBICACION) {
            this.preCommitEliminarNivelUbicacion(rowKey);
            return;
        }
    }

    protected void preCommitCrearNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_NIVEL_UBICACION);
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_UBICACION, this.getNumeroNivelUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_NIVEL_UBICACION, this.getCodigoNivelUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_DIGITOS_NIVEL_UBICACION, this.getDigitosNivelUbicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_NIVEL_UBICACION);
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_UBICACION, this.getNumeroNivelUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_NIVEL_UBICACION, this.getCodigoNivelUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_DIGITOS_NIVEL_UBICACION, this.getDigitosNivelUbicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarNivelUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_NIVEL_UBICACION);
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_UBICACION, this.getNumeroNivelUbicacion(rowKey));
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
        this.setDigitosNivelUbicacion(rowKey, 2);
    }
}
