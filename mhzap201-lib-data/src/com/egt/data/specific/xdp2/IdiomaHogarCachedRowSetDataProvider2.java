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
import com.egt.data.specific.xdp1.IdiomaHogarCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class IdiomaHogarCachedRowSetDataProvider2 extends IdiomaHogarCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public IdiomaHogarCachedRowSetDataProvider2() {
        super();
    }

    public IdiomaHogarCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 321600101L;

    public static final long FUNCION_CONSULTAR_IDIOMA_HOGAR = 321600101L;
    public static final long FUNCION_CREAR_IDIOMA_HOGAR = 321600102L;
    public static final long FUNCION_MODIFICAR_IDIOMA_HOGAR = 321600103L;
    public static final long FUNCION_ELIMINAR_IDIOMA_HOGAR = 321600104L;

    protected static final long PARAMETRO_NUMERO_IDIOMA_HOGAR = 20371L;
    protected static final long PARAMETRO_CODIGO_IDIOMA_HOGAR = 20301L;

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
        if (funcion == FUNCION_CONSULTAR_IDIOMA_HOGAR) {
            this.consultarIdiomaHogar(filtro);
            return;
        }
    }

    public void consultarIdiomaHogar() throws ExcepcionAplicacion {
        this.consultarIdiomaHogar(new FiltroBusqueda());
    }

    public void consultarIdiomaHogar(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarIdiomaHogar(new FiltroBusqueda());
        } else {
            this.consultarIdiomaHogar(new FiltroBusqueda(filtro));
        }
    }

    public void consultarIdiomaHogar(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_IDIOMA_HOGAR);
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
                comando += clausula + " numero_idioma_hogar ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearIdiomaHogar() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_IDIOMA_HOGAR);
    }

    public void modificarIdiomaHogar(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_IDIOMA_HOGAR);
    }

    public void modificarIdiomaHogar(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_IDIOMA_HOGAR);
    }

    public void eliminarIdiomaHogar(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_IDIOMA_HOGAR);
    }

    public void eliminarIdiomaHogar(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_IDIOMA_HOGAR);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_IDIOMA_HOGAR) {
            this.posCrearIdiomaHogar(rowKey);
            return;
        }
    }

    protected void posCrearIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_IDIOMA_HOGAR) {
            es = this.esFilaModificableConModificarIdiomaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarIdiomaHogar(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_IDIOMA_HOGAR);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_IDIOMA_HOGAR) {
            this.posModificarIdiomaHogar(rowKey);
            return;
        }
    }

    protected void posModificarIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_IDIOMA_HOGAR) {
            es = this.esFilaEliminableConEliminarIdiomaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarIdiomaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_IDIOMA_HOGAR) {
            this.preEliminarIdiomaHogar(rowKey);
            return;
        }
    }

    protected void preEliminarIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_IDIOMA_HOGAR) {
            this.posEliminarIdiomaHogar(rowKey);
            return;
        }
    }

    protected void posEliminarIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_IDIOMA_HOGAR) {
            es = this.esFilaValidaParaCrearIdiomaHogar(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_IDIOMA_HOGAR) {
            es = this.esFilaValidaParaModificarIdiomaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearIdiomaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarIdiomaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_IDIOMA_HOGAR) {
            this.preCommitCrearIdiomaHogar(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_IDIOMA_HOGAR) {
            this.preCommitModificarIdiomaHogar(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_IDIOMA_HOGAR) {
            this.preCommitEliminarIdiomaHogar(rowKey);
            return;
        }
    }

    protected void preCommitCrearIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_IDIOMA_HOGAR);
        rastro.addParametro(PARAMETRO_NUMERO_IDIOMA_HOGAR, this.getNumeroIdiomaHogar(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_IDIOMA_HOGAR, this.getCodigoIdiomaHogar(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_IDIOMA_HOGAR);
        rastro.addParametro(PARAMETRO_NUMERO_IDIOMA_HOGAR, this.getNumeroIdiomaHogar(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_IDIOMA_HOGAR, this.getCodigoIdiomaHogar(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarIdiomaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_IDIOMA_HOGAR);
        rastro.addParametro(PARAMETRO_NUMERO_IDIOMA_HOGAR, this.getNumeroIdiomaHogar(rowKey));
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
