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
import com.egt.data.general.xdp1.ElementoSegmentoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ElementoSegmentoCachedRowSetDataProvider2 extends ElementoSegmentoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ElementoSegmentoCachedRowSetDataProvider2() {
        super();
    }

    public ElementoSegmentoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106300101L;

    public static final long FUNCION_CONSULTAR_ELEMENTO_SEGMENTO = 106300101L;
    public static final long FUNCION_CREAR_ELEMENTO_SEGMENTO = 106300102L;
    public static final long FUNCION_MODIFICAR_ELEMENTO_SEGMENTO = 106300103L;
    public static final long FUNCION_ELIMINAR_ELEMENTO_SEGMENTO = 106300104L;

    protected static final long PARAMETRO_ID_ELEMENTO_SEGMENTO = 1320L;
    protected static final long PARAMETRO_VERSION_ELEMENTO_SEGMENTO = 1554L;
    protected static final long PARAMETRO_ID_CONJUNTO_SEGMENTO = 1312L;
    protected static final long PARAMETRO_ID_SEGMENTO = 1375L;
    protected static final long PARAMETRO_VALOR_SEGMENTO = 1537L;
    protected static final long PARAMETRO_SIGNIFICADO_SEGMENTO = 1519L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO = 106200101L;

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
        if (funcion == FUNCION_CONSULTAR_ELEMENTO_SEGMENTO) {
            this.consultarElementoSegmento(filtro);
            return;
        }
    }

    public void consultarElementoSegmento() throws ExcepcionAplicacion {
        this.consultarElementoSegmento(new FiltroBusqueda());
    }

    public void consultarElementoSegmento(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarElementoSegmento(new FiltroBusqueda());
        } else {
            this.consultarElementoSegmento(new FiltroBusqueda(filtro));
        }
    }

    public void consultarElementoSegmento(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ELEMENTO_SEGMENTO);
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
                comando += clausula + " id_elemento_segmento ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearElementoSegmento() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ELEMENTO_SEGMENTO);
    }

    public void modificarElementoSegmento(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ELEMENTO_SEGMENTO);
    }

    public void modificarElementoSegmento(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ELEMENTO_SEGMENTO);
    }

    public void eliminarElementoSegmento(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ELEMENTO_SEGMENTO);
    }

    public void eliminarElementoSegmento(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ELEMENTO_SEGMENTO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ELEMENTO_SEGMENTO) {
            this.posCrearElementoSegmento(rowKey);
            return;
        }
    }

    protected void posCrearElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ELEMENTO_SEGMENTO) {
            es = this.esFilaModificableConModificarElementoSegmento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarElementoSegmento(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ELEMENTO_SEGMENTO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ELEMENTO_SEGMENTO) {
            this.posModificarElementoSegmento(rowKey);
            return;
        }
    }

    protected void posModificarElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ELEMENTO_SEGMENTO) {
            es = this.esFilaEliminableConEliminarElementoSegmento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarElementoSegmento(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ELEMENTO_SEGMENTO) {
            this.preEliminarElementoSegmento(rowKey);
            return;
        }
    }

    protected void preEliminarElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ELEMENTO_SEGMENTO) {
            this.posEliminarElementoSegmento(rowKey);
            return;
        }
    }

    protected void posEliminarElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ELEMENTO_SEGMENTO) {
            es = this.esFilaValidaParaCrearElementoSegmento(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ELEMENTO_SEGMENTO) {
            es = this.esFilaValidaParaModificarElementoSegmento(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearElementoSegmento(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
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

    protected boolean esFilaValidaParaModificarElementoSegmento(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
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
        if (funcion == FUNCION_CREAR_ELEMENTO_SEGMENTO) {
            this.preCommitCrearElementoSegmento(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ELEMENTO_SEGMENTO) {
            this.preCommitModificarElementoSegmento(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ELEMENTO_SEGMENTO) {
            this.preCommitEliminarElementoSegmento(rowKey);
            return;
        }
    }

    protected void preCommitCrearElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ELEMENTO_SEGMENTO);
        rastro.addParametro(PARAMETRO_ID_ELEMENTO_SEGMENTO, this.getIdElementoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ELEMENTO_SEGMENTO, this.getVersionElementoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_SEGMENTO, this.getIdSegmento(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_SEGMENTO, this.getValorSegmento(rowKey));
        rastro.addParametro(PARAMETRO_SIGNIFICADO_SEGMENTO, this.getSignificadoSegmento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ELEMENTO_SEGMENTO);
        rastro.addParametro(PARAMETRO_ID_ELEMENTO_SEGMENTO, this.getIdElementoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ELEMENTO_SEGMENTO, this.getVersionElementoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_CONJUNTO_SEGMENTO, this.getIdConjuntoSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_SEGMENTO, this.getIdSegmento(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_SEGMENTO, this.getValorSegmento(rowKey));
        rastro.addParametro(PARAMETRO_SIGNIFICADO_SEGMENTO, this.getSignificadoSegmento(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarElementoSegmento(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ELEMENTO_SEGMENTO);
        rastro.addParametro(PARAMETRO_ID_ELEMENTO_SEGMENTO, this.getIdElementoSegmento(rowKey));
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
        this.setVersionElementoSegmento(rowKey, 0L);
    }
}
