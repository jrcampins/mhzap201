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
import com.egt.base.persistence.facade.RastroInformeFacadeBase;
import com.egt.ejb.persistence.entity.RastroInforme;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RastroInformeFacadeLocal extends RastroInformeFacadeBase {

    @Override
    RastroInforme find(Object id);

    @Override
    RastroInforme find(Object id, boolean refresh);

    @Override
    List<RastroInforme> findAll();

    @Override
    List<RastroInforme> findAll(boolean refresh);

    @Override
    List<RastroInforme> findByQuery(String query);

    @Override
    List<RastroInforme> findByQuery(String query, boolean refresh);

    @Override
    List<RastroInforme> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RastroInforme> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RastroInforme> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RastroInforme> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RastroInforme rastroInforme);

    void persist(RastroInforme rastroInforme);

    void refresh(RastroInforme rastroInforme);

    void remove(RastroInforme rastroInforme);
}
