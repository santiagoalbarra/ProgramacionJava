/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickbiteapp.modelo;

/**
 *
 * @author CSU22
 */
public class Plato {

    //Atributos
    private String nombre;
    private double precio;
    private int porcionesDisponibles;

    //Un unico constructor que reciba los tres valores (Parametro)
    public Plato(String nombre, double precio, int porcionesDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.porcionesDisponibles = porcionesDisponibles;
    }

    //Metodos
    public void MostrarInformacion() {

        System.out.println("El nombre del plato es " + nombre + "y el precio es " + precio + " y quedan disponibles" + porcionesDisponibles + " platos");

    }

    public double CalcularSubtotal(int cantidad) {

        double ValorSubtotal = this.precio * cantidad;

        return ValorSubtotal;
    }

    public boolean Haydisponibilidad(int cantidad) {

        if (cantidad > porcionesDisponibles) {

            return false;
        } else {

            return true;
        }
    }

    public void Despachar(int cantidad) {

        boolean Haydisponibilidad = Haydisponibilidad(cantidad);

        if (Haydisponibilidad == true) {

            this.porcionesDisponibles = this.porcionesDisponibles - cantidad;
            System.out.println("Actualizadas las porciones disponibles");
        } else {

            System.out.println("¡Advertencia! No hay disponibilidad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcionesDisponibles() {
        return porcionesDisponibles;

    }
}
