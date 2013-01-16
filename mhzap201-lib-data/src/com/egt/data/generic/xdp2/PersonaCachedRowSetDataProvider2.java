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
import com.egt.data.generic.xdp1.PersonaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class PersonaCachedRowSetDataProvider2 extends PersonaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public PersonaCachedRowSetDataProvider2() {
        super();
    }

    public PersonaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 201000101L;

    public static final long FUNCION_REGISTRAR_CER_VIDA_PERSONA = 201000151L;
    public static final long FUNCION_ANULAR_CER_VIDA_PERSONA = 201000152L;
    public static final long FUNCION_REGISTRAR_CER_DEFUN_PERSONA = 201000153L;
    public static final long FUNCION_ANULAR_CER_DEFUN_PERSONA = 201000154L;
    public static final long FUNCION_APROBAR_PENSION_PERSONA = 201000155L;
    public static final long FUNCION_OBJETAR_PENSION_PERSONA = 201000156L;
    public static final long FUNCION_REVOCAR_PENSION_PERSONA = 201000157L;
    public static final long FUNCION_OTORGAR_PENSION_PERSONA = 201000158L;
    public static final long FUNCION_DENEGAR_PENSION_PERSONA = 201000159L;
    public static final long FUNCION_REGISTRAR_ENTREGA_DOC_PERSONA = 201000160L;
    public static final long FUNCION_SOLICITAR_RECO_PEN_PERSONA = 201000161L;
    public static final long FUNCION_APROBAR_RECO_PEN_PERSONA = 201000162L;
    public static final long FUNCION_DENEGAR_RECO_PEN_PERSONA = 201000163L;
    public static final long FUNCION_REGISTRAR_DENU_PEN_PERSONA = 201000164L;
    public static final long FUNCION_CONFIRMAR_DENU_PEN_PERSONA = 201000165L;
    public static final long FUNCION_DESMENTIR_DENU_PEN_PERSONA = 201000166L;
    public static final long FUNCION_ACT_FEC_ULT_COB_PEN_PERSONA = 201000167L;
    public static final long FUNCION_ANUL_FEC_ULT_COB_PEN_PERSONA = 201000168L;
    public static final long FUNCION_CONSULTAR_PERSONA = 201000101L;
    public static final long FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA = 201000169L;
    public static final long FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES = 201000170L;
    public static final long FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES = 201000171L;
    public static final long FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA = 201000172L;
    public static final long FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA = 201000173L;
    public static final long FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA = 201000174L;
    public static final long FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA = 201000175L;
    public static final long FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA = 201000176L;
    public static final long FUNCION_EMITIR_ULTIMA_ACTUALIZACION_PERSONA_EN_JUPE = 201000177L;
    public static final long FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA = 201000178L;
    public static final long FUNCION_CREAR_PERSONA = 201000102L;
    public static final long FUNCION_MODIFICAR_PERSONA = 201000103L;
    public static final long FUNCION_ELIMINAR_PERSONA = 201000104L;

    public static final String PROCESO_FUNCION_REGISTRAR_CER_VIDA_PERSONA = "persona_registrar_cer_vida";
    public static final String PROCESO_FUNCION_ANULAR_CER_VIDA_PERSONA = "persona_anular_cer_vida";
    public static final String PROCESO_FUNCION_REGISTRAR_CER_DEFUN_PERSONA = "persona_registrar_cer_defun";
    public static final String PROCESO_FUNCION_ANULAR_CER_DEFUN_PERSONA = "persona_anular_cer_defun";
    public static final String PROCESO_FUNCION_APROBAR_PENSION_PERSONA = "persona_aprobar_pension";
    public static final String PROCESO_FUNCION_OBJETAR_PENSION_PERSONA = "persona_objetar_pension";
    public static final String PROCESO_FUNCION_REVOCAR_PENSION_PERSONA = "persona_revocar_pension";
    public static final String PROCESO_FUNCION_OTORGAR_PENSION_PERSONA = "persona_otorgar_pension";
    public static final String PROCESO_FUNCION_DENEGAR_PENSION_PERSONA = "persona_denegar_pension";
    public static final String PROCESO_FUNCION_REGISTRAR_ENTREGA_DOC_PERSONA = "persona_registrar_entrega_doc";
    public static final String PROCESO_FUNCION_SOLICITAR_RECO_PEN_PERSONA = "persona_solicitar_reco_pen";
    public static final String PROCESO_FUNCION_APROBAR_RECO_PEN_PERSONA = "persona_aprobar_reco_pen";
    public static final String PROCESO_FUNCION_DENEGAR_RECO_PEN_PERSONA = "persona_denegar_reco_pen";
    public static final String PROCESO_FUNCION_REGISTRAR_DENU_PEN_PERSONA = "persona_registrar_denu_pen";
    public static final String PROCESO_FUNCION_CONFIRMAR_DENU_PEN_PERSONA = "persona_confirmar_denu_pen";
    public static final String PROCESO_FUNCION_DESMENTIR_DENU_PEN_PERSONA = "persona_desmentir_denu_pen";
    public static final String PROCESO_FUNCION_ACT_FEC_ULT_COB_PEN_PERSONA = "persona_act_fec_ult_cob_pen";
    public static final String PROCESO_FUNCION_ANUL_FEC_ULT_COB_PEN_PERSONA = "persona_anul_fec_ult_cob_pen";

    public static final String INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_SOLICITADA = "persona_con_pension_solicitada";
    public static final String INFORME_FUNCION_EMITIR_PERSONA_ACREDITADA_SIN_OBJECIONES = "persona_acreditada_sin_objeciones";
    public static final String INFORME_FUNCION_EMITIR_PERSONA_ACREDITADA_CON_OBJECIONES = "persona_acreditada_con_objeciones";
    public static final String INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_APROBADA = "persona_con_pension_aprobada";
    public static final String INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_DENEGADA = "persona_con_pension_denegada";
    public static final String INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_REVOCADA = "persona_con_pension_revocada";
    public static final String INFORME_FUNCION_EMITIR_PERSONA_CON_PENSION_OTORGADA = "persona_con_pension_otorgada";
    public static final String INFORME_FUNCION_EMITIR_DOCUMENTOS_PERSONA_PENSION_OTORGADA = "persona_documentos_pension_otorgada";
    public static final String INFORME_FUNCION_EMITIR_ULTIMA_ACTUALIZACION_PERSONA_EN_JUPE = "persona_ultima_actualizacion_en_jupe";
    public static final String INFORME_FUNCION_EMITIR_CUADRO_RESUMEN_PENSION_PERSONA = "persona_cuadro_resumen_pension";

    protected static final long PARAMETRO_ID_PERSONA = 20002L;
    protected static final long PARAMETRO_CERTIFICADO_VIDA = 20112L;
    protected static final long PARAMETRO_FECHA_CERTIFICADO_VIDA = 20122L;
    protected static final long PARAMETRO_COMENTARIOS_ANUL_CER_VIDA = 20260L;
    protected static final long PARAMETRO_ES_CERTIFICADO_VIDA_ANULADO = 20263L;
    protected static final long PARAMETRO_CERTIFICADO_DEFUNCION = 20111L;
    protected static final long PARAMETRO_FECHA_CERTIFICADO_DEFUNCION = 20121L;
    protected static final long PARAMETRO_COMENTARIOS_ANUL_CER_DEFUNCION = 20258L;
    protected static final long PARAMETRO_ES_CER_DEFUNCION_ANULADO = 20261L;
    protected static final long PARAMETRO_COMENTARIOS_APROBACION_PENSION = 20228L;
    protected static final long PARAMETRO_NUMERO_CONDICION_PENSION = 20169L;
    protected static final long PARAMETRO_FECHA_APROBACION_PENSION = 20238L;
    protected static final long PARAMETRO_NUMERO_CAUSA_DEN_PENSION = 20224L;
    protected static final long PARAMETRO_OTRA_CAUSA_DEN_PENSION = 20226L;
    protected static final long PARAMETRO_COMENTARIOS_OBJECION_PENSION = 20896L;
    protected static final long PARAMETRO_FECHA_OBJECION_PENSION = 20897L;
    protected static final long PARAMETRO_NUMERO_CAUSA_REV_PENSION = 20211L;
    protected static final long PARAMETRO_OTRA_CAUSA_REV_PENSION = 20227L;
    protected static final long PARAMETRO_COMENTARIOS_REVOCACION_PENSION = 20235L;
    protected static final long PARAMETRO_FECHA_REVOCACION_PENSION = 20245L;
    protected static final long PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN = 20675L;
    protected static final long PARAMETRO_FECHA_RESOLUCION_OTOR_PEN = 20672L;
    protected static final long PARAMETRO_COMENTARIOS_OTORGAMIENTO_PEN = 20662L;
    protected static final long PARAMETRO_NUMERO_RESOLUCION_DEN_PEN = 20683L;
    protected static final long PARAMETRO_FECHA_RESOLUCION_DEN_PEN = 20681L;
    protected static final long PARAMETRO_COMENTARIOS_DENEGACION_PENSION = 20231L;
    protected static final long PARAMETRO_FECHA_DENEGACION_PENSION = 20241L;
    protected static final long PARAMETRO_ES_PERSONA_CON_COPIA_CEDULA = 20679L;
    protected static final long PARAMETRO_ES_PERSONA_CON_DECLARACION_JUR = 20680L;
    protected static final long PARAMETRO_COMENTARIOS_SOLICITUD_RECO_PEN = 20237L;
    protected static final long PARAMETRO_NUMERO_CONDICION_RECO_PEN = 20170L;
    protected static final long PARAMETRO_FECHA_SOLICITUD_RECO_PEN = 20247L;
    protected static final long PARAMETRO_COMENTARIOS_APR_RECO_PEN = 20229L;
    protected static final long PARAMETRO_FECHA_APROBACION_RECO_PEN = 20239L;
    protected static final long PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN = 20248L;
    protected static final long PARAMETRO_OTRA_CAUSA_DEN_RECO_PEN = 20249L;
    protected static final long PARAMETRO_COMENTARIOS_DEN_RECO_PEN = 20232L;
    protected static final long PARAMETRO_FECHA_DENEGACION_RECO_PEN = 20242L;
    protected static final long PARAMETRO_COMENTARIOS_REGISTRO_DENU_PEN = 20234L;
    protected static final long PARAMETRO_NUMERO_CONDICION_DENU_PEN = 20168L;
    protected static final long PARAMETRO_FECHA_REGISTRO_DENUNCIA_PEN = 20244L;
    protected static final long PARAMETRO_COMENTARIOS_CONF_DENU_PEN = 20230L;
    protected static final long PARAMETRO_FECHA_CONFIRMACION_DENU_PEN = 20240L;
    protected static final long PARAMETRO_COMENTARIOS_DES_DENU_PEN = 20233L;
    protected static final long PARAMETRO_FECHA_DESMENTIDO_DENUNCIA_PEN = 20243L;
    protected static final long PARAMETRO_FECHA_ULTIMO_COBRO_PENSION = 20635L;
    protected static final long PARAMETRO_NOTAS_ANUL_FEC_ULT_COB_PEN = 20655L;
    protected static final long PARAMETRO_VERSION_PERSONA = 20004L;
    protected static final long PARAMETRO_CODIGO_PERSONA = 20001L;
    protected static final long PARAMETRO_NOMBRE_PERSONA = 20003L;
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
    protected static final long PARAMETRO_NUMERO_SEXO_PERSONA = 20099L;
    protected static final long PARAMETRO_NUMERO_ESTADO_CIVIL = 20171L;
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
    protected static final long PARAMETRO_DIRECCION = 20326L;
    protected static final long PARAMETRO_NUMERO_TELEFONO_LINEA_BAJA = 20410L;
    protected static final long PARAMETRO_NUMERO_TELEFONO_CELULAR = 20409L;
    protected static final long PARAMETRO_ES_PERSONA_CON_EMPLEO = 20118L;
    protected static final long PARAMETRO_ES_PERSONA_CON_JUBILACION = 20119L;
    protected static final long PARAMETRO_ES_PERSONA_CON_PENSION = 20557L;
    protected static final long PARAMETRO_ES_PERSONA_CON_SUBSIDIO = 20581L;
    protected static final long PARAMETRO_ES_PERSONA_CON_DEUDA = 20223L;
    protected static final long PARAMETRO_ES_PERSONA_CON_PENA_JUDICIAL = 20225L;
    protected static final long PARAMETRO_ES_PERSONA_CON_CER_VIDA = 20580L;
    protected static final long PARAMETRO_ES_PERSONA_CON_CARTA_RENUNCIA = 20579L;
    protected static final long PARAMETRO_ES_PERSONA_ELEGIBLE_PARA_PEN = 20149L;
    protected static final long PARAMETRO_ES_PERSONA_ACREDITADA_PARA_PEN = 20147L;
    protected static final long PARAMETRO_MONTO_PENSION = 20197L;
    protected static final long PARAMETRO_LUGAR_SOLICITUD_PENSION = 20289L;
    protected static final long PARAMETRO_FECHA_SOLICITUD_PENSION = 20246L;
    protected static final long PARAMETRO_COMENTARIOS_SOLICITUD_PENSION = 20236L;
    protected static final long PARAMETRO_FECHA_OTORGAMIENTO_PEN = 20663L;
    protected static final long PARAMETRO_ID_FICHA_PERSONA = 20342L;
    protected static final long PARAMETRO_FECHA_FICHA_PERSONA = 20621L;
    protected static final long PARAMETRO_INDICE_CALIDAD_VIDA = 20219L;
    protected static final long PARAMETRO_NUMERO_TIPO_ACT_JUPE = 20645L;
    protected static final long PARAMETRO_FECHA_HORA_ULT_ACT_JUPE = 20654L;
    protected static final long PARAMETRO_FECHA_SOLICITUD_PENSION_DESDE = 10001L;
    protected static final long PARAMETRO_FECHA_SOLICITUD_PENSION_HASTA = 10002L;
    protected static final long PARAMETRO_FECHA_APROBACION_PENSION_DESDE = 10003L;
    protected static final long PARAMETRO_FECHA_APROBACION_PENSION_HASTA = 10004L;
    protected static final long PARAMETRO_FECHA_DENEGACION_PENSION_DESDE = 10005L;
    protected static final long PARAMETRO_FECHA_DENEGACION_PENSION_HASTA = 10006L;
    protected static final long PARAMETRO_FECHA_REVOCACION_PENSION_DESDE = 10007L;
    protected static final long PARAMETRO_FECHA_REVOCACION_PENSION_HASTA = 10008L;
    protected static final long PARAMETRO_FECHA_OTORGAMIENTO_PEN_DESDE = 10017L;
    protected static final long PARAMETRO_FECHA_OTORGAMIENTO_PEN_HASTA = 10018L;
    protected static final long PARAMETRO_FECHA_HORA_ULT_ACT_JUPE_DESDE = 10009L;
    protected static final long PARAMETRO_FECHA_HORA_ULT_ACT_JUPE_HASTA = 10010L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_PENSION = 311300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CAUSA_DEN_PENSION = 311600101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CAUSA_REV_PENSION = 311700101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_RECO_PEN = 311400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CAUSA_DEN_RECO_PEN = 311620101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CONDICION_DENU_PEN = 311500101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_SEXO_PERSONA = 201200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_ESTADO_CIVIL = 201100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_ETNIA_INDIGENA = 301100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_AREA = 322200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA = 320200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_ACT_JUPE = 324300101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_PENSION = {"condicion_pension", "numero_condicion_pension", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CAUSA_DEN_PENSION = {"causa_den_pension", "numero_causa_den_pension", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CAUSA_REV_PENSION = {"causa_rev_pension", "numero_causa_rev_pension", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_RECO_PEN = {"condicion_reco_pen", "numero_condicion_reco_pen", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CAUSA_DEN_RECO_PEN = {"causa_den_reco_pen", "numero_causa_den_reco_pen", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CONDICION_DENU_PEN = {"condicion_denu_pen", "numero_condicion_denu_pen", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_SEXO_PERSONA = {"sexo_persona", "numero_sexo_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ESTADO_CIVIL = {"estado_civil", "numero_estado_civil", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ETNIA_INDIGENA = {"etnia_indigena", "id_etnia_indigena", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_AREA = {"tipo_area", "numero_tipo_area", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA = {"ficha_persona", "id_ficha_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_ACT_JUPE = {"tipo_act_jupe", "numero_tipo_act_jupe", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_PERSONA) {
            this.consultarPersona(filtro);
            return;
        }
    }

    public void consultarPersona() throws ExcepcionAplicacion {
        this.consultarPersona(new FiltroBusqueda());
    }

    public void consultarPersona(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarPersona(new FiltroBusqueda());
        } else {
            this.consultarPersona(new FiltroBusqueda(filtro));
        }
    }

    public void consultarPersona(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_PERSONA);
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
                comando += clausula + " id_persona ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearPersona() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_PERSONA);
    }

    public void modificarPersona(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_PERSONA);
    }

    public void modificarPersona(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_PERSONA);
    }

    public void eliminarPersona(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_PERSONA);
    }

    public void eliminarPersona(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_PERSONA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_PERSONA) {
            this.posCrearPersona(rowKey);
            return;
        }
    }

    protected void posCrearPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_PERSONA) {
            es = this.esFilaModificableConModificarPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarPersona(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_PERSONA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_PERSONA) {
            this.posModificarPersona(rowKey);
            return;
        }
    }

    protected void posModificarPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_PERSONA) {
            es = this.esFilaEliminableConEliminarPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarPersona(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PERSONA) {
            this.preEliminarPersona(rowKey);
            return;
        }
    }

    protected void preEliminarPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_PERSONA) {
            this.posEliminarPersona(rowKey);
            return;
        }
    }

    protected void posEliminarPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_PERSONA) {
            es = this.esFilaValidaParaCrearPersona(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_PERSONA) {
            es = this.esFilaValidaParaModificarPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearPersona(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FICHA_PERSONA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFichaPersona(rowKey), FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA, STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FICHA_PERSONA + ">");
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

    protected boolean esFilaValidaParaModificarPersona(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
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
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FICHA_PERSONA)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFichaPersona(rowKey), FUNCION_REFERENCIA_CONSULTAR_FICHA_PERSONA, STRINGS_REFERENCIA_CONSULTAR_FICHA_PERSONA);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FICHA_PERSONA + ">");
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
        if (funcion == FUNCION_CREAR_PERSONA) {
            this.preCommitCrearPersona(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_PERSONA) {
            this.preCommitModificarPersona(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_PERSONA) {
            this.preCommitEliminarPersona(rowKey);
            return;
        }
    }

    protected void preCommitCrearPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_PERSONA);
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PERSONA, this.getVersionPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PERSONA, this.getCodigoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PERSONA, this.getNombrePersona(rowKey));
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
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
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
        rastro.addParametro(PARAMETRO_DIRECCION, this.getDireccion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_LINEA_BAJA, this.getNumeroTelefonoLineaBaja(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_CELULAR, this.getNumeroTelefonoCelular(rowKey));
        rastro.addParametro(PARAMETRO_CERTIFICADO_VIDA, this.getCertificadoVida(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_CERTIFICADO_VIDA, this.getFechaCertificadoVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_CERTIFICADO_VIDA_ANULADO, this.getEsCertificadoVidaAnulado(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_ANUL_CER_VIDA, this.getComentariosAnulCerVida(rowKey));
        rastro.addParametro(PARAMETRO_CERTIFICADO_DEFUNCION, this.getCertificadoDefuncion(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_CERTIFICADO_DEFUNCION, this.getFechaCertificadoDefuncion(rowKey));
        rastro.addParametro(PARAMETRO_ES_CER_DEFUNCION_ANULADO, this.getEsCerDefuncionAnulado(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_ANUL_CER_DEFUNCION, this.getComentariosAnulCerDefuncion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_EMPLEO, this.getEsPersonaConEmpleo(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_JUBILACION, this.getEsPersonaConJubilacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENSION, this.getEsPersonaConPension(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_SUBSIDIO, this.getEsPersonaConSubsidio(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_DEUDA, this.getEsPersonaConDeuda(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENA_JUDICIAL, this.getEsPersonaConPenaJudicial(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CER_VIDA, this.getEsPersonaConCerVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CARTA_RENUNCIA, this.getEsPersonaConCartaRenuncia(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_ELEGIBLE_PARA_PEN, this.getEsPersonaElegibleParaPen(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_ACREDITADA_PARA_PEN, this.getEsPersonaAcreditadaParaPen(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_COPIA_CEDULA, this.getEsPersonaConCopiaCedula(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_DECLARACION_JUR, this.getEsPersonaConDeclaracionJur(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_PENSION, this.getMontoPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_PENSION, this.getNumeroCondicionPension(rowKey));
        rastro.addParametro(PARAMETRO_LUGAR_SOLICITUD_PENSION, this.getLugarSolicitudPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_SOLICITUD_PENSION, this.getFechaSolicitudPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_SOLICITUD_PENSION, this.getComentariosSolicitudPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_APROBACION_PENSION, this.getFechaAprobacionPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_APROBACION_PENSION, this.getComentariosAprobacionPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_OTORGAMIENTO_PEN, this.getFechaOtorgamientoPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN, this.getNumeroResolucionOtorPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_RESOLUCION_OTOR_PEN, this.getFechaResolucionOtorPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_OTORGAMIENTO_PEN, this.getComentariosOtorgamientoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_OBJECION_PENSION, this.getFechaObjecionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_PENSION, this.getNumeroCausaDenPension(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_DEN_PENSION, this.getOtraCausaDenPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_OBJECION_PENSION, this.getComentariosObjecionPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DENEGACION_PENSION, this.getFechaDenegacionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_RESOLUCION_DEN_PEN, this.getNumeroResolucionDenPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_RESOLUCION_DEN_PEN, this.getFechaResolucionDenPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DENEGACION_PENSION, this.getComentariosDenegacionPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_REVOCACION_PENSION, this.getFechaRevocacionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_REV_PENSION, this.getNumeroCausaRevPension(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_REV_PENSION, this.getOtraCausaRevPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_REVOCACION_PENSION, this.getComentariosRevocacionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECO_PEN, this.getNumeroCondicionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_SOLICITUD_RECO_PEN, this.getFechaSolicitudRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_SOLICITUD_RECO_PEN, this.getComentariosSolicitudRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_APROBACION_RECO_PEN, this.getFechaAprobacionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_APR_RECO_PEN, this.getComentariosAprRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DENEGACION_RECO_PEN, this.getFechaDenegacionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN, this.getNumeroCausaDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_DEN_RECO_PEN, this.getOtraCausaDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DEN_RECO_PEN, this.getComentariosDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_DENU_PEN, this.getNumeroCondicionDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_REGISTRO_DENUNCIA_PEN, this.getFechaRegistroDenunciaPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_REGISTRO_DENU_PEN, this.getComentariosRegistroDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_CONFIRMACION_DENU_PEN, this.getFechaConfirmacionDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_CONF_DENU_PEN, this.getComentariosConfDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DESMENTIDO_DENUNCIA_PEN, this.getFechaDesmentidoDenunciaPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DES_DENU_PEN, this.getComentariosDesDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_FICHA_PERSONA, this.getFechaFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_INDICE_CALIDAD_VIDA, this.getIndiceCalidadVida(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_ULTIMO_COBRO_PENSION, this.getFechaUltimoCobroPension(rowKey));
        rastro.addParametro(PARAMETRO_NOTAS_ANUL_FEC_ULT_COB_PEN, this.getNotasAnulFecUltCobPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ACT_JUPE, this.getNumeroTipoActJupe(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_ULT_ACT_JUPE, this.getFechaHoraUltActJupe(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_PERSONA);
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_PERSONA, this.getVersionPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_PERSONA, this.getCodigoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_PERSONA, this.getNombrePersona(rowKey));
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
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
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
        rastro.addParametro(PARAMETRO_DIRECCION, this.getDireccion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_LINEA_BAJA, this.getNumeroTelefonoLineaBaja(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TELEFONO_CELULAR, this.getNumeroTelefonoCelular(rowKey));
        rastro.addParametro(PARAMETRO_CERTIFICADO_VIDA, this.getCertificadoVida(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_CERTIFICADO_VIDA, this.getFechaCertificadoVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_CERTIFICADO_VIDA_ANULADO, this.getEsCertificadoVidaAnulado(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_ANUL_CER_VIDA, this.getComentariosAnulCerVida(rowKey));
        rastro.addParametro(PARAMETRO_CERTIFICADO_DEFUNCION, this.getCertificadoDefuncion(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_CERTIFICADO_DEFUNCION, this.getFechaCertificadoDefuncion(rowKey));
        rastro.addParametro(PARAMETRO_ES_CER_DEFUNCION_ANULADO, this.getEsCerDefuncionAnulado(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_ANUL_CER_DEFUNCION, this.getComentariosAnulCerDefuncion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_EMPLEO, this.getEsPersonaConEmpleo(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_JUBILACION, this.getEsPersonaConJubilacion(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENSION, this.getEsPersonaConPension(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_SUBSIDIO, this.getEsPersonaConSubsidio(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_DEUDA, this.getEsPersonaConDeuda(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_PENA_JUDICIAL, this.getEsPersonaConPenaJudicial(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CER_VIDA, this.getEsPersonaConCerVida(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_CARTA_RENUNCIA, this.getEsPersonaConCartaRenuncia(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_ELEGIBLE_PARA_PEN, this.getEsPersonaElegibleParaPen(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_ACREDITADA_PARA_PEN, this.getEsPersonaAcreditadaParaPen(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_COPIA_CEDULA, this.getEsPersonaConCopiaCedula(rowKey));
        rastro.addParametro(PARAMETRO_ES_PERSONA_CON_DECLARACION_JUR, this.getEsPersonaConDeclaracionJur(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_PENSION, this.getMontoPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_PENSION, this.getNumeroCondicionPension(rowKey));
        rastro.addParametro(PARAMETRO_LUGAR_SOLICITUD_PENSION, this.getLugarSolicitudPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_SOLICITUD_PENSION, this.getFechaSolicitudPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_SOLICITUD_PENSION, this.getComentariosSolicitudPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_APROBACION_PENSION, this.getFechaAprobacionPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_APROBACION_PENSION, this.getComentariosAprobacionPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_OTORGAMIENTO_PEN, this.getFechaOtorgamientoPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_RESOLUCION_OTOR_PEN, this.getNumeroResolucionOtorPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_RESOLUCION_OTOR_PEN, this.getFechaResolucionOtorPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_OTORGAMIENTO_PEN, this.getComentariosOtorgamientoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_OBJECION_PENSION, this.getFechaObjecionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_PENSION, this.getNumeroCausaDenPension(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_DEN_PENSION, this.getOtraCausaDenPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_OBJECION_PENSION, this.getComentariosObjecionPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DENEGACION_PENSION, this.getFechaDenegacionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_RESOLUCION_DEN_PEN, this.getNumeroResolucionDenPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_RESOLUCION_DEN_PEN, this.getFechaResolucionDenPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DENEGACION_PENSION, this.getComentariosDenegacionPension(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_REVOCACION_PENSION, this.getFechaRevocacionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_REV_PENSION, this.getNumeroCausaRevPension(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_REV_PENSION, this.getOtraCausaRevPension(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_REVOCACION_PENSION, this.getComentariosRevocacionPension(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_RECO_PEN, this.getNumeroCondicionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_SOLICITUD_RECO_PEN, this.getFechaSolicitudRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_SOLICITUD_RECO_PEN, this.getComentariosSolicitudRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_APROBACION_RECO_PEN, this.getFechaAprobacionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_APR_RECO_PEN, this.getComentariosAprRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DENEGACION_RECO_PEN, this.getFechaDenegacionRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_DEN_RECO_PEN, this.getNumeroCausaDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_DEN_RECO_PEN, this.getOtraCausaDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DEN_RECO_PEN, this.getComentariosDenRecoPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CONDICION_DENU_PEN, this.getNumeroCondicionDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_REGISTRO_DENUNCIA_PEN, this.getFechaRegistroDenunciaPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_REGISTRO_DENU_PEN, this.getComentariosRegistroDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_CONFIRMACION_DENU_PEN, this.getFechaConfirmacionDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_CONF_DENU_PEN, this.getComentariosConfDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_DESMENTIDO_DENUNCIA_PEN, this.getFechaDesmentidoDenunciaPen(rowKey));
        rastro.addParametro(PARAMETRO_COMENTARIOS_DES_DENU_PEN, this.getComentariosDesDenuPen(rowKey));
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_FICHA_PERSONA, this.getFechaFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_INDICE_CALIDAD_VIDA, this.getIndiceCalidadVida(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_ULTIMO_COBRO_PENSION, this.getFechaUltimoCobroPension(rowKey));
        rastro.addParametro(PARAMETRO_NOTAS_ANUL_FEC_ULT_COB_PEN, this.getNotasAnulFecUltCobPen(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_ACT_JUPE, this.getNumeroTipoActJupe(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_HORA_ULT_ACT_JUPE, this.getFechaHoraUltActJupe(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_PERSONA);
        rastro.addParametro(PARAMETRO_ID_PERSONA, this.getIdPersona(rowKey));
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
        Timestamp currentTimestamp = TimeUtils.currentTimestamp();
        this.setVersionPersona(rowKey, 0L);
        this.setEsParaguayoNatural(rowKey, 1);
        this.setEsIndigena(rowKey, 0);
        this.setEsCertificadoVidaAnulado(rowKey, 0);
        this.setEsCerDefuncionAnulado(rowKey, 0);
        this.setEsPersonaConEmpleo(rowKey, 0);
        this.setEsPersonaConJubilacion(rowKey, 0);
        this.setEsPersonaConPension(rowKey, 0);
        this.setEsPersonaConSubsidio(rowKey, 0);
        this.setEsPersonaConDeuda(rowKey, 0);
        this.setEsPersonaConPenaJudicial(rowKey, 0);
        this.setEsPersonaConCerVida(rowKey, 0);
        this.setEsPersonaConCartaRenuncia(rowKey, 0);
        this.setEsPersonaElegibleParaPen(rowKey, 0);
        this.setEsPersonaAcreditadaParaPen(rowKey, 0);
        this.setEsPersonaConCopiaCedula(rowKey, 0);
        this.setEsPersonaConDeclaracionJur(rowKey, 0);
    }
}
