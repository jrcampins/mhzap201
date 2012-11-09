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
package com.egt.web.configuracion.manual;

import com.egt.data.specific.xdp2.ArchivoDatosExtCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionArchivoDatosExt extends PaginaActualizacion {

    TextField getCampoIdArchivoDatosExt1();

    TextField getCampoCodigoArchivoDatosExt1();

    TextField getCampoNombreArchivoDatosExt1();

    TextField getCampoIdProveedorDatExt1();

    DropDown getListaNumeroTipoArcDatExt1();

    DropDown getListaEsArchivoDatosExtImportado1();

    TextField getTextFieldCampoFechaHoraUltimaCarga1();

    TextField getCampoIdUsuarioUltimaCarga1();

    TextField getTextFieldCampoFechaHoraUltimaImportacion1();

    TextField getCampoIdUsuarioUltimaImportacion1();

    Button getBotonAplicar1();

    ArchivoDatosExtCachedRowSetDataProvider2 getArchivoDatosExtDataProvider();

    ProveedorDatExtCachedRowSetDataProvider2 getProveedorDatExtReferenceDataProvider();

    UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider();

    Object getArchivoDatosExtBusinessProcess();

    Object getMessenger();
}
