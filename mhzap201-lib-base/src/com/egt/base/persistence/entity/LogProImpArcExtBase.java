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

public interface LogProImpArcExtBase {

    public Long getIdLogProImpArcExt();
//
//  public void setIdLogProImpArcExt(Long idLogProImpArcExt);

    public long getVersionLogProImpArcExt();
//
//  public void setVersionLogProImpArcExt(long versionLogProImpArcExt);

    public String getCodigoTipoArcDatExt();
//
//  public void setCodigoTipoArcDatExt(String codigoTipoArcDatExt);

    public String getNombreProveedorDatExt();
//
//  public void setNombreProveedorDatExt(String nombreProveedorDatExt);

    public String getCodigoProveedorDatExt();
//
//  public void setCodigoProveedorDatExt(String codigoProveedorDatExt);

    public String getCodigoArchivoDatosExt();
//
//  public void setCodigoArchivoDatosExt(String codigoArchivoDatosExt);

    public String getRutaArchivoDatosExt();
//
//  public void setRutaArchivoDatosExt(String rutaArchivoDatosExt);

    public int getEsImportado();
//
//  public void setEsImportado(int esImportado);

    public String getObservacion();
//
//  public void setObservacion(String observacion);

    public Date getFechaHoraTransaccion();
//
//  public void setFechaHoraTransaccion(Date fechaHoraTransaccion);

    public ArchivoDatosExtBase getArchivoDatosExtIdArchivoDatosExt();
//
//  public void setArchivoDatosExtIdArchivoDatosExt(ArchivoDatosExtBase archivoDatosExt);

    public TipoArcDatExtBase getTipoArcDatExtNumeroTipoArcDatExt();
//
//  public void setTipoArcDatExtNumeroTipoArcDatExt(TipoArcDatExtBase tipoArcDatExt);

}
