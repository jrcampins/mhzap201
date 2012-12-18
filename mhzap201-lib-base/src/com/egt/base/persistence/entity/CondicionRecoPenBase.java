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

public interface CondicionRecoPenBase {

    public Integer getNumeroCondicionRecoPen();
//
//  public void setNumeroCondicionRecoPen(Integer numeroCondicionRecoPen);

    public String getCodigoCondicionRecoPen();
//
//  public void setCodigoCondicionRecoPen(String codigoCondicionRecoPen);

    public Collection<? extends LogProPreProPagBase> getLogProPreProPagNumeroCondicionRecoPenCollection();
//
//  public void setLogProPreProPagNumeroCondicionRecoPenCollection(Collection<? extends LogProPreProPagBase> collection);

    public Collection<? extends LogProVerElePenBase> getLogProVerElePenNumeroCondicionRecoPenCollection();
//
//  public void setLogProVerElePenNumeroCondicionRecoPenCollection(Collection<? extends LogProVerElePenBase> collection);

    public Collection<? extends PersonaBase> getPersonaNumeroCondicionRecoPenCollection();
//
//  public void setPersonaNumeroCondicionRecoPenCollection(Collection<? extends PersonaBase> collection);

}
