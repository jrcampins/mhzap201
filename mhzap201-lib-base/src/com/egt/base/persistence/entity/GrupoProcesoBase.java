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

public interface GrupoProcesoBase {

    public Long getIdGrupoProceso();
//
//  public void setIdGrupoProceso(Long idGrupoProceso);

    public long getVersionGrupoProceso();
//
//  public void setVersionGrupoProceso(long versionGrupoProceso);

    public String getCodigoGrupoProceso();
//
//  public void setCodigoGrupoProceso(String codigoGrupoProceso);

    public String getNombreGrupoProceso();
//
//  public void setNombreGrupoProceso(String nombreGrupoProceso);

    public String getDescripcionGrupoProceso();
//
//  public void setDescripcionGrupoProceso(String descripcionGrupoProceso);

    public Long getIdRastroProceso();
//
//  public void setIdRastroProceso(Long idRastroProceso);

    public CondicionEjeFunBase getCondicionEjeFunNumeroCondicionEjeFun();
//
//  public void setCondicionEjeFunNumeroCondicionEjeFun(CondicionEjeFunBase condicionEjeFun);

    public Collection<? extends FuncionBase> getFuncionIdGrupoProcesoCollection();
//
//  public void setFuncionIdGrupoProcesoCollection(Collection<? extends FuncionBase> collection);

}
