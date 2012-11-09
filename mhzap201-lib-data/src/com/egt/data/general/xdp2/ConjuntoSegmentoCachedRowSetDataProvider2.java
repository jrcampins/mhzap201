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
import com.egt.data.general.xdp1.ConjuntoSegmentoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ConjuntoSegmentoCachedRowSetDataProvider2 extends ConjuntoSegmentoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ConjuntoSegmentoCachedRowSetDataProvider2() {
        super();
    }

    public ConjuntoSegmentoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106200101L;

    public static final long FUNCION_CONSULTAR_CONJUNTO_SEGMENTO = 106200101L;
    public static final long FUNCION_CREAR_CONJUNTO_SEGMENTO = 106200102L;
    public static final long FUNCION_MODIFICAR_CONJUNTO_SEGMENTO = 106200103L;
    public static final long FUNCION_ELIMINAR_CONJUNTO_SEGMENTO = 106200104L;

    protected static final long PARAMETRO_ID_CONJUNTO_SEGMENTO = 1312L;
    protected static final long PARAMETRO_VERSION_CONJUNTO_SEGMENTO = 1549L;
    protected static final long PARAMETRO_CODIGO_CONJUNTO_SEGMENTO = 1063L;
    protected static final long PARAMETRO_NOMBRE_CONJUNTO_SEGMENTO = 1400L;
    protected static final long PARAMETRO_DESCRIPCION_CONJUNTO_SEGMENTO = 1219L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO = 1303L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO = 102100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO = {"clase_recurso", "id_clase_recurso", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_CONJUNTO_SEGMENTO) {
            this.consultarConjuntoSegmento(filtro);
            return;
        }
    }

    public void consultarConjuntoSegmento() throws ExcepcionAplicacion {
        this.consultarConjuntoSegmento(new FiltroBusqueda());
    }

    public void consultarConjuntoSegmento(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarConjuntoSegmento(new FiltroBusqueda());
        } else {
            this.consultarConjuntoSegmento(new FiltroBusqueda(filtro));
        }
    }

    public void consultarConjuntoSegmento(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_CONJUNTO_SEGMENTO);
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
                comando += clausula + " id_conjunto_segmento ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearConjuntoSegmento() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_CONJUNTO_SEGMENTO);
    }

    public void modificarConjuntoSegmento(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_CONJUNTO_SEGMENTO);
    }

    public void modificarConjuntoSegmento(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_CONJUNTO_SEGMENTO);
    }

    public void eliminarConjuntoSegmento(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_CONJUNTO_SEGMENTO);
    }

    public void eliminarConjuntoSegmento(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_CONJUNTO_SEGMENTO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_CONJUNTO_SEGMENTO) {
            this.posCrearConjuntoSegmento(rowKey);
            return;
        }
    }

    protected void posCrearConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_CONJUNTO_SEGMENTO) {
            es = this.esFilaModificableConModificarConjuntoSegmento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarConjuntoSegmento(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_CONJUNTO_SEGMENTO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_CONJUNTO_SEGMENTO) {
            this.posModificarConjuntoSegmento(rowKey);
            return;
        }
    }

    protected void posModificarConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_CONJUNTO_SEGMENTO) {
            es = this.esFilaEliminableConEliminarConjuntoSegmento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarConjuntoSegmento(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONJUNTO_SEGMENTO) {
            this.preEliminarConjuntoSegmento(rowKey);
            return;
        }
    }

    protected void preEliminarConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_CONJUNTO_SEGMENTO) {
            this.posEliminarConjuntoSegmento(rowKey);
            return;
        }
    }

    protected void posEliminarConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_CONJUNTO_SEGMENTO) {
            es = this.esFilaValidaParaCrearConjuntoSegmento(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_CONJUNTO_SEGMENTO) {
            es = this.esFilaValidaParaModificarConjuntoSegmento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearConjuntoSegmento(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecurso(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO + ">");
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

    protected boolean esFilaValidaParaModificarConjuntoSegmento(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecurso(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO + ">");
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
        if (funcion == FUNCION_CREAR_CONJUNTO_SEGMENTO) {
            this.preCommitCrearConjuntoSegmento(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_CONJUNTO_SEGMENTO) {
            this.preCommitModificarConjuntoSegmento(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_CONJUNTO_SEGMENTO) {
            this.preCommitEliminarConjuntoSegmento(rowKey);
            return;
        }
    }

    protected void preCommitCrearConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_CONJUNTO_SEGMENTO);
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_CONJUNTO_SEGMENTO, this.getVersionConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONJUNTO_SEGMENTO, this.getCodigoConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_CONJUNTO_SEGMENTO, this.getNombreConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_CONJUNTO_SEGMENTO, this.getDescripcionConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_CONJUNTO_SEGMENTO);
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_CONJUNTO_SEGMENTO, this.getVersionConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_CONJUNTO_SEGMENTO, this.getCodigoConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_CONJUNTO_SEGMENTO, this.getNombreConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_CONJUNTO_SEGMENTO, this.getDescripcionConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarConjuntoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_CONJUNTO_SEGMENTO);
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
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
        this.setVersionConjuntoSegmento(rowKey, 0L);
    }
}
