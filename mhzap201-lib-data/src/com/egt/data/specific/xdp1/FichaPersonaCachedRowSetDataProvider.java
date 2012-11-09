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
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class FichaPersonaCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoNombrableDataProvider, RecursoDesactivableDataProvider {

    public FichaPersonaCachedRowSetDataProvider() {
        super();
    }

    public FichaPersonaCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "ficha_persona";
    public static final String NOMBRE_DOMINIO_RECURSO = "Fichas de Persona";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_ficha_persona_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "ficha_persona";

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

    public static final String COLUMNA_ID_FICHA_PERSONA = "id_ficha_persona";
    public static final String COLUMNA_VERSION_FICHA_PERSONA = "version_ficha_persona";
    public static final String COLUMNA_CODIGO_FICHA_PERSONA = "codigo_ficha_persona";
    public static final String COLUMNA_NOMBRE_FICHA_PERSONA = "nombre_ficha_persona";
    public static final String COLUMNA_ES_RESPONDENTE = "es_respondente";
    public static final String COLUMNA_ID_FICHA_HOGAR = "id_ficha_hogar";
    public static final String COLUMNA_NUMERO_ORDEN_IDENTIFICACION = "numero_orden_identificacion";
    public static final String COLUMNA_PRIMER_NOMBRE = "primer_nombre";
    public static final String COLUMNA_SEGUNDO_NOMBRE = "segundo_nombre";
    public static final String COLUMNA_PRIMER_APELLIDO = "primer_apellido";
    public static final String COLUMNA_SEGUNDO_APELLIDO = "segundo_apellido";
    public static final String COLUMNA_APELLIDO_CASADA = "apellido_casada";
    public static final String COLUMNA_APODO = "apodo";
    public static final String COLUMNA_EDAD = "edad";
    public static final String COLUMNA_NUMERO_SEXO_PERSONA = "numero_sexo_persona";
    public static final String COLUMNA_NUMERO_ESTADO_CIVIL = "numero_estado_civil";
    public static final String COLUMNA_NUMERO_TIPO_PERSONA_HOGAR = "numero_tipo_persona_hogar";
    public static final String COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR = "numero_siono_miembro_hogar";
    public static final String COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE = "numero_orden_iden_conyuge";
    public static final String COLUMNA_NUMERO_ORDEN_IDEN_PADRE = "numero_orden_iden_padre";
    public static final String COLUMNA_NUMERO_ORDEN_IDEN_MADRE = "numero_orden_iden_madre";
    public static final String COLUMNA_NUMERO_CEDULA = "numero_cedula";
    public static final String COLUMNA_LETRA_CEDULA = "letra_cedula";
    public static final String COLUMNA_NUMERO_TIPO_EXCEPCION_CED = "numero_tipo_excepcion_ced";
    public static final String COLUMNA_FECHA_NACIMIENTO = "fecha_nacimiento";
    public static final String COLUMNA_ID_DEPARTAMENTO_NACIMIENTO = "id_departamento_nacimiento";
    public static final String COLUMNA_ID_DISTRITO_NACIMIENTO = "id_distrito_nacimiento";
    public static final String COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC = "numero_tipo_area_lugar_nac";
    public static final String COLUMNA_NUMERO_IDIOMA_HOGAR = "numero_idioma_hogar";
    public static final String COLUMNA_OTRO_IDIOMA_HOGAR = "otro_idioma_hogar";
    public static final String COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC = "numero_siono_asistencia_esc";
    public static final String COLUMNA_NUMERO_MOTIVO_INA_ESC = "numero_motivo_ina_esc";
    public static final String COLUMNA_OTRO_MOTIVO_INA_ESC = "otro_motivo_ina_esc";
    public static final String COLUMNA_NUMERO_SIONO_MATRICULACION_ESC = "numero_siono_matriculacion_esc";
    public static final String COLUMNA_ULTIMO_CURSO_APROBADO = "ultimo_curso_aprobado";
    public static final String COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB = "numero_nivel_edu_ult_cur_aprob";
    public static final String COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL = "numero_siono_curso_no_formal";
    public static final String COLUMNA_NUMERO_TIPO_SEGURO_MEDICO = "numero_tipo_seguro_medico";
    public static final String COLUMNA_NUMERO_ESTADO_SALUD = "numero_estado_salud";
    public static final String COLUMNA_NUMERO_CLASE_ENF_ACC = "numero_clase_enf_acc";
    public static final String COLUMNA_OTRA_CLASE_ENF_ACC = "otra_clase_enf_acc";
    public static final String COLUMNA_NUMERO_CLASE_ENF_CRONICA = "numero_clase_enf_cronica";
    public static final String COLUMNA_OTRA_CLASE_ENF_CRONICA = "otra_clase_enf_cronica";
    public static final String COLUMNA_NUMERO_SIONO_ATENCION_MEDICA = "numero_siono_atencion_medica";
    public static final String COLUMNA_NUMERO_MOTIVO_NO_ATENCION = "numero_motivo_no_atencion";
    public static final String COLUMNA_OTRO_MOTIVO_NO_ATENCION = "otro_motivo_no_atencion";
    public static final String COLUMNA_NUMERO_SIONO_CARNET_VACUNACION = "numero_siono_carnet_vacunacion";
    public static final String COLUMNA_NUMERO_CLASE_IMPEDIMENTO = "numero_clase_impedimento";
    public static final String COLUMNA_OTRA_CLASE_IMPEDIMENTO = "otra_clase_impedimento";
    public static final String COLUMNA_NUMERO_CAUSA_IMPEDIMENTO = "numero_causa_impedimento";
    public static final String COLUMNA_OTRA_CAUSA_IMPEDIMENTO = "otra_causa_impedimento";
    public static final String COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR = "numero_siono_dif_para_caminar";
    public static final String COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE = "numero_siono_dif_para_vestirse";
    public static final String COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE = "numero_siono_dif_para_banarse";
    public static final String COLUMNA_NUMERO_SIONO_DIF_PARA_COMER = "numero_siono_dif_para_comer";
    public static final String COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA = "numero_siono_dif_para_la_cama";
    public static final String COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO = "numero_siono_dif_para_el_bano";
    public static final String COLUMNA_NUMERO_SIONO_TRABAJO = "numero_siono_trabajo";
    public static final String COLUMNA_NUMERO_MOTIVO_NO_TRABAJO = "numero_motivo_no_trabajo";
    public static final String COLUMNA_OTRO_MOTIVO_NO_TRABAJO = "otro_motivo_no_trabajo";
    public static final String COLUMNA_DESCRIPCION_OCUPACION_PRIN = "descripcion_ocupacion_prin";
    public static final String COLUMNA_DESCRIPCION_DEDICACION_PRIN = "descripcion_dedicacion_prin";
    public static final String COLUMNA_NUMERO_TIPO_RELACION_LAB = "numero_tipo_relacion_lab";
    public static final String COLUMNA_MONTO_INGRESO_OCUPACION_PRIN = "monto_ingreso_ocupacion_prin";
    public static final String COLUMNA_MONTO_INGRESO_OCUPACION_SECUN = "monto_ingreso_ocupacion_secun";
    public static final String COLUMNA_MONTO_INGRESO_OTRAS_OCUP = "monto_ingreso_otras_ocup";
    public static final String COLUMNA_MONTO_INGRESO_ALQUILERES = "monto_ingreso_alquileres";
    public static final String COLUMNA_MONTO_INGRESO_INTERESES = "monto_ingreso_intereses";
    public static final String COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS = "monto_ingreso_ayuda_fam_pais";
    public static final String COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER = "monto_ingreso_ayuda_fam_exter";
    public static final String COLUMNA_MONTO_INGRESO_JUBILACION = "monto_ingreso_jubilacion";
    public static final String COLUMNA_MONTO_INGRESO_PENSIONES = "monto_ingreso_pensiones";
    public static final String COLUMNA_MONTO_INGRESO_TEKOPORA = "monto_ingreso_tekopora";
    public static final String COLUMNA_MONTO_INGRESO_PROGRAMAS = "monto_ingreso_programas";
    public static final String COLUMNA_MONTO_INGRESO_ADICIONAL = "monto_ingreso_adicional";
    public static final String COLUMNA_TOTAL_INGRESO_MENSUAL = "total_ingreso_mensual";
    public static final String COLUMNA_ID_POTENCIAL_BEN = "id_potencial_ben";
    public static final String COLUMNA_ES_FICHA_PERSONA_INACTIVA = "es_ficha_persona_inactiva";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FICHA_PERSONA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FICHA_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_FICHA_PERSONA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_RESPONDENTE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_HOGAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ORDEN_IDENTIFICACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_NOMBRE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_PRIMER_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_SEGUNDO_APELLIDO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APELLIDO_CASADA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_APODO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_EDAD, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SEXO_PERSONA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ESTADO_CIVIL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ORDEN_IDEN_PADRE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ORDEN_IDEN_MADRE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CEDULA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CEDULA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_NACIMIENTO, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DISTRITO_NACIMIENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_IDIOMA_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRO_IDIOMA_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_MOTIVO_INA_ESC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRO_MOTIVO_INA_ESC, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ULTIMO_CURSO_APROBADO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ESTADO_SALUD, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CLASE_ENF_ACC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CLASE_ENF_ACC, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CLASE_ENF_CRONICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CLASE_ENF_CRONICA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRO_MOTIVO_NO_ATENCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CLASE_IMPEDIMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRA_CAUSA_IMPEDIMENTO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_TRABAJO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRO_MOTIVO_NO_TRABAJO, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_OCUPACION_PRIN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DESCRIPCION_DEDICACION_PRIN, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_RELACION_LAB, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_OTRAS_OCUP, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_ALQUILERES, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_INTERESES, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_JUBILACION, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_PENSIONES, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_TEKOPORA, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_PROGRAMAS, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MONTO_INGRESO_ADICIONAL, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TOTAL_INGRESO_MENSUAL, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_POTENCIAL_BEN, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_FICHA_PERSONA_INACTIVA, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_FICHA_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_ES_RESPONDENTE, true);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ORDEN_IDENTIFICACION, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasInsertables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasInsertables(COLUMNA_APELLIDO_CASADA, true);
        this.setColumnasInsertables(COLUMNA_APODO, true);
        this.setColumnasInsertables(COLUMNA_EDAD, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SEXO_PERSONA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ESTADO_CIVIL, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ORDEN_IDEN_PADRE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ORDEN_IDEN_MADRE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, true);
        this.setColumnasInsertables(COLUMNA_FECHA_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_DISTRITO_NACIMIENTO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_IDIOMA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_OTRO_IDIOMA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_MOTIVO_INA_ESC, true);
        this.setColumnasInsertables(COLUMNA_OTRO_MOTIVO_INA_ESC, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC, true);
        this.setColumnasInsertables(COLUMNA_ULTIMO_CURSO_APROBADO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ESTADO_SALUD, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CLASE_ENF_ACC, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CLASE_ENF_ACC, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CLASE_ENF_CRONICA, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CLASE_ENF_CRONICA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, true);
        this.setColumnasInsertables(COLUMNA_OTRO_MOTIVO_NO_ATENCION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CLASE_IMPEDIMENTO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, true);
        this.setColumnasInsertables(COLUMNA_OTRA_CAUSA_IMPEDIMENTO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_TRABAJO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, true);
        this.setColumnasInsertables(COLUMNA_OTRO_MOTIVO_NO_TRABAJO, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_OCUPACION_PRIN, true);
        this.setColumnasInsertables(COLUMNA_DESCRIPCION_DEDICACION_PRIN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_RELACION_LAB, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_OTRAS_OCUP, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_ALQUILERES, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_INTERESES, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_JUBILACION, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_PENSIONES, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_TEKOPORA, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_PROGRAMAS, true);
        this.setColumnasInsertables(COLUMNA_MONTO_INGRESO_ADICIONAL, true);
        this.setColumnasInsertables(COLUMNA_TOTAL_INGRESO_MENSUAL, true);
        this.setColumnasInsertables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasInsertables(COLUMNA_ES_FICHA_PERSONA_INACTIVA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_VERSION_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_FICHA_PERSONA, true);
        this.setColumnasModificables(COLUMNA_ES_RESPONDENTE, true);
        this.setColumnasModificables(COLUMNA_ID_FICHA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ORDEN_IDENTIFICACION, true);
        this.setColumnasModificables(COLUMNA_PRIMER_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_NOMBRE, true);
        this.setColumnasModificables(COLUMNA_PRIMER_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_SEGUNDO_APELLIDO, true);
        this.setColumnasModificables(COLUMNA_APELLIDO_CASADA, true);
        this.setColumnasModificables(COLUMNA_APODO, true);
        this.setColumnasModificables(COLUMNA_EDAD, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SEXO_PERSONA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ESTADO_CIVIL, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ORDEN_IDEN_PADRE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ORDEN_IDEN_MADRE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CEDULA, true);
        this.setColumnasModificables(COLUMNA_LETRA_CEDULA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, true);
        this.setColumnasModificables(COLUMNA_FECHA_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_ID_DISTRITO_NACIMIENTO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC, true);
        this.setColumnasModificables(COLUMNA_NUMERO_IDIOMA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_OTRO_IDIOMA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC, true);
        this.setColumnasModificables(COLUMNA_NUMERO_MOTIVO_INA_ESC, true);
        this.setColumnasModificables(COLUMNA_OTRO_MOTIVO_INA_ESC, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC, true);
        this.setColumnasModificables(COLUMNA_ULTIMO_CURSO_APROBADO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ESTADO_SALUD, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CLASE_ENF_ACC, true);
        this.setColumnasModificables(COLUMNA_OTRA_CLASE_ENF_ACC, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CLASE_ENF_CRONICA, true);
        this.setColumnasModificables(COLUMNA_OTRA_CLASE_ENF_CRONICA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, true);
        this.setColumnasModificables(COLUMNA_OTRO_MOTIVO_NO_ATENCION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, true);
        this.setColumnasModificables(COLUMNA_OTRA_CLASE_IMPEDIMENTO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, true);
        this.setColumnasModificables(COLUMNA_OTRA_CAUSA_IMPEDIMENTO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_TRABAJO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, true);
        this.setColumnasModificables(COLUMNA_OTRO_MOTIVO_NO_TRABAJO, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_OCUPACION_PRIN, true);
        this.setColumnasModificables(COLUMNA_DESCRIPCION_DEDICACION_PRIN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_RELACION_LAB, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_OTRAS_OCUP, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_ALQUILERES, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_INTERESES, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_JUBILACION, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_PENSIONES, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_TEKOPORA, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_PROGRAMAS, true);
        this.setColumnasModificables(COLUMNA_MONTO_INGRESO_ADICIONAL, true);
        this.setColumnasModificables(COLUMNA_TOTAL_INGRESO_MENSUAL, true);
        this.setColumnasModificables(COLUMNA_ID_POTENCIAL_BEN, true);
        this.setColumnasModificables(COLUMNA_ES_FICHA_PERSONA_INACTIVA, true);
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

    public Long getVersionFichaPersona() {
        return (Long) super.getValue(COLUMNA_VERSION_FICHA_PERSONA);
    }
    public Long getVersionFichaPersona(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FICHA_PERSONA, rowKey);
    }
    public void setVersionFichaPersona(Long valor) {
        super.setValue(COLUMNA_VERSION_FICHA_PERSONA, valor);
    }
    public void setVersionFichaPersona(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FICHA_PERSONA, rowKey, valor);
    }

    public String getCodigoFichaPersona() {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_PERSONA);
    }
    public String getCodigoFichaPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_PERSONA, rowKey);
    }
    public void setCodigoFichaPersona(String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_PERSONA, valor);
    }
    public void setCodigoFichaPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_PERSONA, rowKey, valor);
    }

    public String getNombreFichaPersona() {
        return (String) super.getValue(COLUMNA_NOMBRE_FICHA_PERSONA);
    }
    public String getNombreFichaPersona(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_FICHA_PERSONA, rowKey);
    }
    public void setNombreFichaPersona(String valor) {
        super.setValue(COLUMNA_NOMBRE_FICHA_PERSONA, valor);
    }
    public void setNombreFichaPersona(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_FICHA_PERSONA, rowKey, valor);
    }

    public Integer getEsRespondente() {
        return (Integer) super.getValue(COLUMNA_ES_RESPONDENTE);
    }
    public Integer getEsRespondente(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_RESPONDENTE, rowKey);
    }
    public void setEsRespondente(Integer valor) {
        super.setValue(COLUMNA_ES_RESPONDENTE, valor);
    }
    public void setEsRespondente(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_RESPONDENTE, rowKey, valor);
    }

    public Long getIdFichaHogar() {
        return (Long) super.getValue(COLUMNA_ID_FICHA_HOGAR);
    }
    public Long getIdFichaHogar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FICHA_HOGAR, rowKey);
    }
    public void setIdFichaHogar(Long valor) {
        super.setValue(COLUMNA_ID_FICHA_HOGAR, valor);
    }
    public void setIdFichaHogar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FICHA_HOGAR, rowKey, valor);
    }

    public Integer getNumeroOrdenIdentificacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDENTIFICACION);
    }
    public Integer getNumeroOrdenIdentificacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDENTIFICACION, rowKey);
    }
    public void setNumeroOrdenIdentificacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDENTIFICACION, valor);
    }
    public void setNumeroOrdenIdentificacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDENTIFICACION, rowKey, valor);
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

    public Integer getNumeroTipoPersonaHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR);
    }
    public Integer getNumeroTipoPersonaHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR, rowKey);
    }
    public void setNumeroTipoPersonaHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR, valor);
    }
    public void setNumeroTipoPersonaHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PERSONA_HOGAR, rowKey, valor);
    }

    public Integer getNumeroSionoMiembroHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR);
    }
    public Integer getNumeroSionoMiembroHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR, rowKey);
    }
    public void setNumeroSionoMiembroHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR, valor);
    }
    public void setNumeroSionoMiembroHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_MIEMBRO_HOGAR, rowKey, valor);
    }

    public Integer getNumeroOrdenIdenConyuge() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE);
    }
    public Integer getNumeroOrdenIdenConyuge(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE, rowKey);
    }
    public void setNumeroOrdenIdenConyuge(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE, valor);
    }
    public void setNumeroOrdenIdenConyuge(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_CONYUGE, rowKey, valor);
    }

    public Integer getNumeroOrdenIdenPadre() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_PADRE);
    }
    public Integer getNumeroOrdenIdenPadre(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_PADRE, rowKey);
    }
    public void setNumeroOrdenIdenPadre(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_PADRE, valor);
    }
    public void setNumeroOrdenIdenPadre(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_PADRE, rowKey, valor);
    }

    public Integer getNumeroOrdenIdenMadre() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_MADRE);
    }
    public Integer getNumeroOrdenIdenMadre(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_MADRE, rowKey);
    }
    public void setNumeroOrdenIdenMadre(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_MADRE, valor);
    }
    public void setNumeroOrdenIdenMadre(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_MADRE, rowKey, valor);
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

    public Integer getNumeroTipoExcepcionCed() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED);
    }
    public Integer getNumeroTipoExcepcionCed(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, rowKey);
    }
    public void setNumeroTipoExcepcionCed(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, valor);
    }
    public void setNumeroTipoExcepcionCed(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_EXCEPCION_CED, rowKey, valor);
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

    public Long getIdDepartamentoNacimiento() {
        return (Long) super.getValue(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO);
    }
    public Long getIdDepartamentoNacimiento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO, rowKey);
    }
    public void setIdDepartamentoNacimiento(Long valor) {
        super.setValue(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO, valor);
    }
    public void setIdDepartamentoNacimiento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO, rowKey, valor);
    }

    public Long getIdDistritoNacimiento() {
        return (Long) super.getValue(COLUMNA_ID_DISTRITO_NACIMIENTO);
    }
    public Long getIdDistritoNacimiento(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_DISTRITO_NACIMIENTO, rowKey);
    }
    public void setIdDistritoNacimiento(Long valor) {
        super.setValue(COLUMNA_ID_DISTRITO_NACIMIENTO, valor);
    }
    public void setIdDistritoNacimiento(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_DISTRITO_NACIMIENTO, rowKey, valor);
    }

    public Integer getNumeroTipoAreaLugarNac() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC);
    }
    public Integer getNumeroTipoAreaLugarNac(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC, rowKey);
    }
    public void setNumeroTipoAreaLugarNac(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC, valor);
    }
    public void setNumeroTipoAreaLugarNac(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_AREA_LUGAR_NAC, rowKey, valor);
    }

    public Integer getNumeroIdiomaHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_IDIOMA_HOGAR);
    }
    public Integer getNumeroIdiomaHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_IDIOMA_HOGAR, rowKey);
    }
    public void setNumeroIdiomaHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_IDIOMA_HOGAR, valor);
    }
    public void setNumeroIdiomaHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_IDIOMA_HOGAR, rowKey, valor);
    }

    public String getOtroIdiomaHogar() {
        return (String) super.getValue(COLUMNA_OTRO_IDIOMA_HOGAR);
    }
    public String getOtroIdiomaHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRO_IDIOMA_HOGAR, rowKey);
    }
    public void setOtroIdiomaHogar(String valor) {
        super.setValue(COLUMNA_OTRO_IDIOMA_HOGAR, valor);
    }
    public void setOtroIdiomaHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRO_IDIOMA_HOGAR, rowKey, valor);
    }

    public Integer getNumeroSionoAsistenciaEsc() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC);
    }
    public Integer getNumeroSionoAsistenciaEsc(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC, rowKey);
    }
    public void setNumeroSionoAsistenciaEsc(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC, valor);
    }
    public void setNumeroSionoAsistenciaEsc(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_ASISTENCIA_ESC, rowKey, valor);
    }

    public Integer getNumeroMotivoInaEsc() {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_INA_ESC);
    }
    public Integer getNumeroMotivoInaEsc(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_INA_ESC, rowKey);
    }
    public void setNumeroMotivoInaEsc(Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_INA_ESC, valor);
    }
    public void setNumeroMotivoInaEsc(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_INA_ESC, rowKey, valor);
    }

    public String getOtroMotivoInaEsc() {
        return (String) super.getValue(COLUMNA_OTRO_MOTIVO_INA_ESC);
    }
    public String getOtroMotivoInaEsc(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRO_MOTIVO_INA_ESC, rowKey);
    }
    public void setOtroMotivoInaEsc(String valor) {
        super.setValue(COLUMNA_OTRO_MOTIVO_INA_ESC, valor);
    }
    public void setOtroMotivoInaEsc(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRO_MOTIVO_INA_ESC, rowKey, valor);
    }

    public Integer getNumeroSionoMatriculacionEsc() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC);
    }
    public Integer getNumeroSionoMatriculacionEsc(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC, rowKey);
    }
    public void setNumeroSionoMatriculacionEsc(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC, valor);
    }
    public void setNumeroSionoMatriculacionEsc(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_MATRICULACION_ESC, rowKey, valor);
    }

    public Integer getUltimoCursoAprobado() {
        return (Integer) super.getValue(COLUMNA_ULTIMO_CURSO_APROBADO);
    }
    public Integer getUltimoCursoAprobado(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ULTIMO_CURSO_APROBADO, rowKey);
    }
    public void setUltimoCursoAprobado(Integer valor) {
        super.setValue(COLUMNA_ULTIMO_CURSO_APROBADO, valor);
    }
    public void setUltimoCursoAprobado(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ULTIMO_CURSO_APROBADO, rowKey, valor);
    }

    public Integer getNumeroNivelEduUltCurAprob() {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB);
    }
    public Integer getNumeroNivelEduUltCurAprob(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB, rowKey);
    }
    public void setNumeroNivelEduUltCurAprob(Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB, valor);
    }
    public void setNumeroNivelEduUltCurAprob(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_NIVEL_EDU_ULT_CUR_APROB, rowKey, valor);
    }

    public Integer getNumeroSionoCursoNoFormal() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL);
    }
    public Integer getNumeroSionoCursoNoFormal(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL, rowKey);
    }
    public void setNumeroSionoCursoNoFormal(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL, valor);
    }
    public void setNumeroSionoCursoNoFormal(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_CURSO_NO_FORMAL, rowKey, valor);
    }

    public Integer getNumeroTipoSeguroMedico() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO);
    }
    public Integer getNumeroTipoSeguroMedico(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, rowKey);
    }
    public void setNumeroTipoSeguroMedico(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, valor);
    }
    public void setNumeroTipoSeguroMedico(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SEGURO_MEDICO, rowKey, valor);
    }

    public Integer getNumeroEstadoSalud() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_SALUD);
    }
    public Integer getNumeroEstadoSalud(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ESTADO_SALUD, rowKey);
    }
    public void setNumeroEstadoSalud(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_SALUD, valor);
    }
    public void setNumeroEstadoSalud(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ESTADO_SALUD, rowKey, valor);
    }

    public Integer getNumeroClaseEnfAcc() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_ACC);
    }
    public Integer getNumeroClaseEnfAcc(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_ACC, rowKey);
    }
    public void setNumeroClaseEnfAcc(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_ACC, valor);
    }
    public void setNumeroClaseEnfAcc(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_ACC, rowKey, valor);
    }

    public String getOtraClaseEnfAcc() {
        return (String) super.getValue(COLUMNA_OTRA_CLASE_ENF_ACC);
    }
    public String getOtraClaseEnfAcc(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CLASE_ENF_ACC, rowKey);
    }
    public void setOtraClaseEnfAcc(String valor) {
        super.setValue(COLUMNA_OTRA_CLASE_ENF_ACC, valor);
    }
    public void setOtraClaseEnfAcc(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CLASE_ENF_ACC, rowKey, valor);
    }

    public Integer getNumeroClaseEnfCronica() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA);
    }
    public Integer getNumeroClaseEnfCronica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA, rowKey);
    }
    public void setNumeroClaseEnfCronica(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA, valor);
    }
    public void setNumeroClaseEnfCronica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_ENF_CRONICA, rowKey, valor);
    }

    public String getOtraClaseEnfCronica() {
        return (String) super.getValue(COLUMNA_OTRA_CLASE_ENF_CRONICA);
    }
    public String getOtraClaseEnfCronica(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CLASE_ENF_CRONICA, rowKey);
    }
    public void setOtraClaseEnfCronica(String valor) {
        super.setValue(COLUMNA_OTRA_CLASE_ENF_CRONICA, valor);
    }
    public void setOtraClaseEnfCronica(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CLASE_ENF_CRONICA, rowKey, valor);
    }

    public Integer getNumeroSionoAtencionMedica() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA);
    }
    public Integer getNumeroSionoAtencionMedica(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA, rowKey);
    }
    public void setNumeroSionoAtencionMedica(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA, valor);
    }
    public void setNumeroSionoAtencionMedica(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_ATENCION_MEDICA, rowKey, valor);
    }

    public Integer getNumeroMotivoNoAtencion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION);
    }
    public Integer getNumeroMotivoNoAtencion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, rowKey);
    }
    public void setNumeroMotivoNoAtencion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, valor);
    }
    public void setNumeroMotivoNoAtencion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_ATENCION, rowKey, valor);
    }

    public String getOtroMotivoNoAtencion() {
        return (String) super.getValue(COLUMNA_OTRO_MOTIVO_NO_ATENCION);
    }
    public String getOtroMotivoNoAtencion(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRO_MOTIVO_NO_ATENCION, rowKey);
    }
    public void setOtroMotivoNoAtencion(String valor) {
        super.setValue(COLUMNA_OTRO_MOTIVO_NO_ATENCION, valor);
    }
    public void setOtroMotivoNoAtencion(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRO_MOTIVO_NO_ATENCION, rowKey, valor);
    }

    public Integer getNumeroSionoCarnetVacunacion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION);
    }
    public Integer getNumeroSionoCarnetVacunacion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION, rowKey);
    }
    public void setNumeroSionoCarnetVacunacion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION, valor);
    }
    public void setNumeroSionoCarnetVacunacion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_CARNET_VACUNACION, rowKey, valor);
    }

    public Integer getNumeroClaseImpedimento() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO);
    }
    public Integer getNumeroClaseImpedimento(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, rowKey);
    }
    public void setNumeroClaseImpedimento(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, valor);
    }
    public void setNumeroClaseImpedimento(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CLASE_IMPEDIMENTO, rowKey, valor);
    }

    public String getOtraClaseImpedimento() {
        return (String) super.getValue(COLUMNA_OTRA_CLASE_IMPEDIMENTO);
    }
    public String getOtraClaseImpedimento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CLASE_IMPEDIMENTO, rowKey);
    }
    public void setOtraClaseImpedimento(String valor) {
        super.setValue(COLUMNA_OTRA_CLASE_IMPEDIMENTO, valor);
    }
    public void setOtraClaseImpedimento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CLASE_IMPEDIMENTO, rowKey, valor);
    }

    public Integer getNumeroCausaImpedimento() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO);
    }
    public Integer getNumeroCausaImpedimento(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, rowKey);
    }
    public void setNumeroCausaImpedimento(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, valor);
    }
    public void setNumeroCausaImpedimento(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CAUSA_IMPEDIMENTO, rowKey, valor);
    }

    public String getOtraCausaImpedimento() {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_IMPEDIMENTO);
    }
    public String getOtraCausaImpedimento(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRA_CAUSA_IMPEDIMENTO, rowKey);
    }
    public void setOtraCausaImpedimento(String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_IMPEDIMENTO, valor);
    }
    public void setOtraCausaImpedimento(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRA_CAUSA_IMPEDIMENTO, rowKey, valor);
    }

    public Integer getNumeroSionoDifParaCaminar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR);
    }
    public Integer getNumeroSionoDifParaCaminar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR, rowKey);
    }
    public void setNumeroSionoDifParaCaminar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR, valor);
    }
    public void setNumeroSionoDifParaCaminar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_CAMINAR, rowKey, valor);
    }

    public Integer getNumeroSionoDifParaVestirse() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE);
    }
    public Integer getNumeroSionoDifParaVestirse(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE, rowKey);
    }
    public void setNumeroSionoDifParaVestirse(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE, valor);
    }
    public void setNumeroSionoDifParaVestirse(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_VESTIRSE, rowKey, valor);
    }

    public Integer getNumeroSionoDifParaBanarse() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE);
    }
    public Integer getNumeroSionoDifParaBanarse(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE, rowKey);
    }
    public void setNumeroSionoDifParaBanarse(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE, valor);
    }
    public void setNumeroSionoDifParaBanarse(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_BANARSE, rowKey, valor);
    }

    public Integer getNumeroSionoDifParaComer() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER);
    }
    public Integer getNumeroSionoDifParaComer(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER, rowKey);
    }
    public void setNumeroSionoDifParaComer(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER, valor);
    }
    public void setNumeroSionoDifParaComer(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_COMER, rowKey, valor);
    }

    public Integer getNumeroSionoDifParaLaCama() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA);
    }
    public Integer getNumeroSionoDifParaLaCama(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA, rowKey);
    }
    public void setNumeroSionoDifParaLaCama(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA, valor);
    }
    public void setNumeroSionoDifParaLaCama(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_LA_CAMA, rowKey, valor);
    }

    public Integer getNumeroSionoDifParaElBano() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO);
    }
    public Integer getNumeroSionoDifParaElBano(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO, rowKey);
    }
    public void setNumeroSionoDifParaElBano(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO, valor);
    }
    public void setNumeroSionoDifParaElBano(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DIF_PARA_EL_BANO, rowKey, valor);
    }

    public Integer getNumeroSionoTrabajo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_TRABAJO);
    }
    public Integer getNumeroSionoTrabajo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_TRABAJO, rowKey);
    }
    public void setNumeroSionoTrabajo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_TRABAJO, valor);
    }
    public void setNumeroSionoTrabajo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_TRABAJO, rowKey, valor);
    }

    public Integer getNumeroMotivoNoTrabajo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO);
    }
    public Integer getNumeroMotivoNoTrabajo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, rowKey);
    }
    public void setNumeroMotivoNoTrabajo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, valor);
    }
    public void setNumeroMotivoNoTrabajo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_MOTIVO_NO_TRABAJO, rowKey, valor);
    }

    public String getOtroMotivoNoTrabajo() {
        return (String) super.getValue(COLUMNA_OTRO_MOTIVO_NO_TRABAJO);
    }
    public String getOtroMotivoNoTrabajo(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRO_MOTIVO_NO_TRABAJO, rowKey);
    }
    public void setOtroMotivoNoTrabajo(String valor) {
        super.setValue(COLUMNA_OTRO_MOTIVO_NO_TRABAJO, valor);
    }
    public void setOtroMotivoNoTrabajo(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRO_MOTIVO_NO_TRABAJO, rowKey, valor);
    }

    public String getDescripcionOcupacionPrin() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_OCUPACION_PRIN);
    }
    public String getDescripcionOcupacionPrin(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_OCUPACION_PRIN, rowKey);
    }
    public void setDescripcionOcupacionPrin(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_OCUPACION_PRIN, valor);
    }
    public void setDescripcionOcupacionPrin(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_OCUPACION_PRIN, rowKey, valor);
    }

    public String getDescripcionDedicacionPrin() {
        return (String) super.getValue(COLUMNA_DESCRIPCION_DEDICACION_PRIN);
    }
    public String getDescripcionDedicacionPrin(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_DESCRIPCION_DEDICACION_PRIN, rowKey);
    }
    public void setDescripcionDedicacionPrin(String valor) {
        super.setValue(COLUMNA_DESCRIPCION_DEDICACION_PRIN, valor);
    }
    public void setDescripcionDedicacionPrin(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_DESCRIPCION_DEDICACION_PRIN, rowKey, valor);
    }

    public Integer getNumeroTipoRelacionLab() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RELACION_LAB);
    }
    public Integer getNumeroTipoRelacionLab(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_RELACION_LAB, rowKey);
    }
    public void setNumeroTipoRelacionLab(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RELACION_LAB, valor);
    }
    public void setNumeroTipoRelacionLab(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_RELACION_LAB, rowKey, valor);
    }

    public BigDecimal getMontoIngresoOcupacionPrin() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN);
    }
    public BigDecimal getMontoIngresoOcupacionPrin(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN, rowKey);
    }
    public void setMontoIngresoOcupacionPrin(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN, valor);
    }
    public void setMontoIngresoOcupacionPrin(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_OCUPACION_PRIN, rowKey, valor);
    }

    public BigDecimal getMontoIngresoOcupacionSecun() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN);
    }
    public BigDecimal getMontoIngresoOcupacionSecun(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN, rowKey);
    }
    public void setMontoIngresoOcupacionSecun(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN, valor);
    }
    public void setMontoIngresoOcupacionSecun(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_OCUPACION_SECUN, rowKey, valor);
    }

    public BigDecimal getMontoIngresoOtrasOcup() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_OTRAS_OCUP);
    }
    public BigDecimal getMontoIngresoOtrasOcup(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_OTRAS_OCUP, rowKey);
    }
    public void setMontoIngresoOtrasOcup(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_OTRAS_OCUP, valor);
    }
    public void setMontoIngresoOtrasOcup(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_OTRAS_OCUP, rowKey, valor);
    }

    public BigDecimal getMontoIngresoAlquileres() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_ALQUILERES);
    }
    public BigDecimal getMontoIngresoAlquileres(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_ALQUILERES, rowKey);
    }
    public void setMontoIngresoAlquileres(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_ALQUILERES, valor);
    }
    public void setMontoIngresoAlquileres(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_ALQUILERES, rowKey, valor);
    }

    public BigDecimal getMontoIngresoIntereses() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_INTERESES);
    }
    public BigDecimal getMontoIngresoIntereses(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_INTERESES, rowKey);
    }
    public void setMontoIngresoIntereses(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_INTERESES, valor);
    }
    public void setMontoIngresoIntereses(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_INTERESES, rowKey, valor);
    }

    public BigDecimal getMontoIngresoAyudaFamPais() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS);
    }
    public BigDecimal getMontoIngresoAyudaFamPais(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS, rowKey);
    }
    public void setMontoIngresoAyudaFamPais(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS, valor);
    }
    public void setMontoIngresoAyudaFamPais(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_PAIS, rowKey, valor);
    }

    public BigDecimal getMontoIngresoAyudaFamExter() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER);
    }
    public BigDecimal getMontoIngresoAyudaFamExter(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER, rowKey);
    }
    public void setMontoIngresoAyudaFamExter(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER, valor);
    }
    public void setMontoIngresoAyudaFamExter(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_AYUDA_FAM_EXTER, rowKey, valor);
    }

    public BigDecimal getMontoIngresoJubilacion() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_JUBILACION);
    }
    public BigDecimal getMontoIngresoJubilacion(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_JUBILACION, rowKey);
    }
    public void setMontoIngresoJubilacion(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_JUBILACION, valor);
    }
    public void setMontoIngresoJubilacion(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_JUBILACION, rowKey, valor);
    }

    public BigDecimal getMontoIngresoPensiones() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_PENSIONES);
    }
    public BigDecimal getMontoIngresoPensiones(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_PENSIONES, rowKey);
    }
    public void setMontoIngresoPensiones(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_PENSIONES, valor);
    }
    public void setMontoIngresoPensiones(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_PENSIONES, rowKey, valor);
    }

    public BigDecimal getMontoIngresoTekopora() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_TEKOPORA);
    }
    public BigDecimal getMontoIngresoTekopora(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_TEKOPORA, rowKey);
    }
    public void setMontoIngresoTekopora(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_TEKOPORA, valor);
    }
    public void setMontoIngresoTekopora(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_TEKOPORA, rowKey, valor);
    }

    public BigDecimal getMontoIngresoProgramas() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_PROGRAMAS);
    }
    public BigDecimal getMontoIngresoProgramas(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_PROGRAMAS, rowKey);
    }
    public void setMontoIngresoProgramas(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_PROGRAMAS, valor);
    }
    public void setMontoIngresoProgramas(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_PROGRAMAS, rowKey, valor);
    }

    public BigDecimal getMontoIngresoAdicional() {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_ADICIONAL);
    }
    public BigDecimal getMontoIngresoAdicional(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_MONTO_INGRESO_ADICIONAL, rowKey);
    }
    public void setMontoIngresoAdicional(BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_ADICIONAL, valor);
    }
    public void setMontoIngresoAdicional(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_MONTO_INGRESO_ADICIONAL, rowKey, valor);
    }

    public BigDecimal getTotalIngresoMensual() {
        return (BigDecimal) super.getValue(COLUMNA_TOTAL_INGRESO_MENSUAL);
    }
    public BigDecimal getTotalIngresoMensual(RowKey rowKey) {
        return (BigDecimal) super.getValue(COLUMNA_TOTAL_INGRESO_MENSUAL, rowKey);
    }
    public void setTotalIngresoMensual(BigDecimal valor) {
        super.setValue(COLUMNA_TOTAL_INGRESO_MENSUAL, valor);
    }
    public void setTotalIngresoMensual(RowKey rowKey, BigDecimal valor) {
        super.setValue(COLUMNA_TOTAL_INGRESO_MENSUAL, rowKey, valor);
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

    public Integer getEsFichaPersonaInactiva() {
        return (Integer) super.getValue(COLUMNA_ES_FICHA_PERSONA_INACTIVA);
    }
    public Integer getEsFichaPersonaInactiva(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_FICHA_PERSONA_INACTIVA, rowKey);
    }
    public void setEsFichaPersonaInactiva(Integer valor) {
        super.setValue(COLUMNA_ES_FICHA_PERSONA_INACTIVA, valor);
    }
    public void setEsFichaPersonaInactiva(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_FICHA_PERSONA_INACTIVA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_ficha_persona";
    public static final String COLUMNA_VERSION_RECURSO = "version_ficha_persona";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_ficha_persona";
    public static final String COLUMNA_NOMBRE_RECURSO = "nombre_ficha_persona";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_ficha_persona_inactiva";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_NOMBRE_RECURSO = "Nombre";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Ficha Persona Inactiva";

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
        return this.getIdFichaPersona();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFichaPersona(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFichaPersona(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFichaPersona(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFichaPersona();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFichaPersona(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFichaPersona(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFichaPersona(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoFichaPersona();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoFichaPersona(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoFichaPersona(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoFichaPersona(rowKey, codigoRecurso);
    }

    @Override
    public String getNombreRecurso() {
        return this.getNombreFichaPersona();
    }
    @Override
    public String getNombreRecurso(RowKey rowKey) {
        return this.getNombreFichaPersona(rowKey);
    }
    @Override
    public void setNombreRecurso(String nombreRecurso) {
        this.setNombreFichaPersona(nombreRecurso);
    }
    @Override
    public void setNombreRecurso(RowKey rowKey, String nombreRecurso) {
        this.setNombreFichaPersona(rowKey, nombreRecurso);
    }

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsFichaPersonaInactiva();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsFichaPersonaInactiva(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsFichaPersonaInactiva(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsFichaPersonaInactiva(rowKey, esRecursoInactivo);
    }
}
