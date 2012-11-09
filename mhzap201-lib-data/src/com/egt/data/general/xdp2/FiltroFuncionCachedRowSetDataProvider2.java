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
import com.egt.data.general.xdp1.FiltroFuncionCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FiltroFuncionCachedRowSetDataProvider2 extends FiltroFuncionCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FiltroFuncionCachedRowSetDataProvider2() {
        super();
    }

    public FiltroFuncionCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 108100101L;

    public static final long FUNCION_CONSULTAR_FILTRO_FUNCION = 108100101L;
    public static final long FUNCION_CREAR_FILTRO_FUNCION = 108100102L;
    public static final long FUNCION_MODIFICAR_FILTRO_FUNCION = 108100103L;
    public static final long FUNCION_ELIMINAR_FILTRO_FUNCION = 108100104L;

    protected static final long PARAMETRO_ID_FILTRO_FUNCION = 1325L;
    protected static final long PARAMETRO_VERSION_FILTRO_FUNCION = 1558L;
    protected static final long PARAMETRO_CODIGO_FILTRO_FUNCION = 1082L;
    protected static final long PARAMETRO_NOMBRE_FILTRO_FUNCION = 1421L;
    protected static final long PARAMETRO_DESCRIPCION_FILTRO_FUNCION = 1224L;
    protected static final long PARAMETRO_ID_FUNCION = 1327L;
    protected static final long PARAMETRO_ID_USUARIO = 1379L;
    protected static final long PARAMETRO_ES_PUBLICO = 1275L;
    protected static final long PARAMETRO_ID_FILTRO_FUNCION_ORIGINAL = 1983L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCION = 103100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCION = {"funcion", "id_funcion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_FILTRO_FUNCION) {
            this.consultarFiltroFuncion(filtro);
            return;
        }
    }

    public void consultarFiltroFuncion() throws ExcepcionAplicacion {
        this.consultarFiltroFuncion(new FiltroBusqueda());
    }

    public void consultarFiltroFuncion(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFiltroFuncion(new FiltroBusqueda());
        } else {
            this.consultarFiltroFuncion(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFiltroFuncion(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FILTRO_FUNCION);
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
                comando += clausula + " id_filtro_funcion ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFiltroFuncion() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FILTRO_FUNCION);
    }

    public void modificarFiltroFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FILTRO_FUNCION);
    }

    public void modificarFiltroFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION);
    }

    public void eliminarFiltroFuncion(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FILTRO_FUNCION);
    }

    public void eliminarFiltroFuncion(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FILTRO_FUNCION);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FILTRO_FUNCION) {
            this.posCrearFiltroFuncion(rowKey);
            return;
        }
    }

    protected void posCrearFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        this.setPropietarioRecurso(rowKey, TLC.getControlador().getUsuario().getIdUsuario());
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION) {
            es = this.esFilaModificableConModificarFiltroFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFiltroFuncion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION);
            if (es) {
                es = this.esFilaRecursoPropio(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION);
            }
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION) {
            this.posModificarFiltroFuncion(rowKey);
            return;
        }
    }

    protected void posModificarFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION) {
            es = this.esFilaEliminableConEliminarFiltroFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFiltroFuncion(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoPropio(rowKey, FUNCION_ELIMINAR_FILTRO_FUNCION);
        }
        return es;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION) {
            this.preEliminarFiltroFuncion(rowKey);
            return;
        }
    }

    protected void preEliminarFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION) {
            this.posEliminarFiltroFuncion(rowKey);
            return;
        }
    }

    protected void posEliminarFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FILTRO_FUNCION) {
            es = this.esFilaValidaParaCrearFiltroFuncion(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION) {
            es = this.esFilaValidaParaModificarFiltroFuncion(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFiltroFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
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

    protected boolean esFilaValidaParaModificarFiltroFuncion(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCION)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncion(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCION, STRINGS_REFERENCIA_CONSULTAR_FUNCION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCION + ">");
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
        if (funcion == FUNCION_CREAR_FILTRO_FUNCION) {
            this.preCommitCrearFiltroFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FILTRO_FUNCION) {
            this.preCommitModificarFiltroFuncion(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FILTRO_FUNCION) {
            this.preCommitEliminarFiltroFuncion(rowKey);
            return;
        }
    }

    protected void preCommitCrearFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FILTRO_FUNCION);
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FILTRO_FUNCION, this.getVersionFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FILTRO_FUNCION, this.getCodigoFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FILTRO_FUNCION, this.getNombreFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_FILTRO_FUNCION, this.getDescripcionFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICO, this.getEsPublico(rowKey));
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION_ORIGINAL, this.getIdFiltroFuncionOriginal(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FILTRO_FUNCION);
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FILTRO_FUNCION, this.getVersionFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FILTRO_FUNCION, this.getCodigoFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FILTRO_FUNCION, this.getNombreFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_FILTRO_FUNCION, this.getDescripcionFiltroFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCION, this.getIdFuncion(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_ES_PUBLICO, this.getEsPublico(rowKey));
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION_ORIGINAL, this.getIdFiltroFuncionOriginal(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFiltroFuncion(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FILTRO_FUNCION);
        rastro.addParametro(PARAMETRO_ID_FILTRO_FUNCION, this.getIdFiltroFuncion(rowKey));
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
        rastro.setIdPropietarioRecurso(this.getPropietarioRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        this.setVersionFiltroFuncion(rowKey, 0L);
        this.setEsPublico(rowKey, 0);
    }
}
