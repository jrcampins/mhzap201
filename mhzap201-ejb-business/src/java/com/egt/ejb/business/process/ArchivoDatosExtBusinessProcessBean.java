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
package com.egt.ejb.business.process;

import com.egt.base.constants.CBM2;
import com.egt.base.entity.constants.ArchivoDatosExtConstants;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.RastroFuncion;
import com.egt.core.util.STP;
import com.egt.ejb.business.message.CargarArchivoDatosExtMessage;
import com.egt.ejb.business.message.ImportarArchivoDatosExtMessage;
import com.egt.ejb.business.process.logic.ArchivoDatosExtBusinessProcessLogicLocal;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
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
public class ArchivoDatosExtBusinessProcessBean implements ArchivoDatosExtBusinessProcessLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private ArchivoDatosExtBusinessProcessLogicLocal logician;

    @EJB
    private ArchivoDatosExtFacadeLocal facade;

    @EJB
    private ProveedorDatExtFacadeLocal proveedorDatExtFacade;

    @EJB
    private TipoArcDatExtFacadeLocal tipoArcDatExtFacade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;
    // </editor-fold>

    @Override
    public CargarArchivoDatosExtMessage cargarArchivoDatosExt(CargarArchivoDatosExtMessage message) {
        Long idArchivoDatosExt = null;
        ArchivoDatosExt archivoDatosExt = null;
        try {
            idArchivoDatosExt = message.getIdArchivoDatosExt();
            archivoDatosExt = facade.find(idArchivoDatosExt, true);
            if (archivoDatosExt == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idArchivoDatosExt));
            } else if (BitUtils.valueOf(archivoDatosExt.getEsArchivoDatosExtInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + ArchivoDatosExtConstants.COLUMNA_ID_ARCHIVO_DATOS_EXT + ">", idArchivoDatosExt));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.cargarArchivoDatosExt(message, archivoDatosExt);
                this.grabarRastroFuncion(message, archivoDatosExt);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void cargarArchivoDatosExt(CargarArchivoDatosExtMessage message, ArchivoDatosExt archivoDatosExt) throws Exception {
        String sql = ArchivoDatosExtConstants.PROCESO_FUNCION_CARGAR_ARCHIVO_DATOS_EXT;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[4]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdArchivoDatosExt();
            args[index++] = message.getNombreArchivoDatos();
            args[index++] = message.getNombreOriginalArchivoDatos();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.cargarArchivoDatosExt(message, archivoDatosExt);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(CargarArchivoDatosExtMessage message, ArchivoDatosExt archivoDatosExt) {
        RastroFuncion rastro = this.getRastroFuncion(message, archivoDatosExt);
        rastro.addParametro(CargarArchivoDatosExtMessage.PARAMETRO_ID_ARCHIVO_DATOS_EXT, STP.getString(message.getIdArchivoDatosExt()));
        rastro.addParametro(CargarArchivoDatosExtMessage.PARAMETRO_NOMBRE_ARCHIVO_DATOS, STP.getString(message.getNombreArchivoDatos()));
        rastro.addParametro(CargarArchivoDatosExtMessage.PARAMETRO_NOMBRE_ORIGINAL_ARCHIVO_DATOS, STP.getString(message.getNombreOriginalArchivoDatos()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    @Override
    public ImportarArchivoDatosExtMessage importarArchivoDatosExt(ImportarArchivoDatosExtMessage message) {
        Long idArchivoDatosExt = null;
        ArchivoDatosExt archivoDatosExt = null;
        try {
            idArchivoDatosExt = message.getIdArchivoDatosExt();
            archivoDatosExt = facade.find(idArchivoDatosExt, true);
            if (archivoDatosExt == null) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_EXISTE, idArchivoDatosExt));
            } else if (BitUtils.valueOf(archivoDatosExt.getEsArchivoDatosExtInactivo())) {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_CON_ERRORES);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_INACTIVO, "<" + ArchivoDatosExtConstants.COLUMNA_ID_ARCHIVO_DATOS_EXT + ">", idArchivoDatosExt));
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUTADO_SIN_ERRORES);
                message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_END, message.getIdRastro()));
                this.importarArchivoDatosExt(message, archivoDatosExt);
                this.grabarRastroFuncion(message, archivoDatosExt);
            }
        } catch (Exception ex) {
            Auditor.grabarRastroProceso(message, ex);
            TLC.getBitacora().fatal(message.getMensaje());
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
        return message;
    }

    protected void importarArchivoDatosExt(ImportarArchivoDatosExtMessage message, ArchivoDatosExt archivoDatosExt) throws Exception {
        String sql = ArchivoDatosExtConstants.PROCESO_FUNCION_IMPORTAR_ARCHIVO_DATOS_EXT;
        if (sqlAgent.isStoredProcedure(sql)) {
            int index = 0;
            Object[] args = new Object[2]; /* el procedimiento actualiza el rastro */
            args[index++] = message.getRastro(); /* el procedimiento actualiza el rastro */
            args[index++] = message.getIdArchivoDatosExt();
            sqlAgent.executeProcedure(sql, args);
            message.setGrabarRastroPendiente(false); /* el procedimiento actualiza el rastro */
        } else {
            logician.importarArchivoDatosExt(message, archivoDatosExt);
            facade.flush();
        }
    }

    protected Long grabarRastroFuncion(ImportarArchivoDatosExtMessage message, ArchivoDatosExt archivoDatosExt) {
        RastroFuncion rastro = this.getRastroFuncion(message, archivoDatosExt);
        rastro.addParametro(ImportarArchivoDatosExtMessage.PARAMETRO_ID_ARCHIVO_DATOS_EXT, STP.getString(message.getIdArchivoDatosExt()));
        return Auditor.grabarRastroFuncion(rastro);
    }

    protected RastroFuncion getRastroFuncion(AbstractMessage message, ArchivoDatosExt archivoDatosExt) {
        RastroFuncion rastro = Auditor.getRastroFuncion(message);
        if (archivoDatosExt == null) {
            return rastro;
        }
        rastro.setIdRecurso(archivoDatosExt.getIdArchivoDatosExt());
        rastro.setVersionRecurso(archivoDatosExt.getVersionArchivoDatosExt());
        rastro.setCodigoRecurso(archivoDatosExt.getCodigoArchivoDatosExt());
        rastro.setNombreRecurso(archivoDatosExt.getNombreArchivoDatosExt());
//      rastro.setIdSegmentoRecurso(archivoDatosExt.getIdProveedorDatExt());
        return rastro;
    }
}
