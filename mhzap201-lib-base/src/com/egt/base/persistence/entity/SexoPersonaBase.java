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

public interface SexoPersonaBase {

    public Integer getNumeroSexoPersona();
//
//  public void setNumeroSexoPersona(Integer numeroSexoPersona);

    public String getCodigoSexoPersona();
//
//  public void setCodigoSexoPersona(String codigoSexoPersona);

    public Collection<? extends FichaPersonaBase> getFichaPersonaNumeroSexoPersonaCollection();
//
//  public void setFichaPersonaNumeroSexoPersonaCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends PersonaBase> getPersonaNumeroSexoPersonaCollection();
//
//  public void setPersonaNumeroSexoPersonaCollection(Collection<? extends PersonaBase> collection);

}
