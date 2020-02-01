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
public class daoLugar extends clsLugar{
    funciones conexion;
    
    public daoLugar() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO lugar_procedencia VALUES (default, '" + getNombre() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE lugar_procedencia SET (nombre = '" + getNombre() + "') WHERE id_procedencia = "
                + getId_procedencia();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT id_procedencia FROM lugar_procedencia ORDER BY id_procedencia";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Lugar de procedencia no existe");
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
