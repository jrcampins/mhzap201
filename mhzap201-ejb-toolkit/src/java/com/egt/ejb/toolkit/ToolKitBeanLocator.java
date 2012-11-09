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

import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.facade.DominioFacadeLocal;
import com.egt.ejb.persistence.facade.catalog.SystemTableFacadeLocal;

public class ToolKitBeanLocator {

    public ToolKitBeanLocator() {
        dominioFacade = null;
        systemTableFacade = null;
        sqlAgent = null;
    }

    private DominioFacadeLocal dominioFacade;

    public DominioFacadeLocal getDominioFacade() {
        return dominioFacade;
    }

    public void setDominioFacade(DominioFacadeLocal dominioFacade) {
        this.dominioFacade = dominioFacade;
    }

    private SystemTableFacadeLocal systemTableFacade;

    public SystemTableFacadeLocal getSystemTableFacade() {
        return systemTableFacade;
    }

    public void setSystemTableFacade(SystemTableFacadeLocal systemTableFacade) {
        this.systemTableFacade = systemTableFacade;
    }

    private SqlAgentBrokerLocal sqlAgent;

    public SqlAgentBrokerLocal getSqlAgent() {
        return sqlAgent;
    }

    public void setSqlAgent(SqlAgentBrokerLocal sqlAgent) {
        this.sqlAgent = sqlAgent;
    }
}
