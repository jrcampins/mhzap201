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

public interface FuncionBase {

    public Long getIdFuncion();
//
//  public void setIdFuncion(Long idFuncion);

    public long getVersionFuncion();
//
//  public void setVersionFuncion(long versionFuncion);

    public String getCodigoFuncion();
//
//  public void setCodigoFuncion(String codigoFuncion);

    public String getNombreFuncion();
//
//  public void setNombreFuncion(String nombreFuncion);

    public String getDescripcionFuncion();
//
//  public void setDescripcionFuncion(String descripcionFuncion);

    public String getClausulaWhere();
//
//  public void setClausulaWhere(String clausulaWhere);

    public String getClausulaOrder();
//
//  public void setClausulaOrder(String clausulaOrder);

    public int getEsPublica();
//
//  public void setEsPublica(int esPublica);

    public int getEsProgramatica();
//
//  public void setEsProgramatica(int esProgramatica);

    public int getEsPersonalizada();
//
//  public void setEsPersonalizada(int esPersonalizada);

    public int getEsSegmentada();
//
//  public void setEsSegmentada(int esSegmentada);

    public TipoFuncionBase getTipoFuncionNumeroTipoFuncion();
//
//  public void setTipoFuncionNumeroTipoFuncion(TipoFuncionBase tipoFuncion);

    public TipoRastroFunBase getTipoRastroFunNumeroTipoRastroFun();
//
//  public void setTipoRastroFunNumeroTipoRastroFun(TipoRastroFunBase tipoRastroFun);

    public DominioBase getDominioIdDominio();
//
//  public void setDominioIdDominio(DominioBase dominio);

    public GrupoProcesoBase getGrupoProcesoIdGrupoProceso();
//
//  public void setGrupoProcesoIdGrupoProceso(GrupoProcesoBase grupoProceso);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdFuncionSeleccionCollection();
//
//  public void setClaseRecursoIdFuncionSeleccionCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParIdFuncionReferenciaCollection();
//
//  public void setClaseRecursoParIdFuncionReferenciaCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends DominioBase> getDominioIdFuncionSeleccionCollection();
//
//  public void setDominioIdFuncionSeleccionCollection(Collection<? extends DominioBase> collection);

    public Collection<? extends FiltroClaRecFunBase> getFiltroClaRecFunIdFuncionCollection();
//
//  public void setFiltroClaRecFunIdFuncionCollection(Collection<? extends FiltroClaRecFunBase> collection);

    public Collection<? extends FiltroFuncionBase> getFiltroFuncionIdFuncionCollection();
//
//  public void setFiltroFuncionIdFuncionCollection(Collection<? extends FiltroFuncionBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroIdFuncionCollection();
//
//  public void setFuncionParametroIdFuncionCollection(Collection<? extends FuncionParametroBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroIdFuncionReferenciaCollection();
//
//  public void setFuncionParametroIdFuncionReferenciaCollection(Collection<? extends FuncionParametroBase> collection);

    public Collection<? extends PaginaFuncionBase> getPaginaFuncionIdFuncionCollection();
//
//  public void setPaginaFuncionIdFuncionCollection(Collection<? extends PaginaFuncionBase> collection);

    public Collection<? extends RastroFuncionBase> getRastroFuncionIdFuncionCollection();
//
//  public void setRastroFuncionIdFuncionCollection(Collection<? extends RastroFuncionBase> collection);

    public Collection<? extends RastroInformeBase> getRastroInformeIdFuncionCollection();
//
//  public void setRastroInformeIdFuncionCollection(Collection<? extends RastroInformeBase> collection);

    public Collection<? extends RastroProcesoBase> getRastroProcesoIdFuncionCollection();
//
//  public void setRastroProcesoIdFuncionCollection(Collection<? extends RastroProcesoBase> collection);

    public Collection<? extends RolFuncionBase> getRolFuncionIdFuncionCollection();
//
//  public void setRolFuncionIdFuncionCollection(Collection<? extends RolFuncionBase> collection);

}
