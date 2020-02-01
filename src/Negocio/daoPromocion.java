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
public class daoPromocion extends clsPromocion{
    funciones conexion;
    
    public daoPromocion() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO promocion VALUES (default, '" + getNombre() + "', " + getDescuento() + ", '" +
                getFecha_inicio() + "', '" + getVigente() + "', " + getId_tratamiento() + ", '" + getFecha_fin() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE promocion SET (nombre = '" + getNombre() + "', descuento = " +  getDescuento() + ", " +
                "fecha_inicio = '" + getFecha_inicio() +"', vigente = '" + getVigente() + "', id_tratamiento = " +
                getId_tratamiento() + ", fecha_fin = '" + getFecha_fin() + "') WHERE id_promocion = " +
                getId_promocion();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT id_promocion + 1 FROM promocion ORDER BY id_promocion DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Promoción no existe");
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
