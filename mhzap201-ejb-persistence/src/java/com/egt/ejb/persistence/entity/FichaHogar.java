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

import com.egt.base.persistence.entity.FichaHogarBase;
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
@Table(name = "ficha_hogar")
public class FichaHogar implements FichaHogarBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_ficha_hogar")
    private Long idFichaHogar;

    @Basic(optional = false)
    @Column(name = "version_ficha_hogar")
    private long versionFichaHogar;

    @Basic(optional = false)
    @Column(name = "codigo_ficha_hogar")
    private String codigoFichaHogar;

    @Basic(optional = false)
    @Column(name = "fecha_entrevista")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrevista;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "huso_utm")
    private Integer husoUtm;

    @Column(name = "franja_utm")
    private String franjaUtm;

    @Column(name = "distancia_este_utm")
    private Integer distanciaEsteUtm;

    @Column(name = "distancia_norte_utm")
    private Integer distanciaNorteUtm;

    @Basic(optional = false)
    @Column(name = "numero_formulario")
    private int numeroFormulario;

    @Basic(optional = false)
    @Column(name = "numero_vivienda")
    private int numeroVivienda;

    @Basic(optional = false)
    @Column(name = "numero_hogar")
    private int numeroHogar;

    @Column(name = "manzana")
    private String manzana;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "total_personas")
    private Integer totalPersonas;

    @Column(name = "total_hombres")
    private Integer totalHombres;

    @Column(name = "total_mujeres")
    private Integer totalMujeres;

    @Column(name = "otro_tipo_ocupacion_viv")
    private String otroTipoOcupacionViv;

    @Column(name = "cantidad_piezas")
    private Integer cantidadPiezas;

    @Column(name = "cantidad_dormitorios")
    private Integer cantidadDormitorios;

    @Column(name = "numero_telefono_celular")
    private String numeroTelefonoCelular;

    @Column(name = "numero_telefono_linea_baja")
    private String numeroTelefonoLineaBaja;

    @Column(name = "nombre_jefe_hogar")
    private String nombreJefeHogar;

    @Column(name = "numero_cedula_jefe_hogar")
    private Integer numeroCedulaJefeHogar;

    @Column(name = "letra_cedula_jefe_hogar")
    private String letraCedulaJefeHogar;

    @Column(name = "numero_orden_iden_jefe_hogar")
    private Integer numeroOrdenIdenJefeHogar;

    @Column(name = "nombre_respondente")
    private String nombreRespondente;

    @Column(name = "numero_cedula_respondente")
    private Integer numeroCedulaRespondente;

    @Column(name = "letra_cedula_respondente")
    private String letraCedulaRespondente;

    @Column(name = "numero_orden_iden_respondente")
    private Integer numeroOrdenIdenRespondente;

    @Column(name = "indice_calidad_vida")
    private BigDecimal indiceCalidadVida;

    @Basic(optional = false)
    @Column(name = "es_ficha_hogar_inactiva")
    private int esFichaHogarInactiva;

    @JoinColumn(name = "id_funcionario_censista", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioCensista;

    @JoinColumn(name = "id_funcionario_supervisor", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioSupervisor;

    @JoinColumn(name = "id_funcionario_critico_deco", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioCriticoDeco;

    @JoinColumn(name = "id_funcionario_digitador", referencedColumnName = "id_funcionario")
    @ManyToOne
    private Funcionario funcionarioIdFuncionarioDigitador;

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

    @JoinColumn(name = "numero_tipo_mat_paredes", referencedColumnName = "numero_tipo_mat_paredes")
    @ManyToOne
    private TipoMatParedes tipoMatParedesNumeroTipoMatParedes;

    @JoinColumn(name = "numero_tipo_mat_piso", referencedColumnName = "numero_tipo_mat_piso")
    @ManyToOne
    private TipoMatPiso tipoMatPisoNumeroTipoMatPiso;

    @JoinColumn(name = "numero_tipo_mat_techo", referencedColumnName = "numero_tipo_mat_techo")
    @ManyToOne
    private TipoMatTecho tipoMatTechoNumeroTipoMatTecho;

    @JoinColumn(name = "numero_tipo_ocupacion_viv", referencedColumnName = "numero_tipo_ocupacion_viv")
    @ManyToOne
    private TipoOcupacionViv tipoOcupacionVivNumeroTipoOcupacionViv;

    @JoinColumn(name = "numero_siono_pieza_cocina", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoPiezaCocina;

    @JoinColumn(name = "numero_tipo_combustible", referencedColumnName = "numero_tipo_combustible")
    @ManyToOne
    private TipoCombustible tipoCombustibleNumeroTipoCombustible;

    @JoinColumn(name = "numero_tipo_pieza_bano", referencedColumnName = "numero_tipo_pieza_bano")
    @ManyToOne
    private TipoPiezaBano tipoPiezaBanoNumeroTipoPiezaBano;

    @JoinColumn(name = "numero_tipo_servicio_san", referencedColumnName = "numero_tipo_servicio_san")
    @ManyToOne
    private TipoServicioSan tipoServicioSanNumeroTipoServicioSan;

    @JoinColumn(name = "numero_tipo_servicio_agua", referencedColumnName = "numero_tipo_servicio_agua")
    @ManyToOne
    private TipoServicioAgua tipoServicioAguaNumeroTipoServicioAgua;

    @JoinColumn(name = "numero_tipo_aba_agua", referencedColumnName = "numero_tipo_aba_agua")
    @ManyToOne
    private TipoAbaAgua tipoAbaAguaNumeroTipoAbaAgua;

    @JoinColumn(name = "numero_siono_corriente_elec", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoCorrienteElec;

    @JoinColumn(name = "numero_tipo_desecho_bas", referencedColumnName = "numero_tipo_desecho_bas")
    @ManyToOne
    private TipoDesechoBas tipoDesechoBasNumeroTipoDesechoBas;

    @JoinColumn(name = "numero_siono_telefono_celular", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoTelefonoCelular;

    @JoinColumn(name = "numero_siono_tlf_linea_baja", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoTlfLineaBaja;

    @JoinColumn(name = "numero_siono_disp_heladera", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispHeladera;

    @JoinColumn(name = "numero_siono_disp_lavarropas", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispLavarropas;

    @JoinColumn(name = "numero_siono_disp_termo", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispTermo;

    @JoinColumn(name = "numero_siono_disp_aire_acon", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispAireAcon;

    @JoinColumn(name = "numero_siono_disp_automovil", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispAutomovil;

    @JoinColumn(name = "numero_siono_disp_camion", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispCamion;

    @JoinColumn(name = "numero_siono_disp_motocicleta", referencedColumnName = "numero_siono")
    @ManyToOne
    private Siono sionoNumeroSionoDispMotocicleta;

    @JoinColumn(name = "id_proveedor_dat_ext", referencedColumnName = "id_proveedor_dat_ext")
    @ManyToOne
    private ProveedorDatExt proveedorDatExtIdProveedorDatExt;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaHogarIdFichaHogar")
    private Collection<FichaPersona> fichaPersonaIdFichaHogarCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "fichaHogarIdFichaHogar")
    private Collection<LogProAcrPotBen> logProAcrPotBenIdFichaHogarCollection;

    public FichaHogar() {
    }

    @Override
    public Long getIdFichaHogar() {
        return this.idFichaHogar;
    }

    public void setIdFichaHogar(Long idFichaHogar) {
        this.idFichaHogar = idFichaHogar;
    }

    @Override
    public long getVersionFichaHogar() {
        return this.versionFichaHogar;
    }

    public void setVersionFichaHogar(long versionFichaHogar) {
        this.versionFichaHogar = versionFichaHogar;
    }

    @Override
    public String getCodigoFichaHogar() {
        return this.codigoFichaHogar;
    }

    public void setCodigoFichaHogar(String codigoFichaHogar) {
        this.codigoFichaHogar = codigoFichaHogar;
    }

    @Override
    public Date getFechaEntrevista() {
        return this.fechaEntrevista;
    }

    public void setFechaEntrevista(Date fechaEntrevista) {
        this.fechaEntrevista = fechaEntrevista;
    }

    @Override
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public Integer getHusoUtm() {
        return this.husoUtm;
    }

    public void setHusoUtm(Integer husoUtm) {
        this.husoUtm = husoUtm;
    }

    @Override
    public String getFranjaUtm() {
        return this.franjaUtm;
    }

    public void setFranjaUtm(String franjaUtm) {
        this.franjaUtm = franjaUtm;
    }

    @Override
    public Integer getDistanciaEsteUtm() {
        return this.distanciaEsteUtm;
    }

    public void setDistanciaEsteUtm(Integer distanciaEsteUtm) {
        this.distanciaEsteUtm = distanciaEsteUtm;
    }

    @Override
    public Integer getDistanciaNorteUtm() {
        return this.distanciaNorteUtm;
    }

    public void setDistanciaNorteUtm(Integer distanciaNorteUtm) {
        this.distanciaNorteUtm = distanciaNorteUtm;
    }

    @Override
    public int getNumeroFormulario() {
        return this.numeroFormulario;
    }

    public void setNumeroFormulario(int numeroFormulario) {
        this.numeroFormulario = numeroFormulario;
    }

    @Override
    public int getNumeroVivienda() {
        return this.numeroVivienda;
    }

    public void setNumeroVivienda(int numeroVivienda) {
        this.numeroVivienda = numeroVivienda;
    }

    @Override
    public int getNumeroHogar() {
        return this.numeroHogar;
    }

    public void setNumeroHogar(int numeroHogar) {
        this.numeroHogar = numeroHogar;
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
    public Integer getTotalPersonas() {
        return this.totalPersonas;
    }

    public void setTotalPersonas(Integer totalPersonas) {
        this.totalPersonas = totalPersonas;
    }

    @Override
    public Integer getTotalHombres() {
        return this.totalHombres;
    }

    public void setTotalHombres(Integer totalHombres) {
        this.totalHombres = totalHombres;
    }

    @Override
    public Integer getTotalMujeres() {
        return this.totalMujeres;
    }

    public void setTotalMujeres(Integer totalMujeres) {
        this.totalMujeres = totalMujeres;
    }

    @Override
    public String getOtroTipoOcupacionViv() {
        return this.otroTipoOcupacionViv;
    }

    public void setOtroTipoOcupacionViv(String otroTipoOcupacionViv) {
        this.otroTipoOcupacionViv = otroTipoOcupacionViv;
    }

    @Override
    public Integer getCantidadPiezas() {
        return this.cantidadPiezas;
    }

    public void setCantidadPiezas(Integer cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    @Override
    public Integer getCantidadDormitorios() {
        return this.cantidadDormitorios;
    }

    public void setCantidadDormitorios(Integer cantidadDormitorios) {
        this.cantidadDormitorios = cantidadDormitorios;
    }

    @Override
    public String getNumeroTelefonoCelular() {
        return this.numeroTelefonoCelular;
    }

    public void setNumeroTelefonoCelular(String numeroTelefonoCelular) {
        this.numeroTelefonoCelular = numeroTelefonoCelular;
    }

    @Override
    public String getNumeroTelefonoLineaBaja() {
        return this.numeroTelefonoLineaBaja;
    }

    public void setNumeroTelefonoLineaBaja(String numeroTelefonoLineaBaja) {
        this.numeroTelefonoLineaBaja = numeroTelefonoLineaBaja;
    }

    @Override
    public String getNombreJefeHogar() {
        return this.nombreJefeHogar;
    }

    public void setNombreJefeHogar(String nombreJefeHogar) {
        this.nombreJefeHogar = nombreJefeHogar;
    }

    @Override
    public Integer getNumeroCedulaJefeHogar() {
        return this.numeroCedulaJefeHogar;
    }

    public void setNumeroCedulaJefeHogar(Integer numeroCedulaJefeHogar) {
        this.numeroCedulaJefeHogar = numeroCedulaJefeHogar;
    }

    @Override
    public String getLetraCedulaJefeHogar() {
        return this.letraCedulaJefeHogar;
    }

    public void setLetraCedulaJefeHogar(String letraCedulaJefeHogar) {
        this.letraCedulaJefeHogar = letraCedulaJefeHogar;
    }

    @Override
    public Integer getNumeroOrdenIdenJefeHogar() {
        return this.numeroOrdenIdenJefeHogar;
    }

    public void setNumeroOrdenIdenJefeHogar(Integer numeroOrdenIdenJefeHogar) {
        this.numeroOrdenIdenJefeHogar = numeroOrdenIdenJefeHogar;
    }

    @Override
    public String getNombreRespondente() {
        return this.nombreRespondente;
    }

    public void setNombreRespondente(String nombreRespondente) {
        this.nombreRespondente = nombreRespondente;
    }

    @Override
    public Integer getNumeroCedulaRespondente() {
        return this.numeroCedulaRespondente;
    }

    public void setNumeroCedulaRespondente(Integer numeroCedulaRespondente) {
        this.numeroCedulaRespondente = numeroCedulaRespondente;
    }

    @Override
    public String getLetraCedulaRespondente() {
        return this.letraCedulaRespondente;
    }

    public void setLetraCedulaRespondente(String letraCedulaRespondente) {
        this.letraCedulaRespondente = letraCedulaRespondente;
    }

    @Override
    public Integer getNumeroOrdenIdenRespondente() {
        return this.numeroOrdenIdenRespondente;
    }

    public void setNumeroOrdenIdenRespondente(Integer numeroOrdenIdenRespondente) {
        this.numeroOrdenIdenRespondente = numeroOrdenIdenRespondente;
    }

    @Override
    public BigDecimal getIndiceCalidadVida() {
        return this.indiceCalidadVida;
    }

    public void setIndiceCalidadVida(BigDecimal indiceCalidadVida) {
        this.indiceCalidadVida = indiceCalidadVida;
    }

    @Override
    public int getEsFichaHogarInactiva() {
        return this.esFichaHogarInactiva;
    }

    public void setEsFichaHogarInactiva(int esFichaHogarInactiva) {
        this.esFichaHogarInactiva = esFichaHogarInactiva;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioCensista() {
        return this.funcionarioIdFuncionarioCensista;
    }

    public void setFuncionarioIdFuncionarioCensista(Funcionario funcionario) {
        this.funcionarioIdFuncionarioCensista = funcionario;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioSupervisor() {
        return this.funcionarioIdFuncionarioSupervisor;
    }

    public void setFuncionarioIdFuncionarioSupervisor(Funcionario funcionario) {
        this.funcionarioIdFuncionarioSupervisor = funcionario;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioCriticoDeco() {
        return this.funcionarioIdFuncionarioCriticoDeco;
    }

    public void setFuncionarioIdFuncionarioCriticoDeco(Funcionario funcionario) {
        this.funcionarioIdFuncionarioCriticoDeco = funcionario;
    }

    @Override
    public Funcionario getFuncionarioIdFuncionarioDigitador() {
        return this.funcionarioIdFuncionarioDigitador;
    }

    public void setFuncionarioIdFuncionarioDigitador(Funcionario funcionario) {
        this.funcionarioIdFuncionarioDigitador = funcionario;
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
    public TipoMatParedes getTipoMatParedesNumeroTipoMatParedes() {
        return this.tipoMatParedesNumeroTipoMatParedes;
    }

    public void setTipoMatParedesNumeroTipoMatParedes(TipoMatParedes tipoMatParedes) {
        this.tipoMatParedesNumeroTipoMatParedes = tipoMatParedes;
    }

    @Override
    public TipoMatPiso getTipoMatPisoNumeroTipoMatPiso() {
        return this.tipoMatPisoNumeroTipoMatPiso;
    }

    public void setTipoMatPisoNumeroTipoMatPiso(TipoMatPiso tipoMatPiso) {
        this.tipoMatPisoNumeroTipoMatPiso = tipoMatPiso;
    }

    @Override
    public TipoMatTecho getTipoMatTechoNumeroTipoMatTecho() {
        return this.tipoMatTechoNumeroTipoMatTecho;
    }

    public void setTipoMatTechoNumeroTipoMatTecho(TipoMatTecho tipoMatTecho) {
        this.tipoMatTechoNumeroTipoMatTecho = tipoMatTecho;
    }

    @Override
    public TipoOcupacionViv getTipoOcupacionVivNumeroTipoOcupacionViv() {
        return this.tipoOcupacionVivNumeroTipoOcupacionViv;
    }

    public void setTipoOcupacionVivNumeroTipoOcupacionViv(TipoOcupacionViv tipoOcupacionViv) {
        this.tipoOcupacionVivNumeroTipoOcupacionViv = tipoOcupacionViv;
    }

    @Override
    public Siono getSionoNumeroSionoPiezaCocina() {
        return this.sionoNumeroSionoPiezaCocina;
    }

    public void setSionoNumeroSionoPiezaCocina(Siono siono) {
        this.sionoNumeroSionoPiezaCocina = siono;
    }

    @Override
    public TipoCombustible getTipoCombustibleNumeroTipoCombustible() {
        return this.tipoCombustibleNumeroTipoCombustible;
    }

    public void setTipoCombustibleNumeroTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustibleNumeroTipoCombustible = tipoCombustible;
    }

    @Override
    public TipoPiezaBano getTipoPiezaBanoNumeroTipoPiezaBano() {
        return this.tipoPiezaBanoNumeroTipoPiezaBano;
    }

    public void setTipoPiezaBanoNumeroTipoPiezaBano(TipoPiezaBano tipoPiezaBano) {
        this.tipoPiezaBanoNumeroTipoPiezaBano = tipoPiezaBano;
    }

    @Override
    public TipoServicioSan getTipoServicioSanNumeroTipoServicioSan() {
        return this.tipoServicioSanNumeroTipoServicioSan;
    }

    public void setTipoServicioSanNumeroTipoServicioSan(TipoServicioSan tipoServicioSan) {
        this.tipoServicioSanNumeroTipoServicioSan = tipoServicioSan;
    }

    @Override
    public TipoServicioAgua getTipoServicioAguaNumeroTipoServicioAgua() {
        return this.tipoServicioAguaNumeroTipoServicioAgua;
    }

    public void setTipoServicioAguaNumeroTipoServicioAgua(TipoServicioAgua tipoServicioAgua) {
        this.tipoServicioAguaNumeroTipoServicioAgua = tipoServicioAgua;
    }

    @Override
    public TipoAbaAgua getTipoAbaAguaNumeroTipoAbaAgua() {
        return this.tipoAbaAguaNumeroTipoAbaAgua;
    }

    public void setTipoAbaAguaNumeroTipoAbaAgua(TipoAbaAgua tipoAbaAgua) {
        this.tipoAbaAguaNumeroTipoAbaAgua = tipoAbaAgua;
    }

    @Override
    public Siono getSionoNumeroSionoCorrienteElec() {
        return this.sionoNumeroSionoCorrienteElec;
    }

    public void setSionoNumeroSionoCorrienteElec(Siono siono) {
        this.sionoNumeroSionoCorrienteElec = siono;
    }

    @Override
    public TipoDesechoBas getTipoDesechoBasNumeroTipoDesechoBas() {
        return this.tipoDesechoBasNumeroTipoDesechoBas;
    }

    public void setTipoDesechoBasNumeroTipoDesechoBas(TipoDesechoBas tipoDesechoBas) {
        this.tipoDesechoBasNumeroTipoDesechoBas = tipoDesechoBas;
    }

    @Override
    public Siono getSionoNumeroSionoTelefonoCelular() {
        return this.sionoNumeroSionoTelefonoCelular;
    }

    public void setSionoNumeroSionoTelefonoCelular(Siono siono) {
        this.sionoNumeroSionoTelefonoCelular = siono;
    }

    @Override
    public Siono getSionoNumeroSionoTlfLineaBaja() {
        return this.sionoNumeroSionoTlfLineaBaja;
    }

    public void setSionoNumeroSionoTlfLineaBaja(Siono siono) {
        this.sionoNumeroSionoTlfLineaBaja = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispHeladera() {
        return this.sionoNumeroSionoDispHeladera;
    }

    public void setSionoNumeroSionoDispHeladera(Siono siono) {
        this.sionoNumeroSionoDispHeladera = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispLavarropas() {
        return this.sionoNumeroSionoDispLavarropas;
    }

    public void setSionoNumeroSionoDispLavarropas(Siono siono) {
        this.sionoNumeroSionoDispLavarropas = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispTermo() {
        return this.sionoNumeroSionoDispTermo;
    }

    public void setSionoNumeroSionoDispTermo(Siono siono) {
        this.sionoNumeroSionoDispTermo = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispAireAcon() {
        return this.sionoNumeroSionoDispAireAcon;
    }

    public void setSionoNumeroSionoDispAireAcon(Siono siono) {
        this.sionoNumeroSionoDispAireAcon = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispAutomovil() {
        return this.sionoNumeroSionoDispAutomovil;
    }

    public void setSionoNumeroSionoDispAutomovil(Siono siono) {
        this.sionoNumeroSionoDispAutomovil = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispCamion() {
        return this.sionoNumeroSionoDispCamion;
    }

    public void setSionoNumeroSionoDispCamion(Siono siono) {
        this.sionoNumeroSionoDispCamion = siono;
    }

    @Override
    public Siono getSionoNumeroSionoDispMotocicleta() {
        return this.sionoNumeroSionoDispMotocicleta;
    }

    public void setSionoNumeroSionoDispMotocicleta(Siono siono) {
        this.sionoNumeroSionoDispMotocicleta = siono;
    }

    @Override
    public ProveedorDatExt getProveedorDatExtIdProveedorDatExt() {
        return this.proveedorDatExtIdProveedorDatExt;
    }

    public void setProveedorDatExtIdProveedorDatExt(ProveedorDatExt proveedorDatExt) {
        this.proveedorDatExtIdProveedorDatExt = proveedorDatExt;
    }

    @Override
    public Collection<FichaPersona> getFichaPersonaIdFichaHogarCollection() {
        return this.fichaPersonaIdFichaHogarCollection;
    }

    public void setFichaPersonaIdFichaHogarCollection(Collection<FichaPersona> collection) {
        this.fichaPersonaIdFichaHogarCollection = collection;
    }

    @Override
    public Collection<LogProAcrPotBen> getLogProAcrPotBenIdFichaHogarCollection() {
        return this.logProAcrPotBenIdFichaHogarCollection;
    }

    public void setLogProAcrPotBenIdFichaHogarCollection(Collection<LogProAcrPotBen> collection) {
        this.logProAcrPotBenIdFichaHogarCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FichaHogar) {
            FichaHogar that = (FichaHogar) object;
            return idFichaHogar == null ? that.idFichaHogar == null ? 0 : -1
                    : idFichaHogar.compareTo(that.idFichaHogar);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFichaHogar == null ? 0 : idFichaHogar.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FichaHogar) {
            FichaHogar that = (FichaHogar) object;
            return ((idFichaHogar == null && that.idFichaHogar == null) ||
                    (idFichaHogar != null && idFichaHogar.equals(that.idFichaHogar)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFichaHogar;
    }
}
