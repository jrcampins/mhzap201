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


public interface RolUsuarioBase {

    public Long getIdRolUsuario();
//
//  public void setIdRolUsuario(Long idRolUsuario);

    public long getVersionRolUsuario();
//
//  public void setVersionRolUsuario(long versionRolUsuario);

    public RolBase getRolIdRol();
//
//  public void setRolIdRol(RolBase rol);

    public UsuarioBase getUsuarioIdUsuario();
//
//  public void setUsuarioIdUsuario(UsuarioBase usuario);

}
