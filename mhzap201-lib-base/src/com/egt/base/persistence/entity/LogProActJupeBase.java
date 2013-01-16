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

public interface LogProActJupeBase {

    public Long getIdLogProActJupe();
//
//  public void setIdLogProActJupe(Long idLogProActJupe);

    public long getVersionLogProActJupe();
//
//  public void setVersionLogProActJupe(long versionLogProActJupe);

    public String getCodigoPersona();
//
//  public void setCodigoPersona(String codigoPersona);

    public String getNombrePersona();
//
//  public void setNombrePersona(String nombrePersona);

    public int getEsProcesado();
//
//  public void setEsProcesado(int esProcesado);

    public String getObservacion();
//
//  public void setObservacion(String observacion);

    public Date getFechaHoraTransaccion();
//
//  public void setFechaHoraTransaccion(Date fechaHoraTransaccion);

    public PersonaBase getPersonaIdPersona();
//
//  public void setPersonaIdPersona(PersonaBase persona);

    public UbicacionBase getUbicacionIdDepartamento();
//
//  public void setUbicacionIdDepartamento(UbicacionBase ubicacion);

    public UbicacionBase getUbicacionIdDistrito();
//
//  public void setUbicacionIdDistrito(UbicacionBase ubicacion);

    public UbicacionBase getUbicacionIdBarrio();
//
//  public void setUbicacionIdBarrio(UbicacionBase ubicacion);

    public CondicionPensionBase getCondicionPensionNumeroCondicionPension();
//
//  public void setCondicionPensionNumeroCondicionPension(CondicionPensionBase condicionPension);

}
