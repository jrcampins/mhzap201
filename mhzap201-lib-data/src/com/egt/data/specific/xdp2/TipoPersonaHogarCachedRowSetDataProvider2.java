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
import com.egt.data.specific.xdp1.TipoPersonaHogarCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoPersonaHogarCachedRowSetDataProvider2 extends TipoPersonaHogarCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoPersonaHogarCachedRowSetDataProvider2() {
        super();
    }

    public TipoPersonaHogarCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 323300101L;

    public static final long FUNCION_CONSULTAR_TIPO_PERSONA_HOGAR = 323300101L;
    public static final long FUNCION_CREAR_TIPO_PERSONA_HOGAR = 323300102L;
    public static final long FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR = 323300103L;
    public static final long FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR = 323300104L;

    protected static final long PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR = 20424L;
    protected static final long PARAMETRO_CODIGO_TIPO_PERSONA_HOGAR = 20319L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_PERSONA_HOGAR) {
            this.consultarTipoPersonaHogar(filtro);
            return;
        }
    }

    public void consultarTipoPersonaHogar() throws ExcepcionAplicacion {
        this.consultarTipoPersonaHogar(new FiltroBusqueda());
    }

    public void consultarTipoPersonaHogar(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoPersonaHogar(new FiltroBusqueda());
        } else {
            this.consultarTipoPersonaHogar(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoPersonaHogar(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_PERSONA_HOGAR);
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
                comando += clausula + " numero_tipo_persona_hogar ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoPersonaHogar() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_PERSONA_HOGAR);
    }

    public void modificarTipoPersonaHogar(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR);
    }

    public void modificarTipoPersonaHogar(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR);
    }

    public void eliminarTipoPersonaHogar(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR);
    }

    public void eliminarTipoPersonaHogar(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_PERSONA_HOGAR) {
            this.posCrearTipoPersonaHogar(rowKey);
            return;
        }
    }

    protected void posCrearTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR) {
            es = this.esFilaModificableConModificarTipoPersonaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoPersonaHogar(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR) {
            this.posModificarTipoPersonaHogar(rowKey);
            return;
        }
    }

    protected void posModificarTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR) {
            es = this.esFilaEliminableConEliminarTipoPersonaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoPersonaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR) {
            this.preEliminarTipoPersonaHogar(rowKey);
            return;
        }
    }

    protected void preEliminarTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR) {
            this.posEliminarTipoPersonaHogar(rowKey);
            return;
        }
    }

    protected void posEliminarTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_PERSONA_HOGAR) {
            es = this.esFilaValidaParaCrearTipoPersonaHogar(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR) {
            es = this.esFilaValidaParaModificarTipoPersonaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoPersonaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoPersonaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_PERSONA_HOGAR) {
            this.preCommitCrearTipoPersonaHogar(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR) {
            this.preCommitModificarTipoPersonaHogar(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR) {
            this.preCommitEliminarTipoPersonaHogar(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_PERSONA_HOGAR);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR, this.getNumeroTipoPersonaHogar(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PERSONA_HOGAR, this.getCodigoTipoPersonaHogar(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_PERSONA_HOGAR);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR, this.getNumeroTipoPersonaHogar(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_PERSONA_HOGAR, this.getCodigoTipoPersonaHogar(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoPersonaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_PERSONA_HOGAR);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR, this.getNumeroTipoPersonaHogar(rowKey));
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
