/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class clsPromocion {
    private int id_promocion;
    private String nombre;
    private float descuento;
    private String fecha_inicio;
    private String vigente;
    private int id_tratamiento;
    private String fecha_fin;

    public clsPromocion() {
    }

    public clsPromocion(int id_promocion, String nombre, float descuento, String fecha_inicio, String vigente, int id_tratamiento, String fecha_fin) {
        this.id_promocion = id_promocion;
        this.nombre = nombre;
        this.descuento = descuento;
        this.fecha_inicio = fecha_inicio;
        this.vigente = vigente;
        this.id_tratamiento = id_tratamiento;
        this.fecha_fin = fecha_fin;
    }

    public int getId_promocion() {
        return id_promocion;
    }

    public void setId_promocion(int id_promocion) {
        this.id_promocion = id_promocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }

    public int getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
}
