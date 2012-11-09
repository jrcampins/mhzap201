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
package com.egt.core.db.ddl;

import com.egt.core.aplicacion.TLC;
import com.egt.core.constants.EAC;
import com.egt.core.constants.SEV;
import com.egt.core.util.Utils;
import com.egt.core.util.VelocityEngineer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

public class Writer {

    private Writer() {
    }

    public static void main(String[] args) {
        boolean ok = Utils.checkEnterpriseApplicationJDBC();
        String[] params = Utils.checkEnvironmentVariableStringArray(SEV.JAVA_PARAMETER_LIST);
        ok &= (params != null);
        ok &= Utils.checkEnterpriseApplicationProperty(EAC.VELOCITY_PROPERTIES);
        ok &= Utils.checkEnterpriseApplicationProperty(EAC.VELOCITY_SOURCE_DIR);
        if (ok) {
            TLC.iniciar();
            String vm = params[0] + "." + "vm";
            String clase = params.length > 1 ? params[1] : null;
            execute(vm, clase);
            TLC.destruir();
        }
    }

    private static void execute(String vm, String clase) {
        if (VelocityEngineer.init()) {
            String c = clase == null ? "*" : clase;
//          Utils.println("*** combinar(" + vm + ", clase=" + c + ") ***");
            MapaClases mapaClases = new MapaClases();
            try {
                if (mapaClases.connected()) {
                    if (StringUtils.isNumeric(clase)) {
                        execute(vm, mapaClases.getMap(Long.valueOf(clase)));
                    } else if (StringUtils.isNotBlank(clase)) {
                        execute(vm, mapaClases.getMap(clase));
                    } else {
                        execute(vm, mapaClases.getMap());
                    }
                } else {
                    Utils.println("*** error de conexion ***");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                if (mapaClases != null) {
                    mapaClases.close();
                    mapaClases = null;
                }
            }
        }
    }

    private static void execute(String vm, Map clases) {
//      Utils.println("*** combinar(" + vm + ", clases=" + clases.size() + ") ***");
        if (clases == null || clases.size() == 0) {
            return;
        }
        try {
            Template template = Velocity.getTemplate(vm);
            VelocityContext context = new VelocityContext();
            context.put("clases", clases);
            StringWriter sw = new StringWriter();
            template.merge(context, sw);
            String filename = vm.replace(".vm", ".sql");
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(sw.toString());
            bufferedWriter.close();
        } catch (ResourceNotFoundException ex) {
            ex.printStackTrace();
        } catch (ParseErrorException ex) {
            ex.printStackTrace();
        } catch (MethodInvocationException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
