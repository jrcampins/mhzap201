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

public interface OpcionMenuBase {

    public Long getIdOpcionMenu();
//
//  public void setIdOpcionMenu(Long idOpcionMenu);

    public long getVersionOpcionMenu();
//
//  public void setVersionOpcionMenu(long versionOpcionMenu);

    public String getCodigoOpcionMenu();
//
//  public void setCodigoOpcionMenu(String codigoOpcionMenu);

    public String getNombreOpcionMenu();
//
//  public void setNombreOpcionMenu(String nombreOpcionMenu);

    public String getDescripcionOpcionMenu();
//
//  public void setDescripcionOpcionMenu(String descripcionOpcionMenu);

    public String getUrlOpcionMenu();
//
//  public void setUrlOpcionMenu(String urlOpcionMenu);

    public Integer getSecuenciaOpcionMenu();
//
//  public void setSecuenciaOpcionMenu(Integer secuenciaOpcionMenu);

    public String getClaveOpcionMenu();
//
//  public void setClaveOpcionMenu(String claveOpcionMenu);

    public int getEsOpcionMenuInactiva();
//
//  public void setEsOpcionMenuInactiva(int esOpcionMenuInactiva);

    public int getEsOpcionMenuSincronizada();
//
//  public void setEsOpcionMenuSincronizada(int esOpcionMenuSincronizada);

    public AplicacionBase getAplicacionIdAplicacion();
//
//  public void setAplicacionIdAplicacion(AplicacionBase aplicacion);

    public PaginaBase getPaginaIdPagina();
//
//  public void setPaginaIdPagina(PaginaBase pagina);

    public OpcionMenuBase getOpcionMenuIdOpcionMenuSuperior();
//
//  public void setOpcionMenuIdOpcionMenuSuperior(OpcionMenuBase opcionMenu);

    public TipoNodoBase getTipoNodoNumeroTipoNodo();
//
//  public void setTipoNodoNumeroTipoNodo(TipoNodoBase tipoNodo);

    public NivelOpcionMenuBase getNivelOpcionMenuNumeroNivelOpcionMenu();
//
//  public void setNivelOpcionMenuNumeroNivelOpcionMenu(NivelOpcionMenuBase nivelOpcionMenu);

    public Collection<? extends OpcionMenuBase> getOpcionMenuIdOpcionMenuSuperiorCollection();
//
//  public void setOpcionMenuIdOpcionMenuSuperiorCollection(Collection<? extends OpcionMenuBase> collection);

}
