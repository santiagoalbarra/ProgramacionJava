/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickbiteapp.modelo;

/**
 *
 * @author CSU22
 */
public class Cliente {

    //Atributos 
    private String nombre;
    private String correo;
    private double saldo;

    //contructor
    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
    }

    //Metodos
    public void MostrarInformacion() {

        System.out.println("El nombre es " + nombre + "rl correo es " + correo + " y el saldo es" + saldo + saldo);
    }

    public boolean PuedePagar(double valor) {

        if (valor <= saldo) {

            return true;
        } else {

            return false;
        }
    }

    public void Pagar(double valor) {

        if (PuedePagar(valor) == true) {

            this.saldo = this.saldo - valor;
            System.out.println("Pago realizado");
        } else {

            System.out.println("No se pudo realizar el pago");
        }
    }

}
