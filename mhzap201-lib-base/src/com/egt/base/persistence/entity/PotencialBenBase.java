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

public interface PotencialBenBase {

    public Long getIdPotencialBen();
//
//  public void setIdPotencialBen(Long idPotencialBen);

    public long getVersionPotencialBen();
//
//  public void setVersionPotencialBen(long versionPotencialBen);

    public String getCodigoPotencialBen();
//
//  public void setCodigoPotencialBen(String codigoPotencialBen);

    public String getNombrePotencialBen();
//
//  public void setNombrePotencialBen(String nombrePotencialBen);

    public Integer getNumeroCedula();
//
//  public void setNumeroCedula(Integer numeroCedula);

    public String getLetraCedula();
//
//  public void setLetraCedula(String letraCedula);

    public Date getFechaExpedicionCedula();
//
//  public void setFechaExpedicionCedula(Date fechaExpedicionCedula);

    public Date getFechaVencimientoCedula();
//
//  public void setFechaVencimientoCedula(Date fechaVencimientoCedula);

    public String getPrimerNombre();
//
//  public void setPrimerNombre(String primerNombre);

    public String getSegundoNombre();
//
//  public void setSegundoNombre(String segundoNombre);

    public String getPrimerApellido();
//
//  public void setPrimerApellido(String primerApellido);

    public String getSegundoApellido();
//
//  public void setSegundoApellido(String segundoApellido);

    public String getApellidoCasada();
//
//  public void setApellidoCasada(String apellidoCasada);

    public String getApodo();
//
//  public void setApodo(String apodo);

    public Date getFechaNacimiento();
//
//  public void setFechaNacimiento(Date fechaNacimiento);

    public Integer getEdad();
//
//  public void setEdad(Integer edad);

    public int getEsParaguayoNatural();
//
//  public void setEsParaguayoNatural(int esParaguayoNatural);

    public int getEsIndigena();
//
//  public void setEsIndigena(int esIndigena);

    public String getNombreComunidadIndigena();
//
//  public void setNombreComunidadIndigena(String nombreComunidadIndigena);

    public String getManzana();
//
//  public void setManzana(String manzana);

    public String getCompania();
//
//  public void setCompania(String compania);

    public String getDireccion();
//
//  public void setDireccion(String direccion);

    public String getNombreResponsableHogar();
//
//  public void setNombreResponsableHogar(String nombreResponsableHogar);

    public String getNumeroTelefonoRespHogar();
//
//  public void setNumeroTelefonoRespHogar(String numeroTelefonoRespHogar);

    public int getEsPersonaConEmpleo();
//
//  public void setEsPersonaConEmpleo(int esPersonaConEmpleo);

    public int getEsPersonaConJubilacion();
//
//  public void setEsPersonaConJubilacion(int esPersonaConJubilacion);

    public int getEsPersonaConPension();
//
//  public void setEsPersonaConPension(int esPersonaConPension);

    public int getEsPersonaConSubsidio();
//
//  public void setEsPersonaConSubsidio(int esPersonaConSubsidio);

    public int getEsPersonaConDeuda();
//
//  public void setEsPersonaConDeuda(int esPersonaConDeuda);

    public int getEsPersonaConPenaJudicial();
//
//  public void setEsPersonaConPenaJudicial(int esPersonaConPenaJudicial);

    public int getEsPersonaConCerVida();
//
//  public void setEsPersonaConCerVida(int esPersonaConCerVida);

    public int getEsPersonaConCartaRenuncia();
//
//  public void setEsPersonaConCartaRenuncia(int esPersonaConCartaRenuncia);

    public String getNombreReferente();
//
//  public void setNombreReferente(String nombreReferente);

    public String getNumeroTelefonoReferente();
//
//  public void setNumeroTelefonoReferente(String numeroTelefonoReferente);

    public Date getFechaValidacionCenso();
//
//  public void setFechaValidacionCenso(Date fechaValidacionCenso);

    public String getOtraCausaInvCenso();
//
//  public void setOtraCausaInvCenso(String otraCausaInvCenso);

    public String getComentariosValidacionCenso();
//
//  public void setComentariosValidacionCenso(String comentariosValidacionCenso);

    public Date getFechaReclamoCenso();
//
//  public void setFechaReclamoCenso(Date fechaReclamoCenso);

    public String getComentariosReclamoCenso();
//
//  public void setComentariosReclamoCenso(String comentariosReclamoCenso);

    public Date getFechaAprobacionReclamoCenso();
//
//  public void setFechaAprobacionReclamoCenso(Date fechaAprobacionReclamoCenso);

