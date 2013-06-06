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
package com.egt.ejb.business.process;

import com.egt.ejb.business.message.RegistrarCerVidaPersonaMessage;
import com.egt.ejb.business.message.AnularCerVidaPersonaMessage;
import com.egt.ejb.business.message.RegistrarCerDefunPersonaMessage;
import com.egt.ejb.business.message.AnularCerDefunPersonaMessage;
import com.egt.ejb.business.message.AprobarPensionPersonaMessage;
import com.egt.ejb.business.message.AnularAprobacionPenPersonaMessage;
import com.egt.ejb.business.message.ObjetarPensionPersonaMessage;
import com.egt.ejb.business.message.RevocarPensionPersonaMessage;
import com.egt.ejb.business.message.OtorgarPensionPersonaMessage;
import com.egt.ejb.business.message.DenegarPensionPersonaMessage;
import com.egt.ejb.business.message.AnularDenegacionPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarEntregaDocPersonaMessage;
import com.egt.ejb.business.message.IncluirPersonaEnJupeMessage;
import com.egt.ejb.business.message.AsignarMontoPensionPersonaMessage;
import com.egt.ejb.business.message.ActFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.AnulFecUltCobPenPersonaMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AsignarRecoPenPersonaMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaMessage;
import com.egt.ejb.business.message.RegistrarDenuPenPersonaMessage;
import com.egt.ejb.business.message.ConfirmarDenuPenPersonaMessage;
import com.egt.ejb.business.message.DesmentirDenuPenPersonaMessage;
import com.egt.ejb.business.message.AnotarPersonaMessage;
import com.egt.ejb.business.message.BorrarPersonaMessage;
import com.egt.ejb.business.message.BorrarPersonaOtroMessage;
import com.egt.ejb.business.message.SolicitarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.AsignarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.AprobarRecoPenPersonaSelMessage;
import com.egt.ejb.business.message.DenegarRecoPenPersonaSelMessage;
import javax.ejb.Local;

@Local
public interface PersonaBusinessProcessLocal {

    public RegistrarCerVidaPersonaMessage registrarCerVidaPersona(RegistrarCerVidaPersonaMessage message);

    public AnularCerVidaPersonaMessage anularCerVidaPersona(AnularCerVidaPersonaMessage message);

    public RegistrarCerDefunPersonaMessage registrarCerDefunPersona(RegistrarCerDefunPersonaMessage message);

    public AnularCerDefunPersonaMessage anularCerDefunPersona(AnularCerDefunPersonaMessage message);

    public AprobarPensionPersonaMessage aprobarPensionPersona(AprobarPensionPersonaMessage message);

    public AnularAprobacionPenPersonaMessage anularAprobacionPenPersona(AnularAprobacionPenPersonaMessage message);

    public ObjetarPensionPersonaMessage objetarPensionPersona(ObjetarPensionPersonaMessage message);

    public RevocarPensionPersonaMessage revocarPensionPersona(RevocarPensionPersonaMessage message);

    public OtorgarPensionPersonaMessage otorgarPensionPersona(OtorgarPensionPersonaMessage message);

    public DenegarPensionPersonaMessage denegarPensionPersona(DenegarPensionPersonaMessage message);

    public AnularDenegacionPenPersonaMessage anularDenegacionPenPersona(AnularDenegacionPenPersonaMessage message);

    public RegistrarEntregaDocPersonaMessage registrarEntregaDocPersona(RegistrarEntregaDocPersonaMessage message);

    public IncluirPersonaEnJupeMessage incluirPersonaEnJupe(IncluirPersonaEnJupeMessage message);

    public AsignarMontoPensionPersonaMessage asignarMontoPensionPersona(AsignarMontoPensionPersonaMessage message);

    public ActFecUltCobPenPersonaMessage actFecUltCobPenPersona(ActFecUltCobPenPersonaMessage message);

    public AnulFecUltCobPenPersonaMessage anulFecUltCobPenPersona(AnulFecUltCobPenPersonaMessage message);

    public SolicitarRecoPenPersonaMessage solicitarRecoPenPersona(SolicitarRecoPenPersonaMessage message);

    public AsignarRecoPenPersonaMessage asignarRecoPenPersona(AsignarRecoPenPersonaMessage message);

    public AprobarRecoPenPersonaMessage aprobarRecoPenPersona(AprobarRecoPenPersonaMessage message);

    public DenegarRecoPenPersonaMessage denegarRecoPenPersona(DenegarRecoPenPersonaMessage message);

    public RegistrarDenuPenPersonaMessage registrarDenuPenPersona(RegistrarDenuPenPersonaMessage message);

    public ConfirmarDenuPenPersonaMessage confirmarDenuPenPersona(ConfirmarDenuPenPersonaMessage message);

    public DesmentirDenuPenPersonaMessage desmentirDenuPenPersona(DesmentirDenuPenPersonaMessage message);

    public AnotarPersonaMessage anotarPersona(AnotarPersonaMessage message);

    public BorrarPersonaMessage borrarPersona(BorrarPersonaMessage message);

    public BorrarPersonaOtroMessage borrarPersonaOtro(BorrarPersonaOtroMessage message);

    public SolicitarRecoPenPersonaSelMessage solicitarRecoPenPersonaSel(SolicitarRecoPenPersonaSelMessage message);

    public AsignarRecoPenPersonaSelMessage asignarRecoPenPersonaSel(AsignarRecoPenPersonaSelMessage message);

    public AprobarRecoPenPersonaSelMessage aprobarRecoPenPersonaSel(AprobarRecoPenPersonaSelMessage message);

    public DenegarRecoPenPersonaSelMessage denegarRecoPenPersonaSel(DenegarRecoPenPersonaSelMessage message);
}
