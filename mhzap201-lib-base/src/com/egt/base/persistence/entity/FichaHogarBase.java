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
package com.egt.base.persistence.entity;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public interface FichaHogarBase {

    public Long getIdFichaHogar();
//
//  public void setIdFichaHogar(Long idFichaHogar);

    public long getVersionFichaHogar();
//
//  public void setVersionFichaHogar(long versionFichaHogar);

    public String getCodigoFichaHogar();
//
//  public void setCodigoFichaHogar(String codigoFichaHogar);

    public Date getFechaEntrevista();
//
//  public void setFechaEntrevista(Date fechaEntrevista);

    public String getObservaciones();
//
//  public void setObservaciones(String observaciones);

    public Integer getHusoUtm();
//
//  public void setHusoUtm(Integer husoUtm);

    public String getFranjaUtm();
//
//  public void setFranjaUtm(String franjaUtm);

    public Integer getDistanciaEsteUtm();
//
//  public void setDistanciaEsteUtm(Integer distanciaEsteUtm);

    public Integer getDistanciaNorteUtm();
//
//  public void setDistanciaNorteUtm(Integer distanciaNorteUtm);

    public int getNumeroFormulario();
//
//  public void setNumeroFormulario(int numeroFormulario);

    public int getNumeroVivienda();
//
//  public void setNumeroVivienda(int numeroVivienda);

    public int getNumeroHogar();
//
//  public void setNumeroHogar(int numeroHogar);

    public String getManzana();
//
//  public void setManzana(String manzana);

    public String getDireccion();
//
//  public void setDireccion(String direccion);

    public Integer getTotalPersonas();
//
//  public void setTotalPersonas(Integer totalPersonas);

    public Integer getTotalHombres();
//
//  public void setTotalHombres(Integer totalHombres);

    public Integer getTotalMujeres();
//
//  public void setTotalMujeres(Integer totalMujeres);

    public String getOtroTipoOcupacionViv();
//
//  public void setOtroTipoOcupacionViv(String otroTipoOcupacionViv);

    public Integer getCantidadPiezas();
//
//  public void setCantidadPiezas(Integer cantidadPiezas);

    public Integer getCantidadDormitorios();
//
//  public void setCantidadDormitorios(Integer cantidadDormitorios);

    public String getNumeroTelefonoCelular();
//
//  public void setNumeroTelefonoCelular(String numeroTelefonoCelular);

    public String getNumeroTelefonoLineaBaja();
//
//  public void setNumeroTelefonoLineaBaja(String numeroTelefonoLineaBaja);

    public String getNombreJefeHogar();
//
//  public void setNombreJefeHogar(String nombreJefeHogar);

    public Integer getNumeroCedulaJefeHogar();
//
//  public void setNumeroCedulaJefeHogar(Integer numeroCedulaJefeHogar);

    public String getLetraCedulaJefeHogar();
//
//  public void setLetraCedulaJefeHogar(String letraCedulaJefeHogar);

    public Integer getNumeroOrdenIdenJefeHogar();
//
//  public void setNumeroOrdenIdenJefeHogar(Integer numeroOrdenIdenJefeHogar);

    public String getNombreRespondente();
//
//  public void setNombreRespondente(String nombreRespondente);

    public Integer getNumeroCedulaRespondente();
//
//  public void setNumeroCedulaRespondente(Integer numeroCedulaRespondente);

    public String getLetraCedulaRespondente();
//
//  public void setLetraCedulaRespondente(String letraCedulaRespondente);

    public Integer getNumeroOrdenIdenRespondente();
//
//  public void setNumeroOrdenIdenRespondente(Integer numeroOrdenIdenRespondente);

    public BigDecimal getIndiceCalidadVida();
//
//  public void setIndiceCalidadVida(BigDecimal indiceCalidadVida);

    public int getEsFichaHogarInactiva();
//
//  public void setEsFichaHogarInactiva(int esFichaHogarInactiva);

    public FuncionarioBase getFuncionarioIdFuncionarioCensista();
//
//  public void setFuncionarioIdFuncionarioCensista(FuncionarioBase funcionario);

    public FuncionarioBase getFuncionarioIdFuncionarioSupervisor();
//
//  public void setFuncionarioIdFuncionarioSupervisor(FuncionarioBase funcionario);

    public FuncionarioBase getFuncionarioIdFuncionarioCriticoDeco();
//
//  public void setFuncionarioIdFuncionarioCriticoDeco(FuncionarioBase funcionario);

    public FuncionarioBase getFuncionarioIdFuncionarioDigitador();
//
//  public void setFuncionarioIdFuncionarioDigitador(FuncionarioBase funcionario);

    public UbicacionBase getUbicacionIdDepartamento();
//
//  public void setUbicacionIdDepartamento(UbicacionBase ubicacion);

    public UbicacionBase getUbicacionIdDistrito();
//
//  public void setUbicacionIdDistrito(UbicacionBase ubicacion);

    public TipoAreaBase getTipoAreaNumeroTipoArea();
//
//  public void setTipoAreaNumeroTipoArea(TipoAreaBase tipoArea);

    public UbicacionBase getUbicacionIdBarrio();
//
//  public void setUbicacionIdBarrio(UbicacionBase ubicacion);

    public UbicacionBase getUbicacionIdManzana();
//
//  public void setUbicacionIdManzana(UbicacionBase ubicacion);

    public TipoMatParedesBase getTipoMatParedesNumeroTipoMatParedes();
//
//  public void setTipoMatParedesNumeroTipoMatParedes(TipoMatParedesBase tipoMatParedes);

    public TipoMatPisoBase getTipoMatPisoNumeroTipoMatPiso();
//
//  public void setTipoMatPisoNumeroTipoMatPiso(TipoMatPisoBase tipoMatPiso);

    public TipoMatTechoBase getTipoMatTechoNumeroTipoMatTecho();
//
//  public void setTipoMatTechoNumeroTipoMatTecho(TipoMatTechoBase tipoMatTecho);

    public TipoOcupacionVivBase getTipoOcupacionVivNumeroTipoOcupacionViv();
//
//  public void setTipoOcupacionVivNumeroTipoOcupacionViv(TipoOcupacionVivBase tipoOcupacionViv);

    public SionoBase getSionoNumeroSionoPiezaCocina();
//
//  public void setSionoNumeroSionoPiezaCocina(SionoBase siono);

    public TipoCombustibleBase getTipoCombustibleNumeroTipoCombustible();
//
//  public void setTipoCombustibleNumeroTipoCombustible(TipoCombustibleBase tipoCombustible);

    public TipoPiezaBanoBase getTipoPiezaBanoNumeroTipoPiezaBano();
//
//  public void setTipoPiezaBanoNumeroTipoPiezaBano(TipoPiezaBanoBase tipoPiezaBano);

    public TipoServicioSanBase getTipoServicioSanNumeroTipoServicioSan();
//
//  public void setTipoServicioSanNumeroTipoServicioSan(TipoServicioSanBase tipoServicioSan);

    public TipoServicioAguaBase getTipoServicioAguaNumeroTipoServicioAgua();
//
//  public void setTipoServicioAguaNumeroTipoServicioAgua(TipoServicioAguaBase tipoServicioAgua);

    public TipoAbaAguaBase getTipoAbaAguaNumeroTipoAbaAgua();
//
//  public void setTipoAbaAguaNumeroTipoAbaAgua(TipoAbaAguaBase tipoAbaAgua);

    public SionoBase getSionoNumeroSionoCorrienteElec();
//
//  public void setSionoNumeroSionoCorrienteElec(SionoBase siono);

    public TipoDesechoBasBase getTipoDesechoBasNumeroTipoDesechoBas();
//
//  public void setTipoDesechoBasNumeroTipoDesechoBas(TipoDesechoBasBase tipoDesechoBas);

    public SionoBase getSionoNumeroSionoTelefonoCelular();
//
//  public void setSionoNumeroSionoTelefonoCelular(SionoBase siono);

    public SionoBase getSionoNumeroSionoTlfLineaBaja();
//
//  public void setSionoNumeroSionoTlfLineaBaja(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispHeladera();
//
//  public void setSionoNumeroSionoDispHeladera(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispLavarropas();
//
//  public void setSionoNumeroSionoDispLavarropas(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispTermo();
//
//  public void setSionoNumeroSionoDispTermo(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispAireAcon();
//
//  public void setSionoNumeroSionoDispAireAcon(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispAutomovil();
//
//  public void setSionoNumeroSionoDispAutomovil(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispCamion();
//
//  public void setSionoNumeroSionoDispCamion(SionoBase siono);

    public SionoBase getSionoNumeroSionoDispMotocicleta();
//
//  public void setSionoNumeroSionoDispMotocicleta(SionoBase siono);

    public ProveedorDatExtBase getProveedorDatExtIdProveedorDatExt();
//
//  public void setProveedorDatExtIdProveedorDatExt(ProveedorDatExtBase proveedorDatExt);

    public Collection<? extends FichaPersonaBase> getFichaPersonaIdFichaHogarCollection();
//
//  public void setFichaPersonaIdFichaHogarCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends LogProAcrPotBenBase> getLogProAcrPotBenIdFichaHogarCollection();
//
//  public void setLogProAcrPotBenIdFichaHogarCollection(Collection<? extends LogProAcrPotBenBase> collection);

}
