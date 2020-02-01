/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Funciones.funciones;

/**
 *
 * @author ASUS
 */
public class daoPaciente extends clsPaciente{
    funciones conexion;
    
    public daoPaciente() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO paciente VALUES ('" + getDni() + "', '" + getApellido_pat() + "', '"
                + getApellido_mat() + "', '" + getNombres() + "', '" + getTelefono() + "', '" + getCel1() +
                "', '" + getCel2() + "', '" + getCorreo() + "', '" + getF_nacimiento() + "', '" + getDireccion() +
                "', '" + getOcupacion() + "', '" + getLugar() + "', '" + getEstado_civil() + "', " + getId_proveniencia()
                + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE paciente SET (apellido_pat = '" + getApellido_pat() + "', apellido_mat = '"
                + getApellido_mat() + "', nombres = '" + getNombres() + "', telefono = '" + getTelefono()
                + "', cel1 = '" + getCel1() + "', cel2 = '" + getCel2() + "', correo = '" + getCorreo()
                + "', f_nacimiento = '" + getF_nacimiento() + "', direccion = '" + getDireccion() + "', ocupacion = '"
                + getOcupacion() + "', lugar = '" + getLugar() + "', estado_civil = '" + getEstado_civil()
                + "', id_proveniencia = " + getId_proveniencia() + ") WHERE dni = '" + getDni() + "'";
        if(conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
