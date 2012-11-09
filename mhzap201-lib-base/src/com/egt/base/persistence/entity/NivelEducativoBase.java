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

public interface NivelEducativoBase {

    public Integer getNumeroNivelEducativo();
//
//  public void setNumeroNivelEducativo(Integer numeroNivelEducativo);

    public String getCodigoNivelEducativo();
//
//  public void setCodigoNivelEducativo(String codigoNivelEducativo);

    public int getPrimerCurso();
//
//  public void setPrimerCurso(int primerCurso);

    public int getUltimoCurso();
//
//  public void setUltimoCurso(int ultimoCurso);

    public Collection<? extends FichaPersonaBase> getFichaPersonaNumeroNivelEduUltCurAprobCollection();
//
//  public void setFichaPersonaNumeroNivelEduUltCurAprobCollection(Collection<? extends FichaPersonaBase> collection);

}
