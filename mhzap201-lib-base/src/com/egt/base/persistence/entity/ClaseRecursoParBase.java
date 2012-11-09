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

public interface ClaseRecursoParBase {

    public Long getIdClaseRecursoPar();
//
//  public void setIdClaseRecursoPar(Long idClaseRecursoPar);

    public long getVersionClaseRecursoPar();
//
//  public void setVersionClaseRecursoPar(long versionClaseRecursoPar);

    public Long getIdListaValor();
//
//  public void setIdListaValor(Long idListaValor);

    public Long getIdClaseObjetoValor();
//
//  public void setIdClaseObjetoValor(Long idClaseObjetoValor);

    public String getValorMinimo();
//
//  public void setValorMinimo(String valorMinimo);

    public String getValorMaximo();
//
//  public void setValorMaximo(String valorMaximo);

    public String getValorOmision();
//
//  public void setValorOmision(String valorOmision);

    public int getEsParametroOmisible();
//
//  public void setEsParametroOmisible(int esParametroOmisible);

    public int getEsParametroInmutable();
//
//  public void setEsParametroInmutable(int esParametroInmutable);

    public int getEsParametroSubmit();
//
//  public void setEsParametroSubmit(int esParametroSubmit);

    public int getEsParametroPrimordial();
//
//  public void setEsParametroPrimordial(int esParametroPrimordial);

    public int getEsParametroMaestro();
//
//  public void setEsParametroMaestro(int esParametroMaestro);

    public int getEsParametroSegmento();
//
//  public void setEsParametroSegmento(int esParametroSegmento);

    public int getEsParametroSinRastro();
//
//  public void setEsParametroSinRastro(int esParametroSinRastro);

    public int getEsParametroSincronizado();
//
//  public void setEsParametroSincronizado(int esParametroSincronizado);

    public int getOrdenPresentacion();
//
//  public void setOrdenPresentacion(int ordenPresentacion);

    public int getEsReferenciaAlternativa();
//
//  public void setEsReferenciaAlternativa(int esReferenciaAlternativa);

    public Long getIdFuncionReferenciaAlt();
//
//  public void setIdFuncionReferenciaAlt(Long idFuncionReferenciaAlt);

    public Long getIdListaValorAlternativa();
//
//  public void setIdListaValorAlternativa(Long idListaValorAlternativa);

    public Long getIdClaseObjetoValorAlt();
//
//  public void setIdClaseObjetoValorAlt(Long idClaseObjetoValorAlt);

    public Long getIdClaseRecursoValorAlt();
//
//  public void setIdClaseRecursoValorAlt(Long idClaseRecursoValorAlt);

    public int getOrdenPaginaSeleccion();
//
//  public void setOrdenPaginaSeleccion(int ordenPaginaSeleccion);

    public ClaseRecursoBase getClaseRecursoIdClaseRecurso();
//
//  public void setClaseRecursoIdClaseRecurso(ClaseRecursoBase claseRecurso);

    public ParametroBase getParametroIdParametro();
//
//  public void setParametroIdParametro(ParametroBase parametro);

    public TipoParametroBase getTipoParametroNumeroTipoParametro();
//
//  public void setTipoParametroNumeroTipoParametro(TipoParametroBase tipoParametro);

    public TipoComparacionBase getTipoComparacionNumeroTipoComparacion();
//
//  public void setTipoComparacionNumeroTipoComparacion(TipoComparacionBase tipoComparacion);

    public FuncionBase getFuncionIdFuncionReferencia();
//
//  public void setFuncionIdFuncionReferencia(FuncionBase funcion);

    public TipoValorBase getTipoValorNumeroTipoValor();
//
//  public void setTipoValorNumeroTipoValor(TipoValorBase tipoValor);

    public ClaseRecursoBase getClaseRecursoIdClaseRecursoValor();
//
//  public void setClaseRecursoIdClaseRecursoValor(ClaseRecursoBase claseRecurso);

    public ClaseRecursoSecBase getClaseRecursoSecIdClaseRecursoSec();
//
//  public void setClaseRecursoSecIdClaseRecursoSec(ClaseRecursoSecBase claseRecursoSec);

    public TipoValorBase getTipoValorNumeroTipoValorAlternativo();
//
//  public void setTipoValorNumeroTipoValorAlternativo(TipoValorBase tipoValor);

    public Collection<? extends FiltroClaRecFunBase> getFiltroClaRecFunIdClaseRecursoParColumnaCollection();
//
//  public void setFiltroClaRecFunIdClaseRecursoParColumnaCollection(Collection<? extends FiltroClaRecFunBase> collection);

    public Collection<? extends FiltroClaRecFunBase> getFiltroClaRecFunIdClaseRecursoParValorCollection();
//
//  public void setFiltroClaRecFunIdClaseRecursoParValorCollection(Collection<? extends FiltroClaRecFunBase> collection);

    public Collection<? extends FiltroClaRecParBase> getFiltroClaRecParIdClaseRecursoParCollection();
//
//  public void setFiltroClaRecParIdClaseRecursoParCollection(Collection<? extends FiltroClaRecParBase> collection);

    public Collection<? extends FiltroClaRecParBase> getFiltroClaRecParIdClaseRecursoParColumnaCollection();
//
//  public void setFiltroClaRecParIdClaseRecursoParColumnaCollection(Collection<? extends FiltroClaRecParBase> collection);

    public Collection<? extends FiltroClaRecParBase> getFiltroClaRecParIdClaseRecursoParValorCollection();
//
//  public void setFiltroClaRecParIdClaseRecursoParValorCollection(Collection<? extends FiltroClaRecParBase> collection);

    public Collection<? extends FiltroClaRecSecBase> getFiltroClaRecSecIdClaseRecursoParColumnaCollection();
//
//  public void setFiltroClaRecSecIdClaseRecursoParColumnaCollection(Collection<? extends FiltroClaRecSecBase> collection);

    public Collection<? extends FiltroClaRecSecBase> getFiltroClaRecSecIdClaseRecursoParValorCollection();
//
//  public void setFiltroClaRecSecIdClaseRecursoParValorCollection(Collection<? extends FiltroClaRecSecBase> collection);

    public Collection<? extends FiltroClaRecVinBase> getFiltroClaRecVinIdClaseRecursoParCollection();
//
//  public void setFiltroClaRecVinIdClaseRecursoParCollection(Collection<? extends FiltroClaRecVinBase> collection);

    public Collection<? extends FiltroClaRecVinBase> getFiltroClaRecVinIdClaseRecursoParColumnaCollection();
//
//  public void setFiltroClaRecVinIdClaseRecursoParColumnaCollection(Collection<? extends FiltroClaRecVinBase> collection);

    public Collection<? extends FiltroClaRecVinBase> getFiltroClaRecVinIdClaseRecursoParValorCollection();
//
//  public void setFiltroClaRecVinIdClaseRecursoParValorCollection(Collection<? extends FiltroClaRecVinBase> collection);

}
