/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.ejb.persistence.entity.Persona;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.SexoPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.EstadoCivilFacadeLocal;
import com.egt.ejb.persistence.facade.EtniaIndigenaFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionPensionFacadeLocal;
import com.egt.ejb.persistence.facade.CausaDenPensionFacadeLocal;
import com.egt.ejb.persistence.facade.CausaRevPensionFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionRecoPenFacadeLocal;
import com.egt.ejb.persistence.facade.CausaDenRecoPenFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionDenuPenFacadeLocal;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoActJupeFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class PersonaBusinessProcessLogicBean implements PersonaBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private PersonaFacadeLocal facade;

    @EJB
    private SexoPersonaFacadeLocal sexoPersonaFacade;

    @EJB
    private EstadoCivilFacadeLocal estadoCivilFacade;

    @EJB
    private EtniaIndigenaFacadeLocal etniaIndigenaFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private CondicionPensionFacadeLocal condicionPensionFacade;

    @EJB
    private CausaDenPensionFacadeLocal causaDenPensionFacade;

    @EJB
    private CausaRevPensionFacadeLocal causaRevPensionFacade;

    @EJB
    private CondicionRecoPenFacadeLocal condicionRecoPenFacade;

    @EJB
    private CausaDenRecoPenFacadeLocal causaDenRecoPenFacade;

    @EJB
    private CondicionDenuPenFacadeLocal condicionDenuPenFacade;

    @EJB
    private FichaPersonaFacadeLocal fichaPersonaFacade;

    @EJB
    private TipoActJupeFacadeLocal tipoActJupeFacade;
    // </editor-fold>

    @Override
    public void registrarCerVidaPersona(RegistrarCerVidaPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(RegistrarCerVidaPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCertificadoVida(message.getCertificadoVida());
        persona.setFechaCertificadoVida(message.getFechaCertificadoVida());
        persona.setComentariosAnulCerVida(null);
        persona.setEsCertificadoVidaAnulado(IntUtils.FALSE);
    }

    @Override
    public void anularCerVidaPersona(AnularCerVidaPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(AnularCerVidaPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosAnulCerVida(message.getComentariosAnulCerVida());
        persona.setEsCertificadoVidaAnulado(IntUtils.TRUE);
    }

    @Override
    public void registrarCerDefunPersona(RegistrarCerDefunPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(RegistrarCerDefunPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCertificadoDefuncion(message.getCertificadoDefuncion());
        persona.setFechaCertificadoDefuncion(message.getFechaCertificadoDefuncion());
        persona.setComentariosAnulCerDefuncion(null);
        persona.setEsCerDefuncionAnulado(IntUtils.FALSE);
    }

    @Override
    public void anularCerDefunPersona(AnularCerDefunPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(AnularCerDefunPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosAnulCerDefuncion(message.getComentariosAnulCerDefuncion());
        persona.setEsCerDefuncionAnulado(IntUtils.TRUE);
    }

    @Override
    public void aprobarPensionPersona(AprobarPensionPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(AprobarPensionPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosAprobacionPension(message.getComentariosAprobacionPension());
        persona.setCondicionPensionNumeroCondicionPension(this.condicionPensionFacade.find(com.egt.base.enums.EnumCondicionPension.APROBADA.intValue()));
        persona.setFechaAprobacionPension((Date) TimeUtils.currentDate());
    }

    @Override
    public void denegarPensionPersona(DenegarPensionPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(DenegarPensionPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCausaDenPensionNumeroCausaDenPension(this.causaDenPensionFacade.find(message.getNumeroCausaDenPension()));
        persona.setOtraCausaDenPension(message.getOtraCausaDenPension());
        persona.setNumeroResolucionDenPen(message.getNumeroResolucionDenPen());
        persona.setFechaResolucionDenPen(message.getFechaResolucionDenPen());
        persona.setComentariosDenegacionPension(message.getComentariosDenegacionPension());
        persona.setCondicionPensionNumeroCondicionPension(this.condicionPensionFacade.find(com.egt.base.enums.EnumCondicionPension.DENEGADA.intValue()));
        persona.setFechaDenegacionPension((Date) TimeUtils.currentDate());
    }

    @Override
    public void revocarPensionPersona(RevocarPensionPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(RevocarPensionPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCausaRevPensionNumeroCausaRevPension(this.causaRevPensionFacade.find(message.getNumeroCausaRevPension()));
        persona.setOtraCausaRevPension(message.getOtraCausaRevPension());
        persona.setComentariosRevocacionPension(message.getComentariosRevocacionPension());
        persona.setCondicionPensionNumeroCondicionPension(this.condicionPensionFacade.find(com.egt.base.enums.EnumCondicionPension.REVOCADA.intValue()));
        persona.setFechaRevocacionPension((Date) TimeUtils.currentDate());
    }

    @Override
    public void otorgarPensionPersona(OtorgarPensionPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(OtorgarPensionPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setNumeroResolucionOtorPen(message.getNumeroResolucionOtorPen());
        persona.setFechaResolucionOtorPen(message.getFechaResolucionOtorPen());
        persona.setComentariosOtorgamientoPen(message.getComentariosOtorgamientoPen());
    }

    @Override
    public void registrarEntregaDocPersona(RegistrarEntregaDocPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(RegistrarEntregaDocPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCertificadoVida(message.getCertificadoVida());
        persona.setFechaCertificadoVida(message.getFechaCertificadoVida());
        persona.setComentariosAnulCerVida(null);
        persona.setEsCertificadoVidaAnulado(IntUtils.FALSE);
        persona.setEsPersonaConCopiaCedula(message.getEsPersonaConCopiaCedula() == null ? IntUtils.FALSE : message.getEsPersonaConCopiaCedula());
        persona.setEsPersonaConDeclaracionJur(message.getEsPersonaConDeclaracionJur() == null ? IntUtils.FALSE : message.getEsPersonaConDeclaracionJur());
    }

    @Override
    public void solicitarRecoPenPersona(SolicitarRecoPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(SolicitarRecoPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosSolicitudRecoPen(message.getComentariosSolicitudRecoPen());
        persona.setCondicionRecoPenNumeroCondicionRecoPen(this.condicionRecoPenFacade.find(com.egt.base.enums.EnumCondicionRecoPen.SOLICITADA.intValue()));
        persona.setFechaSolicitudRecoPen((Date) TimeUtils.currentDate());
    }

    @Override
    public void aprobarRecoPenPersona(AprobarRecoPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(AprobarRecoPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosAprRecoPen(message.getComentariosAprRecoPen());
        persona.setCondicionRecoPenNumeroCondicionRecoPen(this.condicionRecoPenFacade.find(com.egt.base.enums.EnumCondicionRecoPen.APROBADA.intValue()));
        persona.setFechaAprobacionRecoPen((Date) TimeUtils.currentDate());
        persona.setCondicionPensionNumeroCondicionPension(this.condicionPensionFacade.find(com.egt.base.enums.EnumCondicionPension.APROBADA.intValue()));
        persona.setFechaAprobacionPension((Date) TimeUtils.currentDate());
        persona.setComentariosAprobacionPension("Pension Aprobada por Reconsideracion");
    }

    @Override
    public void denegarRecoPenPersona(DenegarRecoPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(DenegarRecoPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCausaDenRecoPenNumeroCausaDenRecoPen(this.causaDenRecoPenFacade.find(message.getNumeroCausaDenRecoPen()));
        persona.setOtraCausaDenRecoPen(message.getOtraCausaDenRecoPen());
        persona.setComentariosDenRecoPen(message.getComentariosDenRecoPen());
        persona.setCondicionRecoPenNumeroCondicionRecoPen(this.condicionRecoPenFacade.find(com.egt.base.enums.EnumCondicionRecoPen.DENEGADA.intValue()));
        persona.setFechaDenegacionRecoPen((Date) TimeUtils.currentDate());
    }

    @Override
    public void registrarDenuPenPersona(RegistrarDenuPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(RegistrarDenuPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosRegistroDenuPen(message.getComentariosRegistroDenuPen());
        persona.setCondicionDenuPenNumeroCondicionDenuPen(this.condicionDenuPenFacade.find(com.egt.base.enums.EnumCondicionDenuPen.REGISTRADA.intValue()));
        persona.setFechaRegistroDenunciaPen((Date) TimeUtils.currentDate());
    }

    @Override
    public void confirmarDenuPenPersona(ConfirmarDenuPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(ConfirmarDenuPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setCausaRevPensionNumeroCausaRevPension(this.causaRevPensionFacade.find(message.getNumeroCausaRevPension()));
        persona.setOtraCausaRevPension(message.getOtraCausaRevPension());
        persona.setComentariosConfDenuPen(message.getComentariosConfDenuPen());
        persona.setCondicionDenuPenNumeroCondicionDenuPen(this.condicionDenuPenFacade.find(com.egt.base.enums.EnumCondicionDenuPen.CONFIRMADA.intValue()));
        persona.setFechaConfirmacionDenuPen((Date) TimeUtils.currentDate());
        persona.setCondicionPensionNumeroCondicionPension(this.condicionPensionFacade.find(com.egt.base.enums.EnumCondicionPension.REVOCADA.intValue()));
        persona.setFechaRevocacionPension((Date) TimeUtils.currentDate());
        persona.setComentariosRevocacionPension("Pension Revocada por Confirmacion de Denuncia");
    }

    @Override
    public void desmentirDenuPenPersona(DesmentirDenuPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(DesmentirDenuPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setComentariosDesDenuPen(message.getComentariosDesDenuPen());
        persona.setCondicionDenuPenNumeroCondicionDenuPen(this.condicionDenuPenFacade.find(com.egt.base.enums.EnumCondicionDenuPen.DESMENTIDA.intValue()));
        persona.setFechaDesmentidoDenunciaPen((Date) TimeUtils.currentDate());
    }

    @Override
    public void actFecUltCobPenPersona(ActFecUltCobPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(ActFecUltCobPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setFechaUltimoCobroPension(message.getFechaUltimoCobroPension());
    }

    @Override
    public void anulFecUltCobPenPersona(AnulFecUltCobPenPersonaMessage message, Persona persona) throws Exception {
        if (message == null) {
            throw new EJBException(AnulFecUltCobPenPersonaMessage.class.getSimpleName());
        }
        if (persona == null) {
            throw new EJBException(Persona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        persona.setNotasAnulFecUltCobPen(message.getNotasAnulFecUltCobPen());
    }
}
