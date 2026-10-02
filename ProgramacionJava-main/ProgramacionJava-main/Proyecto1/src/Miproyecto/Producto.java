/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miproyecto;

/**
 *
 * @author CSU22
 */
public class Producto {

    //Atributos
    public int Codigo;
    private String Nombre;
    private int stock;
    private int Stock_minimo;
    private String Unidad_medida;

    //Constructor
    // 1 -> constructor - vacio
    public Producto() {
    }

    // 1 -> constructor - completo
    public Producto(int Codigo, String Nombre, int stock, int Stock_minimo, String Unidad_medida) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.stock = stock;
        this.Stock_minimo = Stock_minimo;
        this.Unidad_medida = Unidad_medida;
    }

    // 1 -> constructor - parcial (sin la clave primaria o código)
    public Producto(String Nombre, int stock, int Stock_minimo, String Unidad_medida) {
        this.Nombre = Nombre;
        this.stock = stock;
        this.Stock_minimo = Stock_minimo;
        this.Unidad_medida = Unidad_medida;
    }

    //Getters y Setters 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_minimo() {
        return Stock_minimo;
    }

    public void setStock_minimo(int Stock_minimo) {
        this.Stock_minimo = Stock_minimo;
    }

    public String getUnidad_medida() {
        return Unidad_medida;
    }

    public void setUnidad_medida(String Unidad_medida) {
        this.Unidad_medida = Unidad_medida;
        
    }

    //Metodos
    
    public void imprimir(){
        
        System.out.println("Producto: " + Nombre + " | Stock actual: " + stock + " " + Unidad_medida);
    }
}