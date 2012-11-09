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

public interface TipoParametroBase {

    public Integer getNumeroTipoParametro();
//
//  public void setNumeroTipoParametro(Integer numeroTipoParametro);

    public String getCodigoTipoParametro();
//
//  public void setCodigoTipoParametro(String codigoTipoParametro);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParNumeroTipoParametroCollection();
//
//  public void setClaseRecursoParNumeroTipoParametroCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroNumeroTipoParametroCollection();
//
//  public void setFuncionParametroNumeroTipoParametroCollection(Collection<? extends FuncionParametroBase> collection);

}
