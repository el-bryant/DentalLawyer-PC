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
public class clsTratamiento {
    private int id_tratamiento;
    private String nombre;
    private float precio_unidad;

    public clsTratamiento() {
    }

    public int getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(float precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public clsTratamiento(int id_tratamiento, String nombre, float precio_unidad) {
        this.id_tratamiento = id_tratamiento;
        this.nombre = nombre;
        this.precio_unidad = precio_unidad;
    
    }
}
