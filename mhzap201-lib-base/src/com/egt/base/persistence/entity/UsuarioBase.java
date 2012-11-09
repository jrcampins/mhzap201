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

public interface UsuarioBase {

    public Long getIdUsuario();
//
//  public void setIdUsuario(Long idUsuario);

    public long getVersionUsuario();
//
//  public void setVersionUsuario(long versionUsuario);

    public String getCodigoUsuario();
//
//  public void setCodigoUsuario(String codigoUsuario);

    public String getNombreUsuario();
//
//  public void setNombreUsuario(String nombreUsuario);

    public String getPasswordUsuario();
//
//  public void setPasswordUsuario(String passwordUsuario);

    public String getCorreoElectronico();
//
//  public void setCorreoElectronico(String correoElectronico);

    public int getEsSuperUsuario();
//
//  public void setEsSuperUsuario(int esSuperUsuario);

    public int getEsUsuarioEspecial();
//
//  public void setEsUsuarioEspecial(int esUsuarioEspecial);

    public int getEsUsuarioInactivo();
//
//  public void setEsUsuarioInactivo(int esUsuarioInactivo);

    public int getEsUsuarioModificado();
//
//  public void setEsUsuarioModificado(int esUsuarioModificado);

    public UsuarioBase getUsuarioIdUsuarioSupervisor();
//
//  public void setUsuarioIdUsuarioSupervisor(UsuarioBase usuario);

    public Collection<? extends ArchivoDatosExtBase> getArchivoDatosExtIdUsuarioUltimaCargaCollection();
//
//  public void setArchivoDatosExtIdUsuarioUltimaCargaCollection(Collection<? extends ArchivoDatosExtBase> collection);

    public Collection<? extends ArchivoDatosExtBase> getArchivoDatosExtIdUsuarioUltimaImportacionCollection();
//
//  public void setArchivoDatosExtIdUsuarioUltimaImportacionCollection(Collection<? extends ArchivoDatosExtBase> collection);

    public Collection<? extends FiltroFuncionBase> getFiltroFuncionIdUsuarioCollection();
//
//  public void setFiltroFuncionIdUsuarioCollection(Collection<? extends FiltroFuncionBase> collection);

    public Collection<? extends PaginaUsuarioBase> getPaginaUsuarioIdUsuarioCollection();
//
//  public void setPaginaUsuarioIdUsuarioCollection(Collection<? extends PaginaUsuarioBase> collection);

    public Collection<? extends RolUsuarioBase> getRolUsuarioIdUsuarioCollection();
//
//  public void setRolUsuarioIdUsuarioCollection(Collection<? extends RolUsuarioBase> collection);

    public Collection<? extends UsuarioBase> getUsuarioIdUsuarioSupervisorCollection();
//
//  public void setUsuarioIdUsuarioSupervisorCollection(Collection<? extends UsuarioBase> collection);

}
