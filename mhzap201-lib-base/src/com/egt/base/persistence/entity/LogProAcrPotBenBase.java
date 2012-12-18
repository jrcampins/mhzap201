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

import java.math.BigDecimal;
import java.util.Date;

public interface LogProAcrPotBenBase {

    public Long getIdLogProAcrPotBen();
//
//  public void setIdLogProAcrPotBen(Long idLogProAcrPotBen);

    public long getVersionLogProAcrPotBen();
//
//  public void setVersionLogProAcrPotBen(long versionLogProAcrPotBen);

    public String getNombrePotencialBen();
//
//  public void setNombrePotencialBen(String nombrePotencialBen);

    public String getCodigoPotencialBen();
//
//  public void setCodigoPotencialBen(String codigoPotencialBen);

    public Date getFechaRegistroPotBen();
//
//  public void setFechaRegistroPotBen(Date fechaRegistroPotBen);

    public String getNombrePersona();
//
//  public void setNombrePersona(String nombrePersona);

    public String getCodigoPersona();
//
//  public void setCodigoPersona(String codigoPersona);

    public String getCodigoFichaPersona();
//
//  public void setCodigoFichaPersona(String codigoFichaPersona);

    public String getNombreFichaPersona();
//
//  public void setNombreFichaPersona(String nombreFichaPersona);

    public String getCodigoFichaHogar();
//
//  public void setCodigoFichaHogar(String codigoFichaHogar);

    public BigDecimal getIndiceCalidadVida();
//
//  public void setIndiceCalidadVida(BigDecimal indiceCalidadVida);

    public int getEsProcesado();
//
//  public void setEsProcesado(int esProcesado);

    public String getObservacion();
//
//  public void setObservacion(String observacion);

    public Date getFechaHoraTransaccion();
//
//  public void setFechaHoraTransaccion(Date fechaHoraTransaccion);

    public PotencialBenBase getPotencialBenIdPotencialBen();
//
//  public void setPotencialBenIdPotencialBen(PotencialBenBase potencialBen);

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

    public FichaPersonaBase getFichaPersonaIdFichaPersona();
//
//  public void setFichaPersonaIdFichaPersona(FichaPersonaBase fichaPersona);

    public FichaHogarBase getFichaHogarIdFichaHogar();
//
//  public void setFichaHogarIdFichaHogar(FichaHogarBase fichaHogar);

}
