/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.fija;

import com.egt.data.specific.xdp2.ParametroGlobalCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionParametroGlobal extends PaginaActualizacion {

    TextField getCampoNumeroParametroGlobal1();

    TextField getCampoMontoSalarioMinimo1();

    TextField getCampoPorcentajePensionAlimentaria1();

    DropDown getListaEsControlCerVidaActivo1();

    TextField getCampoMesesValidezCertificadoVida1();

    DropDown getListaEsControlCobroPensionActiv1();

    TextField getCampoMesesUltimoCobroPension1();

    DropDown getListaEsControlReprocesoPenActiv1();

    TextField getCampoLimiteIndiceCalidadVida1();

    TextField getCampoLimitePensiones1();

    Button getBotonAplicar1();

    ParametroGlobalCachedRowSetDataProvider2 getParametroGlobalDataProvider();
}
