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
import java.util.Date;

public interface RastroFuncionBase {

    public Long getIdRastroFuncion();
//
//  public void setIdRastroFuncion(Long idRastroFuncion);

    public Date getFechaHoraEjecucion();
//
//  public void setFechaHoraEjecucion(Date fechaHoraEjecucion);

    public long getIdUsuario();
//
//  public void setIdUsuario(long idUsuario);

    public Long getIdRecurso();
//
//  public void setIdRecurso(Long idRecurso);

    public Long getVersionRecurso();
//
//  public void setVersionRecurso(Long versionRecurso);

    public String getCodigoRecurso();
//
//  public void setCodigoRecurso(String codigoRecurso);

    public String getNombreRecurso();
//
//  public void setNombreRecurso(String nombreRecurso);

    public Long getIdPropietarioRecurso();
//
//  public void setIdPropietarioRecurso(Long idPropietarioRecurso);

    public Long getIdSegmentoRecurso();
//
//  public void setIdSegmentoRecurso(Long idSegmentoRecurso);

    public Integer getNumeroError();
//
//  public void setNumeroError(Integer numeroError);

    public String getDescripcionError();
//
//  public void setDescripcionError(String descripcionError);

    public FuncionBase getFuncionIdFuncion();
//
//  public void setFuncionIdFuncion(FuncionBase funcion);

    public Collection<? extends RastroFuncionParBase> getRastroFuncionParIdRastroFuncionCollection();
//
//  public void setRastroFuncionParIdRastroFuncionCollection(Collection<? extends RastroFuncionParBase> collection);

}
