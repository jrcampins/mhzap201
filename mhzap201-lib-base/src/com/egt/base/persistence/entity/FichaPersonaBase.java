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

public interface FichaPersonaBase {

    public Long getIdFichaPersona();
//
//  public void setIdFichaPersona(Long idFichaPersona);

    public long getVersionFichaPersona();
//
//  public void setVersionFichaPersona(long versionFichaPersona);

    public String getCodigoFichaPersona();
//
//  public void setCodigoFichaPersona(String codigoFichaPersona);

    public String getNombreFichaPersona();
//
//  public void setNombreFichaPersona(String nombreFichaPersona);

    public int getEsRespondente();
//
//  public void setEsRespondente(int esRespondente);

    public int getNumeroOrdenIdentificacion();
//
//  public void setNumeroOrdenIdentificacion(int numeroOrdenIdentificacion);

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

    public Integer getEdad();
//
//  public void setEdad(Integer edad);

    public Integer getNumeroOrdenIdenConyuge();
//
//  public void setNumeroOrdenIdenConyuge(Integer numeroOrdenIdenConyuge);

    public Integer getNumeroOrdenIdenPadre();
//
//  public void setNumeroOrdenIdenPadre(Integer numeroOrdenIdenPadre);

    public Integer getNumeroOrdenIdenMadre();
//
//  public void setNumeroOrdenIdenMadre(Integer numeroOrdenIdenMadre);

    public Integer getNumeroCedula();
//
//  public void setNumeroCedula(Integer numeroCedula);

    public String getLetraCedula();
//
//  public void setLetraCedula(String letraCedula);

    public Date getFechaNacimiento();
//
//  public void setFechaNacimiento(Date fechaNacimiento);

    public String getOtroIdiomaHogar();
//
//  public void setOtroIdiomaHogar(String otroIdiomaHogar);

    public String getOtroMotivoInaEsc();
//
//  public void setOtroMotivoInaEsc(String otroMotivoInaEsc);

    public Integer getUltimoCursoAprobado();
//
//  public void setUltimoCursoAprobado(Integer ultimoCursoAprobado);

    public String getOtraClaseEnfAcc();
//
//  public void setOtraClaseEnfAcc(String otraClaseEnfAcc);

    public String getOtraClaseEnfCronica();
//
//  public void setOtraClaseEnfCronica(String otraClaseEnfCronica);

    public String getOtroMotivoNoAtencion();
//
//  public void setOtroMotivoNoAtencion(String otroMotivoNoAtencion);

    public String getOtraClaseImpedimento();
//
//  public void setOtraClaseImpedimento(String otraClaseImpedimento);

    public String getOtraCausaImpedimento();
//
//  public void setOtraCausaImpedimento(String otraCausaImpedimento);

    public String getOtroMotivoNoTrabajo();
//
//  public void setOtroMotivoNoTrabajo(String otroMotivoNoTrabajo);

    public String getDescripcionOcupacionPrin();
//
//  public void setDescripcionOcupacionPrin(String descripcionOcupacionPrin);

    public String getDescripcionDedicacionPrin();
//
//  public void setDescripcionDedicacionPrin(String descripcionDedicacionPrin);

    public BigDecimal getMontoIngresoOcupacionPrin();
//
//  public void setMontoIngresoOcupacionPrin(BigDecimal montoIngresoOcupacionPrin);

    public BigDecimal getMontoIngresoOcupacionSecun();
//
//  public void setMontoIngresoOcupacionSecun(BigDecimal montoIngresoOcupacionSecun);

    public BigDecimal getMontoIngresoOtrasOcup();
//
//  public void setMontoIngresoOtrasOcup(BigDecimal montoIngresoOtrasOcup);

    public BigDecimal getMontoIngresoAlquileres();
//
//  public void setMontoIngresoAlquileres(BigDecimal montoIngresoAlquileres);

    public BigDecimal getMontoIngresoIntereses();
//
//  public void setMontoIngresoIntereses(BigDecimal montoIngresoIntereses);

    public BigDecimal getMontoIngresoAyudaFamPais();
//
//  public void setMontoIngresoAyudaFamPais(BigDecimal montoIngresoAyudaFamPais);

    public BigDecimal getMontoIngresoAyudaFamExter();
//
//  public void setMontoIngresoAyudaFamExter(BigDecimal montoIngresoAyudaFamExter);

