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
package com.egt.web.conjunto.segmento;

import com.egt.data.general.xdp2.ConjuntoSegmentoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacionConEdicionMultiple;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;

public interface PaginaActualizacionConjuntoSegmento extends PaginaActualizacionConEdicionMultiple {

    TextField getCampoIdConjuntoSegmento1();

    TextField getCampoCodigoConjuntoSegmento1();

    TextField getCampoNombreConjuntoSegmento1();

    TextArea getCampoDescripcionConjuntoSegmento1();

    TextField getCampoIdClaseRecurso1();

    Button getBotonAplicar1();

    ConjuntoSegmentoCachedRowSetDataProvider2 getConjuntoSegmentoDataProvider();

    ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider();
}