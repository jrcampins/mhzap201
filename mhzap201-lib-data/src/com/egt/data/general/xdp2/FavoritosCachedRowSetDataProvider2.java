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
import com.egt.data.general.xdp1.FavoritosCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FavoritosCachedRowSetDataProvider2 extends FavoritosCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FavoritosCachedRowSetDataProvider2() {
        super();
    }

    public FavoritosCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104400201L;

    public static final long FUNCION_CONSULTAR_FAVORITOS = 104400201L;
    public static final long FUNCION_CREAR_FAVORITOS = 104400202L;
    public static final long FUNCION_MODIFICAR_FAVORITOS = 104400203L;
    public static final long FUNCION_ELIMINAR_FAVORITOS = 104400204L;

    protected static final long PARAMETRO_ID_PAGINA_USUARIO = 1350L;
    protected static final long PARAMETRO_VERSION_PAGINA_USUARIO = 1619L;
    protected static final long PARAMETRO_ID_PAGINA = 1346L;
    protected static final long PARAMETRO_ID_USUARIO = 1379L;
    protected static final long PARAMETRO_CODIGO_PAGINA = 1177L;
    protected static final long PARAMETRO_NOMBRE_PAGINA = 1460L;
    protected static final long PARAMETRO_ID_APLICACION = 1295L;
    protected static final long PARAMETRO_NUMERO_TIPO_PAGINA = 1826L;
    protected static final long PARAMETRO_URL_PAGINA = 1527L;
    protected static final long PARAMETRO_CODIGO_USUARIO = 1207L;
    protected static final long PARAMETRO_NOMBRE_USUARIO = 1471L;
    protected static final long PARAMETRO_URL_APLICACION = 1525L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO = 1303L;
    protected static final long PARAMETRO_NUMERO_TIPO_RECURSO = 1500L;
    protected static final long PARAMETRO_ID_GRUPO_APLICACION = 1332L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_PAGINA = 104200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_APLICACION = 104100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_PAGINA = 104250101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO = 102100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_RECURSO = 102200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION = 104500101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PAGINA = {"pagina", "id_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_APLICACION = {"aplicacion", "id_aplicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_PAGINA = {"tipo_pagina", "numero_tipo_pagina", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO = {"clase_recurso", "id_clase_recurso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_RECURSO = {"tipo_recurso", "numero_tipo_recurso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_GRUPO_APLICACION = {"grupo_aplicacion", "id_grupo_aplicacion", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_FAVORITOS) {
            this.consultarFavoritos(filtro);
            return;
        }
    }

    public void consultarFavoritos() throws ExcepcionAplicacion {
        this.consultarFavoritos(new FiltroBusqueda());
    }

    public void consultarFavoritos(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFavoritos(new FiltroBusqueda());
        } else {
            this.consultarFavoritos(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFavoritos(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FAVORITOS);
            if (filtro == null) {
                filtro = new FiltroBusqueda();
            }
            Long propietario = TLC.getControlador().getPropietarioAutorizado();
            if (propietario != null) {
                filtro.addCriterio(COLUMNA_PROPIETARIO_RECURSO, EnumOperadorCom.ES_NULO_O_ES_IGUAL, propietario);
            }
            criterios = this.getCriteriosBusqueda();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
                clausula = "AND";
            }
            criterios = filtro.toString(CODIGO_DOMINIO_RECURSO);
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " (" + criterios + ") ";
            }
            clausula = "ORDER BY";
            criterios = this.getCriteriosOrden();
            if (criterios != null && !criterios.equals("")) {
                comando += clausula + " " + criterios + " ";
            } else {
                comando += clausula + " nombre_pagina ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFavoritos() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FAVORITOS);
    }

    public void modificarFavoritos(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FAVORITOS);
    }

    public void modificarFavoritos(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FAVORITOS);
    }

    public void eliminarFavoritos(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FAVORITOS);
    }

    public void eliminarFavoritos(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FAVORITOS);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FAVORITOS) {
            this.posCrearFavoritos(rowKey);
            return;
        }
    }

    protected void posCrearFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
        this.setPropietarioRecurso(rowKey, TLC.getControlador().getUsuario().getIdUsuario());
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FAVORITOS) {
            es = this.esFilaModificableConModificarFavoritos(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFavoritos(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoPropio(rowKey, FUNCION_MODIFICAR_FAVORITOS);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FAVORITOS) {
            this.posModificarFavoritos(rowKey);
            return;
        }
    }

    protected void posModificarFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FAVORITOS) {
            es = this.esFilaEliminableConEliminarFavoritos(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFavoritos(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoPropio(rowKey, FUNCION_ELIMINAR_FAVORITOS);
        }
        return es;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FAVORITOS) {
            this.preEliminarFavoritos(rowKey);
            return;
        }
    }

    protected void preEliminarFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FAVORITOS) {
            this.posEliminarFavoritos(rowKey);
            return;
        }
    }

    protected void posEliminarFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FAVORITOS) {
            es = this.esFilaValidaParaCrearFavoritos(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FAVORITOS) {
            es = this.esFilaValidaParaModificarFavoritos(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFavoritos(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuario(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO + ">");
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

    protected boolean esFilaValidaParaModificarFavoritos(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PAGINA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPagina(rowKey), FUNCION_REFERENCIA_CONSULTAR_PAGINA, STRINGS_REFERENCIA_CONSULTAR_PAGINA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PAGINA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuario(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO + ">");
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
        if (funcion == FUNCION_CREAR_FAVORITOS) {
            this.preCommitCrearFavoritos(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FAVORITOS) {
            this.preCommitModificarFavoritos(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FAVORITOS) {
            this.preCommitEliminarFavoritos(rowKey);
            return;
        }
    }

    protected void preCommitCrearFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
    }

    protected void preCommitModificarFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
    }

    protected void preCommitEliminarFavoritos(RowKey rowKey) {
        if (rowKey == null) return;
    }

    protected void initRow(RowKey rowKey) {
    }
}