    public BigDecimal getMontoIngresoJubilacion();
//
//  public void setMontoIngresoJubilacion(BigDecimal montoIngresoJubilacion);

    public BigDecimal getMontoIngresoPensiones();
//
//  public void setMontoIngresoPensiones(BigDecimal montoIngresoPensiones);

    public BigDecimal getMontoIngresoTekopora();
//
//  public void setMontoIngresoTekopora(BigDecimal montoIngresoTekopora);

    public BigDecimal getMontoIngresoProgramas();
//
//  public void setMontoIngresoProgramas(BigDecimal montoIngresoProgramas);

    public BigDecimal getMontoIngresoAdicional();
//
//  public void setMontoIngresoAdicional(BigDecimal montoIngresoAdicional);

    public BigDecimal getTotalIngresoMensual();
//
//  public void setTotalIngresoMensual(BigDecimal totalIngresoMensual);

    public int getEsFichaPersonaInactiva();
//
//  public void setEsFichaPersonaInactiva(int esFichaPersonaInactiva);

    public int getEsFichaPersonaImportada();
//
//  public void setEsFichaPersonaImportada(int esFichaPersonaImportada);

    public Date getFechaImportacion();
//
//  public void setFechaImportacion(Date fechaImportacion);

    public FichaHogarBase getFichaHogarIdFichaHogar();
//
//  public void setFichaHogarIdFichaHogar(FichaHogarBase fichaHogar);

    public SexoPersonaBase getSexoPersonaNumeroSexoPersona();
//
//  public void setSexoPersonaNumeroSexoPersona(SexoPersonaBase sexoPersona);

    public EstadoCivilBase getEstadoCivilNumeroEstadoCivil();
//
//  public void setEstadoCivilNumeroEstadoCivil(EstadoCivilBase estadoCivil);

    public TipoPersonaHogarBase getTipoPersonaHogarNumeroTipoPersonaHogar();
//
//  public void setTipoPersonaHogarNumeroTipoPersonaHogar(TipoPersonaHogarBase tipoPersonaHogar);

    public SionoBase getSionoNumeroSionoMiembroHogar();
//
//  public void setSionoNumeroSionoMiembroHogar(SionoBase siono);

    public TipoExcepcionCedBase getTipoExcepcionCedNumeroTipoExcepcionCed();
//
//  public void setTipoExcepcionCedNumeroTipoExcepcionCed(TipoExcepcionCedBase tipoExcepcionCed);

    public UbicacionBase getUbicacionIdDepartamentoNacimiento();
//
//  public void setUbicacionIdDepartamentoNacimiento(UbicacionBase ubicacion);

    public UbicacionBase getUbicacionIdDistritoNacimiento();
//
//  public void setUbicacionIdDistritoNacimiento(UbicacionBase ubicacion);

    public TipoAreaBase getTipoAreaNumeroTipoAreaLugarNac();
//
//  public void setTipoAreaNumeroTipoAreaLugarNac(TipoAreaBase tipoArea);

    public IdiomaHogarBase getIdiomaHogarNumeroIdiomaHogar();
//
//  public void setIdiomaHogarNumeroIdiomaHogar(IdiomaHogarBase idiomaHogar);

    public SionoBase getSionoNumeroSionoAsistenciaEsc();
//
//  public void setSionoNumeroSionoAsistenciaEsc(SionoBase siono);

    public MotivoInaEscBase getMotivoInaEscNumeroMotivoInaEsc();
//
//  public void setMotivoInaEscNumeroMotivoInaEsc(MotivoInaEscBase motivoInaEsc);

    public SionoBase getSionoNumeroSionoMatriculacionEsc();
//
//  public void setSionoNumeroSionoMatriculacionEsc(SionoBase siono);

    public NivelEducativoBase getNivelEducativoNumeroNivelEduUltCurAprob();
//
//  public void setNivelEducativoNumeroNivelEduUltCurAprob(NivelEducativoBase nivelEducativo);

    public SionoBase getSionoNumeroSionoCursoNoFormal();
//
//  public void setSionoNumeroSionoCursoNoFormal(SionoBase siono);

    public TipoSeguroMedicoBase getTipoSeguroMedicoNumeroTipoSeguroMedico();
//
//  public void setTipoSeguroMedicoNumeroTipoSeguroMedico(TipoSeguroMedicoBase tipoSeguroMedico);

