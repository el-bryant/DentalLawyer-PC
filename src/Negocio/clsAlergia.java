/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Bryyv
 */
public class clsAlergia {
    int id_alergia;
    String nombre;
    int n_historia;

    public clsAlergia() {
    }

    public int getId_alergia() {
        return id_alergia;
    }

    public void setId_alergia(int id_alergia) {
        this.id_alergia = id_alergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getN_historia() {
        return n_historia;
    }
    
    public void setN_historia(int n_historia) {
        this.n_historia = n_historia;
    }

    public clsAlergia(int id_alergia, String nombre, int n_historia) {
        this.id_alergia = id_alergia;
        this.nombre = nombre;
        this.n_historia = n_historia;
    }
    
    
}
