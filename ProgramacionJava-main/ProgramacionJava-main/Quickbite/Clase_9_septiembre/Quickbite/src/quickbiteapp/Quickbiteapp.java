/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickbiteapp;

import quickbiteapp.modelo.Cliente;
import quickbiteapp.modelo.Pedido;
import quickbiteapp.modelo.Plato;

/**
 *
 * @author CSU22
 */
public class Quickbiteapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //Platos
    Plato p1 = new plato("Bandeja paisa", 28000, 10);
    Plato p2 = new Plato("Ajiaco santafereño", 24000, 3);
    Plato p3 = new Plato("Arroz con pollo", 25000, 5);

    //Clientes
    Cliente c1 = new Cliente("Ana Torres", "Ana@correo.com", 60000);
    Cliente c2 = new Cliente("Luis rueda", "Luis@correo.com", 15000);

    //Mostrar informacion
    public void MostrarInformacion() {

    System.out.println ("INFORMACIÓN DE PLATOS");
    p1.MostrarInformacion ();

    p2.MostrarInformacion ();

    p3.MostrarInformacion ();

    System.out.println ("INFORMACIÓN DE CLIENTES");
    c1.MostrarInformacion ();

    c2.MostrarInformacion ();

    //Crear pedido
    Pedido ped1 = new Pedido(c2, p1, 0);

    System.out.println ("INFORMACIÓN DE PEDIDO");
    ped1.MostrarResumen ();
    }
    
    
    private static class plato extends Plato {

        public plato(String bandeja_paisa, int i, int i0){
        }
    
}
