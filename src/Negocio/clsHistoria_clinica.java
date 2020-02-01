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
public class clsHistoria_clinica {
    private int n_historia;
    private String fecha;
    private String observaciones;
    private String dni_paciente;
    private int id_antecedente;

    public clsHistoria_clinica() {
    }

    public int getN_historia() {
        return n_historia;
    }

    public void setN_historia(int n_historia) {
        this.n_historia = n_historia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public int getId_antecedente() {
        return id_antecedente;
    }

    public void setId_antecedente(int id_antecedente) {
        this.id_antecedente = id_antecedente;
    }

    public clsHistoria_clinica(int n_historia, String fecha, String observaciones, String dni_paciente, int id_antecedente) {
        this.n_historia = n_historia;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.dni_paciente = dni_paciente;
        this.id_antecedente = id_antecedente;
    
    }
}
