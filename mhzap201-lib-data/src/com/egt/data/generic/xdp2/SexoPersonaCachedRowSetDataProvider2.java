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
import com.egt.data.generic.xdp1.SexoPersonaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class SexoPersonaCachedRowSetDataProvider2 extends SexoPersonaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public SexoPersonaCachedRowSetDataProvider2() {
        super();
    }

    public SexoPersonaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 201200101L;

    public static final long FUNCION_CONSULTAR_SEXO_PERSONA = 201200101L;
    public static final long FUNCION_CREAR_SEXO_PERSONA = 201200102L;
    public static final long FUNCION_MODIFICAR_SEXO_PERSONA = 201200103L;
    public static final long FUNCION_ELIMINAR_SEXO_PERSONA = 201200104L;

    protected static final long PARAMETRO_NUMERO_SEXO_PERSONA = 20099L;
    protected static final long PARAMETRO_CODIGO_SEXO_PERSONA = 20058L;

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
        if (funcion == FUNCION_CONSULTAR_SEXO_PERSONA) {
            this.consultarSexoPersona(filtro);
            return;
        }
    }

    public void consultarSexoPersona() throws ExcepcionAplicacion {
        this.consultarSexoPersona(new FiltroBusqueda());
    }

    public void consultarSexoPersona(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarSexoPersona(new FiltroBusqueda());
        } else {
            this.consultarSexoPersona(new FiltroBusqueda(filtro));
        }
    }

    public void consultarSexoPersona(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_SEXO_PERSONA);
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
                comando += clausula + " numero_sexo_persona ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearSexoPersona() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_SEXO_PERSONA);
    }

    public void modificarSexoPersona(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_SEXO_PERSONA);
    }

    public void modificarSexoPersona(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_SEXO_PERSONA);
    }

    public void eliminarSexoPersona(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_SEXO_PERSONA);
    }

    public void eliminarSexoPersona(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_SEXO_PERSONA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_SEXO_PERSONA) {
            this.posCrearSexoPersona(rowKey);
            return;
        }
    }

    protected void posCrearSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_SEXO_PERSONA) {
            es = this.esFilaModificableConModificarSexoPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarSexoPersona(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_SEXO_PERSONA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_SEXO_PERSONA) {
            this.posModificarSexoPersona(rowKey);
            return;
        }
    }

    protected void posModificarSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_SEXO_PERSONA) {
            es = this.esFilaEliminableConEliminarSexoPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarSexoPersona(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_SEXO_PERSONA) {
            this.preEliminarSexoPersona(rowKey);
            return;
        }
    }

    protected void preEliminarSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_SEXO_PERSONA) {
            this.posEliminarSexoPersona(rowKey);
            return;
        }
    }

    protected void posEliminarSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_SEXO_PERSONA) {
            es = this.esFilaValidaParaCrearSexoPersona(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_SEXO_PERSONA) {
            es = this.esFilaValidaParaModificarSexoPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearSexoPersona(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarSexoPersona(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_SEXO_PERSONA) {
            this.preCommitCrearSexoPersona(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_SEXO_PERSONA) {
            this.preCommitModificarSexoPersona(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_SEXO_PERSONA) {
            this.preCommitEliminarSexoPersona(rowKey);
            return;
        }
    }

    protected void preCommitCrearSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_SEXO_PERSONA);
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_SEXO_PERSONA, this.getCodigoSexoPersona(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_SEXO_PERSONA);
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_SEXO_PERSONA, this.getCodigoSexoPersona(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarSexoPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_SEXO_PERSONA);
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
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