    public String getComentariosAprReclCen();
//
//  public void setComentariosAprReclCen(String comentariosAprReclCen);

    public Date getFechaDenegacionReclamoCenso();
//
//  public void setFechaDenegacionReclamoCenso(Date fechaDenegacionReclamoCenso);

    public String getOtraCausaDenReclCen();
//
//  public void setOtraCausaDenReclCen(String otraCausaDenReclCen);

    public String getComentariosDenReclCen();
//
//  public void setComentariosDenReclCen(String comentariosDenReclCen);

    public Date getFechaRegistroPotBen();
//
//  public void setFechaRegistroPotBen(Date fechaRegistroPotBen);

    public int getEsPotencialBenInactivo();
//
//  public void setEsPotencialBenInactivo(int esPotencialBenInactivo);

    public Date getFechaUltimaVisitaCenso();
//
//  public void setFechaUltimaVisitaCenso(Date fechaUltimaVisitaCenso);

    public String getObservacionesUltVisitaCen();
//
//  public void setObservacionesUltVisitaCen(String observacionesUltVisitaCen);

    public String getReferenciaDireccion();
//
//  public void setReferenciaDireccion(String referenciaDireccion);

    public BigDecimal getIndiceCalidadVida();
//
//  public void setIndiceCalidadVida(BigDecimal indiceCalidadVida);

    public Integer getEsPotencialBenMigrado();
//
//  public void setEsPotencialBenMigrado(Integer esPotencialBenMigrado);

    public Long getLote();
//
//  public void setLote(Long lote);

    public TipoRegPotBenBase getTipoRegPotBenNumeroTipoRegPotBen();
//
//  public void setTipoRegPotBenNumeroTipoRegPotBen(TipoRegPotBenBase tipoRegPotBen);

    public PersonaBase getPersonaIdPersona();
//
//  public void setPersonaIdPersona(PersonaBase persona);

    public EtniaIndigenaBase getEtniaIndigenaIdEtniaIndigena();
//
//  public void setEtniaIndigenaIdEtniaIndigena(EtniaIndigenaBase etniaIndigena);

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

    public CondicionCensoBase getCondicionCensoNumeroCondicionCenso();
//
//  public void setCondicionCensoNumeroCondicionCenso(CondicionCensoBase condicionCenso);

    public FuncionarioBase getFuncionarioIdFuncionarioValidacionCen();
//
//  public void setFuncionarioIdFuncionarioValidacionCen(FuncionarioBase funcionario);

    public CausaInvCensoBase getCausaInvCensoNumeroCausaInvCenso();
//
//  public void setCausaInvCensoNumeroCausaInvCenso(CausaInvCensoBase causaInvCenso);

    public FichaPersonaBase getFichaPersonaIdFichaPersona();
//
//  public void setFichaPersonaIdFichaPersona(FichaPersonaBase fichaPersona);

    public CondicionReclCenBase getCondicionReclCenNumeroCondicionReclCen();
//
//  public void setCondicionReclCenNumeroCondicionReclCen(CondicionReclCenBase condicionReclCen);

    public CausaDenReclCenBase getCausaDenReclCenNumeroCausaDenReclCen();
//
//  public void setCausaDenReclCenNumeroCausaDenReclCen(CausaDenReclCenBase causaDenReclCen);

    public UsuarioBase getUsuarioIdUsuarioRegPotBen();
//
//  public void setUsuarioIdUsuarioRegPotBen(UsuarioBase usuario);

    public FuncionarioBase getFuncionarioIdFuncionarioUltVisitaCen();
//
//  public void setFuncionarioIdFuncionarioUltVisitaCen(FuncionarioBase funcionario);

    public Collection<? extends FichaPersonaBase> getFichaPersonaIdPotencialBenCollection();
//
//  public void setFichaPersonaIdPotencialBenCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends LogImpPotBase> getLogImpPotIdPotencialBenCollection();
//
//  public void setLogImpPotIdPotencialBenCollection(Collection<? extends LogImpPotBase> collection);

    public Collection<? extends LogProAcrPotBenBase> getLogProAcrPotBenIdPotencialBenCollection();
//
//  public void setLogProAcrPotBenIdPotencialBenCollection(Collection<? extends LogProAcrPotBenBase> collection);

    public Collection<? extends VisitaCensoBase> getVisitaCensoIdPotencialBenCollection();
//
//  public void setVisitaCensoIdPotencialBenCollection(Collection<? extends VisitaCensoBase> collection);

}
