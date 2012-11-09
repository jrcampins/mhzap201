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

public interface ConjuntoSegmentoBase {

    public Long getIdConjuntoSegmento();
//
//  public void setIdConjuntoSegmento(Long idConjuntoSegmento);

    public long getVersionConjuntoSegmento();
//
//  public void setVersionConjuntoSegmento(long versionConjuntoSegmento);

    public String getCodigoConjuntoSegmento();
//
//  public void setCodigoConjuntoSegmento(String codigoConjuntoSegmento);

    public String getNombreConjuntoSegmento();
//
//  public void setNombreConjuntoSegmento(String nombreConjuntoSegmento);

    public String getDescripcionConjuntoSegmento();
//
//  public void setDescripcionConjuntoSegmento(String descripcionConjuntoSegmento);

    public ClaseRecursoBase getClaseRecursoIdClaseRecurso();
//
//  public void setClaseRecursoIdClaseRecurso(ClaseRecursoBase claseRecurso);

    public Collection<? extends ElementoSegmentoBase> getElementoSegmentoIdConjuntoSegmentoCollection();
//
//  public void setElementoSegmentoIdConjuntoSegmentoCollection(Collection<? extends ElementoSegmentoBase> collection);

    public Collection<? extends RolFuncionBase> getRolFuncionIdConjuntoSegmentoCollection();
//
//  public void setRolFuncionIdConjuntoSegmentoCollection(Collection<? extends RolFuncionBase> collection);

}
