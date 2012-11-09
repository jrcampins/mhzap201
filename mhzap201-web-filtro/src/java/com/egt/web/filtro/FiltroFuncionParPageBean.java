/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.web.filtro;

import com.egt.base.persistence.facade.FuncionFacadeBase;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider;
import com.egt.data.general.xdp2.FiltroFuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.FiltroFuncionParCachedRowSetDataProvider3;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.TextField;

public interface FiltroFuncionParPageBean extends PaginaActualizacion {

    FiltroFuncionParCachedRowSetDataProvider3 getFiltroFuncionParDataProvider();

    FiltroFuncionCachedRowSetDataProvider2 getFiltroFuncionDataProvider();

    ListaRecursoCachedRowSetDataProvider getRecursoValorDataProvider();

    FuncionFacadeBase getFuncionFacade();

    TextField getTextoCodigoObjeto1();

    TextField getTextoCodigoRecurso1();

    Button getBotonAplicar1();
}
