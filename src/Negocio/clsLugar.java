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
public class clsLugar {
    private int id_procedencia;
    private String nombre;

    public clsLugar() {
    }

    public int getId_procedencia() {
        return id_procedencia;
    }

    public void setId_procedencia(int id_procedencia) {
        this.id_procedencia = id_procedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public clsLugar(int id_procedencia, String nombre) {
        this.id_procedencia = id_procedencia;
        this.nombre = nombre;
    
    }
}
