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
import com.egt.data.specific.xdp1.PotencialBenCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PotencialBenCachedRowSetDataProvider2 extends PotencialBenCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PotencialBenCachedRowSetDataProvider2() {
        super();
    }

    public PotencialBenCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 320400101L;

    public static final long FUNCION_DESACTIVAR_POTENCIAL_BEN = 320400151L;
    public static final long FUNCION_REACTIVAR_POTENCIAL_BEN = 320400152L;
    public static final long FUNCION_VINCULAR_POTENCIAL_BEN = 320400153L;
    public static final long FUNCION_VALIDAR_CENSO_POTENCIAL_BEN = 320400154L;
    public static final long FUNCION_INVALIDAR_CENSO_POTENCIAL_BEN = 320400155L;
    public static final long FUNCION_REG_RECL_CEN_POTENCIAL_BEN = 320400156L;
    public static final long FUNCION_APROBAR_RECL_CEN_POTENCIAL_BEN = 320400157L;
    public static final long FUNCION_DENEGAR_RECL_CEN_POTENCIAL_BEN = 320400158L;
    public static final long FUNCION_ACREDITAR_POTENCIAL_BEN = 320400159L;
    public static final long FUNCION_REG_ULT_VIS_CEN_POTENCIAL_BEN = 320400160L;
    public static final long FUNCION_CONSULTAR_POTENCIAL_BEN = 320400101L;
    public static final long FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN = 320400161L;
    public static final long FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR = 320400162L;
    public static final long FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR = 320400163L;
    public static final long FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION = 320400164L;
    public static final long FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV = 320400165L;
    public static final long FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO = 320400166L;
    public static final long FUNCION_CREAR_POTENCIAL_BEN = 320400102L;
    public static final long FUNCION_MODIFICAR_POTENCIAL_BEN = 320400103L;
    public static final long FUNCION_ELIMINAR_POTENCIAL_BEN = 320400104L;

    public static final String PROCESO_FUNCION_DESACTIVAR_POTENCIAL_BEN = "potencial_ben_desactivar";
    public static final String PROCESO_FUNCION_REACTIVAR_POTENCIAL_BEN = "potencial_ben_reactivar";
    public static final String PROCESO_FUNCION_VINCULAR_POTENCIAL_BEN = "potencial_ben_vincular";
    public static final String PROCESO_FUNCION_VALIDAR_CENSO_POTENCIAL_BEN = "potencial_ben_validar_censo";
    public static final String PROCESO_FUNCION_INVALIDAR_CENSO_POTENCIAL_BEN = "potencial_ben_invalidar_censo";
    public static final String PROCESO_FUNCION_REG_RECL_CEN_POTENCIAL_BEN = "potencial_ben_reg_recl_cen";
    public static final String PROCESO_FUNCION_APROBAR_RECL_CEN_POTENCIAL_BEN = "potencial_ben_aprobar_recl_cen";
    public static final String PROCESO_FUNCION_DENEGAR_RECL_CEN_POTENCIAL_BEN = "potencial_ben_denegar_recl_cen";
    public static final String PROCESO_FUNCION_ACREDITAR_POTENCIAL_BEN = "potencial_ben_acreditar";
    public static final String PROCESO_FUNCION_REG_ULT_VIS_CEN_POTENCIAL_BEN = "potencial_ben_reg_ult_vis_cen";

    public static final String INFORME_FUNCION_EMITIR_CONSTANCIA_REGISTRO_POTENCIAL_BEN = "potencial_ben_constancia_registro";
    public static final String INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_CENSAR = "potencial_ben_por_censar";
    public static final String INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_VALIDAR = "potencial_ben_por_validar";
    public static final String INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_RESULTADO_VALIDACION = "potencial_ben_por_resultado_validacion";
    public static final String INFORME_FUNCION_EMITIR_POTENCIAL_BEN_POR_ICV = "potencial_ben_por_icv";
    public static final String INFORME_FUNCION_EMITIR_POTENCIAL_BEN_ACREDITADO = "potencial_ben_acreditado";

    protected static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;
    protected static final long PARAMETRO_ES_POTENCIAL_BEN_INACTIVO = 20601L;
    protected static final long PARAMETRO_ID_PERSONA = 20002L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_VALIDACION_CEN = 20640L;
    protected static final long PARAMETRO_COMENTARIOS_VALIDACION_CENSO = 20633L;
    protected static final long PARAMETRO_NUMERO_CONDICION_CENSO = 20643L;
    protected static final long PARAMETRO_FECHA_VALIDACION_CENSO = 20638L;
    protected static final long PARAMETRO_NUMERO_CAUSA_INV_CENSO = 20649L;
    protected static final long PARAMETRO_OTRA_CAUSA_INV_CENSO = 20650L;
    protected static final long PARAMETRO_COMENTARIOS_RECLAMO_CENSO = 20632L;
    protected static final long PARAMETRO_NUMERO_CONDICION_RECL_CEN = 20644L;
    protected static final long PARAMETRO_FECHA_RECLAMO_CENSO = 20637L;
    protected static final long PARAMETRO_COMENTARIOS_APR_RECL_CEN = 20630L;
    protected static final long PARAMETRO_FECHA_APROBACION_RECLAMO_CENSO = 20634L;
    protected static final long PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN = 20642L;
    protected static final long PARAMETRO_OTRA_CAUSA_DEN_RECL_CEN = 20646L;
    protected static final long PARAMETRO_COMENTARIOS_DEN_RECL_CEN = 20631L;
    protected static final long PARAMETRO_FECHA_DENEGACION_RECLAMO_CENSO = 20636L;
    protected static final long PARAMETRO_FECHA_ULTIMA_VISITA_CENSO = 20673L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_ULT_VISITA_CEN = 20674L;
    protected static final long PARAMETRO_OBSERVACIONES_ULT_VISITA_CEN = 20676L;
    protected static final long PARAMETRO_VERSION_POTENCIAL_BEN = 20575L;
    protected static final long PARAMETRO_CODIGO_POTENCIAL_BEN = 20577L;
    protected static final long PARAMETRO_NOMBRE_POTENCIAL_BEN = 20573L;
    protected static final long PARAMETRO_NUMERO_TIPO_REG_POT_BEN = 20623L;
    protected static final long PARAMETRO_NUMERO_CEDULA = 20603L;
    protected static final long PARAMETRO_LETRA_CEDULA = 20602L;
    protected static final long PARAMETRO_FECHA_EXPEDICION_CEDULA = 20558L;
    protected static final long PARAMETRO_FECHA_VENCIMIENTO_CEDULA = 20559L;
    protected static final long PARAMETRO_PRIMER_NOMBRE = 20104L;
    protected static final long PARAMETRO_SEGUNDO_NOMBRE = 20107L;
    protected static final long PARAMETRO_PRIMER_APELLIDO = 20103L;
    protected static final long PARAMETRO_SEGUNDO_APELLIDO = 20106L;
    protected static final long PARAMETRO_APELLIDO_CASADA = 20006L;
    protected static final long PARAMETRO_APODO = 20576L;
    protected static final long PARAMETRO_FECHA_NACIMIENTO = 20067L;
    protected static final long PARAMETRO_EDAD = 20578L;
    protected static final long PARAMETRO_ES_PARAGUAYO_NATURAL = 20620L;
    protected static final long PARAMETRO_ES_INDIGENA = 20619L;
    protected static final long PARAMETRO_ID_ETNIA_INDIGENA = 20159L;
    protected static final long PARAMETRO_NOMBRE_COMUNIDAD_INDIGENA = 20554L;
    protected static final long PARAMETRO_ID_DEPARTAMENTO = 20336L;
    protected static final long PARAMETRO_ID_DISTRITO = 20339L;
    protected static final long PARAMETRO_NUMERO_TIPO_AREA = 20412L;
    protected static final long PARAMETRO_ID_BARRIO = 20333L;
    protected static final long PARAMETRO_ID_MANZANA = 20344L;
    protected static final long PARAMETRO_MANZANA = 20664L;
    protected static final long PARAMETRO_COMPANIA = 20678L;
    protected static final long PARAMETRO_DIRECCION = 20326L;
    protected static final long PARAMETRO_NOMBRE_RESPONSABLE_HOGAR = 20586L;
    protected static final long PARAMETRO_NUMERO_TELEFONO_RESP_HOGAR = 20588L;
    protected static final long PARAMETRO_ES_PERSONA_CON_EMPLEO = 20118L;
    protected static final long PARAMETRO_ES_PERSONA_CON_JUBILACION = 20119L;
    protected static final long PARAMETRO_ES_PERSONA_CON_PENSION = 20557L;
    protected static final long PARAMETRO_ES_PERSONA_CON_SUBSIDIO = 20581L;
    protected static final long PARAMETRO_ES_PERSONA_CON_DEUDA = 20223L;
    protected static final long PARAMETRO_ES_PERSONA_CON_PENA_JUDICIAL = 20225L;
    protected static final long PARAMETRO_ES_PERSONA_CON_CER_VIDA = 20580L;
    protected static final long PARAMETRO_ES_PERSONA_CON_CARTA_RENUNCIA = 20579L;
    protected static final long PARAMETRO_NOMBRE_REFERENTE = 20585L;
    protected static final long PARAMETRO_NUMERO_TELEFONO_REFERENTE = 20587L;
    protected static final long PARAMETRO_ID_FICHA_PERSONA = 20342L;
    protected static final long PARAMETRO_FECHA_REGISTRO_POT_BEN = 20653L;
    protected static final long PARAMETRO_ID_FUNCIONARIO_REG_POT_BEN = 20682L;
    protected static final long PARAMETRO_REFERENCIA_DIRECCION = 20677L;
    protected static final long PARAMETRO_FECHA_REGISTRO_POT_BEN_DESDE = 10011L;
    protected static final long PARAMETRO_FECHA_REGISTRO_POT_BEN_HASTA = 10012L;
    protected static final long PARAMETRO_INDICE_CALIDAD_VIDA_DESDE = 10015L;
    protected static final long PARAMETRO_INDICE_CALIDAD_VIDA_HASTA = 10016L;
    protected static final long PARAMETRO_FECHA_VALIDACION_CENSO_DESDE = 10013L;
    protected static final long PARAMETRO_FECHA_VALIDACION_CENSO_HASTA = 10014L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_PERSONA = 201000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO = 320300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_CENSO = 324100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CAUSA_INV_CENSO = 311670101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_RECL_CEN = 324200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CAUSA_DEN_RECL_CEN = 311650101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_REG_POT_BEN = 323800101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_ETNIA_INDIGENA = 301100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_AREA = 322200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA = 320200101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_PERSONA = {"persona", "id_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO = {"funcionario", "id_funcionario", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_CENSO = {"condicion_censo", "numero_condicion_censo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CAUSA_INV_CENSO = {"causa_inv_censo", "numero_causa_inv_censo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_RECL_CEN = {"condicion_recl_cen", "numero_condicion_recl_cen", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CAUSA_DEN_RECL_CEN = {"causa_den_recl_cen", "numero_causa_den_recl_cen", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_REG_POT_BEN = {"tipo_reg_pot_ben", "numero_tipo_reg_pot_ben", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ETNIA_INDIGENA = {"etnia_indigena", "id_etnia_indigena", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_AREA = {"tipo_area", "numero_tipo_area", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA = {"ficha_persona", "id_ficha_persona", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_POTENCIAL_BEN) {
            this.consultarPotencialBen(filtro);
            return;
        }
    }

    public void consultarPotencialBen() throws ExcepcionAplicacion {
        this.consultarPotencialBen(new FiltroBusqueda());
    }

    public void consultarPotencialBen(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPotencialBen(new FiltroBusqueda());
        } else {
            this.consultarPotencialBen(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPotencialBen(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_POTENCIAL_BEN);
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
                comando += clausula + " id_potencial_ben ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPotencialBen() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_POTENCIAL_BEN);
    }

    public void modificarPotencialBen(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_POTENCIAL_BEN);
    }

    public void modificarPotencialBen(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_POTENCIAL_BEN);
    }

    public void eliminarPotencialBen(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_POTENCIAL_BEN);
    }

    public void eliminarPotencialBen(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_POTENCIAL_BEN);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_POTENCIAL_BEN) {
            this.posCrearPotencialBen(rowKey);
            return;
        }
    }

    protected void posCrearPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_POTENCIAL_BEN) {
            es = this.esFilaModificableConModificarPotencialBen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPotencialBen(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_POTENCIAL_BEN);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_POTENCIAL_BEN) {
            this.posModificarPotencialBen(rowKey);
            return;
        }
    }

    protected void posModificarPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_POTENCIAL_BEN) {
            es = this.esFilaEliminableConEliminarPotencialBen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPotencialBen(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_POTENCIAL_BEN) {
            this.preEliminarPotencialBen(rowKey);
            return;
        }
    }

    protected void preEliminarPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_POTENCIAL_BEN) {
            this.posEliminarPotencialBen(rowKey);
            return;
        }
    }

    protected void posEliminarPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_POTENCIAL_BEN) {
            es = this.esFilaValidaParaCrearPotencialBen(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_POTENCIAL_BEN) {
            es = this.esFilaValidaParaModificarPotencialBen(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPotencialBen(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PERSONA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPersona(rowKey), FUNCION_REFERENCIA_CONSULTAR_PERSONA, STRINGS_REFERENCIA_CONSULTAR_PERSONA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PERSONA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_ETNIA_INDIGENA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdEtniaIndigena(rowKey), FUNCION_REFERENCIA_CONSULTAR_ETNIA_INDIGENA, STRINGS_REFERENCIA_CONSULTAR_ETNIA_INDIGENA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_ETNIA_INDIGENA + ">");
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioValidacionCen(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FICHA_PERSONA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFichaPersona(rowKey), FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA, STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FICHA_PERSONA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_REG_POT_BEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioRegPotBen(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_REG_POT_BEN + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioUltVisitaCen(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN + ">");
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

    protected boolean esFilaValidaParaModificarPotencialBen(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_PERSONA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPersona(rowKey), FUNCION_REFERENCIA_CONSULTAR_PERSONA, STRINGS_REFERENCIA_CONSULTAR_PERSONA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_PERSONA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_ETNIA_INDIGENA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdEtniaIndigena(rowKey), FUNCION_REFERENCIA_CONSULTAR_ETNIA_INDIGENA, STRINGS_REFERENCIA_CONSULTAR_ETNIA_INDIGENA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_ETNIA_INDIGENA + ">");
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioValidacionCen(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FICHA_PERSONA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFichaPersona(rowKey), FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA, STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FICHA_PERSONA + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_REG_POT_BEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioRegPotBen(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_REG_POT_BEN + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFuncionarioUltVisitaCen(rowKey), FUNCION_REFERENCIA_CONSULTAR_FUNCIONARIO, STRINGS_REFERENCIA_CONSULTAR_FUNCIONARIO);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN + ">");
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
        if (funcion == FUNCION_CREAR_POTENCIAL_BEN) {
            this.preCommitCrearPotencialBen(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_POTENCIAL_BEN) {
            this.preCommitModificarPotencialBen(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_POTENCIAL_BEN) {
            this.preCommitEliminarPotencialBen(rowKey);
            return;
        }
    }

    protected void preCommitCrearPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_POTENCIAL_BEN);
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_POTENCIAL_BEN, this.getVersionPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_POTENCIAL_BEN, this.getCodigoPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_POTENCIAL_BEN, this.getNombrePotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_REG_POT_BEN, this.getNumeroTipoRegPotBen(rowKey));
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA, this.getNumeroCedula(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA, this.getLetraCedula(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_EXPEDICION_CEDULA, this.getFechaExpedicionCedula(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_VENCIMIENTO_CEDULA, this.getFechaVencimientoCedula(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_NOMBRE, this.getPrimerNombre(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_NOMBRE, this.getSegundoNombre(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_APELLIDO, this.getPrimerApellido(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_APELLIDO, this.getSegundoApellido(rowKey));
        rastro.addParametro(PARAMETRO_APELLIDO_CASADA, this.getApellidoCasada(rowKey));
        rastro.addParametro(PARAMETRO_APODO, this.getApodo(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_NACIMIENTO, this.getFechaNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_EDAD, this.getEdad(rowKey));
        rastro.addParametro(PARAMETRO_ES_PARAGUAYO_NATURAL, this.getEsParaguayoNatural(rowKey));
        rastro.addParametro(PARAMETRO_ES_INDIGENA, this.getEsIndigena(rowKey));
        rastro.addParametro(PARAMETRO_ID_ETNIA_INDIGENA, this.getIdEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_COMUNIDAD_INDIGENA, this.getNombreComunidadIndigena(rowKey));
        rastro.addParametro(PARAMETRO_ID_DEPARTAMENTO, this.getIdDepartamento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DISTRITO, this.getIdDistrito(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_ID_BARRIO, this.getIdBarrio(rowKey));
        rastro.addParametro(PARAMETRO_ID_MANZANA, this.getIdManzana(rowKey));
        rastro.addParametro(PARAMETRO_MANZANA, this.getManzana(rowKey));
        rastro.addParametro(PARAMETRO_COMPANIA, this.getCompania(rowKey));
        rastro.addParametro(PARAMETRO_DIRECCION, this.getDireccion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_RESPONSABLE_HOGAR, this.getNombreResponsableHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_RESP_HOGAR, this.getNumeroTelefonoRespHogar(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_EMPLEO, this.getEsPersonaConEmpleo(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_JUBILACION, this.getEsPersonaConJubilacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENSION, this.getEsPersonaConPension(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_SUBSIDIO, this.getEsPersonaConSubsidio(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_DEUDA, this.getEsPersonaConDeuda(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENA_JUDICIAL, this.getEsPersonaConPenaJudicial(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CER_VIDA, this.getEsPersonaConCerVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CARTA_RENUNCIA, this.getEsPersonaConCartaRenuncia(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_REFERENTE, this.getNombreReferente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_REFERENTE, this.getNumeroTelefonoReferente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_CENSO, this.getNumeroCondicionCenso(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_VALIDACION_CENSO, this.getFechaValidacionCenso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_VALIDACION_CEN, this.getIdFuncionarioValidacionCen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_INV_CENSO, this.getNumeroCausaInvCenso(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_INV_CENSO, this.getOtraCausaInvCenso(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_VALIDACION_CENSO, this.getComentariosValidacionCenso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECL_CEN, this.getNumeroCondicionReclCen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_RECLAMO_CENSO, this.getFechaReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_RECLAMO_CENSO, this.getComentariosReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_APROBACION_RECLAMO_CENSO, this.getFechaAprobacionReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_APR_RECL_CEN, this.getComentariosAprReclCen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DENEGACION_RECLAMO_CENSO, this.getFechaDenegacionReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN, this.getNumeroCausaDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_DEN_RECL_CEN, this.getOtraCausaDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DEN_RECL_CEN, this.getComentariosDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_REGISTRO_POT_BEN, this.getFechaRegistroPotBen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_REG_POT_BEN, this.getIdFuncionarioRegPotBen(rowKey));
        rastro.addParametro(PARAMETRO_ES_POTENCIAL_BEN_INACTIVO, this.getEsPotencialBenInactivo(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_ULTIMA_VISITA_CENSO, this.getFechaUltimaVisitaCenso(rowKey));
        rastro.addParametro(PARAMETRO_OBSERVACIONES_ULT_VISITA_CEN, this.getObservacionesUltVisitaCen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_ULT_VISITA_CEN, this.getIdFuncionarioUltVisitaCen(rowKey));
        rastro.addParametro(PARAMETRO_REFERENCIA_DIRECCION, this.getReferenciaDireccion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_POTENCIAL_BEN);
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_POTENCIAL_BEN, this.getVersionPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_POTENCIAL_BEN, this.getCodigoPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_POTENCIAL_BEN, this.getNombrePotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_REG_POT_BEN, this.getNumeroTipoRegPotBen(rowKey));
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA, this.getNumeroCedula(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA, this.getLetraCedula(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_EXPEDICION_CEDULA, this.getFechaExpedicionCedula(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_VENCIMIENTO_CEDULA, this.getFechaVencimientoCedula(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_NOMBRE, this.getPrimerNombre(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_NOMBRE, this.getSegundoNombre(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_APELLIDO, this.getPrimerApellido(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_APELLIDO, this.getSegundoApellido(rowKey));
        rastro.addParametro(PARAMETRO_APELLIDO_CASADA, this.getApellidoCasada(rowKey));
        rastro.addParametro(PARAMETRO_APODO, this.getApodo(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_NACIMIENTO, this.getFechaNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_EDAD, this.getEdad(rowKey));
        rastro.addParametro(PARAMETRO_ES_PARAGUAYO_NATURAL, this.getEsParaguayoNatural(rowKey));
        rastro.addParametro(PARAMETRO_ES_INDIGENA, this.getEsIndigena(rowKey));
        rastro.addParametro(PARAMETRO_ID_ETNIA_INDIGENA, this.getIdEtniaIndigena(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_COMUNIDAD_INDIGENA, this.getNombreComunidadIndigena(rowKey));
        rastro.addParametro(PARAMETRO_ID_DEPARTAMENTO, this.getIdDepartamento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DISTRITO, this.getIdDistrito(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA, this.getNumeroTipoArea(rowKey));
        rastro.addParametro(PARAMETRO_ID_BARRIO, this.getIdBarrio(rowKey));
        rastro.addParametro(PARAMETRO_ID_MANZANA, this.getIdManzana(rowKey));
        rastro.addParametro(PARAMETRO_MANZANA, this.getManzana(rowKey));
        rastro.addParametro(PARAMETRO_COMPANIA, this.getCompania(rowKey));
        rastro.addParametro(PARAMETRO_DIRECCION, this.getDireccion(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_RESPONSABLE_HOGAR, this.getNombreResponsableHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_RESP_HOGAR, this.getNumeroTelefonoRespHogar(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_EMPLEO, this.getEsPersonaConEmpleo(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_JUBILACION, this.getEsPersonaConJubilacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENSION, this.getEsPersonaConPension(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_SUBSIDIO, this.getEsPersonaConSubsidio(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_DEUDA, this.getEsPersonaConDeuda(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENA_JUDICIAL, this.getEsPersonaConPenaJudicial(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CER_VIDA, this.getEsPersonaConCerVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CARTA_RENUNCIA, this.getEsPersonaConCartaRenuncia(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_REFERENTE, this.getNombreReferente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_REFERENTE, this.getNumeroTelefonoReferente(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_CENSO, this.getNumeroCondicionCenso(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_VALIDACION_CENSO, this.getFechaValidacionCenso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_VALIDACION_CEN, this.getIdFuncionarioValidacionCen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_INV_CENSO, this.getNumeroCausaInvCenso(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_INV_CENSO, this.getOtraCausaInvCenso(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_VALIDACION_CENSO, this.getComentariosValidacionCenso(rowKey));
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECL_CEN, this.getNumeroCondicionReclCen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_RECLAMO_CENSO, this.getFechaReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_RECLAMO_CENSO, this.getComentariosReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_APROBACION_RECLAMO_CENSO, this.getFechaAprobacionReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_APR_RECL_CEN, this.getComentariosAprReclCen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DENEGACION_RECLAMO_CENSO, this.getFechaDenegacionReclamoCenso(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECL_CEN, this.getNumeroCausaDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_DEN_RECL_CEN, this.getOtraCausaDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DEN_RECL_CEN, this.getComentariosDenReclCen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_REGISTRO_POT_BEN, this.getFechaRegistroPotBen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_REG_POT_BEN, this.getIdFuncionarioRegPotBen(rowKey));
        rastro.addParametro(PARAMETRO_ES_POTENCIAL_BEN_INACTIVO, this.getEsPotencialBenInactivo(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_ULTIMA_VISITA_CENSO, this.getFechaUltimaVisitaCenso(rowKey));
        rastro.addParametro(PARAMETRO_OBSERVACIONES_ULT_VISITA_CEN, this.getObservacionesUltVisitaCen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FUNCIONARIO_ULT_VISITA_CEN, this.getIdFuncionarioUltVisitaCen(rowKey));
        rastro.addParametro(PARAMETRO_REFERENCIA_DIRECCION, this.getReferenciaDireccion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPotencialBen(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_POTENCIAL_BEN);
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
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
        Timestamp currentDate = TimeUtils.currentDate();
        this.setVersionPotencialBen(rowKey, 0L);
        this.setEsParaguayoNatural(rowKey, 1);
        this.setEsIndigena(rowKey, 0);
        this.setEsPersonaConEmpleo(rowKey, 0);
        this.setEsPersonaConJubilacion(rowKey, 0);
        this.setEsPersonaConPension(rowKey, 0);
        this.setEsPersonaConSubsidio(rowKey, 0);
        this.setEsPersonaConDeuda(rowKey, 0);
        this.setEsPersonaConPenaJudicial(rowKey, 0);
        this.setEsPersonaConCerVida(rowKey, 0);
        this.setEsPersonaConCartaRenuncia(rowKey, 0);
        this.setFechaRegistroPotBen(rowKey, currentDate);
//      this.setIdFuncionarioRegPotBen(rowKey, TLC.getControlador().getUsuario().getIdUsuario());
        this.setEsPotencialBenInactivo(rowKey, 0);
    }
}
