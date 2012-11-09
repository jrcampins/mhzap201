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

public interface FiltroFuncionBase {

    public Long getIdFiltroFuncion();
//
//  public void setIdFiltroFuncion(Long idFiltroFuncion);

    public long getVersionFiltroFuncion();
//
//  public void setVersionFiltroFuncion(long versionFiltroFuncion);

    public String getCodigoFiltroFuncion();
//
//  public void setCodigoFiltroFuncion(String codigoFiltroFuncion);

    public String getNombreFiltroFuncion();
//
//  public void setNombreFiltroFuncion(String nombreFiltroFuncion);

    public String getDescripcionFiltroFuncion();
//
//  public void setDescripcionFiltroFuncion(String descripcionFiltroFuncion);

    public int getEsPublico();
//
//  public void setEsPublico(int esPublico);

    public Long getIdFiltroFuncionOriginal();
//
//  public void setIdFiltroFuncionOriginal(Long idFiltroFuncionOriginal);

    public FuncionBase getFuncionIdFuncion();
//
//  public void setFuncionIdFuncion(FuncionBase funcion);

    public UsuarioBase getUsuarioIdUsuario();
//
//  public void setUsuarioIdUsuario(UsuarioBase usuario);

    public Collection<? extends FiltroFuncionParBase> getFiltroFuncionParIdFiltroFuncionCollection();
//
//  public void setFiltroFuncionParIdFiltroFuncionCollection(Collection<? extends FiltroFuncionParBase> collection);

    public Collection<? extends RolFiltroFuncionBase> getRolFiltroFuncionIdFiltroFuncionCollection();
//
//  public void setRolFiltroFuncionIdFiltroFuncionCollection(Collection<? extends RolFiltroFuncionBase> collection);

}
