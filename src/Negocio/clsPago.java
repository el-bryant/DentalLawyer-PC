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
public class clsPago {
    private int id_pago;
    private float monto;
    private String fecha;
    private int id_consulta;

    public clsPago() {
    }

    public clsPago(int id_pago, float monto, String fecha, int id_consulta) {
        this.id_pago = id_pago;
        this.monto = monto;
        this.fecha = fecha;
        this.id_consulta = id_consulta;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
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
}
