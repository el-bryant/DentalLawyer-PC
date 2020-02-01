/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ASUS
 */
public class clsPieza_dental {
    private String id_pieza;
    private String nombre;

    public clsPieza_dental() {
    }

    public String getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(String id_pieza) {
        this.id_pieza = id_pieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public clsPieza_dental(String id_pieza, String nombre) {
        this.id_pieza = id_pieza;
        this.nombre = nombre;
    
    }
}
