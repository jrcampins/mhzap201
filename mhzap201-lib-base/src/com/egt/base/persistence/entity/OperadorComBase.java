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

public interface OperadorComBase {

    public Integer getNumeroOperadorCom();
//
//  public void setNumeroOperadorCom(Integer numeroOperadorCom);

    public String getCodigoOperadorCom();
//
//  public void setCodigoOperadorCom(String codigoOperadorCom);

    public Collection<? extends FiltroClaRecFunBase> getFiltroClaRecFunNumeroOperadorComCollection();
//
//  public void setFiltroClaRecFunNumeroOperadorComCollection(Collection<? extends FiltroClaRecFunBase> collection);

    public Collection<? extends FiltroClaRecParBase> getFiltroClaRecParNumeroOperadorComCollection();
//
//  public void setFiltroClaRecParNumeroOperadorComCollection(Collection<? extends FiltroClaRecParBase> collection);

    public Collection<? extends FiltroClaRecSecBase> getFiltroClaRecSecNumeroOperadorComCollection();
//
//  public void setFiltroClaRecSecNumeroOperadorComCollection(Collection<? extends FiltroClaRecSecBase> collection);

    public Collection<? extends FiltroClaRecVinBase> getFiltroClaRecVinNumeroOperadorComCollection();
//
//  public void setFiltroClaRecVinNumeroOperadorComCollection(Collection<? extends FiltroClaRecVinBase> collection);

    public Collection<? extends FiltroFuncionParBase> getFiltroFuncionParNumeroOperadorComCollection();
//
//  public void setFiltroFuncionParNumeroOperadorComCollection(Collection<? extends FiltroFuncionParBase> collection);

}
