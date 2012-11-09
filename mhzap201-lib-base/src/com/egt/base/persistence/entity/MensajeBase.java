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


public interface MensajeBase {

    public Long getIdMensaje();
//
//  public void setIdMensaje(Long idMensaje);

    public long getVersionMensaje();
//
//  public void setVersionMensaje(long versionMensaje);

    public String getCodigoMensaje();
//
//  public void setCodigoMensaje(String codigoMensaje);

    public String getPatronMensaje();
//
//  public void setPatronMensaje(String patronMensaje);

    public String getDescripcionMensaje();
//
//  public void setDescripcionMensaje(String descripcionMensaje);

}
