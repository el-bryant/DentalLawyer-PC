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
public class clsAlergia_historia {
    int id_Alergia;
    int n_historia;

    public clsAlergia_historia() {
    }

    public int getId_Alergia() {
        return id_Alergia;
    }

    public void setId_Alergia(int id_Alergia) {
        this.id_Alergia = id_Alergia;
    }

    public int getN_historia() {
        return n_historia;
    }

    public void setN_historia(int n_historia) {
        this.n_historia = n_historia;
    }

    public clsAlergia_historia(int id_Alergia, int n_historia) {
        this.id_Alergia = id_Alergia;
        this.n_historia = n_historia;
    }
    
    
}
