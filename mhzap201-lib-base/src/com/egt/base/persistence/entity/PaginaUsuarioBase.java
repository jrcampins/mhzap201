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


public interface PaginaUsuarioBase {

    public Long getIdPaginaUsuario();
//
//  public void setIdPaginaUsuario(Long idPaginaUsuario);

    public long getVersionPaginaUsuario();
//
//  public void setVersionPaginaUsuario(long versionPaginaUsuario);

    public PaginaBase getPaginaIdPagina();
//
//  public void setPaginaIdPagina(PaginaBase pagina);

    public UsuarioBase getUsuarioIdUsuario();
//
//  public void setUsuarioIdUsuario(UsuarioBase usuario);

}
