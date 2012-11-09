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


public interface ElementoSegmentoBase {

    public Long getIdElementoSegmento();
//
//  public void setIdElementoSegmento(Long idElementoSegmento);

    public long getVersionElementoSegmento();
//
//  public void setVersionElementoSegmento(long versionElementoSegmento);

    public long getIdSegmento();
//
//  public void setIdSegmento(long idSegmento);

    public String getValorSegmento();
//
//  public void setValorSegmento(String valorSegmento);

    public String getSignificadoSegmento();
//
//  public void setSignificadoSegmento(String significadoSegmento);

    public ConjuntoSegmentoBase getConjuntoSegmentoIdConjuntoSegmento();
//
//  public void setConjuntoSegmentoIdConjuntoSegmento(ConjuntoSegmentoBase conjuntoSegmento);

}
