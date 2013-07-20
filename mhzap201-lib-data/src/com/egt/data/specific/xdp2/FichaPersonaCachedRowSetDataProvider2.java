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
import com.egt.data.specific.xdp1.FichaPersonaCachedRowSetDataProvider;
import com.sun.data.provider.RowKey;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;
import javax.sql.rowset.CachedRowSet;

public class FichaPersonaCachedRowSetDataProvider2 extends FichaPersonaCachedRowSetDataProvider
        implements RecursoConsultableDataProvider {

    public FichaPersonaCachedRowSetDataProvider2() {
        super();
    }

    public FichaPersonaCachedRowSetDataProvider2(CachedRowSet cachedRowSet) {
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

    public static final long FUNCION_CONSULTAR_RECURSO = 320200101L;

    public static final long FUNCION_VINCULAR_FICHA_PERSONA = 320200151L;
    public static final long FUNCION_DESVINCULAR_FICHA_PERSONA = 320200152L;
    public static final long FUNCION_CONSULTAR_FICHA_PERSONA = 320200101L;
    public static final long FUNCION_EMITIR_FICHA_PERSONA_IMPORTADA = 320200153L;
    public static final long FUNCION_EMITIR_FICHA_PERSONA_NO_IMPORTADA = 320200154L;
    public static final long FUNCION_CREAR_FICHA_PERSONA = 320200102L;
    public static final long FUNCION_MODIFICAR_FICHA_PERSONA = 320200103L;
    public static final long FUNCION_ELIMINAR_FICHA_PERSONA = 320200104L;

    public static final String PROCESO_FUNCION_VINCULAR_FICHA_PERSONA = "ficha_persona_vincular";
    public static final String PROCESO_FUNCION_DESVINCULAR_FICHA_PERSONA = "ficha_persona_desvincular";

    public static final String INFORME_FUNCION_EMITIR_FICHA_PERSONA_IMPORTADA = "ficha_persona_importada";
    public static final String INFORME_FUNCION_EMITIR_FICHA_PERSONA_NO_IMPORTADA = "ficha_persona_no_importada";

    protected static final long PARAMETRO_ID_FICHA_PERSONA = 20342L;
    protected static final long PARAMETRO_ID_POTENCIAL_BEN = 20571L;
    protected static final long PARAMETRO_VERSION_FICHA_PERSONA = 20443L;
    protected static final long PARAMETRO_CODIGO_FICHA_PERSONA = 20451L;
    protected static final long PARAMETRO_NOMBRE_FICHA_PERSONA = 20552L;
    protected static final long PARAMETRO_ES_RESPONDENTE = 20445L;
    protected static final long PARAMETRO_ID_FICHA_HOGAR = 20341L;
    protected static final long PARAMETRO_NUMERO_ORDEN_IDENTIFICACION = 20376L;
    protected static final long PARAMETRO_PRIMER_NOMBRE = 20104L;
    protected static final long PARAMETRO_SEGUNDO_NOMBRE = 20107L;
    protected static final long PARAMETRO_PRIMER_APELLIDO = 20103L;
    protected static final long PARAMETRO_SEGUNDO_APELLIDO = 20106L;
    protected static final long PARAMETRO_APELLIDO_CASADA = 20006L;
    protected static final long PARAMETRO_APODO = 20576L;
    protected static final long PARAMETRO_EDAD = 20578L;
    protected static final long PARAMETRO_NUMERO_SEXO_PERSONA = 20099L;
    protected static final long PARAMETRO_NUMERO_ESTADO_CIVIL = 20171L;
    protected static final long PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR = 20424L;
    protected static final long PARAMETRO_NUMERO_SIONO_MIEMBRO_HOGAR = 20402L;
    protected static final long PARAMETRO_NUMERO_ORDEN_IDEN_CONYUGE = 20377L;
    protected static final long PARAMETRO_NUMERO_ORDEN_IDEN_PADRE = 20379L;
    protected static final long PARAMETRO_NUMERO_ORDEN_IDEN_MADRE = 20378L;
    protected static final long PARAMETRO_NUMERO_CEDULA = 20603L;
    protected static final long PARAMETRO_LETRA_CEDULA = 20602L;
    protected static final long PARAMETRO_NUMERO_TIPO_EXCEPCION_CED = 20418L;
    protected static final long PARAMETRO_FECHA_NACIMIENTO = 20067L;
    protected static final long PARAMETRO_ID_DEPARTAMENTO_NACIMIENTO = 20597L;
    protected static final long PARAMETRO_ID_DISTRITO_NACIMIENTO = 20598L;
    protected static final long PARAMETRO_NUMERO_TIPO_AREA_LUGAR_NAC = 20413L;
    protected static final long PARAMETRO_NUMERO_IDIOMA_HOGAR = 20371L;
    protected static final long PARAMETRO_OTRO_IDIOMA_HOGAR = 20434L;
    protected static final long PARAMETRO_NUMERO_SIONO_ASISTENCIA_ESC = 20383L;
    protected static final long PARAMETRO_NUMERO_MOTIVO_INA_ESC = 20608L;
    protected static final long PARAMETRO_OTRO_MOTIVO_INA_ESC = 20616L;
    protected static final long PARAMETRO_NUMERO_SIONO_MATRICULACION_ESC = 20401L;
    protected static final long PARAMETRO_ULTIMO_CURSO_APROBADO = 20611L;
    protected static final long PARAMETRO_NUMERO_NIVEL_EDU_ULT_CUR_APROB = 20610L;
    protected static final long PARAMETRO_NUMERO_SIONO_CURSO_NO_FORMAL = 20387L;
    protected static final long PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO = 20426L;
    protected static final long PARAMETRO_NUMERO_ESTADO_SALUD = 20368L;
    protected static final long PARAMETRO_NUMERO_CLASE_ENF_ACC = 20605L;
    protected static final long PARAMETRO_OTRA_CLASE_ENF_ACC = 20613L;
    protected static final long PARAMETRO_NUMERO_CLASE_ENF_CRONICA = 20606L;
    protected static final long PARAMETRO_OTRA_CLASE_ENF_CRONICA = 20614L;
    protected static final long PARAMETRO_NUMERO_SIONO_ATENCION_MEDICA = 20384L;
    protected static final long PARAMETRO_NUMERO_MOTIVO_NO_ATENCION = 20373L;
    protected static final long PARAMETRO_OTRO_MOTIVO_NO_ATENCION = 20435L;
    protected static final long PARAMETRO_NUMERO_SIONO_CARNET_VACUNACION = 20385L;
    protected static final long PARAMETRO_NUMERO_CLASE_IMPEDIMENTO = 20607L;
    protected static final long PARAMETRO_OTRA_CLASE_IMPEDIMENTO = 20615L;
    protected static final long PARAMETRO_NUMERO_CAUSA_IMPEDIMENTO = 20604L;
    protected static final long PARAMETRO_OTRA_CAUSA_IMPEDIMENTO = 20612L;
    protected static final long PARAMETRO_NUMERO_SIONO_DIF_PARA_CAMINAR = 20389L;
    protected static final long PARAMETRO_NUMERO_SIONO_DIF_PARA_VESTIRSE = 20393L;
    protected static final long PARAMETRO_NUMERO_SIONO_DIF_PARA_BANARSE = 20388L;
    protected static final long PARAMETRO_NUMERO_SIONO_DIF_PARA_COMER = 20390L;
    protected static final long PARAMETRO_NUMERO_SIONO_DIF_PARA_LA_CAMA = 20392L;
    protected static final long PARAMETRO_NUMERO_SIONO_DIF_PARA_EL_BANO = 20391L;
    protected static final long PARAMETRO_NUMERO_SIONO_TRABAJO = 20407L;
    protected static final long PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO = 20374L;
    protected static final long PARAMETRO_OTRO_MOTIVO_NO_TRABAJO = 20436L;
    protected static final long PARAMETRO_DESCRIPCION_OCUPACION_PRIN = 20325L;
    protected static final long PARAMETRO_DESCRIPCION_DEDICACION_PRIN = 20324L;
    protected static final long PARAMETRO_NUMERO_TIPO_RELACION_LAB = 20425L;
    protected static final long PARAMETRO_MONTO_INGRESO_OCUPACION_PRIN = 20354L;
    protected static final long PARAMETRO_MONTO_INGRESO_OCUPACION_SECUN = 20355L;
    protected static final long PARAMETRO_MONTO_INGRESO_OTRAS_OCUP = 20356L;
    protected static final long PARAMETRO_MONTO_INGRESO_ALQUILERES = 20349L;
    protected static final long PARAMETRO_MONTO_INGRESO_INTERESES = 20352L;
    protected static final long PARAMETRO_MONTO_INGRESO_AYUDA_FAM_PAIS = 20351L;
    protected static final long PARAMETRO_MONTO_INGRESO_AYUDA_FAM_EXTER = 20350L;
    protected static final long PARAMETRO_MONTO_INGRESO_JUBILACION = 20353L;
    protected static final long PARAMETRO_MONTO_INGRESO_PENSIONES = 20357L;
    protected static final long PARAMETRO_MONTO_INGRESO_TEKOPORA = 20359L;
    protected static final long PARAMETRO_MONTO_INGRESO_PROGRAMAS = 20358L;
    protected static final long PARAMETRO_MONTO_INGRESO_ADICIONAL = 20348L;
    protected static final long PARAMETRO_TOTAL_INGRESO_MENSUAL = 20439L;
    protected static final long PARAMETRO_ES_FICHA_PERSONA_INACTIVA = 20600L;
    protected static final long PARAMETRO_ES_FICHA_PERSONA_IMPORTADA = 21006L;
    protected static final long PARAMETRO_FECHA_IMPORTACION = 21008L;
    protected static final long PARAMETRO_ID_DEPARTAMENTO = 20336L;
    protected static final long PARAMETRO_ID_DISTRITO = 20339L;
    protected static final long PARAMETRO_ID_BARRIO = 20333L;
    protected static final long PARAMETRO_FECHA_IMPORTACION_DESDE = 10019L;
    protected static final long PARAMETRO_FECHA_IMPORTACION_HASTA = 10020L;
    protected static final long PARAMETRO_ARCHIVO = 1021L;

    public static final long FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN = 320400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_OPCION_BINARIA = 100100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_FICHA_HOGAR = 320100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_SEXO_PERSONA = 201200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_ESTADO_CIVIL = 201100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_PERSONA_HOGAR = 323300101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_SIONO = 322000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_EXCEPCION_CED = 322700101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_UBICACION = 202000101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_AREA = 322200101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_IDIOMA_HOGAR = 321600101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_MOTIVO_INA_ESC = 321700101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_NIVEL_EDUCATIVO = 321100101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_SEGURO_MEDICO = 323500101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_ESTADO_SALUD = 321500101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_ENF_ACC = 322500101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_ENF_CRONICA = 322600101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_MOTIVO_NO_ATENCION = 321800101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CLASE_IMPEDIMENTO = 322800101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_CAUSA_IMPEDIMENTO = 321400101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_MOTIVO_NO_TRABAJO = 321900101L;
    public static final long FUNCION_REFERENCIA_CONSULTAR_TIPO_RELACION_LAB = 323400101L;

    private static final String[] STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN = {"potencial_ben", "id_potencial_ben", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_OPCION_BINARIA = {"opcion_binaria", "numero_opcion_binaria", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_FICHA_HOGAR = {"ficha_hogar", "id_ficha_hogar", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_SEXO_PERSONA = {"sexo_persona", "numero_sexo_persona", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ESTADO_CIVIL = {"estado_civil", "numero_estado_civil", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_PERSONA_HOGAR = {"tipo_persona_hogar", "numero_tipo_persona_hogar", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_SIONO = {"siono", "numero_siono", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_EXCEPCION_CED = {"tipo_excepcion_ced", "numero_tipo_excepcion_ced", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_UBICACION = {"ubicacion", "id_ubicacion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_AREA = {"tipo_area", "numero_tipo_area", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_IDIOMA_HOGAR = {"idioma_hogar", "numero_idioma_hogar", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_MOTIVO_INA_ESC = {"motivo_ina_esc", "numero_motivo_ina_esc", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_NIVEL_EDUCATIVO = {"nivel_educativo", "numero_nivel_educativo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_SEGURO_MEDICO = {"tipo_seguro_medico", "numero_tipo_seguro_medico", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_ESTADO_SALUD = {"estado_salud", "numero_estado_salud", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_ENF_ACC = {"clase_enf_acc", "numero_clase_enf_acc", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_ENF_CRONICA = {"clase_enf_cronica", "numero_clase_enf_cronica", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_MOTIVO_NO_ATENCION = {"motivo_no_atencion", "numero_motivo_no_atencion", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CLASE_IMPEDIMENTO = {"clase_impedimento", "numero_clase_impedimento", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_CAUSA_IMPEDIMENTO = {"causa_impedimento", "numero_causa_impedimento", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_MOTIVO_NO_TRABAJO = {"motivo_no_trabajo", "numero_motivo_no_trabajo", "", ""};
    private static final String[] STRINGS_REFERENCIA_CONSULTAR_TIPO_RELACION_LAB = {"tipo_relacion_lab", "numero_tipo_relacion_lab", "", ""};

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
        if (funcion == FUNCION_CONSULTAR_FICHA_PERSONA) {
            this.consultarFichaPersona(filtro);
            return;
        }
    }

    public void consultarFichaPersona() throws ExcepcionAplicacion {
        this.consultarFichaPersona(new FiltroBusqueda());
    }

    public void consultarFichaPersona(Long filtro) throws ExcepcionAplicacion {
        if (filtro == null) {
            this.consultarFichaPersona(new FiltroBusqueda());
        } else {
            this.consultarFichaPersona(new FiltroBusqueda(filtro));
        }
    }

    public void consultarFichaPersona(FiltroBusqueda filtro) throws ExcepcionAplicacion {
        String comando = this.getComandoSelect();
        String clausula = "WHERE";
        String criterios = null;
        try {
            this.setFuncionSelect(FUNCION_CONSULTAR_FICHA_PERSONA);
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
                comando += clausula + " id_ficha_persona ";
            }
        } catch (ExcepcionAplicacion ex) {
            comando = this.getComandoSelectNothing();
            throw ex;
        } finally {
            this.setComandoCachedRowSet(comando, true);
        }
    }

    public RowKey crearFichaPersona() throws ExcepcionAplicacion {
        return this.appendRow(FUNCION_CREAR_FICHA_PERSONA);
    }

    public void modificarFichaPersona(Set rowSet) throws ExcepcionAplicacion {
        this.editRow(rowSet, FUNCION_MODIFICAR_FICHA_PERSONA);
    }

    public void modificarFichaPersona(RowKey rowKey) throws ExcepcionAplicacion {
        this.editRow(rowKey, FUNCION_MODIFICAR_FICHA_PERSONA);
    }

    public void eliminarFichaPersona(Set rowSet) throws ExcepcionAplicacion {
        this.removeRow(rowSet, FUNCION_ELIMINAR_FICHA_PERSONA);
    }

    public void eliminarFichaPersona(RowKey rowKey) throws ExcepcionAplicacion {
        this.removeRow(rowKey, FUNCION_ELIMINAR_FICHA_PERSONA);
    }

    @Override
    protected void posAppendRow(RowKey rowKey, long funcion) {
        this.initRow(rowKey);
        if (funcion == FUNCION_CREAR_FICHA_PERSONA) {
            this.posCrearFichaPersona(rowKey);
            return;
        }
    }

    protected void posCrearFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaModificable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_MODIFICAR_FICHA_PERSONA) {
            es = this.esFilaModificableConModificarFichaPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaModificableConModificarFichaPersona(RowKey rowKey) {
        boolean es = rowKey != null;
        if (es) {
            es = this.esFilaRecursoActivo(rowKey, FUNCION_MODIFICAR_FICHA_PERSONA);
        }
        return es;
    }

    @Override
    protected void posEditRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_MODIFICAR_FICHA_PERSONA) {
            this.posModificarFichaPersona(rowKey);
            return;
        }
    }

    protected void posModificarFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaEliminable(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_ELIMINAR_FICHA_PERSONA) {
            es = this.esFilaEliminableConEliminarFichaPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaEliminableConEliminarFichaPersona(RowKey rowKey) {
        return rowKey != null;
    }

    @Override
    protected void preRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FICHA_PERSONA) {
            this.preEliminarFichaPersona(rowKey);
            return;
        }
    }

    protected void preEliminarFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected void posRemoveRow(RowKey rowKey, long funcion) {
        if (funcion == FUNCION_ELIMINAR_FICHA_PERSONA) {
            this.posEliminarFichaPersona(rowKey);
            return;
        }
    }

    protected void posEliminarFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
    }

    @Override
    protected boolean esFilaValida(RowKey rowKey, long funcion) {
        boolean es = false;
        if (funcion == FUNCION_CREAR_FICHA_PERSONA) {
            es = this.esFilaValidaParaCrearFichaPersona(rowKey);
            return es;
        }
        if (funcion == FUNCION_MODIFICAR_FICHA_PERSONA) {
            es = this.esFilaValidaParaModificarFichaPersona(rowKey);
            return es;
        }
        return es;
    }

    protected boolean esFilaValidaParaCrearFichaPersona(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FICHA_HOGAR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFichaHogar(rowKey), FUNCION_REFERENCIA_CONSULTAR_FICHA_HOGAR, STRINGS_REFERENCIA_CONSULTAR_FICHA_HOGAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FICHA_HOGAR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDepartamentoNacimiento(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DEPARTAMENTO_NACIMIENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DISTRITO_NACIMIENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDistritoNacimiento(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DISTRITO_NACIMIENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_POTENCIAL_BEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPotencialBen(rowKey), FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN, STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_POTENCIAL_BEN + ">");
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

    protected boolean esFilaValidaParaModificarFichaPersona(RowKey rowKey) {
        boolean ok = rowKey != null;
        boolean es = ok;
        try {
            if (es) {
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_FICHA_HOGAR)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdFichaHogar(rowKey), FUNCION_REFERENCIA_CONSULTAR_FICHA_HOGAR, STRINGS_REFERENCIA_CONSULTAR_FICHA_HOGAR);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_FICHA_HOGAR + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DEPARTAMENTO_NACIMIENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDepartamentoNacimiento(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DEPARTAMENTO_NACIMIENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_DISTRITO_NACIMIENTO)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdDistritoNacimiento(rowKey), FUNCION_REFERENCIA_CONSULTAR_UBICACION, STRINGS_REFERENCIA_CONSULTAR_UBICACION);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_DISTRITO_NACIMIENTO + ">");
                    }
                }
                if (this.getCachedRowSet().columnUpdated(COLUMNA_ID_POTENCIAL_BEN)) {
                    ok = TLC.getControlador().esReferenciaAutorizada(this.getIdPotencialBen(rowKey), FUNCION_REFERENCIA_CONSULTAR_POTENCIAL_BEN, STRINGS_REFERENCIA_CONSULTAR_POTENCIAL_BEN);
                    es &= ok;
                    if (!ok) {
                        TLC.getBitacora().error(CBM2.RECURSO_NO_REFERENCIABLE, "<" + COLUMNA_ID_POTENCIAL_BEN + ">");
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
        if (funcion == FUNCION_CREAR_FICHA_PERSONA) {
            this.preCommitCrearFichaPersona(rowKey);
            return;
        }
        if (funcion == FUNCION_MODIFICAR_FICHA_PERSONA) {
            this.preCommitModificarFichaPersona(rowKey);
            return;
        }
        if (funcion == FUNCION_ELIMINAR_FICHA_PERSONA) {
            this.preCommitEliminarFichaPersona(rowKey);
            return;
        }
    }

    protected void preCommitCrearFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_CREAR_FICHA_PERSONA);
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FICHA_PERSONA, this.getVersionFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FICHA_PERSONA, this.getCodigoFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FICHA_PERSONA, this.getNombreFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_ES_RESPONDENTE, this.getEsRespondente(rowKey));
        rastro.addParametro(PARAMETRO_ID_FICHA_HOGAR, this.getIdFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDENTIFICACION, this.getNumeroOrdenIdentificacion(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_NOMBRE, this.getPrimerNombre(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_NOMBRE, this.getSegundoNombre(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_APELLIDO, this.getPrimerApellido(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_APELLIDO, this.getSegundoApellido(rowKey));
        rastro.addParametro(PARAMETRO_APELLIDO_CASADA, this.getApellidoCasada(rowKey));
        rastro.addParametro(PARAMETRO_APODO, this.getApodo(rowKey));
        rastro.addParametro(PARAMETRO_EDAD, this.getEdad(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR, this.getNumeroTipoPersonaHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_MIEMBRO_HOGAR, this.getNumeroSionoMiembroHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_CONYUGE, this.getNumeroOrdenIdenConyuge(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_PADRE, this.getNumeroOrdenIdenPadre(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_MADRE, this.getNumeroOrdenIdenMadre(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA, this.getNumeroCedula(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA, this.getLetraCedula(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_EXCEPCION_CED, this.getNumeroTipoExcepcionCed(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_NACIMIENTO, this.getFechaNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DEPARTAMENTO_NACIMIENTO, this.getIdDepartamentoNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DISTRITO_NACIMIENTO, this.getIdDistritoNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA_LUGAR_NAC, this.getNumeroTipoAreaLugarNac(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_IDIOMA_HOGAR, this.getNumeroIdiomaHogar(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_IDIOMA_HOGAR, this.getOtroIdiomaHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_ASISTENCIA_ESC, this.getNumeroSionoAsistenciaEsc(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_INA_ESC, this.getNumeroMotivoInaEsc(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_MOTIVO_INA_ESC, this.getOtroMotivoInaEsc(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_MATRICULACION_ESC, this.getNumeroSionoMatriculacionEsc(rowKey));
        rastro.addParametro(PARAMETRO_ULTIMO_CURSO_APROBADO, this.getUltimoCursoAprobado(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_EDU_ULT_CUR_APROB, this.getNumeroNivelEduUltCurAprob(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_CURSO_NO_FORMAL, this.getNumeroSionoCursoNoFormal(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO, this.getNumeroTipoSeguroMedico(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_SALUD, this.getNumeroEstadoSalud(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_ACC, this.getNumeroClaseEnfAcc(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CLASE_ENF_ACC, this.getOtraClaseEnfAcc(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_CRONICA, this.getNumeroClaseEnfCronica(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CLASE_ENF_CRONICA, this.getOtraClaseEnfCronica(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_ATENCION_MEDICA, this.getNumeroSionoAtencionMedica(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_ATENCION, this.getNumeroMotivoNoAtencion(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_MOTIVO_NO_ATENCION, this.getOtroMotivoNoAtencion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_CARNET_VACUNACION, this.getNumeroSionoCarnetVacunacion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_IMPEDIMENTO, this.getNumeroClaseImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CLASE_IMPEDIMENTO, this.getOtraClaseImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_IMPEDIMENTO, this.getNumeroCausaImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_IMPEDIMENTO, this.getOtraCausaImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_CAMINAR, this.getNumeroSionoDifParaCaminar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_VESTIRSE, this.getNumeroSionoDifParaVestirse(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_BANARSE, this.getNumeroSionoDifParaBanarse(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_COMER, this.getNumeroSionoDifParaComer(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_LA_CAMA, this.getNumeroSionoDifParaLaCama(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_EL_BANO, this.getNumeroSionoDifParaElBano(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_TRABAJO, this.getNumeroSionoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO, this.getNumeroMotivoNoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_MOTIVO_NO_TRABAJO, this.getOtroMotivoNoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_OCUPACION_PRIN, this.getDescripcionOcupacionPrin(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_DEDICACION_PRIN, this.getDescripcionDedicacionPrin(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_RELACION_LAB, this.getNumeroTipoRelacionLab(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_OCUPACION_PRIN, this.getMontoIngresoOcupacionPrin(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_OCUPACION_SECUN, this.getMontoIngresoOcupacionSecun(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_OTRAS_OCUP, this.getMontoIngresoOtrasOcup(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_ALQUILERES, this.getMontoIngresoAlquileres(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_INTERESES, this.getMontoIngresoIntereses(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_AYUDA_FAM_PAIS, this.getMontoIngresoAyudaFamPais(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_AYUDA_FAM_EXTER, this.getMontoIngresoAyudaFamExter(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_JUBILACION, this.getMontoIngresoJubilacion(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_PENSIONES, this.getMontoIngresoPensiones(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_TEKOPORA, this.getMontoIngresoTekopora(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_PROGRAMAS, this.getMontoIngresoProgramas(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_ADICIONAL, this.getMontoIngresoAdicional(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_INGRESO_MENSUAL, this.getTotalIngresoMensual(rowKey));
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_ES_FICHA_PERSONA_INACTIVA, this.getEsFichaPersonaInactiva(rowKey));
        rastro.addParametro(PARAMETRO_ES_FICHA_PERSONA_IMPORTADA, this.getEsFichaPersonaImportada(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_IMPORTACION, this.getFechaImportacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitModificarFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_MODIFICAR_FICHA_PERSONA);
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_VERSION_FICHA_PERSONA, this.getVersionFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_CODIGO_FICHA_PERSONA, this.getCodigoFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_NOMBRE_FICHA_PERSONA, this.getNombreFichaPersona(rowKey));
        rastro.addParametro(PARAMETRO_ES_RESPONDENTE, this.getEsRespondente(rowKey));
        rastro.addParametro(PARAMETRO_ID_FICHA_HOGAR, this.getIdFichaHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDENTIFICACION, this.getNumeroOrdenIdentificacion(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_NOMBRE, this.getPrimerNombre(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_NOMBRE, this.getSegundoNombre(rowKey));
        rastro.addParametro(PARAMETRO_PRIMER_APELLIDO, this.getPrimerApellido(rowKey));
        rastro.addParametro(PARAMETRO_SEGUNDO_APELLIDO, this.getSegundoApellido(rowKey));
        rastro.addParametro(PARAMETRO_APELLIDO_CASADA, this.getApellidoCasada(rowKey));
        rastro.addParametro(PARAMETRO_APODO, this.getApodo(rowKey));
        rastro.addParametro(PARAMETRO_EDAD, this.getEdad(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SEXO_PERSONA, this.getNumeroSexoPersona(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_CIVIL, this.getNumeroEstadoCivil(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_PERSONA_HOGAR, this.getNumeroTipoPersonaHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_MIEMBRO_HOGAR, this.getNumeroSionoMiembroHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_CONYUGE, this.getNumeroOrdenIdenConyuge(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_PADRE, this.getNumeroOrdenIdenPadre(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ORDEN_IDEN_MADRE, this.getNumeroOrdenIdenMadre(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CEDULA, this.getNumeroCedula(rowKey));
        rastro.addParametro(PARAMETRO_LETRA_CEDULA, this.getLetraCedula(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_EXCEPCION_CED, this.getNumeroTipoExcepcionCed(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_NACIMIENTO, this.getFechaNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DEPARTAMENTO_NACIMIENTO, this.getIdDepartamentoNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_ID_DISTRITO_NACIMIENTO, this.getIdDistritoNacimiento(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_AREA_LUGAR_NAC, this.getNumeroTipoAreaLugarNac(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_IDIOMA_HOGAR, this.getNumeroIdiomaHogar(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_IDIOMA_HOGAR, this.getOtroIdiomaHogar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_ASISTENCIA_ESC, this.getNumeroSionoAsistenciaEsc(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_INA_ESC, this.getNumeroMotivoInaEsc(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_MOTIVO_INA_ESC, this.getOtroMotivoInaEsc(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_MATRICULACION_ESC, this.getNumeroSionoMatriculacionEsc(rowKey));
        rastro.addParametro(PARAMETRO_ULTIMO_CURSO_APROBADO, this.getUltimoCursoAprobado(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_NIVEL_EDU_ULT_CUR_APROB, this.getNumeroNivelEduUltCurAprob(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_CURSO_NO_FORMAL, this.getNumeroSionoCursoNoFormal(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_SEGURO_MEDICO, this.getNumeroTipoSeguroMedico(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_ESTADO_SALUD, this.getNumeroEstadoSalud(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_ACC, this.getNumeroClaseEnfAcc(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CLASE_ENF_ACC, this.getOtraClaseEnfAcc(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_ENF_CRONICA, this.getNumeroClaseEnfCronica(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CLASE_ENF_CRONICA, this.getOtraClaseEnfCronica(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_ATENCION_MEDICA, this.getNumeroSionoAtencionMedica(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_ATENCION, this.getNumeroMotivoNoAtencion(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_MOTIVO_NO_ATENCION, this.getOtroMotivoNoAtencion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_CARNET_VACUNACION, this.getNumeroSionoCarnetVacunacion(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CLASE_IMPEDIMENTO, this.getNumeroClaseImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CLASE_IMPEDIMENTO, this.getOtraClaseImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_CAUSA_IMPEDIMENTO, this.getNumeroCausaImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_OTRA_CAUSA_IMPEDIMENTO, this.getOtraCausaImpedimento(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_CAMINAR, this.getNumeroSionoDifParaCaminar(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_VESTIRSE, this.getNumeroSionoDifParaVestirse(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_BANARSE, this.getNumeroSionoDifParaBanarse(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_COMER, this.getNumeroSionoDifParaComer(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_LA_CAMA, this.getNumeroSionoDifParaLaCama(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_DIF_PARA_EL_BANO, this.getNumeroSionoDifParaElBano(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_SIONO_TRABAJO, this.getNumeroSionoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_MOTIVO_NO_TRABAJO, this.getNumeroMotivoNoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_OTRO_MOTIVO_NO_TRABAJO, this.getOtroMotivoNoTrabajo(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_OCUPACION_PRIN, this.getDescripcionOcupacionPrin(rowKey));
        rastro.addParametro(PARAMETRO_DESCRIPCION_DEDICACION_PRIN, this.getDescripcionDedicacionPrin(rowKey));
        rastro.addParametro(PARAMETRO_NUMERO_TIPO_RELACION_LAB, this.getNumeroTipoRelacionLab(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_OCUPACION_PRIN, this.getMontoIngresoOcupacionPrin(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_OCUPACION_SECUN, this.getMontoIngresoOcupacionSecun(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_OTRAS_OCUP, this.getMontoIngresoOtrasOcup(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_ALQUILERES, this.getMontoIngresoAlquileres(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_INTERESES, this.getMontoIngresoIntereses(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_AYUDA_FAM_PAIS, this.getMontoIngresoAyudaFamPais(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_AYUDA_FAM_EXTER, this.getMontoIngresoAyudaFamExter(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_JUBILACION, this.getMontoIngresoJubilacion(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_PENSIONES, this.getMontoIngresoPensiones(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_TEKOPORA, this.getMontoIngresoTekopora(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_PROGRAMAS, this.getMontoIngresoProgramas(rowKey));
        rastro.addParametro(PARAMETRO_MONTO_INGRESO_ADICIONAL, this.getMontoIngresoAdicional(rowKey));
        rastro.addParametro(PARAMETRO_TOTAL_INGRESO_MENSUAL, this.getTotalIngresoMensual(rowKey));
        rastro.addParametro(PARAMETRO_ID_POTENCIAL_BEN, this.getIdPotencialBen(rowKey));
        rastro.addParametro(PARAMETRO_ES_FICHA_PERSONA_INACTIVA, this.getEsFichaPersonaInactiva(rowKey));
        rastro.addParametro(PARAMETRO_ES_FICHA_PERSONA_IMPORTADA, this.getEsFichaPersonaImportada(rowKey));
        rastro.addParametro(PARAMETRO_FECHA_IMPORTACION, this.getFechaImportacion(rowKey));
        TLC.getControlador().grabarRastroFuncion(rastro);
    }

    protected void preCommitEliminarFichaPersona(RowKey rowKey) {
        if (rowKey == null) return;
        RastroFuncion rastro = this.getRastroFuncion(rowKey, FUNCION_ELIMINAR_FICHA_PERSONA);
        rastro.addParametro(PARAMETRO_ID_FICHA_PERSONA, this.getIdFichaPersona(rowKey));
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
        this.setVersionFichaPersona(rowKey, 0L);
        this.setEsRespondente(rowKey, 0);
        this.setNumeroSionoMiembroHogar(rowKey, 1);
        this.setEsFichaPersonaInactiva(rowKey, 0);
        this.setEsFichaPersonaImportada(rowKey, 0);
    }
}
