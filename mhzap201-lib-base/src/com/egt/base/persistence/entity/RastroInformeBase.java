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

import java.util.Date;

public interface RastroInformeBase {

    public Long getIdRastroInforme();
//
//  public void setIdRastroInforme(Long idRastroInforme);

    public long getVersionRastroInforme();
//
//  public void setVersionRastroInforme(long versionRastroInforme);

    public Date getFechaHoraInicioEjecucion();
//
//  public void setFechaHoraInicioEjecucion(Date fechaHoraInicioEjecucion);

    public Date getFechaHoraFinEjecucion();
//
//  public void setFechaHoraFinEjecucion(Date fechaHoraFinEjecucion);

    public long getIdUsuario();
//
//  public void setIdUsuario(long idUsuario);

    public String getNombreArchivo();
//
//  public void setNombreArchivo(String nombreArchivo);

    public String getDescripcionError();
//
//  public void setDescripcionError(String descripcionError);

    public FuncionBase getFuncionIdFuncion();
//
//  public void setFuncionIdFuncion(FuncionBase funcion);

    public CondicionEjeFunBase getCondicionEjeFunNumeroCondicionEjeFun();
//
//  public void setCondicionEjeFunNumeroCondicionEjeFun(CondicionEjeFunBase condicionEjeFun);

}
