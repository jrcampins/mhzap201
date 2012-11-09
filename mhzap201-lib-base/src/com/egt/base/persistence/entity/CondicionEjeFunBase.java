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

public interface CondicionEjeFunBase {

    public Integer getNumeroCondicionEjeFun();
//
//  public void setNumeroCondicionEjeFun(Integer numeroCondicionEjeFun);

    public String getCodigoCondicionEjeFun();
//
//  public void setCodigoCondicionEjeFun(String codigoCondicionEjeFun);

    public Collection<? extends GrupoProcesoBase> getGrupoProcesoNumeroCondicionEjeFunCollection();
//
//  public void setGrupoProcesoNumeroCondicionEjeFunCollection(Collection<? extends GrupoProcesoBase> collection);

    public Collection<? extends ProcesoBase> getProcesoNumeroCondicionUltimaEjeCollection();
//
//  public void setProcesoNumeroCondicionUltimaEjeCollection(Collection<? extends ProcesoBase> collection);

    public Collection<? extends RastroInformeBase> getRastroInformeNumeroCondicionEjeFunCollection();
//
//  public void setRastroInformeNumeroCondicionEjeFunCollection(Collection<? extends RastroInformeBase> collection);

    public Collection<? extends RastroProcesoBase> getRastroProcesoNumeroCondicionEjeFunCollection();
//
//  public void setRastroProcesoNumeroCondicionEjeFunCollection(Collection<? extends RastroProcesoBase> collection);

}
