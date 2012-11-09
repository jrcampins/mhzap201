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

public interface PaginaBase {

    public Long getIdPagina();
//
//  public void setIdPagina(Long idPagina);

    public long getVersionPagina();
//
//  public void setVersionPagina(long versionPagina);

    public String getCodigoPagina();
//
//  public void setCodigoPagina(String codigoPagina);

    public String getNombrePagina();
//
//  public void setNombrePagina(String nombrePagina);

    public String getDescripcionPagina();
//
//  public void setDescripcionPagina(String descripcionPagina);

    public String getUrlPagina();
//
//  public void setUrlPagina(String urlPagina);

    public int getEsPublica();
//
//  public void setEsPublica(int esPublica);

    public AplicacionBase getAplicacionIdAplicacion();
//
//  public void setAplicacionIdAplicacion(AplicacionBase aplicacion);

    public TipoPaginaBase getTipoPaginaNumeroTipoPagina();
//
//  public void setTipoPaginaNumeroTipoPagina(TipoPaginaBase tipoPagina);

    public DominioBase getDominioIdDominio();
//
//  public void setDominioIdDominio(DominioBase dominio);

    public DominioBase getDominioIdDominioMaestro();
//
//  public void setDominioIdDominioMaestro(DominioBase dominio);

    public ParametroBase getParametroIdParametro();
//
//  public void setParametroIdParametro(ParametroBase parametro);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdPaginaSeleccionCollection();
//
//  public void setClaseRecursoIdPaginaSeleccionCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdPaginaDetalleCollection();
//
//  public void setClaseRecursoIdPaginaDetalleCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends OpcionMenuBase> getOpcionMenuIdPaginaCollection();
//
//  public void setOpcionMenuIdPaginaCollection(Collection<? extends OpcionMenuBase> collection);

    public Collection<? extends PaginaFuncionBase> getPaginaFuncionIdPaginaCollection();
//
//  public void setPaginaFuncionIdPaginaCollection(Collection<? extends PaginaFuncionBase> collection);

    public Collection<? extends PaginaUsuarioBase> getPaginaUsuarioIdPaginaCollection();
//
//  public void setPaginaUsuarioIdPaginaCollection(Collection<? extends PaginaUsuarioBase> collection);

    public Collection<? extends RolPaginaBase> getRolPaginaIdPaginaCollection();
//
//  public void setRolPaginaIdPaginaCollection(Collection<? extends RolPaginaBase> collection);

}
