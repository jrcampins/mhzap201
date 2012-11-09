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


public interface RolAplicacionBase {

    public Long getIdRolAplicacion();
//
//  public void setIdRolAplicacion(Long idRolAplicacion);

    public long getVersionRolAplicacion();
//
//  public void setVersionRolAplicacion(long versionRolAplicacion);

    public RolBase getRolIdRol();
//
//  public void setRolIdRol(RolBase rol);

    public AplicacionBase getAplicacionIdAplicacion();
//
//  public void setAplicacionIdAplicacion(AplicacionBase aplicacion);

}
