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
public class clsProblema_dental {
    private int id_problema;
    private String nombre;

    public clsProblema_dental() {
    }

    public int getId_problema() {
        return id_problema;
    }

    public void setId_problema(int id_problema) {
        this.id_problema = id_problema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public clsProblema_dental(int id_problema, String nombre) {
        this.id_problema = id_problema;
        this.nombre = nombre;
    
    }
}
