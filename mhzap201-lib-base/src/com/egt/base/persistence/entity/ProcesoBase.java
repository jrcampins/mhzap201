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

public interface ProcesoBase {

    public Long getIdProceso();
//
//  public void setIdProceso(Long idProceso);

    public long getVersionProceso();
//
//  public void setVersionProceso(long versionProceso);

    public String getCodigoProcesoProceso();
//
//  public void setCodigoProcesoProceso(String codigoProcesoProceso);

    public String getNombreProcesoProceso();
//
//  public void setNombreProcesoProceso(String nombreProcesoProceso);

    public Date getFechaHoraUltimaEjecucion();
//
//  public void setFechaHoraUltimaEjecucion(Date fechaHoraUltimaEjecucion);

    public CondicionEjeFunBase getCondicionEjeFunNumeroCondicionUltimaEje();
//
//  public void setCondicionEjeFunNumeroCondicionUltimaEje(CondicionEjeFunBase condicionEjeFun);

}
