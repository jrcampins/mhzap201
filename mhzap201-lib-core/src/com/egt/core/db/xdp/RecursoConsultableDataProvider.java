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
package com.egt.core.db.xdp;

import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;

public interface RecursoConsultableDataProvider {

    public long getFuncionConsultarRecurso();

    public void ejecutarFuncionSelect() throws ExcepcionAplicacion;

    public void ejecutarFuncionSelect(long funcion) throws ExcepcionAplicacion;

    public void ejecutarFuncionSelect(Long filtro) throws ExcepcionAplicacion;

    public void ejecutarFuncionSelect(long funcion, Long filtro) throws ExcepcionAplicacion;

    public void ejecutarFuncionSelect(FiltroBusqueda filtro) throws ExcepcionAplicacion;

    public void ejecutarFuncionSelect(long funcion, FiltroBusqueda filtro) throws ExcepcionAplicacion;
}
