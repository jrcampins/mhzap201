/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.aplicacion;

import com.egt.core.enums.EnumCriterioOrden;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.lang.StringUtils;

public class OrdenConjuntoResultados {

    public OrdenConjuntoResultados() {
        criterios = new LinkedHashSet<CriterioOrden>();
    }

    private Set<CriterioOrden> criterios;

    private Set<CriterioOrden> getCriterios() {
        return criterios;
    }

    public boolean addCriterio(String columna) {
        return addCriterio(columna, EnumCriterioOrden.ORDEN_ASCENDENTE);
    }

    public boolean addCriterio(String columna, EnumCriterioOrden orden) {
        if (StringUtils.isBlank(columna)) {
            return false;
        }
        CriterioOrden criterio = new CriterioOrden(columna, orden);
        return criterios.add(criterio);
    }

    public void clear() {
        criterios.clear();
    }

    private static final String COMA = ", ";

    @Override
    public String toString() {
        String order = StringUtils.EMPTY;
        String token = StringUtils.EMPTY;
        for (CriterioOrden criterio : criterios) {
            token = criterio.toString();
            order += StringUtils.isBlank(token) ? "" : COMA + token;
        }
        order = StringUtils.removeStart(order, COMA);
        return StringUtils.trimToNull(order);
    }
}
