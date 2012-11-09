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


public interface FiltroFuncionParBase {

    public Long getIdFiltroFuncionPar();
//
//  public void setIdFiltroFuncionPar(Long idFiltroFuncionPar);

    public long getVersionFiltroFuncionPar();
//
//  public void setVersionFiltroFuncionPar(long versionFiltroFuncionPar);

    public Long getIdValorLista();
//
//  public void setIdValorLista(Long idValorLista);

    public Long getIdObjetoValor();
//
//  public void setIdObjetoValor(Long idObjetoValor);

    public Long getIdRecursoValor();
//
//  public void setIdRecursoValor(Long idRecursoValor);

    public String getValorParametro();
//
//  public void setValorParametro(String valorParametro);

    public String getSignificadoParametro();
//
//  public void setSignificadoParametro(String significadoParametro);

    public FiltroFuncionBase getFiltroFuncionIdFiltroFuncion();
//
//  public void setFiltroFuncionIdFiltroFuncion(FiltroFuncionBase filtroFuncion);

    public FuncionParametroBase getFuncionParametroIdFuncionParametro();
//
//  public void setFuncionParametroIdFuncionParametro(FuncionParametroBase funcionParametro);

    public OperadorComBase getOperadorComNumeroOperadorCom();
//
//  public void setOperadorComNumeroOperadorCom(OperadorComBase operadorCom);

}
