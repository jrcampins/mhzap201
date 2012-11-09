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
import javax.ejb.Local;

@Local
public interface PotencialBenBusinessProcessLocal {

    public DesactivarPotencialBenMessage desactivarPotencialBen(DesactivarPotencialBenMessage message);

    public ReactivarPotencialBenMessage reactivarPotencialBen(ReactivarPotencialBenMessage message);

    public VincularPotencialBenMessage vincularPotencialBen(VincularPotencialBenMessage message);

    public ValidarCensoPotencialBenMessage validarCensoPotencialBen(ValidarCensoPotencialBenMessage message);

    public InvalidarCensoPotencialBenMessage invalidarCensoPotencialBen(InvalidarCensoPotencialBenMessage message);

    public RegReclCenPotencialBenMessage regReclCenPotencialBen(RegReclCenPotencialBenMessage message);

    public AprobarReclCenPotencialBenMessage aprobarReclCenPotencialBen(AprobarReclCenPotencialBenMessage message);

    public DenegarReclCenPotencialBenMessage denegarReclCenPotencialBen(DenegarReclCenPotencialBenMessage message);

    public AcreditarPotencialBenMessage acreditarPotencialBen(AcreditarPotencialBenMessage message);

    public RegUltVisCenPotencialBenMessage regUltVisCenPotencialBen(RegUltVisCenPotencialBenMessage message);
}
