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
public class daoAntecedente extends clsAntecedente{
    funciones conexion;
    
    public daoAntecedente() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO antecedente (id_antecedente, nombre, fecha) VALUES (default, '" + getNombre() + "', '"
                + getFecha() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE antecedente SET nombre = '" + getNombre() + "', fecha = '" + getFecha() +
                "', " + getN_historia() + " WHERE id_antecedente = " + getId_antecedente();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT id_antecedente + 1 FROM antecedente ORDER BY id_antecedente DESC LIMIT 1";
        java.sql.ResultSet rs = null;
        rs = conexion.consultar(sql);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Antecedente no existe");
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
    
    public boolean relacion() {
        String sql = "UPDATE antecedente SET n_historia = " + getN_historia() + " WHERE id_antecedente = "
                + getId_antecedente();
        if (conexion.modificar(sql) == null) {
            System.out.println(conexion.modificar(sql));
            return true;
        } else {
            System.out.println(conexion.modificar(sql));
            return false;
        }
    }
}
