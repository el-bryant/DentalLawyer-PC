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
public class clsConsulta {
    private int id_consulta;
    private String fecha;
    private String hora;
    private String ultima_consulta;
    private String observaciones;
    private float total;
    private int n_historia;
    private String consultorio;
    private String dni_doctor;
    private int id_promocion;

    public clsConsulta() {
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUltima_consulta() {
        return ultima_consulta;
    }

    public void setUltima_consulta(String ultima_consulta) {
        this.ultima_consulta = ultima_consulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getN_historia() {
        return n_historia;
    }

    public void setN_historia(int n_historia) {
        this.n_historia = n_historia;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getDni_doctor() {
        return dni_doctor;
    }

    public void setDni_doctor(String dni_doctor) {
        this.dni_doctor = dni_doctor;
    }

    public int getId_promocion() {
        return id_promocion;
    }

    public void setId_promocion(int id_promocion) {
        this.id_promocion = id_promocion;
    }

    public clsConsulta(int id_consulta, String fecha, String hora, String ultima_consulta, String observaciones, float total, int n_historia, String consultorio, String dni_doctor, int id_promocion) {
        this.id_consulta = id_consulta;
        this.fecha = fecha;
        this.hora = hora;
        this.ultima_consulta = ultima_consulta;
        this.observaciones = observaciones;
        this.total = total;
        this.n_historia = n_historia;
        this.consultorio = consultorio;
        this.dni_doctor = dni_doctor;
        this.id_promocion = id_promocion;
    }
    
}
