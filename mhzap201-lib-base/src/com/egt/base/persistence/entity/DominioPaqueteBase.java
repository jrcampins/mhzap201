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


public interface DominioPaqueteBase {

    public Long getIdDominioPaquete();
//
//  public void setIdDominioPaquete(Long idDominioPaquete);

    public long getVersionDominioPaquete();
//
//  public void setVersionDominioPaquete(long versionDominioPaquete);

    public DominioBase getDominioIdDominio();
//
//  public void setDominioIdDominio(DominioBase dominio);

    public PaqueteBase getPaqueteIdPaquete();
//
//  public void setPaqueteIdPaquete(PaqueteBase paquete);

}
