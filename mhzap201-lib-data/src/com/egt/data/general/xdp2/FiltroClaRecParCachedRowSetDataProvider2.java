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
import com.egt.data.general.xdp1.FiltroClaRecParCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FiltroClaRecParCachedRowSetDataProvider2 extends FiltroClaRecParCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FiltroClaRecParCachedRowSetDataProvider2() {
        super();
    }

    public FiltroClaRecParCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102270101L;

    public static final long FUNCION_CONSULTAR_FILTRO_CLA_REC_PAR = 102270101L;
    public static final long FUNCION_CREAR_FILTRO_CLA_REC_PAR = 102270102L;
    public static final long FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR = 102270103L;
    public static final long FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR = 102270104L;

    protected static final long PARAMETRO_ID_FILTRO_CLA_REC_PAR = 1328L;
    protected static final long PARAMETRO_VERSION_FILTRO_CLA_REC_PAR = 1561L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_PAR = 1307L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_PAR_COLUMNA = 1313L;
    protected static final long PARAMETRO_NUMERO_OPERADOR_COM = 1481L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO_PAR_VALOR = 1314L;
    protected static final long PARAMETRO_VALOR = 1529L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR = 102250101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPERADOR_COM = 108300101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR = {"clase_recurso_par", "id_clase_recurso_par", "", ""};
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
        if (funcion == FUNCION_CONSULTAR_FILTRO_CLA_REC_PAR) {
            this.consultarFiltroClaRecPar(filtro);
            return;
        }
    }

    public void consultarFiltroClaRecPar() throws ExcepcionAplicacion {
        this.consultarFiltroClaRecPar(new FiltroBusqueda());
    }

    public void consultarFiltroClaRecPar(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFiltroClaRecPar(new FiltroBusqueda());
        } else {
            this.consultarFiltroClaRecPar(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFiltroClaRecPar(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FILTRO_CLA_REC_PAR);
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
                comando += clausula + " id_filtro_cla_rec_par ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFiltroClaRecPar() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FILTRO_CLA_REC_PAR);
    }

    public void modificarFiltroClaRecPar(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR);
    }

    public void modificarFiltroClaRecPar(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR);
    }

    public void eliminarFiltroClaRecPar(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR);
    }

    public void eliminarFiltroClaRecPar(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FILTRO_CLA_REC_PAR) {
            this.posCrearFiltroClaRecPar(rowKey);
            return;
        }
    }

    protected void posCrearFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR) {
            es = this.esFilaModificableConModificarFiltroClaRecPar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFiltroClaRecPar(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR) {
            this.posModificarFiltroClaRecPar(rowKey);
            return;
        }
    }

    protected void posModificarFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR) {
            es = this.esFilaEliminableConEliminarFiltroClaRecPar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFiltroClaRecPar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR) {
            this.preEliminarFiltroClaRecPar(rowKey);
            return;
        }
    }

    protected void preEliminarFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR) {
            this.posEliminarFiltroClaRecPar(rowKey);
            return;
        }
    }

    protected void posEliminarFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FILTRO_CLA_REC_PAR) {
            es = this.esFilaValidaParaCrearFiltroClaRecPar(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR) {
            es = this.esFilaValidaParaModificarFiltroClaRecPar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFiltroClaRecPar(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_PAR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoPar(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_PAR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoParColumna(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoParValor(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_PAR_VALOR + ">");
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

    protected boolean esFilaValidaParaModificarFiltroClaRecPar(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_PAR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoPar(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_PAR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoParColumna(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_PAR_COLUMNA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO_PAR_VALOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecursoParValor(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO_PAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO_PAR_VALOR + ">");
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
        if (funcion == FUNCION_CREAR_FILTRO_CLA_REC_PAR) {
            this.preCommitCrearFiltroClaRecPar(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR) {
            this.preCommitModificarFiltroClaRecPar(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR) {
            this.preCommitEliminarFiltroClaRecPar(rowKey);
            return;
        }
    }

    protected void preCommitCrearFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FILTRO_CLA_REC_PAR);
        rastro.addParametro(PARAMETRO_ID_FILTRO_CLA_REC_PAR, this.getIdFiltroClaRecPar(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FILTRO_CLA_REC_PAR, this.getVersionFiltroClaRecPar(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_PAR, this.getIdClaseRecursoPar(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_PAR_COLUMNA, this.getIdClaseRecursoParColumna(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_OPERADOR_COM, this.getNumeroOperadorCom(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_PAR_VALOR, this.getIdClaseRecursoParValor(rowKey));
        rastro.addParametro(PARAMETRO_VALOR, this.getValor(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FILTRO_CLA_REC_PAR);
        rastro.addParametro(PARAMETRO_ID_FILTRO_CLA_REC_PAR, this.getIdFiltroClaRecPar(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FILTRO_CLA_REC_PAR, this.getVersionFiltroClaRecPar(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_PAR, this.getIdClaseRecursoPar(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_PAR_COLUMNA, this.getIdClaseRecursoParColumna(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_OPERADOR_COM, this.getNumeroOperadorCom(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO_PAR_VALOR, this.getIdClaseRecursoParValor(rowKey));
        rastro.addParametro(PARAMETRO_VALOR, this.getValor(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFiltroClaRecPar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FILTRO_CLA_REC_PAR);
        rastro.addParametro(PARAMETRO_ID_FILTRO_CLA_REC_PAR, this.getIdFiltroClaRecPar(rowKey));
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
        this.setVersionFiltroClaRecPar(rowKey, 0L);
        this.setNumeroOperadorCom(rowKey, 11);
    }
}
