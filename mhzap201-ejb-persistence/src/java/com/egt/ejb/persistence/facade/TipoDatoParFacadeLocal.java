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
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.persistence.facade.TipoDatoParFacadeBase;
import com.egt.ejb.persistence.entity.TipoDatoPar;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoDatoParFacadeLocal extends TipoDatoParFacadeBase {

    @Override
    TipoDatoPar find(Object id);

    @Override
    TipoDatoPar find(Object id, boolean refresh);

    @Override
    TipoDatoPar findByCodigo(String codigo);

    @Override
    TipoDatoPar findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoDatoPar> findAll();

    @Override
    List<TipoDatoPar> findAll(boolean refresh);

    @Override
    List<TipoDatoPar> findByQuery(String query);

    @Override
    List<TipoDatoPar> findByQuery(String query, boolean refresh);

    @Override
    List<TipoDatoPar> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoDatoPar> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoDatoPar> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoDatoPar> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoDatoPar tipoDatoPar);

    void persist(TipoDatoPar tipoDatoPar);

    void refresh(TipoDatoPar tipoDatoPar);

    void remove(TipoDatoPar tipoDatoPar);
}
