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
import com.egt.commons.util.TimeUtils;
import com.egt.core.control.RastroFuncion;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoConsultableDataProvider;
import com.egt.data.generic.xdp1.PersonaAnotadaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PersonaAnotadaCachedRowSetDataProvider2 extends PersonaAnotadaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PersonaAnotadaCachedRowSetDataProvider2() {
        super();
    }

    public PersonaAnotadaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 201300101L;

    public static final long FUNCION_BORRAR_PERSONA_ANOTADA = 201300151L;
    public static final long FUNCION_BORRAR_PERSONA_ANOTADA_OTRO = 201300152L;
    public static final long FUNCION_CONSULTAR_PERSONA_ANOTADA = 201300101L;
    public static final long FUNCION_CREAR_PERSONA_ANOTADA = 201300102L;
    public static final long FUNCION_MODIFICAR_PERSONA_ANOTADA = 201300103L;
    public static final long FUNCION_ELIMINAR_PERSONA_ANOTADA = 201300104L;

    public static final String PROCESO_FUNCION_BORRAR_PERSONA_ANOTADA = "persona_anotada_borrar";
    public static final String PROCESO_FUNCION_BORRAR_PERSONA_ANOTADA_OTRO = "persona_anotada_borrar_otro";

    protected static final long PARAMETRO_ID_USUARIO = 1379L;
    protected static final long PARAMETRO_ID_PERSONA_ANOTADA = 21018L;
    protected static final long PARAMETRO_VERSION_PERSONA_ANOTADA = 21019L;
    protected static final long PARAMETRO_ID_PERSONA = 20002L;
    protected static final long PARAMETRO_CODIGO_PERSONA = 20001L;
    protected static final long PARAMETRO_NOMBRE_PERSONA = 20003L;
    protected static final long PARAMETRO_CODIGO_USUARIO = 1207L;
    protected static final long PARAMETRO_NOMBRE_USUARIO = 1471L;
    protected static final long PARAMETRO_FECHA_HORA_SELECCION = 21007L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_USUARIO = 106100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_USUARIO = {"usuario", "id_usuario", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_PERSONA_ANOTADA) {
            this.consultarPersonaAnotada(filtro);
            return;
        }
    }

    public void consultarPersonaAnotada() throws ExcepcionAplicacion {
        this.consultarPersonaAnotada(new FiltroBusqueda());
    }

    public void consultarPersonaAnotada(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPersonaAnotada(new FiltroBusqueda());
        } else {
            this.consultarPersonaAnotada(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPersonaAnotada(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PERSONA_ANOTADA);
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
                comando += clausula + " id_persona_anotada ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPersonaAnotada() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PERSONA_ANOTADA);
    }

    public void modificarPersonaAnotada(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PERSONA_ANOTADA);
    }

    public void modificarPersonaAnotada(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PERSONA_ANOTADA);
    }

    public void eliminarPersonaAnotada(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PERSONA_ANOTADA);
    }

    public void eliminarPersonaAnotada(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PERSONA_ANOTADA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PERSONA_ANOTADA) {
            this.posCrearPersonaAnotada(rowKey);
            return;
        }
    }

    protected void posCrearPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
        this.setPropietarioRecurso(rowKey, TLC.getControlador().getUsuario().getIdUsuario());
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PERSONA_ANOTADA) {
            es = this.esFilaModificableConModificarPersonaAnotada(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPersonaAnotada(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PERSONA_ANOTADA);
            if (es) {
                es = this.esFilaRecursoPropio(rowKey, FUNCION_MODIFICAR_PERSONA_ANOTADA);
            }
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PERSONA_ANOTADA) {
            this.posModificarPersonaAnotada(rowKey);
            return;
        }
    }

    protected void posModificarPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PERSONA_ANOTADA) {
            es = this.esFilaEliminableConEliminarPersonaAnotada(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPersonaAnotada(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoPropio(rowKey, FUNCION_ELIMINAR_PERSONA_ANOTADA);
        }
        return es;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PERSONA_ANOTADA) {
            this.preEliminarPersonaAnotada(rowKey);
            return;
        }
    }

    protected void preEliminarPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PERSONA_ANOTADA) {
            this.posEliminarPersonaAnotada(rowKey);
            return;
        }
    }

    protected void posEliminarPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PERSONA_ANOTADA) {
            es = this.esFilaValidaParaCrearPersonaAnotada(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PERSONA_ANOTADA) {
            es = this.esFilaValidaParaModificarPersonaAnotada(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPersonaAnotada(RowKey rowKey) {
        return rowKey != null;
    }

    protected boolean esFilaValidaParaModificarPersonaAnotada(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preCommitRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_CREAR_PERSONA_ANOTADA) {
            this.preCommitCrearPersonaAnotada(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PERSONA_ANOTADA) {
            this.preCommitModificarPersonaAnotada(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PERSONA_ANOTADA) {
            this.preCommitEliminarPersonaAnotada(rowKey);
            return;
        }
    }

    protected void preCommitCrearPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PERSONA_ANOTADA);
        rastro.addParametro(PARAMETRO_ID_PERSONA_ANOTADA, this.getIdPersonaAnotada(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PERSONA_ANOTADA, this.getVersionPersonaAnotada(rowKey));
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PERSONA, this.getCodigoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PERSONA, this.getNombrePersona(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_USUARIO, this.getCodigoUsuario(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_USUARIO, this.getNombreUsuario(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_SELECCION, this.getFechaHoraSeleccion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PERSONA_ANOTADA);
        rastro.addParametro(PARAMETRO_ID_PERSONA_ANOTADA, this.getIdPersonaAnotada(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PERSONA_ANOTADA, this.getVersionPersonaAnotada(rowKey));
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PERSONA, this.getCodigoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PERSONA, this.getNombrePersona(rowKey));
        rastro.addParametro(PARAMETRO_ID_USUARIO, this.getIdUsuario(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_USUARIO, this.getCodigoUsuario(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_USUARIO, this.getNombreUsuario(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_SELECCION, this.getFechaHoraSeleccion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPersonaAnotada(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PERSONA_ANOTADA);
        rastro.addParametro(PARAMETRO_ID_PERSONA_ANOTADA, this.getIdPersonaAnotada(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setIdPropietarioRecurso(this.getPropietarioRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        Timestamp currentTimestamp = TimeUtils.currentTimestamp();
        this.setVersionPersonaAnotada(rowKey, 0L);
    }
}