    public EstadoSaludBase getEstadoSaludNumeroEstadoSalud();
//
//  public void setEstadoSaludNumeroEstadoSalud(EstadoSaludBase estadoSalud);

    public ClaseEnfAccBase getClaseEnfAccNumeroClaseEnfAcc();
//
//  public void setClaseEnfAccNumeroClaseEnfAcc(ClaseEnfAccBase claseEnfAcc);

    public ClaseEnfCronicaBase getClaseEnfCronicaNumeroClaseEnfCronica();
//
//  public void setClaseEnfCronicaNumeroClaseEnfCronica(ClaseEnfCronicaBase claseEnfCronica);

    public SionoBase getSionoNumeroSionoAtencionMedica();
//
//  public void setSionoNumeroSionoAtencionMedica(SionoBase siono);

    public MotivoNoAtencionBase getMotivoNoAtencionNumeroMotivoNoAtencion();
//
//  public void setMotivoNoAtencionNumeroMotivoNoAtencion(MotivoNoAtencionBase motivoNoAtencion);

    public SionoBase getSionoNumeroSionoCarnetVacunacion();
//
//  public void setSionoNumeroSionoCarnetVacunacion(SionoBase siono);

    public ClaseImpedimentoBase getClaseImpedimentoNumeroClaseImpedimento();
//
//  public void setClaseImpedimentoNumeroClaseImpedimento(ClaseImpedimentoBase claseImpedimento);

    public CausaImpedimentoBase getCausaImpedimentoNumeroCausaImpedimento();
//
//  public void setCausaImpedimentoNumeroCausaImpedimento(CausaImpedimentoBase causaImpedimento);

    public SionoBase getSionoNumeroSionoDifParaCaminar();
//
//  public void setSionoNumeroSionoDifParaCaminar(SionoBase siono);

    public SionoBase getSionoNumeroSionoDifParaVestirse();
//
//  public void setSionoNumeroSionoDifParaVestirse(SionoBase siono);

    public SionoBase getSionoNumeroSionoDifParaBanarse();
//
//  public void setSionoNumeroSionoDifParaBanarse(SionoBase siono);

    public SionoBase getSionoNumeroSionoDifParaComer();
//
//  public void setSionoNumeroSionoDifParaComer(SionoBase siono);

    public SionoBase getSionoNumeroSionoDifParaLaCama();
//
//  public void setSionoNumeroSionoDifParaLaCama(SionoBase siono);

    public SionoBase getSionoNumeroSionoDifParaElBano();
//
//  public void setSionoNumeroSionoDifParaElBano(SionoBase siono);

    public SionoBase getSionoNumeroSionoTrabajo();
//
//  public void setSionoNumeroSionoTrabajo(SionoBase siono);

    public MotivoNoTrabajoBase getMotivoNoTrabajoNumeroMotivoNoTrabajo();
//
//  public void setMotivoNoTrabajoNumeroMotivoNoTrabajo(MotivoNoTrabajoBase motivoNoTrabajo);

    public TipoRelacionLabBase getTipoRelacionLabNumeroTipoRelacionLab();
//
//  public void setTipoRelacionLabNumeroTipoRelacionLab(TipoRelacionLabBase tipoRelacionLab);

    public PotencialBenBase getPotencialBenIdPotencialBen();
//
//  public void setPotencialBenIdPotencialBen(PotencialBenBase potencialBen);

    public Collection<? extends LogImpPerBase> getLogImpPerIdFichaPersonaCollection();
//
//  public void setLogImpPerIdFichaPersonaCollection(Collection<? extends LogImpPerBase> collection);

    public Collection<? extends LogImpPerEecBase> getLogImpPerEecIdFichaPersonaCollection();
//
//  public void setLogImpPerEecIdFichaPersonaCollection(Collection<? extends LogImpPerEecBase> collection);

    public Collection<? extends LogProAcrPotBenBase> getLogProAcrPotBenIdFichaPersonaCollection();
//
//  public void setLogProAcrPotBenIdFichaPersonaCollection(Collection<? extends LogProAcrPotBenBase> collection);

    public Collection<? extends PersonaBase> getPersonaIdFichaPersonaCollection();
//
//  public void setPersonaIdFichaPersonaCollection(Collection<? extends PersonaBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdFichaPersonaCollection();
//
//  public void setPotencialBenIdFichaPersonaCollection(Collection<? extends PotencialBenBase> collection);

}
