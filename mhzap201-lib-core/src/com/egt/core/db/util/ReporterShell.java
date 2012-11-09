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

import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.EAC;
import com.egt.core.constants.SEV;
import com.egt.core.util.Utils;

public class ReporterShell {

    public ReporterShell() {
    }

    public static void main(String[] args) {
        boolean ok = Utils.checkEnterpriseApplicationJDBC();
        String[] params = Utils.checkEnvironmentVariableStringArray(SEV.JAVA_PARAMETER_LIST);
        ok &= (params != null);
        ok &= Utils.checkEnterpriseApplicationProperty(EAC.REPORT_SOURCE_DIR);
        ok &= Utils.checkEnterpriseApplicationProperty(EAC.SPOOLED_FILES_DIR);
        ok &= Utils.checkEnvironmentVariable(SEV.REPORT_RUNNER_LOG);
        if (ok) {
            TLC.iniciar();
            String report = params[0];
            String number = params.length > 1 ? params[1] : null;
            String userid = params.length > 2 ? params[2] : null;
            String target = params.length > 3 ? params[3] : null;
            String format = params.length > 4 ? params[4] : null;
            String select = params.length > 5 ? params[5] : null;
            execute(report, number, userid, target, format, select, Utils.getJavaParameterArray(params, 6));
            TLC.destruir();
        }
    }

    private static void execute(String report, String number, String userid, String target, String format, String select, Object[] args) {
//      Utils.println("*** ejecutar ***");
        Utils.println(Reporter.report(report, number, userid, target, format, select, args, true).getMensaje());
    }
}
