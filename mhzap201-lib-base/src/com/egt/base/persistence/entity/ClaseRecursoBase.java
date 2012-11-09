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

public interface ClaseRecursoBase {

    public Long getIdClaseRecurso();
//
//  public void setIdClaseRecurso(Long idClaseRecurso);

    public long getVersionClaseRecurso();
//
//  public void setVersionClaseRecurso(long versionClaseRecurso);

    public String getCodigoClaseRecurso();
//
//  public void setCodigoClaseRecurso(String codigoClaseRecurso);

    public String getNombreClaseRecurso();
//
//  public void setNombreClaseRecurso(String nombreClaseRecurso);

    public String getDescripcionClaseRecurso();
//
//  public void setDescripcionClaseRecurso(String descripcionClaseRecurso);

    public int getEsClaseRecursoIndependiente();
//
//  public void setEsClaseRecursoIndependiente(int esClaseRecursoIndependiente);

    public int getEsClaseRecursoSinDetalle();
//
//  public void setEsClaseRecursoSinDetalle(int esClaseRecursoSinDetalle);

    public int getEsClaseRecursoConArbol();
//
//  public void setEsClaseRecursoConArbol(int esClaseRecursoConArbol);

    public Long getIdAplicacionWeb();
//
//  public void setIdAplicacionWeb(Long idAplicacionWeb);

    public Integer getLimiteFilasConsulta();
//
//  public void setLimiteFilasConsulta(Integer limiteFilasConsulta);

    public Integer getLimiteFilasInforme();
//
//  public void setLimiteFilasInforme(Integer limiteFilasInforme);

    public Integer getOrdenPresentacion();
//
//  public void setOrdenPresentacion(Integer ordenPresentacion);

    public int getEsClaseRecursoInsertable();
//
//  public void setEsClaseRecursoInsertable(int esClaseRecursoInsertable);

    public int getEsClaseRecursoModificable();
//
//  public void setEsClaseRecursoModificable(int esClaseRecursoModificable);

    public int getEsClaseRecursoEliminable();
//
//  public void setEsClaseRecursoEliminable(int esClaseRecursoEliminable);

    public int getEsClaseRecursoExtendida();
//
//  public void setEsClaseRecursoExtendida(int esClaseRecursoExtendida);

    public String getEtiquetaHipervinculo();
//
//  public void setEtiquetaHipervinculo(String etiquetaHipervinculo);

    public int getEsEnumeradorConNumero();
//
//  public void setEsEnumeradorConNumero(int esEnumeradorConNumero);

    public String getAliasClaseRecurso();
//
//  public void setAliasClaseRecurso(String aliasClaseRecurso);

    public TipoClaseRecursoBase getTipoClaseRecursoNumeroTipoClaseRecurso();
//
//  public void setTipoClaseRecursoNumeroTipoClaseRecurso(TipoClaseRecursoBase tipoClaseRecurso);

    public TipoRecursoBase getTipoRecursoNumeroTipoRecurso();
//
//  public void setTipoRecursoNumeroTipoRecurso(TipoRecursoBase tipoRecurso);

    public FuncionBase getFuncionIdFuncionSeleccion();
//
//  public void setFuncionIdFuncionSeleccion(FuncionBase funcion);

    public PaginaBase getPaginaIdPaginaSeleccion();
//
//  public void setPaginaIdPaginaSeleccion(PaginaBase pagina);

    public PaginaBase getPaginaIdPaginaDetalle();
//
//  public void setPaginaIdPaginaDetalle(PaginaBase pagina);

    public ClaseRecursoBase getClaseRecursoIdClaseRecursoMaestro();
//
//  public void setClaseRecursoIdClaseRecursoMaestro(ClaseRecursoBase claseRecurso);

    public ClaseRecursoBase getClaseRecursoIdClaseRecursoSegmento();
//
//  public void setClaseRecursoIdClaseRecursoSegmento(ClaseRecursoBase claseRecurso);

    public ClaseRecursoBase getClaseRecursoIdClaseRecursoBase();
//
//  public void setClaseRecursoIdClaseRecursoBase(ClaseRecursoBase claseRecurso);

    public GrupoAplicacionBase getGrupoAplicacionIdGrupoAplicacion();
//
//  public void setGrupoAplicacionIdGrupoAplicacion(GrupoAplicacionBase grupoAplicacion);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdClaseRecursoMaestroCollection();
//
//  public void setClaseRecursoIdClaseRecursoMaestroCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdClaseRecursoSegmentoCollection();
//
//  public void setClaseRecursoIdClaseRecursoSegmentoCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends ClaseRecursoBase> getClaseRecursoIdClaseRecursoBaseCollection();
//
//  public void setClaseRecursoIdClaseRecursoBaseCollection(Collection<? extends ClaseRecursoBase> collection);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParIdClaseRecursoCollection();
//
//  public void setClaseRecursoParIdClaseRecursoCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends ClaseRecursoParBase> getClaseRecursoParIdClaseRecursoValorCollection();
//
//  public void setClaseRecursoParIdClaseRecursoValorCollection(Collection<? extends ClaseRecursoParBase> collection);

    public Collection<? extends ClaseRecursoSecBase> getClaseRecursoSecIdClaseRecursoCollection();
//
//  public void setClaseRecursoSecIdClaseRecursoCollection(Collection<? extends ClaseRecursoSecBase> collection);

    public Collection<? extends ConjuntoSegmentoBase> getConjuntoSegmentoIdClaseRecursoCollection();
//
//  public void setConjuntoSegmentoIdClaseRecursoCollection(Collection<? extends ConjuntoSegmentoBase> collection);

    public Collection<? extends DominioBase> getDominioIdClaseRecursoCollection();
//
//  public void setDominioIdClaseRecursoCollection(Collection<? extends DominioBase> collection);

    public Collection<? extends FuncionParametroBase> getFuncionParametroIdClaseRecursoValorCollection();
//
//  public void setFuncionParametroIdClaseRecursoValorCollection(Collection<? extends FuncionParametroBase> collection);

}
