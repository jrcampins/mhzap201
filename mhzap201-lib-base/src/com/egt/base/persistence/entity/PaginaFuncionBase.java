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


public interface PaginaFuncionBase {

    public Long getIdPaginaFuncion();
//
//  public void setIdPaginaFuncion(Long idPaginaFuncion);

    public long getVersionPaginaFuncion();
//
//  public void setVersionPaginaFuncion(long versionPaginaFuncion);

    public int getEsFuncionInicial();
//
//  public void setEsFuncionInicial(int esFuncionInicial);

    public String getControlPaginaFuncion();
//
//  public void setControlPaginaFuncion(String controlPaginaFuncion);

    public PaginaBase getPaginaIdPagina();
//
//  public void setPaginaIdPagina(PaginaBase pagina);

    public FuncionBase getFuncionIdFuncion();
//
//  public void setFuncionIdFuncion(FuncionBase funcion);

}
