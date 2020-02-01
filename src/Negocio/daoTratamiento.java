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
public class daoTratamiento extends clsTratamiento{
    funciones conexion;
    
    public daoTratamiento() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO tratamiento VALUES ('" + getNombre() + "', " + getPrecio_unidad() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE tratamiento SET (nombre = '" + getNombre() + "', precio_unidad = " + getPrecio_unidad() +
                ") WHERE id_tratamiento = " + getId_tratamiento();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public  String consultar() {
        String sql = "SELECT id_tratamiento FROM tratamiento ORDER BY id_tratamiento DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Tratamiento no existe");
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
