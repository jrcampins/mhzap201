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


public interface DominioParametroBase {

    public Long getIdDominioParametro();
//
//  public void setIdDominioParametro(Long idDominioParametro);

    public long getVersionDominioParametro();
//
//  public void setVersionDominioParametro(long versionDominioParametro);

    public String getEtiquetaParametro();
//
//  public void setEtiquetaParametro(String etiquetaParametro);

    public DominioBase getDominioIdDominio();
//
//  public void setDominioIdDominio(DominioBase dominio);

    public ParametroBase getParametroIdParametro();
//
//  public void setParametroIdParametro(ParametroBase parametro);

    public TipoParametroDomBase getTipoParametroDomNumeroTipoParametroDom();
//
//  public void setTipoParametroDomNumeroTipoParametroDom(TipoParametroDomBase tipoParametroDom);

}
