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

public interface FuncionParametroBase {

    public Long getIdFuncionParametro();
//
//  public void setIdFuncionParametro(Long idFuncionParametro);

    public long getVersionFuncionParametro();
//
//  public void setVersionFuncionParametro(long versionFuncionParametro);

    public Long getIdListaValor();
//
//  public void setIdListaValor(Long idListaValor);

    public Long getIdClaseObjetoValor();
//
//  public void setIdClaseObjetoValor(Long idClaseObjetoValor);

    public String getValorMinimo();
//
//  public void setValorMinimo(String valorMinimo);

    public String getValorMaximo();
//
//  public void setValorMaximo(String valorMaximo);

    public String getValorOmision();
//
//  public void setValorOmision(String valorOmision);

    public int getEsParametroSinRastro();
//
//  public void setEsParametroSinRastro(int esParametroSinRastro);

    public int getEsParametroSegmento();
//
//  public void setEsParametroSegmento(int esParametroSegmento);

    public FuncionBase getFuncionIdFuncion();
//
//  public void setFuncionIdFuncion(FuncionBase funcion);

    public ParametroBase getParametroIdParametro();
//
//  public void setParametroIdParametro(ParametroBase parametro);

    public TipoParametroBase getTipoParametroNumeroTipoParametro();
//
//  public void setTipoParametroNumeroTipoParametro(TipoParametroBase tipoParametro);

    public TipoComparacionBase getTipoComparacionNumeroTipoComparacion();
//
//  public void setTipoComparacionNumeroTipoComparacion(TipoComparacionBase tipoComparacion);

    public FuncionBase getFuncionIdFuncionReferencia();
//
//  public void setFuncionIdFuncionReferencia(FuncionBase funcion);

    public TipoValorBase getTipoValorNumeroTipoValor();
//
//  public void setTipoValorNumeroTipoValor(TipoValorBase tipoValor);

    public ClaseRecursoBase getClaseRecursoIdClaseRecursoValor();
//
//  public void setClaseRecursoIdClaseRecursoValor(ClaseRecursoBase claseRecurso);

    public Collection<? extends FiltroFuncionParBase> getFiltroFuncionParIdFuncionParametroCollection();
//
//  public void setFiltroFuncionParIdFuncionParametroCollection(Collection<? extends FiltroFuncionParBase> collection);

}
