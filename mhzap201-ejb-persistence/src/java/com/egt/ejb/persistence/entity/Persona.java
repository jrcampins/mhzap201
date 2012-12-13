/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.PersonaBase;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona")
public class Persona implements PersonaBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Long idPersona;

    @Basic(optional = false)
    @Column(name = "version_persona")
    private long versionPersona;

    @Basic(optional = false)
    @Column(name = "codigo_persona")
    private String codigoPersona;

    @Basic(optional = false)
    @Column(name = "nombre_persona")
    private String nombrePersona;

    @Column(name = "numero_cedula")
    private Integer numeroCedula;

    @Column(name = "letra_cedula")
    private String letraCedula;

    @Column(name = "fecha_expedicion_cedula")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExpedicionCedula;

    @Column(name = "fecha_vencimiento_cedula")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimientoCedula;

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

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

    @Basic(optional = false)
    @Column(name = "es_paraguayo_natural")
    private int esParaguayoNatural;

    @Basic(optional = false)
    @Column(name = "es_indigena")
    private int esIndigena;

    @Column(name = "nombre_comunidad_indigena")
    private String nombreComunidadIndigena;

    @Column(name = "manzana")
    private String manzana;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "numero_telefono_linea_baja")
    private String numeroTelefonoLineaBaja;

    @Column(name = "numero_telefono_celular")
    private String numeroTelefonoCelular;

    @Column(name = "certificado_vida")
    private String certificadoVida;

    @Column(name = "fecha_certificado_vida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCertificadoVida;

    @Basic(optional = false)
    @Column(name = "es_certificado_vida_anulado")
    private int esCertificadoVidaAnulado;

    @Column(name = "comentarios_anul_cer_vida")
    private String comentariosAnulCerVida;

    @Column(name = "certificado_defuncion")
    private String certificadoDefuncion;

    @Column(name = "fecha_certificado_defuncion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCertificadoDefuncion;

    @Basic(optional = false)
    @Column(name = "es_cer_defuncion_anulado")
    private int esCerDefuncionAnulado;

    @Column(name = "comentarios_anul_cer_defuncion")
    private String comentariosAnulCerDefuncion;

    @Basic(optional = false)
    @Column(name = "es_persona_con_empleo")
    private int esPersonaConEmpleo;

    @Basic(optional = false)
    @Column(name = "es_persona_con_jubilacion")
    private int esPersonaConJubilacion;

    @Basic(optional = false)
    @Column(name = "es_persona_con_pension")
    private int esPersonaConPension;

    @Basic(optional = false)
    @Column(name = "es_persona_con_subsidio")
    private int esPersonaConSubsidio;

    @Basic(optional = false)
    @Column(name = "es_persona_con_deuda")
    private int esPersonaConDeuda;

    @Basic(optional = false)
    @Column(name = "es_persona_con_pena_judicial")
    private int esPersonaConPenaJudicial;

    @Basic(optional = false)
    @Column(name = "es_persona_con_cer_vida")
    private int esPersonaConCerVida;

    @Basic(optional = false)
    @Column(name = "es_persona_con_carta_renuncia")
    private int esPersonaConCartaRenuncia;

    @Basic(optional = false)
    @Column(name = "es_persona_elegible_para_pen")
    private int esPersonaElegibleParaPen;

    @Basic(optional = false)
    @Column(name = "es_persona_acreditada_para_pen")
    private int esPersonaAcreditadaParaPen;

    @Basic(optional = false)
    @Column(name = "es_persona_con_copia_cedula")
    private int esPersonaConCopiaCedula;

    @Basic(optional = false)
    @Column(name = "es_persona_con_declaracion_jur")
    private int esPersonaConDeclaracionJur;

    @Column(name = "monto_pension")
    private BigDecimal montoPension;

    @Column(name = "lugar_solicitud_pension")
    private String lugarSolicitudPension;

    @Column(name = "fecha_solicitud_pension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitudPension;

    @Column(name = "comentarios_solicitud_pension")
    private String comentariosSolicitudPension;

    @Column(name = "fecha_aprobacion_pension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAprobacionPension;

    @Column(name = "comentarios_aprobacion_pension")
    private String comentariosAprobacionPension;

    @Column(name = "fecha_otorgamiento_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOtorgamientoPen;

    @Column(name = "comentarios_otorgamiento_pen")
    private String comentariosOtorgamientoPen;

    @Column(name = "fecha_denegacion_pension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDenegacionPension;

    @Column(name = "otra_causa_den_pension")
    private String otraCausaDenPension;

    @Column(name = "comentarios_denegacion_pension")
    private String comentariosDenegacionPension;

    @Column(name = "fecha_revocacion_pension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRevocacionPension;

    @Column(name = "otra_causa_rev_pension")
    private String otraCausaRevPension;

    @Column(name = "comentarios_revocacion_pension")
    private String comentariosRevocacionPension;

    @Column(name = "fecha_solicitud_reco_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitudRecoPen;

    @Column(name = "comentarios_solicitud_reco_pen")
    private String comentariosSolicitudRecoPen;

    @Column(name = "fecha_aprobacion_reco_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAprobacionRecoPen;

    @Column(name = "comentarios_apr_reco_pen")
    private String comentariosAprRecoPen;

    @Column(name = "fecha_denegacion_reco_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDenegacionRecoPen;

    @Column(name = "otra_causa_den_reco_pen")
    private String otraCausaDenRecoPen;

    @Column(name = "comentarios_den_reco_pen")
    private String comentariosDenRecoPen;

    @Column(name = "fecha_registro_denuncia_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroDenunciaPen;

    @Column(name = "comentarios_registro_denu_pen")
    private String comentariosRegistroDenuPen;

    @Column(name = "fecha_confirmacion_denu_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConfirmacionDenuPen;

    @Column(name = "comentarios_conf_denu_pen")
    private String comentariosConfDenuPen;

    @Column(name = "fecha_desmentido_denuncia_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesmentidoDenunciaPen;

    @Column(name = "comentarios_des_denu_pen")
    private String comentariosDesDenuPen;

    @Column(name = "fecha_ficha_persona")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFichaPersona;

    @Column(name = "indice_calidad_vida")
    private BigDecimal indiceCalidadVida;

    @Column(name = "fecha_ultimo_cobro_pension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimoCobroPension;

    @Column(name = "notas_anul_fec_ult_cob_pen")
    private String notasAnulFecUltCobPen;

    @Column(name = "fecha_hora_ult_act_jupe")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraUltActJupe;

    @Column(name = "numero_resolucion_otor_pen")
    private String numeroResolucionOtorPen;

    @Column(name = "fecha_resolucion_otor_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResolucionOtorPen;

    @Column(name = "numero_resolucion_den_pen")
    private String numeroResolucionDenPen;

    @Column(name = "fecha_resolucion_den_pen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResolucionDenPen;

    @JoinColumn(name = "numero_sexo_persona", referencedColumnName = "numero_sexo_persona")
    @ManyToOne
    private SexoPersona sexoPersonaNumeroSexoPersona;

    @JoinColumn(name = "numero_estado_civil", referencedColumnName = "numero_estado_civil")
    @ManyToOne
    private EstadoCivil estadoCivilNumeroEstadoCivil;

    @JoinColumn(name = "id_etnia_indigena", referencedColumnName = "id_etnia_indigena")
    @ManyToOne
    private EtniaIndigena etniaIndigenaIdEtniaIndigena;

    @JoinColumn(name = "id_departamento", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDepartamento;

    @JoinColumn(name = "id_distrito", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdDistrito;

    @JoinColumn(name = "numero_tipo_area", referencedColumnName = "numero_tipo_area")
    @ManyToOne
    private TipoArea tipoAreaNumeroTipoArea;

    @JoinColumn(name = "id_barrio", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdBarrio;

    @JoinColumn(name = "id_manzana", referencedColumnName = "id_ubicacion")
    @ManyToOne
    private Ubicacion ubicacionIdManzana;

    @JoinColumn(name = "numero_condicion_pension", referencedColumnName = "numero_condicion_pension")
    @ManyToOne
    private CondicionPension condicionPensionNumeroCondicionPension;

    @JoinColumn(name = "numero_causa_den_pension", referencedColumnName = "numero_causa_den_pension")
    @ManyToOne
    private CausaDenPension causaDenPensionNumeroCausaDenPension;

    @JoinColumn(name = "numero_causa_rev_pension", referencedColumnName = "numero_causa_rev_pension")
    @ManyToOne
    private CausaRevPension causaRevPensionNumeroCausaRevPension;

    @JoinColumn(name = "numero_condicion_reco_pen", referencedColumnName = "numero_condicion_reco_pen")
    @ManyToOne
    private CondicionRecoPen condicionRecoPenNumeroCondicionRecoPen;

    @JoinColumn(name = "numero_causa_den_reco_pen", referencedColumnName = "numero_causa_den_reco_pen")
    @ManyToOne
    private CausaDenRecoPen causaDenRecoPenNumeroCausaDenRecoPen;

    @JoinColumn(name = "numero_condicion_denu_pen", referencedColumnName = "numero_condicion_denu_pen")
    @ManyToOne
    private CondicionDenuPen condicionDenuPenNumeroCondicionDenuPen;

    @JoinColumn(name = "id_ficha_persona", referencedColumnName = "id_ficha_persona")
    @ManyToOne
    private FichaPersona fichaPersonaIdFichaPersona;

    @JoinColumn(name = "numero_tipo_act_jupe", referencedColumnName = "numero_tipo_act_jupe")
    @ManyToOne
    private TipoActJupe tipoActJupeNumeroTipoActJupe;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "personaIdPersona")
    private Collection<ObjecionElePen> objecionElePenIdPersonaCollection;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "personaIdPersona")
    private PotencialBen potencialBenIdPersona;

    public Persona() {
    }

    @Override
    public Long getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public long getVersionPersona() {
        return this.versionPersona;
    }

    public void setVersionPersona(long versionPersona) {
        this.versionPersona = versionPersona;
    }

    @Override
    public String getCodigoPersona() {
        return this.codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    @Override
    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
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
    public Date getFechaExpedicionCedula() {
        return this.fechaExpedicionCedula;
    }

    public void setFechaExpedicionCedula(Date fechaExpedicionCedula) {
        this.fechaExpedicionCedula = fechaExpedicionCedula;
    }

    @Override
    public Date getFechaVencimientoCedula() {
        return this.fechaVencimientoCedula;
    }

    public void setFechaVencimientoCedula(Date fechaVencimientoCedula) {
        this.fechaVencimientoCedula = fechaVencimientoCedula;
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
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int getEsParaguayoNatural() {
        return this.esParaguayoNatural;
    }

    public void setEsParaguayoNatural(int esParaguayoNatural) {
        this.esParaguayoNatural = esParaguayoNatural;
    }

    @Override
    public int getEsIndigena() {
        return this.esIndigena;
    }

    public void setEsIndigena(int esIndigena) {
        this.esIndigena = esIndigena;
    }

    @Override
    public String getNombreComunidadIndigena() {
        return this.nombreComunidadIndigena;
    }

    public void setNombreComunidadIndigena(String nombreComunidadIndigena) {
        this.nombreComunidadIndigena = nombreComunidadIndigena;
    }

    @Override
    public String getManzana() {
        return this.manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getNumeroTelefonoLineaBaja() {
        return this.numeroTelefonoLineaBaja;
    }

    public void setNumeroTelefonoLineaBaja(String numeroTelefonoLineaBaja) {
        this.numeroTelefonoLineaBaja = numeroTelefonoLineaBaja;
    }

    @Override
    public String getNumeroTelefonoCelular() {
        return this.numeroTelefonoCelular;
    }

    public void setNumeroTelefonoCelular(String numeroTelefonoCelular) {
        this.numeroTelefonoCelular = numeroTelefonoCelular;
    }

    @Override
    public String getCertificadoVida() {
        return this.certificadoVida;
    }

    public void setCertificadoVida(String certificadoVida) {
        this.certificadoVida = certificadoVida;
    }

    @Override
    public Date getFechaCertificadoVida() {
        return this.fechaCertificadoVida;
    }

    public void setFechaCertificadoVida(Date fechaCertificadoVida) {
        this.fechaCertificadoVida = fechaCertificadoVida;
    }

    @Override
    public int getEsCertificadoVidaAnulado() {
        return this.esCertificadoVidaAnulado;
    }

    public void setEsCertificadoVidaAnulado(int esCertificadoVidaAnulado) {
        this.esCertificadoVidaAnulado = esCertificadoVidaAnulado;
    }

    @Override
    public String getComentariosAnulCerVida() {
        return this.comentariosAnulCerVida;
    }

    public void setComentariosAnulCerVida(String comentariosAnulCerVida) {
        this.comentariosAnulCerVida = comentariosAnulCerVida;
    }

    @Override
    public String getCertificadoDefuncion() {
        return this.certificadoDefuncion;
    }

    public void setCertificadoDefuncion(String certificadoDefuncion) {
        this.certificadoDefuncion = certificadoDefuncion;
    }

    @Override
    public Date getFechaCertificadoDefuncion() {
        return this.fechaCertificadoDefuncion;
    }

    public void setFechaCertificadoDefuncion(Date fechaCertificadoDefuncion) {
        this.fechaCertificadoDefuncion = fechaCertificadoDefuncion;
    }

    @Override
    public int getEsCerDefuncionAnulado() {
        return this.esCerDefuncionAnulado;
    }

    public void setEsCerDefuncionAnulado(int esCerDefuncionAnulado) {
        this.esCerDefuncionAnulado = esCerDefuncionAnulado;
    }

    @Override
    public String getComentariosAnulCerDefuncion() {
        return this.comentariosAnulCerDefuncion;
    }

    public void setComentariosAnulCerDefuncion(String comentariosAnulCerDefuncion) {
        this.comentariosAnulCerDefuncion = comentariosAnulCerDefuncion;
    }

    @Override
    public int getEsPersonaConEmpleo() {
        return this.esPersonaConEmpleo;
    }

    public void setEsPersonaConEmpleo(int esPersonaConEmpleo) {
        this.esPersonaConEmpleo = esPersonaConEmpleo;
    }

    @Override
    public int getEsPersonaConJubilacion() {
        return this.esPersonaConJubilacion;
    }

    public void setEsPersonaConJubilacion(int esPersonaConJubilacion) {
        this.esPersonaConJubilacion = esPersonaConJubilacion;
    }

    @Override
    public int getEsPersonaConPension() {
        return this.esPersonaConPension;
    }

    public void setEsPersonaConPension(int esPersonaConPension) {
        this.esPersonaConPension = esPersonaConPension;
    }

    @Override
    public int getEsPersonaConSubsidio() {
        return this.esPersonaConSubsidio;
    }

    public void setEsPersonaConSubsidio(int esPersonaConSubsidio) {
        this.esPersonaConSubsidio = esPersonaConSubsidio;
    }

    @Override
    public int getEsPersonaConDeuda() {
        return this.esPersonaConDeuda;
    }

    public void setEsPersonaConDeuda(int esPersonaConDeuda) {
        this.esPersonaConDeuda = esPersonaConDeuda;
    }

    @Override
    public int getEsPersonaConPenaJudicial() {
        return this.esPersonaConPenaJudicial;
    }

    public void setEsPersonaConPenaJudicial(int esPersonaConPenaJudicial) {
        this.esPersonaConPenaJudicial = esPersonaConPenaJudicial;
    }

    @Override
    public int getEsPersonaConCerVida() {
        return this.esPersonaConCerVida;
    }

    public void setEsPersonaConCerVida(int esPersonaConCerVida) {
        this.esPersonaConCerVida = esPersonaConCerVida;
    }

    @Override
    public int getEsPersonaConCartaRenuncia() {
        return this.esPersonaConCartaRenuncia;
    }

    public void setEsPersonaConCartaRenuncia(int esPersonaConCartaRenuncia) {
        this.esPersonaConCartaRenuncia = esPersonaConCartaRenuncia;
    }

    @Override
    public int getEsPersonaElegibleParaPen() {
        return this.esPersonaElegibleParaPen;
    }

    public void setEsPersonaElegibleParaPen(int esPersonaElegibleParaPen) {
        this.esPersonaElegibleParaPen = esPersonaElegibleParaPen;
    }

    @Override
    public int getEsPersonaAcreditadaParaPen() {
        return this.esPersonaAcreditadaParaPen;
    }

    public void setEsPersonaAcreditadaParaPen(int esPersonaAcreditadaParaPen) {
        this.esPersonaAcreditadaParaPen = esPersonaAcreditadaParaPen;
    }

    @Override
    public int getEsPersonaConCopiaCedula() {
        return this.esPersonaConCopiaCedula;
    }

    public void setEsPersonaConCopiaCedula(int esPersonaConCopiaCedula) {
        this.esPersonaConCopiaCedula = esPersonaConCopiaCedula;
    }

    @Override
    public int getEsPersonaConDeclaracionJur() {
        return this.esPersonaConDeclaracionJur;
    }

    public void setEsPersonaConDeclaracionJur(int esPersonaConDeclaracionJur) {
        this.esPersonaConDeclaracionJur = esPersonaConDeclaracionJur;
    }

    @Override
    public BigDecimal getMontoPension() {
        return this.montoPension;
    }

    public void setMontoPension(BigDecimal montoPension) {
        this.montoPension = montoPension;
    }

    @Override
    public String getLugarSolicitudPension() {
        return this.lugarSolicitudPension;
    }

    public void setLugarSolicitudPension(String lugarSolicitudPension) {
        this.lugarSolicitudPension = lugarSolicitudPension;
    }

    @Override
    public Date getFechaSolicitudPension() {
        return this.fechaSolicitudPension;
    }

    public void setFechaSolicitudPension(Date fechaSolicitudPension) {
        this.fechaSolicitudPension = fechaSolicitudPension;
    }

    @Override
    public String getComentariosSolicitudPension() {
        return this.comentariosSolicitudPension;
    }

    public void setComentariosSolicitudPension(String comentariosSolicitudPension) {
        this.comentariosSolicitudPension = comentariosSolicitudPension;
    }

    @Override
    public Date getFechaAprobacionPension() {
        return this.fechaAprobacionPension;
    }

    public void setFechaAprobacionPension(Date fechaAprobacionPension) {
        this.fechaAprobacionPension = fechaAprobacionPension;
    }

    @Override
    public String getComentariosAprobacionPension() {
        return this.comentariosAprobacionPension;
    }

    public void setComentariosAprobacionPension(String comentariosAprobacionPension) {
        this.comentariosAprobacionPension = comentariosAprobacionPension;
    }

    @Override
    public Date getFechaOtorgamientoPen() {
        return this.fechaOtorgamientoPen;
    }

    public void setFechaOtorgamientoPen(Date fechaOtorgamientoPen) {
        this.fechaOtorgamientoPen = fechaOtorgamientoPen;
    }

    @Override
    public String getComentariosOtorgamientoPen() {
        return this.comentariosOtorgamientoPen;
    }

    public void setComentariosOtorgamientoPen(String comentariosOtorgamientoPen) {
        this.comentariosOtorgamientoPen = comentariosOtorgamientoPen;
    }

    @Override
    public Date getFechaDenegacionPension() {
        return this.fechaDenegacionPension;
    }

    public void setFechaDenegacionPension(Date fechaDenegacionPension) {
        this.fechaDenegacionPension = fechaDenegacionPension;
    }

    @Override
    public String getOtraCausaDenPension() {
        return this.otraCausaDenPension;
    }

    public void setOtraCausaDenPension(String otraCausaDenPension) {
        this.otraCausaDenPension = otraCausaDenPension;
    }

    @Override
    public String getComentariosDenegacionPension() {
        return this.comentariosDenegacionPension;
    }

    public void setComentariosDenegacionPension(String comentariosDenegacionPension) {
        this.comentariosDenegacionPension = comentariosDenegacionPension;
    }

    @Override
    public Date getFechaRevocacionPension() {
        return this.fechaRevocacionPension;
    }

    public void setFechaRevocacionPension(Date fechaRevocacionPension) {
        this.fechaRevocacionPension = fechaRevocacionPension;
    }

    @Override
    public String getOtraCausaRevPension() {
        return this.otraCausaRevPension;
    }

    public void setOtraCausaRevPension(String otraCausaRevPension) {
        this.otraCausaRevPension = otraCausaRevPension;
    }

    @Override
    public String getComentariosRevocacionPension() {
        return this.comentariosRevocacionPension;
    }

    public void setComentariosRevocacionPension(String comentariosRevocacionPension) {
        this.comentariosRevocacionPension = comentariosRevocacionPension;
    }

    @Override
    public Date getFechaSolicitudRecoPen() {
        return this.fechaSolicitudRecoPen;
    }

    public void setFechaSolicitudRecoPen(Date fechaSolicitudRecoPen) {
        this.fechaSolicitudRecoPen = fechaSolicitudRecoPen;
    }

    @Override
    public String getComentariosSolicitudRecoPen() {
        return this.comentariosSolicitudRecoPen;
    }

    public void setComentariosSolicitudRecoPen(String comentariosSolicitudRecoPen) {
        this.comentariosSolicitudRecoPen = comentariosSolicitudRecoPen;
    }

    @Override
    public Date getFechaAprobacionRecoPen() {
        return this.fechaAprobacionRecoPen;
    }

    public void setFechaAprobacionRecoPen(Date fechaAprobacionRecoPen) {
        this.fechaAprobacionRecoPen = fechaAprobacionRecoPen;
    }

    @Override
    public String getComentariosAprRecoPen() {
        return this.comentariosAprRecoPen;
    }

    public void setComentariosAprRecoPen(String comentariosAprRecoPen) {
        this.comentariosAprRecoPen = comentariosAprRecoPen;
    }

    @Override
    public Date getFechaDenegacionRecoPen() {
        return this.fechaDenegacionRecoPen;
    }

    public void setFechaDenegacionRecoPen(Date fechaDenegacionRecoPen) {
        this.fechaDenegacionRecoPen = fechaDenegacionRecoPen;
    }

    @Override
    public String getOtraCausaDenRecoPen() {
        return this.otraCausaDenRecoPen;
    }

    public void setOtraCausaDenRecoPen(String otraCausaDenRecoPen) {
        this.otraCausaDenRecoPen = otraCausaDenRecoPen;
    }

    @Override
    public String getComentariosDenRecoPen() {
        return this.comentariosDenRecoPen;
    }

    public void setComentariosDenRecoPen(String comentariosDenRecoPen) {
        this.comentariosDenRecoPen = comentariosDenRecoPen;
    }

    @Override
    public Date getFechaRegistroDenunciaPen() {
        return this.fechaRegistroDenunciaPen;
    }

    public void setFechaRegistroDenunciaPen(Date fechaRegistroDenunciaPen) {
        this.fechaRegistroDenunciaPen = fechaRegistroDenunciaPen;
    }

    @Override
    public String getComentariosRegistroDenuPen() {
        return this.comentariosRegistroDenuPen;
    }

    public void setComentariosRegistroDenuPen(String comentariosRegistroDenuPen) {
        this.comentariosRegistroDenuPen = comentariosRegistroDenuPen;
    }

    @Override
    public Date getFechaConfirmacionDenuPen() {
        return this.fechaConfirmacionDenuPen;
    }

    public void setFechaConfirmacionDenuPen(Date fechaConfirmacionDenuPen) {
        this.fechaConfirmacionDenuPen = fechaConfirmacionDenuPen;
    }

    @Override
    public String getComentariosConfDenuPen() {
        return this.comentariosConfDenuPen;
    }

    public void setComentariosConfDenuPen(String comentariosConfDenuPen) {
        this.comentariosConfDenuPen = comentariosConfDenuPen;
    }

    @Override
    public Date getFechaDesmentidoDenunciaPen() {
        return this.fechaDesmentidoDenunciaPen;
    }

    public void setFechaDesmentidoDenunciaPen(Date fechaDesmentidoDenunciaPen) {
        this.fechaDesmentidoDenunciaPen = fechaDesmentidoDenunciaPen;
    }

    @Override
    public String getComentariosDesDenuPen() {
        return this.comentariosDesDenuPen;
    }

    public void setComentariosDesDenuPen(String comentariosDesDenuPen) {
        this.comentariosDesDenuPen = comentariosDesDenuPen;
    }

    @Override
    public Date getFechaFichaPersona() {
        return this.fechaFichaPersona;
    }

    public void setFechaFichaPersona(Date fechaFichaPersona) {
        this.fechaFichaPersona = fechaFichaPersona;
    }

    @Override
    public BigDecimal getIndiceCalidadVida() {
        return this.indiceCalidadVida;
    }

    public void setIndiceCalidadVida(BigDecimal indiceCalidadVida) {
        this.indiceCalidadVida = indiceCalidadVida;
    }

    @Override
    public Date getFechaUltimoCobroPension() {
        return this.fechaUltimoCobroPension;
    }

    public void setFechaUltimoCobroPension(Date fechaUltimoCobroPension) {
        this.fechaUltimoCobroPension = fechaUltimoCobroPension;
    }

    @Override
    public String getNotasAnulFecUltCobPen() {
        return this.notasAnulFecUltCobPen;
    }

    public void setNotasAnulFecUltCobPen(String notasAnulFecUltCobPen) {
        this.notasAnulFecUltCobPen = notasAnulFecUltCobPen;
    }

    @Override
    public Date getFechaHoraUltActJupe() {
        return this.fechaHoraUltActJupe;
    }

    public void setFechaHoraUltActJupe(Date fechaHoraUltActJupe) {
        this.fechaHoraUltActJupe = fechaHoraUltActJupe;
    }

    @Override
    public String getNumeroResolucionOtorPen() {
        return this.numeroResolucionOtorPen;
    }

    public void setNumeroResolucionOtorPen(String numeroResolucionOtorPen) {
        this.numeroResolucionOtorPen = numeroResolucionOtorPen;
    }

    @Override
    public Date getFechaResolucionOtorPen() {
        return this.fechaResolucionOtorPen;
    }

    public void setFechaResolucionOtorPen(Date fechaResolucionOtorPen) {
        this.fechaResolucionOtorPen = fechaResolucionOtorPen;
    }

    @Override
    public String getNumeroResolucionDenPen() {
        return this.numeroResolucionDenPen;
    }

    public void setNumeroResolucionDenPen(String numeroResolucionDenPen) {
        this.numeroResolucionDenPen = numeroResolucionDenPen;
    }

    @Override
    public Date getFechaResolucionDenPen() {
        return this.fechaResolucionDenPen;
    }

    public void setFechaResolucionDenPen(Date fechaResolucionDenPen) {
        this.fechaResolucionDenPen = fechaResolucionDenPen;
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
    public EtniaIndigena getEtniaIndigenaIdEtniaIndigena() {
        return this.etniaIndigenaIdEtniaIndigena;
    }

    public void setEtniaIndigenaIdEtniaIndigena(EtniaIndigena etniaIndigena) {
        this.etniaIndigenaIdEtniaIndigena = etniaIndigena;
    }

    @Override
    public Ubicacion getUbicacionIdDepartamento() {
        return this.ubicacionIdDepartamento;
    }

    public void setUbicacionIdDepartamento(Ubicacion ubicacion) {
        this.ubicacionIdDepartamento = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdDistrito() {
        return this.ubicacionIdDistrito;
    }

    public void setUbicacionIdDistrito(Ubicacion ubicacion) {
        this.ubicacionIdDistrito = ubicacion;
    }

    @Override
    public TipoArea getTipoAreaNumeroTipoArea() {
        return this.tipoAreaNumeroTipoArea;
    }

    public void setTipoAreaNumeroTipoArea(TipoArea tipoArea) {
        this.tipoAreaNumeroTipoArea = tipoArea;
    }

    @Override
    public Ubicacion getUbicacionIdBarrio() {
        return this.ubicacionIdBarrio;
    }

    public void setUbicacionIdBarrio(Ubicacion ubicacion) {
        this.ubicacionIdBarrio = ubicacion;
    }

    @Override
    public Ubicacion getUbicacionIdManzana() {
        return this.ubicacionIdManzana;
    }

    public void setUbicacionIdManzana(Ubicacion ubicacion) {
        this.ubicacionIdManzana = ubicacion;
    }

    @Override
    public CondicionPension getCondicionPensionNumeroCondicionPension() {
        return this.condicionPensionNumeroCondicionPension;
    }

    public void setCondicionPensionNumeroCondicionPension(CondicionPension condicionPension) {
        this.condicionPensionNumeroCondicionPension = condicionPension;
    }

    @Override
    public CausaDenPension getCausaDenPensionNumeroCausaDenPension() {
        return this.causaDenPensionNumeroCausaDenPension;
    }

    public void setCausaDenPensionNumeroCausaDenPension(CausaDenPension causaDenPension) {
        this.causaDenPensionNumeroCausaDenPension = causaDenPension;
    }

    @Override
    public CausaRevPension getCausaRevPensionNumeroCausaRevPension() {
        return this.causaRevPensionNumeroCausaRevPension;
    }

    public void setCausaRevPensionNumeroCausaRevPension(CausaRevPension causaRevPension) {
        this.causaRevPensionNumeroCausaRevPension = causaRevPension;
    }

    @Override
    public CondicionRecoPen getCondicionRecoPenNumeroCondicionRecoPen() {
        return this.condicionRecoPenNumeroCondicionRecoPen;
    }

    public void setCondicionRecoPenNumeroCondicionRecoPen(CondicionRecoPen condicionRecoPen) {
        this.condicionRecoPenNumeroCondicionRecoPen = condicionRecoPen;
    }

    @Override
    public CausaDenRecoPen getCausaDenRecoPenNumeroCausaDenRecoPen() {
        return this.causaDenRecoPenNumeroCausaDenRecoPen;
    }

    public void setCausaDenRecoPenNumeroCausaDenRecoPen(CausaDenRecoPen causaDenRecoPen) {
        this.causaDenRecoPenNumeroCausaDenRecoPen = causaDenRecoPen;
    }

    @Override
    public CondicionDenuPen getCondicionDenuPenNumeroCondicionDenuPen() {
        return this.condicionDenuPenNumeroCondicionDenuPen;
    }

    public void setCondicionDenuPenNumeroCondicionDenuPen(CondicionDenuPen condicionDenuPen) {
        this.condicionDenuPenNumeroCondicionDenuPen = condicionDenuPen;
    }

    @Override
    public FichaPersona getFichaPersonaIdFichaPersona() {
        return this.fichaPersonaIdFichaPersona;
    }

    public void setFichaPersonaIdFichaPersona(FichaPersona fichaPersona) {
        this.fichaPersonaIdFichaPersona = fichaPersona;
    }

    @Override
    public TipoActJupe getTipoActJupeNumeroTipoActJupe() {
        return this.tipoActJupeNumeroTipoActJupe;
    }

    public void setTipoActJupeNumeroTipoActJupe(TipoActJupe tipoActJupe) {
        this.tipoActJupeNumeroTipoActJupe = tipoActJupe;
    }

    @Override
    public Collection<ObjecionElePen> getObjecionElePenIdPersonaCollection() {
        return this.objecionElePenIdPersonaCollection;
    }

    public void setObjecionElePenIdPersonaCollection(Collection<ObjecionElePen> collection) {
        this.objecionElePenIdPersonaCollection = collection;
    }

    @Override
    public PotencialBen getPotencialBenIdPersona() {
        return this.potencialBenIdPersona;
    }

    public void setPotencialBenIdPersona(PotencialBen potencialBen) {
        this.potencialBenIdPersona = potencialBen;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Persona) {
            Persona that = (Persona) object;
            return idPersona == null ? that.idPersona == null ? 0 : -1
                    : idPersona.compareTo(that.idPersona);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPersona == null ? 0 : idPersona.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Persona) {
            Persona that = (Persona) object;
            return ((idPersona == null && that.idPersona == null) ||
                    (idPersona != null && idPersona.equals(that.idPersona)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPersona;
    }
}
