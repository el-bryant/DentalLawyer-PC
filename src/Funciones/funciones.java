/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class funciones {
    private java.sql.Connection cnn;
    java.sql.Statement st;
    java.sql.ResultSet rs;
    String user = "vdentcix_admin";
    String pass = "admin";
    
    public funciones() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Se cargó el Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver");
        }
        try {
            cnn = DriverManager.getConnection("jdbc:mysql://vitaldentcix.com/vdentcix_vitaldentcix", user, pass);
            System.out.println("Se conectó");
        } catch (SQLException e) {
            System.out.println("No se pudo conectar");
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public SQLException insertar(String sql) {
        try {
            System.out.println(sql);
            st = getCnn().createStatement();
            st.execute(sql);
            System.out.println("Ejecutó el SQL");
            st.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }
    
    public ResultSet consultar(String sql) {
        try {
            st = getCnn().createStatement();
            this.rs = st.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
        return rs;
    }
    
    public SQLException modificar(String sql) {
        try {
            System.out.println(sql);
            st = getCnn().createStatement();
            st.execute(sql);
            System.out.println("Ejecutó el SQL");
            st.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }
    
    public SQLException eliminar(String sql) {
        try {
            System.out.println(sql);
            st = getCnn().createStatement();
            st.execute(sql);
            System.out.println("Se ejecutó el SQL");
            st.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }
    
    /**
     * @return the cnn
     */
    public java.sql.Connection getCnn() {
        return cnn;
    }
}
