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

public interface FuncionarioBase {

    public Long getIdFuncionario();
//
//  public void setIdFuncionario(Long idFuncionario);

    public long getVersionFuncionario();
//
//  public void setVersionFuncionario(long versionFuncionario);

    public String getCodigoFuncionario();
//
//  public void setCodigoFuncionario(String codigoFuncionario);

    public String getNombreFuncionario();
//
//  public void setNombreFuncionario(String nombreFuncionario);

    public Integer getNumeroCedula();
//
//  public void setNumeroCedula(Integer numeroCedula);

    public String getLetraCedula();
//
//  public void setLetraCedula(String letraCedula);

    public String getPrimerNombre();
//
//  public void setPrimerNombre(String primerNombre);

    public String getSegundoNombre();
//
//  public void setSegundoNombre(String segundoNombre);

    public String getPrimerApellido();
//
//  public void setPrimerApellido(String primerApellido);

    public String getSegundoApellido();
//
//  public void setSegundoApellido(String segundoApellido);

    public String getApellidoCasada();
//
//  public void setApellidoCasada(String apellidoCasada);

    public Collection<? extends FichaHogarBase> getFichaHogarIdFuncionarioCensistaCollection();
//
//  public void setFichaHogarIdFuncionarioCensistaCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdFuncionarioSupervisorCollection();
//
//  public void setFichaHogarIdFuncionarioSupervisorCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdFuncionarioCriticoDecoCollection();
//
//  public void setFichaHogarIdFuncionarioCriticoDecoCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends FichaHogarBase> getFichaHogarIdFuncionarioDigitadorCollection();
//
//  public void setFichaHogarIdFuncionarioDigitadorCollection(Collection<? extends FichaHogarBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdFuncionarioValidacionCenCollection();
//
//  public void setPotencialBenIdFuncionarioValidacionCenCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends PotencialBenBase> getPotencialBenIdFuncionarioUltVisitaCenCollection();
//
//  public void setPotencialBenIdFuncionarioUltVisitaCenCollection(Collection<? extends PotencialBenBase> collection);

    public Collection<? extends VisitaCensoBase> getVisitaCensoIdFuncionarioCensistaCollection();
//
//  public void setVisitaCensoIdFuncionarioCensistaCollection(Collection<? extends VisitaCensoBase> collection);

}
