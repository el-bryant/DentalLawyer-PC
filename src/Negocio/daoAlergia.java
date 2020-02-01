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
 * @author Bryyv
 */
public class daoAlergia extends clsAlergia{
    funciones conexion;
    
    public daoAlergia() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO alergia VALUES (default, '" + getNombre() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean insertar_relacion() {
        String sql = "INSERT INTO alergia_historia (id_alergia) VALUES (" + getId_alergia() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean terminar_relacion() {
        String sql = "UPDATE alergia_historia SET (n_historia = " + getN_historia() + ") WHERE n_historia = null AND " +
                "id_alergia = " + getId_alergia();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE alergia SET (nombre = '" + getNombre() + "') WHERE id_alergia = " + getId_alergia();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT id_alergia + 1 FROM alergia ORDER BY id_alergia DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Alergia no existe");
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
