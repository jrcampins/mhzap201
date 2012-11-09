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
package com.egt.web;

import com.egt.data.general.xdp2.FavoritosCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.UsuarioCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.TextField;

public interface PaginaActualizacionFavoritos extends PaginaActualizacion {

    TextField getCampoIdPaginaUsuario1();

    TextField getCampoIdPagina1();

    TextField getCampoIdUsuario1();

    Button getBotonAplicar1();

    FavoritosCachedRowSetDataProvider2 getPaginaUsuarioDataProvider();

    PaginaCachedRowSetDataProvider2 getPaginaReferenceDataProvider();

    UsuarioCachedRowSetDataProvider2 getUsuarioReferenceDataProvider();
}