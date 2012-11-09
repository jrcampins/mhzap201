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
import com.egt.core.db.xdp.RecursoDesactivableDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.sql.rowset.CachedRowSet;

public class FichaHogarCachedRowSetDataProvider extends RecursoCachedRowSetDataProvider
        implements RecursoVersionableDataProvider, RecursoCodificableDataProvider, RecursoDesactivableDataProvider {

    public FichaHogarCachedRowSetDataProvider() {
        super();
    }

    public FichaHogarCachedRowSetDataProvider(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public static final String CODIGO_DOMINIO_RECURSO = "ficha_hogar";
    public static final String NOMBRE_DOMINIO_RECURSO = "Fichas de Hogar";

    @Override
    public String getCodigoDominioRecurso() {
        return CODIGO_DOMINIO_RECURSO;
    }

    @Override
    public String getNombreDominioRecurso() {
        return NOMBRE_DOMINIO_RECURSO;
    }

    private static final String COMANDO_SELECT = "SELECT * FROM consulta_ficha_hogar_1 ";
    private static final String COMANDO_SELECT_NOTHING = COMANDO_SELECT + "WHERE (0=1)";
    private static final String TABLA_DESTINO = "ficha_hogar";

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

    public static final String COLUMNA_ID_FICHA_HOGAR = "id_ficha_hogar";
    public static final String COLUMNA_VERSION_FICHA_HOGAR = "version_ficha_hogar";
    public static final String COLUMNA_CODIGO_FICHA_HOGAR = "codigo_ficha_hogar";
    public static final String COLUMNA_FECHA_ENTREVISTA = "fecha_entrevista";
    public static final String COLUMNA_ID_FUNCIONARIO_CENSISTA = "id_funcionario_censista";
    public static final String COLUMNA_ID_FUNCIONARIO_SUPERVISOR = "id_funcionario_supervisor";
    public static final String COLUMNA_ID_FUNCIONARIO_CRITICO_DECO = "id_funcionario_critico_deco";
    public static final String COLUMNA_ID_FUNCIONARIO_DIGITADOR = "id_funcionario_digitador";
    public static final String COLUMNA_OBSERVACIONES = "observaciones";
    public static final String COLUMNA_HUSO_UTM = "huso_utm";
    public static final String COLUMNA_FRANJA_UTM = "franja_utm";
    public static final String COLUMNA_DISTANCIA_ESTE_UTM = "distancia_este_utm";
    public static final String COLUMNA_DISTANCIA_NORTE_UTM = "distancia_norte_utm";
    public static final String COLUMNA_NUMERO_FORMULARIO = "numero_formulario";
    public static final String COLUMNA_NUMERO_VIVIENDA = "numero_vivienda";
    public static final String COLUMNA_NUMERO_HOGAR = "numero_hogar";
    public static final String COLUMNA_ID_DEPARTAMENTO = "id_departamento";
    public static final String COLUMNA_ID_DISTRITO = "id_distrito";
    public static final String COLUMNA_NUMERO_TIPO_AREA = "numero_tipo_area";
    public static final String COLUMNA_ID_BARRIO = "id_barrio";
    public static final String COLUMNA_ID_MANZANA = "id_manzana";
    public static final String COLUMNA_MANZANA = "manzana";
    public static final String COLUMNA_DIRECCION = "direccion";
    public static final String COLUMNA_TOTAL_PERSONAS = "total_personas";
    public static final String COLUMNA_TOTAL_HOMBRES = "total_hombres";
    public static final String COLUMNA_TOTAL_MUJERES = "total_mujeres";
    public static final String COLUMNA_NUMERO_TIPO_MAT_PAREDES = "numero_tipo_mat_paredes";
    public static final String COLUMNA_NUMERO_TIPO_MAT_PISO = "numero_tipo_mat_piso";
    public static final String COLUMNA_NUMERO_TIPO_MAT_TECHO = "numero_tipo_mat_techo";
    public static final String COLUMNA_NUMERO_TIPO_OCUPACION_VIV = "numero_tipo_ocupacion_viv";
    public static final String COLUMNA_OTRO_TIPO_OCUPACION_VIV = "otro_tipo_ocupacion_viv";
    public static final String COLUMNA_CANTIDAD_PIEZAS = "cantidad_piezas";
    public static final String COLUMNA_CANTIDAD_DORMITORIOS = "cantidad_dormitorios";
    public static final String COLUMNA_NUMERO_SIONO_PIEZA_COCINA = "numero_siono_pieza_cocina";
    public static final String COLUMNA_NUMERO_TIPO_COMBUSTIBLE = "numero_tipo_combustible";
    public static final String COLUMNA_NUMERO_TIPO_PIEZA_BANO = "numero_tipo_pieza_bano";
    public static final String COLUMNA_NUMERO_TIPO_SERVICIO_SAN = "numero_tipo_servicio_san";
    public static final String COLUMNA_NUMERO_TIPO_SERVICIO_AGUA = "numero_tipo_servicio_agua";
    public static final String COLUMNA_NUMERO_TIPO_ABA_AGUA = "numero_tipo_aba_agua";
    public static final String COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC = "numero_siono_corriente_elec";
    public static final String COLUMNA_NUMERO_TIPO_DESECHO_BAS = "numero_tipo_desecho_bas";
    public static final String COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR = "numero_siono_telefono_celular";
    public static final String COLUMNA_NUMERO_TELEFONO_CELULAR = "numero_telefono_celular";
    public static final String COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA = "numero_siono_tlf_linea_baja";
    public static final String COLUMNA_NUMERO_TELEFONO_LINEA_BAJA = "numero_telefono_linea_baja";
    public static final String COLUMNA_NUMERO_SIONO_DISP_HELADERA = "numero_siono_disp_heladera";
    public static final String COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS = "numero_siono_disp_lavarropas";
    public static final String COLUMNA_NUMERO_SIONO_DISP_TERMO = "numero_siono_disp_termo";
    public static final String COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON = "numero_siono_disp_aire_acon";
    public static final String COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL = "numero_siono_disp_automovil";
    public static final String COLUMNA_NUMERO_SIONO_DISP_CAMION = "numero_siono_disp_camion";
    public static final String COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA = "numero_siono_disp_motocicleta";
    public static final String COLUMNA_NOMBRE_JEFE_HOGAR = "nombre_jefe_hogar";
    public static final String COLUMNA_NUMERO_CEDULA_JEFE_HOGAR = "numero_cedula_jefe_hogar";
    public static final String COLUMNA_LETRA_CEDULA_JEFE_HOGAR = "letra_cedula_jefe_hogar";
    public static final String COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR = "numero_orden_iden_jefe_hogar";
    public static final String COLUMNA_NOMBRE_RESPONDENTE = "nombre_respondente";
    public static final String COLUMNA_NUMERO_CEDULA_RESPONDENTE = "numero_cedula_respondente";
    public static final String COLUMNA_LETRA_CEDULA_RESPONDENTE = "letra_cedula_respondente";
    public static final String COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE = "numero_orden_iden_respondente";
    public static final String COLUMNA_ID_PROVEEDOR_DAT_EXT = "id_proveedor_dat_ext";
    public static final String COLUMNA_INDICE_CALIDAD_VIDA = "indice_calidad_vida";
    public static final String COLUMNA_ES_FICHA_HOGAR_INACTIVA = "es_ficha_hogar_inactiva";

    protected void setMapaTiposJava() {
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FICHA_HOGAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_VERSION_FICHA_HOGAR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CODIGO_FICHA_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FECHA_ENTREVISTA, Timestamp.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_CENSISTA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_SUPERVISOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_FUNCIONARIO_DIGITADOR, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OBSERVACIONES, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_HUSO_UTM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_FRANJA_UTM, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTANCIA_ESTE_UTM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DISTANCIA_NORTE_UTM, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_FORMULARIO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_VIVIENDA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DEPARTAMENTO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_DISTRITO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_AREA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_BARRIO, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_MANZANA, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_MANZANA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_DIRECCION, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TOTAL_PERSONAS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TOTAL_HOMBRES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_TOTAL_MUJERES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_MAT_PAREDES, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_MAT_PISO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_MAT_TECHO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_OTRO_TIPO_OCUPACION_VIV, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CANTIDAD_PIEZAS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_CANTIDAD_DORMITORIOS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_PIEZA_COCINA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_COMBUSTIBLE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_PIEZA_BANO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_SERVICIO_SAN, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_ABA_AGUA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TIPO_DESECHO_BAS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TELEFONO_CELULAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_HELADERA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_TERMO, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_CAMION, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_JEFE_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CEDULA_JEFE_HOGAR, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NOMBRE_RESPONDENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_CEDULA_RESPONDENTE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_LETRA_CEDULA_RESPONDENTE, String.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE, Integer.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ID_PROVEEDOR_DAT_EXT, Long.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_INDICE_CALIDAD_VIDA, BigDecimal.class);
        this.getRecursoCachedRowSet().getColumnTypes().put(COLUMNA_ES_FICHA_HOGAR_INACTIVA, Integer.class);
    }

    protected void setColumnasInsertables() {
        this.setColumnasInsertables(false);
        this.setColumnasInsertables(COLUMNA_ID_FICHA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_VERSION_FICHA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_CODIGO_FICHA_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_FECHA_ENTREVISTA, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_CENSISTA, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_SUPERVISOR, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO, true);
        this.setColumnasInsertables(COLUMNA_ID_FUNCIONARIO_DIGITADOR, true);
        this.setColumnasInsertables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasInsertables(COLUMNA_HUSO_UTM, true);
        this.setColumnasInsertables(COLUMNA_FRANJA_UTM, true);
        this.setColumnasInsertables(COLUMNA_DISTANCIA_ESTE_UTM, true);
        this.setColumnasInsertables(COLUMNA_DISTANCIA_NORTE_UTM, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_FORMULARIO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_VIVIENDA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasInsertables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasInsertables(COLUMNA_ID_BARRIO, true);
        this.setColumnasInsertables(COLUMNA_ID_MANZANA, true);
        this.setColumnasInsertables(COLUMNA_MANZANA, true);
        this.setColumnasInsertables(COLUMNA_DIRECCION, true);
        this.setColumnasInsertables(COLUMNA_TOTAL_PERSONAS, true);
        this.setColumnasInsertables(COLUMNA_TOTAL_HOMBRES, true);
        this.setColumnasInsertables(COLUMNA_TOTAL_MUJERES, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_MAT_PAREDES, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_MAT_PISO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_MAT_TECHO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, true);
        this.setColumnasInsertables(COLUMNA_OTRO_TIPO_OCUPACION_VIV, true);
        this.setColumnasInsertables(COLUMNA_CANTIDAD_PIEZAS, true);
        this.setColumnasInsertables(COLUMNA_CANTIDAD_DORMITORIOS, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_PIEZA_COCINA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_COMBUSTIBLE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_PIEZA_BANO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_SERVICIO_SAN, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_ABA_AGUA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TIPO_DESECHO_BAS, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TELEFONO_CELULAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_HELADERA, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_TERMO, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_CAMION, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_JEFE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CEDULA_JEFE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR, true);
        this.setColumnasInsertables(COLUMNA_NOMBRE_RESPONDENTE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_CEDULA_RESPONDENTE, true);
        this.setColumnasInsertables(COLUMNA_LETRA_CEDULA_RESPONDENTE, true);
        this.setColumnasInsertables(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE, true);
        this.setColumnasInsertables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasInsertables(COLUMNA_INDICE_CALIDAD_VIDA, true);
        this.setColumnasInsertables(COLUMNA_ES_FICHA_HOGAR_INACTIVA, true);
    }

    protected void setColumnasModificables() {
        this.setColumnasModificables(false);
        this.setColumnasModificables(COLUMNA_ID_FICHA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_VERSION_FICHA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_CODIGO_FICHA_HOGAR, true);
        this.setColumnasModificables(COLUMNA_FECHA_ENTREVISTA, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_CENSISTA, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_SUPERVISOR, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO, true);
        this.setColumnasModificables(COLUMNA_ID_FUNCIONARIO_DIGITADOR, true);
        this.setColumnasModificables(COLUMNA_OBSERVACIONES, true);
        this.setColumnasModificables(COLUMNA_HUSO_UTM, true);
        this.setColumnasModificables(COLUMNA_FRANJA_UTM, true);
        this.setColumnasModificables(COLUMNA_DISTANCIA_ESTE_UTM, true);
        this.setColumnasModificables(COLUMNA_DISTANCIA_NORTE_UTM, true);
        this.setColumnasModificables(COLUMNA_NUMERO_FORMULARIO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_VIVIENDA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_HOGAR, true);
        this.setColumnasModificables(COLUMNA_ID_DEPARTAMENTO, true);
        this.setColumnasModificables(COLUMNA_ID_DISTRITO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_AREA, true);
        this.setColumnasModificables(COLUMNA_ID_BARRIO, true);
        this.setColumnasModificables(COLUMNA_ID_MANZANA, true);
        this.setColumnasModificables(COLUMNA_MANZANA, true);
        this.setColumnasModificables(COLUMNA_DIRECCION, true);
        this.setColumnasModificables(COLUMNA_TOTAL_PERSONAS, true);
        this.setColumnasModificables(COLUMNA_TOTAL_HOMBRES, true);
        this.setColumnasModificables(COLUMNA_TOTAL_MUJERES, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_MAT_PAREDES, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_MAT_PISO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_MAT_TECHO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, true);
        this.setColumnasModificables(COLUMNA_OTRO_TIPO_OCUPACION_VIV, true);
        this.setColumnasModificables(COLUMNA_CANTIDAD_PIEZAS, true);
        this.setColumnasModificables(COLUMNA_CANTIDAD_DORMITORIOS, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_PIEZA_COCINA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_COMBUSTIBLE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_PIEZA_BANO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_SERVICIO_SAN, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_ABA_AGUA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TIPO_DESECHO_BAS, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TELEFONO_CELULAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_TELEFONO_LINEA_BAJA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_HELADERA, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_TERMO, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_CAMION, true);
        this.setColumnasModificables(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_JEFE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_LETRA_CEDULA_JEFE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR, true);
        this.setColumnasModificables(COLUMNA_NOMBRE_RESPONDENTE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_CEDULA_RESPONDENTE, true);
        this.setColumnasModificables(COLUMNA_LETRA_CEDULA_RESPONDENTE, true);
        this.setColumnasModificables(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE, true);
        this.setColumnasModificables(COLUMNA_ID_PROVEEDOR_DAT_EXT, true);
        this.setColumnasModificables(COLUMNA_INDICE_CALIDAD_VIDA, true);
        this.setColumnasModificables(COLUMNA_ES_FICHA_HOGAR_INACTIVA, true);
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

    public Long getVersionFichaHogar() {
        return (Long) super.getValue(COLUMNA_VERSION_FICHA_HOGAR);
    }
    public Long getVersionFichaHogar(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_VERSION_FICHA_HOGAR, rowKey);
    }
    public void setVersionFichaHogar(Long valor) {
        super.setValue(COLUMNA_VERSION_FICHA_HOGAR, valor);
    }
    public void setVersionFichaHogar(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_VERSION_FICHA_HOGAR, rowKey, valor);
    }

    public String getCodigoFichaHogar() {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_HOGAR);
    }
    public String getCodigoFichaHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_CODIGO_FICHA_HOGAR, rowKey);
    }
    public void setCodigoFichaHogar(String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_HOGAR, valor);
    }
    public void setCodigoFichaHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_CODIGO_FICHA_HOGAR, rowKey, valor);
    }

    public Timestamp getFechaEntrevista() {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ENTREVISTA);
    }
    public Timestamp getFechaEntrevista(RowKey rowKey) {
        return (Timestamp) super.getValue(COLUMNA_FECHA_ENTREVISTA, rowKey);
    }
    public void setFechaEntrevista(Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ENTREVISTA, valor);
    }
    public void setFechaEntrevista(RowKey rowKey, Timestamp valor) {
        super.setValue(COLUMNA_FECHA_ENTREVISTA, rowKey, valor);
    }

    public Long getIdFuncionarioCensista() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_CENSISTA);
    }
    public Long getIdFuncionarioCensista(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_CENSISTA, rowKey);
    }
    public void setIdFuncionarioCensista(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_CENSISTA, valor);
    }
    public void setIdFuncionarioCensista(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_CENSISTA, rowKey, valor);
    }

    public Long getIdFuncionarioSupervisor() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_SUPERVISOR);
    }
    public Long getIdFuncionarioSupervisor(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_SUPERVISOR, rowKey);
    }
    public void setIdFuncionarioSupervisor(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_SUPERVISOR, valor);
    }
    public void setIdFuncionarioSupervisor(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_SUPERVISOR, rowKey, valor);
    }

    public Long getIdFuncionarioCriticoDeco() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO);
    }
    public Long getIdFuncionarioCriticoDeco(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO, rowKey);
    }
    public void setIdFuncionarioCriticoDeco(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO, valor);
    }
    public void setIdFuncionarioCriticoDeco(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_CRITICO_DECO, rowKey, valor);
    }

    public Long getIdFuncionarioDigitador() {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_DIGITADOR);
    }
    public Long getIdFuncionarioDigitador(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_FUNCIONARIO_DIGITADOR, rowKey);
    }
    public void setIdFuncionarioDigitador(Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_DIGITADOR, valor);
    }
    public void setIdFuncionarioDigitador(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_FUNCIONARIO_DIGITADOR, rowKey, valor);
    }

    public String getObservaciones() {
        return (String) super.getValue(COLUMNA_OBSERVACIONES);
    }
    public String getObservaciones(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OBSERVACIONES, rowKey);
    }
    public void setObservaciones(String valor) {
        super.setValue(COLUMNA_OBSERVACIONES, valor);
    }
    public void setObservaciones(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OBSERVACIONES, rowKey, valor);
    }

    public Integer getHusoUtm() {
        return (Integer) super.getValue(COLUMNA_HUSO_UTM);
    }
    public Integer getHusoUtm(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_HUSO_UTM, rowKey);
    }
    public void setHusoUtm(Integer valor) {
        super.setValue(COLUMNA_HUSO_UTM, valor);
    }
    public void setHusoUtm(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_HUSO_UTM, rowKey, valor);
    }

    public String getFranjaUtm() {
        return (String) super.getValue(COLUMNA_FRANJA_UTM);
    }
    public String getFranjaUtm(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_FRANJA_UTM, rowKey);
    }
    public void setFranjaUtm(String valor) {
        super.setValue(COLUMNA_FRANJA_UTM, valor);
    }
    public void setFranjaUtm(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_FRANJA_UTM, rowKey, valor);
    }

    public Integer getDistanciaEsteUtm() {
        return (Integer) super.getValue(COLUMNA_DISTANCIA_ESTE_UTM);
    }
    public Integer getDistanciaEsteUtm(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_DISTANCIA_ESTE_UTM, rowKey);
    }
    public void setDistanciaEsteUtm(Integer valor) {
        super.setValue(COLUMNA_DISTANCIA_ESTE_UTM, valor);
    }
    public void setDistanciaEsteUtm(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_DISTANCIA_ESTE_UTM, rowKey, valor);
    }

    public Integer getDistanciaNorteUtm() {
        return (Integer) super.getValue(COLUMNA_DISTANCIA_NORTE_UTM);
    }
    public Integer getDistanciaNorteUtm(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_DISTANCIA_NORTE_UTM, rowKey);
    }
    public void setDistanciaNorteUtm(Integer valor) {
        super.setValue(COLUMNA_DISTANCIA_NORTE_UTM, valor);
    }
    public void setDistanciaNorteUtm(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_DISTANCIA_NORTE_UTM, rowKey, valor);
    }

    public Integer getNumeroFormulario() {
        return (Integer) super.getValue(COLUMNA_NUMERO_FORMULARIO);
    }
    public Integer getNumeroFormulario(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_FORMULARIO, rowKey);
    }
    public void setNumeroFormulario(Integer valor) {
        super.setValue(COLUMNA_NUMERO_FORMULARIO, valor);
    }
    public void setNumeroFormulario(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_FORMULARIO, rowKey, valor);
    }

    public Integer getNumeroVivienda() {
        return (Integer) super.getValue(COLUMNA_NUMERO_VIVIENDA);
    }
    public Integer getNumeroVivienda(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_VIVIENDA, rowKey);
    }
    public void setNumeroVivienda(Integer valor) {
        super.setValue(COLUMNA_NUMERO_VIVIENDA, valor);
    }
    public void setNumeroVivienda(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_VIVIENDA, rowKey, valor);
    }

    public Integer getNumeroHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_HOGAR);
    }
    public Integer getNumeroHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_HOGAR, rowKey);
    }
    public void setNumeroHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_HOGAR, valor);
    }
    public void setNumeroHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_HOGAR, rowKey, valor);
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

    public Integer getTotalPersonas() {
        return (Integer) super.getValue(COLUMNA_TOTAL_PERSONAS);
    }
    public Integer getTotalPersonas(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_TOTAL_PERSONAS, rowKey);
    }
    public void setTotalPersonas(Integer valor) {
        super.setValue(COLUMNA_TOTAL_PERSONAS, valor);
    }
    public void setTotalPersonas(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_TOTAL_PERSONAS, rowKey, valor);
    }

    public Integer getTotalHombres() {
        return (Integer) super.getValue(COLUMNA_TOTAL_HOMBRES);
    }
    public Integer getTotalHombres(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_TOTAL_HOMBRES, rowKey);
    }
    public void setTotalHombres(Integer valor) {
        super.setValue(COLUMNA_TOTAL_HOMBRES, valor);
    }
    public void setTotalHombres(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_TOTAL_HOMBRES, rowKey, valor);
    }

    public Integer getTotalMujeres() {
        return (Integer) super.getValue(COLUMNA_TOTAL_MUJERES);
    }
    public Integer getTotalMujeres(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_TOTAL_MUJERES, rowKey);
    }
    public void setTotalMujeres(Integer valor) {
        super.setValue(COLUMNA_TOTAL_MUJERES, valor);
    }
    public void setTotalMujeres(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_TOTAL_MUJERES, rowKey, valor);
    }

    public Integer getNumeroTipoMatParedes() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES);
    }
    public Integer getNumeroTipoMatParedes(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES, rowKey);
    }
    public void setNumeroTipoMatParedes(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES, valor);
    }
    public void setNumeroTipoMatParedes(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PAREDES, rowKey, valor);
    }

    public Integer getNumeroTipoMatPiso() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PISO);
    }
    public Integer getNumeroTipoMatPiso(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_PISO, rowKey);
    }
    public void setNumeroTipoMatPiso(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PISO, valor);
    }
    public void setNumeroTipoMatPiso(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_PISO, rowKey, valor);
    }

    public Integer getNumeroTipoMatTecho() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_TECHO);
    }
    public Integer getNumeroTipoMatTecho(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_MAT_TECHO, rowKey);
    }
    public void setNumeroTipoMatTecho(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_TECHO, valor);
    }
    public void setNumeroTipoMatTecho(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_MAT_TECHO, rowKey, valor);
    }

    public Integer getNumeroTipoOcupacionViv() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV);
    }
    public Integer getNumeroTipoOcupacionViv(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, rowKey);
    }
    public void setNumeroTipoOcupacionViv(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, valor);
    }
    public void setNumeroTipoOcupacionViv(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_OCUPACION_VIV, rowKey, valor);
    }

    public String getOtroTipoOcupacionViv() {
        return (String) super.getValue(COLUMNA_OTRO_TIPO_OCUPACION_VIV);
    }
    public String getOtroTipoOcupacionViv(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_OTRO_TIPO_OCUPACION_VIV, rowKey);
    }
    public void setOtroTipoOcupacionViv(String valor) {
        super.setValue(COLUMNA_OTRO_TIPO_OCUPACION_VIV, valor);
    }
    public void setOtroTipoOcupacionViv(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_OTRO_TIPO_OCUPACION_VIV, rowKey, valor);
    }

    public Integer getCantidadPiezas() {
        return (Integer) super.getValue(COLUMNA_CANTIDAD_PIEZAS);
    }
    public Integer getCantidadPiezas(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_CANTIDAD_PIEZAS, rowKey);
    }
    public void setCantidadPiezas(Integer valor) {
        super.setValue(COLUMNA_CANTIDAD_PIEZAS, valor);
    }
    public void setCantidadPiezas(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_CANTIDAD_PIEZAS, rowKey, valor);
    }

    public Integer getCantidadDormitorios() {
        return (Integer) super.getValue(COLUMNA_CANTIDAD_DORMITORIOS);
    }
    public Integer getCantidadDormitorios(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_CANTIDAD_DORMITORIOS, rowKey);
    }
    public void setCantidadDormitorios(Integer valor) {
        super.setValue(COLUMNA_CANTIDAD_DORMITORIOS, valor);
    }
    public void setCantidadDormitorios(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_CANTIDAD_DORMITORIOS, rowKey, valor);
    }

    public Integer getNumeroSionoPiezaCocina() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_PIEZA_COCINA);
    }
    public Integer getNumeroSionoPiezaCocina(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_PIEZA_COCINA, rowKey);
    }
    public void setNumeroSionoPiezaCocina(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_PIEZA_COCINA, valor);
    }
    public void setNumeroSionoPiezaCocina(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_PIEZA_COCINA, rowKey, valor);
    }

    public Integer getNumeroTipoCombustible() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_COMBUSTIBLE);
    }
    public Integer getNumeroTipoCombustible(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_COMBUSTIBLE, rowKey);
    }
    public void setNumeroTipoCombustible(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_COMBUSTIBLE, valor);
    }
    public void setNumeroTipoCombustible(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_COMBUSTIBLE, rowKey, valor);
    }

    public Integer getNumeroTipoPiezaBano() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO);
    }
    public Integer getNumeroTipoPiezaBano(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO, rowKey);
    }
    public void setNumeroTipoPiezaBano(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO, valor);
    }
    public void setNumeroTipoPiezaBano(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_PIEZA_BANO, rowKey, valor);
    }

    public Integer getNumeroTipoServicioSan() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SERVICIO_SAN);
    }
    public Integer getNumeroTipoServicioSan(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SERVICIO_SAN, rowKey);
    }
    public void setNumeroTipoServicioSan(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SERVICIO_SAN, valor);
    }
    public void setNumeroTipoServicioSan(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SERVICIO_SAN, rowKey, valor);
    }

    public Integer getNumeroTipoServicioAgua() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA);
    }
    public Integer getNumeroTipoServicioAgua(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, rowKey);
    }
    public void setNumeroTipoServicioAgua(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, valor);
    }
    public void setNumeroTipoServicioAgua(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_SERVICIO_AGUA, rowKey, valor);
    }

    public Integer getNumeroTipoAbaAgua() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ABA_AGUA);
    }
    public Integer getNumeroTipoAbaAgua(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_ABA_AGUA, rowKey);
    }
    public void setNumeroTipoAbaAgua(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ABA_AGUA, valor);
    }
    public void setNumeroTipoAbaAgua(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_ABA_AGUA, rowKey, valor);
    }

    public Integer getNumeroSionoCorrienteElec() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC);
    }
    public Integer getNumeroSionoCorrienteElec(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC, rowKey);
    }
    public void setNumeroSionoCorrienteElec(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC, valor);
    }
    public void setNumeroSionoCorrienteElec(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_CORRIENTE_ELEC, rowKey, valor);
    }

    public Integer getNumeroTipoDesechoBas() {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DESECHO_BAS);
    }
    public Integer getNumeroTipoDesechoBas(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_TIPO_DESECHO_BAS, rowKey);
    }
    public void setNumeroTipoDesechoBas(Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DESECHO_BAS, valor);
    }
    public void setNumeroTipoDesechoBas(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_TIPO_DESECHO_BAS, rowKey, valor);
    }

    public Integer getNumeroSionoTelefonoCelular() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR);
    }
    public Integer getNumeroSionoTelefonoCelular(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR, rowKey);
    }
    public void setNumeroSionoTelefonoCelular(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR, valor);
    }
    public void setNumeroSionoTelefonoCelular(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_TELEFONO_CELULAR, rowKey, valor);
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

    public Integer getNumeroSionoTlfLineaBaja() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA);
    }
    public Integer getNumeroSionoTlfLineaBaja(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA, rowKey);
    }
    public void setNumeroSionoTlfLineaBaja(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA, valor);
    }
    public void setNumeroSionoTlfLineaBaja(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_TLF_LINEA_BAJA, rowKey, valor);
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

    public Integer getNumeroSionoDispHeladera() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_HELADERA);
    }
    public Integer getNumeroSionoDispHeladera(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_HELADERA, rowKey);
    }
    public void setNumeroSionoDispHeladera(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_HELADERA, valor);
    }
    public void setNumeroSionoDispHeladera(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_HELADERA, rowKey, valor);
    }

    public Integer getNumeroSionoDispLavarropas() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS);
    }
    public Integer getNumeroSionoDispLavarropas(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS, rowKey);
    }
    public void setNumeroSionoDispLavarropas(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS, valor);
    }
    public void setNumeroSionoDispLavarropas(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_LAVARROPAS, rowKey, valor);
    }

    public Integer getNumeroSionoDispTermo() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_TERMO);
    }
    public Integer getNumeroSionoDispTermo(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_TERMO, rowKey);
    }
    public void setNumeroSionoDispTermo(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_TERMO, valor);
    }
    public void setNumeroSionoDispTermo(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_TERMO, rowKey, valor);
    }

    public Integer getNumeroSionoDispAireAcon() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON);
    }
    public Integer getNumeroSionoDispAireAcon(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON, rowKey);
    }
    public void setNumeroSionoDispAireAcon(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON, valor);
    }
    public void setNumeroSionoDispAireAcon(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_AIRE_ACON, rowKey, valor);
    }

    public Integer getNumeroSionoDispAutomovil() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL);
    }
    public Integer getNumeroSionoDispAutomovil(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL, rowKey);
    }
    public void setNumeroSionoDispAutomovil(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL, valor);
    }
    public void setNumeroSionoDispAutomovil(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_AUTOMOVIL, rowKey, valor);
    }

    public Integer getNumeroSionoDispCamion() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_CAMION);
    }
    public Integer getNumeroSionoDispCamion(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_CAMION, rowKey);
    }
    public void setNumeroSionoDispCamion(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_CAMION, valor);
    }
    public void setNumeroSionoDispCamion(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_CAMION, rowKey, valor);
    }

    public Integer getNumeroSionoDispMotocicleta() {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA);
    }
    public Integer getNumeroSionoDispMotocicleta(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA, rowKey);
    }
    public void setNumeroSionoDispMotocicleta(Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA, valor);
    }
    public void setNumeroSionoDispMotocicleta(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_SIONO_DISP_MOTOCICLETA, rowKey, valor);
    }

    public String getNombreJefeHogar() {
        return (String) super.getValue(COLUMNA_NOMBRE_JEFE_HOGAR);
    }
    public String getNombreJefeHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_JEFE_HOGAR, rowKey);
    }
    public void setNombreJefeHogar(String valor) {
        super.setValue(COLUMNA_NOMBRE_JEFE_HOGAR, valor);
    }
    public void setNombreJefeHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_JEFE_HOGAR, rowKey, valor);
    }

    public Integer getNumeroCedulaJefeHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR);
    }
    public Integer getNumeroCedulaJefeHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR, rowKey);
    }
    public void setNumeroCedulaJefeHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR, valor);
    }
    public void setNumeroCedulaJefeHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA_JEFE_HOGAR, rowKey, valor);
    }

    public String getLetraCedulaJefeHogar() {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA_JEFE_HOGAR);
    }
    public String getLetraCedulaJefeHogar(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA_JEFE_HOGAR, rowKey);
    }
    public void setLetraCedulaJefeHogar(String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA_JEFE_HOGAR, valor);
    }
    public void setLetraCedulaJefeHogar(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA_JEFE_HOGAR, rowKey, valor);
    }

    public Integer getNumeroOrdenIdenJefeHogar() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR);
    }
    public Integer getNumeroOrdenIdenJefeHogar(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR, rowKey);
    }
    public void setNumeroOrdenIdenJefeHogar(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR, valor);
    }
    public void setNumeroOrdenIdenJefeHogar(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_JEFE_HOGAR, rowKey, valor);
    }

    public String getNombreRespondente() {
        return (String) super.getValue(COLUMNA_NOMBRE_RESPONDENTE);
    }
    public String getNombreRespondente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_NOMBRE_RESPONDENTE, rowKey);
    }
    public void setNombreRespondente(String valor) {
        super.setValue(COLUMNA_NOMBRE_RESPONDENTE, valor);
    }
    public void setNombreRespondente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_NOMBRE_RESPONDENTE, rowKey, valor);
    }

    public Integer getNumeroCedulaRespondente() {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA_RESPONDENTE);
    }
    public Integer getNumeroCedulaRespondente(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_CEDULA_RESPONDENTE, rowKey);
    }
    public void setNumeroCedulaRespondente(Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA_RESPONDENTE, valor);
    }
    public void setNumeroCedulaRespondente(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_CEDULA_RESPONDENTE, rowKey, valor);
    }

    public String getLetraCedulaRespondente() {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA_RESPONDENTE);
    }
    public String getLetraCedulaRespondente(RowKey rowKey) {
        return (String) super.getValue(COLUMNA_LETRA_CEDULA_RESPONDENTE, rowKey);
    }
    public void setLetraCedulaRespondente(String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA_RESPONDENTE, valor);
    }
    public void setLetraCedulaRespondente(RowKey rowKey, String valor) {
        super.setValue(COLUMNA_LETRA_CEDULA_RESPONDENTE, rowKey, valor);
    }

    public Integer getNumeroOrdenIdenRespondente() {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE);
    }
    public Integer getNumeroOrdenIdenRespondente(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE, rowKey);
    }
    public void setNumeroOrdenIdenRespondente(Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE, valor);
    }
    public void setNumeroOrdenIdenRespondente(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_NUMERO_ORDEN_IDEN_RESPONDENTE, rowKey, valor);
    }

    public Long getIdProveedorDatExt() {
        return (Long) super.getValue(COLUMNA_ID_PROVEEDOR_DAT_EXT);
    }
    public Long getIdProveedorDatExt(RowKey rowKey) {
        return (Long) super.getValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, rowKey);
    }
    public void setIdProveedorDatExt(Long valor) {
        super.setValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, valor);
    }
    public void setIdProveedorDatExt(RowKey rowKey, Long valor) {
        super.setValue(COLUMNA_ID_PROVEEDOR_DAT_EXT, rowKey, valor);
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

    public Integer getEsFichaHogarInactiva() {
        return (Integer) super.getValue(COLUMNA_ES_FICHA_HOGAR_INACTIVA);
    }
    public Integer getEsFichaHogarInactiva(RowKey rowKey) {
        return (Integer) super.getValue(COLUMNA_ES_FICHA_HOGAR_INACTIVA, rowKey);
    }
    public void setEsFichaHogarInactiva(Integer valor) {
        super.setValue(COLUMNA_ES_FICHA_HOGAR_INACTIVA, valor);
    }
    public void setEsFichaHogarInactiva(RowKey rowKey, Integer valor) {
        super.setValue(COLUMNA_ES_FICHA_HOGAR_INACTIVA, rowKey, valor);
    }

    public static final String COLUMNA_IDENTIFICACION_RECURSO = "id_ficha_hogar";
    public static final String COLUMNA_VERSION_RECURSO = "version_ficha_hogar";
    public static final String COLUMNA_CODIGO_RECURSO = "codigo_ficha_hogar";
    public static final String COLUMNA_ES_RECURSO_INACTIVO = "es_ficha_hogar_inactiva";

    public static final String ETIQUETA_IDENTIFICACION_RECURSO = "Identificacion";
    public static final String ETIQUETA_VERSION_RECURSO = "Version";
    public static final String ETIQUETA_CODIGO_RECURSO = "Codigo";
    public static final String ETIQUETA_ES_RECURSO_INACTIVO = "Ficha Hogar Inactiva";

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
    public String getEtiquetaEsRecursoInactivo() {
        return ETIQUETA_ES_RECURSO_INACTIVO;
    }

    @Override
    public Long getIdentificacionRecurso() {
        return this.getIdFichaHogar();
    }
    @Override
    public Long getIdentificacionRecurso(RowKey rowKey) {
        return this.getIdFichaHogar(rowKey);
    }
    @Override
    public void setIdentificacionRecurso(Long identificacionRecurso) {
        this.setIdFichaHogar(identificacionRecurso);
    }
    @Override
    public void setIdentificacionRecurso(RowKey rowKey, Long identificacionRecurso) {
        this.setIdFichaHogar(rowKey, identificacionRecurso);
    }

    @Override
    public Long getVersionRecurso() {
        return this.getVersionFichaHogar();
    }
    @Override
    public Long getVersionRecurso(RowKey rowKey) {
        return this.getVersionFichaHogar(rowKey);
    }
    @Override
    public void setVersionRecurso(Long versionRecurso) {
        this.setVersionFichaHogar(versionRecurso);
    }
    @Override
    public void setVersionRecurso(RowKey rowKey, Long versionRecurso) {
        this.setVersionFichaHogar(rowKey, versionRecurso);
    }

    @Override
    public String getCodigoRecurso() {
        return this.getCodigoFichaHogar();
    }
    @Override
    public String getCodigoRecurso(RowKey rowKey) {
        return this.getCodigoFichaHogar(rowKey);
    }
    @Override
    public void setCodigoRecurso(String codigoRecurso) {
        this.setCodigoFichaHogar(codigoRecurso);
    }
    @Override
    public void setCodigoRecurso(RowKey rowKey, String codigoRecurso) {
        this.setCodigoFichaHogar(rowKey, codigoRecurso);
    }

    @Override
    public Integer getEsRecursoInactivo() {
        return this.getEsFichaHogarInactiva();
    }
    @Override
    public Integer getEsRecursoInactivo(RowKey rowKey) {
        return this.getEsFichaHogarInactiva(rowKey);
    }
    @Override
    public void setEsRecursoInactivo(Integer esRecursoInactivo) {
        this.setEsFichaHogarInactiva(esRecursoInactivo);
    }
    @Override
    public void setEsRecursoInactivo(RowKey rowKey, Integer esRecursoInactivo) {
        this.setEsFichaHogarInactiva(rowKey, esRecursoInactivo);
    }
}
