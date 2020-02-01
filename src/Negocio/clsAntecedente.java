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
public class clsAntecedente {
    private int id_antecedente;
    private String nombre;
    private String fecha;
    private int n_historia;

    public clsAntecedente() {
    }

    public long getId_antecedente() {
        return id_antecedente;
    }

    public void setId_antecedente(int id_antecedente) {
        this.id_antecedente = id_antecedente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public long getN_historia() {
        return n_historia;
    }
    
    public void setN_historia(int n_historia) {
        this.n_historia = n_historia;
    }

    public clsAntecedente(int id_antecedente, String nombre, String fecha, int n_historia) {
        this.id_antecedente = id_antecedente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.n_historia = n_historia;
    }
}
