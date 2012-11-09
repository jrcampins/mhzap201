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
import com.egt.data.general.xdp1.AplicacionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class AplicacionCachedRowSetDataProvider2 extends AplicacionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public AplicacionCachedRowSetDataProvider2() {
        super();
    }

    public AplicacionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 104100101L;

    public static final long FUNCION_GENERAR_APLICACION = 104100901L;
    public static final long FUNCION_CONSULTAR_APLICACION = 104100101L;
    public static final long FUNCION_CREAR_APLICACION = 104100102L;
    public static final long FUNCION_MODIFICAR_APLICACION = 104100103L;
    public static final long FUNCION_ELIMINAR_APLICACION = 104100104L;

    public static final String PROCESO_FUNCION_GENERAR_APLICACION = "aplicacion_generar";

    protected static final long PARAMETRO_ID_APLICACION = 1295L;
    protected static final long PARAMETRO_VERSION_APLICACION = 1538L;
    protected static final long PARAMETRO_CODIGO_APLICACION = 1052L;
    protected static final long PARAMETRO_NOMBRE_APLICACION = 1388L;
    protected static final long PARAMETRO_DESCRIPCION_APLICACION = 1212L;
    protected static final long PARAMETRO_SERVIDOR_APLICACION = 1514L;
    protected static final long PARAMETRO_PUERTO_APLICACION = 1512L;
    protected static final long PARAMETRO_URL_APLICACION = 1525L;
    protected static final long PARAMETRO_ES_PUBLICA = 1274L;
    protected static final long PARAMETRO_ID_GRUPO_APLICACION = 1332L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_APLICACION = 104100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION = 104500101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_APLICACION = {"aplicacion", "id_aplicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
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
        if (funcion == FUNCION_CONSULTAR_APLICACION) {
            this.consultarAplicacion(filtro);
            return;
        }
    }

    public void consultarAplicacion() throws ExcepcionAplicacion {
        this.consultarAplicacion(new FiltroBusqueda());
    }

    public void consultarAplicacion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarAplicacion(new FiltroBusqueda());
        } else {
            this.consultarAplicacion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarAplicacion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_APLICACION);
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
                comando += clausula + " id_aplicacion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearAplicacion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_APLICACION);
    }

    public void modificarAplicacion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_APLICACION);
    }

    public void modificarAplicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_APLICACION);
    }

    public void eliminarAplicacion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_APLICACION);
    }

    public void eliminarAplicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_APLICACION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_APLICACION) {
            this.posCrearAplicacion(rowKey);
            return;
        }
    }

    protected void posCrearAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_APLICACION) {
            es = this.esFilaModificableConModificarAplicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarAplicacion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_APLICACION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_APLICACION) {
            this.posModificarAplicacion(rowKey);
            return;
        }
    }

    protected void posModificarAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_APLICACION) {
            es = this.esFilaEliminableConEliminarAplicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarAplicacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_APLICACION) {
            this.preEliminarAplicacion(rowKey);
            return;
        }
    }

    protected void preEliminarAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_APLICACION) {
            this.posEliminarAplicacion(rowKey);
            return;
        }
    }

    protected void posEliminarAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_APLICACION) {
            es = this.esFilaValidaParaCrearAplicacion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_APLICACION) {
            es = this.esFilaValidaParaModificarAplicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearAplicacion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_GRUPO_APLICACION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdGrupoAplicacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION, STRINGS_REFERENCIA_CONSULTAR_GRUPO_APLICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_GRUPO_APLICACION + ">");
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

    protected boolean esFilaValidaParaModificarAplicacion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_GRUPO_APLICACION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdGrupoAplicacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION, STRINGS_REFERENCIA_CONSULTAR_GRUPO_APLICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_GRUPO_APLICACION + ">");
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
        if (funcion == FUNCION_CREAR_APLICACION) {
            this.preCommitCrearAplicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_APLICACION) {
            this.preCommitModificarAplicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_APLICACION) {
            this.preCommitEliminarAplicacion(rowKey);
            return;
        }
    }

    protected void preCommitCrearAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_APLICACION);
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_APLICACION, this.getVersionAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_APLICACION, this.getCodigoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_APLICACION, this.getNombreAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_APLICACION, this.getDescripcionAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_SERVIDOR_APLICACION, this.getServidorAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_PUERTO_APLICACION, this.getPuertoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_URL_APLICACION, this.getUrlAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICA, this.getEsPublica(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_APLICACION);
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_APLICACION, this.getVersionAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_APLICACION, this.getCodigoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_APLICACION, this.getNombreAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_APLICACION, this.getDescripcionAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_SERVIDOR_APLICACION, this.getServidorAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_PUERTO_APLICACION, this.getPuertoAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_URL_APLICACION, this.getUrlAplicacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICA, this.getEsPublica(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarAplicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_APLICACION);
        rastro.addParametro(PARAMETRO_ID_APLICACION, this.getIdAplicacion(rowKey));
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
        this.setVersionAplicacion(rowKey, 0L);
        this.setEsPublica(rowKey, 0);
    }
}
