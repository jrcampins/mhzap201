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
import com.egt.data.general.xdp1.DominioParametroCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class DominioParametroCachedRowSetDataProvider2 extends DominioParametroCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public DominioParametroCachedRowSetDataProvider2() {
        super();
    }

    public DominioParametroCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102500101L;

    public static final long FUNCION_CONSULTAR_DOMINIO_PARAMETRO = 102500101L;
    public static final long FUNCION_CREAR_DOMINIO_PARAMETRO = 102500102L;
    public static final long FUNCION_MODIFICAR_DOMINIO_PARAMETRO = 102500103L;
    public static final long FUNCION_ELIMINAR_DOMINIO_PARAMETRO = 102500104L;

    protected static final long PARAMETRO_ID_DOMINIO_PARAMETRO = 1317L;
    protected static final long PARAMETRO_VERSION_DOMINIO_PARAMETRO = 1553L;
    protected static final long PARAMETRO_ID_DOMINIO = 1315L;
    protected static final long PARAMETRO_ID_PARAMETRO = 1352L;
    protected static final long PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM = 1497L;
    protected static final long PARAMETRO_ETIQUETA_PARAMETRO = 1286L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_DOMINIO = 102300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PARAMETRO = 101100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_PARAMETRO_DOM = 102600101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_DOMINIO = {"dominio", "id_dominio", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PARAMETRO = {"parametro", "id_parametro", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_PARAMETRO_DOM = {"tipo_parametro_dom", "numero_tipo_parametro_dom", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_DOMINIO_PARAMETRO) {
            this.consultarDominioParametro(filtro);
            return;
        }
    }

    public void consultarDominioParametro() throws ExcepcionAplicacion {
        this.consultarDominioParametro(new FiltroBusqueda());
    }

    public void consultarDominioParametro(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarDominioParametro(new FiltroBusqueda());
        } else {
            this.consultarDominioParametro(new FiltroBusqueda(filtro));
        }
    }

    public void consultarDominioParametro(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_DOMINIO_PARAMETRO);
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
                comando += clausula + " id_dominio_parametro ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearDominioParametro() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_DOMINIO_PARAMETRO);
    }

    public void modificarDominioParametro(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_DOMINIO_PARAMETRO);
    }

    public void modificarDominioParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_DOMINIO_PARAMETRO);
    }

    public void eliminarDominioParametro(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_DOMINIO_PARAMETRO);
    }

    public void eliminarDominioParametro(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_DOMINIO_PARAMETRO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_DOMINIO_PARAMETRO) {
            this.posCrearDominioParametro(rowKey);
            return;
        }
    }

    protected void posCrearDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PARAMETRO) {
            es = this.esFilaModificableConModificarDominioParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarDominioParametro(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_DOMINIO_PARAMETRO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PARAMETRO) {
            this.posModificarDominioParametro(rowKey);
            return;
        }
    }

    protected void posModificarDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PARAMETRO) {
            es = this.esFilaEliminableConEliminarDominioParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarDominioParametro(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PARAMETRO) {
            this.preEliminarDominioParametro(rowKey);
            return;
        }
    }

    protected void preEliminarDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PARAMETRO) {
            this.posEliminarDominioParametro(rowKey);
            return;
        }
    }

    protected void posEliminarDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_DOMINIO_PARAMETRO) {
            es = this.esFilaValidaParaCrearDominioParametro(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PARAMETRO) {
            es = this.esFilaValidaParaModificarDominioParametro(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearDominioParametro(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominio(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PARAMETRO + ">");
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

    protected boolean esFilaValidaParaModificarDominioParametro(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominio(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PARAMETRO + ">");
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
        if (funcion == FUNCION_CREAR_DOMINIO_PARAMETRO) {
            this.preCommitCrearDominioParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PARAMETRO) {
            this.preCommitModificarDominioParametro(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PARAMETRO) {
            this.preCommitEliminarDominioParametro(rowKey);
            return;
        }
    }

    protected void preCommitCrearDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_DOMINIO_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_DOMINIO_PARAMETRO, this.getIdDominioParametro(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_DOMINIO_PARAMETRO, this.getVersionDominioParametro(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM, this.getNumeroTipoParametroDom(rowKey));
        rastro.addParametro(PARAMETRO_ETIQUETA_PARAMETRO, this.getEtiquetaParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_DOMINIO_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_DOMINIO_PARAMETRO, this.getIdDominioParametro(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_DOMINIO_PARAMETRO, this.getVersionDominioParametro(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_PARAMETRO, this.getIdParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PARAMETRO_DOM, this.getNumeroTipoParametroDom(rowKey));
        rastro.addParametro(PARAMETRO_ETIQUETA_PARAMETRO, this.getEtiquetaParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarDominioParametro(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_DOMINIO_PARAMETRO);
        rastro.addParametro(PARAMETRO_ID_DOMINIO_PARAMETRO, this.getIdDominioParametro(rowKey));
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
        this.setVersionDominioParametro(rowKey, 0L);
    }
}
