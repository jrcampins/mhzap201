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

public interface TipoParametroDomBase {

    public Integer getNumeroTipoParametroDom();
//
//  public void setNumeroTipoParametroDom(Integer numeroTipoParametroDom);

    public String getCodigoTipoParametroDom();
//
//  public void setCodigoTipoParametroDom(String codigoTipoParametroDom);

    public String getCodigoPropiedadInterfaz();
//
//  public void setCodigoPropiedadInterfaz(String codigoPropiedadInterfaz);

    public String getNombreInterfaz();
//
//  public void setNombreInterfaz(String nombreInterfaz);

    public String getEtiquetaParametro();
//
//  public void setEtiquetaParametro(String etiquetaParametro);

    public Collection<? extends DominioParametroBase> getDominioParametroNumeroTipoParametroDomCollection();
//
//  public void setDominioParametroNumeroTipoParametroDomCollection(Collection<? extends DominioParametroBase> collection);

}
