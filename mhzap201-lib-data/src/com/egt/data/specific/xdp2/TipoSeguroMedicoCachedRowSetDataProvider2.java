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
import com.egt.data.specific.xdp1.TipoSeguroMedicoCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class TipoSeguroMedicoCachedRowSetDataProvider2 extends TipoSeguroMedicoCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public TipoSeguroMedicoCachedRowSetDataProvider2() {
        super();
    }

    public TipoSeguroMedicoCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 323500101L;

    public static final long FUNCION_CONSULTAR_TIPO_SEGURO_MEDICO = 323500101L;
    public static final long FUNCION_CREAR_TIPO_SEGURO_MEDICO = 323500102L;
    public static final long FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO = 323500103L;
    public static final long FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO = 323500104L;

    protected static final long PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO = 20426L;
    protected static final long PARAMETRO_CODIGO_TIPO_SEGURO_MEDICO = 20321L;

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
        if (funcion == FUNCION_CONSULTAR_TIPO_SEGURO_MEDICO) {
            this.consultarTipoSeguroMedico(filtro);
            return;
        }
    }

    public void consultarTipoSeguroMedico() throws ExcepcionAplicacion {
        this.consultarTipoSeguroMedico(new FiltroBusqueda());
    }

    public void consultarTipoSeguroMedico(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarTipoSeguroMedico(new FiltroBusqueda());
        } else {
            this.consultarTipoSeguroMedico(new FiltroBusqueda(filtro));
        }
    }

    public void consultarTipoSeguroMedico(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_TIPO_SEGURO_MEDICO);
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
                comando += clausula + " numero_tipo_seguro_medico ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearTipoSeguroMedico() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_TIPO_SEGURO_MEDICO);
    }

    public void modificarTipoSeguroMedico(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO);
    }

    public void modificarTipoSeguroMedico(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO);
    }

    public void eliminarTipoSeguroMedico(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO);
    }

    public void eliminarTipoSeguroMedico(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_TIPO_SEGURO_MEDICO) {
            this.posCrearTipoSeguroMedico(rowKey);
            return;
        }
    }

    protected void posCrearTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO) {
            es = this.esFilaModificableConModificarTipoSeguroMedico(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarTipoSeguroMedico(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO) {
            this.posModificarTipoSeguroMedico(rowKey);
            return;
        }
    }

    protected void posModificarTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO) {
            es = this.esFilaEliminableConEliminarTipoSeguroMedico(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarTipoSeguroMedico(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO) {
            this.preEliminarTipoSeguroMedico(rowKey);
            return;
        }
    }

    protected void preEliminarTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO) {
            this.posEliminarTipoSeguroMedico(rowKey);
            return;
        }
    }

    protected void posEliminarTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_TIPO_SEGURO_MEDICO) {
            es = this.esFilaValidaParaCrearTipoSeguroMedico(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO) {
            es = this.esFilaValidaParaModificarTipoSeguroMedico(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearTipoSeguroMedico(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarTipoSeguroMedico(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_TIPO_SEGURO_MEDICO) {
            this.preCommitCrearTipoSeguroMedico(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO) {
            this.preCommitModificarTipoSeguroMedico(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO) {
            this.preCommitEliminarTipoSeguroMedico(rowKey);
            return;
        }
    }

    protected void preCommitCrearTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_TIPO_SEGURO_MEDICO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO, this.getNumeroTipoSeguroMedico(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_SEGURO_MEDICO, this.getCodigoTipoSeguroMedico(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_TIPO_SEGURO_MEDICO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO, this.getNumeroTipoSeguroMedico(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_TIPO_SEGURO_MEDICO, this.getCodigoTipoSeguroMedico(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarTipoSeguroMedico(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_TIPO_SEGURO_MEDICO);
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO, this.getNumeroTipoSeguroMedico(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
    }
}
