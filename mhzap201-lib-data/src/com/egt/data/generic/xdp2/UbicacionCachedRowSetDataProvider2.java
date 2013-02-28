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
package com.egt.data.generic.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.generic.xdp1.UbicacionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class UbicacionCachedRowSetDataProvider2 extends UbicacionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public UbicacionCachedRowSetDataProvider2() {
        super();
    }

    public UbicacionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 202000101L;

    public static final long FUNCION_RECONSTRUIR_UBICACION = 202000151L;
    public static final long FUNCION_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_CREAR_UBICACION = 202000102L;
    public static final long FUNCION_MODIFICAR_UBICACION = 202000103L;
    public static final long FUNCION_ELIMINAR_UBICACION = 202000104L;

    public static final String PROCESO_FUNCION_RECONSTRUIR_UBICACION = "ubicacion_reconstruir";

    protected static final long PARAMETRO_ID_UBICACION = 20513L;
    protected static final long PARAMETRO_VERSION_UBICACION = 20533L;
    protected static final long PARAMETRO_CODIGO_UBICACION = 20496L;
    protected static final long PARAMETRO_NOMBRE_UBICACION = 20515L;
    protected static final long PARAMETRO_ID_UBICACION_SUPERIOR = 20514L;
    protected static final long PARAMETRO_NUMERO_TIPO_NODO = 1495L;
    protected static final long PARAMETRO_NUMERO_NIVEL_UBICACION = 20531L;
    protected static final long PARAMETRO_SECUENCIA_UBICACION = 20532L;
    protected static final long PARAMETRO_CLAVE_UBICACION = 20464L;
    protected static final long PARAMETRO_NUMERO_TIPO_AREA = 20412L;
    protected static final long PARAMETRO_CODIGO_UBICACION_JUPE = 21002L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_NODO = 100300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_NIVEL_UBICACION = 202200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_AREA = 322200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_NODO = {"tipo_nodo", "numero_tipo_nodo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_NIVEL_UBICACION = {"nivel_ubicacion", "numero_nivel_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_AREA = {"tipo_area", "numero_tipo_area", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_UBICACION) {
            this.consultarUbicacion(filtro);
            return;
        }
    }

    public void consultarUbicacion() throws ExcepcionAplicacion {
        this.consultarUbicacion(new FiltroBusqueda());
    }

    public void consultarUbicacion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarUbicacion(new FiltroBusqueda());
        } else {
            this.consultarUbicacion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarUbicacion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_UBICACION);
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
                comando += clausula + " id_ubicacion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearUbicacion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_UBICACION);
    }

    public void modificarUbicacion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_UBICACION);
    }

    public void modificarUbicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_UBICACION);
    }

    public void eliminarUbicacion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_UBICACION);
    }

    public void eliminarUbicacion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_UBICACION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_UBICACION) {
            this.posCrearUbicacion(rowKey);
            return;
        }
    }

    protected void posCrearUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_UBICACION) {
            es = this.esFilaModificableConModificarUbicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarUbicacion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_UBICACION);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_UBICACION) {
            this.posModificarUbicacion(rowKey);
            return;
        }
    }

    protected void posModificarUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_UBICACION) {
            es = this.esFilaEliminableConEliminarUbicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarUbicacion(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_UBICACION) {
            this.preEliminarUbicacion(rowKey);
            return;
        }
    }

    protected void preEliminarUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_UBICACION) {
            this.posEliminarUbicacion(rowKey);
            return;
        }
    }

    protected void posEliminarUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_UBICACION) {
            es = this.esFilaValidaParaCrearUbicacion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_UBICACION) {
            es = this.esFilaValidaParaModificarUbicacion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearUbicacion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_UBICACION_SUPERIOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUbicacionSuperior(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_UBICACION_SUPERIOR + ">");
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

    protected boolean esFilaValidaParaModificarUbicacion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_UBICACION_SUPERIOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUbicacionSuperior(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_UBICACION_SUPERIOR + ">");
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
        if (funcion == FUNCION_CREAR_UBICACION) {
            this.preCommitCrearUbicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_UBICACION) {
            this.preCommitModificarUbicacion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_UBICACION) {
            this.preCommitEliminarUbicacion(rowKey);
            return;
        }
    }

    protected void preCommitCrearUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_UBICACION);
        rastro.addParametro(PARAMETRO_ID_UBICACION, this.getIdUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_UBICACION, this.getVersionUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_UBICACION, this.getCodigoUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_UBICACION, this.getNombreUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_UBICACION_SUPERIOR, this.getIdUbicacionSuperior(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_UBICACION, this.getNumeroNivelUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_SECUENCIA_UBICACION, this.getSecuenciaUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_CLAVE_UBICACION, this.getClaveUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_UBICACION_JUPE, this.getCodigoUbicacionJupe(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_UBICACION);
        rastro.addParametro(PARAMETRO_ID_UBICACION, this.getIdUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_UBICACION, this.getVersionUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_UBICACION, this.getCodigoUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_UBICACION, this.getNombreUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_UBICACION_SUPERIOR, this.getIdUbicacionSuperior(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_NODO, this.getNumeroTipoNodo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_UBICACION, this.getNumeroNivelUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_SECUENCIA_UBICACION, this.getSecuenciaUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_CLAVE_UBICACION, this.getClaveUbicacion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_UBICACION_JUPE, this.getCodigoUbicacionJupe(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarUbicacion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_UBICACION);
        rastro.addParametro(PARAMETRO_ID_UBICACION, this.getIdUbicacion(rowKey));
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
        this.setVersionUbicacion(rowKey, 0L);
    }
}
