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
import com.egt.ejb.business.message.DesactivarFichaHogarMessage;
import com.egt.ejb.business.message.ReactivarFichaHogarMessage;
import com.egt.ejb.business.message.CalcularIcvFichaHogarMessage;
import com.egt.ejb.persistence.entity.FichaHogar;
import com.egt.ejb.persistence.facade.FichaHogarFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionarioFacadeLocal;
import com.egt.ejb.persistence.facade.UbicacionFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAreaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoMatParedesFacadeLocal;
import com.egt.ejb.persistence.facade.TipoMatPisoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoMatTechoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoOcupacionVivFacadeLocal;
import com.egt.ejb.persistence.facade.SionoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoCombustibleFacadeLocal;
import com.egt.ejb.persistence.facade.TipoPiezaBanoFacadeLocal;
import com.egt.ejb.persistence.facade.TipoServicioSanFacadeLocal;
import com.egt.ejb.persistence.facade.TipoServicioAguaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoAbaAguaFacadeLocal;
import com.egt.ejb.persistence.facade.TipoDesechoBasFacadeLocal;
import com.egt.ejb.persistence.facade.ProveedorDatExtFacadeLocal;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class FichaHogarBusinessProcessLogicBean implements FichaHogarBusinessProcessLogicLocal {

    // <editor-fold defaultstate="collapsed" desc="@EJB">
    @EJB
    private FichaHogarFacadeLocal facade;

    @EJB
    private FuncionarioFacadeLocal funcionarioFacade;

    @EJB
    private UbicacionFacadeLocal ubicacionFacade;

    @EJB
    private TipoAreaFacadeLocal tipoAreaFacade;

    @EJB
    private TipoMatParedesFacadeLocal tipoMatParedesFacade;

    @EJB
    private TipoMatPisoFacadeLocal tipoMatPisoFacade;

    @EJB
    private TipoMatTechoFacadeLocal tipoMatTechoFacade;

    @EJB
    private TipoOcupacionVivFacadeLocal tipoOcupacionVivFacade;

    @EJB
    private SionoFacadeLocal sionoFacade;

    @EJB
    private TipoCombustibleFacadeLocal tipoCombustibleFacade;

    @EJB
    private TipoPiezaBanoFacadeLocal tipoPiezaBanoFacade;

    @EJB
    private TipoServicioSanFacadeLocal tipoServicioSanFacade;

    @EJB
    private TipoServicioAguaFacadeLocal tipoServicioAguaFacade;

    @EJB
    private TipoAbaAguaFacadeLocal tipoAbaAguaFacade;

    @EJB
    private TipoDesechoBasFacadeLocal tipoDesechoBasFacade;

    @EJB
    private ProveedorDatExtFacadeLocal proveedorDatExtFacade;
    // </editor-fold>

    @Override
    public void desactivarFichaHogar(DesactivarFichaHogarMessage message, FichaHogar fichaHogar) throws Exception {
        if (message == null) {
            throw new EJBException(DesactivarFichaHogarMessage.class.getSimpleName());
        }
        if (fichaHogar == null) {
            throw new EJBException(FichaHogar.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        fichaHogar.setEsFichaHogarInactiva(IntUtils.TRUE);
    }

    @Override
    public void reactivarFichaHogar(ReactivarFichaHogarMessage message, FichaHogar fichaHogar) throws Exception {
        if (message == null) {
            throw new EJBException(ReactivarFichaHogarMessage.class.getSimpleName());
        }
        if (fichaHogar == null) {
            throw new EJBException(FichaHogar.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        fichaHogar.setEsFichaHogarInactiva(IntUtils.FALSE);
    }

    @Override
    public void calcularIcvFichaHogar(CalcularIcvFichaHogarMessage message, FichaHogar fichaHogar) throws Exception {
        if (message == null) {
            throw new EJBException(CalcularIcvFichaHogarMessage.class.getSimpleName());
        }
        if (fichaHogar == null) {
            throw new EJBException(FichaHogar.class.getSimpleName());
        }
        //
        // TODO: comprobar la logica del proceso de negocio
        //
        fichaHogar.setIndiceCalidadVida(new BigDecimal("65"));
    }
}
