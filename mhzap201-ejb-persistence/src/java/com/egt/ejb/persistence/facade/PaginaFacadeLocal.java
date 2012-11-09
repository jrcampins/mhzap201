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
import com.egt.base.persistence.facade.PaginaFacadeBase;
import com.egt.ejb.persistence.entity.Pagina;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PaginaFacadeLocal extends PaginaFacadeBase {

    @Override
    Pagina find(Object id);

    @Override
    Pagina find(Object id, boolean refresh);

    @Override
    Pagina findByCodigo(String codigo);

    @Override
    Pagina findByCodigo(String codigo, boolean refresh);

    @Override
    List<Pagina> findAll();

    @Override
    List<Pagina> findAll(boolean refresh);

    @Override
    List<Pagina> findByQuery(String query);

    @Override
    List<Pagina> findByQuery(String query, boolean refresh);

    @Override
    List<Pagina> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Pagina> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Pagina> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Pagina> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Pagina pagina);

    void persist(Pagina pagina);

    void refresh(Pagina pagina);

    void remove(Pagina pagina);
}
