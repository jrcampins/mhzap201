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

public interface EstadoCivilBase {

    public Integer getNumeroEstadoCivil();
//
//  public void setNumeroEstadoCivil(Integer numeroEstadoCivil);

    public String getCodigoEstadoCivil();
//
//  public void setCodigoEstadoCivil(String codigoEstadoCivil);

    public Collection<? extends FichaPersonaBase> getFichaPersonaNumeroEstadoCivilCollection();
//
//  public void setFichaPersonaNumeroEstadoCivilCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends PersonaBase> getPersonaNumeroEstadoCivilCollection();
//
//  public void setPersonaNumeroEstadoCivilCollection(Collection<? extends PersonaBase> collection);

}
