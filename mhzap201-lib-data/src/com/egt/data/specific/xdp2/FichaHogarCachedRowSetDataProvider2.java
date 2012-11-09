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
import com.egt.data.specific.xdp1.FichaHogarCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FichaHogarCachedRowSetDataProvider2 extends FichaHogarCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FichaHogarCachedRowSetDataProvider2() {
        super();
    }

    public FichaHogarCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 320100101L;

    public static final long FUNCION_DESACTIVAR_FICHA_HOGAR = 320100151L;
    public static final long FUNCION_REACTIVAR_FICHA_HOGAR = 320100152L;
    public static final long FUNCION_CALCULAR_ICV_FICHA_HOGAR = 320100153L;
    public static final long FUNCION_CONSULTAR_FICHA_HOGAR = 320100101L;
    public static final long FUNCION_CREAR_FICHA_HOGAR = 320100102L;
    public static final long FUNCION_MODIFICAR_FICHA_HOGAR = 320100103L;
    public static final long FUNCION_ELIMINAR_FICHA_HOGAR = 320100104L;

    public static final String PROCESO_FUNCION_DESACTIVAR_FICHA_HOGAR = "ficha_hogar_desactivar";
    public static final String PROCESO_FUNCION_REACTIVAR_FICHA_HOGAR = "ficha_hogar_reactivar";
    public static final String PROCESO_FUNCION_CALCULAR_ICV_FICHA_HOGAR = "ficha_hogar_calcular_icv";

    protected static final long PARAMETRO_ID_FICHA_HOGAR = 20341L;
    protected static final long PARAMETRO_ES_FICHA_HOGAR_INACTIVA = 20599L;
    protected static final long PARAMETRO_INDICE_CALIDAD_VIDA = 20219L;
    protected static final long PARAMETRO_VERSION_FICHA_HOGAR = 20442L;
    protected static final long PARAMETRO_CODIGO_FICHA_HOGAR = 20450L;
    protected static final long PARAMETRO_FECHA_ENTREVISTA = 20330L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_CENSISTA = 20589L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_SUPERVISOR = 20592L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_CRITICO_DECO = 20590L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_DIGITADOR = 20591L;
    protected static final long PARAMETRO_OBSERVACIONES = 20433L;
    protected static final long PARAMETRO_HUSO_UTM = 20332L;
    protected static final long PARAMETRO_FRANJA_UTM = 20331L;
    protected static final long PARAMETRO_DISTANCIA_ESTE_UTM = 20327L;
    protected static final long PARAMETRO_DISTANCIA_NORTE_UTM = 20328L;
    protected static final long PARAMETRO_NUMERO_FORMULARIO = 20369L;
    protected static final long PARAMETRO_NUMERO_VIVIENDA = 20432L;
    protected static final long PARAMETRO_NUMERO_HOGAR = 20370L;
    protected static final long PARAMETRO_ID_DEPARTAMENTO = 20336L;
    protected static final long PARAMETRO_ID_DISTRITO = 20339L;
    protected static final long PARAMETRO_NUMERO_TIPO_AREA = 20412L;
    protected static final long PARAMETRO_ID_BARRIO = 20333L;
    protected static final long PARAMETRO_ID_MANZANA = 20344L;
    protected static final long PARAMETRO_MANZANA = 20664L;
    protected static final long PARAMETRO_DIRECCION = 20326L;
    protected static final long PARAMETRO_TOTAL_PERSONAS = 20441L;
    protected static final long PARAMETRO_TOTAL_HOMBRES = 20438L;
    protected static final long PARAMETRO_TOTAL_MUJERES = 20440L;
    protected static final long PARAMETRO_NUMERO_TIPO_MAT_PAREDES = 20420L;
    protected static final long PARAMETRO_NUMERO_TIPO_MAT_PISO = 20421L;
    protected static final long PARAMETRO_NUMERO_TIPO_MAT_TECHO = 20422L;
    protected static final long PARAMETRO_NUMERO_TIPO_OCUPACION_VIV = 20423L;
    protected static final long PARAMETRO_OTRO_TIPO_OCUPACION_VIV = 20437L;
    protected static final long PARAMETRO_CANTIDAD_PIEZAS = 20295L;
    protected static final long PARAMETRO_CANTIDAD_DORMITORIOS = 20294L;
    protected static final long PARAMETRO_NUMERO_SIONO_PIEZA_COCINA = 20404L;
    protected static final long PARAMETRO_NUMERO_TIPO_COMBUSTIBLE = 20414L;
    protected static final long PARAMETRO_NUMERO_TIPO_PIEZA_BANO = 20403L;
    protected static final long PARAMETRO_NUMERO_TIPO_SERVICIO_SAN = 20428L;
    protected static final long PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA = 20427L;
    protected static final long PARAMETRO_NUMERO_TIPO_ABA_AGUA = 20411L;
    protected static final long PARAMETRO_NUMERO_SIONO_CORRIENTE_ELEC = 20386L;
    protected static final long PARAMETRO_NUMERO_TIPO_DESECHO_BAS = 20415L;
    protected static final long PARAMETRO_NUMERO_SIONO_TELEFONO_CELULAR = 20405L;
    protected static final long PARAMETRO_NUMERO_TELEFONO_CELULAR = 20409L;
    protected static final long PARAMETRO_NUMERO_SIONO_TLF_LINEA_BAJA = 20406L;
    protected static final long PARAMETRO_NUMERO_TELEFONO_LINEA_BAJA = 20410L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_HELADERA = 20397L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_LAVARROPAS = 20398L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_TERMO = 20400L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_AIRE_ACON = 20394L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_AUTOMOVIL = 20395L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_CAMION = 20396L;
    protected static final long PARAMETRO_NUMERO_SIONO_DISP_MOTOCICLETA = 20399L;
    protected static final long PARAMETRO_NOMBRE_JEFE_HOGAR = 20361L;
    protected static final long PARAMETRO_NUMERO_CEDULA_JEFE_HOGAR = 20365L;
    protected static final long PARAMETRO_LETRA_CEDULA_JEFE_HOGAR = 20347L;
    protected static final long PARAMETRO_NUMERO_ORDEN_IDEN_JEFE_HOGAR = 20449L;
    protected static final long PARAMETRO_NOMBRE_RESPONDENTE = 20447L;
    protected static final long PARAMETRO_NUMERO_CEDULA_RESPONDENTE = 20448L;
    protected static final long PARAMETRO_LETRA_CEDULA_RESPONDENTE = 20446L;
    protected static final long PARAMETRO_NUMERO_ORDEN_IDEN_RESPONDENTE = 20380L;
    protected static final long PARAMETRO_ID_PROVEEDOR_DAT_EXT = 20269L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO = 320300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_AREA = 322200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_MAT_PAREDES = 322900101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_MAT_PISO = 323000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_MAT_TECHO = 323100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_OCUPACION_VIV = 323200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_SIONO = 322000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_COMBUSTIBLE = 322300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_PIEZA_BANO = 324400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_SERVICIO_SAN = 323700101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_SERVICIO_AGUA = 323600101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_ABA_AGUA = 322100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_DESECHO_BAS = 322400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT = 312100101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO = {"funcionario", "id_funcionario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_AREA = {"tipo_area", "numero_tipo_area", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_MAT_PAREDES = {"tipo_mat_paredes", "numero_tipo_mat_paredes", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_MAT_PISO = {"tipo_mat_piso", "numero_tipo_mat_piso", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_MAT_TECHO = {"tipo_mat_techo", "numero_tipo_mat_techo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_OCUPACION_VIV = {"tipo_ocupacion_viv", "numero_tipo_ocupacion_viv", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_SIONO = {"siono", "numero_siono", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_COMBUSTIBLE = {"tipo_combustible", "numero_tipo_combustible", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_PIEZA_BANO = {"tipo_pieza_bano", "numero_tipo_pieza_bano", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_SERVICIO_SAN = {"tipo_servicio_san", "numero_tipo_servicio_san", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_SERVICIO_AGUA = {"tipo_servicio_agua", "numero_tipo_servicio_agua", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_ABA_AGUA = {"tipo_aba_agua", "numero_tipo_aba_agua", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_DESECHO_BAS = {"tipo_desecho_bas", "numero_tipo_desecho_bas", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT = {"proveedor_dat_ext", "id_proveedor_dat_ext", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_FICHA_HOGAR) {
            this.consultarFichaHogar(filtro);
            return;
        }
    }

    public void consultarFichaHogar() throws ExcepcionAplicacion {
        this.consultarFichaHogar(new FiltroBusqueda());
    }

    public void consultarFichaHogar(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFichaHogar(new FiltroBusqueda());
        } else {
            this.consultarFichaHogar(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFichaHogar(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FICHA_HOGAR);
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
                comando += clausula + " id_ficha_hogar ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFichaHogar() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FICHA_HOGAR);
    }

    public void modificarFichaHogar(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FICHA_HOGAR);
    }

    public void modificarFichaHogar(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FICHA_HOGAR);
    }

    public void eliminarFichaHogar(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FICHA_HOGAR);
    }

    public void eliminarFichaHogar(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FICHA_HOGAR);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FICHA_HOGAR) {
            this.posCrearFichaHogar(rowKey);
            return;
        }
    }

    protected void posCrearFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FICHA_HOGAR) {
            es = this.esFilaModificableConModificarFichaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFichaHogar(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FICHA_HOGAR);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FICHA_HOGAR) {
            this.posModificarFichaHogar(rowKey);
            return;
        }
    }

    protected void posModificarFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FICHA_HOGAR) {
            es = this.esFilaEliminableConEliminarFichaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFichaHogar(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FICHA_HOGAR) {
            this.preEliminarFichaHogar(rowKey);
            return;
        }
    }

    protected void preEliminarFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FICHA_HOGAR) {
            this.posEliminarFichaHogar(rowKey);
            return;
        }
    }

    protected void posEliminarFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FICHA_HOGAR) {
            es = this.esFilaValidaParaCrearFichaHogar(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FICHA_HOGAR) {
            es = this.esFilaValidaParaModificarFichaHogar(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFichaHogar(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_CENSISTA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioCensista(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_CENSISTA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_SUPERVISOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioSupervisor(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_SUPERVISOR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioCriticoDeco(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_CRITICO_DECO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_DIGITADOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioDigitador(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_DIGITADOR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DEPARTAMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDepartamento(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DEPARTAMENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DISTRITO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDistrito(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DISTRITO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_BARRIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdBarrio(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_BARRIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_MANZANA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdManzana(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_MANZANA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PROVEEDOR_DAT_EXT)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdProveedorDatExt(rowKey), FUNCION_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT, STRINGS_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PROVEEDOR_DAT_EXT + ">");
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

    protected boolean esFilaValidaParaModificarFichaHogar(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_CENSISTA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioCensista(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_CENSISTA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_SUPERVISOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioSupervisor(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_SUPERVISOR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioCriticoDeco(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_CRITICO_DECO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_DIGITADOR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioDigitador(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_DIGITADOR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DEPARTAMENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDepartamento(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DEPARTAMENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DISTRITO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDistrito(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DISTRITO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_BARRIO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdBarrio(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_BARRIO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_MANZANA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdManzana(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_MANZANA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PROVEEDOR_DAT_EXT)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdProveedorDatExt(rowKey), FUNCION_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT, STRINGS_REFERENCIA_CONSULTAR_PROVEEDOR_DAT_EXT);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PROVEEDOR_DAT_EXT + ">");
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
        if (funcion == FUNCION_CREAR_FICHA_HOGAR) {
            this.preCommitCrearFichaHogar(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FICHA_HOGAR) {
            this.preCommitModificarFichaHogar(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FICHA_HOGAR) {
            this.preCommitEliminarFichaHogar(rowKey);
            return;
        }
    }

    protected void preCommitCrearFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FICHA_HOGAR);
        rastro.addParametro(PARAMETRO_ID_FICHA_HOGAR, this.getIdFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FICHA_HOGAR, this.getVersionFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FICHA_HOGAR, this.getCodigoFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_ENTREVISTA, this.getFechaEntrevista(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_CENSISTA, this.getIdFuncionarioCensista(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_SUPERVISOR, this.getIdFuncionarioSupervisor(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_CRITICO_DECO, this.getIdFuncionarioCriticoDeco(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_DIGITADOR, this.getIdFuncionarioDigitador(rowKey));
        rastro.addParametro(PARAMETRO_OBSERVACIONES, this.getObservaciones(rowKey));
        rastro.addParametro(PARAMETRO_HUSO_UTM, this.getHusoUtm(rowKey));
        rastro.addParametro(PARAMETRO_FRANJA_UTM, this.getFranjaUtm(rowKey));
        rastro.addParametro(PARAMETRO_DISTANCIA_ESTE_UTM, this.getDistanciaEsteUtm(rowKey));
        rastro.addParametro(PARAMETRO_DISTANCIA_NORTE_UTM, this.getDistanciaNorteUtm(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_FORMULARIO, this.getNumeroFormulario(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_VIVIENDA, this.getNumeroVivienda(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_HOGAR, this.getNumeroHogar(rowKey));
        rastro.addParametro(PARAMETRO_ID_DEPARTAMENTO, this.getIdDepartamento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DISTRITO, this.getIdDistrito(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_ID_BARRIO, this.getIdBarrio(rowKey));
        rastro.addParametro(PARAMETRO_ID_MANZANA, this.getIdManzana(rowKey));
        rastro.addParametro(PARAMETRO_MANZANA, this.getManzana(rowKey));
        rastro.addParametro(PARAMETRO_DIRECCION, this.getDireccion(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_PERSONAS, this.getTotalPersonas(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_HOMBRES, this.getTotalHombres(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_MUJERES, this.getTotalMujeres(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PAREDES, this.getNumeroTipoMatParedes(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PISO, this.getNumeroTipoMatPiso(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_TECHO, this.getNumeroTipoMatTecho(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_OCUPACION_VIV, this.getNumeroTipoOcupacionViv(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_TIPO_OCUPACION_VIV, this.getOtroTipoOcupacionViv(rowKey));
        rastro.addParametro(PARAMETRO_CANTIDAD_PIEZAS, this.getCantidadPiezas(rowKey));
        rastro.addParametro(PARAMETRO_CANTIDAD_DORMITORIOS, this.getCantidadDormitorios(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_PIEZA_COCINA, this.getNumeroSionoPiezaCocina(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMBUSTIBLE, this.getNumeroTipoCombustible(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PIEZA_BANO, this.getNumeroTipoPiezaBano(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_SAN, this.getNumeroTipoServicioSan(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA, this.getNumeroTipoServicioAgua(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ABA_AGUA, this.getNumeroTipoAbaAgua(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_CORRIENTE_ELEC, this.getNumeroSionoCorrienteElec(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DESECHO_BAS, this.getNumeroTipoDesechoBas(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_TELEFONO_CELULAR, this.getNumeroSionoTelefonoCelular(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_CELULAR, this.getNumeroTelefonoCelular(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_TLF_LINEA_BAJA, this.getNumeroSionoTlfLineaBaja(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_LINEA_BAJA, this.getNumeroTelefonoLineaBaja(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_HELADERA, this.getNumeroSionoDispHeladera(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_LAVARROPAS, this.getNumeroSionoDispLavarropas(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_TERMO, this.getNumeroSionoDispTermo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_AIRE_ACON, this.getNumeroSionoDispAireAcon(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_AUTOMOVIL, this.getNumeroSionoDispAutomovil(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_CAMION, this.getNumeroSionoDispCamion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_MOTOCICLETA, this.getNumeroSionoDispMotocicleta(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_JEFE_HOGAR, this.getNombreJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA_JEFE_HOGAR, this.getNumeroCedulaJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA_JEFE_HOGAR, this.getLetraCedulaJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_JEFE_HOGAR, this.getNumeroOrdenIdenJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_RESPONDENTE, this.getNombreRespondente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA_RESPONDENTE, this.getNumeroCedulaRespondente(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA_RESPONDENTE, this.getLetraCedulaRespondente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_RESPONDENTE, this.getNumeroOrdenIdenRespondente(rowKey));
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_INDICE_CALIDAD_VIDA, this.getIndiceCalidadVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_FICHA_HOGAR_INACTIVA, this.getEsFichaHogarInactiva(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FICHA_HOGAR);
        rastro.addParametro(PARAMETRO_ID_FICHA_HOGAR, this.getIdFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FICHA_HOGAR, this.getVersionFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FICHA_HOGAR, this.getCodigoFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_ENTREVISTA, this.getFechaEntrevista(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_CENSISTA, this.getIdFuncionarioCensista(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_SUPERVISOR, this.getIdFuncionarioSupervisor(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_CRITICO_DECO, this.getIdFuncionarioCriticoDeco(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_DIGITADOR, this.getIdFuncionarioDigitador(rowKey));
        rastro.addParametro(PARAMETRO_OBSERVACIONES, this.getObservaciones(rowKey));
        rastro.addParametro(PARAMETRO_HUSO_UTM, this.getHusoUtm(rowKey));
        rastro.addParametro(PARAMETRO_FRANJA_UTM, this.getFranjaUtm(rowKey));
        rastro.addParametro(PARAMETRO_DISTANCIA_ESTE_UTM, this.getDistanciaEsteUtm(rowKey));
        rastro.addParametro(PARAMETRO_DISTANCIA_NORTE_UTM, this.getDistanciaNorteUtm(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_FORMULARIO, this.getNumeroFormulario(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_VIVIENDA, this.getNumeroVivienda(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_HOGAR, this.getNumeroHogar(rowKey));
        rastro.addParametro(PARAMETRO_ID_DEPARTAMENTO, this.getIdDepartamento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DISTRITO, this.getIdDistrito(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_ID_BARRIO, this.getIdBarrio(rowKey));
        rastro.addParametro(PARAMETRO_ID_MANZANA, this.getIdManzana(rowKey));
        rastro.addParametro(PARAMETRO_MANZANA, this.getManzana(rowKey));
        rastro.addParametro(PARAMETRO_DIRECCION, this.getDireccion(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_PERSONAS, this.getTotalPersonas(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_HOMBRES, this.getTotalHombres(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_MUJERES, this.getTotalMujeres(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PAREDES, this.getNumeroTipoMatParedes(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_PISO, this.getNumeroTipoMatPiso(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_MAT_TECHO, this.getNumeroTipoMatTecho(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_OCUPACION_VIV, this.getNumeroTipoOcupacionViv(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_TIPO_OCUPACION_VIV, this.getOtroTipoOcupacionViv(rowKey));
        rastro.addParametro(PARAMETRO_CANTIDAD_PIEZAS, this.getCantidadPiezas(rowKey));
        rastro.addParametro(PARAMETRO_CANTIDAD_DORMITORIOS, this.getCantidadDormitorios(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_PIEZA_COCINA, this.getNumeroSionoPiezaCocina(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_COMBUSTIBLE, this.getNumeroTipoCombustible(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PIEZA_BANO, this.getNumeroTipoPiezaBano(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_SAN, this.getNumeroTipoServicioSan(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SERVICIO_AGUA, this.getNumeroTipoServicioAgua(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ABA_AGUA, this.getNumeroTipoAbaAgua(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_CORRIENTE_ELEC, this.getNumeroSionoCorrienteElec(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_DESECHO_BAS, this.getNumeroTipoDesechoBas(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_TELEFONO_CELULAR, this.getNumeroSionoTelefonoCelular(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_CELULAR, this.getNumeroTelefonoCelular(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_TLF_LINEA_BAJA, this.getNumeroSionoTlfLineaBaja(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_LINEA_BAJA, this.getNumeroTelefonoLineaBaja(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_HELADERA, this.getNumeroSionoDispHeladera(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_LAVARROPAS, this.getNumeroSionoDispLavarropas(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_TERMO, this.getNumeroSionoDispTermo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_AIRE_ACON, this.getNumeroSionoDispAireAcon(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_AUTOMOVIL, this.getNumeroSionoDispAutomovil(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_CAMION, this.getNumeroSionoDispCamion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DISP_MOTOCICLETA, this.getNumeroSionoDispMotocicleta(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_JEFE_HOGAR, this.getNombreJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA_JEFE_HOGAR, this.getNumeroCedulaJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA_JEFE_HOGAR, this.getLetraCedulaJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_JEFE_HOGAR, this.getNumeroOrdenIdenJefeHogar(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_RESPONDENTE, this.getNombreRespondente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA_RESPONDENTE, this.getNumeroCedulaRespondente(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA_RESPONDENTE, this.getLetraCedulaRespondente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_RESPONDENTE, this.getNumeroOrdenIdenRespondente(rowKey));
        rastro.addParametro(PARAMETRO_ID_PROVEEDOR_DAT_EXT, this.getIdProveedorDatExt(rowKey));
        rastro.addParametro(PARAMETRO_INDICE_CALIDAD_VIDA, this.getIndiceCalidadVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_FICHA_HOGAR_INACTIVA, this.getEsFichaHogarInactiva(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFichaHogar(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FICHA_HOGAR);
        rastro.addParametro(PARAMETRO_ID_FICHA_HOGAR, this.getIdFichaHogar(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(RowKey rowKey, long funcion) {
        RastroFuncion rastro = new RastroFuncion();
        rastro.setIdUsuario(TLC.getControlador().getUsuario().getIdUsuario());
        rastro.setIdFuncion(funcion);
        rastro.setIdRecurso(this.getIdentificacionRecurso(rowKey));
        rastro.setVersionRecurso(this.getVersionRecurso(rowKey));
        rastro.setCodigoRecurso(this.getCodigoRecurso(rowKey));
        return rastro;
    }

    protected void initRow(RowKey rowKey) {
        Timestamp currentDate = TimeUtils.currentDate();
        this.setVersionFichaHogar(rowKey, 0L);
        this.setEsFichaHogarInactiva(rowKey, 0);
    }
}
