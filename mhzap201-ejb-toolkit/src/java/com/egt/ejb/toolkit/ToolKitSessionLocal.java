/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.toolkit;

import com.egt.ejb.persistence.entity.Aplicacion;
import com.egt.ejb.persistence.entity.Dominio;
import com.egt.ejb.persistence.entity.Funcion;
import com.egt.ejb.persistence.entity.Pagina;
import com.egt.ejb.persistence.entity.catalog.SystemTable;
import java.util.List;
import javax.ejb.Local;
import javax.jms.JMSException;

@Local
public interface ToolKitSessionLocal {

    public void generar(ToolKitMessage message);

    public void generarEntityClass();

    public void generarEntityClass(Integer id) throws Exception;

    public void generarEntityClass(List<SystemTable> systemTables) throws Exception;

    public void generarEntityClass(SystemTable systemTable) throws Exception;

    public void generarFacade();

    public void generarFacade(Integer id) throws Exception;

    public void generarFacade(List<SystemTable> systemTables) throws Exception;

    public void generarFacade(SystemTable systemTable) throws Exception;

    public void generarURX();

    public void generarURX(List<Aplicacion> aplicaciones) throws Exception;

    public void generarMenu(ToolKitMessage message);

    public void generarBundles();

    public void generarEntityConstants();

    public void generarEntityConstants(Long id) throws Exception;

    public void generarEntityConstants(List<Dominio> dominios) throws Exception;

    public void generarEntityConstants(Dominio dominio) throws Exception;

    public void generarJasperReport();

    public void generarJasperReport(Long id) throws Exception;

    public void generarJasperReport(List<Dominio> dominios) throws Exception;

    public void generarJasperReport(Dominio dominio) throws Exception;

    public void generarJasperViews();

    public void generarJasperViews(List<Dominio> dominios) throws Exception;

    public void generarWebViews();

    public void generarWebViews(List<Dominio> dominios) throws Exception;

    public void generarBusinessMessage();

    public void generarBusinessMessage(Long id) throws Exception;

    public void generarBusinessMessage(List<Funcion> funciones) throws Exception;

    public void generarBusinessMessage(Funcion funcion) throws Exception;

    public void generarBusinessProcess();

    public void generarBusinessProcess(Long id) throws Exception;

    public void generarBusinessProcess(List<Dominio> dominios) throws Exception;

    public void generarBusinessProcess(Dominio dominio) throws Exception;

    public void generarPlantilla();

    public void generarPlantilla(Long id) throws Exception;

    public void generarPlantilla(List<Aplicacion> aplicaciones) throws Exception;

    public void generarPlantilla(Aplicacion aplicacion) throws Exception;

    public void generarAplicaciones(ToolKitMessage root) throws JMSException;

    public void generarAplicacionesEspecificas(ToolKitMessage root) throws JMSException;

    public void generarAplicacion();

    public void generarAplicacion(Long id) throws Exception;

    public void generarAplicacion(List<Aplicacion> aplicaciones) throws Exception;

    public void generarAplicacion(Aplicacion aplicacion) throws Exception;

    public void generarPagina();

    public void generarPagina(Long id) throws Exception;

    public void generarPagina(List<Pagina> paginas) throws Exception;

    public void generarPagina(Pagina pagina) throws Exception;
}
