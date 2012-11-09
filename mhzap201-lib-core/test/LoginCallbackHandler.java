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

import com.egt.core.aplicacion.Bitacora;
import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class LoginCallbackHandler implements CallbackHandler {

    private String username = null;

    private String password = null;

    public LoginCallbackHandler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        Bitacora.trace(LoginCallbackHandler.class, "handle");
        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof NameCallback) {
                ((NameCallback) callbacks[i]).setName(username);
            } else {
                if (callbacks[i] instanceof PasswordCallback) {
                    ((PasswordCallback) callbacks[i]).setPassword(password.toCharArray());
                } else {
                    throw new UnsupportedCallbackException(callbacks[i], "Callback desconocido");
                }
            }
        }
    }
}
