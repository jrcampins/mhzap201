/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.persistence.entity;

import java.util.Date;

public interface PersonaAnotadaBase {

    public Long getIdPersonaAnotada();
//
//  public void setIdPersonaAnotada(Long idPersonaAnotada);

    public long getVersionPersonaAnotada();
//
//  public void setVersionPersonaAnotada(long versionPersonaAnotada);

    public long getIdPersona();
//
//  public void setIdPersona(long idPersona);

    public String getCodigoPersona();
//
//  public void setCodigoPersona(String codigoPersona);

    public String getNombrePersona();
//
//  public void setNombrePersona(String nombrePersona);

    public long getIdUsuario();
//
//  public void setIdUsuario(long idUsuario);

    public String getCodigoUsuario();
//
//  public void setCodigoUsuario(String codigoUsuario);

    public String getNombreUsuario();
//
//  public void setNombreUsuario(String nombreUsuario);

    public Date getFechaHoraSeleccion();
//
//  public void setFechaHoraSeleccion(Date fechaHoraSeleccion);

}
