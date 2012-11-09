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

public interface ProveedorDatExtBase {

    public Long getIdProveedorDatExt();
//
//  public void setIdProveedorDatExt(Long idProveedorDatExt);

    public long getVersionProveedorDatExt();
//
//  public void setVersionProveedorDatExt(long versionProveedorDatExt);

    public String getCodigoProveedorDatExt();
//
//  public void setCodigoProveedorDatExt(String codigoProveedorDatExt);

    public String getNombreProveedorDatExt();
//
//  public void setNombreProveedorDatExt(String nombreProveedorDatExt);

    public Collection<? extends ArchivoDatosExtBase> getArchivoDatosExtIdProveedorDatExtCollection();
//
//  public void setArchivoDatosExtIdProveedorDatExtCollection(Collection<? extends ArchivoDatosExtBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdProveedorDatExtCollection();
//
//  public void setFichaHogarIdProveedorDatExtCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends ObjecionElePenBase> getObjecionElePenIdProveedorDatExtCollection();
//
//  public void setObjecionElePenIdProveedorDatExtCollection(Collection<? extends ObjecionElePenBase> collection);

}
