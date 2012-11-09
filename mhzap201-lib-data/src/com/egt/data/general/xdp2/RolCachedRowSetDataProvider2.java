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
import com.egt.data.general.xdp1.RolCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class RolCachedRowSetDataProvider2 extends RolCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public RolCachedRowSetDataProvider2() {
        super();
    }

    public RolCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 106400101L;

    public static final long FUNCION_COPIAR_ROL = 106400105L;
    public static final long FUNCION_MODIFICAR_CONJUNTO_ROL = 106400106L;
    public static final long FUNCION_PROPAGAR_FILTROS_ROL = 106400107L;
    public static final long FUNCION_PROPAGAR_FAVORITOS_ROL = 106400108L;
    public static final long FUNCION_CONSULTAR_ROL = 106400101L;
    public static final long FUNCION_CREAR_ROL = 106400102L;
    public static final long FUNCION_MODIFICAR_ROL = 106400103L;
    public static final long FUNCION_ELIMINAR_ROL = 106400104L;

    public static final String PROCESO_FUNCION_COPIAR_ROL = "rol_copiar";
    public static final String PROCESO_FUNCION_MODIFICAR_CONJUNTO_ROL = "rol_modificar_conjunto";
    public static final String PROCESO_FUNCION_PROPAGAR_FILTROS_ROL = "rol_propagar_filtros";
    public static final String PROCESO_FUNCION_PROPAGAR_FAVORITOS_ROL = "rol_propagar_favoritos";

    protected static final long PARAMETRO_ID_ROL = 1370L;
    protected static final long PARAMETRO_CODIGO_ROL = 1185L;
    protected static final long PARAMETRO_NOMBRE_ROL = 1466L;
    protected static final long PARAMETRO_ID_CONJUNTO_SEGMENTO = 1312L;
    protected static final long PARAMETRO_ES_SEGMENTADA = 1280L;
    protected static final long PARAMETRO_VERSION_ROL = 1588L;
    protected static final long PARAMETRO_DESCRIPCION_ROL = 1235L;
    protected static final long PARAMETRO_NUMERO_TIPO_ROL = 1498L;
    protected static final long PARAMETRO_ID_GRUPO_APLICACION = 1332L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_ROL = 106400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO = 106200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_ROL = 106450101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_GRUPO_APLICACION = 104500101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ROL = {"rol", "id_rol", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONJUNTO_SEGMENTO = {"conjunto_segmento", "id_conjunto_segmento", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_ROL = {"tipo_rol", "numero_tipo_rol", "", ""};
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
        if (funcion == FUNCION_CONSULTAR_ROL) {
            this.consultarRol(filtro);
            return;
        }
    }

    public void consultarRol() throws ExcepcionAplicacion {
        this.consultarRol(new FiltroBusqueda());
    }

    public void consultarRol(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarRol(new FiltroBusqueda());
        } else {
            this.consultarRol(new FiltroBusqueda(filtro));
        }
    }

    public void consultarRol(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ROL);
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
                comando += clausula + " id_rol ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearRol() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ROL);
    }

    public void modificarRol(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ROL);
    }

    public void modificarRol(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ROL);
    }

    public void eliminarRol(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ROL);
    }

    public void eliminarRol(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ROL);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ROL) {
            this.posCrearRol(rowKey);
            return;
        }
    }

    protected void posCrearRol(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ROL) {
            es = this.esFilaModificableConModificarRol(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarRol(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ROL);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ROL) {
            this.posModificarRol(rowKey);
            return;
        }
    }

    protected void posModificarRol(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ROL) {
            es = this.esFilaEliminableConEliminarRol(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarRol(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL) {
            this.preEliminarRol(rowKey);
            return;
        }
    }

    protected void preEliminarRol(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ROL) {
            this.posEliminarRol(rowKey);
            return;
        }
    }

    protected void posEliminarRol(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ROL) {
            es = this.esFilaValidaParaCrearRol(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ROL) {
            es = this.esFilaValidaParaModificarRol(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearRol(RowKey rowKey) {
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

    protected boolean esFilaValidaParaModificarRol(RowKey rowKey) {
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
        if (funcion == FUNCION_CREAR_ROL) {
            this.preCommitCrearRol(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ROL) {
            this.preCommitModificarRol(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ROL) {
            this.preCommitEliminarRol(rowKey);
            return;
        }
    }

    protected void preCommitCrearRol(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ROL);
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL, this.getVersionRol(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ROL, this.getCodigoRol(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_ROL, this.getNombreRol(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_ROL, this.getDescripcionRol(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ROL, this.getNumeroTipoRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarRol(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ROL);
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ROL, this.getVersionRol(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ROL, this.getCodigoRol(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_ROL, this.getNombreRol(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_ROL, this.getDescripcionRol(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ROL, this.getNumeroTipoRol(rowKey));
        rastro.addParametro(PARAMETRO_ID_GRUPO_APLICACION, this.getIdGrupoAplicacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarRol(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ROL);
        rastro.addParametro(PARAMETRO_ID_ROL, this.getIdRol(rowKey));
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
        this.setVersionRol(rowKey, 0L);
    }
}
