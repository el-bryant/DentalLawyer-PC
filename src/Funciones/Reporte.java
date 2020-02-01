/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Bryyv
 */
public class Reporte {

    Connection conexion;
    Statement instruccion;
    
    public Reporte() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //cnn = DriverManager.getConnection("jdbc:mysql://192.168.0.140/dental_lawyer", user, pass);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/dental_lawyer", "root", "");
            instruccion = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void reportesPDF(String ruta, String archi) {
        try {
            String rutaInforme = ruta;
            JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, conexion);
            JasperExportManager.exportReportToPdfFile(informe, archi);
            
            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("INFORME");
            ventanavisor.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
}
