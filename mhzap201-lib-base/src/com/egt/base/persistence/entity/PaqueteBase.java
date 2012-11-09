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

public interface PaqueteBase {

    public Long getIdPaquete();
//
//  public void setIdPaquete(Long idPaquete);

    public long getVersionPaquete();
//
//  public void setVersionPaquete(long versionPaquete);

    public String getCodigoPaquete();
//
//  public void setCodigoPaquete(String codigoPaquete);

    public Collection<? extends DominioBase> getDominioIdPaqueteCollection();
//
//  public void setDominioIdPaqueteCollection(Collection<? extends DominioBase> collection);

    public Collection<? extends DominioPaqueteBase> getDominioPaqueteIdPaqueteCollection();
//
//  public void setDominioPaqueteIdPaqueteCollection(Collection<? extends DominioPaqueteBase> collection);

}
