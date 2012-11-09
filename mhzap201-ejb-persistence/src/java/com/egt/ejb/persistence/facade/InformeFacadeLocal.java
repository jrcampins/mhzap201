/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.base.persistence.facade.InformeFacadeBase;
import com.egt.ejb.persistence.entity.Informe;
import java.util.List;
import javax.ejb.Local;

@Local
public interface InformeFacadeLocal extends InformeFacadeBase {

    @Override
    Informe find(Object id);

    @Override
    Informe find(Object id, boolean refresh);

    @Override
    List<Informe> findAll();

    @Override
    List<Informe> findAll(boolean refresh);

    @Override
    List<Informe> findByQuery(String query);

    @Override
    List<Informe> findByQuery(String query, boolean refresh);

    @Override
    List<Informe> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Informe> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Informe> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Informe> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Informe informe);

    void persist(Informe informe);

    void refresh(Informe informe);

    void remove(Informe informe);
}
