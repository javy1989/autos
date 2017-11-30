package ec.ricardo.com.ventaautos.model;

import java.io.Serializable;

/**
 * Created by Ricardo on 26/11/2017.
 */

public class Usuario implements Serializable {

    private String user;
    private String pwd;

    public Usuario(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    public Usuario() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
