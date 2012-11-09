/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.data.specific.xdp2;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.commons.util.TimeUtils;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.specific.xdp1.ArchivoDatosExtCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class ArchivoDatosExtCachedRowSetDataProvider2 extends ArchivoDatosExtCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public ArchivoDatosExtCachedRowSetDataProvider2() {
        super();
    }

    public ArchivoDatosExtCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 312300101L;

    public static final long FUNCION_CARGAR_ARCHIVO_DATOS_EXT = 312300151L;
    public static final long FUNCION_IMPORTAR_ARCHIVO_DATOS_EXT = 312300152L;
    public static final long FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT = 312300101L;
    public static final long FUNCION_CREAR_ARCHIVO_DATOS_EXT = 312300102L;
    public static final long FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT = 312300103L;
    public static final long FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT = 312300104L;

    public static final String PROCESO_FUNCION_CARGAR_ARCHIVO_DATOS_EXT = "archivo_datos_ext_cargar";
    public static final String PROCESO_FUNCION_IMPORTAR_ARCHIVO_DATOS_EXT = "archivo_datos_ext_importar";

    protected static final long PARAMETRO_ID_ARCHIVO_DATOS_EXT = 20268L;
    protected static final long PARAMETRO_NOMBRE_ARCHIVO_DATOS_EXT = 20279L;
    protected static final long PARAMETRO_ES_ARCHIVO_DATOS_EXT_IMPORTADO = 20282L;
    protected static final long PARAMETRO_FECHA_HORA_ULTIMA_CARGA = 20283L;
    protected static final long PARAMETRO_ID_USUARIO_ULTIMA_CARGA = 20285L;
    protected static final long PARAMETRO_FECHA_HORA_ULTIMA_IMPORTACION = 20284L;
    protected static final long PARAMETRO_ID_USUARIO_ULTIMA_IMPORTACION = 20286L;
    protected static final long PARAMETRO_VERSION_ARCHIVO_DATOS_EXT = 20272L;
    protected static final long PARAMETRO_CODIGO_ARCHIVO_DATOS_EXT = 20275L;
    protected static final long PARAMETRO_ID_PROVEEDOR_DAT_EXT = 20269L;
    protected static final long PARAMETRO_NUMERO_TIPO_ARC_DAT_EXT = 20271L;
    protected static final long PARAMETRO_OBJETO_ARCHIVO_DATOS_EXT = 20280L;
    protected static final long PARAMETRO_BYTES_ARCHIVO_DATOS_EXT = 20274L;
    protected static final long PARAMETRO_ES_ARCHIVO_DATOS_EXT_INACTIVO = 20276L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT = 312100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_ARC_DAT_EXT = 312200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT = {"proveedor_dat_ext", "id_proveedor_dat_ext", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_ARC_DAT_EXT = {"tipo_arc_dat_ext", "numero_tipo_arc_dat_ext", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT) {
            this.consultarArchivoDatosExt(filtro);
            return;
        }
    }

    public void consultarArchivoDatosExt() throws ExcepcionAplicacion {
        this.consultarArchivoDatosExt(new FiltroBusqueda());
    }

    public void consultarArchivoDatosExt(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarArchivoDatosExt(new FiltroBusqueda());
        } else {
            this.consultarArchivoDatosExt(new FiltroBusqueda(filtro));
        }
    }

    public void consultarArchivoDatosExt(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT);
            if (filtro == null) {
                filtro = new FiltroBusqueda();
            }
            String segmentos = TLC.getControlador().getSegmentosAutorizados(FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT);
            if (segmentos != null) {
                filtro.addCriterio(COLUMNA_SEGMENTO_RECURSO, EnumOperadorCom.ES_NULO_O_ESTA_ENTRE, segmentos);
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
                comando += clausula + " id_archivo_datos_ext ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearArchivoDatosExt() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_ARCHIVO_DATOS_EXT);
    }

    public void modificarArchivoDatosExt(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT);
    }

    public void modificarArchivoDatosExt(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT);
    }

    public void eliminarArchivoDatosExt(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT);
    }

    public void eliminarArchivoDatosExt(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_ARCHIVO_DATOS_EXT) {
            this.posCrearArchivoDatosExt(rowKey);
            return;
        }
    }

    protected void posCrearArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT) {
            es = this.esFilaModificableConModificarArchivoDatosExt(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarArchivoDatosExt(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT);
            if (es) {
                es = this.esFilaSegmentoAutorizado(rowKey, FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT);
            }
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT) {
            this.posModificarArchivoDatosExt(rowKey);
            return;
        }
    }

    protected void posModificarArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT) {
            es = this.esFilaEliminableConEliminarArchivoDatosExt(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarArchivoDatosExt(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaSegmentoAutorizado(rowKey, FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT);
        }
        return es;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT) {
            this.preEliminarArchivoDatosExt(rowKey);
            return;
        }
    }

    protected void preEliminarArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT) {
            this.posEliminarArchivoDatosExt(rowKey);
            return;
        }
    }

    protected void posEliminarArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_ARCHIVO_DATOS_EXT) {
            es = this.esFilaValidaParaCrearArchivoDatosExt(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT) {
            es = this.esFilaValidaParaModificarArchivoDatosExt(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearArchivoDatosExt(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.isColumnaInsertable(COLUMNA_SEGMENTO_RECURSO)) {
                    this.setSegmento(rowKey);
                    es = this.esFilaSegmentoAutorizado(rowKey, FUNCION_CREAR_ARCHIVO_DATOS_EXT);
                }
                if (es) {
                    if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PROVEEDOR_DAT_EXT)) {
                        ok = TLC.getControlador().esReferenciaAutorizada(this.getIdProveedorDatExt(rowKey), FUNCION_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT, STRINGS_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT);
                        es &= ok;
                        if (!ok) {
                            TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PROVEEDOR_DAT_EXT + ">");
                        }
                    }
                    if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO_ULTIMA_CARGA)) {
                        ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuarioUltimaCarga(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                        es &= ok;
                        if (!ok) {
                            TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO_ULTIMA_CARGA + ">");
                        }
                    }
                    if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION)) {
                        ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuarioUltimaImportacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                        es &= ok;
                        if (!ok) {
                            TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION + ">");
                        }
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

    protected boolean esFilaValidaParaModificarArchivoDatosExt(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.isColumnaModificable(COLUMNA_SEGMENTO_RECURSO)) {
                    this.setSegmento(rowKey);
                    es = this.esFilaSegmentoAutorizado(rowKey, FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT);
                }
                if (es) {
                    if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PROVEEDOR_DAT_EXT)) {
                        ok = TLC.getControlador().esReferenciaAutorizada(this.getIdProveedorDatExt(rowKey), FUNCION_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT, STRINGS_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT);
                        es &= ok;
                        if (!ok) {
                            TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PROVEEDOR_DAT_EXT + ">");
                        }
                    }
                    if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO_ULTIMA_CARGA)) {
                        ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuarioUltimaCarga(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                        es &= ok;
                        if (!ok) {
                            TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO_ULTIMA_CARGA + ">");
                        }
                    }
                    if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION)) {
                        ok = TLC.getControlador().esReferenciaAutorizada(this.getIdUsuarioUltimaImportacion(rowKey), FUNCION_REFERENCIA_CONSULTAR_USUARIO, STRINGS_REFERENCIA_CONSULTAR_USUARIO);
                        es &= ok;
                        if (!ok) {
                            TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_USUARIO_ULTIMA_IMPORTACION + ">");
                        }
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
        if (funcion == FUNCION_CREAR_ARCHIVO_DATOS_EXT) {
            this.preCommitCrearArchivoDatosExt(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT) {
            this.preCommitModificarArchivoDatosExt(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT) {
            this.preCommitEliminarArchivoDatosExt(rowKey);
            return;
        }
    }

    protected void preCommitCrearArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_ARCHIVO_DATOS_EXT);
        rastro.addParametro(PARAMETRO_ID_ARCHIVO_DATOS_EXT, this.getIdArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ARCHIVO_DATOS_EXT, this.getVersionArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ARCHIVO_DATOS_EXT, this.getCodigoArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_ARCHIVO_DATOS_EXT, this.getNombreArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ARC_DAT_EXT, this.getNumeroTipoArcDatExt(rowKey));
        rastro.addParametro(PARAMETRO_OBJETO_ARCHIVO_DATOS_EXT, this.getObjetoArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_BYTES_ARCHIVO_DATOS_EXT, this.getBytesArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_ES_ARCHIVO_DATOS_EXT_IMPORTADO, this.getEsArchivoDatosExtImportado(rowKey));
        rastro.addParametro(PARAMETRO_ES_ARCHIVO_DATOS_EXT_INACTIVO, this.getEsArchivoDatosExtInactivo(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_ULTIMA_CARGA, this.getFechaHoraUltimaCarga(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO_ULTIMA_CARGA, this.getIdUsuarioUltimaCarga(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_ULTIMA_IMPORTACION, this.getFechaHoraUltimaImportacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO_ULTIMA_IMPORTACION, this.getIdUsuarioUltimaImportacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT);
        rastro.addParametro(PARAMETRO_ID_ARCHIVO_DATOS_EXT, this.getIdArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_ARCHIVO_DATOS_EXT, this.getVersionArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_ARCHIVO_DATOS_EXT, this.getCodigoArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_ARCHIVO_DATOS_EXT, this.getNombreArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ARC_DAT_EXT, this.getNumeroTipoArcDatExt(rowKey));
        rastro.addParametro(PARAMETRO_OBJETO_ARCHIVO_DATOS_EXT, this.getObjetoArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_BYTES_ARCHIVO_DATOS_EXT, this.getBytesArchivoDatosExt(rowKey));
        rastro.addParametro(PARAMETRO_ES_ARCHIVO_DATOS_EXT_IMPORTADO, this.getEsArchivoDatosExtImportado(rowKey));
        rastro.addParametro(PARAMETRO_ES_ARCHIVO_DATOS_EXT_INACTIVO, this.getEsArchivoDatosExtInactivo(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_ULTIMA_CARGA, this.getFechaHoraUltimaCarga(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO_ULTIMA_CARGA, this.getIdUsuarioUltimaCarga(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_ULTIMA_IMPORTACION, this.getFechaHoraUltimaImportacion(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO_ULTIMA_IMPORTACION, this.getIdUsuarioUltimaImportacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarArchivoDatosExt(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT);
        rastro.addParametro(PARAMETRO_ID_ARCHIVO_DATOS_EXT, this.getIdArchivoDatosExt(rowKey));
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
        rastro.setIdSegmentoRecurso(this.getSegmentoRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        Timestamp currentTimestamp = TimeUtils.currentTimestamp();
        this.setVersionArchivoDatosExt(rowKey, 0L);
        this.setEsArchivoDatosExtImportado(rowKey, 0);
        this.setEsArchivoDatosExtInactivo(rowKey, 0);
    }
}
