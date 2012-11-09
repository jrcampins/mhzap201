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

public interface TipoRolBase {

    public Integer getNumeroTipoRol();
//
//  public void setNumeroTipoRol(Integer numeroTipoRol);

    public String getCodigoTipoRol();
//
//  public void setCodigoTipoRol(String codigoTipoRol);

    public Collection<? extends RolBase> getRolNumeroTipoRolCollection();
//
//  public void setRolNumeroTipoRolCollection(Collection<? extends RolBase> collection);

}
