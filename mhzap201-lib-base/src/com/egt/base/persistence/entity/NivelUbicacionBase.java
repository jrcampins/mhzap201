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

public interface NivelUbicacionBase {

    public Integer getNumeroNivelUbicacion();
//
//  public void setNumeroNivelUbicacion(Integer numeroNivelUbicacion);

    public String getCodigoNivelUbicacion();
//
//  public void setCodigoNivelUbicacion(String codigoNivelUbicacion);

    public int getDigitosNivelUbicacion();
//
//  public void setDigitosNivelUbicacion(int digitosNivelUbicacion);

    public Collection<? extends UbicacionBase> getUbicacionNumeroNivelUbicacionCollection();
//
//  public void setUbicacionNumeroNivelUbicacionCollection(Collection<? extends UbicacionBase> collection);

}
