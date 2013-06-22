/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.FichaPersonaBase;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ficha_persona")
public class FichaPersona implements FichaPersonaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_ficha_persona")
    private Long idFichaPersona;

    @Basic(optional = false)
    @Column(name = "version_ficha_persona")
    private long versionFichaPersona;

    @Basic(optional = false)
    @Column(name = "codigo_ficha_persona")
    private String codigoFichaPersona;

    @Basic(optional = false)
    @Column(name = "nombre_ficha_persona")
    private String nombreFichaPersona;

    @Basic(optional = false)
    @Column(name = "es_respondente")
    private int esRespondente;

    @Basic(optional = false)
    @Column(name = "numero_orden_identificacion")
    private int numeroOrdenIdentificacion;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "apellido_casada")
    private String apellidoCasada;

    @Column(name = "apodo")
    private String apodo;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "numero_orden_iden_conyuge")
    private Integer numeroOrdenIdenConyuge;

    @Column(name = "numero_orden_iden_padre")
    private Integer numeroOrdenIdenPadre;

    @Column(name = "numero_orden_iden_madre")
    private Integer numeroOrdenIdenMadre;

    @Column(name = "numero_cedula")
    private Integer numeroCedula;

    @Column(name = "letra_cedula")
    private String letraCedula;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

    @Column(name = "otro_idioma_hogar")
    private String otroIdiomaHogar;

    @Column(name = "otro_motivo_ina_esc")
    private String otroMotivoInaEsc;

    @Column(name = "ultimo_curso_aprobado")
    private Integer ultimoCursoAprobado;

    @Column(name = "otra_clase_enf_acc")
    private String otraClaseEnfAcc;

    @Column(name = "otra_clase_enf_cronica")
    private String otraClaseEnfCronica;

    @Column(name = "otro_motivo_no_atencion")
    private String otroMotivoNoAtencion;

    @Column(name = "otra_clase_impedimento")
    private String otraClaseImpedimento;

    @Column(name = "otra_causa_impedimento")
    private String otraCausaImpedimento;

    @Column(name = "otro_motivo_no_trabajo")
    private String otroMotivoNoTrabajo;

    @Column(name = "descripcion_ocupacion_prin")
    private String descripcionOcupacionPrin;

    @Column(name = "descripcion_dedicacion_prin")
    private String descripcionDedicacionPrin;

    @Column(name = "monto_ingreso_ocupacion_prin")
    private BigDecimal montoIngresoOcupacionPrin;

    @Column(name = "monto_ingreso_ocupacion_secun")
    private BigDecimal montoIngresoOcupacionSecun;

    @Column(name = "monto_ingreso_otras_ocup")
    private BigDecimal montoIngresoOtrasOcup;

    @Column(name = "monto_ingreso_alquileres")
    private BigDecimal montoIngresoAlquileres;

    @Column(name = "monto_ingreso_intereses")
    private BigDecimal montoIngresoIntereses;

    @Column(name = "monto_ingreso_ayuda_fam_pais")
    private BigDecimal montoIngresoAyudaFamPais;

    @Column(name = "monto_ingreso_ayuda_fam_exter")
    private BigDecimal montoIngresoAyudaFamExter;

    @Column(name = "monto_ingreso_jubilacion")
    private BigDecimal montoIngresoJubilacion;

    @Column(name = "monto_ingreso_pensiones")
    private BigDecimal montoIngresoPensiones;

    @Column(name = "monto_ingreso_tekopora")
    private BigDecimal montoIngresoTekopora;

    @Column(name = "monto_ingreso_programas")
    private BigDecimal montoIngresoProgramas;

    @Column(name = "monto_ingreso_adicional")
    private BigDecimal montoIngresoAdicional;

    @Column(name = "total_ingreso_mensual")
    private BigDecimal totalIngresoMensual;

    @Basic(optional = false)
    @Column(name = "es_ficha_persona_inactiva")
    private int esFichaPersonaInactiva;

    @Basic(optional = false)
    @Column(name = "es_ficha_persona_importada")
    private int esFichaPersonaImportada;

    @Column(name = "fecha_importacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaImportacion;

    @JoinColumn(name = "id_ficha_hogar", referencedColumnName = "id_ficha_hogar")
    @ManyToOne
    private FichaHogar fichaHogarIdFichaHogar;

    @JoinColumn(name = "numero_sexo_persona", referencedColumnName = "numero_sexo_persona")
    @ManyToOne
    private SexoPersona sexoPersonaNumeroSexoPersona;

    @JoinColumn(name = "numero_estado_civil", referencedColumnName = "numero_estado_civil")
    @ManyToOne
    private EstadoCivil estadoCivilNumeroEstadoCivil;

    @JoinColumn(name = "numero_tipo_persona_hogar", referencedColumnName = "numero_tipo_persona_hogar")
    @ManyToOne
    private TipoPersonaHogar tipoPersonaHogarNumeroTipoPersonaHogar;

    @JoinColumn(name = "numero_siono_miembro_hogar", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoMiembroHogar;

    @JoinColumn(name = "numero_tipo_excepcion_ced", referencedColumnName = "numero_tipo_excepcion_ced")
    @ManyToOne
    private TipoExcepcionCed tipoExcepcionCedNumeroTipoExcepcionCed;

    @JoinColumn(name = "id_departamento_nacimiento", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDepartamentoNacimiento;

    @JoinColumn(name = "id_distrito_nacimiento", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDistritoNacimiento;

    @JoinColumn(name = "numero_tipo_area_lugar_nac", referencedColumnName = "numero_tipo_area")
    @ManyToOne
    private TipoArea tipoAreaNumeroTipoAreaLugarNac;

    @JoinColumn(name = "numero_idioma_hogar", referencedColumnName = "numero_idioma_hogar")
    @ManyToOne
    private IdiomaHogar idiomaHogarNumeroIdiomaHogar;

    @JoinColumn(name = "numero_siono_asistencia_esc", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoAsistenciaEsc;

    @JoinColumn(name = "numero_motivo_ina_esc", referencedColumnName = "numero_motivo_ina_esc")
    @ManyToOne
    private MotivoInaEsc motivoInaEscNumeroMotivoInaEsc;

    @JoinColumn(name = "numero_siono_matriculacion_esc", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoMatriculacionEsc;

    @JoinColumn(name = "numero_nivel_edu_ult_cur_aprob", referencedColumnName = "numero_nivel_educativo")
    @ManyToOne
    private NivelEducativo nivelEducativoNumeroNivelEduUltCurAprob;

    @JoinColumn(name = "numero_siono_curso_no_formal", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoCursoNoFormal;

    @JoinColumn(name = "numero_tipo_seguro_medico", referencedColumnName = "numero_tipo_seguro_medico")
    @ManyToOne
    private TipoSeguroMedico tipoSeguroMedicoNumeroTipoSeguroMedico;

    @JoinColumn(name = "numero_estado_salud", referencedColumnName = "numero_estado_salud")
    @ManyToOne
    private EstadoSalud estadoSaludNumeroEstadoSalud;

    @JoinColumn(name = "numero_clase_enf_acc", referencedColumnName = "numero_clase_enf_acc")
    @ManyToOne
    private ClaseEnfAcc claseEnfAccNumeroClaseEnfAcc;

    @JoinColumn(name = "numero_clase_enf_cronica", referencedColumnName = "numero_clase_enf_cronica")
    @ManyToOne
    private ClaseEnfCronica claseEnfCronicaNumeroClaseEnfCronica;

    @JoinColumn(name = "numero_siono_atencion_medica", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoAtencionMedica;

    @JoinColumn(name = "numero_motivo_no_atencion", referencedColumnName = "numero_motivo_no_atencion")
    @ManyToOne
    private MotivoNoAtencion motivoNoAtencionNumeroMotivoNoAtencion;

    @JoinColumn(name = "numero_siono_carnet_vacunacion", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoCarnetVacunacion;

    @JoinColumn(name = "numero_clase_impedimento", referencedColumnName = "numero_clase_impedimento")
    @ManyToOne
    private ClaseImpedimento claseImpedimentoNumeroClaseImpedimento;

    @JoinColumn(name = "numero_causa_impedimento", referencedColumnName = "numero_causa_impedimento")
    @ManyToOne
    private CausaImpedimento causaImpedimentoNumeroCausaImpedimento;

    @JoinColumn(name = "numero_siono_dif_para_caminar", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDifParaCaminar;

    @JoinColumn(name = "numero_siono_dif_para_vestirse", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDifParaVestirse;

    @JoinColumn(name = "numero_siono_dif_para_banarse", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDifParaBanarse;

    @JoinColumn(name = "numero_siono_dif_para_comer", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDifParaComer;

    @JoinColumn(name = "numero_siono_dif_para_la_cama", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDifParaLaCama;

    @JoinColumn(name = "numero_siono_dif_para_el_bano", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDifParaElBano;

    @JoinColumn(name = "numero_siono_trabajo", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoTrabajo;

    @JoinColumn(name = "numero_motivo_no_trabajo", referencedColumnName = "numero_motivo_no_trabajo")
    @ManyToOne
    private MotivoNoTrabajo motivoNoTrabajoNumeroMotivoNoTrabajo;

    @JoinColumn(name = "numero_tipo_relacion_lab", referencedColumnName = "numero_tipo_relacion_lab")
    @ManyToOne
    private TipoRelacionLab tipoRelacionLabNumeroTipoRelacionLab;

    @JoinColumn(name = "id_potencial_ben", referencedColumnName = "id_potencial_ben")
    @ManyToOne
    private PotencialBen potencialBenIdPotencialBen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaPersonaIdFichaPersona")
    private Collection<LogImpPer> logImpPerIdFichaPersonaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaPersonaIdFichaPersona")
    private Collection<LogImpPerEec> logImpPerEecIdFichaPersonaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaPersonaIdFichaPersona")
    private Collection<LogProAcrPotBen> logProAcrPotBenIdFichaPersonaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaPersonaIdFichaPersona")
    private Collection<Persona> personaIdFichaPersonaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaPersonaIdFichaPersona")
    private Collection<PotencialBen> potencialBenIdFichaPersonaCollection;

    public FichaPersona() {
    }

    @Override
    public Long getIdFichaPersona() {
        return this.idFichaPersona;
    }

    public void setIdFichaPersona(Long idFichaPersona) {
        this.idFichaPersona = idFichaPersona;
    }

    @Override
    public long getVersionFichaPersona() {
        return this.versionFichaPersona;
    }

    public void setVersionFichaPersona(long versionFichaPersona) {
        this.versionFichaPersona = versionFichaPersona;
    }

    @Override
    public String getCodigoFichaPersona() {
        return this.codigoFichaPersona;
    }

    public void setCodigoFichaPersona(String codigoFichaPersona) {
        this.codigoFichaPersona = codigoFichaPersona;
    }

    @Override
    public String getNombreFichaPersona() {
        return this.nombreFichaPersona;
    }

    public void setNombreFichaPersona(String nombreFichaPersona) {
        this.nombreFichaPersona = nombreFichaPersona;
    }

    @Override
    public int getEsRespondente() {
        return this.esRespondente;
    }

    public void setEsRespondente(int esRespondente) {
        this.esRespondente = esRespondente;
    }

    @Override
    public int getNumeroOrdenIdentificacion() {
        return this.numeroOrdenIdentificacion;
    }

    public void setNumeroOrdenIdentificacion(int numeroOrdenIdentificacion) {
        this.numeroOrdenIdentificacion = numeroOrdenIdentificacion;
    }

    @Override
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Override
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Override
    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String getApellidoCasada() {
        return this.apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    @Override
    public String getApodo() {
        return this.apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public Integer getNumeroOrdenIdenConyuge() {
        return this.numeroOrdenIdenConyuge;
    }

    public void setNumeroOrdenIdenConyuge(Integer numeroOrdenIdenConyuge) {
        this.numeroOrdenIdenConyuge = numeroOrdenIdenConyuge;
    }

    @Override
    public Integer getNumeroOrdenIdenPadre() {
        return this.numeroOrdenIdenPadre;
    }

    public void setNumeroOrdenIdenPadre(Integer numeroOrdenIdenPadre) {
        this.numeroOrdenIdenPadre = numeroOrdenIdenPadre;
    }

    @Override
    public Integer getNumeroOrdenIdenMadre() {
        return this.numeroOrdenIdenMadre;
    }

    public void setNumeroOrdenIdenMadre(Integer numeroOrdenIdenMadre) {
        this.numeroOrdenIdenMadre = numeroOrdenIdenMadre;
    }

    @Override
    public Integer getNumeroCedula() {
        return this.numeroCedula;
    }

    public void setNumeroCedula(Integer numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    @Override
    public String getLetraCedula() {
        return this.letraCedula;
    }

    public void setLetraCedula(String letraCedula) {
        this.letraCedula = letraCedula;
    }

    @Override
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String getOtroIdiomaHogar() {
        return this.otroIdiomaHogar;
    }

    public void setOtroIdiomaHogar(String otroIdiomaHogar) {
        this.otroIdiomaHogar = otroIdiomaHogar;
    }

    @Override
    public String getOtroMotivoInaEsc() {
        return this.otroMotivoInaEsc;
    }

    public void setOtroMotivoInaEsc(String otroMotivoInaEsc) {
        this.otroMotivoInaEsc = otroMotivoInaEsc;
    }

    @Override
    public Integer getUltimoCursoAprobado() {
        return this.ultimoCursoAprobado;
    }

    public void setUltimoCursoAprobado(Integer ultimoCursoAprobado) {
        this.ultimoCursoAprobado = ultimoCursoAprobado;
    }

    @Override
    public String getOtraClaseEnfAcc() {
        return this.otraClaseEnfAcc;
    }

    public void setOtraClaseEnfAcc(String otraClaseEnfAcc) {
        this.otraClaseEnfAcc = otraClaseEnfAcc;
    }

    @Override
    public String getOtraClaseEnfCronica() {
        return this.otraClaseEnfCronica;
    }

    public void setOtraClaseEnfCronica(String otraClaseEnfCronica) {
        this.otraClaseEnfCronica = otraClaseEnfCronica;
    }

    @Override
    public String getOtroMotivoNoAtencion() {
        return this.otroMotivoNoAtencion;
    }

    public void setOtroMotivoNoAtencion(String otroMotivoNoAtencion) {
        this.otroMotivoNoAtencion = otroMotivoNoAtencion;
    }

    @Override
    public String getOtraClaseImpedimento() {
        return this.otraClaseImpedimento;
    }

    public void setOtraClaseImpedimento(String otraClaseImpedimento) {
        this.otraClaseImpedimento = otraClaseImpedimento;
    }

    @Override
    public String getOtraCausaImpedimento() {
        return this.otraCausaImpedimento;
    }

    public void setOtraCausaImpedimento(String otraCausaImpedimento) {
        this.otraCausaImpedimento = otraCausaImpedimento;
    }

    @Override
    public String getOtroMotivoNoTrabajo() {
        return this.otroMotivoNoTrabajo;
    }

    public void setOtroMotivoNoTrabajo(String otroMotivoNoTrabajo) {
        this.otroMotivoNoTrabajo = otroMotivoNoTrabajo;
    }

    @Override
    public String getDescripcionOcupacionPrin() {
        return this.descripcionOcupacionPrin;
    }

    public void setDescripcionOcupacionPrin(String descripcionOcupacionPrin) {
        this.descripcionOcupacionPrin = descripcionOcupacionPrin;
    }

    @Override
    public String getDescripcionDedicacionPrin() {
        return this.descripcionDedicacionPrin;
    }

    public void setDescripcionDedicacionPrin(String descripcionDedicacionPrin) {
        this.descripcionDedicacionPrin = descripcionDedicacionPrin;
    }

    @Override
    public BigDecimal getMontoIngresoOcupacionPrin() {
        return this.montoIngresoOcupacionPrin;
    }

    public void setMontoIngresoOcupacionPrin(BigDecimal montoIngresoOcupacionPrin) {
        this.montoIngresoOcupacionPrin = montoIngresoOcupacionPrin;
    }

    @Override
    public BigDecimal getMontoIngresoOcupacionSecun() {
        return this.montoIngresoOcupacionSecun;
    }

    public void setMontoIngresoOcupacionSecun(BigDecimal montoIngresoOcupacionSecun) {
        this.montoIngresoOcupacionSecun = montoIngresoOcupacionSecun;
    }

    @Override
    public BigDecimal getMontoIngresoOtrasOcup() {
        return this.montoIngresoOtrasOcup;
    }

    public void setMontoIngresoOtrasOcup(BigDecimal montoIngresoOtrasOcup) {
        this.montoIngresoOtrasOcup = montoIngresoOtrasOcup;
    }

    @Override
    public BigDecimal getMontoIngresoAlquileres() {
        return this.montoIngresoAlquileres;
    }

    public void setMontoIngresoAlquileres(BigDecimal montoIngresoAlquileres) {
        this.montoIngresoAlquileres = montoIngresoAlquileres;
    }

    @Override
    public BigDecimal getMontoIngresoIntereses() {
        return this.montoIngresoIntereses;
    }

    public void setMontoIngresoIntereses(BigDecimal montoIngresoIntereses) {
        this.montoIngresoIntereses = montoIngresoIntereses;
    }

    @Override
    public BigDecimal getMontoIngresoAyudaFamPais() {
        return this.montoIngresoAyudaFamPais;
    }

    public void setMontoIngresoAyudaFamPais(BigDecimal montoIngresoAyudaFamPais) {
        this.montoIngresoAyudaFamPais = montoIngresoAyudaFamPais;
    }

    @Override
    public BigDecimal getMontoIngresoAyudaFamExter() {
        return this.montoIngresoAyudaFamExter;
    }

    public void setMontoIngresoAyudaFamExter(BigDecimal montoIngresoAyudaFamExter) {
        this.montoIngresoAyudaFamExter = montoIngresoAyudaFamExter;
    }

    @Override
    public BigDecimal getMontoIngresoJubilacion() {
        return this.montoIngresoJubilacion;
    }

    public void setMontoIngresoJubilacion(BigDecimal montoIngresoJubilacion) {
        this.montoIngresoJubilacion = montoIngresoJubilacion;
    }

    @Override
    public BigDecimal getMontoIngresoPensiones() {
        return this.montoIngresoPensiones;
    }

    public void setMontoIngresoPensiones(BigDecimal montoIngresoPensiones) {
        this.montoIngresoPensiones = montoIngresoPensiones;
    }

    @Override
    public BigDecimal getMontoIngresoTekopora() {
        return this.montoIngresoTekopora;
    }

    public void setMontoIngresoTekopora(BigDecimal montoIngresoTekopora) {
        this.montoIngresoTekopora = montoIngresoTekopora;
    }

    @Override
    public BigDecimal getMontoIngresoProgramas() {
        return this.montoIngresoProgramas;
    }

    public void setMontoIngresoProgramas(BigDecimal montoIngresoProgramas) {
        this.montoIngresoProgramas = montoIngresoProgramas;
    }

    @Override
    public BigDecimal getMontoIngresoAdicional() {
        return this.montoIngresoAdicional;
    }

    public void setMontoIngresoAdicional(BigDecimal montoIngresoAdicional) {
        this.montoIngresoAdicional = montoIngresoAdicional;
    }

    @Override
    public BigDecimal getTotalIngresoMensual() {
        return this.totalIngresoMensual;
    }

    public void setTotalIngresoMensual(BigDecimal totalIngresoMensual) {
        this.totalIngresoMensual = totalIngresoMensual;
    }

    @Override
    public int getEsFichaPersonaInactiva() {
        return this.esFichaPersonaInactiva;
    }

    public void setEsFichaPersonaInactiva(int esFichaPersonaInactiva) {
        this.esFichaPersonaInactiva = esFichaPersonaInactiva;
    }

    @Override
    public int getEsFichaPersonaImportada() {
        return this.esFichaPersonaImportada;
    }

    public void setEsFichaPersonaImportada(int esFichaPersonaImportada) {
        this.esFichaPersonaImportada = esFichaPersonaImportada;
    }

    @Override
    public Date getFechaImportacion() {
        return this.fechaImportacion;
    }

    public void setFechaImportacion(Date fechaImportacion) {
        this.fechaImportacion = fechaImportacion;
    }

    @Override
    public FichaHogar getFichaHogarIdFichaHogar() {
        return this.fichaHogarIdFichaHogar;
    }

    public void setFichaHogarIdFichaHogar(FichaHogar fichaHogar) {
        this.fichaHogarIdFichaHogar = fichaHogar;
    }

    @Override
    public SexoPersona getSexoPersonaNumeroSexoPersona() {
        return this.sexoPersonaNumeroSexoPersona;
    }

    public void setSexoPersonaNumeroSexoPersona(SexoPersona sexoPersona) {
        this.sexoPersonaNumeroSexoPersona = sexoPersona;
    }

    @Override
    public EstadoCivil getEstadoCivilNumeroEstadoCivil() {
        return this.estadoCivilNumeroEstadoCivil;
    }

    public void setEstadoCivilNumeroEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivilNumeroEstadoCivil = estadoCivil;
    }

    @Override
    public TipoPersonaHogar getTipoPersonaHogarNumeroTipoPersonaHogar() {
        return this.tipoPersonaHogarNumeroTipoPersonaHogar;
    }

    public void setTipoPersonaHogarNumeroTipoPersonaHogar(TipoPersonaHogar tipoPersonaHogar) {
        this.tipoPersonaHogarNumeroTipoPersonaHogar = tipoPersonaHogar;
    }

    @Override
    public Siono getSionoNumeroSionoMiembroHogar() {
        return this.sionoNumeroSionoMiembroHogar;
    }

    public void setSionoNumeroSionoMiembroHogar(Siono siono) {
        this.sionoNumeroSionoMiembroHogar = siono;
    }

    @Override
    public TipoExcepcionCed getTipoExcepcionCedNumeroTipoExcepcionCed() {
        return this.tipoExcepcionCedNumeroTipoExcepcionCed;
    }

    public void setTipoExcepcionCedNumeroTipoExcepcionCed(TipoExcepcionCed tipoExcepcionCed) {
        this.tipoExcepcionCedNumeroTipoExcepcionCed = tipoExcepcionCed;
    }

    @Override
    public Ubicacion getUbicacionIdDepartamentoNacimiento() {
        return this.ubicacionIdDepartamentoNacimiento;
    }

    public void setUbicacionIdDepartamentoNacimiento(Ubicacion ubicacion) {
        this.ubicacionIdDepartamentoNacimiento = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdDistritoNacimiento() {
        return this.ubicacionIdDistritoNacimiento;
    }

    public void setUbicacionIdDistritoNacimiento(Ubicacion ubicacion) {
        this.ubicacionIdDistritoNacimiento = ubicacion;
    }

    @Override
    public TipoArea getTipoAreaNumeroTipoAreaLugarNac() {
        return this.tipoAreaNumeroTipoAreaLugarNac;
    }

    public void setTipoAreaNumeroTipoAreaLugarNac(TipoArea tipoArea) {
        this.tipoAreaNumeroTipoAreaLugarNac = tipoArea;
    }

    @Override
    public IdiomaHogar getIdiomaHogarNumeroIdiomaHogar() {
        return this.idiomaHogarNumeroIdiomaHogar;
    }

    public void setIdiomaHogarNumeroIdiomaHogar(IdiomaHogar idiomaHogar) {
        this.idiomaHogarNumeroIdiomaHogar = idiomaHogar;
    }

    @Override
    public Siono getSionoNumeroSionoAsistenciaEsc() {
        return this.sionoNumeroSionoAsistenciaEsc;
    }

    public void setSionoNumeroSionoAsistenciaEsc(Siono siono) {
        this.sionoNumeroSionoAsistenciaEsc = siono;
    }

    @Override
    public MotivoInaEsc getMotivoInaEscNumeroMotivoInaEsc() {
        return this.motivoInaEscNumeroMotivoInaEsc;
    }

    public void setMotivoInaEscNumeroMotivoInaEsc(MotivoInaEsc motivoInaEsc) {
        this.motivoInaEscNumeroMotivoInaEsc = motivoInaEsc;
    }

    @Override
    public Siono getSionoNumeroSionoMatriculacionEsc() {
        return this.sionoNumeroSionoMatriculacionEsc;
    }

    public void setSionoNumeroSionoMatriculacionEsc(Siono siono) {
        this.sionoNumeroSionoMatriculacionEsc = siono;
    }

    @Override
    public NivelEducativo getNivelEducativoNumeroNivelEduUltCurAprob() {
        return this.nivelEducativoNumeroNivelEduUltCurAprob;
    }

    public void setNivelEducativoNumeroNivelEduUltCurAprob(NivelEducativo nivelEducativo) {
        this.nivelEducativoNumeroNivelEduUltCurAprob = nivelEducativo;
    }

    @Override
    public Siono getSionoNumeroSionoCursoNoFormal() {
        return this.sionoNumeroSionoCursoNoFormal;
    }

    public void setSionoNumeroSionoCursoNoFormal(Siono siono) {
        this.sionoNumeroSionoCursoNoFormal = siono;
    }

    @Override
    public TipoSeguroMedico getTipoSeguroMedicoNumeroTipoSeguroMedico() {
        return this.tipoSeguroMedicoNumeroTipoSeguroMedico;
    }

    public void setTipoSeguroMedicoNumeroTipoSeguroMedico(TipoSeguroMedico tipoSeguroMedico) {
        this.tipoSeguroMedicoNumeroTipoSeguroMedico = tipoSeguroMedico;
    }

    @Override
    public EstadoSalud getEstadoSaludNumeroEstadoSalud() {
        return this.estadoSaludNumeroEstadoSalud;
    }

    public void setEstadoSaludNumeroEstadoSalud(EstadoSalud estadoSalud) {
        this.estadoSaludNumeroEstadoSalud = estadoSalud;
    }

    @Override
    public ClaseEnfAcc getClaseEnfAccNumeroClaseEnfAcc() {
        return this.claseEnfAccNumeroClaseEnfAcc;
    }

    public void setClaseEnfAccNumeroClaseEnfAcc(ClaseEnfAcc claseEnfAcc) {
        this.claseEnfAccNumeroClaseEnfAcc = claseEnfAcc;
    }

    @Override
    public ClaseEnfCronica getClaseEnfCronicaNumeroClaseEnfCronica() {
        return this.claseEnfCronicaNumeroClaseEnfCronica;
    }

    public void setClaseEnfCronicaNumeroClaseEnfCronica(ClaseEnfCronica claseEnfCronica) {
        this.claseEnfCronicaNumeroClaseEnfCronica = claseEnfCronica;
    }

    @Override
    public Siono getSionoNumeroSionoAtencionMedica() {
        return this.sionoNumeroSionoAtencionMedica;
    }

    public void setSionoNumeroSionoAtencionMedica(Siono siono) {
        this.sionoNumeroSionoAtencionMedica = siono;
    }

    @Override
    public MotivoNoAtencion getMotivoNoAtencionNumeroMotivoNoAtencion() {
        return this.motivoNoAtencionNumeroMotivoNoAtencion;
    }

    public void setMotivoNoAtencionNumeroMotivoNoAtencion(MotivoNoAtencion motivoNoAtencion) {
        this.motivoNoAtencionNumeroMotivoNoAtencion = motivoNoAtencion;
    }

    @Override
    public Siono getSionoNumeroSionoCarnetVacunacion() {
        return this.sionoNumeroSionoCarnetVacunacion;
    }

    public void setSionoNumeroSionoCarnetVacunacion(Siono siono) {
        this.sionoNumeroSionoCarnetVacunacion = siono;
    }

    @Override
    public ClaseImpedimento getClaseImpedimentoNumeroClaseImpedimento() {
        return this.claseImpedimentoNumeroClaseImpedimento;
    }

    public void setClaseImpedimentoNumeroClaseImpedimento(ClaseImpedimento claseImpedimento) {
        this.claseImpedimentoNumeroClaseImpedimento = claseImpedimento;
    }

    @Override
    public CausaImpedimento getCausaImpedimentoNumeroCausaImpedimento() {
        return this.causaImpedimentoNumeroCausaImpedimento;
    }

    public void setCausaImpedimentoNumeroCausaImpedimento(CausaImpedimento causaImpedimento) {
        this.causaImpedimentoNumeroCausaImpedimento = causaImpedimento;
    }

    @Override
    public Siono getSionoNumeroSionoDifParaCaminar() {
        return this.sionoNumeroSionoDifParaCaminar;
    }

    public void setSionoNumeroSionoDifParaCaminar(Siono siono) {
        this.sionoNumeroSionoDifParaCaminar = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDifParaVestirse() {
        return this.sionoNumeroSionoDifParaVestirse;
    }

    public void setSionoNumeroSionoDifParaVestirse(Siono siono) {
        this.sionoNumeroSionoDifParaVestirse = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDifParaBanarse() {
        return this.sionoNumeroSionoDifParaBanarse;
    }

    public void setSionoNumeroSionoDifParaBanarse(Siono siono) {
        this.sionoNumeroSionoDifParaBanarse = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDifParaComer() {
        return this.sionoNumeroSionoDifParaComer;
    }

    public void setSionoNumeroSionoDifParaComer(Siono siono) {
        this.sionoNumeroSionoDifParaComer = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDifParaLaCama() {
        return this.sionoNumeroSionoDifParaLaCama;
    }

    public void setSionoNumeroSionoDifParaLaCama(Siono siono) {
        this.sionoNumeroSionoDifParaLaCama = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDifParaElBano() {
        return this.sionoNumeroSionoDifParaElBano;
    }

    public void setSionoNumeroSionoDifParaElBano(Siono siono) {
        this.sionoNumeroSionoDifParaElBano = siono;
    }

    @Override
    public Siono getSionoNumeroSionoTrabajo() {
        return this.sionoNumeroSionoTrabajo;
    }

    public void setSionoNumeroSionoTrabajo(Siono siono) {
        this.sionoNumeroSionoTrabajo = siono;
    }

    @Override
    public MotivoNoTrabajo getMotivoNoTrabajoNumeroMotivoNoTrabajo() {
        return this.motivoNoTrabajoNumeroMotivoNoTrabajo;
    }

    public void setMotivoNoTrabajoNumeroMotivoNoTrabajo(MotivoNoTrabajo motivoNoTrabajo) {
        this.motivoNoTrabajoNumeroMotivoNoTrabajo = motivoNoTrabajo;
    }

    @Override
    public TipoRelacionLab getTipoRelacionLabNumeroTipoRelacionLab() {
        return this.tipoRelacionLabNumeroTipoRelacionLab;
    }

    public void setTipoRelacionLabNumeroTipoRelacionLab(TipoRelacionLab tipoRelacionLab) {
        this.tipoRelacionLabNumeroTipoRelacionLab = tipoRelacionLab;
    }

    @Override
    public PotencialBen getPotencialBenIdPotencialBen() {
        return this.potencialBenIdPotencialBen;
    }

    public void setPotencialBenIdPotencialBen(PotencialBen potencialBen) {
        this.potencialBenIdPotencialBen = potencialBen;
    }

    @Override
    public Collection<LogImpPer> getLogImpPerIdFichaPersonaCollection() {
        return this.logImpPerIdFichaPersonaCollection;
    }

    public void setLogImpPerIdFichaPersonaCollection(Collection<LogImpPer> collection) {
        this.logImpPerIdFichaPersonaCollection = collection;
    }

    @Override
    public Collection<LogImpPerEec> getLogImpPerEecIdFichaPersonaCollection() {
        return this.logImpPerEecIdFichaPersonaCollection;
    }

    public void setLogImpPerEecIdFichaPersonaCollection(Collection<LogImpPerEec> collection) {
        this.logImpPerEecIdFichaPersonaCollection = collection;
    }

    @Override
    public Collection<LogProAcrPotBen> getLogProAcrPotBenIdFichaPersonaCollection() {
        return this.logProAcrPotBenIdFichaPersonaCollection;
    }

    public void setLogProAcrPotBenIdFichaPersonaCollection(Collection<LogProAcrPotBen> collection) {
        this.logProAcrPotBenIdFichaPersonaCollection = collection;
    }

    @Override
    public Collection<Persona> getPersonaIdFichaPersonaCollection() {
        return this.personaIdFichaPersonaCollection;
    }

    public void setPersonaIdFichaPersonaCollection(Collection<Persona> collection) {
        this.personaIdFichaPersonaCollection = collection;
    }

    @Override
    public Collection<PotencialBen> getPotencialBenIdFichaPersonaCollection() {
        return this.potencialBenIdFichaPersonaCollection;
    }

    public void setPotencialBenIdFichaPersonaCollection(Collection<PotencialBen> collection) {
        this.potencialBenIdFichaPersonaCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FichaPersona) {
            FichaPersona that = (FichaPersona) object;
            return idFichaPersona == null ? that.idFichaPersona == null ? 0 : -1
                    : idFichaPersona.compareTo(that.idFichaPersona);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFichaPersona == null ? 0 : idFichaPersona.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FichaPersona) {
            FichaPersona that = (FichaPersona) object;
            return ((idFichaPersona == null && that.idFichaPersona == null) ||
                    (idFichaPersona != null && idFichaPersona.equals(that.idFichaPersona)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFichaPersona;
    }
}
