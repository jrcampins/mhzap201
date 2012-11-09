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
import com.egt.commons.util.TimeUtils;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.specific.xdp1.VisitaCensoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class VisitaCensoCachedRowSetDataProvider2 extends VisitaCensoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public VisitaCensoCachedRowSetDataProvider2() {
        super();
    }

    public VisitaCensoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 324000101L;

    public static final long FUNCION_CONSULTAR_VISITA_CENSO = 324000101L;
    public static final long FUNCION_CREAR_VISITA_CENSO = 324000102L;
    public static final long FUNCION_MODIFICAR_VISITA_CENSO = 324000103L;
    public static final long FUNCION_ELIMINAR_VISITA_CENSO = 324000104L;

    protected static final long PARAMETRO_ID_VISITA_CENSO = 20641L;
    protected static final long PARAMETRO_VERSION_VISITA_CENSO = 20647L;
    protected static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_CENSISTA = 20589L;
    protected static final long PARAMETRO_FECHA_VISITA = 20639L;
    protected static final long PARAMETRO_OBSERVACIONES = 20433L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN = 320400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO = 320300101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN = {"potencial_ben", "id_potencial_ben", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO = {"funcionario", "id_funcionario", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_VISITA_CENSO) {
            this.consultarVisitaCenso(filtro);
            return;
        }
    }

    public void consultarVisitaCenso() throws ExcepcionAplicacion {
        this.consultarVisitaCenso(new FiltroBusqueda());
    }

    public void consultarVisitaCenso(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarVisitaCenso(new FiltroBusqueda());
        } else {
            this.consultarVisitaCenso(new FiltroBusqueda(filtro));
        }
    }

    public void consultarVisitaCenso(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_VISITA_CENSO);
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
                comando += clausula + " id_visita_censo ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearVisitaCenso() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_VISITA_CENSO);
    }

    public void modificarVisitaCenso(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_VISITA_CENSO);
    }

    public void modificarVisitaCenso(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_VISITA_CENSO);
    }

    public void eliminarVisitaCenso(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_VISITA_CENSO);
    }

    public void eliminarVisitaCenso(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_VISITA_CENSO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_VISITA_CENSO) {
            this.posCrearVisitaCenso(rowKey);
            return;
        }
    }

    protected void posCrearVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_VISITA_CENSO) {
            es = this.esFilaModificableConModificarVisitaCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarVisitaCenso(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_VISITA_CENSO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_VISITA_CENSO) {
            this.posModificarVisitaCenso(rowKey);
            return;
        }
    }

    protected void posModificarVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_VISITA_CENSO) {
            es = this.esFilaEliminableConEliminarVisitaCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarVisitaCenso(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_VISITA_CENSO) {
            this.preEliminarVisitaCenso(rowKey);
            return;
        }
    }

    protected void preEliminarVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_VISITA_CENSO) {
            this.posEliminarVisitaCenso(rowKey);
            return;
        }
    }

    protected void posEliminarVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_VISITA_CENSO) {
            es = this.esFilaValidaParaCrearVisitaCenso(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_VISITA_CENSO) {
            es = this.esFilaValidaParaModificarVisitaCenso(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearVisitaCenso(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_POTENCIAL_BEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPotencialBen(rowKey), FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN, STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_POTENCIAL_BEN + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_CENSISTA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioCensista(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_CENSISTA + ">");
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

    protected boolean esFilaValidaParaModificarVisitaCenso(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_POTENCIAL_BEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPotencialBen(rowKey), FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN, STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_POTENCIAL_BEN + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_CENSISTA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioCensista(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_CENSISTA + ">");
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
        if (funcion == FUNCION_CREAR_VISITA_CENSO) {
            this.preCommitCrearVisitaCenso(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_VISITA_CENSO) {
            this.preCommitModificarVisitaCenso(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_VISITA_CENSO) {
            this.preCommitEliminarVisitaCenso(rowKey);
            return;
        }
    }

    protected void preCommitCrearVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_VISITA_CENSO);
        rastro.addParametro(PARAMETRO_ID_VISITA_CENSO, this.getIdVisitaCenso(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_VISITA_CENSO, this.getVersionVisitaCenso(rowKey));
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_CENSISTA, this.getIdFuncionarioCensista(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_VISITA, this.getFechaVisita(rowKey));
        rastro.addParametro(PARAMETRO_OBSERVACIONES, this.getObservaciones(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_VISITA_CENSO);
        rastro.addParametro(PARAMETRO_ID_VISITA_CENSO, this.getIdVisitaCenso(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_VISITA_CENSO, this.getVersionVisitaCenso(rowKey));
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_CENSISTA, this.getIdFuncionarioCensista(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_VISITA, this.getFechaVisita(rowKey));
        rastro.addParametro(PARAMETRO_OBSERVACIONES, this.getObservaciones(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarVisitaCenso(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_VISITA_CENSO);
        rastro.addParametro(PARAMETRO_ID_VISITA_CENSO, this.getIdVisitaCenso(rowKey));
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
        Timestamp currentDate = TimeUtils.currentDate();
        this.setVersionVisitaCenso(rowKey, 0L);
    }
}
