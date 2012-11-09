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
import com.egt.data.general.xdp1.FiltroFuncionParCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FiltroFuncionParCachedRowSetDataProvider2 extends FiltroFuncionParCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FiltroFuncionParCachedRowSetDataProvider2() {
        super();
    }

    public FiltroFuncionParCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 108200101L;

    public static final long FUNCION_CONSULTAR_FILTRO_FUNCION_PAR = 108200101L;
    public static final long FUNCION_CREAR_FILTRO_FUNCION_PAR = 108200102L;
    public static final long FUNCION_MODIFICAR_FILTRO_FUNCION_PAR = 108200103L;
    public static final long FUNCION_ELIMINAR_FILTRO_FUNCION_PAR = 108200104L;

    protected static final long PARAMETRO_ID_FILTRO_FUNCION_PAR = 1326L;
    protected static final long PARAMETRO_VERSION_FILTRO_FUNCION_PAR = 1559L;
    protected static final long PARAMETRO_ID_FILTRO_FUNCION = 1325L;
    protected static final long PARAMETRO_ID_FUNCION_PARAMETRO = 1329L;
    protected static final long PARAMETRO_NUMERO_OPERADOR_COM = 1481L;
    protected static final long PARAMETRO_ID_VALOR_LISTA = 1381L;
    protected static final long PARAMETRO_ID_OBJETO_VALOR = 1340L;
    protected static final long PARAMETRO_ID_RECURSO_VALOR = 1366L;
    protected static final long PARAMETRO_VALOR_PARAMETRO = 1535L;
    protected static final long PARAMETRO_SIGNIFICADO_PARAMETRO = 1517L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_FILTRO_FUNCION = 108100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION_PARAMETRO = 103400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPERADOR_COM = 108300101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FILTRO_FUNCION = {"filtro_funcion", "id_filtro_funcion", "id_usuario", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION_PARAMETRO = {"funcion_parametro", "id_funcion_parametro", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPERADOR_COM = {"operador_com", "numero_operador_com", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_FILTRO_FUNCION_PAR) {
            this.consultarFiltroFuncionPar(filtro);
            return;
        }
    }

    public void consultarFiltroFuncionPar() throws ExcepcionAplicacion {
        this.consultarFiltroFuncionPar(new FiltroBusqueda());
    }

    public void consultarFiltroFuncionPar(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFiltroFuncionPar(new FiltroBusqueda());
        } else {
            this.consultarFiltroFuncionPar(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFiltroFuncionPar(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FILTRO_FUNCION_PAR);
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
                comando += clausula + " id_filtro_funcion_par ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFiltroFuncionPar() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FILTRO_FUNCION_PAR);
    }

    public void modificarFiltroFuncionPar(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FILTRO_FUNCION_PAR);
    }

    public void modificarFiltroFuncionPar(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION_PAR);
    }

    public void eliminarFiltroFuncionPar(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FILTRO_FUNCION_PAR);
    }

    public void eliminarFiltroFuncionPar(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FILTRO_FUNCION_PAR);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FILTRO_FUNCION_PAR) {
            this.posCrearFiltroFuncionPar(rowKey);
            return;
        }
    }

    protected void posCrearFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION_PAR) {
            es = this.esFilaModificableConModificarFiltroFuncionPar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFiltroFuncionPar(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION_PAR);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION_PAR) {
            this.posModificarFiltroFuncionPar(rowKey);
            return;
        }
    }

    protected void posModificarFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION_PAR) {
            es = this.esFilaEliminableConEliminarFiltroFuncionPar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFiltroFuncionPar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION_PAR) {
            this.preEliminarFiltroFuncionPar(rowKey);
            return;
        }
    }

    protected void preEliminarFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION_PAR) {
            this.posEliminarFiltroFuncionPar(rowKey);
            return;
        }
    }

    protected void posEliminarFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FILTRO_FUNCION_PAR) {
            es = this.esFilaValidaParaCrearFiltroFuncionPar(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION_PAR) {
            es = this.esFilaValidaParaModificarFiltroFuncionPar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFiltroFuncionPar(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FILTRO_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFiltroFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FILTRO_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FILTRO_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FILTRO_FUNCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_FUNCION_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_PARAMETRO + ">");
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

    protected boolean esFilaValidaParaModificarFiltroFuncionPar(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FILTRO_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFiltroFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FILTRO_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FILTRO_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FILTRO_FUNCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_PARAMETRO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionParametro(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION_PARAMETRO, STRINGS_REFERENCIA_CONSULTAR_FUNCION_PARAMETRO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_PARAMETRO + ">");
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
        if (funcion == FUNCION_CREAR_FILTRO_FUNCION_PAR) {
            this.preCommitCrearFiltroFuncionPar(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION_PAR) {
            this.preCommitModificarFiltroFuncionPar(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION_PAR) {
            this.preCommitEliminarFiltroFuncionPar(rowKey);
            return;
        }
    }

    protected void preCommitCrearFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FILTRO_FUNCION_PAR);
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION_PAR, this.getIdFiltroFuncionPar(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FILTRO_FUNCION_PAR, this.getVersionFiltroFuncionPar(rowKey));
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_PARAMETRO, this.getIdFuncionParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_OPERADOR_COM, this.getNumeroOperadorCom(rowKey));
        rastro.addParametro(PARAMETRO_ID_VALOR_LISTA, this.getIdValorLista(rowKey));
        rastro.addParametro(PARAMETRO_ID_OBJETO_VALOR, this.getIdObjetoValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_RECURSO_VALOR, this.getIdRecursoValor(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_PARAMETRO, this.getValorParametro(rowKey));
        rastro.addParametro(PARAMETRO_SIGNIFICADO_PARAMETRO, this.getSignificadoParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION_PAR);
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION_PAR, this.getIdFiltroFuncionPar(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FILTRO_FUNCION_PAR, this.getVersionFiltroFuncionPar(rowKey));
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_PARAMETRO, this.getIdFuncionParametro(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_OPERADOR_COM, this.getNumeroOperadorCom(rowKey));
        rastro.addParametro(PARAMETRO_ID_VALOR_LISTA, this.getIdValorLista(rowKey));
        rastro.addParametro(PARAMETRO_ID_OBJETO_VALOR, this.getIdObjetoValor(rowKey));
        rastro.addParametro(PARAMETRO_ID_RECURSO_VALOR, this.getIdRecursoValor(rowKey));
        rastro.addParametro(PARAMETRO_VALOR_PARAMETRO, this.getValorParametro(rowKey));
        rastro.addParametro(PARAMETRO_SIGNIFICADO_PARAMETRO, this.getSignificadoParametro(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFiltroFuncionPar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FILTRO_FUNCION_PAR);
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION_PAR, this.getIdFiltroFuncionPar(rowKey));
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
        this.setVersionFiltroFuncionPar(rowKey, 0L);
        this.setNumeroOperadorCom(rowKey, 11);
    }
}
