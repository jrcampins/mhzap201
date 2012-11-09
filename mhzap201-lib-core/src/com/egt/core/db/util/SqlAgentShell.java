/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.core.db.util;

import com.egt.base.jms.messages.SqlAgentMessage;
import com.egt.base.util.BundleProcedimientos;
import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.SEV;
import com.egt.core.util.Utils;

public class SqlAgentShell {

    public SqlAgentShell() {
    }

    public static void main(String[] args) {
        boolean ok = Utils.checkEnterpriseApplicationJDBC();
        String[] params = Utils.checkEnvironmentVariableStringArray(SEV.JAVA_PARAMETER_LIST);
        ok &= (params != null);
        ok &= Utils.checkEnvironmentVariable(SEV.SQLPRC_RUNNER_LOG);
        if (ok) {
            TLC.iniciar();
            String process = params[0];
            String number = params.length > 1 ? params[1] : null;
            execute(process, number, Utils.getJavaParameterArray(params, 2));
            TLC.destruir();
        }
    }

    public static void execute(String process, String number, Object[] args) {
        SqlAgentMessage message = SqlAgent.executeProcedure(process, number, args, true);
        Utils.println(message.getMensaje());
    }

}
