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
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.specific.xdp1.FuncionarioCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FuncionarioCachedRowSetDataProvider2 extends FuncionarioCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FuncionarioCachedRowSetDataProvider2() {
        super();
    }

    public FuncionarioCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 320300101L;

    public static final long FUNCION_CONSULTAR_FUNCIONARIO = 320300101L;
    public static final long FUNCION_CREAR_FUNCIONARIO = 320300102L;
    public static final long FUNCION_MODIFICAR_FUNCIONARIO = 320300103L;
    public static final long FUNCION_ELIMINAR_FUNCIONARIO = 320300104L;

    protected static final long PARAMETRO_ID_FUNCIONARIO = 20343L;
    protected static final long PARAMETRO_VERSION_FUNCIONARIO = 20444L;
    protected static final long PARAMETRO_CODIGO_FUNCIONARIO = 20300L;
    protected static final long PARAMETRO_NOMBRE_FUNCIONARIO = 20360L;
    protected static final long PARAMETRO_NUMERO_CEDULA = 20603L;
    protected static final long PARAMETRO_LETRA_CEDULA = 20602L;
    protected static final long PARAMETRO_PRIMER_NOMBRE = 20104L;
    protected static final long PARAMETRO_SEGUNDO_NOMBRE = 20107L;
    protected static final long PARAMETRO_PRIMER_APELLIDO = 20103L;
    protected static final long PARAMETRO_SEGUNDO_APELLIDO = 20106L;
    protected static final long PARAMETRO_APELLIDO_CASADA = 20006L;

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
        if (funcion == FUNCION_CONSULTAR_FUNCIONARIO) {
            this.consultarFuncionario(filtro);
            return;
        }
    }

    public void consultarFuncionario() throws ExcepcionAplicacion {
        this.consultarFuncionario(new FiltroBusqueda());
    }

    public void consultarFuncionario(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFuncionario(new FiltroBusqueda());
        } else {
            this.consultarFuncionario(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFuncionario(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FUNCIONARIO);
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
                comando += clausula + " id_funcionario ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFuncionario() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FUNCIONARIO);
    }

    public void modificarFuncionario(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FUNCIONARIO);
    }

    public void modificarFuncionario(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FUNCIONARIO);
    }

    public void eliminarFuncionario(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FUNCIONARIO);
    }

    public void eliminarFuncionario(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FUNCIONARIO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FUNCIONARIO) {
            this.posCrearFuncionario(rowKey);
            return;
        }
    }

    protected void posCrearFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FUNCIONARIO) {
            es = this.esFilaModificableConModificarFuncionario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFuncionario(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FUNCIONARIO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FUNCIONARIO) {
            this.posModificarFuncionario(rowKey);
            return;
        }
    }

    protected void posModificarFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FUNCIONARIO) {
            es = this.esFilaEliminableConEliminarFuncionario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFuncionario(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FUNCIONARIO) {
            this.preEliminarFuncionario(rowKey);
            return;
        }
    }

    protected void preEliminarFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FUNCIONARIO) {
            this.posEliminarFuncionario(rowKey);
            return;
        }
    }

    protected void posEliminarFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FUNCIONARIO) {
            es = this.esFilaValidaParaCrearFuncionario(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FUNCIONARIO) {
            es = this.esFilaValidaParaModificarFuncionario(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFuncionario(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarFuncionario(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_FUNCIONARIO) {
            this.preCommitCrearFuncionario(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FUNCIONARIO) {
            this.preCommitModificarFuncionario(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FUNCIONARIO) {
            this.preCommitEliminarFuncionario(rowKey);
            return;
        }
    }

    protected void preCommitCrearFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FUNCIONARIO);
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO, this.getIdFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FUNCIONARIO, this.getVersionFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FUNCIONARIO, this.getCodigoFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FUNCIONARIO, this.getNombreFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA, this.getNumeroCedula(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA, this.getLetraCedula(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_NOMBRE, this.getPrimerNombre(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_NOMBRE, this.getSegundoNombre(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_APELLIDO, this.getPrimerApellido(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_APELLIDO, this.getSegundoApellido(rowKey));
        rastro.addParametro(PARAMETRO_APELLIDO_CASADA, this.getApellidoCasada(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FUNCIONARIO);
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO, this.getIdFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FUNCIONARIO, this.getVersionFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FUNCIONARIO, this.getCodigoFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FUNCIONARIO, this.getNombreFuncionario(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA, this.getNumeroCedula(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA, this.getLetraCedula(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_NOMBRE, this.getPrimerNombre(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_NOMBRE, this.getSegundoNombre(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_APELLIDO, this.getPrimerApellido(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_APELLIDO, this.getSegundoApellido(rowKey));
        rastro.addParametro(PARAMETRO_APELLIDO_CASADA, this.getApellidoCasada(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFuncionario(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FUNCIONARIO);
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO, this.getIdFuncionario(rowKey));
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
        this.setVersionFuncionario(rowKey, 0L);
    }
}
