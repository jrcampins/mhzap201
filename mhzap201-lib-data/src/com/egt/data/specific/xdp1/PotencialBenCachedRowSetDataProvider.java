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
package com.egt.data.specific.xdp1;

import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoVersionableDataProvider;
import com.egt.core.db.xdp.RecursoCodificableDataProvider;
import com.egt.core.db.xdp.RecursoNombrableDataProvider;
import com.egt.core.db.xdp.RecursoDesactivableDataProvider;
import com.sun.data.provider.RowKey;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class PotencialBenCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoDesactivableDataProvider {

    public PotencialBenCachedRowSetDataProvider() {
        super();
    }

    public PotencialBenCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "potencial_ben";
    public static final String NOMBRE_DOMINIO_RECURSO = "Potenciales Beneficiarios";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_potencial_ben_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "potencial_ben";

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

    public static final String COLUMNA_ID_POTENCIAL_BEN = "id_potencial_ben";
    public static final String COLUMNA_VERSION_POTENCIAL_BEN = "version_potencial_ben";
    public static final String COLUMNA_CODIGO_POTENCIAL_BEN = "codigo_potencial_ben";
    public static final String COLUMNA_NOMBRE_POTENCIAL_BEN = "nombre_potencial_ben";
    public static final String COLUMNA_NUMERO_TIPO_REG_POT_BEN = "numero_tipo_reg_pot_ben";
    public static final String COLUMNA_ID_PERSONA = "id_persona";
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
    public static final String COLUMNA_EDAD = "edad";
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
    public static final String COLUMNA_COMPANIA = "compania";
    public static final String COLUMNA_DIRECCION = "direccion";
    public static final String COLUMNA_NOMBRE_RESPONSABLE_HOGAR = "nombre_responsable_hogar";
    public static final String COLUMNA_NUMERO_TELEFONO_RESP_HOGAR = "numero_telefono_resp_hogar";
    public static final String COLUMNA_ES_PERSONA_CON_EMPLEO = "es_persona_con_empleo";
    public static final String COLUMNA_ES_PERSONA_CON_JUBILACION = "es_persona_con_jubilacion";
    public static final String COLUMNA_ES_PERSONA_CON_PENSION = "es_persona_con_pension";
    public static final String COLUMNA_ES_PERSONA_CON_SUBSIDIO = "es_persona_con_subsidio";
    public static final String COLUMNA_ES_PERSONA_CON_DEUDA = "es_persona_con_deuda";
    public static final String COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL = "es_persona_con_pena_judicial";
    public static final String COLUMNA_ES_PERSONA_CON_CER_VIDA = "es_persona_con_cer_vida";
    public static final String COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA = "es_persona_con_carta_renuncia";
    public static final String COLUMNA_NOMBRE_REFERENTE = "nombre_referente";
    public static final String COLUMNA_NUMERO_TELEFONO_REFERENTE = "numero_telefono_referente";
    public static final String COLUMNA_NUMERO_CONDICION_CENSO = "numero_condicion_censo";
    public static final String COLUMNA_FECHA_VALIDACION_CENSO = "fecha_validacion_censo";
    public static final String COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN = "id_funcionario_validacion_cen";
    public static final String COLUMNA_NUMERO_CAUSA_INV_CENSO = "numero_causa_inv_censo";
    public static final String COLUMNA_OTRA_CAUSA_INV_CENSO = "otra_causa_inv_censo";
    public static final String COLUMNA_COMENTARIOS_VALIDACION_CENSO = "comentarios_validacion_censo";
    public static final String COLUMNA_ID_FICHA_PERSONA = "id_ficha_persona";
    public static final String COLUMNA_NUMERO_CONDICION_RECL_CEN = "numero_condicion_recl_cen";
    public static final String COLUMNA_FECHA_RECLAMO_CENSO = "fecha_reclamo_censo";
    public static final String COLUMNA_COMENTARIOS_RECLAMO_CENSO = "comentarios_reclamo_censo";
    public static final String COLUMNA_FECHA_APROBACION_RECLAMO_CENSO = "fecha_aprobacion_reclamo_censo";
    public static final String COLUMNA_COMENTARIOS_APR_RECL_CEN = "comentarios_apr_recl_cen";
    public static final String COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO = "fecha_denegacion_reclamo_censo";
    public static final String COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN = "numero_causa_den_recl_cen";
    public static final String COLUMNA_OTRA_CAUSA_DEN_RECL_CEN = "otra_causa_den_recl_cen";
    public static final String COLUMNA_COMENTARIOS_DEN_RECL_CEN = "comentarios_den_recl_cen";
    public static final String COLUMNA_FECHA_REGISTRO_POT_BEN = "fecha_registro_pot_ben";
    public static final String COLUMNA_ID_USUARIO_REG_POT_BEN = "id_usuario_reg_pot_ben";
    public static final String COLUMNA_ES_POTENCIAL_BEN_INACTIVO = "es_potencial_ben_inactivo";
    public static final String COLUMNA_FECHA_ULTIMA_VISITA_CENSO = "fecha_ultima_visita_censo";
    public static final String COLUMNA_OBSERVACIONES_ULT_VISITA_CEN = "observaciones_ult_visita_cen";
    public static final String COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN = "id_funcionario_ult_visita_cen";
    public static final String COLUMNA_REFERENCIA_DIRECCION = "referencia_direccion";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_POTENCIAL_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_POTENCIAL_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_POTENCIAL_BEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_POTENCIAL_BEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_REG_POT_BEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PERSONA, Long.class);
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
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_EDAD, Integer.class);
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
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMPANIA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIRECCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_RESPONSABLE_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_EMPLEO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_JUBILACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_PENSION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_SUBSIDIO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_DEUDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_CER_VIDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_REFERENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TELEFONO_REFERENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_CENSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_VALIDACION_CENSO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_INV_CENSO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CAUSA_INV_CENSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_VALIDACION_CENSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CONDICION_RECL_CEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_RECLAMO_CENSO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_RECLAMO_CENSO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_APR_RECL_CEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_COMENTARIOS_DEN_RECL_CEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_REGISTRO_POT_BEN, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_USUARIO_REG_POT_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_POTENCIAL_BEN_INACTIVO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_ULTIMA_VISITA_CENSO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_REFERENCIA_DIRECCION, String.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_VERSION_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_REG_POT_BEN, true);
        this.setColumnasInsertables(COLUMNA_ID_PERSONA, true);
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
        this.setColumnasInsertables(COLUMNA_EDAD, true);
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
        this.setColumnasInsertables(COLUMNA_COMPANIA, true);
        this.setColumnasInsertables(COLUMNA_DIRECCION, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_RESPONSABLE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_EMPLEO, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_JUBILACION, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_PENSION, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_SUBSIDIO, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_DEUDA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_CER_VIDA, true);
        this.setColumnasInsertables(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_REFERENTE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TELEFONO_REFERENTE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_CENSO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_VALIDACION_CENSO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_INV_CENSO, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CAUSA_INV_CENSO, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_VALIDACION_CENSO, true);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CONDICION_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_RECLAMO_CENSO, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_RECLAMO_CENSO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_APR_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_COMENTARIOS_DEN_RECL_CEN, true);
        this.setColumnasInsertables(COLUMNA_FECHA_REGISTRO_POT_BEN, true);
        this.setColumnasInsertables(COLUMNA_ID_USUARIO_REG_POT_BEN, true);
        this.setColumnasInsertables(COLUMNA_ES_POTENCIAL_BEN_INACTIVO, true);
        this.setColumnasInsertables(COLUMNA_FECHA_ULTIMA_VISITA_CENSO, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN, true);
        this.setColumnasInsertables(COLUMNA_REFERENCIA_DIRECCION, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_VERSION_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_CODIGO_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_REG_POT_BEN, true);
        this.setColumnasModificables(COLUMNA_ID_PERSONA, true);
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
        this.setColumnasModificables(COLUMNA_EDAD, true);
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
        this.setColumnasModificables(COLUMNA_COMPANIA, true);
        this.setColumnasModificables(COLUMNA_DIRECCION, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_RESPONSABLE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_EMPLEO, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_JUBILACION, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_PENSION, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_SUBSIDIO, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_DEUDA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_PENA_JUDICIAL, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_CER_VIDA, true);
        this.setColumnasModificables(COLUMNA_ES_PERSONA_CON_CARTA_RENUNCIA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_REFERENTE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TELEFONO_REFERENTE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_CENSO, true);
        this.setColumnasModificables(COLUMNA_FECHA_VALIDACION_CENSO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_INV_CENSO, true);
        this.setColumnasModificables(COLUMNA_OTRA_CAUSA_INV_CENSO, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_VALIDACION_CENSO, true);
        this.setColumnasModificables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CONDICION_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_RECLAMO_CENSO, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_RECLAMO_CENSO, true);
        this.setColumnasModificables(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_APR_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_COMENTARIOS_DEN_RECL_CEN, true);
        this.setColumnasModificables(COLUMNA_FECHA_REGISTRO_POT_BEN, true);
        this.setColumnasModificables(COLUMNA_ID_USUARIO_REG_POT_BEN, true);
        this.setColumnasModificables(COLUMNA_ES_POTENCIAL_BEN_INACTIVO, true);
        this.setColumnasModificables(COLUMNA_FECHA_ULTIMA_VISITA_CENSO, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN, true);
        this.setColumnasModificables(COLUMNA_REFERENCIA_DIRECCION, true);
    }

    public Long getIdPotencialBen() {
        return (Long) super.getValue(COLUMNA_ID_POTENCIAL_BEN);
    }
    public Long getIdPotencialBen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_POTENCIAL_BEN, rowKey);
    }
    public void setIdPotencialBen(Long valor) {
        super.setValue(COLUMNA_ID_POTENCIAL_BEN, valor);
    }
    public void setIdPotencialBen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_POTENCIAL_BEN, rowKey, valor);
    }

    public Long getVersionPotencialBen() {
        return (Long) super.getValue(COLUMNA_VERSION_POTENCIAL_BEN);
    }
    public Long getVersionPotencialBen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_POTENCIAL_BEN, rowKey);
    }
    public void setVersionPotencialBen(Long valor) {
        super.setValue(COLUMNA_VERSION_POTENCIAL_BEN, valor);
    }
    public void setVersionPotencialBen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_POTENCIAL_BEN, rowKey, valor);
    }

    public String getCodigoPotencialBen() {
        return (String) super.getValue(COLUMNA_CODIGO_POTENCIAL_BEN);
    }
    public String getCodigoPotencialBen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_POTENCIAL_BEN, rowKey);
    }
    public void setCodigoPotencialBen(String valor) {
        super.setValue(COLUMNA_CODIGO_POTENCIAL_BEN, valor);
    }
    public void setCodigoPotencialBen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_POTENCIAL_BEN, rowKey, valor);
    }

    public String getNombrePotencialBen() {
        return (String) super.getValue(COLUMNA_NOMBRE_POTENCIAL_BEN);
    }
    public String getNombrePotencialBen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_POTENCIAL_BEN, rowKey);
    }
    public void setNombrePotencialBen(String valor) {
        super.setValue(COLUMNA_NOMBRE_POTENCIAL_BEN, valor);
    }
    public void setNombrePotencialBen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_POTENCIAL_BEN, rowKey, valor);
    }

    public Integer getNumeroTipoRegPotBen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_REG_POT_BEN);
    }
    public Integer getNumeroTipoRegPotBen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_REG_POT_BEN, rowKey);
    }
    public void setNumeroTipoRegPotBen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_REG_POT_BEN, valor);
    }
    public void setNumeroTipoRegPotBen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_REG_POT_BEN, rowKey, valor);
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

    public Integer getEdad() {
        return (Integer) super.getValue(COLUMNA_EDAD);
    }
    public Integer getEdad(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_EDAD, rowKey);
    }
    public void setEdad(Integer valor) {
        super.setValue(COLUMNA_EDAD, valor);
    }
    public void setEdad(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_EDAD, rowKey, valor);
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

    public String getCompania() {
        return (String) super.getValue(COLUMNA_COMPANIA);
    }
    public String getCompania(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMPANIA, rowKey);
    }
    public void setCompania(String valor) {
        super.setValue(COLUMNA_COMPANIA, valor);
    }
    public void setCompania(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMPANIA, rowKey, valor);
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

    public String getNombreResponsableHogar() {
        return (String) super.getValue(COLUMNA_NOMBRE_RESPONSABLE_HOGAR);
    }
    public String getNombreResponsableHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_RESPONSABLE_HOGAR, rowKey);
    }
    public void setNombreResponsableHogar(String valor) {
        super.setValue(COLUMNA_NOMBRE_RESPONSABLE_HOGAR, valor);
    }
    public void setNombreResponsableHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_RESPONSABLE_HOGAR, rowKey, valor);
    }

    public String getNumeroTelefonoRespHogar() {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR);
    }
    public String getNumeroTelefonoRespHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR, rowKey);
    }
    public void setNumeroTelefonoRespHogar(String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR, valor);
    }
    public void setNumeroTelefonoRespHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_RESP_HOGAR, rowKey, valor);
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

    public String getNombreReferente() {
        return (String) super.getValue(COLUMNA_NOMBRE_REFERENTE);
    }
    public String getNombreReferente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_REFERENTE, rowKey);
    }
    public void setNombreReferente(String valor) {
        super.setValue(COLUMNA_NOMBRE_REFERENTE, valor);
    }
    public void setNombreReferente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_REFERENTE, rowKey, valor);
    }

    public String getNumeroTelefonoReferente() {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_REFERENTE);
    }
    public String getNumeroTelefonoReferente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NUMERO_TELEFONO_REFERENTE, rowKey);
    }
    public void setNumeroTelefonoReferente(String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_REFERENTE, valor);
    }
    public void setNumeroTelefonoReferente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NUMERO_TELEFONO_REFERENTE, rowKey, valor);
    }

    public Integer getNumeroCondicionCenso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_CENSO);
    }
    public Integer getNumeroCondicionCenso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_CENSO, rowKey);
    }
    public void setNumeroCondicionCenso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_CENSO, valor);
    }
    public void setNumeroCondicionCenso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_CENSO, rowKey, valor);
    }

    public Timestamp getFechaValidacionCenso() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_VALIDACION_CENSO);
    }
    public Timestamp getFechaValidacionCenso(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_VALIDACION_CENSO, rowKey);
    }
    public void setFechaValidacionCenso(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_VALIDACION_CENSO, valor);
    }
    public void setFechaValidacionCenso(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_VALIDACION_CENSO, rowKey, valor);
    }

    public Long getIdFuncionarioValidacionCen() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN);
    }
    public Long getIdFuncionarioValidacionCen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN, rowKey);
    }
    public void setIdFuncionarioValidacionCen(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN, valor);
    }
    public void setIdFuncionarioValidacionCen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_VALIDACION_CEN, rowKey, valor);
    }

    public Integer getNumeroCausaInvCenso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_INV_CENSO);
    }
    public Integer getNumeroCausaInvCenso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_INV_CENSO, rowKey);
    }
    public void setNumeroCausaInvCenso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_INV_CENSO, valor);
    }
    public void setNumeroCausaInvCenso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_INV_CENSO, rowKey, valor);
    }

    public String getOtraCausaInvCenso() {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_INV_CENSO);
    }
    public String getOtraCausaInvCenso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_INV_CENSO, rowKey);
    }
    public void setOtraCausaInvCenso(String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_INV_CENSO, valor);
    }
    public void setOtraCausaInvCenso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_INV_CENSO, rowKey, valor);
    }

    public String getComentariosValidacionCenso() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_VALIDACION_CENSO);
    }
    public String getComentariosValidacionCenso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_VALIDACION_CENSO, rowKey);
    }
    public void setComentariosValidacionCenso(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_VALIDACION_CENSO, valor);
    }
    public void setComentariosValidacionCenso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_VALIDACION_CENSO, rowKey, valor);
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

    public Integer getNumeroCondicionReclCen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECL_CEN);
    }
    public Integer getNumeroCondicionReclCen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CONDICION_RECL_CEN, rowKey);
    }
    public void setNumeroCondicionReclCen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECL_CEN, valor);
    }
    public void setNumeroCondicionReclCen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CONDICION_RECL_CEN, rowKey, valor);
    }

    public Timestamp getFechaReclamoCenso() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_RECLAMO_CENSO);
    }
    public Timestamp getFechaReclamoCenso(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_RECLAMO_CENSO, rowKey);
    }
    public void setFechaReclamoCenso(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_RECLAMO_CENSO, valor);
    }
    public void setFechaReclamoCenso(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_RECLAMO_CENSO, rowKey, valor);
    }

    public String getComentariosReclamoCenso() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_RECLAMO_CENSO);
    }
    public String getComentariosReclamoCenso(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_RECLAMO_CENSO, rowKey);
    }
    public void setComentariosReclamoCenso(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_RECLAMO_CENSO, valor);
    }
    public void setComentariosReclamoCenso(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_RECLAMO_CENSO, rowKey, valor);
    }

    public Timestamp getFechaAprobacionReclamoCenso() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO);
    }
    public Timestamp getFechaAprobacionReclamoCenso(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO, rowKey);
    }
    public void setFechaAprobacionReclamoCenso(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO, valor);
    }
    public void setFechaAprobacionReclamoCenso(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_APROBACION_RECLAMO_CENSO, rowKey, valor);
    }

    public String getComentariosAprReclCen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_APR_RECL_CEN);
    }
    public String getComentariosAprReclCen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_APR_RECL_CEN, rowKey);
    }
    public void setComentariosAprReclCen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_APR_RECL_CEN, valor);
    }
    public void setComentariosAprReclCen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_APR_RECL_CEN, rowKey, valor);
    }

    public Timestamp getFechaDenegacionReclamoCenso() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO);
    }
    public Timestamp getFechaDenegacionReclamoCenso(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO, rowKey);
    }
    public void setFechaDenegacionReclamoCenso(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO, valor);
    }
    public void setFechaDenegacionReclamoCenso(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_DENEGACION_RECLAMO_CENSO, rowKey, valor);
    }

    public Integer getNumeroCausaDenReclCen() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN);
    }
    public Integer getNumeroCausaDenReclCen(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, rowKey);
    }
    public void setNumeroCausaDenReclCen(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, valor);
    }
    public void setNumeroCausaDenReclCen(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_DEN_RECL_CEN, rowKey, valor);
    }

    public String getOtraCausaDenReclCen() {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN);
    }
    public String getOtraCausaDenReclCen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN, rowKey);
    }
    public void setOtraCausaDenReclCen(String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN, valor);
    }
    public void setOtraCausaDenReclCen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_DEN_RECL_CEN, rowKey, valor);
    }

    public String getComentariosDenReclCen() {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DEN_RECL_CEN);
    }
    public String getComentariosDenReclCen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_COMENTARIOS_DEN_RECL_CEN, rowKey);
    }
    public void setComentariosDenReclCen(String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DEN_RECL_CEN, valor);
    }
    public void setComentariosDenReclCen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_COMENTARIOS_DEN_RECL_CEN, rowKey, valor);
    }

    public Timestamp getFechaRegistroPotBen() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REGISTRO_POT_BEN);
    }
    public Timestamp getFechaRegistroPotBen(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_REGISTRO_POT_BEN, rowKey);
    }
    public void setFechaRegistroPotBen(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REGISTRO_POT_BEN, valor);
    }
    public void setFechaRegistroPotBen(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_REGISTRO_POT_BEN, rowKey, valor);
    }

    public Long getIdUsuarioRegPotBen() {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_REG_POT_BEN);
    }
    public Long getIdUsuarioRegPotBen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_USUARIO_REG_POT_BEN, rowKey);
    }
    public void setIdUsuarioRegPotBen(Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_REG_POT_BEN, valor);
    }
    public void setIdUsuarioRegPotBen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_USUARIO_REG_POT_BEN, rowKey, valor);
    }

    public Integer getEsPotencialBenInactivo() {
        return (Integer) super.getValue(COLUMNA_ES_POTENCIAL_BEN_INACTIVO);
    }
    public Integer getEsPotencialBenInactivo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_POTENCIAL_BEN_INACTIVO, rowKey);
    }
    public void setEsPotencialBenInactivo(Integer valor) {
        super.setValue(COLUMNA_ES_POTENCIAL_BEN_INACTIVO, valor);
    }
    public void setEsPotencialBenInactivo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_POTENCIAL_BEN_INACTIVO, rowKey, valor);
    }

    public Timestamp getFechaUltimaVisitaCenso() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ULTIMA_VISITA_CENSO);
    }
    public Timestamp getFechaUltimaVisitaCenso(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ULTIMA_VISITA_CENSO, rowKey);
    }
    public void setFechaUltimaVisitaCenso(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ULTIMA_VISITA_CENSO, valor);
    }
    public void setFechaUltimaVisitaCenso(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ULTIMA_VISITA_CENSO, rowKey, valor);
    }

    public String getObservacionesUltVisitaCen() {
        return (String) super.getValue(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN);
    }
    public String getObservacionesUltVisitaCen(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN, rowKey);
    }
    public void setObservacionesUltVisitaCen(String valor) {
        super.setValue(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN, valor);
    }
    public void setObservacionesUltVisitaCen(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACIONES_ULT_VISITA_CEN, rowKey, valor);
    }

    public Long getIdFuncionarioUltVisitaCen() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN);
    }
    public Long getIdFuncionarioUltVisitaCen(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN, rowKey);
    }
    public void setIdFuncionarioUltVisitaCen(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN, valor);
    }
    public void setIdFuncionarioUltVisitaCen(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_ULT_VISITA_CEN, rowKey, valor);
    }

    public String getReferenciaDireccion() {
        return (String) super.getValue(COLUMNA_REFERENCIA_DIRECCION);
    }
    public String getReferenciaDireccion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_REFERENCIA_DIRECCION, rowKey);
    }
    public void setReferenciaDireccion(String valor) {
        super.setValue(COLUMNA_REFERENCIA_DIRECCION, valor);
    }
    public void setReferenciaDireccion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_REFERENCIA_DIRECCION, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_potencial_ben";
    public static final String COLUMNA_VERSION_RECURSO = "version_potencial_ben";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_potencial_ben";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_potencial_ben";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_potencial_ben_inactivo";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Potencial Beneficiario Inactivo";

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
    public String getColumnaEsRecursoInactivo() {
        return COLUMNA_ES_RECURSO_INACTIVO;
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
    public String getEtiquetaEsRecursoInactivo() {
        return ETIQUETA_ES_RECURSO_INACTIVO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdPotencialBen();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdPotencialBen(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdPotencialBen(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdPotencialBen(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionPotencialBen();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionPotencialBen(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionPotencialBen(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionPotencialBen(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoPotencialBen();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoPotencialBen(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoPotencialBen(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoPotencialBen(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombrePotencialBen();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombrePotencialBen(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombrePotencialBen(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombrePotencialBen(rowKey, nombreRecurso);
    }

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsPotencialBenInactivo();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsPotencialBenInactivo(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsPotencialBenInactivo(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsPotencialBenInactivo(rowKey, esRecursoInactivo);
    }
}
