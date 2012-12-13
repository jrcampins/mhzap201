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
package com.egt.base.persistence.entity;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public interface PersonaBase {

    public Long getIdPersona();
//
//  public void setIdPersona(Long idPersona);

    public long getVersionPersona();
//
//  public void setVersionPersona(long versionPersona);

    public String getCodigoPersona();
//
//  public void setCodigoPersona(String codigoPersona);

    public String getNombrePersona();
//
//  public void setNombrePersona(String nombrePersona);

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

    public String getDireccion();
//
//  public void setDireccion(String direccion);

    public String getNumeroTelefonoLineaBaja();
//
//  public void setNumeroTelefonoLineaBaja(String numeroTelefonoLineaBaja);

    public String getNumeroTelefonoCelular();
//
//  public void setNumeroTelefonoCelular(String numeroTelefonoCelular);

    public String getCertificadoVida();
//
//  public void setCertificadoVida(String certificadoVida);

    public Date getFechaCertificadoVida();
//
//  public void setFechaCertificadoVida(Date fechaCertificadoVida);

    public int getEsCertificadoVidaAnulado();
//
//  public void setEsCertificadoVidaAnulado(int esCertificadoVidaAnulado);

    public String getComentariosAnulCerVida();
//
//  public void setComentariosAnulCerVida(String comentariosAnulCerVida);

    public String getCertificadoDefuncion();
//
//  public void setCertificadoDefuncion(String certificadoDefuncion);

    public Date getFechaCertificadoDefuncion();
//
//  public void setFechaCertificadoDefuncion(Date fechaCertificadoDefuncion);

    public int getEsCerDefuncionAnulado();
//
//  public void setEsCerDefuncionAnulado(int esCerDefuncionAnulado);

    public String getComentariosAnulCerDefuncion();
//
//  public void setComentariosAnulCerDefuncion(String comentariosAnulCerDefuncion);

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

    public int getEsPersonaElegibleParaPen();
//
//  public void setEsPersonaElegibleParaPen(int esPersonaElegibleParaPen);

    public int getEsPersonaAcreditadaParaPen();
//
//  public void setEsPersonaAcreditadaParaPen(int esPersonaAcreditadaParaPen);

    public int getEsPersonaConCopiaCedula();
//
//  public void setEsPersonaConCopiaCedula(int esPersonaConCopiaCedula);

    public int getEsPersonaConDeclaracionJur();
//
//  public void setEsPersonaConDeclaracionJur(int esPersonaConDeclaracionJur);

    public BigDecimal getMontoPension();
//
//  public void setMontoPension(BigDecimal montoPension);

    public String getLugarSolicitudPension();
//
//  public void setLugarSolicitudPension(String lugarSolicitudPension);

    public Date getFechaSolicitudPension();
//
//  public void setFechaSolicitudPension(Date fechaSolicitudPension);

    public String getComentariosSolicitudPension();
//
//  public void setComentariosSolicitudPension(String comentariosSolicitudPension);

    public Date getFechaAprobacionPension();
//
//  public void setFechaAprobacionPension(Date fechaAprobacionPension);

    public String getComentariosAprobacionPension();
//
//  public void setComentariosAprobacionPension(String comentariosAprobacionPension);

    public Date getFechaOtorgamientoPen();
//
//  public void setFechaOtorgamientoPen(Date fechaOtorgamientoPen);

    public String getComentariosOtorgamientoPen();
//
//  public void setComentariosOtorgamientoPen(String comentariosOtorgamientoPen);

    public Date getFechaDenegacionPension();
//
//  public void setFechaDenegacionPension(Date fechaDenegacionPension);

    public String getOtraCausaDenPension();
//
//  public void setOtraCausaDenPension(String otraCausaDenPension);

    public String getComentariosDenegacionPension();
//
//  public void setComentariosDenegacionPension(String comentariosDenegacionPension);

    public Date getFechaRevocacionPension();
//
//  public void setFechaRevocacionPension(Date fechaRevocacionPension);

    public String getOtraCausaRevPension();
//
//  public void setOtraCausaRevPension(String otraCausaRevPension);

    public String getComentariosRevocacionPension();
//
//  public void setComentariosRevocacionPension(String comentariosRevocacionPension);

    public Date getFechaSolicitudRecoPen();
//
//  public void setFechaSolicitudRecoPen(Date fechaSolicitudRecoPen);

    public String getComentariosSolicitudRecoPen();
//
//  public void setComentariosSolicitudRecoPen(String comentariosSolicitudRecoPen);

    public Date getFechaAprobacionRecoPen();
//
//  public void setFechaAprobacionRecoPen(Date fechaAprobacionRecoPen);

    public String getComentariosAprRecoPen();
//
//  public void setComentariosAprRecoPen(String comentariosAprRecoPen);

    public Date getFechaDenegacionRecoPen();
//
//  public void setFechaDenegacionRecoPen(Date fechaDenegacionRecoPen);

    public String getOtraCausaDenRecoPen();
//
//  public void setOtraCausaDenRecoPen(String otraCausaDenRecoPen);

    public String getComentariosDenRecoPen();
//
//  public void setComentariosDenRecoPen(String comentariosDenRecoPen);

    public Date getFechaRegistroDenunciaPen();
//
//  public void setFechaRegistroDenunciaPen(Date fechaRegistroDenunciaPen);

    public String getComentariosRegistroDenuPen();
//
//  public void setComentariosRegistroDenuPen(String comentariosRegistroDenuPen);

    public Date getFechaConfirmacionDenuPen();
//
//  public void setFechaConfirmacionDenuPen(Date fechaConfirmacionDenuPen);

    public String getComentariosConfDenuPen();
//
//  public void setComentariosConfDenuPen(String comentariosConfDenuPen);

    public Date getFechaDesmentidoDenunciaPen();
//
//  public void setFechaDesmentidoDenunciaPen(Date fechaDesmentidoDenunciaPen);

    public String getComentariosDesDenuPen();
//
//  public void setComentariosDesDenuPen(String comentariosDesDenuPen);

    public Date getFechaFichaPersona();
//
//  public void setFechaFichaPersona(Date fechaFichaPersona);

    public BigDecimal getIndiceCalidadVida();
//
//  public void setIndiceCalidadVida(BigDecimal indiceCalidadVida);

    public Date getFechaUltimoCobroPension();
//
//  public void setFechaUltimoCobroPension(Date fechaUltimoCobroPension);

    public String getNotasAnulFecUltCobPen();
//
//  public void setNotasAnulFecUltCobPen(String notasAnulFecUltCobPen);

    public Date getFechaHoraUltActJupe();
//
//  public void setFechaHoraUltActJupe(Date fechaHoraUltActJupe);

    public String getNumeroResolucionOtorPen();
//
//  public void setNumeroResolucionOtorPen(String numeroResolucionOtorPen);

    public Date getFechaResolucionOtorPen();
//
//  public void setFechaResolucionOtorPen(Date fechaResolucionOtorPen);

    public String getNumeroResolucionDenPen();
//
//  public void setNumeroResolucionDenPen(String numeroResolucionDenPen);

    public Date getFechaResolucionDenPen();
//
//  public void setFechaResolucionDenPen(Date fechaResolucionDenPen);

    public SexoPersonaBase getSexoPersonaNumeroSexoPersona();
//
//  public void setSexoPersonaNumeroSexoPersona(SexoPersonaBase sexoPersona);

    public EstadoCivilBase getEstadoCivilNumeroEstadoCivil();
//
//  public void setEstadoCivilNumeroEstadoCivil(EstadoCivilBase estadoCivil);

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

    public CondicionPensionBase getCondicionPensionNumeroCondicionPension();
//
//  public void setCondicionPensionNumeroCondicionPension(CondicionPensionBase condicionPension);

    public CausaDenPensionBase getCausaDenPensionNumeroCausaDenPension();
//
//  public void setCausaDenPensionNumeroCausaDenPension(CausaDenPensionBase causaDenPension);

    public CausaRevPensionBase getCausaRevPensionNumeroCausaRevPension();
//
//  public void setCausaRevPensionNumeroCausaRevPension(CausaRevPensionBase causaRevPension);

    public CondicionRecoPenBase getCondicionRecoPenNumeroCondicionRecoPen();
//
//  public void setCondicionRecoPenNumeroCondicionRecoPen(CondicionRecoPenBase condicionRecoPen);

    public CausaDenRecoPenBase getCausaDenRecoPenNumeroCausaDenRecoPen();
//
//  public void setCausaDenRecoPenNumeroCausaDenRecoPen(CausaDenRecoPenBase causaDenRecoPen);

    public CondicionDenuPenBase getCondicionDenuPenNumeroCondicionDenuPen();
//
//  public void setCondicionDenuPenNumeroCondicionDenuPen(CondicionDenuPenBase condicionDenuPen);

    public FichaPersonaBase getFichaPersonaIdFichaPersona();
//
//  public void setFichaPersonaIdFichaPersona(FichaPersonaBase fichaPersona);

    public TipoActJupeBase getTipoActJupeNumeroTipoActJupe();
//
//  public void setTipoActJupeNumeroTipoActJupe(TipoActJupeBase tipoActJupe);

    public Collection<? extends ObjecionElePenBase> getObjecionElePenIdPersonaCollection();
//
//  public void setObjecionElePenIdPersonaCollection(Collection<? extends ObjecionElePenBase> collection);

    public PotencialBenBase getPotencialBenIdPersona();
//
//  public void setPotencialBenIdPersona(PotencialBenBase potencialBen);

}
