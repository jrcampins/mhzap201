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

import javax.ejb.Local;
import javax.jms.ObjectMessage;

@Local
public interface ToolKitBrokerLocal {

    public ObjectMessage generar();

    public ObjectMessage generarEntityClass();

    public ObjectMessage generarFacade();

    public ObjectMessage generarURX();

    public ObjectMessage generarMenu();

    public ObjectMessage generarBundles();

    public ObjectMessage generarEntityConstants();

    public ObjectMessage generarJasperReport();

    public ObjectMessage generarJasperViews();

    public ObjectMessage generarBusinessMessage();

    public ObjectMessage generarBusinessProcess();

    public ObjectMessage generarPlantillas();

    public ObjectMessage generarAplicaciones();

    public ObjectMessage generarAplicacionesEspecificas();

    public ObjectMessage generarWebViews();

    public ToolKitMessage processToolKitMessage(ToolKitMessage toolKitMessage);
}
