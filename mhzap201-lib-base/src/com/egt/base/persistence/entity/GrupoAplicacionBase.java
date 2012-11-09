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

public interface GrupoAplicacionBase {

    public Long getIdGrupoAplicacion();
//
//  public void setIdGrupoAplicacion(Long idGrupoAplicacion);

    public long getVersionGrupoAplicacion();
//
//  public void setVersionGrupoAplicacion(long versionGrupoAplicacion);

    public String getCodigoGrupoAplicacion();
//
//  public void setCodigoGrupoAplicacion(String codigoGrupoAplicacion);

    public String getNombreGrupoAplicacion();
//
//  public void setNombreGrupoAplicacion(String nombreGrupoAplicacion);

    public String getDescripcionGrupoAplicacion();
//
//  public void setDescripcionGrupoAplicacion(String descripcionGrupoAplicacion);

    public Collection<? extends AplicacionBase> getAplicacionIdGrupoAplicacionCollection();
//
//  public void setAplicacionIdGrupoAplicacionCollection(Collection<? extends AplicacionBase> collection);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdGrupoAplicacionCollection();
//
//  public void setClaseRecursoIdGrupoAplicacionCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends RolBase> getRolIdGrupoAplicacionCollection();
//
//  public void setRolIdGrupoAplicacionCollection(Collection<? extends RolBase> collection);

}
