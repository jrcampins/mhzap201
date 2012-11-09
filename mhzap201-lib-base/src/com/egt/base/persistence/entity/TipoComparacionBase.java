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

public interface TipoComparacionBase {

    public Integer getNumeroTipoComparacion();
//
//  public void setNumeroTipoComparacion(Integer numeroTipoComparacion);

    public String getCodigoTipoComparacion();
//
//  public void setCodigoTipoComparacion(String codigoTipoComparacion);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParNumeroTipoComparacionCollection();
//
//  public void setClaseRecursoParNumeroTipoComparacionCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroNumeroTipoComparacionCollection();
//
//  public void setFuncionParametroNumeroTipoComparacionCollection(Collection<? extends FuncionParametroBase> collection);

}
