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
import com.egt.core.control.RolAutorizado;
import com.egt.core.control.UsuarioAutenticado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

public class JdbcLoginModule implements LoginModule {

    private Subject subject;

    private CallbackHandler callbackHandler;

    private Map sharedState;

    private Map options;

    private boolean debug = false;

    private String username;

    private String password;

    boolean authSuccess = true;

    boolean commitSuccess = false;

    boolean passwordMismatch = false;

    boolean invalidUser = false;

    private String url = null;

    private String driverClass = null;

    private String dbUserid = null;

    private String dbPassword = null;

    private Connection con = null;

    private Statement stmt = null;

    private PreparedStatement pstmt = null;

    private String query = null;

    private String codigo = null;

    private UsuarioAutenticado usuarioAutenticado = null;

    /**
     * Initialize this <code>LoginModule</code>.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated. <p>
     *
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *			with the end user (prompting for user names and
     *			passwords, for example). <p>
     *
     * @param sharedState shared <code>LoginModule</code> state. <p>
     *
     * @param options options specified in the login
     *			<code>Configuration</code> for this particular
     *			<code>LoginModule</code>.
     */
    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map sharedState, Map options) {
        Bitacora.trace(JdbcLoginModule.class, "initialize", subject);
        this.subject = subject;
        this.callbackHandler = callbackHandler;
        this.sharedState = sharedState;
        this.options = options;
        /* get JDBC parameters */
        this.url = (String) options.get("URL");
        this.driverClass = (String) options.get("DRIVER");
        this.dbUserid = (String) options.get("USERID");
        this.dbPassword = (String) options.get("PASSWORD");
        this.query = (String) options.get("QUERY");
    }

    /**
     * Authenticate the user by prompting for a user name and password.
     *
     * <p>
     *
     * @return true in all cases since this <code>LoginModule</code>
     *		should not be ignored.
     *
     * @exception FailedLoginException if the authentication fails. <p>
     *
     * @exception LoginException if this <code>LoginModule</code>
     *		is unable to perform the authentication.
     */
    @Override
    public boolean login() throws LoginException {
        Bitacora.trace(JdbcLoginModule.class, "login");
        if (this.callbackHandler == null) {
            throw new LoginException("CallbackHandler no disponible");
        }
        Callback[] callbacks = new Callback[2];
        callbacks[0] = new NameCallback("Usuario");
        callbacks[1] = new PasswordCallback("Contraseña", false);
        try {
            this.callbackHandler.handle(callbacks);
            this.username = ((NameCallback) callbacks[0]).getName();
            this.password = new String(((PasswordCallback) callbacks[1]).getPassword());
            this.authSuccess = this.validateUser(this.username, this.password);
            if (this.invalidUser) {
                throw new LoginException("Usuario inválido");
            }
            if (this.passwordMismatch) {
                throw new LoginException("Contraseña inválida");
            }
            return this.authSuccess;
        } catch (java.io.IOException ioe) {
            throw new LoginException(ioe.toString());
        } catch (UnsupportedCallbackException use) {
            throw new LoginException("Callback desconocido: " + use.getCallback().toString());
        }
    }

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication succeeded
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * succeeded).
     * <p>
     *
     * @exception LoginException if the commit fails.
     *
     * @return true if this LoginModule's own login and commit
     *		attempts succeeded, or false otherwise.
     */
    @Override
    public boolean commit() throws LoginException {
        Bitacora.trace(JdbcLoginModule.class, "commit");
        if (this.authSuccess) {
            commitSuccess = true;
            Bitacora.trace("Add principal 1");
//          usuarioAutenticado = new UsuarioAutenticado(this.codigo);
            usuarioAutenticado = new UsuarioAutenticado();
            subject.getPrincipals().add(usuarioAutenticado);
            Bitacora.trace("Add principal 2");
            RolAutorizado rolAutorizado = new RolAutorizado(this.codigo);
            subject.getPrincipals().add(rolAutorizado);
            /*
             * Put the authenticated subject in the session.
             */
            FacesContext context = FacesContext.getCurrentInstance();
            if (context != null) {
                Bitacora.trace("Put the authenticated subject in session");
                String JAASSubject = Subject.class.getName(); /* "JAASSubject"; */ /* "javax.security.auth.subject"; */
                context.getExternalContext().getSessionMap().put(JAASSubject, subject);
            }
        } else {
            commitSuccess = false;
        }
        return commitSuccess;
    }

    /**
     * <p> This method is called if the LoginContext's
     * overall authentication failed.
     * (the relevant REQUIRED, REQUISITE, SUFFICIENT and OPTIONAL LoginModules
     * did not succeed).
     *
     * <p> If this LoginModule's own authentication attempt
     * succeeded (checked by retrieving the private state saved by the
     * <code>login</code> and <code>commit</code> methods),
     * then this method cleans up any state that was originally saved.
     *
     * <p>
     *
     * @exception LoginException if the abort fails.
     *
     * @return false if this LoginModule's own login and/or commit attempts
     *		failed, and true otherwise.
     */
    @Override
    public boolean abort() throws LoginException {
        Bitacora.trace(JdbcLoginModule.class, "abort");
        if (!this.authSuccess) {
            this.username = null;
            this.password = null;
            this.subject.getPrincipals().clear();
            return true;
        }
        return false;
    }

    /**
     * Logout the user.
     *
     * <p> This method removes the <code>SamplePrincipal</code>
     * that was added by the <code>commit</code> method.
     *
     * <p>
     *
     * @exception LoginException if the logout fails.
     *
     * @return true in all cases since this <code>LoginModule</code>
     *          should not be ignored.
     */
    @Override
    public boolean logout() throws LoginException {
        Bitacora.trace(JdbcLoginModule.class, "logout");
        this.username = null;
        this.password = null;
        this.subject.getPrincipals().clear();
        return true;
    }

    /**
     *  This method does the actual authentication by validating in the database
     *  if the user exists and if the password matches or not.
     *
     */
    public boolean validateUser(String userid, String userpw) throws LoginException {
        Bitacora.trace(JdbcLoginModule.class, "validateUser", userid);
        try {
            Class.forName(this.driverClass);
            con = DriverManager.getConnection(this.url, this.dbUserid, this.dbPassword);
        } catch (java.lang.ClassNotFoundException cnfe) {
            System.err.print("ClassNotFoundException: " + cnfe.getMessage());
        } catch (java.sql.SQLException sqle) {
            System.err.print("SQLException@getConnection: " + sqle.getMessage());
        }
        boolean ok = true;
        try {
            this.pstmt = con.prepareStatement(this.query);
            this.pstmt.setString(1, userid);
            ResultSet rst = pstmt.executeQuery();
            String pwd = null;
            if (rst.next()) {
                // the user exists in the database there auth_success=true
                this.invalidUser = false;
                this.codigo = rst.getString("codigo_usuario");
                pwd = rst.getString("password_usuario").trim();
                if (userpw.equals(pwd)) {
                    this.passwordMismatch = false;
                } else {
                    this.passwordMismatch = true;
                }
            } else {
                this.invalidUser = true;
            }
        } catch (SQLException sql1) {
            System.err.println("SQLException@executeQuery: " + sql1.getMessage());
            ok = false;
        } finally {
            try {
                pstmt.close();
            } catch (SQLException sql2) {
                System.err.println("SQLException@close: " + sql2.getMessage());
                ok = false;
            }
        }
        return ok;
    }
}
