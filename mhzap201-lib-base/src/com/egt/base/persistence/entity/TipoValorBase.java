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

public interface TipoValorBase {

    public Integer getNumeroTipoValor();
//
//  public void setNumeroTipoValor(Integer numeroTipoValor);

    public String getCodigoTipoValor();
//
//  public void setCodigoTipoValor(String codigoTipoValor);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParNumeroTipoValorCollection();
//
//  public void setClaseRecursoParNumeroTipoValorCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParNumeroTipoValorAlternativoCollection();
//
//  public void setClaseRecursoParNumeroTipoValorAlternativoCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroNumeroTipoValorCollection();
//
//  public void setFuncionParametroNumeroTipoValorCollection(Collection<? extends FuncionParametroBase> collection);

}
