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

import com.egt.base.persistence.entity.PotencialBenBase;
import java.io.Serializable;
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
@Table(name = "potencial_ben")
public class PotencialBen implements PotencialBenBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_potencial_ben")
    private Long idPotencialBen;

    @Basic(optional = false)
    @Column(name = "version_potencial_ben")
    private long versionPotencialBen;

    @Basic(optional = false)
    @Column(name = "codigo_potencial_ben")
    private String codigoPotencialBen;

    @Basic(optional = false)
    @Column(name = "nombre_potencial_ben")
    private String nombrePotencialBen;

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

    @Column(name = "edad")
    private Integer edad;

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

    @Column(name = "compania")
    private String compania;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "nombre_responsable_hogar")
    private String nombreResponsableHogar;

    @Column(name = "numero_telefono_resp_hogar")
    private String numeroTelefonoRespHogar;

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

    @Column(name = "nombre_referente")
    private String nombreReferente;

    @Column(name = "numero_telefono_referente")
    private String numeroTelefonoReferente;

    @Column(name = "fecha_validacion_censo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaValidacionCenso;

    @Column(name = "otra_causa_inv_censo")
    private String otraCausaInvCenso;

    @Column(name = "comentarios_validacion_censo")
    private String comentariosValidacionCenso;

    @Column(name = "fecha_reclamo_censo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReclamoCenso;

    @Column(name = "comentarios_reclamo_censo")
    private String comentariosReclamoCenso;

    @Column(name = "fecha_aprobacion_reclamo_censo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAprobacionReclamoCenso;

    @Column(name = "comentarios_apr_recl_cen")
    private String comentariosAprReclCen;

    @Column(name = "fecha_denegacion_reclamo_censo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDenegacionReclamoCenso;

    @Column(name = "otra_causa_den_recl_cen")
    private String otraCausaDenReclCen;

    @Column(name = "comentarios_den_recl_cen")
    private String comentariosDenReclCen;

    @Column(name = "fecha_registro_pot_ben")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroPotBen;

    @Basic(optional = false)
    @Column(name = "es_potencial_ben_inactivo")
    private int esPotencialBenInactivo;

    @Column(name = "fecha_ultima_visita_censo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaVisitaCenso;

    @Column(name = "observaciones_ult_visita_cen")
    private String observacionesUltVisitaCen;

    @Column(name = "referencia_direccion")
    private String referenciaDireccion;

    @JoinColumn(name = "numero_tipo_reg_pot_ben", referencedColumnName = "numero_tipo_reg_pot_ben")
    @ManyToOne
    private TipoRegPotBen tipoRegPotBenNumeroTipoRegPotBen;

    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @OneToOne
    private Persona personaIdPersona;

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

    @JoinColumn(name = "numero_condicion_censo", referencedColumnName = "numero_condicion_censo")
    @ManyToOne
    private CondicionCenso condicionCensoNumeroCondicionCenso;

    @JoinColumn(name = "id_funcionario_validacion_cen", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioValidacionCen;

    @JoinColumn(name = "numero_causa_inv_censo", referencedColumnName = "numero_causa_inv_censo")
    @ManyToOne
    private CausaInvCenso causaInvCensoNumeroCausaInvCenso;

    @JoinColumn(name = "id_ficha_persona", referencedColumnName = "id_ficha_persona")
    @ManyToOne
    private FichaPersona fichaPersonaIdFichaPersona;

    @JoinColumn(name = "numero_condicion_recl_cen", referencedColumnName = "numero_condicion_recl_cen")
    @ManyToOne
    private CondicionReclCen condicionReclCenNumeroCondicionReclCen;

    @JoinColumn(name = "numero_causa_den_recl_cen", referencedColumnName = "numero_causa_den_recl_cen")
    @ManyToOne
    private CausaDenReclCen causaDenReclCenNumeroCausaDenReclCen;

    @JoinColumn(name = "id_usuario_reg_pot_ben", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuarioRegPotBen;

    @JoinColumn(name = "id_funcionario_ult_visita_cen", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioUltVisitaCen;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "potencialBenIdPotencialBen")
    private Collection<FichaPersona> fichaPersonaIdPotencialBenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "potencialBenIdPotencialBen")
    private Collection<LogProAcrPotBen> logProAcrPotBenIdPotencialBenCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "potencialBenIdPotencialBen")
    private Collection<VisitaCenso> visitaCensoIdPotencialBenCollection;

    public PotencialBen() {
    }

    @Override
    public Long getIdPotencialBen() {
        return this.idPotencialBen;
    }

    public void setIdPotencialBen(Long idPotencialBen) {
        this.idPotencialBen = idPotencialBen;
    }

    @Override
    public long getVersionPotencialBen() {
        return this.versionPotencialBen;
    }

    public void setVersionPotencialBen(long versionPotencialBen) {
        this.versionPotencialBen = versionPotencialBen;
    }

    @Override
    public String getCodigoPotencialBen() {
        return this.codigoPotencialBen;
    }

    public void setCodigoPotencialBen(String codigoPotencialBen) {
        this.codigoPotencialBen = codigoPotencialBen;
    }

    @Override
    public String getNombrePotencialBen() {
        return this.nombrePotencialBen;
    }

    public void setNombrePotencialBen(String nombrePotencialBen) {
        this.nombrePotencialBen = nombrePotencialBen;
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
    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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
    public String getCompania() {
        return this.compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getNombreResponsableHogar() {
        return this.nombreResponsableHogar;
    }

    public void setNombreResponsableHogar(String nombreResponsableHogar) {
        this.nombreResponsableHogar = nombreResponsableHogar;
    }

    @Override
    public String getNumeroTelefonoRespHogar() {
        return this.numeroTelefonoRespHogar;
    }

    public void setNumeroTelefonoRespHogar(String numeroTelefonoRespHogar) {
        this.numeroTelefonoRespHogar = numeroTelefonoRespHogar;
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
    public String getNombreReferente() {
        return this.nombreReferente;
    }

    public void setNombreReferente(String nombreReferente) {
        this.nombreReferente = nombreReferente;
    }

    @Override
    public String getNumeroTelefonoReferente() {
        return this.numeroTelefonoReferente;
    }

    public void setNumeroTelefonoReferente(String numeroTelefonoReferente) {
        this.numeroTelefonoReferente = numeroTelefonoReferente;
    }

    @Override
    public Date getFechaValidacionCenso() {
        return this.fechaValidacionCenso;
    }

    public void setFechaValidacionCenso(Date fechaValidacionCenso) {
        this.fechaValidacionCenso = fechaValidacionCenso;
    }

    @Override
    public String getOtraCausaInvCenso() {
        return this.otraCausaInvCenso;
    }

    public void setOtraCausaInvCenso(String otraCausaInvCenso) {
        this.otraCausaInvCenso = otraCausaInvCenso;
    }

    @Override
    public String getComentariosValidacionCenso() {
        return this.comentariosValidacionCenso;
    }

    public void setComentariosValidacionCenso(String comentariosValidacionCenso) {
        this.comentariosValidacionCenso = comentariosValidacionCenso;
    }

    @Override
    public Date getFechaReclamoCenso() {
        return this.fechaReclamoCenso;
    }

    public void setFechaReclamoCenso(Date fechaReclamoCenso) {
        this.fechaReclamoCenso = fechaReclamoCenso;
    }

    @Override
    public String getComentariosReclamoCenso() {
        return this.comentariosReclamoCenso;
    }

    public void setComentariosReclamoCenso(String comentariosReclamoCenso) {
        this.comentariosReclamoCenso = comentariosReclamoCenso;
    }

    @Override
    public Date getFechaAprobacionReclamoCenso() {
        return this.fechaAprobacionReclamoCenso;
    }

    public void setFechaAprobacionReclamoCenso(Date fechaAprobacionReclamoCenso) {
        this.fechaAprobacionReclamoCenso = fechaAprobacionReclamoCenso;
    }

    @Override
    public String getComentariosAprReclCen() {
        return this.comentariosAprReclCen;
    }

    public void setComentariosAprReclCen(String comentariosAprReclCen) {
        this.comentariosAprReclCen = comentariosAprReclCen;
    }

    @Override
    public Date getFechaDenegacionReclamoCenso() {
        return this.fechaDenegacionReclamoCenso;
    }

    public void setFechaDenegacionReclamoCenso(Date fechaDenegacionReclamoCenso) {
        this.fechaDenegacionReclamoCenso = fechaDenegacionReclamoCenso;
    }

    @Override
    public String getOtraCausaDenReclCen() {
        return this.otraCausaDenReclCen;
    }

    public void setOtraCausaDenReclCen(String otraCausaDenReclCen) {
        this.otraCausaDenReclCen = otraCausaDenReclCen;
    }

    @Override
    public String getComentariosDenReclCen() {
        return this.comentariosDenReclCen;
    }

    public void setComentariosDenReclCen(String comentariosDenReclCen) {
        this.comentariosDenReclCen = comentariosDenReclCen;
    }

    @Override
    public Date getFechaRegistroPotBen() {
        return this.fechaRegistroPotBen;
    }

    public void setFechaRegistroPotBen(Date fechaRegistroPotBen) {
        this.fechaRegistroPotBen = fechaRegistroPotBen;
    }

    @Override
    public int getEsPotencialBenInactivo() {
        return this.esPotencialBenInactivo;
    }

    public void setEsPotencialBenInactivo(int esPotencialBenInactivo) {
        this.esPotencialBenInactivo = esPotencialBenInactivo;
    }

    @Override
    public Date getFechaUltimaVisitaCenso() {
        return this.fechaUltimaVisitaCenso;
    }

    public void setFechaUltimaVisitaCenso(Date fechaUltimaVisitaCenso) {
        this.fechaUltimaVisitaCenso = fechaUltimaVisitaCenso;
    }

    @Override
    public String getObservacionesUltVisitaCen() {
        return this.observacionesUltVisitaCen;
    }

    public void setObservacionesUltVisitaCen(String observacionesUltVisitaCen) {
        this.observacionesUltVisitaCen = observacionesUltVisitaCen;
    }

    @Override
    public String getReferenciaDireccion() {
        return this.referenciaDireccion;
    }

    public void setReferenciaDireccion(String referenciaDireccion) {
        this.referenciaDireccion = referenciaDireccion;
    }

    @Override
    public TipoRegPotBen getTipoRegPotBenNumeroTipoRegPotBen() {
        return this.tipoRegPotBenNumeroTipoRegPotBen;
    }

    public void setTipoRegPotBenNumeroTipoRegPotBen(TipoRegPotBen tipoRegPotBen) {
        this.tipoRegPotBenNumeroTipoRegPotBen = tipoRegPotBen;
    }

    @Override
    public Persona getPersonaIdPersona() {
        return this.personaIdPersona;
    }

    public void setPersonaIdPersona(Persona persona) {
        this.personaIdPersona = persona;
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
    public CondicionCenso getCondicionCensoNumeroCondicionCenso() {
        return this.condicionCensoNumeroCondicionCenso;
    }

    public void setCondicionCensoNumeroCondicionCenso(CondicionCenso condicionCenso) {
        this.condicionCensoNumeroCondicionCenso = condicionCenso;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioValidacionCen() {
        return this.funcionarioIdFuncionarioValidacionCen;
    }

    public void setFuncionarioIdFuncionarioValidacionCen(Funcionario funcionario) {
        this.funcionarioIdFuncionarioValidacionCen = funcionario;
    }

    @Override
    public CausaInvCenso getCausaInvCensoNumeroCausaInvCenso() {
        return this.causaInvCensoNumeroCausaInvCenso;
    }

    public void setCausaInvCensoNumeroCausaInvCenso(CausaInvCenso causaInvCenso) {
        this.causaInvCensoNumeroCausaInvCenso = causaInvCenso;
    }

    @Override
    public FichaPersona getFichaPersonaIdFichaPersona() {
        return this.fichaPersonaIdFichaPersona;
    }

    public void setFichaPersonaIdFichaPersona(FichaPersona fichaPersona) {
        this.fichaPersonaIdFichaPersona = fichaPersona;
    }

    @Override
    public CondicionReclCen getCondicionReclCenNumeroCondicionReclCen() {
        return this.condicionReclCenNumeroCondicionReclCen;
    }

    public void setCondicionReclCenNumeroCondicionReclCen(CondicionReclCen condicionReclCen) {
        this.condicionReclCenNumeroCondicionReclCen = condicionReclCen;
    }

    @Override
    public CausaDenReclCen getCausaDenReclCenNumeroCausaDenReclCen() {
        return this.causaDenReclCenNumeroCausaDenReclCen;
    }

    public void setCausaDenReclCenNumeroCausaDenReclCen(CausaDenReclCen causaDenReclCen) {
        this.causaDenReclCenNumeroCausaDenReclCen = causaDenReclCen;
    }

    @Override
    public Usuario getUsuarioIdUsuarioRegPotBen() {
        return this.usuarioIdUsuarioRegPotBen;
    }

    public void setUsuarioIdUsuarioRegPotBen(Usuario usuario) {
        this.usuarioIdUsuarioRegPotBen = usuario;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioUltVisitaCen() {
        return this.funcionarioIdFuncionarioUltVisitaCen;
    }

    public void setFuncionarioIdFuncionarioUltVisitaCen(Funcionario funcionario) {
        this.funcionarioIdFuncionarioUltVisitaCen = funcionario;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaIdPotencialBenCollection() {
        return this.fichaPersonaIdPotencialBenCollection;
    }

    public void setFichaPersonaIdPotencialBenCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaIdPotencialBenCollection = collection;
    }

    @Override
    public Collection<LogProAcrPotBen> getLogProAcrPotBenIdPotencialBenCollection() {
        return this.logProAcrPotBenIdPotencialBenCollection;
    }

    public void setLogProAcrPotBenIdPotencialBenCollection(Collection<LogProAcrPotBen> collection) {
        this.logProAcrPotBenIdPotencialBenCollection = collection;
    }

    @Override
    public Collection<VisitaCenso> getVisitaCensoIdPotencialBenCollection() {
        return this.visitaCensoIdPotencialBenCollection;
    }

    public void setVisitaCensoIdPotencialBenCollection(Collection<VisitaCenso> collection) {
        this.visitaCensoIdPotencialBenCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PotencialBen) {
            PotencialBen that = (PotencialBen) object;
            return idPotencialBen == null ? that.idPotencialBen == null ? 0 : -1
                    : idPotencialBen.compareTo(that.idPotencialBen);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idPotencialBen == null ? 0 : idPotencialBen.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof PotencialBen) {
            PotencialBen that = (PotencialBen) object;
            return ((idPotencialBen == null && that.idPotencialBen == null) ||
                    (idPotencialBen != null && idPotencialBen.equals(that.idPotencialBen)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idPotencialBen;
    }
}
