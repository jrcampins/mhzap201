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

import java.util.Collection;

public interface DominioBase {

    public Long getIdDominio();
//
//  public void setIdDominio(Long idDominio);

    public long getVersionDominio();
//
//  public void setVersionDominio(long versionDominio);

    public String getCodigoDominio();
//
//  public void setCodigoDominio(String codigoDominio);

    public String getNombreDominio();
//
//  public void setNombreDominio(String nombreDominio);

    public String getDescripcionDominio();
//
//  public void setDescripcionDominio(String descripcionDominio);

    public String getNombreTabla();
//
//  public void setNombreTabla(String nombreTabla);

    public TipoDominioBase getTipoDominioNumeroTipoDominio();
//
//  public void setTipoDominioNumeroTipoDominio(TipoDominioBase tipoDominio);

    public ClaseRecursoBase getClaseRecursoIdClaseRecurso();
//
//  public void setClaseRecursoIdClaseRecurso(ClaseRecursoBase claseRecurso);

    public FuncionBase getFuncionIdFuncionSeleccion();
//
//  public void setFuncionIdFuncionSeleccion(FuncionBase funcion);

    public DominioBase getDominioIdDominioSegmento();
//
//  public void setDominioIdDominioSegmento(DominioBase dominio);

    public PaqueteBase getPaqueteIdPaquete();
//
//  public void setPaqueteIdPaquete(PaqueteBase paquete);

    public Collection<? extends DominioBase> getDominioIdDominioSegmentoCollection();
//
//  public void setDominioIdDominioSegmentoCollection(Collection<? extends DominioBase> collection);

    public Collection<? extends DominioPaqueteBase> getDominioPaqueteIdDominioCollection();
//
//  public void setDominioPaqueteIdDominioCollection(Collection<? extends DominioPaqueteBase> collection);

    public Collection<? extends DominioParametroBase> getDominioParametroIdDominioCollection();
//
//  public void setDominioParametroIdDominioCollection(Collection<? extends DominioParametroBase> collection);

    public Collection<? extends FuncionBase> getFuncionIdDominioCollection();
//
//  public void setFuncionIdDominioCollection(Collection<? extends FuncionBase> collection);

    public Collection<? extends PaginaBase> getPaginaIdDominioCollection();
//
//  public void setPaginaIdDominioCollection(Collection<? extends PaginaBase> collection);

    public Collection<? extends PaginaBase> getPaginaIdDominioMaestroCollection();
//
//  public void setPaginaIdDominioMaestroCollection(Collection<? extends PaginaBase> collection);

}
