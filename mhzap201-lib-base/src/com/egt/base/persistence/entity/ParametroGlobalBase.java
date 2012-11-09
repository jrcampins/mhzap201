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

public interface ParametroGlobalBase {

    public Integer getNumeroParametroGlobal();
//
//  public void setNumeroParametroGlobal(Integer numeroParametroGlobal);

    public String getCodigoParametroGlobal();
//
//  public void setCodigoParametroGlobal(String codigoParametroGlobal);

    public BigDecimal getMontoSalarioMinimo();
//
//  public void setMontoSalarioMinimo(BigDecimal montoSalarioMinimo);

    public BigDecimal getPorcentajePensionAlimentaria();
//
//  public void setPorcentajePensionAlimentaria(BigDecimal porcentajePensionAlimentaria);

    public int getEsControlCerVidaActivo();
//
//  public void setEsControlCerVidaActivo(int esControlCerVidaActivo);

    public int getMesesValidezCertificadoVida();
//
//  public void setMesesValidezCertificadoVida(int mesesValidezCertificadoVida);

    public int getEsControlCobroPensionActiv();
//
//  public void setEsControlCobroPensionActiv(int esControlCobroPensionActiv);

    public int getMesesUltimoCobroPension();
//
//  public void setMesesUltimoCobroPension(int mesesUltimoCobroPension);

    public int getEsControlReprocesoPenActiv();
//
//  public void setEsControlReprocesoPenActiv(int esControlReprocesoPenActiv);

    public BigDecimal getLimiteIndiceCalidadVida();
//
//  public void setLimiteIndiceCalidadVida(BigDecimal limiteIndiceCalidadVida);

    public int getLimitePensiones();
//
//  public void setLimitePensiones(int limitePensiones);

}
