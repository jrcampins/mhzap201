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
import com.egt.ejb.business.message.VincularFichaPersonaMessage;
import com.egt.ejb.business.message.DesvincularFichaPersonaMessage;
import com.egt.ejb.persistence.entity.FichaPersona;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.FichaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.SexoPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.EstadoCivilFacadeLocal;
import com.egt.ejb.persistence.facade.TipoPersonaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.SionoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoExcepcionCedFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.IdiomaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.MotivoInaEscFacadeLocal;
import com.egt.ejb.persistence.facade.NivelEducativoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoSeguroMedicoFacadeLocal;
import com.egt.ejb.persistence.facade.EstadoSaludFacadeLocal;
import com.egt.ejb.persistence.facade.ClaseEnfAccFacadeLocal;
import com.egt.ejb.persistence.facade.ClaseEnfCronicaFacadeLocal;
import com.egt.ejb.persistence.facade.MotivoNoAtencionFacadeLocal;
import com.egt.ejb.persistence.facade.ClaseImpedimentoFacadeLocal;
import com.egt.ejb.persistence.facade.CausaImpedimentoFacadeLocal;
import com.egt.ejb.persistence.facade.MotivoNoTrabajoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoRelacionLabFacadeLocal;
import com.egt.ejb.persistence.facade.PotencialBenFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class FichaPersonaBusinessProcessLogicBean implements FichaPersonaBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private FichaPersonaFacadeLocal facade;

    @EJB
    private FichaHogarFacadeLocal fichaHogarFacade;

    @EJB
    private SexoPersonaFacadeLocal sexoPersonaFacade;

    @EJB
    private EstadoCivilFacadeLocal estadoCivilFacade;

    @EJB
    private TipoPersonaHogarFacadeLocal tipoPersonaHogarFacade;

    @EJB
    private SionoFacadeLocal sionoFacade;

    @EJB
    private TipoExcepcionCedFacadeLocal tipoExcepcionCedFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private IdiomaHogarFacadeLocal idiomaHogarFacade;

    @EJB
    private MotivoInaEscFacadeLocal motivoInaEscFacade;

    @EJB
    private NivelEducativoFacadeLocal nivelEducativoFacade;

    @EJB
    private TipoSeguroMedicoFacadeLocal tipoSeguroMedicoFacade;

    @EJB
    private EstadoSaludFacadeLocal estadoSaludFacade;

    @EJB
    private ClaseEnfAccFacadeLocal claseEnfAccFacade;

    @EJB
    private ClaseEnfCronicaFacadeLocal claseEnfCronicaFacade;

    @EJB
    private MotivoNoAtencionFacadeLocal motivoNoAtencionFacade;

    @EJB
    private ClaseImpedimentoFacadeLocal claseImpedimentoFacade;

    @EJB
    private CausaImpedimentoFacadeLocal causaImpedimentoFacade;

    @EJB
    private MotivoNoTrabajoFacadeLocal motivoNoTrabajoFacade;

    @EJB
    private TipoRelacionLabFacadeLocal tipoRelacionLabFacade;

    @EJB
    private PotencialBenFacadeLocal potencialBenFacade;
    // </editor-fold>

    @Override
    public void vincularFichaPersona(VincularFichaPersonaMessage message, FichaPersona fichaPersona) throws Exception {
        if (message == null) {
            throw new EJBException(VincularFichaPersonaMessage.class.getSimpleName());
        }
        if (fichaPersona == null) {
            throw new EJBException(FichaPersona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        fichaPersona.setPotencialBenIdPotencialBen(this.potencialBenFacade.find(message.getIdPotencialBen()));
    }

    @Override
    public void desvincularFichaPersona(DesvincularFichaPersonaMessage message, FichaPersona fichaPersona) throws Exception {
        if (message == null) {
            throw new EJBException(DesvincularFichaPersonaMessage.class.getSimpleName());
        }
        if (fichaPersona == null) {
            throw new EJBException(FichaPersona.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        fichaPersona.setPotencialBenIdPotencialBen(this.potencialBenFacade.find(null));
    }
}
