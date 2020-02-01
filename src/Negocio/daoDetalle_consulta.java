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
public class daoDetalle_consulta extends clsDetalle_consulta{
    funciones conexion;
    
    public daoDetalle_consulta() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO detalle_consulta VALUES (default, " + getCantidad_tratamiento() + ", "
                + getSubtotal() + ", '" + getFecha() + "', " + getId_consulta() + ", '" + getId_pieza() + "', "
                + getId_problema() + ", " + getId_tratamiento() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean modificar() {
        String sql = "UPDATE detalle_consulta SET (cantidad_tratamiento = " + getCantidad_tratamiento() + ", subtotal = "
                + getSubtotal() + ", fecha = '" + getFecha() + "', id_consulta = " + getId_consulta() + ", id_pieza = '"
                + getId_pieza() + "', id_problema = " + getId_problema() + ", id_tratamiento = " + getId_tratamiento()
                + ") WHERE id_detalle = " + getId_detalle();
        if (conexion.modificar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
