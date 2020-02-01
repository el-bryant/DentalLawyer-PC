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
public class daoAlergia_historia extends clsAlergia_historia{
    funciones conexion;
    
    public daoAlergia_historia() {
        this.conexion = new funciones();
    }
    
    public boolean insertarId_alergia() {
        String sql = "INSERT INTO alergia_historia (id_alergia) VALUES (" + getId_Alergia() + ")";
        if (conexion.insertar(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean insertarN_historia() {
        String sql = "UPDATE alergia_historia SET n_historia = " + getN_historia() + " WHERE id_alergia = "
                + getId_Alergia();
        if (conexion.modificar(sql) == null) {
            System.out.println(conexion.modificar(sql));
            return true;
        } else {
            System.out.println(conexion.modificar(sql));
            return false;
        }
    }
}
