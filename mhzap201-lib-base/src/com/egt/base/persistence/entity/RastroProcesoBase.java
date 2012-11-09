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

public interface RastroProcesoBase {

    public Long getIdRastroProceso();
//
//  public void setIdRastroProceso(Long idRastroProceso);

    public long getVersionRastroProceso();
//
//  public void setVersionRastroProceso(long versionRastroProceso);

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

    public Long getIdGrupoProceso();
//
//  public void setIdGrupoProceso(Long idGrupoProceso);

    public Long getIdRastroProcesoSuperior();
//
//  public void setIdRastroProcesoSuperior(Long idRastroProcesoSuperior);

    public int getSubprocesos();
//
//  public void setSubprocesos(int subprocesos);

    public int getSubprocesosPendientes();
//
//  public void setSubprocesosPendientes(int subprocesosPendientes);

    public int getSubprocesosEnProgreso();
//
//  public void setSubprocesosEnProgreso(int subprocesosEnProgreso);

    public int getSubprocesosSinErrores();
//
//  public void setSubprocesosSinErrores(int subprocesosSinErrores);

    public int getSubprocesosConErrores();
//
//  public void setSubprocesosConErrores(int subprocesosConErrores);

    public int getSubprocesosCancelados();
//
//  public void setSubprocesosCancelados(int subprocesosCancelados);

    public String getProcedimientoAfterUpdate();
//
//  public void setProcedimientoAfterUpdate(String procedimientoAfterUpdate);

    public FuncionBase getFuncionIdFuncion();
//
//  public void setFuncionIdFuncion(FuncionBase funcion);

    public CondicionEjeFunBase getCondicionEjeFunNumeroCondicionEjeFun();
//
//  public void setCondicionEjeFunNumeroCondicionEjeFun(CondicionEjeFunBase condicionEjeFun);

}
