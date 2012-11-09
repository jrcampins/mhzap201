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
import com.egt.base.persistence.facade.OperadorComFacadeBase;
import com.egt.ejb.persistence.entity.OperadorCom;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OperadorComFacadeLocal extends OperadorComFacadeBase {

    @Override
    OperadorCom find(Object id);

    @Override
    OperadorCom find(Object id, boolean refresh);

    @Override
    OperadorCom findByCodigo(String codigo);

    @Override
    OperadorCom findByCodigo(String codigo, boolean refresh);

    @Override
    List<OperadorCom> findAll();

    @Override
    List<OperadorCom> findAll(boolean refresh);

    @Override
    List<OperadorCom> findByQuery(String query);

    @Override
    List<OperadorCom> findByQuery(String query, boolean refresh);

    @Override
    List<OperadorCom> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<OperadorCom> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<OperadorCom> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<OperadorCom> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(OperadorCom operadorCom);

    void persist(OperadorCom operadorCom);

    void refresh(OperadorCom operadorCom);

    void remove(OperadorCom operadorCom);
}
