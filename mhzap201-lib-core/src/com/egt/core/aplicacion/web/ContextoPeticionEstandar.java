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
package com.egt.core.aplicacion.web;

import com.sun.rave.web.ui.appbase.AbstractPageBean;

public interface ContextoPeticionEstandar {

    /**
     * Getter para propiedad paginaActual.
     * @return Valor de la propiedad paginaActual.
     */
    public AbstractPageBean getPaginaActual();

    /**
     * Setter para propiedad paginaActual.
     * @param paginaActual Nuevo valor de la propiedad paginaActual.
     */
    public void setPaginaActual(AbstractPageBean paginaActual);

    /**
     * Getter para propiedad paginaActual.
     * @return Valor de la propiedad paginaActual.
     */
    public FragmentoFiltroEstandar getFragmentoFiltroActual();

    /**
     * Setter para propiedad paginaActual.
     * @param paginaActual Nuevo valor de la propiedad paginaActual.
     */
    public void setFragmentoFiltroActual(FragmentoFiltroEstandar fragmentoFiltroActual);

    /**
     * Getter para propiedad gestorActual.
     * @return Valor de la propiedad gestorActual.
     */
    public GestorPaginaBasica getGestorActual();

    /**
     * Setter para propiedad gestorActual.
     * @param paginaActual Nuevo valor de la propiedad gestorActual.
     */
    public void setGestorActual(GestorPaginaBasica gestorActual);

    /**
     * Getter para propiedad condicionSesion.
     * @return Valor de la propiedad condicionSesion.
     */
    public Integer getCondicionSesion();

    /**
     * Setter para propiedad condicionSesion.
     * @param condicionSesion Nuevo valor de la propiedad condicionSesion.
     */
    public void setCondicionSesion(Integer condicionSesion);

    /**
     * Getter para propiedad codigoFuncionSelect.
     * @return Valor de la propiedad codigoFuncionSelect.
     */
    public String getCodigoFuncionSelect();

    /**
     * Setter para propiedad codigoFuncionSelect.
     * @param codigoFuncionSelect Nuevo valor de la propiedad codigoFuncionSelect.
     */
    public void setCodigoFuncionSelect(String codigoFuncionSelect);

    /**
     * Getter para propiedad nombreFuncionSelect.
     * @return Valor de la propiedad nombreFuncionSelect.
     */
    public String getNombreFuncionSelect();

    /**
     * Setter para propiedad nombreFuncionSelect.
     * @param nombreFuncionSelect Nuevo valor de la propiedad nombreFuncionSelect.
     */
    public void setNombreFuncionSelect(String nombreFuncionSelect);

    /**
     * Getter para propiedad filtroFuncionSelect.
     * @return Valor de la propiedad filtroFuncionSelect.
     */
    public Long getFiltroFuncionSelect();

    /**
     * Setter para propiedad filtroSelect.
     * @param filtroSelect Nuevo valor de la propiedad filtroSelect.
     */
    public void setFiltroFuncionSelect(Long filtroSelect);

    /**
     * Getter para propiedad identificacionRecurso.
     * @return Valor de la propiedad identificacionRecurso.
     */
    public Long getIdentificacionRecurso();

    /**
     * Setter para propiedad identificacionRecurso.
     * @param identificacionRecurso Nuevo valor de la propiedad identificacionRecurso.
     */
    public void setIdentificacionRecurso(Long identificacionRecurso);

    /**
     * Getter para propiedad identificacionRecursoMaestro.
     * @return Valor de la propiedad identificacionRecursoMaestro.
     */
    public Long getIdentificacionRecursoMaestro();

    /**
     * Setter para propiedad identificacionRecursoMaestro.
     * @param identificacionRecursoMaestro Nuevo valor de la propiedad identificacionRecursoMaestro.
     */
    public void setIdentificacionRecursoMaestro(Long identificacionRecursoMaestro);

    /**
     * Getter para propiedad identificacionRecurso.
     * @return Valor de la propiedad identificacionRecurso.
     */
    public Long getIdentificacionFuncionReferencia();

    /**
     * Setter para propiedad identificacionRecurso.
     * @param identificacionRecurso Nuevo valor de la propiedad identificacionRecurso.
     */
    public void setIdentificacionFuncionReferencia(Long identificacionFuncionReferencia);

    /**
     * Getter para propiedad criteriosBusqueda.
     * @return Valor de la propiedad criteriosBusqueda.
     */
    public String getCriteriosBusqueda();

    /**
     * Setter para propiedad criteriosBusqueda.
     * @param criteriosBusqueda Nuevo valor de la propiedad criteriosBusqueda.
     */
    public void setCriteriosBusqueda(String criteriosBusqueda);
}
