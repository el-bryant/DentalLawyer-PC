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
public class clsPaciente {
    private String dni;
    private String apellido_pat;
    private String apellido_mat;
    private String nombres;
    private String telefono;
    private String cel1;
    private String cel2;
    private String correo;
    private String f_nacimiento;
    private String direccion;
    private String ocupacion;
    private String lugar;
    private String estado_civil;
    private int id_proveniencia;

    public clsPaciente(String dni, String apellido_pat, String apellido_mat, String nombres, String telefono, String cel1, String cel2, String correo, String f_nacimiento, String direccion, String ocupacion, String lugar, String estado_civil, int id_proveniencia) {
        this.dni = dni;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.nombres = nombres;
        this.telefono = telefono;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.correo = correo;
        this.f_nacimiento = f_nacimiento;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.lugar = lugar;
        this.estado_civil = estado_civil;
        this.id_proveniencia = id_proveniencia;
    }

    public clsPaciente() {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCel1() {
        return cel1;
    }

    public void setCel1(String cel1) {
        this.cel1 = cel1;
    }

    public String getCel2() {
        return cel2;
    }

    public void setCel2(String cel2) {
        this.cel2 = cel2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getId_proveniencia() {
        return id_proveniencia;
    }

    public void setId_proveniencia(int id_proveniencia) {
        this.id_proveniencia = id_proveniencia;
    }

    
}
