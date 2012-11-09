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

public interface ClaseRecursoSecBase {

    public Long getIdClaseRecursoSec();
//
//  public void setIdClaseRecursoSec(Long idClaseRecursoSec);

    public long getVersionClaseRecursoSec();
//
//  public void setVersionClaseRecursoSec(long versionClaseRecursoSec);

    public String getEtiquetaClaseRecursoSec();
//
//  public void setEtiquetaClaseRecursoSec(String etiquetaClaseRecursoSec);

    public String getDescripcionClaseRecursoSec();
//
//  public void setDescripcionClaseRecursoSec(String descripcionClaseRecursoSec);

    public int getOrdenPresentacion();
//
//  public void setOrdenPresentacion(int ordenPresentacion);

    public int getEsPestanaDetalle();
//
//  public void setEsPestanaDetalle(int esPestanaDetalle);

    public ClaseRecursoBase getClaseRecursoIdClaseRecurso();
//
//  public void setClaseRecursoIdClaseRecurso(ClaseRecursoBase claseRecurso);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParIdClaseRecursoSecCollection();
//
//  public void setClaseRecursoParIdClaseRecursoSecCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends FiltroClaRecSecBase> getFiltroClaRecSecIdClaseRecursoSecCollection();
//
//  public void setFiltroClaRecSecIdClaseRecursoSecCollection(Collection<? extends FiltroClaRecSecBase> collection);

}
