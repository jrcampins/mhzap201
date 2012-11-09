/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener cursor informacion.
 *
 */
package com.egt.core.db.util;

import com.egt.core.aplicacion.CriterioBusqueda;
import com.egt.core.aplicacion.CriterioOrden;
import com.egt.core.enums.EnumTipoResultadoSQL;
import java.sql.SQLException;

public interface InterpreteSql {

    public String getLikeSingle();

    public String getLikeString();

    public String getString(Object obj);

    public String getStringDelimitado(Object obj);

    public String getStringCriterioBusqueda(CriterioBusqueda criterio);

    public String getStringCriterioOrden(CriterioOrden criterio);

    public String getComandoSelect(String comando);

    public String getComandoSelect(String comando, int limite);

    public String getComandoExecute(String comando, int argumentos);

    public String getComandoExecute(String comando, int argumentos, EnumTipoResultadoSQL tipoResultado);

    public String getNombreTabla(String tabla);

    public boolean isCommandIgnoredException(SQLException sqle);

    public boolean isNotNullConstraintViolation(SQLException sqle);

    public String getNotNullConstraintViolationColumn(SQLException sqle);

}
