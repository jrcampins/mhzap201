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

import java.util.Date;

public interface InformeAuditoriaBase {

    public Long getIdInformeAuditoria();
//
//  public void setIdInformeAuditoria(Long idInformeAuditoria);

    public long getVersionInformeAuditoria();
//
//  public void setVersionInformeAuditoria(long versionInformeAuditoria);

    public String getCodigoInformeAuditoria();
//
//  public void setCodigoInformeAuditoria(String codigoInformeAuditoria);

    public String getNombreInformeAuditoria();
//
//  public void setNombreInformeAuditoria(String nombreInformeAuditoria);

    public Date getFechaTransaccion();
//
//  public void setFechaTransaccion(Date fechaTransaccion);

}
