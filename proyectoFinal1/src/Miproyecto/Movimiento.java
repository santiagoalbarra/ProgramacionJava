/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miproyecto;

/**
 *
 * @author CSU22
 */
public class Movimiento {
    
    // Atributos
    public String tipo;
    public String fecha_movimiento;
    public String especificacion;

    // Constructor vacío
    public Movimiento() {
    }

    // Constructor completo
    public Movimiento(String tipo, String fecha_movimiento, String especificacion) {
        this.tipo = tipo;
        this.fecha_movimiento = fecha_movimiento;
        this.especificacion = especificacion;
    }

    // Constructor parcial
    public Movimiento(String especificacion) {
        this.especificacion = especificacion;
    }

    // Métodos Get y Set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(String fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    // Método para imprimir
    public void imprimir() {
        System.out.println(
            "El movimiento es " + tipo +
            " en la fecha " + fecha_movimiento +
            " con la especificación de " + especificacion
        );
    }

    // Método principal
    public static void main(String[] args) {

        Movimiento m1;

        m1 = new Movimiento(
            "entrada",
            "10/09/2026",
            "ingreso de equipo"
        );

        m1.imprimir();
    }
}

