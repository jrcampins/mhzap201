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
import com.egt.data.general.xdp1.RolFuncionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RolFuncionCachedRowSetDataProvider2 extends RolFuncionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RolFuncionCachedRowSetDataProvider2() {
        super();
    }

    public RolFuncionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106600101L;

    public static final long FUNCION_CONSULTAR_ROL_FUNCION = 106600101L;
    public static final long FUNCION_CREAR_ROL_FUNCION = 106600102L;
    public static final long FUNCION_MODIFICAR_ROL_FUNCION = 106600103L;
    public static final long FUNCION_ELIMINAR_ROL_FUNCION = 106600104L;

    protected static final long PARAMETRO_ID_ROL_FUNCION = 1372L;
    protected static final long PARAMETRO_VERSION_ROL_FUNCION = 1590L;
    protected static final long PARAMETRO_ID_ROL = 1370L;
    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_ID_CONJUNTO_SEGMENTO = 1312L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_ROL = 106400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO = 106200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ROL = {"rol", "id_rol", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO = {"conjunto_segmento", "id_conjunto_segmento", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_ROL_FUNCION) {
            this.consultarRolFuncion(filtro);
            return;
        }
    }

    public void consultarRolFuncion() throws ExcepcionAplicacion {
        this.consultarRolFuncion(new FiltroBusqueda());
    }

    public void consultarRolFuncion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRolFuncion(new FiltroBusqueda());
        } else {
            this.consultarRolFuncion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRolFuncion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ROL_FUNCION);
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
                comando += clausula + " id_rol_funcion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearRolFuncion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ROL_FUNCION);
    }

    public void modificarRolFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ROL_FUNCION);
    }

    public void modificarRolFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ROL_FUNCION);
    }

    public void eliminarRolFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ROL_FUNCION);
    }

    public void eliminarRolFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ROL_FUNCION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ROL_FUNCION) {
            this.posCrearRolFuncion(rowKey);
            return;
        }
    }

    protected void posCrearRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ROL_FUNCION) {
            es = this.esFilaModificableConModificarRolFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarRolFuncion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ROL_FUNCION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ROL_FUNCION) {
            this.posModificarRolFuncion(rowKey);
            return;
        }
    }

    protected void posModificarRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ROL_FUNCION) {
            es = this.esFilaEliminableConEliminarRolFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarRolFuncion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_FUNCION) {
            this.preEliminarRolFuncion(rowKey);
            return;
        }
    }

    protected void preEliminarRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL_FUNCION) {
            this.posEliminarRolFuncion(rowKey);
            return;
        }
    }

    protected void posEliminarRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ROL_FUNCION) {
            es = this.esFilaValidaParaCrearRolFuncion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_FUNCION) {
            es = this.esFilaValidaParaModificarRolFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearRolFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_ROL)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdRol(rowKey), FUNCION_REFERENCIA_CONSULTAR_ROL, STRINGS_REFERENCIA_CONSULTAR_ROL);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_ROL + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CONJUNTO_SEGMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdConjuntoSegmento(rowKey), FUNCION_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO, STRINGS_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CONJUNTO_SEGMENTO + ">");
                    }
                }
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        } finally {
            return es;
        }
    }

    protected boolean esFilaValidaParaModificarRolFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_ROL)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdRol(rowKey), FUNCION_REFERENCIA_CONSULTAR_ROL, STRINGS_REFERENCIA_CONSULTAR_ROL);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_ROL + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CONJUNTO_SEGMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdConjuntoSegmento(rowKey), FUNCION_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO, STRINGS_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CONJUNTO_SEGMENTO + ">");
                    }
                }
            }
        } catch (SQLException ex) {
            TLC.getBitacora().fatal(ex);
            es = false;
        } finally {
            return es;
        }
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_ROL_FUNCION) {
            this.preCommitCrearRolFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ROL_FUNCION) {
            this.preCommitModificarRolFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ROL_FUNCION) {
            this.preCommitEliminarRolFuncion(rowKey);
            return;
        }
    }

    protected void preCommitCrearRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ROL_FUNCION);
        rastro.addParametro(PARAMETRO_ID_ROL_FUNCION, this.getIdRolFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_FUNCION, this.getVersionRolFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ROL_FUNCION);
        rastro.addParametro(PARAMETRO_ID_ROL_FUNCION, this.getIdRolFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL_FUNCION, this.getVersionRolFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarRolFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ROL_FUNCION);
        rastro.addParametro(PARAMETRO_ID_ROL_FUNCION, this.getIdRolFuncion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionRolFuncion(rowKey, 0L);
    }
}
