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

public interface AplicacionBase {

    public Long getIdAplicacion();
//
//  public void setIdAplicacion(Long idAplicacion);

    public long getVersionAplicacion();
//
//  public void setVersionAplicacion(long versionAplicacion);

    public String getCodigoAplicacion();
//
//  public void setCodigoAplicacion(String codigoAplicacion);

    public String getNombreAplicacion();
//
//  public void setNombreAplicacion(String nombreAplicacion);

    public String getDescripcionAplicacion();
//
//  public void setDescripcionAplicacion(String descripcionAplicacion);

    public String getServidorAplicacion();
//
//  public void setServidorAplicacion(String servidorAplicacion);

    public String getPuertoAplicacion();
//
//  public void setPuertoAplicacion(String puertoAplicacion);

    public String getUrlAplicacion();
//
//  public void setUrlAplicacion(String urlAplicacion);

    public int getEsPublica();
//
//  public void setEsPublica(int esPublica);

    public GrupoAplicacionBase getGrupoAplicacionIdGrupoAplicacion();
//
//  public void setGrupoAplicacionIdGrupoAplicacion(GrupoAplicacionBase grupoAplicacion);

    public Collection<? extends OpcionMenuBase> getOpcionMenuIdAplicacionCollection();
//
//  public void setOpcionMenuIdAplicacionCollection(Collection<? extends OpcionMenuBase> collection);

    public Collection<? extends PaginaBase> getPaginaIdAplicacionCollection();
//
//  public void setPaginaIdAplicacionCollection(Collection<? extends PaginaBase> collection);

    public Collection<? extends RolAplicacionBase> getRolAplicacionIdAplicacionCollection();
//
//  public void setRolAplicacionIdAplicacionCollection(Collection<? extends RolAplicacionBase> collection);

}
