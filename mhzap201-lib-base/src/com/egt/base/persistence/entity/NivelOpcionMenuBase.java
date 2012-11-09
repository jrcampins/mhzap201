/*
 * Copyright (C) 2008, EGT Consultores, C.A.
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

public interface NivelOpcionMenuBase {

    public Integer getNumeroNivelOpcionMenu();
//
//  public void setNumeroNivelOpcionMenu(Integer numeroNivelOpcionMenu);

    public String getCodigoNivelOpcionMenu();
//
//  public void setCodigoNivelOpcionMenu(String codigoNivelOpcionMenu);

    public int getDigitosNivelOpcionMenu();
//
//  public void setDigitosNivelOpcionMenu(int digitosNivelOpcionMenu);

    public Collection<? extends OpcionMenuBase> getOpcionMenuNumeroNivelOpcionMenuCollection();
//
//  public void setOpcionMenuNumeroNivelOpcionMenuCollection(Collection<? extends OpcionMenuBase> collection);

}
