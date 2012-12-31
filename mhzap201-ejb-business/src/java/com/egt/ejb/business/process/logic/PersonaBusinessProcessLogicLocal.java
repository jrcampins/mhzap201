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

import com.egt.ejb.business.message.RegistrarCerVidaPersonaMessage;
import com.egt.ejb.business.message.AnularCerVidaPersonaMessage;
import com.egt.ejb.business.message.RegistrarCerDefunPersonaMessage;
import com.egt.ejb.business.message.AnularCerDefunPersonaMessage;
import com.egt.ejb.business.message.AprobarPensionPersonaMessage;
import com.egt.ejb.business.message.ObjetarPensionPersonaMessage;
import com.egt.ejb.business.message.RevocarPensionPersonaMessage;
import com.egt.ejb.business.message.OtorgarPensionPersonaMessage;
import com.egt.ejb.business.message.DenegarPensionPersonaMessage;
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
import javax.ejb.Local;

@Local
public interface PersonaBusinessProcessLogicLocal {

    public void registrarCerVidaPersona(RegistrarCerVidaPersonaMessage message, Persona persona) throws Exception;

    public void anularCerVidaPersona(AnularCerVidaPersonaMessage message, Persona persona) throws Exception;

    public void registrarCerDefunPersona(RegistrarCerDefunPersonaMessage message, Persona persona) throws Exception;

    public void anularCerDefunPersona(AnularCerDefunPersonaMessage message, Persona persona) throws Exception;

    public void aprobarPensionPersona(AprobarPensionPersonaMessage message, Persona persona) throws Exception;

    public void objetarPensionPersona(ObjetarPensionPersonaMessage message, Persona persona) throws Exception;

    public void revocarPensionPersona(RevocarPensionPersonaMessage message, Persona persona) throws Exception;

    public void otorgarPensionPersona(OtorgarPensionPersonaMessage message, Persona persona) throws Exception;

    public void denegarPensionPersona(DenegarPensionPersonaMessage message, Persona persona) throws Exception;

    public void registrarEntregaDocPersona(RegistrarEntregaDocPersonaMessage message, Persona persona) throws Exception;

    public void solicitarRecoPenPersona(SolicitarRecoPenPersonaMessage message, Persona persona) throws Exception;

    public void aprobarRecoPenPersona(AprobarRecoPenPersonaMessage message, Persona persona) throws Exception;

    public void denegarRecoPenPersona(DenegarRecoPenPersonaMessage message, Persona persona) throws Exception;

    public void registrarDenuPenPersona(RegistrarDenuPenPersonaMessage message, Persona persona) throws Exception;

    public void confirmarDenuPenPersona(ConfirmarDenuPenPersonaMessage message, Persona persona) throws Exception;

    public void desmentirDenuPenPersona(DesmentirDenuPenPersonaMessage message, Persona persona) throws Exception;

    public void actFecUltCobPenPersona(ActFecUltCobPenPersonaMessage message, Persona persona) throws Exception;

    public void anulFecUltCobPenPersona(AnulFecUltCobPenPersonaMessage message, Persona persona) throws Exception;
}
