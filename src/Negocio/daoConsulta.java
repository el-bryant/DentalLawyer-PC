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
public class daoConsulta extends clsConsulta{
    funciones conexion;
    
    public daoConsulta() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO consulta VALUES (default, '" + getFecha() + "', '"
                + getHora() + "', '" + getUltima_consulta() + "', '" + getObservaciones() + "', " + getTotal() + ", "
                + getN_historia() + ", '" + getConsultorio() + "', '" + getDni_doctor() + "', " + getId_promocion() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE consulta SET (fecha = '" + getFecha() + "', hora = '" + getHora() + "', ultima_consulta = '"
                + getUltima_consulta() + "', observaciones = '" + getObservaciones() + "', total = " + getTotal()
                + "n_historia = " + getN_historia() + ", id_consultorio = '" + getConsultorio() + "', dni_doctor = '"
                + getDni_doctor() + "', id_promocion = " + getId_promocion() + ") WHERE id_consulta = "
                + getId_consulta();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String consultar() {
        String sql = "SELECT id_consulta + 1 FROM consulta ORDER BY id_consulta DESC LIMIT 1";
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
