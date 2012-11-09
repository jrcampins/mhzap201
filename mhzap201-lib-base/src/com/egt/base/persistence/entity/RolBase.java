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

public interface RolBase {

    public Long getIdRol();
//
//  public void setIdRol(Long idRol);

    public long getVersionRol();
//
//  public void setVersionRol(long versionRol);

    public String getCodigoRol();
//
//  public void setCodigoRol(String codigoRol);

    public String getNombreRol();
//
//  public void setNombreRol(String nombreRol);

    public String getDescripcionRol();
//
//  public void setDescripcionRol(String descripcionRol);

    public TipoRolBase getTipoRolNumeroTipoRol();
//
//  public void setTipoRolNumeroTipoRol(TipoRolBase tipoRol);

    public GrupoAplicacionBase getGrupoAplicacionIdGrupoAplicacion();
//
//  public void setGrupoAplicacionIdGrupoAplicacion(GrupoAplicacionBase grupoAplicacion);

    public Collection<? extends RolAplicacionBase> getRolAplicacionIdRolCollection();
//
//  public void setRolAplicacionIdRolCollection(Collection<? extends RolAplicacionBase> collection);

    public Collection<? extends RolFiltroFuncionBase> getRolFiltroFuncionIdRolCollection();
//
//  public void setRolFiltroFuncionIdRolCollection(Collection<? extends RolFiltroFuncionBase> collection);

    public Collection<? extends RolFuncionBase> getRolFuncionIdRolCollection();
//
//  public void setRolFuncionIdRolCollection(Collection<? extends RolFuncionBase> collection);

    public Collection<? extends RolPaginaBase> getRolPaginaIdRolCollection();
//
//  public void setRolPaginaIdRolCollection(Collection<? extends RolPaginaBase> collection);

    public Collection<? extends RolUsuarioBase> getRolUsuarioIdRolCollection();
//
//  public void setRolUsuarioIdRolCollection(Collection<? extends RolUsuarioBase> collection);

}
