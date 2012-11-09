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
import com.egt.data.general.xdp1.DominioCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class DominioCachedRowSetDataProvider2 extends DominioCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public DominioCachedRowSetDataProvider2() {
        super();
    }

    public DominioCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 102300101L;

    public static final long FUNCION_CONSULTAR_DOMINIO = 102300101L;
    public static final long FUNCION_CREAR_DOMINIO = 102300102L;
    public static final long FUNCION_MODIFICAR_DOMINIO = 102300103L;
    public static final long FUNCION_ELIMINAR_DOMINIO = 102300104L;

    protected static final long PARAMETRO_ID_DOMINIO = 1315L;
    protected static final long PARAMETRO_VERSION_DOMINIO = 1551L;
    protected static final long PARAMETRO_CODIGO_DOMINIO = 1080L;
    protected static final long PARAMETRO_NOMBRE_DOMINIO = 1417L;
    protected static final long PARAMETRO_DESCRIPCION_DOMINIO = 1221L;
    protected static final long PARAMETRO_NOMBRE_TABLA = 1468L;
    protected static final long PARAMETRO_NUMERO_TIPO_DOMINIO = 1490L;
    protected static final long PARAMETRO_ID_CLASE_RECURSO = 1303L;
    protected static final long PARAMETRO_ID_FUNCION_SELECCION = 1331L;
    protected static final long PARAMETRO_ID_DOMINIO_SEGMENTO = 1318L;
    protected static final long PARAMETRO_ID_PAQUETE = 1351L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_DOMINIO = 102400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO = 102100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_DOMINIO = 102300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PAQUETE = 102700101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_DOMINIO = {"tipo_dominio", "numero_tipo_dominio", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO = {"clase_recurso", "id_clase_recurso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
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
        if (funcion == FUNCION_CONSULTAR_DOMINIO) {
            this.consultarDominio(filtro);
            return;
        }
    }

    public void consultarDominio() throws ExcepcionAplicacion {
        this.consultarDominio(new FiltroBusqueda());
    }

    public void consultarDominio(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarDominio(new FiltroBusqueda());
        } else {
            this.consultarDominio(new FiltroBusqueda(filtro));
        }
    }

    public void consultarDominio(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_DOMINIO);
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
                comando += clausula + " id_dominio ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearDominio() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_DOMINIO);
    }

    public void modificarDominio(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_DOMINIO);
    }

    public void modificarDominio(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_DOMINIO);
    }

    public void eliminarDominio(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_DOMINIO);
    }

    public void eliminarDominio(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_DOMINIO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_DOMINIO) {
            this.posCrearDominio(rowKey);
            return;
        }
    }

    protected void posCrearDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_DOMINIO) {
            es = this.esFilaModificableConModificarDominio(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarDominio(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_DOMINIO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_DOMINIO) {
            this.posModificarDominio(rowKey);
            return;
        }
    }

    protected void posModificarDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_DOMINIO) {
            es = this.esFilaEliminableConEliminarDominio(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarDominio(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_DOMINIO) {
            this.preEliminarDominio(rowKey);
            return;
        }
    }

    protected void preEliminarDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_DOMINIO) {
            this.posEliminarDominio(rowKey);
            return;
        }
    }

    protected void posEliminarDominio(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_DOMINIO) {
            es = this.esFilaValidaParaCrearDominio(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_DOMINIO) {
            es = this.esFilaValidaParaModificarDominio(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearDominio(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecurso(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_SELECCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionSeleccion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_SELECCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO_SEGMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominioSegmento(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO_SEGMENTO + ">");
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

    protected boolean esFilaValidaParaModificarDominio(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_CLASE_RECURSO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdClaseRecurso(rowKey), FUNCION_REFERENCIA_CONSULTAR_CLASE_RECURSO, STRINGS_REFERENCIA_CONSULTAR_CLASE_RECURSO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_CLASE_RECURSO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION_SELECCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionSeleccion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION_SELECCION + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DOMINIO_SEGMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDominioSegmento(rowKey), FUNCION_REFERENCIA_CONSULTAR_DOMINIO, STRINGS_REFERENCIA_CONSULTAR_DOMINIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DOMINIO_SEGMENTO + ">");
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
        if (funcion == FUNCION_CREAR_DOMINIO) {
            this.preCommitCrearDominio(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_DOMINIO) {
            this.preCommitModificarDominio(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_DOMINIO) {
            this.preCommitEliminarDominio(rowKey);
            return;
        }
    }

    protected void preCommitCrearDominio(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_DOMINIO);
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_DOMINIO, this.getVersionDominio(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_DOMINIO, this.getCodigoDominio(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_DOMINIO, this.getNombreDominio(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_DOMINIO, this.getDescripcionDominio(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_TABLA, this.getNombreTabla(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DOMINIO, this.getNumeroTipoDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_SELECCION, this.getIdFuncionSeleccion(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO_SEGMENTO, this.getIdDominioSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarDominio(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_DOMINIO);
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_DOMINIO, this.getVersionDominio(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_DOMINIO, this.getCodigoDominio(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_DOMINIO, this.getNombreDominio(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_DOMINIO, this.getDescripcionDominio(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_TABLA, this.getNombreTabla(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DOMINIO, this.getNumeroTipoDominio(rowKey));
        rastro.addParametro(PARAMETRO_ID_CLASE_RECURSO, this.getIdClaseRecurso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION_SELECCION, this.getIdFuncionSeleccion(rowKey));
        rastro.addParametro(PARAMETRO_ID_DOMINIO_SEGMENTO, this.getIdDominioSegmento(rowKey));
        rastro.addParametro(PARAMETRO_ID_PAQUETE, this.getIdPaquete(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarDominio(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_DOMINIO);
        rastro.addParametro(PARAMETRO_ID_DOMINIO, this.getIdDominio(rowKey));
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
        this.setVersionDominio(rowKey, 0L);
    }
}
