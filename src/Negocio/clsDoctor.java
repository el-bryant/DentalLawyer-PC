/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


/**
 *
 * @author ASUS
 */
public class clsDoctor {
    private String dni;
    private String apellido_pat;
    private String apellido_mat;
    private String nombres;
    private String celular;
    private String direccion;
    private String f_nacimiento;

    public clsDoctor() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public clsDoctor(String dni, String apellido_pat, String apellido_mat, String nombres, String celular, String direccion, String f_nacimiento) {
        this.dni = dni;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.nombres = nombres;
        this.celular = celular;
        this.direccion = direccion;
        this.f_nacimiento = f_nacimiento;
        
    }
}
