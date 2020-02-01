/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Bryyv
 */
public class clsLogin {
    private int id_login;
    private String usuario;
    private String pwd;
    private int privilegio;

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(int privilegio) {
        this.privilegio = privilegio;
    }

    public clsLogin() {
    }

    public clsLogin(int id_login, String usuario, String pwd, int privilegio) {
        this.id_login = id_login;
        this.usuario = usuario;
        this.pwd = pwd;
        this.privilegio = privilegio;
    }    
}
