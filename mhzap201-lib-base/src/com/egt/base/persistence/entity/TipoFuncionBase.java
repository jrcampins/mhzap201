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

public interface TipoFuncionBase {

    public Integer getNumeroTipoFuncion();
//
//  public void setNumeroTipoFuncion(Integer numeroTipoFuncion);

    public String getCodigoTipoFuncion();
//
//  public void setCodigoTipoFuncion(String codigoTipoFuncion);

    public Collection<? extends FuncionBase> getFuncionNumeroTipoFuncionCollection();
//
//  public void setFuncionNumeroTipoFuncionCollection(Collection<? extends FuncionBase> collection);

}
