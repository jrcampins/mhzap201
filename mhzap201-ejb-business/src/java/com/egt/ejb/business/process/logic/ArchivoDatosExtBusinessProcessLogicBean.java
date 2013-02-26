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
package com.egt.ejb.business.process.logic;

import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.IntUtils;
import com.egt.commons.util.TimeUtils;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.CargarArchivoDatosExtMessage;
import com.egt.ejb.business.message.ImportarArchivoDatosExtMessage;
import com.egt.ejb.persistence.entity.ArchivoDatosExt;
import com.egt.ejb.persistence.facade.ArchivoDatosExtFacadeLocal;
import com.egt.ejb.persistence.facade.ProveedorDatExtFacadeLocal;
import com.egt.ejb.persistence.facade.TipoArcDatExtFacadeLocal;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class ArchivoDatosExtBusinessProcessLogicBean implements ArchivoDatosExtBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private ArchivoDatosExtFacadeLocal facade;

    @EJB
    private ProveedorDatExtFacadeLocal proveedorDatExtFacade;

    @EJB
    private TipoArcDatExtFacadeLocal tipoArcDatExtFacade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    // </editor-fold>

    @Override
    public void cargarArchivoDatosExt(CargarArchivoDatosExtMessage message, ArchivoDatosExt archivoDatosExt) throws Exception {
        if (message == null) {
            throw new EJBException(CargarArchivoDatosExtMessage.class.getSimpleName());
        }
        if (archivoDatosExt == null) {
            throw new EJBException(ArchivoDatosExt.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        archivoDatosExt.setNombreArchivoDatos(message.getNombreArchivoDatos());
        archivoDatosExt.setNombreOriginalArchivoDatos(message.getNombreOriginalArchivoDatos());
        archivoDatosExt.setEsArchivoDatosExtImportado(IntUtils.FALSE);
        archivoDatosExt.setFechaHoraUltimaCarga((Date) TimeUtils.currentTimestamp());
        archivoDatosExt.setUsuarioIdUsuarioUltimaCarga(this.usuarioFacade.find(message.getUsuario()));
    }

    @Override
    public void importarArchivoDatosExt(ImportarArchivoDatosExtMessage message, ArchivoDatosExt archivoDatosExt) throws Exception {
        if (message == null) {
            throw new EJBException(ImportarArchivoDatosExtMessage.class.getSimpleName());
        }
        if (archivoDatosExt == null) {
            throw new EJBException(ArchivoDatosExt.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        archivoDatosExt.setEsArchivoDatosExtImportado(IntUtils.TRUE);
        archivoDatosExt.setFechaHoraUltimaImportacion((Date) TimeUtils.currentTimestamp());
        archivoDatosExt.setUsuarioIdUsuarioUltimaImportacion(this.usuarioFacade.find(message.getUsuario()));
    }
}
