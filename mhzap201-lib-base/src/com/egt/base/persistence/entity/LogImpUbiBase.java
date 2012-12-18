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

public interface LogImpUbiBase {

    public Long getIdLogImpUbi();
//
//  public void setIdLogImpUbi(Long idLogImpUbi);

    public long getVersionLogImpUbi();
//
//  public void setVersionLogImpUbi(long versionLogImpUbi);

    public String getCodigo();
//
//  public void setCodigo(String codigo);

    public String getUbicacion();
//
//  public void setUbicacion(String ubicacion);

    public String getTipoUbicacion();
//
//  public void setTipoUbicacion(String tipoUbicacion);

    public String getTipoArea();
//
//  public void setTipoArea(String tipoArea);

    public String getCodigoUbicacionSuperior();
//
//  public void setCodigoUbicacionSuperior(String codigoUbicacionSuperior);

    public int getEsImportado();
//
//  public void setEsImportado(int esImportado);

    public String getObservacion();
//
//  public void setObservacion(String observacion);

    public Date getFechaHoraTransaccion();
//
//  public void setFechaHoraTransaccion(Date fechaHoraTransaccion);

    public String getNombreArchivo();
//
//  public void setNombreArchivo(String nombreArchivo);

    public String getCodigoArchivo();
//
//  public void setCodigoArchivo(String codigoArchivo);

}
