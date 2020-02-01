/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Funciones.funciones;

/**
 *
 * @author ASUS
 */
public class daoPieza_dental extends clsPieza_dental{
    funciones conexion;
    
    public daoPieza_dental() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO pieza_dental VALUES ('" + getId_pieza() + "', '" + getNombre() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE pieza_dental SET (nombre = '" + getNombre() + "') WHERE id_pieza = '" + getId_pieza() + "'";
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
