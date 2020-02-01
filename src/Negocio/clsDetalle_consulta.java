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
public class clsDetalle_consulta {
    private int id_detalle;
    private int cantidad_tratamiento;
    private float subtotal;
    private String fecha;
    private int id_consulta;
    private String id_pieza;
    private int id_problema;
    private int id_tratamiento;

    public clsDetalle_consulta() {
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad_tratamiento() {
        return cantidad_tratamiento;
    }

    public void setCantidad_tratamiento(int cantidad_tratamiento) {
        this.cantidad_tratamiento = cantidad_tratamiento;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(String id_pieza) {
        this.id_pieza = id_pieza;
    }

    public int getId_problema() {
        return id_problema;
    }

    public void setId_problema(int id_problema) {
        this.id_problema = id_problema;
    }

    public int getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public clsDetalle_consulta(int id_detalle, int cantidad_tratamiento, float subtotal, String fecha, int id_consulta, String id_pieza, int id_problema, int id_tratamiento) {
        this.id_detalle = id_detalle;
        this.cantidad_tratamiento = cantidad_tratamiento;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.id_consulta = id_consulta;
        this.id_pieza = id_pieza;
        this.id_problema = id_problema;
        this.id_tratamiento = id_tratamiento;
    
    }
}
