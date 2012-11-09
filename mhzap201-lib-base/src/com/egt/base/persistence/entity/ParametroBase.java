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

public interface ParametroBase {

    public Long getIdParametro();
//
//  public void setIdParametro(Long idParametro);

    public long getVersionParametro();
//
//  public void setVersionParametro(long versionParametro);

    public String getCodigoParametro();
//
//  public void setCodigoParametro(String codigoParametro);

    public String getNombreParametro();
//
//  public void setNombreParametro(String nombreParametro);

    public String getDetalleParametro();
//
//  public void setDetalleParametro(String detalleParametro);

    public String getDescripcionParametro();
//
//  public void setDescripcionParametro(String descripcionParametro);

    public String getAliasParametro();
//
//  public void setAliasParametro(String aliasParametro);

    public TipoDatoParBase getTipoDatoParNumeroTipoDatoPar();
//
//  public void setTipoDatoParNumeroTipoDatoPar(TipoDatoParBase tipoDatoPar);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParIdParametroCollection();
//
//  public void setClaseRecursoParIdParametroCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends DominioParametroBase> getDominioParametroIdParametroCollection();
//
//  public void setDominioParametroIdParametroCollection(Collection<? extends DominioParametroBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroIdParametroCollection();
//
//  public void setFuncionParametroIdParametroCollection(Collection<? extends FuncionParametroBase> collection);

    public Collection<? extends PaginaBase> getPaginaIdParametroCollection();
//
//  public void setPaginaIdParametroCollection(Collection<? extends PaginaBase> collection);

    public Collection<? extends RastroFuncionParBase> getRastroFuncionParIdParametroCollection();
//
//  public void setRastroFuncionParIdParametroCollection(Collection<? extends RastroFuncionParBase> collection);

}
