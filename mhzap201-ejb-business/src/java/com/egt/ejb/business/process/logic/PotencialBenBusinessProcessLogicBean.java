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
import com.egt.ejb.persistence.entity.PotencialBen;
import com.egt.ejb.persistence.facade.PotencialBenFacadeLocal;
import com.egt.ejb.persistence.facade.TipoRegPotBenFacadeLocal;
import com.egt.ejb.persistence.facade.PersonaFacadeLocal;
import com.egt.ejb.persistence.facade.EtniaIndigenaFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionCensoFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionarioFacadeLocal;
import com.egt.ejb.persistence.facade.CausaInvCensoFacadeLocal;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.CondicionReclCenFacadeLocal;
import com.egt.ejb.persistence.facade.CausaDenReclCenFacadeLocal;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class PotencialBenBusinessProcessLogicBean implements PotencialBenBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private PotencialBenFacadeLocal facade;

    @EJB
    private TipoRegPotBenFacadeLocal tipoRegPotBenFacade;

    @EJB
    private PersonaFacadeLocal personaFacade;

    @EJB
    private EtniaIndigenaFacadeLocal etniaIndigenaFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private CondicionCensoFacadeLocal condicionCensoFacade;

    @EJB
    private FuncionarioFacadeLocal funcionarioFacade;

    @EJB
    private CausaInvCensoFacadeLocal causaInvCensoFacade;

    @EJB
    private FichaPersonaFacadeLocal fichaPersonaFacade;

    @EJB
    private CondicionReclCenFacadeLocal condicionReclCenFacade;

    @EJB
    private CausaDenReclCenFacadeLocal causaDenReclCenFacade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    // </editor-fold>

    @Override
    public void desactivarPotencialBen(DesactivarPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(DesactivarPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setEsPotencialBenInactivo(IntUtils.TRUE);
    }

    @Override
    public void reactivarPotencialBen(ReactivarPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(ReactivarPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setEsPotencialBenInactivo(IntUtils.FALSE);
    }

    @Override
    public void vincularPotencialBen(VincularPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(VincularPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setPersonaIdPersona(this.personaFacade.find(message.getIdPersona()));
    }

    @Override
    public void validarCensoPotencialBen(ValidarCensoPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(ValidarCensoPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setFuncionarioIdFuncionarioValidacionCen(this.funcionarioFacade.find(message.getIdFuncionarioValidacionCen()));
        potencialBen.setComentariosValidacionCenso(message.getComentariosValidacionCenso());
        potencialBen.setCondicionCensoNumeroCondicionCenso(this.condicionCensoFacade.find(com.egt.base.enums.EnumCondicionCenso.VALIDADO.intValue()));
        potencialBen.setFechaValidacionCenso((Date) TimeUtils.currentDate());
    }

    @Override
    public void invalidarCensoPotencialBen(InvalidarCensoPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(InvalidarCensoPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setFuncionarioIdFuncionarioValidacionCen(this.funcionarioFacade.find(message.getIdFuncionarioValidacionCen()));
        potencialBen.setCausaInvCensoNumeroCausaInvCenso(this.causaInvCensoFacade.find(message.getNumeroCausaInvCenso()));
        potencialBen.setOtraCausaInvCenso(message.getOtraCausaInvCenso());
        potencialBen.setComentariosValidacionCenso(message.getComentariosValidacionCenso());
        potencialBen.setCondicionCensoNumeroCondicionCenso(this.condicionCensoFacade.find(com.egt.base.enums.EnumCondicionCenso.INVALIDADO.intValue()));
        potencialBen.setFechaValidacionCenso((Date) TimeUtils.currentDate());
    }

    @Override
    public void regReclCenPotencialBen(RegReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(RegReclCenPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setComentariosReclamoCenso(message.getComentariosReclamoCenso());
        potencialBen.setCondicionReclCenNumeroCondicionReclCen(this.condicionReclCenFacade.find(com.egt.base.enums.EnumCondicionReclCen.REGISTRADO.intValue()));
        potencialBen.setFechaReclamoCenso((Date) TimeUtils.currentDate());
    }

    @Override
    public void aprobarReclCenPotencialBen(AprobarReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(AprobarReclCenPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setComentariosAprReclCen(message.getComentariosAprReclCen());
        potencialBen.setCondicionReclCenNumeroCondicionReclCen(this.condicionReclCenFacade.find(com.egt.base.enums.EnumCondicionReclCen.APROBADO.intValue()));
        potencialBen.setFechaAprobacionReclamoCenso((Date) TimeUtils.currentDate());
    }

    @Override
    public void denegarReclCenPotencialBen(DenegarReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(DenegarReclCenPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setCausaDenReclCenNumeroCausaDenReclCen(this.causaDenReclCenFacade.find(message.getNumeroCausaDenReclCen()));
        potencialBen.setOtraCausaDenReclCen(message.getOtraCausaDenReclCen());
        potencialBen.setComentariosDenReclCen(message.getComentariosDenReclCen());
        potencialBen.setCondicionReclCenNumeroCondicionReclCen(this.condicionReclCenFacade.find(com.egt.base.enums.EnumCondicionReclCen.DENEGADO.intValue()));
        potencialBen.setFechaDenegacionReclamoCenso((Date) TimeUtils.currentDate());
    }

    @Override
    public void acreditarPotencialBen(AcreditarPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(AcreditarPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void regUltVisCenPotencialBen(RegUltVisCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception {
        if (message == null) {
            throw new EJBException(RegUltVisCenPotencialBenMessage.class.getSimpleName());
        }
        if (potencialBen == null) {
            throw new EJBException(PotencialBen.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        potencialBen.setFechaUltimaVisitaCenso(message.getFechaUltimaVisitaCenso());
        potencialBen.setFuncionarioIdFuncionarioUltVisitaCen(this.funcionarioFacade.find(message.getIdFuncionarioUltVisitaCen()));
        potencialBen.setObservacionesUltVisitaCen(message.getObservacionesUltVisitaCen());
    }
}
