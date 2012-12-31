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
package com.egt.data.generic.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class PersonaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider {

    public PersonaCachedRowSetDataProvider() {
        super();
    }

    public PersonaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "persona";
    public static final String NOMBRE_DOMINIO_RECURSO = "Personas";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_persona_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "persona";

    @Override
    public String getComandoSelect() {
        return COMANDO_SELECT;
    }

    @Override
    public String getComandoSelectNothing() {
        return COMANDO_SELECT_NOTHING;
    }

    @Override
    public String getTablaDestino() {
        return TABLA_DESTINO;
    }

    public static final String COLUMNA_ID_PERSONA = "id_persona";
    public static final String COLUMNA_VERSION_PERSONA = "version_persona";
    public static final String COLUMNA_CODIGO_PERSONA = "codigo_persona";
    public static final String COLUMNA_NOMBRE_PERSONA = "nombre_persona";
    public static final String COLUMNA_NUMERO_CEDULA = "numero_cedula";
    public static final String COLUMNA_LETRA_CEDULA = "letra_cedula";
    public static final String COLUMNA_FECHA_EXPEDICION_CEDULA = "fecha_expedicion_cedula";
    public static final String COLUMNA_FECHA_VENCIMIENTO_CEDULA = "fecha_vencimiento_cedula";
    public static final String COLUMNA_PRIMER_NOMBRE = "primer_nombre";
    public static final String COLUMNA_SEGUNDO_NOMBRE = "segundo_nombre";
    public static final String COLUMNA_PRIMER_APELLIDO = "primer_apellido";
    public static final String COLUMNA_SEGUNDO_APELLIDO = "segundo_apellido";
    public static final String COLUMNA_APELLIDO_CASADA = "apellido_casada";
    public static final String COLUMNA_APODO = "apodo";
    public static final String COLUMNA_FECHA_NACIMIENTO = "fecha_nacimiento";
    public static final String COLUMNA_NUMERO_SEXO_PERSONA = "numero_sexo_persona";
    public static final String COLUMNA_NUMERO_ESTADO_CIVIL = "numero_estado_civil";
    public static final String COLUMNA_ES_PARAGUAYO_NATURAL = "es_paraguayo_natural";
    public static final String COLUMNA_ES_INDIGENA = "es_indigena";
    public static final String COLUMNA_ID_ETNIA_INDIGENA = "id_etnia_indigena";
    public static final String COLUMNA_NOMBRE_COMUNIDAD_INDIGENA = "nombre_comunidad_indigena";
    public static final String COLUMNA_ID_DEPARTAMENTO = "id_departamento";
    public static final String COLUMNA_ID_DISTRITO = "id_distrito";
    public static final String COLUMNA_NUMERO_TIPO_AREA = "numero_tipo_area";
    public static final String COLUMNA_ID_BARRIO = "id_barrio";
    public static final String COLUMNA_ID_MANZANA = "id_manzana";
    public static final String COLUMNA_MANZANA = "manzana";
    public static final String COLUMNA_DIRECCION = "direccion";
    public static final String COLUMNA_NUMERO_TELEFONO_LINEA_BAJA = "numero_telefono_linea_baja";
    public static final String COLUMNA_NUMERO_TELEFONO_CELULAR = "numero_telefono_celular";
    public static final String COLUMNA_CERTIFICADO_VIDA = "certificado_vida";
    public static final String COLUMNA_FECHA_CERTIFICADO_VIDA = "fecha_certificado_vida";
    public static final String COLUMNA_ES_CERTIFICADO_VIDA_ANULADO = "es_certificado_vida_anulado";
    public static final String COLUMNA_COMENTARIOS_ANUL_CER_VIDA = "comentarios_anul_cer_vida";
    public static final String COLUMNA_CERTIFICADO_DEFUNCION = "certificado_defuncion";
    public static final String COLUMNA_FECHA_CERTIFICADO_DEFUNCION = "fecha_certificado_defuncion";
    public static final String COLUMNA_ES_CER_DEFUNCION_ANULADO = "es_cer_defuncion_anulado";
    public static final String COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION = "comentarios_anul_cer_defuncion";
    public static final String COLUMNA_ES_PERSONA_CON_EMPLEO = "es_persona_con_empleo";
    public static final String COLUMNA_ES_PERSONA_CON_JUBILACION = "es_persona_con_jubilacion";
    public static final String COLUMNA_ES_PERSONA_CON_PENSION = "es_persona_con_pension";
    public static final String COLUMNA_ES_PERSONA_CON_SUBSIDIO = "es_persona_con_subsidio";
    public static final String COLUMNA_ES_PERSONA_CON_DEUDA = "es_persona_con_deuda";
    public static final String COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL = "es_persona_con_pena_judicial";
    public static final String COLUMNA_ES_PERSONA_CON_CER_VIDA = "es_persona_con_cer_vida";
    public static final String COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA = "es_persona_con_carta_renuncia";
    public static final String COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN = "es_persona_elegible_para_pen";
    public static final String COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN = "es_persona_acreditada_para_pen";
    public static final String COLUMNA_ES_PERSONA_CON_COPIA_CEDULA = "es_persona_con_copia_cedula";
    public static final String COLUMNA_ES_PERSONA_CON_DECLARACION_JUR = "es_persona_con_declaracion_jur";
    public static final String COLUMNA_MONTO_PENSION = "monto_pension";
    public static final String COLUMNA_NUMERO_CONDICION_PENSION = "numero_condicion_pension";
    public static final String COLUMNA_LUGAR_SOLICITUD_PENSION = "lugar_solicitud_pension";
    public static final String COLUMNA_FECHA_SOLICITUD_PENSION = "fecha_solicitud_pension";
    public static final String COLUMNA_COMENTARIOS_SOLICITUD_PENSION = "comentarios_solicitud_pension";
    public static final String COLUMNA_FECHA_APROBACION_PENSION = "fecha_aprobacion_pension";
    public static final String COLUMNA_COMENTARIOS_APROBACION_PENSION = "comentarios_aprobacion_pension";
    public static final String COLUMNA_FECHA_OTORGAMIENTO_PEN = "fecha_otorgamiento_pen";
    public static final String COLUMNA_NUMERO_RESOLUCION_OTOR_PEN = "numero_resolucion_otor_pen";
    public static final String COLUMNA_FECHA_RESOLUCION_OTOR_PEN = "fecha_resolucion_otor_pen";
    public static final String COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN = "comentarios_otorgamiento_pen";
    public static final String COLUMNA_FECHA_OBJECION_PENSION = "fecha_objecion_pension";
    public static final String COLUMNA_NUMERO_CAUSA_DEN_PENSION = "numero_causa_den_pension";
    public static final String COLUMNA_OTRA_CAUSA_DEN_PENSION = "otra_causa_den_pension";
    public static final String COLUMNA_COMENTARIOS_OBJECION_PENSION = "comentarios_objecion_pension";
    public static final String COLUMNA_FECHA_DENEGACION_PENSION = "fecha_denegacion_pension";
    public static final String COLUMNA_NUMERO_RESOLUCION_DEN_PEN = "numero_resolucion_den_pen";
    public static final String COLUMNA_FECHA_RESOLUCION_DEN_PEN = "fecha_resolucion_den_pen";
    public static final String COLUMNA_COMENTARIOS_DENEGACION_PENSION = "comentarios_denegacion_pension";
    public static final String COLUMNA_FECHA_REVOCACION_PENSION = "fecha_revocacion_pension";
    public static final String COLUMNA_NUMERO_CAUSA_REV_PENSION = "numero_causa_rev_pension";
    public static final String COLUMNA_OTRA_CAUSA_REV_PENSION = "otra_causa_rev_pension";
    public static final String COLUMNA_COMENTARIOS_REVOCACION_PENSION = "comentarios_revocacion_pension";
    public static final String COLUMNA_NUMERO_CONDICION_RECO_PEN = "numero_condicion_reco_pen";
    public static final String COLUMNA_FECHA_SOLICITUD_RECO_PEN = "fecha_solicitud_reco_pen";
    public static final String COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN = "comentarios_solicitud_reco_pen";
    public static final String COLUMNA_FECHA_APROBACION_RECO_PEN = "fecha_aprobacion_reco_pen";
    public static final String COLUMNA_COMENTARIOS_APR_RECO_PEN = "comentarios_apr_reco_pen";
    public static final String COLUMNA_FECHA_DENEGACION_RECO_PEN = "fecha_denegacion_reco_pen";
    public static final String COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN = "numero_causa_den_reco_pen";
    public static final String COLUMNA_OTRA_CAUSA_DEN_RECO_PEN = "otra_causa_den_reco_pen";
    public static final String COLUMNA_COMENTARIOS_DEN_RECO_PEN = "comentarios_den_reco_pen";
    public static final String COLUMNA_NUMERO_CONDICION_DENU_PEN = "numero_condicion_denu_pen";
    public static final String COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN = "fecha_registro_denuncia_pen";
    public static final String COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN = "comentarios_registro_denu_pen";
    public static final String COLUMNA_FECHA_CONFIRMACION_DENU_PEN = "fecha_confirmacion_denu_pen";
    public static final String COLUMNA_COMENTARIOS_CONF_DENU_PEN = "comentarios_conf_denu_pen";
    public static final String COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN = "fecha_desmentido_denuncia_pen";
    public static final String COLUMNA_COMENTARIOS_DES_DENU_PEN = "comentarios_des_denu_pen";
    public static final String COLUMNA_ID_FICHA_PERSONA = "id_ficha_persona";
    public static final String COLUMNA_FECHA_FICHA_PERSONA = "fecha_ficha_persona";
    public static final String COLUMNA_INDICE_CALIDAD_VIDA = "indice_calidad_vida";
    public static final String COLUMNA_FECHA_ULTIMO_COBRO_PENSION = "fecha_ultimo_cobro_pension";
    public static final String COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN = "notas_anul_fec_ult_cob_pen";
    public static final String COLUMNA_NUMERO_TIPO_ACT_JUPE = "numero_tipo_act_jupe";
    public static final String COLUMNA_FECHA_HORA_ULT_ACT_JUPE = "fecha_hora_ult_act_jupe";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CEDULA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_EXPEDICION_CEDULA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_VENCIMIENTO_CEDULA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APELLIDO_CASADA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APODO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_NACIMIENTO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SEXO_PERSONA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ESTADO_CIVIL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PARAGUAYO_NATURAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_INDIGENA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_ETNIA_INDIGENA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DEPARTAMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DISTRITO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_AREA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_BARRIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_MANZANA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MANZANA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIRECCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TELEFONO_CELULAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CERTIFICADO_VIDA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_CERTIFICADO_VIDA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_ANUL_CER_VIDA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CERTIFICADO_DEFUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_CERTIFICADO_DEFUNCION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_CER_DEFUNCION_ANULADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_EMPLEO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_JUBILACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_SUBSIDIO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_DEUDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_CER_VIDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_PENSION, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LUGAR_SOLICITUD_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_SOLICITUD_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_SOLICITUD_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_APROBACION_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_APROBACION_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_OTORGAMIENTO_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_RESOLUCION_OTOR_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_OBJECION_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_DEN_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CAUSA_DEN_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_OBJECION_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_DENEGACION_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_RESOLUCION_DEN_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_RESOLUCION_DEN_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_DENEGACION_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_REVOCACION_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_REV_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CAUSA_REV_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_REVOCACION_PENSION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_RECO_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_SOLICITUD_RECO_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_APROBACION_RECO_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_APR_RECO_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_DENEGACION_RECO_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_DEN_RECO_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_DENU_PEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_CONFIRMACION_DENU_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_CONF_DENU_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_DES_DENU_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_FICHA_PERSONA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_INDICE_CALIDAD_VIDA, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_ULTIMO_COBRO_PENSION, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ACT_JUPE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_HORA_ULT_ACT_JUPE, Timestamp.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_EXPEDICION_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_VENCIMIENTO_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_APELLIDO_CASADA, true);
        this.setColumnasInsertables(COLUMNA_APODO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SEXO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ESTADO_CIVIL, true);
        this.setColumnasInsertables(COLUMNA_ES_PARAGUAYO_NATURAL, true);
        this.setColumnasInsertables(COLUMNA_ES_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_ID_ETNIA_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA, true);
        this.setColumnasInsertables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasInsertables(COLUMNA_ID_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_ID_MANZANA, true);
        this.setColumnasInsertables(COLUMNA_MANZANA, true);
        this.setColumnasInsertables(COLUMNA_DIRECCION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TELEFONO_CELULAR, true);
        this.setColumnasInsertables(COLUMNA_CERTIFICADO_VIDA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_CERTIFICADO_VIDA, true);
        this.setColumnasInsertables(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_ANUL_CER_VIDA, true);
        this.setColumnasInsertables(COLUMNA_CERTIFICADO_DEFUNCION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_CERTIFICADO_DEFUNCION, true);
        this.setColumnasInsertables(COLUMNA_ES_CER_DEFUNCION_ANULADO, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_EMPLEO, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_JUBILACION, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_PENSION, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_SUBSIDIO, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_DEUDA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_CER_VIDA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR, true);
        this.setColumnasInsertables(COLUMNA_MONTO_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_LUGAR_SOLICITUD_PENSION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_SOLICITUD_PENSION, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_SOLICITUD_PENSION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_APROBACION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_APROBACION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_OTORGAMIENTO_PEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_RESOLUCION_OTOR_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_OBJECION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_DEN_PENSION, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CAUSA_DEN_PENSION, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_OBJECION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_DENEGACION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_RESOLUCION_DEN_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_RESOLUCION_DEN_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_DENEGACION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_FECHA_REVOCACION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_REV_PENSION, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CAUSA_REV_PENSION, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_REVOCACION_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_SOLICITUD_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_APROBACION_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_APR_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_DENEGACION_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_DEN_RECO_PEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_DENU_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_CONFIRMACION_DENU_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_CONF_DENU_PEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_DES_DENU_PEN, true);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_INDICE_CALIDAD_VIDA, true);
        this.setColumnasInsertables(COLUMNA_FECHA_ULTIMO_COBRO_PENSION, true);
        this.setColumnasInsertables(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ACT_JUPE, true);
        this.setColumnasInsertables(COLUMNA_FECHA_HORA_ULT_ACT_JUPE, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
        this.setColumnasModificables(COLUMNA_VERSION_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CEDULA, true);
        this.setColumnasModificables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_FECHA_EXPEDICION_CEDULA, true);
        this.setColumnasModificables(COLUMNA_FECHA_VENCIMIENTO_CEDULA, true);
        this.setColumnasModificables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_APELLIDO_CASADA, true);
        this.setColumnasModificables(COLUMNA_APODO, true);
        this.setColumnasModificables(COLUMNA_FECHA_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SEXO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ESTADO_CIVIL, true);
        this.setColumnasModificables(COLUMNA_ES_PARAGUAYO_NATURAL, true);
        this.setColumnasModificables(COLUMNA_ES_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_ID_ETNIA_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA, true);
        this.setColumnasModificables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasModificables(COLUMNA_ID_BARRIO, true);
        this.setColumnasModificables(COLUMNA_ID_MANZANA, true);
        this.setColumnasModificables(COLUMNA_MANZANA, true);
        this.setColumnasModificables(COLUMNA_DIRECCION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TELEFONO_CELULAR, true);
        this.setColumnasModificables(COLUMNA_CERTIFICADO_VIDA, true);
        this.setColumnasModificables(COLUMNA_FECHA_CERTIFICADO_VIDA, true);
        this.setColumnasModificables(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_ANUL_CER_VIDA, true);
        this.setColumnasModificables(COLUMNA_CERTIFICADO_DEFUNCION, true);
        this.setColumnasModificables(COLUMNA_FECHA_CERTIFICADO_DEFUNCION, true);
        this.setColumnasModificables(COLUMNA_ES_CER_DEFUNCION_ANULADO, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_EMPLEO, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_JUBILACION, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_PENSION, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_SUBSIDIO, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_DEUDA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_CER_VIDA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR, true);
        this.setColumnasModificables(COLUMNA_MONTO_PENSION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_PENSION, true);
        this.setColumnasModificables(COLUMNA_LUGAR_SOLICITUD_PENSION, true);
        this.setColumnasModificables(COLUMNA_FECHA_SOLICITUD_PENSION, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_SOLICITUD_PENSION, true);
        this.setColumnasModificables(COLUMNA_FECHA_APROBACION_PENSION, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_APROBACION_PENSION, true);
        this.setColumnasModificables(COLUMNA_FECHA_OTORGAMIENTO_PEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_RESOLUCION_OTOR_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_OBJECION_PENSION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_DEN_PENSION, true);
        this.setColumnasModificables(COLUMNA_OTRA_CAUSA_DEN_PENSION, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_OBJECION_PENSION, true);
        this.setColumnasModificables(COLUMNA_FECHA_DENEGACION_PENSION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_RESOLUCION_DEN_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_RESOLUCION_DEN_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_DENEGACION_PENSION, true);
        this.setColumnasModificables(COLUMNA_FECHA_REVOCACION_PENSION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_REV_PENSION, true);
        this.setColumnasModificables(COLUMNA_OTRA_CAUSA_REV_PENSION, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_REVOCACION_PENSION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_SOLICITUD_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_APROBACION_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_APR_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_DENEGACION_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_DEN_RECO_PEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_DENU_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_CONFIRMACION_DENU_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_CONF_DENU_PEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_DES_DENU_PEN, true);
        this.setColumnasModificables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_FECHA_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_INDICE_CALIDAD_VIDA, true);
        this.setColumnasModificables(COLUMNA_FECHA_ULTIMO_COBRO_PENSION, true);
        this.setColumnasModificables(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ACT_JUPE, true);
        this.setColumnasModificables(COLUMNA_FECHA_HORA_ULT_ACT_JUPE, true);
    }

    public Long getIdPersona() {
        return (Long) super.getValue(COLUMNA_ID_PERSONA);
    }
    public Long getIdPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PERSONA, rowKey);
    }
    public void setIdPersona(Long valor) {
        super.setValue(COLUMNA_ID_PERSONA, valor);
    }
    public void setIdPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PERSONA, rowKey, valor);
    }

    public Long getVersionPersona() {
        return (Long) super.getValue(COLUMNA_VERSION_PERSONA);
    }
    public Long getVersionPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_PERSONA, rowKey);
    }
    public void setVersionPersona(Long valor) {
        super.setValue(COLUMNA_VERSION_PERSONA, valor);
    }
    public void setVersionPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_PERSONA, rowKey, valor);
    }

    public String getCodigoPersona() {
        return (String) super.getValue(COLUMNA_CODIGO_PERSONA);
    }
    public String getCodigoPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_PERSONA, rowKey);
    }
    public void setCodigoPersona(String valor) {
        super.setValue(COLUMNA_CODIGO_PERSONA, valor);
    }
    public void setCodigoPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_PERSONA, rowKey, valor);
    }

    public String getNombrePersona() {
        return (String) super.getValue(COLUMNA_NOMBRE_PERSONA);
    }
    public String getNombrePersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_PERSONA, rowKey);
    }
    public void setNombrePersona(String valor) {
        super.setValue(COLUMNA_NOMBRE_PERSONA, valor);
    }
    public void setNombrePersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_PERSONA, rowKey, valor);
    }

    public Integer getNumeroCedula() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA);
    }
    public Integer getNumeroCedula(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA, rowKey);
    }
    public void setNumeroCedula(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA, valor);
    }
    public void setNumeroCedula(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA, rowKey, valor);
    }

    public String getLetraCedula() {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA);
    }
    public String getLetraCedula(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA, rowKey);
    }
    public void setLetraCedula(String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA, valor);
    }
    public void setLetraCedula(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA, rowKey, valor);
    }

    public Timestamp getFechaExpedicionCedula() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_EXPEDICION_CEDULA);
    }
    public Timestamp getFechaExpedicionCedula(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_EXPEDICION_CEDULA, rowKey);
    }
    public void setFechaExpedicionCedula(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_EXPEDICION_CEDULA, valor);
    }
    public void setFechaExpedicionCedula(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_EXPEDICION_CEDULA, rowKey, valor);
    }

    public Timestamp getFechaVencimientoCedula() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_VENCIMIENTO_CEDULA);
    }
    public Timestamp getFechaVencimientoCedula(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_VENCIMIENTO_CEDULA, rowKey);
    }
    public void setFechaVencimientoCedula(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_VENCIMIENTO_CEDULA, valor);
    }
    public void setFechaVencimientoCedula(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_VENCIMIENTO_CEDULA, rowKey, valor);
    }

    public String getPrimerNombre() {
        return (String) super.getValue(COLUMNA_PRIMER_NOMBRE);
    }
    public String getPrimerNombre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PRIMER_NOMBRE, rowKey);
    }
    public void setPrimerNombre(String valor) {
        super.setValue(COLUMNA_PRIMER_NOMBRE, valor);
    }
    public void setPrimerNombre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PRIMER_NOMBRE, rowKey, valor);
    }

    public String getSegundoNombre() {
        return (String) super.getValue(COLUMNA_SEGUNDO_NOMBRE);
    }
    public String getSegundoNombre(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEGUNDO_NOMBRE, rowKey);
    }
    public void setSegundoNombre(String valor) {
        super.setValue(COLUMNA_SEGUNDO_NOMBRE, valor);
    }
    public void setSegundoNombre(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEGUNDO_NOMBRE, rowKey, valor);
    }

    public String getPrimerApellido() {
        return (String) super.getValue(COLUMNA_PRIMER_APELLIDO);
    }
    public String getPrimerApellido(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_PRIMER_APELLIDO, rowKey);
    }
    public void setPrimerApellido(String valor) {
        super.setValue(COLUMNA_PRIMER_APELLIDO, valor);
    }
    public void setPrimerApellido(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_PRIMER_APELLIDO, rowKey, valor);
    }

    public String getSegundoApellido() {
        return (String) super.getValue(COLUMNA_SEGUNDO_APELLIDO);
    }
    public String getSegundoApellido(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_SEGUNDO_APELLIDO, rowKey);
    }
    public void setSegundoApellido(String valor) {
        super.setValue(COLUMNA_SEGUNDO_APELLIDO, valor);
    }
    public void setSegundoApellido(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_SEGUNDO_APELLIDO, rowKey, valor);
    }

    public String getApellidoCasada() {
        return (String) super.getValue(COLUMNA_APELLIDO_CASADA);
    }
    public String getApellidoCasada(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_APELLIDO_CASADA, rowKey);
    }
    public void setApellidoCasada(String valor) {
        super.setValue(COLUMNA_APELLIDO_CASADA, valor);
    }
    public void setApellidoCasada(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_APELLIDO_CASADA, rowKey, valor);
    }

    public String getApodo() {
        return (String) super.getValue(COLUMNA_APODO);
    }
    public String getApodo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_APODO, rowKey);
    }
    public void setApodo(String valor) {
        super.setValue(COLUMNA_APODO, valor);
    }
    public void setApodo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_APODO, rowKey, valor);
    }

    public Timestamp getFechaNacimiento() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_NACIMIENTO);
    }
    public Timestamp getFechaNacimiento(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_NACIMIENTO, rowKey);
    }
    public void setFechaNacimiento(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_NACIMIENTO, valor);
    }
    public void setFechaNacimiento(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_NACIMIENTO, rowKey, valor);
    }

    public Integer getNumeroSexoPersona() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SEXO_PERSONA);
    }
    public Integer getNumeroSexoPersona(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SEXO_PERSONA, rowKey);
    }
    public void setNumeroSexoPersona(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SEXO_PERSONA, valor);
    }
    public void setNumeroSexoPersona(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SEXO_PERSONA, rowKey, valor);
    }

    public Integer getNumeroEstadoCivil() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_CIVIL);
    }
    public Integer getNumeroEstadoCivil(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_CIVIL, rowKey);
    }
    public void setNumeroEstadoCivil(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_CIVIL, valor);
    }
    public void setNumeroEstadoCivil(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_CIVIL, rowKey, valor);
    }

    public Integer getEsParaguayoNatural() {
        return (Integer) super.getValue(COLUMNA_ES_PARAGUAYO_NATURAL);
    }
    public Integer getEsParaguayoNatural(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PARAGUAYO_NATURAL, rowKey);
    }
    public void setEsParaguayoNatural(Integer valor) {
        super.setValue(COLUMNA_ES_PARAGUAYO_NATURAL, valor);
    }
    public void setEsParaguayoNatural(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PARAGUAYO_NATURAL, rowKey, valor);
    }

    public Integer getEsIndigena() {
        return (Integer) super.getValue(COLUMNA_ES_INDIGENA);
    }
    public Integer getEsIndigena(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_INDIGENA, rowKey);
    }
    public void setEsIndigena(Integer valor) {
        super.setValue(COLUMNA_ES_INDIGENA, valor);
    }
    public void setEsIndigena(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_INDIGENA, rowKey, valor);
    }

    public Long getIdEtniaIndigena() {
        return (Long) super.getValue(COLUMNA_ID_ETNIA_INDIGENA);
    }
    public Long getIdEtniaIndigena(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_ETNIA_INDIGENA, rowKey);
    }
    public void setIdEtniaIndigena(Long valor) {
        super.setValue(COLUMNA_ID_ETNIA_INDIGENA, valor);
    }
    public void setIdEtniaIndigena(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_ETNIA_INDIGENA, rowKey, valor);
    }

    public String getNombreComunidadIndigena() {
        return (String) super.getValue(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA);
    }
    public String getNombreComunidadIndigena(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA, rowKey);
    }
    public void setNombreComunidadIndigena(String valor) {
        super.setValue(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA, valor);
    }
    public void setNombreComunidadIndigena(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_COMUNIDAD_INDIGENA, rowKey, valor);
    }

    public Long getIdDepartamento() {
        return (Long) super.getValue(COLUMNA_ID_DEPARTAMENTO);
    }
    public Long getIdDepartamento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DEPARTAMENTO, rowKey);
    }
    public void setIdDepartamento(Long valor) {
        super.setValue(COLUMNA_ID_DEPARTAMENTO, valor);
    }
    public void setIdDepartamento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DEPARTAMENTO, rowKey, valor);
    }

    public Long getIdDistrito() {
        return (Long) super.getValue(COLUMNA_ID_DISTRITO);
    }
    public Long getIdDistrito(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DISTRITO, rowKey);
    }
    public void setIdDistrito(Long valor) {
        super.setValue(COLUMNA_ID_DISTRITO, valor);
    }
    public void setIdDistrito(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DISTRITO, rowKey, valor);
    }

    public Integer getNumeroTipoArea() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA);
    }
    public Integer getNumeroTipoArea(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA, rowKey);
    }
    public void setNumeroTipoArea(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA, valor);
    }
    public void setNumeroTipoArea(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA, rowKey, valor);
    }

    public Long getIdBarrio() {
        return (Long) super.getValue(COLUMNA_ID_BARRIO);
    }
    public Long getIdBarrio(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_BARRIO, rowKey);
    }
    public void setIdBarrio(Long valor) {
        super.setValue(COLUMNA_ID_BARRIO, valor);
    }
    public void setIdBarrio(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_BARRIO, rowKey, valor);
    }

    public Long getIdManzana() {
        return (Long) super.getValue(COLUMNA_ID_MANZANA);
    }
    public Long getIdManzana(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_MANZANA, rowKey);
    }
    public void setIdManzana(Long valor) {
        super.setValue(COLUMNA_ID_MANZANA, valor);
    }
    public void setIdManzana(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_MANZANA, rowKey, valor);
    }

    public String getManzana() {
        return (String) super.getValue(COLUMNA_MANZANA);
    }
    public String getManzana(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_MANZANA, rowKey);
    }
    public void setManzana(String valor) {
        super.setValue(COLUMNA_MANZANA, valor);
    }
    public void setManzana(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_MANZANA, rowKey, valor);
    }

    public String getDireccion() {
        return (String) super.getValue(COLUMNA_DIRECCION);
    }
    public String getDireccion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DIRECCION, rowKey);
    }
    public void setDireccion(String valor) {
        super.setValue(COLUMNA_DIRECCION, valor);
    }
    public void setDireccion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DIRECCION, rowKey, valor);
    }

    public String getNumeroTelefonoLineaBaja() {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA);
    }
    public String getNumeroTelefonoLineaBaja(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, rowKey);
    }
    public void setNumeroTelefonoLineaBaja(String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, valor);
    }
    public void setNumeroTelefonoLineaBaja(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, rowKey, valor);
    }

    public String getNumeroTelefonoCelular() {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_CELULAR);
    }
    public String getNumeroTelefonoCelular(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_CELULAR, rowKey);
    }
    public void setNumeroTelefonoCelular(String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_CELULAR, valor);
    }
    public void setNumeroTelefonoCelular(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_CELULAR, rowKey, valor);
    }

    public String getCertificadoVida() {
        return (String) super.getValue(COLUMNA_CERTIFICADO_VIDA);
    }
    public String getCertificadoVida(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CERTIFICADO_VIDA, rowKey);
    }
    public void setCertificadoVida(String valor) {
        super.setValue(COLUMNA_CERTIFICADO_VIDA, valor);
    }
    public void setCertificadoVida(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CERTIFICADO_VIDA, rowKey, valor);
    }

    public Timestamp getFechaCertificadoVida() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_CERTIFICADO_VIDA);
    }
    public Timestamp getFechaCertificadoVida(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_CERTIFICADO_VIDA, rowKey);
    }
    public void setFechaCertificadoVida(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_CERTIFICADO_VIDA, valor);
    }
    public void setFechaCertificadoVida(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_CERTIFICADO_VIDA, rowKey, valor);
    }

    public Integer getEsCertificadoVidaAnulado() {
        return (Integer) super.getValue(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO);
    }
    public Integer getEsCertificadoVidaAnulado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO, rowKey);
    }
    public void setEsCertificadoVidaAnulado(Integer valor) {
        super.setValue(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO, valor);
    }
    public void setEsCertificadoVidaAnulado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CERTIFICADO_VIDA_ANULADO, rowKey, valor);
    }

    public String getComentariosAnulCerVida() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_ANUL_CER_VIDA);
    }
    public String getComentariosAnulCerVida(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_ANUL_CER_VIDA, rowKey);
    }
    public void setComentariosAnulCerVida(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_ANUL_CER_VIDA, valor);
    }
    public void setComentariosAnulCerVida(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_ANUL_CER_VIDA, rowKey, valor);
    }

    public String getCertificadoDefuncion() {
        return (String) super.getValue(COLUMNA_CERTIFICADO_DEFUNCION);
    }
    public String getCertificadoDefuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CERTIFICADO_DEFUNCION, rowKey);
    }
    public void setCertificadoDefuncion(String valor) {
        super.setValue(COLUMNA_CERTIFICADO_DEFUNCION, valor);
    }
    public void setCertificadoDefuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CERTIFICADO_DEFUNCION, rowKey, valor);
    }

    public Timestamp getFechaCertificadoDefuncion() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_CERTIFICADO_DEFUNCION);
    }
    public Timestamp getFechaCertificadoDefuncion(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_CERTIFICADO_DEFUNCION, rowKey);
    }
    public void setFechaCertificadoDefuncion(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_CERTIFICADO_DEFUNCION, valor);
    }
    public void setFechaCertificadoDefuncion(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_CERTIFICADO_DEFUNCION, rowKey, valor);
    }

    public Integer getEsCerDefuncionAnulado() {
        return (Integer) super.getValue(COLUMNA_ES_CER_DEFUNCION_ANULADO);
    }
    public Integer getEsCerDefuncionAnulado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_CER_DEFUNCION_ANULADO, rowKey);
    }
    public void setEsCerDefuncionAnulado(Integer valor) {
        super.setValue(COLUMNA_ES_CER_DEFUNCION_ANULADO, valor);
    }
    public void setEsCerDefuncionAnulado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_CER_DEFUNCION_ANULADO, rowKey, valor);
    }

    public String getComentariosAnulCerDefuncion() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION);
    }
    public String getComentariosAnulCerDefuncion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION, rowKey);
    }
    public void setComentariosAnulCerDefuncion(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION, valor);
    }
    public void setComentariosAnulCerDefuncion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_ANUL_CER_DEFUNCION, rowKey, valor);
    }

    public Integer getEsPersonaConEmpleo() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_EMPLEO);
    }
    public Integer getEsPersonaConEmpleo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_EMPLEO, rowKey);
    }
    public void setEsPersonaConEmpleo(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_EMPLEO, valor);
    }
    public void setEsPersonaConEmpleo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_EMPLEO, rowKey, valor);
    }

    public Integer getEsPersonaConJubilacion() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_JUBILACION);
    }
    public Integer getEsPersonaConJubilacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_JUBILACION, rowKey);
    }
    public void setEsPersonaConJubilacion(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_JUBILACION, valor);
    }
    public void setEsPersonaConJubilacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_JUBILACION, rowKey, valor);
    }

    public Integer getEsPersonaConPension() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_PENSION);
    }
    public Integer getEsPersonaConPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_PENSION, rowKey);
    }
    public void setEsPersonaConPension(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_PENSION, valor);
    }
    public void setEsPersonaConPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_PENSION, rowKey, valor);
    }

    public Integer getEsPersonaConSubsidio() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_SUBSIDIO);
    }
    public Integer getEsPersonaConSubsidio(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_SUBSIDIO, rowKey);
    }
    public void setEsPersonaConSubsidio(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_SUBSIDIO, valor);
    }
    public void setEsPersonaConSubsidio(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_SUBSIDIO, rowKey, valor);
    }

    public Integer getEsPersonaConDeuda() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_DEUDA);
    }
    public Integer getEsPersonaConDeuda(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_DEUDA, rowKey);
    }
    public void setEsPersonaConDeuda(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_DEUDA, valor);
    }
    public void setEsPersonaConDeuda(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_DEUDA, rowKey, valor);
    }

    public Integer getEsPersonaConPenaJudicial() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL);
    }
    public Integer getEsPersonaConPenaJudicial(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, rowKey);
    }
    public void setEsPersonaConPenaJudicial(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, valor);
    }
    public void setEsPersonaConPenaJudicial(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, rowKey, valor);
    }

    public Integer getEsPersonaConCerVida() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_CER_VIDA);
    }
    public Integer getEsPersonaConCerVida(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_CER_VIDA, rowKey);
    }
    public void setEsPersonaConCerVida(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_CER_VIDA, valor);
    }
    public void setEsPersonaConCerVida(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_CER_VIDA, rowKey, valor);
    }

    public Integer getEsPersonaConCartaRenuncia() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA);
    }
    public Integer getEsPersonaConCartaRenuncia(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, rowKey);
    }
    public void setEsPersonaConCartaRenuncia(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, valor);
    }
    public void setEsPersonaConCartaRenuncia(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, rowKey, valor);
    }

    public Integer getEsPersonaElegibleParaPen() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN);
    }
    public Integer getEsPersonaElegibleParaPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN, rowKey);
    }
    public void setEsPersonaElegibleParaPen(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN, valor);
    }
    public void setEsPersonaElegibleParaPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_ELEGIBLE_PARA_PEN, rowKey, valor);
    }

    public Integer getEsPersonaAcreditadaParaPen() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN);
    }
    public Integer getEsPersonaAcreditadaParaPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN, rowKey);
    }
    public void setEsPersonaAcreditadaParaPen(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN, valor);
    }
    public void setEsPersonaAcreditadaParaPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_ACREDITADA_PARA_PEN, rowKey, valor);
    }

    public Integer getEsPersonaConCopiaCedula() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA);
    }
    public Integer getEsPersonaConCopiaCedula(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA, rowKey);
    }
    public void setEsPersonaConCopiaCedula(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA, valor);
    }
    public void setEsPersonaConCopiaCedula(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_COPIA_CEDULA, rowKey, valor);
    }

    public Integer getEsPersonaConDeclaracionJur() {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR);
    }
    public Integer getEsPersonaConDeclaracionJur(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR, rowKey);
    }
    public void setEsPersonaConDeclaracionJur(Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR, valor);
    }
    public void setEsPersonaConDeclaracionJur(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_PERSONA_CON_DECLARACION_JUR, rowKey, valor);
    }

    public BigDecimal getMontoPension() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_PENSION);
    }
    public BigDecimal getMontoPension(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_PENSION, rowKey);
    }
    public void setMontoPension(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_PENSION, valor);
    }
    public void setMontoPension(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_PENSION, rowKey, valor);
    }

    public Integer getNumeroCondicionPension() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_PENSION);
    }
    public Integer getNumeroCondicionPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_PENSION, rowKey);
    }
    public void setNumeroCondicionPension(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_PENSION, valor);
    }
    public void setNumeroCondicionPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_PENSION, rowKey, valor);
    }

    public String getLugarSolicitudPension() {
        return (String) super.getValue(COLUMNA_LUGAR_SOLICITUD_PENSION);
    }
    public String getLugarSolicitudPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LUGAR_SOLICITUD_PENSION, rowKey);
    }
    public void setLugarSolicitudPension(String valor) {
        super.setValue(COLUMNA_LUGAR_SOLICITUD_PENSION, valor);
    }
    public void setLugarSolicitudPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LUGAR_SOLICITUD_PENSION, rowKey, valor);
    }

    public Timestamp getFechaSolicitudPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_SOLICITUD_PENSION);
    }
    public Timestamp getFechaSolicitudPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_SOLICITUD_PENSION, rowKey);
    }
    public void setFechaSolicitudPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_SOLICITUD_PENSION, valor);
    }
    public void setFechaSolicitudPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_SOLICITUD_PENSION, rowKey, valor);
    }

    public String getComentariosSolicitudPension() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_SOLICITUD_PENSION);
    }
    public String getComentariosSolicitudPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_SOLICITUD_PENSION, rowKey);
    }
    public void setComentariosSolicitudPension(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_SOLICITUD_PENSION, valor);
    }
    public void setComentariosSolicitudPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_SOLICITUD_PENSION, rowKey, valor);
    }

    public Timestamp getFechaAprobacionPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_APROBACION_PENSION);
    }
    public Timestamp getFechaAprobacionPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_APROBACION_PENSION, rowKey);
    }
    public void setFechaAprobacionPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_APROBACION_PENSION, valor);
    }
    public void setFechaAprobacionPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_APROBACION_PENSION, rowKey, valor);
    }

    public String getComentariosAprobacionPension() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_APROBACION_PENSION);
    }
    public String getComentariosAprobacionPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_APROBACION_PENSION, rowKey);
    }
    public void setComentariosAprobacionPension(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_APROBACION_PENSION, valor);
    }
    public void setComentariosAprobacionPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_APROBACION_PENSION, rowKey, valor);
    }

    public Timestamp getFechaOtorgamientoPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_OTORGAMIENTO_PEN);
    }
    public Timestamp getFechaOtorgamientoPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_OTORGAMIENTO_PEN, rowKey);
    }
    public void setFechaOtorgamientoPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_OTORGAMIENTO_PEN, valor);
    }
    public void setFechaOtorgamientoPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_OTORGAMIENTO_PEN, rowKey, valor);
    }

    public String getNumeroResolucionOtorPen() {
        return (String) super.getValue(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN);
    }
    public String getNumeroResolucionOtorPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN, rowKey);
    }
    public void setNumeroResolucionOtorPen(String valor) {
        super.setValue(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN, valor);
    }
    public void setNumeroResolucionOtorPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NUMERO_RESOLUCION_OTOR_PEN, rowKey, valor);
    }

    public Timestamp getFechaResolucionOtorPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_RESOLUCION_OTOR_PEN);
    }
    public Timestamp getFechaResolucionOtorPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_RESOLUCION_OTOR_PEN, rowKey);
    }
    public void setFechaResolucionOtorPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_RESOLUCION_OTOR_PEN, valor);
    }
    public void setFechaResolucionOtorPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_RESOLUCION_OTOR_PEN, rowKey, valor);
    }

    public String getComentariosOtorgamientoPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN);
    }
    public String getComentariosOtorgamientoPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN, rowKey);
    }
    public void setComentariosOtorgamientoPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN, valor);
    }
    public void setComentariosOtorgamientoPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_OTORGAMIENTO_PEN, rowKey, valor);
    }

    public Timestamp getFechaObjecionPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_OBJECION_PENSION);
    }
    public Timestamp getFechaObjecionPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_OBJECION_PENSION, rowKey);
    }
    public void setFechaObjecionPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_OBJECION_PENSION, valor);
    }
    public void setFechaObjecionPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_OBJECION_PENSION, rowKey, valor);
    }

    public Integer getNumeroCausaDenPension() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_PENSION);
    }
    public Integer getNumeroCausaDenPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_PENSION, rowKey);
    }
    public void setNumeroCausaDenPension(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_PENSION, valor);
    }
    public void setNumeroCausaDenPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_PENSION, rowKey, valor);
    }

    public String getOtraCausaDenPension() {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_DEN_PENSION);
    }
    public String getOtraCausaDenPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_DEN_PENSION, rowKey);
    }
    public void setOtraCausaDenPension(String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_DEN_PENSION, valor);
    }
    public void setOtraCausaDenPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_DEN_PENSION, rowKey, valor);
    }

    public String getComentariosObjecionPension() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_OBJECION_PENSION);
    }
    public String getComentariosObjecionPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_OBJECION_PENSION, rowKey);
    }
    public void setComentariosObjecionPension(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_OBJECION_PENSION, valor);
    }
    public void setComentariosObjecionPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_OBJECION_PENSION, rowKey, valor);
    }

    public Timestamp getFechaDenegacionPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DENEGACION_PENSION);
    }
    public Timestamp getFechaDenegacionPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DENEGACION_PENSION, rowKey);
    }
    public void setFechaDenegacionPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DENEGACION_PENSION, valor);
    }
    public void setFechaDenegacionPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DENEGACION_PENSION, rowKey, valor);
    }

    public String getNumeroResolucionDenPen() {
        return (String) super.getValue(COLUMNA_NUMERO_RESOLUCION_DEN_PEN);
    }
    public String getNumeroResolucionDenPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NUMERO_RESOLUCION_DEN_PEN, rowKey);
    }
    public void setNumeroResolucionDenPen(String valor) {
        super.setValue(COLUMNA_NUMERO_RESOLUCION_DEN_PEN, valor);
    }
    public void setNumeroResolucionDenPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NUMERO_RESOLUCION_DEN_PEN, rowKey, valor);
    }

    public Timestamp getFechaResolucionDenPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_RESOLUCION_DEN_PEN);
    }
    public Timestamp getFechaResolucionDenPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_RESOLUCION_DEN_PEN, rowKey);
    }
    public void setFechaResolucionDenPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_RESOLUCION_DEN_PEN, valor);
    }
    public void setFechaResolucionDenPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_RESOLUCION_DEN_PEN, rowKey, valor);
    }

    public String getComentariosDenegacionPension() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DENEGACION_PENSION);
    }
    public String getComentariosDenegacionPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DENEGACION_PENSION, rowKey);
    }
    public void setComentariosDenegacionPension(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DENEGACION_PENSION, valor);
    }
    public void setComentariosDenegacionPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DENEGACION_PENSION, rowKey, valor);
    }

    public Timestamp getFechaRevocacionPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REVOCACION_PENSION);
    }
    public Timestamp getFechaRevocacionPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REVOCACION_PENSION, rowKey);
    }
    public void setFechaRevocacionPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REVOCACION_PENSION, valor);
    }
    public void setFechaRevocacionPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REVOCACION_PENSION, rowKey, valor);
    }

    public Integer getNumeroCausaRevPension() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_REV_PENSION);
    }
    public Integer getNumeroCausaRevPension(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_REV_PENSION, rowKey);
    }
    public void setNumeroCausaRevPension(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_REV_PENSION, valor);
    }
    public void setNumeroCausaRevPension(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_REV_PENSION, rowKey, valor);
    }

    public String getOtraCausaRevPension() {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_REV_PENSION);
    }
    public String getOtraCausaRevPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_REV_PENSION, rowKey);
    }
    public void setOtraCausaRevPension(String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_REV_PENSION, valor);
    }
    public void setOtraCausaRevPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_REV_PENSION, rowKey, valor);
    }

    public String getComentariosRevocacionPension() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_REVOCACION_PENSION);
    }
    public String getComentariosRevocacionPension(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_REVOCACION_PENSION, rowKey);
    }
    public void setComentariosRevocacionPension(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_REVOCACION_PENSION, valor);
    }
    public void setComentariosRevocacionPension(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_REVOCACION_PENSION, rowKey, valor);
    }

    public Integer getNumeroCondicionRecoPen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECO_PEN);
    }
    public Integer getNumeroCondicionRecoPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECO_PEN, rowKey);
    }
    public void setNumeroCondicionRecoPen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECO_PEN, valor);
    }
    public void setNumeroCondicionRecoPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECO_PEN, rowKey, valor);
    }

    public Timestamp getFechaSolicitudRecoPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_SOLICITUD_RECO_PEN);
    }
    public Timestamp getFechaSolicitudRecoPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_SOLICITUD_RECO_PEN, rowKey);
    }
    public void setFechaSolicitudRecoPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_SOLICITUD_RECO_PEN, valor);
    }
    public void setFechaSolicitudRecoPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_SOLICITUD_RECO_PEN, rowKey, valor);
    }

    public String getComentariosSolicitudRecoPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN);
    }
    public String getComentariosSolicitudRecoPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN, rowKey);
    }
    public void setComentariosSolicitudRecoPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN, valor);
    }
    public void setComentariosSolicitudRecoPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_SOLICITUD_RECO_PEN, rowKey, valor);
    }

    public Timestamp getFechaAprobacionRecoPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_APROBACION_RECO_PEN);
    }
    public Timestamp getFechaAprobacionRecoPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_APROBACION_RECO_PEN, rowKey);
    }
    public void setFechaAprobacionRecoPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_APROBACION_RECO_PEN, valor);
    }
    public void setFechaAprobacionRecoPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_APROBACION_RECO_PEN, rowKey, valor);
    }

    public String getComentariosAprRecoPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_APR_RECO_PEN);
    }
    public String getComentariosAprRecoPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_APR_RECO_PEN, rowKey);
    }
    public void setComentariosAprRecoPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_APR_RECO_PEN, valor);
    }
    public void setComentariosAprRecoPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_APR_RECO_PEN, rowKey, valor);
    }

    public Timestamp getFechaDenegacionRecoPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DENEGACION_RECO_PEN);
    }
    public Timestamp getFechaDenegacionRecoPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DENEGACION_RECO_PEN, rowKey);
    }
    public void setFechaDenegacionRecoPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DENEGACION_RECO_PEN, valor);
    }
    public void setFechaDenegacionRecoPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DENEGACION_RECO_PEN, rowKey, valor);
    }

    public Integer getNumeroCausaDenRecoPen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN);
    }
    public Integer getNumeroCausaDenRecoPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN, rowKey);
    }
    public void setNumeroCausaDenRecoPen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN, valor);
    }
    public void setNumeroCausaDenRecoPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_RECO_PEN, rowKey, valor);
    }

    public String getOtraCausaDenRecoPen() {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN);
    }
    public String getOtraCausaDenRecoPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN, rowKey);
    }
    public void setOtraCausaDenRecoPen(String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN, valor);
    }
    public void setOtraCausaDenRecoPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_DEN_RECO_PEN, rowKey, valor);
    }

    public String getComentariosDenRecoPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DEN_RECO_PEN);
    }
    public String getComentariosDenRecoPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DEN_RECO_PEN, rowKey);
    }
    public void setComentariosDenRecoPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DEN_RECO_PEN, valor);
    }
    public void setComentariosDenRecoPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DEN_RECO_PEN, rowKey, valor);
    }

    public Integer getNumeroCondicionDenuPen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_DENU_PEN);
    }
    public Integer getNumeroCondicionDenuPen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_DENU_PEN, rowKey);
    }
    public void setNumeroCondicionDenuPen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_DENU_PEN, valor);
    }
    public void setNumeroCondicionDenuPen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_DENU_PEN, rowKey, valor);
    }

    public Timestamp getFechaRegistroDenunciaPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN);
    }
    public Timestamp getFechaRegistroDenunciaPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN, rowKey);
    }
    public void setFechaRegistroDenunciaPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN, valor);
    }
    public void setFechaRegistroDenunciaPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REGISTRO_DENUNCIA_PEN, rowKey, valor);
    }

    public String getComentariosRegistroDenuPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN);
    }
    public String getComentariosRegistroDenuPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN, rowKey);
    }
    public void setComentariosRegistroDenuPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN, valor);
    }
    public void setComentariosRegistroDenuPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_REGISTRO_DENU_PEN, rowKey, valor);
    }

    public Timestamp getFechaConfirmacionDenuPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_CONFIRMACION_DENU_PEN);
    }
    public Timestamp getFechaConfirmacionDenuPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_CONFIRMACION_DENU_PEN, rowKey);
    }
    public void setFechaConfirmacionDenuPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_CONFIRMACION_DENU_PEN, valor);
    }
    public void setFechaConfirmacionDenuPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_CONFIRMACION_DENU_PEN, rowKey, valor);
    }

    public String getComentariosConfDenuPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_CONF_DENU_PEN);
    }
    public String getComentariosConfDenuPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_CONF_DENU_PEN, rowKey);
    }
    public void setComentariosConfDenuPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_CONF_DENU_PEN, valor);
    }
    public void setComentariosConfDenuPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_CONF_DENU_PEN, rowKey, valor);
    }

    public Timestamp getFechaDesmentidoDenunciaPen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN);
    }
    public Timestamp getFechaDesmentidoDenunciaPen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN, rowKey);
    }
    public void setFechaDesmentidoDenunciaPen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN, valor);
    }
    public void setFechaDesmentidoDenunciaPen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DESMENTIDO_DENUNCIA_PEN, rowKey, valor);
    }

    public String getComentariosDesDenuPen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DES_DENU_PEN);
    }
    public String getComentariosDesDenuPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DES_DENU_PEN, rowKey);
    }
    public void setComentariosDesDenuPen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DES_DENU_PEN, valor);
    }
    public void setComentariosDesDenuPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DES_DENU_PEN, rowKey, valor);
    }

    public Long getIdFichaPersona() {
        return (Long) super.getValue(COLUMNA_ID_FICHA_PERSONA);
    }
    public Long getIdFichaPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FICHA_PERSONA, rowKey);
    }
    public void setIdFichaPersona(Long valor) {
        super.setValue(COLUMNA_ID_FICHA_PERSONA, valor);
    }
    public void setIdFichaPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FICHA_PERSONA, rowKey, valor);
    }

    public Timestamp getFechaFichaPersona() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_FICHA_PERSONA);
    }
    public Timestamp getFechaFichaPersona(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_FICHA_PERSONA, rowKey);
    }
    public void setFechaFichaPersona(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_FICHA_PERSONA, valor);
    }
    public void setFechaFichaPersona(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_FICHA_PERSONA, rowKey, valor);
    }

    public BigDecimal getIndiceCalidadVida() {
        return (BigDecimal) super.getValue(COLUMNA_INDICE_CALIDAD_VIDA);
    }
    public BigDecimal getIndiceCalidadVida(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_INDICE_CALIDAD_VIDA, rowKey);
    }
    public void setIndiceCalidadVida(BigDecimal valor) {
        super.setValue(COLUMNA_INDICE_CALIDAD_VIDA, valor);
    }
    public void setIndiceCalidadVida(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_INDICE_CALIDAD_VIDA, rowKey, valor);
    }

    public Timestamp getFechaUltimoCobroPension() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ULTIMO_COBRO_PENSION);
    }
    public Timestamp getFechaUltimoCobroPension(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ULTIMO_COBRO_PENSION, rowKey);
    }
    public void setFechaUltimoCobroPension(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ULTIMO_COBRO_PENSION, valor);
    }
    public void setFechaUltimoCobroPension(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ULTIMO_COBRO_PENSION, rowKey, valor);
    }

    public String getNotasAnulFecUltCobPen() {
        return (String) super.getValue(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN);
    }
    public String getNotasAnulFecUltCobPen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN, rowKey);
    }
    public void setNotasAnulFecUltCobPen(String valor) {
        super.setValue(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN, valor);
    }
    public void setNotasAnulFecUltCobPen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOTAS_ANUL_FEC_ULT_COB_PEN, rowKey, valor);
    }

    public Integer getNumeroTipoActJupe() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ACT_JUPE);
    }
    public Integer getNumeroTipoActJupe(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ACT_JUPE, rowKey);
    }
    public void setNumeroTipoActJupe(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ACT_JUPE, valor);
    }
    public void setNumeroTipoActJupe(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ACT_JUPE, rowKey, valor);
    }

    public Timestamp getFechaHoraUltActJupe() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_ULT_ACT_JUPE);
    }
    public Timestamp getFechaHoraUltActJupe(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_HORA_ULT_ACT_JUPE, rowKey);
    }
    public void setFechaHoraUltActJupe(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_ULT_ACT_JUPE, valor);
    }
    public void setFechaHoraUltActJupe(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_HORA_ULT_ACT_JUPE, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_persona";
    public static final String COLUMNA_VERSION_RECURSO = "version_persona";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_persona";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_persona";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";

    @Override
    public String getColumnaIdentificacionRecurso() {
        return COLUMNA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getColumnaVersionRecurso() {
        return COLUMNA_VERSION_RECURSO;
    }
    @Override
    public String getColumnaCodigoRecurso() {
        return COLUMNA_CODIGO_RECURSO;
    }
    @Override
    public String getColumnaNombreRecurso() {
        return COLUMNA_NOMBRE_RECURSO;
    }

    @Override
    public String getEtiquetaIdentificacionRecurso() {
        return ETIQUETA_IDENTIFICACION_RECURSO;
    }
    @Override
    public String getEtiquetaVersionRecurso() {
        return ETIQUETA_VERSION_RECURSO;
    }
    @Override
    public String getEtiquetaCodigoRecurso() {
        return ETIQUETA_CODIGO_RECURSO;
    }
    @Override
    public String getEtiquetaNombreRecurso() {
        return ETIQUETA_NOMBRE_RECURSO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdPersona();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPersona(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPersona(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPersona(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPersona();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPersona(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPersona(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPersona(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoPersona();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoPersona(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoPersona(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoPersona(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombrePersona();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombrePersona(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombrePersona(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombrePersona(rowKey, nombreRecurso);
    }
}
