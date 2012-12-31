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

import java.util.Collection;

public interface UbicacionBase {

    public Long getIdUbicacion();
//
//  public void setIdUbicacion(Long idUbicacion);

    public long getVersionUbicacion();
//
//  public void setVersionUbicacion(long versionUbicacion);

    public String getCodigoUbicacion();
//
//  public void setCodigoUbicacion(String codigoUbicacion);

    public String getNombreUbicacion();
//
//  public void setNombreUbicacion(String nombreUbicacion);

    public Integer getSecuenciaUbicacion();
//
//  public void setSecuenciaUbicacion(Integer secuenciaUbicacion);

    public String getClaveUbicacion();
//
//  public void setClaveUbicacion(String claveUbicacion);

    public UbicacionBase getUbicacionIdUbicacionSuperior();
//
//  public void setUbicacionIdUbicacionSuperior(UbicacionBase ubicacion);

    public TipoNodoBase getTipoNodoNumeroTipoNodo();
//
//  public void setTipoNodoNumeroTipoNodo(TipoNodoBase tipoNodo);

    public NivelUbicacionBase getNivelUbicacionNumeroNivelUbicacion();
//
//  public void setNivelUbicacionNumeroNivelUbicacion(NivelUbicacionBase nivelUbicacion);

    public TipoAreaBase getTipoAreaNumeroTipoArea();
//
//  public void setTipoAreaNumeroTipoArea(TipoAreaBase tipoArea);

    public Collection<? extends FichaHogarBase> getFichaHogarIdDepartamentoCollection();
//
//  public void setFichaHogarIdDepartamentoCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdDistritoCollection();
//
//  public void setFichaHogarIdDistritoCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdBarrioCollection();
//
//  public void setFichaHogarIdBarrioCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdManzanaCollection();
//
//  public void setFichaHogarIdManzanaCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaPersonaBase> getFichaPersonaIdDepartamentoNacimientoCollection();
//
//  public void setFichaPersonaIdDepartamentoNacimientoCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends FichaPersonaBase> getFichaPersonaIdDistritoNacimientoCollection();
//
//  public void setFichaPersonaIdDistritoNacimientoCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends LogProAcrPotBenBase> getLogProAcrPotBenIdDepartamentoCollection();
//
//  public void setLogProAcrPotBenIdDepartamentoCollection(Collection<? extends LogProAcrPotBenBase> collection);

    public Collection<? extends LogProAcrPotBenBase> getLogProAcrPotBenIdDistritoCollection();
//
//  public void setLogProAcrPotBenIdDistritoCollection(Collection<? extends LogProAcrPotBenBase> collection);

    public Collection<? extends LogProAcrPotBenBase> getLogProAcrPotBenIdBarrioCollection();
//
//  public void setLogProAcrPotBenIdBarrioCollection(Collection<? extends LogProAcrPotBenBase> collection);

    public Collection<? extends LogProDenPenObjBase> getLogProDenPenObjIdDepartamentoCollection();
//
//  public void setLogProDenPenObjIdDepartamentoCollection(Collection<? extends LogProDenPenObjBase> collection);

    public Collection<? extends LogProDenPenObjBase> getLogProDenPenObjIdDistritoCollection();
//
//  public void setLogProDenPenObjIdDistritoCollection(Collection<? extends LogProDenPenObjBase> collection);

    public Collection<? extends LogProDenPenObjBase> getLogProDenPenObjIdBarrioCollection();
//
//  public void setLogProDenPenObjIdBarrioCollection(Collection<? extends LogProDenPenObjBase> collection);

    public Collection<? extends LogProOtoPenAprBase> getLogProOtoPenAprIdDepartamentoCollection();
//
//  public void setLogProOtoPenAprIdDepartamentoCollection(Collection<? extends LogProOtoPenAprBase> collection);

    public Collection<? extends LogProOtoPenAprBase> getLogProOtoPenAprIdDistritoCollection();
//
//  public void setLogProOtoPenAprIdDistritoCollection(Collection<? extends LogProOtoPenAprBase> collection);

    public Collection<? extends LogProOtoPenAprBase> getLogProOtoPenAprIdBarrioCollection();
//
//  public void setLogProOtoPenAprIdBarrioCollection(Collection<? extends LogProOtoPenAprBase> collection);

    public Collection<? extends LogProPreProPagBase> getLogProPreProPagIdDepartamentoCollection();
//
//  public void setLogProPreProPagIdDepartamentoCollection(Collection<? extends LogProPreProPagBase> collection);

    public Collection<? extends LogProPreProPagBase> getLogProPreProPagIdDistritoCollection();
//
//  public void setLogProPreProPagIdDistritoCollection(Collection<? extends LogProPreProPagBase> collection);

    public Collection<? extends LogProPreProPagBase> getLogProPreProPagIdBarrioCollection();
//
//  public void setLogProPreProPagIdBarrioCollection(Collection<? extends LogProPreProPagBase> collection);

    public Collection<? extends LogProVerElePenBase> getLogProVerElePenIdDepartamentoCollection();
//
//  public void setLogProVerElePenIdDepartamentoCollection(Collection<? extends LogProVerElePenBase> collection);

    public Collection<? extends LogProVerElePenBase> getLogProVerElePenIdDistritoCollection();
//
//  public void setLogProVerElePenIdDistritoCollection(Collection<? extends LogProVerElePenBase> collection);

    public Collection<? extends LogProVerElePenBase> getLogProVerElePenIdBarrioCollection();
//
//  public void setLogProVerElePenIdBarrioCollection(Collection<? extends LogProVerElePenBase> collection);

    public Collection<? extends PersonaBase> getPersonaIdDepartamentoCollection();
//
//  public void setPersonaIdDepartamentoCollection(Collection<? extends PersonaBase> collection);

    public Collection<? extends PersonaBase> getPersonaIdDistritoCollection();
//
//  public void setPersonaIdDistritoCollection(Collection<? extends PersonaBase> collection);

    public Collection<? extends PersonaBase> getPersonaIdBarrioCollection();
//
//  public void setPersonaIdBarrioCollection(Collection<? extends PersonaBase> collection);

    public Collection<? extends PersonaBase> getPersonaIdManzanaCollection();
//
//  public void setPersonaIdManzanaCollection(Collection<? extends PersonaBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdDepartamentoCollection();
//
//  public void setPotencialBenIdDepartamentoCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdDistritoCollection();
//
//  public void setPotencialBenIdDistritoCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdBarrioCollection();
//
//  public void setPotencialBenIdBarrioCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdManzanaCollection();
//
//  public void setPotencialBenIdManzanaCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends UbicacionBase> getUbicacionIdUbicacionSuperiorCollection();
//
//  public void setUbicacionIdUbicacionSuperiorCollection(Collection<? extends UbicacionBase> collection);

}
