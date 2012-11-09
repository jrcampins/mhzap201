/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
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

public interface TipoAreaBase {

    public Integer getNumeroTipoArea();
//
//  public void setNumeroTipoArea(Integer numeroTipoArea);

    public String getCodigoTipoArea();
//
//  public void setCodigoTipoArea(String codigoTipoArea);

    public Collection<? extends FichaHogarBase> getFichaHogarNumeroTipoAreaCollection();
//
//  public void setFichaHogarNumeroTipoAreaCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaPersonaBase> getFichaPersonaNumeroTipoAreaLugarNacCollection();
//
//  public void setFichaPersonaNumeroTipoAreaLugarNacCollection(Collection<? extends FichaPersonaBase> collection);

    public Collection<? extends PersonaBase> getPersonaNumeroTipoAreaCollection();
//
//  public void setPersonaNumeroTipoAreaCollection(Collection<? extends PersonaBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenNumeroTipoAreaCollection();
//
//  public void setPotencialBenNumeroTipoAreaCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends UbicacionBase> getUbicacionNumeroTipoAreaCollection();
//
//  public void setUbicacionNumeroTipoAreaCollection(Collection<? extends UbicacionBase> collection);

}
