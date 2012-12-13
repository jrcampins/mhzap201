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
package com.egt.ejb.business.jms;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.core.aplicacion.TLC;
import com.egt.core.control.Auditor;
import com.egt.core.control.Controlador;
import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.business.message.AsignarPasswordUsuarioMessage;
import com.egt.ejb.business.message.AsignarSupervisorUsuarioMessage;
import com.egt.ejb.business.message.CopiarRolMessage;
import com.egt.ejb.business.message.ModificarConjuntoRolMessage;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import com.egt.ejb.business.message.CancelarGrupoProcesoMessage;
import com.egt.ejb.business.message.ProcesoImportarArchivosExtMessage;
import com.egt.ejb.business.message.ProcesoAcreditarPotBenMessage;
import com.egt.ejb.business.message.ProcesoPrepararProxPagoPenMessage;
import com.egt.ejb.business.message.ProcesoOtorgarPensionesAprMessage;
import com.egt.ejb.business.message.ProcesoDenegarPensionesMessage;
import com.egt.ejb.business.message.ProcesoActualizarPenEnJupeMessage;
import com.egt.ejb.business.message.ProcesoVerificarElePenMessage;
import com.egt.ejb.business.message.RegistrarCerVidaPersonaMessage;
import com.egt.ejb.business.message.AnularCerVidaPersonaMessage;
import com.egt.ejb.business.message.RegistrarCerDefunPersonaMessage;
import com.egt.ejb.business.message.AnularCerDefunPersonaMessage;
import com.egt.ejb.business.message.AprobarPensionPersonaMessage;
import com.egt.ejb.business.message.DenegarPensionPersonaMessage;
import com.egt.ejb.business.message.RevocarPensionPersonaMessage;
import com.egt.ejb.business.message.OtorgarPensionPersonaMessage;
import com.egt.ejb.business.message.RegistrarEntregaDocPersonaMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarDenuPenPersonaMessage;
import com.egt.ejb.business.message.ConfirmarDenuPenPersonaMessage;
import com.egt.ejb.business.message.DesmentirDenuPenPersonaMessage;
import com.egt.ejb.business.message.ActFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.AnulFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.ReconstruirUbicacionMessage;
import com.egt.ejb.business.message.CargarArchivoDatosExtMessage;
import com.egt.ejb.business.message.ImportarArchivoDatosExtMessage;
import com.egt.ejb.business.message.DesactivarFichaHogarMessage;
import com.egt.ejb.business.message.ReactivarFichaHogarMessage;
import com.egt.ejb.business.message.CalcularIcvFichaHogarMessage;
import com.egt.ejb.business.message.VincularFichaPersonaMessage;
import com.egt.ejb.business.message.DesvincularFichaPersonaMessage;
import com.egt.ejb.business.message.DesactivarPotencialBenMessage;
import com.egt.ejb.business.message.ReactivarPotencialBenMessage;
import com.egt.ejb.business.message.VincularPotencialBenMessage;
import com.egt.ejb.business.message.ValidarCensoPotencialBenMessage;
import com.egt.ejb.business.message.InvalidarCensoPotencialBenMessage;
import com.egt.ejb.business.message.RegReclCenPotencialBenMessage;
import com.egt.ejb.business.message.AprobarReclCenPotencialBenMessage;
import com.egt.ejb.business.message.DenegarReclCenPotencialBenMessage;
import com.egt.ejb.business.message.AcreditarPotencialBenMessage;
import com.egt.ejb.business.message.RegUltVisCenPotencialBenMessage;
import com.egt.ejb.business.process.UsuarioBusinessProcessLocal;
import com.egt.ejb.business.process.RolBusinessProcessLocal;
import com.egt.ejb.business.process.GrupoProcesoBusinessProcessLocal;
import com.egt.ejb.business.process.ProcesoBusinessProcessLocal;
import com.egt.ejb.business.process.PersonaBusinessProcessLocal;
import com.egt.ejb.business.process.UbicacionBusinessProcessLocal;
import com.egt.ejb.business.process.ArchivoDatosExtBusinessProcessLocal;
import com.egt.ejb.business.process.FichaHogarBusinessProcessLocal;
import com.egt.ejb.business.process.FichaPersonaBusinessProcessLocal;
import com.egt.ejb.business.process.PotencialBenBusinessProcessLocal;
import com.egt.ejb.core.AuditorLocal;
import com.egt.ejb.persistence.entity.RastroProceso;
import com.egt.ejb.persistence.facade.RastroProcesoFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class BusinessProcessBrokerBean implements BusinessProcessBrokerLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private UsuarioBusinessProcessLocal usuario;

    @EJB
    private RolBusinessProcessLocal rol;

    @EJB
    private GrupoProcesoBusinessProcessLocal grupoProceso;

    @EJB
    private ProcesoBusinessProcessLocal proceso;

    @EJB
    private PersonaBusinessProcessLocal persona;

    @EJB
    private UbicacionBusinessProcessLocal ubicacion;

    @EJB
    private ArchivoDatosExtBusinessProcessLocal archivoDatosExt;

    @EJB
    private FichaHogarBusinessProcessLocal fichaHogar;

    @EJB
    private FichaPersonaBusinessProcessLocal fichaPersona;

    @EJB
    private PotencialBenBusinessProcessLocal potencialBen;

    @EJB
    private AuditorLocal auditor;

    @EJB
    RastroProcesoFacadeLocal rastroProcesoFacade;
    // </editor-fold>

    @Override
    public BusinessProcessMessage processBusinessProcessMessage(BusinessProcessMessage message) {
        message = (BusinessProcessMessage) Controlador.ponerProcesoEnEjecucion(message);
        if (EnumCondicionEjeFun.EJECUCION_EN_PROGRESO.equals(message.getCondicion())) {
            message.setSubprocesos(0);
            message.setGrabarRastroPendiente(true);
            try {
                // <editor-fold defaultstate="collapsed">
                if (message instanceof DesignarSuperUsuarioMessage) {
                    message = usuario.designarSuperUsuario((DesignarSuperUsuarioMessage) message);
                } else if (message instanceof AnularSuperUsuarioMessage) {
                    message = usuario.anularSuperUsuario((AnularSuperUsuarioMessage) message);
                } else if (message instanceof DesactivarUsuarioMessage) {
                    message = usuario.desactivarUsuario((DesactivarUsuarioMessage) message);
                } else if (message instanceof ReactivarUsuarioMessage) {
                    message = usuario.reactivarUsuario((ReactivarUsuarioMessage) message);
                } else if (message instanceof SincronizarUsuarioMessage) {
                    message = usuario.sincronizarUsuario((SincronizarUsuarioMessage) message);
                } else if (message instanceof AsignarPasswordUsuarioMessage) {
                    message = usuario.asignarPasswordUsuario((AsignarPasswordUsuarioMessage) message);
                } else if (message instanceof AsignarSupervisorUsuarioMessage) {
                    message = usuario.asignarSupervisorUsuario((AsignarSupervisorUsuarioMessage) message);
                } else if (message instanceof CopiarRolMessage) {
                    message = rol.copiarRol((CopiarRolMessage) message);
                } else if (message instanceof ModificarConjuntoRolMessage) {
                    message = rol.modificarConjuntoRol((ModificarConjuntoRolMessage) message);
                } else if (message instanceof PropagarFiltrosRolMessage) {
                    message = rol.propagarFiltrosRol((PropagarFiltrosRolMessage) message);
                } else if (message instanceof PropagarFavoritosRolMessage) {
                    message = rol.propagarFavoritosRol((PropagarFavoritosRolMessage) message);
                } else if (message instanceof CancelarGrupoProcesoMessage) {
                    message = grupoProceso.cancelarGrupoProceso((CancelarGrupoProcesoMessage) message);
                } else if (message instanceof ProcesoImportarArchivosExtMessage) {
                    message = proceso.procesoImportarArchivosExt((ProcesoImportarArchivosExtMessage) message);
                } else if (message instanceof ProcesoAcreditarPotBenMessage) {
                    message = proceso.procesoAcreditarPotBen((ProcesoAcreditarPotBenMessage) message);
                } else if (message instanceof ProcesoPrepararProxPagoPenMessage) {
                    message = proceso.procesoPrepararProxPagoPen((ProcesoPrepararProxPagoPenMessage) message);
                } else if (message instanceof ProcesoOtorgarPensionesAprMessage) {
                    message = proceso.procesoOtorgarPensionesApr((ProcesoOtorgarPensionesAprMessage) message);
                } else if (message instanceof ProcesoDenegarPensionesMessage) {
                    message = proceso.procesoDenegarPensiones((ProcesoDenegarPensionesMessage) message);
                } else if (message instanceof ProcesoActualizarPenEnJupeMessage) {
                    message = proceso.procesoActualizarPenEnJupe((ProcesoActualizarPenEnJupeMessage) message);
                } else if (message instanceof ProcesoVerificarElePenMessage) {
                    message = proceso.procesoVerificarElePen((ProcesoVerificarElePenMessage) message);
                } else if (message instanceof RegistrarCerVidaPersonaMessage) {
                    message = persona.registrarCerVidaPersona((RegistrarCerVidaPersonaMessage) message);
                } else if (message instanceof AnularCerVidaPersonaMessage) {
                    message = persona.anularCerVidaPersona((AnularCerVidaPersonaMessage) message);
                } else if (message instanceof RegistrarCerDefunPersonaMessage) {
                    message = persona.registrarCerDefunPersona((RegistrarCerDefunPersonaMessage) message);
                } else if (message instanceof AnularCerDefunPersonaMessage) {
                    message = persona.anularCerDefunPersona((AnularCerDefunPersonaMessage) message);
                } else if (message instanceof AprobarPensionPersonaMessage) {
                    message = persona.aprobarPensionPersona((AprobarPensionPersonaMessage) message);
                } else if (message instanceof DenegarPensionPersonaMessage) {
                    message = persona.denegarPensionPersona((DenegarPensionPersonaMessage) message);
                } else if (message instanceof RevocarPensionPersonaMessage) {
                    message = persona.revocarPensionPersona((RevocarPensionPersonaMessage) message);
                } else if (message instanceof OtorgarPensionPersonaMessage) {
                    message = persona.otorgarPensionPersona((OtorgarPensionPersonaMessage) message);
                } else if (message instanceof RegistrarEntregaDocPersonaMessage) {
                    message = persona.registrarEntregaDocPersona((RegistrarEntregaDocPersonaMessage) message);
                } else if (message instanceof SolicitarRecoPenPersonaMessage) {
                    message = persona.solicitarRecoPenPersona((SolicitarRecoPenPersonaMessage) message);
                } else if (message instanceof AprobarRecoPenPersonaMessage) {
                    message = persona.aprobarRecoPenPersona((AprobarRecoPenPersonaMessage) message);
                } else if (message instanceof DenegarRecoPenPersonaMessage) {
                    message = persona.denegarRecoPenPersona((DenegarRecoPenPersonaMessage) message);
                } else if (message instanceof RegistrarDenuPenPersonaMessage) {
                    message = persona.registrarDenuPenPersona((RegistrarDenuPenPersonaMessage) message);
                } else if (message instanceof ConfirmarDenuPenPersonaMessage) {
                    message = persona.confirmarDenuPenPersona((ConfirmarDenuPenPersonaMessage) message);
                } else if (message instanceof DesmentirDenuPenPersonaMessage) {
                    message = persona.desmentirDenuPenPersona((DesmentirDenuPenPersonaMessage) message);
                } else if (message instanceof ActFecUltCobPenPersonaMessage) {
                    message = persona.actFecUltCobPenPersona((ActFecUltCobPenPersonaMessage) message);
                } else if (message instanceof AnulFecUltCobPenPersonaMessage) {
                    message = persona.anulFecUltCobPenPersona((AnulFecUltCobPenPersonaMessage) message);
                } else if (message instanceof ReconstruirUbicacionMessage) {
                    message = ubicacion.reconstruirUbicacion((ReconstruirUbicacionMessage) message);
                } else if (message instanceof CargarArchivoDatosExtMessage) {
                    message = archivoDatosExt.cargarArchivoDatosExt((CargarArchivoDatosExtMessage) message);
                } else if (message instanceof ImportarArchivoDatosExtMessage) {
                    message = archivoDatosExt.importarArchivoDatosExt((ImportarArchivoDatosExtMessage) message);
                } else if (message instanceof DesactivarFichaHogarMessage) {
                    message = fichaHogar.desactivarFichaHogar((DesactivarFichaHogarMessage) message);
                } else if (message instanceof ReactivarFichaHogarMessage) {
                    message = fichaHogar.reactivarFichaHogar((ReactivarFichaHogarMessage) message);
                } else if (message instanceof CalcularIcvFichaHogarMessage) {
                    message = fichaHogar.calcularIcvFichaHogar((CalcularIcvFichaHogarMessage) message);
                } else if (message instanceof VincularFichaPersonaMessage) {
                    message = fichaPersona.vincularFichaPersona((VincularFichaPersonaMessage) message);
                } else if (message instanceof DesvincularFichaPersonaMessage) {
                    message = fichaPersona.desvincularFichaPersona((DesvincularFichaPersonaMessage) message);
                } else if (message instanceof DesactivarPotencialBenMessage) {
                    message = potencialBen.desactivarPotencialBen((DesactivarPotencialBenMessage) message);
                } else if (message instanceof ReactivarPotencialBenMessage) {
                    message = potencialBen.reactivarPotencialBen((ReactivarPotencialBenMessage) message);
                } else if (message instanceof VincularPotencialBenMessage) {
                    message = potencialBen.vincularPotencialBen((VincularPotencialBenMessage) message);
                } else if (message instanceof ValidarCensoPotencialBenMessage) {
                    message = potencialBen.validarCensoPotencialBen((ValidarCensoPotencialBenMessage) message);
                } else if (message instanceof InvalidarCensoPotencialBenMessage) {
                    message = potencialBen.invalidarCensoPotencialBen((InvalidarCensoPotencialBenMessage) message);
                } else if (message instanceof RegReclCenPotencialBenMessage) {
                    message = potencialBen.regReclCenPotencialBen((RegReclCenPotencialBenMessage) message);
                } else if (message instanceof AprobarReclCenPotencialBenMessage) {
                    message = potencialBen.aprobarReclCenPotencialBen((AprobarReclCenPotencialBenMessage) message);
                } else if (message instanceof DenegarReclCenPotencialBenMessage) {
                    message = potencialBen.denegarReclCenPotencialBen((DenegarReclCenPotencialBenMessage) message);
                } else if (message instanceof AcreditarPotencialBenMessage) {
                    message = potencialBen.acreditarPotencialBen((AcreditarPotencialBenMessage) message);
                } else if (message instanceof RegUltVisCenPotencialBenMessage) {
                    message = potencialBen.regUltVisCenPotencialBen((RegUltVisCenPotencialBenMessage) message);
                } else {
                    message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
                    message.setMensaje(TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, message.getRastro() + "(" + message.getClass().getName() + ")"));
                }
                // </editor-fold>
                if (message.getSubprocesos() > 0) {
                    auditor.grabarRastroProceso(message.getRastro(), message.getSubprocesos(), message.getProcedimiento());
                } else if (message.isGrabarRastroPendiente()) {
                    auditor.grabarRastroProceso(message.getRastro(), message.getCondicion(), message.getArchivo(), message.getMensaje());
                }
                message.setGrabarRastroPendiente(false);
            } catch (Exception ex) {
                Auditor.grabarRastroProceso(message, ex);
                TLC.getBitacora().fatal(message.getMensaje());
                TLC.getBitacora().fatal(CBM2.PROCESS_EXECUTION_ABEND, message.getRastro());
                throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
            }
        }
        return message;
    }

    @Override
    public BusinessProcessMessage processRedeliveredBusinessProcessMessage(BusinessProcessMessage message) {
        try {
            message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
            message.setMensaje(TLC.getBitacora().error(CBM2.PROCESS_EXECUTION_ABEND, message.getRastro()));
            RastroProceso rastro = rastroProcesoFacade.find(message.getRastro());
            if (rastro != null) {
                message.setCondicion(EnumCondicionEjeFun.valueOf(rastro.getCondicionEjeFunNumeroCondicionEjeFun().getNumeroCondicionEjeFun()));
                message.setMensaje(rastro.getDescripcionError());
            }
        } catch (Throwable throwable) {
            TLC.getBitacora().error(throwable);
        }
        return message;
    }
}
