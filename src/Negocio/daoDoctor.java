/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Funciones.funciones;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class daoDoctor extends clsDoctor{
    funciones conexion;
    
    public daoDoctor() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO doctor VALUES ('" + getDni() + "', '" + getApellido_pat() + "', '" + getApellido_mat()
                + "', '" + getNombres() + "', '" + getCelular() + "', '" + getDireccion() + "', '" + getF_nacimiento()
                + "')";
        if (conexion.insertar(sql) == null ){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE doctor SET (apellido_pat = '" + getApellido_pat() + "', apellido_mat = '" +
                getApellido_mat() + "', nombres = '" + getNombres() + "', celular = '" + getCelular() +
                "direccion = ', '" +getDireccion() + "', f_nacimiento = '" + getF_nacimiento() + "') WHERE dni = '" +
                getDni() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar(String combo) {
        String sql = "SELECT doctor.dni FROM doctor WHERE CONCAT(doctor.apellido_pat, ' ', doctor.apellido_mat, ' ', "
                    + "doctor.nombres = '" + combo + "'";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Consulta no existe");
        } else {
            try {
                if (rs.next())
                    return rs.getString(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }            
        return null;
    }
}
