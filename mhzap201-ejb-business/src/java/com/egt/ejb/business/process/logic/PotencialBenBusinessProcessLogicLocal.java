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
import javax.ejb.Local;

@Local
public interface PotencialBenBusinessProcessLogicLocal {

    public void desactivarPotencialBen(DesactivarPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void reactivarPotencialBen(ReactivarPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void vincularPotencialBen(VincularPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void validarCensoPotencialBen(ValidarCensoPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void invalidarCensoPotencialBen(InvalidarCensoPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void regReclCenPotencialBen(RegReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void aprobarReclCenPotencialBen(AprobarReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void denegarReclCenPotencialBen(DenegarReclCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void acreditarPotencialBen(AcreditarPotencialBenMessage message, PotencialBen potencialBen) throws Exception;

    public void regUltVisCenPotencialBen(RegUltVisCenPotencialBenMessage message, PotencialBen potencialBen) throws Exception;
}
