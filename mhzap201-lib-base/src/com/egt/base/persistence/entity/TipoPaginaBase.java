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

public interface TipoPaginaBase {

    public Integer getNumeroTipoPagina();
//
//  public void setNumeroTipoPagina(Integer numeroTipoPagina);

    public String getCodigoTipoPagina();
//
//  public void setCodigoTipoPagina(String codigoTipoPagina);

    public Collection<? extends PaginaBase> getPaginaNumeroTipoPaginaCollection();
//
//  public void setPaginaNumeroTipoPaginaCollection(Collection<? extends PaginaBase> collection);

}
