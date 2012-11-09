/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.business.process;

import com.egt.ejb.business.message.CopiarRolMessage;
import com.egt.ejb.business.message.ModificarConjuntoRolMessage;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import javax.ejb.Local;

@Local
public interface RolBusinessProcessLocal {

    public CopiarRolMessage copiarRol(CopiarRolMessage message);

    public ModificarConjuntoRolMessage modificarConjuntoRol(ModificarConjuntoRolMessage message);

    public PropagarFiltrosRolMessage propagarFiltrosRol(PropagarFiltrosRolMessage message);

    public PropagarFavoritosRolMessage propagarFavoritosRol(PropagarFavoritosRolMessage message);
}
