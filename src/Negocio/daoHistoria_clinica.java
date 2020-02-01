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
public class daoHistoria_clinica extends clsHistoria_clinica{
    funciones conexion;
    
    public daoHistoria_clinica() {
        conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO historia_clinica VALUES (default, '" + getFecha() + "', '" + getObservaciones() +
                "', '" + getDni_paciente() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE historia_clinica SET(fecha = '" + getFecha() + "', observaciones = '" + getObservaciones()
                + "', dni_paciente = '" + getDni_paciente() + "', id_antecedente = " + getId_antecedente() +
                "WHERE n_historia = '" + getN_historia() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT n_historia + 1 FROM historia_clinica ORDER BY n_historia DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Historia clínica no existe");
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
