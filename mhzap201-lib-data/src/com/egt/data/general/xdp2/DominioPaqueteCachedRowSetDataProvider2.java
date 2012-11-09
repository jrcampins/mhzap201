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
import com.egt.data.general.xdp1.DominioPaqueteCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class DominioPaqueteCachedRowSetDataProvider2 extends DominioPaqueteCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public DominioPaqueteCachedRowSetDataProvider2() {
        super();
    }

    public DominioPaqueteCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102800101L;

    public static final long FUNCION_CONSULTAR_DOMINIO_PAQUETE = 102800101L;
    public static final long FUNCION_CREAR_DOMINIO_PAQUETE = 102800102L;
    public static final long FUNCION_MODIFICAR_DOMINIO_PAQUETE = 102800103L;
    public static final long FUNCION_ELIMINAR_DOMINIO_PAQUETE = 102800104L;

    protected static final long PARAMETRO_ID_DOMINIO_PAQUETE = 1316L;
    protected static final long PARAMETRO_VERSION_DOMINIO_PAQUETE = 1552L;
    protected static final long PARAMETRO_ID_DOMINIO = 1315L;
    protected static final long PARAMETRO_ID_PAQUETE = 1351L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_DOMINIO = 102300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PAQUETE = 102700101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_DOMINIO = {"dominio", "id_dominio", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAQUETE = {"paquete", "id_paquete", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_DOMINIO_PAQUETE) {
            this.consultarDominioPaquete(filtro);
            return;
        }
    }

    public void consultarDominioPaquete() throws ExcepcionAplicacion {
        this.consultarDominioPaquete(new FiltroBusqueda());
    }

    public void consultarDominioPaquete(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarDominioPaquete(new FiltroBusqueda());
        } else {
            this.consultarDominioPaquete(new FiltroBusqueda(filtro));
        }
    }

    public void consultarDominioPaquete(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_DOMINIO_PAQUETE);
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
                comando += clausula + " id_dominio_paquete ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearDominioPaquete() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_DOMINIO_PAQUETE);
    }

    public void modificarDominioPaquete(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_DOMINIO_PAQUETE);
    }

    public void modificarDominioPaquete(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_DOMINIO_PAQUETE);
    }

    public void eliminarDominioPaquete(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_DOMINIO_PAQUETE);
    }

    public void eliminarDominioPaquete(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_DOMINIO_PAQUETE);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_DOMINIO_PAQUETE) {
            this.posCrearDominioPaquete(rowKey);
            return;
        }
    }

    protected void posCrearDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PAQUETE) {
            es = this.esFilaModificableConModificarDominioPaquete(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarDominioPaquete(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_DOMINIO_PAQUETE);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PAQUETE) {
            this.posModificarDominioPaquete(rowKey);
            return;
        }
    }

    protected void posModificarDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PAQUETE) {
            es = this.esFilaEliminableConEliminarDominioPaquete(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarDominioPaquete(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PAQUETE) {
            this.preEliminarDominioPaquete(rowKey);
            return;
        }
    }

    protected void preEliminarDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PAQUETE) {
            this.posEliminarDominioPaquete(rowKey);
            return;
        }
    }

    protected void posEliminarDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_DOMINIO_PAQUETE) {
            es = this.esFilaValidaParaCrearDominioPaquete(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PAQUETE) {
            es = this.esFilaValidaParaModificarDominioPaquete(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearDominioPaquete(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAQUETE)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPaquete(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAQUETE, STRINGS_REFERENCIA_CONSULTAR_PAQUETE);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAQUETE + ">");
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

    protected boolean esFilaValidaParaModificarDominioPaquete(RowKey rowKey) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAQUETE)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPaquete(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAQUETE, STRINGS_REFERENCIA_CONSULTAR_PAQUETE);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAQUETE + ">");
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
        if (funcion == FUNCION_CREAR_DOMINIO_PAQUETE) {
            this.preCommitCrearDominioPaquete(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_DOMINIO_PAQUETE) {
            this.preCommitModificarDominioPaquete(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_DOMINIO_PAQUETE) {
            this.preCommitEliminarDominioPaquete(rowKey);
            return;
        }
    }

    protected void preCommitCrearDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_DOMINIO_PAQUETE);
        rastro.addParametro(PARAMETRO_ID_DOMINIO_PAQUETE, this.getIdDominioPaquete(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_DOMINIO_PAQUETE, this.getVersionDominioPaquete(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_DOMINIO_PAQUETE);
        rastro.addParametro(PARAMETRO_ID_DOMINIO_PAQUETE, this.getIdDominioPaquete(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_DOMINIO_PAQUETE, this.getVersionDominioPaquete(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarDominioPaquete(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_DOMINIO_PAQUETE);
        rastro.addParametro(PARAMETRO_ID_DOMINIO_PAQUETE, this.getIdDominioPaquete(rowKey));
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
        this.setVersionDominioPaquete(rowKey, 0L);
    }
}
