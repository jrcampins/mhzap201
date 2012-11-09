/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.persistence.entity;


public interface FiltroClaRecVinBase {

    public Long getIdFiltroClaRecVin();
//
//  public void setIdFiltroClaRecVin(Long idFiltroClaRecVin);

    public long getVersionFiltroClaRecVin();
//
//  public void setVersionFiltroClaRecVin(long versionFiltroClaRecVin);

    public String getValor();
//
//  public void setValor(String valor);

    public ClaseRecursoParBase getClaseRecursoParIdClaseRecursoPar();
//
//  public void setClaseRecursoParIdClaseRecursoPar(ClaseRecursoParBase claseRecursoPar);

    public ClaseRecursoParBase getClaseRecursoParIdClaseRecursoParColumna();
//
//  public void setClaseRecursoParIdClaseRecursoParColumna(ClaseRecursoParBase claseRecursoPar);

    public OperadorComBase getOperadorComNumeroOperadorCom();
//
//  public void setOperadorComNumeroOperadorCom(OperadorComBase operadorCom);

    public ClaseRecursoParBase getClaseRecursoParIdClaseRecursoParValor();
//
//  public void setClaseRecursoParIdClaseRecursoParValor(ClaseRecursoParBase claseRecursoPar);

}
