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
import java.util.Date;

public interface ArchivoDatosExtBase {

    public Long getIdArchivoDatosExt();
//
//  public void setIdArchivoDatosExt(Long idArchivoDatosExt);

    public long getVersionArchivoDatosExt();
//
//  public void setVersionArchivoDatosExt(long versionArchivoDatosExt);

    public String getCodigoArchivoDatosExt();
//
//  public void setCodigoArchivoDatosExt(String codigoArchivoDatosExt);

    public String getNombreArchivoDatosExt();
//
//  public void setNombreArchivoDatosExt(String nombreArchivoDatosExt);

    public String getObjetoArchivoDatosExt();
//
//  public void setObjetoArchivoDatosExt(String objetoArchivoDatosExt);

    public Integer getBytesArchivoDatosExt();
//
//  public void setBytesArchivoDatosExt(Integer bytesArchivoDatosExt);

    public int getEsArchivoDatosExtImportado();
//
//  public void setEsArchivoDatosExtImportado(int esArchivoDatosExtImportado);

    public int getEsArchivoDatosExtInactivo();
//
//  public void setEsArchivoDatosExtInactivo(int esArchivoDatosExtInactivo);

    public Date getFechaHoraUltimaCarga();
//
//  public void setFechaHoraUltimaCarga(Date fechaHoraUltimaCarga);

    public String getNombreArchivoDatos();
//
//  public void setNombreArchivoDatos(String nombreArchivoDatos);

    public String getNombreOriginalArchivoDatos();
//
//  public void setNombreOriginalArchivoDatos(String nombreOriginalArchivoDatos);

    public Date getFechaHoraUltimaImportacion();
//
//  public void setFechaHoraUltimaImportacion(Date fechaHoraUltimaImportacion);

    public ProveedorDatExtBase getProveedorDatExtIdProveedorDatExt();
//
//  public void setProveedorDatExtIdProveedorDatExt(ProveedorDatExtBase proveedorDatExt);

    public TipoArcDatExtBase getTipoArcDatExtNumeroTipoArcDatExt();
//
//  public void setTipoArcDatExtNumeroTipoArcDatExt(TipoArcDatExtBase tipoArcDatExt);

    public UsuarioBase getUsuarioIdUsuarioUltimaCarga();
//
//  public void setUsuarioIdUsuarioUltimaCarga(UsuarioBase usuario);

    public UsuarioBase getUsuarioIdUsuarioUltimaImportacion();
//
//  public void setUsuarioIdUsuarioUltimaImportacion(UsuarioBase usuario);

    public Collection<? extends LogProImpArcExtBase> getLogProImpArcExtIdArchivoDatosExtCollection();
//
//  public void setLogProImpArcExtIdArchivoDatosExtCollection(Collection<? extends LogProImpArcExtBase> collection);

}
