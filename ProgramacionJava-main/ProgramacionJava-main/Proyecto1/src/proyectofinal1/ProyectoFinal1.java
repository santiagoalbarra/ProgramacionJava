/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal1;

import Miproyecto.Producto;

/**
 *
 * @author salones
 */
public class ProyectoFinal1 {

    public static void main(String[] args) {

        // 1. Crear un objeto usando el constructor completo
        Producto p1 = new Producto(101, "Arroz", 5, 10, "Kg");

        // 2. Probar el método propio que creaste
        System.out.println("--- Prueba del método imprimir() ---");
        p1.imprimir();

        // 3. Probar getters y setters
        System.out.println("\n--- Prueba de Getters y Setters ---");
        p1.setStock(20); // Cambiamos el stock
        System.out.println("Nuevo stock recuperado con getStock(): " + p1.getStock());

        // Imprimir de nuevo para ver los cambios reflejados
        p1.imprimir();
    }
}

