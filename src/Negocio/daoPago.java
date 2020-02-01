/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Funciones.funciones;

/**
 *
 * @author Bryyv
 */
public class daoPago extends clsPago {
    funciones conexion;
    
    public daoPago() {
        this.conexion = new funciones();
    }
    
    public boolean insertar() {
        String sql = "INSERT INTO pago VALUES (default, " + getMonto() + ", " + getId_consulta() + ", '" + getFecha() + "')";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
}
