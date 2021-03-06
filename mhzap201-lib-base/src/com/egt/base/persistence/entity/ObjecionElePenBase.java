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

import java.util.Date;

public interface ObjecionElePenBase {

    public Long getIdObjecionElePen();
//
//  public void setIdObjecionElePen(Long idObjecionElePen);

    public long getVersionObjecionElePen();
//
//  public void setVersionObjecionElePen(long versionObjecionElePen);

    public int getEsObjecionElePenInactiva();
//
//  public void setEsObjecionElePenInactiva(int esObjecionElePenInactiva);

    public Date getFechaUltimaActualizacion();
//
//  public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion);

    public String getNombreArchivoUltimaAct();
//
//  public void setNombreArchivoUltimaAct(String nombreArchivoUltimaAct);

    public String getObservaciones();
//
//  public void setObservaciones(String observaciones);

    public Date getFechaAnulacion();
//
//  public void setFechaAnulacion(Date fechaAnulacion);

    public String getObservacionesAnulacion();
//
//  public void setObservacionesAnulacion(String observacionesAnulacion);

    public String getReferencia();
//
//  public void setReferencia(String referencia);

    public PersonaBase getPersonaIdPersona();
//
//  public void setPersonaIdPersona(PersonaBase persona);

    public ProveedorDatExtBase getProveedorDatExtIdProveedorDatExt();
//
//  public void setProveedorDatExtIdProveedorDatExt(ProveedorDatExtBase proveedorDatExt);

    public TipoObjElePenBase getTipoObjElePenNumeroTipoObjElePen();
//
//  public void setTipoObjElePenNumeroTipoObjElePen(TipoObjElePenBase tipoObjElePen);

}
